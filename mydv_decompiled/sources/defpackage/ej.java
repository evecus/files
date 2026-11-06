package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ej extends hj {
    public float a;
    public float b;

    public ej(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.hj
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.hj
    public final int b() {
        return 2;
    }

    @Override // defpackage.hj
    public final hj c() {
        return new ej(0.0f, 0.0f);
    }

    @Override // defpackage.hj
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.hj
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ej)) {
            return false;
        }
        ej ejVar = (ej) obj;
        return ejVar.a == this.a && ejVar.b == this.b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
