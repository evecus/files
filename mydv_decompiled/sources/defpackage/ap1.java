package defpackage;

import androidx.media3.common.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ap1 extends r3 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, ap1> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected zd5 unknownFields;

    public ap1() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = zd5.f;
    }

    public static ap1 d(Class cls) {
        ap1 ap1Var = defaultInstanceMap.get(cls);
        if (ap1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ap1Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                zl1.i("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (ap1Var != null) {
            return ap1Var;
        }
        try {
            ap1 ap1Var2 = (ap1) ((ap1) ve5.a.allocateInstance(cls)).c(6);
            if (ap1Var2 != null) {
                defaultInstanceMap.put(cls, ap1Var2);
                return ap1Var2;
            }
            s83.r();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object e(Method method, ap1 ap1Var, Object... objArr) {
        try {
            return method.invoke(ap1Var, objArr);
        } catch (IllegalAccessException e) {
            s83.p("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            s83.p("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean f(ap1 ap1Var, boolean z) {
        byte byteValue = ((Byte) ap1Var.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        sx3 sx3Var = sx3.c;
        sx3Var.getClass();
        boolean b = sx3Var.a(ap1Var.getClass()).b(ap1Var);
        if (z) {
            ap1Var.c(2);
        }
        return b;
    }

    public static void j(Class cls, ap1 ap1Var) {
        ap1Var.h();
        defaultInstanceMap.put(cls, ap1Var);
    }

    @Override // defpackage.r3
    public final int a(qa4 qa4Var) {
        int e;
        int e2;
        if (g()) {
            if (qa4Var == null) {
                sx3 sx3Var = sx3.c;
                sx3Var.getClass();
                e2 = sx3Var.a(getClass()).e(this);
            } else {
                e2 = qa4Var.e(this);
            }
            if (e2 >= 0) {
                return e2;
            }
            zy.i(hf1.u(e2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Log.LOG_LEVEL_OFF) != Integer.MAX_VALUE) {
            return i & Log.LOG_LEVEL_OFF;
        }
        if (qa4Var == null) {
            sx3 sx3Var2 = sx3.c;
            sx3Var2.getClass();
            e = sx3Var2.a(getClass()).e(this);
        } else {
            e = qa4Var.e(this);
        }
        k(e);
        return e;
    }

    public final wo1 b() {
        return (wo1) c(5);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sx3 sx3Var = sx3.c;
        sx3Var.getClass();
        return sx3Var.a(getClass()).i(this, (ap1) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Log.LOG_LEVEL_OFF;
    }

    public final int hashCode() {
        if (g()) {
            sx3 sx3Var = sx3.c;
            sx3Var.getClass();
            return sx3Var.a(getClass()).f(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        sx3 sx3Var2 = sx3.c;
        sx3Var2.getClass();
        int f = sx3Var2.a(getClass()).f(this);
        this.memoizedHashCode = f;
        return f;
    }

    public final ap1 i() {
        return (ap1) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            zy.i(hf1.u(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Log.LOG_LEVEL_OFF) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final void l(j70 j70Var) {
        sx3 sx3Var = sx3.c;
        sx3Var.getClass();
        qa4 a = sx3Var.a(getClass());
        uu2 uu2Var = j70Var.a;
        if (uu2Var == null) {
            uu2Var = new uu2();
            Charset charset = p32.a;
            uu2Var.I = j70Var;
            j70Var.a = uu2Var;
        }
        a.h(uu2Var, this);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = cz2.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        cz2.c(this, sb, 0);
        return sb.toString();
    }
}
