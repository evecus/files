package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class cj2 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, ui2 ui2Var) {
        try {
            Object newInstance = constructor.newInstance(ui2Var);
            newInstance.getClass();
            i82.W(newInstance);
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor constructor;
        HashMap hashMap = a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            int i2 = 0;
            ArrayList arrayList = null;
            try {
                Package r5 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r5 != null ? r5.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String concat = qx4.x(canonicalName, ".", "_", false).concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + "." + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                zl1.k(e);
                return 0;
            }
            HashMap hashMap2 = b;
            if (constructor != null) {
                hashMap2.put(cls, p70.j0(constructor));
            } else if (!o60.c.b(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass != null && ui2.class.isAssignableFrom(superclass)) {
                    superclass.getClass();
                    if (b(superclass) != 1) {
                        Object obj = hashMap2.get(superclass);
                        obj.getClass();
                        arrayList = new ArrayList((Collection) obj);
                    }
                }
                Class<?>[] interfaces = cls.getInterfaces();
                interfaces.getClass();
                int length = interfaces.length;
                while (true) {
                    if (i2 < length) {
                        Class<?> cls2 = interfaces[i2];
                        if (cls2 != null && ui2.class.isAssignableFrom(cls2)) {
                            cls2.getClass();
                            if (b(cls2) == 1) {
                                break;
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Object obj2 = hashMap2.get(cls2);
                            obj2.getClass();
                            arrayList.addAll((Collection) obj2);
                        }
                        i2++;
                    } else if (arrayList != null) {
                        hashMap2.put(cls, arrayList);
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}
