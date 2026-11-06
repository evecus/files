package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e44 implements ti2 {
    public final /* synthetic */ ji2 I;
    public final /* synthetic */ r24 J;
    public final /* synthetic */ dl0 K;
    public final /* synthetic */ ji2 L;
    public final /* synthetic */ k10 M;
    public final /* synthetic */ o53 N;
    public final /* synthetic */ eg1 O;

    public e44(ji2 ji2Var, r24 r24Var, dl0 dl0Var, ji2 ji2Var2, k10 k10Var, o53 o53Var, eg1 eg1Var) {
        this.I = ji2Var;
        this.J = r24Var;
        this.K = dl0Var;
        this.L = ji2Var2;
        this.M = k10Var;
        this.N = o53Var;
        this.O = eg1Var;
    }

    @Override // defpackage.ti2
    public final void e(vi2 vi2Var, ji2 ji2Var) {
        ji2 ji2Var2 = this.I;
        r24 r24Var = this.J;
        if (ji2Var == ji2Var2) {
            r24Var.I = p70.g0(this.K, null, null, new f31(this.N, this.O, (fj0) null), 3);
            return;
        }
        if (ji2Var == this.L) {
            v52 v52Var = (v52) r24Var.I;
            if (v52Var != null) {
                v52Var.e(null);
            }
            r24Var.I = null;
        }
        if (ji2Var == ji2.ON_DESTROY) {
            this.M.resumeWith(wd5.a);
        }
    }
}
