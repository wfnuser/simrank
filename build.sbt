name := "simrank"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq("org.apache.spark" % "spark-core_2.10" % "1.5.0",
  "org.apache.spark" % "spark-mllib_2.10" % "1.5.0",
  "org.apache.spark" % "spark-graphx_2.10" % "1.5.0")

resolvers  ++= Seq("Apache Repository" at "https://repository.apache.org/content/repositories/releases",
  "Akka Repository" at "http://repo.akka.io/releases/",
  "Spray Repository" at "http://repo.spray.cc/")