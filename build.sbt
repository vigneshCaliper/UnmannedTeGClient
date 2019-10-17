name := """UnmannedApp"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += guice

libraryDependencies += filters

//libraryDependencies += jdbc

libraryDependencies += javaJdbc

libraryDependencies ++= Seq(
  javaWs
)

// Test Database
libraryDependencies += "com.h2database" % "h2" % "1.4.197"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

libraryDependencies += "org.mongodb" % "mongo-java-driver" % "3.6.0"
libraryDependencies += "com.amazonaws" % "aws-java-sdk-s3" % "1.11.475"
libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.11.475"
libraryDependencies += "org.apache.poi" % "poi" % "4.0.1"

// https://mvnrepository.com/artifact/mysql/mysql-connector-java
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.17"

// https://mvnrepository.com/artifact/com.typesafe.play/play-jdbc-api
//libraryDependencies += "com.typesafe.play" %% "play-jdbc-api" % "2.7.3"


// https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml
libraryDependencies += "org.apache.poi" % "poi-ooxml" % "4.0.1"

// https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk-sns
libraryDependencies += "com.amazonaws" % "aws-java-sdk-sns" % "1.11.475"

// https://mvnrepository.com/artifact/com.sun.mail/javax.mail
libraryDependencies += "com.sun.mail" % "javax.mail" % "1.5.0"

// https://mvnrepository.com/artifact/com.mashape.unirest/unirest-java
libraryDependencies += "com.mashape.unirest" % "unirest-java" % "1.4.9"

// https://mvnrepository.com/artifact/com.jcraft/jsch
libraryDependencies += "com.jcraft" % "jsch" % "0.1.54"

// https://mvnrepository.com/artifact/org.mongodb.morphia/morphia
libraryDependencies += "org.mongodb.morphia" % "morphia" % "1.3.2"

// https://mvnrepository.com/artifact/com.mashape.unirest/unirest-java
libraryDependencies += "com.mashape.unirest" % "unirest-java" % "1.4.9"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.12.6"

// https://mvnrepository.com/artifact/net.sourceforge.jtds/jtds
libraryDependencies += "net.sourceforge.jtds" % "jtds" % "1.3.0"

libraryDependencies ++= Seq(
  "com.enragedginger" %% "akka-quartz-scheduler" % "1.6.1-akka-2.5.x",
  "com.typesafe.akka" %% "akka-actor-typed" % "2.5.13"
)