package androidx.media3.datasource;

import androidx.media3.common.util.Util;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class AesCipherDataSink implements DataSink {
    private AesFlushingCipher cipher;
    private final byte[] scratch;
    private final byte[] secretKey;
    private final DataSink wrappedDataSink;

    public AesCipherDataSink(byte[] bArr, DataSink dataSink, byte[] bArr2) {
        this.wrappedDataSink = dataSink;
        this.secretKey = bArr;
        this.scratch = bArr2;
    }

    @Override // androidx.media3.datasource.DataSink
    public void close() {
        this.cipher = null;
        this.wrappedDataSink.close();
    }

    @Override // androidx.media3.datasource.DataSink
    public void open(DataSpec dataSpec) {
        this.wrappedDataSink.open(dataSpec);
        this.cipher = new AesFlushingCipher(1, this.secretKey, dataSpec.key, dataSpec.uriPositionOffset + dataSpec.position);
    }

    @Override // androidx.media3.datasource.DataSink
    public void write(byte[] bArr, int i, int i2) {
        if (this.scratch == null) {
            ((AesFlushingCipher) Util.castNonNull(this.cipher)).updateInPlace(bArr, i, i2);
            this.wrappedDataSink.write(bArr, i, i2);
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i2 - i3, this.scratch.length);
            byte[] bArr2 = bArr;
            ((AesFlushingCipher) Util.castNonNull(this.cipher)).update(bArr2, i + i3, min, this.scratch, 0);
            this.wrappedDataSink.write(this.scratch, 0, min);
            i3 += min;
            bArr = bArr2;
        }
    }

    public AesCipherDataSink(byte[] bArr, DataSink dataSink) {
        this(bArr, dataSink, null);
    }
}
