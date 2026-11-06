package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j65 {
    public final String a;
    public String b;
    public boolean c = false;
    public bk3 d = null;

    public j65(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final bk3 a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final void d(bk3 bk3Var) {
        this.d = bk3Var;
    }

    public final void e(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j65)) {
            return false;
        }
        j65 j65Var = (j65) obj;
        return j42.c(this.a, j65Var.a) && j42.c(this.b, j65Var.b) && this.c == j65Var.c && j42.c(this.d, j65Var.d);
    }

    public final void f(String str) {
        this.b = str;
    }

    public final int hashCode() {
        int n = (hf1.n(this.a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31;
        bk3 bk3Var = this.d;
        return n + (bk3Var == null ? 0 : bk3Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
