package coil3.decode;

import coil3.decode.ImageSource;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ByteBufferMetadata extends ImageSource.Metadata {
    private final ByteBuffer byteBuffer;

    public ByteBufferMetadata(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    public final ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }
}
