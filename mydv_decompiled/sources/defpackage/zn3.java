package defpackage;

import android.view.textclassifier.TextClassifier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zn3 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ co3 K;
    public final /* synthetic */ CharSequence L;
    public final /* synthetic */ long M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn3(long j, fj0 fj0Var, co3 co3Var, CharSequence charSequence) {
        super(2, fj0Var);
        this.K = co3Var;
        this.L = charSequence;
        this.M = j;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        zn3 zn3Var = new zn3(this.M, fj0Var, this.K, this.L);
        zn3Var.J = obj;
        return zn3Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((zn3) create(hn3.c(obj), (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            TextClassifier c = hn3.c(this.J);
            this.I = true;
            Object b = this.K.b(this.L, this.M, c, this);
            el0 el0Var = el0.I;
            if (b == el0Var) {
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
    }
}
