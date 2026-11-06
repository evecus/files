package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.common.C;
import androidx.work.impl.WorkDatabase_Impl;
import coil3.ImageLoader;
import java.io.File;
import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ce implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ ce(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    private final Object a() {
        k32 k32Var = (k32) this.J;
        long longValue = ((Number) k32Var.J.invoke()).longValue();
        q24 q24Var = new q24();
        q24 q24Var2 = new q24();
        synchronized (k32Var.L) {
            q24Var.I = longValue - k32Var.N;
            q24Var2.I = C.NANOS_PER_SECOND / k32Var.M;
        }
        p70.g0(k32Var.I, null, null, new p1(q24Var, q24Var2, k32Var, longValue, (fj0) null), 3);
        return wd5.a;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        lm1 lm1Var;
        yr3 yr3Var;
        wd5 sendDegradedPingLater$lambda$1;
        tk0 mainCoroutineContext$lambda$0;
        Integer num = null;
        switch (this.I) {
            case 0:
                i42.e0(((fe) this.J).K, null);
                return wd5.a;
            case 1:
                mu0.I((ue) this.J);
                return wd5.a;
            case 2:
                return ((w25) this.J).G();
            case 3:
                return wd5.a;
            case 4:
                ((vo) this.J).h.getValue();
                return wd5.a;
            case 5:
                ((wt) this.J).I.getClass();
                throw new ClassCastException();
            case 6:
                return (oj) this.J;
            case 7:
                return (m14) this.J;
            case 8:
                Iterator it = ((zg2) this.J).g().m.iterator();
                if (it.hasNext()) {
                    Integer valueOf = Integer.valueOf(((ug2) it.next()).a);
                    while (true) {
                        num = valueOf;
                        while (it.hasNext()) {
                            valueOf = Integer.valueOf(((ug2) it.next()).a);
                            if (num.compareTo(valueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                return Integer.valueOf(num != null ? num.intValue() : -1);
            case 9:
                ((nk) this.J).reportFullyDrawn();
                return wd5.a;
            case 10:
                return ((g12) this.J).c(":memory:");
            case 11:
                return ((oh2) this.J).d();
            case 12:
                return new l45((pg3) this.J, 0.0f);
            case 13:
                ((av) this.J).close();
                return wd5.a;
            case 14:
                return new hi((f41) this.J, (byte) 2);
            case 15:
                mm1 mm1Var = (mm1) this.J;
                Context context = mm1Var.I;
                String str = mm1Var.J;
                if (str == null || !mm1Var.L) {
                    lm1Var = new lm1(context, mm1Var.J, new uu2((byte) 19), mm1Var.K, mm1Var.M);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    lm1Var = new lm1(context, new File(noBackupFilesDir, str).getAbsolutePath(), new uu2((byte) 19), mm1Var.K, mm1Var.M);
                }
                lm1Var.setWriteAheadLoggingEnabled(mm1Var.O);
                return lm1Var;
            case 16:
                yp1 yp1Var = (yp1) this.J;
                synchronized (yp1.d) {
                    try {
                        yr3Var = yp1.f;
                        if (yr3Var == null) {
                            File v0 = dq2.v0(yp1Var.a, "GlanceAppWidgetManager");
                            File file = v0.exists() ? v0 : null;
                            if (file != null) {
                                file.delete();
                            }
                            yr3Var = up1.a(yp1Var.a);
                            yp1.f = yr3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return yr3Var;
            case 17:
                sendDegradedPingLater$lambda$1 = Http2Connection.sendDegradedPingLater$lambda$1((Http2Connection) this.J);
                return sendDegradedPingLater$lambda$1;
            case 18:
                mainCoroutineContext$lambda$0 = ImageLoader.Builder.mainCoroutineContext$lambda$0((tk0) this.J);
                return mainCoroutineContext$lambda$0;
            case 19:
                return Float.valueOf(ad4.r(((dl0) this.J).getCoroutineContext()));
            case 20:
                Object systemService = ((View) ((g12) this.J).J).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 21:
                return a();
            case 22:
                WorkDatabase_Impl workDatabase_Impl = ((e52) this.J).a;
                if (workDatabase_Impl.j() && !workDatabase_Impl.m()) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 23:
                return Integer.valueOf(((ld2) ((wd2) this.J).e.getValue()).m);
            case 24:
                return new BaseInputConnection(((ph2) this.J).a, false);
            case 25:
                vv2 vv2Var = (vv2) this.J;
                if (vv2Var.M.h() <= vv2Var.N.h()) {
                    return null;
                }
                ((tv2) vv2Var.S.getValue()).getClass();
                return Float.valueOf(vv2Var.j0() + r0.h());
            case 26:
                ((jt2) this.J).invoke();
                return wd5.a;
            case 27:
                return Float.valueOf(((Number) ((bh) this.J).d()).floatValue());
            case 28:
                ui uiVar = (ui) this.J;
                return Boolean.valueOf(uiVar != null && uiVar.b().d.getValue() == aa1.K);
            default:
                return Boolean.valueOf(vq3.m((vq3) this.J));
        }
    }
}
