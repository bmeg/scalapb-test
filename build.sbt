organization  := "io.bmeg"
name := "ophion"
version := "0.0.5"
// version := "0.0.5-SNAPSHOT"
scalaVersion := "2.11.8"
conflictManager := ConflictManager.strict.copy(organization = "com.esotericsoftware.*")

libraryDependencies ++= Seq(
  "org.scala-lang"             %  "scala-compiler"           % "2.11.8",
  "com.trueaccord.scalapb"     %% "scalapb-json4s"           % "0.1.6",
  "org.scalactic"              %% "scalactic"                % "3.0.0",
  "org.scalatest"              %% "scalatest"                % "3.0.0" % "test"
)

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"
resolvers ++= Seq(
  "Akka Repository" at "http://repo.akka.io/releases/",
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases",
  "Twitter Maven Repo" at "http://maven.twttr.com",
  "GAEA Depends Repo" at "https://github.com/bmeg/gaea-depends/raw/master/"
)

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)

