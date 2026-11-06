package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k85 {
    public static final i85 e = new i85();
    public final double a;
    public final double b;
    public final zs1 c;
    public final HashMap d = new HashMap();

    public k85(double d, double d2, zs1 zs1Var) {
        this.a = d;
        this.b = d2;
        this.c = zs1Var;
    }

    public final zs1 a(double d) {
        if (d == 99.0d) {
            double d2 = this.a;
            if (d2 >= 105.0d && d2 < 125.0d) {
                return new zs1(b(99));
            }
        }
        return new zs1(o7.Q(this.a, this.b, d));
    }

    public final int b(int i) {
        Integer valueOf;
        Integer valueOf2 = Integer.valueOf(i);
        HashMap hashMap = this.d;
        Integer num = (Integer) hashMap.get(valueOf2);
        if (num != null) {
            return num.intValue();
        }
        if (i == 99) {
            double d = this.a;
            if (d >= 105.0d && d < 125.0d) {
                int b = b(98);
                int b2 = b(100);
                valueOf = Integer.valueOf((mw2.P(((b & 255) + (b2 & 255)) / 2.0f) & 255) | ((mw2.P((((b >>> 16) & 255) + ((b2 >>> 16) & 255)) / 2.0f) & 255) << 16) | (-16777216) | ((mw2.P((((b >>> 8) & 255) + ((b2 >>> 8) & 255)) / 2.0f) & 255) << 8));
                hashMap.put(Integer.valueOf(i), valueOf);
                return valueOf.intValue();
            }
        }
        int Q = o7.Q(this.a, this.b, i);
        j42.y(Q);
        p70.l0(Q);
        valueOf = Integer.valueOf(Q);
        hashMap.put(Integer.valueOf(i), valueOf);
        return valueOf.intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k85)) {
            return false;
        }
        k85 k85Var = (k85) obj;
        return Double.compare(this.a, k85Var.a) == 0 && Double.compare(this.b, k85Var.b) == 0 && this.c.equals(k85Var.c);
    }

    public final int hashCode() {
        return ((nt3.i(this.b) + (nt3.i(this.a) * 31)) * 31) + this.c.a;
    }

    public final String toString() {
        return "TonalPalette(hue=" + this.a + ", chroma=" + this.b + ", keyColor=" + this.c + ")";
    }
}
