package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ir2 {
    public static volatile byte a = 0;
    public static final w53 b = new w53((byte) 1);
    public static final w53 c = new w53((byte) 0);
    public static final boolean d;
    public static volatile w53 e;
    public static final String[] f;

    static {
        String str;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        d = str != null ? str.equalsIgnoreCase("true") : false;
        f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = ir2.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        w53 w53Var = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                if (nt3.h(1) >= nt3.h(j44.b)) {
                    j44.b().println("SLF4J(I): ".concat(str));
                }
                w53Var = (w53) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                j44.a("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e2);
            } catch (ClassNotFoundException e3) {
                e = e3;
                j44.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e4) {
                e = e4;
                j44.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e5) {
                e = e5;
                j44.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e6) {
                e = e6;
                j44.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e7) {
                e = e7;
                j44.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (w53Var != null) {
            arrayList.add(w53Var);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(w53.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: hr2
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(w53.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((w53) it.next());
            } catch (ServiceConfigurationError e8) {
                j44.b().println("SLF4J(E): ".concat("A service provider failed to instantiate:\n" + e8.getMessage()));
            }
        }
        return arrayList;
    }

    public static gr2 b(Class cls) {
        int i;
        gr2 c2 = c(cls.getName());
        if (d) {
            pg5 pg5Var = qg5.a;
            Class cls2 = null;
            if (pg5Var == null) {
                if (qg5.b) {
                    pg5Var = null;
                } else {
                    try {
                        pg5Var = new pg5();
                    } catch (SecurityException unused) {
                        pg5Var = null;
                    }
                    qg5.a = pg5Var;
                    qg5.b = true;
                }
            }
            if (pg5Var != null) {
                Class[] classContext = pg5Var.getClassContext();
                String name = qg5.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    zy.i("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    return null;
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                j44.c("Detected logger name mismatch. Given name: \"" + c2.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                j44.c("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return c2;
    }

    public static gr2 c(String str) {
        w53 w53Var;
        ew1 ew1Var;
        if (a == 0) {
            synchronized (ir2.class) {
                try {
                    if (a == 0) {
                        a = (byte) 1;
                        d();
                    }
                } finally {
                }
            }
        }
        byte b2 = a;
        if (b2 == 1) {
            w53Var = b;
        } else {
            if (b2 == 2) {
                zy.i("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
            if (b2 == 3) {
                w53Var = e;
            } else {
                if (b2 != 4) {
                    zy.i("Unreachable code");
                    return null;
                }
                w53Var = c;
            }
        }
        switch (w53Var.a) {
            case 0:
                ew1Var = (j81) w53Var.b;
                break;
            default:
                ew1Var = (cz4) w53Var.b;
                break;
        }
        return ew1Var.f(str);
    }

    public static final void d() {
        try {
            ArrayList a2 = a();
            g(a2);
            if (a2.isEmpty()) {
                a = (byte) 4;
                j44.c("No SLF4J providers were found.");
                j44.c("Defaulting to no-operation (NOP) logger implementation");
                j44.c("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = ir2.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e2) {
                    j44.a("Error getting resources from path", e2);
                }
                f(linkedHashSet);
            } else {
                e = (w53) a2.get(0);
                e.getClass();
                a = (byte) 3;
                if (!a2.isEmpty() && a2.size() > 1) {
                    String str = "Actual provider is of type [" + a2.get(0) + "]";
                    if (nt3.h(1) >= nt3.h(j44.b)) {
                        j44.b().println("SLF4J(I): ".concat(str));
                    }
                }
            }
            e();
            if (a == 3) {
                try {
                    switch (e.a) {
                        case 0:
                            boolean z = false;
                            for (String str2 : f) {
                                if ("2.0.99".startsWith(str2)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            j44.c("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f).toString());
                            j44.c("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    j44.a("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e3) {
            a = (byte) 2;
            j44.a("Failed to instantiate SLF4J LoggerFactory", e3);
            zl1.i("Unexpected initialization failure", e3);
        }
    }

    public static void e() {
        w53 w53Var = b;
        synchronized (w53Var) {
            try {
                ((cz4) w53Var.b).I = true;
                ArrayList arrayList = new ArrayList(((cz4) w53Var.b).J.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bz4 bz4Var = (bz4) obj;
                    bz4Var.J = c(bz4Var.I);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((cz4) b.b).K;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList(128);
        int i2 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, 128) != 0) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                dz4 dz4Var = (dz4) obj2;
                if (dz4Var != null) {
                    bz4 bz4Var2 = dz4Var.b;
                    String str = bz4Var2.I;
                    if (bz4Var2.J == null) {
                        zy.i("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(bz4Var2.J instanceof v53)) {
                        if (!bz4Var2.o()) {
                            j44.c(str);
                        } else if (bz4Var2.k(dz4Var.a) && bz4Var2.o()) {
                            try {
                                bz4Var2.L.invoke(bz4Var2.J, dz4Var);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i4 = i2 + 1;
                if (i2 == 0) {
                    if (dz4Var.b.o()) {
                        j44.c("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        j44.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        j44.c("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(dz4Var.b.J instanceof v53)) {
                        j44.c("The following set of substitute loggers may have been accessed");
                        j44.c("during the initialization phase. Logging calls during this");
                        j44.c("phase were not honored. However, subsequent logging calls to these");
                        j44.c("loggers will work as normally expected.");
                        j44.c("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i4;
            }
            arrayList2.clear();
        }
        cz4 cz4Var = (cz4) b.b;
        cz4Var.J.clear();
        cz4Var.K.clear();
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        j44.c("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            j44.c("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        j44.c("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void g(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            j44.c("Class path contains multiple SLF4J providers.");
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                j44.c("Found provider [" + ((w53) obj) + "]");
            }
            j44.c("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
