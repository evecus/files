package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.text.SubtitleParser;
import defpackage.gz4;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ForwardingMediaSourceFactory implements MediaSource.Factory {
    private final MediaSource.Factory factory;

    public ForwardingMediaSourceFactory(MediaSource.Factory factory) {
        this.factory = factory;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource createMediaSource(MediaItem mediaItem) {
        return this.factory.createMediaSource(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
        return this.factory.experimentalParseSubtitlesDuringExtraction(z);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource.Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this.factory.experimentalSetCodecsToParseWithinGopSampleDependencies(i);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public int[] getSupportedTypes() {
        return this.factory.getSupportedTypes();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource.Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
        return this.factory.setCmcdConfigurationFactory(factory);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource.Factory setDownloadExecutor(gz4 gz4Var) {
        return this.factory.setDownloadExecutor(gz4Var);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        return this.factory.setDrmSessionManagerProvider(drmSessionManagerProvider);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        return this.factory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this.factory.setSubtitleParserFactory(factory);
    }
}
