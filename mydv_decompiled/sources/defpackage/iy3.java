package defpackage;

import android.app.RemoteAction;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import coil3.decode.Decoder;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class iy3 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ iy3(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        wd5 writeOneFrame$lambda$0$0;
        wd5 finishReader$lambda$0$0;
        wd5 failWebSocket$lambda$0$0;
        List j0;
        List j02;
        byte b = this.I;
        boolean z = false;
        wd5 wd5Var = wd5.a;
        Object obj = this.J;
        switch (b) {
            case 0:
                ((od2) obj).b();
                return wd5Var;
            case 1:
                writeOneFrame$lambda$0$0 = RealWebSocket.writeOneFrame$lambda$0$0((RealWebSocket) obj);
                return writeOneFrame$lambda$0$0;
            case 2:
                finishReader$lambda$0$0 = RealWebSocket.finishReader$lambda$0$0((WebSocketWriter) obj);
                return finishReader$lambda$0$0;
            case 3:
                failWebSocket$lambda$0$0 = RealWebSocket.failWebSocket$lambda$0$0((r24) obj);
                return failWebSocket$lambda$0$0;
            case 4:
                ClassLoader classLoader = ((c94) obj).a;
                Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                loadClass.getClass();
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass2.getClass();
                declaredMethod.getClass();
                if (declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                zc4 zc4Var = (zc4) obj;
                ConcurrentHashMap concurrentHashMap = ct5.a;
                return ct5.b(zc4Var.b, zc4Var.a, "search.html", p91.I);
            case 6:
                qu2 qu2Var = (qu2) obj;
                try {
                    Intent putExtra = new Intent("android.speech.action.RECOGNIZE_SPEECH").putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                    putExtra.getClass();
                    qu2Var.L0(putExtra);
                } catch (Throwable unused) {
                }
                return wd5Var;
            case 7:
                ym4 ym4Var = (ym4) obj;
                jk3 jk3Var = ym4Var.K;
                if (((fq4) jk3Var.getValue()).a == 9205357640488583168L || fq4.c(((fq4) jk3Var.getValue()).a)) {
                    return null;
                }
                return ym4Var.I.c(((fq4) jk3Var.getValue()).a);
            case 8:
                ((Boolean) ((qr4) obj).o.getValue()).booleanValue();
                return wd5Var;
            case 9:
                dy4 dy4Var = (dy4) obj;
                jr1 jr1Var = dy4Var.P;
                if (jr1Var != null) {
                    return jr1Var;
                }
                jr1 c = ut0.V(dy4Var).getGraphicsContext().c();
                dy4Var.P = c;
                return c;
            case 10:
                q25 q25Var = (q25) obj;
                q25Var.X = null;
                ut0.U(q25Var).I();
                ut0.U(q25Var).H();
                mu0.I(q25Var);
                return Boolean.TRUE;
            case 11:
                rn3.g((RemoteAction) obj);
                return wd5Var;
            case 12:
                l35 l35Var = (l35) obj;
                return l35Var.isAttached() ? kb4.l(l35Var) : v25.b;
            case 13:
                return new r11(vt0.G(24.0f, 16.0f, ((c45) obj).a()));
            case 14:
                return new r22(((v22) obj).b());
            case 15:
                jj3 jj3Var = (jj3) obj;
                return new uj3(Boolean.valueOf(jj3Var.k.a()), Float.valueOf(jj3Var.d.c.h()));
            case 16:
                j0 = p70.j0((uj3) obj);
                return j0;
            case 17:
                j02 = p70.j0((Decoder.Factory) obj);
                return j02;
            case 18:
                ti5 ti5Var = (ti5) obj;
                return BigInteger.valueOf(ti5Var.I).shiftLeft(32).or(BigInteger.valueOf(ti5Var.J)).shiftLeft(32).or(BigInteger.valueOf(ti5Var.K));
            case 19:
                r41 r41Var = (r41) obj;
                if (r41Var != null) {
                    r41Var.d();
                }
                return wd5Var;
            case 20:
                ir5 ir5Var = (ir5) obj;
                ir5Var.q0.invoke(ir5Var.m0);
                return wd5Var;
            case 21:
                z91.a((gx5) obj);
                return wd5Var;
            case 22:
                ux5 ux5Var = (ux5) obj;
                WorkDatabase workDatabase = ux5Var.c;
                Context context = ux5Var.a;
                String str = g15.N;
                if (Build.VERSION.SDK_INT >= 34) {
                    z52.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList f = g15.f(context, jobScheduler);
                if (f != null && !f.isEmpty()) {
                    int size = f.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = f.get(i);
                        i++;
                        g15.a(jobScheduler, ((JobInfo) obj2).getId());
                    }
                }
                ((Number) g4.V(workDatabase.w().a, false, true, new ny5((byte) 2))).intValue();
                pa4.b(ux5Var.b, workDatabase, ux5Var.e);
                return wd5Var;
            default:
                return ((Worker) obj).a();
        }
    }
}
