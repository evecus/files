package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rl1 {
    public static final oo4 b = new oo4(0);
    public final /* synthetic */ tl1 a;

    public rl1(tl1 tl1Var) {
        this.a = tl1Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        oo4 oo4Var = b;
        oo4 oo4Var2 = (oo4) oo4Var.get(classLoader);
        if (oo4Var2 == null) {
            oo4Var2 = new oo4(0);
            oo4Var.put(classLoader, oo4Var2);
        }
        Class cls = (Class) oo4Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        oo4Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new vb0(r7.C("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new vb0(r7.C("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final void a(String str) {
        try {
            r7.K(c(this.a.r.I.getClassLoader(), str).getConstructor(null).newInstance(null));
        } catch (IllegalAccessException e) {
            throw new vb0(r7.C("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new vb0(r7.C("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new vb0(r7.C("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new vb0(r7.C("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
