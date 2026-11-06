package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d40 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ag2 J;

    public /* synthetic */ d40(ag2 ag2Var, byte b) {
        this.I = b;
        this.J = ag2Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        int i;
        byte b = this.I;
        ag2 ag2Var = this.J;
        switch (b) {
            case 0:
                vf2 vf2Var = (vf2) o70.b1(ag2Var.h().l);
                return Integer.valueOf(vf2Var != null ? vf2Var.a : -1);
            case 1:
                i = ag2Var.h().o;
                break;
            default:
                i = ((uf2) ag2Var.f.getValue()).k;
                break;
        }
        return Integer.valueOf(i);
    }
}
