package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import defpackage.or0;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DefaultRendererCapabilitiesList implements RendererCapabilitiesList {
    private final Renderer[] renderers;

    private DefaultRendererCapabilitiesList(Renderer[] rendererArr) {
        this.renderers = (Renderer[]) Arrays.copyOf(rendererArr, rendererArr.length);
        for (int i = 0; i < rendererArr.length; i++) {
            this.renderers[i].init(i, PlayerId.UNSET, Clock.DEFAULT);
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public RendererCapabilities[] getRendererCapabilities() {
        RendererCapabilities[] rendererCapabilitiesArr = new RendererCapabilities[this.renderers.length];
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return rendererCapabilitiesArr;
            }
            rendererCapabilitiesArr[i] = rendererArr[i].getCapabilities();
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public void release() {
        for (Renderer renderer : this.renderers) {
            renderer.release();
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public int size() {
        return this.renderers.length;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements RendererCapabilitiesList.Factory {
        private final RenderersFactory renderersFactory;

        public Factory(Context context) {
            this.renderersFactory = new DefaultRenderersFactory(context);
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList.Factory
        public DefaultRendererCapabilitiesList createRendererCapabilitiesList() {
            return new DefaultRendererCapabilitiesList(this.renderersFactory.createRenderers(Util.createHandlerForCurrentOrMainLooper(), new VideoRendererEventListener() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.1
                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final void onVideoCodecError(Exception exc) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final void onVideoCodecParametersChanged(CodecParameters codecParameters) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final void onVideoDecoderReleased(String str) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final void onVideoDisabled(DecoderCounters decoderCounters) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final void onVideoEnabled(DecoderCounters decoderCounters) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final void onVideoSizeChanged(VideoSize videoSize) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final void onDroppedFrames(int i, long j) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final void onRenderedFirstFrame(Object obj, long j) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final void onVideoFrameProcessingOffset(long j, int i) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final void onVideoDecoderInitialized(String str, long j, long j2) {
                }
            }, new AudioRendererEventListener() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.2
                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioCodecError(Exception exc) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioCodecParametersChanged(CodecParameters codecParameters) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioDecoderReleased(String str) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioDisabled(DecoderCounters decoderCounters) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioEnabled(DecoderCounters decoderCounters) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioPositionAdvancing(long j) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioSessionIdChanged(int i) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioSinkError(Exception exc) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onSkipSilenceEnabledChanged(boolean z) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioDecoderInitialized(String str, long j, long j2) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final void onAudioUnderrun(int i, long j, long j2) {
                }
            }, new or0((byte) 5), new or0((byte) 6)));
        }

        public Factory(RenderersFactory renderersFactory) {
            this.renderersFactory = renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$createRendererCapabilitiesList$0(CueGroup cueGroup) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$createRendererCapabilitiesList$1(Metadata metadata) {
        }
    }
}
