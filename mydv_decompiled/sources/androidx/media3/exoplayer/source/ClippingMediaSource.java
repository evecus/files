package androidx.media3.exoplayer.source;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import defpackage.sp0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ClippingMediaSource extends WrappingMediaSource {
    private IllegalClippingException clippingError;
    private ClippingTimeline clippingTimeline;
    private MediaItem.ClippingConfiguration config;
    private final boolean enableClippingInMediaPeriod;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private long periodEndUs;
    private long periodStartUs;
    private final Timeline.Window window;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private boolean buildCalled;
        private MediaItem.ClippingConfiguration.Builder config;
        private boolean enableClippingInMediaPeriod;
        private final MediaSource mediaSource;

        public Builder(MediaSource mediaSource) {
            mediaSource.getClass();
            this.mediaSource = mediaSource;
            this.config = new MediaItem.ClippingConfiguration.Builder();
        }

        public ClippingMediaSource build() {
            this.buildCalled = true;
            return new ClippingMediaSource(this);
        }

        public Builder setAllowDynamicClippingUpdates(boolean z) {
            sp0.z(!this.buildCalled);
            this.config.setRelativeToLiveWindow(z);
            return this;
        }

        public Builder setAllowUnseekableMedia(boolean z) {
            sp0.z(!this.buildCalled);
            this.config.setAllowUnseekableMedia(z);
            return this;
        }

        public Builder setClippingConfiguration(MediaItem.ClippingConfiguration clippingConfiguration) {
            sp0.z(!this.buildCalled);
            this.config = clippingConfiguration.buildUpon();
            return this;
        }

        public Builder setEnableClippingInMediaPeriod(boolean z) {
            sp0.z(!this.buildCalled);
            this.enableClippingInMediaPeriod = z;
            return this;
        }

        public Builder setEnableInitialDiscontinuity(boolean z) {
            sp0.z(!this.buildCalled);
            this.config.setStartsAtKeyFrame(!z);
            return this;
        }

        public Builder setEndPositionMs(long j) {
            return setEndPositionUs(Util.msToUs(j));
        }

        public Builder setEndPositionUs(long j) {
            sp0.z(!this.buildCalled);
            this.config.setEndPositionUs(j);
            return this;
        }

        public Builder setRelativeToDefaultPosition(boolean z) {
            sp0.z(!this.buildCalled);
            this.config.setRelativeToDefaultPosition(z);
            return this;
        }

        public Builder setStartPositionMs(long j) {
            return setStartPositionUs(Util.msToUs(j));
        }

        public Builder setStartPositionUs(long j) {
            sp0.z(!this.buildCalled);
            this.config.setStartPositionUs(j);
            return this;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(Timeline timeline, long j, long j2, boolean z) {
            super(timeline);
            if (j2 != Long.MIN_VALUE && j2 < j) {
                throw new IllegalClippingException(2, j, j2);
            }
            boolean z2 = false;
            if (timeline.getPeriodCount() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
            long max = Math.max(0L, j);
            if (!z && !window.isPlaceholder && max != 0 && !window.isSeekable) {
                throw new IllegalClippingException(1);
            }
            long max2 = j2 == Long.MIN_VALUE ? window.durationUs : Math.max(0L, j2);
            long j3 = window.durationUs;
            if (j3 != C.TIME_UNSET) {
                max2 = max2 > j3 ? j3 : max2;
                if (max > max2) {
                    max = max2;
                }
            }
            this.startUs = max;
            this.endUs = max2;
            this.durationUs = max2 == C.TIME_UNSET ? -9223372036854775807L : max2 - max;
            if (window.isDynamic && (max2 == C.TIME_UNSET || (j3 != C.TIME_UNSET && max2 == j3))) {
                z2 = true;
            }
            this.isDynamic = z2;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            this.timeline.getPeriod(0, period, z);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j = this.durationUs;
            long j2 = C.TIME_UNSET;
            if (j != C.TIME_UNSET) {
                j2 = j - positionInWindowUs;
            }
            return period.set(period.id, period.uid, 0, j2, positionInWindowUs, AdPlaybackState.NONE, period.isPlaceholder);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            this.timeline.getWindow(0, window, 0L);
            long j2 = window.positionInFirstPeriodUs;
            long j3 = this.startUs;
            window.positionInFirstPeriodUs = j2 + j3;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j4 = window.defaultPositionUs;
            if (j4 != C.TIME_UNSET) {
                long max = Math.max(j4, j3);
                window.defaultPositionUs = max;
                long j5 = this.endUs;
                if (j5 != C.TIME_UNSET) {
                    max = Math.min(max, j5);
                }
                j3 = this.startUs;
                window.defaultPositionUs = max - j3;
            }
            long usToMs = Util.usToMs(j3);
            long j6 = window.presentationStartTimeMs;
            if (j6 != C.TIME_UNSET) {
                window.presentationStartTimeMs = j6 + usToMs;
            }
            long j7 = window.windowStartTimeMs;
            if (j7 != C.TIME_UNSET) {
                window.windowStartTimeMs = j7 + usToMs;
            }
            return window;
        }
    }

    private ClippingMediaSource(Builder builder) {
        super(builder.mediaSource);
        this.config = builder.config.build();
        this.enableClippingInMediaPeriod = builder.enableClippingInMediaPeriod;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        if (shouldKeepWindowFixed()) {
            j = this.periodStartUs - positionInFirstPeriodUs;
            long j2 = this.periodEndUs;
            if (j2 != Long.MIN_VALUE) {
                r6 = j2 - positionInFirstPeriodUs;
            }
        } else {
            MediaItem.ClippingConfiguration clippingConfiguration = this.config;
            j = clippingConfiguration.startPositionUs;
            long j3 = clippingConfiguration.endPositionUs;
            if (clippingConfiguration.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j += defaultPositionUs;
                if (j3 != Long.MIN_VALUE) {
                    j3 += defaultPositionUs;
                }
            }
            this.periodStartUs = positionInFirstPeriodUs + j;
            this.periodEndUs = this.config.endPositionUs != Long.MIN_VALUE ? positionInFirstPeriodUs + j3 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i = 0; i < size; i++) {
                this.mediaPeriods.get(i).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            r6 = j3;
        }
        try {
            ClippingTimeline clippingTimeline = new ClippingTimeline(timeline, j, r6, this.config.allowUnseekableMedia);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline);
        } catch (IllegalClippingException e) {
            this.clippingError = e;
            for (int i2 = 0; i2 < this.mediaPeriods.size(); i2++) {
                this.mediaPeriods.get(i2).setClippingError(this.clippingError);
            }
        }
    }

    @EnsuresNonNullIf(expression = {"clippingTimeline"}, result = true)
    private boolean shouldKeepWindowFixed() {
        return (this.mediaPeriods.isEmpty() || this.clippingTimeline == null || this.config.relativeToLiveWindow) ? false : true;
    }

    @RequiresNonNull({"clippingTimeline"})
    private void updatePeriodClippingToNewConfig(MediaItem.ClippingConfiguration clippingConfiguration) {
        long defaultPositionUs = this.clippingTimeline.timeline.getWindow(0, this.window).getDefaultPositionUs();
        long j = clippingConfiguration.relativeToDefaultPosition ? -defaultPositionUs : 0L;
        MediaItem.ClippingConfiguration clippingConfiguration2 = this.config;
        if (!clippingConfiguration2.relativeToDefaultPosition) {
            defaultPositionUs = 0;
        }
        long j2 = j + defaultPositionUs;
        long j3 = this.periodStartUs;
        long j4 = clippingConfiguration2.startPositionUs;
        long j5 = ((j2 + j4) - clippingConfiguration.startPositionUs) + j3;
        this.periodStartUs = j5;
        long j6 = clippingConfiguration2.endPositionUs;
        this.periodEndUs = j6 != Long.MIN_VALUE ? (j5 + j6) - j4 : Long.MIN_VALUE;
        int size = this.mediaPeriods.size();
        for (int i = 0; i < size; i++) {
            this.mediaPeriods.get(i).updateClipping(this.periodStartUs, this.periodEndUs);
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        if (this.mediaSource.canUpdateMediaItem(mediaItem)) {
            return this.enableClippingInMediaPeriod || getMediaItem().clippingConfiguration.equals(mediaItem.clippingConfiguration);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j), !this.config.startsAtKeyFrame, this.periodStartUs, this.periodEndUs, this.enableClippingInMediaPeriod);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void onChildSourceInfoRefreshed(Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        sp0.z(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.config.relativeToLiveWindow) {
            return;
        }
        ClippingTimeline clippingTimeline = this.clippingTimeline;
        clippingTimeline.getClass();
        refreshClippedTimeline(clippingTimeline.timeline);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        ClippingTimeline clippingTimeline;
        if (this.enableClippingInMediaPeriod) {
            MediaItem.ClippingConfiguration clippingConfiguration = this.config;
            this.config = mediaItem.clippingConfiguration;
            if (this.clippingTimeline != null && shouldKeepWindowFixed()) {
                updatePeriodClippingToNewConfig(clippingConfiguration);
            }
        }
        ClippingTimeline clippingTimeline2 = this.clippingTimeline;
        super.updateMediaItem(mediaItem);
        if (this.enableClippingInMediaPeriod && (clippingTimeline = this.clippingTimeline) != null && clippingTimeline == clippingTimeline2) {
            refreshClippedTimeline(clippingTimeline.timeline);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int i, long j, long j2) {
            super("Illegal clipping: " + getReasonDescription(i, j, j2));
            this.reason = i;
        }

        private static String getReasonDescription(int i, long j, long j2) {
            if (i == 0) {
                return "invalid period count";
            }
            if (i == 1) {
                return "not seekable to start";
            }
            if (i != 2) {
                return "unknown";
            }
            sp0.z((j == C.TIME_UNSET || j2 == C.TIME_UNSET) ? false : true);
            return "start exceeds end. Start time: " + j + ", End time: " + j2;
        }

        public IllegalClippingException(int i) {
            this(i, C.TIME_UNSET, C.TIME_UNSET);
        }
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j, long j2) {
        this(new Builder(mediaSource).setStartPositionUs(j).setEndPositionUs(j2));
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j) {
        this(new Builder(mediaSource).setEndPositionUs(j).setRelativeToDefaultPosition(true));
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j, long j2, boolean z, boolean z2, boolean z3) {
        this(new Builder(mediaSource).setStartPositionUs(j).setEndPositionUs(j2).setEnableInitialDiscontinuity(z).setAllowDynamicClippingUpdates(z2).setRelativeToDefaultPosition(z3));
    }
}
