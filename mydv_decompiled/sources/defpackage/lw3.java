package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lw3 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public /* synthetic */ Object J;
    public final /* synthetic */ int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lw3(int i, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = i;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                lw3 lw3Var = new lw3(this.K, fj0Var, (byte) 0);
                lw3Var.J = obj;
                return lw3Var;
            default:
                lw3 lw3Var2 = new lw3(this.K, fj0Var, (byte) 1);
                lw3Var2.J = obj;
                return lw3Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        List list = (List) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((lw3) create(list, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        int i = this.K;
        List list = (List) this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                return Boolean.valueOf(list.size() > i);
            default:
                mu0.V(obj);
                return Boolean.valueOf(list.size() > i);
        }
    }
}
