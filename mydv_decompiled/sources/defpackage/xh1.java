package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xh1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ t33 K;
    public final /* synthetic */ t43 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh1(t33 t33Var, t43 t43Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = t33Var;
        this.L = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new xh1(this.K, this.L, fj0Var, (byte) 0);
            default:
                return new xh1(this.K, this.L, fj0Var, (byte) 1);
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
        return ((xh1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        t43 t43Var = this.L;
        t33 t33Var = this.K;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    ArrayList arrayList = new ArrayList();
                    mn4 mn4Var = t33Var.a;
                    wh1 wh1Var = new wh1(arrayList, t43Var, (byte) 0);
                    this.J = true;
                    mn4.j(mn4Var, wh1Var, this);
                    break;
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    ArrayList arrayList2 = new ArrayList();
                    mn4 mn4Var2 = t33Var.a;
                    wh1 wh1Var2 = new wh1(arrayList2, t43Var, (byte) 1);
                    this.J = true;
                    mn4.j(mn4Var2, wh1Var2, this);
                    break;
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
        }
        return el0Var;
    }
}
