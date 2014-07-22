package de.malax.webmaillinker

import java.net.URI
import scala.util.matching.Regex

case class EmailProvider(name: String, domainRegexes: Seq[Regex], url: URI, icon: Option[URI])
