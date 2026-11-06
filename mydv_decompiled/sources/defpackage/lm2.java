package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lm2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ op2 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ String L;
    public final /* synthetic */ it4 M;
    public final /* synthetic */ ag2 N;

    public /* synthetic */ lm2(op2 op2Var, int i, String str, it4 it4Var, ag2 ag2Var, byte b) {
        this.I = b;
        this.J = op2Var;
        this.K = i;
        this.L = str;
        this.M = it4Var;
        this.N = ag2Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.K;
        op2 op2Var = this.J;
        ag2 ag2Var = this.N;
        it4 it4Var = this.M;
        String str = this.L;
        switch (b) {
            case 0:
                if (str != null) {
                    it4Var.put(str, new uj3(Integer.valueOf(((gk3) ag2Var.e.b).h()), Integer.valueOf(((gk3) ag2Var.e.c).h())));
                }
                op2Var.C(i);
                break;
            default:
                if (str != null) {
                    it4Var.put(str, new uj3(Integer.valueOf(((gk3) ag2Var.e.b).h()), Integer.valueOf(((gk3) ag2Var.e.c).h())));
                }
                op2Var.C(i);
                break;
        }
        return wd5Var;
    }
}
