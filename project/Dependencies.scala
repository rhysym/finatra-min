import sbt._

object Dependencies {
  private val FinatraVersion = "19.6.0"
  private val compileDependencies = Seq(
    "com.twitter" %% "finatra-http" % FinatraVersion,
    "ch.qos.logback" % "logback-classic" % "1.2.3"
  )
  private val testDependencies = Seq(
    "com.twitter" %% "finatra-http" % FinatraVersion % Test classifier "tests",
    "com.twitter" %% "inject-app" % FinatraVersion % Test classifier "tests",
    "com.twitter" %% "inject-core" % FinatraVersion % Test classifier "tests",
    "com.twitter" %% "inject-modules" % FinatraVersion % Test classifier "tests",
    "com.twitter" %% "inject-server" % FinatraVersion % Test classifier "tests",
    "org.scalatest" %% "scalatest" % "3.0.8" % Test
  )
  val dependencies: Seq[ModuleID] = compileDependencies ++ testDependencies
}
