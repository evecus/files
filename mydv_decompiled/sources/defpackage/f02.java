package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f02 extends k05 implements hn1 {
    public /* synthetic */ float I;

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        f02 f02Var = new f02(2, fj0Var);
        f02Var.I = ((Number) obj).floatValue();
        return f02Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((f02) create(Float.valueOf(((Number) obj).floatValue()), (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        return Boolean.valueOf(this.I > 0.0f);
    }
}
