package okhttp3.internal.ws;

import defpackage.az;
import defpackage.cz;
import defpackage.h00;
import defpackage.mz;
import defpackage.zl1;
import defpackage.zy;
import java.io.Closeable;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final cz controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final az maskCursor;
    private final byte[] maskKey;
    private final cz messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private boolean receivedCloseFrame;
    private final mz source;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(h00 h00Var);

        void onReadMessage(String str);

        void onReadPing(h00 h00Var);

        void onReadPong(h00 h00Var);
    }

    public WebSocketReader(boolean z, mz mzVar, FrameCallback frameCallback, boolean z2, boolean z3) {
        mzVar.getClass();
        frameCallback.getClass();
        this.isClient = z;
        this.source = mzVar;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.controlFrameBuffer = new cz();
        this.messageFrameBuffer = new cz();
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = z ? null : new az();
    }

    private final void readControlFrame() {
        short s;
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.C(this.controlFrameBuffer, j);
            if (!this.isClient) {
                cz czVar = this.controlFrameBuffer;
                az azVar = this.maskCursor;
                azVar.getClass();
                czVar.K(azVar);
                this.maskCursor.g(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                az azVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                bArr.getClass();
                webSocketProtocol.toggleMask(azVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                cz czVar2 = this.controlFrameBuffer;
                long j2 = czVar2.J;
                if (j2 == 1) {
                    zl1.m("Malformed close payload length of 1.");
                    return;
                }
                if (j2 != 0) {
                    s = czVar2.readShort();
                    str = this.controlFrameBuffer.Q();
                    String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                    if (closeCodeExceptionMessage != null) {
                        zl1.m(closeCodeExceptionMessage);
                        return;
                    }
                } else {
                    s = 1005;
                    str = "";
                }
                this.frameCallback.onReadClose(s, str);
                this.receivedCloseFrame = true;
                return;
            case 9:
                FrameCallback frameCallback = this.frameCallback;
                cz czVar3 = this.controlFrameBuffer;
                frameCallback.onReadPing(czVar3.i(czVar3.J));
                return;
            case 10:
                FrameCallback frameCallback2 = this.frameCallback;
                cz czVar4 = this.controlFrameBuffer;
                frameCallback2.onReadPong(czVar4.i(czVar4.J));
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + _UtilJvmKt.toHexString(this.opcode));
        }
    }

    private final void readHeader() {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.receivedCloseFrame) {
            zl1.g("closed");
            return;
        }
        long timeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int and = _UtilCommonKt.and(this.source.readByte(), 255);
            this.source.timeout().timeout(timeoutNanos, timeUnit);
            int i = and & 15;
            this.opcode = i;
            boolean z2 = (and & 128) != 0;
            this.isFinalFrame = z2;
            boolean z3 = (and & 8) != 0;
            this.isControlFrame = z3;
            if (z3 && !z2) {
                zl1.m("Control frames must be final.");
                return;
            }
            boolean z4 = (and & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.perMessageDeflate) {
                        zl1.m("Unexpected rsv1 flag");
                        return;
                    }
                    z = true;
                }
                this.readingCompressedMessage = z;
            } else if (z4) {
                zl1.m("Unexpected rsv1 flag");
                return;
            }
            if ((and & 32) != 0) {
                zl1.m("Unexpected rsv2 flag");
                return;
            }
            if ((and & 16) != 0) {
                zl1.m("Unexpected rsv3 flag");
                return;
            }
            int and2 = _UtilCommonKt.and(this.source.readByte(), 255);
            boolean z5 = (and2 & 128) != 0;
            if (z5 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = and2 & 127;
            this.frameLength = j;
            if (j == 126) {
                j = _UtilCommonKt.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                this.frameLength = j;
            } else if (j == 127) {
                j = this.source.readLong();
                this.frameLength = j;
                if (j < 0) {
                    throw new ProtocolException("Frame length 0x" + _UtilJvmKt.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && j > 125) {
                zl1.m("Control frame must be less than 125B.");
            } else if (z5) {
                mz mzVar = this.source;
                byte[] bArr = this.maskKey;
                bArr.getClass();
                mzVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(timeoutNanos, timeUnit);
            throw th;
        }
    }

    private final void readMessage() {
        while (!this.receivedCloseFrame) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.C(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    cz czVar = this.messageFrameBuffer;
                    az azVar = this.maskCursor;
                    azVar.getClass();
                    czVar.K(azVar);
                    this.maskCursor.g(this.messageFrameBuffer.J - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    az azVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    bArr.getClass();
                    webSocketProtocol.toggleMask(azVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + _UtilJvmKt.toHexString(this.opcode));
            }
        }
        zl1.g("closed");
    }

    private final void readMessageFrame() {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + _UtilJvmKt.toHexString(i));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        FrameCallback frameCallback = this.frameCallback;
        if (i == 1) {
            frameCallback.onReadMessage(this.messageFrameBuffer.Q());
        } else {
            cz czVar = this.messageFrameBuffer;
            frameCallback.onReadMessage(czVar.i(czVar.J));
        }
    }

    private final void readUntilNonControlFrame() {
        while (!this.receivedCloseFrame) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            _UtilCommonKt.closeQuietly(messageInflater);
        }
        _UtilCommonKt.closeQuietly(this.source);
    }

    public final mz getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        if (this.closed) {
            zy.i("closed");
            return;
        }
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
