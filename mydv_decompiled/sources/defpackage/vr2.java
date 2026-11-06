package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vr2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ s35 J;

    public /* synthetic */ vr2(s35 s35Var, byte b) {
        this.I = b;
        this.J = s35Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        s35 s35Var = this.J;
        switch (b) {
            case 0:
                s35Var.b();
                break;
            default:
                s35Var.onCancel();
                break;
        }
        return wd5Var;
    }
}
