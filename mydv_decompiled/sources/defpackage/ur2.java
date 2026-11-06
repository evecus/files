package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ur2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ s35 J;

    public /* synthetic */ ur2(s35 s35Var, byte b) {
        this.I = b;
        this.J = s35Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        s35 s35Var = this.J;
        switch (b) {
            case 0:
                s35Var.a(((pd3) obj).a, n84.S);
                break;
            case 1:
                rp3 rp3Var = (rp3) obj;
                s35Var.e(dq2.t0(rp3Var, false));
                rp3Var.a();
                break;
            default:
                rp3 rp3Var2 = (rp3) obj;
                s35Var.e(dq2.t0(rp3Var2, false));
                rp3Var2.a();
                break;
        }
        return wd5Var;
    }
}
