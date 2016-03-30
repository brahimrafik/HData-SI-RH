name := """HData-SI-RH"""

version := ("${env.PIPELINE_VERSION}")

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "com.nimbusds" % "nimbus-jose-jwt" % "4.12"
)
