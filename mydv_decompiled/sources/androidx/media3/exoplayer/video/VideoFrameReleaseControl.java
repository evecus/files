package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import defpackage.s83;
import defpackage.sp0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class VideoFrameReleaseControl {
    public static final int FRAME_RELEASE_DROP = 2;
    public static final int FRAME_RELEASE_IGNORE = 4;
    public static final int FRAME_RELEASE_IMMEDIATELY = 0;
    public static final int FRAME_RELEASE_SCHEDULED = 1;
    public static final int FRAME_RELEASE_SKIP = 3;
    public static final int FRAME_RELEASE_TRY_AGAIN_LATER = 5;
    private final long allowedJoiningTimeMs;
    private boolean disableAdvancingTimestampChecks;
    private boolean frameReadyWithoutSurface;
    private final VideoFrameReleaseHelper frameReleaseHelper;
    private final FrameTimingEvaluator frameTimingEvaluator;
    private boolean hasOutputSurface;
    private boolean joiningRenderNextFrameImmediately;
    private long lastReleaseRealtimeUs;
    private boolean started;
    private int firstFrameState = 0;
    private long initialPositionUs = C.TIME_UNSET;
    private long joiningDeadlineMs = C.TIME_UNSET;
    private float playbackSpeed = 1.0f;
    private Clock clock = Clock.DEFAULT;
    private boolean requiresOutputSurface = true;
    private long earlySchedulingThresholdUs = MediaCodecVideoRenderer.DEFAULT_EARLY_SCHEDULING_THRESHOLD_US;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface FrameReleaseAction {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class FrameReleaseInfo {
        private long earlyUs = C.TIME_UNSET;
        private long releaseTimeNs = C.TIME_UNSET;

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.earlyUs = C.TIME_UNSET;
            this.releaseTimeNs = C.TIME_UNSET;
        }

        public long getEarlyUs() {
            return this.earlyUs;
        }

        public long getReleaseTimeNs() {
            return this.releaseTimeNs;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface FrameTimingEvaluator {
        boolean shouldDropFrame(long j, long j2, boolean z);

        boolean shouldForceReleaseFrame(long j, long j2);

        boolean shouldIgnoreFrame(long j, long j2, long j3, boolean z, boolean z2);
    }

    public VideoFrameReleaseControl(Context context, FrameTimingEvaluator frameTimingEvaluator, long j) {
        this.frameTimingEvaluator = frameTimingEvaluator;
        this.allowedJoiningTimeMs = j;
        this.frameReleaseHelper = new VideoFrameReleaseHelper(context);
    }

    private long calculateEarlyTimeUs(long j, long j2, long j3) {
        long j4 = (long) ((j3 - j) / this.playbackSpeed);
        return this.started ? j4 - (Util.msToUs(this.clock.elapsedRealtime()) - j2) : j4;
    }

    private void lowerFirstFrameState(int i) {
        this.firstFrameState = Math.min(this.firstFrameState, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r5 != r8) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean shouldForceRelease(long r8, long r10, long r12) {
        /*
            r7 = this;
            long r0 = r7.joiningDeadlineMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L11
            boolean r0 = r7.joiningRenderNextFrameImmediately
            if (r0 != 0) goto L11
            return r1
        L11:
            int r0 = r7.firstFrameState
            if (r0 == 0) goto L53
            r4 = 1
            if (r0 == r4) goto L52
            r5 = 2
            if (r0 == r5) goto L4c
            r12 = 3
            if (r0 != r12) goto L47
            androidx.media3.common.util.Clock r12 = r7.clock
            long r12 = r12.elapsedRealtime()
            long r12 = androidx.media3.common.util.Util.msToUs(r12)
            long r5 = r7.lastReleaseRealtimeUs
            long r12 = r12 - r5
            boolean r0 = r7.started
            if (r0 == 0) goto L46
            boolean r0 = r7.disableAdvancingTimestampChecks
            if (r0 != 0) goto L3d
            long r5 = r7.initialPositionUs
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L46
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 == 0) goto L46
        L3d:
            androidx.media3.exoplayer.video.VideoFrameReleaseControl$FrameTimingEvaluator r7 = r7.frameTimingEvaluator
            boolean r7 = r7.shouldForceReleaseFrame(r10, r12)
            if (r7 == 0) goto L46
            return r4
        L46:
            return r1
        L47:
            defpackage.s83.r()
            r7 = 0
            return r7
        L4c:
            int r7 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r7 < 0) goto L51
            return r4
        L51:
            return r1
        L52:
            return r4
        L53:
            boolean r7 = r7.started
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.VideoFrameReleaseControl.shouldForceRelease(long, long, long):boolean");
    }

    public void allowReleaseFirstFrameBeforeStarted() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    public void experimentalDisableAdvancingTimestampChecks() {
        this.disableAdvancingTimestampChecks = true;
    }

    public int getFrameReleaseAction(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5, long j6, FrameReleaseInfo frameReleaseInfo) {
        frameReleaseInfo.reset();
        if (this.started && this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j2;
        }
        frameReleaseInfo.earlyUs = calculateEarlyTimeUs(j2, j3, j);
        if (z && !z2) {
            return 3;
        }
        if (!this.hasOutputSurface && this.requiresOutputSurface) {
            if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j2, j3, z2, true)) {
                return 4;
            }
            if (this.started && frameReleaseInfo.earlyUs < 30000) {
                return 3;
            }
            this.frameReadyWithoutSurface = true;
            return 5;
        }
        if (!this.requiresOutputSurface) {
            this.frameReadyWithoutSurface = true;
        }
        if (shouldForceRelease(j2, frameReleaseInfo.earlyUs, j4)) {
            return 0;
        }
        if (!this.started || j2 == this.initialPositionUs) {
            return 5;
        }
        long nanoTime = this.clock.nanoTime();
        frameReleaseInfo.releaseTimeNs = this.frameReleaseHelper.adjustReleaseTime((frameReleaseInfo.earlyUs * 1000) + nanoTime, j, j5, j6);
        frameReleaseInfo.earlyUs = (frameReleaseInfo.releaseTimeNs - nanoTime) / 1000;
        boolean z3 = (this.joiningDeadlineMs == C.TIME_UNSET || this.joiningRenderNextFrameImmediately) ? false : true;
        if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j2, j3, z2, z3)) {
            return 4;
        }
        return this.frameTimingEvaluator.shouldDropFrame(frameReleaseInfo.earlyUs, j3, z2) ? z3 ? 3 : 2 : frameReleaseInfo.earlyUs > this.earlySchedulingThresholdUs ? 5 : 1;
    }

    public boolean isJoining() {
        return this.joiningDeadlineMs != C.TIME_UNSET;
    }

    public boolean isReady(boolean z) {
        if (z && (this.firstFrameState == 3 || (this.frameReadyWithoutSurface && (!this.hasOutputSurface || !this.requiresOutputSurface)))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        }
        if (this.clock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C.TIME_UNSET;
        return false;
    }

    public void join(boolean z) {
        this.joiningRenderNextFrameImmediately = z;
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? this.clock.elapsedRealtime() + this.allowedJoiningTimeMs : C.TIME_UNSET;
    }

    public boolean onFrameReleasedIsFirstFrame() {
        boolean z = this.firstFrameState != 3;
        this.firstFrameState = 3;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        return z;
    }

    public void onStarted() {
        this.started = true;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        this.frameReleaseHelper.onStarted();
    }

    public void onStopped() {
        this.started = false;
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.frameReleaseHelper.onStopped();
    }

    public void onStreamChanged(int i) {
        if (i == 0) {
            this.firstFrameState = 1;
        } else if (i == 1) {
            this.firstFrameState = 0;
        } else {
            if (i != 2) {
                s83.r();
                return;
            }
            lowerFirstFrameState(2);
        }
        this.frameReleaseHelper.onPositionReset();
    }

    public void reset() {
        this.frameReleaseHelper.onPositionReset();
        this.initialPositionUs = C.TIME_UNSET;
        lowerFirstFrameState(1);
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.frameReadyWithoutSurface = false;
    }

    public void setChangeFrameRateStrategy(int i) {
        this.frameReleaseHelper.setChangeFrameRateStrategy(i);
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setEarlySchedulingThresholdUs(long j) {
        this.earlySchedulingThresholdUs = j;
    }

    public void setOutputSurface(Surface surface) {
        this.hasOutputSurface = surface != null;
        this.frameReadyWithoutSurface = false;
        this.frameReleaseHelper.onSurfaceChanged(surface);
        lowerFirstFrameState(1);
    }

    public void setPlaybackSpeed(float f) {
        sp0.o(f > 0.0f);
        if (f == this.playbackSpeed) {
            return;
        }
        this.playbackSpeed = f;
        this.frameReleaseHelper.onPlaybackSpeed(f);
    }

    public void setRequiresOutputSurface(boolean z) {
        this.requiresOutputSurface = z;
    }

    public void setSurfaceMediaFrameRate(float f) {
        this.frameReleaseHelper.setSurfaceMediaFrameRate(f);
    }
}
