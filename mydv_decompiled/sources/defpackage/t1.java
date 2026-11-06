package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class t1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ u1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(u1 u1Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = u1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        u1 u1Var = this.J;
        switch (b) {
            case 0:
                return new t1(u1Var, fj0Var, (byte) 0);
            default:
                return new t1(u1Var, fj0Var, (byte) 1);
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
                ((t1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((t1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        fj0 fj0Var = null;
        u1 u1Var = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                if (u1Var.W == null) {
                    mv1 mv1Var = new mv1();
                    t33 t33Var = u1Var.K;
                    if (t33Var != null) {
                        p70.g0(u1Var.getCoroutineScope(), null, null, new r((Object) t33Var, (Object) mv1Var, fj0Var, (byte) 1), 3);
                    }
                    u1Var.W = mv1Var;
                    break;
                }
                break;
            default:
                mu0.V(obj);
                mv1 mv1Var2 = u1Var.W;
                if (mv1Var2 != null) {
                    nv1 nv1Var = new nv1(mv1Var2);
                    t33 t33Var2 = u1Var.K;
                    if (t33Var2 != null) {
                        p70.g0(u1Var.getCoroutineScope(), null, null, new r((Object) t33Var2, (Object) nv1Var, fj0Var, (byte) 2), 3);
                    }
                    u1Var.W = null;
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
