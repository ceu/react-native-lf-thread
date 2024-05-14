package com.lfthread
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable
import android.os.Run
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = LFThreadModule.NAME)
class LFThreadModule(reactContext: ReactApplicationContext) :
  NativeLFThreadSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }

  override fun asyncFn(fn: any,onFinshed: any): void {
      val handler = Handler(Looper.prepare())
      val runnable = Runnable {
          // 这里是你的异步代码
          const res = fn();
          handler.post {
              // 这里是更新 UI 的代码
              onFinshed(res);
          }
      }
      Looper.loop() // 开始消息循环
  }

  companion object {
    const val NAME = "LFThread"
  }
}
