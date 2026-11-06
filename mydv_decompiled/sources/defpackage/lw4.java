package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class lw4 implements kw4 {
    public final xq I = new xq(0);

    @Override // defpackage.kw4
    public /* synthetic */ mw4 d(mw4 mw4Var, mw4 mw4Var2, mw4 mw4Var3) {
        return null;
    }

    public final boolean f(int i) {
        return (this.I.get() & i) != 0;
    }

    public final void g(int i) {
        xq xqVar;
        int i2;
        do {
            xqVar = this.I;
            i2 = xqVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!xqVar.compareAndSet(i2, i2 | i));
    }
}
