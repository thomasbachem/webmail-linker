name := "webmaillinker"

version := "1.0"

scalaVersion := "2.11.1"

organization := "com.thomasbachem"

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.3.2"

unmanagedResourceDirectories in Compile += baseDirectory.value / "../../config"
