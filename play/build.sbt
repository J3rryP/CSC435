name := """blem"""
organization := "god.coder"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.11.8"

resolvers += Resolver.url("Edulify Repository", url("https://edulify.github.io/modules/releases/"))(Resolver.ivyStylePatterns)


libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.38",
  javaJdbc,
  cache,
  javaWs)
