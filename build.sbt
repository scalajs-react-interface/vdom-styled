shellPrompt in ThisBuild := { state => Project.extract(state).currentRef.project + "> " }
name := "vdom-styled"

//version := "2017.4.0-SNAPSHOT"

enablePlugins(ScalaJSPlugin)

val scala211 = "2.11.11"

val scala212 = "2.12.2"

scalaVersion := scala212

crossScalaVersions := Seq(scala211, scala212)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)

//Dependencies
libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value % Provided,
  "scalajs-react-interface" %%% "core" % "2017.3.26-beta" % Provided,
  "scalajs-react-interface" %%% "universal" % "2017.4.9-beta" % Provided,
  "scalajs-react-interface" %%% "vdom" % "2017.4.24-beta" % Provided
)

//bintray
resolvers += Resolver.jcenterRepo

organization := "scalajs-react-interface"

licenses += ("Apache-2.0", url(
  "https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("scalajs-react-interface")

bintrayRepository := "maven"

bintrayVcsUrl := Some("git@github.com:scalajs-react-interface/vdom.git")

publishArtifact in Test := false

//Test
resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % Test
scalaJSStage in Global := FastOptStage


//Tasks:
Tasks.taskSettings

//Integration Incubation and Test Project:
import IntegrationProjectsSettings._
val vdom = project in file(".")
val incubationMacros = (project in file("./macros"))
  .settings(commonSettings,macrosSettings).enablePlugins(ScalaJSPlugin).dependsOn(vdom)
val incubation =  (project in file("./incubation"))
  .settings(commonSettings,incubationSettings).enablePlugins(ScalaJSPlugin).dependsOn(incubationMacros)
