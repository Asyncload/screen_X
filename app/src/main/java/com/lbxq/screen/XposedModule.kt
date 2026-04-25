package com.lbxq.screen

import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.callbacks.XC_LoadPackage

class XposedModule : IXposedHookLoadPackage {
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        // 测试：当支付宝启动时，打印日志
        if (lpparam.packageName == "com.eg.android.AlipayGphone") {
            XposedBridge.log("💰 ScreenModule支付宝测试成功！")
            XposedBridge.log("当前包名：${lpparam.packageName}")
            XposedBridge.log("进程名：${lpparam.processName}")
        }
    }
}
