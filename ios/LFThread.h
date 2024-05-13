
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNLFThreadSpec.h"

@interface LFThread : NSObject <NativeLFThreadSpec>
#else
#import <React/RCTBridgeModule.h>

@interface LFThread : NSObject <RCTBridgeModule>
#endif

@end
