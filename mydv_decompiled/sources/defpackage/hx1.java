package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hx1 {
    public static int k;
    public static final jp l = new jp(23);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final sh5 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public hx1(String str, float f, float f2, float f3, float f4, sh5 sh5Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = sh5Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx1)) {
            return false;
        }
        hx1 hx1Var = (hx1) obj;
        if (!j42.c(this.a, hx1Var.a) || !r11.c(this.b, hx1Var.b) || !r11.c(this.c, hx1Var.c) || this.d != hx1Var.d || this.e != hx1Var.e || !this.f.equals(hx1Var.f)) {
            return false;
        }
        long j = hx1Var.g;
        int i = x70.h;
        return zc5.a(this.g, j) && this.h == hx1Var.h && this.i == hx1Var.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + jp0.o(this.e, jp0.o(this.d, jp0.o(this.c, jp0.o(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = x70.h;
        return pt1.o(this.i) + ((pt1.l(hashCode, 31, this.g) + this.h) * 31);
    }
}
