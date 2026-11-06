package okhttp3.internal.concurrent;

import defpackage.av5;
import defpackage.rm1;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LockableKt {
    public static final void assertLockHeld(Lockable lockable) {
        lockable.getClass();
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(lockable)) {
            return;
        }
        av5.b(Thread.currentThread().getName(), " MUST hold lock on ", lockable);
    }

    public static final void assertLockNotHeld(Lockable lockable) {
        lockable.getClass();
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(lockable)) {
            av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", lockable);
        }
    }

    public static final void awaitNanos(Lockable lockable, long j) {
        lockable.getClass();
        long j2 = j / 1000000;
        long j3 = j - (1000000 * j2);
        if (j2 > 0 || j > 0) {
            lockable.wait(j2, (int) j3);
        }
    }

    public static final void notify(Lockable lockable) {
        lockable.getClass();
        lockable.notify();
    }

    public static final void notifyAll(Lockable lockable) {
        lockable.getClass();
        lockable.notifyAll();
    }

    public static final void wait(Lockable lockable) {
        lockable.getClass();
        lockable.wait();
    }

    public static final <T> T withLock(Lockable lockable, rm1 rm1Var) {
        T t;
        lockable.getClass();
        rm1Var.getClass();
        synchronized (lockable) {
            t = (T) rm1Var.invoke();
        }
        return t;
    }
}
