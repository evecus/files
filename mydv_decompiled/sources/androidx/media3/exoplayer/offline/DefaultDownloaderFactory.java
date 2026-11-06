package androidx.media3.exoplayer.offline;

import android.util.SparseArray;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.hls.offline.HlsDownloader;
import androidx.media3.exoplayer.offline.DownloadRequest;
import defpackage.fp;
import defpackage.hf1;
import defpackage.s83;
import defpackage.zl1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final Executor executor;
    private final SparseArray<SegmentDownloaderFactory> segmentDownloaderFactories;

    public DefaultDownloaderFactory(CacheDataSource.Factory factory, Executor executor) {
        factory.getClass();
        this.cacheDataSourceFactory = factory;
        executor.getClass();
        this.executor = executor;
        this.segmentDownloaderFactories = new SparseArray<>();
    }

    private Downloader createSegmentDownloader(DownloadRequest downloadRequest, int i) {
        SegmentDownloaderFactory segmentDownloaderFactory = getSegmentDownloaderFactory(i, this.cacheDataSourceFactory);
        MediaItem build = new MediaItem.Builder().setUri(downloadRequest.uri).setStreamKeys(downloadRequest.streamKeys).setCustomCacheKey(downloadRequest.customCacheKey).build();
        DownloadRequest.TimeRange timeRange = downloadRequest.timeRange;
        if (timeRange != null) {
            segmentDownloaderFactory.setStartPositionUs(timeRange.startPositionUs).setDurationUs(downloadRequest.timeRange.durationUs);
        }
        return segmentDownloaderFactory.setExecutor(this.executor).create(build);
    }

    private static SegmentDownloaderFactory createSegmentDownloaderFactory(Class<? extends SegmentDownloaderFactory> cls, CacheDataSource.Factory factory) {
        try {
            return cls.getConstructor(CacheDataSource.Factory.class).newInstance(factory);
        } catch (Exception e) {
            zl1.i("Downloader factory missing", e);
            return null;
        }
    }

    private SegmentDownloaderFactory getSegmentDownloaderFactory(int i, CacheDataSource.Factory factory) {
        if (Util.contains(this.segmentDownloaderFactories, i)) {
            return this.segmentDownloaderFactories.get(i);
        }
        try {
            return loadSegmentDownloaderFactory(i, factory);
        } catch (ClassNotFoundException e) {
            zl1.i(hf1.u(i, "Module missing for content type "), e);
            return null;
        }
    }

    private SegmentDownloaderFactory loadSegmentDownloaderFactory(int i, CacheDataSource.Factory factory) {
        SegmentDownloaderFactory createSegmentDownloaderFactory;
        if (i == 0) {
            createSegmentDownloaderFactory = createSegmentDownloaderFactory(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader$Factory").asSubclass(SegmentDownloaderFactory.class), factory);
        } else if (i == 1) {
            createSegmentDownloaderFactory = createSegmentDownloaderFactory(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory").asSubclass(SegmentDownloaderFactory.class), factory);
        } else {
            if (i != 2) {
                s83.t(hf1.u(i, "Unsupported type: "));
                return null;
            }
            createSegmentDownloaderFactory = createSegmentDownloaderFactory(HlsDownloader.Factory.class.asSubclass(SegmentDownloaderFactory.class), factory);
        }
        this.segmentDownloaderFactories.put(i, createSegmentDownloaderFactory);
        return createSegmentDownloaderFactory;
    }

    @Override // androidx.media3.exoplayer.offline.DownloaderFactory
    public Downloader createDownloader(DownloadRequest downloadRequest) {
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(downloadRequest.uri, downloadRequest.mimeType);
        if (inferContentTypeForUriAndMimeType == 0 || inferContentTypeForUriAndMimeType == 1 || inferContentTypeForUriAndMimeType == 2) {
            return createSegmentDownloader(downloadRequest, inferContentTypeForUriAndMimeType);
        }
        if (inferContentTypeForUriAndMimeType == 4) {
            DownloadRequest.ByteRange byteRange = downloadRequest.byteRange;
            return new ProgressiveDownloader(new MediaItem.Builder().setUri(downloadRequest.uri).setCustomCacheKey(downloadRequest.customCacheKey).build(), this.cacheDataSourceFactory, this.executor, byteRange != null ? byteRange.offset : 0L, byteRange != null ? byteRange.length : -1L);
        }
        s83.t(hf1.u(inferContentTypeForUriAndMimeType, "Unsupported type: "));
        return null;
    }

    @Deprecated
    public DefaultDownloaderFactory(CacheDataSource.Factory factory) {
        this(factory, new fp((byte) 1));
    }
}
