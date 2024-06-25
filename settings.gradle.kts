// Copyright 2000-2022 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

rootProject.name = "conditional_operator_intention"

pluginManagement {
    repositories {
        maven {
            url = uri("https://artifactory.corp.xtb.com/artifactory/plugins-release")
            credentials {
                username = "developer"
                password = "xtb123"
            }
        }
    }
}