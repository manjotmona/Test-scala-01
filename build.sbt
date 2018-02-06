name := "Test-Scala-01"

version := "1.0"

scalaVersion := "2.12.1"

lazy val commonSettings = Seq(
  organization := "com.knoldus",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.4"
)


lazy val root = project.in(file("."))
  .aggregate(accounts, inventory, checkout, api, dashboard)

lazy val accounts = (project in file("accounts"))
  .settings(
    commonSettings,
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.4" % "test")
  )

lazy val inventory = (project in file("inventory"))
  .settings(commonSettings,
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.4" % "test")
  )
lazy val checkout = (project in file("checkout")).dependsOn(inventory,accounts)
  .settings(commonSettings,
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.4" % "test")
  )
lazy val api = project.dependsOn(accounts,inventory,checkout)
  .settings(commonSettings,
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.4" % "test")
  )
lazy val dashboard = project.dependsOn(api)
  .settings(commonSettings,
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.4" % "test",
      "log4j" % "log4j" % "1.2.17"
    )
  )
