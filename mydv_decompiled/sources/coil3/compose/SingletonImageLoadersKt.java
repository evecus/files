package coil3.compose;

import coil3.SingletonImageLoader;
import defpackage.fe0;
import defpackage.go1;
import defpackage.mu0;
import defpackage.tm1;
import defpackage.wd5;
import defpackage.x04;
import defpackage.zu0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SingletonImageLoadersKt {
    public static final void setSingletonImageLoaderFactory(tm1 tm1Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(505499498);
        if ((i & 6) == 0) {
            i2 = (go1Var.i(tm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            SingletonImageLoader.setSafe(new SingletonImageLoadersKt$sam$coil3_SingletonImageLoader_Factory$0(tm1Var));
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new zu0(tm1Var, i, (byte) 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 setSingletonImageLoaderFactory$lambda$0(tm1 tm1Var, int i, fe0 fe0Var, int i2) {
        setSingletonImageLoaderFactory(tm1Var, fe0Var, mu0.X(i | 1));
        return wd5.a;
    }
}
