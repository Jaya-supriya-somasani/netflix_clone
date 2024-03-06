// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("androidx.navigation.safeargs") version "2.5.0" apply false
    id("com.google.gms.google-services") version "4.4.1" apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.0")
        classpath(platform("com.google.firebase:firebase-bom:30.0.0"))
        // Hilt
//        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.44")
    }
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}
