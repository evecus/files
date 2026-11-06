package androidx.media3.common.video;

import androidx.media3.common.VideoFrameProcessingException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface FrameProcessor extends AutoCloseable {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Factory {
        FrameProcessor create(FrameWriter frameWriter, Executor executor, Listener listener);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onError(VideoFrameProcessingException videoFrameProcessingException);

        void onFrameProcessed(Frame frame, SyncFenceWrapper syncFenceWrapper);

        void onWakeup();
    }

    @Override // java.lang.AutoCloseable
    void close();

    boolean queue(List<AsyncFrame> list);

    void signalEndOfStream();
}
