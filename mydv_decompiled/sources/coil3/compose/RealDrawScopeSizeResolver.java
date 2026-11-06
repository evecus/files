package coil3.compose;

import defpackage.ez;
import defpackage.fj0;
import defpackage.l91;
import defpackage.o7;
import defpackage.r43;
import defpackage.sg1;
import defpackage.sp0;
import defpackage.x40;
import defpackage.zf1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class RealDrawScopeSizeResolver implements DrawScopeSizeResolver {
    private final r43 latestSize = o7.b(0, 2, ez.J);

    @Override // coil3.compose.DrawScopeSizeResolver
    public void connect(zf1 zf1Var) {
        this.latestSize.b(zf1Var);
    }

    @Override // coil3.size.SizeResolver
    public Object size(fj0 fj0Var) {
        r43 r43Var = this.latestSize;
        RealDrawScopeSizeResolver$size$2 realDrawScopeSizeResolver$size$2 = new RealDrawScopeSizeResolver$size$2(null);
        int i = sg1.a;
        return sp0.K(new RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1(new x40(realDrawScopeSizeResolver$size$2, r43Var, l91.I, -2, ez.I)), fj0Var);
    }
}
