package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.text.SubtitleParser;
import defpackage.gz4;
import defpackage.sp0;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ExternallyLoadedMediaSource extends BaseMediaSource {
    private final ExternalLoader externalLoader;
    private MediaItem mediaItem;
    private final long timelineDurationUs;

    private ExternallyLoadedMediaSource(MediaItem mediaItem, long j, ExternalLoader externalLoader) {
        this.mediaItem = mediaItem;
        this.timelineDurationUs = j;
        this.externalLoader = externalLoader;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        MediaItem.LocalConfiguration localConfiguration2 = getMediaItem().localConfiguration;
        localConfiguration2.getClass();
        if (localConfiguration == null || !localConfiguration.uri.equals(localConfiguration2.uri) || !Objects.equals(localConfiguration.mimeType, localConfiguration2.mimeType)) {
            return false;
        }
        long j = localConfiguration.imageDurationMs;
        return j == C.TIME_UNSET || Util.msToUs(j) == this.timelineDurationUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaItem mediaItem = getMediaItem();
        mediaItem.localConfiguration.getClass();
        sp0.w(mediaItem.localConfiguration.mimeType, "Externally loaded mediaItems require a MIME type.");
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        return new ExternallyLoadedMediaPeriod(localConfiguration.uri, localConfiguration.mimeType, this.externalLoader);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        refreshSourceInfo(new SinglePeriodTimeline(this.timelineDurationUs, true, false, false, (Object) null, getMediaItem()));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((ExternallyLoadedMediaPeriod) mediaPeriod).releasePeriod();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements MediaSource.Factory {
        private final ExternalLoader externalLoader;
        private final long timelineDurationUs;

        public Factory(long j, ExternalLoader externalLoader) {
            this.timelineDurationUs = j;
            this.externalLoader = externalLoader;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public ExternallyLoadedMediaSource createMediaSource(MediaItem mediaItem) {
            return new ExternallyLoadedMediaSource(mediaItem, this.timelineDurationUs, this.externalLoader);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource.Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource.Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource.Factory setDownloadExecutor(gz4 gz4Var) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }
    }
}
