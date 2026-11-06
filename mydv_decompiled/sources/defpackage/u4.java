package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class u4 {
    public xm3 I;
    public boolean K;
    public ScheduledExecutorService L;
    public ScheduledFuture M;
    public final gr2 J = ir2.b(u4.class);
    public final long N = 60000000000L;
    public final Object O = new Object();

    public final void a(dt5 dt5Var, long j) {
        gr2 gr2Var = this.J;
        if (dt5Var != null) {
            if (dt5Var.q < j) {
                gr2Var.e(dt5Var, "Closing connection due to no pong received: {}");
                dt5Var.b(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection", false);
            } else {
                if (dt5Var.i != 2) {
                    gr2Var.e(dt5Var, "Trying to ping a non open connection: {}");
                    return;
                }
                wc4 wc4Var = dt5Var.d;
                xm3 xm3Var = wc4Var.I;
                if (xm3Var == null) {
                    xm3Var = new xm3((byte) 0, 4);
                    wc4Var.I = xm3Var;
                }
                dt5Var.j(Collections.singletonList(xm3Var));
            }
        }
    }

    public final void b() {
        this.K = true;
    }

    public final void c() {
        synchronized (this.O) {
            try {
                long j = this.N;
                gr2 gr2Var = this.J;
                if (j <= 0) {
                    gr2Var.j("Connection lost timer deactivated");
                    return;
                }
                gr2Var.j("Connection lost timer started");
                ScheduledExecutorService scheduledExecutorService = this.L;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    this.L = null;
                }
                ScheduledFuture scheduledFuture = this.M;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.M = null;
                }
                this.L = Executors.newSingleThreadScheduledExecutor(new z53());
                wn1 wn1Var = new wn1((wc4) this);
                ScheduledExecutorService scheduledExecutorService2 = this.L;
                long j2 = this.N;
                this.M = scheduledExecutorService2.scheduleAtFixedRate(wn1Var, j2, j2, TimeUnit.NANOSECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
