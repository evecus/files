package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class iu1 implements tm1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;

    public /* synthetic */ iu1(qd0 qd0Var, boolean z) {
        this.K = qd0Var;
        this.J = z;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        switch (this.I) {
            case 0:
                boolean z = this.J;
                hu2 hu2Var = (hu2) this.K;
                ((ay0) obj).getClass();
                if (z) {
                    zc4 zc4Var = hu2Var.o.d;
                    if (zc4Var.i == null) {
                        try {
                            vc4 vc4Var = new vc4(new iy3(zc4Var, (byte) 5));
                            vc4Var.e(true);
                            zc4Var.i = vc4Var;
                            wc4 wc4Var = new wc4(zc4Var);
                            wc4Var.b();
                            zc4Var.k.clear();
                            zc4Var.j = wc4Var;
                            fw4 fw4Var = zc4Var.c;
                            dg0 dg0Var = dg0.J;
                            fw4Var.getClass();
                            fw4Var.i(null, dg0Var);
                            wc4Var.s();
                            Log.i("SearchInputServer", "搜索输入服务器启动，HTTP 端口: 9979");
                        } catch (Exception e) {
                            Log.e("SearchInputServer", "服务器启动失败", e);
                            fw4 fw4Var2 = zc4Var.c;
                            dg0 dg0Var2 = dg0.L;
                            fw4Var2.getClass();
                            fw4Var2.i(null, dg0Var2);
                        }
                    }
                }
                return new ru1(hu2Var, z);
            default:
                qd0 qd0Var = (qd0) this.K;
                qd0Var.e(this.J);
                return new vr3((bj2) obj, qd0Var);
        }
    }

    public /* synthetic */ iu1(hu2 hu2Var, boolean z) {
        this.J = z;
        this.K = hu2Var;
    }
}
