plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android {
    namespace = "com.yespsayt.app"
    compileSdk = 35
    defaultConfig { applicationId = "com.yespsayt.app"; minSdk = 24; targetSdk = 35; versionCode = 1; versionName = "1.0" }
}
dependencies { implementation("androidx.appcompat:appcompat:1.7.0"); implementation("androidx.activity:activity-ktx:1.10.0") }
