package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lh0 implements InvocationHandler {
    public final k60 a;
    public final sc1 b;

    public lh0(k60 k60Var, sc1 sc1Var) {
        this.a = k60Var;
        this.b = sc1Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean c = j42.c(method.getName(), "accept");
        sc1 sc1Var = this.b;
        if (c && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            k60 k60Var = this.a;
            if (k60Var.d(obj2)) {
                obj2.getClass();
                sc1Var.invoke(obj2);
                return wd5.a;
            }
            throw new ClassCastException("Value cannot be cast to " + k60Var.b());
        }
        if (j42.c(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (j42.c(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(sc1Var.hashCode());
        }
        if (j42.c(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return sc1Var.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
