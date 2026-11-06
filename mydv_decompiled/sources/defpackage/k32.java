package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k32 implements s13 {
    public final dl0 I;
    public final u7 J;
    public final ty K;
    public final Object L;
    public byte M;
    public long N;
    public k10 O;

    public k32(a85 a85Var) {
        u7 u7Var = new u7((byte) 28);
        this.I = a85Var;
        this.J = u7Var;
        this.K = new ty(new ce(this, (byte) 21));
        this.L = new Object();
        this.M = (byte) 5;
    }

    @Override // defpackage.s13
    public final Object E(tm1 tm1Var, fj0 fj0Var) {
        return this.K.E(tm1Var, fj0Var);
    }

    public final void a(long j) {
        this.K.J.c(new qy(j));
        synchronized (this.L) {
            this.N = j;
        }
    }

    public final void b() {
        synchronized (this.L) {
            k10 k10Var = this.O;
            if (k10Var != null) {
                k10Var.j(null);
            }
        }
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
        return q8.s0;
    }

    @Override // defpackage.tk0
    public final tk0 minusKey(sk0 sk0Var) {
        return p70.m0(this, sk0Var);
    }

    @Override // defpackage.tk0
    public final tk0 plus(tk0 tk0Var) {
        return p70.p0(this, tk0Var);
    }
}
