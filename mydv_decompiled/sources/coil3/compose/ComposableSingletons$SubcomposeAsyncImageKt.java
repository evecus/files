package coil3.compose;

import defpackage.cd0;
import defpackage.fe0;
import defpackage.go1;
import defpackage.in1;
import defpackage.tc0;
import defpackage.wd5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ComposableSingletons$SubcomposeAsyncImageKt {
    public static final ComposableSingletons$SubcomposeAsyncImageKt INSTANCE = new ComposableSingletons$SubcomposeAsyncImageKt();
    private static in1 lambda$1938077476 = new tc0(1938077476, new cd0(5), false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 lambda_1938077476$lambda$0(SubcomposeAsyncImageScope subcomposeAsyncImageScope, fe0 fe0Var, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = (((go1) fe0Var).g(subcomposeAsyncImageScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, go1Var, i2 & 14, 255);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }

    public final in1 getLambda$1938077476$io_coil_kt_coil3_coil_compose_core() {
        return lambda$1938077476;
    }
}
