ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.15"
ThisBuild / organization := "com.example"

lazy val root = (project in file(".")).settings(name := "SparkLearning", libraryDependencies ++= Seq( // Spark Core      
  "org.apache.spark" %% "spark-core" % "3.5.0" % "provided", // Spark SQL
  "org.apache.spark" %% "spark-sql" % "3.5.0" % "provided", // Spark MLlib
  "org.apache.spark" %% "spark-mllib" % "3.5.0" % "provided", // Spark Streaming
  "org.apache.spark" %% "spark-streaming" % "3.5.0" % "provided", // Optional: Spark GraphX
  "org.apache.spark" %% "spark-graphx" % "3.5.0" % "provided", // Optional: Spark Kafka Streaming
  "org.apache.spark" %% "spark-streaming-kafka-0-10" % "3.5.0", // Testing (ScalaTest)
  "org.scalatest" %% "scalatest" % "3.2.17" % Test))