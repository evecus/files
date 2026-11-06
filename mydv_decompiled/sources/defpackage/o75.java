package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o75 implements kb0 {
    public final long I;

    public /* synthetic */ o75(long j) {
        this.I = j;
    }

    public static long a(long j) {
        return (1 | (j - 1)) == Long.MAX_VALUE ? t41.j(mu0.F(j)) : mu0.S(t13.b(), j);
    }

    public static final long b(long j, long j2) {
        int i = t13.J;
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? mu0.F(j) : mu0.S(j, j2);
        }
        if (j != j2) {
            return t41.j(mu0.F(j2));
        }
        jp jpVar = t41.J;
        return 0L;
    }

    public final o75 c(long j) {
        int i = t13.J;
        return new o75(mu0.R(this.I, j));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return d4.l(this, (kb0) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o75) {
            return this.I == ((o75) obj).I;
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.I);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.I + ')';
    }
}
