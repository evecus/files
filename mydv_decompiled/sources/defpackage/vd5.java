package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vd5 implements vu5 {
    public final vu5 a;
    public final vu5 b;

    public vd5(vu5 vu5Var, vu5 vu5Var2) {
        this.a = vu5Var;
        this.b = vu5Var2;
    }

    @Override // defpackage.vu5
    public final int a(iu0 iu0Var) {
        return Math.max(this.a.a(iu0Var), this.b.a(iu0Var));
    }

    @Override // defpackage.vu5
    public final int b(iu0 iu0Var, da2 da2Var) {
        return Math.max(this.a.b(iu0Var, da2Var), this.b.b(iu0Var, da2Var));
    }

    @Override // defpackage.vu5
    public final int c(iu0 iu0Var) {
        return Math.max(this.a.c(iu0Var), this.b.c(iu0Var));
    }

    @Override // defpackage.vu5
    public final int d(iu0 iu0Var, da2 da2Var) {
        return Math.max(this.a.d(iu0Var, da2Var), this.b.d(iu0Var, da2Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd5)) {
            return false;
        }
        vd5 vd5Var = (vd5) obj;
        return j42.c(vd5Var.a, this.a) && j42.c(vd5Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
