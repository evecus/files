package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import androidx.media3.common.Format;
import androidx.media3.common.util.ThrowingRunnable;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ThrowingRunnable, MediaCodecUtil.ScoreProvider {
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.I = obj;
        this.J = obj2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public int getScore(Object obj) {
        int lambda$getDecoderInfosSortedByFormatSupport$0;
        lambda$getDecoderInfosSortedByFormatSupport$0 = MediaCodecUtil.lambda$getDecoderInfosSortedByFormatSupport$0((Context) this.I, (Format) this.J, (MediaCodecInfo) obj);
        return lambda$getDecoderInfosSortedByFormatSupport$0;
    }

    @Override // androidx.media3.common.util.ThrowingRunnable
    public void run() {
        ((AsynchronousMediaCodecAdapter) this.I).lambda$useBuffer$0((ThrowingRunnable) this.J);
    }
}
