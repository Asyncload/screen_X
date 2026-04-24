pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // 你的自定义仓库配置
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://api.xposed.info/") }
    }
}

rootProject.name = "你的项目名称"
include(":app")
