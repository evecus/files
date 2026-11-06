package coil3.compose;

import defpackage.ag1;
import defpackage.el0;
import defpackage.fj0;
import defpackage.g75;
import defpackage.in1;
import defpackage.k05;
import defpackage.mu0;
import defpackage.rp0;
import defpackage.wd5;
import defpackage.zf1;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.compose.RealDrawScopeSizeResolver$size$2", f = "DrawScopeSizeResolver.kt", l = {58}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class RealDrawScopeSizeResolver$size$2 extends k05 implements in1 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public RealDrawScopeSizeResolver$size$2(fj0 fj0Var) {
        super(3, fj0Var);
    }

    @Override // defpackage.in1
    public final Object invoke(ag1 ag1Var, zf1 zf1Var, fj0 fj0Var) {
        RealDrawScopeSizeResolver$size$2 realDrawScopeSizeResolver$size$2 = new RealDrawScopeSizeResolver$size$2(fj0Var);
        realDrawScopeSizeResolver$size$2.L$0 = ag1Var;
        realDrawScopeSizeResolver$size$2.L$1 = zf1Var;
        return realDrawScopeSizeResolver$size$2.invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        ag1 ag1Var = (ag1) this.L$0;
        zf1 zf1Var = (zf1) this.L$1;
        int i = this.label;
        wd5 wd5Var = wd5.a;
        if (i == 0) {
            mu0.V(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (ag1Var instanceof g75) {
                throw ((g75) ag1Var).I;
            }
            Object collect = zf1Var.collect(ag1Var, this);
            el0 el0Var = el0.I;
            if (collect != el0Var) {
                collect = wd5Var;
            }
            if (collect == el0Var) {
                return el0Var;
            }
        } else {
            if (i != 1) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        return wd5Var;
    }
}
