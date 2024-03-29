/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2020 Alessio Saltarin
 *
 */


plugins {
    application
    kotlin("jvm") version "1.6.0"
}

repositories {
    mavenCentral()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

application {
    mainClass.set("net.littlelite.kotlinlearn.MainKt")
}

dependencies {
    implementation(kotlin("stdlib:1.6.0"))
    testImplementation("junit:junit:4.13.2")
}
