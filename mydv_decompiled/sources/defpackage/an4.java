package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class an4 {
    public static final an4 d = new an4(qb.j(4278190080L), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public an4(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an4)) {
            return false;
        }
        an4 an4Var = (an4) obj;
        long j = an4Var.a;
        int i = x70.h;
        return zc5.a(this.a, j) && pd3.c(this.b, an4Var.b) && this.c == an4Var.c;
    }

    public final int hashCode() {
        int i = x70.h;
        return Float.floatToIntBits(this.c) + ((i82.Q(this.b) + (i82.Q(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder F = r7.F("Shadow(color=", x70.i(this.a), ", offset=", pd3.h(this.b), ", blurRadius=");
        F.append(this.c);
        F.append(")");
        return F.toString();
    }
}
