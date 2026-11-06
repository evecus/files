package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class sf0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(sf0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = gq.a;
        c = unsafe.objectFieldOffset(sf0.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(sf0.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(sf0.class.getDeclaredField("_prev$volatile"));
    }

    public sf0(lh4 lh4Var) {
        this._prev$volatile = lh4Var;
    }

    public final void b() {
        gq.a.putObjectVolatile(this, d, (Object) null);
    }

    public final sf0 c() {
        Object objectVolatile = gq.a.getObjectVolatile(this, c);
        if (objectVolatile == qb.d) {
            return null;
        }
        return (sf0) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        Unsafe unsafe;
        Object objectVolatile;
        sf0 c2;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = gq.a;
            long j = d;
            sf0 sf0Var = (sf0) unsafe2.getObjectVolatile(this, j);
            while (sf0Var != null && sf0Var.d()) {
                sf0Var = (sf0) gq.a.getObjectVolatile(sf0Var, j);
            }
            sf0 c3 = c();
            c3.getClass();
            while (c3.d() && (c2 = c3.c()) != null) {
                c3 = c2;
            }
            do {
                unsafe = gq.a;
                objectVolatile = unsafe.getObjectVolatile(c3, j);
            } while (!pt1.E(c3, objectVolatile, ((sf0) objectVolatile) == null ? null : sf0Var));
            if (sf0Var != null) {
                unsafe.putObjectVolatile(sf0Var, c, c3);
            }
            if (!c3.d() || c3.c() == null) {
                if (sf0Var == null || !sf0Var.d()) {
                    return;
                }
            }
        }
    }
}
