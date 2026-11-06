package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sd4 implements ag1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ rm1 M;

    public /* synthetic */ sd4(List list, boolean z, boolean z2, rm1 rm1Var, byte b) {
        this.I = b;
        this.J = list;
        this.K = z;
        this.L = z2;
        this.M = rm1Var;
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        rm1 rm1Var = this.M;
        boolean z = this.L;
        boolean z2 = this.K;
        List list = this.J;
        switch (b) {
            case 0:
                ((Boolean) obj).booleanValue();
                if (!list.isEmpty() && z2 && !z) {
                    rm1Var.invoke();
                    break;
                }
                break;
            case 1:
                ((Boolean) obj).getClass();
                if (!list.isEmpty() && z2 && !z) {
                    rm1Var.invoke();
                    break;
                }
                break;
            case 2:
                ((Boolean) obj).getClass();
                if (!list.isEmpty() && z2 && !z) {
                    rm1Var.invoke();
                    break;
                }
                break;
            case 3:
                ((Boolean) obj).booleanValue();
                if (!list.isEmpty() && z2 && !z) {
                    rm1Var.invoke();
                    break;
                }
                break;
            default:
                ((Boolean) obj).booleanValue();
                if (!list.isEmpty() && z2 && !z) {
                    rm1Var.invoke();
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
