package defpackage;

import android.content.Context;
import android.os.Handler;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class po5 extends DefaultRenderersFactory {
    public final /* synthetic */ v05 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po5(v05 v05Var, Context context) {
        super(context);
        this.a = v05Var;
    }

    @Override // androidx.media3.exoplayer.DefaultRenderersFactory
    public final AudioSink buildAudioSink(Context context, boolean z, boolean z2) {
        context.getClass();
        DefaultAudioSink build = new DefaultAudioSink.Builder(context).setEnableFloatOutput(z).setEnableAudioTrackPlaybackParams(z2).setAudioProcessorChain(this.a).build();
        build.getClass();
        return build;
    }

    @Override // androidx.media3.exoplayer.DefaultRenderersFactory
    public final void buildVideoRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, long j, ArrayList arrayList) {
        context.getClass();
        mediaCodecSelector.getClass();
        handler.getClass();
        videoRendererEventListener.getClass();
        arrayList.getClass();
        MediaCodecAdapter.Factory codecAdapterFactory = getCodecAdapterFactory();
        codecAdapterFactory.getClass();
        arrayList.add(new sy5(context, codecAdapterFactory, mediaCodecSelector, j, z, handler, videoRendererEventListener));
    }
}
