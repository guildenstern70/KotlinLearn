/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2024 Alessio Saltarin
 *
 */


plugins {
    application
    kotlin("jvm") version "2.0.0"
}

repositories {
    mavenCentral()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
    }
}

application {
    mainClass.set("net.littlelite.kotlinlearn.MainKt")
}

dependencies {
    testImplementation(kotlin("test"))
}
