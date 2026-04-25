package com.lbxq.screen

// 改用Xposed原生包，无需依赖
import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.callbacks.XC_LoadPackage

// 实现原生IXposedHookLoadPackage接口
class XposedModule : IXposedHookLoadPackage {
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        XposedBridge.log("ScreenModule加载成功：${lpparam.packageName}")
    }
}
