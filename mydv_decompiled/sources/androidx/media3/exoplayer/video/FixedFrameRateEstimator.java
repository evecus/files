package androidx.media3.exoplayer.video;

import androidx.media3.common.C;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FixedFrameRateEstimator {
    public static final int CONSECUTIVE_MATCHING_FRAME_DURATIONS_FOR_SYNC = 15;
    static final long MAX_MATCHING_FRAME_DIFFERENCE_NS = 1000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_FRAME_RATE_ESTIMATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.1f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private boolean candidateMatcherActive;
    private long frameIndex;
    private int framesWithoutSyncCount;
    private final Listener listener;
    private Matcher currentMatcher = new Matcher();
    private Matcher candidateMatcher = new Matcher();
    private long lastFramePresentationTimeNs = C.TIME_UNSET;
    private float formatFrameRate = -1.0f;
    private float frameRateEstimate = -1.0f;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onFrameRateEstimateChanged(float f);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Matcher {
        private long firstFrameDurationNs;
        private long firstFramePresentationTimeNs;
        private long frameCount;
        private long lastFramePresentationTimeNs;
        private long matchingFrameCount;
        private long matchingFrameDurationSumNs;
        private int recentFrameOutlierCount;
        private final boolean[] recentFrameOutlierFlags = new boolean[15];

        private static int getRecentFrameOutlierIndex(long j) {
            return (int) (j % 15);
        }

        public long getFrameDurationNs() {
            long j = this.matchingFrameCount;
            if (j == 0) {
                return 0L;
            }
            return this.matchingFrameDurationSumNs / j;
        }

        public long getMatchingFrameDurationSumNs() {
            return this.matchingFrameDurationSumNs;
        }

        public boolean isLastFrameOutlier() {
            long j = this.frameCount;
            if (j == 0) {
                return false;
            }
            return this.recentFrameOutlierFlags[getRecentFrameOutlierIndex(j - 1)];
        }

        public boolean isSynced() {
            return this.frameCount > 15 && this.recentFrameOutlierCount == 0;
        }

        public void onNextFrame(long j) {
            long j2 = this.frameCount;
            if (j2 == 0) {
                this.firstFramePresentationTimeNs = j;
            } else if (j2 == 1) {
                long j3 = j - this.firstFramePresentationTimeNs;
                this.firstFrameDurationNs = j3;
                this.matchingFrameDurationSumNs = j3;
                this.matchingFrameCount = 1L;
            } else {
                long j4 = j - this.lastFramePresentationTimeNs;
                int recentFrameOutlierIndex = getRecentFrameOutlierIndex(j2);
                if (Math.abs(j4 - this.firstFrameDurationNs) <= 1000000) {
                    this.matchingFrameCount++;
                    this.matchingFrameDurationSumNs += j4;
                    boolean[] zArr = this.recentFrameOutlierFlags;
                    if (zArr[recentFrameOutlierIndex]) {
                        zArr[recentFrameOutlierIndex] = false;
                        this.recentFrameOutlierCount--;
                    }
                } else {
                    boolean[] zArr2 = this.recentFrameOutlierFlags;
                    if (!zArr2[recentFrameOutlierIndex]) {
                        zArr2[recentFrameOutlierIndex] = true;
                        this.recentFrameOutlierCount++;
                    }
                }
            }
            this.frameCount++;
            this.lastFramePresentationTimeNs = j;
        }

        public void reset() {
            this.frameCount = 0L;
            this.matchingFrameCount = 0L;
            this.matchingFrameDurationSumNs = 0L;
            this.recentFrameOutlierCount = 0;
            Arrays.fill(this.recentFrameOutlierFlags, false);
        }
    }

    public FixedFrameRateEstimator(Listener listener) {
        this.listener = listener;
    }

    private void updateReportedFrameRate() {
        boolean isSynced = this.currentMatcher.isSynced();
        float frameDurationNs = isSynced ? (float) (1.0E9d / this.currentMatcher.getFrameDurationNs()) : this.formatFrameRate;
        float f = this.frameRateEstimate;
        if (frameDurationNs == f) {
            return;
        }
        if (frameDurationNs != -1.0f && f != -1.0f) {
            if (Math.abs(frameDurationNs - this.frameRateEstimate) < ((!isSynced || this.currentMatcher.getMatchingFrameDurationSumNs() < MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS) ? 1.0f : 0.1f)) {
                return;
            }
        } else if (frameDurationNs == -1.0f && this.framesWithoutSyncCount < 30) {
            return;
        }
        this.frameRateEstimate = frameDurationNs;
        this.listener.onFrameRateEstimateChanged(frameDurationNs);
    }

    public long getFrameDurationNs() {
        return this.currentMatcher.isSynced() ? this.currentMatcher.getFrameDurationNs() : C.TIME_UNSET;
    }

    public long getFrameIndex() {
        return this.frameIndex;
    }

    public void onFormatChanged(float f) {
        this.formatFrameRate = f;
        this.currentMatcher.reset();
        this.candidateMatcher.reset();
        this.candidateMatcherActive = false;
        this.lastFramePresentationTimeNs = C.TIME_UNSET;
        this.framesWithoutSyncCount = 0;
        updateReportedFrameRate();
    }

    public void onNextFrame(long j) {
        if (j == this.lastFramePresentationTimeNs) {
            return;
        }
        this.frameIndex++;
        this.currentMatcher.onNextFrame(j);
        if (this.currentMatcher.isSynced()) {
            this.candidateMatcherActive = false;
        } else if (this.lastFramePresentationTimeNs != C.TIME_UNSET) {
            if (!this.candidateMatcherActive || this.candidateMatcher.isLastFrameOutlier()) {
                this.candidateMatcher.reset();
                this.candidateMatcher.onNextFrame(this.lastFramePresentationTimeNs);
            }
            this.candidateMatcherActive = true;
            this.candidateMatcher.onNextFrame(j);
        }
        if (this.candidateMatcherActive && this.candidateMatcher.isSynced()) {
            Matcher matcher = this.currentMatcher;
            this.currentMatcher = this.candidateMatcher;
            this.candidateMatcher = matcher;
            this.candidateMatcherActive = false;
        }
        this.lastFramePresentationTimeNs = j;
        this.framesWithoutSyncCount = this.currentMatcher.isSynced() ? 0 : this.framesWithoutSyncCount + 1;
        updateReportedFrameRate();
    }
}
