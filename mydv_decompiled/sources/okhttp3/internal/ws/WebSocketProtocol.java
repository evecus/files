package okhttp3.internal.ws;

import defpackage.az;
import defpackage.cz;
import defpackage.h00;
import defpackage.hf1;
import defpackage.jp;
import defpackage.r7;
import defpackage.s83;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String str) {
        str.getClass();
        h00 h00Var = h00.L;
        return jp.h(str.concat(ACCEPT_MAGIC)).c("SHA-1").a();
    }

    public final String closeCodeExceptionMessage(int i) {
        if (i < 1000 || i >= 5000) {
            return hf1.u(i, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return r7.z("Code ", i, " is reserved and may not be used.");
    }

    public final void toggleMask(az azVar, byte[] bArr) {
        long j;
        azVar.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = azVar.M;
            int i2 = azVar.N;
            int i3 = azVar.O;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = azVar.L;
            cz czVar = azVar.I;
            czVar.getClass();
            if (j2 == czVar.J) {
                zy.i("no more bytes");
                return;
            }
            j = azVar.L;
        } while (azVar.g(j == -1 ? 0L : j + (azVar.O - azVar.N)) != -1);
    }

    public final void validateCloseCode(int i) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (closeCodeExceptionMessage == null) {
            return;
        }
        closeCodeExceptionMessage.getClass();
        s83.h(closeCodeExceptionMessage);
    }
}
