package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tp0 implements wi {
    public final mc3 a;
    public final ub5 b;
    public final Object c;
    public final hj d;
    public final hj e;
    public final hj f;
    public final Object g;
    public final long h;

    public tp0(up0 up0Var, ub5 ub5Var, Object obj, hj hjVar) {
        mc3 mc3Var = new mc3(up0Var.a);
        this.a = mc3Var;
        this.b = ub5Var;
        this.c = obj;
        hj hjVar2 = (hj) ub5Var.a.invoke(obj);
        this.d = hjVar2;
        this.e = i42.m0(hjVar);
        this.g = ub5Var.b.invoke(mc3Var.f(hjVar2, hjVar));
        hj hjVar3 = (hj) mc3Var.c;
        if (hjVar3 == null) {
            hjVar3 = hjVar2.c();
            mc3Var.c = hjVar3;
        }
        int b = hjVar3.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            ep epVar = (ep) mc3Var.a;
            hjVar2.getClass();
            float a = hjVar.a(i);
            jf1 jf1Var = (jf1) epVar.J;
            float[] fArr = xc.a;
            j = Math.max(j, ((long) (Math.exp(xc.a(a, jf1Var.a * jf1Var.b) / (kf1.a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.h = j;
        hj m0 = i42.m0(this.a.g(j, this.d, hjVar));
        this.f = m0;
        int b2 = m0.b();
        for (int i2 = 0; i2 < b2; i2++) {
            hj hjVar4 = this.f;
            float a2 = hjVar4.a(i2);
            this.a.getClass();
            this.a.getClass();
            hjVar4.e(ut0.q(a2, -0.0f, 0.0f), i2);
        }
    }

    @Override // defpackage.wi
    public final boolean a() {
        return false;
    }

    @Override // defpackage.wi
    public final long b() {
        return this.h;
    }

    @Override // defpackage.wi
    public final ub5 c() {
        return this.b;
    }

    @Override // defpackage.wi
    public final hj d(long j) {
        if (r7.a(this, j)) {
            return this.f;
        }
        return this.a.g(j, this.d, this.e);
    }

    @Override // defpackage.wi
    public final /* synthetic */ boolean e(long j) {
        return r7.a(this, j);
    }

    @Override // defpackage.wi
    public final Object f(long j) {
        if (r7.a(this, j)) {
            return this.g;
        }
        tm1 tm1Var = this.b.b;
        mc3 mc3Var = this.a;
        hj hjVar = (hj) mc3Var.b;
        hj hjVar2 = this.d;
        if (hjVar == null) {
            hjVar = hjVar2.c();
            mc3Var.b = hjVar;
        }
        int b = hjVar.b();
        int i = 0;
        while (true) {
            hj hjVar3 = (hj) mc3Var.b;
            if (i >= b) {
                if (hjVar3 != null) {
                    return tm1Var.invoke(hjVar3);
                }
                j42.g0("valueVector");
                throw null;
            }
            if (hjVar3 == null) {
                j42.g0("valueVector");
                throw null;
            }
            ep epVar = (ep) mc3Var.a;
            float a = hjVar2.a(i);
            long j2 = j / 1000000;
            if1 a2 = ((jf1) epVar.J).a(this.e.a(i));
            long j3 = a2.c;
            hjVar3.e((Math.signum(a2.a) * a2.b * xc.b(j3 > 0 ? j2 / j3 : 1.0f).a) + a, i);
            i++;
        }
    }

    @Override // defpackage.wi
    public final Object g() {
        return this.g;
    }
}
