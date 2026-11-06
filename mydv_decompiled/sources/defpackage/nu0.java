package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nu0 implements iu0 {
    public final float I;
    public final float J;
    public final ik1 K;

    public nu0(float f, float f2, ik1 ik1Var) {
        this.I = f;
        this.J = f2;
        this.K = ik1Var;
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return oh4.p(4294967296L, this.K.a(H(f)));
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
        if (!(obj instanceof nu0)) {
            return false;
        }
        nu0 nu0Var = (nu0) obj;
        return Float.compare(this.I, nu0Var.I) == 0 && Float.compare(this.J, nu0Var.J) == 0 && this.K.equals(nu0Var.K);
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
        return this.K.hashCode() + jp0.o(this.J, Float.floatToIntBits(this.I) * 31, 31);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long k(long j) {
        return r7.c(j, this);
    }

    @Override // defpackage.iu0
    public final float q(long j) {
        if (q65.a(p65.b(j), 4294967296L)) {
            return this.K.b(p65.c(j));
        }
        zy.i("Only Sp can convert to Px");
        return 0.0f;
    }

    public final String toString() {
        StringBuilder B = hf1.B("DensityWithConverter(density=", this.I, ", fontScale=", this.J, ", converter=");
        B.append(this.K);
        B.append(")");
        return B.toString();
    }
}
