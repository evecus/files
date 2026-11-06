package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wn1 implements Runnable {
    public final /* synthetic */ byte I;
    public final Object J;
    public final Object K;

    public wn1(wc4 wc4Var) {
        this.I = (byte) 1;
        this.K = wc4Var;
        this.J = new ArrayList();
    }

    private final void a() {
        long nanoTime;
        ((ArrayList) this.J).clear();
        try {
            ((ArrayList) this.J).addAll(((wc4) this.K).j());
            synchronized (((wc4) this.K).O) {
                nanoTime = (long) (System.nanoTime() - (((wc4) this.K).N * 1.5d));
            }
            ArrayList arrayList = (ArrayList) this.J;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((wc4) this.K).a((dt5) obj, nanoTime);
            }
        } catch (Exception unused) {
        }
        ((ArrayList) this.J).clear();
    }

    private final void b() {
        try {
            ((Runnable) this.K).run();
            synchronized (((vj4) this.J).L) {
                ((vj4) this.J).b();
            }
        } catch (Throwable th) {
            synchronized (((vj4) this.J).L) {
                ((vj4) this.J).b();
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        qx2 qx2Var;
        Throwable th = null;
        switch (this.I) {
            case 0:
                vn1 vn1Var = (vn1) this.K;
                Future future = (Future) this.J;
                if (future instanceof r2) {
                    r2 r2Var = (r2) future;
                    if (r2Var instanceof m2) {
                        Object obj = r2Var.I;
                        if (obj instanceof h2) {
                            th = ((h2) obj).a;
                        }
                    }
                    if (th != null) {
                        vn1Var.onFailure(th);
                        return;
                    }
                }
                try {
                    vn1Var.onSuccess(e21.r(future));
                    return;
                } catch (ExecutionException e) {
                    vn1Var.onFailure(e.getCause());
                    return;
                } catch (Throwable th2) {
                    vn1Var.onFailure(th2);
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                r6 r6Var = (r6) this.J;
                u6 u6Var = (u6) this.K;
                sx2 sx2Var = u6Var.K;
                if (sx2Var != null && (qx2Var = sx2Var.e) != null) {
                    qx2Var.g(sx2Var);
                }
                View view = (View) u6Var.P;
                if (view != null && view.getWindowToken() != null) {
                    if (!r6Var.b()) {
                        if (r6Var.e != null) {
                            r6Var.d(0, 0, false, false);
                        }
                    }
                    u6Var.a0 = r6Var;
                }
                u6Var.c0 = null;
                return;
            case 3:
                ((j7) this.J).a = this.K;
                return;
            case 4:
                ((Application) this.J).unregisterActivityLifecycleCallbacks((j7) this.K);
                return;
            case 5:
                Object obj2 = this.K;
                Object obj3 = this.J;
                try {
                    Method method = k7.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        k7.e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 6:
                g73 g73Var = (g73) this.J;
                Typeface typeface = (Typeface) this.K;
                lm lmVar = (lm) g73Var.J;
                if (lmVar != null) {
                    lmVar.c(typeface);
                    return;
                }
                return;
            case 7:
                fr2 e3 = fr2.e();
                String str = st0.d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                ky5 ky5Var = (ky5) this.J;
                sb.append(ky5Var.a);
                e3.a(str, sb.toString());
                ((st0) this.K).a.e(ky5Var);
                return;
            case 8:
                ((bk1) this.J).accept(this.K);
                return;
            case 9:
                ((k10) this.K).C((qb1) this.J);
                return;
            case 10:
                b();
                return;
            default:
                ky5 c = ((z05) this.K).I.f.c((String) this.J);
                if (c == null || j42.c(ch0.j, c.j)) {
                    return;
                }
                synchronized (((z05) this.K).K) {
                    ((z05) this.K).N.put(hc4.B(c), c);
                    z05 z05Var = (z05) this.K;
                    ((z05) this.K).O.put(hc4.B(c), fx5.a(z05Var.P, c, (vk0) ((mc3) z05Var.J).b, z05Var));
                }
                return;
        }
    }

    public String toString() {
        switch (this.I) {
            case 0:
                x81 x81Var = new x81(wn1.class.getSimpleName());
                vn1 vn1Var = (vn1) this.K;
                g12 g12Var = new g12((byte) 21, false);
                ((g12) x81Var.d).K = g12Var;
                x81Var.d = g12Var;
                g12Var.J = vn1Var;
                return x81Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ wn1(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    public /* synthetic */ wn1(byte b, Object obj, Object obj2, boolean z) {
        this.I = b;
        this.K = obj;
        this.J = obj2;
    }
}
