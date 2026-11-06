package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class os0 extends pb1 {
    public static final os0 J;
    public cl0 I;

    static {
        int i = e25.c;
        int i2 = e25.d;
        long j = e25.e;
        String str = e25.a;
        os0 os0Var = new os0();
        os0Var.I = new cl0(i, i2, j, str);
        J = os0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.vk0
    public final void dispatch(tk0 tk0Var, Runnable runnable) {
        cl0.n(this.I, runnable, 6);
    }

    @Override // defpackage.vk0
    public final void dispatchYield(tk0 tk0Var, Runnable runnable) {
        cl0.n(this.I, runnable, 2);
    }

    @Override // defpackage.vk0
    public final vk0 limitedParallelism(int i, String str) {
        ut0.l(i);
        return i >= e25.c ? str != null ? new x53(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // defpackage.vk0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
