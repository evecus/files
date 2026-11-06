package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import defpackage.dy1;
import defpackage.of0;
import defpackage.sp0;
import defpackage.zx1;
import j$.util.Objects;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    private static final int MSG_UPDATE_TIMELINE = 1;
    private MediaItem mediaItem;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final dy1 mediaSourceHolders;
    private Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ConcatenatedTimeline extends Timeline {
        private final long defaultPositionUs;
        private final long durationUs;
        private final dy1 firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;
        private final Object manifest;
        private final MediaItem mediaItem;
        private final dy1 periodOffsetsInWindowUs;
        private final dy1 timelines;

        public ConcatenatedTimeline(MediaItem mediaItem, dy1 dy1Var, dy1 dy1Var2, dy1 dy1Var3, boolean z, boolean z2, long j, long j2, Object obj) {
            this.mediaItem = mediaItem;
            this.timelines = dy1Var;
            this.firstPeriodIndices = dy1Var2;
            this.periodOffsetsInWindowUs = dy1Var3;
            this.isSeekable = z;
            this.isDynamic = z2;
            this.durationUs = j;
            this.defaultPositionUs = j2;
            this.manifest = obj;
        }

        private int getChildIndexByPeriodIndex(int i) {
            return Util.binarySearchFloor((List<? extends Comparable<? super Integer>>) this.firstPeriodIndices, Integer.valueOf(i + 1), false, false);
        }

        private long getPeriodDurationUs(Timeline.Period period, int i) {
            if (period.durationUs == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            return (i == this.periodOffsetsInWindowUs.size() + (-1) ? this.durationUs : ((Long) this.periodOffsetsInWindowUs.get(i + 1)).longValue()) - ((Long) this.periodOffsetsInWindowUs.get(i)).longValue();
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            int indexOfPeriod = ((Timeline) this.timelines.get(childIndex)).getIndexOfPeriod(ConcatenatingMediaSource2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return ((Integer) this.firstPeriodIndices.get(childIndex)).intValue() + indexOfPeriod;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            ((Timeline) this.timelines.get(childIndexByPeriodIndex)).getPeriod(i - ((Integer) this.firstPeriodIndices.get(childIndexByPeriodIndex)).intValue(), period, z);
            period.windowIndex = 0;
            period.positionInWindowUs = ((Long) this.periodOffsetsInWindowUs.get(i)).longValue();
            period.durationUs = getPeriodDurationUs(period, i);
            if (z) {
                Object obj = period.uid;
                obj.getClass();
                period.uid = ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, obj);
            }
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            Object childPeriodUid = ConcatenatingMediaSource2.getChildPeriodUid(obj);
            Timeline timeline = (Timeline) this.timelines.get(childIndex);
            int indexOfPeriod = timeline.getIndexOfPeriod(childPeriodUid) + ((Integer) this.firstPeriodIndices.get(childIndex)).intValue();
            timeline.getPeriodByUid(childPeriodUid, period);
            period.windowIndex = 0;
            period.positionInWindowUs = ((Long) this.periodOffsetsInWindowUs.get(indexOfPeriod)).longValue();
            period.durationUs = getPeriodDurationUs(period, indexOfPeriod);
            period.uid = obj;
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodOffsetsInWindowUs.size();
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            return ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, ((Timeline) this.timelines.get(childIndexByPeriodIndex)).getUidOfPeriod(i - ((Integer) this.firstPeriodIndices.get(childIndexByPeriodIndex)).intValue()));
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, this.isSeekable, this.isDynamic, null, this.defaultPositionUs, this.durationUs, 0, getPeriodCount() - 1, -((Long) this.periodOffsetsInWindowUs.get(0)).longValue());
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MediaSourceHolder {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final MaskingMediaSource mediaSource;
        public final HashMap<Object, Long> periodTimeOffsetsByUid = new HashMap<>();

        public MediaSourceHolder(MediaSource mediaSource, int i, long j) {
            this.mediaSource = new MaskingMediaSource(mediaSource, false);
            this.index = i;
            this.initialPlaceholderDurationUs = j;
        }
    }

    private ConcatenatingMediaSource2(MediaItem mediaItem, dy1 dy1Var) {
        this.mediaItem = mediaItem;
        this.mediaSourceHolders = dy1Var;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
    }

    private void disableUnusedMediaSources() {
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) this.mediaSourceHolders.get(i);
            if (mediaSourceHolder.activeMediaPeriods == 0) {
                disableChildSource(Integer.valueOf(mediaSourceHolder.index));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getChildIndex(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j, int i) {
        return (int) (j % i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getChildPeriodUid(Object obj) {
        return ((Pair) obj).second;
    }

    private static long getChildWindowSequenceNumber(long j, int i, int i2) {
        return (j * i) + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getPeriodUid(int i, Object obj) {
        return Pair.create(Integer.valueOf(i), obj);
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j, int i) {
        return j / i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            updateTimeline();
        }
        return true;
    }

    private ConcatenatedTimeline maybeCreateConcatenatedTimeline() {
        zx1 zx1Var;
        zx1 zx1Var2;
        int i;
        long j;
        long j2;
        Timeline.Window window;
        boolean z;
        ConcatenatingMediaSource2 concatenatingMediaSource2 = this;
        Timeline.Window window2 = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        zx1 n = dy1.n();
        zx1 n2 = dy1.n();
        zx1 n3 = dy1.n();
        int size = concatenatingMediaSource2.mediaSourceHolders.size();
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        int i2 = 0;
        Object obj = null;
        int i3 = 0;
        boolean z5 = false;
        boolean z6 = false;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (i2 < size) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) concatenatingMediaSource2.mediaSourceHolders.get(i2);
            Timeline timeline = mediaSourceHolder.mediaSource.getTimeline();
            sp0.p(timeline.isEmpty() ^ z2, "Can't concatenate empty child Timeline.");
            n.c(timeline);
            n2.c(Integer.valueOf(i3));
            i3 += timeline.getPeriodCount();
            int i4 = 0;
            while (i4 < timeline.getWindowCount()) {
                timeline.getWindow(i4, window2);
                if (!z5) {
                    z5 = z2;
                    obj = window2.manifest;
                }
                z3 = (z3 && Objects.equals(obj, window2.manifest)) ? z2 : false;
                Timeline timeline2 = timeline;
                long j6 = window2.durationUs;
                if (j6 == C.TIME_UNSET) {
                    j6 = mediaSourceHolder.initialPlaceholderDurationUs;
                    if (j6 == C.TIME_UNSET) {
                        return null;
                    }
                }
                j3 += j6;
                if (mediaSourceHolder.index == 0 && i4 == 0) {
                    zx1Var = n;
                    zx1Var2 = n2;
                    j4 = window2.defaultPositionUs;
                    j5 = -window2.positionInFirstPeriodUs;
                } else {
                    zx1Var = n;
                    zx1Var2 = n2;
                }
                z4 &= window2.isSeekable || window2.isPlaceholder;
                z6 |= window2.isDynamic;
                int i5 = window2.firstPeriodIndex;
                while (i5 <= window2.lastPeriodIndex) {
                    n3.c(Long.valueOf(j5));
                    Timeline timeline3 = timeline2;
                    timeline3.getPeriod(i5, period, true);
                    zx1 zx1Var3 = n3;
                    long j7 = period.durationUs;
                    if (j7 == C.TIME_UNSET) {
                        sp0.p(window2.firstPeriodIndex == window2.lastPeriodIndex, "Can't apply placeholder duration to multiple periods with unknown duration in a single window.");
                        j7 = window2.positionInFirstPeriodUs + j6;
                    }
                    if (i5 != window2.firstPeriodIndex || ((mediaSourceHolder.index == 0 && i4 == 0) || j7 == C.TIME_UNSET)) {
                        i = i5;
                        j = j7;
                        j2 = 0;
                    } else {
                        i = i5;
                        j2 = -window2.positionInFirstPeriodUs;
                        j = j7 + j2;
                    }
                    Object obj2 = period.uid;
                    obj2.getClass();
                    int i6 = i;
                    if (mediaSourceHolder.activeMediaPeriods == 0 || !mediaSourceHolder.periodTimeOffsetsByUid.containsKey(obj2)) {
                        window = window2;
                    } else {
                        window = window2;
                        if (!mediaSourceHolder.periodTimeOffsetsByUid.get(obj2).equals(Long.valueOf(j2))) {
                            z = false;
                            sp0.p(z, "Can't handle windows with changing offset in first period.");
                            mediaSourceHolder.periodTimeOffsetsByUid.put(obj2, Long.valueOf(j2));
                            j5 += j;
                            i5 = i6 + 1;
                            n3 = zx1Var3;
                            timeline2 = timeline3;
                            window2 = window;
                        }
                    }
                    z = true;
                    sp0.p(z, "Can't handle windows with changing offset in first period.");
                    mediaSourceHolder.periodTimeOffsetsByUid.put(obj2, Long.valueOf(j2));
                    j5 += j;
                    i5 = i6 + 1;
                    n3 = zx1Var3;
                    timeline2 = timeline3;
                    window2 = window;
                }
                i4++;
                n = zx1Var;
                n2 = zx1Var2;
                timeline = timeline2;
                z2 = true;
            }
            i2++;
            concatenatingMediaSource2 = this;
            z2 = true;
        }
        return new ConcatenatedTimeline(getMediaItem(), n.f(), n2.f(), n3.f(), z4, z6, j3, j4, z3 ? obj : null);
    }

    private void scheduleTimelineUpdate() {
        if (this.timelineUpdateScheduled) {
            return;
        }
        Handler handler = this.playbackThreadHandler;
        handler.getClass();
        handler.obtainMessage(1).sendToTarget();
        this.timelineUpdateScheduled = true;
    }

    private void updateTimeline() {
        this.timelineUpdateScheduled = false;
        ConcatenatedTimeline maybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (maybeCreateConcatenatedTimeline != null) {
            refreshSourceInfo(maybeCreateConcatenatedTimeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        long longValue;
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) this.mediaSourceHolders.get(getChildIndex(mediaPeriodId.periodUid));
        MediaSource.MediaPeriodId copyWithWindowSequenceNumber = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size(), mediaSourceHolder.index));
        enableChildSource(Integer.valueOf(mediaSourceHolder.index));
        mediaSourceHolder.activeMediaPeriods++;
        if (mediaPeriodId.isAd()) {
            longValue = 0;
        } else {
            Long l = mediaSourceHolder.periodTimeOffsetsByUid.get(copyWithWindowSequenceNumber.periodUid);
            l.getClass();
            longValue = l.longValue();
        }
        TimeOffsetMediaPeriod timeOffsetMediaPeriod = new TimeOffsetMediaPeriod(mediaSourceHolder.mediaSource.createPeriod(copyWithWindowSequenceNumber, allocator, j - longValue), longValue);
        this.mediaSourceByMediaPeriod.put(timeOffsetMediaPeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return timeOffsetMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public Timeline getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size())) {
            return null;
        }
        return mediaPeriodId.copyWithPeriodUid(getPeriodUid(num.intValue(), mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size()));
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(Integer num, long j, MediaSource.MediaPeriodId mediaPeriodId) {
        Long l;
        return (j == C.TIME_UNSET || mediaPeriodId == null || mediaPeriodId.isAd() || (l = ((MediaSourceHolder) this.mediaSourceHolders.get(num.intValue())).periodTimeOffsetsByUid.get(mediaPeriodId.periodUid)) == null) ? j : Util.usToMs(l.longValue()) + j;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new Handler(new of0(this, (byte) 1));
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            prepareChildSource(Integer.valueOf(i), ((MediaSourceHolder) this.mediaSourceHolders.get(i)).mediaSource);
        }
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder remove = this.mediaSourceByMediaPeriod.remove(mediaPeriod);
        remove.getClass();
        remove.mediaSource.releasePeriod(((TimeOffsetMediaPeriod) mediaPeriod).getWrappedMediaPeriod());
        remove.activeMediaPeriods--;
        if (this.mediaSourceByMediaPeriod.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public void lambda$prepareChildSource$0(Integer num, MediaSource mediaSource, Timeline timeline) {
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(Integer num, int i) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void enableInternal() {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private int index;
        private MediaItem mediaItem;
        private MediaSource.Factory mediaSourceFactory;
        private final zx1 mediaSourceHoldersBuilder = dy1.n();

        public Builder add(MediaItem mediaItem, long j) {
            mediaItem.getClass();
            if (j == C.TIME_UNSET) {
                MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
                if (clippingConfiguration.endPositionMs != Long.MIN_VALUE) {
                    j = Util.usToMs(clippingConfiguration.endPositionUs - clippingConfiguration.startPositionUs);
                }
            }
            sp0.w(this.mediaSourceFactory, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return add(this.mediaSourceFactory.createMediaSource(mediaItem), j);
        }

        public ConcatenatingMediaSource2 build() {
            sp0.p(this.index > 0, "Must add at least one source to the concatenation.");
            MediaItem mediaItem = this.mediaItem;
            if (mediaItem == null) {
                mediaItem = MediaItem.fromUri(Uri.EMPTY);
                this.mediaItem = mediaItem;
            }
            return new ConcatenatingMediaSource2(mediaItem, this.mediaSourceHoldersBuilder.f());
        }

        public Builder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            factory.getClass();
            this.mediaSourceFactory = factory;
            return this;
        }

        public Builder useDefaultMediaSourceFactory(Context context) {
            return setMediaSourceFactory(new DefaultMediaSourceFactory(context));
        }

        public Builder add(MediaSource mediaSource) {
            return add(mediaSource, C.TIME_UNSET);
        }

        public Builder add(MediaItem mediaItem) {
            return add(mediaItem, C.TIME_UNSET);
        }

        public Builder add(MediaSource mediaSource, long j) {
            mediaSource.getClass();
            sp0.A(((mediaSource instanceof ProgressiveMediaSource) && j == C.TIME_UNSET) ? false : true, "Progressive media source must define an initial placeholder duration.");
            zx1 zx1Var = this.mediaSourceHoldersBuilder;
            int i = this.index;
            this.index = i + 1;
            zx1Var.c(new MediaSourceHolder(mediaSource, i, Util.msToUs(j)));
            return this;
        }
    }
}
