package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class le5 implements uc2, Serializable {
    public rm1 I;
    public Object J;

    @Override // defpackage.uc2
    public final Object getValue() {
        Object obj = this.J;
        if (obj != q8.D0) {
            return obj;
        }
        rm1 rm1Var = this.I;
        rm1Var.getClass();
        Object invoke = rm1Var.invoke();
        this.J = invoke;
        this.I = null;
        return invoke;
    }

    public final String toString() {
        return this.J != q8.D0 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
