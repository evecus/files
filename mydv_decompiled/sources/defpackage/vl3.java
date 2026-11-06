package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vl3 implements pk0 {
    public final float a;

    public vl3(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            t02.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.pk0
    public final float a(long j, iu0 iu0Var) {
        return (this.a / 100.0f) * fq4.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vl3) && Float.compare(this.a, ((vl3) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
