package defpackage;

import java.lang.Thread;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class et5 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ ft5 a;

    public et5(ft5 ft5Var) {
        this.a = ft5Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.a.J.P.c(thread.getName(), th);
    }
}
