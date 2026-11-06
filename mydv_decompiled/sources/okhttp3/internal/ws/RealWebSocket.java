package okhttp3.internal.ws;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import coil3.network.internal.UtilsKt;
import defpackage.av5;
import defpackage.eq4;
import defpackage.er0;
import defpackage.h00;
import defpackage.hf1;
import defpackage.iy3;
import defpackage.jp;
import defpackage.mt4;
import defpackage.nt3;
import defpackage.p70;
import defpackage.r24;
import defpackage.s83;
import defpackage.ut4;
import defpackage.uv1;
import defpackage.wd5;
import defpackage.zl1;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.connection.BufferedSocketKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.WebSocketReader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {
    public static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<h00> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private mt4 socket;
    private TaskQueue taskQueue;
    private final long webSocketCloseTimeout;
    private WebSocketWriter writer;
    private Task writerTask;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> ONLY_HTTP1 = p70.j0(Protocol.HTTP_1_1);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final h00 reason;

        public Close(int i, h00 h00Var, long j) {
            this.code = i;
            this.reason = h00Var;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final h00 getReason() {
            return this.reason;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Message {
        private final h00 data;
        private final int formatOpcode;

        public Message(int i, h00 h00Var) {
            h00Var.getClass();
            this.formatOpcode = i;
            this.data = h00Var;
        }

        public final h00 getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e) {
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e, null, true, 2, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, WebSocketExtensions webSocketExtensions, long j2, long j3) {
        taskRunner.getClass();
        request.getClass();
        webSocketListener.getClass();
        random.getClass();
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.webSocketCloseTimeout = j3;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!UtilsKt.HTTP_METHOD_GET.equals(request.method())) {
            s83.s(request.method(), "Request must be GET: ");
            throw null;
        }
        h00 h00Var = h00.L;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.key = jp.w(bArr).a();
    }

    public static /* synthetic */ void failWebSocket$default(RealWebSocket realWebSocket, Exception exc, Response response, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            response = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        realWebSocket.failWebSocket(exc, response, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 failWebSocket$lambda$0$0(r24 r24Var) {
        _UtilCommonKt.closeQuietly((Closeable) r24Var.I);
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 finishReader$lambda$0$0(WebSocketWriter webSocketWriter) {
        _UtilCommonKt.closeQuietly(webSocketWriter);
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long initReaderAndWriter$lambda$0$0(RealWebSocket realWebSocket, long j) {
        realWebSocket.writePingFrame$okhttp();
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        Integer num = webSocketExtensions.serverMaxWindowBits;
        if (num == null) {
            return true;
        }
        int intValue = num.intValue();
        return 8 <= intValue && intValue < 16;
    }

    private final void runWriter() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    private final synchronized boolean send(h00 h00Var, int i) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + h00Var.d() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += h00Var.d();
            this.messageAndCloseQueue.add(new Message(i, h00Var));
            runWriter();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 writeOneFrame$lambda$0$0(RealWebSocket realWebSocket) {
        realWebSocket.cancel();
        return wd5.a;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        call.getClass();
        call.cancel();
    }

    public final mt4 checkUpgradeSuccess$okhttp(Response response) {
        response.getClass();
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String header$default = Response.header$default(response, "Connection", null, 2, null);
        if (!"Upgrade".equalsIgnoreCase(header$default)) {
            throw new ProtocolException(hf1.t('\'', "Expected 'Connection' header value 'Upgrade' but was '", header$default));
        }
        String header$default2 = Response.header$default(response, "Upgrade", null, 2, null);
        if (!"websocket".equalsIgnoreCase(header$default2)) {
            throw new ProtocolException(hf1.t('\'', "Expected 'Upgrade' header value 'websocket' but was '", header$default2));
        }
        String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        h00 h00Var = h00.L;
        String a = jp.h(this.key + WebSocketProtocol.ACCEPT_MAGIC).c("SHA-1").a();
        if (a.equals(header$default3)) {
            mt4 socket = response.socket();
            if (socket != null) {
                return socket;
            }
            zl1.m("Web Socket socket missing: bad interceptor?");
            return null;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a + "' but was '" + header$default3 + '\'');
    }

    public final synchronized boolean close(int i, String str, long j) {
        h00 h00Var;
        try {
            WebSocketProtocol.INSTANCE.validateCloseCode(i);
            if (str != null) {
                h00 h00Var2 = h00.L;
                h00Var = jp.h(str);
                if (h00Var.I.length > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                }
            } else {
                h00Var = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i, h00Var, j));
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void connect(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket$default(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                call.getClass();
                iOException.getClass();
                RealWebSocket.failWebSocket$default(RealWebSocket.this, iOException, null, false, 6, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                ut4 source;
                eq4 sink;
                boolean isValid;
                ArrayDeque arrayDeque;
                call.getClass();
                response.getClass();
                try {
                    mt4 checkUpgradeSuccess$okhttp = RealWebSocket.this.checkUpgradeSuccess$okhttp(response);
                    WebSocketExtensions parse = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = parse;
                    isValid = RealWebSocket.this.isValid(parse);
                    if (!isValid) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            arrayDeque = realWebSocket.messageAndCloseQueue;
                            arrayDeque.clear();
                            realWebSocket.close(AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    RealWebSocket.this.initReaderAndWriter(_UtilJvmKt.okHttpName + " WebSocket " + build2.url().redact(), BufferedSocketKt.asBufferedSocket(checkUpgradeSuccess$okhttp), true);
                    RealWebSocket.this.loopReader(response);
                } catch (IOException e) {
                    RealWebSocket.failWebSocket$default(RealWebSocket.this, e, response, false, 4, null);
                    _UtilCommonKt.closeQuietly(response);
                    mt4 socket = response.socket();
                    if (socket != null && (sink = socket.getSink()) != null) {
                        _UtilCommonKt.closeQuietly(sink);
                    }
                    mt4 socket2 = response.socket();
                    if (socket2 == null || (source = socket2.getSource()) == null) {
                        return;
                    }
                    _UtilCommonKt.closeQuietly(source);
                }
            }
        });
    }

    public final void failWebSocket(Exception exc, Response response, boolean z) {
        WebSocketWriter webSocketWriter;
        exc.getClass();
        r24 r24Var = new r24();
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                this.failed = true;
                mt4 mt4Var = this.socket;
                WebSocketWriter webSocketWriter2 = this.writer;
                r24Var.I = webSocketWriter2;
                this.writer = null;
                if (!z && webSocketWriter2 != null) {
                    TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new iy3(r24Var, (byte) 3), 2, null);
                }
                this.taskQueue.shutdown();
                try {
                    this.listener.onFailure(this, exc, response);
                    if (mt4Var != null) {
                        mt4Var.cancel();
                    }
                    if (!z || (webSocketWriter = (WebSocketWriter) r24Var.I) == null) {
                        return;
                    }
                    _UtilCommonKt.closeQuietly(webSocketWriter);
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finishReader() {
        int i;
        String str;
        WebSocketReader webSocketReader;
        boolean z;
        synchronized (this) {
            try {
                i = this.receivedCloseCode;
                str = this.receivedCloseReason;
                webSocketReader = this.reader;
                this.reader = null;
                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                    WebSocketWriter webSocketWriter = this.writer;
                    if (webSocketWriter != null) {
                        this.writer = null;
                        TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new iy3(webSocketWriter, (byte) 2), 2, null);
                    }
                    this.taskQueue.shutdown();
                }
                if (!this.failed && this.writer == null) {
                    z = this.receivedCloseCode != -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            WebSocketListener webSocketListener = this.listener;
            str.getClass();
            webSocketListener.onClosed(this, i, str);
        }
        if (webSocketReader != null) {
            _UtilCommonKt.closeQuietly(webSocketReader);
        }
    }

    public final Call getCall$okhttp() {
        return this.call;
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(String str, BufferedSocket bufferedSocket, boolean z) {
        str.getClass();
        bufferedSocket.getClass();
        WebSocketExtensions webSocketExtensions = this.extensions;
        webSocketExtensions.getClass();
        synchronized (this) {
            try {
                this.name = str;
                this.socket = bufferedSocket;
                this.writer = new WebSocketWriter(z, bufferedSocket.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(z), this.minimumDeflateSize);
                this.writerTask = new WriterTask();
                long j = this.pingIntervalMillis;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.taskQueue.schedule(str.concat(" ping"), nanos, new uv1(this, nanos, (byte) 1));
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.reader = new WebSocketReader(z, bufferedSocket.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!z));
    }

    public final void loopReader(Response response) {
        Throwable th;
        RealWebSocket realWebSocket;
        response.getClass();
        try {
            this.listener.onOpen(this, response);
            while (this.receivedCloseCode == -1) {
                WebSocketReader webSocketReader = this.reader;
                webSocketReader.getClass();
                webSocketReader.processNextFrame();
            }
            finishReader();
        } catch (Exception e) {
            realWebSocket = this;
            try {
                failWebSocket$default(realWebSocket, e, null, false, 6, null);
                realWebSocket.finishReader();
            } catch (Throwable th2) {
                th = th2;
                realWebSocket.finishReader();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            realWebSocket = this;
            realWebSocket.finishReader();
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) {
        str.getClass();
        if (i == -1) {
            s83.t("Failed requirement.");
            return;
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed");
            }
            this.receivedCloseCode = i;
            this.receivedCloseReason = str;
        }
        this.listener.onClosing(this, i, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) {
        str.getClass();
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(h00 h00Var) {
        try {
            h00Var.getClass();
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(h00Var);
                runWriter();
                this.receivedPingCount++;
            }
        } finally {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(h00 h00Var) {
        h00Var.getClass();
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(h00 h00Var) {
        try {
            h00Var.getClass();
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(h00Var);
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final boolean processNextFrame() {
        try {
            WebSocketReader webSocketReader = this.reader;
            webSocketReader.getClass();
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e) {
            failWebSocket$default(this, e, null, false, 6, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void setCall$okhttp(Call call) {
        this.call = call;
    }

    public final void tearDown() {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final boolean writeOneFrame$okhttp() {
        String str;
        int i;
        WebSocketWriter webSocketWriter;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.writer;
                h00 poll = this.pongQueue.poll();
                byte b = 1;
                Message message = 0;
                if (poll == null) {
                    Object poll2 = this.messageAndCloseQueue.poll();
                    if (poll2 instanceof Close) {
                        i = this.receivedCloseCode;
                        str = this.receivedCloseReason;
                        if (i != -1) {
                            webSocketWriter = this.writer;
                            this.writer = null;
                            if (webSocketWriter != null && this.reader == null) {
                                z = true;
                            }
                            this.taskQueue.shutdown();
                        } else {
                            long cancelAfterCloseMillis = ((Close) poll2).getCancelAfterCloseMillis();
                            TaskQueue.execute$default(this.taskQueue, this.name + " cancel", TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis), false, new iy3(this, b), 4, null);
                            webSocketWriter = null;
                        }
                    } else {
                        if (poll2 == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        webSocketWriter = null;
                    }
                    message = poll2;
                } else {
                    str = null;
                    i = -1;
                    webSocketWriter = null;
                }
                try {
                    if (poll != null) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.writePong(poll);
                    } else if (message instanceof Message) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                        synchronized (this) {
                            this.queueSize -= message.getData().d();
                        }
                    } else {
                        if (!(message instanceof Close)) {
                            throw new AssertionError();
                        }
                        webSocketWriter2.getClass();
                        webSocketWriter2.writeClose(message.getCode(), ((Close) message).getReason());
                        if (z) {
                            WebSocketListener webSocketListener = this.listener;
                            str.getClass();
                            webSocketListener.onClosed(this, i, str);
                        }
                    }
                    return true;
                } finally {
                    if (webSocketWriter != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.writer;
                if (webSocketWriter == null) {
                    return;
                }
                int i = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                if (i != -1) {
                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                    sb.append(this.pingIntervalMillis);
                    sb.append("ms (after ");
                    failWebSocket$default(this, new SocketTimeoutException(nt3.n(sb, i - 1, " successful ping/pongs)")), null, true, 2, null);
                    return;
                }
                try {
                    webSocketWriter.writePing(h00.L);
                } catch (IOException e) {
                    failWebSocket$default(this, e, null, true, 2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(h00 h00Var) {
        h00Var.getClass();
        this.listener.onMessage(this, h00Var);
    }

    @Override // okhttp3.WebSocket
    public boolean send(h00 h00Var) {
        h00Var.getClass();
        return send(h00Var, 2);
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
        str.getClass();
        h00 h00Var = h00.L;
        return send(jp.h(str), 1);
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, String str) {
        return close(i, str, this.webSocketCloseTimeout);
    }
}
