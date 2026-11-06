package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class js1 implements yq3 {
    public final u8 I;
    public final vd3 J;
    public long K = 0;

    public js1(u8 u8Var, vd3 vd3Var) {
        this.I = u8Var;
        this.J = vd3Var;
    }

    @Override // defpackage.yq3
    public final long e(v22 v22Var, long j, da2 da2Var, long j2) {
        long a = this.J.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.K;
        }
        this.K = a;
        return r22.c(r22.c(v22Var.b(), sv2.U(a)), this.I.a(j2, 0L, da2Var));
    }
}
