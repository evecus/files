package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.IcyDataSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.ForwardingTrackOutput;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import defpackage.hy1;
import defpackage.i82;
import defpackage.sp0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private static final String TAG = "ProgressiveMediaPeriod";
    private final Allocator allocator;
    private MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;
    private ControlledTrackOutput[] controlledTrackOutputs;
    private final String customCacheKey;
    private final DataSource dataSource;
    private int dataType;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private long endPositionUs = Long.MIN_VALUE;
    private int extractedSamplesCountAtStartOfLoad;
    private final Handler handler;
    private boolean haveAudioVideoTracks;
    private IcyHeaders icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private boolean isSingleSample;
    private long lastSeekPositionUs;
    private final Listener listener;
    private final ConditionVariable loadCondition;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final boolean loadOnlySelectedTracks;
    private final Loader loader;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final List<MergingMetadataSampleStream> mergingSampleStreams;
    private boolean notifyDiscontinuity;
    private final Runnable onContinueLoadingRequestedRunnable;
    private boolean pendingDeferredRetry;
    private boolean pendingInitialDiscontinuity;
    private long pendingResetPositionUs;
    private boolean prepared;
    private final ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private TrackId[] sampleQueueTrackIds;
    private SampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private final long singleSampleDurationUs;
    private final Format singleTrackFormat;
    private final int singleTrackId;
    private TrackState trackState;
    private final Uri uri;
    private boolean usesStreamPrerollFlags;
    private static final Map<String, String> ICY_METADATA_HEADERS = createIcyMetadataHeaders();
    private static final Format ICY_FORMAT = new Format.Builder().setId("icy").setSampleMimeType(MimeTypes.APPLICATION_ICY).build();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {
        private final StatsDataSource dataSource;
        private final ExtractorOutput extractorOutput;
        private TrackOutput icyTrackOutput;
        private volatile boolean loadCanceled;
        private final ConditionVariable loadCondition;
        private final ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        private final Uri uri;
        private final PositionHolder positionHolder = new PositionHolder();
        private boolean pendingExtractorSeek = true;
        private final long loadTaskId = LoadEventInfo.getNewId();
        private DataSpec dataSpec = buildDataSpec(0, null);

        public ExtractingLoadable(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.uri = uri;
            this.dataSource = new StatsDataSource(dataSource);
            this.progressiveMediaExtractor = progressiveMediaExtractor;
            this.extractorOutput = extractorOutput;
            this.loadCondition = conditionVariable;
        }

        private DataSpec buildDataSpec(long j, String str) {
            Map<String, String> map = ProgressiveMediaPeriod.ICY_METADATA_HEADERS;
            if (str != null && !str.startsWith("W/")) {
                hy1 hy1Var = new hy1(4);
                hy1Var.c(map.entrySet());
                hy1Var.b("If-Range", str);
                map = hy1Var.a(false);
            }
            return new DataSpec.Builder().setUri(this.uri).setPosition(j).setKey(ProgressiveMediaPeriod.this.customCacheKey).setFlags(6).setHttpRequestHeaders(map).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j, long j2) {
            this.positionHolder.position = j;
            this.seekTimeUs = j2;
            this.pendingExtractorSeek = true;
            this.seenIcyMetadata = false;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() {
            int i = 0;
            String str = null;
            while (i == 0 && !this.loadCanceled) {
                try {
                    long j = this.positionHolder.position;
                    DataSpec buildDataSpec = buildDataSpec(j, str);
                    this.dataSpec = buildDataSpec;
                    long open = this.dataSource.open(buildDataSpec);
                    if (this.loadCanceled) {
                        if (i != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                            this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                        }
                        DataSourceUtil.closeQuietly(this.dataSource);
                        return;
                    }
                    List<String> list = this.dataSource.getResponseHeaders().get("ETag");
                    str = (list == null || list.isEmpty()) ? null : list.get(0);
                    if (open != -1) {
                        open += j;
                        ProgressiveMediaPeriod.this.onLengthKnown();
                    }
                    long j2 = open;
                    ProgressiveMediaPeriod.this.icyHeaders = IcyHeaders.parse(this.dataSource.getResponseHeaders());
                    DataReader dataReader = this.dataSource;
                    if (ProgressiveMediaPeriod.this.icyHeaders != null && ProgressiveMediaPeriod.this.icyHeaders.metadataInterval != -1) {
                        dataReader = new IcyDataSource(this.dataSource, ProgressiveMediaPeriod.this.icyHeaders.metadataInterval, this);
                        TrackOutput icyTrack = ProgressiveMediaPeriod.this.icyTrack();
                        this.icyTrackOutput = icyTrack;
                        icyTrack.format(ProgressiveMediaPeriod.ICY_FORMAT);
                    }
                    this.progressiveMediaExtractor.init(dataReader, this.uri, this.dataSource.getResponseHeaders(), j, j2, this.extractorOutput);
                    if (ProgressiveMediaPeriod.this.icyHeaders != null) {
                        this.progressiveMediaExtractor.disableSeekingOnMp3Streams();
                    }
                    if (this.pendingExtractorSeek) {
                        this.progressiveMediaExtractor.seek(j, this.seekTimeUs);
                        this.pendingExtractorSeek = false;
                    }
                    while (i == 0 && !this.loadCanceled) {
                        try {
                            this.loadCondition.block();
                            i = this.progressiveMediaExtractor.read(this.positionHolder);
                            long currentInputPosition = this.progressiveMediaExtractor.getCurrentInputPosition();
                            if (currentInputPosition > ProgressiveMediaPeriod.this.continueLoadingCheckIntervalBytes + j) {
                                this.loadCondition.close();
                                ProgressiveMediaPeriod.this.handler.post(ProgressiveMediaPeriod.this.onContinueLoadingRequestedRunnable);
                                j = currentInputPosition;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    DataSourceUtil.closeQuietly(this.dataSource);
                } catch (Throwable th) {
                    if (i != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    DataSourceUtil.closeQuietly(this.dataSource);
                    throw th;
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.IcyDataSource.Listener
        public void onIcyMetadata(ParsableByteArray parsableByteArray) {
            long max = !this.seenIcyMetadata ? this.seekTimeUs : Math.max(ProgressiveMediaPeriod.this.getLargestQueuedTimestampUs(true), this.seekTimeUs);
            int bytesLeft = parsableByteArray.bytesLeft();
            TrackOutput trackOutput = this.icyTrackOutput;
            trackOutput.getClass();
            trackOutput.sampleData(parsableByteArray, bytesLeft);
            trackOutput.sampleMetadata(max, 1, bytesLeft, 0, null);
            this.seenIcyMetadata = true;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onSourceInfoRefreshed(long j, SeekMap seekMap, boolean z);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class SampleStreamImpl implements SampleStream {
        private final boolean hasPreroll;
        private final int track;

        private SampleStreamImpl(int i, boolean z) {
            this.track = i;
            this.hasPreroll = z;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int getFlags() {
            return this.hasPreroll ? 4 : 0;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return ProgressiveMediaPeriod.this.isReady(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
            ProgressiveMediaPeriod.this.maybeThrowError(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            return ProgressiveMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, i);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            return ProgressiveMediaPeriod.this.skipData(this.track, j);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class TrackId {
        public final int id;
        public final boolean isIcyTrack;

        public TrackId(int i, boolean z) {
            this.id = i;
            this.isIcyTrack = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && TrackId.class == obj.getClass()) {
                TrackId trackId = (TrackId) obj;
                if (this.id == trackId.id && this.isIcyTrack == trackId.isIcyTrack) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.id * 31) + (this.isIcyTrack ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final TrackGroupArray tracks;

        public TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.tracks = trackGroupArray;
            this.trackIsAudioVideoFlags = zArr;
            int i = trackGroupArray.length;
            this.trackEnabledStates = new boolean[i];
            this.trackNotifiedDownstreamFormats = new boolean[i];
        }
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Listener listener, Allocator allocator, String str, int i, boolean z, int i2, Format format, long j, ReleasableExecutor releasableExecutor) {
        this.uri = uri;
        this.dataSource = dataSource;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.listener = listener;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i;
        this.loadOnlySelectedTracks = z;
        this.singleTrackId = i2;
        this.singleTrackFormat = format;
        this.loader = releasableExecutor != null ? new Loader(releasableExecutor) : new Loader(TAG);
        this.progressiveMediaExtractor = progressiveMediaExtractor;
        this.singleSampleDurationUs = j;
        this.loadCondition = new ConditionVariable();
        this.maybeFinishPrepareRunnable = new d(this, (byte) 1);
        this.onContinueLoadingRequestedRunnable = new d(this, (byte) 2);
        this.handler = Util.createHandlerForCurrentLooper();
        this.sampleQueueTrackIds = new TrackId[0];
        this.sampleQueues = new SampleQueue[0];
        this.controlledTrackOutputs = new ControlledTrackOutput[0];
        this.mergingSampleStreams = new ArrayList();
        this.pendingResetPositionUs = C.TIME_UNSET;
        this.dataType = 1;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void assertPrepared() {
        sp0.z(this.prepared);
        this.trackState.getClass();
        this.seekMap.getClass();
    }

    private boolean configureRetry(ExtractingLoadable extractingLoadable, int i) {
        SeekMap seekMap;
        if (this.isLengthKnown || !((seekMap = this.seekMap) == null || seekMap.getDurationUs() == C.TIME_UNSET)) {
            this.extractedSamplesCountAtStartOfLoad = i;
            return true;
        }
        if (this.prepared && !suppressRead()) {
            this.pendingDeferredRetry = true;
            return false;
        }
        this.notifyDiscontinuity = this.prepared;
        this.lastSeekPositionUs = 0L;
        this.extractedSamplesCountAtStartOfLoad = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        extractingLoadable.setLoadPosition(0L, 0L);
        return true;
    }

    private static Map<String, String> createIcyMetadataHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        return DesugarCollections.unmodifiableMap(hashMap);
    }

    private int getExtractedSamplesCount() {
        int i = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            i += sampleQueue.getWriteIndex();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLargestQueuedTimestampUs(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (i < this.sampleQueues.length) {
            if (!z) {
                TrackState trackState = this.trackState;
                trackState.getClass();
                i = trackState.trackEnabledStates[i] ? 0 : i + 1;
            }
            j = Math.max(j, this.sampleQueues[i].getLargestQueuedTimestampUs());
        }
        return j;
    }

    private static int getTrackTypePriority(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    private boolean haveSampleQueuesReachedEndTimeUs() {
        int i = 0;
        if (this.endPositionUs == Long.MIN_VALUE) {
            return false;
        }
        assertPrepared();
        boolean z = true;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i >= sampleQueueArr.length) {
                return z;
            }
            TrackState trackState = this.trackState;
            if (trackState.trackEnabledStates[i] && (trackState.trackIsAudioVideoFlags[i] || !this.haveAudioVideoTracks)) {
                z &= sampleQueueArr[i].hasQueuedTimestampsUpToReadEndTimeUs();
            }
            i++;
        }
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$0() {
        if (this.released) {
            return;
        }
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onContinueLoadingRequested(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLengthKnown$2() {
        this.isLengthKnown = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (this.released || this.prepared || !this.sampleQueuesBuilt || this.seekMap == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.loadCondition.close();
        int length = this.sampleQueues.length;
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Format upstreamFormat = this.sampleQueues[i3].getUpstreamFormat();
            upstreamFormat.getClass();
            int trackType = MimeTypes.getTrackType(upstreamFormat.sampleMimeType);
            if (getTrackTypePriority(trackType) > getTrackTypePriority(i)) {
                i2 = i3;
                i = trackType;
            }
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            Format upstreamFormat2 = this.sampleQueues[i4].getUpstreamFormat();
            upstreamFormat2.getClass();
            String str = upstreamFormat2.sampleMimeType;
            boolean isAudio = MimeTypes.isAudio(str);
            boolean z = isAudio || MimeTypes.isVideo(str);
            zArr[i4] = z;
            this.haveAudioVideoTracks = z | this.haveAudioVideoTracks;
            this.isSingleSample = this.singleSampleDurationUs != C.TIME_UNSET && length == 1 && MimeTypes.isImage(str);
            IcyHeaders icyHeaders = this.icyHeaders;
            if (icyHeaders != null) {
                if (isAudio || this.sampleQueueTrackIds[i4].isIcyTrack) {
                    Metadata metadata = upstreamFormat2.metadata;
                    upstreamFormat2 = upstreamFormat2.buildUpon().setMetadata(metadata == null ? new Metadata(icyHeaders) : metadata.copyWithAppendedEntries(icyHeaders)).build();
                }
                if (isAudio && upstreamFormat2.averageBitrate == -1 && upstreamFormat2.peakBitrate == -1 && icyHeaders.bitrate != -1) {
                    upstreamFormat2 = upstreamFormat2.buildUpon().setAverageBitrate(icyHeaders.bitrate).build();
                }
            }
            Format copyWithCryptoType = upstreamFormat2.copyWithCryptoType(this.drmSessionManager.getCryptoType(upstreamFormat2));
            if (i4 != i2) {
                copyWithCryptoType = copyWithCryptoType.buildUpon().setPrimaryTrackGroupId(Integer.toString(i2)).build();
            }
            trackGroupArr[i4] = new TrackGroup(Integer.toString(i4), copyWithCryptoType);
            this.sampleQueues[i4].setReadEndTimeUs(this.endPositionUs);
        }
        this.trackState = new TrackState(new TrackGroupArray(trackGroupArr), zArr);
        if (this.isSingleSample && this.durationUs == C.TIME_UNSET) {
            this.durationUs = this.singleSampleDurationUs;
            this.seekMap = new ForwardingSeekMap(this.seekMap) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.1
                @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
                public long getDurationUs() {
                    return ProgressiveMediaPeriod.this.durationUs;
                }
            };
        }
        this.listener.onSourceInfoRefreshed(this.durationUs, this.seekMap, this.isLive);
        this.prepared = true;
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onPrepared(this);
    }

    private void maybeNotifyDownstreamFormat(int i) {
        assertPrepared();
        TrackState trackState = this.trackState;
        boolean[] zArr = trackState.trackNotifiedDownstreamFormats;
        if (zArr[i]) {
            return;
        }
        Format format = trackState.tracks.get(i).getFormat(0);
        this.mediaSourceEventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.lastSeekPositionUs);
        zArr[i] = true;
    }

    private void maybeStartDeferredRetry(int i) {
        assertPrepared();
        if (this.pendingDeferredRetry) {
            if (!this.haveAudioVideoTracks || this.trackState.trackIsAudioVideoFlags[i]) {
                if (this.sampleQueues[i].isReady(false)) {
                    return;
                }
                this.pendingResetPositionUs = 0L;
                this.pendingDeferredRetry = false;
                this.notifyDiscontinuity = true;
                this.lastSeekPositionUs = 0L;
                this.extractedSamplesCountAtStartOfLoad = 0;
                for (SampleQueue sampleQueue : this.sampleQueues) {
                    sampleQueue.reset();
                }
                MediaPeriod.Callback callback = this.callback;
                callback.getClass();
                callback.onContinueLoadingRequested(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLengthKnown() {
        this.handler.post(new d(this, (byte) 0));
    }

    private TrackOutput prepareTrackOutput(TrackId trackId) {
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            if (trackId.equals(this.sampleQueueTrackIds[i])) {
                return this.sampleQueues[i];
            }
        }
        if (this.sampleQueuesBuilt) {
            Log.w(TAG, "Extractor added new track (id=" + trackId.id + ") after finishing tracks.");
            return new DiscardingTrackOutput();
        }
        SampleQueue createWithDrm = SampleQueue.createWithDrm(this.allocator, this.drmSessionManager, this.drmEventDispatcher);
        ControlledTrackOutput controlledTrackOutput = new ControlledTrackOutput(createWithDrm);
        createWithDrm.setUpstreamFormatChangeListener(this);
        int i2 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.sampleQueueTrackIds, i2);
        trackIdArr[length] = trackId;
        this.sampleQueueTrackIds = (TrackId[]) Util.castNonNullTypeArray(trackIdArr);
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i2);
        sampleQueueArr[length] = createWithDrm;
        this.sampleQueues = (SampleQueue[]) Util.castNonNullTypeArray(sampleQueueArr);
        ControlledTrackOutput[] controlledTrackOutputArr = (ControlledTrackOutput[]) Arrays.copyOf(this.controlledTrackOutputs, i2);
        controlledTrackOutputArr[length] = controlledTrackOutput;
        this.controlledTrackOutputs = (ControlledTrackOutput[]) Util.castNonNullTypeArray(controlledTrackOutputArr);
        return controlledTrackOutput;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j, boolean z) {
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            SampleQueue sampleQueue = this.sampleQueues[i];
            if (this.controlledTrackOutputs[i].isSelected()) {
                if (this.isSingleSample) {
                    sampleQueue.seekTo(sampleQueue.getFirstIndex());
                } else {
                    long firstTimestampUs = sampleQueue.getFirstTimestampUs();
                    if (firstTimestampUs != Long.MIN_VALUE && j <= firstTimestampUs && sampleQueue.getFirstIndex() == 0 && z) {
                        sampleQueue.seekTo(sampleQueue.getFirstIndex());
                    } else if (!sampleQueue.seekTo(j, this.loadingFinished) && (zArr[i] || !this.haveAudioVideoTracks)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSeekMap, reason: merged with bridge method [inline-methods] */
    public void lambda$seekMap$1(SeekMap seekMap) {
        this.seekMap = this.icyHeaders == null ? seekMap : new SeekMap.Unseekable(C.TIME_UNSET);
        this.durationUs = seekMap.getDurationUs();
        boolean z = !this.isLengthKnown && seekMap.getDurationUs() == C.TIME_UNSET;
        this.isLive = z;
        this.dataType = z ? 7 : 1;
        if (this.prepared) {
            this.listener.onSourceInfoRefreshed(this.durationUs, seekMap, z);
        } else {
            maybeFinishPrepare();
        }
    }

    private void startLoading() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.uri, this.dataSource, this.progressiveMediaExtractor, this, this.loadCondition);
        if (this.prepared) {
            sp0.z(isPendingReset());
            long j = this.endPositionUs;
            if (j == Long.MIN_VALUE) {
                j = this.durationUs;
            }
            if (j != C.TIME_UNSET && this.pendingResetPositionUs > j) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = C.TIME_UNSET;
                return;
            }
            SeekMap seekMap = this.seekMap;
            seekMap.getClass();
            extractingLoadable.setLoadPosition(seekMap.getSeekPoints(this.pendingResetPositionUs).first.position, this.pendingResetPositionUs);
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
            this.pendingResetPositionUs = C.TIME_UNSET;
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        this.loader.startLoading(extractingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.loadingFinished || this.loader.hasFatalError() || this.pendingDeferredRetry) {
            return false;
        }
        if ((this.prepared || this.singleTrackFormat != null) && this.enabledTrackCount == 0) {
            return false;
        }
        boolean open = this.loadCondition.open();
        if (this.loader.isLoading()) {
            return open;
        }
        startLoading();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        if (this.isSingleSample) {
            return;
        }
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = this.trackState.trackEnabledStates;
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            this.sampleQueues[i].discardTo(j, z, zArr[i]);
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        assertPrepared();
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.seekMap.getSeekPoints(j);
        return seekParameters.resolveSeekPositionUs(j, seekPoints.first.timeUs, seekPoints.second.timeUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long j;
        assertPrepared();
        if (this.loadingFinished || this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                TrackState trackState = this.trackState;
                if (trackState.trackIsAudioVideoFlags[i] && trackState.trackEnabledStates[i] && !this.sampleQueues[i].isLastSampleQueued()) {
                    j = Math.min(j, this.sampleQueues[i].getLargestQueuedTimestampUs());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = getLargestQueuedTimestampUs(false);
        }
        return j == Long.MIN_VALUE ? this.lastSeekPositionUs : j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final /* synthetic */ List getStreamKeys(List list) {
        i82.b();
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        assertPrepared();
        return this.trackState.tracks;
    }

    public TrackOutput icyTrack() {
        return prepareTrackOutput(new TrackId(0, true));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return !this.loadingFinished && this.loader.isLoading() && this.loadCondition.isOpen();
    }

    public boolean isReady(int i) {
        return !suppressRead() && this.sampleQueues[i].isReady(this.loadingFinished);
    }

    public void maybeThrowError() {
        this.loader.maybeThrowError(this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(ExtractingLoadable extractingLoadable, long j, long j2, boolean z) {
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo build = new LoadEventInfo.Builder(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, j).setUri(statsDataSource.getLastOpenedUri()).setResponseHeaders(statsDataSource.getLastResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(statsDataSource.getBytesRead()).build();
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(build, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        if (z) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        if (this.enabledTrackCount > 0) {
            MediaPeriod.Callback callback = this.callback;
            callback.getClass();
            callback.onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(ExtractingLoadable extractingLoadable, long j, long j2) {
        if (this.durationUs == C.TIME_UNSET && this.seekMap != null) {
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j3 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.durationUs = j3;
            this.listener.onSourceInfoRefreshed(j3, this.seekMap, this.isLive);
        }
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo build = new LoadEventInfo.Builder(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, j).setUri(statsDataSource.getLastOpenedUri()).setResponseHeaders(statsDataSource.getLastResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(statsDataSource.getBytesRead()).build();
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(build, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        this.loadingFinished = true;
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(ExtractingLoadable extractingLoadable, long j, long j2, IOException iOException, int i) {
        ExtractingLoadable extractingLoadable2;
        Loader.LoadErrorAction createRetryAction;
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo build = new LoadEventInfo.Builder(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, j).setUri(statsDataSource.getLastOpenedUri()).setResponseHeaders(statsDataSource.getLastResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(statsDataSource.getBytesRead()).build();
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(build, new MediaLoadData(1, -1, null, 0, null, Util.usToMs(extractingLoadable.seekTimeUs), Util.usToMs(this.durationUs)), iOException, i));
        if (retryDelayMsFor == C.TIME_UNSET) {
            createRetryAction = Loader.DONT_RETRY_FATAL;
            extractingLoadable2 = extractingLoadable;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            extractingLoadable2 = extractingLoadable;
            createRetryAction = configureRetry(extractingLoadable2, extractedSamplesCount) ? Loader.createRetryAction(extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad, retryDelayMsFor) : Loader.DONT_RETRY;
        }
        boolean isRetry = createRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(build, 1, -1, null, 0, null, extractingLoadable2.seekTimeUs, this.durationUs, iOException, !isRetry);
        if (!isRetry) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable2.loadTaskId);
        }
        return createRetryAction;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadStarted(ExtractingLoadable extractingLoadable, long j, long j2, int i) {
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo.Builder builder = new LoadEventInfo.Builder(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, j);
        if (i != 0) {
            builder.setUri(statsDataSource.getLastOpenedUri()).setResponseHeaders(statsDataSource.getLastResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(statsDataSource.getBytesRead());
        }
        this.mediaSourceEventDispatcher.loadStarted(builder.build(), 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, i);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.release();
        }
        this.progressiveMediaExtractor.release();
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        if (this.singleTrackFormat == null) {
            this.loadCondition.open();
            startLoading();
        } else {
            track(this.singleTrackId, 3).format(this.singleTrackFormat);
            lambda$seekMap$1(new IndexSeekMap(new long[]{0}, new long[]{0}, C.TIME_UNSET));
            endTracks();
            this.pendingResetPositionUs = j;
        }
    }

    public int readData(int i, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i);
        int read = this.sampleQueues[i].read(formatHolder, decoderInputBuffer, i2, this.loadingFinished);
        if (read == -3) {
            maybeStartDeferredRetry(i);
        }
        return read;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.usesStreamPrerollFlags && this.pendingInitialDiscontinuity) {
            this.pendingInitialDiscontinuity = false;
            return this.lastSeekPositionUs;
        }
        if (!this.notifyDiscontinuity) {
            return C.TIME_UNSET;
        }
        if (!this.loadingFinished && getExtractedSamplesCount() <= this.extractedSamplesCountAtStartOfLoad) {
            return C.TIME_UNSET;
        }
        this.notifyDiscontinuity = false;
        return this.lastSeekPositionUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        if (this.enabledTrackCount <= 0 || isPendingReset() || !haveSampleQueuesReachedEndTimeUs()) {
            return;
        }
        this.loadingFinished = true;
    }

    public void release() {
        if (this.prepared) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.preRelease();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.e
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod.this.lambda$seekMap$1(seekMap);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        Iterator<MergingMetadataSampleStream> it = this.mergingSampleStreams.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (!this.seekMap.isSeekable()) {
            j = 0;
        }
        int i = 0;
        this.notifyDiscontinuity = false;
        boolean z = this.lastSeekPositionUs == j;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return j;
        }
        if (this.dataType == 7 || ((!this.loadingFinished && !this.loader.isLoading()) || !seekInsideBufferUs(zArr, j, z))) {
            this.pendingDeferredRetry = false;
            this.pendingResetPositionUs = j;
            this.loadingFinished = false;
            this.pendingInitialDiscontinuity = false;
            if (this.loader.isLoading()) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i < length) {
                    sampleQueueArr[i].discardToEnd();
                    i++;
                }
                this.loader.cancelLoading();
                return j;
            }
            this.loader.clearFatalError();
            SampleQueue[] sampleQueueArr2 = this.sampleQueues;
            int length2 = sampleQueueArr2.length;
            while (i < length2) {
                sampleQueueArr2[i].reset();
                i++;
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        int i;
        ?? r9;
        AnonymousClass1 anonymousClass1;
        boolean[] zArr3;
        TrackGroupArray trackGroupArray;
        AnonymousClass1 anonymousClass12;
        ExoTrackSelection exoTrackSelection;
        boolean z;
        ExoTrackSelection[] exoTrackSelectionArr2 = exoTrackSelectionArr;
        long j2 = j;
        assertPrepared();
        TrackState trackState = this.trackState;
        TrackGroupArray trackGroupArray2 = trackState.tracks;
        boolean[] zArr4 = trackState.trackEnabledStates;
        int i2 = this.enabledTrackCount;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= exoTrackSelectionArr2.length) {
                r9 = false;
                break;
            }
            ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr2[i4];
            if (exoTrackSelection2 != null && Objects.equals(trackGroupArray2.get(trackGroupArray2.indexOf(exoTrackSelection2.getTrackGroup())).getFormat(0).sampleMimeType, MimeTypes.APPLICATION_ITUT_T35)) {
                r9 = true;
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            anonymousClass1 = null;
            if (i5 >= exoTrackSelectionArr2.length) {
                break;
            }
            SampleStream sampleStream = sampleStreamArr[i5];
            if (sampleStream != null && (exoTrackSelectionArr2[i5] == null || !zArr[i5] || (r9 != false && (sampleStream instanceof MergingMetadataSampleStream)))) {
                if (sampleStream instanceof MergingMetadataSampleStream) {
                    MergingMetadataSampleStream mergingMetadataSampleStream = (MergingMetadataSampleStream) sampleStream;
                    this.mergingSampleStreams.remove(mergingMetadataSampleStream);
                    int i6 = ((SampleStreamImpl) mergingMetadataSampleStream.getPrimaryStream()).track;
                    sp0.z(zArr4[i6]);
                    this.enabledTrackCount--;
                    zArr4[i6] = false;
                    int i7 = ((SampleStreamImpl) mergingMetadataSampleStream.getMetadataStream()).track;
                    sp0.z(zArr4[i7]);
                    this.enabledTrackCount--;
                    zArr4[i7] = false;
                } else {
                    int i8 = ((SampleStreamImpl) sampleStream).track;
                    sp0.z(zArr4[i8]);
                    this.enabledTrackCount--;
                    zArr4[i8] = false;
                }
                sampleStreamArr[i5] = null;
            }
            i5++;
        }
        boolean z2 = !this.seenFirstTrackSelection ? j2 == 0 || this.isSingleSample : i2 != 0;
        int i9 = 0;
        boolean z3 = false;
        while (i9 < exoTrackSelectionArr2.length) {
            if (sampleStreamArr[i9] != null || (exoTrackSelection = exoTrackSelectionArr2[i9]) == null) {
                zArr3 = zArr4;
                trackGroupArray = trackGroupArray2;
                anonymousClass12 = anonymousClass1;
            } else {
                sp0.z(exoTrackSelection.length() == i ? i : i3);
                sp0.z(exoTrackSelection.getIndexInTrackGroup(i3) == 0 ? i : i3);
                int indexOf = trackGroupArray2.indexOf(exoTrackSelection.getTrackGroup());
                sp0.z(!zArr4[indexOf]);
                boolean z4 = i;
                this.enabledTrackCount++;
                zArr4[indexOf] = z4;
                z3 |= exoTrackSelection.getSelectedFormat().hasPrerollSamples;
                SampleStream sampleStreamImpl = new SampleStreamImpl(indexOf, exoTrackSelection.getSelectedFormat().hasPrerollSamples);
                if (Build.VERSION.SDK_INT >= 37 && r9 == false && MimeTypes.isVideo(exoTrackSelection.getSelectedFormat().sampleMimeType)) {
                    int i10 = 0;
                    while (i10 < trackGroupArray2.length) {
                        if (CodecSpecificDataUtil.isHagcTrack(trackGroupArray2.get(i10).getFormat(0))) {
                            sp0.z(!zArr4[i10]);
                            this.enabledTrackCount++;
                            zArr4[i10] = z4;
                            zArr3 = zArr4;
                            trackGroupArray = trackGroupArray2;
                            anonymousClass12 = null;
                            MergingMetadataSampleStream mergingMetadataSampleStream2 = new MergingMetadataSampleStream(sampleStreamImpl, new SampleStreamImpl(i10, false), exoTrackSelection.getSelectedFormat());
                            this.mergingSampleStreams.add(mergingMetadataSampleStream2);
                            sampleStreamImpl = mergingMetadataSampleStream2;
                            break;
                        }
                        i10++;
                        zArr4 = zArr4;
                    }
                }
                zArr3 = zArr4;
                trackGroupArray = trackGroupArray2;
                anonymousClass12 = null;
                sampleStreamArr[i9] = sampleStreamImpl;
                zArr2[i9] = z4;
                if (this.loadOnlySelectedTracks) {
                    z = this.seenFirstTrackSelection | z2;
                } else if (!z2) {
                    SampleQueue sampleQueue = this.sampleQueues[indexOf];
                    z = (sampleQueue.getReadIndex() == 0 || sampleQueue.seekTo(j2, z4)) ? false : true;
                }
                z2 = z;
            }
            i9++;
            exoTrackSelectionArr2 = exoTrackSelectionArr;
            anonymousClass1 = anonymousClass12;
            trackGroupArray2 = trackGroupArray;
            zArr4 = zArr3;
            i3 = 0;
            i = 1;
        }
        boolean[] zArr5 = zArr4;
        if (this.pendingInitialDiscontinuity || !this.seenFirstTrackSelection) {
            this.pendingInitialDiscontinuity = z3;
        }
        if (this.loadOnlySelectedTracks) {
            int i11 = 0;
            while (true) {
                ControlledTrackOutput[] controlledTrackOutputArr = this.controlledTrackOutputs;
                if (i11 >= controlledTrackOutputArr.length) {
                    break;
                }
                controlledTrackOutputArr[i11].updateSelectionState(zArr5[i11]);
                i11++;
            }
        }
        if (this.enabledTrackCount == 0) {
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = false;
            this.pendingInitialDiscontinuity = false;
            if (this.loader.isLoading()) {
                for (SampleQueue sampleQueue2 : this.sampleQueues) {
                    sampleQueue2.discardToEnd();
                }
                this.loader.cancelLoading();
            } else {
                this.loadingFinished = false;
                for (SampleQueue sampleQueue3 : this.sampleQueues) {
                    sampleQueue3.reset();
                }
            }
        } else if (z2) {
            j2 = seekToUs(j2);
            for (int i12 = 0; i12 < sampleStreamArr.length; i12++) {
                SampleStream sampleStream2 = sampleStreamArr[i12];
                if (sampleStream2 != null) {
                    zArr2[i12] = true;
                    if (sampleStream2 instanceof MergingMetadataSampleStream) {
                        ((MergingMetadataSampleStream) sampleStream2).reset();
                    }
                }
            }
        }
        this.seenFirstTrackSelection = true;
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long setEndPositionUs(long j) {
        this.endPositionUs = j;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setReadEndTimeUs(j);
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void setUsesStreamPrerollFlags() {
        this.usesStreamPrerollFlags = true;
    }

    public int skipData(int i, long j) {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i);
        SampleQueue sampleQueue = this.sampleQueues[i];
        int skipCount = sampleQueue.getSkipCount(j, this.loadingFinished);
        sampleQueue.skip(skipCount);
        if (skipCount == 0) {
            maybeStartDeferredRetry(i);
        }
        return skipCount;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        return prepareTrackOutput(new TrackId(i, false));
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class ControlledTrackOutput extends ForwardingTrackOutput {
        private final DiscardingTrackOutput discardingTrackOutput;
        private final AtomicBoolean isDiscarding;
        private final SampleQueue sampleQueue;

        public ControlledTrackOutput(SampleQueue sampleQueue) {
            super(sampleQueue);
            this.sampleQueue = sampleQueue;
            this.discardingTrackOutput = new DiscardingTrackOutput();
            this.isDiscarding = new AtomicBoolean(false);
        }

        private TrackOutput getCurrentOutput() {
            return this.isDiscarding.get() ? this.discardingTrackOutput : this.sampleQueue;
        }

        public boolean isSelected() {
            return !this.isDiscarding.get();
        }

        @Override // androidx.media3.extractor.ForwardingTrackOutput, androidx.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i, boolean z) {
            return getCurrentOutput().sampleData(dataReader, i, z);
        }

        @Override // androidx.media3.extractor.ForwardingTrackOutput, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
            getCurrentOutput().sampleMetadata(j, i, i2, i3, cryptoData);
        }

        public void updateSelectionState(boolean z) {
            this.isDiscarding.set(!z);
            if (z) {
                return;
            }
            this.sampleQueue.discardToEnd();
        }

        @Override // androidx.media3.extractor.ForwardingTrackOutput, androidx.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i, boolean z, int i2) {
            return getCurrentOutput().sampleData(dataReader, i, z, i2);
        }

        @Override // androidx.media3.extractor.ForwardingTrackOutput, androidx.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i) {
            getCurrentOutput().sampleData(parsableByteArray, i);
        }

        @Override // androidx.media3.extractor.ForwardingTrackOutput, androidx.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
            getCurrentOutput().sampleData(parsableByteArray, i, i2);
        }
    }

    public void maybeThrowError(int i) {
        this.sampleQueues[i].maybeThrowError();
        maybeThrowError();
    }
}
