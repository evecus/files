package androidx.media3.extractor;

import androidx.media3.extractor.TrackOutput;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class TrueHdSampleRechunker {
    private int chunkFlags;
    private int chunkOffset;
    private int chunkSampleCount;
    private int chunkSize;
    private long chunkTimeUs;
    private boolean foundSyncframe;
    private final byte[] syncframePrefix = new byte[10];

    public void outputPendingSampleMetadata(TrackOutput trackOutput, TrackOutput.CryptoData cryptoData) {
        if (this.chunkSampleCount > 0) {
            trackOutput.sampleMetadata(this.chunkTimeUs, this.chunkFlags, this.chunkSize, this.chunkOffset, cryptoData);
            this.chunkSampleCount = 0;
        }
    }

    public void reset() {
        this.foundSyncframe = false;
        this.chunkSampleCount = 0;
    }

    public void sampleMetadata(TrackOutput trackOutput, long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        sp0.A(this.chunkOffset <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.foundSyncframe) {
            int i4 = this.chunkSampleCount;
            int i5 = i4 + 1;
            this.chunkSampleCount = i5;
            if (i4 == 0) {
                this.chunkTimeUs = j;
                this.chunkFlags = i;
                this.chunkSize = 0;
            }
            this.chunkSize += i2;
            this.chunkOffset = i3;
            if (i5 >= 16) {
                outputPendingSampleMetadata(trackOutput, cryptoData);
            }
        }
    }

    public void startSample(ExtractorInput extractorInput) {
        if (this.foundSyncframe) {
            return;
        }
        extractorInput.peekFully(this.syncframePrefix, 0, 10);
        extractorInput.resetPeekPosition();
        if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(this.syncframePrefix) == 0) {
            return;
        }
        this.foundSyncframe = true;
    }
}
