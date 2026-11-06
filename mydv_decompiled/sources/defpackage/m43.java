package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m43 {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final boolean b() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final void c(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.a += intBitsToFloat;
        this.b += intBitsToFloat2;
        this.c += intBitsToFloat;
        this.d += intBitsToFloat2;
    }

    public final String toString() {
        String x0 = e41.x0(this.a);
        String x02 = e41.x0(this.b);
        String x03 = e41.x0(this.c);
        String x04 = e41.x0(this.d);
        StringBuilder F = r7.F("MutableRect(", x0, ", ", x02, ", ");
        F.append(x03);
        F.append(", ");
        F.append(x04);
        F.append(")");
        return F.toString();
    }
}
