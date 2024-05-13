#import "LFThread.h"

@implementation LFThread
RCT_EXPORT_MODULE()

// Don't compile this code when we build for the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
- (NSNumber *)multiply:(double)a b:(double)b {
    NSNumber *result = @(a * b);

    return result;
}

- (void)asyncFn: (any)fn (any)onFinshed {
DispatchQueue.global(qos: .userInitiated).async {
// 执行任务
  const res =  fn();
// 回到主线程更新UI
DispatchQueue.main.async {
// 更新UI
print("回到主线程")
onFinshed(res);
}
}

}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeLFThreadSpecJSI>(params);
}
#endif

@end
