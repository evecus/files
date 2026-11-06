package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class x65 {
    public static final ThreadLocal a = new ThreadLocal();

    public static eb1 a() {
        ThreadLocal threadLocal = a;
        eb1 eb1Var = (eb1) threadLocal.get();
        if (eb1Var != null) {
            return eb1Var;
        }
        nw nwVar = new nw(Thread.currentThread());
        threadLocal.set(nwVar);
        return nwVar;
    }
}
