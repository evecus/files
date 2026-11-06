package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.ThrowingRunnable;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.extractor.VorbisUtil;
import defpackage.ay1;
import defpackage.dq2;
import defpackage.dy1;
import defpackage.fx2;
import defpackage.hf1;
import defpackage.sp0;
import defpackage.x24;
import defpackage.xx1;
import defpackage.yx1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    private static final long READY_GRACE_PERIOD_MS = 100;
    private static final String TAG = "MediaCodecAudioRenderer";
    private static final String VIVO_BITS_PER_SAMPLE_KEY = "v-bits-per-sample";
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private boolean audioSinkNeedsReset;
    private int codecMaxInputSize;
    private boolean codecNeedsDiscardChannelsWorkaround;
    private boolean codecNeedsVorbisToAndroidChannelMappingWorkaround;
    private final Context context;
    private long currentPositionUs;
    private Format decryptOnlyCodecFormat;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;
    private long firstNotReadyTimeMs;
    private boolean hasBeenReady;
    private boolean hasPendingReportedSkippedSilence;
    private boolean hasReportedAudioPositionAdvancing;
    private Format inputFormat;
    private boolean isStarted;
    private final LoudnessCodecController loudnessCodecController;
    private long nextBufferToWritePresentationTimeUs;
    private final AtomicBoolean processOutputBufferResultHolder;
    private int rendererPriority;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class AudioSinkListener implements AudioSink.Listener {
        private AudioSinkListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioCapabilitiesChanged() {
            MediaCodecAudioRenderer.this.onRendererCapabilitiesChanged();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSessionIdChanged(int i) {
            if (Build.VERSION.SDK_INT >= 35 && MediaCodecAudioRenderer.this.loudnessCodecController != null) {
                MediaCodecAudioRenderer.this.loudnessCodecController.setAudioSessionId(i);
            }
            MediaCodecAudioRenderer.this.eventDispatcher.audioSessionIdChanged(i);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSinkError(Exception exc) {
            Log.e(MediaCodecAudioRenderer.TAG, "Audio sink error", exc);
            MediaCodecAudioRenderer.this.eventDispatcher.audioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioTrackReleased(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onOffloadBufferEmptying() {
            Renderer.WakeupListener wakeupListener = MediaCodecAudioRenderer.this.getWakeupListener();
            if (wakeupListener != null) {
                wakeupListener.onWakeup();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onOffloadBufferFull() {
            Renderer.WakeupListener wakeupListener = MediaCodecAudioRenderer.this.getWakeupListener();
            if (wakeupListener != null) {
                wakeupListener.onSleep();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionAdvancing(long j) {
            MediaCodecAudioRenderer.this.hasReportedAudioPositionAdvancing = true;
            MediaCodecAudioRenderer.this.eventDispatcher.positionAdvancing(j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
            MediaCodecAudioRenderer.this.onPositionDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSilenceSkipped() {
            MediaCodecAudioRenderer.this.hasPendingReportedSkippedSilence = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean z) {
            MediaCodecAudioRenderer.this.eventDispatcher.skipSilenceEnabledChanged(z);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onUnderrun(int i, long j, long j2) {
            MediaCodecAudioRenderer.this.eventDispatcher.underrun(i, j, j2);
        }
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink, LoudnessCodecController loudnessCodecController) {
        super(context.getApplicationContext(), 1, factory, mediaCodecSelector, z, 0.0f);
        this.context = context.getApplicationContext();
        this.audioSink = audioSink;
        this.loudnessCodecController = loudnessCodecController;
        this.rendererPriority = -1000;
        this.eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        this.processOutputBufferResultHolder = new AtomicBoolean();
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        this.firstNotReadyTimeMs = C.TIME_UNSET;
        this.hasBeenReady = false;
    }

    private static boolean codecNeedsDiscardChannelsWorkaround(String str) {
        if (MediaLibraryInfo.enableWorkarounds() && Build.VERSION.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean codecNeedsVorbisToAndroidChannelMappingWorkaround(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean deviceDoesntSupportOperatingRate() {
        if (!MediaLibraryInfo.enableWorkarounds() || Build.VERSION.SDK_INT != 23) {
            return false;
        }
        String str = Build.MODEL;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    private int getAudioOffloadSupport(Format format) {
        AudioOffloadSupport formatOffloadSupport = this.audioSink.getFormatOffloadSupport(format);
        if (!formatOffloadSupport.isFormatSupported) {
            return 0;
        }
        int i = formatOffloadSupport.isGaplessSupported ? 1536 : 512;
        return formatOffloadSupport.isSpeedChangeSupported ? i | 2048 : i;
    }

    private static List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z, AudioSink audioSink) {
        MediaCodecInfo decryptOnlyDecoderInfo;
        if (format.sampleMimeType != null) {
            return (!audioSink.supportsFormat(format) || (decryptOnlyDecoderInfo = MediaCodecUtil.getDecryptOnlyDecoderInfo()) == null) ? MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, format, z, false) : dy1.t(decryptOnlyDecoderInfo);
        }
        ay1 ay1Var = dy1.J;
        return x24.M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processOutputBuffer$0(ByteBuffer byteBuffer, long j, int i) {
        this.processOutputBufferResultHolder.set(this.audioSink.handleBuffer(byteBuffer, j, i));
    }

    private void setAudioSessionId(int i) {
        LoudnessCodecController loudnessCodecController;
        this.audioSink.setAudioSessionId(i);
        if (Build.VERSION.SDK_INT < 35 || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.setAudioSessionId(i);
    }

    private void updateCodecImportance() {
        MediaCodecAdapter codec = getCodec();
        if (codec != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.audioSink.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                currentPositionUs = Math.max(this.currentPositionUs, currentPositionUs);
            }
            this.currentPositionUs = currentPositionUs;
            this.allowPositionDiscontinuity = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2, boolean z) {
        DecoderReuseEvaluation canReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i = canReuseCodec.discardReasons;
        if (isBypassPossible(format2)) {
            i |= 32768;
        }
        if (getCodecMaxInputSize(mediaCodecInfo, format2) > this.codecMaxInputSize) {
            i |= 64;
        }
        int i2 = i;
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, i2 != 0 ? 0 : canReuseCodec.result, i2);
    }

    public int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        int codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            return codecMaxInputSize;
        }
        for (Format format2 : formatArr) {
            if (mediaCodecInfo.canReuseCodec(format, format2).result != 0) {
                codecMaxInputSize = Math.max(codecMaxInputSize, getCodecMaxInputSize(mediaCodecInfo, format2));
            }
        }
        return codecMaxInputSize;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public float getCodecOperatingRateV23(float f, Format format, Format[] formatArr) {
        MediaFormat codecOutputMediaFormat;
        int i = -1;
        for (Format format2 : formatArr) {
            int i2 = format2.sampleRate;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1 && (codecOutputMediaFormat = getCodecOutputMediaFormat()) != null && codecOutputMediaFormat.containsKey("sample-rate")) {
            i = codecOutputMediaFormat.getInteger("sample-rate");
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public long getDurationToProgressUs(long j, long j2, boolean z) {
        boolean z2 = this.audioSink.hasPendingData() && this.nextBufferToWritePresentationTimeUs != C.TIME_UNSET;
        if (!this.isStarted) {
            if (z2 || super.isEnded()) {
                return 1000000L;
            }
            return Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        }
        long audioTrackBufferSizeUs = this.audioSink.getAudioTrackBufferSizeUs();
        if (this.hasReportedAudioPositionAdvancing && z2 && audioTrackBufferSizeUs != C.TIME_UNSET) {
            return Math.max(Renderer.DEFAULT_DURATION_TO_PROGRESS_US, (long) ((Math.min(audioTrackBufferSizeUs, this.nextBufferToWritePresentationTimeUs - j) / (getPlaybackParameters() != null ? getPlaybackParameters().speed : 1.0f)) / 2.0f));
        }
        return Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f) {
        this.codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format, getStreamFormats());
        this.codecNeedsDiscardChannelsWorkaround = codecNeedsDiscardChannelsWorkaround(mediaCodecInfo.name);
        this.codecNeedsVorbisToAndroidChannelMappingWorkaround = codecNeedsVorbisToAndroidChannelMappingWorkaround(mediaCodecInfo.name);
        MediaFormat mediaFormat = getMediaFormat(format, mediaCodecInfo.codecMimeType, this.codecMaxInputSize, f);
        this.decryptOnlyCodecFormat = (!MimeTypes.AUDIO_RAW.equals(mediaCodecInfo.mimeType) || MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) ? null : format;
        return MediaCodecAdapter.Configuration.createForAudioDecoding(mediaCodecInfo, mediaFormat, format, mediaCrypto, this.loudnessCodecController);
    }

    public MediaFormat getMediaFormat(Format format, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.channelCount);
        mediaFormat.setInteger("sample-rate", format.sampleRate);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", i);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f && !deviceDoesntSupportOperatingRate()) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (MimeTypes.AUDIO_AC4.equals(format.sampleMimeType)) {
            Pair<Integer, Integer> codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format);
            if (codecProfileAndLevel != null) {
                MediaFormatUtil.maybeSetInteger(mediaFormat, "profile", ((Integer) codecProfileAndLevel.first).intValue());
                MediaFormatUtil.maybeSetInteger(mediaFormat, "level", ((Integer) codecProfileAndLevel.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24 && this.audioSink.getFormatSupport(Util.getPcmFormat(4, format.channelCount, format.sampleRate)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.rendererPriority));
        }
        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_IAMF)) {
            AudioCapabilities audioCapabilities = this.audioSink.getAudioCapabilities();
            if (audioCapabilities == null) {
                Log.w(TAG, "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                int outputChannelMaskForCurrentConfiguration = IamfUtil.getOutputChannelMaskForCurrentConfiguration(audioCapabilities);
                int bitCount = Integer.bitCount(outputChannelMaskForCurrentConfiguration);
                mediaFormat.setInteger("channel-mask", outputChannelMaskForCurrentConfiguration);
                mediaFormat.setInteger("max-output-channel-count", bitCount);
            }
        }
        applyCodecParametersToMediaFormat(mediaFormat);
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.audioSink.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.currentPositionUs;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) {
        Format format;
        if (Build.VERSION.SDK_INT < 29 || (format = decoderInputBuffer.format) == null || !Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) || !isBypassEnabled()) {
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.supplementalData;
        byteBuffer.getClass();
        Format format2 = decoderInputBuffer.format;
        format2.getClass();
        int i = format2.encoderDelay;
        if (byteBuffer.remaining() == 8) {
            this.audioSink.setOffloadDelayPadding(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
        if (i == 2) {
            AudioSink audioSink = this.audioSink;
            obj.getClass();
            audioSink.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            AudioSink audioSink2 = this.audioSink;
            audioAttributes.getClass();
            audioSink2.setAudioAttributes(audioAttributes);
            return;
        }
        if (i == 6) {
            AuxEffectInfo auxEffectInfo = (AuxEffectInfo) obj;
            AudioSink audioSink3 = this.audioSink;
            auxEffectInfo.getClass();
            audioSink3.setAuxEffectInfo(auxEffectInfo);
            return;
        }
        if (i == 12) {
            this.audioSink.setPreferredDevice((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.rendererPriority = ((Integer) obj).intValue();
            updateCodecImportance();
            return;
        }
        if (i == 9) {
            AudioSink audioSink4 = this.audioSink;
            obj.getClass();
            audioSink4.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
            return;
        }
        if (i == 10) {
            obj.getClass();
            setAudioSessionId(((Integer) obj).intValue());
            return;
        }
        if (i == 19) {
            AudioSink audioSink5 = this.audioSink;
            obj.getClass();
            audioSink5.setVirtualDeviceId(((Integer) obj).intValue());
        } else {
            if (i != 20) {
                super.handleMessage(i, obj);
                return;
            }
            AudioSink audioSink6 = this.audioSink;
            obj.getClass();
            audioSink6.setAudioOutputProvider((AudioOutputProvider) obj);
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public boolean hasSkippedSilenceSinceLastCall() {
        boolean z = this.hasPendingReportedSkippedSilence;
        this.hasPendingReportedSkippedSilence = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return super.isEnded() && this.audioSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.audioSink.hasPendingData()) {
            this.firstNotReadyTimeMs = C.TIME_UNSET;
            this.hasBeenReady = true;
            return true;
        }
        if (!this.hasBeenReady || !this.isStarted || !isSourceReady() || hasReadStreamToEnd()) {
            return false;
        }
        long elapsedRealtime = getClock().elapsedRealtime();
        long j = this.firstNotReadyTimeMs;
        if (j != C.TIME_UNSET) {
            return elapsedRealtime - j < READY_GRACE_PERIOD_MS;
        }
        this.firstNotReadyTimeMs = elapsedRealtime;
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecError(Exception exc) {
        Log.e(TAG, "Audio codec error", exc);
        this.eventDispatcher.audioCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j, long j2) {
        this.eventDispatcher.decoderInitialized(str, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecParametersChanged(CodecParameters codecParameters) {
        this.eventDispatcher.audioCodecParametersChanged(codecParameters);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecReleased(String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.audioSinkNeedsReset = true;
        this.inputFormat = null;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        this.hasReportedAudioPositionAdvancing = false;
        try {
            this.audioSink.flush();
            try {
                super.onDisabled();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.onDisabled();
                throw th;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z, boolean z2) {
        super.onEnabled(z, z2);
        this.eventDispatcher.enabled(this.decoderCounters);
        boolean z3 = getConfiguration().tunneling;
        AudioSink audioSink = this.audioSink;
        if (z3) {
            audioSink.enableTunnelingV21();
        } else {
            audioSink.disableTunneling();
        }
        this.audioSink.setPlayerId(getPlayerId());
        this.audioSink.setClock(getClock());
        this.audioSink.setListener(new AudioSinkListener());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) {
        Format format = formatHolder.format;
        format.getClass();
        this.inputFormat = format;
        DecoderReuseEvaluation onInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.eventDispatcher.inputFormatChanged(format, onInputFormatChanged);
        return onInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(Format format, MediaFormat mediaFormat) {
        int i;
        int integer;
        Format format2 = this.decryptOnlyCodecFormat;
        yx1 yx1Var = null;
        if (format2 != null) {
            format = format2;
        } else if (getCodec() != null) {
            mediaFormat.getClass();
            int pcmEncoding = MimeTypes.AUDIO_RAW.equals(format.sampleMimeType) ? format.pcmEncoding : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey(VIVO_BITS_PER_SAMPLE_KEY) ? Util.getPcmEncoding(mediaFormat.getInteger(VIVO_BITS_PER_SAMPLE_KEY)) : 2 : mediaFormat.getInteger("pcm-encoding");
            int integer2 = mediaFormat.getInteger("channel-count");
            int i2 = format.channelMask;
            if (i2 == -1 || format.channelCount != integer2) {
                i2 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i2 = integer;
            }
            Format build = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setPcmEncoding(pcmEncoding).setEncoderDelay(format.encoderDelay).setEncoderPadding(format.encoderPadding).setMetadata(format.metadata).setCustomData(format.customData).setId(format.id).setLabel(format.label).setLabels(format.labels).setLanguage(format.language).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).setChannelCount(integer2).setChannelMask(i2).setSampleRate(mediaFormat.getInteger("sample-rate")).build();
            if (this.codecNeedsDiscardChannelsWorkaround && build.channelCount == 6 && (i = format.channelCount) < 6) {
                sp0.m(i, "Invalid initialCapacity: %s", i >= 0);
                xx1 xx1Var = new xx1((byte) 0, i);
                for (int i3 = 0; i3 < format.channelCount; i3++) {
                    xx1Var.a(i3);
                }
                yx1Var = xx1Var.b();
            } else if (this.codecNeedsVorbisToAndroidChannelMappingWorkaround) {
                yx1Var = VorbisUtil.getVorbisToAndroidChannelLayoutMapping(build.channelCount);
            }
            format = build;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!isBypassEnabled() || getConfiguration().offloadModePreferred == 0) {
                    this.audioSink.setOffloadMode(0);
                } else {
                    this.audioSink.setOffloadMode(getConfiguration().offloadModePreferred);
                }
            }
            this.audioSink.configure(new AudioSink.AudioSinkConfig.Builder(format).setOutputChannelMapping(yx1Var).setTimeline(getTimeline()).setMediaPeriodId(getMediaPeriodId()).build());
            updateCodecOperatingRate();
        } catch (AudioSink.ConfigurationException e) {
            throw createRendererException(e, e.format, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputStreamOffsetUsChanged(long j) {
        this.audioSink.setOutputStreamOffsetUs(j);
    }

    public void onPositionDiscontinuity() {
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z, boolean z2) {
        super.onPositionReset(j, z, z2);
        this.audioSink.flush();
        this.currentPositionUs = j;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        this.firstNotReadyTimeMs = C.TIME_UNSET;
        this.hasBeenReady = false;
        this.hasPendingReportedSkippedSilence = false;
        this.hasReportedAudioPositionAdvancing = false;
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        this.audioSink.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onRelease() {
        LoudnessCodecController loudnessCodecController;
        this.audioSink.release();
        if (Build.VERSION.SDK_INT < 35 || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        this.hasPendingReportedSkippedSilence = false;
        this.hasReportedAudioPositionAdvancing = false;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        try {
            super.onReset();
        } finally {
            if (this.audioSinkNeedsReset) {
                this.audioSinkNeedsReset = false;
                this.audioSink.reset();
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.audioSink.play();
        this.isStarted = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        updateCurrentPosition();
        this.isStarted = false;
        this.audioSink.pause();
        super.onStopped();
        this.hasReportedAudioPositionAdvancing = false;
        this.firstNotReadyTimeMs = C.TIME_UNSET;
        this.hasBeenReady = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j, long j2, MediaCodecAdapter mediaCodecAdapter, final ByteBuffer byteBuffer, int i, int i2, final int i3, final long j3, boolean z, boolean z2, Format format) {
        final MediaCodecAudioRenderer mediaCodecAudioRenderer;
        byteBuffer.getClass();
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        if (this.decryptOnlyCodecFormat != null && (i2 & 2) != 0) {
            mediaCodecAdapter.getClass();
            mediaCodecAdapter.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.releaseOutputBuffer(i, false);
            }
            this.decoderCounters.skippedOutputBufferCount += i3;
            this.audioSink.handleDiscontinuity();
            return true;
        }
        try {
            try {
                mediaCodecAudioRenderer = this;
                try {
                    ThrowingRunnable throwingRunnable = new ThrowingRunnable() { // from class: gx2
                        @Override // androidx.media3.common.util.ThrowingRunnable
                        public final void run() {
                            MediaCodecAudioRenderer.this.lambda$processOutputBuffer$0(byteBuffer, j3, i3);
                        }
                    };
                    if (mediaCodecAdapter != null) {
                        mediaCodecAdapter.useBuffer(throwingRunnable);
                    } else {
                        throwingRunnable.run();
                    }
                    if (!mediaCodecAudioRenderer.processOutputBufferResultHolder.get()) {
                        mediaCodecAudioRenderer.nextBufferToWritePresentationTimeUs = j3;
                        return false;
                    }
                    if (mediaCodecAdapter != null) {
                        mediaCodecAdapter.releaseOutputBuffer(i, false);
                    }
                    mediaCodecAudioRenderer.decoderCounters.renderedOutputBufferCount += i3;
                    return true;
                } catch (AudioSink.InitializationException e) {
                    e = e;
                    AudioSink.InitializationException initializationException = e;
                    throw mediaCodecAudioRenderer.createRendererException(initializationException, mediaCodecAudioRenderer.inputFormat, initializationException.isRecoverable, (!mediaCodecAudioRenderer.isBypassEnabled() || mediaCodecAudioRenderer.getConfiguration().offloadModePreferred == 0) ? PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED : PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED);
                } catch (AudioSink.WriteException e2) {
                    e = e2;
                    AudioSink.WriteException writeException = e;
                    throw mediaCodecAudioRenderer.createRendererException(writeException, format, writeException.isRecoverable, (!mediaCodecAudioRenderer.isBypassEnabled() || mediaCodecAudioRenderer.getConfiguration().offloadModePreferred == 0) ? PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED : PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED);
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception e4) {
                throw new IllegalStateException(e4);
            }
        } catch (AudioSink.InitializationException e5) {
            e = e5;
            mediaCodecAudioRenderer = this;
        } catch (AudioSink.WriteException e6) {
            e = e6;
            mediaCodecAudioRenderer = this;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void renderToEndOfStream() {
        try {
            this.audioSink.playToEndOfStream();
            if (getLastBufferInStreamPresentationTimeUs() != C.TIME_UNSET) {
                this.nextBufferToWritePresentationTimeUs = getLastBufferInStreamPresentationTimeUs();
            }
        } catch (AudioSink.WriteException e) {
            throw createRendererException(e, e.format, e.isRecoverable, isBypassEnabled() ? PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED : PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.audioSink.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean shouldUseBypass(Format format) {
        if (getConfiguration().offloadModePreferred != 0) {
            int audioOffloadSupport = getAudioOffloadSupport(format);
            if ((audioOffloadSupport & 512) != 0) {
                if (getConfiguration().offloadModePreferred == 2 || (audioOffloadSupport & 1024) != 0) {
                    return true;
                }
                if (format.encoderDelay == 0 && format.encoderPadding == 0) {
                    return true;
                }
            }
        }
        return this.audioSink.supportsFormat(format);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) {
        int i;
        boolean z;
        boolean z2 = true;
        int k = hf1.k(1, 0, 0, 0);
        if (!MimeTypes.isAudio(format.sampleMimeType)) {
            return hf1.k(0, 0, 0, 0);
        }
        boolean z3 = format.cryptoType != 0;
        boolean supportsFormatDrm = MediaCodecRenderer.supportsFormatDrm(format);
        int i2 = 8;
        if (!supportsFormatDrm || (z3 && MediaCodecUtil.getDecryptOnlyDecoderInfo() == null)) {
            i = 0;
        } else {
            i = getAudioOffloadSupport(format);
            if (this.audioSink.supportsFormat(format)) {
                return hf1.k(4, 8, 32, i);
            }
        }
        if ((!MimeTypes.AUDIO_RAW.equals(format.sampleMimeType) || this.audioSink.supportsFormat(format)) && this.audioSink.supportsFormat(Util.getPcmFormat(2, format.channelCount, format.sampleRate))) {
            List<MediaCodecInfo> decoderInfos = getDecoderInfos(mediaCodecSelector, format, false, this.audioSink);
            if (!decoderInfos.isEmpty()) {
                if (!supportsFormatDrm) {
                    return hf1.k(2, 0, 0, 0);
                }
                MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
                boolean isFormatSupported = mediaCodecInfo.isFormatSupported(this.context, format);
                if (!isFormatSupported) {
                    for (int i3 = 1; i3 < decoderInfos.size(); i3++) {
                        MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i3);
                        if (mediaCodecInfo2.isFormatSupported(this.context, format)) {
                            z = false;
                            mediaCodecInfo = mediaCodecInfo2;
                            break;
                        }
                    }
                }
                z = true;
                z2 = isFormatSupported;
                int i4 = z2 ? 4 : 3;
                if (z2 && mediaCodecInfo.isSeamlessAdaptationSupported(format)) {
                    i2 = 16;
                }
                return i4 | i2 | 32 | (mediaCodecInfo.hardwareAccelerated ? 64 : 0) | (z ? 128 : 0) | i;
            }
        }
        return k;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z) {
        return MediaCodecUtil.getDecoderInfosSortedByFormatSupport(this.context, getDecoderInfos(mediaCodecSelector, format, z, this.audioSink), format);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public MediaClock getMediaClock() {
        return this;
    }

    private int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if ("OMX.google.raw.decoder".equals(mediaCodecInfo.name) && Build.VERSION.SDK_INT == 23 && !Util.isTv(this.context)) {
            return -1;
        }
        return format.maxInputSize;
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener) {
        this(context, mediaCodecSelector, handler, audioRendererEventListener, new DefaultAudioSink.Builder(context).build());
    }

    @Deprecated
    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioCapabilities audioCapabilities, AudioProcessor... audioProcessorArr) {
        this(context, mediaCodecSelector, handler, audioRendererEventListener, new DefaultAudioSink.Builder().setAudioCapabilities((AudioCapabilities) dq2.J(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr).build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, new DefaultMediaCodecAdapterFactory(context), mediaCodecSelector, false, handler, audioRendererEventListener, audioSink);
        int i = fx2.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, new DefaultMediaCodecAdapterFactory(context), mediaCodecSelector, z, handler, audioRendererEventListener, audioSink);
        int i = fx2.a;
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, factory, mediaCodecSelector, z, handler, audioRendererEventListener, audioSink, Build.VERSION.SDK_INT >= 35 ? new LoudnessCodecController() : null);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, null, null);
    }
}
