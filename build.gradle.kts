plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.legacy.kapt) apply false
    id("androidx.navigation.safeargs.kotlin") version "2.9.8" apply false
}