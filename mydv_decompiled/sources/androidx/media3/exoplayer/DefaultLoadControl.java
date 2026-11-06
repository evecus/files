package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.exoplayer.upstream.PlayerIdAwareAllocator;
import coil3.util.UtilsKt;
import defpackage.ay1;
import defpackage.c34;
import defpackage.dy1;
import defpackage.i82;
import defpackage.iy1;
import defpackage.s83;
import defpackage.sp0;
import defpackage.ut0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_FOR_LOCAL_PLAYBACK_MS = 1000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 2000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_FOR_LOCAL_PLAYBACK_MS = 1000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 1000;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_IMAGE_BUFFER_SIZE = 26214400;
    public static final int DEFAULT_MAX_BUFFER_FOR_LOCAL_PLAYBACK_MS = 50000;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_MAX_BUFFER_SIZE = 210239488;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_FOR_LOCAL_PLAYBACK_MS = 1000;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS_FOR_LOCAL_PLAYBACK = true;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TARGET_BUFFER_BYTES_FOR_PRELOAD = 144179200;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE_FOR_LOCAL_PLAYBACK = 19660800;
    public static final dy1 LOCAL_PLAYBACK_SCHEMES;
    private static final String TAG = "DefaultLoadControl";
    private final DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferForLocalPlaybackUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackForLocalPlaybackUs;
    private final long bufferForPlaybackUs;
    private final ConcurrentHashMap<PlayerId, PlayerLoadingState> loadingStates;
    private final long maxBufferForLocalPlaybackUs;
    private final long maxBufferUs;
    private final long minBufferForLocalPlaybackUs;
    private final long minBufferUs;
    private final Timeline.Period period;
    private final iy1 playerTargetBufferBytesOverwrites;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean prioritizeTimeOverSizeThresholdsForLocalPlayback;
    private final boolean retainBackBufferFromKeyframe;
    private final int targetBufferBytesOverwrite;
    private long threadId;
    private final Timeline.Window window;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private DefaultAllocator allocator;
        private int backBufferDurationMs;
        private int bufferForPlaybackAfterRebufferForLocalPlaybackMs;
        private int bufferForPlaybackAfterRebufferMs;
        private int bufferForPlaybackForLocalPlaybackMs;
        private int bufferForPlaybackMs;
        private boolean buildCalled;
        private int maxBufferForLocalPlaybackMs;
        private int maxBufferMs;
        private int minBufferForLocalPlaybackMs;
        private int minBufferMs;
        private Boolean onlyGenericConfigurationMethodsCalled;
        private final HashMap<String, Integer> playerTargetBufferBytes;
        private boolean prioritizeTimeOverSizeThresholds;
        private boolean prioritizeTimeOverSizeThresholdsForLocalPlayback;
        private boolean retainBackBufferFromKeyframe;
        private int targetBufferBytes;

        public Builder() {
            HashMap<String, Integer> hashMap = new HashMap<>();
            this.playerTargetBufferBytes = hashMap;
            hashMap.put(PlayerId.PRELOAD.name, Integer.valueOf(DefaultLoadControl.DEFAULT_TARGET_BUFFER_BYTES_FOR_PRELOAD));
            this.minBufferMs = 50000;
            this.minBufferForLocalPlaybackMs = 1000;
            this.maxBufferMs = 50000;
            this.maxBufferForLocalPlaybackMs = 50000;
            this.bufferForPlaybackMs = 1000;
            this.bufferForPlaybackForLocalPlaybackMs = 1000;
            this.bufferForPlaybackAfterRebufferMs = 2000;
            this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = 1000;
            this.targetBufferBytes = -1;
            this.prioritizeTimeOverSizeThresholds = false;
            this.prioritizeTimeOverSizeThresholdsForLocalPlayback = true;
            this.backBufferDurationMs = 0;
            this.retainBackBufferFromKeyframe = false;
        }

        public DefaultLoadControl build() {
            sp0.z(!this.buildCalled);
            this.buildCalled = true;
            if (this.allocator == null) {
                this.allocator = new DefaultAllocator(true, 65536);
            }
            Boolean bool = this.onlyGenericConfigurationMethodsCalled;
            if (bool != null && bool.booleanValue()) {
                this.minBufferForLocalPlaybackMs = this.minBufferMs;
                this.maxBufferForLocalPlaybackMs = this.maxBufferMs;
                this.bufferForPlaybackForLocalPlaybackMs = this.bufferForPlaybackMs;
                this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = this.bufferForPlaybackAfterRebufferMs;
                this.prioritizeTimeOverSizeThresholdsForLocalPlayback = this.prioritizeTimeOverSizeThresholds;
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.minBufferForLocalPlaybackMs, this.maxBufferMs, this.maxBufferForLocalPlaybackMs, this.bufferForPlaybackMs, this.bufferForPlaybackForLocalPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.bufferForPlaybackAfterRebufferForLocalPlaybackMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.prioritizeTimeOverSizeThresholdsForLocalPlayback, this.backBufferDurationMs, this.retainBackBufferFromKeyframe, this.playerTargetBufferBytes);
        }

        public Builder setAllocator(DefaultAllocator defaultAllocator) {
            sp0.z(!this.buildCalled);
            this.allocator = defaultAllocator;
            return this;
        }

        public Builder setBackBuffer(int i, boolean z) {
            sp0.z(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i, 0, "backBufferDurationMs", "0");
            this.backBufferDurationMs = i;
            this.retainBackBufferFromKeyframe = z;
            return this;
        }

        public Builder setBufferDurationsMs(int i, int i2, int i3, int i4) {
            sp0.z(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i3, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i, i3, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i2, i, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i;
            this.maxBufferMs = i2;
            this.bufferForPlaybackMs = i3;
            this.bufferForPlaybackAfterRebufferMs = i4;
            this.minBufferForLocalPlaybackMs = i;
            this.maxBufferForLocalPlaybackMs = i2;
            this.bufferForPlaybackForLocalPlaybackMs = i3;
            this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = i4;
            if (this.onlyGenericConfigurationMethodsCalled == null) {
                this.onlyGenericConfigurationMethodsCalled = Boolean.TRUE;
            }
            return this;
        }

        public Builder setBufferDurationsMsForLocalPlayback(int i, int i2, int i3, int i4) {
            sp0.z(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i3, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i, i3, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i2, i, "maxBufferMs", "minBufferMs");
            this.minBufferForLocalPlaybackMs = i;
            this.maxBufferForLocalPlaybackMs = i2;
            this.bufferForPlaybackForLocalPlaybackMs = i3;
            this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = i4;
            this.onlyGenericConfigurationMethodsCalled = Boolean.FALSE;
            return this;
        }

        public Builder setBufferDurationsMsForStreaming(int i, int i2, int i3, int i4) {
            sp0.z(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i3, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i, i3, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i2, i, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i;
            this.maxBufferMs = i2;
            this.bufferForPlaybackMs = i3;
            this.bufferForPlaybackAfterRebufferMs = i4;
            this.onlyGenericConfigurationMethodsCalled = Boolean.FALSE;
            return this;
        }

        public Builder setPlayerTargetBufferBytes(String str, int i) {
            sp0.z(!this.buildCalled);
            this.playerTargetBufferBytes.put(str, Integer.valueOf(i));
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholds(boolean z) {
            sp0.z(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z;
            this.prioritizeTimeOverSizeThresholdsForLocalPlayback = z;
            if (this.onlyGenericConfigurationMethodsCalled == null) {
                this.onlyGenericConfigurationMethodsCalled = Boolean.TRUE;
            }
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholdsForLocalPlayback(boolean z) {
            sp0.z(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholdsForLocalPlayback = z;
            this.onlyGenericConfigurationMethodsCalled = Boolean.FALSE;
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholdsForStreaming(boolean z) {
            sp0.z(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z;
            this.onlyGenericConfigurationMethodsCalled = Boolean.FALSE;
            return this;
        }

        public Builder setTargetBufferBytes(int i) {
            sp0.z(!this.buildCalled);
            this.targetBufferBytes = i;
            return this;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class PlayerLoadingState {
        private int allocatedCounts;
        public boolean isLoading;
        public int referenceCount = 1;
        public int targetBufferBytes;

        public synchronized void decreaseAllocatedCounts() {
            this.allocatedCounts--;
        }

        public synchronized int getAllocatedCounts() {
            return this.allocatedCounts;
        }

        public synchronized void increaseAllocatedCounts() {
            this.allocatedCounts++;
        }
    }

    static {
        ay1 ay1Var = dy1.J;
        Object[] objArr = {UtilsKt.SCHEME_FILE, "content", "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset"};
        ut0.k(6, objArr);
        LOCAL_PLAYBACK_SCHEMES = dy1.m(6, objArr);
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2, int i10, boolean z3, Map<String, Integer> map) {
        assertGreaterOrEqual(i5, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i6, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        assertGreaterOrEqual(i7, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i8, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        assertGreaterOrEqual(i, i5, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i2, i6, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        assertGreaterOrEqual(i, i7, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i2, i8, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        assertGreaterOrEqual(i3, i, "maxBufferMs", "minBufferMs");
        assertGreaterOrEqual(i4, i2, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        assertGreaterOrEqual(i10, 0, "backBufferDurationMs", "0");
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.allocator = defaultAllocator;
        this.minBufferUs = Util.msToUs(i);
        this.minBufferForLocalPlaybackUs = Util.msToUs(i2);
        this.maxBufferUs = Util.msToUs(i3);
        this.maxBufferForLocalPlaybackUs = Util.msToUs(i4);
        this.bufferForPlaybackUs = Util.msToUs(i5);
        this.bufferForPlaybackForLocalPlaybackUs = Util.msToUs(i6);
        this.bufferForPlaybackAfterRebufferUs = Util.msToUs(i7);
        this.bufferForPlaybackAfterRebufferForLocalPlaybackUs = Util.msToUs(i8);
        this.targetBufferBytesOverwrite = i9;
        this.prioritizeTimeOverSizeThresholds = z;
        this.prioritizeTimeOverSizeThresholdsForLocalPlayback = z2;
        this.backBufferDurationUs = Util.msToUs(i10);
        this.retainBackBufferFromKeyframe = z3;
        this.loadingStates = new ConcurrentHashMap<>();
        this.playerTargetBufferBytesOverwrites = iy1.a(map);
        this.threadId = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertGreaterOrEqual(int i, int i2, String str, String str2) {
        sp0.t(i >= i2, "%s cannot be less than %s", str, str2);
    }

    private long getBufferForPlaybackAfterRebufferUs(boolean z) {
        return z ? this.bufferForPlaybackAfterRebufferForLocalPlaybackUs : this.bufferForPlaybackAfterRebufferUs;
    }

    private long getBufferForPlaybackUs(boolean z) {
        return z ? this.bufferForPlaybackForLocalPlaybackUs : this.bufferForPlaybackUs;
    }

    private static int getDefaultBufferSize(int i, boolean z) {
        switch (i) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return DEFAULT_MUXED_BUFFER_SIZE;
            case 1:
                return 13107200;
            case 2:
                return z ? DEFAULT_VIDEO_BUFFER_SIZE_FOR_LOCAL_PLAYBACK : DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
                return 131072;
            case 4:
                return DEFAULT_IMAGE_BUFFER_SIZE;
            case 5:
            case 6:
                return 131072;
            default:
                s83.d();
                return 0;
        }
    }

    private long getMaxBufferUs(boolean z) {
        return z ? this.maxBufferForLocalPlaybackUs : this.maxBufferUs;
    }

    private long getMinBufferUs(boolean z) {
        return z ? this.minBufferForLocalPlaybackUs : this.minBufferUs;
    }

    private int getTargetBufferBytes(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        playerLoadingState.getClass();
        return playerLoadingState.targetBufferBytes;
    }

    private int getTargetBufferBytesOverwrite(PlayerId playerId) {
        Integer num = (Integer) this.playerTargetBufferBytesOverwrites.get(playerId.name);
        return (num == null || num.intValue() == -1) ? this.targetBufferBytesOverwrite : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTotalBufferBytesAllocated(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        playerLoadingState.getClass();
        return this.allocator.getIndividualAllocationLength() * playerLoadingState.getAllocatedCounts();
    }

    private boolean heapHasEnoughHeadroomForPrioritizeTimeOverSizeThreshold() {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        return runtime.totalMemory() < maxMemory || runtime.freeMemory() + ((long) this.allocator.getUnusedBytesAllocated()) >= maxMemory / 25;
    }

    private boolean isLocalPlayback(LoadControl.Parameters parameters) {
        MediaItem.LocalConfiguration localConfiguration = parameters.timeline.getWindow(parameters.timeline.getPeriodByUid(parameters.mediaPeriodId.periodUid, this.period).windowIndex, this.window).mediaItem.localConfiguration;
        if (localConfiguration == null) {
            return false;
        }
        String scheme = localConfiguration.uri.getScheme();
        return TextUtils.isEmpty(scheme) || LOCAL_PLAYBACK_SCHEMES.contains(scheme);
    }

    private boolean prioritizeTimeOverSizeThresholds(boolean z) {
        return z ? this.prioritizeTimeOverSizeThresholdsForLocalPlayback : this.prioritizeTimeOverSizeThresholds;
    }

    private void removePlayer(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        if (playerLoadingState != null) {
            int i = playerLoadingState.referenceCount - 1;
            playerLoadingState.referenceCount = i;
            if (i == 0) {
                this.loadingStates.remove(playerId);
                updateAllocator();
            }
        }
    }

    private void resetPlayerLoadingState(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        playerLoadingState.getClass();
        int targetBufferBytesOverwrite = getTargetBufferBytesOverwrite(playerId);
        if (targetBufferBytesOverwrite == -1) {
            targetBufferBytesOverwrite = 13107200;
        }
        playerLoadingState.targetBufferBytes = targetBufferBytesOverwrite;
        playerLoadingState.isLoading = false;
    }

    private void updateAllocator() {
        boolean isEmpty = this.loadingStates.isEmpty();
        DefaultAllocator defaultAllocator = this.allocator;
        if (isEmpty) {
            defaultAllocator.reset();
        } else {
            defaultAllocator.setTargetBufferSize(calculateTotalTargetBufferBytes());
        }
    }

    public int calculateTargetBufferBytes(LoadControl.Parameters parameters, ExoTrackSelection[] exoTrackSelectionArr) {
        int calculateTargetBufferBytes = calculateTargetBufferBytes(exoTrackSelectionArr);
        if (calculateTargetBufferBytes != -1) {
            return calculateTargetBufferBytes;
        }
        boolean isLocalPlayback = isLocalPlayback(parameters);
        int i = 0;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                i += getDefaultBufferSize(exoTrackSelection.getTrackGroup().type, isLocalPlayback);
            }
        }
        return Util.constrainValue(i, 13107200, DEFAULT_MAX_BUFFER_SIZE);
    }

    public int calculateTotalTargetBufferBytes() {
        Iterator<PlayerLoadingState> it = this.loadingStates.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().targetBufferBytes;
        }
        return i;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public Allocator getAllocator(PlayerId playerId) {
        return new PlayerIdFilteringAllocatorImpl(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ long getBackBufferDurationUs() {
        i82.a();
        throw null;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onPrepared(PlayerId playerId) {
        long id = Thread.currentThread().getId();
        long j = this.threadId;
        sp0.A(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.threadId = id;
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        if (playerLoadingState == null) {
            this.loadingStates.put(playerId, new PlayerLoadingState());
        } else {
            playerLoadingState.referenceCount++;
        }
        resetPlayerLoadingState(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onReleased(PlayerId playerId) {
        removePlayer(playerId);
        if (this.loadingStates.isEmpty()) {
            this.threadId = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onStopped() {
        i82.y();
        throw null;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onTracksSelected(LoadControl.Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        int targetBufferBytesOverwrite = getTargetBufferBytesOverwrite(parameters.playerId);
        PlayerLoadingState playerLoadingState = this.loadingStates.get(parameters.playerId);
        playerLoadingState.getClass();
        if (targetBufferBytesOverwrite == -1) {
            targetBufferBytesOverwrite = calculateTargetBufferBytes(parameters, exoTrackSelectionArr);
        }
        playerLoadingState.targetBufferBytes = targetBufferBytesOverwrite;
        updateAllocator();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ boolean retainBackBufferFromKeyframe() {
        i82.D();
        throw null;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldContinueLoading(LoadControl.Parameters parameters) {
        PlayerId playerId = parameters.playerId;
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        playerLoadingState.getClass();
        boolean z = getTotalBufferBytesAllocated(playerId) >= getTargetBufferBytes(playerId);
        if (playerId.equals(PlayerId.PRELOAD)) {
            return !z;
        }
        boolean isLocalPlayback = isLocalPlayback(parameters);
        long minBufferUs = getMinBufferUs(isLocalPlayback);
        long maxBufferUs = getMaxBufferUs(isLocalPlayback);
        float f = parameters.playbackSpeed;
        if (f > 1.0f) {
            minBufferUs = Math.min(Util.getMediaDurationForPlayoutDuration(minBufferUs, f), maxBufferUs);
        }
        long max = Math.max(minBufferUs, 500000L);
        long j = parameters.bufferedDurationUs;
        if (j < max) {
            boolean prioritizeTimeOverSizeThresholds = prioritizeTimeOverSizeThresholds(isLocalPlayback);
            boolean heapHasEnoughHeadroomForPrioritizeTimeOverSizeThreshold = heapHasEnoughHeadroomForPrioritizeTimeOverSizeThreshold();
            boolean z2 = (prioritizeTimeOverSizeThresholds && heapHasEnoughHeadroomForPrioritizeTimeOverSizeThreshold) || !z;
            playerLoadingState.isLoading = z2;
            if (!z2 && prioritizeTimeOverSizeThresholds && !heapHasEnoughHeadroomForPrioritizeTimeOverSizeThreshold) {
                Log.i(TAG, "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!playerLoadingState.isLoading && parameters.bufferedDurationUs < 500000) {
                Log.w(TAG, "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= maxBufferUs || z) {
            playerLoadingState.isLoading = false;
        }
        return playerLoadingState.isLoading;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldContinuePreloading(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j) {
        Iterator<PlayerLoadingState> it = this.loadingStates.values().iterator();
        while (it.hasNext()) {
            if (it.next().isLoading) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldStartPlayback(LoadControl.Parameters parameters) {
        boolean isLocalPlayback = isLocalPlayback(parameters);
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(parameters.bufferedDurationUs, parameters.playbackSpeed);
        long bufferForPlaybackAfterRebufferUs = parameters.rebuffering ? getBufferForPlaybackAfterRebufferUs(isLocalPlayback) : getBufferForPlaybackUs(isLocalPlayback);
        long j = parameters.targetLiveOffsetUs;
        if (j != C.TIME_UNSET) {
            bufferForPlaybackAfterRebufferUs = Math.min(j / 2, bufferForPlaybackAfterRebufferUs);
        }
        if (bufferForPlaybackAfterRebufferUs <= 0 || playoutDurationForMediaDuration >= bufferForPlaybackAfterRebufferUs) {
            return true;
        }
        return !prioritizeTimeOverSizeThresholds(isLocalPlayback) && getTotalBufferBytesAllocated(parameters.playerId) >= getTargetBufferBytes(parameters.playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public long getBackBufferDurationUs(PlayerId playerId) {
        return this.backBufferDurationUs;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onStopped(PlayerId playerId) {
        removePlayer(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean retainBackBufferFromKeyframe(PlayerId playerId) {
        return this.retainBackBufferFromKeyframe;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onReleased() {
        i82.x();
        throw null;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class PlayerIdFilteringAllocatorImpl implements PlayerIdAwareAllocator {
        private final HashMap<Allocation, PlayerId> allocationPlayerIdMap = new HashMap<>();
        private PlayerId playerId;

        public PlayerIdFilteringAllocatorImpl(PlayerId playerId) {
            this.playerId = playerId;
        }

        private void releaseInternal(Allocation allocation) {
            PlayerId remove = this.allocationPlayerIdMap.remove(allocation);
            remove.getClass();
            PlayerLoadingState playerLoadingState = (PlayerLoadingState) DefaultLoadControl.this.loadingStates.get(remove);
            if (playerLoadingState != null) {
                playerLoadingState.decreaseAllocatedCounts();
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator
        public synchronized Allocation allocate() {
            Allocation allocate;
            allocate = DefaultLoadControl.this.allocator.allocate();
            this.allocationPlayerIdMap.put(allocate, this.playerId);
            PlayerLoadingState playerLoadingState = (PlayerLoadingState) DefaultLoadControl.this.loadingStates.get(this.playerId);
            if (playerLoadingState != null) {
                playerLoadingState.increaseAllocatedCounts();
            }
            return allocate;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator
        public synchronized int getIndividualAllocationLength() {
            return DefaultLoadControl.this.allocator.getIndividualAllocationLength();
        }

        @Override // androidx.media3.exoplayer.upstream.PlayerIdAwareAllocator, androidx.media3.exoplayer.upstream.Allocator
        public synchronized int getTotalBytesAllocated() {
            return DefaultLoadControl.this.getTotalBufferBytesAllocated(this.playerId);
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator
        public synchronized void release(Allocator.AllocationNode allocationNode) {
            DefaultLoadControl.this.allocator.release(allocationNode);
            while (allocationNode != null) {
                releaseInternal(allocationNode.getAllocation());
                allocationNode = allocationNode.next();
            }
        }

        @Override // androidx.media3.exoplayer.upstream.PlayerIdAwareAllocator
        public synchronized void setPlayerId(PlayerId playerId) {
            this.playerId = playerId;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator
        public synchronized void trim() {
            DefaultLoadControl.this.allocator.trim();
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator
        public synchronized void release(Allocation allocation) {
            DefaultLoadControl.this.allocator.release(allocation);
            releaseInternal(allocation);
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onTracksSelected(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        i82.z(this, timeline, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        i82.B();
        throw null;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onTracksSelected(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        i82.A(this, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Deprecated
    public int calculateTargetBufferBytes(ExoTrackSelection[] exoTrackSelectionArr) {
        return -1;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ void onPrepared() {
        i82.w();
        throw null;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ boolean shouldStartPlayback(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, float f, boolean z, long j2) {
        return i82.J(this, j, f, z, j2);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ boolean shouldStartPlayback(long j, float f, boolean z, long j2) {
        i82.I();
        throw null;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public final /* synthetic */ boolean shouldContinueLoading(long j, long j2, float f) {
        i82.H();
        throw null;
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 65536), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, -1, false, true, 0, false);
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2, int i10, boolean z3) {
        this(defaultAllocator, i, i2, i3, i4, i5, i6, i7, i8, i9, z, z2, i10, z3, c34.O);
    }
}
