package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.MediaPeriodHolder;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import defpackage.dy1;
import defpackage.zx1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class MediaPeriodQueue {
    public static final long INITIAL_RENDERER_POSITION_OFFSET_US = 1000000000000L;
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private static final long MAX_EFFECTIVE_START_POSITION_DIFF_WITH_PROJECTION_US = 5000000;
    static final int UPDATE_PERIOD_QUEUE_ALTERED_PREWARMING_PERIOD = 2;
    static final int UPDATE_PERIOD_QUEUE_ALTERED_READING_PERIOD = 1;
    private final AnalyticsCollector analyticsCollector;
    private final HandlerWrapper analyticsCollectorHandler;
    private int length;
    private MediaPeriodHolder loading;
    private final MediaPeriodHolder.Factory mediaPeriodHolderFactory;
    private long nextWindowSequenceNumber;
    private Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;
    private MediaPeriodHolder playing;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private MediaPeriodHolder preloading;
    private final MediaPeriodHolder[] prewarmingPeriods;
    private final MediaPeriodHolder[] readingPeriods;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final Timeline.Period period = new Timeline.Period();
    private final Timeline.Window window = new Timeline.Window();
    private List<MediaPeriodHolder> preloadPriorityList = new ArrayList();

    public MediaPeriodQueue(AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, MediaPeriodHolder.Factory factory, ExoPlayer.PreloadConfiguration preloadConfiguration, int i) {
        this.analyticsCollector = analyticsCollector;
        this.analyticsCollectorHandler = handlerWrapper;
        this.mediaPeriodHolderFactory = factory;
        this.preloadConfiguration = preloadConfiguration;
        this.readingPeriods = new MediaPeriodHolder[i];
        this.prewarmingPeriods = new MediaPeriodHolder[i];
    }

    public static boolean areDurationsCompatible(long j, long j2) {
        return j == C.TIME_UNSET || j == j2;
    }

    private boolean canKeepMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, MediaPeriodInfo mediaPeriodInfo2) {
        if (!mediaPeriodInfo.id.equals(mediaPeriodInfo2.id)) {
            return false;
        }
        long j = mediaPeriodInfo.startPositionUs;
        long j2 = mediaPeriodInfo2.startPositionUs;
        if (j == j2) {
            return true;
        }
        long j3 = mediaPeriodInfo.liveStreamStartPositionProjectionUs;
        if (j3 != C.TIME_UNSET) {
            long j4 = mediaPeriodInfo2.liveStreamStartPositionProjectionUs;
            if (j4 != C.TIME_UNSET) {
                if (Math.abs((j2 - j4) - (j - j3)) < MAX_EFFECTIVE_START_POSITION_DIFF_WITH_PROJECTION_US) {
                    return true;
                }
            }
        }
        return false;
    }

    private Pair<Object, Long> getDefaultPeriodPositionOfNextWindow(Timeline timeline, Object obj) {
        int nextWindowIndex = timeline.getNextWindowIndex(timeline.getPeriodByUid(obj, this.period).windowIndex, this.repeatMode, this.shuffleModeEnabled);
        if (nextWindowIndex != -1) {
            return timeline.getPeriodPositionUs(this.window, this.period, nextWindowIndex, C.TIME_UNSET);
        }
        return null;
    }

    private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.timeline, playbackInfo.periodId, playbackInfo.requestedContentPositionUs, playbackInfo.positionUs, C.TIME_UNSET);
    }

    private MediaPeriodInfo getFirstMediaPeriodInfoOfNextPeriod(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j) {
        Object obj;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(mediaPeriodInfo.id.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
        if (nextPeriodIndex == -1) {
            return null;
        }
        int i = timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
        Object obj2 = this.period.uid;
        obj2.getClass();
        long j8 = mediaPeriodInfo.id.windowSequenceNumber;
        if (timeline.getWindow(i, this.window).firstPeriodIndex == nextPeriodIndex) {
            Timeline.Period period = this.period;
            long max = shouldUseLiveStartPositionProjection(timeline, period.windowIndex, period.durationUs, this.window) ? Math.max(0L, j) : -9223372036854775807L;
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i, C.TIME_UNSET, max);
            if (periodPositionUs == null) {
                return null;
            }
            Object obj3 = periodPositionUs.first;
            long longValue = ((Long) periodPositionUs.second).longValue();
            MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (next == null || !next.uid.equals(obj3)) {
                long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj3);
                if (resolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                    resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                }
                j8 = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            } else {
                j8 = next.info.id.windowSequenceNumber;
            }
            obj = obj3;
            j2 = longValue;
            j3 = -9223372036854775807L;
            j4 = max;
        } else {
            obj = obj2;
            j2 = 0;
            j3 = 0;
            j4 = -9223372036854775807L;
        }
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j2, j8, this.window, this.period);
        if (j3 != C.TIME_UNSET && mediaPeriodInfo.requestedContentPositionUs != C.TIME_UNSET) {
            boolean hasServerSideInsertedAds = hasServerSideInsertedAds(mediaPeriodInfo.id.periodUid, timeline);
            if (resolveMediaPeriodIdForAds.isAd() && hasServerSideInsertedAds) {
                j5 = j2;
                j7 = mediaPeriodInfo.requestedContentPositionUs;
                j6 = j4;
                return getMediaPeriodInfo(timeline, resolveMediaPeriodIdForAds, j7, j5, j6);
            }
            if (hasServerSideInsertedAds) {
                j2 = mediaPeriodInfo.requestedContentPositionUs;
            }
        }
        j5 = j2;
        j6 = j4;
        j7 = j3;
        return getMediaPeriodInfo(timeline, resolveMediaPeriodIdForAds, j7, j5, j6);
    }

    private MediaPeriodInfo getFollowingMediaPeriodInfo(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j) {
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        long rendererOffset = (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j;
        return mediaPeriodInfo.isLastInTimelinePeriod ? getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, rendererOffset) : getFollowingMediaPeriodInfoOfCurrentPeriod(timeline, mediaPeriodHolder, rendererOffset);
    }

    private MediaPeriodInfo getFollowingMediaPeriodInfoOfCurrentPeriod(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j) {
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (!mediaPeriodId.isAd()) {
            int i = mediaPeriodId.nextAdGroupIndex;
            if (i != -1 && this.period.isLivePostrollPlaceholder(i)) {
                return getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, j);
            }
            int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(mediaPeriodId.nextAdGroupIndex);
            boolean z = this.period.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex) && this.period.getAdState(mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay) == 3;
            if (firstAdIndexToPlay == this.period.getAdCountInAdGroup(mediaPeriodId.nextAdGroupIndex) || z) {
                return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), C.TIME_UNSET, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
            }
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
        }
        int i2 = mediaPeriodId.adGroupIndex;
        int adCountInAdGroup = this.period.getAdCountInAdGroup(i2);
        if (adCountInAdGroup == -1) {
            return null;
        }
        int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i2, mediaPeriodId.adIndexInAdGroup);
        if (nextAdIndexToPlay < adCountInAdGroup) {
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, i2, nextAdIndexToPlay, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
        }
        long j2 = mediaPeriodInfo.requestedContentPositionUs;
        long j3 = C.TIME_UNSET;
        if (j2 == C.TIME_UNSET) {
            Timeline.Period period = this.period;
            if (shouldUseLiveStartPositionProjection(timeline, period.windowIndex, period.durationUs, this.window)) {
                j3 = Math.max(0L, j);
            }
            long j4 = j3;
            Timeline.Window window = this.window;
            Timeline.Period period2 = this.period;
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period2, period2.windowIndex, C.TIME_UNSET, j4);
            if (periodPositionUs == null) {
                return null;
            }
            j2 = ((Long) periodPositionUs.second).longValue();
            j3 = j4;
        }
        return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, Math.max(getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), j2), j3, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
    }

    private long getMediaPeriodDuration(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (mediaPeriodId.isAd()) {
            return this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        }
        int i = mediaPeriodId.nextAdGroupIndex;
        Timeline.Period period = this.period;
        if (i == -1) {
            return period.getDurationUs();
        }
        long adGroupTimeUs = period.getAdGroupTimeUs(i);
        return adGroupTimeUs == Long.MIN_VALUE ? this.period.getDurationUs() : adGroupTimeUs;
    }

    private MediaPeriodInfo getMediaPeriodInfo(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        boolean isAd = mediaPeriodId.isAd();
        Object obj = mediaPeriodId.periodUid;
        return isAd ? getMediaPeriodInfoForAd(timeline, obj, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j, mediaPeriodId.windowSequenceNumber) : getMediaPeriodInfoForContent(timeline, obj, j2, j3, j, mediaPeriodId.windowSequenceNumber);
    }

    private MediaPeriodInfo getMediaPeriodInfoForAd(Timeline timeline, Object obj, int i, int i2, long j, long j2) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i, i2, j2);
        long adDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long adResumePositionUs = i2 == this.period.getFirstAdIndexToPlay(i) ? this.period.getAdResumePositionUs() : 0L;
        boolean isServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        if (adDurationUs != C.TIME_UNSET && adResumePositionUs >= adDurationUs) {
            adResumePositionUs = Math.max(0L, adDurationUs - 1);
        }
        return new MediaPeriodInfo(mediaPeriodId, adResumePositionUs, C.TIME_UNSET, j, adDurationUs, isServerSideInsertedAdGroup, false, false, false);
    }

    private MediaPeriodInfo getMediaPeriodInfoForContent(Timeline timeline, Object obj, long j, long j2, long j3, long j4) {
        timeline.getPeriodByUid(obj, this.period);
        int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(j);
        if (adGroupIndexAfterPositionUs != -1 && this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs)) {
            long adGroupTimeUs = this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
            Timeline.Period period = this.period;
            if (adGroupTimeUs == period.durationUs && period.hasPlayedAdGroup(adGroupIndexAfterPositionUs)) {
                adGroupIndexAfterPositionUs = -1;
            }
        }
        boolean z = (adGroupIndexAfterPositionUs == -1 || !this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs) || this.period.isLivePostrollPlaceholder(adGroupIndexAfterPositionUs)) ? false : true;
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j4, adGroupIndexAfterPositionUs);
        boolean isLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean isLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean isLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, isLastInPeriod);
        long mediaPeriodDuration = getMediaPeriodDuration(timeline, mediaPeriodId);
        return new MediaPeriodInfo(mediaPeriodId, (mediaPeriodDuration == C.TIME_UNSET || j < mediaPeriodDuration) ? j : Math.max(0L, mediaPeriodDuration - 1), j2, j3, mediaPeriodDuration, z, isLastInPeriod, isLastInWindow, isLastInTimeline);
    }

    private MediaPeriodInfo getMediaPeriodInfoForPeriodPosition(Timeline timeline, Object obj, long j, long j2) {
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j, j2, this.window, this.period);
        boolean isAd = resolveMediaPeriodIdForAds.isAd();
        Object obj2 = resolveMediaPeriodIdForAds.periodUid;
        return isAd ? getMediaPeriodInfoForAd(timeline, obj2, resolveMediaPeriodIdForAds.adGroupIndex, resolveMediaPeriodIdForAds.adIndexInAdGroup, j, resolveMediaPeriodIdForAds.windowSequenceNumber) : getMediaPeriodInfoForContent(timeline, obj2, j, C.TIME_UNSET, C.TIME_UNSET, resolveMediaPeriodIdForAds.windowSequenceNumber);
    }

    private long getMinStartPositionAfterAdGroupUs(Timeline timeline, Object obj, int i) {
        timeline.getPeriodByUid(obj, this.period);
        long adGroupTimeUs = this.period.getAdGroupTimeUs(i);
        Timeline.Period period = this.period;
        return adGroupTimeUs == Long.MIN_VALUE ? period.durationUs : period.getContentResumeOffsetUs(i) + adGroupTimeUs;
    }

    private boolean hasAnyRendererReadBeyondDuration(MediaPeriodHolder[] mediaPeriodHolderArr, long[] jArr, MediaPeriodHolder mediaPeriodHolder, long j) {
        for (int i = 0; i < mediaPeriodHolderArr.length; i++) {
            MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolderArr[i];
            if (mediaPeriodHolder2 != null) {
                if (isPeriodAfter(mediaPeriodHolder2, mediaPeriodHolder)) {
                    return true;
                }
                if (mediaPeriodHolder2 != mediaPeriodHolder) {
                    continue;
                } else {
                    long j2 = jArr[i];
                    if (j2 == Long.MIN_VALUE || j2 >= j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean hasServerSideInsertedAds(Object obj, Timeline timeline) {
        int adGroupCount = timeline.getPeriodByUid(obj, this.period).getAdGroupCount();
        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
        if (adGroupCount <= 0 || !this.period.isServerSideInsertedAdGroup(removedAdGroupCount)) {
            return false;
        }
        return adGroupCount > 1 || this.period.getAdGroupTimeUs(removedAdGroupCount) != Long.MIN_VALUE;
    }

    private boolean isLastInPeriod(MediaSource.MediaPeriodId mediaPeriodId) {
        return !mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1;
    }

    private boolean isLastInTimeline(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, boolean z) {
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, this.window).isDynamic && timeline.isLastPeriod(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z;
    }

    private boolean isLastInWindow(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (isLastInPeriod(mediaPeriodId)) {
            return timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window).lastPeriodIndex == timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        }
        return false;
    }

    private boolean isPeriodAfter(MediaPeriodHolder mediaPeriodHolder, MediaPeriodHolder mediaPeriodHolder2) {
        for (MediaPeriodHolder next = mediaPeriodHolder2.getNext(); next != null; next = next.getNext()) {
            if (next == mediaPeriodHolder) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSkippableAdPeriod(Timeline.Period period) {
        int adGroupCount = period.getAdGroupCount();
        if (adGroupCount != 0 && ((adGroupCount != 1 || !period.isLivePostrollPlaceholder(0)) && period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount()))) {
            long j = 0;
            if (period.getAdGroupIndexForPositionUs(0L) == -1) {
                if (period.durationUs == 0) {
                    return true;
                }
                int i = adGroupCount - (period.isLivePostrollPlaceholder(adGroupCount + (-1)) ? 2 : 1);
                for (int i2 = 0; i2 <= i; i2++) {
                    j += period.getContentResumeOffsetUs(i2);
                }
                if (period.durationUs <= j) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyQueueUpdate$0(zx1 zx1Var, MediaSource.MediaPeriodId mediaPeriodId) {
        this.analyticsCollector.updateMediaPeriodQueueInfo(zx1Var.f(), mediaPeriodId);
    }

    private void notifyQueueUpdate() {
        MediaPeriodHolder mediaPeriodHolder;
        zx1 n = dy1.n();
        for (MediaPeriodHolder mediaPeriodHolder2 = this.playing; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.getNext()) {
            n.c(mediaPeriodHolder2.info.id);
        }
        MediaPeriodHolder[] mediaPeriodHolderArr = this.readingPeriods;
        this.analyticsCollectorHandler.post(new a0(this, n, (mediaPeriodHolderArr.length == 0 || (mediaPeriodHolder = mediaPeriodHolderArr[0]) == null) ? null : mediaPeriodHolder.info.id, (byte) 0));
    }

    private void releaseAndResetPreloadPriorityList(List<MediaPeriodHolder> list) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            this.preloadPriorityList.get(i).release();
        }
        this.preloadPriorityList = list;
        this.preloading = null;
        maybeUpdatePreloadMediaPeriodHolder();
    }

    private MediaPeriodHolder removePreloadedMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            if (this.preloadPriorityList.get(i).canBeUsedForMediaPeriodInfo(mediaPeriodInfo)) {
                return this.preloadPriorityList.remove(i);
            }
        }
        return null;
    }

    private static MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j, long j2, Timeline.Window window, Timeline.Period period) {
        timeline.getPeriodByUid(obj, period);
        timeline.getWindow(period.windowIndex, window);
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); isSkippableAdPeriod(period) && indexOfPeriod <= window.lastPeriodIndex; indexOfPeriod++) {
            timeline.getPeriod(indexOfPeriod, period, true);
            obj = period.uid;
            obj.getClass();
        }
        timeline.getPeriodByUid(obj, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(j);
        return adGroupIndexForPositionUs == -1 ? new MediaSource.MediaPeriodId(obj, j2, period.getAdGroupIndexAfterPositionUs(j)) : new MediaSource.MediaPeriodId(obj, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j2);
    }

    private long resolvePeriodUidToWindowSequenceNumber(Timeline timeline, Object obj) {
        int indexOfPeriod;
        int i = timeline.getPeriodByUid(obj, this.period).windowIndex;
        Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = timeline.getIndexOfPeriod(obj2)) != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (MediaPeriodHolder mediaPeriodHolder = this.playing; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.getNext()) {
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.id.windowSequenceNumber;
            }
        }
        for (MediaPeriodHolder mediaPeriodHolder2 = this.playing; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.getNext()) {
            int indexOfPeriod2 = timeline.getIndexOfPeriod(mediaPeriodHolder2.uid);
            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i) {
                return mediaPeriodHolder2.info.id.windowSequenceNumber;
            }
        }
        long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj);
        if (resolvePeriodUidToWindowSequenceNumberInPreloadPeriods != -1) {
            return resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        }
        long j = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j;
        if (this.playing == null) {
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = j;
        }
        return j;
    }

    private long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(Object obj) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i);
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.id.windowSequenceNumber;
            }
        }
        return -1L;
    }

    private static boolean shouldUseLiveStartPositionProjection(Timeline timeline, int i, long j, Timeline.Window window) {
        if (j != C.TIME_UNSET) {
            return false;
        }
        timeline.getWindow(i, window);
        return window.isDynamic && !window.isPlaceholder;
    }

    private int updateForPlaybackModeChange(Timeline timeline) {
        Timeline timeline2;
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return 0;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodHolder.uid);
        while (true) {
            timeline2 = timeline;
            indexOfPeriod = timeline2.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (true) {
                mediaPeriodHolder.getClass();
                if (mediaPeriodHolder.getNext() == null || mediaPeriodHolder.info.isLastInTimelinePeriod) {
                    break;
                }
                mediaPeriodHolder = mediaPeriodHolder.getNext();
            }
            MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (indexOfPeriod == -1 || next == null || timeline2.getIndexOfPeriod(next.uid) != indexOfPeriod) {
                break;
            }
            mediaPeriodHolder = next;
            timeline = timeline2;
        }
        int removeAfter = removeAfter(mediaPeriodHolder);
        mediaPeriodHolder.info = getUpdatedMediaPeriodInfo(timeline2, mediaPeriodHolder.info);
        return removeAfter;
    }

    private void updatePrewarmingMatchingPlayingPeriod() {
        this.playing.getClass();
        int i = 0;
        while (true) {
            MediaPeriodHolder[] mediaPeriodHolderArr = this.prewarmingPeriods;
            if (i >= mediaPeriodHolderArr.length) {
                return;
            }
            if (this.playing.equals(mediaPeriodHolderArr[i])) {
                this.prewarmingPeriods[i] = this.playing.getNext();
            }
            i++;
        }
    }

    private void updateReadingMatchingPlayingPeriod() {
        this.playing.getClass();
        int i = 0;
        while (true) {
            MediaPeriodHolder[] mediaPeriodHolderArr = this.readingPeriods;
            if (i >= mediaPeriodHolderArr.length) {
                return;
            }
            if (this.playing.equals(mediaPeriodHolderArr[i])) {
                this.readingPeriods[i] = this.playing.getNext();
            }
            i++;
        }
    }

    public MediaPeriodHolder advancePlayingPeriod() {
        if (this.playing == null) {
            return null;
        }
        updateReadingMatchingPlayingPeriod();
        updatePrewarmingMatchingPlayingPeriod();
        this.playing.getClass();
        this.playing.release();
        int i = this.length - 1;
        this.length = i;
        if (i == 0) {
            this.loading = null;
            MediaPeriodHolder mediaPeriodHolder = this.playing;
            this.oldFrontPeriodUid = mediaPeriodHolder.uid;
            this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder.info.id.windowSequenceNumber;
        }
        this.playing = this.playing.getNext();
        notifyQueueUpdate();
        return this.playing;
    }

    public void advancePrewarmingPeriod(int i) {
        MediaPeriodHolder[] mediaPeriodHolderArr = this.prewarmingPeriods;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodHolderArr[i];
        mediaPeriodHolder.getClass();
        mediaPeriodHolderArr[i] = mediaPeriodHolder.getNext();
        notifyQueueUpdate();
    }

    public MediaPeriodHolder advanceReadingPeriod(int i) {
        MediaPeriodHolder[] mediaPeriodHolderArr = this.prewarmingPeriods;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodHolderArr[i];
        MediaPeriodHolder mediaPeriodHolder2 = this.readingPeriods[i];
        if (mediaPeriodHolder == mediaPeriodHolder2) {
            mediaPeriodHolder2.getClass();
            mediaPeriodHolderArr[i] = mediaPeriodHolder2.getNext();
        }
        MediaPeriodHolder[] mediaPeriodHolderArr2 = this.readingPeriods;
        MediaPeriodHolder mediaPeriodHolder3 = mediaPeriodHolderArr2[i];
        mediaPeriodHolder3.getClass();
        mediaPeriodHolderArr2[i] = mediaPeriodHolder3.getNext();
        notifyQueueUpdate();
        MediaPeriodHolder mediaPeriodHolder4 = this.readingPeriods[i];
        mediaPeriodHolder4.getClass();
        return mediaPeriodHolder4;
    }

    public void clear() {
        if (this.length == 0) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        mediaPeriodHolder.getClass();
        this.oldFrontPeriodUid = mediaPeriodHolder.uid;
        this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder.info.id.windowSequenceNumber;
        while (mediaPeriodHolder != null) {
            mediaPeriodHolder.release();
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        this.playing = null;
        this.loading = null;
        Arrays.fill(this.readingPeriods, (Object) null);
        Arrays.fill(this.prewarmingPeriods, (Object) null);
        this.length = 0;
        notifyQueueUpdate();
    }

    public MediaPeriodHolder enqueueNextMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        long rendererOffset = mediaPeriodHolder == null ? INITIAL_RENDERER_POSITION_OFFSET_US : (mediaPeriodHolder.getRendererOffset() + this.loading.info.durationUs) - mediaPeriodInfo.startPositionUs;
        MediaPeriodHolder removePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfo);
        if (removePreloadedMediaPeriodHolder == null) {
            removePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfo, rendererOffset);
        } else {
            removePreloadedMediaPeriodHolder.info = mediaPeriodInfo;
            removePreloadedMediaPeriodHolder.setRendererOffset(rendererOffset);
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.loading;
        if (mediaPeriodHolder2 != null) {
            mediaPeriodHolder2.setNext(removePreloadedMediaPeriodHolder);
        } else {
            this.playing = removePreloadedMediaPeriodHolder;
            Arrays.fill(this.readingPeriods, removePreloadedMediaPeriodHolder);
            Arrays.fill(this.prewarmingPeriods, removePreloadedMediaPeriodHolder);
        }
        this.oldFrontPeriodUid = null;
        this.loading = removePreloadedMediaPeriodHolder;
        this.length++;
        notifyQueueUpdate();
        return removePreloadedMediaPeriodHolder;
    }

    public MediaPeriodHolder getEarliestPrewarmingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        while (mediaPeriodHolder != null) {
            for (MediaPeriodHolder mediaPeriodHolder2 : this.prewarmingPeriods) {
                if (mediaPeriodHolder == mediaPeriodHolder2) {
                    return mediaPeriodHolder;
                }
            }
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        return mediaPeriodHolder;
    }

    public MediaPeriodHolder getEarliestReadingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        while (mediaPeriodHolder != null) {
            for (MediaPeriodHolder mediaPeriodHolder2 : this.readingPeriods) {
                if (mediaPeriodHolder == mediaPeriodHolder2) {
                    return mediaPeriodHolder;
                }
            }
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        return mediaPeriodHolder;
    }

    public MediaPeriodHolder getLatestReadingPeriod() {
        MediaPeriodHolder[] mediaPeriodHolderArr = this.readingPeriods;
        if (mediaPeriodHolderArr.length == 0) {
            return null;
        }
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodHolderArr[0];
        for (MediaPeriodHolder mediaPeriodHolder2 = this.playing; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.getNext()) {
            MediaPeriodHolder[] mediaPeriodHolderArr2 = this.readingPeriods;
            int length = mediaPeriodHolderArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (mediaPeriodHolder2 == mediaPeriodHolderArr2[i]) {
                    mediaPeriodHolder = mediaPeriodHolder2;
                    break;
                }
                i++;
            }
        }
        return mediaPeriodHolder;
    }

    public MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    public MediaPeriodInfo getNextMediaPeriodInfo(long j, PlaybackInfo playbackInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null ? getFirstMediaPeriodInfo(playbackInfo) : getFollowingMediaPeriodInfo(playbackInfo.timeline, mediaPeriodHolder, j);
    }

    public MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    public MediaPeriodHolder getPreloadHolderByMediaPeriod(MediaPeriod mediaPeriod) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i);
            if (mediaPeriodHolder.mediaPeriod == mediaPeriod) {
                return mediaPeriodHolder;
            }
        }
        return null;
    }

    public MediaPeriodHolder getPreloadingPeriod() {
        return this.preloading;
    }

    public MediaPeriodHolder getPrewarmingPeriod(int i) {
        return this.prewarmingPeriods[i];
    }

    public MediaPeriodHolder getReadingPeriod(int i) {
        return this.readingPeriods[i];
    }

    public MediaPeriodInfo getUpdatedMediaPeriodInfo(Timeline timeline, MediaPeriodInfo mediaPeriodInfo) {
        boolean z;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        boolean isLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean isLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean isLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, isLastInPeriod);
        long mediaPeriodDuration = getMediaPeriodDuration(timeline, mediaPeriodInfo.id);
        timeline.getPeriodByUid(mediaPeriodInfo.id.periodUid, this.period);
        if (mediaPeriodId.isAd()) {
            z = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        } else {
            int i = mediaPeriodId.nextAdGroupIndex;
            z = (i == -1 || !this.period.isServerSideInsertedAdGroup(i) || this.period.isLivePostrollPlaceholder(mediaPeriodId.nextAdGroupIndex)) ? false : true;
        }
        return new MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.liveStreamStartPositionProjectionUs, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodDuration, z, isLastInPeriod, isLastInWindow, isLastInTimeline);
    }

    public void invalidatePreloadPool(Timeline timeline) {
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodQueue mediaPeriodQueue;
        if (this.preloadConfiguration.targetPreloadDurationUs == C.TIME_UNSET || (mediaPeriodHolder = this.loading) == null) {
            releasePreloadPool();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> defaultPeriodPositionOfNextWindow = getDefaultPeriodPositionOfNextWindow(timeline, mediaPeriodHolder.info.id.periodUid);
        if (defaultPeriodPositionOfNextWindow == null || timeline.getWindow(timeline.getPeriodByUid(defaultPeriodPositionOfNextWindow.first, this.period).windowIndex, this.window).isLive()) {
            mediaPeriodQueue = this;
        } else {
            long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(defaultPeriodPositionOfNextWindow.first);
            if (resolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                this.nextWindowSequenceNumber = 1 + resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            }
            mediaPeriodQueue = this;
            MediaPeriodInfo mediaPeriodInfoForPeriodPosition = mediaPeriodQueue.getMediaPeriodInfoForPeriodPosition(timeline, defaultPeriodPositionOfNextWindow.first, ((Long) defaultPeriodPositionOfNextWindow.second).longValue(), resolvePeriodUidToWindowSequenceNumberInPreloadPeriods);
            MediaPeriodHolder removePreloadedMediaPeriodHolder = mediaPeriodQueue.removePreloadedMediaPeriodHolder(mediaPeriodInfoForPeriodPosition);
            if (removePreloadedMediaPeriodHolder == null) {
                removePreloadedMediaPeriodHolder = mediaPeriodQueue.mediaPeriodHolderFactory.create(mediaPeriodInfoForPeriodPosition, (mediaPeriodHolder.getRendererOffset() + mediaPeriodHolder.info.durationUs) - mediaPeriodInfoForPeriodPosition.startPositionUs);
            }
            arrayList.add(removePreloadedMediaPeriodHolder);
        }
        mediaPeriodQueue.releaseAndResetPreloadPriorityList(arrayList);
    }

    public boolean isLoading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public boolean isPreloading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.preloading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public void maybeUpdatePreloadMediaPeriodHolder() {
        MediaPeriodHolder mediaPeriodHolder = this.preloading;
        if (mediaPeriodHolder == null || mediaPeriodHolder.isFullyPreloaded()) {
            this.preloading = null;
            for (int i = 0; i < this.preloadPriorityList.size(); i++) {
                MediaPeriodHolder mediaPeriodHolder2 = this.preloadPriorityList.get(i);
                if (!mediaPeriodHolder2.isFullyPreloaded()) {
                    this.preloading = mediaPeriodHolder2;
                    return;
                }
            }
        }
    }

    public void reevaluateBuffer(long j) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j);
        }
    }

    public void releasePreloadPool() {
        if (this.preloadPriorityList.isEmpty()) {
            return;
        }
        releaseAndResetPreloadPriorityList(new ArrayList());
    }

    public int removeAfter(MediaPeriodHolder mediaPeriodHolder) {
        mediaPeriodHolder.getClass();
        if (mediaPeriodHolder == this.loading) {
            return 0;
        }
        this.loading = mediaPeriodHolder;
        int i = 0;
        while (mediaPeriodHolder.getNext() != null) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
            mediaPeriodHolder.getClass();
            int i2 = 0;
            while (true) {
                MediaPeriodHolder[] mediaPeriodHolderArr = this.readingPeriods;
                if (i2 >= mediaPeriodHolderArr.length) {
                    break;
                }
                if (mediaPeriodHolder == mediaPeriodHolderArr[i2]) {
                    MediaPeriodHolder mediaPeriodHolder2 = this.playing;
                    mediaPeriodHolderArr[i2] = mediaPeriodHolder2;
                    this.prewarmingPeriods[i2] = mediaPeriodHolder2;
                    i = 3;
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                MediaPeriodHolder[] mediaPeriodHolderArr2 = this.prewarmingPeriods;
                if (i3 < mediaPeriodHolderArr2.length) {
                    if (mediaPeriodHolder == mediaPeriodHolderArr2[i3]) {
                        mediaPeriodHolderArr2[i3] = this.readingPeriods[i3];
                        i |= 2;
                    }
                    i3++;
                }
            }
            mediaPeriodHolder.release();
            this.length--;
        }
        MediaPeriodHolder mediaPeriodHolder3 = this.loading;
        mediaPeriodHolder3.getClass();
        mediaPeriodHolder3.setNext(null);
        notifyQueueUpdate();
        return i;
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(PlaybackInfo playbackInfo, Timeline timeline, Object obj, long j, boolean z, boolean z2) {
        Object obj2 = obj;
        long resolvePeriodUidToWindowSequenceNumber = resolvePeriodUidToWindowSequenceNumber(timeline, obj2);
        if (!z && !z2) {
            MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
            MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj2, j, resolvePeriodUidToWindowSequenceNumber, this.window, this.period);
            if (mediaPeriodId.isAd() && mediaPeriodId.equals(resolveMediaPeriodIdForAds)) {
                return mediaPeriodId;
            }
            timeline.getPeriodByUid(obj2, this.period);
            return new MediaSource.MediaPeriodId(obj2, resolvePeriodUidToWindowSequenceNumber, this.period.getAdGroupIndexAfterPositionUs(j));
        }
        timeline.getPeriodByUid(obj2, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        boolean z3 = false;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); indexOfPeriod >= this.window.firstPeriodIndex; indexOfPeriod--) {
            timeline.getPeriod(indexOfPeriod, this.period, true);
            boolean z4 = this.period.getAdGroupCount() > 0;
            z3 |= z4;
            Timeline.Period period = this.period;
            if (period.getAdGroupIndexForPositionUs(period.durationUs) != -1) {
                obj2 = this.period.uid;
                obj2.getClass();
            }
            if (z3 && (!z4 || this.period.durationUs != 0)) {
                break;
            }
        }
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAds2 = resolveMediaPeriodIdForAds(timeline, obj2, j, resolvePeriodUidToWindowSequenceNumber, this.window, this.period);
        if (resolveMediaPeriodIdForAds2.adGroupIndex != -1 && !z) {
            timeline.getPeriodByUid(resolveMediaPeriodIdForAds2.periodUid, this.period);
            if (this.period.adPlaybackState.getAdGroup(resolveMediaPeriodIdForAds2.adGroupIndex).timeUs != j) {
                return new MediaSource.MediaPeriodId(resolveMediaPeriodIdForAds2.periodUid, resolveMediaPeriodIdForAds2.windowSequenceNumber, this.period.getAdGroupIndexAfterPositionUs(j));
            }
        }
        return resolveMediaPeriodIdForAds2;
    }

    public boolean shouldLoadNextMediaPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            return !mediaPeriodHolder.info.isFinal && mediaPeriodHolder.isFullyBuffered() && this.loading.info.durationUs != C.TIME_UNSET && this.length < 100;
        }
        return true;
    }

    public void updatePreloadConfiguration(Timeline timeline, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        invalidatePreloadPool(timeline);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        return removeAfter(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int updateQueuedPeriods(androidx.media3.common.Timeline r14, long r15, long[] r17, long[] r18) {
        /*
            r13 = this;
            androidx.media3.exoplayer.MediaPeriodHolder r0 = r13.playing
            r1 = 0
        L3:
            r5 = r0
            r0 = 0
            if (r5 == 0) goto L9c
            androidx.media3.exoplayer.MediaPeriodInfo r8 = r5.info
            if (r1 != 0) goto L11
            androidx.media3.exoplayer.MediaPeriodInfo r1 = r13.getUpdatedMediaPeriodInfo(r14, r8)
            r2 = r15
            goto L30
        L11:
            r2 = r15
            androidx.media3.exoplayer.MediaPeriodInfo r4 = r13.getFollowingMediaPeriodInfo(r14, r1, r2)
            if (r4 == 0) goto L97
            boolean r6 = r13.canKeepMediaPeriodHolder(r8, r4)
            if (r6 != 0) goto L20
            goto L97
        L20:
            long r6 = r8.startPositionUs
            long r9 = r4.startPositionUs
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L2f
            long r9 = r8.liveStreamStartPositionProjectionUs
            androidx.media3.exoplayer.MediaPeriodInfo r1 = r4.copyWithStartPositionUs(r6, r9)
            goto L30
        L2f:
            r1 = r4
        L30:
            long r6 = r8.requestedContentPositionUs
            androidx.media3.exoplayer.MediaPeriodInfo r4 = r1.copyWithRequestedContentPositionUs(r6)
            r5.info = r4
            long r6 = r8.durationUs
            long r9 = r1.durationUs
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L90
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 != 0) goto L50
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4e:
            r6 = r1
            goto L55
        L50:
            long r1 = r5.toRendererTime(r9)
            goto L4e
        L55:
            androidx.media3.exoplayer.MediaPeriodInfo r14 = r5.info
            boolean r14 = r14.isFollowedByTransitionToSameStream
            r1 = 1
            if (r14 != 0) goto L69
            androidx.media3.exoplayer.MediaPeriodHolder[] r3 = r13.readingPeriods
            r2 = r13
            r4 = r17
            boolean r14 = r2.hasAnyRendererReadBeyondDuration(r3, r4, r5, r6)
            if (r14 == 0) goto L69
            r14 = r1
            goto L6a
        L69:
            r14 = r0
        L6a:
            androidx.media3.exoplayer.MediaPeriodHolder[] r3 = r13.prewarmingPeriods
            r2 = r13
            r4 = r18
            boolean r3 = r2.hasAnyRendererReadBeyondDuration(r3, r4, r5, r6)
            int r13 = r13.removeAfter(r5)
            if (r13 == 0) goto L7a
            return r13
        L7a:
            if (r14 == 0) goto L8a
            long r13 = r8.durationUs
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 != 0) goto L89
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r13 = r8.id
            int r13 = r13.nextAdGroupIndex
            r14 = -1
            if (r13 == r14) goto L8a
        L89:
            r0 = r1
        L8a:
            if (r3 == 0) goto L8f
            r13 = r0 | 2
            return r13
        L8f:
            return r0
        L90:
            androidx.media3.exoplayer.MediaPeriodHolder r0 = r5.getNext()
            r1 = r5
            goto L3
        L97:
            int r13 = r13.removeAfter(r1)
            return r13
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.MediaPeriodQueue.updateQueuedPeriods(androidx.media3.common.Timeline, long, long[], long[]):int");
    }

    public int updateRepeatMode(Timeline timeline, int i) {
        this.repeatMode = i;
        return updateForPlaybackModeChange(timeline);
    }

    public int updateShuffleModeEnabled(Timeline timeline, boolean z) {
        this.shuffleModeEnabled = z;
        return updateForPlaybackModeChange(timeline);
    }

    public void advancePrewarmingPeriod() {
        for (int i = 0; i < this.prewarmingPeriods.length; i++) {
            advancePrewarmingPeriod(i);
        }
    }

    public MediaPeriodHolder advanceReadingPeriod() {
        int i = 0;
        while (true) {
            MediaPeriodHolder[] mediaPeriodHolderArr = this.readingPeriods;
            if (i < mediaPeriodHolderArr.length) {
                advanceReadingPeriod(i);
                i++;
            } else {
                MediaPeriodHolder mediaPeriodHolder = mediaPeriodHolderArr[0];
                mediaPeriodHolder.getClass();
                return mediaPeriodHolder;
            }
        }
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j) {
        return resolveMediaPeriodIdForAds(timeline, obj, j, resolvePeriodUidToWindowSequenceNumber(timeline, obj), this.window, this.period);
    }
}
