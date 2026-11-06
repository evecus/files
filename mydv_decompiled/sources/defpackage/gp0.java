package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gp0 extends k05 implements tm1 {
    public boolean I;

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        return new gp0(1, fj0Var);
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        gp0 gp0Var = (gp0) create((fj0) obj);
        wd5 wd5Var = wd5.a;
        gp0Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            this.I = true;
            throw null;
        }
        if (z) {
            mu0.V(obj);
            return wd5.a;
        }
        zy.i("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
