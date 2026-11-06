package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mx0 extends Exception {
    public final Throwable I;

    public mx0(Throwable th, vk0 vk0Var, tk0 tk0Var) {
        super("Coroutine dispatcher " + vk0Var + " threw an exception, context = " + tk0Var, th);
        this.I = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.I;
    }
}
