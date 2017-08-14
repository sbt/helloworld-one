import Dependencies._

// This an example of a simple project definition.
// It should build on both sbt 0.13.15 and sbt 1.0.0
lazy val root = (project in file("."))
  .settings(
    organization in ThisBuild := "com.example",
    scalaVersion in ThisBuild := "2.12.2",
    version      in ThisBuild := "0.1.0-SNAPSHOT",
    name := "Hello",
    libraryDependencies += scalaTest % Test
  )
