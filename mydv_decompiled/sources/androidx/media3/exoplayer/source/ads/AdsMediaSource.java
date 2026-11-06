package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.ClippingMediaPeriod;
import androidx.media3.exoplayer.source.CompositeMediaSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import defpackage.h;
import defpackage.h8;
import defpackage.hf1;
import defpackage.sp0;
import j$.util.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
    private final Map<ClippingMediaPeriod, Integer> activeContentClippingMediaPeriods;
    private final List<AdMediaSourceHolder> activeMediaSourceHolders;
    private final MediaSource.Factory adMediaSourceFactory;
    private AdMediaSourceHolder[][] adMediaSourceHolders;
    private AdPlaybackState adPlaybackState;
    private final DataSpec adTagDataSpec;
    private final AdViewProvider adViewProvider;
    private final Object adsId;
    private final AdsLoader adsLoader;
    private ComponentListener componentListener;
    final MediaItem.DrmConfiguration contentDrmConfiguration;
    private final MaskingMediaSource contentMediaSource;
    private Timeline contentTimeline;
    private final Handler mainHandler;
    private final Timeline.Period period;
    private Handler playerHandler;
    private final boolean useAdMediaSourceClipping;
    private final boolean useLazyContentSourcePreparation;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private AdLoadException(int i, Exception exc) {
            super(exc);
            this.type = i;
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i) {
            return new AdLoadException(1, new IOException(hf1.u(i, "Failed to load ad group "), exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            sp0.z(this.type == 3);
            Throwable cause = getCause();
            cause.getClass();
            return (RuntimeException) cause;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class AdMediaSourceHolder {
        private final List<MediaPeriod> activeMediaPeriods;
        private MediaItem adMediaItem;
        private MediaSource adMediaSource;
        private long endPositionUs;
        private final MediaSource.MediaPeriodId id;
        private Timeline timeline;

        private AdMediaSourceHolder(MediaSource.MediaPeriodId mediaPeriodId, long j) {
            this.id = mediaPeriodId;
            this.endPositionUs = j;
            this.activeMediaPeriods = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j, boolean z) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
            MediaPeriod clippingMediaPeriod = z ? new ClippingMediaPeriod(maskingMediaPeriod, false, j, this.endPositionUs) : maskingMediaPeriod;
            this.activeMediaPeriods.add(clippingMediaPeriod);
            MediaSource mediaSource = this.adMediaSource;
            if (mediaSource != null) {
                maskingMediaPeriod.setMediaSource(mediaSource);
                AdsMediaSource adsMediaSource = AdsMediaSource.this;
                MediaItem mediaItem = this.adMediaItem;
                mediaItem.getClass();
                maskingMediaPeriod.setPrepareListener(adsMediaSource.new AdPrepareListener(mediaItem));
            }
            Timeline timeline = this.timeline;
            if (timeline != null) {
                maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
            }
            return clippingMediaPeriod;
        }

        private MaskingMediaPeriod getActiveMaskingMediaPeriod(int i) {
            MediaPeriod mediaPeriod = this.activeMediaPeriods.get(i);
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaPeriod = ((ClippingMediaPeriod) mediaPeriod).mediaPeriod;
            }
            return (MaskingMediaPeriod) mediaPeriod;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getDurationUs() {
            Timeline timeline = this.timeline;
            return timeline == null ? C.TIME_UNSET : timeline.getPeriod(0, AdsMediaSource.this.period).getDurationUs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleSourceInfoRefresh(Timeline timeline) {
            sp0.o(timeline.getPeriodCount() == 1);
            if (this.timeline == null) {
                Object uidOfPeriod = timeline.getUidOfPeriod(0);
                for (int i = 0; i < this.activeMediaPeriods.size(); i++) {
                    MaskingMediaPeriod activeMaskingMediaPeriod = getActiveMaskingMediaPeriod(i);
                    activeMaskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(uidOfPeriod, activeMaskingMediaPeriod.id.windowSequenceNumber));
                }
                setEndPositionUs(this.endPositionUs);
            }
            this.timeline = timeline;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasMediaSource() {
            return this.adMediaSource != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initializeWithMediaSource(MediaSource mediaSource, MediaItem mediaItem) {
            this.adMediaSource = mediaSource;
            this.adMediaItem = mediaItem;
            for (int i = 0; i < this.activeMediaPeriods.size(); i++) {
                MaskingMediaPeriod activeMaskingMediaPeriod = getActiveMaskingMediaPeriod(i);
                activeMaskingMediaPeriod.setMediaSource(mediaSource);
                activeMaskingMediaPeriod.setPrepareListener(AdsMediaSource.this.new AdPrepareListener(mediaItem));
            }
            AdsMediaSource.this.prepareChildSource(this.id, mediaSource);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isInactive() {
            return this.activeMediaPeriods.isEmpty();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            if (hasMediaSource()) {
                AdsMediaSource.this.releaseChildSource(this.id);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void releaseMediaPeriod(MediaPeriod mediaPeriod) {
            this.activeMediaPeriods.remove(mediaPeriod);
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaPeriod = ((ClippingMediaPeriod) mediaPeriod).mediaPeriod;
            }
            ((MaskingMediaPeriod) mediaPeriod).releasePeriod();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndPositionUs(long j) {
            if (AdsMediaSource.this.useAdMediaSourceClipping && this.endPositionUs == Long.MIN_VALUE && j != Long.MIN_VALUE) {
                this.endPositionUs = j;
                for (int i = 0; i < this.activeMediaPeriods.size(); i++) {
                    if (this.activeMediaPeriods.get(i) instanceof ClippingMediaPeriod) {
                        ((ClippingMediaPeriod) this.activeMediaPeriods.get(i)).updateClipping(0L, j);
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class AdPrepareListener implements MaskingMediaPeriod.PrepareListener {
        private final MediaItem adMediaItem;

        public AdPrepareListener(MediaItem mediaItem) {
            this.adMediaItem = mediaItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareComplete$0(MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.adsLoader.handlePrepareComplete(AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareError$1(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
            AdsMediaSource.this.adsLoader.handlePrepareError(AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, iOException);
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.mainHandler.post(new c(this, mediaPeriodId, (byte) 0));
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(final MediaSource.MediaPeriodId mediaPeriodId, final IOException iOException) {
            MediaSourceEventListener.EventDispatcher createEventDispatcher = AdsMediaSource.this.createEventDispatcher(mediaPeriodId);
            long newId = LoadEventInfo.getNewId();
            MediaItem.LocalConfiguration localConfiguration = this.adMediaItem.localConfiguration;
            localConfiguration.getClass();
            createEventDispatcher.loadError(new LoadEventInfo.Builder(newId, new DataSpec(localConfiguration.uri), SystemClock.elapsedRealtime()).build(), 6, (IOException) AdLoadException.createForAd(iOException), true);
            AdsMediaSource.this.mainHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.b
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.AdPrepareListener.this.lambda$onPrepareError$1(mediaPeriodId, iOException);
                }
            });
        }
    }

    public AdsMediaSource(MediaSource mediaSource, DataSpec dataSpec, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, AdViewProvider adViewProvider, boolean z, boolean z2) {
        this.contentMediaSource = new MaskingMediaSource(mediaSource, z);
        MediaItem.LocalConfiguration localConfiguration = mediaSource.getMediaItem().localConfiguration;
        localConfiguration.getClass();
        this.contentDrmConfiguration = localConfiguration.drmConfiguration;
        this.adMediaSourceFactory = factory;
        this.adsLoader = adsLoader;
        this.adViewProvider = adViewProvider;
        this.adTagDataSpec = dataSpec;
        this.adsId = obj;
        this.useLazyContentSourcePreparation = z;
        this.useAdMediaSourceClipping = z2;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.period = new Timeline.Period();
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        this.activeMediaSourceHolders = new ArrayList();
        this.activeContentClippingMediaPeriods = new HashMap();
        adsLoader.setSupportedContentTypes(factory.getSupportedTypes());
    }

    private static int checkValidAdPlaybackStateUpdate(AdPlaybackState adPlaybackState, AdPlaybackState adPlaybackState2) {
        sp0.z(adPlaybackState.endsWithLivePostrollPlaceHolder() == adPlaybackState2.endsWithLivePostrollPlaceHolder());
        int i = adPlaybackState2.adGroupCount - adPlaybackState.adGroupCount;
        sp0.z(i >= 0);
        int i2 = adPlaybackState2.removedAdGroupCount;
        while (i2 < adPlaybackState.adGroupCount) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i2);
            if (adGroup.isLivePostrollPlaceholder()) {
                sp0.z(i2 == adPlaybackState.adGroupCount - 1);
                return i;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState2.getAdGroup(i2);
            sp0.z(adGroup.timeUs == adGroup2.timeUs);
            if (adGroup.hasUnplayedAds()) {
                sp0.z(adGroup.count <= adGroup2.count);
                for (int i3 = 0; i3 < adGroup.count; i3++) {
                    MediaItem mediaItem = adGroup.mediaItems[i3];
                    if (mediaItem != null && adGroup.states[i3] == 1) {
                        sp0.z(mediaItem.equals(adGroup2.mediaItems[i3]));
                    }
                }
            }
            i2++;
        }
        return i;
    }

    @RequiresNonNull({"adPlaybackState"})
    private long[][] getAdDurationsUs() {
        AdMediaSourceHolder adMediaSourceHolder;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        adPlaybackState.getClass();
        boolean endsWithLivePostrollPlaceHolder = adPlaybackState.endsWithLivePostrollPlaceHolder();
        int length = this.adMediaSourceHolders.length + (endsWithLivePostrollPlaceHolder ? 1 : 0);
        long[][] jArr = new long[length][];
        int i = 0;
        while (true) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
            if (i >= adMediaSourceHolderArr.length) {
                break;
            }
            int max = this.useAdMediaSourceClipping ? Math.max(adPlaybackState.getAdGroup(i).count, 0) : adMediaSourceHolderArr[i].length;
            jArr[i] = new long[max];
            int i2 = 0;
            while (i2 < max) {
                long j = adPlaybackState.getAdGroup(i).durationsUs.length > i2 ? adPlaybackState.getAdGroup(i).durationsUs[i2] : -9223372036854775807L;
                if (j == C.TIME_UNSET || !this.useAdMediaSourceClipping) {
                    AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.adMediaSourceHolders[i];
                    if (adMediaSourceHolderArr2.length <= i2 || (adMediaSourceHolder = adMediaSourceHolderArr2[i2]) == null) {
                        jArr[i][i2] = -9223372036854775807L;
                    } else {
                        jArr[i][i2] = adMediaSourceHolder.getDurationUs();
                    }
                } else {
                    jArr[i][i2] = j;
                }
                i2++;
            }
            i++;
        }
        if (endsWithLivePostrollPlaceHolder) {
            jArr[length - 1] = new long[0];
        }
        return jArr;
    }

    private static MediaItem.AdsConfiguration getAdsConfiguration(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (localConfiguration == null) {
            return null;
        }
        return localConfiguration.adsConfiguration;
    }

    private static AdMediaSourceHolder[][] growAdMediaSourceHolderGrid(AdMediaSourceHolder[][] adMediaSourceHolderArr, int i) {
        int length = adMediaSourceHolderArr.length + i;
        AdMediaSourceHolder[][] adMediaSourceHolderArr2 = new AdMediaSourceHolder[length][];
        System.arraycopy(adMediaSourceHolderArr, 0, adMediaSourceHolderArr2, 0, adMediaSourceHolderArr.length);
        for (int length2 = adMediaSourceHolderArr.length; length2 < length; length2++) {
            adMediaSourceHolderArr2[length2] = new AdMediaSourceHolder[0];
        }
        return adMediaSourceHolderArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onChildSourceInfoRefreshed$2(Timeline timeline) {
        boolean handleContentTimelineChanged = this.adsLoader.handleContentTimelineChanged(this, timeline);
        sp0.z((handleContentTimelineChanged && this.useLazyContentSourcePreparation) ? false : true);
        if (handleContentTimelineChanged || this.useLazyContentSourcePreparation) {
            return;
        }
        Handler handler = this.playerHandler;
        handler.getClass();
        handler.post(new h(this, (byte) 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareSourceInternal$0(ComponentListener componentListener) {
        this.adsLoader.start(this, this.adTagDataSpec, this.adsId, this.adViewProvider, componentListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseSourceInternal$1(ComponentListener componentListener) {
        this.adsLoader.stop(this, componentListener);
    }

    private void maybeUpdateAdMediaSources() {
        MediaItem mediaItem;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null) {
            return;
        }
        for (int i = 0; i < this.adMediaSourceHolders.length; i++) {
            int i2 = 0;
            while (true) {
                AdMediaSourceHolder[] adMediaSourceHolderArr = this.adMediaSourceHolders[i];
                if (i2 < adMediaSourceHolderArr.length) {
                    AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr[i2];
                    AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
                    if (adMediaSourceHolder != null && !adMediaSourceHolder.hasMediaSource()) {
                        MediaItem[] mediaItemArr = adGroup.mediaItems;
                        if (i2 < mediaItemArr.length && (mediaItem = mediaItemArr[i2]) != null) {
                            if (this.contentDrmConfiguration != null) {
                                mediaItem = mediaItem.buildUpon().setDrmConfiguration(this.contentDrmConfiguration).build();
                            }
                            adMediaSourceHolder.initializeWithMediaSource(this.adMediaSourceFactory.createMediaSource(mediaItem), mediaItem);
                        }
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeUpdateSourceInfo() {
        Timeline timeline = this.contentTimeline;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null || timeline == null) {
            return;
        }
        if (adPlaybackState.adGroupCount == 0) {
            refreshSourceInfo(timeline);
        } else {
            this.adPlaybackState = adPlaybackState.withAdDurationsUs(getAdDurationsUs());
            refreshSourceInfo(new SinglePeriodAdTimeline(timeline, this.adPlaybackState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        AdPlaybackState adPlaybackState2 = this.adPlaybackState;
        if (adPlaybackState2 == null) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = new AdMediaSourceHolder[adPlaybackState.adGroupCount - (adPlaybackState.endsWithLivePostrollPlaceHolder() ? 1 : 0)][];
            this.adMediaSourceHolders = adMediaSourceHolderArr;
            Arrays.fill(adMediaSourceHolderArr, new AdMediaSourceHolder[0]);
        } else {
            int checkValidAdPlaybackStateUpdate = checkValidAdPlaybackStateUpdate(adPlaybackState2, adPlaybackState);
            if (checkValidAdPlaybackStateUpdate > 0) {
                this.adMediaSourceHolders = growAdMediaSourceHolderGrid(this.adMediaSourceHolders, checkValidAdPlaybackStateUpdate);
            }
            if (this.useAdMediaSourceClipping) {
                for (int i = 0; i < this.activeMediaSourceHolders.size(); i++) {
                    AdMediaSourceHolder adMediaSourceHolder = this.activeMediaSourceHolders.get(i);
                    MediaSource.MediaPeriodId mediaPeriodId = adMediaSourceHolder.id;
                    long j = adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex).durationsUs[mediaPeriodId.adIndexInAdGroup];
                    if (j != C.TIME_UNSET) {
                        adMediaSourceHolder.setEndPositionUs(j);
                    }
                }
            }
            for (Map.Entry<ClippingMediaPeriod, Integer> entry : this.activeContentClippingMediaPeriods.entrySet()) {
                entry.getKey().updateClipping(0L, adPlaybackState.getAdGroup(entry.getValue().intValue()).timeUs);
            }
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return Objects.equals(getAdsConfiguration(getMediaItem()), getAdsConfiguration(mediaItem)) && this.contentMediaSource.canUpdateMediaItem(mediaItem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r3 != androidx.media3.common.C.TIME_UNSET) goto L19;
     */
    @Override // androidx.media3.exoplayer.source.MediaSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r15, androidx.media3.exoplayer.upstream.Allocator r16, long r17) {
        /*
            r14 = this;
            androidx.media3.common.AdPlaybackState r0 = r14.adPlaybackState
            r0.getClass()
            int r3 = r0.adGroupCount
            if (r3 <= 0) goto L70
            boolean r3 = r15.isAd()
            if (r3 == 0) goto L70
            int r6 = r15.adGroupIndex
            int r7 = r15.adIndexInAdGroup
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r3 = r14.adMediaSourceHolders
            r4 = r3[r6]
            int r5 = r4.length
            if (r5 > r7) goto L24
            int r5 = r7 + 1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[] r4 = (androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[]) r4
            r3[r6] = r4
        L24:
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r3 = r14.adMediaSourceHolders
            r3 = r3[r6]
            r3 = r3[r7]
            if (r3 != 0) goto L63
            boolean r3 = r14.useAdMediaSourceClipping
            if (r3 == 0) goto L4a
            int r3 = r15.adGroupIndex
            androidx.media3.common.AdPlaybackState$AdGroup r0 = r0.getAdGroup(r3)
            r0.getClass()
            long[] r0 = r0.durationsUs
            int r3 = r0.length
            if (r3 <= r7) goto L4a
            r3 = r0[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L4a
            goto L4c
        L4a:
            r3 = -9223372036854775808
        L4c:
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder r0 = new androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder
            r5 = 0
            r1 = r14
            r2 = r15
            r0.<init>(r2, r3)
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r2 = r14.adMediaSourceHolders
            r2 = r2[r6]
            r2[r7] = r0
            java.util.List<androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder> r2 = r14.activeMediaSourceHolders
            r2.add(r0)
            r14.maybeUpdateAdMediaSources()
            goto L64
        L63:
            r0 = r3
        L64:
            boolean r5 = r14.useAdMediaSourceClipping
            r1 = r15
            r2 = r16
            r3 = r17
            androidx.media3.exoplayer.source.MediaPeriod r0 = androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder.access$100(r0, r1, r2, r3, r5)
            return r0
        L70:
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r3 = new androidx.media3.exoplayer.source.MediaSource$MediaPeriodId
            java.lang.Object r4 = r15.periodUid
            long r5 = r15.windowSequenceNumber
            r3.<init>(r4, r5)
            androidx.media3.exoplayer.source.MaskingMediaPeriod r8 = new androidx.media3.exoplayer.source.MaskingMediaPeriod
            r4 = r16
            r5 = r17
            r8.<init>(r3, r4, r5)
            androidx.media3.exoplayer.source.MaskingMediaSource r4 = r14.contentMediaSource
            r8.setMediaSource(r4)
            r8.createPeriod(r3)
            int r3 = r15.nextAdGroupIndex
            r4 = -1
            if (r3 != r4) goto L90
            return r8
        L90:
            androidx.media3.common.AdPlaybackState$AdGroup r0 = r0.getAdGroup(r3)
            long r12 = r0.timeUs
            androidx.media3.exoplayer.source.ClippingMediaPeriod r7 = new androidx.media3.exoplayer.source.ClippingMediaPeriod
            r9 = 1
            r10 = 0
            r7.<init>(r8, r9, r10, r12)
            java.util.Map<androidx.media3.exoplayer.source.ClippingMediaPeriod, java.lang.Integer> r0 = r14.activeContentClippingMediaPeriods
            int r1 = r15.nextAdGroupIndex
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r7, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ads.AdsMediaSource.createPeriod(androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, androidx.media3.exoplayer.upstream.Allocator, long):androidx.media3.exoplayer.source.MediaPeriod");
    }

    public Object getAdsId() {
        return this.adsId;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.contentMediaSource.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public void lambda$prepareChildSource$0(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline) {
        if (mediaPeriodId.isAd()) {
            AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup];
            adMediaSourceHolder.getClass();
            adMediaSourceHolder.handleSourceInfoRefresh(timeline);
            maybeUpdateSourceInfo();
            return;
        }
        byte b = 0;
        sp0.o(timeline.getPeriodCount() == 1);
        this.contentTimeline = timeline;
        this.mainHandler.post(new h8(this, timeline, b));
        if (this.useLazyContentSourcePreparation) {
            maybeUpdateSourceInfo();
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
        this.playerHandler = createHandlerForCurrentLooper;
        ComponentListener componentListener = new ComponentListener(createHandlerForCurrentLooper);
        this.componentListener = componentListener;
        this.contentTimeline = this.contentMediaSource.getTimeline();
        prepareChildSource(CHILD_SOURCE_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new a(this, componentListener, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        boolean z = mediaPeriod instanceof ClippingMediaPeriod;
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) (z ? ((ClippingMediaPeriod) mediaPeriod).mediaPeriod : mediaPeriod);
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.id;
        if (!mediaPeriodId.isAd()) {
            if (z) {
                this.activeContentClippingMediaPeriods.remove(mediaPeriod);
            }
            maskingMediaPeriod.releasePeriod();
            return;
        }
        AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup];
        adMediaSourceHolder.getClass();
        adMediaSourceHolder.releaseMediaPeriod(mediaPeriod);
        if (adMediaSourceHolder.isInactive()) {
            adMediaSourceHolder.release();
            this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
            this.activeMediaSourceHolders.remove(adMediaSourceHolder);
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        ComponentListener componentListener = this.componentListener;
        componentListener.getClass();
        this.componentListener = null;
        this.playerHandler = null;
        componentListener.stop();
        this.contentTimeline = null;
        this.adPlaybackState = null;
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        this.mainHandler.post(new a(this, componentListener, (byte) 1));
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        this.contentMediaSource.updateMediaItem(mediaItem);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class ComponentListener implements AdsLoader.EventListener {
        private final Handler playerHandler;
        private volatile boolean stopped;

        public ComponentListener(Handler handler) {
            this.playerHandler = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPlaybackState$0(AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            AdsMediaSource.this.onAdPlaybackState(adPlaybackState);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdLoadError(AdLoadException adLoadException, DataSpec dataSpec) {
            if (this.stopped) {
                return;
            }
            AdsMediaSource.this.createEventDispatcher(null).loadError(new LoadEventInfo.Builder(LoadEventInfo.getNewId(), dataSpec, SystemClock.elapsedRealtime()).build(), 6, (IOException) adLoadException, true);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            this.playerHandler.post(new c(this, adPlaybackState, (byte) 1));
        }

        public void stop() {
            this.stopped = true;
            this.playerHandler.removeCallbacksAndMessages(null);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public final void onAdClicked() {
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public final void onAdTapped() {
        }
    }

    public AdsMediaSource(MediaSource mediaSource, DataSpec dataSpec, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, AdViewProvider adViewProvider) {
        this(mediaSource, dataSpec, obj, factory, adsLoader, adViewProvider, true, false);
    }
}
