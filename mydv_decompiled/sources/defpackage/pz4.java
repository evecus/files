package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pz4 implements zf0 {
    public final g73 I;

    public pz4(g73 g73Var) {
        this.I = g73Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((sz4) this.I.J).close();
    }

    @Override // defpackage.zf0
    public final Object o(boolean z, hn1 hn1Var, gj0 gj0Var) {
        sz4 sz4Var = (sz4) this.I.J;
        sz4Var.getClass();
        return hn1Var.invoke(new uz4(new oz4(sz4Var.getWritableDatabase())), gj0Var);
    }
}
