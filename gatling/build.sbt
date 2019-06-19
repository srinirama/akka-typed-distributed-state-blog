
//lazy val gatlingVersion = "2.3.1"
lazy val gatlingVersion = "3.0.0"

enablePlugins(GatlingPlugin)

libraryDependencies ++= Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion,
  "io.gatling" % "gatling-test-framework" % gatlingVersion

)