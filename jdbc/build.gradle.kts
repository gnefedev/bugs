import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    java
    `java-library`
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<KotlinCompile>().all {
    sourceCompatibility = "11"
    targetCompatibility = "11"
    @Suppress("SuspiciousCollectionReassignment")
    kotlinOptions {
        jvmTarget = "11"
        javaParameters = true
    }
}

dependencies {
    implementation("org.springframework:spring-jdbc:5.3.4")
}
