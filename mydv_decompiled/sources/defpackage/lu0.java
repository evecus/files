package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lu0 implements iu0 {
    public final float I;
    public final float J;

    public lu0(float f, float f2) {
        this.I = f;
        this.J = f2;
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return hf1.g(H(f), this);
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return i / getDensity();
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return f / getDensity();
    }

    @Override // defpackage.iu0
    public final float L() {
        return this.J;
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ int X(float f) {
        return r7.b(f, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long c0(long j) {
        return r7.e(j, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu0)) {
            return false;
        }
        lu0 lu0Var = (lu0) obj;
        return Float.compare(this.I, lu0Var.I) == 0 && Float.compare(this.J, lu0Var.J) == 0;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float f0(long j) {
        return r7.d(j, this);
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.I;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.J) + (Float.floatToIntBits(this.I) * 31);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long k(long j) {
        return r7.c(j, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float q(long j) {
        return hf1.f(j, this);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.I + ", fontScale=" + this.J + ")";
    }
}
