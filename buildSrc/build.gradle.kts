import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

gradlePlugin {
    plugins {
        create("samplePlugin") {
            id = "com.sample.plugin"
            implementationClass = "com.sample.plugin.DemoDepPLugin"
        }
    }
}