package com.lbxq.screen

import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.callbacks.XC_LoadPackage

class XposedModule : IXposedHookLoadPackage {
    // 不做任何包名判断，只要有应用启动就打印日志
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        XposedBridge.log("✅模块已捕获应用：${lpparam.packageName}🎉")
    }
}
