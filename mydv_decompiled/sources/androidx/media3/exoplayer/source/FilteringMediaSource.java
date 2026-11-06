package androidx.media3.exoplayer.source;

import androidx.media3.common.StreamKey;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import defpackage.dy1;
import defpackage.sy1;
import defpackage.zx1;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class FilteringMediaSource extends WrappingMediaSource {
    private final sy1 trackTypes;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class FilteringMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
        private MediaPeriod.Callback callback;
        private TrackGroupArray filteredTrackGroups;
        public final MediaPeriod mediaPeriod;
        private final sy1 trackTypes;

        public FilteringMediaPeriod(MediaPeriod mediaPeriod, sy1 sy1Var) {
            this.mediaPeriod = mediaPeriod;
            this.trackTypes = sy1Var;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return this.mediaPeriod.continueLoading(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j, boolean z) {
            this.mediaPeriod.discardBuffer(j, z);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
            return this.mediaPeriod.getAdjustedSeekPositionUs(j, seekParameters);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.mediaPeriod.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.mediaPeriod.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
            return this.mediaPeriod.getStreamKeys(list);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            TrackGroupArray trackGroupArray = this.filteredTrackGroups;
            trackGroupArray.getClass();
            return trackGroupArray;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.mediaPeriod.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() {
            this.mediaPeriod.maybeThrowPrepareError();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            MediaPeriod.Callback callback = this.callback;
            callback.getClass();
            callback.onContinueLoadingRequested(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            TrackGroupArray trackGroups = mediaPeriod.getTrackGroups();
            zx1 n = dy1.n();
            for (int i = 0; i < trackGroups.length; i++) {
                TrackGroup trackGroup = trackGroups.get(i);
                if (this.trackTypes.contains(Integer.valueOf(trackGroup.type))) {
                    n.c(trackGroup);
                }
            }
            this.filteredTrackGroups = new TrackGroupArray((TrackGroup[]) n.f().toArray(new TrackGroup[0]));
            MediaPeriod.Callback callback = this.callback;
            callback.getClass();
            callback.onPrepared(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j) {
            this.callback = callback;
            this.mediaPeriod.prepare(this, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return this.mediaPeriod.readDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
            this.mediaPeriod.reevaluateBuffer(j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j) {
            return this.mediaPeriod.seekToUs(j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            return this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long setEndPositionUs(long j) {
            return this.mediaPeriod.setEndPositionUs(j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void setUsesStreamPrerollFlags() {
            this.mediaPeriod.setUsesStreamPrerollFlags();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FilteringMediaSource(androidx.media3.exoplayer.source.MediaSource r2, int r3) {
        /*
            r1 = this;
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = defpackage.sy1.K
            dq4 r0 = new dq4
            r0.<init>(r3)
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.FilteringMediaSource.<init>(androidx.media3.exoplayer.source.MediaSource, int):void");
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return new FilteringMediaPeriod(super.createPeriod(mediaPeriodId, allocator, j), this.trackTypes);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        super.releasePeriod(((FilteringMediaPeriod) mediaPeriod).mediaPeriod);
    }

    public FilteringMediaSource(MediaSource mediaSource, Set<Integer> set) {
        super(mediaSource);
        this.trackTypes = sy1.o(set);
    }
}
