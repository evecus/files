package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class u05 implements uc2, Serializable {
    public rm1 I;
    public volatile Object J;
    public final Object K;

    public u05(rm1 rm1Var) {
        rm1Var.getClass();
        this.I = rm1Var;
        this.J = q8.D0;
        this.K = this;
    }

    @Override // defpackage.uc2
    public final Object getValue() {
        Object obj;
        Object obj2 = this.J;
        q8 q8Var = q8.D0;
        if (obj2 != q8Var) {
            return obj2;
        }
        synchronized (this.K) {
            obj = this.J;
            if (obj == q8Var) {
                rm1 rm1Var = this.I;
                rm1Var.getClass();
                obj = rm1Var.invoke();
                this.J = obj;
                this.I = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.J != q8.D0 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
