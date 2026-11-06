package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hj3 implements i34 {
    public final /* synthetic */ jj3 a;

    public hj3(jj3 jj3Var) {
        this.a = jj3Var;
    }

    @Override // defpackage.i34
    public final void a(wa2 wa2Var) {
        this.a.y.setValue(wa2Var);
    }

    @Override // defpackage.l13
    public final boolean all(tm1 tm1Var) {
        return ((Boolean) tm1Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.l13
    public final Object foldIn(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(obj, this);
    }

    @Override // defpackage.l13
    public final /* synthetic */ l13 then(l13 l13Var) {
        return hf1.e(this, l13Var);
    }
}
