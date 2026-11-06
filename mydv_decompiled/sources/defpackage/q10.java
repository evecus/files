package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q10 {
    public iu0 a;
    public da2 b;
    public o10 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q10)) {
            return false;
        }
        q10 q10Var = (q10) obj;
        return j42.c(this.a, q10Var.a) && this.b == q10Var.b && j42.c(this.c, q10Var.c) && fq4.a(this.d, q10Var.d);
    }

    public final int hashCode() {
        return i82.Q(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + fq4.d(this.d) + ")";
    }
}
