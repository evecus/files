package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ol2 {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public ol2(Context context, WorkerParameters workerParameters) {
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public fl2 getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return g4.H(new yp0(backgroundExecutor, new yw4(this, (byte) 25), (byte) 14));
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final dp0 getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public c25 getTaskExecutor() {
        return this.mWorkerParams.h;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.c;
    }

    public ty5 getWorkerFactory() {
        return this.mWorkerParams.i;
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final fl2 setForegroundAsync(xk1 xk1Var) {
        mx5 mx5Var = this.mWorkerParams.k;
        Context applicationContext = getApplicationContext();
        return il2.x((vj4) mx5Var.a.a, "setForegroundAsync", new hc(mx5Var, getId(), xk1Var, applicationContext, (byte) 7));
    }

    public fl2 setProgressAsync(dp0 dp0Var) {
        dy5 dy5Var = this.mWorkerParams.j;
        getApplicationContext();
        return il2.x((vj4) dy5Var.b.a, "updateProgress", new yj((Object) dy5Var, (Object) getId(), (Object) dp0Var, (byte) 18));
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public fl2 startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return g4.H(new yp0(backgroundExecutor, new iy3(this, (byte) 23), (byte) 14));
    }

    public final void stop(int i) {
        if (this.mStopReason.compareAndSet(-256, i)) {
            onStopped();
        }
    }

    public void onStopped() {
    }
}
