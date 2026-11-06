package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o82 implements ag1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ q82 J;

    public /* synthetic */ o82(q82 q82Var, byte b) {
        this.I = b;
        this.J = q82Var;
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        byte b2 = 2;
        fj0 fj0Var2 = null;
        q82 q82Var = this.J;
        switch (b) {
            case 0:
                if (((c32) obj) instanceof vs3) {
                    p70.g0(q82Var.getCoroutineScope(), null, null, new zg0((View) j42.r(q82Var, rb.f), fj0Var2, b2), 3);
                    break;
                }
                break;
            default:
                if (((c32) obj) instanceof th1) {
                    p70.g0(q82Var.getCoroutineScope(), null, null, new zg0((View) j42.r(q82Var, rb.f), fj0Var2, b2), 3);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}
