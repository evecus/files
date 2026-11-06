package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xi0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public xi0(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xi0)) {
            return false;
        }
        xi0 xi0Var = (xi0) obj;
        long j = xi0Var.a;
        int i = x70.h;
        return zc5.a(this.a, j) && zc5.a(this.b, xi0Var.b) && zc5.a(this.c, xi0Var.c) && zc5.a(this.d, xi0Var.d) && zc5.a(this.e, xi0Var.e);
    }

    public final int hashCode() {
        int i = x70.h;
        return i82.Q(this.e) + pt1.l(pt1.l(pt1.l(i82.Q(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String i = x70.i(this.a);
        String i2 = x70.i(this.b);
        String i3 = x70.i(this.c);
        String i4 = x70.i(this.d);
        String i5 = x70.i(this.e);
        StringBuilder F = r7.F("ContextMenuColors(backgroundColor=", i, ", textColor=", i2, ", iconColor=");
        r7.N(F, i3, ", disabledTextColor=", i4, ", disabledIconColor=");
        return hf1.z(F, i5, ")");
    }
}
