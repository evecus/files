package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ir0 extends jb1 implements Runnable {
    public static final ir0 Q;
    public static final long R;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        ir0 ir0Var = new ir0();
        Q = ir0Var;
        ir0Var.c0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        R = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.jb1
    public final void f0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.f0(runnable);
    }

    @Override // defpackage.jb1
    public final Thread i0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(Q.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.jb1
    public final void k0(long j, hb1 hb1Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void m0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = gq.a;
            unsafe.putObjectVolatile(this, jb1.P, (Object) null);
            unsafe.putObjectVolatile(this, jb1.N, (Object) null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean j0;
        x65.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (j0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long d0 = d0();
                    if (d0 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = R + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m0();
                            if (j0()) {
                                return;
                            }
                            i0();
                            return;
                        }
                        if (d0 > j2) {
                            d0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (d0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m0();
                            if (j0()) {
                                return;
                            }
                            i0();
                            return;
                        }
                        LockSupport.parkNanos(this, d0);
                    }
                }
            }
        } finally {
            _thread = null;
            m0();
            if (!j0()) {
                i0();
            }
        }
    }

    @Override // defpackage.jb1, defpackage.eb1
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.vk0
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.jb1, defpackage.pt0
    public final cy0 y(long j, Runnable runnable, tk0 tk0Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return ua3.I;
        }
        long nanoTime = System.nanoTime();
        gb1 gb1Var = new gb1(runnable, j2 + nanoTime);
        l0(nanoTime, gb1Var);
        return gb1Var;
    }
}
