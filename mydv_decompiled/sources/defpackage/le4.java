package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class le4 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ String K;

    public /* synthetic */ le4(String str, tm1 tm1Var) {
        this.I = (byte) 4;
        this.K = str;
        this.J = tm1Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        tm1 tm1Var = this.J;
        String str = this.K;
        switch (b) {
            case 0:
                tm1Var.invoke(str);
                break;
            case 1:
                tm1Var.invoke(str);
                break;
            case 2:
                tm1Var.invoke(str);
                break;
            case 3:
                tm1Var.invoke(str);
                break;
            default:
                if (str.length() > 0) {
                    tm1Var.invoke(jx4.F(str));
                    break;
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ le4(tm1 tm1Var, String str, byte b) {
        this.I = b;
        this.J = tm1Var;
        this.K = str;
    }
}
