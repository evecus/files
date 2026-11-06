package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ur0 extends pb1 implements Executor {
    public static final ur0 I = new ur0();
    public static final vk0 J;

    static {
        de5 de5Var = de5.I;
        int i = h15.a;
        if (64 >= i) {
            i = 64;
        }
        J = vk0.limitedParallelism$default(de5Var, oh4.u(i, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.vk0
    public final void dispatch(tk0 tk0Var, Runnable runnable) {
        J.dispatch(tk0Var, runnable);
    }

    @Override // defpackage.vk0
    public final void dispatchYield(tk0 tk0Var, Runnable runnable) {
        J.dispatchYield(tk0Var, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(l91.I, runnable);
    }

    @Override // defpackage.vk0
    public final vk0 limitedParallelism(int i, String str) {
        return de5.I.limitedParallelism(i, str);
    }

    @Override // defpackage.vk0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
