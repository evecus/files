package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Consumer;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import defpackage.dq2;
import defpackage.dy1;
import defpackage.gz4;
import defpackage.mx3;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@Deprecated
/* loaded from: classes2.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {
    private final DataSource.Factory dataSourceFactory;
    private final DataSpec dataSpec;
    private final gz4 downloadExecutorSupplier;
    private final long durationUs;
    private final Format format;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final MediaItem mediaItem;
    private final Timeline timeline;
    private TransferListener transferListener;
    private final boolean treatLoadErrorsAsEndOfStream;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory {
        private final DataSource.Factory dataSourceFactory;
        private gz4 downloadExecutorSupplier;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private Object tag;
        private String trackId;
        private boolean treatLoadErrorsAsEndOfStream;

        public Factory(DataSource.Factory factory) {
            factory.getClass();
            this.dataSourceFactory = factory;
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.treatLoadErrorsAsEndOfStream = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ReleasableExecutor lambda$setDownloadExecutor$0(gz4 gz4Var, Consumer consumer) {
            return androidx.media3.exoplayer.util.a.a((Executor) gz4Var.get(), consumer);
        }

        public SingleSampleMediaSource createMediaSource(MediaItem.SubtitleConfiguration subtitleConfiguration, long j) {
            return new SingleSampleMediaSource(this.trackId, subtitleConfiguration, this.dataSourceFactory, j, this.loadErrorHandlingPolicy, this.treatLoadErrorsAsEndOfStream, this.tag, this.downloadExecutorSupplier);
        }

        public <T extends Executor> Factory setDownloadExecutor(gz4 gz4Var, Consumer<T> consumer) {
            this.downloadExecutorSupplier = new mx3(gz4Var, consumer, (byte) 1);
            return this;
        }

        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public Factory setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        @Deprecated
        public Factory setTrackId(String str) {
            this.trackId = str;
            return this;
        }

        public Factory setTreatLoadErrorsAsEndOfStream(boolean z) {
            this.treatLoadErrorsAsEndOfStream = z;
            return this;
        }
    }

    private SingleSampleMediaSource(String str, MediaItem.SubtitleConfiguration subtitleConfiguration, DataSource.Factory factory, long j, LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean z, Object obj, gz4 gz4Var) {
        this.dataSourceFactory = factory;
        this.durationUs = j;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.treatLoadErrorsAsEndOfStream = z;
        MediaItem build = new MediaItem.Builder().setUri(Uri.EMPTY).setMediaId(subtitleConfiguration.uri.toString()).setSubtitleConfigurations(dy1.t(subtitleConfiguration)).setTag(obj).build();
        this.mediaItem = build;
        Format.Builder label = new Format.Builder().setSampleMimeType((String) dq2.J(subtitleConfiguration.mimeType, MimeTypes.TEXT_UNKNOWN)).setLanguage(subtitleConfiguration.language).setSelectionFlags(subtitleConfiguration.selectionFlags).setRoleFlags(subtitleConfiguration.roleFlags).setLabel(subtitleConfiguration.label);
        String str2 = subtitleConfiguration.id;
        this.format = label.setId(str2 != null ? str2 : str).build();
        this.dataSpec = new DataSpec.Builder().setUri(subtitleConfiguration.uri).setFlags(1).build();
        this.timeline = new SinglePeriodTimeline(j, true, false, false, (Object) null, build);
        this.downloadExecutorSupplier = gz4Var;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        DataSpec dataSpec = this.dataSpec;
        DataSource.Factory factory = this.dataSourceFactory;
        TransferListener transferListener = this.transferListener;
        Format format = this.format;
        long j2 = this.durationUs;
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
        MediaSourceEventListener.EventDispatcher createEventDispatcher = createEventDispatcher(mediaPeriodId);
        boolean z = this.treatLoadErrorsAsEndOfStream;
        gz4 gz4Var = this.downloadExecutorSupplier;
        return new SingleSampleMediaPeriod(dataSpec, factory, transferListener, format, j2, loadErrorHandlingPolicy, createEventDispatcher, z, gz4Var != null ? (ReleasableExecutor) gz4Var.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        this.transferListener = transferListener;
        refreshSourceInfo(this.timeline);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((SingleSampleMediaPeriod) mediaPeriod).release();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
    }
}
