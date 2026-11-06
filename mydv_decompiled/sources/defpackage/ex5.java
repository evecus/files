package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ex5 extends k05 implements in1 {
    public boolean I;
    public /* synthetic */ ag1 J;
    public /* synthetic */ Object[] K;

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ex5 ex5Var = new ex5(3, (fj0) obj3);
        ex5Var.J = (ag1) obj;
        ex5Var.K = (Object[]) obj2;
        return ex5Var.invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        hh0 hh0Var;
        boolean z = this.I;
        hh0 hh0Var2 = null;
        if (!z) {
            mu0.V(obj);
            ag1 ag1Var = this.J;
            hh0[] hh0VarArr = (hh0[]) this.K;
            int length = hh0VarArr.length;
            int i = 0;
            while (true) {
                hh0Var = fh0.a;
                if (i >= length) {
                    break;
                }
                hh0 hh0Var3 = hh0VarArr[i];
                if (!j42.c(hh0Var3, hh0Var)) {
                    hh0Var2 = hh0Var3;
                    break;
                }
                i++;
            }
            if (hh0Var2 != null) {
                hh0Var = hh0Var2;
            }
            this.I = true;
            Object emit = ag1Var.emit(hh0Var, this);
            el0 el0Var = el0.I;
            if (emit == el0Var) {
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
