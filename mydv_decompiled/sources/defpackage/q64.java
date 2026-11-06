package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q64 implements oz1 {
    public final boolean a;
    public final float b;
    public final long c;
    public final dn4 d;
    public final boolean e;

    public q64(boolean z, float f, long j, boolean z2) {
        r11 r11Var = r11.c(f, Float.NaN) ? null : new r11(f);
        dn4 a = r11Var != null ? l74.a(r11Var.I) : null;
        a = a == null ? mw2.j : a;
        this.a = z;
        this.b = f;
        this.c = j;
        this.d = a;
        this.e = z2;
    }

    @Override // defpackage.oz1
    public final tt0 a(t33 t33Var) {
        return new bu0(t33Var, this.a, this.b, new au0(this, (byte) 3), this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q64)) {
            return false;
        }
        q64 q64Var = (q64) obj;
        if (this.a != q64Var.a || !r11.c(this.b, q64Var.b)) {
            return false;
        }
        long j = q64Var.c;
        int i = x70.h;
        return zc5.a(this.c, j) && this.d.equals(q64Var.d) && this.e == q64Var.e;
    }

    @Override // defpackage.oz1
    public final int hashCode() {
        int o = jp0.o(this.b, pt1.o(this.a) * 31, 961);
        int i = x70.h;
        return ((((pt1.o(this.e) + ((((this.d.hashCode() + pt1.l(o, 31, this.c)) * 31) + 1231) * 31)) * 31) + 1231) * 31) + 1231;
    }
}
