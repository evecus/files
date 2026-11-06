package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup;
import androidx.media3.exoplayer.source.chunk.BaseMediaChunkIterator;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.DataChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.contentsteering.ContentSteeringTracker;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.ee5;
import defpackage.s83;
import defpackage.sp0;
import defpackage.x24;
import defpackage.zl1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
class HlsChunkSource {
    public static final int CHUNK_PUBLICATION_STATE_PRELOAD = 0;
    public static final int CHUNK_PUBLICATION_STATE_PUBLISHED = 1;
    public static final int CHUNK_PUBLICATION_STATE_REMOVED = 2;
    private static final int KEY_CACHE_SIZE = 4;
    private final CmcdConfiguration cmcdConfiguration;
    private final ContentSteeringTracker contentSteeringTracker;
    private final DataSource encryptionDataSource;
    private final HlsExtractorFactory extractorFactory;
    private IOException fatalError;
    private boolean independentSegments;
    private boolean isPrimaryTimestampSource;
    private Uri lastPlaylistErrorUrl;
    private final DataSource mediaDataSource;
    private final List<Format> muxedCaptionFormats;
    private Uri nextChunkStuckOnPlaylistUrl;
    private final PlayerId playerId;
    private final HlsPlaylistTracker playlistTracker;
    private final Format[] redundantGroupFormats;
    private final HlsRedundantGroup[] redundantGroups;
    private final long timestampAdjusterInitializationTimeoutMs;
    private final TimestampAdjusterProvider timestampAdjusterProvider;
    private final TrackGroup trackGroup;
    private ExoTrackSelection trackSelection;
    private long lastChunkRequestRealtimeMs = C.TIME_UNSET;
    private final FullSegmentEncryptionKeyCache keyCache = new FullSegmentEncryptionKeyCache(4);
    private byte[] scratchSpace = Util.EMPTY_BYTE_ARRAY;
    private long liveEdgeInPeriodTimeUs = C.TIME_UNSET;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class EncryptionKeyChunk extends DataChunk {
        private byte[] result;

        public EncryptionKeyChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, byte[] bArr) {
            super(dataSource, dataSpec, 3, format, i, obj, bArr);
        }

        @Override // androidx.media3.exoplayer.source.chunk.DataChunk
        public void consume(byte[] bArr, int i) {
            this.result = Arrays.copyOf(bArr, i);
        }

        public byte[] getResult() {
            return this.result;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class HlsChunkHolder {
        public Chunk chunk;
        public boolean endOfStream;
        public Uri playlistUrl;

        public HlsChunkHolder() {
            clear();
        }

        public void clear() {
            this.chunk = null;
            this.endOfStream = false;
            this.playlistUrl = null;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class HlsMediaPlaylistSegmentIterator extends BaseMediaChunkIterator {
        private final String playlistBaseUri;
        private final List<HlsMediaPlaylist.SegmentBase> segmentBases;
        private final long startOfPlaylistInPeriodUs;

        public HlsMediaPlaylistSegmentIterator(String str, long j, List<HlsMediaPlaylist.SegmentBase> list) {
            super(0L, list.size() - 1);
            this.playlistBaseUri = str;
            this.startOfPlaylistInPeriodUs = j;
            this.segmentBases = list;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return this.startOfPlaylistInPeriodUs + segmentBase.relativeStartTimeUs + segmentBase.durationUs;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.startOfPlaylistInPeriodUs + this.segmentBases.get((int) getCurrentIndex()).relativeStartTimeUs;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return new DataSpec(UriUtil.resolveToUri(this.playlistBaseUri, segmentBase.url), segmentBase.byteRangeOffset, segmentBase.byteRangeLength);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class InitializationTrackSelection extends BaseTrackSelection {
        private int selectedIndex;

        public InitializationTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.selectedIndex = indexOf(trackGroup.getFormat(iArr[0]));
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.selectedIndex;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public Object getSelectionData() {
            return null;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (isTrackExcluded(this.selectedIndex, elapsedRealtime)) {
                for (int i = this.length - 1; i >= 0; i--) {
                    if (!isTrackExcluded(i, elapsedRealtime)) {
                        this.selectedIndex = i;
                        return;
                    }
                }
                s83.r();
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SegmentBaseHolder {
        public final boolean isPreload;
        public final long mediaSequence;
        public final int partIndex;
        public final HlsMediaPlaylist.SegmentBase segmentBase;

        public SegmentBaseHolder(HlsMediaPlaylist.SegmentBase segmentBase, long j, int i) {
            this.segmentBase = segmentBase;
            this.mediaSequence = j;
            this.partIndex = i;
            this.isPreload = (segmentBase instanceof HlsMediaPlaylist.Part) && ((HlsMediaPlaylist.Part) segmentBase).isPreload;
        }
    }

    public HlsChunkSource(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsRedundantGroup[] hlsRedundantGroupArr, Format[] formatArr, HlsDataSourceFactory hlsDataSourceFactory, TransferListener transferListener, TimestampAdjusterProvider timestampAdjusterProvider, long j, List<Format> list, PlayerId playerId, CmcdConfiguration cmcdConfiguration) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.contentSteeringTracker = hlsPlaylistTracker.getContentSteeringTracker();
        this.redundantGroups = hlsRedundantGroupArr;
        this.redundantGroupFormats = formatArr;
        this.timestampAdjusterProvider = timestampAdjusterProvider;
        this.timestampAdjusterInitializationTimeoutMs = j;
        this.muxedCaptionFormats = list;
        this.playerId = playerId;
        this.cmcdConfiguration = cmcdConfiguration;
        DataSource createDataSource = hlsDataSourceFactory.createDataSource(1);
        this.mediaDataSource = createDataSource;
        if (transferListener != null) {
            createDataSource.addTransferListener(transferListener);
        }
        this.encryptionDataSource = hlsDataSourceFactory.createDataSource(3);
        this.trackGroup = new TrackGroup(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < hlsRedundantGroupArr.length; i++) {
            if ((formatArr[i].roleFlags & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.trackSelection = new InitializationTrackSelection(this.trackGroup, sp0.j0(arrayList));
    }

    private void deactivatePlaylistForSelectedTrack() {
        this.playlistTracker.deactivatePlaylistForPlayback(this.redundantGroups[this.trackSelection.getSelectedIndexInTrackGroup()].getCurrentPlaylistUrl());
    }

    private int getExcludedTrackCount(long j, boolean z) {
        ExoTrackSelection trackSelection = getTrackSelection();
        int length = trackSelection.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int indexInTrackGroup = trackSelection.getIndexInTrackGroup(i2);
            if (z) {
                if (!trackSelection.isTrackExcluded(i2, j) && !this.playlistTracker.isExcluded(this.redundantGroups[indexInTrackGroup].getCurrentPlaylistUrl(), j)) {
                }
                i++;
            } else {
                if (!trackSelection.isTrackExcluded(i2, j) && !this.playlistTracker.isExcluded(this.redundantGroups[indexInTrackGroup], j)) {
                }
                i++;
            }
        }
        return i;
    }

    private static Uri getFullEncryptionKeyUri(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist.SegmentBase segmentBase) {
        String str;
        if (segmentBase == null || (str = segmentBase.fullSegmentEncryptionKeyUri) == null) {
            return null;
        }
        return UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, str);
    }

    private Pair<Long, Integer> getNextMediaSequenceAndPartIndex(HlsMediaChunk hlsMediaChunk, boolean z, HlsMediaPlaylist hlsMediaPlaylist, long j, long j2) {
        List<HlsMediaPlaylist.Part> list;
        if (hlsMediaChunk != null && !z) {
            if (!hlsMediaChunk.isLoadCompleted()) {
                return new Pair<>(Long.valueOf(hlsMediaChunk.chunkIndex), Integer.valueOf(hlsMediaChunk.partIndex));
            }
            Long valueOf = Long.valueOf(hlsMediaChunk.partIndex == -1 ? hlsMediaChunk.getNextChunkIndex() : hlsMediaChunk.chunkIndex);
            int i = hlsMediaChunk.partIndex;
            return new Pair<>(valueOf, Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j3 = hlsMediaPlaylist.durationUs + j;
        if (hlsMediaChunk != null && !this.independentSegments) {
            j2 = hlsMediaChunk.startTimeUs;
        }
        if (!hlsMediaPlaylist.hasEndTag && j2 >= j3) {
            return new Pair<>(Long.valueOf(hlsMediaPlaylist.mediaSequence + hlsMediaPlaylist.segments.size()), -1);
        }
        long j4 = j2 - j;
        int i2 = 0;
        int binarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) hlsMediaPlaylist.segments, Long.valueOf(j4), true, !this.playlistTracker.isLive() || hlsMediaChunk == null);
        long j5 = binarySearchFloor + hlsMediaPlaylist.mediaSequence;
        if (!this.playlistTracker.isLive()) {
            return new Pair<>(Long.valueOf(j5), -1);
        }
        if (binarySearchFloor >= 0) {
            if (hlsMediaPlaylist.segments.isEmpty()) {
                list = hlsMediaPlaylist.trailingParts;
            } else {
                HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(binarySearchFloor);
                list = j4 < segment.relativeStartTimeUs + segment.durationUs ? segment.parts : hlsMediaPlaylist.trailingParts;
            }
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                HlsMediaPlaylist.Part part = list.get(i2);
                if (j4 >= part.relativeStartTimeUs + part.durationUs) {
                    i2++;
                } else if (part.isIndependent) {
                    j5 += (list != hlsMediaPlaylist.trailingParts || hlsMediaPlaylist.segments.isEmpty()) ? 0L : 1L;
                    r0 = i2;
                }
            }
        }
        return new Pair<>(Long.valueOf(j5), Integer.valueOf(r0));
    }

    private static SegmentBaseHolder getNextSegmentHolder(HlsMediaPlaylist hlsMediaPlaylist, long j, int i) {
        int i2 = (int) (j - hlsMediaPlaylist.mediaSequence);
        if (i2 == hlsMediaPlaylist.segments.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < hlsMediaPlaylist.trailingParts.size()) {
                return new SegmentBaseHolder(hlsMediaPlaylist.trailingParts.get(i), j, i);
            }
            return null;
        }
        HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i2);
        if (i == -1) {
            return new SegmentBaseHolder(segment, j, -1);
        }
        if (i < segment.parts.size()) {
            return new SegmentBaseHolder(segment.parts.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < hlsMediaPlaylist.segments.size()) {
            return new SegmentBaseHolder(hlsMediaPlaylist.segments.get(i3), j + 1, -1);
        }
        if (hlsMediaPlaylist.trailingParts.isEmpty()) {
            return null;
        }
        return new SegmentBaseHolder(hlsMediaPlaylist.trailingParts.get(0), j + 1, 0);
    }

    public static List<HlsMediaPlaylist.SegmentBase> getSegmentBaseList(HlsMediaPlaylist hlsMediaPlaylist, long j, int i) {
        int i2 = (int) (j - hlsMediaPlaylist.mediaSequence);
        if (i2 < 0 || hlsMediaPlaylist.segments.size() < i2) {
            ay1 ay1Var = dy1.J;
            return x24.M;
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < hlsMediaPlaylist.segments.size()) {
            if (i != -1) {
                HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i2);
                if (i == 0) {
                    arrayList.add(segment);
                } else if (i < segment.parts.size()) {
                    List<HlsMediaPlaylist.Part> list = segment.parts;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i2++;
            }
            List<HlsMediaPlaylist.Segment> list2 = hlsMediaPlaylist.segments;
            arrayList.addAll(list2.subList(i2, list2.size()));
            i = 0;
        }
        if (hlsMediaPlaylist.partTargetDurationUs != C.TIME_UNSET) {
            int i3 = i != -1 ? i : 0;
            if (i3 < hlsMediaPlaylist.trailingParts.size()) {
                List<HlsMediaPlaylist.Part> list3 = hlsMediaPlaylist.trailingParts;
                arrayList.addAll(list3.subList(i3, list3.size()));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static boolean isIndependent(SegmentBaseHolder segmentBaseHolder, HlsMediaPlaylist hlsMediaPlaylist) {
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        if (!(segmentBase instanceof HlsMediaPlaylist.Part)) {
            return hlsMediaPlaylist.hasIndependentSegments;
        }
        if (((HlsMediaPlaylist.Part) segmentBase).isIndependent) {
            return true;
        }
        return segmentBaseHolder.partIndex == 0 && hlsMediaPlaylist.hasIndependentSegments;
    }

    private Chunk maybeCreateEncryptionChunkFor(Uri uri, int i, boolean z, CmcdData.Factory factory) {
        if (uri == null) {
            return null;
        }
        byte[] remove = this.keyCache.remove(uri);
        if (remove != null) {
            this.keyCache.put(uri, remove);
            return null;
        }
        DataSpec build = new DataSpec.Builder().setUri(uri).setFlags(1).build();
        if (factory != null) {
            if (z) {
                factory.setObjectType(CmcdData.OBJECT_TYPE_INIT_SEGMENT);
            }
            build = factory.createCmcdData().addToDataSpec(build);
        }
        return new EncryptionKeyChunk(this.encryptionDataSource, build, this.redundantGroupFormats[i], this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.scratchSpace);
    }

    private long resolveTimeToLiveEdgeUs(long j) {
        long j2 = this.liveEdgeInPeriodTimeUs;
        return j2 != C.TIME_UNSET ? j2 - j : C.TIME_UNSET;
    }

    private static boolean shouldForceKeepCurrentTrackSelection(boolean z, boolean z2, HlsMediaPlaylist hlsMediaPlaylist, long j, int i, HlsMediaChunk hlsMediaChunk, long j2, long j3) {
        if (!z || z2 || hlsMediaChunk == null) {
            return false;
        }
        if (j < hlsMediaPlaylist.mediaSequence) {
            return true;
        }
        SegmentBaseHolder nextSegmentHolder = getNextSegmentHolder(hlsMediaPlaylist, j, i);
        return nextSegmentHolder != null && j2 + nextSegmentHolder.segmentBase.relativeStartTimeUs < j3;
    }

    private void updateLiveEdgeTimeUs(HlsMediaPlaylist hlsMediaPlaylist) {
        this.liveEdgeInPeriodTimeUs = hlsMediaPlaylist.hasEndTag ? C.TIME_UNSET : hlsMediaPlaylist.getEndTimeUs() - this.playlistTracker.getInitialStartTimeUs();
    }

    public LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(Uri uri) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HlsRedundantGroup redundantGroup = this.playlistTracker.getRedundantGroup(uri);
        redundantGroup.getClass();
        int size = redundantGroup.size();
        ee5 it = redundantGroup.getAllPlaylistUrls().iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            if (this.playlistTracker.isExcluded((Uri) it.next(), elapsedRealtime)) {
                i++;
            }
        }
        int length = getTrackSelection().length();
        ContentSteeringTracker contentSteeringTracker = this.contentSteeringTracker;
        if (contentSteeringTracker != null && contentSteeringTracker.isActive()) {
            z = true;
        }
        boolean z2 = z;
        return new LoadErrorHandlingPolicy.FallbackOptions(size, i, length, getExcludedTrackCount(elapsedRealtime, z2), z2);
    }

    public MediaChunkIterator[] createMediaChunkIterators(HlsMediaChunk hlsMediaChunk, long j) {
        int indexOf = hlsMediaChunk == null ? -1 : this.trackGroup.indexOf(hlsMediaChunk.trackFormat);
        int length = this.trackSelection.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        for (int i = 0; i < length; i++) {
            int indexInTrackGroup = this.trackSelection.getIndexInTrackGroup(i);
            Uri currentPlaylistUrl = this.redundantGroups[indexInTrackGroup].getCurrentPlaylistUrl();
            if (this.playlistTracker.isSnapshotValid(currentPlaylistUrl)) {
                HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(currentPlaylistUrl, false);
                playlistSnapshot.getClass();
                long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
                Pair<Long, Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(hlsMediaChunk, indexInTrackGroup != indexOf, playlistSnapshot, initialStartTimeUs, j);
                mediaChunkIteratorArr[i] = new HlsMediaPlaylistSegmentIterator(playlistSnapshot.baseUri, initialStartTimeUs, getSegmentBaseList(playlistSnapshot, ((Long) nextMediaSequenceAndPartIndex.first).longValue(), ((Integer) nextMediaSequenceAndPartIndex.second).intValue()));
            } else {
                mediaChunkIteratorArr[i] = MediaChunkIterator.EMPTY;
            }
        }
        return mediaChunkIteratorArr;
    }

    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        int selectedIndex = this.trackSelection.getSelectedIndex();
        HlsRedundantGroup[] hlsRedundantGroupArr = this.redundantGroups;
        HlsMediaPlaylist playlistSnapshot = (selectedIndex >= hlsRedundantGroupArr.length || selectedIndex == -1) ? null : this.playlistTracker.getPlaylistSnapshot(hlsRedundantGroupArr[this.trackSelection.getSelectedIndexInTrackGroup()].getCurrentPlaylistUrl(), true);
        if (playlistSnapshot == null || playlistSnapshot.segments.isEmpty()) {
            return j;
        }
        long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        long j2 = j - initialStartTimeUs;
        int binarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) playlistSnapshot.segments, Long.valueOf(j2), true, true);
        long j3 = playlistSnapshot.segments.get(binarySearchFloor).relativeStartTimeUs;
        return seekParameters.resolveSeekPositionUs(j2, j3, (!playlistSnapshot.hasIndependentSegments || binarySearchFloor == playlistSnapshot.segments.size() - 1) ? j3 : playlistSnapshot.segments.get(binarySearchFloor + 1).relativeStartTimeUs) + initialStartTimeUs;
    }

    public int getChunkPublicationState(HlsMediaChunk hlsMediaChunk) {
        if (hlsMediaChunk.partIndex == -1) {
            return 1;
        }
        HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(hlsMediaChunk.playlistUrl, false);
        playlistSnapshot.getClass();
        int i = (int) (hlsMediaChunk.chunkIndex - playlistSnapshot.mediaSequence);
        if (i < 0) {
            return 1;
        }
        List<HlsMediaPlaylist.Part> list = i < playlistSnapshot.segments.size() ? playlistSnapshot.segments.get(i).parts : playlistSnapshot.trailingParts;
        if (hlsMediaChunk.partIndex >= list.size()) {
            return 2;
        }
        HlsMediaPlaylist.Part part = list.get(hlsMediaChunk.partIndex);
        if (part.isPreload) {
            return 0;
        }
        Uri parse = Uri.parse(UriUtil.resolve(playlistSnapshot.baseUri, part.url));
        Uri uri = hlsMediaChunk.dataSpec.uri;
        if (this.cmcdConfiguration != null) {
            uri = CmcdData.removeFromUri(uri);
        }
        return Objects.equals(parse, uri) ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getNextChunk(androidx.media3.exoplayer.LoadingInfo r40, long r41, long r43, java.util.List<androidx.media3.exoplayer.hls.HlsMediaChunk> r45, boolean r46, androidx.media3.exoplayer.hls.HlsChunkSource.HlsChunkHolder r47) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsChunkSource.getNextChunk(androidx.media3.exoplayer.LoadingInfo, long, long, java.util.List, boolean, androidx.media3.exoplayer.hls.HlsChunkSource$HlsChunkHolder):void");
    }

    public int getPreferredQueueSize(long j, List<? extends MediaChunk> list) {
        return (this.fatalError != null || this.trackSelection.length() < 2) ? list.size() : this.trackSelection.evaluateQueueSize(j, list);
    }

    public long getPublishedPartDurationUs(HlsMediaChunk hlsMediaChunk) {
        sp0.z(hlsMediaChunk.partIndex != -1);
        HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(hlsMediaChunk.playlistUrl, false);
        playlistSnapshot.getClass();
        int i = (int) (hlsMediaChunk.chunkIndex - playlistSnapshot.mediaSequence);
        if (i < 0) {
            return 0L;
        }
        return (i < playlistSnapshot.segments.size() ? playlistSnapshot.segments.get(i).parts : playlistSnapshot.trailingParts).get(hlsMediaChunk.partIndex).durationUs;
    }

    public dy1 getRedundantGroups() {
        return dy1.q(this.redundantGroups);
    }

    public TrackGroup getTrackGroup() {
        return this.trackGroup;
    }

    public ExoTrackSelection getTrackSelection() {
        return this.trackSelection;
    }

    public boolean hasIndependentSegments() {
        return this.independentSegments;
    }

    public void maybeThrowError() {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.lastPlaylistErrorUrl;
        if (uri == null || !uri.equals(this.nextChunkStuckOnPlaylistUrl)) {
            return;
        }
        this.playlistTracker.maybeThrowPlaylistRefreshError(this.lastPlaylistErrorUrl);
    }

    public boolean obtainsChunksForPlaylist(Uri uri) {
        for (HlsRedundantGroup hlsRedundantGroup : this.redundantGroups) {
            if (hlsRedundantGroup.equals(this.playlistTracker.getRedundantGroup(uri))) {
                return true;
            }
        }
        return false;
    }

    public boolean onChunkError(Chunk chunk, LoadErrorHandlingPolicy.FallbackSelection fallbackSelection) {
        int indexOf;
        if (fallbackSelection == null) {
            return false;
        }
        ContentSteeringTracker contentSteeringTracker = this.contentSteeringTracker;
        ContentSteeringTracker contentSteeringTracker2 = (contentSteeringTracker == null || !contentSteeringTracker.isActive()) ? null : this.contentSteeringTracker;
        long j = fallbackSelection.exclusionDurationMs;
        int i = fallbackSelection.type;
        if (i == 1) {
            if (contentSteeringTracker2 != null) {
                this.trackSelection.clearTrackExclusions();
                return contentSteeringTracker2.excludeCurrentPathway(j);
            }
            if (chunk instanceof HlsMediaChunk) {
                return this.playlistTracker.excludeMediaPlaylist(((HlsMediaChunk) chunk).playlistUrl, j);
            }
            return false;
        }
        if (i != 2) {
            zl1.d(fallbackSelection.type, "Invalid fallback selection type: ");
            return false;
        }
        int indexOf2 = this.trackGroup.indexOf(chunk.trackFormat);
        if (indexOf2 == -1 || (indexOf = this.trackSelection.indexOf(indexOf2)) == -1) {
            return false;
        }
        return this.trackSelection.excludeTrack(indexOf, j);
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        if (chunk instanceof EncryptionKeyChunk) {
            EncryptionKeyChunk encryptionKeyChunk = (EncryptionKeyChunk) chunk;
            this.scratchSpace = encryptionKeyChunk.getDataHolder();
            FullSegmentEncryptionKeyCache fullSegmentEncryptionKeyCache = this.keyCache;
            Uri uri = encryptionKeyChunk.dataSpec.uri;
            byte[] result = encryptionKeyChunk.getResult();
            result.getClass();
            fullSegmentEncryptionKeyCache.put(uri, result);
        }
    }

    public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.FallbackSelection fallbackSelection) {
        int indexOf;
        this.lastPlaylistErrorUrl = uri;
        if (fallbackSelection == null) {
            return false;
        }
        ContentSteeringTracker contentSteeringTracker = this.contentSteeringTracker;
        ContentSteeringTracker contentSteeringTracker2 = (contentSteeringTracker == null || !contentSteeringTracker.isActive()) ? null : this.contentSteeringTracker;
        long j = fallbackSelection.exclusionDurationMs;
        int i = fallbackSelection.type;
        if (i == 1) {
            if (contentSteeringTracker2 == null) {
                return this.playlistTracker.excludeMediaPlaylist(uri, j);
            }
            this.trackSelection.clearTrackExclusions();
            return contentSteeringTracker2.excludeCurrentPathway(j);
        }
        if (i != 2) {
            zl1.d(fallbackSelection.type, "Invalid fallback selection type: ");
            return false;
        }
        int i2 = 0;
        while (true) {
            HlsRedundantGroup[] hlsRedundantGroupArr = this.redundantGroups;
            if (i2 >= hlsRedundantGroupArr.length) {
                i2 = -1;
                break;
            }
            if (hlsRedundantGroupArr[i2].equals(this.playlistTracker.getRedundantGroup(uri))) {
                break;
            }
            i2++;
        }
        return i2 != -1 && (indexOf = this.trackSelection.indexOf(i2)) != -1 && this.trackSelection.excludeTrack(indexOf, j) && this.playlistTracker.excludeMediaPlaylist(uri, j);
    }

    public void reset() {
        deactivatePlaylistForSelectedTrack();
        this.fatalError = null;
    }

    public void setIsPrimaryTimestampSource(boolean z) {
        this.isPrimaryTimestampSource = z;
    }

    public void setTrackSelection(ExoTrackSelection exoTrackSelection) {
        deactivatePlaylistForSelectedTrack();
        this.trackSelection = exoTrackSelection;
    }

    public boolean shouldCancelLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
    }

    public LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(Chunk chunk) {
        if (chunk instanceof HlsMediaChunk) {
            return createFallbackOptions(((HlsMediaChunk) chunk).playlistUrl);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = getTrackSelection().length();
        ContentSteeringTracker contentSteeringTracker = this.contentSteeringTracker;
        boolean z = contentSteeringTracker != null && contentSteeringTracker.isActive();
        return new LoadErrorHandlingPolicy.FallbackOptions(1, 0, length, getExcludedTrackCount(elapsedRealtime, z), z);
    }
}
