package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import defpackage.sp0;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class PreloadMediaPeriod implements MediaPeriod {
    private MediaPeriod.Callback callback;
    public final MediaPeriod mediaPeriod;
    private PreloadTrackSelectionHolder preloadTrackSelectionHolder;
    private boolean prepareInternalCalled;
    public boolean prepared;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class PreloadTrackSelectionHolder {
        public final boolean[] mayRetainStreamFlags;
        public final ExoTrackSelection[] selections;
        public final boolean[] streamResetFlags;
        public final SampleStream[] streams;
        public final long trackSelectionPositionUs;

        public PreloadTrackSelectionHolder(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            this.selections = exoTrackSelectionArr;
            this.mayRetainStreamFlags = zArr;
            this.streams = sampleStreamArr;
            this.streamResetFlags = zArr2;
            this.trackSelectionPositionUs = j;
        }
    }

    public PreloadMediaPeriod(MediaPeriod mediaPeriod) {
        this.mediaPeriod = mediaPeriod;
    }

    private static boolean isSameAdaptionSet(ExoTrackSelection exoTrackSelection, ExoTrackSelection exoTrackSelection2) {
        if (!Objects.equals(exoTrackSelection.getTrackGroup(), exoTrackSelection2.getTrackGroup()) || exoTrackSelection.length() != exoTrackSelection2.length()) {
            return false;
        }
        for (int i = 0; i < exoTrackSelection.length(); i++) {
            if (exoTrackSelection.getIndexInTrackGroup(i) != exoTrackSelection2.getIndexInTrackGroup(i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean maybeUpdatePreloadTrackSelectionHolderForReselection(ExoTrackSelection[] exoTrackSelectionArr, PreloadTrackSelectionHolder preloadTrackSelectionHolder) {
        preloadTrackSelectionHolder.getClass();
        ExoTrackSelection[] exoTrackSelectionArr2 = preloadTrackSelectionHolder.selections;
        boolean z = false;
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
            ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr2[i];
            if (exoTrackSelection != null || exoTrackSelection2 != null) {
                preloadTrackSelectionHolder.mayRetainStreamFlags[i] = false;
                if (exoTrackSelection == null) {
                    preloadTrackSelectionHolder.selections[i] = null;
                } else if (exoTrackSelection2 == null) {
                    preloadTrackSelectionHolder.selections[i] = exoTrackSelection;
                } else if (!isSameAdaptionSet(exoTrackSelection, exoTrackSelection2)) {
                    preloadTrackSelectionHolder.selections[i] = exoTrackSelection;
                } else if (exoTrackSelection.getTrackGroup().type == 2 || exoTrackSelection.getTrackGroup().type == 1 || exoTrackSelection.getSelectedIndexInTrackGroup() == exoTrackSelection2.getSelectedIndexInTrackGroup()) {
                    preloadTrackSelectionHolder.mayRetainStreamFlags[i] = true;
                } else {
                    preloadTrackSelectionHolder.selections[i] = exoTrackSelection;
                }
                z = true;
            }
        }
        return z;
    }

    private void prepareInternal(long j) {
        this.prepareInternalCalled = true;
        this.mediaPeriod.prepare(new MediaPeriod.Callback() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.1
            @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
            public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
                MediaPeriod.Callback callback = PreloadMediaPeriod.this.callback;
                callback.getClass();
                callback.onContinueLoadingRequested(PreloadMediaPeriod.this);
            }

            @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
            public void onPrepared(MediaPeriod mediaPeriod) {
                PreloadMediaPeriod preloadMediaPeriod = PreloadMediaPeriod.this;
                preloadMediaPeriod.prepared = true;
                MediaPeriod.Callback callback = preloadMediaPeriod.callback;
                callback.getClass();
                callback.onPrepared(PreloadMediaPeriod.this);
            }
        }, j);
    }

    private long selectTracksInternal(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        PreloadTrackSelectionHolder preloadTrackSelectionHolder = this.preloadTrackSelectionHolder;
        if (preloadTrackSelectionHolder == null) {
            return this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }
        sp0.z(sampleStreamArr.length == preloadTrackSelectionHolder.streams.length);
        PreloadTrackSelectionHolder preloadTrackSelectionHolder2 = this.preloadTrackSelectionHolder;
        if (j == preloadTrackSelectionHolder2.trackSelectionPositionUs) {
            preloadTrackSelectionHolder2.getClass();
            long j2 = preloadTrackSelectionHolder2.trackSelectionPositionUs;
            boolean[] zArr3 = preloadTrackSelectionHolder2.streamResetFlags;
            if (maybeUpdatePreloadTrackSelectionHolderForReselection(exoTrackSelectionArr, preloadTrackSelectionHolder2)) {
                boolean[] zArr4 = new boolean[zArr3.length];
                j2 = this.mediaPeriod.selectTracks(preloadTrackSelectionHolder2.selections, preloadTrackSelectionHolder2.mayRetainStreamFlags, preloadTrackSelectionHolder2.streams, zArr4, preloadTrackSelectionHolder2.trackSelectionPositionUs);
                int i = 0;
                while (true) {
                    boolean[] zArr5 = preloadTrackSelectionHolder2.mayRetainStreamFlags;
                    if (i >= zArr5.length) {
                        break;
                    }
                    if (zArr5[i]) {
                        zArr4[i] = true;
                    }
                    i++;
                }
                zArr3 = zArr4;
            }
            SampleStream[] sampleStreamArr2 = preloadTrackSelectionHolder2.streams;
            System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, sampleStreamArr2.length);
            System.arraycopy(zArr3, 0, zArr2, 0, zArr3.length);
            this.preloadTrackSelectionHolder = null;
            return j2;
        }
        int i2 = 0;
        while (true) {
            SampleStream[] sampleStreamArr3 = this.preloadTrackSelectionHolder.streams;
            if (i2 >= sampleStreamArr3.length) {
                this.preloadTrackSelectionHolder = null;
                return this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
            }
            SampleStream sampleStream = sampleStreamArr3[i2];
            if (sampleStream != null) {
                sampleStreamArr[i2] = sampleStream;
                zArr[i2] = false;
            }
            i2++;
        }
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
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    public void maybeThrowStreamError() {
        sp0.z(this.prepared);
        PreloadTrackSelectionHolder preloadTrackSelectionHolder = this.preloadTrackSelectionHolder;
        if (preloadTrackSelectionHolder != null) {
            for (SampleStream sampleStream : preloadTrackSelectionHolder.streams) {
                if (sampleStream != null) {
                    sampleStream.maybeThrowError();
                }
            }
        }
    }

    public void preload(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        if (this.prepared) {
            callback.onPrepared(this);
        }
        if (this.prepareInternalCalled) {
            return;
        }
        prepareInternal(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        if (this.prepared) {
            callback.onPrepared(this);
        } else {
            if (this.prepareInternalCalled) {
                return;
            }
            prepareInternal(j);
        }
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
        return selectTracksInternal(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
    }

    public long selectTracksForPreloading(ExoTrackSelection[] exoTrackSelectionArr, long j) {
        SampleStream[] sampleStreamArr = new SampleStream[exoTrackSelectionArr.length];
        boolean[] zArr = new boolean[exoTrackSelectionArr.length];
        boolean[] zArr2 = new boolean[exoTrackSelectionArr.length];
        long selectTracksInternal = selectTracksInternal(exoTrackSelectionArr, zArr2, sampleStreamArr, zArr, j);
        this.preloadTrackSelectionHolder = new PreloadTrackSelectionHolder(exoTrackSelectionArr, zArr2, sampleStreamArr, zArr, selectTracksInternal);
        return selectTracksInternal;
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
