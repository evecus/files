package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t5 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ t5(byte b) {
        this.I = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean focusedRect$lambda$0;
        byte b = this.I;
        fh5 fh5Var = fh5.K;
        fh5 fh5Var2 = fh5.J;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return wd5Var;
            case 1:
                return wd5Var;
            case 2:
                focusedRect$lambda$0 = AndroidComposeView.getFocusedRect$lambda$0((ui1) obj);
                return Boolean.valueOf(focusedRect$lambda$0);
            case 3:
                return Boolean.valueOf(wi4.p((si4) obj));
            case 4:
                d82[] d82VarArr = aj4.a;
                ((cj4) obj).c(zi4.y, wd5Var);
                return wd5Var;
            case 5:
                ((Long) obj).getClass();
                return wd5Var;
            case 6:
                d82[] d82VarArr2 = aj4.a;
                ((cj4) obj).c(zi4.x, wd5Var);
                return wd5Var;
            case 7:
                ((Long) obj).getClass();
                return wd5Var;
            case 8:
                return wd5Var;
            case 9:
                return Boolean.valueOf(!(((kj) obj) instanceof ck3));
            case 10:
                e83 e83Var = (e83) obj;
                e83Var.getClass();
                e83Var.c("profile_picker");
                e83Var.b(-1);
                e83Var.f = true;
                e83Var.g = false;
                return wd5Var;
            case 11:
                e83 e83Var2 = (e83) obj;
                e83Var2.getClass();
                e83Var2.c("license");
                e83Var2.b(-1);
                e83Var2.f = true;
                e83Var2.g = false;
                return wd5Var;
            case 12:
                e83 e83Var3 = (e83) obj;
                e83Var3.getClass();
                e83Var3.c("license");
                e83Var3.b(-1);
                e83Var3.f = true;
                e83Var3.g = false;
                return wd5Var;
            case 13:
                ((tq3) obj).a = true;
                return wd5Var;
            case 14:
                v11 v11Var = (v11) obj;
                return Float.valueOf(v11.a(v11Var.a) * v11.b(v11Var.a));
            case 15:
                return Float.valueOf(v11.b(((v11) obj).a));
            case 16:
                return (c7) obj;
            case 17:
                return wd5Var;
            case 18:
                ((ya2) ((zh0) obj)).a();
                return wd5Var;
            case 19:
                Aweme aweme = (Aweme) obj;
                aweme.getClass();
                return aweme.getAwemeId();
            case 20:
                k51 k51Var = (k51) obj;
                k51Var.getClass();
                return k51Var.f;
            case 21:
                k51 k51Var2 = (k51) obj;
                k51Var2.getClass();
                return Double.valueOf(k51Var2.b != fh5Var2 ? jp.y(k51Var2.f, 0.0d, 90.0d) : 85.0d);
            case 22:
                ((k51) obj).getClass();
                return jp.j(4.5d);
            case 23:
                k51 k51Var3 = (k51) obj;
                k51Var3.getClass();
                return k51Var3.g;
            case 24:
                k51 k51Var4 = (k51) obj;
                k51Var4.getClass();
                fh5 fh5Var3 = k51Var4.b;
                k85 k85Var = k51Var4.g;
                return Double.valueOf(fh5Var3 == fh5Var ? jp.y(k85Var, 0.0d, 90.0d) : jp.x(k85Var));
            case 25:
                ((k51) obj).getClass();
                return jp.j(4.5d);
            case 26:
                k51 k51Var5 = (k51) obj;
                k51Var5.getClass();
                return k51Var5.e;
            case 27:
                k51 k51Var6 = (k51) obj;
                k51Var6.getClass();
                fh5 fh5Var4 = k51Var6.b;
                if (fh5Var4 != fh5Var2) {
                    k85 k85Var2 = k51Var6.e;
                    r3 = fh5Var4 == fh5Var ? jp.y(k85Var2, 0.0d, 90.0d) : jp.x(k85Var2);
                }
                return Double.valueOf(r3);
            case 28:
                ((k51) obj).getClass();
                return jp.j(4.5d);
            default:
                k51 k51Var7 = (k51) obj;
                k51Var7.getClass();
                return k51Var7.k;
        }
    }
}
