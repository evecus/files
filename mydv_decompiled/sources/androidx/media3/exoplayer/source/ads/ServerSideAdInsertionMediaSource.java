package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.StreamKey;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import defpackage.c34;
import defpackage.dy1;
import defpackage.ee5;
import defpackage.iy1;
import defpackage.of;
import defpackage.rp;
import defpackage.rt0;
import defpackage.sp0;
import defpackage.wk2;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ServerSideAdInsertionMediaSource extends BaseMediaSource implements MediaSource.MediaSourceCaller, MediaSourceEventListener, DrmSessionEventListener {
    private final AdPlaybackStateUpdater adPlaybackStateUpdater;
    private SharedMediaPeriod lastUsedMediaPeriod;
    private final MediaSource mediaSource;
    private Handler playbackHandler;
    private Timeline sourceTimeline;
    private Timeline splitTimeline;
    private final wk2 mediaPeriods = new rp();
    private iy1 adPlaybackStates = c34.O;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcherWithoutId = createEventDispatcher(null);
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcherWithoutId = createDrmEventDispatcher(null);
    private final Timeline.Period period = new Timeline.Period();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface AdPlaybackStateUpdater {
        boolean onAdPlaybackStateUpdateRequested(Timeline timeline);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MediaPeriodImpl implements MediaPeriod {
        public MediaPeriod.Callback callback;
        public final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        public long endPositionUs;
        public boolean[] hasNotifiedDownstreamFormatChange = new boolean[0];
        public boolean isPrepared;
        public long lastStartPositionUs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
        public final SharedMediaPeriod sharedPeriod;

        public MediaPeriodImpl(SharedMediaPeriod sharedMediaPeriod, MediaSource.MediaPeriodId mediaPeriodId, long j, MediaSourceEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener.EventDispatcher eventDispatcher2) {
            this.sharedPeriod = sharedMediaPeriod;
            this.mediaPeriodId = mediaPeriodId;
            this.endPositionUs = j;
            this.mediaSourceEventDispatcher = eventDispatcher;
            this.drmEventDispatcher = eventDispatcher2;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return this.sharedPeriod.continueLoading(this, loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j, boolean z) {
            this.sharedPeriod.discardBuffer(this, j, z);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
            return this.sharedPeriod.getAdjustedSeekPositionUs(this, j, seekParameters);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.sharedPeriod.getBufferedPositionUs(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.sharedPeriod.getNextLoadPositionUs(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
            return this.sharedPeriod.getStreamKeys(list);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.sharedPeriod.getTrackGroups();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.sharedPeriod.isLoading(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() {
            this.sharedPeriod.maybeThrowPrepareError();
        }

        public void onPrepared() {
            MediaPeriod.Callback callback = this.callback;
            if (callback != null) {
                callback.onPrepared(this);
            }
            this.isPrepared = true;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j) {
            this.callback = callback;
            this.sharedPeriod.prepare(this, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return this.sharedPeriod.readDiscontinuity(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
            this.sharedPeriod.reevaluateBuffer(this, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j) {
            return this.sharedPeriod.seekToUs(this, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            if (this.hasNotifiedDownstreamFormatChange.length == 0) {
                this.hasNotifiedDownstreamFormatChange = new boolean[sampleStreamArr.length];
            }
            return this.sharedPeriod.selectTracks(this, exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long setEndPositionUs(long j) {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void setUsesStreamPrerollFlags() {
            this.sharedPeriod.setUsesStreamPrerollFlags();
        }

        public void updateEndPositionUs(long j) {
            this.endPositionUs = j;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SampleStreamImpl implements SampleStream {
        private final MediaPeriodImpl mediaPeriod;
        private final int streamIndex;

        public SampleStreamImpl(MediaPeriodImpl mediaPeriodImpl, int i) {
            this.mediaPeriod = mediaPeriodImpl;
            this.streamIndex = i;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int getFlags() {
            SampleStream sampleStream = this.mediaPeriod.sharedPeriod.sampleStreams[this.streamIndex];
            int flags = sampleStream == null ? 0 : sampleStream.getFlags();
            MediaSource.MediaPeriodId mediaPeriodId = this.mediaPeriod.mediaPeriodId;
            return (mediaPeriodId.nextAdGroupIndex != -1 || mediaPeriodId.isAd()) ? flags & (-2) : flags;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return this.mediaPeriod.sharedPeriod.isReady(this.streamIndex);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
            this.mediaPeriod.sharedPeriod.maybeThrowError(this.streamIndex);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            MediaPeriodImpl mediaPeriodImpl = this.mediaPeriod;
            return mediaPeriodImpl.sharedPeriod.readData(mediaPeriodImpl, this.streamIndex, formatHolder, decoderInputBuffer, i);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            MediaPeriodImpl mediaPeriodImpl = this.mediaPeriod;
            return mediaPeriodImpl.sharedPeriod.skipData(mediaPeriodImpl, this.streamIndex, j);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ServerSideAdInsertionTimeline extends ForwardingTimeline {
        private final iy1 adPlaybackStates;

        public ServerSideAdInsertionTimeline(Timeline timeline, iy1 iy1Var) {
            super(timeline);
            sp0.z(timeline.getWindowCount() == 1);
            Timeline.Period period = new Timeline.Period();
            for (int i = 0; i < timeline.getPeriodCount(); i++) {
                timeline.getPeriod(i, period, true);
                Object obj = period.uid;
                obj.getClass();
                sp0.z(iy1Var.containsKey(obj));
            }
            this.adPlaybackStates = iy1Var;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            super.getPeriod(i, period, true);
            AdPlaybackState adPlaybackState = (AdPlaybackState) this.adPlaybackStates.get(period.uid);
            adPlaybackState.getClass();
            long j = period.durationUs;
            long mediaPeriodPositionUsForContent = j == C.TIME_UNSET ? adPlaybackState.contentDurationUs : ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(j, -1, adPlaybackState);
            Timeline.Period period2 = new Timeline.Period();
            long j2 = 0;
            for (int i2 = 0; i2 < i + 1; i2++) {
                this.timeline.getPeriod(i2, period2, true);
                AdPlaybackState adPlaybackState2 = (AdPlaybackState) this.adPlaybackStates.get(period2.uid);
                adPlaybackState2.getClass();
                if (i2 == 0) {
                    j2 = -ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(-period2.getPositionInWindowUs(), -1, adPlaybackState2);
                }
                if (i2 != i) {
                    j2 = ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(period2.durationUs, -1, adPlaybackState2) + j2;
                }
            }
            period.set(period.id, period.uid, period.windowIndex, mediaPeriodPositionUsForContent, j2, adPlaybackState, period.isPlaceholder);
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            super.getWindow(i, window, j);
            Timeline.Period period = new Timeline.Period();
            Object obj = getPeriod(window.firstPeriodIndex, period, true).uid;
            obj.getClass();
            AdPlaybackState adPlaybackState = (AdPlaybackState) this.adPlaybackStates.get(obj);
            adPlaybackState.getClass();
            long mediaPeriodPositionUsForContent = ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.positionInFirstPeriodUs, -1, adPlaybackState);
            if (window.durationUs == C.TIME_UNSET) {
                long j2 = adPlaybackState.contentDurationUs;
                if (j2 != C.TIME_UNSET) {
                    window.durationUs = j2 - mediaPeriodPositionUsForContent;
                }
            } else {
                Timeline.Period period2 = super.getPeriod(window.lastPeriodIndex, period, true);
                long j3 = period2.positionInWindowUs;
                AdPlaybackState adPlaybackState2 = (AdPlaybackState) this.adPlaybackStates.get(period2.uid);
                adPlaybackState2.getClass();
                Timeline.Period period3 = getPeriod(window.lastPeriodIndex, period);
                window.durationUs = period3.positionInWindowUs + ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.durationUs - j3, -1, adPlaybackState2);
            }
            window.positionInFirstPeriodUs = mediaPeriodPositionUsForContent;
            return window;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SharedMediaPeriod implements MediaPeriod.Callback {
        private final MediaPeriod actualMediaPeriod;
        private AdPlaybackState adPlaybackState;
        private boolean hasStartedPreparing;
        private boolean isPrepared;
        private MediaPeriodImpl loadingPeriod;
        private final Object periodUid;
        private final List<MediaPeriodImpl> mediaPeriods = new ArrayList();
        private final Map<Long, Pair<LoadEventInfo, MediaLoadData>> activeLoads = new HashMap();
        public ExoTrackSelection[] trackSelections = new ExoTrackSelection[0];
        public SampleStream[] sampleStreams = new SampleStream[0];
        public MediaLoadData[] lastDownstreamFormatChangeData = new MediaLoadData[0];

        public SharedMediaPeriod(MediaPeriod mediaPeriod, Object obj, AdPlaybackState adPlaybackState) {
            this.actualMediaPeriod = mediaPeriod;
            this.periodUid = obj;
            this.adPlaybackState = adPlaybackState;
        }

        private int findMatchingStreamIndex(MediaLoadData mediaLoadData) {
            String str;
            if (mediaLoadData.trackFormat == null) {
                return -1;
            }
            int i = 0;
            loop0: while (true) {
                ExoTrackSelection[] exoTrackSelectionArr = this.trackSelections;
                if (i >= exoTrackSelectionArr.length) {
                    return -1;
                }
                ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
                if (exoTrackSelection != null) {
                    TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                    boolean z = mediaLoadData.trackType == 0 && trackGroup.equals(getTrackGroups().get(0));
                    for (int i2 = 0; i2 < trackGroup.length; i2++) {
                        Format format = trackGroup.getFormat(i2);
                        if (format.equals(mediaLoadData.trackFormat) || (z && (str = format.id) != null && str.equals(mediaLoadData.trackFormat.id))) {
                            break loop0;
                        }
                    }
                }
                i++;
            }
            return i;
        }

        private long getMediaPeriodPositionUsWithEndOfSourceHandling(MediaPeriodImpl mediaPeriodImpl, long j) {
            if (j == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long mediaPeriodPositionUs = ServerSideAdInsertionUtil.getMediaPeriodPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
            long j2 = mediaPeriodImpl.endPositionUs;
            if (j2 == C.TIME_UNSET || mediaPeriodPositionUs < j2) {
                return mediaPeriodPositionUs;
            }
            return Long.MIN_VALUE;
        }

        private long getStreamPositionUsWithNotYetStartedHandling(MediaPeriodImpl mediaPeriodImpl, long j) {
            long j2 = mediaPeriodImpl.lastStartPositionUs;
            MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodImpl.mediaPeriodId;
            return j < j2 ? ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodId, this.adPlaybackState) - (mediaPeriodImpl.lastStartPositionUs - j) : ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodId, this.adPlaybackState);
        }

        private void maybeNotifyDownstreamFormatChanged(MediaPeriodImpl mediaPeriodImpl, int i) {
            MediaLoadData mediaLoadData;
            boolean[] zArr = mediaPeriodImpl.hasNotifiedDownstreamFormatChange;
            if (zArr[i] || (mediaLoadData = this.lastDownstreamFormatChangeData[i]) == null) {
                return;
            }
            zArr[i] = true;
            mediaPeriodImpl.mediaSourceEventDispatcher.downstreamFormatChanged(ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl, mediaLoadData, this.adPlaybackState));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsesStreamPrerollFlags() {
            this.actualMediaPeriod.setUsesStreamPrerollFlags();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateAdPlaybackState(Timeline timeline, AdPlaybackState adPlaybackState, Timeline.Period period) {
            this.adPlaybackState = adPlaybackState;
            for (int i = 0; i < this.mediaPeriods.size(); i++) {
                MediaPeriodImpl mediaPeriodImpl = this.mediaPeriods.get(i);
                mediaPeriodImpl.updateEndPositionUs(ServerSideAdInsertionMediaSource.getEndPositionInSplitPeriodUs(timeline, mediaPeriodImpl.mediaPeriodId, period));
            }
        }

        public void add(MediaPeriodImpl mediaPeriodImpl) {
            this.mediaPeriods.add(mediaPeriodImpl);
        }

        public boolean canReuseMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, long j) {
            if (this.mediaPeriods.isEmpty()) {
                return false;
            }
            MediaPeriodImpl mediaPeriodImpl = (MediaPeriodImpl) rt0.z(this.mediaPeriods);
            long j2 = mediaPeriodImpl.endPositionUs;
            if (j2 == C.TIME_UNSET) {
                return false;
            }
            return ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodId, this.adPlaybackState) == ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public boolean continueLoading(MediaPeriodImpl mediaPeriodImpl, LoadingInfo loadingInfo) {
            MediaPeriodImpl mediaPeriodImpl2 = this.loadingPeriod;
            if (mediaPeriodImpl2 != null && !mediaPeriodImpl.equals(mediaPeriodImpl2)) {
                for (Pair<LoadEventInfo, MediaLoadData> pair : this.activeLoads.values()) {
                    mediaPeriodImpl2.mediaSourceEventDispatcher.loadCompleted((LoadEventInfo) pair.first, ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl2, (MediaLoadData) pair.second, this.adPlaybackState));
                    mediaPeriodImpl.mediaSourceEventDispatcher.loadStarted((LoadEventInfo) pair.first, ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl, (MediaLoadData) pair.second, this.adPlaybackState), 0);
                }
            }
            this.loadingPeriod = mediaPeriodImpl;
            return this.actualMediaPeriod.continueLoading(loadingInfo.buildUpon().setPlaybackPositionUs(getStreamPositionUsWithNotYetStartedHandling(mediaPeriodImpl, loadingInfo.playbackPositionUs)).build());
        }

        public void discardBuffer(MediaPeriodImpl mediaPeriodImpl, long j, boolean z) {
            this.actualMediaPeriod.discardBuffer(ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState), z);
        }

        public long getAdjustedSeekPositionUs(MediaPeriodImpl mediaPeriodImpl, long j, SeekParameters seekParameters) {
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.actualMediaPeriod.getAdjustedSeekPositionUs(ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState), seekParameters), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public long getBufferedPositionUs(MediaPeriodImpl mediaPeriodImpl) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, this.actualMediaPeriod.getBufferedPositionUs());
        }

        public MediaPeriodImpl getMediaPeriodForEvent(MediaLoadData mediaLoadData) {
            if (mediaLoadData == null || mediaLoadData.mediaStartTimeMs == C.TIME_UNSET) {
                return null;
            }
            for (int i = 0; i < this.mediaPeriods.size(); i++) {
                MediaPeriodImpl mediaPeriodImpl = this.mediaPeriods.get(i);
                if (mediaPeriodImpl.isPrepared) {
                    long mediaPeriodPositionUs = ServerSideAdInsertionUtil.getMediaPeriodPositionUs(Util.msToUs(mediaLoadData.mediaStartTimeMs), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
                    if (mediaPeriodPositionUs >= 0) {
                        long j = mediaPeriodImpl.endPositionUs;
                        if (j == C.TIME_UNSET || mediaPeriodPositionUs < j) {
                            return mediaPeriodImpl;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        }

        public long getNextLoadPositionUs(MediaPeriodImpl mediaPeriodImpl) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, this.actualMediaPeriod.getNextLoadPositionUs());
        }

        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
            return this.actualMediaPeriod.getStreamKeys(list);
        }

        public TrackGroupArray getTrackGroups() {
            return this.actualMediaPeriod.getTrackGroups();
        }

        public boolean isLoading(MediaPeriodImpl mediaPeriodImpl) {
            return mediaPeriodImpl.equals(this.loadingPeriod) && this.actualMediaPeriod.isLoading();
        }

        public boolean isReady(int i) {
            return ((SampleStream) Util.castNonNull(this.sampleStreams[i])).isReady();
        }

        public boolean isUnused() {
            return this.mediaPeriods.isEmpty();
        }

        public void maybeThrowError(int i) {
            ((SampleStream) Util.castNonNull(this.sampleStreams[i])).maybeThrowError();
        }

        public void maybeThrowPrepareError() {
            this.actualMediaPeriod.maybeThrowPrepareError();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            MediaPeriodImpl mediaPeriodImpl = this.loadingPeriod;
            if (mediaPeriodImpl == null) {
                return;
            }
            MediaPeriod.Callback callback = mediaPeriodImpl.callback;
            callback.getClass();
            callback.onContinueLoadingRequested(this.loadingPeriod);
        }

        public void onDownstreamFormatChanged(MediaPeriodImpl mediaPeriodImpl, MediaLoadData mediaLoadData) {
            int findMatchingStreamIndex = findMatchingStreamIndex(mediaLoadData);
            if (findMatchingStreamIndex != -1) {
                this.lastDownstreamFormatChangeData[findMatchingStreamIndex] = mediaLoadData;
                mediaPeriodImpl.hasNotifiedDownstreamFormatChange[findMatchingStreamIndex] = true;
            }
        }

        public void onLoadFinished(LoadEventInfo loadEventInfo) {
            this.activeLoads.remove(Long.valueOf(loadEventInfo.loadTaskId));
        }

        public void onLoadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            this.activeLoads.put(Long.valueOf(loadEventInfo.loadTaskId), Pair.create(loadEventInfo, mediaLoadData));
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.isPrepared = true;
            for (int i = 0; i < this.mediaPeriods.size(); i++) {
                this.mediaPeriods.get(i).onPrepared();
            }
        }

        public void prepare(MediaPeriodImpl mediaPeriodImpl, long j) {
            mediaPeriodImpl.lastStartPositionUs = j;
            if (this.hasStartedPreparing) {
                if (this.isPrepared) {
                    mediaPeriodImpl.onPrepared();
                }
            } else {
                this.hasStartedPreparing = true;
                this.actualMediaPeriod.prepare(this, ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState));
            }
        }

        public int readData(MediaPeriodImpl mediaPeriodImpl, int i, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            long bufferedPositionUs = getBufferedPositionUs(mediaPeriodImpl);
            int readData = ((SampleStream) Util.castNonNull(this.sampleStreams[i])).readData(formatHolder, decoderInputBuffer, i2 | 5);
            long mediaPeriodPositionUsWithEndOfSourceHandling = getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, decoderInputBuffer.timeUs);
            if ((readData == -4 && mediaPeriodPositionUsWithEndOfSourceHandling == Long.MIN_VALUE) || (readData == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys)) {
                maybeNotifyDownstreamFormatChanged(mediaPeriodImpl, i);
                decoderInputBuffer.clear();
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if (readData == -4) {
                maybeNotifyDownstreamFormatChanged(mediaPeriodImpl, i);
                ((SampleStream) Util.castNonNull(this.sampleStreams[i])).readData(formatHolder, decoderInputBuffer, i2);
                decoderInputBuffer.timeUs = mediaPeriodPositionUsWithEndOfSourceHandling;
            }
            return readData;
        }

        public long readDiscontinuity(MediaPeriodImpl mediaPeriodImpl) {
            if (!mediaPeriodImpl.equals(this.mediaPeriods.get(0))) {
                return C.TIME_UNSET;
            }
            long readDiscontinuity = this.actualMediaPeriod.readDiscontinuity();
            return readDiscontinuity == C.TIME_UNSET ? C.TIME_UNSET : ServerSideAdInsertionUtil.getMediaPeriodPositionUs(readDiscontinuity, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public void reevaluateBuffer(MediaPeriodImpl mediaPeriodImpl, long j) {
            this.actualMediaPeriod.reevaluateBuffer(getStreamPositionUsWithNotYetStartedHandling(mediaPeriodImpl, j));
        }

        public void release(MediaSource mediaSource) {
            mediaSource.releasePeriod(this.actualMediaPeriod);
        }

        public void remove(MediaPeriodImpl mediaPeriodImpl) {
            if (mediaPeriodImpl.equals(this.loadingPeriod)) {
                this.loadingPeriod = null;
                this.activeLoads.clear();
            }
            this.mediaPeriods.remove(mediaPeriodImpl);
        }

        public long seekToUs(MediaPeriodImpl mediaPeriodImpl, long j) {
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.actualMediaPeriod.seekToUs(ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState)), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public long selectTracks(MediaPeriodImpl mediaPeriodImpl, ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            mediaPeriodImpl.lastStartPositionUs = j;
            if (mediaPeriodImpl != this.mediaPeriods.get(0)) {
                for (int i = 0; i < exoTrackSelectionArr.length; i++) {
                    ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
                    boolean z = true;
                    if (exoTrackSelection != null) {
                        if (zArr[i] && sampleStreamArr[i] != null) {
                            z = false;
                        }
                        zArr2[i] = z;
                        if (z) {
                            sampleStreamArr[i] = Objects.equals(this.trackSelections[i], exoTrackSelection) ? new SampleStreamImpl(mediaPeriodImpl, i) : new EmptySampleStream();
                        }
                    } else {
                        sampleStreamArr[i] = null;
                        zArr2[i] = true;
                    }
                }
                return j;
            }
            this.trackSelections = (ExoTrackSelection[]) Arrays.copyOf(exoTrackSelectionArr, exoTrackSelectionArr.length);
            long streamPositionUs = ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
            SampleStream[] sampleStreamArr2 = this.sampleStreams;
            SampleStream[] sampleStreamArr3 = sampleStreamArr2.length == 0 ? new SampleStream[exoTrackSelectionArr.length] : (SampleStream[]) Arrays.copyOf(sampleStreamArr2, sampleStreamArr2.length);
            long selectTracks = this.actualMediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr3, zArr2, streamPositionUs);
            this.sampleStreams = (SampleStream[]) Arrays.copyOf(sampleStreamArr3, sampleStreamArr3.length);
            this.lastDownstreamFormatChangeData = (MediaLoadData[]) Arrays.copyOf(this.lastDownstreamFormatChangeData, sampleStreamArr3.length);
            for (int i2 = 0; i2 < sampleStreamArr3.length; i2++) {
                if (sampleStreamArr3[i2] == null) {
                    sampleStreamArr[i2] = null;
                    this.lastDownstreamFormatChangeData[i2] = null;
                } else if (sampleStreamArr[i2] == null || zArr2[i2]) {
                    sampleStreamArr[i2] = new SampleStreamImpl(mediaPeriodImpl, i2);
                    this.lastDownstreamFormatChangeData[i2] = null;
                }
            }
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(selectTracks, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public int skipData(MediaPeriodImpl mediaPeriodImpl, int i, long j) {
            return ((SampleStream) Util.castNonNull(this.sampleStreams[i])).skipData(ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState));
        }
    }

    public ServerSideAdInsertionMediaSource(MediaSource mediaSource, AdPlaybackStateUpdater adPlaybackStateUpdater) {
        this.mediaSource = mediaSource;
        this.adPlaybackStateUpdater = adPlaybackStateUpdater;
        Timeline timeline = Timeline.EMPTY;
        this.sourceTimeline = timeline;
        this.splitTimeline = timeline;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaLoadData correctMediaLoadData(MediaPeriodImpl mediaPeriodImpl, MediaLoadData mediaLoadData, AdPlaybackState adPlaybackState) {
        return new MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, correctMediaLoadDataPositionMs(mediaLoadData.mediaStartTimeMs, mediaPeriodImpl, adPlaybackState), correctMediaLoadDataPositionMs(mediaLoadData.mediaEndTimeMs, mediaPeriodImpl, adPlaybackState));
    }

    private static long correctMediaLoadDataPositionMs(long j, MediaPeriodImpl mediaPeriodImpl, AdPlaybackState adPlaybackState) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long msToUs = Util.msToUs(j);
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodImpl.mediaPeriodId;
        return Util.usToMs(mediaPeriodId.isAd() ? ServerSideAdInsertionUtil.getMediaPeriodPositionUsForAd(msToUs, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState) : ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(msToUs, -1, adPlaybackState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getEndPositionInSplitPeriodUs(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, period);
        if (!mediaPeriodId.isAd()) {
            int i = mediaPeriodId.nextAdGroupIndex;
            long adGroupTimeUs = i == -1 ? Long.MIN_VALUE : period.getAdGroupTimeUs(i);
            return adGroupTimeUs != Long.MIN_VALUE ? adGroupTimeUs : period.durationUs;
        }
        AdPlaybackState.AdGroup adGroup = period.adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex);
        if (adGroup.count == -1) {
            return 0L;
        }
        return adGroup.durationsUs[mediaPeriodId.adIndexInAdGroup];
    }

    private MediaPeriodImpl getMediaPeriodForEvent(MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData, boolean z) {
        if (mediaPeriodId == null) {
            return null;
        }
        List list = this.mediaPeriods.get((Object) new Pair(Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid));
        if (list.isEmpty()) {
            return null;
        }
        if (z) {
            SharedMediaPeriod sharedMediaPeriod = (SharedMediaPeriod) rt0.z(list);
            return sharedMediaPeriod.loadingPeriod != null ? sharedMediaPeriod.loadingPeriod : (MediaPeriodImpl) rt0.z(sharedMediaPeriod.mediaPeriods);
        }
        for (int i = 0; i < list.size(); i++) {
            MediaPeriodImpl mediaPeriodForEvent = ((SharedMediaPeriod) list.get(i)).getMediaPeriodForEvent(mediaLoadData);
            if (mediaPeriodForEvent != null) {
                return mediaPeriodForEvent;
            }
        }
        return (MediaPeriodImpl) ((SharedMediaPeriod) list.get(0)).mediaPeriods.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdPlaybackStates$0(Timeline timeline, iy1 iy1Var) {
        AdPlaybackState adPlaybackState;
        if (timeline.equals(this.sourceTimeline)) {
            this.adPlaybackStates = iy1Var;
            this.splitTimeline = new ServerSideAdInsertionTimeline(this.sourceTimeline, iy1Var);
            for (SharedMediaPeriod sharedMediaPeriod : this.mediaPeriods.values()) {
                AdPlaybackState adPlaybackState2 = (AdPlaybackState) iy1Var.get(sharedMediaPeriod.periodUid);
                if (adPlaybackState2 != null) {
                    sharedMediaPeriod.updateAdPlaybackState(this.splitTimeline, adPlaybackState2, this.period);
                }
            }
            SharedMediaPeriod sharedMediaPeriod2 = this.lastUsedMediaPeriod;
            if (sharedMediaPeriod2 != null && (adPlaybackState = (AdPlaybackState) iy1Var.get(sharedMediaPeriod2.periodUid)) != null) {
                this.lastUsedMediaPeriod.updateAdPlaybackState(this.splitTimeline, adPlaybackState, this.period);
            }
            refreshSourceInfo(this.splitTimeline);
        }
    }

    private void releaseLastUsedMediaPeriod() {
        SharedMediaPeriod sharedMediaPeriod = this.lastUsedMediaPeriod;
        if (sharedMediaPeriod != null) {
            sharedMediaPeriod.release(this.mediaSource);
            this.lastUsedMediaPeriod = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return this.mediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        Pair pair = new Pair(Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid);
        SharedMediaPeriod sharedMediaPeriod = this.lastUsedMediaPeriod;
        SharedMediaPeriod sharedMediaPeriod2 = null;
        boolean z = false;
        if (sharedMediaPeriod != null) {
            boolean equals = sharedMediaPeriod.periodUid.equals(mediaPeriodId.periodUid);
            SharedMediaPeriod sharedMediaPeriod3 = this.lastUsedMediaPeriod;
            if (equals) {
                this.mediaPeriods.put(pair, sharedMediaPeriod3);
                z = true;
            } else {
                sharedMediaPeriod3.release(this.mediaSource);
                sharedMediaPeriod3 = null;
            }
            this.lastUsedMediaPeriod = null;
            sharedMediaPeriod2 = sharedMediaPeriod3;
        }
        if (sharedMediaPeriod2 == null && ((sharedMediaPeriod2 = (SharedMediaPeriod) rt0.A(this.mediaPeriods.get((Object) pair))) == null || !sharedMediaPeriod2.canReuseMediaPeriod(mediaPeriodId, j))) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) this.adPlaybackStates.get(mediaPeriodId.periodUid);
            adPlaybackState.getClass();
            sharedMediaPeriod2 = new SharedMediaPeriod(this.mediaSource.createPeriod(new MediaSource.MediaPeriodId(mediaPeriodId.periodUid, mediaPeriodId.windowSequenceNumber), allocator, ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodId, adPlaybackState)), mediaPeriodId.periodUid, adPlaybackState);
            this.mediaPeriods.put(pair, sharedMediaPeriod2);
        }
        SharedMediaPeriod sharedMediaPeriod4 = sharedMediaPeriod2;
        MediaPeriodImpl mediaPeriodImpl = new MediaPeriodImpl(sharedMediaPeriod4, mediaPeriodId, getEndPositionInSplitPeriodUs(this.splitTimeline, mediaPeriodId, this.period), createEventDispatcher(mediaPeriodId), createDrmEventDispatcher(mediaPeriodId));
        sharedMediaPeriod4.add(mediaPeriodImpl);
        if (z && sharedMediaPeriod4.trackSelections.length > 0) {
            mediaPeriodImpl.seekToUs(j);
        }
        return mediaPeriodImpl;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void disableInternal() {
        releaseLastUsedMediaPeriod();
        this.mediaSource.disable(this);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void enableInternal() {
        this.mediaSource.enable(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        this.mediaSource.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.downstreamFormatChanged(mediaLoadData);
            return;
        }
        mediaPeriodForEvent.sharedPeriod.onDownstreamFormatChanged(mediaPeriodForEvent, mediaLoadData);
        MediaSourceEventListener.EventDispatcher eventDispatcher = mediaPeriodForEvent.mediaSourceEventDispatcher;
        AdPlaybackState adPlaybackState = (AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
        adPlaybackState.getClass();
        eventDispatcher.downstreamFormatChanged(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId, KeyRequestInfo keyRequestInfo) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysLoaded(keyRequestInfo);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysLoaded(keyRequestInfo);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRemoved();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysRemoved();
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRestored();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysRestored();
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, true);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionAcquired(i2);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionAcquired(i2);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionManagerError(exc);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionManagerError(exc);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionReleased();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionReleased();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCanceled(loadEventInfo, mediaLoadData);
            return;
        }
        mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
        MediaSourceEventListener.EventDispatcher eventDispatcher = mediaPeriodForEvent.mediaSourceEventDispatcher;
        AdPlaybackState adPlaybackState = (AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
        adPlaybackState.getClass();
        eventDispatcher.loadCanceled(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCompleted(loadEventInfo, mediaLoadData);
            return;
        }
        mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
        MediaSourceEventListener.EventDispatcher eventDispatcher = mediaPeriodForEvent.mediaSourceEventDispatcher;
        AdPlaybackState adPlaybackState = (AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
        adPlaybackState.getClass();
        eventDispatcher.loadCompleted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadError(loadEventInfo, mediaLoadData, iOException, z);
            return;
        }
        if (z) {
            mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
        }
        MediaSourceEventListener.EventDispatcher eventDispatcher = mediaPeriodForEvent.mediaSourceEventDispatcher;
        AdPlaybackState adPlaybackState = (AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
        adPlaybackState.getClass();
        eventDispatcher.loadError(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState), iOException, z);
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        if (i2 == 0) {
            MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
            if (mediaPeriodForEvent == null) {
                this.mediaSourceEventDispatcherWithoutId.loadStarted(loadEventInfo, mediaLoadData, 0);
                return;
            }
            mediaPeriodForEvent.sharedPeriod.onLoadStarted(loadEventInfo, mediaLoadData);
            MediaSourceEventListener.EventDispatcher eventDispatcher = mediaPeriodForEvent.mediaSourceEventDispatcher;
            AdPlaybackState adPlaybackState = (AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
            adPlaybackState.getClass();
            eventDispatcher.loadStarted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState), 0);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
    public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
        this.sourceTimeline = timeline;
        AdPlaybackStateUpdater adPlaybackStateUpdater = this.adPlaybackStateUpdater;
        if ((adPlaybackStateUpdater == null || !adPlaybackStateUpdater.onAdPlaybackStateUpdateRequested(timeline)) && !this.adPlaybackStates.isEmpty()) {
            setAdPlaybackStates(this.adPlaybackStates, timeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.upstreamDiscarded(mediaLoadData);
            return;
        }
        MediaSourceEventListener.EventDispatcher eventDispatcher = mediaPeriodForEvent.mediaSourceEventDispatcher;
        AdPlaybackState adPlaybackState = (AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
        adPlaybackState.getClass();
        eventDispatcher.upstreamDiscarded(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState));
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
        synchronized (this) {
            this.playbackHandler = createHandlerForCurrentLooper;
        }
        this.mediaSource.addEventListener(createHandlerForCurrentLooper, this);
        this.mediaSource.addDrmEventListener(createHandlerForCurrentLooper, this);
        this.mediaSource.prepareSource(this, getPlayerId(), getBandwidthMeter());
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MediaPeriodImpl mediaPeriodImpl = (MediaPeriodImpl) mediaPeriod;
        mediaPeriodImpl.sharedPeriod.remove(mediaPeriodImpl);
        if (mediaPeriodImpl.sharedPeriod.isUnused()) {
            this.mediaPeriods.remove(new Pair(Long.valueOf(mediaPeriodImpl.mediaPeriodId.windowSequenceNumber), mediaPeriodImpl.mediaPeriodId.periodUid), mediaPeriodImpl.sharedPeriod);
            boolean isEmpty = this.mediaPeriods.isEmpty();
            SharedMediaPeriod sharedMediaPeriod = mediaPeriodImpl.sharedPeriod;
            if (isEmpty) {
                this.lastUsedMediaPeriod = sharedMediaPeriod;
            } else {
                sharedMediaPeriod.release(this.mediaSource);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        releaseLastUsedMediaPeriod();
        synchronized (this) {
            this.playbackHandler = null;
        }
        this.mediaSource.releaseSource(this);
        this.mediaSource.removeEventListener(this);
        this.mediaSource.removeDrmEventListener(this);
    }

    public void setAdPlaybackStates(iy1 iy1Var, Timeline timeline) {
        Handler handler;
        sp0.o(!iy1Var.isEmpty());
        Object obj = ((AdPlaybackState) ((dy1) iy1Var.values()).get(0)).adsId;
        obj.getClass();
        ee5 it = iy1Var.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AdPlaybackState adPlaybackState = (AdPlaybackState) entry.getValue();
            sp0.o(obj.equals(adPlaybackState.adsId));
            AdPlaybackState adPlaybackState2 = (AdPlaybackState) this.adPlaybackStates.get(key);
            if (adPlaybackState2 != null) {
                for (int i = adPlaybackState.removedAdGroupCount; i < adPlaybackState.adGroupCount; i++) {
                    AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
                    sp0.o(adGroup.isServerSideInserted);
                    if (i < adPlaybackState2.adGroupCount && ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState, i) < ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState2, i)) {
                        AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i + 1);
                        sp0.o(adGroup.contentResumeOffsetUs + adGroup2.contentResumeOffsetUs == adPlaybackState2.getAdGroup(i).contentResumeOffsetUs);
                        sp0.o(adGroup.timeUs + adGroup.contentResumeOffsetUs == adGroup2.timeUs);
                    }
                    if (adGroup.timeUs == Long.MIN_VALUE) {
                        sp0.o(ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState, i) == 0);
                    }
                }
            }
        }
        synchronized (this) {
            handler = this.playbackHandler;
        }
        if (handler == null) {
            this.adPlaybackStates = iy1Var;
        } else {
            Util.postOrRun(handler, new of(this, timeline, iy1Var, (byte) 8));
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        this.mediaSource.updateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }
}
