package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n60 {
    public final int a;
    public final Method b;

    public n60(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n60)) {
            return false;
        }
        n60 n60Var = (n60) obj;
        return this.a == n60Var.a && this.b.getName().equals(n60Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
