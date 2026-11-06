package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class n34 implements dl0, k34 {
    public static final n10 L = new n10(0);
    public final tk0 I;
    public final n34 J = this;
    public volatile tk0 K;

    public n34(tk0 tk0Var) {
        this.I = tk0Var;
    }

    public final void a() {
        synchronized (this.J) {
            try {
                tk0 tk0Var = this.K;
                if (tk0Var == null) {
                    this.K = L;
                } else {
                    vt0.j(tk0Var, new zk1((byte) 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dl0
    public final tk0 getCoroutineContext() {
        tk0 tk0Var;
        tk0 tk0Var2 = this.K;
        if (tk0Var2 == null || tk0Var2 == L) {
            ue0 ue0Var = (ue0) this.I.get(ue0.J);
            tk0 m34Var = ue0Var != null ? new m34(ue0Var, this) : l91.I;
            synchronized (this.J) {
                try {
                    tk0 tk0Var3 = this.K;
                    if (tk0Var3 == null) {
                        tk0 tk0Var4 = this.I;
                        tk0Var = tk0Var4.plus(new x52((v52) tk0Var4.get(q8.r0))).plus(l91.I).plus(m34Var);
                    } else if (tk0Var3 == L) {
                        tk0 tk0Var5 = this.I;
                        x52 x52Var = new x52((v52) tk0Var5.get(q8.r0));
                        x52Var.r(new zk1((byte) 0));
                        tk0Var = tk0Var5.plus(x52Var).plus(l91.I).plus(m34Var);
                    } else {
                        tk0Var = tk0Var3;
                    }
                    this.K = tk0Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            tk0Var2 = tk0Var;
        }
        tk0Var2.getClass();
        return tk0Var2;
    }

    @Override // defpackage.k34
    public final void onAbandoned() {
        a();
    }

    @Override // defpackage.k34
    public final void onForgotten() {
        a();
    }

    @Override // defpackage.k34
    public final void onRemembered() {
    }
}
