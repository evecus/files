package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class eb0 implements c71 {
    public final oj a;
    public final int b;

    public eb0(String str, int i) {
        this(new oj(str), i);
    }

    @Override // defpackage.c71
    public final void a(d71 d71Var) {
        int i = d71Var.d;
        oj ojVar = this.a;
        if (i != -1) {
            d71Var.d(i, d71Var.e, ojVar.J);
        } else {
            d71Var.d(d71Var.b, d71Var.c, ojVar.J);
        }
        int i2 = d71Var.b;
        int i3 = d71Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int r = ut0.r(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - ojVar.J.length(), 0, d71Var.a.d());
        d71Var.f(r, r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb0)) {
            return false;
        }
        eb0 eb0Var = (eb0) obj;
        return j42.c(this.a.J, eb0Var.a.J) && this.b == eb0Var.b;
    }

    public final int hashCode() {
        return (this.a.J.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.a.J + "', newCursorPosition=" + this.b + ")";
    }

    public eb0(oj ojVar, int i) {
        this.a = ojVar;
        this.b = i;
    }
}
