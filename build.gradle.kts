import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

subprojects {
    repositories {
        mavenCentral()
    }
}


tasks.withType<Wrapper> {
    gradleVersion = "7.0.2"
}
