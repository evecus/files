package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class bp1 extends s3 {
    private static Map<Object, bp1> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected ae5 unknownFields;

    public bp1() {
        this.memoizedHashCode = 0;
        this.unknownFields = ae5.f;
        this.memoizedSerializedSize = -1;
    }

    public static bp1 e(Class cls) {
        bp1 bp1Var = defaultInstanceMap.get(cls);
        if (bp1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                bp1Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                zl1.i("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (bp1Var != null) {
            return bp1Var;
        }
        try {
            bp1 bp1Var2 = (bp1) ((bp1) we5.b.allocateInstance(cls)).d(6);
            if (bp1Var2 != null) {
                defaultInstanceMap.put(cls, bp1Var2);
                return bp1Var2;
            }
            s83.r();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object f(Method method, bp1 bp1Var, Object... objArr) {
        try {
            return method.invoke(bp1Var, objArr);
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

    public static void h(Class cls, bp1 bp1Var) {
        defaultInstanceMap.put(cls, bp1Var);
    }

    @Override // defpackage.s3
    public final int a() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        tx3 tx3Var = tx3.c;
        tx3Var.getClass();
        int h = tx3Var.a(getClass()).h(this);
        this.memoizedSerializedSize = h;
        return h;
    }

    @Override // defpackage.s3
    public final void c(i70 i70Var) {
        tx3 tx3Var = tx3.c;
        tx3Var.getClass();
        ra4 a = tx3Var.a(getClass());
        uu2 uu2Var = i70Var.a;
        if (uu2Var == null) {
            uu2Var = new uu2();
            Charset charset = r32.a;
            uu2Var.I = i70Var;
            i70Var.a = uu2Var;
        }
        a.i(uu2Var, this);
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((bp1) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        tx3 tx3Var = tx3.c;
        tx3Var.getClass();
        return tx3Var.a(getClass()).d(this, (bp1) obj);
    }

    public final boolean g() {
        byte byteValue = ((Byte) d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        tx3 tx3Var = tx3.c;
        tx3Var.getClass();
        boolean b = tx3Var.a(getClass()).b(this);
        d(2);
        return b;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        tx3 tx3Var = tx3.c;
        tx3Var.getClass();
        int e = tx3Var.a(getClass()).e(this);
        this.memoizedHashCode = e;
        return e;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        qg5.C0(this, sb, 0);
        return sb.toString();
    }
}
