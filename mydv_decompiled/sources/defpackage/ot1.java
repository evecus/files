package defpackage;

import androidx.media3.common.AdViewProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ot1 implements Consumer, w00 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ ot1(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.K = obj;
        this.J = obj2;
        this.L = obj3;
    }

    @Override // defpackage.w00
    public Object a(v00 v00Var) {
        byte b = this.I;
        fx0 fx0Var = fx0.I;
        Object obj = this.L;
        Object obj2 = this.J;
        Object obj3 = this.K;
        switch (b) {
            case 2:
                tk0 tk0Var = (tk0) obj3;
                gl0 gl0Var = (gl0) obj2;
                hn1 hn1Var = (hn1) obj;
                h hVar = new h((v52) tk0Var.get(q8.r0), (byte) 15);
                p44 p44Var = v00Var.c;
                if (p44Var != null) {
                    p44Var.a(fx0Var, hVar);
                }
                return p70.g0(i42.H(tk0Var), null, gl0Var, new o1((Object) hn1Var, (Object) v00Var, (fj0) null, (byte) 7), 1);
            default:
                Executor executor = (Executor) obj3;
                String str = (String) obj2;
                rm1 rm1Var = (rm1) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                gl2 gl2Var = new gl2(atomicBoolean, (byte) 0);
                p44 p44Var2 = v00Var.c;
                if (p44Var2 != null) {
                    p44Var2.a(fx0Var, gl2Var);
                }
                executor.execute(new hl2(atomicBoolean, v00Var, rm1Var, (byte) 0));
                return str;
        }
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        byte b = this.I;
        Object obj2 = this.L;
        Object obj3 = this.J;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                HlsInterstitialsAdsLoader.lambda$handleContentTimelineChanged$7((AdsMediaSource) obj4, obj3, (Timeline) obj2, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            case 1:
                ((HlsInterstitialsAdsLoader.Listener) obj).onStart((MediaItem) obj4, obj3, (AdViewProvider) obj2);
                break;
            default:
                ((MediaSourceEventListener.EventDispatcher) obj4).lambda$upstreamDiscarded$4((MediaSource.MediaPeriodId) obj3, (MediaLoadData) obj2, (MediaSourceEventListener) obj);
                break;
        }
    }
}
