package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o60 {
    public static final o60 c = new o60();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void c(HashMap hashMap, n60 n60Var, ji2 ji2Var, Class cls) {
        ji2 ji2Var2 = (ji2) hashMap.get(n60Var);
        if (ji2Var2 == null || ji2Var == ji2Var2) {
            if (ji2Var2 == null) {
                hashMap.put(n60Var, ji2Var);
                return;
            }
            return;
        }
        String name = n60Var.b.getName();
        String name2 = cls.getName();
        String valueOf = String.valueOf(ji2Var2);
        String valueOf2 = String.valueOf(ji2Var);
        StringBuilder F = r7.F("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value ");
        F.append(valueOf);
        F.append(", new value ");
        F.append(valueOf2);
        throw new IllegalArgumentException(F.toString());
    }

    public final m60 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            m60 m60Var = (m60) hashMap2.get(superclass);
            if (m60Var == null) {
                m60Var = a(superclass, null);
            }
            hashMap.putAll(m60Var.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            m60 m60Var2 = (m60) hashMap2.get(cls2);
            if (m60Var2 == null) {
                m60Var2 = a(cls2, null);
            }
            for (Map.Entry entry : m60Var2.b.entrySet()) {
                c(hashMap, (n60) entry.getKey(), (ji2) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            re3 re3Var = (re3) method.getAnnotation(re3.class);
            if (re3Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!vi2.class.isAssignableFrom(parameterTypes[0])) {
                        s83.t("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                ji2 value = re3Var.value();
                if (parameterTypes.length > 1) {
                    if (!ji2.class.isAssignableFrom(parameterTypes[1])) {
                        s83.t("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != ji2.ON_ANY) {
                        s83.t("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    s83.t("cannot have more than 2 params");
                    return null;
                }
                c(hashMap, new n60(i, method), value, cls);
                z = true;
            }
        }
        m60 m60Var3 = new m60(hashMap);
        hashMap2.put(cls, m60Var3);
        this.b.put(cls, Boolean.valueOf(z));
        return m60Var3;
    }

    public final boolean b(Class cls) {
        HashMap hashMap = this.b;
        Boolean bool = (Boolean) hashMap.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((re3) method.getAnnotation(re3.class)) != null) {
                    a(cls, declaredMethods);
                    return true;
                }
            }
            hashMap.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
