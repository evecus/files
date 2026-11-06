package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tu0 {
    public static final tu0 c = new tu0(0, 0);
    public final long a;
    public final long b;

    public tu0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tu0) {
            tu0 tu0Var = (tu0) obj;
            return z22.b(this.a, tu0Var.a) && this.b == tu0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.b) + (i82.Q(this.a) * 31);
    }
}
