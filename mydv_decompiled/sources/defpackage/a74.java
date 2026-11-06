package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class a74 {
    public dj0 a;
    public Executor b;
    public vj4 c;
    public w64 d;
    public e52 e;
    public boolean g;
    public final g12 f = new g12(new xa(0, this, a74.class, "onClosed", "onClosed()V", 0, 2));
    public final ThreadLocal h = new ThreadLocal();
    public final LinkedHashMap i = new LinkedHashMap();
    public boolean j = true;

    public final void a() {
        if (this.g) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            zy.i("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        hm1 writableDatabase = g().getWritableDatabase();
        if (!writableDatabase.E()) {
            jl2.h0(new h40((Object) f(), (fj0) null, (byte) 10));
        }
        if (writableDatabase.I.isWriteAheadLoggingEnabled()) {
            writableDatabase.g();
        } else {
            writableDatabase.e();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sv2.J(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(sv2.B((t72) entry.getKey()), entry.getValue());
        }
        return o91.I;
    }

    public abstract e52 d();

    public b74 e() {
        throw new ab3(0);
    }

    public final e52 f() {
        e52 e52Var = this.e;
        if (e52Var != null) {
            return e52Var;
        }
        j42.g0("internalTracker");
        throw null;
    }

    public final sz4 g() {
        w64 w64Var = this.d;
        if (w64Var == null) {
            j42.g0("connectionManager");
            throw null;
        }
        sz4 c = w64Var.c();
        if (c != null) {
            return c;
        }
        zy.i("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set h() {
        return o70.u1(new ArrayList(p70.J(t91.I, 10)));
    }

    public LinkedHashMap i() {
        int J = sv2.J(p70.J(t91.I, 10));
        if (J < 16) {
            J = 16;
        }
        return new LinkedHashMap(J);
    }

    public final boolean j() {
        w64 w64Var = this.d;
        if (w64Var != null) {
            return w64Var.c() != null;
        }
        j42.g0("connectionManager");
        throw null;
    }

    public final boolean k() {
        return m() && g().getWritableDatabase().E();
    }

    public final void l() {
        g().getWritableDatabase().t();
        if (k()) {
            return;
        }
        e52 f = f();
        f.b.c(f.e, f.f);
    }

    public final boolean m() {
        w64 w64Var = this.d;
        if (w64Var == null) {
            j42.g0("connectionManager");
            throw null;
        }
        hm1 hm1Var = w64Var.g;
        if (hm1Var != null) {
            return hm1Var.I.isOpen();
        }
        return false;
    }

    public final Object n(Callable callable) {
        b();
        try {
            Object call = callable.call();
            p();
            return call;
        } finally {
            l();
        }
    }

    public final void o(Runnable runnable) {
        b();
        try {
            runnable.run();
            p();
        } finally {
            l();
        }
    }

    public final void p() {
        g().getWritableDatabase().F();
    }

    public final Object q(boolean z, hn1 hn1Var, gj0 gj0Var) {
        w64 w64Var = this.d;
        if (w64Var != null) {
            return w64Var.f.o(z, hn1Var, gj0Var);
        }
        j42.g0("connectionManager");
        throw null;
    }
}
