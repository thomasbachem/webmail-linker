package com.thomasbachem.webmaillinker

import play.api.libs.json._
import scala.io.{Codec, Source}
import JsonReads._

/**
 * @author Manuel Giesa
 */
object WebmailLinker {
  private val emailHostRegex = """.*?@(.*)""".r

  private val fileContents = Source.fromURL(getClass.getResource("/providers.json"))(Codec.UTF8).getLines().mkString("\n")

  private val emailProviders = {
    val parsedJson = Json.parse(fileContents)

    // Filter non-objects from the json array as they are just meant as comments
    val filteredJson = parsedJson.as[Seq[JsValue]].filter(_.isInstanceOf[JsObject])

    filteredJson.map(_.as[EmailProvider])
  }

  /**
   * Gets an EmailProvider object for the given email address if it is a known one.
   * @param emailAddress The email address to get the provider for.
   * @return The EmailProvider of the given email address, if any.
   */
  def providerByEmailAddress(emailAddress: String) : Option[EmailProvider] = {
    val emailHostRegex(host) = emailAddress

    emailProviders find { emailProvider =>
      emailProvider.domainRegexes exists { domainRegex =>
        domainRegex.pattern.matcher(host).matches()
      }
    }
  }
}
