package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tt2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ cw4 J;

    public /* synthetic */ tt2(cw4 cw4Var, byte b) {
        this.I = b;
        this.J = cw4Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        cw4 cw4Var = this.J;
        switch (b) {
            case 0:
                break;
            case 1:
                if (((Number) cw4Var.getValue()).floatValue() > 0.0f && ((Number) cw4Var.getValue()).floatValue() <= 1.0f) {
                    r2 = true;
                }
                break;
            case 3:
                pd3 pd3Var = (pd3) cw4Var.getValue();
                long j = pd3Var.a;
                break;
            case 4:
                ej ejVar = gi4.a;
                pd3 pd3Var2 = (pd3) cw4Var.getValue();
                long j2 = pd3Var2.a;
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return Float.valueOf(((Number) cw4Var.getValue()).floatValue());
    }
}
