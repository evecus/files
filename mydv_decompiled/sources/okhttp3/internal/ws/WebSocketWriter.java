package okhttp3.internal.ws;

import androidx.media3.extractor.ts.PsExtractor;
import defpackage.az;
import defpackage.cz;
import defpackage.h00;
import defpackage.kh4;
import defpackage.lz;
import defpackage.s83;
import defpackage.zl1;
import java.io.Closeable;
import java.util.Random;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final az maskCursor;
    private final byte[] maskKey;
    private final cz messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final lz sink;
    private final cz sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, lz lzVar, Random random, boolean z2, boolean z3, long j) {
        lzVar.getClass();
        random.getClass();
        this.isClient = z;
        this.sink = lzVar;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new cz();
        this.sinkBuffer = lzVar.a();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new az() : null;
    }

    private final void writeControlFrame(int i, h00 h00Var) {
        if (this.writerClosed) {
            zl1.g("closed");
            return;
        }
        int d = h00Var.d();
        if (d > 125) {
            s83.t("Payload size must be less than or equal to 125");
            return;
        }
        this.sinkBuffer.d0(i | 128);
        boolean z = this.isClient;
        cz czVar = this.sinkBuffer;
        if (z) {
            czVar.d0(d | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            bArr.getClass();
            random.nextBytes(bArr);
            cz czVar2 = this.sinkBuffer;
            byte[] bArr2 = this.maskKey;
            czVar2.getClass();
            bArr2.getClass();
            czVar2.m196write(bArr2, 0, bArr2.length);
            if (d > 0) {
                cz czVar3 = this.sinkBuffer;
                long j = czVar3.J;
                czVar3.c0(h00Var);
                cz czVar4 = this.sinkBuffer;
                az azVar = this.maskCursor;
                azVar.getClass();
                czVar4.K(azVar);
                this.maskCursor.g(j);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            czVar.d0(d);
            this.sinkBuffer.c0(h00Var);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            _UtilCommonKt.closeQuietly(messageDeflater);
        }
        _UtilCommonKt.closeQuietly(this.sink);
    }

    public final Random getRandom() {
        return this.random;
    }

    public final lz getSink() {
        return this.sink;
    }

    public final void writeClose(int i, h00 h00Var) {
        h00 h00Var2 = h00.L;
        if (i != 0 || h00Var != null) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            cz czVar = new cz();
            czVar.h0(i);
            if (h00Var != null) {
                czVar.c0(h00Var);
            }
            h00Var2 = czVar.i(czVar.J);
        }
        try {
            writeControlFrame(8, h00Var2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, h00 h00Var) {
        h00Var.getClass();
        if (this.writerClosed) {
            zl1.g("closed");
            return;
        }
        this.messageBuffer.c0(h00Var);
        int i2 = i | 128;
        if (this.perMessageDeflate && h00Var.d() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i2 = i | PsExtractor.AUDIO_STREAM;
        }
        long j = this.messageBuffer.J;
        this.sinkBuffer.d0(i2);
        int i3 = this.isClient ? 128 : 0;
        cz czVar = this.sinkBuffer;
        if (j <= 125) {
            czVar.d0(i3 | ((int) j));
        } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            czVar.d0(i3 | WebSocketProtocol.PAYLOAD_SHORT);
            this.sinkBuffer.h0((int) j);
        } else {
            czVar.d0(i3 | 127);
            cz czVar2 = this.sinkBuffer;
            kh4 a0 = czVar2.a0(8);
            byte[] bArr = a0.a;
            int i4 = a0.c;
            bArr[i4] = (byte) ((j >>> 56) & 255);
            bArr[i4 + 1] = (byte) ((j >>> 48) & 255);
            bArr[i4 + 2] = (byte) ((j >>> 40) & 255);
            bArr[i4 + 3] = (byte) ((j >>> 32) & 255);
            bArr[i4 + 4] = (byte) ((j >>> 24) & 255);
            bArr[i4 + 5] = (byte) ((j >>> 16) & 255);
            bArr[i4 + 6] = (byte) ((j >>> 8) & 255);
            bArr[i4 + 7] = (byte) (j & 255);
            a0.c = i4 + 8;
            czVar2.J += 8;
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr2 = this.maskKey;
            bArr2.getClass();
            random.nextBytes(bArr2);
            cz czVar3 = this.sinkBuffer;
            byte[] bArr3 = this.maskKey;
            czVar3.getClass();
            bArr3.getClass();
            czVar3.m196write(bArr3, 0, bArr3.length);
            if (j > 0) {
                cz czVar4 = this.messageBuffer;
                az azVar = this.maskCursor;
                azVar.getClass();
                czVar4.K(azVar);
                this.maskCursor.g(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j);
        this.sink.flush();
    }

    public final void writePing(h00 h00Var) {
        h00Var.getClass();
        writeControlFrame(9, h00Var);
    }

    public final void writePong(h00 h00Var) {
        h00Var.getClass();
        writeControlFrame(10, h00Var);
    }
}
