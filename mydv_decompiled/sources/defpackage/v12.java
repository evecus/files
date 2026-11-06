package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v12 implements ji3 {
    public final vu5 a;
    public final iu0 b;

    public v12(vu5 vu5Var, iu0 iu0Var) {
        this.a = vu5Var;
        this.b = iu0Var;
    }

    @Override // defpackage.ji3
    public final float a() {
        vu5 vu5Var = this.a;
        iu0 iu0Var = this.b;
        return iu0Var.F(vu5Var.c(iu0Var));
    }

    @Override // defpackage.ji3
    public final float b(da2 da2Var) {
        vu5 vu5Var = this.a;
        iu0 iu0Var = this.b;
        return iu0Var.F(vu5Var.d(iu0Var, da2Var));
    }

    @Override // defpackage.ji3
    public final float c(da2 da2Var) {
        vu5 vu5Var = this.a;
        iu0 iu0Var = this.b;
        return iu0Var.F(vu5Var.b(iu0Var, da2Var));
    }

    @Override // defpackage.ji3
    public final float d() {
        vu5 vu5Var = this.a;
        iu0 iu0Var = this.b;
        return iu0Var.F(vu5Var.a(iu0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v12)) {
            return false;
        }
        v12 v12Var = (v12) obj;
        return j42.c(this.a, v12Var.a) && j42.c(this.b, v12Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
