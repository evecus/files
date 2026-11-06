package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p45 extends k05 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ u45 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p45(u45 u45Var, fj0 fj0Var, byte b) {
        super(1, fj0Var);
        this.I = b;
        this.J = u45Var;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        byte b = this.I;
        u45 u45Var = this.J;
        switch (b) {
            case 0:
                return new p45(u45Var, fj0Var, (byte) 0);
            case 1:
                return new p45(u45Var, fj0Var, (byte) 1);
            case 2:
                return new p45(u45Var, fj0Var, (byte) 2);
            default:
                return new p45(u45Var, fj0Var, (byte) 3);
        }
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        fj0 fj0Var = (fj0) obj;
        switch (b) {
            case 0:
                ((p45) create(fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((p45) create(fj0Var)).invokeSuspend(wd5Var);
                break;
            case 2:
                ((p45) create(fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((p45) create(fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        u45 u45Var = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                u45Var.A = false;
                break;
            case 1:
                mu0.V(obj);
                u45Var.c();
                break;
            case 2:
                mu0.V(obj);
                u45Var.a(u45Var.A);
                break;
            default:
                mu0.V(obj);
                u45Var.o();
                break;
        }
        return wd5Var;
    }
}
