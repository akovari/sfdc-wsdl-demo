import ScalaxbKeys._

name := "sfdc-wsdl-demo"

version := "1.0"

scalaVersion := "2.11.4"

scalaxbSettings
 
sourceGenerators in Compile <+= scalaxb in Compile
