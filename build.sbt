val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "epub-scraper",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    // =============
    // Dependencies, separated by trailing commas
    // =============
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    // Java-based Scraper, most mainstream library
    libraryDependencies += "org.jsoup" % "jsoup" % "1.11.2",
    // Simple CLI app
    libraryDependencies += "com.lihaoyi" %% "mainargs" % "0.2.2",
    // Simple HTTP Requests
    libraryDependencies += "com.lihaoyi" %% "requests" % "0.7.0",
    // Markdown -> ePub / PDF generation. Should also accept HTML but it is not completely clear. Seems well documented.
    libraryDependencies += "org.planet42" %% "laika-core" % "0.18.0"
  )
