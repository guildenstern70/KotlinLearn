/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015-18 Alessio Saltarin
 *
 */

plugins {
    application
    id("com.gradle.build-scan") version "1.16"
    kotlin("jvm") version "1.3.10"
}

repositories {
    jcenter()
}

application {
    mainClassName = "net.littlelite.kotlinlearn.MainKt"
}

buildScan {
    setTermsOfServiceUrl("https://gradle.com/terms-of-service")
    setTermsOfServiceAgree("yes")
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.12")
}
