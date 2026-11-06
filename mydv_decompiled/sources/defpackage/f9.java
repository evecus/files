package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f9 implements yq3 {
    public final vv I;

    public f9(vv vvVar) {
        this.I = vvVar;
    }

    @Override // defpackage.yq3
    public final long e(v22 v22Var, long j, da2 da2Var, long j2) {
        vv vvVar = this.I;
        long a = vvVar.a(0L, (v22Var.c() << 32) | (v22Var.a() & 4294967295L), da2Var);
        long a2 = vvVar.a(0L, j2, da2Var);
        return r22.c(r22.c(r22.c(v22Var.b(), a), ((-((int) (a2 >> 32))) << 32) | (4294967295L & (-((int) (a2 & 4294967295L))))), 0 << 32);
    }
}
