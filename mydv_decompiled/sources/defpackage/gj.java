package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gj extends hj {
    public float a;
    public float b;
    public float c;
    public float d;

    public gj(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.hj
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.hj
    public final int b() {
        return 4;
    }

    @Override // defpackage.hj
    public final hj c() {
        return new gj(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.hj
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.hj
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gj)) {
            return false;
        }
        gj gjVar = (gj) obj;
        return gjVar.a == this.a && gjVar.b == this.b && gjVar.c == this.c && gjVar.d == this.d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder B = hf1.B("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        B.append(f3);
        B.append(", v4 = ");
        B.append(f4);
        return B.toString();
    }
}
