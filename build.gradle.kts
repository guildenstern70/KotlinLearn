/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2020 Alessio Saltarin
 *
 */

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
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
}

repositories {
    jcenter()
}

application {
    mainClassName = "net.littlelite.kotlinlearn.MainKt"
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.12")
}
