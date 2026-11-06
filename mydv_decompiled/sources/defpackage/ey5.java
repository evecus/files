package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ey5 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ey5.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = gq.a;
        g = unsafe.objectFieldOffset(ey5.class.getDeclaredField("lastScheduledTask$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(ey5.class, "producerIndex$volatile");
        h = unsafe.objectFieldOffset(ey5.class.getDeclaredField("producerIndex$volatile"));
        f = unsafe.objectFieldOffset(ey5.class.getDeclaredField("consumerIndex$volatile"));
        d = AtomicIntegerFieldUpdater.newUpdater(ey5.class, "blockingTasksInBuffer$volatile");
        e = unsafe.objectFieldOffset(ey5.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final b25 a(b25 b25Var) {
        if (b() == 127) {
            return b25Var;
        }
        if (b25Var.J) {
            d.incrementAndGet(this);
        }
        int intVolatile = gq.a.getIntVolatile(this, h) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, b25Var);
                c.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return gq.a.getIntVolatile(this, h) - gq.a.getIntVolatile(this, f);
    }

    public final b25 c() {
        b25 b25Var;
        while (true) {
            Unsafe unsafe = gq.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, h) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            ey5 ey5Var = this;
            if (unsafe.compareAndSwapInt(ey5Var, j, intVolatile, intVolatile + 1) && (b25Var = (b25) ey5Var.a.getAndSet(i, null)) != null) {
                if (b25Var.J) {
                    d.decrementAndGet(ey5Var);
                }
                return b25Var;
            }
            this = ey5Var;
        }
    }

    public final b25 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        b25 b25Var = (b25) atomicReferenceArray.get(i2);
        if (b25Var == null || b25Var.J != z || !nt3.u(atomicReferenceArray, i2, b25Var)) {
            return null;
        }
        if (z) {
            d.decrementAndGet(this);
        }
        return b25Var;
    }
}
