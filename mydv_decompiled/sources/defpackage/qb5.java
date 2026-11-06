package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qb5 implements u41 {
    public final int a;
    public final int b;
    public final l61 c;

    public qb5(int i, int i2, l61 l61Var) {
        this.a = i;
        this.b = i2;
        this.c = l61Var;
    }

    @Override // defpackage.bj
    public final xh5 a(ub5 ub5Var) {
        return new fi5(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qb5) {
            qb5 qb5Var = (qb5) obj;
            if (qb5Var.a == this.a && qb5Var.b == this.b && j42.c(qb5Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.u41, defpackage.bj
    public final zh5 a(ub5 ub5Var) {
        return new fi5(this.a, this.b, this.c);
    }
}
