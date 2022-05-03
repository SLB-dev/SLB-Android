import org.gradle.api.JavaVersion

object ProjectGradle {
    const val ANDROID = "com.android.tools.build:gradle:${GradleVersions.ANDROID}"
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${GradleVersions.KOTLIN}"
    const val DAGGER_HILT = "com.google.dagger:hilt-android-gradle-plugin:${GradleVersions.DAGGER_HILT}"
}


object AndroidX {
    const val CORE_KTX = "androidx.core:core-ktx:${GradleVersions.CORE_KTX}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${GradleVersions.APP_COMPAT}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${GradleVersions.CONSTRAINT_LAYOUT}"
}

object UnitTest {
    const val JUNIT = "junit:junit:${GradleVersions.JUNIT}"
}

object AndroidTest {
    const val ANDROID_JUNIT = "androidx.test.ext:junit:${GradleVersions.ANDROID_JUNIT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${GradleVersions.ESPRESSO_CORE}"
}

object Google {
    const val MATERIAL = "com.google.android.material:material:${GradleVersions.MATERIAL}"

    const val HILT_ANDROID = "com.google.dagger:hilt-android:${GradleVersions.HILT}"
    const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${GradleVersions.HILT}"

    const val FIREBASE_ANALYTICS = "com.google.firebase:firebase-analytics-ktx"
    const val FIREBASE_BOM = "com.google.firebase:firebase-bom:${GradleVersions.FIREBASE_BOM}"
}

object GradleVersions {
    const val ANDROID = "7.0.4"
    const val KOTLIN = "1.6.10"
    const val DAGGER_HILT = "2.38.1"

    const val COMPILE_SDK_VERSION = 32
    const val MIN_SDK_VERSION = 26
    const val TARGET_SDK_VERSION = 32
    val JAVA_VERSION = JavaVersion.VERSION_1_8

    const val CORE_KTX = "1.7.0"
    const val APP_COMPAT = "1.4.1"
    const val MATERIAL = "1.5.0"
    const val CONSTRAINT_LAYOUT = "2.1.3"
    const val JUNIT = "4.13.2"
    const val ANDROID_JUNIT = "1.1.3"
    const val ESPRESSO_CORE = "3.4.0"

    const val HILT = "2.38.1"

    const val FIREBASE_BOM = "29.3.1"
}