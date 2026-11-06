package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sk4 implements c71 {
    public final int a;
    public final int b;

    public sk4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.c71
    public final void a(d71 d71Var) {
        boolean z = d71Var.d != -1;
        a1 a1Var = d71Var.a;
        if (z) {
            d71Var.d = -1;
            d71Var.e = -1;
        }
        int r = ut0.r(this.a, 0, a1Var.d());
        int r2 = ut0.r(this.b, 0, a1Var.d());
        if (r != r2) {
            if (r < r2) {
                d71Var.e(r, r2);
            } else {
                d71Var.e(r2, r);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk4)) {
            return false;
        }
        sk4 sk4Var = (sk4) obj;
        return this.a == sk4Var.a && this.b == sk4Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return hf1.v("SetComposingRegionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
