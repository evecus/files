package okhttp3.internal.http2;

import defpackage.av5;
import defpackage.cz;
import defpackage.eq4;
import defpackage.er0;
import defpackage.mt4;
import defpackage.mz;
import defpackage.r7;
import defpackage.s83;
import defpackage.sq;
import defpackage.u75;
import defpackage.ut4;
import defpackage.zl1;
import defpackage.zy;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Http2Stream implements Lockable, mt4 {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private final WindowCounter readBytes;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class FramingSource implements ut4 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final cz receiveBuffer = new cz();
        private final cz readBuffer = new cz();

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long j) {
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
            } else {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                cz czVar = this.readBuffer;
                j = czVar.J;
                czVar.e();
                http2Stream.getClass();
                http2Stream.notifyAll();
            }
            if (j > 0) {
                updateConnectionFlowControl(j);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final cz getReadBuffer() {
            return this.readBuffer;
        }

        public final cz getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        @Override // defpackage.ut4
        public long read(cz czVar, long j) {
            IOException iOException;
            boolean z;
            long j2;
            long j3;
            czVar.getClass();
            long j4 = 0;
            if (j < 0) {
                s83.h(r7.A("byteCount < 0: ", j));
                return 0L;
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    boolean doReadTimeout = http2Stream.doReadTimeout();
                    if (doReadTimeout) {
                        http2Stream.getReadTimeout$okhttp().enter();
                    }
                    try {
                        if (http2Stream.getErrorCode$okhttp() == null || this.finished) {
                            iOException = null;
                        } else {
                            iOException = http2Stream.getErrorException$okhttp();
                            if (iOException == null) {
                                ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                errorCode$okhttp.getClass();
                                iOException = new StreamResetException(errorCode$okhttp);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        cz czVar2 = this.readBuffer;
                        long j5 = czVar2.J;
                        z = false;
                        if (j5 > j4) {
                            j3 = czVar2.read(czVar, Math.min(j, j5));
                            WindowCounter.update$default(http2Stream.getReadBytes(), j3, 0L, 2, null);
                            long unacknowledged = http2Stream.getReadBytes().getUnacknowledged();
                            if (iOException == null) {
                                j2 = j4;
                                if (unacknowledged >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                    http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), unacknowledged);
                                    WindowCounter.update$default(http2Stream.getReadBytes(), 0L, unacknowledged, 1, null);
                                }
                            } else {
                                j2 = j4;
                            }
                        } else {
                            j2 = j4;
                            if (!this.finished && iOException == null) {
                                http2Stream.waitForIo$okhttp();
                                z = true;
                            }
                            j3 = -1;
                        }
                    } finally {
                        if (doReadTimeout) {
                            http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                        }
                    }
                }
                Http2Stream.this.getConnection().getFlowControlListener$okhttp().receivingStreamWindowChanged(Http2Stream.this.getId(), Http2Stream.this.getReadBytes(), this.readBuffer.J);
                if (!z) {
                    if (j3 != -1) {
                        return j3;
                    }
                    if (iOException == null) {
                        return -1L;
                    }
                    throw iOException;
                }
                j4 = j2;
            }
        }

        public final void receive$okhttp(mz mzVar, long j) {
            boolean z;
            boolean z2;
            mzVar.getClass();
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            long j2 = j;
            while (j2 > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = this.readBuffer.J + j2 > this.maxByteCount;
                }
                if (z2) {
                    mzVar.skip(j2);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    mzVar.skip(j2);
                    return;
                }
                long read = mzVar.read(this.receiveBuffer, j2);
                if (read == -1) {
                    zy.c();
                    return;
                }
                j2 -= read;
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    try {
                        if (this.closed) {
                            this.receiveBuffer.e();
                        } else {
                            cz czVar = this.readBuffer;
                            boolean z3 = czVar.J == 0;
                            czVar.q(this.receiveBuffer);
                            if (z3) {
                                http2Stream2.getClass();
                                http2Stream2.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            updateConnectionFlowControl(j);
            Http2Stream.this.getConnection().getFlowControlListener$okhttp().receivingStreamWindowChanged(Http2Stream.this.getId(), Http2Stream.this.getReadBytes(), this.readBuffer.J);
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // defpackage.ut4
        public u75 timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class StreamTimeout extends sq {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // defpackage.sq
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // defpackage.sq
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        http2Connection.getClass();
        this.id = i;
        this.connection = http2Connection;
        this.readBytes = new WindowCounter(i);
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers == null) {
            if (isLocallyInitiated()) {
                return;
            }
            zy.i("remotely-initiated streams should have headers");
            throw null;
        }
        if (isLocallyInitiated()) {
            zy.i("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(headers);
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return false;
        }
        synchronized (this) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            notifyAll();
            if (getSource().getFinished$okhttp()) {
                if (getSink().getFinished()) {
                    return false;
                }
            }
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doReadTimeout() {
        return !this.connection.getClient$okhttp() || getSink().getClosed() || getSink().getFinished();
    }

    public static /* synthetic */ Headers takeHeaders$default(Http2Stream http2Stream, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return http2Stream.takeHeaders(z);
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    @Override // defpackage.mt4
    public void cancel() {
        closeLater(ErrorCode.CANCEL);
    }

    public final void cancelStreamIfNecessary$okhttp() {
        boolean z;
        boolean isOpen;
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        synchronized (this) {
            try {
                if (getSource().getFinished$okhttp() || !getSource().getClosed$okhttp() || (!getSink().getFinished() && !getSink().getClosed())) {
                    z = false;
                    isOpen = isOpen();
                }
                z = true;
                isOpen = isOpen();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            close(ErrorCode.CANCEL, null);
        } else {
            if (isOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() {
        if (getSink().getClosed()) {
            zl1.g("stream closed");
            return;
        }
        if (getSink().getFinished()) {
            zl1.g("stream finished");
            return;
        }
        if (getErrorCode$okhttp() != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode$okhttp = getErrorCode$okhttp();
            errorCode$okhttp.getClass();
            throw new StreamResetException(errorCode$okhttp);
        }
    }

    public final void close(ErrorCode errorCode, IOException iOException) {
        errorCode.getClass();
        if (closeInternal(errorCode, iOException)) {
            this.connection.writeSynReset$okhttp(this.id, errorCode);
        }
    }

    public final void closeLater(ErrorCode errorCode) {
        errorCode.getClass();
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, errorCode);
        }
    }

    public final void enqueueTrailers(Headers headers) {
        headers.getClass();
        synchronized (this) {
            if (getSink().getFinished()) {
                throw new IllegalStateException("already finished");
            }
            if (headers.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0");
            }
            getSink().setTrailers(headers);
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final ErrorCode getErrorCode$okhttp() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.errorCode;
        }
        return errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final WindowCounter getReadBytes() {
        return this.readBytes;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient$okhttp() == ((this.id & 1) == 1);
    }

    public final boolean isOpen() {
        synchronized (this) {
            try {
                if (getErrorCode$okhttp() != null) {
                    return false;
                }
                if (!getSource().getFinished$okhttp()) {
                    if (getSource().getClosed$okhttp()) {
                    }
                    return true;
                }
                if (getSink().getFinished() || getSink().getClosed()) {
                    if (this.hasResponseHeaders) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isSourceComplete() {
        boolean z;
        synchronized (this) {
            if (getSource().getFinished$okhttp()) {
                z = getSource().getReadBuffer().p();
            }
        }
        return z;
    }

    public final Headers peekTrailers() {
        synchronized (this) {
            if (getSource().getFinished$okhttp() && getSource().getReceiveBuffer().p() && getSource().getReadBuffer().p()) {
                Headers trailers = getSource().getTrailers();
                if (trailers == null) {
                    trailers = Headers.EMPTY;
                }
                return trailers;
            }
            if (getErrorCode$okhttp() == null) {
                return null;
            }
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode$okhttp = getErrorCode$okhttp();
            errorCode$okhttp.getClass();
            throw new StreamResetException(errorCode$okhttp);
        }
    }

    public final u75 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(mz mzVar, int i) {
        mzVar.getClass();
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
        } else {
            getSource().receive$okhttp(mzVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:10:0x001d, B:12:0x0022, B:14:0x002a, B:17:0x0033, B:19:0x0046, B:20:0x004d, B:27:0x003d), top: B:9:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void receiveHeaders(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L1c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Le
            goto L1c
        Le:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = " MUST NOT hold lock on "
            defpackage.av5.b(r3, r4, r2)
            return
        L1c:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L3b
            r1 = 1
            if (r0 == 0) goto L3d
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L3d
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L33
            goto L3d
        L33:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource()     // Catch: java.lang.Throwable -> L3b
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L3b
            goto L44
        L3b:
            r3 = move-exception
            goto L5f
        L3d:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L3b
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L3b
            r0.add(r3)     // Catch: java.lang.Throwable -> L3b
        L44:
            if (r4 == 0) goto L4d
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.getSource()     // Catch: java.lang.Throwable -> L3b
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L3b
        L4d:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L3b
            r2.notifyAll()     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)
            if (r3 != 0) goto L5e
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r2 = r2.id
            r3.removeStream$okhttp(r2)
        L5e:
            return
        L5f:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final void receiveRstStream(ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this) {
            if (getErrorCode$okhttp() == null) {
                this.errorCode = errorCode;
                notifyAll();
            }
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0011, B:13:0x001f, B:18:0x0029, B:25:0x0032, B:26:0x0037, B:30:0x0038, B:32:0x0040, B:35:0x004d, B:40:0x005e, B:39:0x0052, B:15:0x0024), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0001 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Headers takeHeaders(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
        L1:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L38
            okhttp3.internal.http2.ErrorCode r0 = r2.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L38
            if (r3 != 0) goto L1c
            boolean r0 = r2.doReadTimeout()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            goto L1c
        L18:
            r0 = 0
            goto L1d
        L1a:
            r3 = move-exception
            goto L5f
        L1c:
            r0 = 1
        L1d:
            if (r0 == 0) goto L24
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch: java.lang.Throwable -> L1a
            r1.enter()     // Catch: java.lang.Throwable -> L1a
        L24:
            r2.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L1
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L1a
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L1a
            goto L1
        L2f:
            r3 = move-exception
            if (r0 == 0) goto L37
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L1a
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L1a
        L37:
            throw r3     // Catch: java.lang.Throwable -> L1a
        L38:
            java.util.ArrayDeque<okhttp3.Headers> r3 = r2.headersQueue     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L4d
            java.util.ArrayDeque<okhttp3.Headers> r3 = r2.headersQueue     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r3.removeFirst()     // Catch: java.lang.Throwable -> L1a
            r3.getClass()     // Catch: java.lang.Throwable -> L1a
            okhttp3.Headers r3 = (okhttp3.Headers) r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return r3
        L4d:
            java.io.IOException r3 = r2.errorException     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L52
            goto L5e
        L52:
            okhttp3.internal.http2.StreamResetException r3 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L1a
            okhttp3.internal.http2.ErrorCode r0 = r2.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L1a
            r0.getClass()     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1a
        L5e:
            throw r3     // Catch: java.lang.Throwable -> L1a
        L5f:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.takeHeaders(boolean):okhttp3.Headers");
    }

    public final void waitForIo$okhttp() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> list, boolean z, boolean z2) {
        list.getClass();
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z) {
                getSink().setFinished(true);
                notifyAll();
            }
        }
        if (!z2) {
            synchronized (this) {
                z2 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
        }
        this.connection.writeHeaders$okhttp(this.id, z, list);
        if (z2) {
            this.connection.flush();
        }
    }

    public final u75 writeTimeout() {
        return this.writeTimeout;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    @Override // defpackage.mt4
    public FramingSink getSink() {
        return this.sink;
    }

    @Override // defpackage.mt4
    public FramingSource getSource() {
        return this.source;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class FramingSink implements eq4 {
        private boolean closed;
        private boolean finished;
        private final cz sendBuffer;
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new cz();
        }

        /* JADX WARN: Finally extract failed */
        private final void emitFrame(boolean z) {
            long min;
            boolean z2;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } catch (Throwable th) {
                        http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                min = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.J);
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                z2 = z && min == this.sendBuffer.J;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z2, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override // defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                boolean z = http2Stream2.getErrorCode$okhttp() == null;
                if (!Http2Stream.this.getSink().finished) {
                    boolean z2 = this.sendBuffer.J > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.J > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        headers.getClass();
                        connection.writeHeaders$okhttp(id, z, _UtilJvmKt.toHeaderList(headers));
                    } else if (z2) {
                        while (this.sendBuffer.J > 0) {
                            emitFrame(true);
                        }
                    } else if (z) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    this.closed = true;
                    http2Stream3.getClass();
                    http2Stream3.notifyAll();
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // defpackage.eq4, java.io.Flushable
        public void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
            }
            while (this.sendBuffer.J > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // defpackage.eq4
        public u75 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // defpackage.eq4
        public void write(cz czVar, long j) {
            czVar.getClass();
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            this.sendBuffer.write(czVar, j);
            while (this.sendBuffer.J >= Http2Stream.EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, er0 er0Var) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
