package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fj2 implements vu5 {
    public final vu5 a;
    public final int b;

    public fj2(vu5 vu5Var, int i) {
        this.a = vu5Var;
        this.b = i;
    }

    @Override // defpackage.vu5
    public final int a(iu0 iu0Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(iu0Var);
        }
        return 0;
    }

    @Override // defpackage.vu5
    public final int b(iu0 iu0Var, da2 da2Var) {
        if (((da2Var == da2.I ? 4 : 1) & this.b) != 0) {
            return this.a.b(iu0Var, da2Var);
        }
        return 0;
    }

    @Override // defpackage.vu5
    public final int c(iu0 iu0Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(iu0Var);
        }
        return 0;
    }

    @Override // defpackage.vu5
    public final int d(iu0 iu0Var, da2 da2Var) {
        if (((da2Var == da2.I ? 8 : 2) & this.b) != 0) {
            return this.a.d(iu0Var, da2Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj2)) {
            return false;
        }
        fj2 fj2Var = (fj2) obj;
        return j42.c(this.a, fj2Var.a) && this.b == fj2Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        int i2 = ad4.c;
        if ((i & i2) == i2) {
            ad4.H(sb, "Start");
        }
        int i3 = ad4.e;
        if ((i & i3) == i3) {
            ad4.H(sb, "Left");
        }
        if ((i & 16) == 16) {
            ad4.H(sb, "Top");
        }
        int i4 = ad4.d;
        if ((i & i4) == i4) {
            ad4.H(sb, "End");
        }
        int i5 = ad4.f;
        if ((i & i5) == i5) {
            ad4.H(sb, "Right");
        }
        if ((i & 32) == 32) {
            ad4.H(sb, "Bottom");
        }
        return "(" + this.a + " only " + r7.C("WindowInsetsSides(", sb.toString(), ")") + ")";
    }
}
