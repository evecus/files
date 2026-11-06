package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class s15 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ts3 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s15(ts3 ts3Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = ts3Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        ts3 ts3Var = this.J;
        switch (b) {
            case 0:
                return new s15(ts3Var, fj0Var, (byte) 0);
            case 1:
                return new s15(ts3Var, fj0Var, (byte) 1);
            case 2:
                return new s15(ts3Var, fj0Var, (byte) 2);
            case 3:
                return new s15(ts3Var, fj0Var, (byte) 3);
            case 4:
                return new s15(ts3Var, fj0Var, (byte) 4);
            case 5:
                return new s15(ts3Var, fj0Var, (byte) 5);
            case 6:
                return new s15(ts3Var, fj0Var, (byte) 6);
            default:
                return new s15(ts3Var, fj0Var, (byte) 7);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((s15) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((s15) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 2:
                ((s15) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 3:
                ((s15) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 4:
                ((s15) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 5:
                ((s15) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 6:
                ((s15) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((s15) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ts3 ts3Var = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                ts3Var.a();
                break;
            case 1:
                mu0.V(obj);
                ts3Var.b();
                break;
            case 2:
                mu0.V(obj);
                ts3Var.b();
                break;
            case 3:
                mu0.V(obj);
                ts3Var.a();
                break;
            case 4:
                mu0.V(obj);
                ts3Var.b();
                break;
            case 5:
                mu0.V(obj);
                ts3Var.b();
                break;
            case 6:
                mu0.V(obj);
                ts3Var.a();
                break;
            default:
                mu0.V(obj);
                ts3Var.b();
                break;
        }
        return wd5Var;
    }
}
