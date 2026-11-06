package androidx.media3.extractor.wav;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class WavFormat {
    public final int averageBytesPerSecond;
    public final int bitsPerSample;
    public final int blockSize;
    public final int channelMask;
    public final byte[] extraData;
    public final int formatType;
    public final int frameRateHz;
    public final int numChannels;

    public WavFormat(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7) {
        this.formatType = i;
        this.numChannels = i2;
        this.frameRateHz = i3;
        this.averageBytesPerSecond = i4;
        this.blockSize = i5;
        this.bitsPerSample = i6;
        this.extraData = bArr;
        this.channelMask = i7;
    }
}
