package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zs1 {
    public static final ys1 e = new ys1();
    public final int a;
    public final double b;
    public final double c;
    public final double d;

    public zs1(int i) {
        this.a = i;
        a10 y = j42.y(i);
        this.b = y.a;
        this.c = y.b;
        this.d = p70.l0(i);
    }

    public final boolean a() {
        double d = this.b;
        return d >= 170.0d && d < 207.0d;
    }

    public final boolean b() {
        double d = this.b;
        return d >= 105.0d && d < 125.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs1) && this.a == ((zs1) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return r7.z("Hct(argb=", this.a, ")");
    }
}
