plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.mitohachips"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mitohachips"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    //noinspection GradleCompatible,GradleCompatible
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.1")
    //Tambahan Dependency
    //implementation("com.google.android.material:material:1.4.0-rc01")
    //implementation("com.github.bumptech.glide:glide:4.8.0")
    //ini yang support
    implementation("com.google.code.gson:gson:2.8.7")
    implementation("com.github.bumptech.glide:glide:4.16.0")
}