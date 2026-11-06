package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g8 implements vu5 {
    public final fj2 a;
    public final af1 b;

    public g8(fj2 fj2Var, af1 af1Var) {
        this.a = fj2Var;
        this.b = af1Var;
    }

    @Override // defpackage.vu5
    public final int a(iu0 iu0Var) {
        return iu0Var.X(0.0f) + this.a.a(iu0Var);
    }

    @Override // defpackage.vu5
    public final int b(iu0 iu0Var, da2 da2Var) {
        return iu0Var.X(0.0f) + this.a.b(iu0Var, da2Var);
    }

    @Override // defpackage.vu5
    public final int c(iu0 iu0Var) {
        return iu0Var.X(32.0f) + this.a.c(iu0Var);
    }

    @Override // defpackage.vu5
    public final int d(iu0 iu0Var, da2 da2Var) {
        return iu0Var.X(0.0f) + this.a.d(iu0Var, da2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8)) {
            return false;
        }
        g8 g8Var = (g8) obj;
        return g8Var.a.equals(this.a) && g8Var.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ")";
    }
}
