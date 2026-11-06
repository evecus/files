package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y45 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ iu0 J;
    public final /* synthetic */ t43 K;

    public /* synthetic */ y45(iu0 iu0Var, t43 t43Var, byte b) {
        this.I = b;
        this.J = iu0Var;
        this.K = t43Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        t43 t43Var = this.K;
        iu0 iu0Var = this.J;
        switch (b) {
            case 0:
                b40 b40Var = new b40((rm1) obj, (byte) 14);
                y45 y45Var = new y45(iu0Var, t43Var, (byte) 1);
                if (ht2.a()) {
                    return ht2.a() ? new dt2(b40Var, y45Var, Build.VERSION.SDK_INT == 28 ? rn3.a : tn3.a) : i13.a;
                }
                zy.p("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                v11 v11Var = (v11) obj;
                t43Var.setValue(new z22((iu0Var.X(v11.a(v11Var.a)) & 4294967295L) | (iu0Var.X(v11.b(v11Var.a)) << 32)));
                return wd5.a;
        }
    }
}
