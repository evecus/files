package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.hls.HlsSampleStreamWrapper;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.gz4;
import defpackage.hf1;
import defpackage.sp0;
import defpackage.sv2;
import defpackage.x24;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class HlsMediaPeriod implements MediaPeriod, HlsPlaylistTracker.PlaylistEventListener {
    private final Allocator allocator;
    private final boolean allowChunklessPreparation;
    private int audioVideoSampleStreamWrapperCount;
    private final CmcdConfiguration cmcdConfiguration;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final HlsDataSourceFactory dataSourceFactory;
    private final gz4 downloadExecutorSupplier;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final HlsExtractorFactory extractorFactory;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private MediaPeriod.Callback mediaPeriodCallback;
    private final TransferListener mediaTransferListener;
    private final int metadataType;
    private int pendingPrepareCount;
    private final PlayerId playerId;
    private final HlsPlaylistTracker playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private TrackGroupArray trackGroups;
    private final boolean useSessionKeys;
    private final HlsSampleStreamWrapper.Callback sampleStreamWrapperCallback = new SampleStreamWrapperCallback();
    private final IdentityHashMap<SampleStream, Integer> streamWrapperIndices = new IdentityHashMap<>();
    private final TimestampAdjusterProvider timestampAdjusterProvider = new TimestampAdjusterProvider();
    private HlsSampleStreamWrapper[] sampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private HlsSampleStreamWrapper[] enabledSampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private long endPositionUs = Long.MIN_VALUE;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class SampleStreamWrapperCallback implements HlsSampleStreamWrapper.Callback {
        private SampleStreamWrapperCallback() {
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
            HlsMediaPeriod.this.mediaPeriodCallback.onContinueLoadingRequested(HlsMediaPeriod.this);
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPlaylistRefreshRequired(Uri uri) {
            HlsMediaPeriod.this.playlistTracker.refreshPlaylist(uri);
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPrepared() {
            if (HlsMediaPeriod.access$106(HlsMediaPeriod.this) > 0) {
                return;
            }
            int i = 0;
            for (HlsSampleStreamWrapper hlsSampleStreamWrapper : HlsMediaPeriod.this.sampleStreamWrappers) {
                i += hlsSampleStreamWrapper.getTrackGroups().length;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i];
            int i2 = 0;
            for (HlsSampleStreamWrapper hlsSampleStreamWrapper2 : HlsMediaPeriod.this.sampleStreamWrappers) {
                int i3 = hlsSampleStreamWrapper2.getTrackGroups().length;
                int i4 = 0;
                while (i4 < i3) {
                    trackGroupArr[i2] = hlsSampleStreamWrapper2.getTrackGroups().get(i4);
                    i4++;
                    i2++;
                }
            }
            HlsMediaPeriod.this.trackGroups = new TrackGroupArray(trackGroupArr);
            HlsMediaPeriod.this.mediaPeriodCallback.onPrepared(HlsMediaPeriod.this);
        }
    }

    public HlsMediaPeriod(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsDataSourceFactory hlsDataSourceFactory, TransferListener transferListener, CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean z, int i, boolean z2, PlayerId playerId, long j, gz4 gz4Var) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.mediaTransferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher2;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.allowChunklessPreparation = z;
        this.metadataType = i;
        this.useSessionKeys = z2;
        this.playerId = playerId;
        this.timestampAdjusterInitializationTimeoutMs = j;
        this.downloadExecutorSupplier = gz4Var;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
    }

    public static /* synthetic */ int access$106(HlsMediaPeriod hlsMediaPeriod) {
        int i = hlsMediaPeriod.pendingPrepareCount - 1;
        hlsMediaPeriod.pendingPrepareCount = i;
        return i;
    }

    private void buildAndPrepareAudioSampleStreamWrappers(long j, List<HlsRedundantGroup> list, List<HlsSampleStreamWrapper> list2, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).groupKey.name;
            str.getClass();
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (str.equals(list.get(i2).groupKey.name)) {
                        HlsRedundantGroup hlsRedundantGroup = list.get(i2);
                        Format format = hlsRedundantGroup.groupKey.format;
                        arrayList.add(hlsRedundantGroup);
                        arrayList2.add(format);
                        z &= Util.getCodecCountOfType(format.codecs, 1) == 1;
                    }
                }
                String concat = "audio:".concat(str);
                HlsSampleStreamWrapper buildSampleStreamWrapper = buildSampleStreamWrapper(concat, 1, (HlsRedundantGroup[]) arrayList.toArray((HlsRedundantGroup[]) Util.castNonNullTypeArray(new HlsRedundantGroup[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.EMPTY_LIST, map, j);
                list2.add(buildSampleStreamWrapper);
                if (this.allowChunklessPreparation && z) {
                    buildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new TrackGroup[]{new TrackGroup(concat, (Format[]) arrayList2.toArray(new Format[0])), new TrackGroup(concat.concat(":id3"), new Format.Builder().setId("ID3").setSampleMimeType(MimeTypes.APPLICATION_ID3).setPrimaryTrackGroupId(concat).build())}, 0, 1);
                }
            }
        }
    }

    private void buildAndPrepareMainSampleStreamWrapper(List<HlsRedundantGroup> list, List<HlsRedundantGroup> list2, Format format, List<Format> list3, long j, List<HlsSampleStreamWrapper> list4, Map<String, DrmInitData> map) {
        int i;
        boolean z;
        boolean z2;
        int size = list.size();
        int[] iArr = new int[size];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Format format2 = list.get(i4).groupKey.format;
            if (format2.height > 0 || Util.getCodecsOfType(format2.codecs, 2) != null) {
                iArr[i4] = 2;
                i2++;
            } else if (Util.getCodecsOfType(format2.codecs, 1) != null) {
                iArr[i4] = 1;
                i3++;
            } else {
                iArr[i4] = -1;
            }
        }
        if (i2 > 0) {
            i = i2;
            z2 = false;
            z = true;
        } else if (i3 < size) {
            i = size - i3;
            z = false;
            z2 = true;
        } else {
            i = size;
            z = false;
            z2 = false;
        }
        HlsRedundantGroup[] hlsRedundantGroupArr = new HlsRedundantGroup[i];
        boolean z3 = z2;
        Format[] formatArr = new Format[i];
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            if ((!z || iArr[i6] == 2) && (!z3 || iArr[i6] != 1)) {
                HlsRedundantGroup hlsRedundantGroup = list.get(i6);
                hlsRedundantGroupArr[i5] = hlsRedundantGroup;
                formatArr[i5] = hlsRedundantGroup.groupKey.format;
                i5++;
            }
        }
        String str = formatArr[0].codecs;
        int codecCountOfType = Util.getCodecCountOfType(str, 2);
        int codecCountOfType2 = Util.getCodecCountOfType(str, 1);
        boolean z4 = (codecCountOfType2 == 1 || (codecCountOfType2 == 0 && list2.isEmpty())) && codecCountOfType <= 1 && codecCountOfType2 + codecCountOfType > 0;
        HlsSampleStreamWrapper buildSampleStreamWrapper = buildSampleStreamWrapper("main", (z || codecCountOfType2 <= 0) ? 0 : 1, hlsRedundantGroupArr, formatArr, format, list3, map, j);
        list4.add(buildSampleStreamWrapper);
        if (this.allowChunklessPreparation && z4) {
            ArrayList arrayList = new ArrayList();
            if (codecCountOfType > 0) {
                Format[] formatArr2 = new Format[i];
                for (int i7 = 0; i7 < i; i7++) {
                    formatArr2[i7] = deriveVideoFormat(formatArr[i7]);
                }
                arrayList.add(new TrackGroup("main", formatArr2));
                if (codecCountOfType2 > 0 && (format != null || list2.isEmpty())) {
                    arrayList.add(new TrackGroup("main:audio", deriveAudioFormat(formatArr[0], format, false).buildUpon().setPrimaryTrackGroupId("main").build()));
                }
                if (list3 != null) {
                    for (int i8 = 0; i8 < list3.size(); i8++) {
                        arrayList.add(new TrackGroup(hf1.u(i8, "main:cc:"), this.extractorFactory.getOutputTextFormat(list3.get(i8)).buildUpon().setPrimaryTrackGroupId("main").build()));
                    }
                }
            } else {
                Format[] formatArr3 = new Format[i];
                for (int i9 = 0; i9 < i; i9++) {
                    formatArr3[i9] = deriveAudioFormat(formatArr[i9], format, true);
                }
                arrayList.add(new TrackGroup("main", formatArr3));
            }
            TrackGroup trackGroup = new TrackGroup("main:id3", new Format.Builder().setId("ID3").setSampleMimeType(MimeTypes.APPLICATION_ID3).setPrimaryTrackGroupId("main").build());
            arrayList.add(trackGroup);
            buildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo((TrackGroup[]) arrayList.toArray(new TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
        }
    }

    private void buildAndPrepareSampleStreamWrappers(long j) {
        HlsMediaPeriod hlsMediaPeriod;
        List<HlsRedundantGroup> list;
        long j2;
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr;
        HlsMultivariantPlaylist multivariantPlaylist = this.playlistTracker.getMultivariantPlaylist();
        multivariantPlaylist.getClass();
        Map<String, DrmInitData> deriveOverridingDrmInitData = this.useSessionKeys ? deriveOverridingDrmInitData(multivariantPlaylist.sessionKeyDrmInitData) : Collections.EMPTY_MAP;
        List<HlsRedundantGroup> redundantGroups = this.playlistTracker.getRedundantGroups(0);
        redundantGroups.getClass();
        List<HlsRedundantGroup> redundantGroups2 = this.playlistTracker.getRedundantGroups(2);
        redundantGroups2.getClass();
        List<HlsRedundantGroup> redundantGroups3 = this.playlistTracker.getRedundantGroups(3);
        redundantGroups3.getClass();
        boolean isEmpty = redundantGroups.isEmpty();
        this.pendingPrepareCount = 0;
        ArrayList arrayList = new ArrayList();
        if (isEmpty) {
            hlsMediaPeriod = this;
            list = redundantGroups2;
            j2 = j;
        } else {
            hlsMediaPeriod = this;
            hlsMediaPeriod.buildAndPrepareMainSampleStreamWrapper(redundantGroups, redundantGroups2, multivariantPlaylist.muxedAudioFormat, multivariantPlaylist.muxedCaptionFormats, j, arrayList, deriveOverridingDrmInitData);
            list = redundantGroups2;
            j2 = j;
            arrayList = arrayList;
            deriveOverridingDrmInitData = deriveOverridingDrmInitData;
        }
        hlsMediaPeriod.buildAndPrepareAudioSampleStreamWrappers(j2, list, arrayList, deriveOverridingDrmInitData);
        hlsMediaPeriod.audioVideoSampleStreamWrapperCount = arrayList.size();
        hlsMediaPeriod.buildAndPrepareSubtitleSampleStreamWrappers(j2, redundantGroups3, arrayList, deriveOverridingDrmInitData);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = (HlsSampleStreamWrapper[]) arrayList.toArray(new HlsSampleStreamWrapper[0]);
        hlsMediaPeriod.sampleStreamWrappers = hlsSampleStreamWrapperArr2;
        hlsMediaPeriod.pendingPrepareCount = hlsSampleStreamWrapperArr2.length;
        int i = 0;
        while (true) {
            int i2 = hlsMediaPeriod.audioVideoSampleStreamWrapperCount;
            hlsSampleStreamWrapperArr = hlsMediaPeriod.sampleStreamWrappers;
            if (i >= i2) {
                break;
            }
            hlsSampleStreamWrapperArr[i].setIsPrimaryTimestampSource(true);
            i++;
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : hlsSampleStreamWrapperArr) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        hlsMediaPeriod.enabledSampleStreamWrappers = hlsMediaPeriod.sampleStreamWrappers;
    }

    private void buildAndPrepareSubtitleSampleStreamWrappers(long j, List<HlsRedundantGroup> list, List<HlsSampleStreamWrapper> list2, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).groupKey.name;
            str.getClass();
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (str.equals(list.get(i2).groupKey.name)) {
                        HlsRedundantGroup hlsRedundantGroup = list.get(i2);
                        arrayList.add(hlsRedundantGroup);
                        arrayList2.add(hlsRedundantGroup.groupKey.format);
                    }
                }
                String concat = "subtitle:".concat(str);
                Format[] formatArr = (Format[]) arrayList2.toArray(new Format[0]);
                HlsRedundantGroup[] hlsRedundantGroupArr = (HlsRedundantGroup[]) arrayList.toArray((HlsRedundantGroup[]) Util.castNonNullTypeArray(new HlsRedundantGroup[0]));
                ay1 ay1Var = dy1.J;
                HlsSampleStreamWrapper buildSampleStreamWrapper = buildSampleStreamWrapper(concat, 3, hlsRedundantGroupArr, formatArr, null, x24.M, map, j);
                list2.add(buildSampleStreamWrapper);
                int length = formatArr.length;
                Format[] formatArr2 = new Format[length];
                for (int i3 = 0; i3 < length; i3++) {
                    formatArr2[i3] = this.extractorFactory.getOutputTextFormat(formatArr[i3]);
                }
                buildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new TrackGroup[]{new TrackGroup(concat, formatArr2)}, 0, new int[0]);
            }
        }
    }

    private HlsSampleStreamWrapper buildSampleStreamWrapper(String str, int i, HlsRedundantGroup[] hlsRedundantGroupArr, Format[] formatArr, Format format, List<Format> list, Map<String, DrmInitData> map, long j) {
        HlsChunkSource hlsChunkSource = new HlsChunkSource(this.extractorFactory, this.playlistTracker, hlsRedundantGroupArr, formatArr, this.dataSourceFactory, this.mediaTransferListener, this.timestampAdjusterProvider, this.timestampAdjusterInitializationTimeoutMs, list, this.playerId, this.cmcdConfiguration);
        HlsSampleStreamWrapper.Callback callback = this.sampleStreamWrapperCallback;
        Allocator allocator = this.allocator;
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        DrmSessionEventListener.EventDispatcher eventDispatcher = this.drmEventDispatcher;
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
        MediaSourceEventListener.EventDispatcher eventDispatcher2 = this.eventDispatcher;
        int i2 = this.metadataType;
        gz4 gz4Var = this.downloadExecutorSupplier;
        HlsSampleStreamWrapper hlsSampleStreamWrapper = new HlsSampleStreamWrapper(str, i, callback, hlsChunkSource, map, allocator, j, format, drmSessionManager, eventDispatcher, loadErrorHandlingPolicy, eventDispatcher2, i2, gz4Var != null ? (ReleasableExecutor) gz4Var.get() : null);
        hlsSampleStreamWrapper.setEndPositionUs(this.endPositionUs);
        return hlsSampleStreamWrapper;
    }

    private static Format deriveAudioFormat(Format format, Format format2, boolean z) {
        Metadata metadata;
        int i;
        String str;
        String str2;
        List<Label> list;
        int i2;
        int i3;
        String str3;
        ay1 ay1Var = dy1.J;
        x24 x24Var = x24.M;
        if (format2 != null) {
            str2 = format2.codecs;
            metadata = format2.metadata;
            i2 = format2.channelCount;
            i = format2.selectionFlags;
            i3 = format2.roleFlags;
            str = format2.language;
            str3 = format2.label;
            list = format2.labels;
        } else {
            String codecsOfType = Util.getCodecsOfType(format.codecs, 1);
            metadata = format.metadata;
            if (z) {
                i2 = format.channelCount;
                i = format.selectionFlags;
                i3 = format.roleFlags;
                str = format.language;
                str3 = format.label;
                str2 = codecsOfType;
                list = format.labels;
            } else {
                i = 0;
                str = null;
                str2 = codecsOfType;
                list = x24Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        return new Format.Builder().setId(format.id).setLabel(str3).setLabels(list).setContainerMimeType(format.containerMimeType).setSampleMimeType(MimeTypes.getMediaMimeType(str2)).setCodecs(str2).setMetadata(metadata).setAverageBitrate(z ? format.averageBitrate : -1).setPeakBitrate(z ? format.peakBitrate : -1).setChannelCount(i2).setSelectionFlags(i).setRoleFlags(i3).setLanguage(str).build();
    }

    private static Map<String, DrmInitData> deriveOverridingDrmInitData(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            DrmInitData drmInitData = list.get(i);
            String str = drmInitData.schemeType;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                DrmInitData drmInitData2 = (DrmInitData) arrayList.get(i2);
                if (TextUtils.equals(drmInitData2.schemeType, str)) {
                    drmInitData = drmInitData.merge(drmInitData2);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            hashMap.put(str, drmInitData);
        }
        return hashMap;
    }

    private static Format deriveVideoFormat(Format format) {
        String codecsOfType = Util.getCodecsOfType(format.codecs, 2);
        return new Format.Builder().setId(format.id).setLabel(format.label).setLabels(format.labels).setContainerMimeType(format.containerMimeType).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType)).setCodecs(codecsOfType).setMetadata(format.metadata).setAverageBitrate(format.averageBitrate).setPeakBitrate(format.peakBitrate).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).setColorInfo(format.colorInfo).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectTracks$0(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        return hlsSampleStreamWrapper.getTrackGroups().getTrackTypes();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.trackGroups != null) {
            return this.compositeSequenceableLoader.continueLoading(loadingInfo);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            hlsSampleStreamWrapper.discardBuffer(j, z);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            if (hlsSampleStreamWrapper.isVideoSampleStream()) {
                return hlsSampleStreamWrapper.getAdjustedSeekPositionUs(j, seekParameters);
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [int] */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        HlsSampleStreamWrapper hlsSampleStreamWrapper;
        TrackGroupArray trackGroupArray;
        HlsMultivariantPlaylist multivariantPlaylist = this.playlistTracker.getMultivariantPlaylist();
        multivariantPlaylist.getClass();
        boolean isEmpty = multivariantPlaylist.variants.isEmpty();
        boolean z = !isEmpty;
        int i = 0;
        if (isEmpty) {
            hlsSampleStreamWrapper = null;
            trackGroupArray = null;
        } else {
            hlsSampleStreamWrapper = this.sampleStreamWrappers[0];
            trackGroupArray = hlsSampleStreamWrapper.getTrackGroups();
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        for (ExoTrackSelection exoTrackSelection : list) {
            TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
            int indexOf = trackGroupArray != null ? trackGroupArray.indexOf(trackGroup) : -1;
            if (indexOf == -1) {
                ?? r14 = z;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.sampleStreamWrappers;
                    if (r14 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    HlsSampleStreamWrapper hlsSampleStreamWrapper2 = hlsSampleStreamWrapperArr[r14];
                    TrackGroupArray trackGroups = hlsSampleStreamWrapper2.getTrackGroups();
                    int indexOf2 = trackGroups.indexOf(trackGroup);
                    if (indexOf2 == -1) {
                        r14++;
                    } else if (indexOf2 == hlsSampleStreamWrapper2.getPrimaryTrackGroupIndex()) {
                        int i2 = trackGroups.get(indexOf2).type == 1 ? 1 : 2;
                        dy1 redundantGroups = hlsSampleStreamWrapper2.getRedundantGroups();
                        for (int i3 = 0; i3 < exoTrackSelection.length(); i3++) {
                            ay1 listIterator = ((HlsRedundantGroup) redundantGroups.get(exoTrackSelection.getIndexInTrackGroup(i3))).getIndicesInMultivariantPlaylist().listIterator(0);
                            while (listIterator.hasNext()) {
                                arrayList.add(new StreamKey(i2, ((Integer) listIterator.next()).intValue()));
                            }
                        }
                    }
                }
            } else if (indexOf == hlsSampleStreamWrapper.getPrimaryTrackGroupIndex()) {
                dy1 redundantGroups2 = hlsSampleStreamWrapper.getRedundantGroups();
                for (int i4 = i; i4 < exoTrackSelection.length(); i4++) {
                    ay1 listIterator2 = ((HlsRedundantGroup) redundantGroups2.get(exoTrackSelection.getIndexInTrackGroup(i4))).getIndicesInMultivariantPlaylist().listIterator(i);
                    while (listIterator2.hasNext()) {
                        arrayList.add(new StreamKey(i, ((Integer) listIterator2.next()).intValue()));
                    }
                }
                z3 = true;
            } else {
                z2 = true;
            }
            i = 0;
        }
        if (!isEmpty && z2 && !z3) {
            dy1 redundantGroups3 = hlsSampleStreamWrapper.getRedundantGroups();
            int i5 = ((HlsRedundantGroup) redundantGroups3.get(0)).groupKey.format.bitrate;
            int i6 = 0;
            for (int i7 = 1; i7 < redundantGroups3.size(); i7++) {
                int i8 = ((HlsRedundantGroup) redundantGroups3.get(i7)).groupKey.format.bitrate;
                if (i8 < i5) {
                    i5 = i8;
                    i6 = i7;
                }
            }
            ay1 listIterator3 = ((HlsRedundantGroup) redundantGroups3.get(i6)).getIndicesInMultivariantPlaylist().listIterator(0);
            while (listIterator3.hasNext()) {
                arrayList.add(new StreamKey(0, ((Integer) listIterator3.next()).intValue()));
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        TrackGroupArray trackGroupArray = this.trackGroups;
        trackGroupArray.getClass();
        return trackGroupArray;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public void onPlaylistChanged() {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.onPlaylistUpdated();
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
        boolean z2 = false;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            z2 |= hlsSampleStreamWrapper.onPlaylistError(uri, loadErrorInfo, z);
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
        return z2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.mediaPeriodCallback = callback;
        this.playlistTracker.addListener(this);
        buildAndPrepareSampleStreamWrappers(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    public void release() {
        this.playlistTracker.removeListener(this);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.release();
        }
        this.mediaPeriodCallback = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.enabledSampleStreamWrappers;
        if (hlsSampleStreamWrapperArr.length > 0) {
            boolean seekToUs = hlsSampleStreamWrapperArr[0].seekToUs(j, false);
            int i = 1;
            while (true) {
                HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.enabledSampleStreamWrappers;
                if (i >= hlsSampleStreamWrapperArr2.length) {
                    break;
                }
                hlsSampleStreamWrapperArr2[i].seekToUs(j, seekToUs);
                i++;
            }
            if (seekToUs) {
                this.timestampAdjusterProvider.reset();
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            SampleStream sampleStream = sampleStreamArr[i];
            iArr[i] = sampleStream == null ? -1 : this.streamWrapperIndices.get(sampleStream).intValue();
            iArr2[i] = -1;
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
            if (exoTrackSelection != null) {
                TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                int i2 = 0;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.sampleStreamWrappers;
                    if (i2 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[i2].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.streamWrapperIndices.clear();
        int length = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = new HlsSampleStreamWrapper[this.sampleStreamWrappers.length];
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i3 < this.sampleStreamWrappers.length) {
            for (int i5 = 0; i5 < exoTrackSelectionArr.length; i5++) {
                ExoTrackSelection exoTrackSelection2 = null;
                sampleStreamArr3[i5] = iArr[i5] == i3 ? sampleStreamArr[i5] : null;
                if (iArr2[i5] == i3) {
                    exoTrackSelection2 = exoTrackSelectionArr[i5];
                }
                exoTrackSelectionArr2[i5] = exoTrackSelection2;
            }
            HlsSampleStreamWrapper hlsSampleStreamWrapper = this.sampleStreamWrappers[i3];
            int[] iArr3 = iArr;
            int i6 = i3;
            int i7 = i4;
            boolean selectTracks = hlsSampleStreamWrapper.selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j, z);
            boolean z2 = false;
            for (int i8 = 0; i8 < exoTrackSelectionArr.length; i8++) {
                SampleStream sampleStream2 = sampleStreamArr3[i8];
                if (iArr2[i8] == i6) {
                    sampleStream2.getClass();
                    sampleStreamArr2[i8] = sampleStream2;
                    this.streamWrapperIndices.put(sampleStream2, Integer.valueOf(i6));
                    z2 = true;
                } else if (iArr3[i8] == i6) {
                    sp0.z(sampleStream2 == null);
                }
            }
            if (z2) {
                hlsSampleStreamWrapperArr2[i7] = hlsSampleStreamWrapper;
                i4 = i7 + 1;
                if (i7 == 0) {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(true);
                    if (!selectTracks) {
                        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr3 = this.enabledSampleStreamWrappers;
                        if (hlsSampleStreamWrapperArr3.length != 0 && hlsSampleStreamWrapper == hlsSampleStreamWrapperArr3[0]) {
                        }
                    }
                    this.timestampAdjusterProvider.reset();
                    z = true;
                } else {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(i6 < this.audioVideoSampleStreamWrapperCount);
                }
            } else {
                i4 = i7;
            }
            i3 = i6 + 1;
            iArr = iArr3;
        }
        System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, length);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr4 = (HlsSampleStreamWrapper[]) Util.nullSafeArrayCopy(hlsSampleStreamWrapperArr2, i4);
        this.enabledSampleStreamWrappers = hlsSampleStreamWrapperArr4;
        x24 q = dy1.q(hlsSampleStreamWrapperArr4);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(q, sv2.a0(q, new l()));
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long setEndPositionUs(long j) {
        this.endPositionUs = j;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.setEndPositionUs(j);
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void setUsesStreamPrerollFlags() {
    }
}
