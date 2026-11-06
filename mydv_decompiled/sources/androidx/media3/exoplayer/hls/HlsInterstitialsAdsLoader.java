package androidx.media3.exoplayer.hls;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.util.Pair;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.text.SubtitleParser;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.fl2;
import defpackage.gx0;
import defpackage.gz4;
import defpackage.h8;
import defpackage.j42;
import defpackage.ot1;
import defpackage.p44;
import defpackage.pt1;
import defpackage.ru;
import defpackage.s83;
import defpackage.sp0;
import defpackage.ux1;
import defpackage.v00;
import defpackage.x24;
import defpackage.y00;
import defpackage.yp0;
import defpackage.zl1;
import defpackage.zy;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HlsInterstitialsAdsLoader implements AdsLoader {
    private static final String TAG = "HlsInterstitiaAdsLoader";
    private static final int TARGET_DURATION_MULTIPLIER = 3;
    private final AdsMediaSourceSessionManager adsMediaSourceSessionManager;
    private final DataSource.Factory dataSourceFactory;
    private final Handler handler;
    private boolean isReleased;
    private final List<Listener> listeners;
    private Loader loader;
    private PlayerMessage pendingAssetListResolutionMessage;
    private ExoPlayer player;
    private final PlayerListener playerListener;
    private final Map<Object, AdPlaybackState> resumptionStates;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class AdsMediaSourceSessionManager {
        private final Map<Object, HlsAdSession> activeSessions = new HashMap();
        private final Set<Object> unsupportedAdsIds = new HashSet();

        public void addUnsupportedContentMediaSource(Object obj) {
            this.unsupportedAdsIds.add(obj);
        }

        public HlsAdSession getSession(Object obj) {
            return this.activeSessions.get(obj);
        }

        public Collection<HlsAdSession> getSessions() {
            return this.activeSessions.values();
        }

        public boolean isIdle() {
            return this.activeSessions.isEmpty();
        }

        public boolean isStartedContentMediaSource(Object obj) {
            return this.activeSessions.containsKey(obj);
        }

        public boolean isUnsupportedContentMediaSource(Object obj) {
            return this.unsupportedAdsIds.contains(obj);
        }

        public void startContentSource(Object obj, MediaItem mediaItem, AdsLoader.EventListener eventListener) {
            if (this.activeSessions.get(obj) != null) {
                zl1.l(obj, "session of adsId already started. adsId=");
            } else {
                this.activeSessions.put(obj, new HlsAdSession(obj, mediaItem, eventListener));
            }
        }

        public AdPlaybackState stopContentSource(Object obj) {
            HlsAdSession remove = this.activeSessions.remove(obj);
            this.unsupportedAdsIds.remove(obj);
            if (remove != null) {
                return remove.adPlaybackState;
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class AdsResumptionState {
        private static final String FIELD_ADS_ID = Util.intToStringMaxRadix(0);
        private static final String FIELD_AD_PLAYBACK_STATE = Util.intToStringMaxRadix(1);
        private final AdPlaybackState adPlaybackState;
        public final String adsId;

        public AdsResumptionState(String str, AdPlaybackState adPlaybackState) {
            sp0.o(str.equals(adPlaybackState.adsId));
            this.adsId = str;
            this.adPlaybackState = adPlaybackState;
        }

        public static AdsResumptionState fromBundle(Bundle bundle) {
            String string = bundle.getString(FIELD_ADS_ID);
            string.getClass();
            Bundle bundle2 = bundle.getBundle(FIELD_AD_PLAYBACK_STATE);
            bundle2.getClass();
            return new AdsResumptionState(string, AdPlaybackState.fromBundle(bundle2, 10).withAdsId(string));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AdsResumptionState)) {
                return false;
            }
            AdsResumptionState adsResumptionState = (AdsResumptionState) obj;
            return Objects.equals(this.adsId, adsResumptionState.adsId) && Objects.equals(this.adPlaybackState, adsResumptionState.adPlaybackState);
        }

        public int hashCode() {
            return Objects.hash(this.adsId, this.adPlaybackState);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(FIELD_ADS_ID, this.adsId);
            bundle.putBundle(FIELD_AD_PLAYBACK_STATE, this.adPlaybackState.toBundle(10));
            return bundle;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Asset {
        public final long durationUs;
        public final Uri uri;

        public Asset(Uri uri, long j) {
            this.uri = uri;
            this.durationUs = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Asset)) {
                return false;
            }
            Asset asset = (Asset) obj;
            return this.durationUs == asset.durationUs && Objects.equals(this.uri, asset.uri);
        }

        public int hashCode() {
            return Objects.hash(this.uri, Long.valueOf(this.durationUs));
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class AssetList {
        static final AssetList EMPTY;
        public final dy1 assets;
        public final AdPlaybackState.SkipInfo skipInfo;

        static {
            ay1 ay1Var = dy1.J;
            EMPTY = new AssetList(x24.M, null);
        }

        public AssetList(dy1 dy1Var, AdPlaybackState.SkipInfo skipInfo) {
            this.assets = dy1Var;
            this.skipInfo = skipInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetList)) {
                return false;
            }
            AssetList assetList = (AssetList) obj;
            return Objects.equals(this.assets, assetList.assets) && Objects.equals(this.skipInfo, assetList.skipInfo);
        }

        public int hashCode() {
            return Objects.hash(this.assets, this.skipInfo);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class AssetListData {
        private final int adGroupIndex;
        private final long adGroupTimeUs;
        private final int adIndexInAdGroup;
        private final Object adsId;
        private final HlsMediaPlaylist.Interstitial interstitial;
        private final MediaItem mediaItem;
        private final long targetDurationUs;

        public AssetListData(MediaItem mediaItem, Object obj, HlsMediaPlaylist.Interstitial interstitial, int i, int i2, long j, long j2) {
            sp0.o(interstitial.assetListUri != null);
            this.mediaItem = mediaItem;
            this.adsId = obj;
            this.adGroupIndex = i;
            this.adIndexInAdGroup = i2;
            this.adGroupTimeUs = j;
            this.targetDurationUs = j2;
            this.interstitial = interstitial;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AssetListData)) {
                return false;
            }
            AssetListData assetListData = (AssetListData) obj;
            return this.adGroupIndex == assetListData.adGroupIndex && this.adIndexInAdGroup == assetListData.adIndexInAdGroup && this.targetDurationUs == assetListData.targetDurationUs && this.adGroupTimeUs == assetListData.adGroupTimeUs && Objects.equals(this.mediaItem, assetListData.mediaItem) && Objects.equals(this.adsId, assetListData.adsId) && Objects.equals(this.interstitial, assetListData.interstitial);
        }

        public int hashCode() {
            return (int) ((((int) (((((((this.interstitial.hashCode() + ((this.adsId.hashCode() + (this.mediaItem.hashCode() * 31)) * 31)) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup) * 31) + this.adGroupTimeUs)) * 31) + this.targetDurationUs);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class HlsAdSession {
        private final Object adsId;
        private final MediaItem contentMediaItem;
        private final AdsLoader.EventListener eventListener;
        private HlsMediaPlaylist lastProcessedPlaylist;
        private final Map<String, long[]> assetListDurations = new HashMap();
        private final Set<String> insertedInterstitialIds = new HashSet();
        final TreeMap<Long, AssetListData> unresolvedAssetLists = new TreeMap<>();
        final TreeMap<Long, PendingSnapInResolution> pendingSnapInResolutions = new TreeMap<>();
        private AdPlaybackState adPlaybackState = AdPlaybackState.NONE;
        private boolean awaitingFirstAdToStart = true;

        public HlsAdSession(Object obj, MediaItem mediaItem, AdsLoader.EventListener eventListener) {
            this.adsId = obj;
            this.contentMediaItem = mediaItem;
            this.eventListener = eventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getSumOfAssetListDurationsUs(String str) {
            long[] jArr = this.assetListDurations.get(str);
            if (jArr == null) {
                return C.TIME_UNSET;
            }
            long j = 0;
            for (long j2 : jArr) {
                j += j2;
            }
            return j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAssetListDurations(String str) {
            this.assetListDurations.remove(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetListDurations(String str, long[] jArr) {
            this.assetListDurations.put(str, jArr);
        }

        public void addPendingSnapInResolution(long j, int i, HlsMediaPlaylist.Interstitial interstitial) {
            PendingSnapInResolution pendingSnapInResolution = new PendingSnapInResolution(i, interstitial.id);
            Iterator<Map.Entry<Long, PendingSnapInResolution>> it = this.pendingSnapInResolutions.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (pendingSnapInResolution.equals(it.next().getValue())) {
                    it.remove();
                    break;
                }
            }
            this.pendingSnapInResolutions.put(Long.valueOf(j), pendingSnapInResolution);
        }

        public void addUnresolvedAssetList(HlsMediaPlaylist.Interstitial interstitial, int i, int i2, long j, long j2) {
            long j3 = j != Long.MIN_VALUE ? j : Long.MAX_VALUE;
            this.unresolvedAssetLists.put(Long.valueOf(j3), new AssetListData(this.contentMediaItem, this.adsId, interstitial, i, i2, j3, j2));
        }

        public AssetListData getNextUnresolvedAssetListData(long j) {
            Map.Entry<Long, AssetListData> ceilingEntry = this.unresolvedAssetLists.ceilingEntry(Long.valueOf(j));
            if (ceilingEntry != null) {
                return ceilingEntry.getValue();
            }
            return null;
        }

        public AssetListData removeUnresolvedAssetList(long j) {
            if (j == Long.MIN_VALUE) {
                j = Long.MAX_VALUE;
            }
            return this.unresolvedAssetLists.remove(Long.valueOf(j));
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onAdCompleted(MediaItem mediaItem, Object obj, int i, int i2);

        void onAdSkipped(MediaItem mediaItem, Object obj, int i, int i2);

        void onAdStarted(MediaItem mediaItem, Object obj, int i, int i2);

        void onAssetListLoadCompleted(MediaItem mediaItem, Object obj, int i, int i2, AssetList assetList, JSONObject jSONObject);

        void onAssetListLoadFailed(MediaItem mediaItem, Object obj, int i, int i2, IOException iOException, boolean z);

        void onAssetListLoadStarted(MediaItem mediaItem, Object obj, int i, int i2);

        void onContentTimelineChanged(MediaItem mediaItem, Object obj, Timeline timeline);

        void onMetadata(MediaItem mediaItem, Object obj, int i, int i2, Metadata metadata);

        void onPrepareCompleted(MediaItem mediaItem, Object obj, int i, int i2);

        void onPrepareError(MediaItem mediaItem, Object obj, int i, int i2, IOException iOException);

        void onStart(MediaItem mediaItem, Object obj, AdViewProvider adViewProvider);

        void onStop(MediaItem mediaItem, Object obj, AdPlaybackState adPlaybackState);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class PendingSnapInResolution {
        private final int adGroupIndex;
        private final String interstitialId;

        public PendingSnapInResolution(int i, String str) {
            this.adGroupIndex = i;
            this.interstitialId = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingSnapInResolution)) {
                return false;
            }
            PendingSnapInResolution pendingSnapInResolution = (PendingSnapInResolution) obj;
            return this.adGroupIndex == pendingSnapInResolution.adGroupIndex && Objects.equals(this.interstitialId, pendingSnapInResolution.interstitialId);
        }

        public int hashCode() {
            return (this.interstitialId.hashCode() * 31) + this.adGroupIndex;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class PlayerListener implements Player.Listener {
        private final Timeline.Period period;

        private PlayerListener() {
            this.period = new Timeline.Period();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: handleMetadataInternal, reason: merged with bridge method [inline-methods] */
        public void lambda$onMetadata$0(final Metadata metadata) {
            ExoPlayer exoPlayer = HlsInterstitialsAdsLoader.this.player;
            if (exoPlayer == null || !exoPlayer.isPlayingAd()) {
                return;
            }
            exoPlayer.getCurrentTimeline().getPeriod(exoPlayer.getCurrentPeriodIndex(), this.period);
            final Object obj = this.period.adPlaybackState.adsId;
            if (obj == null || HlsInterstitialsAdsLoader.this.adsMediaSourceSessionManager.getSession(obj) == null) {
                return;
            }
            final MediaItem currentMediaItem = exoPlayer.getCurrentMediaItem();
            currentMediaItem.getClass();
            final int currentAdGroupIndex = exoPlayer.getCurrentAdGroupIndex();
            final int currentAdIndexInAdGroup = exoPlayer.getCurrentAdIndexInAdGroup();
            HlsInterstitialsAdsLoader.this.notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.j
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj2) {
                    ((HlsInterstitialsAdsLoader.Listener) obj2).onMetadata(MediaItem.this, obj, currentAdGroupIndex, currentAdIndexInAdGroup, metadata);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lambda$onPlaybackStateChanged$7(Player player, Object obj, Listener listener) {
            MediaItem currentMediaItem = player.getCurrentMediaItem();
            currentMediaItem.getClass();
            listener.onAdStarted(currentMediaItem, obj, player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPlaybackStateChanged$8(int i) {
            HlsAdSession session;
            ExoPlayer exoPlayer = HlsInterstitialsAdsLoader.this.player;
            byte b = 3;
            if (i == 3 && exoPlayer != null && exoPlayer.isPlayingAd()) {
                exoPlayer.getCurrentTimeline().getPeriod(exoPlayer.getCurrentPeriodIndex(), this.period);
                Object obj = this.period.adPlaybackState.adsId;
                if (obj == null || (session = HlsInterstitialsAdsLoader.this.adsMediaSourceSessionManager.getSession(obj)) == null || !session.awaitingFirstAdToStart) {
                    return;
                }
                session.awaitingFirstAdToStart = false;
                HlsInterstitialsAdsLoader.this.notifyListeners(new i(exoPlayer, obj, b));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lambda$onPositionDiscontinuity$3(Player.PositionInfo positionInfo, Object obj, Listener listener) {
            MediaItem mediaItem = positionInfo.mediaItem;
            mediaItem.getClass();
            listener.onAdStarted(mediaItem, obj, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lambda$onPositionDiscontinuity$4(Player.PositionInfo positionInfo, Object obj, Listener listener) {
            MediaItem mediaItem = positionInfo.mediaItem;
            mediaItem.getClass();
            listener.onAdStarted(mediaItem, obj, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lambda$onPositionDiscontinuity$5(Player.PositionInfo positionInfo, Object obj, Listener listener) {
            MediaItem mediaItem = positionInfo.mediaItem;
            mediaItem.getClass();
            listener.onAdSkipped(mediaItem, obj, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPositionDiscontinuity$6(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            if (HlsInterstitialsAdsLoader.this.player == null || positionInfo.mediaItem == null || positionInfo2.mediaItem == null || i == 4 || i == 6 || i == 5) {
                HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
                return;
            }
            Timeline currentTimeline = HlsInterstitialsAdsLoader.this.player.getCurrentTimeline();
            currentTimeline.getPeriod(positionInfo2.periodIndex, this.period);
            Object obj = this.period.adPlaybackState.adsId;
            HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader = HlsInterstitialsAdsLoader.this;
            if (obj == null) {
                hlsInterstitialsAdsLoader.cancelPendingAssetListResolutionMessage();
                return;
            }
            HlsAdSession session = hlsInterstitialsAdsLoader.adsMediaSourceSessionManager.getSession(obj);
            if (session == null) {
                HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
                return;
            }
            if (i == 0) {
                int i2 = positionInfo.adGroupIndex;
                if (i2 != -1) {
                    markAdAsPlayedAndNotifyListeners(positionInfo.mediaItem, obj, i2, positionInfo.adIndexInAdGroup);
                }
                if (positionInfo2.adIndexInAdGroup != -1) {
                    byte b = 0;
                    if (session.awaitingFirstAdToStart) {
                        session.awaitingFirstAdToStart = false;
                    }
                    HlsInterstitialsAdsLoader.this.notifyListeners(new i(positionInfo2, obj, b));
                    return;
                }
                return;
            }
            if (i != 1) {
                byte b2 = 2;
                if (i != 2) {
                    if (positionInfo.adGroupIndex == -1 || i != 3) {
                        return;
                    }
                    HlsInterstitialsAdsLoader.this.notifyListeners(new i(positionInfo, obj, b2));
                    return;
                }
            }
            long msToUs = Util.msToUs(positionInfo2.contentPositionMs);
            long unresolvedAssetListWindowPositionForContentPositionUs = HlsInterstitialsAdsLoader.this.getUnresolvedAssetListWindowPositionForContentPositionUs(msToUs, currentTimeline, positionInfo2.periodIndex);
            HlsInterstitialsAdsLoader.this.maybeExecuteOrSetNextAssetListResolutionMessage(obj, currentTimeline, positionInfo2.mediaItemIndex, -this.period.positionInWindowUs, unresolvedAssetListWindowPositionForContentPositionUs != C.TIME_UNSET ? unresolvedAssetListWindowPositionForContentPositionUs : msToUs);
            if (positionInfo.adIndexInAdGroup != -1 || positionInfo2.adIndexInAdGroup == -1) {
                return;
            }
            HlsInterstitialsAdsLoader.this.notifyListeners(new i(positionInfo2, obj, (byte) 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTimelineChanged$2(Timeline timeline) {
            if (timeline.isEmpty()) {
                HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
            }
        }

        private void markAdAsPlayedAndNotifyListeners(final MediaItem mediaItem, final Object obj, final int i, final int i2) {
            HlsAdSession session = HlsInterstitialsAdsLoader.this.adsMediaSourceSessionManager.getSession(obj);
            if (session != null) {
                AdPlaybackState adPlaybackState = session.adPlaybackState;
                if (adPlaybackState.getAdGroup(i).states[i2] == 1) {
                    HlsInterstitialsAdsLoader.this.putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState.withPlayedAd(i, i2));
                    HlsInterstitialsAdsLoader.this.notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.h
                        @Override // androidx.media3.common.util.Consumer
                        public final void accept(Object obj2) {
                            ((HlsInterstitialsAdsLoader.Listener) obj2).onAdCompleted(MediaItem.this, obj, i, i2);
                        }
                    });
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMetadata(Metadata metadata) {
            Util.postOrRun(HlsInterstitialsAdsLoader.this.handler, new c(this, metadata, (byte) 3));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(final int i) {
            Util.postOrRun(HlsInterstitialsAdsLoader.this.handler, new Runnable() { // from class: androidx.media3.exoplayer.hls.g
                @Override // java.lang.Runnable
                public final void run() {
                    HlsInterstitialsAdsLoader.PlayerListener.this.lambda$onPlaybackStateChanged$8(i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(final Player.PositionInfo positionInfo, final Player.PositionInfo positionInfo2, final int i) {
            Util.postOrRun(HlsInterstitialsAdsLoader.this.handler, new Runnable() { // from class: androidx.media3.exoplayer.hls.f
                @Override // java.lang.Runnable
                public final void run() {
                    HlsInterstitialsAdsLoader.PlayerListener.this.lambda$onPositionDiscontinuity$6(positionInfo, positionInfo2, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTimelineChanged(Timeline timeline, int i) {
            Util.postOrRun(HlsInterstitialsAdsLoader.this.handler, new c(this, timeline, (byte) 2));
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onCues(List list) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPositionDiscontinuity(int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onRenderedFirstFrame() {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onAudioSessionIdChanged(int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onCues(CueGroup cueGroup) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onIsLoadingChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onIsPlayingChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onLoadingChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMaxSeekToPreviousPositionChanged(long j) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerError(PlaybackException playbackException) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onRepeatModeChanged(int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSeekBackIncrementChanged(long j) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSeekForwardIncrementChanged(long j) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTracksChanged(Tracks tracks) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onVolumeChanged(float f) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onDeviceVolumeChanged(int i, boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onEvents(Player player, Player.Events events) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMediaItemTransition(MediaItem mediaItem, int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSurfaceSizeChanged(int i, int i2) {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class RunnableAtPosition implements Runnable {
        public final long adStartTimeUs;
        private final Runnable runnable;
        private final long targetDurationUs;

        public RunnableAtPosition(long j, long j2, Runnable runnable) {
            this.adStartTimeUs = j;
            this.targetDurationUs = j2;
            this.runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.runnable.run();
        }
    }

    public HlsInterstitialsAdsLoader(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.playerListener = new PlayerListener();
        this.adsMediaSourceSessionManager = new AdsMediaSourceSessionManager();
        this.resumptionStates = new HashMap();
        this.listeners = new ArrayList();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.handler = new Handler(myLooper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelPendingAssetListResolutionMessage() {
        PlayerMessage playerMessage = this.pendingAssetListResolutionMessage;
        if (playerMessage != null) {
            playerMessage.cancel();
            this.pendingAssetListResolutionMessage = null;
        }
    }

    private LongSparseArray<List<HlsMediaPlaylist.Interstitial>> filterAndSortWithResolvedStartPositions(dy1 dy1Var, HlsAdSession hlsAdSession, HlsMediaPlaylist hlsMediaPlaylist, long j, boolean z) {
        LongSparseArray<List<HlsMediaPlaylist.Interstitial>> longSparseArray = new LongSparseArray<>();
        for (int i = 0; i < dy1Var.size(); i++) {
            HlsMediaPlaylist.Interstitial interstitial = (HlsMediaPlaylist.Interstitial) dy1Var.get(i);
            if (!hlsAdSession.insertedInterstitialIds.contains(interstitial.id) && (!z || !interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST))) {
                long resolveInterstitialStartTimeUs = resolveInterstitialStartTimeUs(interstitial, hlsMediaPlaylist, j);
                List<HlsMediaPlaylist.Interstitial> arrayList = longSparseArray.indexOfKey(resolveInterstitialStartTimeUs) < 0 ? new ArrayList<>() : longSparseArray.get(resolveInterstitialStartTimeUs);
                longSparseArray.put(resolveInterstitialStartTimeUs, arrayList);
                arrayList.add(interstitial);
            }
        }
        return longSparseArray;
    }

    private AdPlaybackState getAdPlaybackState() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return null;
        }
        Timeline currentTimeline = exoPlayer.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        Object obj = currentTimeline.getPeriod(exoPlayer.getCurrentPeriodIndex(), new Timeline.Period()).adPlaybackState.adsId;
        HlsAdSession session = obj != null ? this.adsMediaSourceSessionManager.getSession(obj) : null;
        if (session != null) {
            return session.adPlaybackState;
        }
        return null;
    }

    public static long getClosestSegmentBoundaryUs(long j, HlsMediaPlaylist hlsMediaPlaylist) {
        long j2;
        long j3 = j - hlsMediaPlaylist.startTimeUs;
        if (j3 <= 0 || hlsMediaPlaylist.segments.isEmpty()) {
            return hlsMediaPlaylist.startTimeUs;
        }
        long j4 = hlsMediaPlaylist.durationUs;
        if (j3 >= j4) {
            return hlsMediaPlaylist.startTimeUs + j4;
        }
        int size = hlsMediaPlaylist.segments.size() - 1;
        int i = 0;
        int i2 = 0;
        while (i <= size) {
            i2 = ((size - i) / 2) + i;
            HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i2);
            long j5 = segment.relativeStartTimeUs;
            long j6 = segment.durationUs + j5;
            if (j3 >= j5 && j3 <= j6) {
                break;
            }
            if (j3 < j5) {
                size = i2 - 1;
            } else {
                i = i2 + 1;
            }
        }
        HlsMediaPlaylist.Segment segment2 = hlsMediaPlaylist.segments.get(i2);
        long j7 = segment2.relativeStartTimeUs;
        long j8 = j3 - j7;
        long abs = Math.abs(j3 - (j7 + segment2.durationUs));
        long j9 = hlsMediaPlaylist.startTimeUs;
        if (j8 < abs) {
            j2 = segment2.relativeStartTimeUs;
        } else {
            j9 += segment2.relativeStartTimeUs;
            j2 = segment2.durationUs;
        }
        return j9 + j2;
    }

    private static HlsMediaPlaylist.Interstitial getInterstitialById(HlsMediaPlaylist hlsMediaPlaylist, String str) {
        for (int i = 0; i < hlsMediaPlaylist.interstitials.size(); i++) {
            HlsMediaPlaylist.Interstitial interstitial = (HlsMediaPlaylist.Interstitial) hlsMediaPlaylist.interstitials.get(i);
            if (interstitial.id.equals(str)) {
                return interstitial;
            }
        }
        return null;
    }

    private Loader getLoader() {
        Loader loader = this.loader;
        if (loader != null) {
            return loader;
        }
        Loader loader2 = new Loader("HLS-interstitials");
        this.loader = loader2;
        return loader2;
    }

    private static int getLowestValidAdGroupInsertionIndex(AdPlaybackState adPlaybackState) {
        int i = adPlaybackState.adGroupCount;
        while (true) {
            i--;
            int i2 = adPlaybackState.removedAdGroupCount;
            if (i < i2) {
                return i2;
            }
            for (int i3 : adPlaybackState.getAdGroup(i).states) {
                if (i3 != 0) {
                    return i + 1;
                }
            }
        }
    }

    private RunnableAtPosition getNextAssetResolution(Object obj, long j) {
        final AssetListData nextUnresolvedAssetListData;
        final HlsAdSession session = this.adsMediaSourceSessionManager.getSession(obj);
        if (session == null || (nextUnresolvedAssetListData = session.getNextUnresolvedAssetListData(j)) == null) {
            return null;
        }
        return new RunnableAtPosition(nextUnresolvedAssetListData.adGroupTimeUs, nextUnresolvedAssetListData.targetDurationUs, new Runnable() { // from class: androidx.media3.exoplayer.hls.b
            @Override // java.lang.Runnable
            public final void run() {
                HlsInterstitialsAdsLoader.this.lambda$getNextAssetResolution$13(session, nextUnresolvedAssetListData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getResumeOffsetUsOrDeferSnapInResolution(HlsMediaPlaylist.Interstitial interstitial, long j, int i, HlsMediaPlaylist hlsMediaPlaylist, HlsAdSession hlsAdSession) {
        long j2 = interstitial.resumeOffsetUs;
        if (j2 != C.TIME_UNSET) {
            return j2;
        }
        long j3 = j != C.TIME_UNSET ? j : 0L;
        if (interstitial.snapTypes.contains(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN)) {
            long j4 = interstitial.startDateUnixUs + j3;
            if (j4 < hlsMediaPlaylist.startTimeUs + hlsMediaPlaylist.durationUs) {
                return resolveInterstitialResumeOffsetUs(interstitial, j, hlsMediaPlaylist);
            }
            hlsAdSession.addPendingSnapInResolution(j4, i, interstitial);
        }
        return j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getUnresolvedAssetListWindowPositionForContentPositionUs(long j, Timeline timeline, int i) {
        int adGroupIndexForPositionUs;
        Timeline.Period period = timeline.getPeriod(i, new Timeline.Period());
        long j2 = j - period.positionInWindowUs;
        AdPlaybackState adPlaybackState = period.adPlaybackState;
        if (adPlaybackState.adsId != null && (adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(j2, C.TIME_UNSET)) != -1) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(adGroupIndexForPositionUs);
            HlsAdSession session = this.adsMediaSourceSessionManager.getSession(adPlaybackState.adsId);
            if (session != null && session.unresolvedAssetLists.containsKey(Long.valueOf(adGroup.timeUs))) {
                return adGroup.timeUs - timeline.getWindow(period.windowIndex, new Timeline.Window()).positionInFirstPeriodUs;
            }
        }
        return C.TIME_UNSET;
    }

    private AdPlaybackState insertOrUpdateInterstitialInAdGroup(HlsMediaPlaylist hlsMediaPlaylist, MediaItem mediaItem, HlsMediaPlaylist.Interstitial interstitial, AdPlaybackState adPlaybackState, int i, long j, HlsAdSession hlsAdSession) {
        long[] jArr;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
        if (adGroup.getIndexOfAdId(interstitial.id) != -1) {
            return adPlaybackState;
        }
        int max = Math.max(adGroup.count, 0);
        long resolveInterstitialDurationUs = resolveInterstitialDurationUs(interstitial, C.TIME_UNSET);
        if (max == 0) {
            jArr = new long[1];
        } else {
            long[] jArr2 = adGroup.durationsUs;
            long[] jArr3 = new long[jArr2.length + 1];
            System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
            jArr = jArr3;
        }
        jArr[jArr.length - 1] = interstitial.playoutLimitUs;
        AdPlaybackState withContentResumeOffsetUs = adPlaybackState.withAdCount(i, max + 1).withAdId(i, max, interstitial.id).withAdDurationsUs(i, jArr).withContentResumeOffsetUs(i, Math.max(adGroup.contentResumeOffsetUs, 0L) + getResumeOffsetUsOrDeferSnapInResolution(interstitial, resolveInterstitialDurationUs, i, hlsMediaPlaylist, hlsAdSession));
        if (interstitial.skipControlDurationUs != C.TIME_UNSET || interstitial.skipControlOffsetUs != C.TIME_UNSET || interstitial.skipControlLabelId != null) {
            withContentResumeOffsetUs = withContentResumeOffsetUs.withAdSkipInfo(i, max, new AdPlaybackState.SkipInfo(interstitial.skipControlOffsetUs, interstitial.skipControlDurationUs, interstitial.skipControlLabelId));
        }
        AdPlaybackState adPlaybackState2 = withContentResumeOffsetUs;
        if (interstitial.assetUri != null) {
            return adPlaybackState2.withAvailableAdMediaItem(i, max, new MediaItem.Builder().setUri(interstitial.assetUri).setMimeType(MimeTypes.APPLICATION_M3U8).build());
        }
        hlsAdSession.addUnresolvedAssetList(interstitial, i, max, adGroup.timeUs, j);
        return adPlaybackState2;
    }

    private static boolean isHlsMediaItem(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        localConfiguration.getClass();
        return Objects.equals(localConfiguration.mimeType, MimeTypes.APPLICATION_M3U8) || Util.inferContentType(localConfiguration.uri) == 2;
    }

    private static boolean isLiveMediaItem(MediaItem mediaItem, Timeline timeline) {
        int firstWindowIndex = timeline.getFirstWindowIndex(false);
        Timeline.Window window = new Timeline.Window();
        while (firstWindowIndex != -1) {
            timeline.getWindow(firstWindowIndex, window);
            if (window.mediaItem.equals(mediaItem)) {
                return window.isLive();
            }
            firstWindowIndex = timeline.getNextWindowIndex(firstWindowIndex, 0, false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getNextAssetResolution$13(HlsAdSession hlsAdSession, AssetListData assetListData) {
        if (hlsAdSession.removeUnresolvedAssetList(assetListData.adGroupTimeUs) != null) {
            startLoadingAssetList(assetListData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleContentTimelineChanged$7(AdsMediaSource adsMediaSource, Object obj, Timeline timeline, Listener listener) {
        listener.onContentTimelineChanged(adsMediaSource.getMediaItem(), obj, timeline);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handlePrepareComplete$8(AdsMediaSource adsMediaSource, Object obj, int i, int i2, Listener listener) {
        listener.onPrepareCompleted(adsMediaSource.getMediaItem(), obj, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handlePrepareError$9(AdsMediaSource adsMediaSource, Object obj, int i, int i2, IOException iOException, Listener listener) {
        listener.onPrepareError(adsMediaSource.getMediaItem(), obj, i, i2, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWithAssetListResetAsync$0(Object obj, int i, v00 v00Var) {
        try {
            v00Var.a(Boolean.valueOf(setWithAssetListReset(obj, i)));
        } catch (RuntimeException e) {
            v00Var.b(e);
        }
    }

    private Object lambda$setWithAssetListResetAsync$2(final Object obj, final int i, final v00 v00Var) {
        Runnable runnable = new Runnable() { // from class: mt1
            @Override // java.lang.Runnable
            public final void run() {
                HlsInterstitialsAdsLoader.this.lambda$setWithAssetListResetAsync$0(obj, i, v00Var);
            }
        };
        Handler handler = this.handler;
        handler.post(runnable);
        h8 h8Var = new h8(handler, runnable, (byte) 16);
        p44 p44Var = v00Var.c;
        if (p44Var != null) {
            p44Var.a(gx0.I, h8Var);
        }
        return "setWithAssetListReset for adsId=" + obj + " at index=" + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWithAssetListResetAsync$3(Object obj, String str, v00 v00Var) {
        try {
            v00Var.a(Boolean.valueOf(setWithAssetListReset(obj, str)));
        } catch (RuntimeException e) {
            v00Var.b(e);
        }
    }

    private Object lambda$setWithAssetListResetAsync$5(Object obj, String str, v00 v00Var) {
        ru ruVar = new ru((Object) this, obj, (Object) str, (Object) v00Var, (byte) 2);
        Handler handler = this.handler;
        handler.post(ruVar);
        h8 h8Var = new h8(handler, ruVar, (byte) 17);
        p44 p44Var = v00Var.c;
        if (p44Var != null) {
            p44Var.a(gx0.I, h8Var);
        }
        return "setWithAssetListReset for adsId=" + obj + " with interstitialsId=" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startLoadingAssetList$11(AssetListData assetListData, Listener listener) {
        listener.onAssetListLoadStarted(assetListData.mediaItem, assetListData.adsId, assetListData.adGroupIndex, assetListData.adIndexInAdGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$stop$10(AdsMediaSource adsMediaSource, AdPlaybackState adPlaybackState, Listener listener) {
        MediaItem mediaItem = adsMediaSource.getMediaItem();
        Object adsId = adsMediaSource.getAdsId();
        adPlaybackState.getClass();
        listener.onStop(mediaItem, adsId, adPlaybackState);
    }

    private AdPlaybackState mapInterstitialsForLive(MediaItem mediaItem, HlsMediaPlaylist hlsMediaPlaylist, AdPlaybackState adPlaybackState, HlsAdSession hlsAdSession, long j, long j2) {
        int i;
        boolean z;
        LongSparseArray<List<HlsMediaPlaylist.Interstitial>> filterAndSortWithResolvedStartPositions = filterAndSortWithResolvedStartPositions(hlsMediaPlaylist.interstitials, hlsAdSession, hlsMediaPlaylist, j2, true);
        AdPlaybackState adPlaybackState2 = adPlaybackState;
        int i2 = 0;
        while (i2 < filterAndSortWithResolvedStartPositions.size()) {
            long keyAt = filterAndSortWithResolvedStartPositions.keyAt(i2);
            List<HlsMediaPlaylist.Interstitial> list = filterAndSortWithResolvedStartPositions.get(keyAt);
            int i3 = 0;
            while (i3 < list.size()) {
                HlsMediaPlaylist.Interstitial interstitial = list.get(i3);
                long j3 = keyAt - hlsMediaPlaylist.startTimeUs;
                if (j3 >= 0) {
                    i = i2;
                    if ((hlsMediaPlaylist.targetDurationUs * 3) + hlsMediaPlaylist.durationUs >= j3) {
                        long j4 = j + j3;
                        int i4 = adPlaybackState2.adGroupCount;
                        int i5 = i4 - 1;
                        int i6 = i4 - 2;
                        while (true) {
                            int i7 = i5;
                            i5 = i6;
                            z = true;
                            if (i5 < adPlaybackState2.removedAdGroupCount) {
                                i5 = i7;
                                break;
                            }
                            long j5 = adPlaybackState2.getAdGroup(i5).timeUs;
                            if (j5 == j4) {
                                z = false;
                                break;
                            }
                            if (j5 < j4) {
                                i5++;
                                break;
                            }
                            i6 = i5 - 1;
                        }
                        if (z) {
                            if (i5 < getLowestValidAdGroupInsertionIndex(adPlaybackState2)) {
                                Log.w(TAG, "Skipping insertion of interstitial attempted to be inserted behind an already initialized ad group.");
                            } else {
                                adPlaybackState2 = adPlaybackState2.withNewAdGroup(i5, j4);
                            }
                        }
                        AdPlaybackState insertOrUpdateInterstitialInAdGroup = insertOrUpdateInterstitialInAdGroup(hlsMediaPlaylist, mediaItem, interstitial, adPlaybackState2, i5, hlsMediaPlaylist.targetDurationUs, hlsAdSession);
                        hlsAdSession.insertedInterstitialIds.add(interstitial.id);
                        adPlaybackState2 = insertOrUpdateInterstitialInAdGroup;
                    }
                } else {
                    i = i2;
                }
                i3++;
                i2 = i;
            }
            i2++;
        }
        return maybeResolvePendingSnapInResolutions(adPlaybackState2, hlsMediaPlaylist, hlsAdSession);
    }

    private AdPlaybackState mapInterstitialsForVod(MediaItem mediaItem, HlsMediaPlaylist hlsMediaPlaylist, AdPlaybackState adPlaybackState, HlsAdSession hlsAdSession, long j, long j2, long j3) {
        List<HlsMediaPlaylist.Interstitial> list;
        int i;
        int i2;
        AdPlaybackState adPlaybackState2 = adPlaybackState;
        sp0.o(adPlaybackState2.adGroupCount == adPlaybackState2.removedAdGroupCount);
        LongSparseArray<List<HlsMediaPlaylist.Interstitial>> filterAndSortWithResolvedStartPositions = filterAndSortWithResolvedStartPositions(hlsMediaPlaylist.interstitials, hlsAdSession, hlsMediaPlaylist, j2, false);
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        long j4 = hlsMediaPlaylist2.startTimeUs + j2;
        long j5 = j4 + j;
        int i3 = 0;
        while (i3 < filterAndSortWithResolvedStartPositions.size()) {
            List<HlsMediaPlaylist.Interstitial> list2 = filterAndSortWithResolvedStartPositions.get(filterAndSortWithResolvedStartPositions.keyAt(i3));
            int i4 = 0;
            while (i4 < list2.size()) {
                HlsMediaPlaylist.Interstitial interstitial = list2.get(i4);
                long resolveInterstitialStartTimeUs = resolveInterstitialStartTimeUs(interstitial, hlsMediaPlaylist2, j3);
                if (resolveInterstitialStartTimeUs < j4 && interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE)) {
                    resolveInterstitialStartTimeUs = j4;
                } else if (resolveInterstitialStartTimeUs > j5 && interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
                    resolveInterstitialStartTimeUs = j5;
                } else if (resolveInterstitialStartTimeUs < j4 || j5 < resolveInterstitialStartTimeUs) {
                    list = list2;
                    i = i4;
                    i4 = i + 1;
                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                    list2 = list;
                }
                long j6 = j5 == resolveInterstitialStartTimeUs ? Long.MIN_VALUE : resolveInterstitialStartTimeUs - hlsMediaPlaylist2.startTimeUs;
                int i5 = i4;
                int adGroupIndexForPositionUs = adPlaybackState2.getAdGroupIndexForPositionUs(j6, hlsMediaPlaylist2.durationUs);
                if (adGroupIndexForPositionUs == -1) {
                    i2 = adPlaybackState2.removedAdGroupCount;
                    adPlaybackState2 = adPlaybackState2.withNewAdGroup(i2, j6);
                } else if (adPlaybackState2.getAdGroup(adGroupIndexForPositionUs).timeUs != j6) {
                    i2 = adGroupIndexForPositionUs + 1;
                    adPlaybackState2 = adPlaybackState2.withNewAdGroup(i2, j6);
                } else {
                    i2 = adGroupIndexForPositionUs;
                }
                i = i5;
                list = list2;
                adPlaybackState2 = insertOrUpdateInterstitialInAdGroup(hlsMediaPlaylist2, mediaItem, interstitial, adPlaybackState2, i2, hlsMediaPlaylist2.targetDurationUs, hlsAdSession);
                hlsAdSession.insertedInterstitialIds.add(interstitial.id);
                i4 = i + 1;
                hlsMediaPlaylist2 = hlsMediaPlaylist;
                list2 = list;
            }
            i3++;
            hlsMediaPlaylist2 = hlsMediaPlaylist;
        }
        return adPlaybackState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeExecuteOrSetNextAssetListResolutionMessage(Object obj, Timeline timeline, int i, long j, long j2) {
        Loader loader = this.loader;
        if (loader == null || !loader.isLoading()) {
            cancelPendingAssetListResolutionMessage();
            Timeline.Window window = timeline.getWindow(i, new Timeline.Window());
            long j3 = j2 + j;
            RunnableAtPosition nextAssetResolution = getNextAssetResolution(obj, j3);
            if (nextAssetResolution == null) {
                return;
            }
            long j4 = nextAssetResolution.adStartTimeUs;
            if (j4 == Long.MAX_VALUE) {
                j4 = window.durationUs;
            }
            long max = Math.max(j3, j4 - (nextAssetResolution.targetDurationUs * 3));
            if (max - j3 < 200000) {
                nextAssetResolution.run();
                return;
            }
            long j5 = max - j;
            HlsAdSession session = this.adsMediaSourceSessionManager.getSession(obj);
            session.getClass();
            AdPlaybackState adPlaybackState = session.adPlaybackState;
            byte b = 0;
            int adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(max, timeline.getPeriod(0, new Timeline.Period()).durationUs);
            if (adGroupIndexForPositionUs != -1) {
                AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(adGroupIndexForPositionUs);
                j5 = Math.max(j5, (adGroup.timeUs + adGroup.contentResumeOffsetUs) - j);
            }
            ExoPlayer exoPlayer = this.player;
            exoPlayer.getClass();
            PlayerMessage payload = exoPlayer.createMessage(new a(nextAssetResolution, b)).setPayload(window.mediaItem);
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            PlayerMessage position = payload.setLooper(myLooper).setPosition(Math.max(Util.usToMs(j5), 0L));
            this.pendingAssetListResolutionMessage = position;
            position.send();
        }
    }

    private AdPlaybackState maybeResolvePendingSnapInResolutions(AdPlaybackState adPlaybackState, HlsMediaPlaylist hlsMediaPlaylist, HlsAdSession hlsAdSession) {
        NavigableMap<Long, PendingSnapInResolution> headMap = hlsAdSession.pendingSnapInResolutions.headMap(Long.valueOf(hlsMediaPlaylist.startTimeUs + hlsMediaPlaylist.durationUs), true);
        if (headMap.isEmpty()) {
            return adPlaybackState;
        }
        Iterator<Map.Entry<Long, PendingSnapInResolution>> it = headMap.entrySet().iterator();
        while (it.hasNext()) {
            PendingSnapInResolution value = it.next().getValue();
            HlsMediaPlaylist.Interstitial interstitialById = getInterstitialById(hlsMediaPlaylist, value.interstitialId);
            if (interstitialById != null) {
                long sumOfAssetListDurationsUs = hlsAdSession.getSumOfAssetListDurationsUs(interstitialById.id);
                if (sumOfAssetListDurationsUs == C.TIME_UNSET) {
                    sumOfAssetListDurationsUs = resolveInterstitialDurationUs(interstitialById, 0L);
                }
                long resolveInterstitialResumeOffsetUs = resolveInterstitialResumeOffsetUs(interstitialById, sumOfAssetListDurationsUs, hlsMediaPlaylist);
                AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(value.adGroupIndex);
                long j = interstitialById.resumeOffsetUs;
                if (j != C.TIME_UNSET) {
                    sumOfAssetListDurationsUs = j;
                }
                adPlaybackState = adPlaybackState.withContentResumeOffsetUs(value.adGroupIndex, (adGroup.contentResumeOffsetUs - sumOfAssetListDurationsUs) + resolveInterstitialResumeOffsetUs);
            }
            it.remove();
        }
        return adPlaybackState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAssetResolutionFailed(Object obj, int i, int i2) {
        HlsAdSession session = this.adsMediaSourceSessionManager.getSession(obj);
        if (session != null) {
            putAndNotifyAdPlaybackStateUpdate(obj, session.adPlaybackState.withAdLoadError(i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListeners(Consumer<Listener> consumer) {
        for (int i = 0; i < this.listeners.size(); i++) {
            consumer.accept(this.listeners.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean putAndNotifyAdPlaybackStateUpdate(Object obj, AdPlaybackState adPlaybackState) {
        HlsAdSession session = this.adsMediaSourceSessionManager.getSession(obj);
        if (session == null) {
            return false;
        }
        AdPlaybackState adPlaybackState2 = session.adPlaybackState;
        session.adPlaybackState = adPlaybackState;
        if (adPlaybackState.equals(adPlaybackState2)) {
            return false;
        }
        if (session.eventListener != null) {
            session.eventListener.onAdPlaybackState(adPlaybackState);
            return true;
        }
        this.adsMediaSourceSessionManager.stopContentSource(obj);
        return false;
    }

    private void removeUnresolvedAssetListOfAdGroup(AdPlaybackState adPlaybackState, AdPlaybackState.AdGroup adGroup) {
        sp0.o(adPlaybackState.adsId != null);
        HlsAdSession session = this.adsMediaSourceSessionManager.getSession(adPlaybackState.adsId);
        if (session != null) {
            session.removeUnresolvedAssetList(adGroup.timeUs);
        }
    }

    private static long resolveInterstitialDurationUs(HlsMediaPlaylist.Interstitial interstitial, long j) {
        long j2 = interstitial.playoutLimitUs;
        if (j2 != C.TIME_UNSET) {
            return j2;
        }
        long j3 = interstitial.durationUs;
        if (j3 != C.TIME_UNSET) {
            return j3;
        }
        long j4 = interstitial.endDateUnixUs;
        if (j4 != C.TIME_UNSET) {
            return j4 - interstitial.startDateUnixUs;
        }
        long j5 = interstitial.plannedDurationUs;
        return j5 != C.TIME_UNSET ? j5 : j;
    }

    private static long resolveInterstitialResumeOffsetUs(HlsMediaPlaylist.Interstitial interstitial, long j, HlsMediaPlaylist hlsMediaPlaylist) {
        boolean contains = interstitial.snapTypes.contains(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN);
        long j2 = interstitial.resumeOffsetUs;
        if (!contains) {
            return j2 != C.TIME_UNSET ? j2 : resolveInterstitialDurationUs(interstitial, j);
        }
        if (j2 == C.TIME_UNSET) {
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            j2 = resolveInterstitialDurationUs(interstitial, j);
        }
        boolean contains2 = interstitial.snapTypes.contains(HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT);
        long j3 = interstitial.startDateUnixUs;
        if (contains2) {
            j3 = getClosestSegmentBoundaryUs(j3, hlsMediaPlaylist);
        }
        return Math.max(0L, getClosestSegmentBoundaryUs(j2 + j3, hlsMediaPlaylist) - j3);
    }

    private static long resolveInterstitialStartTimeUs(HlsMediaPlaylist.Interstitial interstitial, HlsMediaPlaylist hlsMediaPlaylist, long j) {
        if (interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE)) {
            return hlsMediaPlaylist.startTimeUs + j;
        }
        if (interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
            return hlsMediaPlaylist.startTimeUs + hlsMediaPlaylist.durationUs;
        }
        boolean contains = interstitial.snapTypes.contains(HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT);
        long j2 = interstitial.startDateUnixUs;
        return contains ? getClosestSegmentBoundaryUs(j2, hlsMediaPlaylist) : j2;
    }

    private boolean setWithAssetListReset(HlsMediaPlaylist.Interstitial interstitial, int i, HlsAdSession hlsAdSession) {
        if (i == -1) {
            return false;
        }
        ExoPlayer exoPlayer = this.player;
        exoPlayer.getClass();
        MediaItem currentMediaItem = exoPlayer.getCurrentMediaItem();
        currentMediaItem.getClass();
        AdPlaybackState withUnavailableAdGroup = hlsAdSession.adPlaybackState.withRemovedAdsAfterIndex(i, 0).withUnavailableAdGroup(i);
        AdPlaybackState.AdGroup adGroup = withUnavailableAdGroup.getAdGroup(i);
        HlsMediaPlaylist hlsMediaPlaylist = hlsAdSession.lastProcessedPlaylist;
        long j = adGroup.timeUs;
        hlsMediaPlaylist.getClass();
        hlsAdSession.addUnresolvedAssetList(interstitial, i, 0, j, hlsMediaPlaylist.targetDurationUs);
        hlsAdSession.removeAssetListDurations(interstitial.id);
        putAndNotifyAdPlaybackStateUpdate(hlsAdSession.adsId, withUnavailableAdGroup);
        MediaItem.LocalConfiguration localConfiguration = currentMediaItem.localConfiguration;
        localConfiguration.getClass();
        MediaItem.AdsConfiguration adsConfiguration = localConfiguration.adsConfiguration;
        if (adsConfiguration == null || !Objects.equals(hlsAdSession.adsId, adsConfiguration.adsId)) {
            return true;
        }
        Timeline currentTimeline = exoPlayer.getCurrentTimeline();
        maybeExecuteOrSetNextAssetListResolutionMessage(hlsAdSession.adsId, currentTimeline, exoPlayer.getCurrentMediaItemIndex(), currentTimeline.getWindow(exoPlayer.getCurrentMediaItemIndex(), new Timeline.Window()).positionInFirstPeriodUs, Util.msToUs(exoPlayer.getContentPosition()));
        return true;
    }

    private void startLoadingAssetList(AssetListData assetListData) {
        cancelPendingAssetListResolutionMessage();
        Loader loader = getLoader();
        DataSource createDataSource = this.dataSourceFactory.createDataSource();
        Uri uri = assetListData.interstitial.assetListUri;
        uri.getClass();
        loader.startLoading(new ParsingLoadable(createDataSource, uri, 6, new AssetListParser()), new LoaderCallback(assetListData), 1);
        notifyListeners(new a(assetListData, (byte) 1));
    }

    private boolean validateAdGroupForReset(HlsMediaPlaylist.Interstitial interstitial, AdPlaybackState.AdGroup adGroup) {
        for (int i = 0; i < adGroup.count; i++) {
            if (!interstitial.id.equals(adGroup.ids[i])) {
                Log.w(TAG, "only ad groups populated by a single interstitial can be reset");
                return false;
            }
            int i2 = adGroup.states[i];
            if (i2 == 0 || i2 == 1) {
                Log.w(TAG, "an ad group with playable ads can't be reset");
                return false;
            }
        }
        return true;
    }

    public void addAdResumptionState(Object obj, AdPlaybackState adPlaybackState) {
        sp0.o(!adPlaybackState.endsWithLivePostrollPlaceHolder());
        if (!this.adsMediaSourceSessionManager.isStartedContentMediaSource(obj)) {
            this.resumptionStates.put(obj, adPlaybackState.copy().withAdsId(obj));
            return;
        }
        Log.w(TAG, "Attempting to add an ad resumption state for an adsId that is currently active. adsId=" + obj);
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void clearAllAdResumptionStates() {
        this.resumptionStates.clear();
    }

    public dy1 getAdsResumptionStates() {
        String str;
        j42.l(4, "initialCapacity");
        Object[] objArr = new Object[4];
        Iterator<HlsAdSession> it = this.adsMediaSourceSessionManager.getSessions().iterator();
        int i = 0;
        while (it.hasNext()) {
            AdPlaybackState adPlaybackState = it.next().adPlaybackState;
            if (!adPlaybackState.equals(AdPlaybackState.NONE)) {
                boolean endsWithLivePostrollPlaceHolder = adPlaybackState.endsWithLivePostrollPlaceHolder();
                if (endsWithLivePostrollPlaceHolder || !(adPlaybackState.adsId instanceof String)) {
                    Object obj = adPlaybackState.adsId;
                    if (endsWithLivePostrollPlaceHolder) {
                        str = "getAdsResumptionStates(): ignoring active ad playback state of live stream. adsId=" + obj;
                    } else {
                        str = "getAdsResumptionStates(): ignoring active ad playback state when creating resumption states. `adsId` is not of type String: " + Util.castNonNull(obj).getClass();
                    }
                    Log.i(TAG, str);
                } else {
                    AdsResumptionState adsResumptionState = new AdsResumptionState((String) adPlaybackState.adsId, adPlaybackState.copy());
                    int i2 = i + 1;
                    int b = ux1.b(objArr.length, i2);
                    if (b > objArr.length) {
                        objArr = Arrays.copyOf(objArr, b);
                    }
                    objArr[i] = adsResumptionState;
                    i = i2;
                }
            }
        }
        return dy1.m(i, objArr);
    }

    public HlsMediaPlaylist.Interstitial getAssetListInterstitial(Object obj, String str) {
        HlsMediaPlaylist.Interstitial interstitialById;
        HlsAdSession session = this.adsMediaSourceSessionManager.getSession(obj);
        HlsMediaPlaylist hlsMediaPlaylist = session != null ? session.lastProcessedPlaylist : null;
        if (hlsMediaPlaylist == null || (interstitialById = getInterstitialById(hlsMediaPlaylist, str)) == null || interstitialById.assetListUri == null) {
            return null;
        }
        return interstitialById;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public boolean handleContentTimelineChanged(AdsMediaSource adsMediaSource, Timeline timeline) {
        Timeline timeline2;
        Object obj;
        AdPlaybackState mapInterstitialsForVod;
        HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader = this;
        Object adsId = adsMediaSource.getAdsId();
        HlsAdSession session = hlsInterstitialsAdsLoader.adsMediaSourceSessionManager.getSession(adsId);
        byte b = 0;
        if (!hlsInterstitialsAdsLoader.isReleased) {
            session.getClass();
            AdPlaybackState adPlaybackState = session.adPlaybackState;
            AdPlaybackState adPlaybackState2 = AdPlaybackState.NONE;
            if (adPlaybackState.equals(adPlaybackState2) || adPlaybackState.endsWithLivePostrollPlaceHolder()) {
                if (adPlaybackState.equals(adPlaybackState2)) {
                    adPlaybackState = new AdPlaybackState(adsId, new long[0]);
                    if (isLiveMediaItem(adsMediaSource.getMediaItem(), timeline)) {
                        adPlaybackState = adPlaybackState.withLivePostrollPlaceholderAppended(false);
                    }
                }
                AdPlaybackState adPlaybackState3 = adPlaybackState;
                Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
                Object obj2 = window.manifest;
                if (obj2 instanceof HlsManifest) {
                    HlsMediaPlaylist hlsMediaPlaylist = ((HlsManifest) obj2).mediaPlaylist;
                    session.lastProcessedPlaylist = hlsMediaPlaylist;
                    int size = session.unresolvedAssetLists.size();
                    boolean isLive = window.isLive();
                    MediaItem mediaItem = window.mediaItem;
                    if (isLive) {
                        mapInterstitialsForVod = hlsInterstitialsAdsLoader.mapInterstitialsForLive(mediaItem, hlsMediaPlaylist, adPlaybackState3, session, window.positionInFirstPeriodUs, window.defaultPositionUs);
                        hlsInterstitialsAdsLoader = this;
                    } else {
                        hlsInterstitialsAdsLoader = this;
                        mapInterstitialsForVod = hlsInterstitialsAdsLoader.mapInterstitialsForVod(mediaItem, hlsMediaPlaylist, adPlaybackState3, session, window.durationUs, window.positionInFirstPeriodUs, window.defaultPositionUs);
                    }
                    AdPlaybackState adPlaybackState4 = mapInterstitialsForVod;
                    ExoPlayer exoPlayer = hlsInterstitialsAdsLoader.player;
                    if (size == session.unresolvedAssetLists.size() || exoPlayer == null || !Objects.equals(window.mediaItem, exoPlayer.getCurrentMediaItem())) {
                        timeline2 = timeline;
                        obj = adsId;
                    } else {
                        int currentPeriodIndex = exoPlayer.getCurrentPeriodIndex();
                        long msToUs = Util.msToUs(exoPlayer.getContentPosition());
                        Timeline.Period period = exoPlayer.getCurrentTimeline().getPeriod(currentPeriodIndex, new Timeline.Period());
                        long j = -period.positionInWindowUs;
                        if (period.isPlaceholder) {
                            long j2 = window.durationUs;
                            if (msToUs >= j2) {
                                msToUs = j2 - 1;
                            }
                            if (window.isLive()) {
                                msToUs = window.defaultPositionUs;
                            }
                            int adGroupIndexForPositionUs = adPlaybackState4.getAdGroupIndexForPositionUs(msToUs, window.isLive() ? C.TIME_UNSET : window.durationUs);
                            if (adGroupIndexForPositionUs != -1) {
                                msToUs = adPlaybackState4.getAdGroup(adGroupIndexForPositionUs).timeUs;
                            }
                            j = window.positionInFirstPeriodUs;
                        }
                        timeline2 = timeline;
                        obj = adsId;
                        hlsInterstitialsAdsLoader.maybeExecuteOrSetNextAssetListResolutionMessage(obj, timeline2, 0, j, msToUs);
                    }
                    adPlaybackState3 = adPlaybackState4;
                } else {
                    timeline2 = timeline;
                    obj = adsId;
                }
                boolean putAndNotifyAdPlaybackStateUpdate = hlsInterstitialsAdsLoader.putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState3);
                if (!hlsInterstitialsAdsLoader.adsMediaSourceSessionManager.isUnsupportedContentMediaSource(obj)) {
                    hlsInterstitialsAdsLoader.notifyListeners(new ot1(adsMediaSource, obj, timeline2, b));
                }
                return putAndNotifyAdPlaybackStateUpdate;
            }
        } else if (session != null && session.eventListener != null) {
            AdsLoader.EventListener eventListener = session.eventListener;
            AdPlaybackState stopContentSource = hlsInterstitialsAdsLoader.adsMediaSourceSessionManager.stopContentSource(adsId);
            stopContentSource.getClass();
            if (stopContentSource.equals(AdPlaybackState.NONE)) {
                eventListener.onAdPlaybackState(new AdPlaybackState(adsId, new long[0]));
                return false;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareComplete(final AdsMediaSource adsMediaSource, final int i, final int i2) {
        final Object adsId = adsMediaSource.getAdsId();
        if (this.isReleased || this.adsMediaSourceSessionManager.isUnsupportedContentMediaSource(adsId)) {
            return;
        }
        notifyListeners(new Consumer() { // from class: qt1
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                HlsInterstitialsAdsLoader.lambda$handlePrepareComplete$8(AdsMediaSource.this, adsId, i, i2, (HlsInterstitialsAdsLoader.Listener) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareError(final AdsMediaSource adsMediaSource, final int i, final int i2, final IOException iOException) {
        final Object adsId = adsMediaSource.getAdsId();
        HlsAdSession session = this.adsMediaSourceSessionManager.getSession(adsId);
        session.getClass();
        putAndNotifyAdPlaybackStateUpdate(adsId, session.adPlaybackState.withAdLoadError(i, i2));
        if (this.isReleased || this.adsMediaSourceSessionManager.isUnsupportedContentMediaSource(adsId)) {
            return;
        }
        notifyListeners(new Consumer() { // from class: nt1
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                HlsInterstitialsAdsLoader.lambda$handlePrepareError$9(AdsMediaSource.this, adsId, i, i2, iOException, (HlsInterstitialsAdsLoader.Listener) obj);
            }
        });
    }

    public boolean isReleased() {
        return this.isReleased;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void release() {
        if (this.adsMediaSourceSessionManager.isIdle()) {
            this.player = null;
        }
        clearAllAdResumptionStates();
        cancelPendingAssetListResolutionMessage();
        Loader loader = this.loader;
        if (loader != null) {
            loader.release();
            this.loader = null;
        }
        this.isReleased = true;
    }

    public boolean removeAdResumptionState(Object obj) {
        return this.resumptionStates.remove(obj) != null;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setPlayer(Player player) {
        boolean z = true;
        sp0.z(!this.isReleased);
        sp0.o(player == null || (player instanceof ExoPlayer));
        if (Objects.equals(this.player, player)) {
            return;
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null && !this.adsMediaSourceSessionManager.isIdle()) {
            exoPlayer.removeListener(this.playerListener);
        }
        sp0.z(player == null || player.getApplicationLooper() == this.handler.getLooper());
        if (player != null && !this.adsMediaSourceSessionManager.isIdle()) {
            z = false;
        }
        sp0.z(z);
        this.player = (ExoPlayer) player;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setSupportedContentTypes(int... iArr) {
        for (int i : iArr) {
            if (i == 2) {
                return;
            }
        }
        s83.d();
    }

    public fl2 setWithAssetListResetAsync(Object obj, int i) {
        v00 v00Var = new v00();
        v00Var.c = new p44();
        y00 y00Var = new y00(v00Var);
        v00Var.b = y00Var;
        v00Var.a = pt1.class;
        try {
            Object lambda$setWithAssetListResetAsync$2 = lambda$setWithAssetListResetAsync$2(obj, i, v00Var);
            if (lambda$setWithAssetListResetAsync$2 == null) {
                return y00Var;
            }
            v00Var.a = lambda$setWithAssetListResetAsync$2;
            return y00Var;
        } catch (Exception e) {
            y00Var.J.i(e);
            return y00Var;
        }
    }

    public void setWithAvailableAdGroup(int i) {
        MediaItem mediaItem;
        sp0.z(this.player != null);
        AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState == null) {
            return;
        }
        sp0.o(i < adPlaybackState.adGroupCount);
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
        int i2 = 0;
        while (true) {
            int[] iArr = adGroup.states;
            if (i2 >= iArr.length) {
                Object obj = adPlaybackState.adsId;
                obj.getClass();
                putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState);
                removeUnresolvedAssetListOfAdGroup(adPlaybackState, adGroup);
                return;
            }
            int i3 = iArr[i2];
            if ((i3 == 3 || i3 == 2) && (mediaItem = adGroup.mediaItems[i2]) != null) {
                sp0.z(mediaItem != null);
                adPlaybackState = adPlaybackState.withAvailableAdMediaItem(i, i2, mediaItem);
            }
            i2++;
        }
    }

    public void setWithAvailableAdMediaItem(int i, int i2, MediaItem mediaItem) {
        sp0.z(this.player != null);
        if (mediaItem != null) {
            sp0.o(isHlsMediaItem(mediaItem));
        }
        AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState != null) {
            sp0.o(i < adPlaybackState.adGroupCount);
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
            sp0.o(i2 < adGroup.count);
            if (mediaItem == null) {
                mediaItem = adGroup.mediaItems[i2];
                sp0.z(mediaItem != null);
            }
            if (adGroup.states[i2] != 1) {
                AdPlaybackState withAvailableAdMediaItem = adPlaybackState.withAvailableAdMediaItem(i, i2, mediaItem);
                Object obj = withAvailableAdMediaItem.adsId;
                obj.getClass();
                putAndNotifyAdPlaybackStateUpdate(obj, withAvailableAdMediaItem);
                removeUnresolvedAssetListOfAdGroup(withAvailableAdMediaItem, adGroup);
            }
        }
    }

    public void setWithSkippedAd(int i, int i2) {
        sp0.z(this.player != null);
        AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState != null) {
            sp0.o(i < adPlaybackState.adGroupCount);
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
            sp0.o(i2 < adGroup.count);
            int i3 = adGroup.states[i2];
            if (i3 == 3 || i3 == 4) {
                Log.w(TAG, "ignoring request to set ad for state AD_STATE_SKIPPED for played or failed ad at adGroupIndex=" + i + ", adIndexInAgGroup=" + i2);
                return;
            }
            if (i3 != 2) {
                AdPlaybackState withSkippedAd = adPlaybackState.withSkippedAd(i, i2);
                Object obj = withSkippedAd.adsId;
                obj.getClass();
                putAndNotifyAdPlaybackStateUpdate(obj, withSkippedAd);
                removeUnresolvedAssetListOfAdGroup(withSkippedAd, adGroup);
            }
        }
    }

    public void setWithSkippedAdGroup(int i) {
        sp0.z(this.player != null);
        AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState != null) {
            sp0.o(i < adPlaybackState.adGroupCount);
            AdPlaybackState withSkippedAdGroup = adPlaybackState.withSkippedAdGroup(i);
            AdPlaybackState.AdGroup adGroup = withSkippedAdGroup.getAdGroup(i);
            Object obj = withSkippedAdGroup.adsId;
            obj.getClass();
            putAndNotifyAdPlaybackStateUpdate(obj, withSkippedAdGroup);
            removeUnresolvedAssetListOfAdGroup(withSkippedAdGroup, adGroup);
        }
    }

    public void skipCurrentAd() {
        this.player.getClass();
        if (this.player.isPlayingAd()) {
            setWithSkippedAd(this.player.getCurrentAdGroupIndex(), this.player.getCurrentAdIndexInAdGroup());
        }
    }

    public void skipCurrentAdGroup() {
        this.player.getClass();
        if (this.player.isPlayingAd()) {
            setWithSkippedAdGroup(this.player.getCurrentAdGroupIndex());
        }
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, AdsLoader.EventListener eventListener) {
        if (this.isReleased) {
            eventListener.onAdPlaybackState(new AdPlaybackState(obj, new long[0]));
            return;
        }
        if (this.adsMediaSourceSessionManager.isStartedContentMediaSource(obj)) {
            zy.l(obj, "' already started. Make sure adsIds are unique within the same playlist.", "media item with adsId='");
            return;
        }
        if (this.adsMediaSourceSessionManager.isIdle()) {
            ExoPlayer exoPlayer = this.player;
            sp0.w(exoPlayer, "setPlayer(Player) needs to be called");
            exoPlayer.addListener(this.playerListener);
        }
        this.adsMediaSourceSessionManager.startContentSource(obj, adsMediaSource.getMediaItem(), eventListener);
        MediaItem mediaItem = adsMediaSource.getMediaItem();
        if (!isHlsMediaItem(mediaItem)) {
            Log.w(TAG, "Unsupported media item. Playing without ads for adsId=" + obj);
            putAndNotifyAdPlaybackStateUpdate(obj, new AdPlaybackState(obj, new long[0]));
            this.adsMediaSourceSessionManager.addUnsupportedContentMediaSource(obj);
            return;
        }
        if ((obj instanceof String) && this.resumptionStates.containsKey(obj)) {
            AdPlaybackState remove = this.resumptionStates.remove(obj);
            remove.getClass();
            putAndNotifyAdPlaybackStateUpdate(obj, remove);
        } else {
            HlsAdSession session = this.adsMediaSourceSessionManager.getSession(obj);
            if (session != null) {
                session.adPlaybackState = AdPlaybackState.NONE;
            }
        }
        notifyListeners(new ot1(mediaItem, obj, adViewProvider, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void stop(AdsMediaSource adsMediaSource, AdsLoader.EventListener eventListener) {
        Object adsId = adsMediaSource.getAdsId();
        sp0.z(this.adsMediaSourceSessionManager.isStartedContentMediaSource(adsId) || this.isReleased);
        boolean isUnsupportedContentMediaSource = this.adsMediaSourceSessionManager.isUnsupportedContentMediaSource(adsId);
        AdPlaybackState stopContentSource = this.adsMediaSourceSessionManager.stopContentSource(adsId);
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null && this.adsMediaSourceSessionManager.isIdle()) {
            exoPlayer.removeListener(this.playerListener);
            if (this.isReleased) {
                this.player = null;
            }
        }
        if (!this.isReleased && !isUnsupportedContentMediaSource) {
            if (stopContentSource != null && (adsId instanceof String) && this.resumptionStates.containsKey(adsId)) {
                this.resumptionStates.put(adsId, stopContentSource);
            }
            notifyListeners(new yp0(adsMediaSource, stopContentSource, (byte) 10));
        }
        if (this.pendingAssetListResolutionMessage == null || !adsMediaSource.getMediaItem().equals(((PlayerMessage) Util.castNonNull(this.pendingAssetListResolutionMessage)).getPayload())) {
            return;
        }
        cancelPendingAssetListResolutionMessage();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class AdsMediaSourceFactory implements MediaSource.Factory {
        private final AdViewProvider adViewProvider;
        private final HlsInterstitialsAdsLoader adsLoader;
        private final MediaSource.Factory mediaSourceFactory;

        private AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, Context context, MediaSource.Factory factory, AdViewProvider adViewProvider) {
            boolean z = true;
            sp0.o((context == null && factory == null) ? false : true);
            this.adsLoader = hlsInterstitialsAdsLoader;
            if (factory == null) {
                context.getClass();
                factory = new HlsMediaSource.Factory(new DefaultDataSource.Factory(context));
            }
            this.mediaSourceFactory = factory;
            this.adViewProvider = adViewProvider;
            int[] supportedTypes = factory.getSupportedTypes();
            int length = supportedTypes.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (supportedTypes[i] == 2) {
                    break;
                } else {
                    i++;
                }
            }
            sp0.z(z);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource createMediaSource(MediaItem mediaItem) {
            mediaItem.localConfiguration.getClass();
            MediaSource createMediaSource = this.mediaSourceFactory.createMediaSource(mediaItem);
            MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
            if (adsConfiguration == null) {
                return createMediaSource;
            }
            if (!(adsConfiguration.adsId instanceof String)) {
                s83.t("Please use an AdsConfiguration with an adsId of type String when using HlsInterstitialsAdsLoader");
                return null;
            }
            DataSpec dataSpec = new DataSpec(mediaItem.localConfiguration.adsConfiguration.adTagUri);
            Object obj = mediaItem.localConfiguration.adsConfiguration.adsId;
            obj.getClass();
            return new AdsMediaSource(createMediaSource, dataSpec, obj, this.mediaSourceFactory, this.adsLoader, this.adViewProvider, false, true);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public AdsMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.mediaSourceFactory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public AdsMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.mediaSourceFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
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
        public final MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }

        public AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, AdViewProvider adViewProvider, MediaSource.Factory factory) {
            this(hlsInterstitialsAdsLoader, null, factory, adViewProvider);
        }

        public AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, AdViewProvider adViewProvider, Context context) {
            this(hlsInterstitialsAdsLoader, context, null, adViewProvider);
        }
    }

    public fl2 setWithAssetListResetAsync(Object obj, String str) {
        v00 v00Var = new v00();
        v00Var.c = new p44();
        y00 y00Var = new y00(v00Var);
        v00Var.b = y00Var;
        v00Var.a = pt1.class;
        try {
            Object lambda$setWithAssetListResetAsync$5 = lambda$setWithAssetListResetAsync$5(obj, str, v00Var);
            if (lambda$setWithAssetListResetAsync$5 == null) {
                return y00Var;
            }
            v00Var.a = lambda$setWithAssetListResetAsync$5;
            return y00Var;
        } catch (Exception e) {
            y00Var.J.i(e);
            return y00Var;
        }
    }

    public HlsInterstitialsAdsLoader(Context context) {
        this(new DefaultDataSource.Factory(context));
    }

    public void addAdResumptionState(AdsResumptionState adsResumptionState) {
        addAdResumptionState(adsResumptionState.adsId, adsResumptionState.adPlaybackState);
    }

    public boolean setWithAssetListReset(Object obj, int i) {
        HlsAdSession session = this.adsMediaSourceSessionManager.getSession(obj);
        if (session != null && !session.adPlaybackState.equals(AdPlaybackState.NONE) && i >= 0 && i < session.adPlaybackState.adGroupCount) {
            AdPlaybackState.AdGroup adGroup = session.adPlaybackState.getAdGroup(i);
            String str = adGroup.ids[0];
            str.getClass();
            HlsMediaPlaylist.Interstitial assetListInterstitial = getAssetListInterstitial(obj, str);
            return assetListInterstitial != null && validateAdGroupForReset(assetListInterstitial, adGroup) && setWithAssetListReset(assetListInterstitial, i, session);
        }
        Log.w(TAG, "no ad playback state or ad group found for ads ID " + obj + " with adGroupIndex=" + i);
        return false;
    }

    public boolean setWithAssetListReset(Object obj, String str) {
        HlsAdSession session = this.adsMediaSourceSessionManager.getSession(obj);
        if (session != null && !session.adPlaybackState.equals(AdPlaybackState.NONE)) {
            AdPlaybackState adPlaybackState = session.adPlaybackState;
            HlsMediaPlaylist.Interstitial assetListInterstitial = getAssetListInterstitial(obj, str);
            if (assetListInterstitial == null) {
                Log.w(TAG, "asset list interstitial with ID '" + str + "' not found");
                return false;
            }
            int i = adPlaybackState.removedAdGroupCount;
            while (true) {
                if (i >= adPlaybackState.adGroupCount) {
                    i = -1;
                    break;
                }
                if (adPlaybackState.getAdGroup(i).getIndexOfAdId(assetListInterstitial.id) == -1) {
                    i++;
                } else if (!validateAdGroupForReset(assetListInterstitial, adPlaybackState.getAdGroup(i))) {
                    return false;
                }
            }
            return setWithAssetListReset(assetListInterstitial, i, session);
        }
        Log.w(TAG, "no ad playback state found for ads ID " + obj);
        return false;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class LoaderCallback implements Loader.Callback<ParsingLoadable<Pair<AssetList, JSONObject>>> {
        private final AssetListData assetListData;
        private final Timeline.Window window = new Timeline.Window();

        public LoaderCallback(AssetListData assetListData) {
            this.assetListData = assetListData;
        }

        private void handleAssetResolutionFailed(final IOException iOException, final boolean z) {
            HlsInterstitialsAdsLoader.this.notifyAssetResolutionFailed(this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup);
            HlsInterstitialsAdsLoader.this.notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.d
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    HlsInterstitialsAdsLoader.LoaderCallback.this.lambda$handleAssetResolutionFailed$5(iOException, z, (HlsInterstitialsAdsLoader.Listener) obj);
                }
            });
            maybeContinueAssetResolution();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleAssetResolutionFailed$5(IOException iOException, boolean z, Listener listener) {
            listener.onAssetListLoadFailed(this.assetListData.mediaItem, this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadCanceled$3() {
            handleAssetResolutionFailed(null, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadCompleted$0(Listener listener) {
            listener.onAssetListLoadFailed(this.assetListData.mediaItem, this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup, null, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadCompleted$1(AssetList assetList, Pair pair, Listener listener) {
            listener.onAssetListLoadCompleted(this.assetListData.mediaItem, this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup, assetList, (JSONObject) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onLoadCompleted$2(ParsingLoadable parsingLoadable) {
            final Pair pair = (Pair) parsingLoadable.getResult();
            pair.getClass();
            final AssetList assetList = (AssetList) pair.first;
            HlsAdSession session = HlsInterstitialsAdsLoader.this.adsMediaSourceSessionManager.getSession(this.assetListData.adsId);
            if (session == null) {
                return;
            }
            AdPlaybackState adPlaybackState = session.adPlaybackState;
            if (adPlaybackState.getAdGroup(this.assetListData.adGroupIndex).states[this.assetListData.adIndexInAdGroup] != 0) {
                maybeContinueAssetResolution();
                HlsInterstitialsAdsLoader.this.notifyListeners(new a(this, (byte) 2));
                return;
            }
            if (assetList == null || assetList.assets.isEmpty()) {
                handleAssetResolutionFailed(new IOException("empty asset list"), false);
                return;
            }
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(this.assetListData.adGroupIndex);
            int i = adGroup.count;
            if (assetList.assets.size() > 1) {
                adPlaybackState = adPlaybackState.withAdCount(this.assetListData.adGroupIndex, (assetList.assets.size() + i) - 1);
                adGroup = adPlaybackState.getAdGroup(this.assetListData.adGroupIndex);
            }
            int i2 = this.assetListData.adIndexInAdGroup;
            long[] jArr = new long[assetList.assets.size()];
            long[] jArr2 = (long[]) adGroup.durationsUs.clone();
            long j = 0;
            for (int i3 = 0; i3 < assetList.assets.size(); i3++) {
                Asset asset = (Asset) assetList.assets.get(i3);
                if (i3 > 0) {
                    i2 = (i + i3) - 1;
                }
                long j2 = asset.durationUs;
                jArr2[i2] = j2;
                jArr[i3] = j2;
                j += j2;
                adPlaybackState = adPlaybackState.withAvailableAdMediaItem(this.assetListData.adGroupIndex, i2, new MediaItem.Builder().setUri(asset.uri).setMimeType(MimeTypes.APPLICATION_M3U8).build()).withAdId(this.assetListData.adGroupIndex, i2, this.assetListData.interstitial.id);
                if (assetList.skipInfo != null) {
                    adPlaybackState = adPlaybackState.withAdSkipInfo(this.assetListData.adGroupIndex, i2, assetList.skipInfo);
                }
            }
            session.setAssetListDurations(this.assetListData.interstitial.id, jArr);
            AdPlaybackState withAdDurationsUs = adPlaybackState.withAdDurationsUs(this.assetListData.adGroupIndex, jArr2);
            HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader = HlsInterstitialsAdsLoader.this;
            HlsMediaPlaylist.Interstitial interstitial = this.assetListData.interstitial;
            int i4 = this.assetListData.adGroupIndex;
            HlsMediaPlaylist hlsMediaPlaylist = session.lastProcessedPlaylist;
            hlsMediaPlaylist.getClass();
            HlsInterstitialsAdsLoader.this.putAndNotifyAdPlaybackStateUpdate(this.assetListData.adsId, withAdDurationsUs.withContentResumeOffsetUs(this.assetListData.adGroupIndex, hlsInterstitialsAdsLoader.getResumeOffsetUsOrDeferSnapInResolution(interstitial, j, i4, hlsMediaPlaylist, session)));
            HlsInterstitialsAdsLoader.this.notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.e
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    HlsInterstitialsAdsLoader.LoaderCallback.this.lambda$onLoadCompleted$1(assetList, pair, (HlsInterstitialsAdsLoader.Listener) obj);
                }
            });
            maybeContinueAssetResolution();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadError$4(IOException iOException) {
            handleAssetResolutionFailed(iOException, false);
        }

        private void maybeContinueAssetResolution() {
            ExoPlayer exoPlayer = HlsInterstitialsAdsLoader.this.player;
            if (exoPlayer == null || exoPlayer.getPlaybackState() == 1 || !this.assetListData.mediaItem.equals(exoPlayer.getCurrentMediaItem())) {
                return;
            }
            long msToUs = Util.msToUs(exoPlayer.getContentPosition());
            Timeline currentTimeline = exoPlayer.getCurrentTimeline();
            int currentMediaItemIndex = exoPlayer.getCurrentMediaItemIndex();
            HlsInterstitialsAdsLoader.this.maybeExecuteOrSetNextAssetListResolutionMessage(this.assetListData.adsId, currentTimeline, currentMediaItemIndex, currentTimeline.getWindow(currentMediaItemIndex, this.window).positionInFirstPeriodUs, msToUs);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<Pair<AssetList, JSONObject>> parsingLoadable, long j, long j2, boolean z) {
            Util.postOrRun(HlsInterstitialsAdsLoader.this.handler, new m(this, (byte) 2));
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<Pair<AssetList, JSONObject>> parsingLoadable, long j, long j2) {
            Util.postOrRun(HlsInterstitialsAdsLoader.this.handler, new c(this, parsingLoadable, (byte) 1));
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<Pair<AssetList, JSONObject>> parsingLoadable, long j, long j2, IOException iOException, int i) {
            Util.postOrRun(HlsInterstitialsAdsLoader.this.handler, new c(this, iOException, (byte) 0));
            return Loader.DONT_RETRY;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public final void onLoadStarted(ParsingLoadable<Pair<AssetList, JSONObject>> parsingLoadable, long j, long j2, int i) {
        }
    }
}
