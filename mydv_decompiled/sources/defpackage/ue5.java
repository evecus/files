package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ue5 {
    public final Unsafe a;

    public boolean a(long j, Object obj) {
        return this.a.getBoolean(obj, j);
    }

    public byte b(long j, Object obj) {
        return this.a.getByte(obj, j);
    }

    public double c(long j, Object obj) {
        return this.a.getDouble(obj, j);
    }

    public float d(long j, Object obj) {
        return this.a.getFloat(obj, j);
    }

    public void e(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    public void f(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    public void g(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    public void h(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    public boolean i() {
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            ve5.k(th);
            return false;
        }
    }

    public abstract boolean j();
}
