plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.netflix_clone"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.netflix_clone"
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation ("com.airbnb.android:lottie:4.2.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")





    //dagger dependencies
    implementation("com.google.dagger:dagger:2.44.2")
    implementation("com.google.dagger:dagger-android:2.44.2")
    implementation("com.google.dagger:dagger-android-support:2.44.2")
    kapt("com.google.dagger:dagger-compiler:2.44.2")
    kapt("com.google.dagger:dagger-android-processor:2.44.2")
//    kapt("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.5.0")
    //base module access
//    implementation(project(":base-sub"))

}