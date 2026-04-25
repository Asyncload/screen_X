package com.lbxq.screen

// 引入Xposed原生类（需确保设备已安装Xposed/LSPosed环境）
import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.callbacks.XC_LoadPackage

// 实现Xposed的入口接口
class XposedModule : IXposedHookLoadPackage {
    // 当应用启动时，LSPosed会调用这个方法
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        // 测试：当系统设置（包名com.android.settings）启动时，打印日志
        if (lpparam.packageName == "com.android.settings") {
            XposedBridge.log("✅ ScreenModule测试成功！捕获到系统设置启动")
            XposedBridge.log("当前包名：${lpparam.packageName}")
            XposedBridge.log("进程名：${lpparam.processName}")
        }
    }
}
