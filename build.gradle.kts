/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2024 Alessio Saltarin
 *
 */


plugins {
    application
    kotlin("jvm") version "2.0.10"
}

repositories {
    mavenCentral()
}

tasks.named("compileKotlin", org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask::class.java) {
    compilerOptions {
        freeCompilerArgs.add("-Xjsr305=strict")
    }
}

application {
    mainClass.set("net.littlelite.kotlinlearn.MainKt")
}

dependencies {
    testImplementation(kotlin("test"))
}
