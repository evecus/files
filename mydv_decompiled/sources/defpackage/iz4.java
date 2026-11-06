package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class iz4 implements gz4 {
    public static final tr L = new tr((byte) 4);
    public final Object I = new Object();
    public volatile gz4 J;
    public Object K;

    public iz4(gz4 gz4Var) {
        this.J = gz4Var;
    }

    @Override // defpackage.gz4
    public final Object get() {
        gz4 gz4Var = this.J;
        tr trVar = L;
        if (gz4Var != trVar) {
            synchronized (this.I) {
                try {
                    if (this.J != trVar) {
                        Object obj = this.J.get();
                        this.K = obj;
                        this.J = trVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.K;
    }

    public final String toString() {
        Object obj = this.J;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == L) {
            obj = "<supplier that returned " + this.K + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
