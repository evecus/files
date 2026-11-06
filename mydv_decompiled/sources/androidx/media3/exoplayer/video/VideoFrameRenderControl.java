package androidx.media3.exoplayer.video;

import androidx.media3.common.C;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import defpackage.sp0;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class VideoFrameRenderControl {
    private final FixedFrameRateEstimator frameRateEstimator;
    private final FrameRenderer frameRenderer;
    private long outputStreamStartPositionUs;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
    private final TimedValueQueue<VideoSize> videoSizes = new TimedValueQueue<>();
    private final TimedValueQueue<Long> streamStartPositionsUs = new TimedValueQueue<>();
    private final LongArrayQueue presentationTimestampsUs = new LongArrayQueue();
    private long latestInputPresentationTimeUs = C.TIME_UNSET;
    private VideoSize outputVideoSize = VideoSize.UNKNOWN;
    private long latestOutputPresentationTimeUs = C.TIME_UNSET;
    private long lastPresentationTimeUs = C.TIME_UNSET;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface FrameRenderer {
        void dropFrame();

        void onVideoSizeChanged(VideoSize videoSize);

        void renderFrame(long j, long j2, boolean z);
    }

    public VideoFrameRenderControl(FrameRenderer frameRenderer, VideoFrameReleaseControl videoFrameReleaseControl, VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster, FixedFrameRateEstimator fixedFrameRateEstimator) {
        this.frameRenderer = frameRenderer;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        this.frameRateEstimator = fixedFrameRateEstimator;
    }

    private void dropFrame() {
        this.presentationTimestampsUs.remove();
        this.frameRenderer.dropFrame();
    }

    private static <T> T getLastAndClear(TimedValueQueue<T> timedValueQueue) {
        sp0.o(timedValueQueue.size() > 0);
        while (timedValueQueue.size() > 1) {
            timedValueQueue.pollFirst();
        }
        T pollFirst = timedValueQueue.pollFirst();
        pollFirst.getClass();
        return pollFirst;
    }

    private boolean maybeUpdateOutputStream(long j) {
        Long pollFloor = this.streamStartPositionsUs.pollFloor(j);
        if (pollFloor == null || pollFloor.longValue() == this.outputStreamStartPositionUs) {
            return false;
        }
        this.outputStreamStartPositionUs = pollFloor.longValue();
        return true;
    }

    private boolean maybeUpdateOutputVideoSize(long j) {
        VideoSize pollFloor = this.videoSizes.pollFloor(j);
        if (pollFloor == null || pollFloor.equals(VideoSize.UNKNOWN) || pollFloor.equals(this.outputVideoSize)) {
            return false;
        }
        this.outputVideoSize = pollFloor;
        return true;
    }

    private void renderFrame(boolean z) {
        long remove = this.presentationTimestampsUs.remove();
        if (maybeUpdateOutputVideoSize(remove)) {
            this.frameRenderer.onVideoSizeChanged(this.outputVideoSize);
        }
        this.frameRenderer.renderFrame(z ? Clock.DEFAULT.nanoTime() : this.videoFrameReleaseInfo.getReleaseTimeNs(), remove, this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame());
    }

    public void flush() {
        this.presentationTimestampsUs.clear();
        this.latestInputPresentationTimeUs = C.TIME_UNSET;
        this.latestOutputPresentationTimeUs = C.TIME_UNSET;
        this.lastPresentationTimeUs = C.TIME_UNSET;
        if (this.streamStartPositionsUs.size() > 0) {
            this.outputStreamStartPositionUs = ((Long) getLastAndClear(this.streamStartPositionsUs)).longValue();
        }
        if (this.videoSizes.size() > 0) {
            this.videoSizes.add(0L, (VideoSize) getLastAndClear(this.videoSizes));
        }
    }

    public boolean isEnded() {
        long j = this.lastPresentationTimeUs;
        return j != C.TIME_UNSET && this.latestOutputPresentationTimeUs == j;
    }

    public void onFrameAvailableForRendering(long j) {
        this.presentationTimestampsUs.add(j);
        this.latestInputPresentationTimeUs = j;
        this.lastPresentationTimeUs = C.TIME_UNSET;
    }

    public void onStreamChanged(int i, long j) {
        if (this.presentationTimestampsUs.isEmpty()) {
            this.videoFrameReleaseControl.onStreamChanged(i);
            this.outputStreamStartPositionUs = j;
        } else {
            TimedValueQueue<Long> timedValueQueue = this.streamStartPositionsUs;
            long j2 = this.latestInputPresentationTimeUs;
            timedValueQueue.add(j2 == C.TIME_UNSET ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    public void onVideoSizeChanged(int i, int i2) {
        TimedValueQueue<VideoSize> timedValueQueue = this.videoSizes;
        long j = this.latestInputPresentationTimeUs;
        timedValueQueue.add(j == C.TIME_UNSET ? 0L : j + 1, new VideoSize(i, i2));
    }

    public void render(long j, long j2) {
        while (!this.presentationTimestampsUs.isEmpty()) {
            long element = this.presentationTimestampsUs.element();
            if (maybeUpdateOutputStream(element)) {
                this.videoFrameReleaseControl.onStreamChanged(2);
            }
            this.frameRateEstimator.onNextFrame(1000 * element);
            int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(element, j, j2, this.outputStreamStartPositionUs, false, false, this.frameRateEstimator.getFrameDurationNs(), this.frameRateEstimator.getFrameIndex(), this.videoFrameReleaseInfo);
            if (frameReleaseAction != 5 && frameReleaseAction != 4) {
                this.videoFrameReleaseEarlyTimeForecaster.onVideoFrameProcessed(element, this.videoFrameReleaseInfo.getEarlyUs());
            }
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                this.latestOutputPresentationTimeUs = element;
                renderFrame(frameReleaseAction == 0);
            } else if (frameReleaseAction == 2 || frameReleaseAction == 3) {
                this.latestOutputPresentationTimeUs = element;
                dropFrame();
            } else {
                if (frameReleaseAction != 4) {
                    if (frameReleaseAction == 5) {
                        return;
                    }
                    zy.i(String.valueOf(frameReleaseAction));
                    return;
                }
                this.latestOutputPresentationTimeUs = element;
            }
        }
    }

    public void signalEndOfInput() {
        long j = this.latestInputPresentationTimeUs;
        if (j == C.TIME_UNSET) {
            j = Long.MIN_VALUE;
            this.latestInputPresentationTimeUs = Long.MIN_VALUE;
            this.latestOutputPresentationTimeUs = Long.MIN_VALUE;
        }
        this.lastPresentationTimeUs = j;
    }
}
