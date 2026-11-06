package androidx.media3.exoplayer.upstream.contentsteering;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestTracker;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import defpackage.gz4;
import defpackage.iy1;
import defpackage.sp0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SteeringManifestTracker {
    static final long FALLBACK_DELAY_UNTIL_NEXT_LOAD_MS = 300000;
    private static final String RETRY_AFTER_HEADER = "Retry-After";
    private static final String TAG = "SteeringManifestTracker";
    private Callback callback;
    private final Clock clock;
    private final DataSource.Factory dataSourceFactory;
    private final gz4 downloadExecutorSupplier;
    private MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final HandlerWrapper handler;
    private boolean hasStarted;
    private SteeringManifest steeringManifest;
    private Loader steeringManifestLoader;
    private final SteeringManifestLoaderCallback steeringManifestLoaderCallback;
    private HandlerWrapper steeringManifestReloadHandler;
    private Uri steeringManifestUrl;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Callback {
        iy1 getSteeringQueryParameters();

        void onSteeringManifestLoadError(IOException iOException, boolean z);

        void onSteeringManifestUpdated(SteeringManifest steeringManifest);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class SteeringManifestLoaderCallback implements Loader.Callback<ParsingLoadable<SteeringManifest>> {
        private SteeringManifestLoaderCallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onLoadCompleted$0(SteeringManifest steeringManifest) {
            Callback callback = SteeringManifestTracker.this.callback;
            callback.getClass();
            callback.onSteeringManifestUpdated(steeringManifest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onLoadError$3(IOException iOException, boolean z) {
            Callback callback = SteeringManifestTracker.this.callback;
            callback.getClass();
            callback.onSteeringManifestLoadError(iOException, z);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<SteeringManifest> parsingLoadable, long j, long j2, boolean z) {
            if (SteeringManifestTracker.this.hasStarted) {
                LoadEventInfo buildLoadEventInfo = SteeringManifestTracker.buildLoadEventInfo(parsingLoadable, j, j2);
                MediaSourceEventListener.EventDispatcher eventDispatcher = SteeringManifestTracker.this.eventDispatcher;
                eventDispatcher.getClass();
                eventDispatcher.loadCanceled(buildLoadEventInfo, 8);
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<SteeringManifest> parsingLoadable, long j, long j2) {
            if (SteeringManifestTracker.this.hasStarted) {
                final SteeringManifest result = parsingLoadable.getResult();
                result.getClass();
                SteeringManifestTracker.this.steeringManifest = result;
                SteeringManifestTracker.this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.upstream.contentsteering.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        SteeringManifestTracker.SteeringManifestLoaderCallback.this.lambda$onLoadCompleted$0(result);
                    }
                });
                SteeringManifestTracker steeringManifestTracker = SteeringManifestTracker.this;
                Uri uri = steeringManifestTracker.steeringManifestUrl;
                uri.getClass();
                steeringManifestTracker.steeringManifestUrl = SteeringManifestTracker.getSteeringManifestUrl(uri, result.reloadUri);
                long j3 = result.timeToLiveMs;
                if (j3 == C.TIME_UNSET) {
                    j3 = 300000;
                }
                HandlerWrapper handlerWrapper = SteeringManifestTracker.this.steeringManifestReloadHandler;
                handlerWrapper.getClass();
                handlerWrapper.postDelayed(new c(SteeringManifestTracker.this, (byte) 0), j3);
                LoadEventInfo buildLoadEventInfo = SteeringManifestTracker.buildLoadEventInfo(parsingLoadable, j, j2);
                MediaSourceEventListener.EventDispatcher eventDispatcher = SteeringManifestTracker.this.eventDispatcher;
                eventDispatcher.getClass();
                eventDispatcher.loadCompleted(buildLoadEventInfo, 8);
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<SteeringManifest> parsingLoadable, long j, long j2, final IOException iOException, int i) {
            long j3;
            if (!SteeringManifestTracker.this.hasStarted) {
                return Loader.DONT_RETRY;
            }
            int i2 = iOException instanceof HttpDataSource.InvalidResponseCodeException ? ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode : Log.LOG_LEVEL_OFF;
            if (i2 == 410) {
                Loader loader = SteeringManifestTracker.this.steeringManifestLoader;
                loader.getClass();
                loader.release();
                HandlerWrapper handlerWrapper = SteeringManifestTracker.this.steeringManifestReloadHandler;
                handlerWrapper.getClass();
                handlerWrapper.removeCallbacksAndMessages(null);
                j3 = -9223372036854775807L;
            } else {
                j3 = 300000;
                if (i2 == 429) {
                    List<String> list = parsingLoadable.getResponseHeaders().get(SteeringManifestTracker.RETRY_AFTER_HEADER);
                    if (list != null) {
                        try {
                            j3 = Long.parseLong(list.get(0)) * 1000;
                        } catch (NumberFormatException unused) {
                            Log.w(SteeringManifestTracker.TAG, "Retry-After header string doesn't contain a parsable long");
                        }
                    }
                } else if (SteeringManifestTracker.this.steeringManifest != null && SteeringManifestTracker.this.steeringManifest.timeToLiveMs != C.TIME_UNSET) {
                    j3 = SteeringManifestTracker.this.steeringManifest.timeToLiveMs;
                }
            }
            byte b = 1;
            if (j3 != C.TIME_UNSET) {
                HandlerWrapper handlerWrapper2 = SteeringManifestTracker.this.steeringManifestReloadHandler;
                handlerWrapper2.getClass();
                handlerWrapper2.postDelayed(new c(SteeringManifestTracker.this, b), j3);
            }
            final boolean z = j3 == C.TIME_UNSET;
            SteeringManifestTracker.this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.upstream.contentsteering.d
                @Override // java.lang.Runnable
                public final void run() {
                    SteeringManifestTracker.SteeringManifestLoaderCallback.this.lambda$onLoadError$3(iOException, z);
                }
            });
            LoadEventInfo buildLoadEventInfo = SteeringManifestTracker.buildLoadEventInfo(parsingLoadable, j, j2);
            MediaSourceEventListener.EventDispatcher eventDispatcher = SteeringManifestTracker.this.eventDispatcher;
            eventDispatcher.getClass();
            eventDispatcher.loadError(buildLoadEventInfo, 8, iOException, z);
            return Loader.DONT_RETRY;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadStarted(ParsingLoadable<SteeringManifest> parsingLoadable, long j, long j2, int i) {
            if (SteeringManifestTracker.this.hasStarted) {
                LoadEventInfo buildLoadEventInfo = SteeringManifestTracker.buildLoadEventInfo(parsingLoadable, j, j2);
                MediaSourceEventListener.EventDispatcher eventDispatcher = SteeringManifestTracker.this.eventDispatcher;
                eventDispatcher.getClass();
                eventDispatcher.loadStarted(buildLoadEventInfo, 8, i);
            }
        }
    }

    public SteeringManifestTracker(DataSource.Factory factory, gz4 gz4Var, Clock clock) {
        this.dataSourceFactory = factory;
        this.downloadExecutorSupplier = gz4Var;
        this.clock = clock;
        this.steeringManifestLoaderCallback = new SteeringManifestLoaderCallback();
        this.handler = clock.createHandler(Util.getCurrentOrMainLooper(), null);
    }

    public static /* synthetic */ void access$1100(SteeringManifestTracker steeringManifestTracker) {
        steeringManifestTracker.loadSteeringManifestImmediately();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LoadEventInfo buildLoadEventInfo(ParsingLoadable<SteeringManifest> parsingLoadable, long j, long j2) {
        return new LoadEventInfo.Builder(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, j).setUri(parsingLoadable.getUri()).setResponseHeaders(parsingLoadable.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(parsingLoadable.bytesLoaded()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Uri getSteeringManifestUrl(Uri uri, Uri uri2) {
        return uri2 == null ? uri : UriUtil.isAbsolute(uri2.toString()) ? uri2 : UriUtil.resolveToUri(uri.toString(), uri2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadSteeringManifestImmediately() {
        sp0.z(this.hasStarted);
        Uri uri = this.steeringManifestUrl;
        uri.getClass();
        Uri.Builder buildUpon = uri.buildUpon();
        Callback callback = this.callback;
        callback.getClass();
        for (Map.Entry entry : new TreeMap(callback.getSteeringQueryParameters()).entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        DataSpec.Builder builder = new DataSpec.Builder();
        Uri build = buildUpon.build();
        build.getClass();
        ParsingLoadable parsingLoadable = new ParsingLoadable(this.dataSourceFactory.createDataSource(), builder.setUri(build).build(), 8, new SteeringManifestParser());
        Loader loader = this.steeringManifestLoader;
        loader.getClass();
        loader.startLoading(parsingLoadable, this.steeringManifestLoaderCallback, 0);
    }

    public void start(Uri uri, Callback callback, MediaSourceEventListener.EventDispatcher eventDispatcher) {
        this.steeringManifestUrl = uri;
        this.callback = callback;
        this.eventDispatcher = eventDispatcher;
        this.steeringManifestReloadHandler = this.clock.createHandler(Util.getCurrentOrMainLooper(), null);
        this.steeringManifestLoader = this.downloadExecutorSupplier != null ? new Loader((ReleasableExecutor) this.downloadExecutorSupplier.get()) : new Loader(TAG);
        this.hasStarted = true;
        loadSteeringManifestImmediately();
    }

    public void stop() {
        Loader loader = this.steeringManifestLoader;
        if (loader != null) {
            loader.release();
            this.steeringManifestLoader = null;
        }
        HandlerWrapper handlerWrapper = this.steeringManifestReloadHandler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
            this.steeringManifestReloadHandler = null;
        }
        this.callback = null;
        this.steeringManifest = null;
        this.eventDispatcher = null;
        this.hasStarted = false;
    }

    public SteeringManifestTracker(DataSource.Factory factory, gz4 gz4Var) {
        this(factory, gz4Var, Clock.DEFAULT);
    }
}
