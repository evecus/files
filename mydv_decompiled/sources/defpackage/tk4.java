package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tk4 implements c71 {
    public final oj a;
    public final int b;

    public tk4(String str, int i) {
        this.a = new oj(str);
        this.b = i;
    }

    @Override // defpackage.c71
    public final void a(d71 d71Var) {
        String str = this.a.J;
        int i = d71Var.d;
        if (i != -1) {
            d71Var.d(i, d71Var.e, str);
            if (str.length() > 0) {
                d71Var.e(i, str.length() + i);
            }
        } else {
            int i2 = d71Var.b;
            d71Var.d(i2, d71Var.c, str);
            if (str.length() > 0) {
                d71Var.e(i2, str.length() + i2);
            }
        }
        int i3 = d71Var.b;
        int i4 = d71Var.c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.b;
        int r = ut0.r(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - str.length(), 0, d71Var.a.d());
        d71Var.f(r, r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk4)) {
            return false;
        }
        tk4 tk4Var = (tk4) obj;
        return j42.c(this.a.J, tk4Var.a.J) && this.b == tk4Var.b;
    }

    public final int hashCode() {
        return (this.a.J.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + this.a.J + "', newCursorPosition=" + this.b + ")";
    }
}
