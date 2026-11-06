package androidx.media3.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.util.TimestampIterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface VideoGraph {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Factory {
        VideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, Listener listener, Executor executor, long j, boolean z);

        boolean supportsMultipleInputs();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onEnded(long j);

        void onError(VideoFrameProcessingException videoFrameProcessingException);

        void onOutputFrameAvailableForRendering(long j, boolean z);

        void onOutputFrameRateChanged(float f);

        void onOutputSizeChanged(int i, int i2);
    }

    void flush();

    Surface getInputSurface(int i);

    int getPendingInputFrameCount(int i);

    boolean hasProducedFrameWithTimestampZero();

    void initialize();

    boolean queueInputBitmap(int i, Bitmap bitmap, TimestampIterator timestampIterator);

    boolean queueInputTexture(int i, int i2, long j);

    void redraw();

    void registerInput(int i);

    boolean registerInputFrame(int i);

    void registerInputStream(int i, int i2, Format format, List<Effect> list, long j);

    void release();

    void renderOutputFrame(long j);

    void setCompositionEffects(List<Effect> list);

    void setCompositorSettings(VideoCompositorSettings videoCompositorSettings);

    void setOnInputFrameProcessedListener(int i, OnInputFrameProcessedListener onInputFrameProcessedListener);

    void setOnInputSurfaceReadyListener(int i, Runnable runnable);

    void setOutputSurfaceInfo(SurfaceInfo surfaceInfo);

    void signalEndOfInput(int i);
}
