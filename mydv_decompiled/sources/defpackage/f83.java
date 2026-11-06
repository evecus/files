package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class f83 {
    public static final pw a = new pw((byte) 1, false);
    public static final pw b = new pw((byte) 2, false);
    public static final pw c = new pw((byte) 0, false);
    public static final pw d = new pw((byte) 3, true);

    public Object a(Bundle bundle, String str) {
        bundle.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return Float.valueOf(f);
        }
        jl2.W(str);
        throw null;
    }

    public String b() {
        return "float";
    }

    public Object c(Object obj, String str) {
        return d(str);
    }

    public Object d(String str) {
        return Float.valueOf(Float.parseFloat(str));
    }

    public void e(Bundle bundle, String str, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        str.getClass();
        bundle.putFloat(str, floatValue);
    }

    public boolean f(Object obj, Object obj2) {
        return j42.c(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
