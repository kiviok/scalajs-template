lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "scalajs-template",
    scalaVersion := "2.12.4",
    version := "0.1.0-SNAPSHOT",

    scalaJSUseMainModuleInitializer := true,

    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"
  )