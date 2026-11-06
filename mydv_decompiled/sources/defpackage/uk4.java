package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uk4 implements c71 {
    public final int a;
    public final int b;

    public uk4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.c71
    public final void a(d71 d71Var) {
        int r = ut0.r(this.a, 0, d71Var.a.d());
        int r2 = ut0.r(this.b, 0, d71Var.a.d());
        if (r < r2) {
            d71Var.f(r, r2);
        } else {
            d71Var.f(r2, r);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk4)) {
            return false;
        }
        uk4 uk4Var = (uk4) obj;
        return this.a == uk4Var.a && this.b == uk4Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return hf1.v("SetSelectionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
