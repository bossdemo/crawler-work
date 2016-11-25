name := "crawler-work"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  val AkkaVersion = "2.4.14"
  Seq(
    "com.typesafe.akka" %% "akka-slf4j"      % AkkaVersion,
    "com.typesafe.akka" %% "akka-cluster" % AkkaVersion,
    "com.typesafe.akka" %% "akka-cluster-sharding" % AkkaVersion,
    "com.typesafe.akka" %% "akka-persistence" % AkkaVersion
  )
}

// Assembly settings
mainClass in Global := Some("com.crawler.work.Main")

//jarName in assembly := "crawler-work.jar"