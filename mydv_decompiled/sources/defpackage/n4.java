package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class n4 implements fl2 {
    public static final boolean L = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger M = Logger.getLogger(n4.class.getName());
    public static final g4 N;
    public static final Object O;
    public volatile Object I;
    public volatile j4 J;
    public volatile m4 K;

    static {
        g4 l4Var;
        try {
            l4Var = new k4(AtomicReferenceFieldUpdater.newUpdater(m4.class, Thread.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY), AtomicReferenceFieldUpdater.newUpdater(m4.class, m4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n4.class, m4.class, "K"), AtomicReferenceFieldUpdater.newUpdater(n4.class, j4.class, "J"), AtomicReferenceFieldUpdater.newUpdater(n4.class, Object.class, "I"));
            th = null;
        } catch (Throwable th) {
            th = th;
            l4Var = new l4();
        }
        N = l4Var;
        if (th != null) {
            M.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        O = new Object();
    }

    public static void c(n4 n4Var) {
        m4 m4Var;
        j4 j4Var;
        j4 j4Var2;
        j4 j4Var3;
        do {
            m4Var = n4Var.K;
        } while (!N.p(n4Var, m4Var, m4.c));
        while (true) {
            j4Var = null;
            if (m4Var == null) {
                break;
            }
            Thread thread = m4Var.a;
            if (thread != null) {
                m4Var.a = null;
                LockSupport.unpark(thread);
            }
            m4Var = m4Var.b;
        }
        do {
            j4Var2 = n4Var.J;
        } while (!N.n(n4Var, j4Var2, j4.d));
        while (true) {
            j4Var3 = j4Var;
            j4Var = j4Var2;
            if (j4Var == null) {
                break;
            }
            j4Var2 = j4Var.c;
            j4Var.c = j4Var3;
        }
        while (j4Var3 != null) {
            j4 j4Var4 = j4Var3.c;
            d(j4Var3.b, j4Var3.a);
            j4Var3 = j4Var4;
        }
    }

    public static void d(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            M.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof h4) {
            Throwable th = ((h4) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof i4) {
            throw new ExecutionException(((i4) obj).a);
        }
        if (obj == O) {
            return null;
        }
        return obj;
    }

    public static Object f(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // defpackage.fl2
    public final void a(Executor executor, Runnable runnable) {
        executor.getClass();
        j4 j4Var = this.J;
        j4 j4Var2 = j4.d;
        if (j4Var != j4Var2) {
            j4 j4Var3 = new j4(executor, runnable);
            do {
                j4Var3.c = j4Var;
                if (N.n(this, j4Var, j4Var3)) {
                    return;
                } else {
                    j4Var = this.J;
                }
            } while (j4Var != j4Var2);
        }
        d(executor, runnable);
    }

    public final void b(StringBuilder sb) {
        try {
            Object f = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(f == this ? "this future" : String.valueOf(f));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.I;
        if (obj != null) {
            return false;
        }
        if (!N.o(this, obj, L ? new h4(new CancellationException("Future.cancel() was called."), z) : z ? h4.b : h4.c)) {
            return false;
        }
        c(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        m4 m4Var = m4.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.I;
        if (obj != null) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            m4 m4Var2 = this.K;
            if (m4Var2 != m4Var) {
                m4 m4Var3 = new m4();
                do {
                    g4 g4Var = N;
                    g4Var.Y(m4Var3, m4Var2);
                    if (g4Var.p(this, m4Var2, m4Var3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(m4Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.I;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            long nanoTime2 = nanoTime - System.nanoTime();
                            if (nanoTime2 < 1000) {
                                h(m4Var3);
                                nanos = nanoTime2;
                                break;
                            }
                            nanos = nanoTime2;
                        }
                    } else {
                        m4Var2 = this.K;
                    }
                } while (m4Var2 != m4Var);
            }
            return e(this.I);
        }
        while (nanos > 0) {
            Object obj3 = this.I;
            if (obj3 != null) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String n4Var = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder A = hf1.A(j, "Waited ", " ");
        A.append(timeUnit.toString().toLowerCase(locale));
        String sb = A.toString();
        if (nanos + 1000 < 0) {
            String concat = sb.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str = concat + convert + " " + lowerCase;
                if (z) {
                    str = str.concat(",");
                }
                concat = str.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            sb = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(r7.C(sb, " for ", n4Var));
    }

    public final void h(m4 m4Var) {
        m4Var.a = null;
        while (true) {
            m4 m4Var2 = this.K;
            if (m4Var2 == m4.c) {
                return;
            }
            m4 m4Var3 = null;
            while (m4Var2 != null) {
                m4 m4Var4 = m4Var2.b;
                if (m4Var2.a != null) {
                    m4Var3 = m4Var2;
                } else if (m4Var3 != null) {
                    m4Var3.b = m4Var4;
                    if (m4Var3.a == null) {
                        break;
                    }
                } else if (!N.p(this, m4Var2, m4Var4)) {
                    break;
                }
                m4Var2 = m4Var4;
            }
            return;
        }
    }

    public boolean i(Throwable th) {
        if (!N.o(this, null, new i4(th))) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.I instanceof h4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.I != null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.I instanceof h4) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = g();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        m4 m4Var = m4.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.I;
            if (obj2 != null) {
                return e(obj2);
            }
            m4 m4Var2 = this.K;
            if (m4Var2 != m4Var) {
                m4 m4Var3 = new m4();
                do {
                    g4 g4Var = N;
                    g4Var.Y(m4Var3, m4Var2);
                    if (g4Var.p(this, m4Var2, m4Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.I;
                            } else {
                                h(m4Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    m4Var2 = this.K;
                } while (m4Var2 != m4Var);
            }
            return e(this.I);
        }
        throw new InterruptedException();
    }
}
