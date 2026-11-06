package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class xv0 extends mu<zv0> {
    public final rm1 a;
    public final tm1 b;
    public final long c;
    public final long d;
    public final rx4 e;
    public final rx4 f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;

    public xv0(float f, float f2, float f3, float f4, long j, long j2, rm1 rm1Var, tm1 tm1Var, rx4 rx4Var, rx4 rx4Var2) {
        this.a = rm1Var;
        this.b = tm1Var;
        this.c = j;
        this.d = j2;
        this.e = rx4Var;
        this.f = rx4Var2;
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = f4;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new zv0(this.h, this.g, this.i, this.j, this.c, this.d, this.a, this.b, this.e, this.f);
    }

    @Override // defpackage.mu
    public final long e() {
        return this.c;
    }

    @Override // defpackage.mu
    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof xv0)) {
            return false;
        }
        xv0 xv0Var = (xv0) obj;
        return r11.c(this.h, xv0Var.h) && this.a == xv0Var.a && this.b == xv0Var.b;
    }

    @Override // defpackage.mu
    public final float f() {
        return this.g;
    }

    @Override // defpackage.mu
    public final rx4 g() {
        return this.e;
    }

    @Override // defpackage.mu
    public final long h() {
        return this.d;
    }

    @Override // defpackage.mu
    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + jp0.o(this.h, super.hashCode() * 31, 31)) * 31);
    }

    @Override // defpackage.mu
    public final rx4 i() {
        return this.f;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "determinateLinearWavyProgressIndicator";
        z12Var.c.b(new r11(this.h), "stopSize");
        d(z12Var);
    }

    @Override // defpackage.mu
    public final float j() {
        return this.j;
    }

    @Override // defpackage.mu
    public final float k() {
        return this.i;
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        zv0 zv0Var = (zv0) k13Var;
        l(zv0Var);
        float f = zv0Var.Y;
        k00 k00Var = zv0Var.a0;
        float f2 = this.h;
        if (!r11.c(f, f2)) {
            zv0Var.Y = f2;
            mu0.I(k00Var);
        }
        rm1 rm1Var = zv0Var.W;
        tm1 tm1Var = this.b;
        rm1 rm1Var2 = this.a;
        if (rm1Var == rm1Var2 && zv0Var.X == tm1Var) {
            return;
        }
        zv0Var.W = rm1Var2;
        zv0Var.X = tm1Var;
        k00Var.j0();
    }
}
