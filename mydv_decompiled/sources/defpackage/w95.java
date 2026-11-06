package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class w95 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ea5 J;

    public /* synthetic */ w95(ea5 ea5Var, byte b) {
        this.I = b;
        this.J = ea5Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        ea5 ea5Var = this.J;
        switch (b) {
            case 0:
                return Boolean.valueOf((j42.c(ea5Var.d.getValue(), ea5Var.a.d()) && ea5Var.h.h() == Long.MIN_VALUE && !((Boolean) ea5Var.i.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(ea5Var.b());
        }
    }
}
