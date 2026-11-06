package coil3.fetch;

import defpackage.cz;
import defpackage.u75;
import defpackage.ut4;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ByteBufferFetcherKt {
    public static final ut4 asSource(final ByteBuffer byteBuffer) {
        return new ut4(byteBuffer) { // from class: coil3.fetch.ByteBufferFetcherKt$asSource$1
            private final ByteBuffer buffer;
            private final int len;

            {
                ByteBuffer slice = byteBuffer.slice();
                this.buffer = slice;
                this.len = slice.capacity();
            }

            @Override // defpackage.ut4
            public long read(cz czVar, long j) {
                if (this.buffer.position() == this.len) {
                    return -1L;
                }
                int position = (int) (this.buffer.position() + j);
                int i = this.len;
                if (position > i) {
                    position = i;
                }
                this.buffer.limit(position);
                return czVar.write(this.buffer);
            }

            @Override // defpackage.ut4
            public u75 timeout() {
                return u75.NONE;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        };
    }
}
