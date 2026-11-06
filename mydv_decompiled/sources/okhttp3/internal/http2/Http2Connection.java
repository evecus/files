package okhttp3.internal.http2;

import androidx.media3.common.C;
import defpackage.av5;
import defpackage.ce;
import defpackage.cz;
import defpackage.er0;
import defpackage.h00;
import defpackage.hf1;
import defpackage.j42;
import defpackage.ka;
import defpackage.mz;
import defpackage.r24;
import defpackage.r7;
import defpackage.rm1;
import defpackage.uv1;
import defpackage.wa1;
import defpackage.wd5;
import defpackage.wv1;
import defpackage.zv1;
import defpackage.zy;
import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Http2Connection implements Closeable, Lockable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private final FlowControlListener flowControlListener;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private final WindowCounter readBytes;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final BufferedSocket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private FlowControlListener flowControlListener;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public BufferedSocket socket;
        private final TaskRunner taskRunner;

        public Builder(boolean z, TaskRunner taskRunner) {
            taskRunner.getClass();
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
            this.flowControlListener = FlowControlListener.None.INSTANCE;
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final Builder flowControlListener(FlowControlListener flowControlListener) {
            flowControlListener.getClass();
            this.flowControlListener = flowControlListener;
            return this;
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            j42.g0("connectionName");
            throw null;
        }

        public final FlowControlListener getFlowControlListener$okhttp() {
            return this.flowControlListener;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final BufferedSocket getSocket$okhttp() {
            BufferedSocket bufferedSocket = this.socket;
            if (bufferedSocket != null) {
                return bufferedSocket;
            }
            j42.g0("socket");
            throw null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            listener.getClass();
            this.listener = listener;
            return this;
        }

        public final Builder pingIntervalMillis(int i) {
            this.pingIntervalMillis = i;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            pushObserver.getClass();
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(String str) {
            str.getClass();
            this.connectionName = str;
        }

        public final void setFlowControlListener$okhttp(FlowControlListener flowControlListener) {
            flowControlListener.getClass();
            this.flowControlListener = flowControlListener;
        }

        public final void setListener$okhttp(Listener listener) {
            listener.getClass();
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            pushObserver.getClass();
            this.pushObserver = pushObserver;
        }

        public final void setSocket$okhttp(BufferedSocket bufferedSocket) {
            bufferedSocket.getClass();
            this.socket = bufferedSocket;
        }

        public final Builder socket(BufferedSocket bufferedSocket, String str) {
            String concat;
            bufferedSocket.getClass();
            str.getClass();
            setSocket$okhttp(bufferedSocket);
            if (this.client) {
                concat = _UtilJvmKt.okHttpName + ' ' + str;
            } else {
                concat = "MockWebServer ".concat(str);
            }
            setConnectionName$okhttp(concat);
            return this;
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(4, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        builder.getClass();
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue newQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        this.flowControlListener = builder.getFlowControlListener$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(4, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        byte b = 0;
        this.readBytes = new WindowCounter(0);
        this.writeBytesMaximum = this.peerSettings.getInitialWindowSize();
        BufferedSocket socket$okhttp = builder.getSocket$okhttp();
        this.socket = socket$okhttp;
        this.writer = new Http2Writer(socket$okhttp.getSink(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(socket$okhttp.getSource(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            newQueue.schedule(r7.B(connectionName$okhttp, " ping"), nanos, new uv1(this, nanos, b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$0(Http2Connection http2Connection, long j) {
        boolean z;
        synchronized (http2Connection) {
            long j2 = http2Connection.intervalPongsReceived;
            long j3 = http2Connection.intervalPingsSent;
            if (j2 < j3) {
                z = true;
            } else {
                http2Connection.intervalPingsSent = j3 + 1;
                z = false;
            }
        }
        if (z) {
            http2Connection.failConnection(null);
            return -1L;
        }
        http2Connection.writePing(false, 1, 0);
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x0027, B:16:0x002c, B:18:0x0034, B:22:0x0047, B:24:0x004d, B:41:0x0080, B:42:0x0085), top: B:10:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.internal.http2.Http2Stream newStream(int r10, java.util.List<okhttp3.internal.http2.Header> r11, boolean r12) {
        /*
            r9 = this;
            r3 = r12 ^ 1
            okhttp3.internal.http2.Http2Writer r6 = r9.writer
            monitor-enter(r6)
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L5f
            int r0 = r9.nextStreamId     // Catch: java.lang.Throwable -> L7c
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L18
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L13
            r9.shutdown(r0)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L86
        L18:
            boolean r0 = r9.isShutdown     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L7f
            int r1 = r9.nextStreamId     // Catch: java.lang.Throwable -> L7c
            int r0 = r1 + 2
            r9.nextStreamId = r0     // Catch: java.lang.Throwable -> L7c
            okhttp3.internal.http2.Http2Stream r0 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L7c
            r5 = 0
            r4 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L43
            if (r12 == 0) goto L46
            long r4 = r2.writeBytesTotal     // Catch: java.lang.Throwable -> L43
            long r7 = r2.writeBytesMaximum     // Catch: java.lang.Throwable -> L43
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L46
            long r4 = r0.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L43
            long r7 = r0.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L43
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L41
            goto L46
        L41:
            r9 = 0
            goto L47
        L43:
            r0 = move-exception
        L44:
            r10 = r0
            goto L86
        L46:
            r9 = 1
        L47:
            boolean r12 = r0.isOpen()     // Catch: java.lang.Throwable -> L43
            if (r12 == 0) goto L56
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r12 = r2.streams     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L43
            r12.put(r4, r0)     // Catch: java.lang.Throwable -> L43
        L56:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5f
            if (r10 != 0) goto L62
            okhttp3.internal.http2.Http2Writer r10 = r2.writer     // Catch: java.lang.Throwable -> L5f
            r10.headers(r3, r1, r11)     // Catch: java.lang.Throwable -> L5f
            goto L6b
        L5f:
            r0 = move-exception
            r9 = r0
            goto L88
        L62:
            boolean r12 = r2.client     // Catch: java.lang.Throwable -> L5f
            if (r12 != 0) goto L74
            okhttp3.internal.http2.Http2Writer r12 = r2.writer     // Catch: java.lang.Throwable -> L5f
            r12.pushPromise(r10, r1, r11)     // Catch: java.lang.Throwable -> L5f
        L6b:
            monitor-exit(r6)
            if (r9 == 0) goto L73
            okhttp3.internal.http2.Http2Writer r9 = r2.writer
            r9.flush()
        L73:
            return r0
        L74:
            java.lang.String r9 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5f
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L5f
            throw r10     // Catch: java.lang.Throwable -> L5f
        L7c:
            r0 = move-exception
            r2 = r9
            goto L44
        L7f:
            r2 = r9
            okhttp3.internal.http2.ConnectionShutdownException r9 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L43
            r9.<init>()     // Catch: java.lang.Throwable -> L43
            throw r9     // Catch: java.lang.Throwable -> L43
        L86:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5f
            throw r10     // Catch: java.lang.Throwable -> L5f
        L88:
            monitor-exit(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 pushDataLater$lambda$0(Http2Connection http2Connection, int i, cz czVar, int i2, boolean z) {
        try {
            boolean onData = http2Connection.pushObserver.onData(i, czVar, i2, z);
            if (onData) {
                http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
            }
            if (onData || z) {
                synchronized (http2Connection) {
                    http2Connection.currentPushRequests.remove(Integer.valueOf(i));
                }
            }
        } catch (IOException unused) {
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 pushHeadersLater$lambda$0(Http2Connection http2Connection, int i, List list, boolean z) {
        boolean onHeaders = http2Connection.pushObserver.onHeaders(i, list, z);
        if (onHeaders) {
            try {
                http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
            } catch (IOException unused) {
            }
        }
        if (onHeaders || z) {
            synchronized (http2Connection) {
                http2Connection.currentPushRequests.remove(Integer.valueOf(i));
            }
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 pushRequestLater$lambda$1(Http2Connection http2Connection, int i, List list) {
        if (http2Connection.pushObserver.onRequest(i, list)) {
            try {
                http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
                synchronized (http2Connection) {
                    http2Connection.currentPushRequests.remove(Integer.valueOf(i));
                }
            } catch (IOException unused) {
            }
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 pushResetLater$lambda$0(Http2Connection http2Connection, int i, ErrorCode errorCode) {
        http2Connection.pushObserver.onReset(i, errorCode);
        synchronized (http2Connection) {
            http2Connection.currentPushRequests.remove(Integer.valueOf(i));
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 sendDegradedPingLater$lambda$1(Http2Connection http2Connection) {
        http2Connection.writePing(false, 2, 0);
        return wd5.a;
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        http2Connection.start(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 writeSynResetLater$lambda$0(Http2Connection http2Connection, int i, ErrorCode errorCode) {
        try {
            http2Connection.writeSynReset$okhttp(i, errorCode);
        } catch (IOException e) {
            http2Connection.failConnection(e);
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 writeWindowUpdateLater$lambda$0(Http2Connection http2Connection, int i, long j) {
        try {
            http2Connection.writer.windowUpdate(i, j);
        } catch (IOException e) {
            http2Connection.failConnection(e);
        }
        return wd5.a;
    }

    public final void awaitPong() {
        synchronized (this) {
            while (this.awaitPongsReceived < this.awaitPingsSent) {
                wait();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] objArr;
        errorCode.getClass();
        errorCode2.getClass();
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        try {
            shutdown(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.streams.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.cancel();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final FlowControlListener getFlowControlListener$okhttp() {
        return this.flowControlListener;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final WindowCounter getReadBytes() {
        return this.readBytes;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final BufferedSocket getSocket$okhttp() {
        return this.socket;
    }

    public final Http2Stream getStream(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = this.streams.get(Integer.valueOf(i));
        }
        return http2Stream;
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final boolean isHealthy(long j) {
        synchronized (this) {
            if (this.isShutdown) {
                return false;
            }
            if (this.degradedPongsReceived < this.degradedPingsSent) {
                if (j >= this.degradedPongDeadlineNs) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int openStreamCount() {
        int size;
        synchronized (this) {
            size = this.streams.size();
        }
        return size;
    }

    public final void pushDataLater$okhttp(final int i, mz mzVar, final int i2, final boolean z) {
        mzVar.getClass();
        final cz czVar = new cz();
        long j = i2;
        mzVar.U(j);
        mzVar.read(czVar, j);
        TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + i + "] onData", 0L, false, new rm1() { // from class: tv1
            @Override // defpackage.rm1
            public final Object invoke() {
                wd5 pushDataLater$lambda$0;
                pushDataLater$lambda$0 = Http2Connection.pushDataLater$lambda$0(Http2Connection.this, i, czVar, i2, z);
                return pushDataLater$lambda$0;
            }
        }, 6, null);
    }

    public final void pushHeadersLater$okhttp(final int i, final List<Header> list, final boolean z) {
        list.getClass();
        TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + i + "] onHeaders", 0L, false, new rm1() { // from class: xv1
            @Override // defpackage.rm1
            public final Object invoke() {
                wd5 pushHeadersLater$lambda$0;
                pushHeadersLater$lambda$0 = Http2Connection.pushHeadersLater$lambda$0(Http2Connection.this, i, list, z);
                return pushHeadersLater$lambda$0;
            }
        }, 6, null);
    }

    public final void pushRequestLater$okhttp(int i, List<Header> list) {
        list.getClass();
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + i + "] onRequest", 0L, false, new wa1(this, i, list), 6, null);
        }
    }

    public final void pushResetLater$okhttp(int i, ErrorCode errorCode) {
        errorCode.getClass();
        TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + i + "] onReset", 0L, false, new wv1(this, i, errorCode, (byte) 1), 6, null);
    }

    public final Http2Stream pushStream(int i, List<Header> list, boolean z) {
        list.getClass();
        if (!this.client) {
            return newStream(i, list, z);
        }
        zy.i("Client cannot push requests.");
        return null;
    }

    public final boolean pushedStream$okhttp(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final Http2Stream removeStream$okhttp(int i) {
        Http2Stream remove;
        synchronized (this) {
            remove = this.streams.remove(Integer.valueOf(i));
            notifyAll();
        }
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + C.NANOS_PER_SECOND;
            TaskQueue.execute$default(this.writerQueue, hf1.z(new StringBuilder(), this.connectionName, " ping"), 0L, false, new ce(this, (byte) 17), 6, null);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final void setPeerSettings(Settings settings) {
        settings.getClass();
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) {
        settings.getClass();
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                this.writer.goAway(this.lastGoodStreamId, errorCode, _UtilCommonKt.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start(boolean z) {
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r9 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        TaskQueue.execute$default(this.taskRunner.newQueue(), this.connectionName, 0L, false, this.readerRunnable, 6, null);
    }

    public final void updateConnectionFlowControl$okhttp(long j) {
        synchronized (this) {
            try {
                WindowCounter.update$default(this.readBytes, j, 0L, 2, null);
                long unacknowledged = this.readBytes.getUnacknowledged();
                if (unacknowledged >= this.okHttpSettings.getInitialWindowSize() / 2) {
                    writeWindowUpdateLater$okhttp(0, unacknowledged);
                    WindowCounter.update$default(this.readBytes, 0L, unacknowledged, 1, null);
                }
                this.flowControlListener.receivingConnectionWindowChanged(this.readBytes);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.maxDataLength());
        r6 = r2;
        r8.writeBytesTotal += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeData(int r9, boolean r10, defpackage.cz r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r8 = r8.writer
            r8.data(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r2 = r8.streams     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            r9 = move-exception
            goto L68
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            okhttp3.internal.http2.Http2Writer r4 = r8.writer     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.maxDataLength()     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.data(r5, r9, r11, r2)
            goto Ld
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, cz, long):void");
    }

    public final void writeHeaders$okhttp(int i, boolean z, List<Header> list) {
        list.getClass();
        this.writer.headers(z, i, list);
    }

    public final void writePing() {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }

    public final void writePingAndAwaitPong() {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i, ErrorCode errorCode) {
        errorCode.getClass();
        this.writer.rstStream(i, errorCode);
    }

    public final void writeSynResetLater$okhttp(int i, ErrorCode errorCode) {
        errorCode.getClass();
        TaskQueue.execute$default(this.writerQueue, this.connectionName + '[' + i + "] writeSynReset", 0L, false, new wv1(this, i, errorCode, (byte) 0), 6, null);
    }

    public final void writeWindowUpdateLater$okhttp(final int i, final long j) {
        TaskQueue.execute$default(this.writerQueue, this.connectionName + '[' + i + "] windowUpdate", 0L, false, new rm1() { // from class: vv1
            @Override // defpackage.rm1
            public final Object invoke() {
                wd5 writeWindowUpdateLater$lambda$0;
                writeWindowUpdateLater$lambda$0 = Http2Connection.writeWindowUpdateLater$lambda$0(Http2Connection.this, i, j);
                return writeWindowUpdateLater$lambda$0;
            }
        }, 6, null);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) {
                http2Stream.getClass();
                http2Stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public void onSettings(Http2Connection http2Connection, Settings settings) {
            http2Connection.getClass();
            settings.getClass();
        }

        public abstract void onStream(Http2Stream http2Stream);

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Companion {
            public /* synthetic */ Companion(er0 er0Var) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        private Companion() {
        }
    }

    public final void writePing(boolean z, int i, int i2) {
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class ReaderRunnable implements Http2Reader.Handler, rm1 {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            http2Reader.getClass();
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd5 applyAndAckSettings$lambda$0$0$1(Http2Connection http2Connection, r24 r24Var) {
            http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) r24Var.I);
            return wd5.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd5 headers$lambda$0$0(Http2Connection http2Connection, Http2Stream http2Stream) {
            try {
                http2Connection.getListener$okhttp().onStream(http2Stream);
            } catch (IOException e) {
                Platform.Companion.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName$okhttp(), 4, e);
                try {
                    http2Stream.close(ErrorCode.PROTOCOL_ERROR, e);
                } catch (IOException unused) {
                }
            }
            return wd5.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd5 ping$lambda$1(Http2Connection http2Connection, int i, int i2) {
            http2Connection.writePing(true, i, i2);
            return wd5.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd5 settings$lambda$0(ReaderRunnable readerRunnable, boolean z, Settings settings) {
            readerRunnable.applyAndAckSettings(z, settings);
            return wd5.a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i, String str, h00 h00Var, String str2, int i2, long j) {
            str.getClass();
            h00Var.getClass();
            str2.getClass();
        }

        public final void applyAndAckSettings(boolean z, Settings settings) {
            long initialWindowSize;
            int i;
            Http2Stream[] http2StreamArr;
            settings.getClass();
            r24 r24Var = new r24();
            Http2Writer writer = this.this$0.getWriter();
            Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (!z) {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            settings = settings2;
                        }
                        r24Var.I = settings;
                        initialWindowSize = settings.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                        if (initialWindowSize != 0 && !http2Connection.getStreams$okhttp().isEmpty()) {
                            http2StreamArr = (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                            http2Connection.setPeerSettings((Settings) r24Var.I);
                            TaskQueue.execute$default(http2Connection.settingsListenerQueue, http2Connection.getConnectionName$okhttp() + " onSettings", 0L, false, new ka(http2Connection, r24Var, (byte) 23), 6, null);
                        }
                        http2StreamArr = null;
                        http2Connection.setPeerSettings((Settings) r24Var.I);
                        TaskQueue.execute$default(http2Connection.settingsListenerQueue, http2Connection.getConnectionName$okhttp() + " onSettings", 0L, false, new ka(http2Connection, r24Var, (byte) 23), 6, null);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) r24Var.I);
                } catch (IOException e) {
                    http2Connection.failConnection(e);
                }
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i, mz mzVar, int i2) {
            mzVar.getClass();
            boolean pushedStream$okhttp = this.this$0.pushedStream$okhttp(i);
            Http2Connection http2Connection = this.this$0;
            if (pushedStream$okhttp) {
                http2Connection.pushDataLater$okhttp(i, mzVar, i2, z);
                return;
            }
            Http2Stream stream = http2Connection.getStream(i);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                mzVar.skip(j);
                return;
            }
            stream.receiveData(mzVar, i2);
            if (z) {
                stream.receiveHeaders(Headers.EMPTY, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i, ErrorCode errorCode, h00 h00Var) {
            int i2;
            Object[] array;
            errorCode.getClass();
            h00Var.getClass();
            h00Var.d();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z, int i, int i2, List<Header> list) {
            list.getClass();
            boolean pushedStream$okhttp = this.this$0.pushedStream$okhttp(i);
            Http2Connection http2Connection = this.this$0;
            if (pushedStream$okhttp) {
                http2Connection.pushHeadersLater$okhttp(i, list, z);
                return;
            }
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i);
                if (stream != null) {
                    stream.receiveHeaders(_UtilJvmKt.toHeaders(list), z);
                    return;
                }
                if (http2Connection.isShutdown) {
                    return;
                }
                if (i <= http2Connection.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                    return;
                }
                Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z, _UtilJvmKt.toHeaders(list));
                http2Connection.setLastGoodStreamId$okhttp(i);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(i), http2Stream);
                TaskQueue.execute$default(http2Connection.taskRunner.newQueue(), http2Connection.getConnectionName$okhttp() + '[' + i + "] onStream", 0L, false, new ka(http2Connection, http2Stream, (byte) 22), 6, null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        /* renamed from: invoke, reason: collision with other method in class */
        public void m362invoke() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        errorCode2 = ErrorCode.CANCEL;
                        this.this$0.close$okhttp(errorCode3, errorCode2, null);
                        errorCode = errorCode3;
                    } catch (IOException e2) {
                        e = e2;
                        errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        Http2Connection http2Connection = this.this$0;
                        http2Connection.close$okhttp(errorCode2, errorCode2, e);
                        errorCode = http2Connection;
                        this = this.reader;
                        _UtilCommonKt.closeQuietly(this);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.this$0.close$okhttp(errorCode, errorCode2, e);
                    _UtilCommonKt.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.this$0.close$okhttp(errorCode, errorCode2, e);
                _UtilCommonKt.closeQuietly(this.reader);
                throw th;
            }
            this = this.reader;
            _UtilCommonKt.closeQuietly(this);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z, final int i, final int i2) {
            Http2Connection http2Connection = this.this$0;
            if (!z) {
                TaskQueue taskQueue = http2Connection.writerQueue;
                String str = this.this$0.getConnectionName$okhttp() + " ping";
                final Http2Connection http2Connection2 = this.this$0;
                TaskQueue.execute$default(taskQueue, str, 0L, false, new rm1() { // from class: yv1
                    @Override // defpackage.rm1
                    public final Object invoke() {
                        wd5 ping$lambda$1;
                        ping$lambda$1 = Http2Connection.ReaderRunnable.ping$lambda$1(Http2Connection.this, i, i2);
                        return ping$lambda$1;
                    }
                }, 6, null);
                return;
            }
            synchronized (http2Connection) {
                try {
                    if (i == 1) {
                        http2Connection.intervalPongsReceived++;
                    } else if (i == 2) {
                        http2Connection.degradedPongsReceived++;
                    } else if (i == 3) {
                        http2Connection.awaitPongsReceived++;
                        http2Connection.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i, int i2, List<Header> list) {
            list.getClass();
            this.this$0.pushRequestLater$okhttp(i2, list);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i, ErrorCode errorCode) {
            errorCode.getClass();
            boolean pushedStream$okhttp = this.this$0.pushedStream$okhttp(i);
            Http2Connection http2Connection = this.this$0;
            if (pushedStream$okhttp) {
                http2Connection.pushResetLater$okhttp(i, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = http2Connection.removeStream$okhttp(i);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean z, Settings settings) {
            settings.getClass();
            TaskQueue.execute$default(this.this$0.writerQueue, this.this$0.getConnectionName$okhttp() + " applyAndAckSettings", 0L, false, new zv1(this, z, settings), 6, null);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i, long j) {
            Http2Connection http2Connection = this.this$0;
            if (i == 0) {
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j;
                    http2Connection.notifyAll();
                }
            } else {
                Http2Stream stream = http2Connection.getStream(i);
                if (stream != null) {
                    synchronized (stream) {
                        stream.addBytesToWriteWindow(j);
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // defpackage.rm1
        public /* bridge */ /* synthetic */ Object invoke() {
            m362invoke();
            return wd5.a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i, int i2, int i3, boolean z) {
        }
    }

    public final void start() {
        start$default(this, false, 1, null);
    }

    public final Http2Stream newStream(List<Header> list, boolean z) {
        list.getClass();
        return newStream(0, list, z);
    }
}
