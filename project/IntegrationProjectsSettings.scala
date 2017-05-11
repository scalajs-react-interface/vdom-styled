import sbt.Keys._
import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object IntegrationProjectsSettings {
  val commonSettings = Seq(
    resolvers ++= Seq(
      Resolver.bintrayRepo("scalajs-react-interface", "maven"),
      Resolver.jcenterRepo
    ),
    organization := "scalajs-react-interface",
    scalaVersion := "2.12.2",
    crossScalaVersions := Seq("2.11.11", "2.12.2"),
    scalacOptions ++= Seq(
      //"-Xlint",
      "-unchecked",
      "-deprecation",
      "-feature",
      "-language:postfixOps",
      "-language:implicitConversions",
      "-language:higherKinds"),
    libraryDependencies ++= Seq(
      "com.lihaoyi" %%% "utest" % "0.4.5" % "test"
    ),
    logBuffered in Test := false,
    testFrameworks += new TestFramework("utest.runner.Framework"),
    parallelExecution in Test := false,
    licenses += ("Apache-2.0", url("https://opensource.org/licenses/Apache-2.0"))
  )

  val macrosSettings = Seq(
    name := "incubation-macros",
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-reflect" % scalaVersion.value % "provided",
      //"org.scalameta" %% "scalameta" % "1.7.0" % "provided",
      "scalajs-react-interface" %%% "core" % "2017.3.26-beta" % "provided",
      //"scalajs-react-interface" %%% "macros" % "2017.3.26-beta" % "provided",
      "org.scala-js" %%% "scalajs-dom" % "0.9.1" % "provided",
      "scalajs-react-interface" %%% "vdom" % "2017.4.24-beta" % Provided
    )
  )

  val incubationSettings = Seq(
    name := "incubation",
    description := "Playground for testing and developing vdom features.",
    libraryDependencies ++= Seq(
      "scalajs-react-interface" %%% "core" % "2017.3.26-beta",
      "scalajs-react-interface" %%% "web" % "2017.3.26-beta",
      "scalajs-react-interface" %%% "vdom" % "2017.4.24-beta" % Provided,
      "scalajs-react-interface" %%% "universal" % "2017.4.9-beta",
      "scalajs-react-interface" %%% "scalacss" % "2017.3.26-beta",
      "scalajs-react-interface" %%% "macros" % "2017.3.26-beta"
    ),
    artifactPath in Compile in fastOptJS := baseDirectory.value / "assets/scalajs-output.js",
    scalaJSModuleKind := ModuleKind.CommonJSModule,
    scalaJSUseMainModuleInitializer := true
  )
}