package defpackage;

import android.content.Context;
import android.os.Handler;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sy5 extends MediaCodecVideoRenderer {
    public sy5(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener) {
        super(context, factory, mediaCodecSelector, j, z, handler, videoRendererEventListener, 50);
    }

    @Override // androidx.media3.exoplayer.video.MediaCodecVideoRenderer
    public final boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        str.getClass();
        return ro5.a || super.codecNeedsSetOutputSurfaceWorkaround(str);
    }
}
