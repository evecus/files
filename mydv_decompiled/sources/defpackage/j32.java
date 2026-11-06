package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j32 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ k32 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j32(k32 k32Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = k32Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new j32(this.K, fj0Var, (byte) 0);
            default:
                return new j32(this.K, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((j32) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        fj0 fj0Var = null;
        switch (this.I) {
            case 0:
                el0 el0Var = el0.I;
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    this.K.b();
                    k32 k32Var = this.K;
                    this.J = true;
                    k10 k10Var = new k10(1, mu0.G(this));
                    k10Var.t();
                    synchronized (k32Var.L) {
                        k32Var.M = (byte) 20;
                        k32Var.O = k10Var;
                    }
                    k10Var.v(new oe(k32Var, (byte) 3));
                    if (k10Var.r() == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
            default:
                el0 el0Var2 = el0.I;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    k32 k32Var2 = this.K;
                    this.J = true;
                    k32Var2.getClass();
                    if (qi4.n(5000L, new j32(k32Var2, fj0Var, (byte) 0), this) == el0Var2) {
                        return el0Var2;
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
        }
    }
}
