# epub-scraper

The main goal of this project is to generate ePubs or PDFs given an URL, by scraping its content. A secondary goal is to get familiar with the Scala language and ecosystem.

## TODOs
- [x] Find suitable dependencies
- [ ] Define simple CLI interface.
- [ ] Define app skeleton.
- [ ] Define simple scraper functionality.
  - [ ] Async scraping
  - [ ] Abstract into configurable scrapers: the idea is to be able to define different scrapers for different (types of) website.
- [ ] Generate a PDF/ePub.

## Dependency Management

Get dependencies from [Scala Library Index](https://index.scala-lang.org/) or [Maven Central repository](https://search.maven.org/) (Java libraries).

Copypaste dependency string into `build.sbt`. Example:
> libraryDependencies += "org.jsoup" % "jsoup" % "1.11.2"

Caveat: Don't forget to add trailing commas after adding a new dependency.