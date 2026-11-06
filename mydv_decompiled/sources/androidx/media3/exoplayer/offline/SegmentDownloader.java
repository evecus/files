package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.offline.Downloader;
import androidx.media3.exoplayer.offline.FilterableManifest;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import defpackage.fp;
import defpackage.gz4;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    public static final long DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS = 20000;
    private final ArrayList<RunnableFutureTask<?, ?>> activeRunnables;
    private final Cache cache;
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final CacheKeyFactory cacheKeyFactory;
    public final long durationUs;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final DataSpec manifestDataSpec;
    private final ParsingLoadable.Parser<M> manifestParser;
    private final long maxMergedSegmentStartTimeDiffUs;
    private final PriorityTaskManager priorityTaskManager;
    public final long startPositionUs;
    private final ArrayList<StreamKey> streamKeys;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ProgressNotifier implements CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(Downloader.ProgressListener progressListener, long j, int i, long j2, int i2) {
            this.progressListener = progressListener;
            this.contentLength = j;
            this.totalSegments = i;
            this.bytesDownloaded = j2;
            this.segmentsDownloaded = i2;
        }

        private float getPercentDownloaded() {
            long j = this.contentLength;
            if (j != -1 && j != 0) {
                return Util.percentFloat(this.bytesDownloaded, j);
            }
            int i = this.totalSegments;
            if (i != 0) {
                return Util.percentFloat(this.segmentsDownloaded, i);
            }
            return -1.0f;
        }

        @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
        public void onProgress(long j, long j2, long j3) {
            long j4 = this.bytesDownloaded + j3;
            this.bytesDownloaded = j4;
            this.progressListener.onProgress(this.contentLength, j4, getPercentDownloaded());
        }

        public void onSegmentDownloaded() {
            this.segmentsDownloaded++;
            this.progressListener.onProgress(this.contentLength, this.bytesDownloaded, getPercentDownloaded());
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long j, DataSpec dataSpec) {
            this.startTimeUs = j;
            this.dataSpec = dataSpec;
        }

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return Long.compare(this.startTimeUs, segment.startTimeUs);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SegmentDownloadRunnable extends RunnableFutureTask<Void, IOException> {
        private final CacheWriter cacheWriter;
        public final CacheDataSource dataSource;
        private final ProgressNotifier progressNotifier;
        public final Segment segment;
        public final byte[] temporaryBuffer;

        public SegmentDownloadRunnable(Segment segment, CacheDataSource cacheDataSource, ProgressNotifier progressNotifier, byte[] bArr) {
            this.segment = segment;
            this.dataSource = cacheDataSource;
            this.progressNotifier = progressNotifier;
            this.temporaryBuffer = bArr;
            this.cacheWriter = new CacheWriter(cacheDataSource, segment.dataSpec, bArr, progressNotifier);
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        public void cancelWork() {
            this.cacheWriter.cancel();
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        public Void doWork() {
            this.cacheWriter.cache();
            ProgressNotifier progressNotifier = this.progressNotifier;
            if (progressNotifier == null) {
                return null;
            }
            progressNotifier.onSegmentDownloaded();
            return null;
        }
    }

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor, long j, long j2, long j3) {
        mediaItem.localConfiguration.getClass();
        this.manifestDataSpec = getCompressibleDataSpec(mediaItem.localConfiguration.uri);
        this.manifestParser = parser;
        this.streamKeys = new ArrayList<>(mediaItem.localConfiguration.streamKeys);
        this.cacheDataSourceFactory = factory;
        this.executor = executor;
        this.startPositionUs = j2;
        this.durationUs = j3;
        Cache cache = factory.getCache();
        cache.getClass();
        this.cache = cache;
        this.cacheKeyFactory = factory.getCacheKeyFactory();
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
        this.activeRunnables = new ArrayList<>();
        this.maxMergedSegmentStartTimeDiffUs = Util.msToUs(j);
    }

    private <T> void addActiveRunnable(RunnableFutureTask<T, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            try {
                if (this.isCanceled) {
                    throw new InterruptedException();
                }
                this.activeRunnables.add(runnableFutureTask);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean canMergeSegments(DataSpec dataSpec, DataSpec dataSpec2) {
        if (!dataSpec.uri.equals(dataSpec2.uri)) {
            return false;
        }
        long j = dataSpec.length;
        return j != -1 && dataSpec.position + j == dataSpec2.position && Objects.equals(dataSpec.key, dataSpec2.key) && dataSpec.flags == dataSpec2.flags && dataSpec.httpMethod == dataSpec2.httpMethod && dataSpec.httpRequestHeaders.equals(dataSpec2.httpRequestHeaders);
    }

    public static DataSpec getCompressibleDataSpec(Uri uri) {
        return new DataSpec.Builder().setUri(uri).setFlags(1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ RunnableFutureTask lambda$getManifest$0(final DataSource dataSource, final ParsingLoadable.Parser parser, final DataSpec dataSpec) {
        return new RunnableFutureTask<M, IOException>() { // from class: androidx.media3.exoplayer.offline.SegmentDownloader.1
            @Override // androidx.media3.common.util.RunnableFutureTask
            public M doWork() {
                return (M) ParsingLoadable.load(dataSource, parser, dataSpec, 4);
            }
        };
    }

    private static void mergeSegments(List<Segment> list, CacheKeyFactory cacheKeyFactory, long j) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Segment segment = list.get(i2);
            String buildCacheKey = cacheKeyFactory.buildCacheKey(segment.dataSpec);
            Integer num = (Integer) hashMap.get(buildCacheKey);
            Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + j || !canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                hashMap.put(buildCacheKey, Integer.valueOf(i));
                list.set(i, segment);
                i++;
            } else {
                long j2 = segment.dataSpec.length;
                DataSpec subrange = segment2.dataSpec.subrange(0L, j2 != -1 ? segment2.dataSpec.length + j2 : -1L);
                num.getClass();
                list.set(num.intValue(), new Segment(segment2.startTimeUs, subrange));
            }
        }
        Util.removeRange(list, i, list.size());
    }

    private void removeActiveRunnable(RunnableFutureTask<?, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(runnableFutureTask);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        synchronized (this.activeRunnables) {
            try {
                this.isCanceled = true;
                for (int i = 0; i < this.activeRunnables.size(); i++) {
                    this.activeRunnables.get(i).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a7 A[LOOP:1: B:38:0x019d->B:40:0x01a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b4 A[EDGE_INSN: B:41:0x01b4->B:42:0x01b4 BREAK  A[LOOP:1: B:38:0x019d->B:40:0x01a7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bc A[LOOP:2: B:43:0x01ba->B:44:0x01bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d1  */
    @Override // androidx.media3.exoplayer.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void download(androidx.media3.exoplayer.offline.Downloader.ProgressListener r26) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.SegmentDownloader.download(androidx.media3.exoplayer.offline.Downloader$ProgressListener):void");
    }

    public final <T> T execute(gz4 gz4Var, boolean z) {
        if (z) {
            RunnableFutureTask runnableFutureTask = (RunnableFutureTask) gz4Var.get();
            runnableFutureTask.run();
            try {
                return (T) runnableFutureTask.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                Util.sneakyThrow(e);
            }
        }
        while (!this.isCanceled) {
            PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(-4000);
            }
            RunnableFutureTask<T, ?> runnableFutureTask2 = (RunnableFutureTask) gz4Var.get();
            this.addActiveRunnable(runnableFutureTask2);
            this.executor.execute(runnableFutureTask2);
            try {
                return runnableFutureTask2.get();
            } catch (ExecutionException e2) {
                Throwable cause2 = e2.getCause();
                cause2.getClass();
                if (!(cause2 instanceof PriorityTaskManager.PriorityTooLowException)) {
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    Util.sneakyThrow(e2);
                }
            } finally {
                runnableFutureTask2.blockUntilFinished();
                this.removeActiveRunnable((RunnableFutureTask<?, ?>) runnableFutureTask2);
            }
        }
        throw new InterruptedException();
    }

    public final M getManifest(final DataSource dataSource, final ParsingLoadable.Parser<M> parser, final DataSpec dataSpec, boolean z) {
        parser.getClass();
        return (M) execute(new gz4() { // from class: mh4
            @Override // defpackage.gz4
            public final Object get() {
                RunnableFutureTask lambda$getManifest$0;
                lambda$getManifest$0 = SegmentDownloader.this.lambda$getManifest$0(dataSource, parser, dataSpec);
                return lambda$getManifest$0;
            }
        }, z);
    }

    public abstract List<Segment> getSegments(DataSource dataSource, M m, boolean z);

    @Override // androidx.media3.exoplayer.offline.Downloader
    public final void remove() {
        CacheDataSource createDataSourceForRemovingDownload = this.cacheDataSourceFactory.createDataSourceForRemovingDownload();
        try {
            try {
                List<Segment> segments = getSegments(createDataSourceForRemovingDownload, getManifest(createDataSourceForRemovingDownload, this.manifestDataSpec, true), true);
                int i = 0;
                while (true) {
                    int size = segments.size();
                    Cache cache = this.cache;
                    if (i >= size) {
                        cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
                        return;
                    } else {
                        cache.removeResource(this.cacheKeyFactory.buildCacheKey(segments.get(i).dataSpec));
                        i++;
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static abstract class BaseFactory<M extends FilterableManifest<M>> implements SegmentDownloaderFactory {
        protected final CacheDataSource.Factory cacheDataSourceFactory;
        protected ParsingLoadable.Parser<M> manifestParser;
        protected long startPositionUs;
        protected Executor executor = new fp((byte) 1);
        protected long maxMergedSegmentStartTimeDiffMs = 20000;
        protected long durationUs = C.TIME_UNSET;

        public BaseFactory(CacheDataSource.Factory factory, ParsingLoadable.Parser<M> parser) {
            this.cacheDataSourceFactory = factory;
            this.manifestParser = parser;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public BaseFactory<M> setDurationUs(long j) {
            this.durationUs = j;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public BaseFactory<M> setExecutor(Executor executor) {
            this.executor = executor;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public BaseFactory<M> setMaxMergedSegmentStartTimeDiffMs(long j) {
            this.maxMergedSegmentStartTimeDiffMs = j;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public BaseFactory<M> setStartPositionUs(long j) {
            this.startPositionUs = j;
            return this;
        }
    }

    private void removeActiveRunnable(int i) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(i);
        }
    }

    public final M getManifest(DataSource dataSource, DataSpec dataSpec, boolean z) {
        return getManifest(dataSource, this.manifestParser, dataSpec, z);
    }

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor, long j) {
        this(mediaItem, parser, factory, executor, j, 0L, C.TIME_UNSET);
    }
}
