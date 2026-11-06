package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fa2 {
    public final int a;
    public final int b;
    public final boolean c;

    public fa2(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa2)) {
            return false;
        }
        fa2 fa2Var = (fa2) obj;
        return this.a == fa2Var.a && this.b == fa2Var.b && this.c == fa2Var.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder D = hf1.D("BidiRun(start=", this.a, ", end=", this.b, ", isRtl=");
        D.append(this.c);
        D.append(")");
        return D.toString();
    }
}
