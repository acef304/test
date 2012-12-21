name := "test"

version := "0.0"

scalaVersion := "2.9.2"

mainClass := Some("Bootstrapper.Bootstrapper")

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

