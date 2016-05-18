<<<<<<< HEAD
name := """example-app"""
=======
name := """example"""
>>>>>>> 85d8bf46ed16f15c966abd4371824f178d69c7b3

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
