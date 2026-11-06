package okhttp3.internal.connection;

import defpackage.av5;
import defpackage.er0;
import defpackage.j42;
import defpackage.nt3;
import defpackage.rm1;
import defpackage.s24;
import defpackage.sq;
import defpackage.sv2;
import defpackage.t72;
import defpackage.u70;
import defpackage.u75;
import defpackage.zl1;
import defpackage.zy;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Tags;
import okhttp3.internal.TagsKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealCall implements Call, Cloneable, Lockable {
    private static final Companion Companion = new Companion(null);
    private static final AtomicReferenceFieldUpdater<RealCall, EventListener> eventListenerUpdater = AtomicReferenceFieldUpdater.newUpdater(RealCall.class, EventListener.class, "eventListener");
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private volatile EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private final CopyOnWriteArrayList<RoutePlanner.Plan> plansToCancel;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private boolean socketSinkOpen;
    private boolean socketSourceOpen;
    private final AtomicReference<Tags> tags;
    private final RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(RealCall realCall, Callback callback) {
            callback.getClass();
            this.this$0 = realCall;
            this.responseCallback = callback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public static /* synthetic */ void failRejected$okhttp$default(AsyncCall asyncCall, RejectedExecutionException rejectedExecutionException, int i, Object obj) {
            if ((i & 1) != 0) {
                rejectedExecutionException = null;
            }
            asyncCall.failRejected$okhttp(rejectedExecutionException);
        }

        public final void executeOn(ExecutorService executorService) {
            executorService.getClass();
            _UtilJvmKt.assertLockNotHeld(this.this$0.getClient().dispatcher());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    failRejected$okhttp(e);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        public final void failRejected$okhttp(RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            this.this$0.noMoreExchanges$okhttp(interruptedIOException);
            this.responseCallback.onFailure(this.this$0, interruptedIOException);
        }

        public final RealCall getCall() {
            return this.this$0;
        }

        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(AsyncCall asyncCall) {
            asyncCall.getClass();
            this.callsPerHost = asyncCall.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            OkHttpClient client;
            String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            RealCall realCall = this.this$0;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                realCall.timeout.enter();
                boolean z = false;
                try {
                    try {
                        try {
                            this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                            client = realCall.getClient();
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                Platform.Companion.get().log("Callback failure for " + realCall.toLoggableString(), 4, e);
                            } else {
                                this.responseCallback.onFailure(realCall, e);
                            }
                            client = realCall.getClient();
                            client.dispatcher().finished$okhttp(this);
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            realCall.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                iOException.initCause(th);
                                this.responseCallback.onFailure(realCall, iOException);
                            }
                            if (!(th instanceof InterruptedException)) {
                                throw th;
                            }
                            Thread.currentThread().interrupt();
                            client = realCall.getClient();
                            client.dispatcher().finished$okhttp(this);
                        }
                    } catch (Throwable th2) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                client.dispatcher().finished$okhttp(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class CallReference extends WeakReference<RealCall> {
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            realCall.getClass();
            this.callStackTrace = obj;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [okhttp3.internal.connection.RealCall$timeout$1, u75] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        okHttpClient.getClass();
        request.getClass();
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        ?? r5 = new sq() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // defpackage.sq
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        r5.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = r5;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
        this.plansToCancel = new CopyOnWriteArrayList<>();
        this.tags = new AtomicReference<>(request.getTags$okhttp());
    }

    private final IOException callDone(IOException iOException) {
        Socket releaseConnectionNoEvents$okhttp;
        boolean z = _UtilJvmKt.assertionsEnabled;
        if (z && Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return null;
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z && Thread.holdsLock(realConnection)) {
                av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", realConnection);
                return null;
            }
            synchronized (realConnection) {
                releaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (releaseConnectionNoEvents$okhttp != null) {
                    _UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
                realConnection.getConnectionListener$okhttp().connectionReleased(realConnection, this);
                if (releaseConnectionNoEvents$okhttp != null) {
                    realConnection.getConnectionListener$okhttp().connectionClosed(realConnection);
                }
            } else if (releaseConnectionNoEvents$okhttp != null) {
                zy.i("Check failed.");
                return null;
            }
        }
        IOException timeoutExit = timeoutExit(iOException);
        EventListener eventListener = this.eventListener;
        if (iOException == null) {
            eventListener.callEnd(this);
            return timeoutExit;
        }
        timeoutExit.getClass();
        eventListener.callFailed(this, timeoutExit);
        return timeoutExit;
    }

    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    public static /* synthetic */ IOException messageDone$okhttp$default(RealCall realCall, Exchange exchange, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        return realCall.messageDone$okhttp(exchange, z, z2, z3, z4, iOException);
    }

    private final IOException timeoutExit(IOException iOException) {
        if (this.timeoutEarlyExit || !exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toLoggableString() {
        StringBuilder sb = new StringBuilder(isCanceled() ? "canceled " : "");
        sb.append(this.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    public final void acquireConnectionNoEvents(RealConnection realConnection) {
        realConnection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
        } else if (this.connection != null) {
            zy.i("Check failed.");
        } else {
            this.connection = realConnection;
            realConnection.getCalls().add(new CallReference(this, this.callStackTrace));
        }
    }

    @Override // okhttp3.Call
    public void addEventListener(EventListener eventListener) {
        EventListener eventListener2;
        eventListener.getClass();
        do {
            eventListener2 = this.eventListener;
        } while (!nt3.v(eventListenerUpdater, this, eventListener2, eventListener2.plus(eventListener)));
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        Iterator<RoutePlanner.Plan> it = this.plansToCancel.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().mo352cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.Call
    public Call clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // okhttp3.Call
    public void enqueue(Callback callback) {
        callback.getClass();
        if (!this.executed.compareAndSet(false, true)) {
            zy.i("Already Executed");
        } else {
            callStart();
            this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, callback));
        }
    }

    public final void enterNetworkInterceptorExchange(Request request, boolean z, RealInterceptorChain realInterceptorChain) {
        request.getClass();
        realInterceptorChain.getClass();
        if (this.interceptorScopedExchange != null) {
            zy.i("Check failed.");
            return;
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (z) {
            RealRoutePlanner realRoutePlanner = new RealRoutePlanner(this.client.getTaskRunner$okhttp(), realInterceptorChain.getConnectionPool().getDelegate$okhttp(), realInterceptorChain.getReadTimeoutMillis$okhttp(), realInterceptorChain.getWriteTimeoutMillis$okhttp(), realInterceptorChain.getConnectTimeoutMillis$okhttp(), realInterceptorChain.getReadTimeoutMillis$okhttp(), this.client.pingIntervalMillis(), realInterceptorChain.getRetryOnConnectionFailure(), this.client.fastFallback(), realInterceptorChain.address(request.url()), this.client.getRouteDatabase$okhttp(), this, request);
            this.exchangeFinder = this.client.fastFallback() ? new FastFallbackExchangeFinder(realRoutePlanner, this.client.getTaskRunner$okhttp()) : new SequentialExchangeFinder(realRoutePlanner);
        }
    }

    @Override // okhttp3.Call
    public Response execute() {
        if (!this.executed.compareAndSet(false, true)) {
            zy.i("Already Executed");
            return null;
        }
        enter();
        callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final CopyOnWriteArrayList<RoutePlanner.Plan> getPlansToCancel$okhttp() {
        return this.plansToCancel;
    }

    public final Response getResponseWithInterceptorChain$okhttp() {
        ArrayList arrayList = new ArrayList();
        u70.I0(arrayList, this.client.interceptors());
        arrayList.add(new RetryAndFollowUpInterceptor());
        arrayList.add(new BridgeInterceptor());
        arrayList.add(new CacheInterceptor());
        arrayList.add(ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            u70.I0(arrayList, this.client.networkInterceptors());
        }
        arrayList.add(CallServerInterceptor.INSTANCE);
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, null, 32, null);
        boolean z = false;
        try {
            try {
                Response proceed = realInterceptorChain.proceed(this.originalRequest);
                if (isCanceled()) {
                    _UtilCommonKt.closeQuietly(proceed);
                    throw new IOException("Canceled");
                }
                noMoreExchanges$okhttp(null);
                return proceed;
            } catch (IOException e) {
                z = true;
                IOException noMoreExchanges$okhttp = noMoreExchanges$okhttp(e);
                noMoreExchanges$okhttp.getClass();
                throw noMoreExchanges$okhttp;
            }
        } catch (Throwable th) {
            if (!z) {
                noMoreExchanges$okhttp(null);
            }
            throw th;
        }
    }

    public final Exchange initExchange$okhttp(RealInterceptorChain realInterceptorChain) {
        realInterceptorChain.getClass();
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (this.responseBodyOpen || this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                throw new IllegalStateException("Check failed.");
            }
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        exchangeFinder.getClass();
        Exchange exchange = new Exchange(this, exchangeFinder, exchangeFinder.find().newCodec$okhttp(this.client, realInterceptorChain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (!this.canceled) {
            return exchange;
        }
        zl1.g("Canceled");
        return null;
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.executed.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:53:0x0011, B:10:0x002c, B:12:0x0030, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001a, B:46:0x0020, B:49:0x0026), top: B:52:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:53:0x0011, B:10:0x002c, B:12:0x0030, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001a, B:46:0x0020, B:49:0x0026), top: B:52:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:53:0x0011, B:10:0x002c, B:12:0x0030, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001a, B:46:0x0020, B:49:0x0026), top: B:52:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:53:0x0011, B:10:0x002c, B:12:0x0030, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001a, B:46:0x0020, B:49:0x0026), top: B:52:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:53:0x0011, B:10:0x002c, B:12:0x0030, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001a, B:46:0x0020, B:49:0x0026), top: B:52:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException messageDone$okhttp(okhttp3.internal.connection.Exchange r3, boolean r4, boolean r5, boolean r6, boolean r7, java.io.IOException r8) {
        /*
            r2 = this;
            r3.getClass()
            okhttp3.internal.connection.Exchange r0 = r2.exchange
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld
            goto L70
        Ld:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L18
            boolean r0 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L2a
            goto L18
        L16:
            r3 = move-exception
            goto L59
        L18:
            if (r5 == 0) goto L1e
            boolean r0 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L2a
        L1e:
            if (r7 == 0) goto L24
            boolean r0 = r2.socketSinkOpen     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L2a
        L24:
            if (r6 == 0) goto L5b
            boolean r0 = r2.socketSourceOpen     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L5b
        L2a:
            if (r4 == 0) goto L2e
            r2.requestBodyOpen = r3     // Catch: java.lang.Throwable -> L16
        L2e:
            if (r5 == 0) goto L32
            r2.responseBodyOpen = r3     // Catch: java.lang.Throwable -> L16
        L32:
            if (r7 == 0) goto L36
            r2.socketSinkOpen = r3     // Catch: java.lang.Throwable -> L16
        L36:
            if (r6 == 0) goto L3a
            r2.socketSourceOpen = r3     // Catch: java.lang.Throwable -> L16
        L3a:
            boolean r4 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L16
            r5 = 1
            if (r4 != 0) goto L4d
            boolean r4 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L4d
            boolean r4 = r2.socketSinkOpen     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L4d
            boolean r4 = r2.socketSourceOpen     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L4d
            r4 = r5
            goto L4e
        L4d:
            r4 = r3
        L4e:
            if (r4 == 0) goto L55
            boolean r6 = r2.expectMoreExchanges     // Catch: java.lang.Throwable -> L16
            if (r6 != 0) goto L55
            r3 = r5
        L55:
            r1 = r4
            r4 = r3
            r3 = r1
            goto L5c
        L59:
            monitor-exit(r2)
            throw r3
        L5b:
            r4 = r3
        L5c:
            monitor-exit(r2)
            if (r3 == 0) goto L69
            r3 = 0
            r2.exchange = r3
            okhttp3.internal.connection.RealConnection r3 = r2.connection
            if (r3 == 0) goto L69
            r3.incrementSuccessCount$okhttp()
        L69:
            if (r4 == 0) goto L70
            java.io.IOException r2 = r2.callDone(r8)
            return r2
        L70:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.messageDone$okhttp(okhttp3.internal.connection.Exchange, boolean, boolean, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException noMoreExchanges$okhttp(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen && !this.socketSinkOpen) {
                    if (!this.socketSourceOpen) {
                        z = true;
                    }
                }
            }
        }
        return z ? callDone(iOException) : iOException;
    }

    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        realConnection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
            return null;
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (j42.c(it.next().get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            zy.i("Check failed.");
            return null;
        }
        calls.remove(i);
        this.connection = null;
        if (calls.isEmpty()) {
            realConnection.setIdleAtNs(System.nanoTime());
            if (this.connectionPool.connectionBecameIdle(realConnection)) {
                return realConnection.socket();
            }
        }
        return null;
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        Exchange exchange = this.exchange;
        if (exchange == null || !exchange.getHasFailure$okhttp()) {
            return false;
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        exchangeFinder.getClass();
        RoutePlanner routePlanner = exchangeFinder.getRoutePlanner();
        Exchange exchange2 = this.exchange;
        return routePlanner.hasNext(exchange2 != null ? exchange2.getConnection$okhttp() : null);
    }

    public final void setEventListener$okhttp(EventListener eventListener) {
        eventListener.getClass();
        this.eventListener = eventListener;
    }

    @Override // okhttp3.Call
    public <T> T tag(t72 t72Var) {
        t72Var.getClass();
        return (T) sv2.B(t72Var).cast(this.tags.get().get(t72Var));
    }

    @Override // okhttp3.Call
    public u75 timeout() {
        return this.timeout;
    }

    public final void timeoutEarlyExit() {
        if (this.timeoutEarlyExit) {
            zy.i("Check failed.");
        } else {
            this.timeoutEarlyExit = true;
            exit();
        }
    }

    public final void upgradeToSocket() {
        timeoutEarlyExit();
        synchronized (this) {
            if (this.exchange == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.socketSinkOpen || this.socketSourceOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (!this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            this.responseBodyOpen = false;
            this.socketSinkOpen = true;
            this.socketSourceOpen = true;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final AtomicReferenceFieldUpdater<RealCall, EventListener> getEventListenerUpdater() {
            return RealCall.eventListenerUpdater;
        }

        private Companion() {
        }
    }

    @Override // okhttp3.Call
    public <T> T tag(Class<? extends T> cls) {
        cls.getClass();
        return (T) tag(s24.a(cls));
    }

    @Override // okhttp3.Call
    public <T> T tag(t72 t72Var, rm1 rm1Var) {
        t72Var.getClass();
        rm1Var.getClass();
        return (T) TagsKt.computeIfAbsent(this.tags, t72Var, rm1Var);
    }

    @Override // okhttp3.Call
    public <T> T tag(Class<T> cls, rm1 rm1Var) {
        cls.getClass();
        rm1Var.getClass();
        return (T) TagsKt.computeIfAbsent(this.tags, s24.a(cls), rm1Var);
    }
}
