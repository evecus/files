package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uv3 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv3(int i, fj0 fj0Var, byte b) {
        super(i, fj0Var);
        this.I = b;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                uv3 uv3Var = new uv3(2, fj0Var, (byte) 0);
                uv3Var.J = ((Boolean) obj).booleanValue();
                return uv3Var;
            case 1:
                uv3 uv3Var2 = new uv3(2, fj0Var, (byte) 1);
                uv3Var2.J = ((Boolean) obj).booleanValue();
                return uv3Var2;
            case 2:
                uv3 uv3Var3 = new uv3(2, fj0Var, (byte) 2);
                uv3Var3.J = ((Boolean) obj).booleanValue();
                return uv3Var3;
            case 3:
                uv3 uv3Var4 = new uv3(2, fj0Var, (byte) 3);
                uv3Var4.J = ((Boolean) obj).booleanValue();
                return uv3Var4;
            default:
                return new uv3(2, fj0Var, (byte) 4);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((uv3) create(bool, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((uv3) create(bool2, (fj0) obj2)).invokeSuspend(wd5Var);
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((uv3) create(bool3, (fj0) obj2)).invokeSuspend(wd5Var);
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((uv3) create(bool4, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((uv3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        switch (this.I) {
            case 0:
                boolean z = this.J;
                mu0.V(obj);
                return Boolean.valueOf(z);
            case 1:
                boolean z2 = this.J;
                mu0.V(obj);
                return Boolean.valueOf(z2);
            case 2:
                boolean z3 = this.J;
                mu0.V(obj);
                return Boolean.valueOf(z3);
            case 3:
                mu0.V(obj);
                return Boolean.valueOf(this.J);
            default:
                boolean z4 = this.J;
                if (!z4) {
                    mu0.V(obj);
                    this.J = true;
                    Object D = e21.D(this);
                    el0 el0Var = el0.I;
                    if (D == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z4) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5.a;
        }
    }
}
