package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hz4 implements gz4, Serializable {
    public final transient Object I = new Object();
    public final gz4 J;
    public volatile transient boolean K;
    public transient Object L;

    public hz4(gz4 gz4Var) {
        this.J = gz4Var;
    }

    @Override // defpackage.gz4
    public final Object get() {
        if (!this.K) {
            synchronized (this.I) {
                try {
                    if (!this.K) {
                        Object obj = this.J.get();
                        this.L = obj;
                        this.K = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.L;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.K) {
            obj = "<supplier that returned " + this.L + ">";
        } else {
            obj = this.J;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
