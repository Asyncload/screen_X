// 正确示例（根build.gradle.kts）
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

// 删掉了repositories块，不再在这里配置仓库
