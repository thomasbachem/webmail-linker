Webmail Linker
===========================================================================================

Scala Library
-------------------------------------------------------------------------------------------

### Installation

Simply run `sbt publish-local` to publish the library to you local repository. This project
is not yet available on a public repository. Then, add this to your projects `build.sbt`

```
libraryDependencies += "com.thomasbachem" %% "webmaillinker" % "1.0"
```

### Usage

```scala
import com.thomasbachem.webmaillinker.WebmailLinker

object Main {
    def main(args: Array[String]) {
        println(WebmailLinker.providerByEmailAddress("user@example.com"))
    }
}
```

### Compatibility

Scala 2.11


### Dependencies

Dependencies are managed by sbt and just include play-json for json parsing.