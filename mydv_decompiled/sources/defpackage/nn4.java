package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nn4 extends t4 {
    public long a;
    public k10 b;

    @Override // defpackage.t4
    public final boolean a(s4 s4Var) {
        mn4 mn4Var = (mn4) s4Var;
        if (this.a >= 0) {
            return false;
        }
        long j = mn4Var.Q;
        if (j < mn4Var.R) {
            mn4Var.R = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.t4
    public final fj0[] b(s4 s4Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((mn4) s4Var).t(j);
    }
}
