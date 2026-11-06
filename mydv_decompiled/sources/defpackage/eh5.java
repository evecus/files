package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class eh5 implements vu5 {
    public final String a;
    public final jk3 b;

    public eh5(w12 w12Var, String str) {
        this.a = str;
        this.b = ad4.w(w12Var);
    }

    @Override // defpackage.vu5
    public final int a(iu0 iu0Var) {
        return e().b;
    }

    @Override // defpackage.vu5
    public final int b(iu0 iu0Var, da2 da2Var) {
        return e().c;
    }

    @Override // defpackage.vu5
    public final int c(iu0 iu0Var) {
        return e().d;
    }

    @Override // defpackage.vu5
    public final int d(iu0 iu0Var, da2 da2Var) {
        return e().a;
    }

    public final w12 e() {
        return (w12) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eh5) {
            return j42.c(e(), ((eh5) obj).e());
        }
        return false;
    }

    public final void f(w12 w12Var) {
        this.b.setValue(w12Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}
