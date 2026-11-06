package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class od0 extends k05 implements hn1 {
    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new od0(2, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        od0 od0Var = (od0) create((zf1) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        od0Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        return wd5.a;
    }
}
