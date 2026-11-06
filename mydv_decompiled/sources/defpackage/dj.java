package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dj extends hj {
    public float a;

    public dj(float f) {
        this.a = f;
    }

    @Override // defpackage.hj
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.hj
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.hj
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dj) && ((dj) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
