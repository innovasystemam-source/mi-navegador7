plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

// Versión de GeckoView (canal beta, arm64). Cámbiala aquí si quieres actualizar.
val geckoVersion = "158.0.20260930090528"

android {
    namespace = "com.example.geckobrowser"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.geckobrowser"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        ndk { abiFilters += listOf("arm64-v8a") }
    }
    packaging {
        jniLibs { useLegacyPackaging = true }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("org.mozilla.geckoview:geckoview-beta-omni-arm64-v8a:$geckoVersion")
}
