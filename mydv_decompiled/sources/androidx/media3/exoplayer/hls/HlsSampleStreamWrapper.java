package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.hls.HlsChunkSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.emsg.EventMessageDecoder;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import defpackage.dy1;
import defpackage.hf1;
import defpackage.r7;
import defpackage.rt0;
import defpackage.s83;
import defpackage.sp0;
import defpackage.zx1;
import defpackage.zy;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HlsSampleStreamWrapper implements Loader.Callback<Chunk>, Loader.ReleaseCallback, SequenceableLoader, ExtractorOutput, SampleQueue.UpstreamFormatChangedListener {
    private static final Set<Integer> MAPPABLE_TYPES = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
    public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
    private static final String TAG = "HlsSampleStreamWrapper";
    private final Allocator allocator;
    private final Callback callback;
    private final HlsChunkSource chunkSource;
    private Format downstreamTrackFormat;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private DrmInitData drmInitData;
    private final DrmSessionManager drmSessionManager;
    private TrackOutput emsgUnwrappingTrackOutput;
    private int enabledTrackGroupCount;
    private long endPositionUs;
    private final Handler handler;
    private boolean haveAudioVideoSampleQueues;
    private final ArrayList<HlsSampleStream> hlsSampleStreams;
    private long lastSeekPositionUs;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final Loader loader;
    private Chunk loadingChunk;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final ArrayList<HlsMediaChunk> mediaChunks;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final int metadataType;
    private final Format muxedAudioFormat;
    private final HlsChunkSource.HlsChunkHolder nextChunkHolder;
    private final Runnable onTracksEndedRunnable;
    private Set<TrackGroup> optionalTrackGroups;
    private final Map<String, DrmInitData> overridingDrmInitData;
    private long pendingResetPositionUs;
    private boolean pendingResetUpstreamFormats;
    private boolean prepared;
    private int primarySampleQueueIndex;
    private int primarySampleQueueType;
    private int primaryTrackGroupIndex;
    private final List<HlsMediaChunk> readOnlyMediaChunks;
    private boolean released;
    private long sampleOffsetUs;
    private SparseIntArray sampleQueueIndicesByType;
    private boolean[] sampleQueueIsAudioVideoFlags;
    private Set<Integer> sampleQueueMappingDoneByType;
    private int[] sampleQueueTrackIds;
    private HlsSampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private boolean[] sampleQueuesEnabledStates;
    private boolean seenFirstTrackSelection;
    private HlsMediaChunk sourceChunk;
    private int[] trackGroupToSampleQueueIndex;
    private TrackGroupArray trackGroups;
    private final int trackType;
    private boolean tracksEnded;
    private final String uid;
    private Format upstreamTrackFormat;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Callback extends SequenceableLoader.Callback<HlsSampleStreamWrapper> {
        void onPlaylistRefreshRequired(Uri uri);

        void onPrepared();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class HlsSampleQueue extends SampleQueue {
        private DrmInitData drmInitData;
        private final Map<String, DrmInitData> overridingDrmInitData;

        private HlsSampleQueue(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, Map<String, DrmInitData> map) {
            super(allocator, drmSessionManager, eventDispatcher);
            this.overridingDrmInitData = map;
        }

        private Metadata getAdjustedMetadata(Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int length = metadata.length();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                Metadata.Entry entry = metadata.get(i2);
                if ((entry instanceof PrivFrame) && HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(((PrivFrame) entry).owner)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return metadata;
            }
            if (length == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[length - 1];
            while (i < length) {
                if (i != i2) {
                    entryArr[i < i2 ? i : i - 1] = metadata.get(i);
                }
                i++;
            }
            return new Metadata(entryArr);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public Format getAdjustedUpstreamFormat(Format format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.drmInitData;
            if (drmInitData2 == null) {
                drmInitData2 = format.drmInitData;
            }
            if (drmInitData2 != null && (drmInitData = this.overridingDrmInitData.get(drmInitData2.schemeType)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata adjustedMetadata = getAdjustedMetadata(format.metadata);
            if (drmInitData2 != format.drmInitData || adjustedMetadata != format.metadata) {
                format = format.buildUpon().setDrmInitData(drmInitData2).setMetadata(adjustedMetadata).build();
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
            super.sampleMetadata(j, i, i2, i3, cryptoData);
        }

        public void setDrmInitData(DrmInitData drmInitData) {
            this.drmInitData = drmInitData;
            invalidateUpstreamFormatAdjustment();
        }

        public void setSourceChunk(HlsMediaChunk hlsMediaChunk) {
            sourceId(hlsMediaChunk.uid);
        }
    }

    public HlsSampleStreamWrapper(String str, int i, Callback callback, HlsChunkSource hlsChunkSource, Map<String, DrmInitData> map, Allocator allocator, long j, Format format, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, int i2, ReleasableExecutor releasableExecutor) {
        this.uid = str;
        this.trackType = i;
        this.callback = callback;
        this.chunkSource = hlsChunkSource;
        this.overridingDrmInitData = map;
        this.allocator = allocator;
        this.muxedAudioFormat = format;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.metadataType = i2;
        this.loader = releasableExecutor != null ? new Loader(releasableExecutor) : new Loader("Loader:HlsSampleStreamWrapper");
        this.nextChunkHolder = new HlsChunkSource.HlsChunkHolder();
        this.sampleQueueTrackIds = new int[0];
        Set<Integer> set = MAPPABLE_TYPES;
        this.sampleQueueMappingDoneByType = new HashSet(set.size());
        this.sampleQueueIndicesByType = new SparseIntArray(set.size());
        this.sampleQueues = new HlsSampleQueue[0];
        this.sampleQueueIsAudioVideoFlags = new boolean[0];
        this.sampleQueuesEnabledStates = new boolean[0];
        ArrayList<HlsMediaChunk> arrayList = new ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = DesugarCollections.unmodifiableList(arrayList);
        this.hlsSampleStreams = new ArrayList<>();
        this.maybeFinishPrepareRunnable = new m(this, (byte) 0);
        this.onTracksEndedRunnable = new m(this, (byte) 1);
        this.handler = Util.createHandlerForCurrentLooper();
        this.lastSeekPositionUs = j;
        this.pendingResetPositionUs = j;
        this.endPositionUs = Long.MIN_VALUE;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    private void assertIsPrepared() {
        sp0.z(this.prepared);
        this.trackGroups.getClass();
        this.optionalTrackGroups.getClass();
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    private void buildTracksFromSampleStreams() {
        Format format;
        int length = this.sampleQueues.length;
        int i = -2;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Format upstreamFormat = this.sampleQueues[i3].getUpstreamFormat();
            upstreamFormat.getClass();
            String str = upstreamFormat.sampleMimeType;
            int i4 = MimeTypes.isVideo(str) ? 2 : MimeTypes.isAudio(str) ? 1 : MimeTypes.isText(str) ? 3 : -2;
            if (getTrackTypeScore(i4) > getTrackTypeScore(i)) {
                i2 = i3;
                i = i4;
            } else if (i4 == i && i2 != -1) {
                i2 = -1;
            }
            i3++;
        }
        TrackGroup trackGroup = this.chunkSource.getTrackGroup();
        int i5 = trackGroup.length;
        this.primaryTrackGroupIndex = -1;
        this.trackGroupToSampleQueueIndex = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.trackGroupToSampleQueueIndex[i6] = i6;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        int i7 = 0;
        while (i7 < length) {
            Format upstreamFormat2 = this.sampleQueues[i7].getUpstreamFormat();
            upstreamFormat2.getClass();
            if (i7 == i2) {
                Format[] formatArr = new Format[i5];
                for (int i8 = 0; i8 < i5; i8++) {
                    Format format2 = trackGroup.getFormat(i8);
                    if (i == 1 && (format = this.muxedAudioFormat) != null) {
                        format2 = format2.withManifestFormatInfo(format);
                    }
                    formatArr[i8] = i5 == 1 ? upstreamFormat2.withManifestFormatInfo(format2) : deriveFormat(format2, upstreamFormat2, true);
                }
                trackGroupArr[i7] = new TrackGroup(this.uid, formatArr);
                this.primaryTrackGroupIndex = i7;
            } else {
                Format format3 = (i == 2 && MimeTypes.isAudio(upstreamFormat2.sampleMimeType)) ? this.muxedAudioFormat : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.uid);
                sb.append(":muxed:");
                sb.append(i7 < i2 ? i7 : i7 - 1);
                trackGroupArr[i7] = new TrackGroup(sb.toString(), deriveFormat(format3, upstreamFormat2, false).buildUpon().setPrimaryTrackGroupId(this.uid).build());
            }
            i7++;
        }
        this.trackGroups = createTrackGroupArrayWithDrmInfo(trackGroupArr);
        sp0.z(this.optionalTrackGroups == null);
        this.optionalTrackGroups = Collections.EMPTY_SET;
    }

    private boolean canDiscardUpstreamMediaChunksFromIndex(int i) {
        int i2 = i;
        while (true) {
            int size = this.mediaChunks.size();
            ArrayList<HlsMediaChunk> arrayList = this.mediaChunks;
            if (i2 >= size) {
                HlsMediaChunk hlsMediaChunk = arrayList.get(i);
                for (int i3 = 0; i3 < this.sampleQueues.length; i3++) {
                    if (this.sampleQueues[i3].getReadIndex() > hlsMediaChunk.getFirstSampleIndex(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (arrayList.get(i2).shouldSpliceIn()) {
                return false;
            }
            i2++;
        }
    }

    private static DiscardingTrackOutput createDiscardingTrackOutput(int i, int i2) {
        Log.w(TAG, "Unmapped track with id " + i + " of type " + i2);
        return new DiscardingTrackOutput();
    }

    private SampleQueue createSampleQueue(int i, int i2) {
        int length = this.sampleQueues.length;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        HlsSampleQueue hlsSampleQueue = new HlsSampleQueue(this.allocator, this.drmSessionManager, this.drmEventDispatcher, this.overridingDrmInitData);
        hlsSampleQueue.setStartTimeUs(this.lastSeekPositionUs);
        if (z) {
            hlsSampleQueue.setDrmInitData(this.drmInitData);
        }
        hlsSampleQueue.setSampleOffsetUs(this.sampleOffsetUs);
        HlsMediaChunk hlsMediaChunk = this.sourceChunk;
        if (hlsMediaChunk != null) {
            hlsSampleQueue.setSourceChunk(hlsMediaChunk);
        }
        hlsSampleQueue.setUpstreamFormatChangeListener(this);
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(this.sampleQueueTrackIds, i3);
        this.sampleQueueTrackIds = copyOf;
        copyOf[length] = i;
        this.sampleQueues = (HlsSampleQueue[]) Util.nullSafeArrayAppend(this.sampleQueues, hlsSampleQueue);
        boolean[] copyOf2 = Arrays.copyOf(this.sampleQueueIsAudioVideoFlags, i3);
        this.sampleQueueIsAudioVideoFlags = copyOf2;
        copyOf2[length] = z;
        this.haveAudioVideoSampleQueues |= z;
        this.sampleQueueMappingDoneByType.add(Integer.valueOf(i2));
        this.sampleQueueIndicesByType.append(i2, length);
        if (getTrackTypeScore(i2) > getTrackTypeScore(this.primarySampleQueueType)) {
            this.primarySampleQueueIndex = length;
            this.primarySampleQueueType = i2;
        }
        this.sampleQueuesEnabledStates = Arrays.copyOf(this.sampleQueuesEnabledStates, i3);
        return hlsSampleQueue;
    }

    private TrackGroupArray createTrackGroupArrayWithDrmInfo(TrackGroup[] trackGroupArr) {
        for (int i = 0; i < trackGroupArr.length; i++) {
            TrackGroup trackGroup = trackGroupArr[i];
            Format[] formatArr = new Format[trackGroup.length];
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                Format format = trackGroup.getFormat(i2);
                formatArr[i2] = format.copyWithCryptoType(this.drmSessionManager.getCryptoType(format));
            }
            trackGroupArr[i] = new TrackGroup(trackGroup.id, formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    private static Format deriveFormat(Format format, Format format2, boolean z) {
        String codecsCorrespondingToMimeType;
        String str;
        if (format == null) {
            return format2;
        }
        int trackType = MimeTypes.getTrackType(format2.sampleMimeType);
        int codecCountOfType = Util.getCodecCountOfType(format.codecs, trackType);
        String str2 = format.codecs;
        if (codecCountOfType == 1) {
            codecsCorrespondingToMimeType = Util.getCodecsOfType(str2, trackType);
            str = MimeTypes.getMediaMimeType(codecsCorrespondingToMimeType);
        } else {
            codecsCorrespondingToMimeType = MimeTypes.getCodecsCorrespondingToMimeType(str2, format2.sampleMimeType);
            str = format2.sampleMimeType;
        }
        Format.Builder codecs = format2.buildUpon().setId(format.id).setLabel(format.label).setLabels(format.labels).setLanguage(format.language).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).setAverageBitrate(z ? format.averageBitrate : -1).setPeakBitrate(z ? format.peakBitrate : -1).setCodecs(codecsCorrespondingToMimeType);
        if (trackType == 2) {
            codecs.setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate);
        }
        if (str != null) {
            codecs.setSampleMimeType(str);
        }
        int i = format.channelCount;
        if (i != -1 && trackType == 1) {
            codecs.setChannelCount(i);
        }
        Metadata metadata = format.metadata;
        if (metadata != null) {
            Metadata metadata2 = format2.metadata;
            if (metadata2 != null) {
                metadata = metadata2.copyWithAppendedEntriesFrom(metadata);
            }
            codecs.setMetadata(metadata);
        }
        return codecs.build();
    }

    private void discardUpstream(int i) {
        sp0.z(!this.loader.isLoading());
        while (true) {
            if (i >= this.mediaChunks.size()) {
                i = -1;
                break;
            } else if (canDiscardUpstreamMediaChunksFromIndex(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = getLastMediaChunk().endTimeUs;
        HlsMediaChunk discardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = Math.max(this.lastSeekPositionUs, discardUpstreamMediaChunksFromIndex.startTimeUs);
        } else {
            ((HlsMediaChunk) rt0.z(this.mediaChunks)).invalidateExtractor();
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primarySampleQueueType, discardUpstreamMediaChunksFromIndex.startTimeUs, j);
    }

    private HlsMediaChunk discardUpstreamMediaChunksFromIndex(int i) {
        HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(i);
        ArrayList<HlsMediaChunk> arrayList = this.mediaChunks;
        Util.removeRange(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.sampleQueues.length; i2++) {
            this.sampleQueues[i2].discardUpstreamSamples(hlsMediaChunk.getFirstSampleIndex(i2));
        }
        return hlsMediaChunk;
    }

    private boolean finishedReadingChunk(HlsMediaChunk hlsMediaChunk) {
        int i = hlsMediaChunk.uid;
        int length = this.sampleQueues.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.sampleQueuesEnabledStates[i2] && this.sampleQueues[i2].peekSourceId() == i) {
                return false;
            }
        }
        return true;
    }

    private static boolean formatsMatch(Format format, Format format2) {
        String str = format.sampleMimeType;
        String str2 = format2.sampleMimeType;
        int trackType = MimeTypes.getTrackType(str);
        if (trackType != 3) {
            return trackType == MimeTypes.getTrackType(str2);
        }
        if (Objects.equals(str, str2)) {
            return !(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str)) || format.accessibilityChannel == format2.accessibilityChannel;
        }
        return false;
    }

    private HlsMediaChunk getLastMediaChunk() {
        return (HlsMediaChunk) r7.w(this.mediaChunks, 1);
    }

    private TrackOutput getMappedTrackOutput(int i, int i2) {
        sp0.o(MAPPABLE_TYPES.contains(Integer.valueOf(i2)));
        int i3 = this.sampleQueueIndicesByType.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.sampleQueueMappingDoneByType.add(Integer.valueOf(i2))) {
            this.sampleQueueTrackIds[i3] = i;
        }
        return this.sampleQueueTrackIds[i3] == i ? this.sampleQueues[i3] : createDiscardingTrackOutput(i, i2);
    }

    private static int getTrackTypeScore(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    private void initMediaChunkLoad(HlsMediaChunk hlsMediaChunk) {
        this.sourceChunk = hlsMediaChunk;
        this.upstreamTrackFormat = hlsMediaChunk.trackFormat;
        this.pendingResetPositionUs = C.TIME_UNSET;
        this.mediaChunks.add(hlsMediaChunk);
        zx1 n = dy1.n();
        for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            n.c(Integer.valueOf(hlsSampleQueue.getWriteIndex()));
        }
        hlsMediaChunk.init(this, n.f());
        for (HlsSampleQueue hlsSampleQueue2 : this.sampleQueues) {
            hlsSampleQueue2.setSourceChunk(hlsMediaChunk);
            if (hlsMediaChunk.shouldSpliceIn()) {
                hlsSampleQueue2.splice();
            }
        }
    }

    private static boolean isMediaChunk(Chunk chunk) {
        return chunk instanceof HlsMediaChunk;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPlaylistUpdated$0(HlsMediaChunk hlsMediaChunk) {
        this.callback.onPlaylistRefreshRequired(hlsMediaChunk.playlistUrl);
    }

    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @RequiresNonNull({"trackGroups"})
    private void mapSampleQueuesToMatchTrackGroups() {
        int i = this.trackGroups.length;
        int[] iArr = new int[i];
        this.trackGroupToSampleQueueIndex = iArr;
        Arrays.fill(iArr, -1);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
                if (i4 < hlsSampleQueueArr.length) {
                    Format upstreamFormat = hlsSampleQueueArr[i4].getUpstreamFormat();
                    upstreamFormat.getClass();
                    if (formatsMatch(upstreamFormat, this.trackGroups.get(i3).getFormat(0))) {
                        this.trackGroupToSampleQueueIndex[i3] = i4;
                        break;
                    }
                    i4++;
                }
            }
        }
        ArrayList<HlsSampleStream> arrayList = this.hlsSampleStreams;
        int size = arrayList.size();
        while (i2 < size) {
            HlsSampleStream hlsSampleStream = arrayList.get(i2);
            i2++;
            hlsSampleStream.bindSampleQueue();
        }
    }

    private void maybeDiscardUpstreamForNewMediaChunk(HlsMediaChunk hlsMediaChunk) {
        if (this.mediaChunks.isEmpty()) {
            return;
        }
        if (!getLastMediaChunk().isPublished()) {
            discardUpstream(this.mediaChunks.size() - 1);
        }
        if (hlsMediaChunk.isIndependent && hlsMediaChunk.shouldSpliceIn()) {
            for (int size = this.mediaChunks.size() - 1; size >= 0; size--) {
                long j = this.mediaChunks.get(size).startTimeUs;
                long j2 = hlsMediaChunk.startTimeUs;
                if (j < j2) {
                    return;
                }
                if (j == j2 && canDiscardUpstreamMediaChunksFromIndex(size)) {
                    discardUpstream(size);
                    hlsMediaChunk.clearShouldSpliceIn();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (!this.released && this.trackGroupToSampleQueueIndex == null && this.sampleQueuesBuilt) {
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                if (hlsSampleQueue.getUpstreamFormat() == null) {
                    return;
                }
            }
            if (this.trackGroups != null) {
                mapSampleQueuesToMatchTrackGroups();
                return;
            }
            buildTracksFromSampleStreams();
            setIsPrepared();
            this.callback.onPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTracksEnded() {
        for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.setReadEndTimeUs(this.endPositionUs);
        }
        this.sampleQueuesBuilt = true;
        maybeFinishPrepare();
    }

    private void resetSampleQueues() {
        for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.reset(this.pendingResetUpstreamFormats);
        }
        this.pendingResetUpstreamFormats = false;
    }

    private boolean seekInsideBufferUs(long j, HlsMediaChunk hlsMediaChunk) {
        boolean seekTo;
        int length = this.sampleQueues.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            HlsSampleQueue hlsSampleQueue = this.sampleQueues[i];
            if (hlsMediaChunk != null) {
                seekTo = hlsSampleQueue.seekTo(hlsMediaChunk.getFirstSampleIndex(i));
            } else {
                long nextLoadPositionUs = getNextLoadPositionUs();
                if (nextLoadPositionUs != Long.MIN_VALUE && j >= nextLoadPositionUs) {
                    z = false;
                }
                seekTo = hlsSampleQueue.seekTo(j, z);
            }
            if (seekTo || (!this.sampleQueueIsAudioVideoFlags[i] && this.haveAudioVideoSampleQueues)) {
                i++;
            }
        }
        return false;
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    private void setIsPrepared() {
        this.prepared = true;
    }

    private void updateSampleStreams(SampleStream[] sampleStreamArr) {
        this.hlsSampleStreams.clear();
        for (SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream != null) {
                this.hlsSampleStreams.add((HlsSampleStream) sampleStream);
            }
        }
    }

    public int bindSampleQueueToSampleStream(int i) {
        assertIsPrepared();
        this.trackGroupToSampleQueueIndex.getClass();
        int i2 = this.trackGroupToSampleQueueIndex[i];
        if (i2 == -1) {
            return this.optionalTrackGroups.contains(this.trackGroups.get(i)) ? -3 : -2;
        }
        boolean[] zArr = this.sampleQueuesEnabledStates;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        List<HlsMediaChunk> list;
        long j;
        long j2;
        boolean z;
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        if (isPendingReset()) {
            List<HlsMediaChunk> list2 = Collections.EMPTY_LIST;
            long j3 = this.pendingResetPositionUs;
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
            list = list2;
            j = j3;
            j2 = j;
        } else {
            List<HlsMediaChunk> list3 = this.readOnlyMediaChunks;
            HlsMediaChunk lastMediaChunk = getLastMediaChunk();
            long publishedEndTimeUs = (lastMediaChunk.isLoadCompleted() && lastMediaChunk.isPublished()) ? lastMediaChunk.getPublishedEndTimeUs() : Math.max(this.lastSeekPositionUs, lastMediaChunk.startTimeUs);
            long j4 = this.lastSeekPositionUs;
            if (this.sampleQueuesBuilt) {
                for (HlsSampleQueue hlsSampleQueue2 : this.sampleQueues) {
                    j4 = Math.max(j4, hlsSampleQueue2.getLargestReadTimestampUs());
                }
            }
            list = list3;
            j = publishedEndTimeUs;
            j2 = j4;
        }
        this.nextChunkHolder.clear();
        this.chunkSource.getNextChunk(loadingInfo, j, j2, list, this.prepared || !list.isEmpty(), this.nextChunkHolder);
        HlsChunkSource.HlsChunkHolder hlsChunkHolder = this.nextChunkHolder;
        boolean z2 = hlsChunkHolder.endOfStream;
        Chunk chunk = hlsChunkHolder.chunk;
        Uri uri = hlsChunkHolder.playlistUrl;
        if (chunk != null) {
            long j5 = this.endPositionUs;
            if (j5 != Long.MIN_VALUE && chunk.startTimeUs >= j5) {
                z = true;
                if (!z2 || z) {
                    this.pendingResetPositionUs = C.TIME_UNSET;
                    this.loadingFinished = true;
                    return true;
                }
                if (chunk == null) {
                    if (uri != null) {
                        this.callback.onPlaylistRefreshRequired(uri);
                    }
                    return false;
                }
                if (isMediaChunk(chunk)) {
                    HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) chunk;
                    maybeDiscardUpstreamForNewMediaChunk(hlsMediaChunk);
                    initMediaChunkLoad(hlsMediaChunk);
                }
                this.loadingChunk = chunk;
                this.loader.startLoading(chunk, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(chunk.type));
                return true;
            }
        }
        z = false;
        if (z2) {
        }
        this.pendingResetPositionUs = C.TIME_UNSET;
        this.loadingFinished = true;
        return true;
    }

    public void continuePreparing() {
        if (this.prepared) {
            return;
        }
        continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
    }

    public void discardBuffer(long j, boolean z) {
        if (!this.sampleQueuesBuilt || isPendingReset()) {
            return;
        }
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            this.sampleQueues[i].discardTo(j, z, this.sampleQueuesEnabledStates[i]);
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.tracksEnded = true;
        this.handler.post(this.onTracksEndedRunnable);
    }

    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long j = this.lastSeekPositionUs;
        HlsMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            lastMediaChunk = this.mediaChunks.size() > 1 ? (HlsMediaChunk) r7.w(this.mediaChunks, 2) : null;
        }
        if (lastMediaChunk != null) {
            j = Math.max(j, lastMediaChunk.endTimeUs);
        }
        if (this.sampleQueuesBuilt) {
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                j = Math.max(j, hlsSampleQueue.getLargestQueuedTimestampUs());
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    public int getPrimaryTrackGroupIndex() {
        return this.primaryTrackGroupIndex;
    }

    public dy1 getRedundantGroups() {
        return this.chunkSource.getRedundantGroups();
    }

    public TrackGroupArray getTrackGroups() {
        assertIsPrepared();
        return this.trackGroups;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    public boolean isReady(int i) {
        return !isPendingReset() && this.sampleQueues[i].isReady(this.loadingFinished);
    }

    public boolean isVideoSampleStream() {
        return this.primarySampleQueueType == 2;
    }

    public void maybeThrowError(int i) {
        maybeThrowError();
        this.sampleQueues[i].maybeThrowError();
    }

    public void maybeThrowPrepareError() {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(Chunk chunk, long j, long j2, boolean z) {
        this.loadingChunk = null;
        LoadEventInfo build = new LoadEventInfo.Builder(chunk.loadTaskId, chunk.dataSpec, j).setUri(chunk.getUri()).setSteeredPathwayId(chunk.steeredPathwayId).setResponseHeaders(chunk.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(chunk.bytesLoaded()).build();
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(build, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z) {
            return;
        }
        if (isPendingReset() || this.enabledTrackGroupCount == 0) {
            resetSampleQueues();
        }
        if (this.enabledTrackGroupCount > 0) {
            this.callback.onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(Chunk chunk, long j, long j2) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        LoadEventInfo build = new LoadEventInfo.Builder(chunk.loadTaskId, chunk.dataSpec, j).setUri(chunk.getUri()).setSteeredPathwayId(chunk.steeredPathwayId).setResponseHeaders(chunk.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(chunk.bytesLoaded()).build();
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(build, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (this.prepared) {
            this.callback.onContinueLoadingRequested(this);
        } else {
            continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(Chunk chunk, long j, long j2, IOException iOException, int i) {
        Loader.LoadErrorAction createRetryAction;
        int i2;
        boolean isMediaChunk = isMediaChunk(chunk);
        if (isMediaChunk && !((HlsMediaChunk) chunk).isPublished() && (iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((i2 = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode) == 410 || i2 == 404)) {
            return Loader.RETRY;
        }
        long bytesLoaded = chunk.bytesLoaded();
        LoadEventInfo build = new LoadEventInfo.Builder(chunk.loadTaskId, chunk.dataSpec, j).setUri(chunk.getUri()).setSteeredPathwayId(chunk.steeredPathwayId).setResponseHeaders(chunk.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(bytesLoaded).build();
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(build, new MediaLoadData(chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, Util.usToMs(chunk.startTimeUs), Util.usToMs(chunk.endTimeUs)), iOException, i);
        boolean onChunkError = this.chunkSource.onChunkError(chunk, this.loadErrorHandlingPolicy.getFallbackSelectionFor(this.chunkSource.createFallbackOptions(chunk), loadErrorInfo));
        if (onChunkError) {
            if (isMediaChunk && bytesLoaded == 0) {
                ArrayList<HlsMediaChunk> arrayList = this.mediaChunks;
                sp0.z(arrayList.remove(arrayList.size() - 1) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                } else {
                    ((HlsMediaChunk) rt0.z(this.mediaChunks)).invalidateExtractor();
                }
            }
            createRetryAction = Loader.DONT_RETRY;
        } else {
            long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
            createRetryAction = retryDelayMsFor != C.TIME_UNSET ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
        }
        Loader.LoadErrorAction loadErrorAction = createRetryAction;
        boolean isRetry = loadErrorAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(build, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, !isRetry);
        if (!isRetry) {
            this.loadingChunk = null;
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        }
        if (onChunkError) {
            if (!this.prepared) {
                continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
                return loadErrorAction;
            }
            this.callback.onContinueLoadingRequested(this);
        }
        return loadErrorAction;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadStarted(Chunk chunk, long j, long j2, int i) {
        LoadEventInfo.Builder steeredPathwayId = new LoadEventInfo.Builder(chunk.loadTaskId, chunk.dataSpec, j).setSteeredPathwayId(chunk.steeredPathwayId);
        if (i != 0) {
            steeredPathwayId.setUri(chunk.getUri()).setResponseHeaders(chunk.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(chunk.bytesLoaded());
        }
        this.mediaSourceEventDispatcher.loadStarted(steeredPathwayId.build(), chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, i);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.release();
        }
    }

    public void onNewExtractor() {
        this.sampleQueueMappingDoneByType.clear();
    }

    public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelection;
        if (!this.chunkSource.obtainsChunksForPlaylist(uri)) {
            return false;
        }
        if (z) {
            fallbackSelection = null;
        } else {
            fallbackSelection = this.loadErrorHandlingPolicy.getFallbackSelectionFor(this.chunkSource.createFallbackOptions(uri), loadErrorInfo);
        }
        return this.chunkSource.onPlaylistError(uri, fallbackSelection);
    }

    public void onPlaylistUpdated() {
        if (this.mediaChunks.isEmpty()) {
            return;
        }
        HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) rt0.z(this.mediaChunks);
        int chunkPublicationState = this.chunkSource.getChunkPublicationState(hlsMediaChunk);
        if (chunkPublicationState == 1) {
            if (hlsMediaChunk.isPublished()) {
                return;
            }
            hlsMediaChunk.publish(this.chunkSource.getPublishedPartDurationUs(hlsMediaChunk));
        } else if (chunkPublicationState == 0) {
            this.handler.post(new c(this, hlsMediaChunk, (byte) 4));
        } else if (chunkPublicationState == 2 && !this.loadingFinished && this.loader.isLoading()) {
            this.loader.cancelLoading();
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    public void prepareWithMultivariantPlaylistInfo(TrackGroup[] trackGroupArr, int i, int... iArr) {
        this.trackGroups = createTrackGroupArrayWithDrmInfo(trackGroupArr);
        this.optionalTrackGroups = new HashSet();
        for (int i2 : iArr) {
            this.optionalTrackGroups.add(this.trackGroups.get(i2));
        }
        this.primaryTrackGroupIndex = i;
        Handler handler = this.handler;
        Callback callback = this.callback;
        Objects.requireNonNull(callback);
        handler.post(new defpackage.h(callback, (byte) 13));
        setIsPrepared();
    }

    public int readData(int i, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        Format format;
        if (isPendingReset()) {
            return -3;
        }
        int i3 = 0;
        if (!this.mediaChunks.isEmpty()) {
            int i4 = 0;
            while (i4 < this.mediaChunks.size() - 1 && finishedReadingChunk(this.mediaChunks.get(i4))) {
                i4++;
            }
            Util.removeRange(this.mediaChunks, 0, i4);
            HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(0);
            Format format2 = hlsMediaChunk.trackFormat;
            if (!format2.equals(this.downstreamTrackFormat)) {
                this.mediaSourceEventDispatcher.downstreamFormatChanged(this.trackType, format2, hlsMediaChunk.trackSelectionReason, hlsMediaChunk.trackSelectionData, hlsMediaChunk.startTimeUs);
            }
            this.downstreamTrackFormat = format2;
        }
        if (!this.mediaChunks.isEmpty() && !this.mediaChunks.get(0).isPublished()) {
            return -3;
        }
        int read = this.sampleQueues[i].read(formatHolder, decoderInputBuffer, i2, this.loadingFinished);
        if (read == -5) {
            Format format3 = formatHolder.format;
            format3.getClass();
            if (i == this.primarySampleQueueIndex) {
                int B = sp0.B(this.sampleQueues[i].peekSourceId());
                while (i3 < this.mediaChunks.size() && this.mediaChunks.get(i3).uid != B) {
                    i3++;
                }
                if (i3 < this.mediaChunks.size()) {
                    format = this.mediaChunks.get(i3).trackFormat;
                } else {
                    format = this.upstreamTrackFormat;
                    format.getClass();
                }
                format3 = format3.withManifestFormatInfo(format);
            }
            formatHolder.format = format3;
        }
        return read;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (this.loader.isLoading()) {
            Chunk chunk = this.loadingChunk;
            chunk.getClass();
            if (!isMediaChunk(chunk) || canDiscardUpstreamMediaChunksFromIndex(this.mediaChunks.size() - 1)) {
                long j2 = this.endPositionUs;
                if ((j2 == Long.MIN_VALUE || chunk.startTimeUs < j2) && !this.chunkSource.shouldCancelLoad(j, chunk, this.readOnlyMediaChunks)) {
                    return;
                }
                this.loader.cancelLoading();
                return;
            }
            return;
        }
        int size = this.readOnlyMediaChunks.size();
        while (size > 0 && this.chunkSource.getChunkPublicationState(this.readOnlyMediaChunks.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.readOnlyMediaChunks.size()) {
            discardUpstream(size);
        }
        int min = Math.min(this.mediaChunks.size(), this.chunkSource.getPreferredQueueSize(j, this.readOnlyMediaChunks));
        boolean z = false;
        if (this.endPositionUs != Long.MIN_VALUE) {
            while (min > 0 && this.mediaChunks.get(min - 1).startTimeUs >= this.endPositionUs) {
                min--;
                z = true;
            }
        }
        if (min < this.mediaChunks.size()) {
            discardUpstream(min);
        }
        if (z) {
            this.pendingResetPositionUs = C.TIME_UNSET;
            this.loadingFinished = true;
        }
    }

    public void release() {
        if (this.prepared) {
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.preRelease();
            }
        }
        this.chunkSource.reset();
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.released = true;
        this.hlsSampleStreams.clear();
    }

    public boolean seekToUs(long j, boolean z) {
        HlsMediaChunk hlsMediaChunk;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return true;
        }
        if (this.chunkSource.hasIndependentSegments()) {
            for (int i = 0; i < this.mediaChunks.size(); i++) {
                hlsMediaChunk = this.mediaChunks.get(i);
                if (hlsMediaChunk.startTimeUs == j) {
                    break;
                }
            }
        }
        hlsMediaChunk = null;
        if (this.sampleQueuesBuilt && !z && !this.mediaChunks.isEmpty() && seekInsideBufferUs(j, hlsMediaChunk)) {
            return false;
        }
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        if (this.loader.isLoading()) {
            if (this.sampleQueuesBuilt) {
                for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                    hlsSampleQueue.discardToEnd();
                }
            }
            this.loader.cancelLoading();
        } else {
            this.loader.clearFatalError();
            resetSampleQueues();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x010f, code lost:
    
        if (r1.getSelectedIndexInTrackGroup() != r13.chunkSource.getTrackGroup().indexOf(r14.trackFormat)) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] r14, boolean[] r15, androidx.media3.exoplayer.source.SampleStream[] r16, boolean[] r17, long r18, boolean r20) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[], boolean[], androidx.media3.exoplayer.source.SampleStream[], boolean[], long, boolean):boolean");
    }

    public void setDrmInitData(DrmInitData drmInitData) {
        if (Objects.equals(this.drmInitData, drmInitData)) {
            return;
        }
        this.drmInitData = drmInitData;
        int i = 0;
        while (true) {
            HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
            if (i >= hlsSampleQueueArr.length) {
                return;
            }
            if (this.sampleQueueIsAudioVideoFlags[i]) {
                hlsSampleQueueArr[i].setDrmInitData(drmInitData);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setEndPositionUs(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.loadingFinished
            r1 = 0
            if (r0 == 0) goto L17
            long r2 = r6.endPositionUs
            r4 = -9223372036854775808
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L17
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L15
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
        L15:
            r0 = 1
            goto L18
        L17:
            r0 = r1
        L18:
            r6.endPositionUs = r7
            boolean r2 = r6.sampleQueuesBuilt
            if (r2 == 0) goto L2c
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r2 = r6.sampleQueues
            int r3 = r2.length
            r4 = r1
        L22:
            if (r4 >= r3) goto L2c
            r5 = r2[r4]
            r5.setReadEndTimeUs(r7)
            int r4 = r4 + 1
            goto L22
        L2c:
            if (r0 == 0) goto L35
            r6.loadingFinished = r1
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper$Callback r7 = r6.callback
            r7.onContinueLoadingRequested(r6)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.setEndPositionUs(long):void");
    }

    public void setIsPrimaryTimestampSource(boolean z) {
        this.chunkSource.setIsPrimaryTimestampSource(z);
    }

    public void setSampleOffsetUs(long j) {
        if (this.sampleOffsetUs != j) {
            this.sampleOffsetUs = j;
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.setSampleOffsetUs(j);
            }
        }
    }

    public int skipData(int i, long j) {
        if (isPendingReset()) {
            return 0;
        }
        HlsSampleQueue hlsSampleQueue = this.sampleQueues[i];
        int skipCount = hlsSampleQueue.getSkipCount(j, this.loadingFinished);
        HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) rt0.A(this.mediaChunks);
        if (hlsMediaChunk != null && !hlsMediaChunk.isPublished()) {
            skipCount = Math.min(skipCount, hlsMediaChunk.getFirstSampleIndex(i) - hlsSampleQueue.getReadIndex());
        }
        hlsSampleQueue.skip(skipCount);
        return skipCount;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        TrackOutput trackOutput;
        if (!MAPPABLE_TYPES.contains(Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                TrackOutput[] trackOutputArr = this.sampleQueues;
                if (i3 >= trackOutputArr.length) {
                    trackOutput = null;
                    break;
                }
                if (this.sampleQueueTrackIds[i3] == i) {
                    trackOutput = trackOutputArr[i3];
                    break;
                }
                i3++;
            }
        } else {
            trackOutput = getMappedTrackOutput(i, i2);
        }
        if (trackOutput == null) {
            if (this.tracksEnded) {
                return createDiscardingTrackOutput(i, i2);
            }
            trackOutput = createSampleQueue(i, i2);
        }
        if (i2 != 5) {
            return trackOutput;
        }
        TrackOutput trackOutput2 = this.emsgUnwrappingTrackOutput;
        if (trackOutput2 != null) {
            return trackOutput2;
        }
        EmsgUnwrappingTrackOutput emsgUnwrappingTrackOutput = new EmsgUnwrappingTrackOutput(trackOutput, this.metadataType);
        this.emsgUnwrappingTrackOutput = emsgUnwrappingTrackOutput;
        return emsgUnwrappingTrackOutput;
    }

    public void unbindSampleQueue(int i) {
        assertIsPrepared();
        this.trackGroupToSampleQueueIndex.getClass();
        int i2 = this.trackGroupToSampleQueueIndex[i];
        if (i2 >= 0) {
            sp0.z(this.sampleQueuesEnabledStates[i2]);
            this.sampleQueuesEnabledStates[i2] = false;
        }
    }

    public void maybeThrowError() {
        this.loader.maybeThrowError();
        this.chunkSource.maybeThrowError();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class EmsgUnwrappingTrackOutput implements TrackOutput {
        private byte[] buffer;
        private int bufferPosition;
        private final TrackOutput delegate;
        private final Format delegateFormat;
        private final EventMessageDecoder emsgDecoder = new EventMessageDecoder();
        private Format format;
        private static final Format ID3_FORMAT = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_ID3).build();
        private static final Format EMSG_FORMAT = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_EMSG).build();

        public EmsgUnwrappingTrackOutput(TrackOutput trackOutput, int i) {
            this.delegate = trackOutput;
            if (i == 1) {
                this.delegateFormat = ID3_FORMAT;
            } else {
                if (i != 3) {
                    s83.t(hf1.u(i, "Unknown metadataType: "));
                    throw null;
                }
                this.delegateFormat = EMSG_FORMAT;
            }
            this.buffer = new byte[0];
            this.bufferPosition = 0;
        }

        private boolean emsgContainsExpectedWrappedFormat(EventMessage eventMessage) {
            Format wrappedMetadataFormat = eventMessage.getWrappedMetadataFormat();
            return wrappedMetadataFormat != null && Objects.equals(this.delegateFormat.sampleMimeType, wrappedMetadataFormat.sampleMimeType);
        }

        private void ensureBufferCapacity(int i) {
            byte[] bArr = this.buffer;
            if (bArr.length < i) {
                this.buffer = Arrays.copyOf(bArr, (i / 2) + i);
            }
        }

        private ParsableByteArray getSampleAndTrimBuffer(int i, int i2) {
            int i3 = this.bufferPosition - i2;
            ParsableByteArray parsableByteArray = new ParsableByteArray(Arrays.copyOfRange(this.buffer, i3 - i, i3));
            byte[] bArr = this.buffer;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.bufferPosition = i2;
            return parsableByteArray;
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void format(Format format) {
            this.format = format;
            this.delegate.format(this.delegateFormat);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i, boolean z, int i2) {
            ensureBufferCapacity(this.bufferPosition + i);
            int read = dataReader.read(this.buffer, this.bufferPosition, i);
            if (read != -1) {
                this.bufferPosition += read;
                return read;
            }
            if (z) {
                return -1;
            }
            zy.c();
            return 0;
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
            this.format.getClass();
            ParsableByteArray sampleAndTrimBuffer = getSampleAndTrimBuffer(i2, i3);
            if (!Objects.equals(this.format.sampleMimeType, this.delegateFormat.sampleMimeType)) {
                if (!MimeTypes.APPLICATION_EMSG.equals(this.format.sampleMimeType)) {
                    Log.w(HlsSampleStreamWrapper.TAG, "Ignoring sample for unsupported format: " + this.format.sampleMimeType);
                    return;
                }
                EventMessage decode = this.emsgDecoder.decode(sampleAndTrimBuffer);
                if (!emsgContainsExpectedWrappedFormat(decode)) {
                    Log.w(HlsSampleStreamWrapper.TAG, "Ignoring EMSG. Expected it to contain wrapped " + this.delegateFormat.sampleMimeType + " but actual wrapped format: " + decode.getWrappedMetadataFormat());
                    return;
                }
                byte[] wrappedMetadataBytes = decode.getWrappedMetadataBytes();
                wrappedMetadataBytes.getClass();
                sampleAndTrimBuffer = new ParsableByteArray(wrappedMetadataBytes);
            }
            int bytesLeft = sampleAndTrimBuffer.bytesLeft();
            this.delegate.sampleData(sampleAndTrimBuffer, bytesLeft);
            this.delegate.sampleMetadata(j, i, bytesLeft, 0, cryptoData);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final void sampleData(ParsableByteArray parsableByteArray, int i) {
            sampleData(parsableByteArray, i, 0);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final int sampleData(DataReader dataReader, int i, boolean z) {
            return sampleData(dataReader, i, z, 0);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final void durationUs(long j) {
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
            ensureBufferCapacity(this.bufferPosition + i);
            parsableByteArray.readBytes(this.buffer, this.bufferPosition, i);
            this.bufferPosition += i;
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }
}
