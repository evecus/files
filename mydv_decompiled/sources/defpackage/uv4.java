package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uv4 implements bj {
    public final bj a;
    public final long b;

    public uv4(ve1 ve1Var, long j) {
        this.a = ve1Var;
        this.b = j;
    }

    @Override // defpackage.bj
    public final xh5 a(ub5 ub5Var) {
        return new vv4(this.a.a(ub5Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uv4)) {
            return false;
        }
        uv4 uv4Var = (uv4) obj;
        return uv4Var.b == this.b && j42.c(uv4Var.a, this.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }
}
