package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wg1 extends k05 implements hn1 {
    public /* synthetic */ int I;

    public wg1() {
        super(2, null);
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        wg1 wg1Var = new wg1(2, fj0Var);
        wg1Var.I = ((Number) obj).intValue();
        return wg1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((wg1) create(Integer.valueOf(((Number) obj).intValue()), (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        int i = this.I;
        mu0.V(obj);
        return Boolean.valueOf(i > 0);
    }
}
