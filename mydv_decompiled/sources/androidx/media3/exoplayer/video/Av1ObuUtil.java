package androidx.media3.exoplayer.video;

import androidx.media3.container.ObuParser;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Av1ObuUtil {
    private static final byte[] expectedAv1Hdr10PlusPayloadPrefix = {-75, 0, 60, 0, 1, 4};

    private Av1ObuUtil() {
    }

    private static boolean isHdr10PlusMetadata(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < expectedAv1Hdr10PlusPayloadPrefix.length) {
            return false;
        }
        int position = byteBuffer.position();
        int i = 0;
        while (true) {
            byte[] bArr = expectedAv1Hdr10PlusPayloadPrefix;
            if (i >= bArr.length) {
                return true;
            }
            if (byteBuffer.get(position + i) != bArr[i]) {
                return false;
            }
            i++;
        }
    }

    public static void stripAllT35Metadata(ByteBuffer byteBuffer) {
        stripT35Metadata(byteBuffer, false);
    }

    public static void stripNonHdr10PlusT35Metadata(ByteBuffer byteBuffer) {
        stripT35Metadata(byteBuffer, true);
    }

    private static void stripT35Metadata(ByteBuffer byteBuffer, boolean z) {
        for (ObuParser.Obu obu : ObuParser.split(byteBuffer.asReadOnlyBuffer())) {
            if (obu.type == 5) {
                try {
                    ObuParser.Metadata parse = ObuParser.Metadata.parse(obu);
                    if (parse.type == 4 && (!z || !isHdr10PlusMetadata(parse.payload))) {
                        byteBuffer.put(obu.payload.position(), (byte) 31);
                    }
                } catch (BufferUnderflowException unused) {
                }
            }
        }
    }
}
