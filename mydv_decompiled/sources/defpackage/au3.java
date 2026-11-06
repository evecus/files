package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class au3 implements t43, dl0 {
    public final /* synthetic */ t43 I;
    public final tk0 J;

    public au3(t43 t43Var, tk0 tk0Var) {
        this.I = t43Var;
        this.J = tk0Var;
    }

    @Override // defpackage.dl0
    public final tk0 getCoroutineContext() {
        return this.J;
    }

    @Override // defpackage.cw4
    public final Object getValue() {
        return this.I.getValue();
    }

    @Override // defpackage.t43
    public final void setValue(Object obj) {
        this.I.setValue(obj);
    }
}
