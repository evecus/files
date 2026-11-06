package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class lh4 extends sf0 implements za3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(lh4.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long g = gq.a.objectFieldOffset(lh4.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long e;

    public lh4(long j, lh4 lh4Var, int i) {
        super(lh4Var);
        this.e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.sf0
    public final boolean d() {
        return gq.a.getIntVolatile(this, g) == g() && c() != null;
    }

    public final boolean f() {
        return f.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, tk0 tk0Var);

    public final void i() {
        if (f.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = gq.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            lh4 lh4Var = this;
            if (unsafe.compareAndSwapInt(lh4Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = lh4Var;
        }
    }
}
