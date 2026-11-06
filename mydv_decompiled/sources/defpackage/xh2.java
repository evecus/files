package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xh2 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Bitmap J;

    public /* synthetic */ xh2(Bitmap bitmap, byte b) {
        this.I = b;
        this.J = bitmap;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Bitmap bitmap = this.J;
        tx txVar = (tx) obj;
        fe0 fe0Var = (fe0) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                txVar.getClass();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var.W();
                    break;
                } else if (bitmap != null) {
                    go1Var.d0(-1442439041);
                    ut0.b(new dd(bitmap), "协议全文二维码", nq4.c, null, go1Var, 432, 248);
                    go1Var.q(false);
                    break;
                } else {
                    go1Var.d0(-1442439042);
                    go1Var.q(false);
                    break;
                }
            case 1:
                txVar.getClass();
                go1 go1Var2 = (go1) fe0Var;
                if (!go1Var2.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else if (bitmap == null) {
                    go1Var2.d0(-177893593);
                    go1Var2.q(false);
                    break;
                } else {
                    go1Var2.d0(-178154024);
                    ut0.b(new dd(bitmap), "扫码推送", nq4.c, null, go1Var2, 25008, 232);
                    go1Var2.q(false);
                    break;
                }
            default:
                txVar.getClass();
                go1 go1Var3 = (go1) fe0Var;
                if (!go1Var3.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var3.W();
                    break;
                } else if (bitmap != null) {
                    go1Var3.d0(-1900275845);
                    ut0.b(new dd(bitmap), "扫码推送登录信息", nq4.c, null, go1Var3, 25008, 232);
                    go1Var3.q(false);
                    break;
                } else {
                    go1Var3.d0(-1900275846);
                    go1Var3.q(false);
                    break;
                }
        }
        return wd5Var;
    }
}
