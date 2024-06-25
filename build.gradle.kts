// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

plugins {
  id("java")
  id("org.jetbrains.intellij") version "1.17.4"
  id("org.jetbrains.kotlin.jvm") version "1.9.23"
}

group = "com.xtb"
version = "2.0.1"

repositories {
  maven {
    url = uri("https://artifactory.corp.xtb.com/artifactory/plugins-release")
    credentials {
      username = "developer"
      password = "xtb123"
    }
  }
}

dependencies {
}

java {
  sourceCompatibility = JavaVersion.VERSION_17
}

// See https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
  version.set("AI-2023.3.2.1")

//  localPath.set("/Applications/Android Studio.app/Contents")
  type.set("AI")
  plugins.set(listOf(
    "org.jetbrains.kotlin",
    "com.intellij.java",
    "org.jetbrains.android"))

  pluginsRepositories {
    maven {
      url = uri("https://artifactory.corp.xtb.com/artifactory/plugins-release")
      credentials {
        username = "developer"
        password = "xtb123"
      }
    }
  }
}

tasks {
  buildSearchableOptions {
    enabled = false
  }

  patchPluginXml {
    changeNotes = "Initial version"
    version.set("${project.version}")
    sinceBuild.set("233.14475.28")
    untilBuild.set("242.*")
  }
}
