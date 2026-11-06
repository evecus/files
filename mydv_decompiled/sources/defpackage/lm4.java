package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lm4 implements tm1 {
    public final /* synthetic */ bl4 I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ s33 L;

    public lm4(bl4 bl4Var, t43 t43Var, t43 t43Var2, s33 s33Var) {
        this.I = bl4Var;
        this.J = t43Var;
        this.K = t43Var2;
        this.L = s33Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        oi1 oi1Var = (oi1) obj;
        oi1Var.getClass();
        boolean b = oi1Var.b();
        i51 i51Var = qm4.a;
        this.J.setValue(Boolean.valueOf(b));
        if (oi1Var.b()) {
            this.K.setValue(this.I);
            gk3 gk3Var = (gk3) this.L;
            gk3Var.i(gk3Var.h() + 1);
        }
        return wd5.a;
    }
}
