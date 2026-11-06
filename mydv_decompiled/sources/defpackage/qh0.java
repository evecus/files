package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qh0 {
    public final int a;
    public final long b;
    public final rh0 c;
    public final g73 d;

    public qh0(int i, long j, rh0 rh0Var, g73 g73Var) {
        this.a = i;
        this.b = j;
        this.c = rh0Var;
        this.d = g73Var;
    }

    public final int a() {
        return this.a;
    }

    public final g73 b() {
        return this.d;
    }

    public final rh0 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh0)) {
            return false;
        }
        qh0 qh0Var = (qh0) obj;
        return this.a == qh0Var.a && this.b == qh0Var.b && this.c == qh0Var.c && j42.c(this.d, qh0Var.d);
    }

    public final int hashCode() {
        int i = this.a * 31;
        long j = this.b;
        int hashCode = (this.c.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        g73 g73Var = this.d;
        return hashCode + (g73Var == null ? 0 : g73Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
