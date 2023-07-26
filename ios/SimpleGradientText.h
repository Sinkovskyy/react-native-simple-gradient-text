
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNSimpleGradientTextSpec.h"

@interface SimpleGradientText : NSObject <NativeSimpleGradientTextSpec>
#else
#import <React/RCTBridgeModule.h>

@interface SimpleGradientText : NSObject <RCTBridgeModule>
#endif

@end
