package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceInputStream;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import defpackage.zl1;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
class Aes128DataSource implements DataSource {
    private CipherInputStream cipherInputStream;
    private final byte[] encryptionIv;
    private final byte[] encryptionKey;
    private final DataSource upstream;

    public Aes128DataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.upstream = dataSource;
        this.encryptionKey = bArr;
        this.encryptionIv = bArr2;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void addTransferListener(TransferListener transferListener) {
        transferListener.getClass();
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.cipherInputStream != null) {
            this.cipherInputStream = null;
            this.upstream.close();
        }
    }

    public Cipher getCipherInstance() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(DataSpec dataSpec) {
        try {
            Cipher cipherInstance = getCipherInstance();
            try {
                cipherInstance.init(2, new SecretKeySpec(this.encryptionKey, "AES"), new IvParameterSpec(this.encryptionIv));
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.upstream, dataSpec);
                this.cipherInputStream = new CipherInputStream(dataSourceInputStream, cipherInstance);
                dataSourceInputStream.open();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                zl1.k(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            zl1.k(e2);
            return 0L;
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        this.cipherInputStream.getClass();
        int read = this.cipherInputStream.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
