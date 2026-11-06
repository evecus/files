package androidx.media3.exoplayer;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.ShuffleOrder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class PlaylistTimeline extends AbstractConcatenatedTimeline {
    private final HashMap<Object, Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final Timeline[] timelines;
    private final Object[] uids;
    private final int windowCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private PlaylistTimeline(Timeline[] timelineArr, Object[] objArr, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int i = 0;
        int length = timelineArr.length;
        this.timelines = timelineArr;
        this.firstPeriodInChildIndices = new int[length];
        this.firstWindowInChildIndices = new int[length];
        this.uids = objArr;
        this.childIndexByUid = new HashMap<>();
        int length2 = timelineArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            Timeline timeline = timelineArr[i];
            this.timelines[i4] = timeline;
            this.firstWindowInChildIndices[i4] = i2;
            this.firstPeriodInChildIndices[i4] = i3;
            i2 += timeline.getWindowCount();
            i3 += this.timelines[i4].getPeriodCount();
            this.childIndexByUid.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.windowCount = i2;
        this.periodCount = i3;
    }

    private static Timeline[] getTimelines(Collection<? extends MediaSourceInfoHolder> collection) {
        Timeline[] timelineArr = new Timeline[collection.size()];
        Iterator<? extends MediaSourceInfoHolder> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            timelineArr[i] = it.next().getTimeline();
            i++;
        }
        return timelineArr;
    }

    private static Object[] getUids(Collection<? extends MediaSourceInfoHolder> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends MediaSourceInfoHolder> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next().getUid();
            i++;
        }
        return objArr;
    }

    public PlaylistTimeline copyWithPlaceholderTimeline(ShuffleOrder shuffleOrder) {
        Timeline[] timelineArr = new Timeline[this.timelines.length];
        int i = 0;
        while (true) {
            Timeline[] timelineArr2 = this.timelines;
            if (i >= timelineArr2.length) {
                return new PlaylistTimeline(timelineArr, this.uids, shuffleOrder);
            }
            timelineArr[i] = new ForwardingTimeline(timelineArr2[i]) { // from class: androidx.media3.exoplayer.PlaylistTimeline.1
                private final Timeline.Window window = new Timeline.Window();

                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z) {
                    Timeline.Period period2 = super.getPeriod(i2, period, z);
                    if (getWindow(period2.windowIndex, this.window).isLive()) {
                        period2.set(period.id, period.uid, period.windowIndex, period.durationUs, period.positionInWindowUs, AdPlaybackState.NONE, true);
                        return period2;
                    }
                    period2.isPlaceholder = true;
                    return period2;
                }
            };
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByChildUid(Object obj) {
        Integer num = this.childIndexByUid.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByPeriodIndex(int i) {
        return Util.binarySearchFloor(this.firstPeriodInChildIndices, i + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByWindowIndex(int i) {
        return Util.binarySearchFloor(this.firstWindowInChildIndices, i + 1, false, false);
    }

    public List<Timeline> getChildTimelines() {
        return Arrays.asList(this.timelines);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public Object getChildUidByChildIndex(int i) {
        return this.uids[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getFirstPeriodIndexByChildIndex(int i) {
        return this.firstPeriodInChildIndices[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getFirstWindowIndexByChildIndex(int i) {
        return this.firstWindowInChildIndices[i];
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return this.periodCount;
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public Timeline getTimelineByChildIndex(int i) {
        return this.timelines[i];
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return this.windowCount;
    }

    public PlaylistTimeline(Collection<? extends MediaSourceInfoHolder> collection, ShuffleOrder shuffleOrder) {
        this(getTimelines(collection), getUids(collection), shuffleOrder);
    }
}
