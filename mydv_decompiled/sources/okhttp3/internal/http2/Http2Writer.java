package okhttp3.internal.http2;

import androidx.media3.common.util.Log;
import defpackage.cz;
import defpackage.er0;
import defpackage.lz;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.Hpack;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Http2Writer implements Closeable, Lockable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final cz hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final lz sink;

    public Http2Writer(lz lzVar, boolean z) {
        lzVar.getClass();
        this.sink = lzVar;
        this.client = z;
        cz czVar = new cz();
        this.hpackBuffer = czVar;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, czVar, 3, null);
    }

    private final void writeContinuationFrames(int i, long j) {
        while (j > 0) {
            long min = Math.min(this.maxFrameSize, j);
            j -= min;
            frameHeader(i, (int) min, 9, j == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final void applyAndAckSettings(Settings settings) {
        settings.getClass();
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
                if (settings.getHeaderTableSize() != -1) {
                    this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
                }
                frameHeader(0, 0, 4, 1);
                this.sink.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
        }
    }

    public final void connectionPreface() {
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (this.client) {
                    Logger logger2 = logger;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(_UtilJvmKt.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.e(), new Object[0]));
                    }
                    this.sink.S(Http2.CONNECTION_PREFACE);
                    this.sink.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void data(boolean z, int i, cz czVar, int i2) {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            dataFrame(i, z ? 1 : 0, czVar, i2);
        }
    }

    public final void dataFrame(int i, int i2, cz czVar, int i3) {
        frameHeader(i, i3, 0, i2);
        if (i3 > 0) {
            lz lzVar = this.sink;
            czVar.getClass();
            lzVar.write(czVar, i3);
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.sink.flush();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void frameHeader(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            r0 = 8
            if (r11 == r0) goto L1d
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L1d
            okhttp3.internal.http2.Http2 r2 = okhttp3.internal.http2.Http2.INSTANCE
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r9 = r2.frameLog(r3, r4, r5, r6, r7)
            r0.fine(r9)
            goto L21
        L1d:
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
        L21:
            int r9 = r8.maxFrameSize
            if (r5 > r9) goto L51
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 & r4
            if (r9 != 0) goto L47
            lz r9 = r8.sink
            okhttp3.internal._UtilCommonKt.writeMedium(r9, r5)
            lz r9 = r8.sink
            r10 = r6 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            lz r9 = r8.sink
            r10 = r7 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            lz r8 = r8.sink
            r9 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r4
            r8.writeInt(r9)
            return
        L47:
            java.lang.String r8 = "reserved bit set: "
            java.lang.String r8 = defpackage.hf1.u(r4, r8)
            defpackage.s83.h(r8)
            return
        L51:
            int r8 = r8.maxFrameSize
            java.lang.String r9 = ": "
            java.lang.String r10 = "FRAME_SIZE_ERROR length > "
            defpackage.or0.f(r10, r8, r5, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Writer.frameHeader(int, int, int, int):void");
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final void goAway(int i, ErrorCode errorCode, byte[] bArr) {
        errorCode.getClass();
        bArr.getClass();
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            frameHeader(0, bArr.length + 8, 7, 0);
            this.sink.writeInt(i);
            this.sink.writeInt(errorCode.getHttpCode());
            if (bArr.length != 0) {
                this.sink.write(bArr);
            }
            this.sink.flush();
        }
    }

    public final void headers(boolean z, int i, List<Header> list) {
        list.getClass();
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.writeHeaders(list);
            long j = this.hpackBuffer.J;
            long min = Math.min(this.maxFrameSize, j);
            int i2 = j == min ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            frameHeader(i, (int) min, 1, i2);
            this.sink.write(this.hpackBuffer, min);
            if (j > min) {
                writeContinuationFrames(i, j - min);
            }
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final void ping(boolean z, int i, int i2) {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            frameHeader(0, 8, 6, z ? 1 : 0);
            this.sink.writeInt(i);
            this.sink.writeInt(i2);
            this.sink.flush();
        }
    }

    public final void pushPromise(int i, int i2, List<Header> list) {
        list.getClass();
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.writeHeaders(list);
            long j = this.hpackBuffer.J;
            int min = (int) Math.min(this.maxFrameSize - 4, j);
            long j2 = min;
            frameHeader(i, min + 4, 5, j == j2 ? 4 : 0);
            this.sink.writeInt(i2 & Log.LOG_LEVEL_OFF);
            this.sink.write(this.hpackBuffer, j2);
            if (j > j2) {
                writeContinuationFrames(i, j - j2);
            }
        }
    }

    public final void rstStream(int i, ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            frameHeader(i, 4, 3, 0);
            this.sink.writeInt(errorCode.getHttpCode());
            this.sink.flush();
        }
    }

    public final void settings(Settings settings) {
        settings.getClass();
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                frameHeader(0, settings.size() * 6, 4, 0);
                for (int i = 0; i < 10; i++) {
                    if (settings.isSet(i)) {
                        this.sink.writeShort(i);
                        this.sink.writeInt(settings.get(i));
                    }
                }
                this.sink.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void windowUpdate(int i, long j) {
        int i2;
        long j2;
        synchronized (this) {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    i2 = i;
                    j2 = j;
                    logger2.fine(Http2.INSTANCE.frameLogWindowUpdate(false, i2, 4, j2));
                } else {
                    i2 = i;
                    j2 = j;
                }
                frameHeader(i2, 4, 8, 0);
                this.sink.writeInt((int) j2);
                this.sink.flush();
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
}
