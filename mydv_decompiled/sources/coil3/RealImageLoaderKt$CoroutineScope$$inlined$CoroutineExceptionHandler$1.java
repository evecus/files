package coil3;

import coil3.util.Logger;
import coil3.util.LoggingKt;
import defpackage.d2;
import defpackage.tk0;
import defpackage.wk0;
import defpackage.xk0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1 extends d2 implements xk0 {
    final /* synthetic */ Logger $logger$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1(wk0 wk0Var, Logger logger) {
        super(wk0Var);
        this.$logger$inlined = logger;
    }

    @Override // defpackage.xk0
    public void handleException(tk0 tk0Var, Throwable th) {
        Logger logger = this.$logger$inlined;
        if (logger != null) {
            LoggingKt.log(logger, "RealImageLoader", th);
        }
    }
}
