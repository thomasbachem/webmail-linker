package de.malax.webmaillinker

import java.net.URI
import play.api.libs.json._
import play.api.libs.functional.syntax._

private object JsonReads {
  implicit val providerJsonReads = (
    (__ \ "name").read[String] ~
    (__ \ "domains").read[String].map { domainsString =>
      domainsString.split(" ").toList.map { domainRegex =>
        "(?i)%s".format(domainRegex).r
      }
    } ~
    (__ \ "url").read[String].map(new URI(_)) ~
    (__ \ "icon").readNullable[String].map(_.map(new URI(_)))
  )(EmailProvider)
}
