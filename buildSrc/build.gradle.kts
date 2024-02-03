plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.tools.gradle)
}

gradlePlugin {
    plugins {
        register("baseAndroidApplication") {
            id = "base.android.application.configuration"
            implementationClass = "extensions.plugins.BaseAndroidApplicationConfigurationConventionPlugin"
        }
        register("baseAndroidApplicationCompose") {
            id = "base.android.application.compose"
            implementationClass = "extensions.plugins.BaseAndroidApplicationComposeConventionPlugin"
        }
        register("baseAndroidLibrary") {
            id = "base.android.library.configuration"
            implementationClass = "extensions.plugins.BaseAndroidLibraryConfigurationConventionPlugin"
        }
        register("baseAndroidLibraryCompose") {
            id = "base.android.library.compose"
            implementationClass = "extensions.plugins.BaseAndroidLibraryComposeConventionPlugin"
        }
    }
}