package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ab0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ o24 J;

    public /* synthetic */ ab0(o24 o24Var, byte b) {
        this.I = b;
        this.J = o24Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        o24 o24Var = this.J;
        rp3 rp3Var = (rp3) obj;
        float floatValue = ((Float) obj2).floatValue();
        switch (b) {
            case 0:
                rp3Var.getClass();
                o24Var.I += floatValue;
                break;
            default:
                rp3Var.a();
                o24Var.I = floatValue;
                break;
        }
        return wd5Var;
    }
}
