package androidx.media3.common.video;

import androidx.media3.common.Format;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface FrameWriter extends AutoCloseable {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Info {
        boolean isSupported(Format format, long j);
    }

    @Override // java.lang.AutoCloseable
    void close();

    void configure(Format format, long j);

    AsyncFrame dequeueInputFrame(Executor executor, Runnable runnable);

    Info getInfo();

    void queueInputFrame(Frame frame, SyncFenceWrapper syncFenceWrapper);

    void signalEndOfStream();
}
