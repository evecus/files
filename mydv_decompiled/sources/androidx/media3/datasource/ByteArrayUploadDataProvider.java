package androidx.media3.datasource;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ByteArrayUploadDataProvider extends UploadDataProvider {
    private final byte[] data;
    private int position;

    public ByteArrayUploadDataProvider(byte[] bArr) {
        this.data = bArr;
    }

    public long getLength() {
        return this.data.length;
    }

    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int min = Math.min(byteBuffer.remaining(), this.data.length - this.position);
        byteBuffer.put(this.data, this.position, min);
        this.position += min;
        uploadDataSink.onReadSucceeded(false);
    }

    public void rewind(UploadDataSink uploadDataSink) {
        this.position = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
