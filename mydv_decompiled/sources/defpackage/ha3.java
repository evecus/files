package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ha3 {
    public k13 a;
    public int b;
    public e43 c;
    public e43 d;
    public boolean e;
    public final /* synthetic */ ja3 f;

    public ha3(ja3 ja3Var, k13 k13Var, int i, e43 e43Var, e43 e43Var2, boolean z) {
        this.f = ja3Var;
        this.a = k13Var;
        this.b = i;
        this.c = e43Var;
        this.d = e43Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        j13 j13Var = (j13) this.c.g(this.b + i);
        j13 j13Var2 = (j13) this.d.g(this.b + i2);
        return j42.c(j13Var, j13Var2) || j13Var.getClass() == j13Var2.getClass();
    }

    public final void b(e43 e43Var) {
        this.d = e43Var;
    }

    public final void c(e43 e43Var) {
        this.c = e43Var;
    }

    public final void d(k13 k13Var) {
        this.a = k13Var;
    }

    public final void e(int i) {
        this.b = i;
    }

    public final void f(boolean z) {
        this.e = z;
    }
}
