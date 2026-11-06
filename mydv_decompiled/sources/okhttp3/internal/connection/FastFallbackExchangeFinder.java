package okhttp3.internal.connection;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FastFallbackExchangeFinder implements ExchangeFinder {
    private final long connectDelayNanos;
    private final BlockingQueue<RoutePlanner.ConnectResult> connectResults;
    private long nextTcpConnectAtNanos;
    private final RoutePlanner routePlanner;
    private final TaskRunner taskRunner;
    private final CopyOnWriteArrayList<RoutePlanner.Plan> tcpConnectsInFlight;

    public FastFallbackExchangeFinder(RoutePlanner routePlanner, TaskRunner taskRunner) {
        routePlanner.getClass();
        taskRunner.getClass();
        this.routePlanner = routePlanner;
        this.taskRunner = taskRunner;
        this.connectDelayNanos = 250000000L;
        this.nextTcpConnectAtNanos = Long.MIN_VALUE;
        this.tcpConnectsInFlight = new CopyOnWriteArrayList<>();
        this.connectResults = taskRunner.getBackend().decorate(new LinkedBlockingDeque());
    }

    private final RoutePlanner.ConnectResult awaitTcpConnect(long j, TimeUnit timeUnit) {
        RoutePlanner.ConnectResult poll;
        if (this.tcpConnectsInFlight.isEmpty() || (poll = this.connectResults.poll(j, timeUnit)) == null) {
            return null;
        }
        this.tcpConnectsInFlight.remove(poll.getPlan());
        return poll;
    }

    private final void cancelInFlightConnects() {
        Iterator<RoutePlanner.Plan> it = this.tcpConnectsInFlight.iterator();
        it.getClass();
        while (it.hasNext()) {
            RoutePlanner.Plan next = it.next();
            next.mo352cancel();
            RoutePlanner.Plan mo354retry = next.mo354retry();
            if (mo354retry != null) {
                getRoutePlanner().getDeferredPlans().addLast(mo354retry);
            }
        }
        this.tcpConnectsInFlight.clear();
    }

    private final RoutePlanner.ConnectResult launchTcpConnect() {
        final RoutePlanner.Plan failedPlan;
        if (getRoutePlanner().hasNext(null)) {
            try {
                failedPlan = getRoutePlanner().plan();
            } catch (Throwable th) {
                failedPlan = new FailedPlan(th);
            }
            if (failedPlan.isReady()) {
                return new RoutePlanner.ConnectResult(failedPlan, null, null, 6, null);
            }
            if (failedPlan instanceof FailedPlan) {
                return ((FailedPlan) failedPlan).getResult();
            }
            this.tcpConnectsInFlight.add(failedPlan);
            final String str = _UtilJvmKt.okHttpName + " connect " + getRoutePlanner().getAddress().url().redact();
            TaskQueue.schedule$default(this.taskRunner.newQueue(), new Task(str) { // from class: okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    RoutePlanner.ConnectResult connectResult;
                    CopyOnWriteArrayList copyOnWriteArrayList;
                    BlockingQueue blockingQueue;
                    try {
                        connectResult = failedPlan.mo356connectTcp();
                    } catch (Throwable th2) {
                        connectResult = new RoutePlanner.ConnectResult(failedPlan, null, th2, 2, null);
                    }
                    copyOnWriteArrayList = this.tcpConnectsInFlight;
                    if (!copyOnWriteArrayList.contains(failedPlan)) {
                        return -1L;
                    }
                    blockingQueue = this.connectResults;
                    blockingQueue.put(connectResult);
                    return -1L;
                }
            }, 0L, 2, null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a4, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009e, code lost:
    
        cancelInFlightConnects();
        r1.getClass();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0002, B:5:0x000a, B:12:0x0018, B:14:0x0022, B:21:0x004c, B:24:0x0055, B:26:0x005b, B:28:0x0068, B:29:0x0070, B:32:0x0076, B:35:0x0082, B:37:0x0088, B:40:0x008e, B:41:0x0095, B:44:0x0092, B:46:0x00a5, B:47:0x00a6, B:50:0x00ac, B:58:0x0041, B:60:0x00b9, B:61:0x00c0), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0002, B:5:0x000a, B:12:0x0018, B:14:0x0022, B:21:0x004c, B:24:0x0055, B:26:0x005b, B:28:0x0068, B:29:0x0070, B:32:0x0076, B:35:0x0082, B:37:0x0088, B:40:0x008e, B:41:0x0095, B:44:0x0092, B:46:0x00a5, B:47:0x00a6, B:50:0x00ac, B:58:0x0041, B:60:0x00b9, B:61:0x00c0), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0002 A[SYNTHETIC] */
    @Override // okhttp3.internal.connection.ExchangeFinder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.internal.connection.RealConnection find() {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r2 = r8.tcpConnectsInFlight     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L18
            okhttp3.internal.connection.RoutePlanner r2 = r8.getRoutePlanner()     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L9e
            goto L18
        L15:
            r0 = move-exception
            goto Lc1
        L18:
            okhttp3.internal.connection.RoutePlanner r2 = r8.getRoutePlanner()     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.isCanceled()     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto Lb9
            okhttp3.internal.concurrent.TaskRunner r2 = r8.taskRunner     // Catch: java.lang.Throwable -> L15
            okhttp3.internal.concurrent.TaskRunner$Backend r2 = r2.getBackend()     // Catch: java.lang.Throwable -> L15
            long r2 = r2.nanoTime()     // Catch: java.lang.Throwable -> L15
            long r4 = r8.nextTcpConnectAtNanos     // Catch: java.lang.Throwable -> L15
            long r4 = r4 - r2
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r6 = r8.tcpConnectsInFlight     // Catch: java.lang.Throwable -> L15
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r6 != 0) goto L41
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L3e
            goto L41
        L3e:
            r5 = r4
            r4 = r0
            goto L4a
        L41:
            okhttp3.internal.connection.RoutePlanner$ConnectResult r4 = r8.launchTcpConnect()     // Catch: java.lang.Throwable -> L15
            long r5 = r8.connectDelayNanos     // Catch: java.lang.Throwable -> L15
            long r2 = r2 + r5
            r8.nextTcpConnectAtNanos = r2     // Catch: java.lang.Throwable -> L15
        L4a:
            if (r4 != 0) goto L55
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L15
            okhttp3.internal.connection.RoutePlanner$ConnectResult r4 = r8.awaitTcpConnect(r5, r2)     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L55
            goto L2
        L55:
            boolean r2 = r4.isSuccess()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L82
            r8.cancelInFlightConnects()     // Catch: java.lang.Throwable -> L15
            okhttp3.internal.connection.RoutePlanner$Plan r2 = r4.getPlan()     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.isReady()     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L70
            okhttp3.internal.connection.RoutePlanner$Plan r2 = r4.getPlan()     // Catch: java.lang.Throwable -> L15
            okhttp3.internal.connection.RoutePlanner$ConnectResult r4 = r2.mo357connectTlsEtc()     // Catch: java.lang.Throwable -> L15
        L70:
            boolean r2 = r4.isSuccess()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L82
            okhttp3.internal.connection.RoutePlanner$Plan r0 = r4.getPlan()     // Catch: java.lang.Throwable -> L15
            okhttp3.internal.connection.RealConnection r0 = r0.mo353handleSuccess()     // Catch: java.lang.Throwable -> L15
            r8.cancelInFlightConnects()
            return r0
        L82:
            java.lang.Throwable r2 = r4.getThrowable()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto La6
            boolean r3 = r2 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto La5
            if (r1 != 0) goto L92
            r1 = r2
            java.io.IOException r1 = (java.io.IOException) r1     // Catch: java.lang.Throwable -> L15
            goto L95
        L92:
            defpackage.sv2.i(r1, r2)     // Catch: java.lang.Throwable -> L15
        L95:
            java.io.IOException r2 = (java.io.IOException) r2     // Catch: java.lang.Throwable -> L15
            boolean r2 = okhttp3.internal.connection.RetryTlsHandshakeKt.attemptAnotherConnection(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L9e
            goto La6
        L9e:
            r8.cancelInFlightConnects()
            r1.getClass()
            throw r1
        La5:
            throw r2     // Catch: java.lang.Throwable -> L15
        La6:
            okhttp3.internal.connection.RoutePlanner$Plan r2 = r4.getNextPlan()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L2
            okhttp3.internal.connection.RoutePlanner r3 = r8.getRoutePlanner()     // Catch: java.lang.Throwable -> L15
            pp r3 = r3.getDeferredPlans()     // Catch: java.lang.Throwable -> L15
            r3.addFirst(r2)     // Catch: java.lang.Throwable -> L15
            goto L2
        Lb9:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        Lc1:
            r8.cancelInFlightConnects()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.FastFallbackExchangeFinder.find():okhttp3.internal.connection.RealConnection");
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public RoutePlanner getRoutePlanner() {
        return this.routePlanner;
    }
}
