package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class an3 implements iu0 {
    public boolean I;

    public static void g(an3 an3Var, bn3 bn3Var, int i, int i2) {
        an3Var.f(bn3Var);
        bn3Var.d0(r22.c((i2 & 4294967295L) | (i << 32), bn3Var.M), 0.0f, null);
    }

    public static void h(an3 an3Var, bn3 bn3Var, long j) {
        an3Var.f(bn3Var);
        bn3Var.d0(r22.c(j, bn3Var.M), 0.0f, null);
    }

    public static void i(an3 an3Var, bn3 bn3Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (an3Var.b() == da2.I || an3Var.d() == 0) {
            an3Var.f(bn3Var);
            bn3Var.d0(r22.c(j, bn3Var.M), 0.0f, null);
        } else {
            int d = (an3Var.d() - bn3Var.I) - ((int) (j >> 32));
            an3Var.f(bn3Var);
            bn3Var.d0(r22.c((d << 32) | (((int) (j & 4294967295L)) & 4294967295L), bn3Var.M), 0.0f, null);
        }
    }

    public static void j(an3 an3Var, bn3 bn3Var, int i, int i2, tm1 tm1Var, int i3) {
        if ((i3 & 8) != 0) {
            tm1Var = cn3.a;
        }
        long j = (i << 32) | (i2 & 4294967295L);
        if (an3Var.b() == da2.I || an3Var.d() == 0) {
            an3Var.f(bn3Var);
            bn3Var.d0(r22.c(j, bn3Var.M), 0.0f, tm1Var);
        } else {
            an3Var.f(bn3Var);
            bn3Var.d0(r22.c((((an3Var.d() - bn3Var.I) - ((int) (j >> 32))) << 32) | (((int) (j & 4294967295L)) & 4294967295L), bn3Var.M), 0.0f, tm1Var);
        }
    }

    public static void l(an3 an3Var, bn3 bn3Var, long j) {
        u73 u73Var = cn3.a;
        if (an3Var.b() == da2.I || an3Var.d() == 0) {
            an3Var.f(bn3Var);
            bn3Var.d0(r22.c(j, bn3Var.M), 0.0f, u73Var);
        } else {
            int d = (an3Var.d() - bn3Var.I) - ((int) (j >> 32));
            an3Var.f(bn3Var);
            bn3Var.d0(r22.c((((int) (j & 4294967295L)) & 4294967295L) | (d << 32), bn3Var.M), 0.0f, u73Var);
        }
    }

    public static void o(an3 an3Var, bn3 bn3Var, int i, int i2, tm1 tm1Var, int i3) {
        if ((i3 & 8) != 0) {
            tm1Var = cn3.a;
        }
        an3Var.f(bn3Var);
        bn3Var.d0(r22.c((i2 & 4294967295L) | (i << 32), bn3Var.M), 0.0f, tm1Var);
    }

    public static void p(an3 an3Var, bn3 bn3Var, long j) {
        u73 u73Var = cn3.a;
        an3Var.f(bn3Var);
        bn3Var.d0(r22.c(j, bn3Var.M), 0.0f, u73Var);
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return hf1.g(f / getDensity(), this);
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
    public final float P(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ int X(float f) {
        return r7.b(f, this);
    }

    public float a(gv1 gv1Var) {
        return Float.NaN;
    }

    public abstract da2 b();

    @Override // defpackage.iu0
    public final /* synthetic */ long c0(long j) {
        return r7.e(j, this);
    }

    public abstract int d();

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(bn3 bn3Var) {
        if (bn3Var instanceof e23) {
            ((e23) bn3Var).D(this.I);
        }
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float f0(long j) {
        return r7.d(j, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long k(long j) {
        return r7.c(j, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float q(long j) {
        return hf1.f(j, this);
    }
}
