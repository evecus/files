package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class du0 implements c71 {
    public final int a;
    public final int b;

    public du0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        r02.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.c71
    public final void a(d71 d71Var) {
        int i = d71Var.c;
        a1 a1Var = d71Var.a;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = a1Var.d();
        }
        d71Var.a(d71Var.c, Math.min(i3, a1Var.d()));
        int i4 = d71Var.b;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i5 ^ i4) & (i4 ^ i6)) < 0) {
            i6 = 0;
        }
        d71Var.a(Math.max(0, i6), d71Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du0)) {
            return false;
        }
        du0 du0Var = (du0) obj;
        return this.a == du0Var.a && this.b == du0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return hf1.v("DeleteSurroundingTextCommand(lengthBeforeCursor=", this.a, ", lengthAfterCursor=", this.b, ")");
    }
}
