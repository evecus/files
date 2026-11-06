package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.VideoFrameReleaseHelper;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    public static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private final Context context;
    private long lastAdjustedFrameIndex;
    private long lastAdjustedPresentationTimeUs;
    private long lastAdjustedReleaseTimeNs;
    private long lastVsyncHysteresisOffsetNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private long pendingLastPresentationTimeUs;
    private long pendingVsyncHysteresisOffsetNs;
    private boolean started;
    private Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private VSyncSampler vsyncSampler;
    private boolean vsyncSamplerBuilt;
    private VSyncSamplerListener vsyncSamplerListener;
    private float playbackSpeed = 1.0f;
    private int changeFrameRateStrategy = 0;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Api30 {
        private Api30() {
        }

        public static void setSurfaceFrameRate(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                Log.e(VideoFrameReleaseHelper.TAG, "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class VSyncSamplerBase extends VSyncSampler implements Choreographer.FrameCallback {
        private VSyncSamplerBase(Choreographer choreographer, DisplayManager displayManager) {
            super(choreographer, displayManager);
        }

        private static long getVsyncDurationNsFromDefaultDisplay(DisplayManager displayManager) {
            if (displayManager.getDisplay(0) != null) {
                return (long) (1.0E9d / r4.getRefreshRate());
            }
            Log.w(VideoFrameReleaseHelper.TAG, "Unable to query display refresh rate");
            return C.TIME_UNSET;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.sampledVsyncTimeNs = j;
            this.choreographer.removeFrameCallback(this);
            this.choreographer.postFrameCallbackDelayed(this, 500L);
            VSyncSamplerListener vSyncSamplerListener = this.listener;
            if (vSyncSamplerListener != null) {
                vSyncSamplerListener.onVsyncSampled(this);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                this.choreographer.removeFrameCallback(this);
                this.choreographer.postFrameCallback(this);
                this.vsyncDurationNs = getVsyncDurationNsFromDefaultDisplay(this.displayManager);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public void register() {
            super.register();
            this.choreographer.removeFrameCallback(this);
            this.choreographer.postFrameCallback(this);
            this.vsyncDurationNs = getVsyncDurationNsFromDefaultDisplay(this.displayManager);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public void unregister() {
            super.unregister();
            this.choreographer.removeFrameCallback(this);
            this.sampledVsyncTimeNs = C.TIME_UNSET;
            this.vsyncDurationNs = C.TIME_UNSET;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface VSyncSamplerListener {
        void onVsyncSampled(Object obj);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class VSyncSamplerV33 extends VSyncSampler implements Choreographer$VsyncCallback {
        private final Handler handler;

        private VSyncSamplerV33(Choreographer choreographer, DisplayManager displayManager) {
            super(choreographer, displayManager);
            this.handler = Util.createHandlerForCurrentLooper();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVsync$0() {
            this.choreographer.postVsyncCallback(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                this.handler.removeCallbacksAndMessages(null);
                this.choreographer.removeVsyncCallback(this);
                this.choreographer.postVsyncCallback(this);
            }
        }

        public void onVsync(Choreographer.FrameData frameData) {
            this.sampledVsyncTimeNs = frameData.getFrameTimeNanos();
            Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
            int length = frameTimelines.length;
            long j = C.TIME_UNSET;
            if (length >= 2) {
                long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
                if (expectedPresentationTimeNanos != 0) {
                    j = expectedPresentationTimeNanos;
                }
                this.vsyncDurationNs = j;
            } else {
                this.vsyncDurationNs = C.TIME_UNSET;
            }
            this.handler.removeCallbacksAndMessages(null);
            this.handler.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.video.h
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFrameReleaseHelper.VSyncSamplerV33.this.lambda$onVsync$0();
                }
            }, 500L);
            VSyncSamplerListener vSyncSamplerListener = this.listener;
            if (vSyncSamplerListener != null) {
                vSyncSamplerListener.onVsyncSampled(this);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public void register() {
            super.register();
            this.choreographer.removeVsyncCallback(this);
            this.choreographer.postVsyncCallback(this);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public void unregister() {
            super.unregister();
            this.handler.removeCallbacksAndMessages(null);
            this.choreographer.removeVsyncCallback(this);
            this.sampledVsyncTimeNs = C.TIME_UNSET;
            this.vsyncDurationNs = C.TIME_UNSET;
        }
    }

    public VideoFrameReleaseHelper(Context context) {
        this.context = context;
    }

    private static boolean adjustmentAllowed(long j, long j2) {
        return Math.abs(j - j2) <= MAX_ALLOWED_ADJUSTMENT_NS;
    }

    private void clearSurfaceFrameRate() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || this.surfacePlaybackFrameRate == 0.0f || !surface.isValid()) {
            return;
        }
        this.surfacePlaybackFrameRate = 0.0f;
        Api30.setSurfaceFrameRate(this.surface, 0.0f);
    }

    private long findClosestVsyncAndUpdateHysteresis(long j, long j2, long j3) {
        long j4;
        long j5;
        long j6 = (((j - j2) / j3) * j3) + j2;
        if (j <= j6) {
            j4 = j6 - j3;
        } else {
            j4 = j6;
            j6 += j3;
        }
        long j7 = j6 - j;
        long j8 = j - j4;
        long abs = Math.abs(j7 - j8);
        if (abs < j3 / 2) {
            long j9 = j3 / 4;
            j5 = 0;
            if (abs < j9) {
                long j10 = this.lastVsyncHysteresisOffsetNs;
                if (j10 != 0) {
                    this.pendingVsyncHysteresisOffsetNs = j10;
                    j5 = j10;
                } else {
                    if (j7 < j8) {
                        j9 = -j9;
                    }
                    this.pendingVsyncHysteresisOffsetNs = j9;
                    j5 = j9;
                }
            } else {
                this.pendingVsyncHysteresisOffsetNs = 0L;
            }
        } else {
            j5 = this.lastVsyncHysteresisOffsetNs;
            this.pendingVsyncHysteresisOffsetNs = j5;
        }
        return j7 + j5 < j8 ? j6 : j4;
    }

    private void resetAdjustment() {
        this.lastAdjustedFrameIndex = -1L;
        this.pendingLastAdjustedFrameIndex = -1L;
        this.pendingLastPresentationTimeUs = C.TIME_UNSET;
        this.lastVsyncHysteresisOffsetNs = 0L;
        this.pendingVsyncHysteresisOffsetNs = 0L;
    }

    private void updateSurfacePlaybackFrameRate(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.started) {
            float f2 = this.surfaceMediaFrameRate;
            if (f2 != -1.0f) {
                f = f2 * this.playbackSpeed;
                if (z && this.surfacePlaybackFrameRate == f) {
                    return;
                }
                this.surfacePlaybackFrameRate = f;
                Api30.setSurfaceFrameRate(this.surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.surfacePlaybackFrameRate = f;
        Api30.setSurfaceFrameRate(this.surface, f);
    }

    public long adjustReleaseTime(long j, long j2, long j3, long j4) {
        float f;
        float f2;
        long j5 = this.pendingLastPresentationTimeUs;
        if (j2 != j5) {
            this.lastAdjustedFrameIndex = this.pendingLastAdjustedFrameIndex;
            this.lastAdjustedReleaseTimeNs = this.pendingLastAdjustedReleaseTimeNs;
            this.lastAdjustedPresentationTimeUs = j5;
            this.lastVsyncHysteresisOffsetNs = this.pendingVsyncHysteresisOffsetNs;
        }
        long j6 = this.lastAdjustedFrameIndex;
        if (j6 != -1) {
            if (j3 != C.TIME_UNSET) {
                f = (j4 - j6) * j3;
                f2 = this.playbackSpeed;
            } else {
                f = (j2 - this.lastAdjustedPresentationTimeUs) * 1000;
                f2 = this.playbackSpeed;
            }
            long j7 = this.lastAdjustedReleaseTimeNs + ((long) (f / f2));
            if (adjustmentAllowed(j, j7)) {
                j = j7;
            } else {
                resetAdjustment();
            }
        }
        this.pendingLastAdjustedFrameIndex = j4;
        this.pendingLastAdjustedReleaseTimeNs = j;
        this.pendingLastPresentationTimeUs = j2;
        VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            long j8 = vSyncSampler.sampledVsyncTimeNs;
            long j9 = this.vsyncSampler.vsyncDurationNs;
            if (j8 != C.TIME_UNSET && j9 != C.TIME_UNSET) {
                return findClosestVsyncAndUpdateHysteresis(j, j8, j9) - ((VSYNC_OFFSET_PERCENTAGE * j9) / 100);
            }
        }
        return j;
    }

    public void onPlaybackSpeed(float f) {
        this.playbackSpeed = f;
        updateSurfacePlaybackFrameRate(false);
    }

    public void onPositionReset() {
        resetAdjustment();
    }

    public void onStarted() {
        this.started = true;
        resetAdjustment();
        if (!this.vsyncSamplerBuilt) {
            VSyncSampler maybeBuildInstance = VSyncSampler.maybeBuildInstance(this.context);
            this.vsyncSampler = maybeBuildInstance;
            if (maybeBuildInstance != null) {
                maybeBuildInstance.listener = this.vsyncSamplerListener;
            }
            this.vsyncSamplerBuilt = true;
        }
        VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            vSyncSampler.register();
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onStopped() {
        this.started = false;
        VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            vSyncSampler.unregister();
        }
        clearSurfaceFrameRate();
    }

    public void onSurfaceChanged(Surface surface) {
        if (this.surface == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.surface = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setChangeFrameRateStrategy(int i) {
        if (this.changeFrameRateStrategy == i) {
            return;
        }
        this.changeFrameRateStrategy = i;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setSurfaceMediaFrameRate(float f) {
        if (this.surfaceMediaFrameRate == f) {
            return;
        }
        this.surfaceMediaFrameRate = f;
        updateSurfacePlaybackFrameRate(false);
    }

    public void setVSyncSamplerListener(VSyncSamplerListener vSyncSamplerListener) {
        this.vsyncSamplerListener = vSyncSamplerListener;
        VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            vSyncSampler.listener = vSyncSamplerListener;
        }
    }

    public void setVsyncData(long j, long j2) {
        VSyncSampler vSyncSampler = this.vsyncSampler;
        vSyncSampler.getClass();
        vSyncSampler.sampledVsyncTimeNs = j;
        this.vsyncSampler.vsyncDurationNs = j2;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static abstract class VSyncSampler implements DisplayManager.DisplayListener {
        final Choreographer choreographer;
        final DisplayManager displayManager;
        VSyncSamplerListener listener;
        volatile long sampledVsyncTimeNs;
        volatile long vsyncDurationNs;

        private VSyncSampler(Choreographer choreographer, DisplayManager displayManager) {
            this.choreographer = choreographer;
            this.displayManager = displayManager;
            this.sampledVsyncTimeNs = C.TIME_UNSET;
            this.vsyncDurationNs = C.TIME_UNSET;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static VSyncSampler maybeBuildInstance(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null) {
                return null;
            }
            try {
                Choreographer choreographer = Choreographer.getInstance();
                return Build.VERSION.SDK_INT >= 33 ? new VSyncSamplerV33(choreographer, displayManager) : new VSyncSamplerBase(choreographer, displayManager);
            } catch (RuntimeException e) {
                Log.w(VideoFrameReleaseHelper.TAG, "Vsync sampling disabled due to platform error", e);
                return null;
            }
        }

        public void register() {
            this.displayManager.registerDisplayListener(this, Util.createHandlerForCurrentLooper());
        }

        public void unregister() {
            this.displayManager.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }
}
