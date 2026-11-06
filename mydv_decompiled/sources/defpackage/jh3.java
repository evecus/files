package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jh3 {
    public final long a;
    public final li3 b;

    public jh3() {
        long j = qb.j(4284900966L);
        li3 S = i42.S(0.0f, 3);
        this.a = j;
        this.b = S;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jh3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        jh3 jh3Var = (jh3) obj;
        long j = jh3Var.a;
        int i = x70.h;
        return zc5.a(this.a, j) && this.b.equals(jh3Var.b);
    }

    public final int hashCode() {
        int i = x70.h;
        return this.b.hashCode() + (i82.Q(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + x70.i(this.a) + ", drawPadding=" + this.b + ")";
    }
}
