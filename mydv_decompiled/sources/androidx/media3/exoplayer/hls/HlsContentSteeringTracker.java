package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.hls.HlsContentSteeringTracker;
import androidx.media3.exoplayer.hls.HlsDataSourceFactory;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.contentsteering.ContentSteeringTracker;
import androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest;
import androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestTracker;
import defpackage.ay1;
import defpackage.c34;
import defpackage.dy1;
import defpackage.gz4;
import defpackage.h8;
import defpackage.iy1;
import defpackage.j42;
import defpackage.sp0;
import defpackage.zx1;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HlsContentSteeringTracker implements ContentSteeringTracker {
    private static final String PATHWAY_PARAM = "_HLS_pathway";
    private static final String THROUGHPUT_PARAM = "_HLS_throughput";
    private final List<HlsRedundantGroup> audioRenditionRedundantGroups;
    private final Set<String> availablePathwayIds;
    private final BandwidthMeter bandwidthMeter;
    private final Callback callback;
    private String currentPathwayId;
    private dy1 currentPathwayPriority;
    private final Set<String> excludedPathwayIds;
    private final HandlerWrapper handler;
    private boolean isActive;
    private final SteeringManifestTracker steeringManifestTracker;
    private final List<HlsRedundantGroup> subtitleRenditionRedundantGroups;
    private final List<HlsRedundantGroup> variantRedundantGroups;
    private final List<HlsRedundantGroup> videoRenditionRedundantGroups;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Callback {
        void onCurrentPathwayUpdated(String str, String str2, long j);

        void onNewPathwayAvailable(String str, String str2, dy1 dy1Var, dy1 dy1Var2);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class SteeringManifestTrackerCallback implements SteeringManifestTracker.Callback {
        private SteeringManifestTrackerCallback() {
        }

        @Override // androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestTracker.Callback
        public iy1 getSteeringQueryParameters() {
            sp0.z(HlsContentSteeringTracker.this.isActive);
            String str = HlsContentSteeringTracker.this.currentPathwayId;
            String valueOf = String.valueOf(HlsContentSteeringTracker.this.bandwidthMeter.getBitrateEstimate());
            j42.k(HlsContentSteeringTracker.PATHWAY_PARAM, str);
            j42.k(HlsContentSteeringTracker.THROUGHPUT_PARAM, valueOf);
            return c34.e(2, new Object[]{HlsContentSteeringTracker.PATHWAY_PARAM, str, HlsContentSteeringTracker.THROUGHPUT_PARAM, valueOf}, null);
        }

        @Override // androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestTracker.Callback
        public void onSteeringManifestLoadError(IOException iOException, boolean z) {
            sp0.z(HlsContentSteeringTracker.this.isActive);
            if (z && HlsContentSteeringTracker.this.currentPathwayPriority == null) {
                HlsContentSteeringTracker.this.stopInternal();
            }
        }

        @Override // androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestTracker.Callback
        public void onSteeringManifestUpdated(SteeringManifest steeringManifest) {
            sp0.z(HlsContentSteeringTracker.this.isActive);
            HlsContentSteeringTracker.this.performPathwayClones(steeringManifest.pathwayClones);
            HlsContentSteeringTracker.this.currentPathwayPriority = steeringManifest.pathwayPriority;
            HlsContentSteeringTracker.this.performPathwayEvaluationAndUpdate(C.TIME_UNSET);
        }
    }

    public HlsContentSteeringTracker(final HlsDataSourceFactory hlsDataSourceFactory, gz4 gz4Var, HlsPlaylistTracker hlsPlaylistTracker, Callback callback, BandwidthMeter bandwidthMeter, Clock clock) {
        this.steeringManifestTracker = new SteeringManifestTracker(new DataSource.Factory() { // from class: lt1
            @Override // androidx.media3.datasource.DataSource.Factory
            public final DataSource createDataSource() {
                DataSource lambda$new$0;
                lambda$new$0 = HlsContentSteeringTracker.lambda$new$0(HlsDataSourceFactory.this);
                return lambda$new$0;
            }
        }, gz4Var);
        this.callback = callback;
        this.bandwidthMeter = bandwidthMeter;
        List<HlsRedundantGroup> redundantGroups = hlsPlaylistTracker.getRedundantGroups(0);
        redundantGroups.getClass();
        this.variantRedundantGroups = redundantGroups;
        List<HlsRedundantGroup> redundantGroups2 = hlsPlaylistTracker.getRedundantGroups(1);
        redundantGroups2.getClass();
        this.videoRenditionRedundantGroups = redundantGroups2;
        List<HlsRedundantGroup> redundantGroups3 = hlsPlaylistTracker.getRedundantGroups(2);
        redundantGroups3.getClass();
        this.audioRenditionRedundantGroups = redundantGroups3;
        List<HlsRedundantGroup> redundantGroups4 = hlsPlaylistTracker.getRedundantGroups(3);
        redundantGroups4.getClass();
        this.subtitleRenditionRedundantGroups = redundantGroups4;
        sp0.z(!redundantGroups.isEmpty());
        HlsRedundantGroup hlsRedundantGroup = redundantGroups.get(0);
        hlsRedundantGroup.getClass();
        this.availablePathwayIds = new HashSet(hlsRedundantGroup.getAllPathwayIds());
        this.excludedPathwayIds = new HashSet();
        this.handler = clock.createHandler(Util.getCurrentOrMainLooper(), null);
        this.currentPathwayId = redundantGroups.get(0).getCurrentPathwayId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: expireExclusion, reason: merged with bridge method [inline-methods] */
    public void lambda$excludeCurrentPathway$1(String str) {
        sp0.z(this.isActive);
        this.excludedPathwayIds.remove(str);
        if (this.currentPathwayPriority != null) {
            performPathwayEvaluationAndUpdate(C.TIME_UNSET);
        }
    }

    private Uri.Builder getUriBuilder(Uri uri, SteeringManifest.UriReplacement uriReplacement) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        String str = uriReplacement.host;
        if (str != null) {
            clearQuery.authority(str);
        }
        TreeMap treeMap = new TreeMap();
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str2);
            queryParameter.getClass();
            treeMap.put(str2, queryParameter);
        }
        treeMap.putAll(uriReplacement.params);
        for (Map.Entry entry : treeMap.entrySet()) {
            clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return clearQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DataSource lambda$new$0(HlsDataSourceFactory hlsDataSourceFactory) {
        return hlsDataSourceFactory.createDataSource(8);
    }

    private void notifyOnCurrentPathwayUpdated(String str, long j) {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onCurrentPathwayUpdated(this.currentPathwayId, str, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performPathwayClones(dy1 dy1Var) {
        ay1 listIterator = dy1Var.listIterator(0);
        while (listIterator.hasNext()) {
            SteeringManifest.PathwayClone pathwayClone = (SteeringManifest.PathwayClone) listIterator.next();
            if (this.availablePathwayIds.contains(pathwayClone.baseId) && !this.availablePathwayIds.contains(pathwayClone.id)) {
                zx1 zx1Var = new zx1(4);
                zx1 zx1Var2 = new zx1(4);
                performPathwayClonesForVariants(pathwayClone, this.variantRedundantGroups, zx1Var, zx1Var2);
                performPathwayClonesForRenditions(pathwayClone, this.videoRenditionRedundantGroups, zx1Var, zx1Var2);
                performPathwayClonesForRenditions(pathwayClone, this.audioRenditionRedundantGroups, zx1Var, zx1Var2);
                performPathwayClonesForRenditions(pathwayClone, this.subtitleRenditionRedundantGroups, zx1Var, zx1Var2);
                this.availablePathwayIds.add(pathwayClone.id);
                Callback callback = this.callback;
                if (callback != null) {
                    callback.onNewPathwayAvailable(pathwayClone.id, pathwayClone.baseId, zx1Var.f(), zx1Var2.f());
                }
            }
        }
    }

    private void performPathwayClonesForRenditions(SteeringManifest.PathwayClone pathwayClone, List<HlsRedundantGroup> list, zx1 zx1Var, zx1 zx1Var2) {
        Uri build;
        iy1 iy1Var = pathwayClone.uriReplacement.perRenditionUris;
        for (HlsRedundantGroup hlsRedundantGroup : list) {
            Uri playlistUrl = hlsRedundantGroup.getPlaylistUrl(pathwayClone.baseId);
            playlistUrl.getClass();
            if (iy1Var.containsKey(hlsRedundantGroup.groupKey.stableId)) {
                build = (Uri) iy1Var.get(hlsRedundantGroup.groupKey.stableId);
                build.getClass();
            } else {
                build = getUriBuilder(playlistUrl, pathwayClone.uriReplacement).build();
            }
            if (build != null) {
                zx1Var.c(build);
                zx1Var2.c(playlistUrl);
            }
        }
    }

    private void performPathwayClonesForVariants(SteeringManifest.PathwayClone pathwayClone, List<HlsRedundantGroup> list, zx1 zx1Var, zx1 zx1Var2) {
        Uri build;
        iy1 iy1Var = pathwayClone.uriReplacement.perVariantUris;
        for (HlsRedundantGroup hlsRedundantGroup : list) {
            Uri playlistUrl = hlsRedundantGroup.getPlaylistUrl(pathwayClone.baseId);
            playlistUrl.getClass();
            if (iy1Var.containsKey(hlsRedundantGroup.groupKey.stableId)) {
                build = (Uri) iy1Var.get(hlsRedundantGroup.groupKey.stableId);
                build.getClass();
            } else {
                build = getUriBuilder(playlistUrl, pathwayClone.uriReplacement).build();
            }
            if (build != null) {
                zx1Var.c(build);
                zx1Var2.c(playlistUrl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"currentPathwayPriority"})
    public void performPathwayEvaluationAndUpdate(long j) {
        String str = this.currentPathwayId;
        ay1 listIterator = this.currentPathwayPriority.listIterator(0);
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String str2 = (String) listIterator.next();
            if (j == C.TIME_UNSET || !str2.equals(str)) {
                if (this.availablePathwayIds.contains(str2) && !this.excludedPathwayIds.contains(str2)) {
                    this.currentPathwayId = str2;
                    break;
                }
            }
        }
        if (this.currentPathwayId.equals(str)) {
            return;
        }
        notifyOnCurrentPathwayUpdated(str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        this.steeringManifestTracker.stop();
        this.handler.removeCallbacksAndMessages(null);
        this.isActive = false;
    }

    @Override // androidx.media3.exoplayer.upstream.contentsteering.ContentSteeringTracker
    public boolean excludeCurrentPathway(long j) {
        if (!this.isActive || this.currentPathwayPriority == null) {
            return false;
        }
        String str = this.currentPathwayId;
        performPathwayEvaluationAndUpdate(j);
        if (this.currentPathwayId.equals(str)) {
            return false;
        }
        this.excludedPathwayIds.add(str);
        this.handler.postDelayed(new h8(this, str, (byte) 15), j);
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.contentsteering.ContentSteeringTracker
    public boolean isActive() {
        return this.isActive;
    }

    @Override // androidx.media3.exoplayer.upstream.contentsteering.ContentSteeringTracker
    public void start(Uri uri, String str, MediaSourceEventListener.EventDispatcher eventDispatcher) {
        if (str != null) {
            sp0.z(this.availablePathwayIds.contains(str));
            this.currentPathwayId = str;
        }
        this.isActive = true;
        notifyOnCurrentPathwayUpdated(null, C.TIME_UNSET);
        this.steeringManifestTracker.start(uri, new SteeringManifestTrackerCallback(), eventDispatcher);
    }

    @Override // androidx.media3.exoplayer.upstream.contentsteering.ContentSteeringTracker
    public void stop() {
        stopInternal();
    }
}
