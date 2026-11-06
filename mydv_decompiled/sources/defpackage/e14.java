package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class e14 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e14(int i, fj0 fj0Var, byte b) {
        super(i, fj0Var);
        this.I = b;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                e14 e14Var = new e14(2, fj0Var, (byte) 0);
                e14Var.J = obj;
                return e14Var;
            default:
                e14 e14Var2 = new e14(2, fj0Var, (byte) 1);
                e14Var2.J = obj;
                return e14Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((e14) create((d14) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((e14) create((qn4) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        switch (this.I) {
            case 0:
                mu0.V(obj);
                return Boolean.valueOf(((d14) this.J) == d14.I);
            default:
                qn4 qn4Var = (qn4) this.J;
                mu0.V(obj);
                return Boolean.valueOf(qn4Var != qn4.I);
        }
    }
}
