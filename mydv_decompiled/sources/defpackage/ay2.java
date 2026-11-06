package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ay2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ z60 K;

    public /* synthetic */ ay2(tm1 tm1Var, z60 z60Var, byte b) {
        this.I = b;
        this.J = tm1Var;
        this.K = z60Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        z60 z60Var = this.K;
        tm1 tm1Var = this.J;
        float floatValue = ((Float) obj).floatValue();
        switch (b) {
            case 0:
                tm1Var.invoke(Float.valueOf(ut0.q(floatValue, z60Var.a, z60Var.b)));
                break;
            default:
                tm1Var.invoke(Float.valueOf(ut0.q(floatValue, z60Var.a, z60Var.b)));
                break;
        }
        return wd5Var;
    }
}
