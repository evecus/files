package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.extractor.ExtractorUtil;
import defpackage.s83;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class DefaultAudioTrackBufferSizeProvider implements DefaultAudioSink.AudioTrackBufferSizeProvider {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int DEFAULT_PCM_BUFFER_DURATION_US = 500000;
    private static final int DTSHD_BUFFER_MULTIPLICATION_FACTOR = 4;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = -1;
    public final int ac3BufferMultiplicationFactor;
    public final int dtshdBufferMultiplicationFactor;

    @Deprecated
    protected final int maxPcmBufferDurationUs;

    @Deprecated
    protected final int minPcmBufferDurationUs;
    protected final int offloadBufferDurationUs;
    protected final int passthroughBufferDurationUs;

    @Deprecated
    protected final int pcmBufferMultiplicationFactor;
    protected final int targetPcmBufferDurationUs;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class Builder {
        private int minPcmBufferDurationUs = 250000;
        private int maxPcmBufferDurationUs = DefaultAudioTrackBufferSizeProvider.MAX_PCM_BUFFER_DURATION_US;
        private int pcmBufferMultiplicationFactor = -1;
        private int passthroughBufferDurationUs = 250000;
        private int offloadBufferDurationUs = DefaultAudioTrackBufferSizeProvider.OFFLOAD_BUFFER_DURATION_US;
        private int ac3BufferMultiplicationFactor = 2;
        private int dtshdBufferMultiplicationFactor = 4;
        private int targetPcmBufferDurationUs = DefaultAudioTrackBufferSizeProvider.DEFAULT_PCM_BUFFER_DURATION_US;

        public DefaultAudioTrackBufferSizeProvider build() {
            return new DefaultAudioTrackBufferSizeProvider(this);
        }

        public Builder setAc3BufferMultiplicationFactor(int i) {
            this.ac3BufferMultiplicationFactor = i;
            return this;
        }

        public Builder setDtshdBufferMultiplicationFactor(int i) {
            this.dtshdBufferMultiplicationFactor = i;
            return this;
        }

        @Deprecated
        public Builder setMaxPcmBufferDurationUs(int i) {
            this.maxPcmBufferDurationUs = i;
            return this;
        }

        @Deprecated
        public Builder setMinPcmBufferDurationUs(int i) {
            this.minPcmBufferDurationUs = i;
            return this;
        }

        public Builder setOffloadBufferDurationUs(int i) {
            this.offloadBufferDurationUs = i;
            return this;
        }

        public Builder setPassthroughBufferDurationUs(int i) {
            this.passthroughBufferDurationUs = i;
            return this;
        }

        @Deprecated
        public Builder setPcmBufferMultiplicationFactor(int i) {
            this.pcmBufferMultiplicationFactor = i;
            return this;
        }

        public Builder setTargetPcmBufferDurationUs(int i) {
            this.targetPcmBufferDurationUs = i;
            return this;
        }
    }

    public DefaultAudioTrackBufferSizeProvider(Builder builder) {
        this.minPcmBufferDurationUs = builder.minPcmBufferDurationUs;
        this.maxPcmBufferDurationUs = builder.maxPcmBufferDurationUs;
        this.pcmBufferMultiplicationFactor = builder.pcmBufferMultiplicationFactor;
        this.passthroughBufferDurationUs = builder.passthroughBufferDurationUs;
        this.offloadBufferDurationUs = builder.offloadBufferDurationUs;
        this.ac3BufferMultiplicationFactor = builder.ac3BufferMultiplicationFactor;
        this.dtshdBufferMultiplicationFactor = builder.dtshdBufferMultiplicationFactor;
        this.targetPcmBufferDurationUs = builder.targetPcmBufferDurationUs;
    }

    public static int durationUsToBytes(int i, int i2, int i3) {
        return sp0.B(((i * i2) * i3) / 1000000);
    }

    private static int getNonPcmMaximumEncodedRateBytesPerSecond(int i) {
        int maximumEncodedRateBytesPerSecond = ExtractorUtil.getMaximumEncodedRateBytesPerSecond(i);
        sp0.z(maximumEncodedRateBytesPerSecond != -2147483647);
        return maximumEncodedRateBytesPerSecond;
    }

    public int get1xBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return getPcmBufferSizeInBytes(i, i5, i4);
        }
        if (i3 == 1) {
            return getOffloadBufferSizeInBytes(i2);
        }
        if (i3 == 2) {
            return getPassthroughBufferSizeInBytes(i2, i6);
        }
        s83.d();
        return 0;
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider
    public int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        return (((Math.max(i, (int) (get1xBufferSizeInBytes(i, i2, i3, i4, i5, i6) * d)) + i4) - 1) / i4) * i4;
    }

    public int getOffloadBufferSizeInBytes(int i) {
        return sp0.B((this.offloadBufferDurationUs * getNonPcmMaximumEncodedRateBytesPerSecond(i)) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getPassthroughBufferSizeInBytes(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.passthroughBufferDurationUs
            r1 = 5
            r2 = 8
            if (r4 != r1) goto Lb
            int r3 = r3.ac3BufferMultiplicationFactor
        L9:
            int r0 = r0 * r3
            goto L10
        Lb:
            if (r4 != r2) goto L10
            int r3 = r3.dtshdBufferMultiplicationFactor
            goto L9
        L10:
            r3 = -1
            if (r5 == r3) goto L1a
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            int r3 = defpackage.k21.s(r5, r2)
            goto L1e
        L1a:
            int r3 = getNonPcmMaximumEncodedRateBytesPerSecond(r4)
        L1e:
            long r4 = (long) r0
            long r0 = (long) r3
            long r4 = r4 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 / r0
            int r3 = defpackage.sp0.B(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.getPassthroughBufferSizeInBytes(int, int):int");
    }

    public int getPcmBufferSizeInBytes(int i, int i2, int i3) {
        int i4 = this.pcmBufferMultiplicationFactor;
        return i4 != -1 ? Util.constrainValue(i * i4, durationUsToBytes(this.minPcmBufferDurationUs, i2, i3), durationUsToBytes(this.maxPcmBufferDurationUs, i2, i3)) : durationUsToBytes(this.targetPcmBufferDurationUs, i2, i3);
    }
}
