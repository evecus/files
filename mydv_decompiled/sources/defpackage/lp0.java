package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.media3.datasource.DataSourceBitmapLoader;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lp0 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lp0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bitmap lambda$decodeBitmap$1;
        Bitmap lambda$loadBitmap$2;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                lambda$decodeBitmap$1 = ((DataSourceBitmapLoader) obj2).lambda$decodeBitmap$1((byte[]) obj);
                return lambda$decodeBitmap$1;
            case 1:
                lambda$loadBitmap$2 = ((DataSourceBitmapLoader) obj2).lambda$loadBitmap$2((Uri) obj);
                return lambda$loadBitmap$2;
            default:
                az5 az5Var = (az5) obj2;
                dz5 dz5Var = (dz5) obj;
                ky5 ky5Var = dz5Var.a;
                String str = dz5Var.c;
                oy5 oy5Var = dz5Var.i;
                boolean z = az5Var instanceof yy5;
                sx5 sx5Var = sx5.I;
                boolean z2 = true;
                boolean z3 = false;
                if (z) {
                    nl2 nl2Var = ((yy5) az5Var).a;
                    sx5 d = oy5Var.d(str);
                    cy5 v = dz5Var.h.v();
                    v.getClass();
                    g4.V(v.a, false, true, new pu0(str, (byte) 11));
                    if (d != null) {
                        if (d == sx5.J) {
                            String str2 = dz5Var.l;
                            if (nl2Var instanceof ml2) {
                                fr2.e().g(ez5.a, "Worker result SUCCESS for ".concat(str2));
                                if (ky5Var.c()) {
                                    dz5Var.b();
                                } else {
                                    oy5Var.j(sx5.K, str);
                                    dp0 dp0Var = ((ml2) nl2Var).a;
                                    dp0Var.getClass();
                                    g4.V(oy5Var.a, false, true, new ap3((Object) dp0Var, (Object) str, (byte) 24));
                                    long currentTimeMillis = System.currentTimeMillis();
                                    ru0 ru0Var = dz5Var.j;
                                    for (String str3 : ru0Var.a(str)) {
                                        if (oy5Var.d(str3) == sx5.M && ((Boolean) g4.V(ru0Var.a, true, false, new pu0(str3, (byte) 2))).booleanValue()) {
                                            fr2.e().g(ez5.a, "Setting status to enqueued for ".concat(str3));
                                            oy5Var.j(sx5Var, str3);
                                            oy5Var.i(str3, currentTimeMillis);
                                        }
                                    }
                                }
                            } else if (nl2Var instanceof ll2) {
                                fr2.e().g(ez5.a, "Worker result RETRY for ".concat(str2));
                                dz5Var.a(-256);
                                z3 = z2;
                            } else {
                                fr2.e().g(ez5.a, "Worker result FAILURE for ".concat(str2));
                                if (ky5Var.c()) {
                                    dz5Var.b();
                                } else {
                                    dz5Var.d(nl2Var);
                                }
                            }
                        } else if (!d.a()) {
                            dz5Var.a(-512);
                            z3 = z2;
                        }
                    }
                    z2 = false;
                    z3 = z2;
                } else if (az5Var instanceof xy5) {
                    dz5Var.d(((xy5) az5Var).a);
                } else {
                    if (!(az5Var instanceof zy5)) {
                        s83.v();
                        return null;
                    }
                    int i = ((zy5) az5Var).a;
                    if (j42.c(ky5Var.y, Boolean.TRUE)) {
                        String str4 = ez5.a;
                        fr2.e().a(str4, "Worker " + ky5Var.c + " was interrupted. Backing off.");
                        dz5Var.a(i);
                    } else {
                        sx5 d2 = oy5Var.d(str);
                        if (d2 == null || d2.a()) {
                            String str5 = ez5.a;
                            fr2.e().a(str5, "Status for " + str + " is " + d2 + " ; not doing any work");
                            z2 = false;
                        } else {
                            String str6 = ez5.a;
                            fr2.e().a(str6, "Status for " + str + " is " + d2 + "; not doing any work and rescheduling for later execution");
                            oy5Var.j(sx5Var, str);
                            oy5Var.k(str, i);
                            oy5Var.g(str, -1L);
                        }
                    }
                    z3 = z2;
                }
                return Boolean.valueOf(z3);
        }
    }
}
