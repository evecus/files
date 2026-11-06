package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v92 implements k34, xk0 {
    public final tk0 I;
    public final hn1 J;
    public final dj0 K;
    public rv4 L;

    public v92(tk0 tk0Var, hn1 hn1Var) {
        this.I = tk0Var;
        this.J = hn1Var;
        this.K = i42.H(tk0Var.plus(this));
    }

    @Override // defpackage.tk0
    public final Object fold(Object obj, hn1 hn1Var) {
        return p70.Q(this, obj, hn1Var);
    }

    @Override // defpackage.tk0
    public final rk0 get(sk0 sk0Var) {
        return p70.R(this, sk0Var);
    }

    @Override // defpackage.rk0
    public final sk0 getKey() {
        return wk0.I;
    }

    @Override // defpackage.xk0
    public final void handleException(tk0 tk0Var, Throwable th) {
        ue0 ue0Var = (ue0) tk0Var.get(ue0.J);
        if (ue0Var != null) {
            c5.m0(th, new ka(ue0Var, this, (byte) 12));
        }
        xk0 xk0Var = (xk0) this.I.get(wk0.I);
        if (xk0Var == null) {
            throw th;
        }
        xk0Var.handleException(tk0Var, th);
    }

    @Override // defpackage.tk0
    public final tk0 minusKey(sk0 sk0Var) {
        return p70.m0(this, sk0Var);
    }

    @Override // defpackage.k34
    public final void onAbandoned() {
        rv4 rv4Var = this.L;
        if (rv4Var != null) {
            rv4Var.r(new zk1((byte) 1));
        }
        this.L = null;
    }

    @Override // defpackage.k34
    public final void onForgotten() {
        rv4 rv4Var = this.L;
        if (rv4Var != null) {
            rv4Var.r(new zk1((byte) 1));
        }
        this.L = null;
    }

    @Override // defpackage.k34
    public final void onRemembered() {
        rv4 rv4Var = this.L;
        if (rv4Var != null) {
            rv4Var.e(e41.a("Old job was still running!", null));
        }
        this.L = p70.g0(this.K, null, null, this.J, 3);
    }

    @Override // defpackage.tk0
    public final tk0 plus(tk0 tk0Var) {
        return p70.p0(this, tk0Var);
    }
}
