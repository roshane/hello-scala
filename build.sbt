name := """hello-scala"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
libraryDependencies += "io.spray" %% "spray-json" % "1.3.4"


fork in run := true