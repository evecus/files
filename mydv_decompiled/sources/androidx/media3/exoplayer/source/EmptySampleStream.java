package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class EmptySampleStream implements SampleStream {
    @Override // androidx.media3.exoplayer.source.SampleStream
    public final int getFlags() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        decoderInputBuffer.setFlags(4);
        return -4;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() {
    }
}
