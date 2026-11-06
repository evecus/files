package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fq1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ gq1 L;
    public final /* synthetic */ Context M;
    public final /* synthetic */ int[] N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fq1(gq1 gq1Var, Context context, int[] iArr, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.L = gq1Var;
        this.M = context;
        this.N = iArr;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                fq1 fq1Var = new fq1(this.L, this.M, this.N, fj0Var, (byte) 0);
                fq1Var.K = obj;
                return fq1Var;
            default:
                fq1 fq1Var2 = new fq1(this.L, this.M, this.N, fj0Var, (byte) 1);
                fq1Var2.K = obj;
                return fq1Var2;
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
        return ((fq1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int[] iArr = this.N;
        Context context = this.M;
        gq1 gq1Var = this.L;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    dl0 dl0Var = (dl0) this.K;
                    this.J = true;
                    if (gq1Var.doDelete$glance_appwidget(dl0Var, context, iArr, this) == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    dl0 dl0Var2 = (dl0) this.K;
                    this.J = true;
                    if (gq1Var.doUpdate$glance_appwidget(dl0Var2, context, iArr, this) == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
        }
        return el0Var;
    }
}
