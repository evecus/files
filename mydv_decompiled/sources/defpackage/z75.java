package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z75 {
    public final long a;
    public final long b;
    public final long c;

    public z75() {
        jp jpVar = t41.J;
        x41 x41Var = x41.SECONDS;
        long n0 = sp0.n0(45, x41Var);
        long n02 = sp0.n0(5, x41Var);
        long n03 = sp0.n0(5, x41Var);
        this.a = n0;
        this.b = n02;
        this.c = n03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z75)) {
            return false;
        }
        z75 z75Var = (z75) obj;
        long j = z75Var.a;
        jp jpVar = t41.J;
        return this.a == j && this.b == z75Var.b && this.c == z75Var.c;
    }

    public final int hashCode() {
        jp jpVar = t41.J;
        return n84.S0.hashCode() + ((i82.Q(this.c) + ((i82.Q(this.b) + (i82.Q(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) t41.i(this.a)) + ", additionalTime=" + ((Object) t41.i(this.b)) + ", idleTimeout=" + ((Object) t41.i(this.c)) + ", timeSource=" + n84.S0 + ')';
    }
}
