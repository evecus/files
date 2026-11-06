package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class TimelineWithUpdatedMediaItem extends ForwardingTimeline {
    private final MediaItem updatedMediaItem;

    private TimelineWithUpdatedMediaItem(Timeline timeline, MediaItem mediaItem) {
        super(timeline);
        this.updatedMediaItem = mediaItem;
    }

    public static TimelineWithUpdatedMediaItem create(Timeline timeline, MediaItem mediaItem) {
        return timeline instanceof TimelineWithUpdatedMediaItem ? new TimelineWithUpdatedMediaItem(((TimelineWithUpdatedMediaItem) timeline).timeline, mediaItem) : new TimelineWithUpdatedMediaItem(timeline, mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        super.getWindow(i, window, j);
        MediaItem mediaItem = this.updatedMediaItem;
        window.mediaItem = mediaItem;
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        window.tag = localConfiguration != null ? localConfiguration.tag : null;
        return window;
    }
}
