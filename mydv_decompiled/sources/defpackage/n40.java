package defpackage;

import android.util.LruCache;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n40 extends k05 implements hn1 {
    public final /* synthetic */ int I;
    public final /* synthetic */ vj3 J;
    public final /* synthetic */ double K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n40(int i, vj3 vj3Var, double d, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = i;
        this.J = vj3Var;
        this.K = d;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new n40(this.I, this.J, this.K, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        n40 n40Var = (n40) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        n40Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        LruCache lruCache = va4.a;
        va4.a(qb.i(this.I), this.J, this.K);
        return wd5.a;
    }
}
