package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yj1 implements b81 {
    public final Context a;
    public final xj1 b;
    public final Object c = new Object();
    public Handler d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public vt0 g;

    public yj1(Context context, xj1 xj1Var) {
        sv2.q(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = xj1Var;
    }

    @Override // defpackage.b81
    public final void a(vt0 vt0Var) {
        synchronized (this.c) {
            this.g = vt0Var;
        }
        c();
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.g = null;
                Handler handler = this.d;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.d = null;
                ThreadPoolExecutor threadPoolExecutor = this.f;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.e = null;
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.c) {
            try {
                if (this.g == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.e;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new pf0("emojiCompat", (byte) 0));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.f = threadPoolExecutor2;
                    this.e = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new h(this, (byte) 12));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final sk1 d() {
        try {
            Context context = this.a;
            Object[] objArr = {this.b};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            ee0 a = wj1.a(context, DesugarCollections.unmodifiableList(arrayList));
            boolean z = a.a;
            if (z) {
                throw new RuntimeException(r7.z("fetchFonts failed (", z ? 1 : 0, ")"));
            }
            sk1[] sk1VarArr = (sk1[]) ((List) a.b).get(0);
            if (sk1VarArr == null || sk1VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return sk1VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            s83.p("provider not found", e);
            return null;
        }
    }

    public final void e(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (this.c) {
            this.e = threadPoolExecutor;
        }
    }
}
