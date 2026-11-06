package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cw2 {
    public final long a;
    public final ok0 b;

    public cw2(long j, ok0 ok0Var) {
        this.a = j;
        this.b = ok0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2)) {
            return false;
        }
        cw2 cw2Var = (cw2) obj;
        return pd3.c(this.a, cw2Var.a) && j42.c(this.b, cw2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (i82.Q(this.a) * 31);
    }

    public final String toString() {
        return "PointNRound(o=" + pd3.h(this.a) + ", r=" + this.b + ")";
    }

    public /* synthetic */ cw2(long j) {
        this(j, ok0.b);
    }
}
