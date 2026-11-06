package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ya3 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;

    public /* synthetic */ ya3(byte b, Object obj, boolean z) {
        this.I = b;
        this.J = z;
        this.K = obj;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        Object obj2 = this.K;
        boolean z = this.J;
        boolean z2 = false;
        z2 = false;
        switch (b) {
            case 0:
                k71 k71Var = (k71) obj2;
                kq1 kq1Var = (kq1) obj;
                if ((kq1Var instanceof rt) || ((z && Build.VERSION.SDK_INT <= 30) || ((kq1Var instanceof z6) && (!(k71Var instanceof m71) || Build.VERSION.SDK_INT < 31)))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                qr4 qr4Var = (qr4) obj2;
                cj4 cj4Var = (cj4) obj;
                wd5 wd5Var = wd5.a;
                if (!z) {
                    d82[] d82VarArr = aj4.a;
                    cj4Var.c(zi4.j, wd5Var);
                }
                String valueOf = String.valueOf(mw2.P(qr4Var.c.h() * 100.0f) / 100.0f);
                d82[] d82VarArr2 = aj4.a;
                bj4 bj4Var = zi4.b;
                d82 d82Var = aj4.a[0];
                bj4Var.getClass();
                cj4Var.c(bj4Var, valueOf);
                cj4Var.c(ii4.i, new v4(null, new gr4(qr4Var, z2 ? (byte) 1 : (byte) 0)));
                return wd5Var;
        }
    }
}
