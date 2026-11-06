package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z20 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ cw4 J;

    public /* synthetic */ z20(cw4 cw4Var, byte b) {
        this.I = b;
        this.J = cw4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        cw4 cw4Var = this.J;
        switch (b) {
            case 0:
                n54 n54Var = (n54) obj;
                n54Var.getClass();
                n54Var.b(((Number) cw4Var.getValue()).floatValue());
                break;
            case 1:
                m00 m00Var = (m00) obj;
                m00Var.getClass();
                break;
            case 2:
                n54 n54Var2 = (n54) obj;
                n54Var2.getClass();
                n54Var2.j(cw4Var != null ? ((Number) cw4Var.getValue()).floatValue() : 0.0f);
                break;
            default:
                n54 n54Var3 = (n54) obj;
                n54Var3.getClass();
                n54Var3.b(((Number) cw4Var.getValue()).floatValue());
                break;
        }
        return wd5Var;
    }
}
