package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class r2 implements fl2 {
    public static final boolean L;
    public static final cg2 M;
    public static final j42 N;
    public static final Object O;
    public volatile Object I;
    public volatile i2 J;
    public volatile q2 K;

    static {
        boolean z;
        Throwable th;
        j42 l2Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        L = z;
        M = new cg2(r2.class);
        Throwable th2 = null;
        try {
            l2Var = new p2();
            th = null;
        } catch (Error | Exception e) {
            th = e;
            try {
                l2Var = new j2(AtomicReferenceFieldUpdater.newUpdater(q2.class, Thread.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY), AtomicReferenceFieldUpdater.newUpdater(q2.class, q2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(r2.class, q2.class, "K"), AtomicReferenceFieldUpdater.newUpdater(r2.class, i2.class, "J"), AtomicReferenceFieldUpdater.newUpdater(r2.class, Object.class, "I"));
            } catch (Error | Exception e2) {
                th2 = e2;
                l2Var = new l2();
            }
        }
        N = l2Var;
        if (th2 != null) {
            cg2 cg2Var = M;
            Logger a = cg2Var.a();
            Level level = Level.SEVERE;
            a.log(level, "UnsafeAtomicHelper is broken!", th);
            cg2Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        O = new Object();
    }

    public static void e(r2 r2Var, boolean z) {
        i2 i2Var = null;
        while (true) {
            for (q2 A = N.A(r2Var); A != null; A = A.b) {
                Thread thread = A.a;
                if (thread != null) {
                    A.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            r2Var.c();
            i2 i2Var2 = i2Var;
            i2 z2 = N.z(r2Var);
            i2 i2Var3 = i2Var2;
            while (z2 != null) {
                i2 i2Var4 = z2.c;
                z2.c = i2Var3;
                i2Var3 = z2;
                z2 = i2Var4;
            }
            while (i2Var3 != null) {
                i2Var = i2Var3.c;
                Runnable runnable = i2Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof k2) {
                    k2 k2Var = (k2) runnable;
                    r2Var = k2Var.I;
                    if (r2Var.I == k2Var) {
                        if (N.i(r2Var, k2Var, h(k2Var.J))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = i2Var3.b;
                    Objects.requireNonNull(executor);
                    f(executor, runnable);
                }
                i2Var3 = i2Var;
            }
            return;
        }
    }

    public static void f(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            M.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object g(Object obj) {
        if (obj instanceof f2) {
            Throwable th = ((f2) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof h2) {
            throw new ExecutionException(((h2) obj).a);
        }
        if (obj == O) {
            return null;
        }
        return obj;
    }

    public static Object h(fl2 fl2Var) {
        Object obj;
        Throwable L2;
        if (fl2Var instanceof m2) {
            Object obj2 = ((r2) fl2Var).I;
            if (obj2 instanceof f2) {
                f2 f2Var = (f2) obj2;
                if (f2Var.a) {
                    obj2 = f2Var.b != null ? new f2(f2Var.b, false) : f2.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((fl2Var instanceof r2) && (L2 = c21.L((r2) fl2Var)) != null) {
            return new h2(L2);
        }
        boolean isCancelled = fl2Var.isCancelled();
        boolean z = true;
        if ((!L) && isCancelled) {
            f2 f2Var2 = f2.d;
            Objects.requireNonNull(f2Var2);
            return f2Var2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = fl2Var.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new h2(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new h2(e);
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new f2(e3, false);
                }
                return new h2(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + fl2Var, e3));
            } catch (ExecutionException e4) {
                if (!isCancelled) {
                    return new h2(e4.getCause());
                }
                return new f2(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + fl2Var, e4), false);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? O : obj;
        }
        return new f2(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + fl2Var), false);
    }

    @Override // defpackage.fl2
    public void a(Executor executor, Runnable runnable) {
        i2 i2Var;
        i2 i2Var2 = i2.d;
        if (!isDone() && (i2Var = this.J) != i2Var2) {
            i2 i2Var3 = new i2(executor, runnable);
            do {
                i2Var3.c = i2Var;
                if (N.h(this, i2Var, i2Var3)) {
                    return;
                } else {
                    i2Var = this.J;
                }
            } while (i2Var != i2Var2);
        }
        f(executor, runnable);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        d(sb, obj);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        f2 f2Var;
        Object obj = this.I;
        if (!(obj == null) && !(obj instanceof k2)) {
            return false;
        }
        if (L) {
            f2Var = new f2(new CancellationException("Future.cancel() was called."), z);
        } else {
            f2Var = z ? f2.c : f2.d;
            Objects.requireNonNull(f2Var);
        }
        boolean z2 = false;
        while (true) {
            if (N.i(this, obj, f2Var)) {
                e(this, z);
                if (!(obj instanceof k2)) {
                    break;
                }
                fl2 fl2Var = ((k2) obj).J;
                if (!(fl2Var instanceof m2)) {
                    fl2Var.cancel(z);
                    break;
                }
                this = (r2) fl2Var;
                obj = this.I;
                if (!(obj == null) && !(obj instanceof k2)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.I;
                if (!(obj instanceof k2)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b3 -> B:33:0x0078). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r2.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.I instanceof f2;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r2 instanceof k2)) & (this.I != null);
    }

    public final void j(q2 q2Var) {
        q2Var.a = null;
        while (true) {
            q2 q2Var2 = this.K;
            if (q2Var2 == q2.c) {
                return;
            }
            q2 q2Var3 = null;
            while (q2Var2 != null) {
                q2 q2Var4 = q2Var2.b;
                if (q2Var2.a != null) {
                    q2Var3 = q2Var2;
                } else if (q2Var3 != null) {
                    q2Var3.b = q2Var4;
                    if (q2Var3.a == null) {
                        break;
                    }
                } else if (!N.j(this, q2Var2, q2Var4)) {
                    break;
                }
                q2Var2 = q2Var4;
            }
            return;
        }
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!N.i(this, null, new h2(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r3.isEmpty() != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r6 = "CANCELLED"
            r0.append(r6)
            goto Ld3
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.b(r0)
            goto Ld3
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.I
            boolean r4 = r3 instanceof defpackage.k2
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            k2 r3 = (defpackage.k2) r3
            fl2 r3 = r3.J
            if (r3 != r6) goto L81
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            r3 = move-exception
            goto L85
        L81:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L85:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8f:
            r0.append(r2)
            goto Lc3
        L93:
            java.lang.String r3 = r6.i()     // Catch: java.lang.StackOverflowError -> La0 java.lang.Exception -> La2
            if (r3 == 0) goto La4
            boolean r4 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> La0 java.lang.Exception -> La2
            if (r4 == 0) goto Lb6
            goto La4
        La0:
            r3 = move-exception
            goto La6
        La2:
            r3 = move-exception
            goto La6
        La4:
            r3 = 0
            goto Lb6
        La6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Lb6:
            if (r3 == 0) goto Lc3
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lc3:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Ld3
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.b(r0)
        Ld3:
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r2.toString():java.lang.String");
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        q2 q2Var = q2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.I;
            if ((obj2 != null) & (!(obj2 instanceof k2))) {
                return g(obj2);
            }
            q2 q2Var2 = this.K;
            if (q2Var2 != q2Var) {
                q2 q2Var3 = new q2();
                do {
                    j42 j42Var = N;
                    j42Var.U(q2Var3, q2Var2);
                    if (j42Var.j(this, q2Var2, q2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.I;
                            } else {
                                j(q2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof k2))));
                        return g(obj);
                    }
                    q2Var2 = this.K;
                } while (q2Var2 != q2Var);
            }
            Object obj3 = this.I;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
