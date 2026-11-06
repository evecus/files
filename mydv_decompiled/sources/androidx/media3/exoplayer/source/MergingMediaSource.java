package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import defpackage.g33;
import defpackage.h33;
import defpackage.i33;
import defpackage.j42;
import defpackage.jb0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MergingMediaSource extends CompositeMediaSource<Integer> {
    private static final int PERIOD_COUNT_UNSET = -1;
    private static final MediaItem PLACEHOLDER_MEDIA_ITEM = new MediaItem.Builder().setMediaId("MergingMediaSource").build();
    private final boolean adjustPeriodTimeOffsets;
    private final boolean clipDurations;
    private final Map<Object, Long> clippedDurationsUs;
    private final g33 clippedMediaPeriods;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private boolean enableClippingInMediaPeriod;
    private final List<List<MediaPeriodAndId>> mediaPeriods;
    private final MediaSource[] mediaSources;
    private IllegalMergeException mergeError;
    private final ArrayList<MediaSource> pendingTimelineSources;
    private int periodCount;
    private long[][] periodTimeOffsetsUs;
    private final Timeline[] timelines;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ClippedTimeline extends ForwardingTimeline {
        private final long[] periodDurationsUs;
        private final long[] windowDurationsUs;

        public ClippedTimeline(Timeline timeline, Map<Object, Long> map) {
            super(timeline);
            int windowCount = timeline.getWindowCount();
            this.windowDurationsUs = new long[timeline.getWindowCount()];
            Timeline.Window window = new Timeline.Window();
            for (int i = 0; i < windowCount; i++) {
                this.windowDurationsUs[i] = timeline.getWindow(i, window).durationUs;
            }
            int periodCount = timeline.getPeriodCount();
            this.periodDurationsUs = new long[periodCount];
            Timeline.Period period = new Timeline.Period();
            for (int i2 = 0; i2 < periodCount; i2++) {
                timeline.getPeriod(i2, period, true);
                Long l = map.get(period.uid);
                l.getClass();
                long longValue = l.longValue();
                long[] jArr = this.periodDurationsUs;
                longValue = longValue == Long.MIN_VALUE ? period.durationUs : longValue;
                jArr[i2] = longValue;
                long j = period.durationUs;
                if (j != C.TIME_UNSET) {
                    long[] jArr2 = this.windowDurationsUs;
                    int i3 = period.windowIndex;
                    jArr2[i3] = jArr2[i3] - (j - longValue);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            super.getPeriod(i, period, z);
            period.durationUs = this.periodDurationsUs[i];
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            long j2;
            super.getWindow(i, window, j);
            long j3 = this.windowDurationsUs[i];
            window.durationUs = j3;
            if (j3 != C.TIME_UNSET) {
                long j4 = window.defaultPositionUs;
                if (j4 != C.TIME_UNSET) {
                    j2 = Math.min(j4, j3);
                    window.defaultPositionUs = j2;
                    return window;
                }
            }
            j2 = window.defaultPositionUs;
            window.defaultPositionUs = j2;
            return window;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalMergeException(int i) {
            this.reason = i;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MediaPeriodAndId {
        private final MediaPeriod mediaPeriod;
        private final MediaSource.MediaPeriodId mediaPeriodId;

        private MediaPeriodAndId(MediaSource.MediaPeriodId mediaPeriodId, MediaPeriod mediaPeriod) {
            this.mediaPeriodId = mediaPeriodId;
            this.mediaPeriod = mediaPeriod;
        }
    }

    public MergingMediaSource(boolean z, boolean z2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, MediaSource... mediaSourceArr) {
        this.adjustPeriodTimeOffsets = z;
        this.clipDurations = z2;
        this.mediaSources = mediaSourceArr;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.pendingTimelineSources = new ArrayList<>(Arrays.asList(mediaSourceArr));
        this.periodCount = -1;
        this.mediaPeriods = new ArrayList(mediaSourceArr.length);
        for (int i = 0; i < mediaSourceArr.length; i++) {
            this.mediaPeriods.add(new ArrayList());
        }
        this.timelines = new Timeline[mediaSourceArr.length];
        this.periodTimeOffsetsUs = new long[0][];
        this.clippedDurationsUs = new HashMap();
        j42.l(8, "expectedKeys");
        j42.l(2, "expectedValuesPerKey");
        jb0 b = jb0.b(8);
        h33 h33Var = new h33();
        j42.l(2, "expectedValuesPerKey");
        i33 i33Var = new i33(b);
        i33Var.O = h33Var;
        this.clippedMediaPeriods = i33Var;
    }

    private void computePeriodTimeOffsets() {
        Timeline.Period period = new Timeline.Period();
        for (int i = 0; i < this.periodCount; i++) {
            long j = -this.timelines[0].getPeriod(i, period).getPositionInWindowUs();
            int i2 = 1;
            while (true) {
                Timeline[] timelineArr = this.timelines;
                if (i2 < timelineArr.length) {
                    this.periodTimeOffsetsUs[i][i2] = j - (-timelineArr[i2].getPeriod(i, period).getPositionInWindowUs());
                    i2++;
                }
            }
        }
    }

    private void updateClippedDuration() {
        Timeline[] timelineArr;
        Timeline.Period period = new Timeline.Period();
        for (int i = 0; i < this.periodCount; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                timelineArr = this.timelines;
                if (i2 >= timelineArr.length) {
                    break;
                }
                long durationUs = timelineArr[i2].getPeriod(i, period).getDurationUs();
                if (durationUs != C.TIME_UNSET) {
                    long j2 = durationUs + this.periodTimeOffsetsUs[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object uidOfPeriod = timelineArr[0].getUidOfPeriod(i);
            this.clippedDurationsUs.put(uidOfPeriod, Long.valueOf(j));
            Iterator it = this.clippedMediaPeriods.get(uidOfPeriod).iterator();
            while (it.hasNext()) {
                ((ClippingMediaPeriod) it.next()).updateClipping(0L, j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        MediaSource[] mediaSourceArr = this.mediaSources;
        return mediaSourceArr.length > 0 && mediaSourceArr[0].canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        int length = this.mediaSources.length;
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[length];
        int indexOfPeriod = this.timelines[0].getIndexOfPeriod(mediaPeriodId.periodUid);
        for (int i = 0; i < length; i++) {
            MediaSource.MediaPeriodId copyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(this.timelines[i].getUidOfPeriod(indexOfPeriod));
            mediaPeriodArr[i] = this.mediaSources[i].createPeriod(copyWithPeriodUid, allocator, j - this.periodTimeOffsetsUs[indexOfPeriod][i]);
            this.mediaPeriods.get(i).add(new MediaPeriodAndId(copyWithPeriodUid, mediaPeriodArr[i]));
        }
        MergingMediaPeriod mergingMediaPeriod = new MergingMediaPeriod(this.compositeSequenceableLoaderFactory, this.periodTimeOffsetsUs[indexOfPeriod], mediaPeriodArr);
        if (!this.clipDurations) {
            return mergingMediaPeriod;
        }
        Long l = this.clippedDurationsUs.get(mediaPeriodId.periodUid);
        l.getClass();
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(mergingMediaPeriod, false, 0L, l.longValue(), this.enableClippingInMediaPeriod);
        this.clippedMediaPeriods.put(mediaPeriodId.periodUid, clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        MediaSource[] mediaSourceArr = this.mediaSources;
        return mediaSourceArr.length > 0 ? mediaSourceArr[0].getMediaItem() : PLACEHOLDER_MEDIA_ITEM;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        List<MediaPeriodAndId> list = this.mediaPeriods.get(num.intValue());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mediaPeriodId.equals(mediaPeriodId)) {
                return this.mediaPeriods.get(0).get(i).mediaPeriodId;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        IllegalMergeException illegalMergeException = this.mergeError;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, MediaSource mediaSource, Timeline timeline) {
        int i;
        if (this.mergeError != null) {
            return;
        }
        if (this.periodCount == -1) {
            i = timeline.getPeriodCount();
            this.periodCount = i;
        } else {
            int periodCount = timeline.getPeriodCount();
            int i2 = this.periodCount;
            if (periodCount != i2) {
                this.mergeError = new IllegalMergeException(0);
                return;
            }
            i = i2;
        }
        if (this.periodTimeOffsetsUs.length == 0) {
            this.periodTimeOffsetsUs = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, this.timelines.length);
        }
        this.pendingTimelineSources.remove(mediaSource);
        this.timelines[num.intValue()] = timeline;
        if (this.pendingTimelineSources.isEmpty()) {
            if (this.adjustPeriodTimeOffsets) {
                computePeriodTimeOffsets();
            }
            Timeline timeline2 = this.timelines[0];
            if (this.clipDurations) {
                updateClippedDuration();
                timeline2 = new ClippedTimeline(timeline2, this.clippedDurationsUs);
            }
            refreshSourceInfo(timeline2);
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        for (int i = 0; i < this.mediaSources.length; i++) {
            prepareChildSource(Integer.valueOf(i), this.mediaSources[i]);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        if (this.clipDurations) {
            ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) mediaPeriod;
            Iterator it = this.clippedMediaPeriods.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((ClippingMediaPeriod) entry.getValue()).equals(clippingMediaPeriod)) {
                    this.clippedMediaPeriods.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            mediaPeriod = clippingMediaPeriod.mediaPeriod;
        }
        MergingMediaPeriod mergingMediaPeriod = (MergingMediaPeriod) mediaPeriod;
        for (int i = 0; i < this.mediaSources.length; i++) {
            List<MediaPeriodAndId> list = this.mediaPeriods.get(i);
            MediaPeriod childPeriod = mergingMediaPeriod.getChildPeriod(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (list.get(i2).mediaPeriod.equals(childPeriod)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            this.mediaSources[i].releasePeriod(mergingMediaPeriod.getChildPeriod(i));
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.timelines, (Object) null);
        this.periodCount = -1;
        this.mergeError = null;
        this.pendingTimelineSources.clear();
        Collections.addAll(this.pendingTimelineSources, this.mediaSources);
    }

    public void setEnableClippingInMediaPeriod(boolean z) {
        this.enableClippingInMediaPeriod = z;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        this.mediaSources[0].updateMediaItem(mediaItem);
    }

    public MergingMediaSource(boolean z, MediaSource... mediaSourceArr) {
        this(z, false, mediaSourceArr);
    }

    public MergingMediaSource(boolean z, boolean z2, MediaSource... mediaSourceArr) {
        this(z, z2, new DefaultCompositeSequenceableLoaderFactory(), mediaSourceArr);
    }

    public MergingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }
}
