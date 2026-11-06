package defpackage;

import com.github.mytv.dv.model.Author;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xv3 extends k05 implements hn1 {
    public String I;
    public boolean J;
    public final /* synthetic */ ow3 K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ ag2 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv3(ow3 ow3Var, boolean z, ag2 ag2Var, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = ow3Var;
        this.L = z;
        this.M = ag2Var;
        this.N = t43Var;
        this.O = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new xv3(this.K, this.L, this.M, this.N, this.O, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((xv3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String C;
        String str;
        boolean z = this.J;
        t43 t43Var = this.O;
        if (!z) {
            mu0.V(obj);
            String str2 = this.K.J;
            ml0 ml0Var = mw3.a;
            Author author = (Author) this.N.getValue();
            C = r7.C(str2, "|", author != null ? author.getUid() : null);
            if (!this.L && ((String) t43Var.getValue()) != null && !j42.c((String) t43Var.getValue(), C)) {
                this.I = C;
                this.J = true;
                Object j = ag2.j(this.M, 0, this);
                el0 el0Var = el0.I;
                if (j == el0Var) {
                    return el0Var;
                }
                str = C;
            }
            ml0 ml0Var2 = mw3.a;
            t43Var.setValue(C);
            return wd5.a;
        }
        if (!z) {
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = this.I;
        mu0.V(obj);
        C = str;
        ml0 ml0Var22 = mw3.a;
        t43Var.setValue(C);
        return wd5.a;
    }
}
