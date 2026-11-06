package okhttp3.internal.http2;

import androidx.media3.common.util.Log;
import defpackage.cz;
import defpackage.er0;
import defpackage.h00;
import defpackage.hf1;
import defpackage.mz;
import defpackage.pt1;
import defpackage.r7;
import defpackage.u75;
import defpackage.ut4;
import defpackage.zl1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.Hpack;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final mz source;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, h00 h00Var, String str2, int i2, long j);

        void data(boolean z, int i, mz mzVar, int i2);

        void goAway(int i, ErrorCode errorCode, h00 h00Var);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list);

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        logger2.getClass();
        logger = logger2;
    }

    public Http2Reader(mz mzVar, boolean z) {
        mzVar.getClass();
        this.source = mzVar;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(mzVar);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int i, int i2, int i3) {
        if (i3 == 0) {
            zl1.g("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            zl1.g("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        int and = (i2 & 8) != 0 ? _UtilCommonKt.and(this.source.readByte(), 255) : 0;
        handler.data(z, i3, this.source, Companion.lengthWithoutPadding(i, i2, and));
        this.source.skip(and);
    }

    private final void readGoAway(Handler handler, int i, int i2, int i3) {
        if (i < 8) {
            zl1.g(hf1.u(i, "TYPE_GOAWAY length < 8: "));
            return;
        }
        if (i3 != 0) {
            zl1.g("TYPE_GOAWAY streamId != 0");
            return;
        }
        int readInt = this.source.readInt();
        int readInt2 = this.source.readInt();
        int i4 = i - 8;
        ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt2);
        if (fromHttp2 == null) {
            zl1.g(hf1.u(readInt2, "TYPE_GOAWAY unexpected error code: "));
            return;
        }
        h00 h00Var = h00.L;
        if (i4 > 0) {
            h00Var = this.source.i(i4);
        }
        handler.goAway(readInt, fromHttp2, h00Var);
    }

    private final List<Header> readHeaderBlock(int i, int i2, int i3, int i4) {
        this.continuation.setLeft(i);
        this.continuation.setPadding(i2);
        this.continuation.setFlags(i3);
        this.continuation.setStreamId(i4);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i, int i2, int i3) {
        if (i3 == 0) {
            zl1.g("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = (i2 & 1) != 0;
        int and = (i2 & 8) != 0 ? _UtilCommonKt.and(this.source.readByte(), 255) : 0;
        if ((i2 & 32) != 0) {
            readPriority(handler, i3);
            i -= 5;
        }
        handler.headers(z, i3, -1, readHeaderBlock(Companion.lengthWithoutPadding(i, i2, and), and, i2, i3));
    }

    private final void readPing(Handler handler, int i, int i2, int i3) {
        if (i != 8) {
            zl1.g(hf1.u(i, "TYPE_PING length != 8: "));
        } else {
            if (i3 != 0) {
                zl1.g("TYPE_PING streamId != 0");
                return;
            }
            handler.ping((i2 & 1) != 0, this.source.readInt(), this.source.readInt());
        }
    }

    private final void readPriority(Handler handler, int i) {
        int readInt = this.source.readInt();
        handler.priority(i, readInt & Log.LOG_LEVEL_OFF, _UtilCommonKt.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private final void readPushPromise(Handler handler, int i, int i2, int i3) {
        if (i3 == 0) {
            zl1.g("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        } else {
            int and = (i2 & 8) != 0 ? _UtilCommonKt.and(this.source.readByte(), 255) : 0;
            handler.pushPromise(i3, this.source.readInt() & Log.LOG_LEVEL_OFF, readHeaderBlock(Companion.lengthWithoutPadding(i - 4, i2, and), and, i2, i3));
        }
    }

    private final void readRstStream(Handler handler, int i, int i2, int i3) {
        if (i != 4) {
            zl1.g(r7.z("TYPE_RST_STREAM length: ", i, " != 4"));
            return;
        }
        if (i3 == 0) {
            zl1.g("TYPE_RST_STREAM streamId == 0");
            return;
        }
        int readInt = this.source.readInt();
        ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt);
        if (fromHttp2 != null) {
            handler.rstStream(i3, fromHttp2);
        } else {
            zl1.g(hf1.u(readInt, "TYPE_RST_STREAM unexpected error code: "));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        defpackage.zl1.g(defpackage.hf1.u(r4, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void readSettings(okhttp3.internal.http2.Http2Reader.Handler r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            if (r10 != 0) goto L8d
            r10 = 1
            r9 = r9 & r10
            if (r9 == 0) goto L12
            if (r8 != 0) goto Lc
            r7.ackSettings()
            return
        Lc:
            java.lang.String r6 = "FRAME_SIZE_ERROR ack frame should be empty!"
            defpackage.zl1.g(r6)
            return
        L12:
            int r9 = r8 % 6
            if (r9 != 0) goto L83
            okhttp3.internal.http2.Settings r9 = new okhttp3.internal.http2.Settings
            r9.<init>()
            r0 = 0
            u22 r8 = defpackage.ut0.c0(r0, r8)
            r1 = 6
            s22 r8 = defpackage.ut0.Z(r8, r1)
            int r1 = r8.I
            int r2 = r8.J
            int r8 = r8.K
            if (r8 <= 0) goto L2f
            if (r1 <= r2) goto L33
        L2f:
            if (r8 >= 0) goto L7f
            if (r2 > r1) goto L7f
        L33:
            mz r3 = r6.source
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = okhttp3.internal._UtilCommonKt.and(r3, r4)
            mz r4 = r6.source
            int r4 = r4.readInt()
            r5 = 2
            if (r3 == r5) goto L6d
            r5 = 4
            if (r3 == r5) goto L64
            r5 = 5
            if (r3 == r5) goto L50
            goto L78
        L50:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L5a
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L5a
            goto L78
        L5a:
            java.lang.String r6 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r6 = defpackage.hf1.u(r4, r6)
            defpackage.zl1.g(r6)
            return
        L64:
            if (r4 < 0) goto L67
            goto L78
        L67:
            java.lang.String r6 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            defpackage.zl1.g(r6)
            return
        L6d:
            if (r4 == 0) goto L78
            if (r4 != r10) goto L72
            goto L78
        L72:
            java.lang.String r6 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            defpackage.zl1.g(r6)
            return
        L78:
            r9.set(r3, r4)
            if (r1 == r2) goto L7f
            int r1 = r1 + r8
            goto L33
        L7f:
            r7.settings(r0, r9)
            return
        L83:
            java.lang.String r6 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r6 = defpackage.hf1.u(r8, r6)
            defpackage.zl1.g(r6)
            return
        L8d:
            java.lang.String r6 = "TYPE_SETTINGS streamId != 0"
            defpackage.zl1.g(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.readSettings(okhttp3.internal.http2.Http2Reader$Handler, int, int, int):void");
    }

    private final void readWindowUpdate(Handler handler, int i, int i2, int i3) {
        int i4;
        try {
            if (i != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
            }
            try {
                long and = _UtilCommonKt.and(this.source.readInt(), 2147483647L);
                if (and == 0) {
                    throw new IOException("windowSizeIncrement was 0");
                }
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    i4 = i3;
                    logger2.fine(Http2.INSTANCE.frameLogWindowUpdate(true, i3, i, and));
                } else {
                    i4 = i3;
                }
                handler.windowUpdate(i4, and);
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                logger.fine(Http2.INSTANCE.frameLog(true, i3, i, 8, i2));
                throw exc;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public final boolean nextFrame(boolean z, Handler handler) {
        int readMedium;
        handler.getClass();
        try {
            this.source.U(9L);
            readMedium = _UtilCommonKt.readMedium(this.source);
        } catch (EOFException unused) {
        }
        if (readMedium > 16384) {
            zl1.g(hf1.u(readMedium, "FRAME_SIZE_ERROR: "));
            return false;
        }
        int and = _UtilCommonKt.and(this.source.readByte(), 255);
        int and2 = _UtilCommonKt.and(this.source.readByte(), 255);
        int readInt = this.source.readInt() & Log.LOG_LEVEL_OFF;
        if (and != 8) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, readInt, readMedium, and, and2));
            }
        }
        if (z && and != 4) {
            zl1.f(Http2.INSTANCE.formattedType$okhttp(and), "Expected a SETTINGS frame but was ");
            return false;
        }
        switch (and) {
            case 0:
                readData(handler, readMedium, and2, readInt);
                return true;
            case 1:
                readHeaders(handler, readMedium, and2, readInt);
                return true;
            case 2:
                readPriority(handler, readMedium, and2, readInt);
                return true;
            case 3:
                readRstStream(handler, readMedium, and2, readInt);
                return true;
            case 4:
                readSettings(handler, readMedium, and2, readInt);
                return true;
            case 5:
                readPushPromise(handler, readMedium, and2, readInt);
                return true;
            case 6:
                readPing(handler, readMedium, and2, readInt);
                return true;
            case 7:
                readGoAway(handler, readMedium, and2, readInt);
                return true;
            case 8:
                readWindowUpdate(handler, readMedium, and2, readInt);
                return true;
            default:
                this.source.skip(readMedium);
                return true;
        }
    }

    public final void readConnectionPreface(Handler handler) {
        handler.getClass();
        if (this.client) {
            if (nextFrame(true, handler)) {
                return;
            }
            zl1.g("Required SETTINGS preface not received");
            return;
        }
        mz mzVar = this.source;
        h00 h00Var = Http2.CONNECTION_PREFACE;
        h00 i = mzVar.i(h00Var.d());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(_UtilJvmKt.format("<< CONNECTION " + i.e(), new Object[0]));
        }
        if (h00Var.equals(i)) {
            return;
        }
        zl1.g("Expected a connection header but was ".concat(i.s()));
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            zl1.g(r7.x(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
            return 0;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ContinuationSource implements ut4 {
        private int flags;
        private int left;
        private int padding;
        private final mz source;
        private int streamId;

        public ContinuationSource(mz mzVar) {
            mzVar.getClass();
            this.source = mzVar;
        }

        private final void readContinuationHeader() {
            int i = this.streamId;
            int readMedium = _UtilCommonKt.readMedium(this.source);
            this.left = readMedium;
            int and = _UtilCommonKt.and(this.source.readByte(), 255);
            this.flags = _UtilCommonKt.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, readMedium, and, this.flags));
            }
            int readInt = this.source.readInt() & Log.LOG_LEVEL_OFF;
            this.streamId = readInt;
            if (and != 9) {
                zl1.g(pt1.t(and, " != TYPE_CONTINUATION"));
            } else {
                if (readInt == i) {
                    return;
                }
                zl1.g("TYPE_CONTINUATION streamId changed");
            }
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // defpackage.ut4
        public long read(cz czVar, long j) {
            czVar.getClass();
            while (true) {
                int i = this.left;
                mz mzVar = this.source;
                if (i != 0) {
                    long read = mzVar.read(czVar, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
                mzVar.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        @Override // defpackage.ut4
        public u75 timeout() {
            return this.source.timeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    private final void readPriority(Handler handler, int i, int i2, int i3) {
        if (i != 5) {
            zl1.g(r7.z("TYPE_PRIORITY length: ", i, " != 5"));
        } else if (i3 != 0) {
            readPriority(handler, i3);
        } else {
            zl1.g("TYPE_PRIORITY streamId == 0");
        }
    }
}
