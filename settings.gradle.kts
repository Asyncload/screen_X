
// settings.gradle.kts
pluginManagement {
    repositories {
        gradlePluginPortal()
        google() // 插件用的Google仓库
        mavenCentral()
    }
}

dependencyResolutionManagement {
    // 保持这个配置，强制统一仓库管理
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // 项目依赖需要的所有仓库，都写在这里
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://api.xposed.info/") }
    }
}

rootProject.name = "screen_X"
include(":app")
