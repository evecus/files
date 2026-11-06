package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wg implements vu5 {
    public final short a;
    public final String b;
    public final jk3 c = ad4.w(o12.e);
    public final jk3 d = ad4.w(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public wg(int i, String str) {
        this.a = i;
        this.b = str;
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

    public final o12 e() {
        return (o12) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wg) {
            return this.a == ((wg) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(yv5 yv5Var, int i) {
        short s = this.a;
        if (i == 0 || (i & s) != 0) {
            this.c.setValue(yv5Var.a.i(s));
            f(yv5Var.a.u(s));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "(" + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ")";
    }
}
