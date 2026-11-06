package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u10 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public u10(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u10)) {
            return false;
        }
        u10 u10Var = (u10) obj;
        long j = u10Var.a;
        int i = x70.h;
        return zc5.a(this.a, j) && zc5.a(this.b, u10Var.b) && zc5.a(this.c, u10Var.c) && zc5.a(this.d, u10Var.d);
    }

    public final int hashCode() {
        int i = x70.h;
        return i82.Q(this.d) + pt1.l(pt1.l(i82.Q(this.a) * 31, 31, this.b), 31, this.c);
    }
}
