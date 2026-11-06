package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pp1 extends k05 implements jn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public /* synthetic */ vo K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pp1(Object obj, fj0 fj0Var, byte b) {
        super(4, fj0Var);
        this.I = b;
        this.L = obj;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj5 = this.L;
        vo voVar = (vo) obj2;
        ((Boolean) obj3).getClass();
        fj0 fj0Var = (fj0) obj4;
        switch (b) {
            case 0:
                pp1 pp1Var = new pp1((Bundle) obj5, fj0Var, (byte) 0);
                pp1Var.K = voVar;
                return pp1Var.invokeSuspend(wd5Var);
            default:
                pp1 pp1Var2 = new pp1((String) obj5, fj0Var, (byte) 1);
                pp1Var2.K = voVar;
                return pp1Var2.invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        Object obj2 = this.L;
        el0 el0Var = el0.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    vo voVar = this.K;
                    this.J = true;
                    voVar.getClass();
                    Object e = voVar.e(new oo((Bundle) obj2), this);
                    if (e != el0Var) {
                        e = wd5Var;
                    }
                    if (e == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5Var;
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    vo voVar2 = this.K;
                    this.J = true;
                    voVar2.getClass();
                    Object e2 = voVar2.e(new no((String) obj2), this);
                    if (e2 != el0Var) {
                        e2 = wd5Var;
                    }
                    if (e2 == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5Var;
        }
    }
}
