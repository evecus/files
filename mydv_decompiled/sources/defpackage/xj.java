package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xj implements rm1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ sb4 J;
    public final /* synthetic */ dl0 K;

    public /* synthetic */ xj(dl0 dl0Var, sb4 sb4Var) {
        this.K = dl0Var;
        this.J = sb4Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = this.K;
        sb4 sb4Var = this.J;
        switch (b) {
            case 0:
                p70.g0(dl0Var, null, null, new ak(sb4Var, null, (byte) 0), 3);
                break;
            default:
                if (sb4Var.a.h() < sb4Var.f.h()) {
                    p70.g0(dl0Var, null, null, new ak(sb4Var, null, (byte) 6), 3);
                    break;
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ xj(sb4 sb4Var, dl0 dl0Var) {
        this.J = sb4Var;
        this.K = dl0Var;
    }
}
