// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}
buildscript{
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.6")
        classpath( "org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        // Hilt
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.44")
    }
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}
