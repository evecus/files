package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f44 implements ve1 {
    public final byte a;
    public final qb5 b;
    public final d44 c;
    public final long d;

    /* JADX WARN: Multi-variable type inference failed */
    public f44(int i, qb5 qb5Var, d44 d44Var, long j) {
        this.a = i;
        this.b = qb5Var;
        this.c = d44Var;
        this.d = j;
    }

    @Override // defpackage.bj
    public final xh5 a(ub5 ub5Var) {
        return new ei5(this.a, this.b.a(ub5Var), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f44) {
            f44 f44Var = (f44) obj;
            if (f44Var.a == this.a && f44Var.b.equals(this.b) && f44Var.c == this.c && f44Var.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a * 31)) * 31)) * 31);
    }
}
