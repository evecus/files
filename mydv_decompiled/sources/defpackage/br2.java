package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class br2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(br2.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = gq.a.objectFieldOffset(br2.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new dr2(8, false);

    public final boolean a(Runnable runnable) {
        br2 br2Var;
        while (true) {
            Unsafe unsafe = gq.a;
            long j = b;
            dr2 dr2Var = (dr2) unsafe.getObjectVolatile(this, j);
            int a2 = dr2Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                dr2 c = dr2Var.c();
                while (true) {
                    Unsafe unsafe2 = gq.a;
                    br2Var = this;
                    if (!unsafe2.compareAndSwapObject(br2Var, b, dr2Var, c) && unsafe2.getObjectVolatile(br2Var, j) == dr2Var) {
                        this = br2Var;
                    }
                }
            } else {
                if (a2 == 2) {
                    return false;
                }
                br2Var = this;
            }
            this = br2Var;
        }
    }

    public final int b() {
        dr2 dr2Var = (dr2) gq.a.getObjectVolatile(this, b);
        dr2Var.getClass();
        long longVolatile = gq.a.getLongVolatile(dr2Var, dr2.h);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object c() {
        br2 br2Var;
        while (true) {
            Unsafe unsafe = gq.a;
            long j = b;
            dr2 dr2Var = (dr2) unsafe.getObjectVolatile(this, j);
            Object d = dr2Var.d();
            if (d != dr2.f) {
                return d;
            }
            dr2 c = dr2Var.c();
            while (true) {
                br2Var = this;
                if (!gq.a.compareAndSwapObject(br2Var, b, dr2Var, c) && gq.a.getObjectVolatile(br2Var, j) == dr2Var) {
                    this = br2Var;
                }
            }
            this = br2Var;
        }
    }
}
