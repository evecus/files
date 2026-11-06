package defpackage;

import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zv1 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ zv1(hu2 hu2Var, ow3 ow3Var, boolean z) {
        this.I = (byte) 3;
        this.K = hu2Var;
        this.L = ow3Var;
        this.J = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rm1
    public final Object invoke() {
        wd5 wd5Var;
        byte b = this.I;
        wd5 wd5Var2 = wd5.a;
        Object obj = this.L;
        Object obj2 = this.K;
        boolean z = this.J;
        switch (b) {
            case 0:
                wd5Var = Http2Connection.ReaderRunnable.settings$lambda$0((Http2Connection.ReaderRunnable) obj2, z, (Settings) obj);
                break;
            case 1:
                dl0 dl0Var = (dl0) obj2;
                sb4 sb4Var = (sb4) obj;
                if (z) {
                    p70.g0(dl0Var, null, null, new ak(sb4Var, null, r1), 3);
                    break;
                }
                break;
            case 2:
                sb4 sb4Var2 = (sb4) obj2;
                String str = (String) obj;
                if (z) {
                    if (!il2.C(sb4Var2)) {
                        int h = sb4Var2.b.h();
                        if (h < 1) {
                            h = 1;
                        }
                        int h2 = sb4Var2.f.h();
                        int ceil = (int) Math.ceil((h2 + h) / h);
                        r1 = ceil >= 2 ? ceil : (byte) 2;
                        float h3 = sb4Var2.a.h();
                        if (h2 < 1) {
                            h2 = 1;
                        }
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 3:
                ow3 ow3Var = (ow3) obj;
                gx3 gx3Var = ((hu2) obj2).p;
                gx3Var.d.c(ow3Var.J, "profile.currentTab");
                if (ow3Var == ow3.R && !z) {
                    gx3Var.s();
                    gx3Var.L(false);
                    break;
                }
                break;
            default:
                tm1 tm1Var = (tm1) obj2;
                String str2 = (String) obj;
                if (z) {
                    tm1Var.invoke(str2);
                    break;
                }
                break;
        }
        return wd5Var2;
    }

    public /* synthetic */ zv1(byte b, Object obj, Object obj2, boolean z) {
        this.I = b;
        this.J = z;
        this.K = obj;
        this.L = obj2;
    }

    public /* synthetic */ zv1(Http2Connection.ReaderRunnable readerRunnable, boolean z, Settings settings) {
        this.I = (byte) 0;
        this.K = readerRunnable;
        this.J = z;
        this.L = settings;
    }
}
