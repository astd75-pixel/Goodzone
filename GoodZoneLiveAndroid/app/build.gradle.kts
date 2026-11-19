plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "live.goodzone.app"
    compileSdk = 35
    defaultConfig {
        applicationId = "live.goodzone.app"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
