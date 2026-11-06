package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vj implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ sb4 J;

    public /* synthetic */ vj(sb4 sb4Var, byte b) {
        this.I = b;
        this.J = sb4Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        boolean C;
        byte b = this.I;
        sb4 sb4Var = this.J;
        switch (b) {
            case 0:
                C = il2.C(sb4Var);
                break;
            case 1:
                C = il2.C(sb4Var);
                break;
            case 2:
                C = il2.C(sb4Var);
                break;
            case 3:
                return Boolean.valueOf(sb4Var.a.h() < sb4Var.f.h());
            default:
                return Boolean.valueOf(sb4Var.a.h() > 0);
        }
        return Boolean.valueOf(C);
    }
}
