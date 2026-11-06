package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.ExternallyLoadedMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.SingleSampleMediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.eq0;
import defpackage.gz4;
import defpackage.hf1;
import defpackage.s83;
import defpackage.sp0;
import defpackage.ut0;
import defpackage.x24;
import j$.util.Objects;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DMediaSourceFactory";
    private AdViewProvider adViewProvider;
    private AdsLoader.Provider adsLoaderProvider;
    private DataSource.Factory dataSourceFactory;
    private final DelegateFactoryLoader delegateFactoryLoader;
    private boolean enableClippingInMediaPeriod;
    private ExternalLoader externalImageLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean loadOnlySelectedTracks;
    private boolean parseSubtitlesDuringExtraction;
    private MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private SubtitleParser.Factory subtitleParserFactory;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class DelegateFactoryLoader {
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private DataSource.Factory dataSourceFactory;
        private gz4 downloadExecutorSupplier;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private final ExtractorsFactory extractorsFactory;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private boolean loadOnlySelectedTracks;
        private SubtitleParser.Factory subtitleParserFactory;
        private final Map<Integer, gz4> mediaSourceFactorySuppliers = new HashMap();
        private final Map<Integer, MediaSource.Factory> mediaSourceFactories = new HashMap();
        private boolean parseSubtitlesDuringExtraction = true;
        private int codecsToParseWithinGopSampleDependencies = 3;

        public DelegateFactoryLoader(ExtractorsFactory extractorsFactory, SubtitleParser.Factory factory) {
            this.extractorsFactory = extractorsFactory;
            this.subtitleParserFactory = factory;
        }

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ MediaSource.Factory lambda$loadSupplier$4(DataSource.Factory factory) {
            return new ProgressiveMediaSource.Factory(factory, this.extractorsFactory).setLoadOnlySelectedTracks(this.loadOnlySelectedTracks);
        }

        private gz4 loadSupplier(int i) {
            gz4 gz4Var;
            gz4 gz4Var2;
            gz4 gz4Var3 = this.mediaSourceFactorySuppliers.get(Integer.valueOf(i));
            if (gz4Var3 != null) {
                return gz4Var3;
            }
            final DataSource.Factory factory = this.dataSourceFactory;
            factory.getClass();
            if (i != 0) {
                final byte b = 1;
                if (i != 1) {
                    final byte b2 = 2;
                    if (i != 2) {
                        final byte b3 = 3;
                        if (i == 3) {
                            final Class<? extends U> asSubclass = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                            gz4Var = new gz4() { // from class: androidx.media3.exoplayer.source.b
                                @Override // defpackage.gz4
                                public final Object get() {
                                    MediaSource.Factory access$200;
                                    access$200 = DefaultMediaSourceFactory.access$200(asSubclass);
                                    return access$200;
                                }
                            };
                        } else {
                            if (i != 4) {
                                s83.t(hf1.u(i, "Unrecognized contentType: "));
                                return null;
                            }
                            gz4Var = new gz4() { // from class: androidx.media3.exoplayer.source.a
                                @Override // defpackage.gz4
                                public final Object get() {
                                    MediaSource.Factory access$300;
                                    MediaSource.Factory access$3002;
                                    MediaSource.Factory access$3003;
                                    MediaSource.Factory lambda$loadSupplier$4;
                                    byte b4 = b3;
                                    DataSource.Factory factory2 = factory;
                                    Object obj = this;
                                    switch (b4) {
                                        case 0:
                                            access$300 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                            return access$300;
                                        case 1:
                                            access$3002 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                            return access$3002;
                                        case 2:
                                            access$3003 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                            return access$3003;
                                        default:
                                            lambda$loadSupplier$4 = ((DefaultMediaSourceFactory.DelegateFactoryLoader) obj).lambda$loadSupplier$4(factory2);
                                            return lambda$loadSupplier$4;
                                    }
                                }
                            };
                        }
                    } else {
                        final Class asSubclass2 = HlsMediaSource.Factory.class.asSubclass(MediaSource.Factory.class);
                        gz4Var2 = new gz4() { // from class: androidx.media3.exoplayer.source.a
                            @Override // defpackage.gz4
                            public final Object get() {
                                MediaSource.Factory access$300;
                                MediaSource.Factory access$3002;
                                MediaSource.Factory access$3003;
                                MediaSource.Factory lambda$loadSupplier$4;
                                byte b4 = b2;
                                DataSource.Factory factory2 = factory;
                                Object obj = asSubclass2;
                                switch (b4) {
                                    case 0:
                                        access$300 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                        return access$300;
                                    case 1:
                                        access$3002 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                        return access$3002;
                                    case 2:
                                        access$3003 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                        return access$3003;
                                    default:
                                        lambda$loadSupplier$4 = ((DefaultMediaSourceFactory.DelegateFactoryLoader) obj).lambda$loadSupplier$4(factory2);
                                        return lambda$loadSupplier$4;
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass3 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                    gz4Var2 = new gz4() { // from class: androidx.media3.exoplayer.source.a
                        @Override // defpackage.gz4
                        public final Object get() {
                            MediaSource.Factory access$300;
                            MediaSource.Factory access$3002;
                            MediaSource.Factory access$3003;
                            MediaSource.Factory lambda$loadSupplier$4;
                            byte b4 = b;
                            DataSource.Factory factory2 = factory;
                            Object obj = asSubclass3;
                            switch (b4) {
                                case 0:
                                    access$300 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                    return access$300;
                                case 1:
                                    access$3002 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                    return access$3002;
                                case 2:
                                    access$3003 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                    return access$3003;
                                default:
                                    lambda$loadSupplier$4 = ((DefaultMediaSourceFactory.DelegateFactoryLoader) obj).lambda$loadSupplier$4(factory2);
                                    return lambda$loadSupplier$4;
                            }
                        }
                    };
                }
                gz4Var = gz4Var2;
            } else {
                final GenericDeclaration asSubclass4 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                final byte b4 = 0;
                gz4Var = new gz4() { // from class: androidx.media3.exoplayer.source.a
                    @Override // defpackage.gz4
                    public final Object get() {
                        MediaSource.Factory access$300;
                        MediaSource.Factory access$3002;
                        MediaSource.Factory access$3003;
                        MediaSource.Factory lambda$loadSupplier$4;
                        byte b42 = b4;
                        DataSource.Factory factory2 = factory;
                        Object obj = asSubclass4;
                        switch (b42) {
                            case 0:
                                access$300 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                return access$300;
                            case 1:
                                access$3002 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                return access$3002;
                            case 2:
                                access$3003 = DefaultMediaSourceFactory.access$300((Class) obj, factory2);
                                return access$3003;
                            default:
                                lambda$loadSupplier$4 = ((DefaultMediaSourceFactory.DelegateFactoryLoader) obj).lambda$loadSupplier$4(factory2);
                                return lambda$loadSupplier$4;
                        }
                    }
                };
            }
            this.mediaSourceFactorySuppliers.put(Integer.valueOf(i), gz4Var);
            return gz4Var;
        }

        private gz4 maybeLoadSupplier(int i) {
            try {
                return loadSupplier(i);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeifExtractorFlags(int i) {
            ExtractorsFactory extractorsFactory = this.extractorsFactory;
            if (extractorsFactory instanceof DefaultExtractorsFactory) {
                ((DefaultExtractorsFactory) extractorsFactory).setHeifExtractorFlags(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadOnlySelectedTracks(boolean z) {
            this.loadOnlySelectedTracks = z;
        }

        public MediaSource.Factory getMediaSourceFactory(int i) {
            MediaSource.Factory factory = this.mediaSourceFactories.get(Integer.valueOf(i));
            if (factory != null) {
                return factory;
            }
            MediaSource.Factory factory2 = (MediaSource.Factory) loadSupplier(i).get();
            CmcdConfiguration.Factory factory3 = this.cmcdConfigurationFactory;
            if (factory3 != null) {
                factory2.setCmcdConfigurationFactory(factory3);
            }
            DrmSessionManagerProvider drmSessionManagerProvider = this.drmSessionManagerProvider;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            gz4 gz4Var = this.downloadExecutorSupplier;
            if (gz4Var != null) {
                factory2.setDownloadExecutor(gz4Var);
            }
            factory2.setSubtitleParserFactory(this.subtitleParserFactory);
            factory2.experimentalParseSubtitlesDuringExtraction(this.parseSubtitlesDuringExtraction);
            factory2.experimentalSetCodecsToParseWithinGopSampleDependencies(this.codecsToParseWithinGopSampleDependencies);
            this.mediaSourceFactories.put(Integer.valueOf(i), factory2);
            return factory2;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return sp0.j0(this.mediaSourceFactorySuppliers.keySet());
        }

        public void setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = factory;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setCmcdConfigurationFactory(factory);
            }
        }

        public void setCodecsToParseWithinGopSampleDependencies(int i) {
            this.codecsToParseWithinGopSampleDependencies = i;
            this.extractorsFactory.mo364experimentalSetCodecsToParseWithinGopSampleDependencies(i);
        }

        public void setDataSourceFactory(DataSource.Factory factory) {
            if (factory != this.dataSourceFactory) {
                this.dataSourceFactory = factory;
                this.mediaSourceFactorySuppliers.clear();
                this.mediaSourceFactories.clear();
            }
        }

        public void setDownloadExecutor(gz4 gz4Var) {
            this.downloadExecutorSupplier = gz4Var;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDownloadExecutor(gz4Var);
            }
        }

        public void setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void setJpegExtractorFlags(int i) {
            ExtractorsFactory extractorsFactory = this.extractorsFactory;
            if (extractorsFactory instanceof DefaultExtractorsFactory) {
                ((DefaultExtractorsFactory) extractorsFactory).setJpegExtractorFlags(i);
            }
        }

        public void setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }

        public void setParseSubtitlesDuringExtraction(boolean z) {
            this.parseSubtitlesDuringExtraction = z;
            this.extractorsFactory.experimentalSetTextTrackTranscodingEnabled(z);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().experimentalParseSubtitlesDuringExtraction(z);
            }
        }

        public void setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.subtitleParserFactory = factory;
            this.extractorsFactory.mo365setSubtitleParserFactory(factory);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setSubtitleParserFactory(factory);
            }
        }
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory, SubtitleParser.Factory factory2) {
        this.dataSourceFactory = factory;
        this.subtitleParserFactory = factory2;
        DelegateFactoryLoader delegateFactoryLoader = new DelegateFactoryLoader(extractorsFactory, factory2);
        this.delegateFactoryLoader = delegateFactoryLoader;
        delegateFactoryLoader.setDataSourceFactory(factory);
        this.liveTargetOffsetMs = C.TIME_UNSET;
        this.liveMinOffsetMs = C.TIME_UNSET;
        this.liveMaxOffsetMs = C.TIME_UNSET;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
        this.parseSubtitlesDuringExtraction = true;
    }

    public static /* synthetic */ MediaSource.Factory access$200(Class cls) {
        return newInstance(cls);
    }

    public static /* synthetic */ MediaSource.Factory access$300(Class cls, DataSource.Factory factory) {
        return newInstance(cls, factory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Extractor[] lambda$createMediaSource$0(Format format) {
        return new Extractor[]{this.subtitleParserFactory.supportsFormat(format) ? new SubtitleExtractor(this.subtitleParserFactory.create(format), null) : new UnknownSubtitlesExtractor(format)};
    }

    private static MediaSource maybeClipMediaSource(MediaItem mediaItem, MediaSource mediaSource, boolean z) {
        MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
        return (clippingConfiguration.startPositionUs == 0 && clippingConfiguration.endPositionUs == Long.MIN_VALUE && !clippingConfiguration.relativeToDefaultPosition) ? mediaSource : new ClippingMediaSource.Builder(mediaSource).setClippingConfiguration(mediaItem.clippingConfiguration).setEnableClippingInMediaPeriod(z).build();
    }

    private MediaSource maybeWrapWithAdsMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        mediaItem.localConfiguration.getClass();
        MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        AdsLoader.Provider provider = this.adsLoaderProvider;
        AdViewProvider adViewProvider = this.adViewProvider;
        if (provider == null || adViewProvider == null) {
            Log.w(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        AdsLoader adsLoader = provider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            Log.w(TAG, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        DataSpec dataSpec = new DataSpec(adsConfiguration.adTagUri);
        Object obj = adsConfiguration.adsId;
        if (obj == null) {
            String str = mediaItem.mediaId;
            Uri uri = mediaItem.localConfiguration.uri;
            Uri uri2 = adsConfiguration.adTagUri;
            ay1 ay1Var = dy1.J;
            Object[] objArr = {str, uri, uri2};
            ut0.k(3, objArr);
            obj = dy1.m(3, objArr);
        }
        return new AdsMediaSource(mediaSource, dataSpec, obj, this, adsLoader, adViewProvider, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls, DataSource.Factory factory) {
        try {
            return cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
        this.adsLoaderProvider = null;
        this.adViewProvider = null;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource createMediaSource(MediaItem mediaItem) {
        mediaItem.localConfiguration.getClass();
        String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals(C.SSAI_SCHEME)) {
            MediaSource.Factory factory = this.serverSideAdInsertionMediaSourceFactory;
            factory.getClass();
            return factory.createMediaSource(mediaItem);
        }
        boolean equals = Objects.equals(mediaItem.localConfiguration.mimeType, MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE);
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (equals) {
            long msToUs = Util.msToUs(localConfiguration.imageDurationMs);
            ExternalLoader externalLoader = this.externalImageLoader;
            externalLoader.getClass();
            return new ExternallyLoadedMediaSource.Factory(msToUs, externalLoader).createMediaSource(mediaItem);
        }
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        if (mediaItem.localConfiguration.imageDurationMs != C.TIME_UNSET) {
            this.delegateFactoryLoader.setJpegExtractorFlags(1);
            this.delegateFactoryLoader.setHeifExtractorFlags(1);
        }
        try {
            MediaSource.Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(inferContentTypeForUriAndMimeType);
            MediaItem.LiveConfiguration.Builder buildUpon = mediaItem.liveConfiguration.buildUpon();
            if (mediaItem.liveConfiguration.targetOffsetMs == C.TIME_UNSET) {
                buildUpon.setTargetOffsetMs(this.liveTargetOffsetMs);
            }
            if (mediaItem.liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
                buildUpon.setMinPlaybackSpeed(this.liveMinSpeed);
            }
            if (mediaItem.liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
                buildUpon.setMaxPlaybackSpeed(this.liveMaxSpeed);
            }
            if (mediaItem.liveConfiguration.minOffsetMs == C.TIME_UNSET) {
                buildUpon.setMinOffsetMs(this.liveMinOffsetMs);
            }
            if (mediaItem.liveConfiguration.maxOffsetMs == C.TIME_UNSET) {
                buildUpon.setMaxOffsetMs(this.liveMaxOffsetMs);
            }
            MediaItem.LiveConfiguration build = buildUpon.build();
            if (!build.equals(mediaItem.liveConfiguration)) {
                mediaItem = mediaItem.buildUpon().setLiveConfiguration(build).build();
            }
            MediaSource createMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
            dy1 dy1Var = ((MediaItem.LocalConfiguration) Util.castNonNull(mediaItem.localConfiguration)).subtitleConfigurations;
            if (!dy1Var.isEmpty()) {
                MediaSource[] mediaSourceArr = new MediaSource[dy1Var.size() + 1];
                mediaSourceArr[0] = createMediaSource;
                for (int i = 0; i < dy1Var.size(); i++) {
                    if (this.parseSubtitlesDuringExtraction) {
                        Format build2 = new Format.Builder().setSampleMimeType(((MediaItem.SubtitleConfiguration) dy1Var.get(i)).mimeType).setLanguage(((MediaItem.SubtitleConfiguration) dy1Var.get(i)).language).setSelectionFlags(((MediaItem.SubtitleConfiguration) dy1Var.get(i)).selectionFlags).setRoleFlags(((MediaItem.SubtitleConfiguration) dy1Var.get(i)).roleFlags).setLabel(((MediaItem.SubtitleConfiguration) dy1Var.get(i)).label).setId(((MediaItem.SubtitleConfiguration) dy1Var.get(i)).id).build();
                        ProgressiveMediaSource.Factory factory2 = new ProgressiveMediaSource.Factory(this.dataSourceFactory, new eq0(this, build2, (byte) 6));
                        if (this.subtitleParserFactory.supportsFormat(build2)) {
                            build2 = build2.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCodecs(build2.sampleMimeType).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(build2)).build();
                        }
                        ProgressiveMediaSource.Factory loadOnlySelectedTracks = factory2.enableLazyLoadingWithSingleTrack(0, build2).setLoadOnlySelectedTracks(this.loadOnlySelectedTracks);
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy != null) {
                            loadOnlySelectedTracks.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
                        }
                        mediaSourceArr[i + 1] = loadOnlySelectedTracks.createMediaSource(MediaItem.fromUri(((MediaItem.SubtitleConfiguration) dy1Var.get(i)).uri.toString()));
                    } else {
                        SingleSampleMediaSource.Factory factory3 = new SingleSampleMediaSource.Factory(this.dataSourceFactory);
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy2 != null) {
                            factory3.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy2);
                        }
                        mediaSourceArr[i + 1] = factory3.createMediaSource((MediaItem.SubtitleConfiguration) dy1Var.get(i), C.TIME_UNSET);
                    }
                }
                createMediaSource = new MergingMediaSource(mediaSourceArr);
            }
            return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, createMediaSource, this.enableClippingInMediaPeriod));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @Deprecated
    public DefaultMediaSourceFactory experimentalParseSubtitlesDuringExtraction(boolean z) {
        this.parseSubtitlesDuringExtraction = z;
        this.delegateFactoryLoader.setParseSubtitlesDuringExtraction(z);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        this.delegateFactoryLoader.setCodecsToParseWithinGopSampleDependencies(i);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.getSupportedTypes();
    }

    @Deprecated
    public DefaultMediaSourceFactory setAdViewProvider(AdViewProvider adViewProvider) {
        this.adViewProvider = adViewProvider;
        return this;
    }

    @Deprecated
    public DefaultMediaSourceFactory setAdsLoaderProvider(AdsLoader.Provider provider) {
        this.adsLoaderProvider = provider;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
        DelegateFactoryLoader delegateFactoryLoader = this.delegateFactoryLoader;
        factory.getClass();
        delegateFactoryLoader.setCmcdConfigurationFactory(factory);
        return this;
    }

    public DefaultMediaSourceFactory setDataSourceFactory(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.delegateFactoryLoader.setDataSourceFactory(factory);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource.Factory setDownloadExecutor(gz4 gz4Var) {
        this.delegateFactoryLoader.setDownloadExecutor(gz4Var);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        DelegateFactoryLoader delegateFactoryLoader = this.delegateFactoryLoader;
        sp0.w(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        delegateFactoryLoader.setDrmSessionManagerProvider(drmSessionManagerProvider);
        return this;
    }

    public DefaultMediaSourceFactory setEnableClippingInMediaPeriod(boolean z) {
        this.enableClippingInMediaPeriod = z;
        return this;
    }

    public DefaultMediaSourceFactory setExternalImageLoader(ExternalLoader externalLoader) {
        this.externalImageLoader = externalLoader;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long j) {
        this.liveMaxOffsetMs = j;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxSpeed(float f) {
        this.liveMaxSpeed = f;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinOffsetMs(long j) {
        this.liveMinOffsetMs = j;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinSpeed(float f) {
        this.liveMinSpeed = f;
        return this;
    }

    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long j) {
        this.liveTargetOffsetMs = j;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        sp0.w(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.delegateFactoryLoader.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        return this;
    }

    public DefaultMediaSourceFactory setLoadOnlySelectedTracks(boolean z) {
        this.loadOnlySelectedTracks = z;
        this.delegateFactoryLoader.setLoadOnlySelectedTracks(z);
        return this;
    }

    public DefaultMediaSourceFactory setLocalAdInsertionComponents(AdsLoader.Provider provider, AdViewProvider adViewProvider) {
        provider.getClass();
        this.adsLoaderProvider = provider;
        adViewProvider.getClass();
        this.adViewProvider = adViewProvider;
        return this;
    }

    public DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(MediaSource.Factory factory) {
        this.serverSideAdInsertionMediaSourceFactory = factory;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        factory.getClass();
        this.subtitleParserFactory = factory;
        this.delegateFactoryLoader.setSubtitleParserFactory(factory);
        return this;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class UnknownSubtitlesExtractor implements Extractor {
        private final Format format;

        public UnknownSubtitlesExtractor(Format format) {
            this.format = format;
        }

        @Override // androidx.media3.extractor.Extractor
        public final List getSniffFailureDetails() {
            ay1 ay1Var = dy1.J;
            return x24.M;
        }

        @Override // androidx.media3.extractor.Extractor
        public void init(ExtractorOutput extractorOutput) {
            TrackOutput track = extractorOutput.track(0, 3);
            extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
            extractorOutput.endTracks();
            track.format(this.format.buildUpon().setSampleMimeType(MimeTypes.TEXT_UNKNOWN).setCodecs(this.format.sampleMimeType).build());
        }

        @Override // androidx.media3.extractor.Extractor
        public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
            return extractorInput.skip(Log.LOG_LEVEL_OFF) == -1 ? -1 : 0;
        }

        @Override // androidx.media3.extractor.Extractor
        public boolean sniff(ExtractorInput extractorInput) {
            return true;
        }

        @Override // androidx.media3.extractor.Extractor
        public final Extractor getUnderlyingImplementation() {
            return this;
        }

        @Override // androidx.media3.extractor.Extractor
        public void release() {
        }

        @Override // androidx.media3.extractor.Extractor
        public void seek(long j, long j2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
        this(new DefaultDataSource.Factory(context), extractorsFactory);
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory) {
        this(factory, new DefaultExtractorsFactory());
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
        this(factory, extractorsFactory, new DefaultSubtitleParserFactory());
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSource.Factory(context));
    }
}
