package androidx.media3.exoplayer.hls.offline;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UriUtil;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import defpackage.fp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HlsDownloader extends SegmentDownloader<HlsPlaylist> {
    private final ParsingLoadable.Parser<HlsPlaylist> manifestParser;

    @Deprecated
    public HlsDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, new HlsPlaylistParser(), factory, executor, 20000L, 0L, C.TIME_UNSET);
    }

    private void addMediaPlaylistDataSpecs(List<Uri> list, List<DataSpec> list2) {
        for (int i = 0; i < list.size(); i++) {
            list2.add(SegmentDownloader.getCompressibleDataSpec(list.get(i)));
        }
    }

    private void addSegment(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist.Segment segment, HashSet<Uri> hashSet, ArrayList<SegmentDownloader.Segment> arrayList) {
        String str = hlsMediaPlaylist.baseUri;
        long j = hlsMediaPlaylist.startTimeUs + segment.relativeStartTimeUs;
        String str2 = segment.fullSegmentEncryptionKeyUri;
        if (str2 != null) {
            Uri resolveToUri = UriUtil.resolveToUri(str, str2);
            if (hashSet.add(resolveToUri)) {
                arrayList.add(new SegmentDownloader.Segment(j, SegmentDownloader.getCompressibleDataSpec(resolveToUri)));
            }
        }
        arrayList.add(new SegmentDownloader.Segment(j, new DataSpec(UriUtil.resolveToUri(str, segment.url), segment.byteRangeOffset, segment.byteRangeLength)));
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, HlsPlaylist hlsPlaylist, boolean z) {
        ArrayList arrayList;
        Object obj;
        ArrayList<SegmentDownloader.Segment> arrayList2;
        ArrayList<SegmentDownloader.Segment> arrayList3;
        boolean z2 = z;
        ArrayList arrayList4 = new ArrayList();
        HlsMultivariantPlaylist hlsMultivariantPlaylist = HlsMultivariantPlaylist.EMPTY;
        if (hlsPlaylist instanceof HlsMultivariantPlaylist) {
            hlsMultivariantPlaylist = (HlsMultivariantPlaylist) hlsPlaylist;
            addMediaPlaylistDataSpecs(hlsMultivariantPlaylist.mediaPlaylistUrls, arrayList4);
        } else {
            arrayList4.add(SegmentDownloader.getCompressibleDataSpec(Uri.parse(hlsPlaylist.baseUri)));
        }
        Object hlsPlaylistParser = !hlsMultivariantPlaylist.variableDefinitions.isEmpty() ? new HlsPlaylistParser(hlsMultivariantPlaylist, null) : this.manifestParser;
        ArrayList<SegmentDownloader.Segment> arrayList5 = new ArrayList<>();
        HashSet<Uri> hashSet = new HashSet<>();
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            DataSpec dataSpec = (DataSpec) arrayList4.get(i);
            arrayList5.add(new SegmentDownloader.Segment(0L, dataSpec));
            try {
                HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) getManifest(dataSource, hlsPlaylistParser, dataSpec, z2);
                List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
                long j = z2 ? 0L : this.startPositionUs;
                ArrayList<SegmentDownloader.Segment> arrayList6 = arrayList5;
                long j2 = z2 ? C.TIME_UNSET : this.durationUs;
                int i3 = 0;
                HlsMediaPlaylist.Segment segment = null;
                while (true) {
                    if (i3 >= list.size()) {
                        arrayList = arrayList4;
                        obj = hlsPlaylistParser;
                        break;
                    }
                    HlsMediaPlaylist.Segment segment2 = list.get(i3);
                    arrayList = arrayList4;
                    obj = hlsPlaylistParser;
                    long j3 = hlsMediaPlaylist.startTimeUs + segment2.relativeStartTimeUs;
                    if (j3 + segment2.durationUs > j) {
                        if (j2 != C.TIME_UNSET && j3 >= j + j2) {
                            break;
                        }
                        HlsMediaPlaylist.Segment segment3 = segment2.initializationSegment;
                        if (segment3 == null || segment3 == segment) {
                            arrayList3 = arrayList6;
                        } else {
                            arrayList3 = arrayList6;
                            addSegment(hlsMediaPlaylist, segment3, hashSet, arrayList3);
                            segment = segment3;
                        }
                        addSegment(hlsMediaPlaylist, segment2, hashSet, arrayList3);
                    } else {
                        arrayList3 = arrayList6;
                    }
                    i3++;
                    arrayList6 = arrayList3;
                    arrayList4 = arrayList;
                    hlsPlaylistParser = obj;
                }
                arrayList2 = arrayList6;
            } catch (IOException e) {
                arrayList = arrayList4;
                obj = hlsPlaylistParser;
                arrayList2 = arrayList5;
                if (!z) {
                    throw e;
                }
            }
            z2 = z;
            arrayList5 = arrayList2;
            i = i2;
            arrayList4 = arrayList;
            hlsPlaylistParser = obj;
        }
        return arrayList5;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory extends SegmentDownloader.BaseFactory<HlsPlaylist> {
        public Factory(CacheDataSource.Factory factory) {
            super(factory, new HlsPlaylistParser());
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public HlsDownloader create(MediaItem mediaItem) {
            return new HlsDownloader(mediaItem, this.manifestParser, this.cacheDataSourceFactory, this.executor, this.maxMergedSegmentStartTimeDiffMs, this.startPositionUs, this.durationUs);
        }

        public Factory setManifestParser(HlsPlaylistParser hlsPlaylistParser) {
            this.manifestParser = hlsPlaylistParser;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public Factory setDurationUs(long j) {
            super.setDurationUs(j);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public Factory setExecutor(Executor executor) {
            super.setExecutor(executor);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public Factory setMaxMergedSegmentStartTimeDiffMs(long j) {
            super.setMaxMergedSegmentStartTimeDiffMs(j);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public Factory setStartPositionUs(long j) {
            super.setStartPositionUs(j);
            return this;
        }
    }

    @Deprecated
    public HlsDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new fp((byte) 1));
    }

    private HlsDownloader(MediaItem mediaItem, ParsingLoadable.Parser<HlsPlaylist> parser, CacheDataSource.Factory factory, Executor executor, long j, long j2, long j3) {
        super(mediaItem, parser, factory, executor, j, j2, j3);
        this.manifestParser = parser;
    }
}
