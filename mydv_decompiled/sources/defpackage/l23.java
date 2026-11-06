package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l23 {
    public final long a;
    public final long b;
    public final boolean c;

    public l23(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final l23 a(l23 l23Var) {
        return new l23(pd3.f(this.a, l23Var.a), Math.max(this.b, l23Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l23)) {
            return false;
        }
        l23 l23Var = (l23) obj;
        return pd3.c(this.a, l23Var.a) && this.b == l23Var.b && this.c == l23Var.c;
    }

    public final int hashCode() {
        int Q = i82.Q(this.a) * 31;
        long j = this.b;
        return ((Q + ((int) (j ^ (j >>> 32)))) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + pd3.h(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
