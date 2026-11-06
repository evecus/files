package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.image.BitmapFactoryImageDecoder;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final int METADATA_RENDERER_COUNT = 4;
    private static final String TAG = "DefaultRenderersFactory";
    private final DefaultMediaCodecAdapterFactory codecAdapterFactory;
    private final Context context;
    private boolean enableAudioOutputPlaybackParameters;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private boolean enableMediaCodecBufferDecodeOnlyFlag;
    private boolean enableMediaCodecVideoRendererDurationToProgressUs;
    private boolean enableMediaCodecVideoRendererPrewarming;
    private int extensionRendererMode = 0;
    private long allowedVideoJoiningTimeMs = 5000;
    private MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;
    private boolean parseAv1SampleDependencies = true;
    private long lateThresholdToDropDecoderInputUs = 15000;
    private long videoRendererEarlySchedulingThresholdUs = MediaCodecVideoRenderer.DEFAULT_EARLY_SCHEDULING_THRESHOLD_US;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.context = context;
        this.codecAdapterFactory = new DefaultMediaCodecAdapterFactory(context);
    }

    private MediaCodecVideoRenderer createMediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, long j) {
        MediaCodecVideoRenderer.Builder earlySchedulingThresholdUs = new MediaCodecVideoRenderer.Builder(context).setCodecAdapterFactory(getCodecAdapterFactory()).setMediaCodecSelector(mediaCodecSelector).setAllowedJoiningTimeMs(j).setEnableDecoderFallback(z).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(50).experimentalSetParseAv1SampleDependencies(this.parseAv1SampleDependencies).experimentalSetLateThresholdToDropDecoderInputUs(this.lateThresholdToDropDecoderInputUs).setEnableDurationToProgressUs(this.enableMediaCodecVideoRendererDurationToProgressUs).setEarlySchedulingThresholdUs(this.videoRendererEarlySchedulingThresholdUs);
        if (Build.VERSION.SDK_INT >= 34) {
            earlySchedulingThresholdUs = earlySchedulingThresholdUs.experimentalSetEnableMediaCodecBufferDecodeOnlyFlag(this.enableMediaCodecBufferDecodeOnlyFlag);
        }
        return earlySchedulingThresholdUs.build();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:15|16)|22|23|24|25|26|28|29|30|31|32|34|35|37) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:(2:15|16)|17|18|19|20|21|22|23|24|25|26|28|29|30|31|32|34|35|37) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:3|(1:5)|6|7|8|9|10|11|12|13|14|15|16|17|18|19|(2:20|21)|22|23|24|25|26|28|29|30|31|32|(3:34|35|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0158, code lost:
    
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0162, code lost:
    
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0107, code lost:
    
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
    
        r15 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void buildAudioRenderers(android.content.Context r15, int r16, androidx.media3.exoplayer.mediacodec.MediaCodecSelector r17, boolean r18, androidx.media3.exoplayer.audio.AudioSink r19, android.os.Handler r20, androidx.media3.exoplayer.audio.AudioRendererEventListener r21, java.util.ArrayList<androidx.media3.exoplayer.Renderer> r22) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.DefaultRenderersFactory.buildAudioRenderers(android.content.Context, int, androidx.media3.exoplayer.mediacodec.MediaCodecSelector, boolean, androidx.media3.exoplayer.audio.AudioSink, android.os.Handler, androidx.media3.exoplayer.audio.AudioRendererEventListener, java.util.ArrayList):void");
    }

    public AudioSink buildAudioSink(Context context, boolean z, boolean z2) {
        return new DefaultAudioSink.Builder(context).setEnableFloatOutput(z).setEnableAudioOutputPlaybackParameters(z2).build();
    }

    public void buildCameraMotionRenderers(Context context, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }

    @Deprecated
    public void buildImageRenderers(ArrayList<Renderer> arrayList) {
        arrayList.add(new ImageRenderer(getImageDecoderFactory(this.context), null));
    }

    public void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(new MetadataRenderer(metadataOutput, looper));
        }
    }

    public Renderer buildSecondaryVideoRenderer(Renderer renderer, Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, long j) {
        if (this.enableMediaCodecVideoRendererPrewarming && renderer.getClass() == MediaCodecVideoRenderer.class) {
            return createMediaCodecVideoRenderer(context, mediaCodecSelector, z, handler, videoRendererEventListener, j);
        }
        return null;
    }

    public void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:3|(1:5)|6|7|8|9|(2:10|11)|13|14|15|16|17|(3:19|20|22)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        r13 = r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void buildVideoRenderers(android.content.Context r17, int r18, androidx.media3.exoplayer.mediacodec.MediaCodecSelector r19, boolean r20, android.os.Handler r21, androidx.media3.exoplayer.video.VideoRendererEventListener r22, long r23, java.util.ArrayList<androidx.media3.exoplayer.Renderer> r25) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.DefaultRenderersFactory.buildVideoRenderers(android.content.Context, int, androidx.media3.exoplayer.mediacodec.MediaCodecSelector, boolean, android.os.Handler, androidx.media3.exoplayer.video.VideoRendererEventListener, long, java.util.ArrayList):void");
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        Handler handler2;
        ArrayList<Renderer> arrayList = new ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        AudioSink buildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioOutputPlaybackParameters);
        if (buildAudioSink != null) {
            handler2 = handler;
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, buildAudioSink, handler2, audioRendererEventListener, arrayList);
        } else {
            handler2 = handler;
        }
        buildTextRenderers(this.context, textOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildImageRenderers(this.context, arrayList);
        buildMiscellaneousRenderers(this.context, handler2, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer createSecondaryRenderer(Renderer renderer, Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        if (renderer.getTrackType() == 2) {
            return buildSecondaryVideoRenderer(renderer, this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs);
        }
        return null;
    }

    public DefaultRenderersFactory experimentalSetEnableMediaCodecBufferDecodeOnlyFlag(boolean z) {
        this.enableMediaCodecBufferDecodeOnlyFlag = z;
        return this;
    }

    public final DefaultRenderersFactory experimentalSetEnableMediaCodecVideoRendererPrewarming(boolean z) {
        this.enableMediaCodecVideoRendererPrewarming = z;
        return this;
    }

    public final DefaultRenderersFactory experimentalSetLateThresholdToDropDecoderInputUs(long j) {
        this.lateThresholdToDropDecoderInputUs = j;
        return this;
    }

    public final DefaultRenderersFactory experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z) {
        this.codecAdapterFactory.setAsyncCryptoFlagEnabled(z);
        return this;
    }

    public final DefaultRenderersFactory experimentalSetParseAv1SampleDependencies(boolean z) {
        this.parseAv1SampleDependencies = z;
        return this;
    }

    public final DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceDisableAsynchronous();
        return this;
    }

    public final DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceEnableAsynchronous();
        return this;
    }

    public MediaCodecAdapter.Factory getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }

    public ImageDecoder.Factory getImageDecoderFactory(Context context) {
        return new BitmapFactoryImageDecoder.Factory(context);
    }

    public final DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j) {
        this.allowedVideoJoiningTimeMs = j;
        return this;
    }

    public final DefaultRenderersFactory setEnableAudioFloatOutput(boolean z) {
        this.enableFloatOutput = z;
        return this;
    }

    public final DefaultRenderersFactory setEnableAudioOutputPlaybackParameters(boolean z) {
        this.enableAudioOutputPlaybackParameters = z;
        return this;
    }

    @Deprecated
    public final DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z) {
        return setEnableAudioOutputPlaybackParameters(z);
    }

    public final DefaultRenderersFactory setEnableDecoderFallback(boolean z) {
        this.enableDecoderFallback = z;
        return this;
    }

    public DefaultRenderersFactory setEnableMediaCodecVideoRendererDurationToProgressUs(boolean z) {
        this.enableMediaCodecVideoRendererDurationToProgressUs = z;
        return this;
    }

    public final DefaultRenderersFactory setExtensionRendererMode(int i) {
        this.extensionRendererMode = i;
        return this;
    }

    public final DefaultRenderersFactory setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }

    public final DefaultRenderersFactory setVideoRendererEarlySchedulingThresholdUs(long j) {
        this.videoRendererEarlySchedulingThresholdUs = j;
        return this;
    }

    public void buildImageRenderers(Context context, ArrayList<Renderer> arrayList) {
        buildImageRenderers(arrayList);
    }

    public void buildMiscellaneousRenderers(Context context, Handler handler, int i, ArrayList<Renderer> arrayList) {
    }
}
