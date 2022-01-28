includeBuild("../build-conventions")

include(":module")

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.startsWith("com.android.")) {
                useModule("com.android.tools.build:gradle:7.0.4")
            }
        }
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
}

