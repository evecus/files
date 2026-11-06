package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.hls.HlsContentSteeringTracker;
import androidx.media3.exoplayer.hls.HlsDataSourceFactory;
import androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.ee5;
import defpackage.gz4;
import defpackage.or0;
import defpackage.rt0;
import defpackage.sp0;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DefaultHlsPlaylistTracker implements HlsPlaylistTracker, Loader.Callback<ParsingLoadable<HlsPlaylist>> {
    public static final double DEFAULT_PLAYLIST_STUCK_TARGET_DURATION_COEFFICIENT = 3.5d;
    public static final HlsPlaylistTracker.Factory FACTORY = new or0((byte) 4);
    private dy1 audioRedundantGroups;
    private BandwidthMeter bandwidthMeter;
    private final CmcdConfiguration cmcdConfiguration;
    private HlsContentSteeringTracker contentSteeringTracker;
    private final HlsDataSourceFactory dataSourceFactory;
    private final gz4 downloadExecutorSupplier;
    private MediaSourceEventListener.EventDispatcher eventDispatcher;
    private Loader initialPlaylistLoader;
    private long initialStartTimeUs;
    private boolean isLive;
    private final CopyOnWriteArrayList<HlsPlaylistTracker.PlaylistEventListener> listeners;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private HlsMultivariantPlaylist multivariantPlaylist;
    private Uri pendingPrimaryMediaPlaylistUrl;
    private final HlsPlaylistParserFactory playlistParserFactory;
    private Handler playlistRefreshHandler;
    private final double playlistStuckTargetDurationCoefficient;
    private HlsMediaPlaylist primaryMediaPlaylistSnapshot;
    private Uri primaryMediaPlaylistUrl;
    private HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener;
    private final HashMap<Uri, RedundantGroupBundle> redundantGroupBundles;
    private ParserException redundantGroupListCreationError;
    private dy1 subtitleRedundantGroups;
    private dy1 variantRedundantGroups;
    private dy1 videoRedundantGroups;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class ContentSteeringCallback implements HlsContentSteeringTracker.Callback {
        private ContentSteeringCallback() {
        }

        @Override // androidx.media3.exoplayer.hls.HlsContentSteeringTracker.Callback
        public void onCurrentPathwayUpdated(String str, String str2, long j) {
            boolean z = j == C.TIME_UNSET && DefaultHlsPlaylistTracker.this.primaryMediaPlaylistSnapshot == null;
            for (RedundantGroupBundle redundantGroupBundle : DefaultHlsPlaylistTracker.this.redundantGroupBundles.values()) {
                Uri currentPlaylistUrl = j != C.TIME_UNSET ? redundantGroupBundle.redundantGroup.getCurrentPlaylistUrl() : null;
                if (currentPlaylistUrl == null) {
                    redundantGroupBundle.switchPathway(str, z);
                } else {
                    redundantGroupBundle.excludePlaylist(currentPlaylistUrl, j, str);
                }
            }
        }

        @Override // androidx.media3.exoplayer.hls.HlsContentSteeringTracker.Callback
        public void onNewPathwayAvailable(String str, String str2, dy1 dy1Var, dy1 dy1Var2) {
            sp0.z(dy1Var.size() == dy1Var2.size());
            for (int i = 0; i < dy1Var.size(); i++) {
                RedundantGroupBundle redundantGroupBundle = (RedundantGroupBundle) DefaultHlsPlaylistTracker.this.redundantGroupBundles.get(dy1Var2.get(i));
                redundantGroupBundle.getClass();
                Uri uri = (Uri) dy1Var.get(i);
                redundantGroupBundle.addPlaylistUrl(str, uri);
                DefaultHlsPlaylistTracker.this.redundantGroupBundles.put(uri, redundantGroupBundle);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class FirstPrimaryMediaPlaylistListener implements HlsPlaylistTracker.PlaylistEventListener {
        private FirstPrimaryMediaPlaylistListener() {
        }

        private LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(Uri uri, boolean z) {
            long elapsedRealtime = Clock.DEFAULT.elapsedRealtime();
            RedundantGroupBundle redundantGroupBundle = (RedundantGroupBundle) DefaultHlsPlaylistTracker.this.redundantGroupBundles.get(uri);
            redundantGroupBundle.getClass();
            HlsRedundantGroup hlsRedundantGroup = redundantGroupBundle.redundantGroup;
            int size = hlsRedundantGroup.size();
            ee5 it = hlsRedundantGroup.getAllPlaylistUrls().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (DefaultHlsPlaylistTracker.this.isExcluded((Uri) it.next(), elapsedRealtime)) {
                    i++;
                }
            }
            int size2 = DefaultHlsPlaylistTracker.this.variantRedundantGroups.size();
            ay1 listIterator = DefaultHlsPlaylistTracker.this.variantRedundantGroups.listIterator(0);
            int i2 = 0;
            while (listIterator.hasNext()) {
                HlsRedundantGroup hlsRedundantGroup2 = (HlsRedundantGroup) listIterator.next();
                DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = DefaultHlsPlaylistTracker.this;
                if (z ? defaultHlsPlaylistTracker.isExcluded(hlsRedundantGroup2.getCurrentPlaylistUrl(), elapsedRealtime) : defaultHlsPlaylistTracker.isExcluded(hlsRedundantGroup2, elapsedRealtime)) {
                    i2++;
                }
            }
            return new LoadErrorHandlingPolicy.FallbackOptions(size, i, size2, i2, z);
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public void onPlaylistChanged() {
            DefaultHlsPlaylistTracker.this.listeners.remove(this);
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
            if (DefaultHlsPlaylistTracker.this.primaryMediaPlaylistSnapshot == null) {
                boolean z2 = DefaultHlsPlaylistTracker.this.contentSteeringTracker != null && DefaultHlsPlaylistTracker.this.contentSteeringTracker.isActive();
                LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.getFallbackSelectionFor(createFallbackOptions(uri, z2), loadErrorInfo);
                if (fallbackSelectionFor != null) {
                    if (z2 && fallbackSelectionFor.type == 1) {
                        HlsContentSteeringTracker hlsContentSteeringTracker = DefaultHlsPlaylistTracker.this.contentSteeringTracker;
                        hlsContentSteeringTracker.getClass();
                        return hlsContentSteeringTracker.excludeCurrentPathway(fallbackSelectionFor.exclusionDurationMs);
                    }
                    RedundantGroupBundle redundantGroupBundle = (RedundantGroupBundle) DefaultHlsPlaylistTracker.this.redundantGroupBundles.get(uri);
                    if (redundantGroupBundle != null) {
                        return redundantGroupBundle.excludePlaylist(uri, fallbackSelectionFor.exclusionDurationMs, null);
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class MediaPlaylistBundle implements Loader.Callback<ParsingLoadable<HlsPlaylist>> {
        private static final String BLOCK_MSN_PARAM = "_HLS_msn";
        private static final String BLOCK_PART_PARAM = "_HLS_part";
        private static final String SKIP_PARAM = "_HLS_skip";
        private boolean activeForPlayback;
        private long earliestNextLoadTimeMs;
        private long excludeUntilMs;
        private long lastSnapshotChangeMs;
        private long lastSnapshotLoadMs;
        private boolean loadPending;
        private final DataSource mediaPlaylistDataSource;
        private final Loader mediaPlaylistLoader;
        private final Set<String> pathwayIds;
        private IOException playlistError;
        private HlsMediaPlaylist playlistSnapshot;
        private final Uri playlistUrl;

        private MediaPlaylistBundle(Uri uri, String str) {
            this.playlistUrl = uri;
            HashSet hashSet = new HashSet();
            this.pathwayIds = hashSet;
            hashSet.add(str);
            this.mediaPlaylistLoader = DefaultHlsPlaylistTracker.this.downloadExecutorSupplier != null ? new Loader((ReleasableExecutor) DefaultHlsPlaylistTracker.this.downloadExecutorSupplier.get()) : new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
            this.mediaPlaylistDataSource = DefaultHlsPlaylistTracker.this.dataSourceFactory.createDataSource(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void excludePlaylist(long j) {
            this.excludeUntilMs = Clock.DEFAULT.elapsedRealtime() + j;
        }

        private Uri getMediaPlaylistUriForReload() {
            HlsMediaPlaylist hlsMediaPlaylist = this.playlistSnapshot;
            if (hlsMediaPlaylist != null) {
                HlsMediaPlaylist.ServerControl serverControl = hlsMediaPlaylist.serverControl;
                if (serverControl.skipUntilUs != C.TIME_UNSET || serverControl.canBlockReload) {
                    Uri.Builder buildUpon = this.playlistUrl.buildUpon();
                    HlsMediaPlaylist hlsMediaPlaylist2 = this.playlistSnapshot;
                    if (hlsMediaPlaylist2.serverControl.canBlockReload) {
                        buildUpon.appendQueryParameter(BLOCK_MSN_PARAM, String.valueOf(hlsMediaPlaylist2.mediaSequence + hlsMediaPlaylist2.segments.size()));
                        HlsMediaPlaylist hlsMediaPlaylist3 = this.playlistSnapshot;
                        if (hlsMediaPlaylist3.partTargetDurationUs != C.TIME_UNSET) {
                            List<HlsMediaPlaylist.Part> list = hlsMediaPlaylist3.trailingParts;
                            int size = list.size();
                            if (!list.isEmpty() && ((HlsMediaPlaylist.Part) rt0.z(list)).isPreload) {
                                size--;
                            }
                            buildUpon.appendQueryParameter(BLOCK_PART_PARAM, String.valueOf(size));
                        }
                    }
                    HlsMediaPlaylist.ServerControl serverControl2 = this.playlistSnapshot.serverControl;
                    if (serverControl2.skipUntilUs != C.TIME_UNSET) {
                        buildUpon.appendQueryParameter(SKIP_PARAM, serverControl2.canSkipDateRanges ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.playlistUrl;
        }

        private String getReportedPathwayId() {
            if (DefaultHlsPlaylistTracker.this.contentSteeringTracker == null || !DefaultHlsPlaylistTracker.this.contentSteeringTracker.isActive()) {
                return null;
            }
            RedundantGroupBundle redundantGroupBundle = (RedundantGroupBundle) DefaultHlsPlaylistTracker.this.redundantGroupBundles.get(this.playlistUrl);
            if (redundantGroupBundle != null) {
                String currentPathwayId = redundantGroupBundle.redundantGroup.getCurrentPathwayId();
                if (this.pathwayIds.contains(currentPathwayId)) {
                    return currentPathwayId;
                }
            }
            return (String) rt0.y(this.pathwayIds, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadPlaylistInternal$0(Uri uri) {
            this.loadPending = false;
            if (this.playlistUrl.equals(DefaultHlsPlaylistTracker.this.primaryMediaPlaylistUrl) || isActiveForPlayback()) {
                loadPlaylistImmediately(uri);
            }
        }

        private void loadPlaylistImmediately(Uri uri) {
            ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser = DefaultHlsPlaylistTracker.this.playlistParserFactory.createPlaylistParser(DefaultHlsPlaylistTracker.this.multivariantPlaylist, this.playlistSnapshot);
            DataSpec build = new DataSpec.Builder().setUri(uri).setFlags(1).build();
            if (DefaultHlsPlaylistTracker.this.cmcdConfiguration != null) {
                CmcdData.Factory objectType = new CmcdData.Factory(DefaultHlsPlaylistTracker.this.cmcdConfiguration, CmcdData.STREAMING_FORMAT_HLS).setObjectType(CmcdData.OBJECT_TYPE_MANIFEST);
                if (DefaultHlsPlaylistTracker.this.primaryMediaPlaylistSnapshot != null) {
                    objectType.setIsLive(true ^ DefaultHlsPlaylistTracker.this.primaryMediaPlaylistSnapshot.hasEndTag);
                }
                build = objectType.createCmcdData().addToDataSpec(build);
            }
            ParsingLoadable build2 = new ParsingLoadable.Builder(this.mediaPlaylistDataSource, build, 4, createPlaylistParser).setSteeredPathwayId(getReportedPathwayId()).build();
            this.mediaPlaylistLoader.startLoading(build2, this, DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(build2.type));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadPlaylistInternal(final Uri uri) {
            this.excludeUntilMs = 0L;
            if (this.loadPending || this.mediaPlaylistLoader.isLoading() || this.mediaPlaylistLoader.hasFatalError()) {
                return;
            }
            long elapsedRealtime = Clock.DEFAULT.elapsedRealtime();
            if (elapsedRealtime >= this.earliestNextLoadTimeMs) {
                loadPlaylistImmediately(uri);
            } else {
                this.loadPending = true;
                DefaultHlsPlaylistTracker.this.playlistRefreshHandler.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.hls.playlist.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultHlsPlaylistTracker.MediaPlaylistBundle.this.lambda$loadPlaylistInternal$0(uri);
                    }
                }, this.earliestNextLoadTimeMs - elapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void processLoadedPlaylist(HlsMediaPlaylist hlsMediaPlaylist, LoadEventInfo loadEventInfo) {
            boolean z;
            long j;
            HlsMediaPlaylist hlsMediaPlaylist2 = this.playlistSnapshot;
            long elapsedRealtime = Clock.DEFAULT.elapsedRealtime();
            this.lastSnapshotLoadMs = elapsedRealtime;
            HlsMediaPlaylist latestPlaylistSnapshot = DefaultHlsPlaylistTracker.this.getLatestPlaylistSnapshot(hlsMediaPlaylist2, hlsMediaPlaylist);
            this.playlistSnapshot = latestPlaylistSnapshot;
            IOException iOException = null;
            if (latestPlaylistSnapshot != hlsMediaPlaylist2) {
                this.playlistError = null;
                this.lastSnapshotChangeMs = elapsedRealtime;
                DefaultHlsPlaylistTracker.this.onPlaylistUpdated(this.playlistUrl, latestPlaylistSnapshot);
            } else if (!latestPlaylistSnapshot.hasEndTag) {
                if (hlsMediaPlaylist.mediaSequence + hlsMediaPlaylist.segments.size() < this.playlistSnapshot.mediaSequence) {
                    iOException = new HlsPlaylistTracker.PlaylistResetException(this.playlistUrl);
                    z = true;
                } else {
                    z = false;
                    if (elapsedRealtime - this.lastSnapshotChangeMs > DefaultHlsPlaylistTracker.this.playlistStuckTargetDurationCoefficient * Util.usToMs(r13.targetDurationUs)) {
                        iOException = new HlsPlaylistTracker.PlaylistStuckException(this.playlistUrl);
                    }
                }
                if (iOException != null) {
                    this.playlistError = iOException;
                    DefaultHlsPlaylistTracker.this.notifyPlaylistError(this.playlistUrl, new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(4), iOException, 1), z);
                }
            }
            HlsMediaPlaylist hlsMediaPlaylist3 = this.playlistSnapshot;
            if (!hlsMediaPlaylist3.serverControl.canBlockReload) {
                j = hlsMediaPlaylist3 != hlsMediaPlaylist2 ? hlsMediaPlaylist3.targetDurationUs : hlsMediaPlaylist3.targetDurationUs / 2;
            } else if (hlsMediaPlaylist3 == hlsMediaPlaylist2) {
                long j2 = hlsMediaPlaylist3.partTargetDurationUs;
                j = j2 != C.TIME_UNSET ? j2 / 2 : hlsMediaPlaylist3.targetDurationUs / 2;
            } else {
                j = 0;
            }
            this.earliestNextLoadTimeMs = (Util.usToMs(j) + elapsedRealtime) - loadEventInfo.loadDurationMs;
            if (this.playlistSnapshot.hasEndTag) {
                return;
            }
            if (this.playlistUrl.equals(DefaultHlsPlaylistTracker.this.primaryMediaPlaylistUrl) || this.activeForPlayback) {
                loadPlaylistInternal(getMediaPlaylistUriForReload());
            }
        }

        public HlsMediaPlaylist getPlaylistSnapshot() {
            return this.playlistSnapshot;
        }

        public boolean isActiveForPlayback() {
            return this.activeForPlayback;
        }

        public boolean isSnapshotValid() {
            int i;
            if (this.playlistSnapshot == null) {
                return false;
            }
            long elapsedRealtime = Clock.DEFAULT.elapsedRealtime();
            long max = Math.max(30000L, Util.usToMs(this.playlistSnapshot.durationUs));
            HlsMediaPlaylist hlsMediaPlaylist = this.playlistSnapshot;
            return hlsMediaPlaylist.hasEndTag || (i = hlsMediaPlaylist.playlistType) == 2 || i == 1 || this.lastSnapshotLoadMs + max > elapsedRealtime;
        }

        public void loadPlaylist(boolean z) {
            loadPlaylistInternal(z ? getMediaPlaylistUriForReload() : this.playlistUrl);
        }

        public void maybeThrowPlaylistRefreshError() {
            this.mediaPlaylistLoader.maybeThrowError();
            IOException iOException = this.playlistError;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
            LoadEventInfo build = new LoadEventInfo.Builder(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, j).setUri(parsingLoadable.getUri()).setSteeredPathwayId(parsingLoadable.steeredPathwayId).setResponseHeaders(parsingLoadable.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(parsingLoadable.bytesLoaded()).build();
            DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
            DefaultHlsPlaylistTracker.this.eventDispatcher.loadCanceled(build, 4);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2) {
            HlsPlaylist result = parsingLoadable.getResult();
            LoadEventInfo build = new LoadEventInfo.Builder(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, j).setUri(parsingLoadable.getUri()).setSteeredPathwayId(parsingLoadable.steeredPathwayId).setResponseHeaders(parsingLoadable.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(parsingLoadable.bytesLoaded()).build();
            if (result instanceof HlsMediaPlaylist) {
                processLoadedPlaylist((HlsMediaPlaylist) result, build);
                DefaultHlsPlaylistTracker.this.eventDispatcher.loadCompleted(build, 4);
            } else {
                this.playlistError = ParserException.createForMalformedManifest("Loaded playlist has unexpected type.", null);
                DefaultHlsPlaylistTracker.this.eventDispatcher.loadError(build, 4, this.playlistError, true);
            }
            DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, IOException iOException, int i) {
            Loader.LoadErrorAction loadErrorAction;
            LoadEventInfo build = new LoadEventInfo.Builder(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, j).setUri(parsingLoadable.getUri()).setSteeredPathwayId(parsingLoadable.steeredPathwayId).setResponseHeaders(parsingLoadable.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(parsingLoadable.bytesLoaded()).build();
            boolean z = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((parsingLoadable.getUri().getQueryParameter(BLOCK_MSN_PARAM) != null) || z) {
                int i2 = iOException instanceof HttpDataSource.InvalidResponseCodeException ? ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode : Log.LOG_LEVEL_OFF;
                if (z || i2 == 400 || i2 == 503) {
                    this.earliestNextLoadTimeMs = Clock.DEFAULT.elapsedRealtime();
                    loadPlaylist(false);
                    ((MediaSourceEventListener.EventDispatcher) Util.castNonNull(DefaultHlsPlaylistTracker.this.eventDispatcher)).loadError(build, parsingLoadable.type, iOException, true);
                    return Loader.DONT_RETRY;
                }
            }
            LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(build, new MediaLoadData(parsingLoadable.type), iOException, i);
            if (DefaultHlsPlaylistTracker.this.notifyPlaylistError(this.playlistUrl, loadErrorInfo, false)) {
                long retryDelayMsFor = DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
                loadErrorAction = retryDelayMsFor != C.TIME_UNSET ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
            } else {
                loadErrorAction = Loader.DONT_RETRY;
            }
            boolean isRetry = loadErrorAction.isRetry();
            DefaultHlsPlaylistTracker.this.eventDispatcher.loadError(build, parsingLoadable.type, iOException, !isRetry);
            if (!isRetry) {
                DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
            }
            return loadErrorAction;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadStarted(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, int i) {
            LoadEventInfo.Builder steeredPathwayId = new LoadEventInfo.Builder(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, j).setSteeredPathwayId(parsingLoadable.steeredPathwayId);
            if (i != 0) {
                steeredPathwayId.setUri(parsingLoadable.getUri()).setResponseHeaders(parsingLoadable.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(parsingLoadable.bytesLoaded());
            }
            DefaultHlsPlaylistTracker.this.eventDispatcher.loadStarted(steeredPathwayId.build(), parsingLoadable.type, i);
        }

        public void release() {
            this.mediaPlaylistLoader.release();
        }

        public void setActiveForPlayback(boolean z) {
            this.activeForPlayback = z;
        }
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory, CmcdConfiguration cmcdConfiguration, double d, gz4 gz4Var) {
        this.dataSourceFactory = hlsDataSourceFactory;
        this.playlistParserFactory = hlsPlaylistParserFactory;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.cmcdConfiguration = cmcdConfiguration;
        this.playlistStuckTargetDurationCoefficient = d;
        this.downloadExecutorSupplier = gz4Var;
        this.listeners = new CopyOnWriteArrayList<>();
        this.redundantGroupBundles = new HashMap<>();
        this.initialStartTimeUs = C.TIME_UNSET;
    }

    private void createBundles(List<HlsRedundantGroup> list, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            HlsRedundantGroup hlsRedundantGroup = list.get(i);
            RedundantGroupBundle redundantGroupBundle = new RedundantGroupBundle(hlsRedundantGroup, z);
            ee5 it = hlsRedundantGroup.getAllPlaylistUrls().iterator();
            while (it.hasNext()) {
                this.redundantGroupBundles.put((Uri) it.next(), redundantGroupBundle);
            }
        }
    }

    private static HlsMediaPlaylist.Segment getFirstOldOverlappingSegment(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        int i = (int) (hlsMediaPlaylist2.mediaSequence - hlsMediaPlaylist.mediaSequence);
        List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HlsMediaPlaylist getLatestPlaylistSnapshot(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        return !hlsMediaPlaylist2.isNewerThan(hlsMediaPlaylist) ? hlsMediaPlaylist2.hasEndTag ? hlsMediaPlaylist.copyWithEndTag() : hlsMediaPlaylist : hlsMediaPlaylist2.copyWith(getLoadedPlaylistStartTimeUs(hlsMediaPlaylist, hlsMediaPlaylist2), getLoadedPlaylistDiscontinuitySequence(hlsMediaPlaylist, hlsMediaPlaylist2));
    }

    private int getLoadedPlaylistDiscontinuitySequence(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        HlsMediaPlaylist.Segment firstOldOverlappingSegment;
        if (hlsMediaPlaylist2.hasDiscontinuitySequence) {
            return hlsMediaPlaylist2.discontinuitySequence;
        }
        HlsMediaPlaylist hlsMediaPlaylist3 = this.primaryMediaPlaylistSnapshot;
        int i = hlsMediaPlaylist3 != null ? hlsMediaPlaylist3.discontinuitySequence : 0;
        return (hlsMediaPlaylist == null || (firstOldOverlappingSegment = getFirstOldOverlappingSegment(hlsMediaPlaylist, hlsMediaPlaylist2)) == null) ? i : (hlsMediaPlaylist.discontinuitySequence + firstOldOverlappingSegment.relativeDiscontinuitySequence) - hlsMediaPlaylist2.segments.get(0).relativeDiscontinuitySequence;
    }

    private long getLoadedPlaylistStartTimeUs(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.hasProgramDateTime) {
            return hlsMediaPlaylist2.startTimeUs;
        }
        HlsMediaPlaylist hlsMediaPlaylist3 = this.primaryMediaPlaylistSnapshot;
        long j = hlsMediaPlaylist3 != null ? hlsMediaPlaylist3.startTimeUs : 0L;
        if (hlsMediaPlaylist != null) {
            int size = hlsMediaPlaylist.segments.size();
            HlsMediaPlaylist.Segment firstOldOverlappingSegment = getFirstOldOverlappingSegment(hlsMediaPlaylist, hlsMediaPlaylist2);
            if (firstOldOverlappingSegment != null) {
                return hlsMediaPlaylist.startTimeUs + firstOldOverlappingSegment.relativeStartTimeUs;
            }
            if (size == hlsMediaPlaylist2.mediaSequence - hlsMediaPlaylist.mediaSequence) {
                return hlsMediaPlaylist.getEndTimeUs();
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri getRequestUriForPrimaryChange(Uri uri) {
        HlsMediaPlaylist.RenditionReport renditionReport;
        HlsMediaPlaylist hlsMediaPlaylist = this.primaryMediaPlaylistSnapshot;
        if (hlsMediaPlaylist == null || !hlsMediaPlaylist.serverControl.canBlockReload || (renditionReport = hlsMediaPlaylist.renditionReports.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(renditionReport.lastMediaSequence));
        int i = renditionReport.lastPartIndex;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    private boolean isVariantUrl(Uri uri) {
        RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(uri);
        if (redundantGroupBundle != null) {
            return redundantGroupBundle.isVariantRedundantGroup;
        }
        return false;
    }

    private void maybeActivateForPlayback(Uri uri) {
        RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(uri);
        redundantGroupBundle.getClass();
        if (redundantGroupBundle.isActiveForPlayback(uri)) {
            return;
        }
        redundantGroupBundle.setActiveForPlayback(uri, true);
        HlsMediaPlaylist playlistSnapshot = redundantGroupBundle.getPlaylistSnapshot(uri);
        if (playlistSnapshot == null || playlistSnapshot.hasEndTag) {
            return;
        }
        redundantGroupBundle.loadPlaylist(uri, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeSetPrimaryUrl(Uri uri, boolean z) {
        if (uri.equals(this.primaryMediaPlaylistUrl) || !isVariantUrl(uri)) {
            return;
        }
        HlsMediaPlaylist hlsMediaPlaylist = this.primaryMediaPlaylistSnapshot;
        if (hlsMediaPlaylist == null || !hlsMediaPlaylist.hasEndTag) {
            RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(uri);
            redundantGroupBundle.getClass();
            HlsMediaPlaylist playlistSnapshot = redundantGroupBundle.getPlaylistSnapshot(uri);
            boolean z2 = playlistSnapshot != null && playlistSnapshot.hasEndTag;
            if (!z2 && z) {
                redundantGroupBundle.loadPlaylist(uri, getRequestUriForPrimaryChange(uri));
                this.pendingPrimaryMediaPlaylistUrl = uri;
                return;
            }
            this.primaryMediaPlaylistUrl = uri;
            if (!z2) {
                redundantGroupBundle.loadPlaylist(uri, getRequestUriForPrimaryChange(uri));
            } else {
                this.primaryMediaPlaylistSnapshot = playlistSnapshot;
                this.primaryPlaylistListener.onPrimaryPlaylistRefreshed(playlistSnapshot);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean notifyPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
        Iterator<HlsPlaylistTracker.PlaylistEventListener> it = this.listeners.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !it.next().onPlaylistError(uri, loadErrorInfo, z);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlaylistUpdated(Uri uri, HlsMediaPlaylist hlsMediaPlaylist) {
        if (uri.equals(this.pendingPrimaryMediaPlaylistUrl)) {
            this.primaryMediaPlaylistUrl = uri;
            this.pendingPrimaryMediaPlaylistUrl = null;
        }
        if (uri.equals(this.primaryMediaPlaylistUrl)) {
            if (this.primaryMediaPlaylistSnapshot == null) {
                this.isLive = !hlsMediaPlaylist.hasEndTag;
                this.initialStartTimeUs = hlsMediaPlaylist.startTimeUs;
            }
            this.primaryMediaPlaylistSnapshot = hlsMediaPlaylist;
            this.primaryPlaylistListener.onPrimaryPlaylistRefreshed(hlsMediaPlaylist);
        }
        Iterator<HlsPlaylistTracker.PlaylistEventListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlaylistChanged();
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void addListener(HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
        playlistEventListener.getClass();
        this.listeners.add(playlistEventListener);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void deactivatePlaylistForPlayback(Uri uri) {
        RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(uri);
        if (redundantGroupBundle != null) {
            redundantGroupBundle.setActiveForPlayback(uri, false);
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean excludeMediaPlaylist(Uri uri, long j) {
        RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(uri);
        if (redundantGroupBundle != null) {
            return redundantGroupBundle.excludePlaylist(uri, j, null);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public long getInitialStartTimeUs() {
        return this.initialStartTimeUs;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public HlsMultivariantPlaylist getMultivariantPlaylist() {
        return this.multivariantPlaylist;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public HlsMediaPlaylist getPlaylistSnapshot(Uri uri, boolean z) {
        RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(uri);
        if (redundantGroupBundle == null) {
            return null;
        }
        HlsMediaPlaylist playlistSnapshot = redundantGroupBundle.getPlaylistSnapshot(uri);
        if (playlistSnapshot != null && z) {
            maybeSetPrimaryUrl(uri, false);
            maybeActivateForPlayback(uri);
        }
        return playlistSnapshot;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public HlsRedundantGroup getRedundantGroup(Uri uri) {
        RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(uri);
        if (redundantGroupBundle != null) {
            return redundantGroupBundle.redundantGroup;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public dy1 getRedundantGroups(int i) {
        if (i == 0) {
            return this.variantRedundantGroups;
        }
        if (i == 1) {
            return this.videoRedundantGroups;
        }
        if (i == 2) {
            return this.audioRedundantGroups;
        }
        if (i != 3) {
            return null;
        }
        return this.subtitleRedundantGroups;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean isExcluded(HlsRedundantGroup hlsRedundantGroup, long j) {
        RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(hlsRedundantGroup.getCurrentPlaylistUrl());
        if (redundantGroupBundle != null) {
            return redundantGroupBundle.isExcluded(j);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean isLive() {
        return this.isLive;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean isSnapshotValid(Uri uri) {
        RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(uri);
        if (redundantGroupBundle == null) {
            return false;
        }
        return redundantGroupBundle.isSnapshotValid(uri);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPlaylistRefreshError(Uri uri) {
        RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(uri);
        if (redundantGroupBundle != null) {
            redundantGroupBundle.maybeThrowPlaylistRefreshError(uri);
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPrimaryPlaylistRefreshError() {
        Loader loader = this.initialPlaylistLoader;
        if (loader != null) {
            loader.maybeThrowError();
        }
        ParserException parserException = this.redundantGroupListCreationError;
        if (parserException != null) {
            throw parserException;
        }
        Uri uri = this.primaryMediaPlaylistUrl;
        if (uri != null) {
            maybeThrowPlaylistRefreshError(uri);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
        LoadEventInfo build = new LoadEventInfo.Builder(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, j).setUri(parsingLoadable.getUri()).setResponseHeaders(parsingLoadable.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(parsingLoadable.bytesLoaded()).build();
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.eventDispatcher.loadCanceled(build, 4);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2) {
        HlsPlaylist result = parsingLoadable.getResult();
        boolean z = result instanceof HlsMediaPlaylist;
        HlsMultivariantPlaylist createSingleVariantMultivariantPlaylist = z ? HlsMultivariantPlaylist.createSingleVariantMultivariantPlaylist(result.baseUri) : (HlsMultivariantPlaylist) result;
        this.multivariantPlaylist = createSingleVariantMultivariantPlaylist;
        HlsRedundantGroup.Factory factory = new HlsRedundantGroup.Factory(createSingleVariantMultivariantPlaylist);
        try {
            this.variantRedundantGroups = factory.createVariantRedundantGroupList();
            this.videoRedundantGroups = factory.createRenditionRedundantGroupList(1);
            this.audioRedundantGroups = factory.createRenditionRedundantGroupList(2);
            this.subtitleRedundantGroups = factory.createRenditionRedundantGroupList(3);
            HlsMultivariantPlaylist.ContentSteeringInfo contentSteeringInfo = this.multivariantPlaylist.contentSteeringInfo;
            if (contentSteeringInfo != null) {
                HlsDataSourceFactory hlsDataSourceFactory = this.dataSourceFactory;
                gz4 gz4Var = this.downloadExecutorSupplier;
                ContentSteeringCallback contentSteeringCallback = new ContentSteeringCallback();
                BandwidthMeter bandwidthMeter = this.bandwidthMeter;
                bandwidthMeter.getClass();
                HlsContentSteeringTracker hlsContentSteeringTracker = new HlsContentSteeringTracker(hlsDataSourceFactory, gz4Var, this, contentSteeringCallback, bandwidthMeter, Clock.DEFAULT);
                this.contentSteeringTracker = hlsContentSteeringTracker;
                hlsContentSteeringTracker.start(contentSteeringInfo.serverUri, contentSteeringInfo.pathwayId, this.eventDispatcher);
            }
            this.primaryMediaPlaylistUrl = ((HlsRedundantGroup) this.variantRedundantGroups.get(0)).getCurrentPlaylistUrl();
            this.listeners.add(new FirstPrimaryMediaPlaylistListener());
            createBundles();
            LoadEventInfo build = new LoadEventInfo.Builder(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, j).setUri(parsingLoadable.getUri()).setResponseHeaders(parsingLoadable.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(parsingLoadable.bytesLoaded()).build();
            RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(this.primaryMediaPlaylistUrl);
            redundantGroupBundle.getClass();
            if (z) {
                redundantGroupBundle.processLoadedPlaylist(parsingLoadable.getUri(), (HlsMediaPlaylist) result, build);
            } else {
                redundantGroupBundle.loadPlaylist(this.primaryMediaPlaylistUrl, false);
            }
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
            this.eventDispatcher.loadCompleted(build, 4);
        } catch (ParserException e) {
            this.redundantGroupListCreationError = e;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, IOException iOException, int i) {
        LoadEventInfo build = new LoadEventInfo.Builder(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, j).setUri(parsingLoadable.getUri()).setResponseHeaders(parsingLoadable.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(parsingLoadable.bytesLoaded()).build();
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(build, new MediaLoadData(parsingLoadable.type), iOException, i));
        boolean z = retryDelayMsFor == C.TIME_UNSET;
        this.eventDispatcher.loadError(build, parsingLoadable.type, iOException, z);
        if (z) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        }
        return z ? Loader.DONT_RETRY_FATAL : Loader.createRetryAction(false, retryDelayMsFor);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadStarted(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, int i) {
        LoadEventInfo.Builder builder = new LoadEventInfo.Builder(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, j);
        if (i != 0) {
            builder.setUri(parsingLoadable.getUri()).setResponseHeaders(parsingLoadable.getResponseHeaders()).setLoadDurationMs(j2).setBytesLoaded(parsingLoadable.bytesLoaded());
        }
        this.eventDispatcher.loadStarted(builder.build(), parsingLoadable.type, i);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void refreshPlaylist(Uri uri) {
        RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(uri);
        if (redundantGroupBundle != null) {
            redundantGroupBundle.loadPlaylist(uri, true);
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void removeListener(HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
        this.listeners.remove(playlistEventListener);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void start(Uri uri, MediaSourceEventListener.EventDispatcher eventDispatcher, HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener, BandwidthMeter bandwidthMeter) {
        this.playlistRefreshHandler = Util.createHandlerForCurrentLooper();
        this.eventDispatcher = eventDispatcher;
        this.primaryPlaylistListener = primaryPlaylistListener;
        this.bandwidthMeter = bandwidthMeter;
        DataSpec build = new DataSpec.Builder().setUri(uri).setFlags(1).build();
        if (this.cmcdConfiguration != null) {
            build = new CmcdData.Factory(this.cmcdConfiguration, CmcdData.STREAMING_FORMAT_HLS).setObjectType(CmcdData.OBJECT_TYPE_MANIFEST).createCmcdData().addToDataSpec(build);
        }
        ParsingLoadable parsingLoadable = new ParsingLoadable(this.dataSourceFactory.createDataSource(4), build, 4, this.playlistParserFactory.createPlaylistParser());
        sp0.z(this.initialPlaylistLoader == null);
        Loader loader = this.downloadExecutorSupplier != null ? new Loader((ReleasableExecutor) this.downloadExecutorSupplier.get()) : new Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.initialPlaylistLoader = loader;
        loader.startLoading(parsingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type));
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.primaryMediaPlaylistUrl = null;
        this.primaryMediaPlaylistSnapshot = null;
        this.multivariantPlaylist = null;
        HlsContentSteeringTracker hlsContentSteeringTracker = this.contentSteeringTracker;
        if (hlsContentSteeringTracker != null) {
            hlsContentSteeringTracker.stop();
        }
        this.variantRedundantGroups = null;
        this.videoRedundantGroups = null;
        this.audioRedundantGroups = null;
        this.subtitleRedundantGroups = null;
        this.redundantGroupListCreationError = null;
        this.initialStartTimeUs = C.TIME_UNSET;
        this.initialPlaylistLoader.release();
        this.initialPlaylistLoader = null;
        Iterator<RedundantGroupBundle> it = this.redundantGroupBundles.values().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.playlistRefreshHandler.removeCallbacksAndMessages(null);
        this.playlistRefreshHandler = null;
        this.bandwidthMeter = null;
        this.redundantGroupBundles.clear();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public HlsContentSteeringTracker getContentSteeringTracker() {
        return this.contentSteeringTracker;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean isExcluded(Uri uri, long j) {
        RedundantGroupBundle redundantGroupBundle = this.redundantGroupBundles.get(uri);
        if (redundantGroupBundle != null) {
            return redundantGroupBundle.isExcluded(uri, j);
        }
        return false;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class RedundantGroupBundle {
        private final boolean isVariantRedundantGroup;
        private final Map<Uri, MediaPlaylistBundle> playlistBundles;
        private final HlsRedundantGroup redundantGroup;

        private RedundantGroupBundle(HlsRedundantGroup hlsRedundantGroup, boolean z) {
            this.redundantGroup = hlsRedundantGroup;
            this.playlistBundles = createMediaPlaylistBundles(hlsRedundantGroup);
            this.isVariantRedundantGroup = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlaylistUrl(String str, Uri uri) {
            this.redundantGroup.put(str, uri);
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            if (mediaPlaylistBundle == null) {
                this.playlistBundles.put(uri, new MediaPlaylistBundle(uri, str));
            } else {
                mediaPlaylistBundle.pathwayIds.add(str);
            }
        }

        private Map<Uri, MediaPlaylistBundle> createMediaPlaylistBundles(HlsRedundantGroup hlsRedundantGroup) {
            HashMap hashMap = new HashMap();
            ee5 it = hlsRedundantGroup.getAllPathwayIds().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Uri playlistUrl = hlsRedundantGroup.getPlaylistUrl(str);
                playlistUrl.getClass();
                hashMap.put(playlistUrl, new MediaPlaylistBundle(playlistUrl, str));
            }
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean excludePlaylist(Uri uri, long j, String str) {
            sp0.z(this.playlistBundles.containsKey(uri));
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            mediaPlaylistBundle.getClass();
            mediaPlaylistBundle.excludePlaylist(j);
            if (!(DefaultHlsPlaylistTracker.this.contentSteeringTracker != null && DefaultHlsPlaylistTracker.this.contentSteeringTracker.isActive() && str == null) && switchPathway(str, false)) {
                return true;
            }
            return !(DefaultHlsPlaylistTracker.this.primaryMediaPlaylistUrl == null || uri.equals(DefaultHlsPlaylistTracker.this.primaryMediaPlaylistUrl)) || maybeSelectNewPrimaryUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public HlsMediaPlaylist getPlaylistSnapshot(Uri uri) {
            sp0.z(this.playlistBundles.containsKey(uri));
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            mediaPlaylistBundle.getClass();
            return mediaPlaylistBundle.getPlaylistSnapshot();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isActiveForPlayback(Uri uri) {
            sp0.z(this.playlistBundles.containsKey(uri));
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            mediaPlaylistBundle.getClass();
            return mediaPlaylistBundle.isActiveForPlayback();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isExcluded(long j) {
            Iterator<MediaPlaylistBundle> it = this.playlistBundles.values().iterator();
            boolean z = true;
            while (it.hasNext()) {
                z &= j <= it.next().excludeUntilMs;
            }
            return z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isSnapshotValid(Uri uri) {
            sp0.z(this.playlistBundles.containsKey(uri));
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            mediaPlaylistBundle.getClass();
            return mediaPlaylistBundle.isSnapshotValid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadPlaylist(Uri uri, boolean z) {
            sp0.z(this.playlistBundles.containsKey(uri));
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            mediaPlaylistBundle.getClass();
            mediaPlaylistBundle.loadPlaylist(z);
        }

        private boolean maybeSelectNewPrimaryUrl() {
            dy1 dy1Var = DefaultHlsPlaylistTracker.this.variantRedundantGroups;
            long elapsedRealtime = Clock.DEFAULT.elapsedRealtime();
            for (int i = 0; i < dy1Var.size(); i++) {
                Uri currentPlaylistUrl = ((HlsRedundantGroup) dy1Var.get(i)).getCurrentPlaylistUrl();
                RedundantGroupBundle redundantGroupBundle = (RedundantGroupBundle) DefaultHlsPlaylistTracker.this.redundantGroupBundles.get(currentPlaylistUrl);
                redundantGroupBundle.getClass();
                if (!redundantGroupBundle.isExcluded(currentPlaylistUrl, elapsedRealtime)) {
                    DefaultHlsPlaylistTracker.this.primaryMediaPlaylistUrl = currentPlaylistUrl;
                    redundantGroupBundle.loadPlaylist(currentPlaylistUrl, DefaultHlsPlaylistTracker.this.getRequestUriForPrimaryChange(currentPlaylistUrl));
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeThrowPlaylistRefreshError(Uri uri) {
            sp0.z(this.playlistBundles.containsKey(uri));
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            mediaPlaylistBundle.getClass();
            mediaPlaylistBundle.maybeThrowPlaylistRefreshError();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void processLoadedPlaylist(Uri uri, HlsMediaPlaylist hlsMediaPlaylist, LoadEventInfo loadEventInfo) {
            sp0.z(this.playlistBundles.containsKey(uri));
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            mediaPlaylistBundle.getClass();
            mediaPlaylistBundle.processLoadedPlaylist(hlsMediaPlaylist, loadEventInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            Iterator<MediaPlaylistBundle> it = this.playlistBundles.values().iterator();
            while (it.hasNext()) {
                it.next().release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActiveForPlayback(Uri uri, boolean z) {
            sp0.z(this.playlistBundles.containsKey(uri));
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            mediaPlaylistBundle.getClass();
            mediaPlaylistBundle.setActiveForPlayback(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean switchPathway(String str, boolean z) {
            long elapsedRealtime = Clock.DEFAULT.elapsedRealtime();
            Map<Uri, MediaPlaylistBundle> map = this.playlistBundles;
            if (str == null) {
                Iterator<MediaPlaylistBundle> it = map.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    MediaPlaylistBundle next = it.next();
                    if (!next.pathwayIds.contains(this.redundantGroup.getCurrentPathwayId()) && elapsedRealtime > next.excludeUntilMs) {
                        str = (String) next.pathwayIds.iterator().next();
                        break;
                    }
                }
            } else {
                for (MediaPlaylistBundle mediaPlaylistBundle : map.values()) {
                    if (mediaPlaylistBundle.pathwayIds.contains(str)) {
                        mediaPlaylistBundle.excludeUntilMs = 0L;
                    }
                }
            }
            if (str == null) {
                return false;
            }
            Uri currentPlaylistUrl = this.redundantGroup.getCurrentPlaylistUrl();
            this.redundantGroup.setCurrentPathwayId(str);
            Uri currentPlaylistUrl2 = this.redundantGroup.getCurrentPlaylistUrl();
            if (currentPlaylistUrl.equals(DefaultHlsPlaylistTracker.this.primaryMediaPlaylistUrl)) {
                DefaultHlsPlaylistTracker.this.maybeSetPrimaryUrl(currentPlaylistUrl2, z);
            }
            MediaPlaylistBundle mediaPlaylistBundle2 = this.playlistBundles.get(currentPlaylistUrl);
            mediaPlaylistBundle2.getClass();
            MediaPlaylistBundle mediaPlaylistBundle3 = this.playlistBundles.get(currentPlaylistUrl2);
            mediaPlaylistBundle3.getClass();
            mediaPlaylistBundle3.setActiveForPlayback(mediaPlaylistBundle2.isActiveForPlayback());
            mediaPlaylistBundle2.setActiveForPlayback(false);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadPlaylist(Uri uri, Uri uri2) {
            sp0.z(this.playlistBundles.containsKey(uri));
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            mediaPlaylistBundle.getClass();
            mediaPlaylistBundle.loadPlaylistInternal(uri2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isExcluded(Uri uri, long j) {
            sp0.z(this.playlistBundles.containsKey(uri));
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            mediaPlaylistBundle.getClass();
            return j <= mediaPlaylistBundle.excludeUntilMs;
        }
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory, CmcdConfiguration cmcdConfiguration, gz4 gz4Var) {
        this(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory, cmcdConfiguration, 3.5d, gz4Var);
    }

    private void createBundles() {
        createBundles(this.variantRedundantGroups, true);
        createBundles(this.videoRedundantGroups, false);
        createBundles(this.audioRedundantGroups, false);
        createBundles(this.subtitleRedundantGroups, false);
    }
}
