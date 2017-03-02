lazy val versions = new {
  val elastic4s = "5.2.9"
}

name := "elasticforce"

scalaVersion := "2.11.8"

libraryDependencies := Seq(
  "com.sksamuel.elastic4s" %% "elastic4s-core" % versions.elastic4s,
  "com.sksamuel.elastic4s" %% "elastic4s-circe" % versions.elastic4s,
  "com.sksamuel.elastic4s" %% "elastic4s-streams" % versions.elastic4s
)
