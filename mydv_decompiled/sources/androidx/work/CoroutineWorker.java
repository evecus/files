package androidx.work;

import android.content.Context;
import defpackage.dp0;
import defpackage.el0;
import defpackage.fj0;
import defpackage.fl2;
import defpackage.hl0;
import defpackage.il0;
import defpackage.il2;
import defpackage.j42;
import defpackage.jl2;
import defpackage.ol2;
import defpackage.su0;
import defpackage.tk0;
import defpackage.vk0;
import defpackage.vt0;
import defpackage.wd5;
import defpackage.xk1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class CoroutineWorker extends ol2 {
    private final vk0 coroutineContext;
    private final WorkerParameters params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.params = workerParameters;
        this.coroutineContext = hl0.I;
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, fj0 fj0Var) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(fj0 fj0Var);

    public vk0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(fj0 fj0Var) {
        return getForegroundInfo$suspendImpl(this, fj0Var);
    }

    @Override // defpackage.ol2
    public final fl2 getForegroundInfoAsync() {
        return il2.O(getCoroutineContext().plus(vt0.b()), new il0(this, null, (byte) 0));
    }

    public final Object setForeground(xk1 xk1Var, fj0 fj0Var) {
        fl2 foregroundAsync = setForegroundAsync(xk1Var);
        foregroundAsync.getClass();
        Object l = jl2.l(foregroundAsync, fj0Var);
        return l == el0.I ? l : wd5.a;
    }

    public final Object setProgress(dp0 dp0Var, fj0 fj0Var) {
        fl2 progressAsync = setProgressAsync(dp0Var);
        progressAsync.getClass();
        Object l = jl2.l(progressAsync, fj0Var);
        return l == el0.I ? l : wd5.a;
    }

    @Override // defpackage.ol2
    public final fl2 startWork() {
        tk0 coroutineContext = !j42.c(getCoroutineContext(), hl0.I) ? getCoroutineContext() : this.params.g;
        coroutineContext.getClass();
        return il2.O(coroutineContext.plus(vt0.b()), new il0(this, null, (byte) 1));
    }

    @su0
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    @Override // defpackage.ol2
    public final void onStopped() {
    }
}
