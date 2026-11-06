package coil3.compose;

import defpackage.de0;
import defpackage.fe0;
import defpackage.go1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DrawScopeSizeResolverKt {
    public static final DrawScopeSizeResolver DrawScopeSizeResolver() {
        return new RealDrawScopeSizeResolver();
    }

    public static final DrawScopeSizeResolver rememberDrawScopeSizeResolver(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        if (Q == de0.a) {
            Q = DrawScopeSizeResolver();
            go1Var.o0(Q);
        }
        return (DrawScopeSizeResolver) Q;
    }
}
