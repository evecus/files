package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w65 implements v65 {
    public final rq3 I;
    public final ThreadLocal J;
    public final y65 K;

    public w65(rq3 rq3Var, ThreadLocal threadLocal) {
        this.I = rq3Var;
        this.J = threadLocal;
        this.K = new y65(threadLocal);
    }

    @Override // defpackage.v65
    public final Object F() {
        ThreadLocal threadLocal = this.J;
        Object obj = threadLocal.get();
        threadLocal.set(this.I);
        return obj;
    }

    @Override // defpackage.v65
    public final void O(Object obj) {
        this.J.set(obj);
    }

    @Override // defpackage.tk0
    public final Object fold(Object obj, hn1 hn1Var) {
        return p70.Q(this, obj, hn1Var);
    }

    @Override // defpackage.tk0
    public final rk0 get(sk0 sk0Var) {
        if (this.K.equals(sk0Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.rk0
    public final sk0 getKey() {
        return this.K;
    }

    @Override // defpackage.tk0
    public final tk0 minusKey(sk0 sk0Var) {
        return this.K.equals(sk0Var) ? l91.I : this;
    }

    @Override // defpackage.tk0
    public final tk0 plus(tk0 tk0Var) {
        return p70.p0(this, tk0Var);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.I + ", threadLocal = " + this.J + ')';
    }
}
