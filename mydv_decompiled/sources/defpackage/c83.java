package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class c83 {
    public boolean a;
    public boolean b;
    public String d;
    public boolean e;
    public boolean f;
    public int c = -1;
    public int g = -1;
    public int h = -1;

    public static void d(c83 c83Var, int i) {
        c83Var.c = i;
        c83Var.d = null;
        c83Var.e = true;
        c83Var.f = false;
    }

    public final d83 a() {
        String str = this.d;
        boolean z = this.a;
        if (str == null) {
            return new d83(z, this.b, this.c, this.e, this.f, this.g, this.h);
        }
        boolean z2 = this.b;
        boolean z3 = this.e;
        boolean z4 = this.f;
        int i = this.g;
        int i2 = this.h;
        int i3 = i73.M;
        d83 d83Var = new d83(z, z2, "android-app://androidx.navigation/".concat(str).hashCode(), z3, z4, i, i2);
        d83Var.h = str;
        return d83Var;
    }

    public final void b() {
        this.g = 0;
    }

    public final void c() {
        this.h = 0;
    }
}
