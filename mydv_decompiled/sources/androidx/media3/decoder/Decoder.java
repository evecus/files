package androidx.media3.decoder;

import androidx.media3.decoder.DecoderException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface Decoder<I, O, E extends DecoderException> {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Callback {
        void onInputBufferAvailable();

        void onOutputBufferAvailable();
    }

    I dequeueInputBuffer();

    O dequeueOutputBuffer();

    void flush();

    String getName();

    void queueInputBuffer(I i);

    void release();

    void setCallback(Callback callback, Executor executor);

    void setOutputStartTimeUs(long j);
}
