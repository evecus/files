package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class dz1 extends mu<fz1> {
    public final rm1 a;
    public final rm1 b;
    public final rm1 c;
    public final rm1 d;
    public final long e;
    public final long f;
    public final rx4 g;
    public final rx4 h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;

    public dz1(float f, float f2, float f3, float f4, long j, long j2, rm1 rm1Var, rm1 rm1Var2, rm1 rm1Var3, rm1 rm1Var4, rx4 rx4Var, rx4 rx4Var2) {
        this.a = rm1Var;
        this.b = rm1Var2;
        this.c = rm1Var3;
        this.d = rm1Var4;
        this.e = j;
        this.f = j2;
        this.g = rx4Var;
        this.h = rx4Var2;
        this.i = f;
        this.j = f2;
        this.k = f3;
        this.l = f4;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new fz1(this.l, this.i, this.j, this.k, this.e, this.f, this.a, this.b, this.c, this.d, this.g, this.h);
    }

    @Override // defpackage.mu
    public final long e() {
        return this.e;
    }

    @Override // defpackage.mu
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof dz1)) {
            return this.l == ((dz1) obj).l;
        }
        return false;
    }

    @Override // defpackage.mu
    public final float f() {
        return this.i;
    }

    @Override // defpackage.mu
    public final rx4 g() {
        return this.g;
    }

    @Override // defpackage.mu
    public final long h() {
        return this.f;
    }

    @Override // defpackage.mu
    public final int hashCode() {
        return Float.floatToIntBits(this.l) + (super.hashCode() * 31);
    }

    @Override // defpackage.mu
    public final rx4 i() {
        return this.h;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "indeterminateLinearWavyProgressIndicator";
        z12Var.c.b(Float.valueOf(this.l), "amplitude");
        d(z12Var);
    }

    @Override // defpackage.mu
    public final float j() {
        return this.k;
    }

    @Override // defpackage.mu
    public final float k() {
        return this.j;
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        fz1 fz1Var = (fz1) k13Var;
        l(fz1Var);
        fz1Var.W = this.a;
        fz1Var.X = this.b;
        fz1Var.Y = this.c;
        fz1Var.Z = this.d;
        float f = this.l;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (fz1Var.a0 == f) {
            return;
        }
        fz1Var.a0 = f;
        fz1Var.n0();
    }
}
