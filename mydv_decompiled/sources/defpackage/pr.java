package defpackage;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class pr implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ pr(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.L;
        Object obj2 = this.K;
        Object obj3 = this.J;
        switch (b) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj3).lambda$inputFormatChanged$2((Format) obj2, (DecoderReuseEvaluation) obj);
                return;
            case 1:
                vt0 vt0Var = (vt0) obj2;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) obj;
                try {
                    zj1 t = sv2.t(((yc) obj3).a);
                    if (t == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    b81 b81Var = t.a;
                    ((yj1) b81Var).e(threadPoolExecutor);
                    b81Var.a(new e81(vt0Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    vt0Var.K(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                ((VideoRendererEventListener.EventDispatcher) obj3).lambda$inputFormatChanged$2((Format) obj2, (DecoderReuseEvaluation) obj);
                return;
        }
    }
}
