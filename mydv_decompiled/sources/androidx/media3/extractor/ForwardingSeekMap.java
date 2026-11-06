package androidx.media3.extractor;

import androidx.media3.extractor.SeekMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ForwardingSeekMap implements SeekMap {
    private final SeekMap seekMap;

    public ForwardingSeekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.seekMap.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        return this.seekMap.getSeekPoints(j);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isEstimated() {
        return this.seekMap.isEstimated();
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.seekMap.isSeekable();
    }
}
