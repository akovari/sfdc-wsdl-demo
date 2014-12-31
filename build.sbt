import ScalaxbKeys._

name := "sfdc-wsdl-demo"

version := "1.0"

scalaVersion := "2.11.4"

scalaxbSettings

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.2"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.3"
 
sourceGenerators in Compile <+= scalaxb in Compile
