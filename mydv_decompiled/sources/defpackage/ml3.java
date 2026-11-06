package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ml3 {
    public final we0 a;
    public final re0 b;
    public final go1 c;
    public final hn1 d;
    public final boolean e;
    public final k1 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(ol3.K);
    public long i = li4.e();
    public ja4 j;
    public final j34 k;
    public final pn l;

    public ml3(we0 we0Var, re0 re0Var, go1 go1Var, q43 q43Var, hn1 hn1Var, boolean z, k1 k1Var, Object obj) {
        this.a = we0Var;
        this.b = re0Var;
        this.c = go1Var;
        this.d = hn1Var;
        this.e = z;
        this.f = k1Var;
        this.g = obj;
        o43 o43Var = ka4.a;
        o43Var.getClass();
        this.j = o43Var;
        j34 j34Var = new j34();
        j34Var.g(q43Var, go1Var.D());
        this.k = j34Var;
        this.l = new pn(k1Var.c);
    }

    public final void a() {
        AtomicReference atomicReference = this.h;
        try {
            switch (((ol3) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    ol3 ol3Var = ol3.N;
                    ol3 ol3Var2 = ol3.O;
                    while (!atomicReference.compareAndSet(ol3Var, ol3Var2)) {
                        if (atomicReference.get() != ol3Var) {
                            jr3.b("Unexpected state change from: " + ol3Var + " to: " + ol3Var2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new d92();
            }
        } catch (Exception e) {
            atomicReference.set(ol3.I);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.R(this.f, this.k);
                    this.k.c();
                    this.k.d();
                } finally {
                    this.k.b();
                    this.a.Y = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((ol3) this.h.get()).compareTo(ol3.N) >= 0;
    }

    public final void d() {
        AtomicReference atomicReference;
        ol3 ol3Var;
        ol3 ol3Var2;
        do {
            atomicReference = this.h;
            ol3Var = ol3.L;
            ol3Var2 = ol3.N;
            if (atomicReference.compareAndSet(ol3Var, ol3Var2)) {
                return;
            }
        } while (atomicReference.get() == ol3Var);
        jr3.b("Unexpected state change from: " + ol3Var + " to: " + ol3Var2 + ".");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean e(wn4 wn4Var) {
        ol3 ol3Var = ol3.M;
        AtomicReference atomicReference = this.h;
        try {
            int ordinal = ((ol3) atomicReference.get()).ordinal();
            ol3 ol3Var2 = ol3.L;
            we0 we0Var = this.a;
            re0 re0Var = this.b;
            switch (ordinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    go1 go1Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        go1Var.z = 0;
                        go1Var.y = true;
                    }
                    this.j = re0Var.composeInitialPaused$runtime(we0Var, wn4Var, this.d);
                    if (z) {
                        if (go1Var.F || go1Var.z != 0) {
                            jr3.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        go1Var.z = -1;
                        go1Var.y = false;
                    }
                    ol3 ol3Var3 = ol3.K;
                    while (true) {
                        if (!atomicReference.compareAndSet(ol3Var3, ol3Var2)) {
                            if (atomicReference.get() != ol3Var3) {
                                jr3.b("Unexpected state change from: " + ol3Var3 + " to: " + ol3Var2 + ".");
                            }
                        }
                    }
                    if (this.j.b()) {
                        d();
                    }
                    return c();
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(ol3Var2, ol3Var)) {
                            if (atomicReference.get() != ol3Var2) {
                                jr3.b("Unexpected state change from: " + ol3Var2 + " to: " + ol3Var + ".");
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = li4.e();
                        this.j = re0Var.recomposePaused$runtime(we0Var, wn4Var, this.j);
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(ol3Var, ol3Var2)) {
                                if (atomicReference.get() != ol3Var) {
                                    jr3.b("Unexpected state change from: " + ol3Var + " to: " + ol3Var2 + ".");
                                }
                            }
                        }
                        if (this.j.b()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(ol3Var, ol3Var2)) {
                                if (atomicReference.get() != ol3Var) {
                                    jr3.b("Unexpected state change from: " + ol3Var + " to: " + ol3Var2 + ".");
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    ke0.b("Recursive call to resume()");
                    throw new d92();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new d92();
            }
        } catch (Exception e) {
            atomicReference.set(ol3.I);
            throw e;
        }
    }
}
