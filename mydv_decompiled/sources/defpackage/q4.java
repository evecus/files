package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import coil3.compose.AsyncImagePainter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class q4 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ q4(byte b) {
        this.I = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean p;
        AsyncImagePainter.State DefaultTransform$lambda$0;
        byte b = this.I;
        p90 p90Var = aw2.a;
        fh5 fh5Var = fh5.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return Boolean.valueOf(!(((cq3) obj) != null ? cq3.b(r10.d(), 2) : false));
            case 1:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 2:
                p = wi4.p((si4) obj);
                return Boolean.valueOf(p);
            case 3:
                return (jo3) obj;
            case 4:
                xe0 xe0Var = (xe0) obj;
                xe0Var.Q(rb.a);
                return ((Context) xe0Var.Q(rb.b)).getResources();
            case 5:
                qg qgVar = (qg) obj;
                qgVar.getHandler().post(new kf(qgVar.c0, (byte) 1));
                return wd5Var;
            case 6:
                return wd5Var;
            case 7:
                return wd5Var;
            case 8:
                return wd5Var;
            case 9:
                ((e83) obj).a(0, new t5((byte) 13));
                return wd5Var;
            case 10:
                DefaultTransform$lambda$0 = AsyncImagePainter.DefaultTransform$lambda$0((AsyncImagePainter.State) obj);
                return DefaultTransform$lambda$0;
            case 11:
                wt wtVar = (wt) obj;
                wtVar.getClass();
                mu0.I(wtVar);
                return wd5Var;
            case 12:
                ((wt) obj).l0();
                return wd5Var;
            case 13:
                return wd5Var;
            case 14:
                return wd5Var;
            case 15:
                if (((Context) ((xe0) obj).Q(rb.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return py.b;
                }
                oy.a.getClass();
                return ny.c;
            case 16:
                k51 k51Var = (k51) obj;
                k51Var.getClass();
                return k51Var.h;
            case 17:
                k51 k51Var2 = (k51) obj;
                k51Var2.getClass();
                return Double.valueOf(k51Var2.c ? 90.0d : 10.0d);
            case 18:
                ((k51) obj).getClass();
                return new lj0(4.5d, 7.0d, 11.0d, 21.0d);
            case 19:
                k51 k51Var3 = (k51) obj;
                k51Var3.getClass();
                return k51Var3.g;
            case 20:
                k51 k51Var4 = (k51) obj;
                k51Var4.getClass();
                return Double.valueOf(k51Var4.b != fh5Var ? 80.0d : 30.0d);
            case 21:
                ((k51) obj).getClass();
                return new lj0(1.0d, 1.0d, 3.0d, 4.5d);
            case 22:
                k51 k51Var5 = (k51) obj;
                k51Var5.getClass();
                return k51Var5.f;
            case 23:
                k51 k51Var6 = (k51) obj;
                k51Var6.getClass();
                return Double.valueOf(k51Var6.b == fh5Var ? 25.0d : 30.0d);
            case 24:
                ((k51) obj).getClass();
                return p90Var.v();
            case 25:
                ((k51) obj).getClass();
                return p90Var.u();
            case 26:
                k51 k51Var7 = (k51) obj;
                k51Var7.getClass();
                return k51Var7.e;
            case 27:
                ((k51) obj).getClass();
                return new lj0(3.0d, 4.5d, 7.0d, 11.0d);
            case 28:
                k51 k51Var8 = (k51) obj;
                k51Var8.getClass();
                return k51Var8.e;
            default:
                k51 k51Var9 = (k51) obj;
                k51Var9.getClass();
                return Double.valueOf(k51Var9.b != fh5Var ? 30.0d : 90.0d);
        }
    }
}
