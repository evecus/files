package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w02 extends js2 {
    public w02(x02 x02Var) {
        super(x02Var);
    }

    @Override // defpackage.a42
    public final int Q(int i) {
        g12 u = this.c0.c0.u();
        uw2 t = u.t();
        wa2 wa2Var = (wa2) u.J;
        return t.minIntrinsicHeight(wa2Var.n0.d, wa2Var.m(), i);
    }

    @Override // defpackage.a42
    public final int b(int i) {
        g12 u = this.c0.c0.u();
        uw2 t = u.t();
        wa2 wa2Var = (wa2) u.J;
        return t.maxIntrinsicHeight(wa2Var.n0.d, wa2Var.m(), i);
    }

    @Override // defpackage.hs2
    public final int k0(v8 v8Var) {
        ns2 ns2Var = this.c0.c0.o0.q;
        ns2Var.getClass();
        ds2 ds2Var = ns2Var.Z;
        if (!ns2Var.S) {
            ab2 ab2Var = ns2Var.N;
            if (ab2Var.d == sa2.J) {
                ds2Var.f = true;
                if (ds2Var.b) {
                    ab2Var.f = true;
                    ab2Var.g = true;
                }
            } else {
                ds2Var.g = true;
            }
        }
        w02 w02Var = ns2Var.f().K0;
        Boolean valueOf = w02Var != null ? Boolean.valueOf(w02Var.W) : null;
        w02 w02Var2 = ns2Var.f().K0;
        if (w02Var2 != null) {
            w02Var2.W = true;
        }
        ns2Var.E();
        w02 w02Var3 = ns2Var.f().K0;
        if (w02Var3 != null) {
            w02Var3.W = valueOf != null ? valueOf.booleanValue() : false;
        }
        Integer num = (Integer) ds2Var.i.get(v8Var);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.h0.g(v8Var, intValue);
        return intValue;
    }

    @Override // defpackage.a42
    public final int p(int i) {
        g12 u = this.c0.c0.u();
        uw2 t = u.t();
        wa2 wa2Var = (wa2) u.J;
        return t.minIntrinsicWidth(wa2Var.n0.d, wa2Var.m(), i);
    }

    @Override // defpackage.a42
    public final int t(int i) {
        g12 u = this.c0.c0.u();
        uw2 t = u.t();
        wa2 wa2Var = (wa2) u.J;
        return t.maxIntrinsicWidth(wa2Var.n0.d, wa2Var.m(), i);
    }

    @Override // defpackage.pw2
    public final bn3 u(long j) {
        g0(j);
        na3 na3Var = this.c0;
        b53 A = na3Var.c0.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            ns2 ns2Var = ((wa2) objArr[i2]).o0.q;
            ns2Var.getClass();
            ns2Var.R = ua2.K;
        }
        wa2 wa2Var = na3Var.c0;
        C0(wa2Var.e0.mo35measure3p2s80s(this, wa2Var.m(), j));
        return this;
    }

    @Override // defpackage.js2
    public final void z0() {
        ns2 ns2Var = this.c0.c0.o0.q;
        ns2Var.getClass();
        ns2Var.z0();
    }
}
