package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xl2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ rm1 J;
    public final /* synthetic */ t43 K;

    public /* synthetic */ xl2(rm1 rm1Var, t43 t43Var, byte b) {
        this.I = b;
        this.J = rm1Var;
        this.K = t43Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.K;
        rm1 rm1Var = this.J;
        switch (b) {
            case 0:
                oi1 oi1Var = (oi1) obj;
                oi1Var.getClass();
                t43Var.setValue(Boolean.valueOf(oi1Var.b()));
                if (oi1Var.b()) {
                    rm1Var.invoke();
                    break;
                }
                break;
            case 1:
                oi1 oi1Var2 = (oi1) obj;
                oi1Var2.getClass();
                t43Var.setValue(Boolean.valueOf(oi1Var2.b()));
                if (oi1Var2.b()) {
                    rm1Var.invoke();
                    break;
                }
                break;
            default:
                fq4 fq4Var = (fq4) obj;
                float floatValue = ((Number) rm1Var.invoke()).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (fq4Var.a >> 32)) * floatValue;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (fq4Var.a & 4294967295L)) * floatValue;
                if (Float.intBitsToFloat((int) (((fq4) t43Var.getValue()).a >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((fq4) t43Var.getValue()).a & 4294967295L)) != intBitsToFloat2) {
                    t43Var.setValue(new fq4((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
