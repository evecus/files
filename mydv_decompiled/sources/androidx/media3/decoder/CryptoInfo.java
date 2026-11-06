package androidx.media3.decoder;

import android.media.MediaCodec;
import android.os.Build;
import defpackage.em0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CryptoInfo {
    public int clearBlocks;
    public int encryptedBlocks;
    private final MediaCodec.CryptoInfo frameworkCryptoInfo;
    public byte[] iv;
    public byte[] key;
    public int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    public int numSubSamples;
    private final PatternHolderV24 patternHolder;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class PatternHolderV24 {
        private final MediaCodec.CryptoInfo frameworkCryptoInfo;
        private final MediaCodec.CryptoInfo.Pattern pattern;

        private PatternHolderV24(MediaCodec.CryptoInfo cryptoInfo) {
            this.frameworkCryptoInfo = cryptoInfo;
            this.pattern = em0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void set(int i, int i2) {
            this.pattern.set(i, i2);
            this.frameworkCryptoInfo.setPattern(this.pattern);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoInfo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.frameworkCryptoInfo = cryptoInfo;
        this.patternHolder = Build.VERSION.SDK_INT >= 24 ? new PatternHolderV24(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
        return this.frameworkCryptoInfo;
    }

    public void increaseClearDataFirstSubSampleBy(int i) {
        if (i == 0) {
            return;
        }
        int[] iArr = this.numBytesOfClearData;
        if (iArr == null) {
            iArr = new int[1];
            this.numBytesOfClearData = iArr;
            this.frameworkCryptoInfo.numBytesOfClearData = iArr;
        }
        iArr[0] = iArr[0] + i;
    }

    public void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.numSubSamples = i;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.iv = bArr2;
        this.mode = i2;
        this.encryptedBlocks = i3;
        this.clearBlocks = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.frameworkCryptoInfo;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (Build.VERSION.SDK_INT >= 24) {
            PatternHolderV24 patternHolderV24 = this.patternHolder;
            patternHolderV24.getClass();
            patternHolderV24.set(i3, i4);
        }
    }
}
