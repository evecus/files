package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class we5 {
    public static final Logger a = Logger.getLogger(we5.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final ue5 d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we5.<clinit>():void");
    }

    public static int a(Class cls) {
        if (f) {
            return d.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f) {
            d.a.arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field field;
        Field field2;
        if (u9.a()) {
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
        if (!u9.a()) {
            return false;
        }
        try {
            Class cls2 = c;
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
        return d.b(g + j, bArr);
    }

    public static byte f(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int h(long j, Object obj) {
        return d.a.getInt(obj, j);
    }

    public static long i(long j, Object obj) {
        return d.a.getLong(obj, j);
    }

    public static Object j(long j, Object obj) {
        return d.a.getObject(obj, j);
    }

    public static void k(byte[] bArr, long j, byte b2) {
        d.f(bArr, g + j, b2);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int h2 = h(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        n(obj, j2, ((255 & b2) << i) | (h2 & (~(255 << i))));
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        n(obj, j2, ((255 & b2) << i) | (h(j2, obj) & (~(255 << i))));
    }

    public static void n(Object obj, long j, int i) {
        d.a.putInt(obj, j, i);
    }

    public static void o(Object obj, long j, long j2) {
        d.a.putLong(obj, j, j2);
    }

    public static void p(Object obj, long j, Object obj2) {
        d.a.putObject(obj, j, obj2);
    }
}
