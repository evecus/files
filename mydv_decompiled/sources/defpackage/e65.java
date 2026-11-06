package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e65 implements kk3 {
    public final yp0 a;

    public e65(yp0 yp0Var) {
        this.a = yp0Var;
    }

    @Override // defpackage.l13
    public final boolean all(tm1 tm1Var) {
        return ((Boolean) tm1Var.invoke(this)).booleanValue();
    }

    public final yp0 c() {
        return this.a;
    }

    @Override // defpackage.l13
    public final Object foldIn(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(obj, this);
    }

    @Override // defpackage.l13
    public final /* synthetic */ l13 then(l13 l13Var) {
        return hf1.e(this, l13Var);
    }

    @Override // defpackage.kk3
    public final Object b() {
        return this;
    }
}
