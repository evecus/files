package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.FixedFrameRateEstimator;
import androidx.media3.exoplayer.video.VideoFrameRenderControl;
import androidx.media3.exoplayer.video.VideoSink;
import defpackage.sp0;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class DefaultVideoSink implements VideoSink {
    private final FixedFrameRateEstimator frameRateEstimator;
    private Format inputFormat;
    private VideoSink.Listener listener;
    private Executor listenerExecutor;
    private Surface outputSurface;
    private long streamStartPositionUs;
    private final Queue<VideoSink.VideoFrameHandler> videoFrameHandlers;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    private final VideoFrameRenderControl videoFrameRenderControl;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class FrameRendererImpl implements VideoFrameRenderControl.FrameRenderer {
        private Format outputFormat;

        private FrameRendererImpl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$dropFrame$2() {
            DefaultVideoSink.this.listener.onFrameDropped();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoSizeChanged$0(VideoSize videoSize) {
            DefaultVideoSink.this.listener.onVideoSizeChanged(videoSize);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$renderFrame$1() {
            DefaultVideoSink.this.listener.onFirstFrameRendered();
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void dropFrame() {
            DefaultVideoSink.this.listenerExecutor.execute(new d(this, (byte) 1));
            ((VideoSink.VideoFrameHandler) DefaultVideoSink.this.videoFrameHandlers.remove()).skip();
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void onVideoSizeChanged(VideoSize videoSize) {
            this.outputFormat = new Format.Builder().setWidth(videoSize.width).setHeight(videoSize.height).setSampleMimeType(MimeTypes.VIDEO_RAW).build();
            DefaultVideoSink.this.listenerExecutor.execute(new e(this, videoSize, (byte) 0));
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void renderFrame(long j, long j2, boolean z) {
            if (z && DefaultVideoSink.this.outputSurface != null) {
                DefaultVideoSink.this.listenerExecutor.execute(new d(this, (byte) 0));
            }
            Format format = this.outputFormat;
            if (format == null) {
                format = new Format.Builder().build();
            }
            DefaultVideoSink.this.videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j2, j, format, null);
            ((VideoSink.VideoFrameHandler) DefaultVideoSink.this.videoFrameHandlers.remove()).render(j);
        }
    }

    public DefaultVideoSink(final VideoFrameReleaseControl videoFrameReleaseControl, VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster, Clock clock) {
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        videoFrameReleaseControl.setClock(clock);
        FixedFrameRateEstimator fixedFrameRateEstimator = new FixedFrameRateEstimator(new FixedFrameRateEstimator.Listener() { // from class: androidx.media3.exoplayer.video.a
            @Override // androidx.media3.exoplayer.video.FixedFrameRateEstimator.Listener
            public final void onFrameRateEstimateChanged(float f) {
                VideoFrameReleaseControl.this.setSurfaceMediaFrameRate(f);
            }
        });
        this.frameRateEstimator = fixedFrameRateEstimator;
        this.videoFrameRenderControl = new VideoFrameRenderControl(new FrameRendererImpl(), videoFrameReleaseControl, videoFrameReleaseEarlyTimeForecaster, fixedFrameRateEstimator);
        this.videoFrameHandlers = new ArrayDeque();
        this.inputFormat = new Format.Builder().build();
        this.streamStartPositionUs = C.TIME_UNSET;
        this.listener = VideoSink.Listener.NO_OP;
        this.listenerExecutor = new b();
        this.videoFrameMetadataListener = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleInputFrame$3() {
        this.listener.onFrameAvailableForRendering();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void allowReleaseFirstFrameBeforeStarted() {
        this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void clearOutputSurfaceInfo() {
        this.outputSurface = null;
        this.videoFrameReleaseControl.setOutputSurface(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void flush(boolean z) {
        if (z) {
            this.videoFrameReleaseControl.reset();
        }
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        this.videoFrameRenderControl.flush();
        this.videoFrameHandlers.clear();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public Surface getInputSurface() {
        Surface surface = this.outputSurface;
        surface.getClass();
        return surface;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean handleInputFrame(long j, VideoSink.VideoFrameHandler videoFrameHandler) {
        this.videoFrameHandlers.add(videoFrameHandler);
        this.videoFrameRenderControl.onFrameAvailableForRendering(j);
        this.listenerExecutor.execute(new d(this, (byte) 2));
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean initialize(Format format) {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isEnded() {
        return this.videoFrameRenderControl.isEnded();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isInitialized() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isReady(boolean z) {
        return this.videoFrameReleaseControl.isReady(z);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void join(boolean z) {
        this.videoFrameReleaseControl.join(z);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onInputStreamChanged(int i, Format format, long j, int i2, List<Effect> list) {
        sp0.z(list.isEmpty());
        int i3 = format.width;
        Format format2 = this.inputFormat;
        if (i3 != format2.width || format.height != format2.height) {
            this.videoFrameRenderControl.onVideoSizeChanged(i3, format.height);
        }
        float f = format.frameRate;
        if (f != this.inputFormat.frameRate) {
            this.frameRateEstimator.onFormatChanged(f);
        }
        this.inputFormat = format;
        if (j != this.streamStartPositionUs) {
            this.videoFrameRenderControl.onStreamChanged(i2, j);
            this.streamStartPositionUs = j;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void redraw() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void render(long j, long j2) {
        try {
            this.videoFrameRenderControl.render(j, j2);
        } catch (ExoPlaybackException e) {
            throw new VideoSink.VideoSinkException(e, this.inputFormat);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setBufferTimestampAdjustmentUs(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setChangeFrameRateStrategy(int i) {
        this.videoFrameReleaseControl.setChangeFrameRateStrategy(i);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setListener(VideoSink.Listener listener, Executor executor) {
        this.listener = listener;
        this.listenerExecutor = executor;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setOutputSurfaceInfo(Surface surface, Size size) {
        this.outputSurface = surface;
        this.videoFrameReleaseControl.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setPlaybackSpeed(float f) {
        this.videoFrameReleaseControl.setPlaybackSpeed(f);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setVideoEffects(List<Effect> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void signalEndOfCurrentInputStream() {
        this.videoFrameRenderControl.signalEndOfInput();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void startRendering() {
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        this.videoFrameReleaseControl.onStarted();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void stopRendering() {
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        this.videoFrameReleaseControl.onStopped();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void release() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void signalEndOfInput() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(Runnable runnable) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$2(long j, long j2, Format format, MediaFormat mediaFormat) {
    }
}
