package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k60 implements t72, i60 {
    public static final Map J;
    public final Class I;

    static {
        int i = 0;
        List k0 = p70.k0(rm1.class, tm1.class, hn1.class, in1.class, jn1.class, kn1.class, ln1.class, mn1.class, nn1.class, on1.class, sm1.class, um1.class, vm1.class, wm1.class, xm1.class, ym1.class, zm1.class, an1.class, bn1.class, cn1.class, en1.class, fn1.class, gn1.class);
        ArrayList arrayList = new ArrayList(p70.J(k0, 10));
        for (Object obj : k0) {
            int i2 = i + 1;
            if (i < 0) {
                p70.A0();
                throw null;
            }
            arrayList.add(new uj3((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        J = sv2.W(arrayList);
    }

    public k60(Class cls) {
        cls.getClass();
        this.I = cls;
    }

    @Override // defpackage.i60
    public final Class a() {
        return this.I;
    }

    public final String b() {
        String w;
        Class cls = this.I;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String w2 = qb.w(cls.getName());
            return w2 == null ? cls.getCanonicalName() : w2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (w = qb.w(componentType.getName())) != null) {
            str = w.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String c() {
        String f0;
        Class cls = this.I;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String f02 = qb.f0(cls.getName());
                return f02 == null ? cls.getSimpleName() : f02;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (f0 = qb.f0(componentType.getName())) != null) {
                str = f0.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return jx4.a0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return jx4.Z('$', simpleName, simpleName);
        }
        return jx4.a0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean d(Object obj) {
        Class cls = this.I;
        cls.getClass();
        Map map = J;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return p70.Y(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = sv2.C(s24.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k60) && sv2.C(this).equals(sv2.C((t72) obj));
    }

    public final int hashCode() {
        return sv2.C(this).hashCode();
    }

    public final String toString() {
        return this.I.toString() + " (Kotlin reflection is not available)";
    }
}
