package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yx2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ float J;
    public final /* synthetic */ tm1 K;
    public final /* synthetic */ float L;
    public final /* synthetic */ z60 M;

    public /* synthetic */ yx2(float f, tm1 tm1Var, float f2, z60 z60Var, byte b) {
        this.I = b;
        this.J = f;
        this.K = tm1Var;
        this.L = f2;
        this.M = z60Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        z60 z60Var = this.M;
        float f = this.L;
        tm1 tm1Var = this.K;
        float f2 = this.J;
        switch (b) {
            case 0:
                lq2.i(tm1Var, f, z60Var, -f2);
                break;
            case 1:
                lq2.i(tm1Var, f, z60Var, f2);
                break;
            case 2:
                lq2.i(tm1Var, f, z60Var, -f2);
                break;
            case 3:
                lq2.i(tm1Var, f, z60Var, f2);
                break;
            case 4:
                qm4.q(tm1Var, f, z60Var, -f2);
                break;
            case 5:
                qm4.q(tm1Var, f, z60Var, f2);
                break;
            case 6:
                qm4.q(tm1Var, f, z60Var, -f2);
                break;
            default:
                qm4.q(tm1Var, f, z60Var, f2);
                break;
        }
        return wd5Var;
    }
}
