package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cy3 {
    public final long a;
    public final long b;

    public cy3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy3)) {
            return false;
        }
        cy3 cy3Var = (cy3) obj;
        long j = cy3Var.a;
        int i = x70.h;
        return zc5.a(this.a, j) && zc5.a(this.b, cy3Var.b);
    }

    public final int hashCode() {
        int i = x70.h;
        return i82.Q(this.b) + (i82.Q(this.a) * 31);
    }

    public final String toString() {
        return hf1.x("QrCodeColors(module=", x70.i(this.a), ", background=", x70.i(this.b), ")");
    }
}
