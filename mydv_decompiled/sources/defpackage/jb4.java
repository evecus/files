package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jb4 extends k05 implements hn1 {
    public /* synthetic */ Object I;
    public final /* synthetic */ o24 J;
    public final /* synthetic */ float K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb4(o24 o24Var, float f, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = o24Var;
        this.K = f;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        jb4 jb4Var = new jb4(this.J, this.K, fj0Var);
        jb4Var.I = obj;
        return jb4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        jb4 jb4Var = (jb4) create((rb4) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        jb4Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        this.J.I = ((rb4) this.I).a(this.K);
        return wd5.a;
    }
}
