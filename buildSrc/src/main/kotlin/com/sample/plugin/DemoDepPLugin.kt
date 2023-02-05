package com.sample.plugin



import org.gradle.api.Plugin
import org.gradle.api.Project


class DemoDepPLugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.create("SampleTask") {
            println("Hello there!")
        }
    }
}