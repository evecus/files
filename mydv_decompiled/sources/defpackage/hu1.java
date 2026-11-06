package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hu1 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ hu1(boolean z, Object obj, Object obj2, t43 t43Var, t43 t43Var2, byte b) {
        this.I = b;
        this.J = z;
        this.M = obj;
        this.N = obj2;
        this.K = t43Var;
        this.L = t43Var2;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.L;
        t43 t43Var2 = this.K;
        Object obj = this.N;
        Object obj2 = this.M;
        boolean z = this.J;
        switch (b) {
            case 0:
                dl4 dl4Var = (dl4) obj2;
                hu2 hu2Var = (hu2) obj;
                if (!z) {
                    if (!dl4Var.b()) {
                        hu2Var.H(dl4Var.a);
                        t43Var.setValue(Boolean.FALSE);
                        break;
                    } else {
                        t43Var2.setValue(dl4Var);
                        break;
                    }
                }
                break;
            default:
                is0 is0Var = (is0) obj2;
                dl0 dl0Var = (dl0) obj;
                if (((so3) t43Var2.getValue()) == so3.K && z && is0Var.d.b.h() < ((List) t43Var.getValue()).size() - 1) {
                    p70.g0(dl0Var, null, null, new ui3(is0Var, null, (byte) 3), 3);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
