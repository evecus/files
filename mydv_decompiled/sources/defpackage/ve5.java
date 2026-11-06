package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ve5 {
    public static final Unsafe a;
    public static final Class b;
    public static final ue5 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Unsafe unsafe;
        ue5 ue5Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new pe5((byte) 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = s9.a;
        boolean d2 = d(Long.TYPE);
        boolean d3 = d(Integer.TYPE);
        if (unsafe != null) {
            if (!s9.a()) {
                ue5Var = new se5(unsafe);
            } else if (d2) {
                ue5Var = new qe5(unsafe, (byte) 1);
            } else if (d3) {
                ue5Var = new qe5(unsafe, (byte) 0);
            }
        }
        c = ue5Var;
        d = ue5Var == null ? false : ue5Var.j();
        e = ue5Var == null ? false : ue5Var.i();
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field c2 = c();
        if (c2 != null && ue5Var != null) {
            ue5Var.a.objectFieldOffset(c2);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field field;
        Field field2;
        if (s9.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(Class cls) {
        if (!s9.a()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte e(long j, byte[] bArr) {
        return c.b(f + j, bArr);
    }

    public static byte f(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int h(long j, Object obj) {
        return c.a.getInt(obj, j);
    }

    public static long i(long j, Object obj) {
        return c.a.getLong(obj, j);
    }

    public static Object j(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static void k(Throwable th) {
        Logger.getLogger(ve5.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void l(byte[] bArr, long j, byte b2) {
        c.f(bArr, f + j, b2);
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int h = h(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        o(obj, j2, ((255 & b2) << i) | (h & (~(255 << i))));
    }

    public static void n(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        o(obj, j2, ((255 & b2) << i) | (h(j2, obj) & (~(255 << i))));
    }

    public static void o(Object obj, long j, int i) {
        c.a.putInt(obj, j, i);
    }

    public static void p(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static void q(Object obj, long j, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }
}
