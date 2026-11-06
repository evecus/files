package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d02 implements bj {
    public final u41 a;
    public final d44 b;
    public final long c;

    public d02(u41 u41Var, d44 d44Var, long j) {
        this.a = u41Var;
        this.b = d44Var;
        this.c = j;
        if (u41Var instanceof qb5) {
            qb5 qb5Var = (qb5) u41Var;
            if (qb5Var.a != 0 || qb5Var.b != 0) {
                return;
            }
        } else if (!(u41Var instanceof ms4) && (!(u41Var instanceof c92) || ((c92) u41Var).f().b() != 0)) {
            return;
        }
        s83.t("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.bj
    public final xh5 a(ub5 ub5Var) {
        return new bi5(this.a.a(ub5Var), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d02) {
            d02 d02Var = (d02) obj;
            if (d02Var.a.equals(this.a) && d02Var.b == this.b && d02Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
