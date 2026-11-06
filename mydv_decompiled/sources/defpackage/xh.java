package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xh extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ zh K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh(zh zhVar, byte b) {
        super(1);
        this.J = b;
        this.K = zhVar;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.J;
        wd5 wd5Var = wd5.a;
        zh zhVar = this.K;
        switch (b) {
            case 0:
                bn3 bn3Var = zhVar.M;
                bn3Var.getClass();
                an3.h((an3) obj, bn3Var, zhVar.K.b.a((bn3Var.I << 32) | (4294967295L & bn3Var.J), zhVar.O, da2.I));
                break;
            default:
                bn3 bn3Var2 = zhVar.L;
                bn3Var2.getClass();
                an3.h((an3) obj, bn3Var2, zhVar.K.b.a((bn3Var2.I << 32) | (4294967295L & bn3Var2.J), zhVar.N, da2.I));
                break;
        }
        return wd5Var;
    }
}
