package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class p2 extends j42 {
    public static final long A;
    public static final long B;
    public static final long C;
    public static final long D;
    public static final Unsafe y;
    public static final long z;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new o2());
            }
            try {
                A = unsafe.objectFieldOffset(r2.class.getDeclaredField("K"));
                z = unsafe.objectFieldOffset(r2.class.getDeclaredField("J"));
                B = unsafe.objectFieldOffset(r2.class.getDeclaredField("I"));
                C = unsafe.objectFieldOffset(q2.class.getDeclaredField(CmcdData.OBJECT_TYPE_AUDIO_ONLY));
                D = unsafe.objectFieldOffset(q2.class.getDeclaredField("b"));
                y = unsafe;
            } catch (NoSuchFieldException e) {
                zl1.k(e);
            }
        } catch (PrivilegedActionException e2) {
            s83.p("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // defpackage.j42
    public final q2 A(r2 r2Var) {
        q2 q2Var;
        q2 q2Var2 = q2.c;
        do {
            q2Var = r2Var.K;
            if (q2Var2 == q2Var) {
                break;
            }
        } while (!j(r2Var, q2Var, q2Var2));
        return q2Var;
    }

    @Override // defpackage.j42
    public final void U(q2 q2Var, q2 q2Var2) {
        y.putObject(q2Var, D, q2Var2);
    }

    @Override // defpackage.j42
    public final void V(q2 q2Var, Thread thread) {
        y.putObject(q2Var, C, thread);
    }

    @Override // defpackage.j42
    public final boolean h(r2 r2Var, i2 i2Var, i2 i2Var2) {
        while (true) {
            Unsafe unsafe = y;
            long j = z;
            r2 r2Var2 = r2Var;
            i2 i2Var3 = i2Var;
            i2 i2Var4 = i2Var2;
            if (unsafe.compareAndSwapObject(r2Var2, j, i2Var3, i2Var4)) {
                return true;
            }
            if (unsafe.getObject(r2Var2, j) != i2Var3) {
                return false;
            }
            r2Var = r2Var2;
            i2Var = i2Var3;
            i2Var2 = i2Var4;
        }
    }

    @Override // defpackage.j42
    public final boolean i(r2 r2Var, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = y;
            long j = B;
            r2 r2Var2 = r2Var;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(r2Var2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(r2Var2, j) != obj3) {
                return false;
            }
            r2Var = r2Var2;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override // defpackage.j42
    public final boolean j(r2 r2Var, q2 q2Var, q2 q2Var2) {
        while (true) {
            Unsafe unsafe = y;
            long j = A;
            r2 r2Var2 = r2Var;
            q2 q2Var3 = q2Var;
            q2 q2Var4 = q2Var2;
            if (unsafe.compareAndSwapObject(r2Var2, j, q2Var3, q2Var4)) {
                return true;
            }
            if (unsafe.getObject(r2Var2, j) != q2Var3) {
                return false;
            }
            r2Var = r2Var2;
            q2Var = q2Var3;
            q2Var2 = q2Var4;
        }
    }

    @Override // defpackage.j42
    public final i2 z(r2 r2Var) {
        i2 i2Var;
        i2 i2Var2 = i2.d;
        do {
            i2Var = r2Var.J;
            if (i2Var2 == i2Var) {
                break;
            }
        } while (!h(r2Var, i2Var, i2Var2));
        return i2Var;
    }
}
