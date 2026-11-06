package androidx.media3.exoplayer.offline;

import androidx.media3.common.MediaItem;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.offline.Downloader;
import defpackage.fp;
import defpackage.w7;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ProgressiveDownloader implements Downloader {
    private final CacheWriter cacheWriter;
    private final CacheDataSource dataSource;
    final DataSpec dataSpec;
    private volatile RunnableFutureTask<Void, IOException> downloadRunnable;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final PriorityTaskManager priorityTaskManager;
    private Downloader.ProgressListener progressListener;

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor, long j, long j2) {
        executor.getClass();
        this.executor = executor;
        mediaItem.localConfiguration.getClass();
        DataSpec build = new DataSpec.Builder().setUri(mediaItem.localConfiguration.uri).setKey(mediaItem.localConfiguration.customCacheKey).setFlags(4).setPosition(j).setLength(j2).build();
        this.dataSpec = build;
        CacheDataSource createDataSourceForDownloading = factory.createDataSourceForDownloading();
        this.dataSource = createDataSourceForDownloading;
        this.cacheWriter = new CacheWriter(createDataSourceForDownloading, build, null, new w7(this, (byte) 14));
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgress(long j, long j2, long j3) {
        if (this.progressListener == null) {
            return;
        }
        float percentFloat = (j == -1 || j == 0) ? -1.0f : Util.percentFloat(j2, j);
        Downloader.ProgressListener progressListener = this.progressListener;
        progressListener.getClass();
        progressListener.onProgress(j, j2, percentFloat);
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        this.isCanceled = true;
        RunnableFutureTask<Void, IOException> runnableFutureTask = this.downloadRunnable;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void download(Downloader.ProgressListener progressListener) {
        this.progressListener = progressListener;
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-4000);
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.isCanceled) {
                    break;
                }
                this.downloadRunnable = new RunnableFutureTask<Void, IOException>() { // from class: androidx.media3.exoplayer.offline.ProgressiveDownloader.1
                    @Override // androidx.media3.common.util.RunnableFutureTask
                    public void cancelWork() {
                        ProgressiveDownloader.this.cacheWriter.cancel();
                    }

                    @Override // androidx.media3.common.util.RunnableFutureTask
                    public Void doWork() {
                        ProgressiveDownloader.this.cacheWriter.cache();
                        return null;
                    }
                };
                PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.proceed(-4000);
                }
                this.executor.execute(this.downloadRunnable);
                try {
                    this.downloadRunnable.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        Util.sneakyThrow(cause);
                    }
                }
            } catch (Throwable th) {
                RunnableFutureTask<Void, IOException> runnableFutureTask = this.downloadRunnable;
                runnableFutureTask.getClass();
                runnableFutureTask.blockUntilFinished();
                PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.remove(-4000);
                }
                throw th;
            }
        }
        RunnableFutureTask<Void, IOException> runnableFutureTask2 = this.downloadRunnable;
        runnableFutureTask2.getClass();
        runnableFutureTask2.blockUntilFinished();
        PriorityTaskManager priorityTaskManager4 = this.priorityTaskManager;
        if (priorityTaskManager4 != null) {
            priorityTaskManager4.remove(-4000);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void remove() {
        this.dataSource.getCache().removeResource(this.dataSource.getCacheKeyFactory().buildCacheKey(this.dataSpec));
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, long j, long j2) {
        this(mediaItem, factory, new fp((byte) 1), j, j2);
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, factory, executor, 0L, -1L);
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new fp((byte) 1));
    }
}
