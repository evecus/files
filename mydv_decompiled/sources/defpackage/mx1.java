package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mx1 {
    public static final mx1 g = new mx1(false, 0, true, 1, 1, tq2.K);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final tq2 f;

    public mx1(boolean z, int i, boolean z2, int i2, int i3, tq2 tq2Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = tq2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx1)) {
            return false;
        }
        mx1 mx1Var = (mx1) obj;
        return this.a == mx1Var.a && this.b == mx1Var.b && this.c == mx1Var.c && this.d == mx1Var.d && this.e == mx1Var.e && j42.c(this.f, mx1Var.f);
    }

    public final int hashCode() {
        return this.f.I.hashCode() + ((((((pt1.o(this.c) + (((pt1.o(this.a) * 31) + this.b) * 31)) * 31) + this.d) * 31) + this.e) * 961);
    }

    public final String toString() {
        int i = this.b;
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + (i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid") + ", autoCorrect=" + this.c + ", keyboardType=" + vt0.a0(this.d) + ", imeAction=" + lx1.a(this.e) + ", platformImeOptions=null, hintLocales=" + this.f + ")";
    }
}
