
plugins {
    id("org.sonarqube")
}

val extension = rootProject.extensions.findByType(MyRootExtension::class.java) ?: error("root extension not configured")

tasks.register("hello").configure {
  doLast {
    logger.lifecycle("Hello? ${extension.hello.get()}")
  }
}