package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class y60 implements AutoCloseable, dl0 {
    public final tk0 I;

    public y60(tk0 tk0Var) {
        tk0Var.getClass();
        this.I = tk0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        vt0.j(this.I, null);
    }

    @Override // defpackage.dl0
    public final tk0 getCoroutineContext() {
        return this.I;
    }
}
