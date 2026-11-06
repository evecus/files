package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bw0 {
    public final ww5 a;
    public final boolean b;
    public final aw0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;

    public bw0(ww5 ww5Var, boolean z, aw0 aw0Var, boolean z2, boolean z3, boolean z4, int i, int i2) {
        ww5Var.getClass();
        aw0Var.getClass();
        this.a = ww5Var;
        this.b = z;
        this.c = aw0Var;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw0)) {
            return false;
        }
        bw0 bw0Var = (bw0) obj;
        return this.a == bw0Var.a && this.b == bw0Var.b && this.c == bw0Var.c && this.d == bw0Var.d && this.e == bw0Var.e && this.f == bw0Var.f && this.g == bw0Var.g && this.h == bw0Var.h;
    }

    public final int hashCode() {
        return ((((pt1.o(this.f) + ((pt1.o(this.e) + ((pt1.o(this.d) + ((this.c.hashCode() + ((pt1.o(this.b) + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        return "DeviceProfile(width=" + this.a + ", heightCompact=" + this.b + ", input=" + this.c + ", isTv=" + this.d + ", isLowEnd=" + this.e + ", isPortrait=" + this.f + ", windowWidthDp=" + this.g + ", windowHeightDp=" + this.h + ")";
    }
}
