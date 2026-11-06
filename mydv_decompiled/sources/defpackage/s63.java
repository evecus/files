package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s63 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ s63(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.K;
        Object obj4 = this.J;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    go1 go1Var = (go1) fe0Var;
                    if (go1Var.F()) {
                        go1Var.W();
                        break;
                    }
                }
                rt0.f((g94) obj4, (tc0) obj3, fe0Var, 0);
                break;
            default:
                fe0 fe0Var2 = (fe0) obj;
                p63 p63Var = (p63) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    go1 go1Var2 = (go1) fe0Var2;
                    if (go1Var2.F()) {
                        go1Var2.W();
                        break;
                    }
                }
                i73 i73Var = p63Var.J;
                i73Var.getClass();
                ((id0) i73Var).N.c((th) obj3, p63Var, fe0Var2, 0);
                break;
        }
        return wd5Var;
    }
}
