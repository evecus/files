package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vb1 {
    public final long a;
    public final long b;

    public vb1(long j, long j2) {
        if (j2 == 0) {
            this.a = 0L;
            this.b = 1L;
        } else {
            this.a = j;
            this.b = j2;
        }
    }

    public final double a() {
        return this.a / this.b;
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
