package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ba5 implements cw4 {
    public final ub5 I;
    public final jk3 J;
    public final jk3 K;
    public final jk3 L;
    public ch4 M;
    public a25 N;
    public final jk3 O;
    public final fk3 P;
    public boolean Q;
    public final jk3 R;
    public hj S;
    public final hk3 T;
    public boolean U;
    public final ku4 V;
    public final /* synthetic */ ea5 W;

    public ba5(ea5 ea5Var, Object obj, hj hjVar, ub5 ub5Var) {
        this.W = ea5Var;
        this.I = ub5Var;
        jk3 w = ad4.w(obj);
        this.J = w;
        Object obj2 = null;
        this.K = ad4.w(qb.g0(0.0f, 0.0f, null, 7));
        this.L = ad4.w(new a25(d(), ub5Var, obj, w.getValue(), hjVar));
        this.O = ad4.w(Boolean.TRUE);
        this.P = new fk3(-1.0f);
        this.R = ad4.w(obj);
        this.S = hjVar;
        this.T = new hk3(c().b());
        Float f = (Float) js5.a.get(ub5Var);
        if (f != null) {
            float floatValue = f.floatValue();
            hj hjVar2 = (hj) ub5Var.a.invoke(obj);
            int b = hjVar2.b();
            for (int i = 0; i < b; i++) {
                hjVar2.e(floatValue, i);
            }
            obj2 = this.I.b.invoke(hjVar2);
        }
        this.V = qb.g0(0.0f, 0.0f, obj2, 3);
    }

    public final a25 c() {
        return (a25) this.L.getValue();
    }

    public final ve1 d() {
        return (ve1) this.K.getValue();
    }

    public final void e(long j) {
        if (this.P.h() == -1.0f) {
            this.U = true;
            if (j42.c(c().c, c().d)) {
                f(c().c);
            } else {
                f(c().f(j));
                this.S = c().d(j);
            }
        }
    }

    public final void f(Object obj) {
        this.R.setValue(obj);
    }

    public final void g(Object obj, boolean z) {
        a25 a25Var = this.N;
        Object obj2 = a25Var != null ? a25Var.c : null;
        jk3 jk3Var = this.J;
        boolean c = j42.c(obj2, jk3Var.getValue());
        hk3 hk3Var = this.T;
        jk3 jk3Var2 = this.L;
        if (c) {
            jk3Var2.setValue(new a25(this.V, this.I, obj, obj, this.S.c()));
            this.Q = true;
            hk3Var.i(c().b());
            return;
        }
        ve1 d = (!z || this.U) ? d() : d() instanceof ku4 ? d() : this.V;
        ea5 ea5Var = this.W;
        jk3Var2.setValue(new a25(ea5Var.f() <= 0 ? d : new uv4(d, ea5Var.f()), this.I, obj, jk3Var.getValue(), this.S));
        hk3Var.i(c().b());
        this.Q = false;
        ea5Var.q(true);
        if (ea5Var.i()) {
            gt4 gt4Var = ea5Var.j;
            int size = gt4Var.size();
            for (int i = 0; i < size; i++) {
                ba5 ba5Var = (ba5) gt4Var.get(i);
                ba5Var.T.h();
                ba5Var.e(0L);
            }
            ea5Var.q(false);
        }
    }

    @Override // defpackage.cw4
    public final Object getValue() {
        return this.R.getValue();
    }

    public final void h(Object obj, Object obj2, ve1 ve1Var) {
        this.J.setValue(obj2);
        this.K.setValue(ve1Var);
        if (j42.c(c().d, obj) && j42.c(c().c, obj2)) {
            return;
        }
        g(obj, false);
    }

    public final void i(Object obj, ve1 ve1Var, Object obj2, hj hjVar) {
        if (this.Q) {
            a25 a25Var = this.N;
            if (j42.c(obj, a25Var != null ? a25Var.c : null)) {
                return;
            }
        }
        jk3 jk3Var = this.J;
        boolean c = j42.c(jk3Var.getValue(), obj);
        fk3 fk3Var = this.P;
        if (c && fk3Var.h() == -1.0f && (obj2 == null || obj2.equals(c().d))) {
            return;
        }
        jk3Var.setValue(obj);
        this.K.setValue(ve1Var);
        Object value = obj2 == null ? fk3Var.h() == -3.0f ? obj : this.R.getValue() : obj2;
        if (obj2 != null) {
            f(value);
            if (hjVar != null) {
                this.S = hjVar;
            }
        }
        jk3 jk3Var2 = this.O;
        g(value, !((Boolean) jk3Var2.getValue()).booleanValue());
        jk3Var2.setValue(Boolean.valueOf(fk3Var.h() == -3.0f));
        if (fk3Var.h() >= 0.0f) {
            f(c().f((long) (fk3Var.h() * c().b())));
        } else if (fk3Var.h() == -3.0f) {
            f(obj);
        }
        this.Q = false;
        fk3Var.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.R.getValue() + ", target: " + this.J.getValue() + ", spec: " + d();
    }
}
