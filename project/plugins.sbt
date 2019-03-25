// The Lagom plugin
addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.4.11")
// Set the version dynamically to the git hash
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "3.3.0")
// Needed to ensure the correct permissions on binaries in the Docker image
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.19")

