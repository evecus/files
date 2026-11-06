package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class c62 implements wy1 {
    public static final /* synthetic */ long J;
    public static final /* synthetic */ long K;
    public static final /* synthetic */ long L;
    public final pa3 I;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    static {
        Unsafe unsafe = gq.a;
        K = unsafe.objectFieldOffset(c62.class.getDeclaredField("_isCompleting$volatile"));
        L = unsafe.objectFieldOffset(c62.class.getDeclaredField("_rootCause$volatile"));
        J = unsafe.objectFieldOffset(c62.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public c62(pa3 pa3Var, Throwable th) {
        this.I = pa3Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c = c();
        if (c == null) {
            gq.a.putObjectVolatile(this, L, th);
            return;
        }
        if (th == c) {
            return;
        }
        Unsafe unsafe = gq.a;
        long j = J;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                zy.h(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    @Override // defpackage.wy1
    public final pa3 b() {
        return this.I;
    }

    public final Throwable c() {
        return (Throwable) gq.a.getObjectVolatile(this, L);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return gq.a.getIntVolatile(this, K) == 1;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = gq.a;
        long j = J;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                zy.h(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable c = c();
        if (c != null) {
            arrayList.add(0, c);
        }
        if (th != null && !th.equals(c)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, p70.u);
        return arrayList;
    }

    @Override // defpackage.wy1
    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + gq.a.getObjectVolatile(this, J) + ", list=" + this.I + ']';
    }
}
