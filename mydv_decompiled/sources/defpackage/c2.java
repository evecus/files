package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class c2 extends e62 implements fj0, dl0 {
    public final tk0 L;

    public c2(tk0 tk0Var, boolean z) {
        super(z);
        K((v52) tk0Var.get(q8.r0));
        this.L = tk0Var.plus(this);
    }

    @Override // defpackage.e62
    public final void J(vb0 vb0Var) {
        o7.C(this.L, vb0Var);
    }

    @Override // defpackage.e62
    public String U() {
        return super.U();
    }

    @Override // defpackage.e62
    public final void Y(Object obj) {
        if (!(obj instanceof ub0)) {
            g0(obj);
        } else {
            ub0 ub0Var = (ub0) obj;
            f0(ub0Var.a, gq.a.getIntVolatile(ub0Var, ub0.b) == 1);
        }
    }

    @Override // defpackage.fj0
    public final tk0 getContext() {
        return this.L;
    }

    @Override // defpackage.dl0
    public final tk0 getCoroutineContext() {
        return this.L;
    }

    public final void h0(gl0 gl0Var, c2 c2Var, hn1 hn1Var) {
        Object invoke;
        int ordinal = gl0Var.ordinal();
        wd5 wd5Var = wd5.a;
        if (ordinal == 0) {
            try {
                qb.c0(mu0.G(mu0.n(c2Var, this, hn1Var)), wd5Var);
                return;
            } finally {
                th = th;
                if (th instanceof mx0) {
                    th = ((mx0) th).I;
                }
                resumeWith(new g54(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                hn1Var.getClass();
                mu0.G(mu0.n(c2Var, this, hn1Var)).resumeWith(wd5Var);
                return;
            }
            if (ordinal != 3) {
                s83.v();
                return;
            }
            try {
                tk0 tk0Var = this.L;
                Object l0 = j42.l0(tk0Var, null);
                try {
                    if (hn1Var instanceof fu) {
                        p70.A(2, hn1Var);
                        invoke = hn1Var.invoke(c2Var, this);
                    } else {
                        invoke = mu0.Y(hn1Var, c2Var, this);
                    }
                    j42.Y(tk0Var, l0);
                    if (invoke != el0.I) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    j42.Y(tk0Var, l0);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.fj0
    public final void resumeWith(Object obj) {
        Throwable a = h54.a(obj);
        if (a != null) {
            obj = new ub0(a, false);
        }
        Object T = T(obj);
        if (T == p70.r) {
            return;
        }
        o(T);
    }

    @Override // defpackage.e62
    public final String u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void g0(Object obj) {
    }

    public void f0(Throwable th, boolean z) {
    }
}
