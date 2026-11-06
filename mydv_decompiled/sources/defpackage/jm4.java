package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jm4 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ t43 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jm4(t43 t43Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                jm4 jm4Var = new jm4(this.L, fj0Var, (byte) 0);
                jm4Var.K = obj;
                return jm4Var;
            default:
                jm4 jm4Var2 = new jm4(this.L, fj0Var, (byte) 1);
                jm4Var2.K = obj;
                return jm4Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((jm4) create((zf1) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((jm4) create((String) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.L;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                zf1 zf1Var = (zf1) this.K;
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    w73 w73Var = w73.M;
                    this.K = null;
                    this.J = true;
                    if (zf1Var.collect(w73Var, this) == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                i51 i51Var = qm4.a;
                t43Var.setValue(Boolean.TRUE);
                break;
            default:
                String str = (String) this.K;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    if (str != null) {
                        this.K = null;
                        this.J = true;
                        if (rt0.n(800L, this) == el0Var) {
                            break;
                        }
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                ta1 ta1Var = on5.a;
                t43Var.setValue(null);
                break;
        }
        return wd5Var;
    }
}
