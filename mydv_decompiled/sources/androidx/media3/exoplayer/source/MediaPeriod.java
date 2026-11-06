package androidx.media3.exoplayer.source;

import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface MediaPeriod extends SequenceableLoader {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        void onPrepared(MediaPeriod mediaPeriod);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    boolean continueLoading(LoadingInfo loadingInfo);

    void discardBuffer(long j, boolean z);

    long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters);

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    long getNextLoadPositionUs();

    List<StreamKey> getStreamKeys(List<ExoTrackSelection> list);

    TrackGroupArray getTrackGroups();

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    boolean isLoading();

    void maybeThrowPrepareError();

    void prepare(Callback callback, long j);

    long readDiscontinuity();

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    void reevaluateBuffer(long j);

    long seekToUs(long j);

    long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j);

    long setEndPositionUs(long j);

    void setUsesStreamPrerollFlags();
}
