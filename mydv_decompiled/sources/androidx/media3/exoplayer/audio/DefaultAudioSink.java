package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.audio.AudioProcessingPipeline;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.SonicAudioProcessor;
import androidx.media3.common.audio.ToInt16PcmAudioProcessor;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOffloadSupport;
import androidx.media3.exoplayer.audio.AudioOutput;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.MpegAudioUtil;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.h;
import defpackage.hf1;
import defpackage.pt1;
import defpackage.s83;
import defpackage.sp0;
import defpackage.ut0;
import defpackage.x24;
import defpackage.zx1;
import defpackage.zy;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {
    private static final int AUDIO_OUTPUT_RETRY_FALLBACK_BUFFER_SIZE = 1000000;
    private static final int AUDIO_OUTPUT_VOLUME_RAMP_TIME_MS = 20;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    private static final int MINIMUM_REPORT_SKIPPED_SILENCE_DURATION_US = 300000;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final int REPORT_SKIPPED_SILENCE_DELAY_MS = 100;
    private static final String TAG = "DefaultAudioSink";
    private long accumulatedSkippedSilenceDurationUs;
    private MediaPositionParameters afterDrainParameters;
    private AudioAttributes audioAttributes;
    private final ExoPlayer.AudioOffloadListener audioOffloadListener;
    private AudioOutput audioOutput;
    private AudioOutputListener audioOutputListener;
    private AudioOutputProvider audioOutputProvider;
    private AudioOutputProvider.Listener audioOutputProviderListener;
    private AudioProcessingPipeline audioProcessingPipeline;
    private final androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
    private int audioSessionId;
    private AuxEffectInfo auxEffectInfo;
    private final dy1 availableAudioProcessors;
    private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private Configuration configuration;
    private final Context context;
    private long currentBufferFramesWritten;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private boolean handledOffloadOnPresentationEnded;
    private final PendingExceptionHolder<AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;
    private ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private int inputBufferOriginalRemaining;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;
    private AudioSink.Listener listener;
    private MediaPositionParameters mediaPositionParameters;
    private final ArrayDeque<MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private int offloadMode;
    private ByteBuffer outputBuffer;
    private long outputStreamOffsetUs;
    private boolean pendingAudioSessionIdChangeConfirmation;
    private Configuration pendingConfiguration;
    private PlaybackParameters playbackParameters;
    private PlayerId playerId;
    private boolean playing;
    private final boolean preferAudioOutputPlaybackParameters;
    private AudioDeviceInfo preferredDevice;
    private Handler reportSkippedSilenceHandler;
    private boolean skipSilenceEnabled;
    private long skippedOutputFrameCountAtLastPosition;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioOutput;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final ToFloatPcmAudioProcessor toFloatPcmAudioProcessor;
    private final ToInt16PcmAudioProcessor toInt16PcmAudioProcessor;
    private final TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private int virtualDeviceId;
    private float volume;
    private final PendingExceptionHolder<AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface AudioOffloadSupportProvider {
        AudioOffloadSupport getAudioOffloadSupport(Format format, AudioAttributes audioAttributes);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class AudioOutputListener implements AudioOutput.Listener {
        private final AudioOutputProvider.OutputConfig outputConfig;

        private AudioOutputListener(AudioOutputProvider.OutputConfig outputConfig) {
            this.outputConfig = outputConfig;
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onOffloadDataRequest() {
            if (this == DefaultAudioSink.this.audioOutputListener && DefaultAudioSink.this.listener != null && DefaultAudioSink.this.playing) {
                DefaultAudioSink.this.listener.onOffloadBufferEmptying();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onOffloadPresentationEnded() {
            if (this == DefaultAudioSink.this.audioOutputListener && DefaultAudioSink.this.stoppedAudioOutput) {
                DefaultAudioSink.this.handledOffloadOnPresentationEnded = true;
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onPositionAdvancing(long j) {
            if (this == DefaultAudioSink.this.audioOutputListener && DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onPositionAdvancing(j);
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onReleased() {
            if (DefaultAudioSink.this.listener != null) {
                AudioSink.Listener listener = DefaultAudioSink.this.listener;
                AudioOutputProvider.OutputConfig outputConfig = this.outputConfig;
                listener.onAudioTrackReleased(new AudioSink.AudioTrackConfig(outputConfig.encoding, outputConfig.sampleRate, outputConfig.channelMask, outputConfig.isTunneling, outputConfig.isOffload, outputConfig.bufferSize));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onUnderrun() {
            long j;
            if (this == DefaultAudioSink.this.audioOutputListener && DefaultAudioSink.this.listener != null) {
                if (DefaultAudioSink.this.configuration.outputPcmFrameSize != -1) {
                    long j2 = DefaultAudioSink.this.configuration.outputConfig.bufferSize / DefaultAudioSink.this.configuration.outputPcmFrameSize;
                    AudioOutput audioOutput = DefaultAudioSink.this.audioOutput;
                    audioOutput.getClass();
                    j = Util.sampleCountToDurationUs(j2, audioOutput.getSampleRate());
                } else {
                    j = C.TIME_UNSET;
                }
                DefaultAudioSink.this.listener.onUnderrun(DefaultAudioSink.this.configuration.outputConfig.bufferSize, Util.usToMs(j), SystemClock.elapsedRealtime() - DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Deprecated
    public interface AudioProcessorChain extends androidx.media3.common.audio.AudioProcessorChain {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface AudioTrackBufferSizeProvider {
        public static final AudioTrackBufferSizeProvider DEFAULT = new DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Deprecated
    public interface AudioTrackProvider {
        public static final AudioTrackProvider DEFAULT = new DefaultAudioTrackProvider();

        AudioTrack getAudioTrack(AudioSink.AudioTrackConfig audioTrackConfig, AudioAttributes audioAttributes, int i, Context context);

        int getAudioTrackChannelConfig(int i);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Configuration {
        private final Format afterProcessingInputFormat;
        private final AudioProcessingPipeline audioProcessingPipeline;
        private final Format inputFormat;
        private final int inputPcmFrameSize;
        private final AudioOutputProvider.OutputConfig outputConfig;
        private final int outputPcmFrameSize;
        private final Object periodUid;
        private final Timeline timeline;

        private Configuration(Format format, Format format2, int i, int i2, AudioOutputProvider.OutputConfig outputConfig, AudioProcessingPipeline audioProcessingPipeline, Timeline timeline, Object obj) {
            this.inputFormat = format;
            this.afterProcessingInputFormat = format2;
            this.inputPcmFrameSize = i;
            this.outputPcmFrameSize = i2;
            this.outputConfig = outputConfig;
            this.audioProcessingPipeline = audioProcessingPipeline;
            this.timeline = timeline;
            this.periodUid = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AudioSink.AudioTrackConfig buildAudioTrackConfig() {
            AudioOutputProvider.OutputConfig outputConfig = this.outputConfig;
            return new AudioSink.AudioTrackConfig(outputConfig.encoding, outputConfig.sampleRate, outputConfig.channelMask, outputConfig.isTunneling, outputConfig.isOffload, outputConfig.bufferSize);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Configuration copyWithOutputConfig(AudioOutputProvider.OutputConfig outputConfig) {
            return new Configuration(this.inputFormat, this.afterProcessingInputFormat, this.inputPcmFrameSize, this.outputPcmFrameSize, outputConfig, this.audioProcessingPipeline, this.timeline, this.periodUid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long framesToDurationUs(long j) {
            return Util.sampleCountToDurationUs(j, this.outputConfig.sampleRate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long inputFramesToDurationUs(long j) {
            return Util.sampleCountToDurationUs(j, this.inputFormat.sampleRate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isPcm() {
            return Objects.equals(this.inputFormat.sampleMimeType, MimeTypes.AUDIO_RAW);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MediaPositionParameters {
        public final long audioOutputPositionUs;
        public long mediaPositionDriftUs;
        public final long mediaTimeUs;
        public final PlaybackParameters playbackParameters;

        private MediaPositionParameters(PlaybackParameters playbackParameters, long j, long j2) {
            this.playbackParameters = playbackParameters;
            this.mediaTimeUs = j;
            this.audioOutputPositionUs = j2;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface OutputMode {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class PendingExceptionHolder<T extends Exception> {
        private static final int RETRY_DELAY_MS = 50;
        private static final int RETRY_DURATION_MS = 200;
        private T pendingException;
        private long throwDeadlineMs = C.TIME_UNSET;
        private long earliestNextRetryTimeMs = C.TIME_UNSET;

        public PendingExceptionHolder() {
        }

        public void clear() {
            this.pendingException = null;
            this.throwDeadlineMs = C.TIME_UNSET;
            this.earliestNextRetryTimeMs = C.TIME_UNSET;
        }

        public boolean shouldWaitBeforeRetry() {
            if (this.pendingException == null) {
                return false;
            }
            return DefaultAudioSink.this.hasPendingAudioOutputReleases() || SystemClock.elapsedRealtime() < this.earliestNextRetryTimeMs;
        }

        public void throwExceptionIfDeadlineIsReached(T t) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.pendingException == null) {
                this.pendingException = t;
            }
            if (this.throwDeadlineMs == C.TIME_UNSET && !DefaultAudioSink.this.hasPendingAudioOutputReleases()) {
                this.throwDeadlineMs = 200 + elapsedRealtime;
            }
            long j = this.throwDeadlineMs;
            if (j == C.TIME_UNSET || elapsedRealtime < j) {
                this.earliestNextRetryTimeMs = elapsedRealtime + 50;
                return;
            }
            T t2 = this.pendingException;
            if (t2 != t) {
                t2.addSuppressed(t);
            }
            T t3 = this.pendingException;
            clear();
            throw t3;
        }
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    private DefaultAudioSink(Builder builder) {
        this.context = builder.context == null ? null : builder.context.getApplicationContext();
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioProcessorChain = builder.audioProcessorChain;
        this.enableFloatOutput = builder.enableFloatOutput;
        this.preferAudioOutputPlaybackParameters = builder.enableAudioOutputPlaybackParameters;
        this.offloadMode = 0;
        this.audioOutputProvider = builder.audioOutputProvider;
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        this.toInt16PcmAudioProcessor = new ToInt16PcmAudioProcessor();
        this.toFloatPcmAudioProcessor = new ToFloatPcmAudioProcessor();
        this.availableAudioProcessors = dy1.u(trimmingAudioProcessor, channelMappingAudioProcessor);
        this.volume = 1.0f;
        this.audioSessionId = 0;
        this.auxEffectInfo = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        this.mediaPositionParameters = new MediaPositionParameters(playbackParameters, 0L, 0L);
        this.playbackParameters = playbackParameters;
        this.skipSilenceEnabled = false;
        this.mediaPositionParametersCheckpoints = new ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new PendingExceptionHolder<>();
        this.writeExceptionPendingExceptionHolder = new PendingExceptionHolder<>();
        this.audioOffloadListener = builder.audioOffloadListener;
        this.virtualDeviceId = (Build.VERSION.SDK_INT < 34 || builder.context == null) ? -1 : getDeviceIdFromContext(builder.context);
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j) {
        PlaybackParameters playbackParameters;
        if (useAudioOutputPlaybackParams()) {
            playbackParameters = PlaybackParameters.DEFAULT;
        } else {
            playbackParameters = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applyPlaybackParameters(this.playbackParameters) : PlaybackParameters.DEFAULT;
            this.playbackParameters = playbackParameters;
        }
        PlaybackParameters playbackParameters2 = playbackParameters;
        this.skipSilenceEnabled = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applySkipSilenceEnabled(this.skipSilenceEnabled) : false;
        this.mediaPositionParametersCheckpoints.add(new MediaPositionParameters(playbackParameters2, Math.max(0L, j), this.configuration.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors(j);
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(this.skipSilenceEnabled);
        }
    }

    private long applyMediaPositionParameters(long j) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j >= this.mediaPositionParametersCheckpoints.getFirst().audioOutputPositionUs) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        MediaPositionParameters mediaPositionParameters = this.mediaPositionParameters;
        long j2 = j - mediaPositionParameters.audioOutputPositionUs;
        long mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(j2, mediaPositionParameters.playbackParameters.speed);
        if (!this.mediaPositionParametersCheckpoints.isEmpty()) {
            MediaPositionParameters mediaPositionParameters2 = this.mediaPositionParameters;
            return mediaPositionParameters2.mediaTimeUs + mediaDurationForPlayoutDuration + mediaPositionParameters2.mediaPositionDriftUs;
        }
        long mediaDuration = this.audioProcessorChain.getMediaDuration(j2);
        MediaPositionParameters mediaPositionParameters3 = this.mediaPositionParameters;
        long j3 = mediaPositionParameters3.mediaTimeUs + mediaDuration;
        mediaPositionParameters3.mediaPositionDriftUs = mediaDuration - mediaDurationForPlayoutDuration;
        return j3;
    }

    private long applySkipping(long j) {
        long skippedOutputFrameCount = this.audioProcessorChain.getSkippedOutputFrameCount();
        long framesToDurationUs = j + this.configuration.framesToDurationUs(skippedOutputFrameCount);
        long j2 = this.skippedOutputFrameCountAtLastPosition;
        if (skippedOutputFrameCount > j2) {
            long framesToDurationUs2 = this.configuration.framesToDurationUs(skippedOutputFrameCount - j2);
            this.skippedOutputFrameCountAtLastPosition = skippedOutputFrameCount;
            handleSkippedSilence(framesToDurationUs2);
        }
        return framesToDurationUs;
    }

    private AudioOutput buildAudioOutput(AudioOutputProvider.OutputConfig outputConfig) {
        try {
            return this.audioOutputProvider.getAudioOutput(outputConfig);
        } catch (AudioOutputProvider.InitializationException e) {
            AudioSink.InitializationException initializationException = new AudioSink.InitializationException(0, outputConfig.sampleRate, outputConfig.channelMask, outputConfig.encoding, outputConfig.bufferSize, this.configuration.inputFormat, outputConfig.isOffload, e);
            AudioSink.Listener listener = this.listener;
            if (listener == null) {
                throw initializationException;
            }
            listener.onAudioSinkError(initializationException);
            throw initializationException;
        }
    }

    private AudioOutput buildAudioOutputWithRetry() {
        try {
            return buildAudioOutput(this.configuration.outputConfig);
        } catch (AudioSink.InitializationException e) {
            int i = this.configuration.outputConfig.bufferSize;
            int minimumRetryBufferSize = this.getMinimumRetryBufferSize();
            int i2 = this.configuration.outputPcmFrameSize != -1 ? this.configuration.outputPcmFrameSize : 1;
            while (i > minimumRetryBufferSize) {
                i = Math.max(minimumRetryBufferSize, i / 2);
                int i3 = i % i2;
                if (i3 != 0) {
                    i = (i2 - i3) + i;
                }
                AudioOutputProvider.OutputConfig build = this.configuration.outputConfig.buildUpon().setBufferSize(i).build();
                try {
                    AudioOutput buildAudioOutput = this.buildAudioOutput(build);
                    this.configuration = this.configuration.copyWithOutputConfig(build);
                    return buildAudioOutput;
                } catch (AudioSink.InitializationException e2) {
                    e.addSuppressed(e2);
                }
            }
            this.maybeDisableOffload();
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void drainOutputBuffer(long r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.drainOutputBuffer(long):void");
    }

    private boolean drainToEndOfStream() {
        ByteBuffer byteBuffer;
        if (!this.audioProcessingPipeline.isOperational()) {
            drainOutputBuffer(Long.MIN_VALUE);
            return this.outputBuffer == null;
        }
        this.audioProcessingPipeline.queueEndOfStream();
        processBuffers(Long.MIN_VALUE);
        return this.audioProcessingPipeline.isEnded() && ((byteBuffer = this.outputBuffer) == null || !byteBuffer.hasRemaining());
    }

    private static int getDeviceIdFromContext(Context context) {
        return resolveDefaultVirtualDeviceIds(context.getDeviceId());
    }

    private AudioOutputProvider.FormatConfig getFormatConfig(Format format, int i) {
        return new AudioOutputProvider.FormatConfig.Builder(format).setAudioAttributes(this.audioAttributes).setEnableHighResolutionPcmOutput(this.enableFloatOutput).setEnablePlaybackParameters(this.preferAudioOutputPlaybackParameters).setEnableOffload(this.offloadMode != 0).setPreferredDevice(this.preferredDevice).setAudioSessionId(this.audioSessionId).setEnableTunneling(this.tunneling).setPreferredBufferSize(i).setVirtualDeviceId(this.virtualDeviceId).build();
    }

    public static int getFramesPerEncodedSample(int i, ByteBuffer byteBuffer) {
        if (i == 20) {
            return OpusUtil.parseOggPacketAudioSampleCount(byteBuffer);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int parseMpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                    if (parseMpegAudioFrameSampleCount != -1) {
                        return parseMpegAudioFrameSampleCount;
                    }
                    s83.d();
                    return 0;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int findTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                            if (findTrueHdSyncframeOffset == -1) {
                                return 0;
                            }
                            return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, findTrueHdSyncframeOffset) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
                        case 18:
                            break;
                        default:
                            zy.i(hf1.u(i, "Unexpected audio encoding: "));
                            return 0;
                    }
            }
            return Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
        }
        return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
    }

    private int getMinimumRetryBufferSize() {
        int maximumEncodedRateBytesPerSecond;
        boolean isEncodingLinearPcm = Util.isEncodingLinearPcm(this.configuration.outputConfig.encoding);
        Configuration configuration = this.configuration;
        if (isEncodingLinearPcm) {
            maximumEncodedRateBytesPerSecond = configuration.outputConfig.sampleRate * this.configuration.outputPcmFrameSize;
        } else {
            int i = configuration.inputFormat.bitrate;
            Configuration configuration2 = this.configuration;
            if (i != -1) {
                maximumEncodedRateBytesPerSecond = configuration2.inputFormat.bitrate / 8;
            } else {
                maximumEncodedRateBytesPerSecond = ExtractorUtil.getMaximumEncodedRateBytesPerSecond(configuration2.outputConfig.encoding);
                if (maximumEncodedRateBytesPerSecond == -2147483647) {
                    maximumEncodedRateBytesPerSecond = 1000000;
                }
            }
        }
        return Math.max(maximumEncodedRateBytesPerSecond, AudioTrack.getMinBufferSize(this.configuration.outputConfig.sampleRate, this.configuration.outputConfig.channelMask, this.configuration.outputConfig.encoding));
    }

    private static int getNonPcmMaximumEncodedRateBytesPerSecond(int i) {
        int maximumEncodedRateBytesPerSecond = ExtractorUtil.getMaximumEncodedRateBytesPerSecond(i);
        sp0.z(maximumEncodedRateBytesPerSecond != -2147483647);
        return maximumEncodedRateBytesPerSecond;
    }

    private long getSubmittedFrames() {
        return this.configuration.isPcm() ? this.submittedPcmBytes / this.configuration.inputPcmFrameSize : this.submittedEncodedFrames;
    }

    private long getWrittenFrames() {
        return this.configuration.isPcm() ? Util.ceilDivide(this.writtenPcmBytes, this.configuration.outputPcmFrameSize) : this.writtenEncodedFrames;
    }

    private void handleSkippedSilence(long j) {
        this.accumulatedSkippedSilenceDurationUs += j;
        Handler handler = this.reportSkippedSilenceHandler;
        if (handler == null) {
            handler = new Handler(Looper.myLooper());
            this.reportSkippedSilenceHandler = handler;
        }
        handler.removeCallbacksAndMessages(null);
        this.reportSkippedSilenceHandler.postDelayed(new h(this, (byte) 9), 100L);
    }

    private boolean hasAudioOutputPendingData(long j) {
        long positionUs = this.audioOutput.getPositionUs();
        AudioOutput audioOutput = this.audioOutput;
        audioOutput.getClass();
        return j > Util.durationUsToSampleCount(positionUs, audioOutput.getSampleRate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasPendingAudioOutputReleases() {
        return this.audioOutputProvider.hasPendingReleases();
    }

    private boolean initializeAudioOutput() {
        if (this.initializationExceptionPendingExceptionHolder.shouldWaitBeforeRetry()) {
            return false;
        }
        this.audioOutput = buildAudioOutputWithRetry();
        AudioOutputListener audioOutputListener = new AudioOutputListener(this.configuration.outputConfig);
        this.audioOutputListener = audioOutputListener;
        this.audioOutput.addListener(audioOutputListener);
        ExoPlayer.AudioOffloadListener audioOffloadListener = this.audioOffloadListener;
        if (audioOffloadListener != null) {
            audioOffloadListener.onOffloadedPlayback(this.audioOutput.isOffloadedPlayback());
        }
        if (this.audioOutput.isOffloadedPlayback() && this.configuration.outputConfig.useOffloadGapless) {
            this.audioOutput.setOffloadDelayPadding(this.configuration.inputFormat.encoderDelay, this.configuration.inputFormat.encoderPadding);
        }
        PlayerId playerId = this.playerId;
        if (playerId != null) {
            this.audioOutput.setPlayerId(playerId);
        }
        setVolumeInternal();
        int i = this.auxEffectInfo.effectId;
        if (i != 0) {
            this.audioOutput.attachAuxEffect(i);
            this.audioOutput.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
        }
        AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
        if (audioDeviceInfo != null) {
            this.audioOutput.setPreferredDevice(audioDeviceInfo);
        }
        this.startMediaTimeUsNeedsInit = true;
        int audioSessionId = this.audioOutput.getAudioSessionId();
        boolean z = audioSessionId != this.audioSessionId;
        this.audioSessionId = audioSessionId;
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioTrackInitialized(this.configuration.buildAudioTrackConfig());
            if (z) {
                this.pendingAudioSessionIdChangeConfirmation = true;
                Configuration configuration = this.configuration;
                this.configuration = configuration.copyWithOutputConfig(configuration.outputConfig.buildUpon().setAudioSessionId(this.audioSessionId).build());
                Configuration configuration2 = this.pendingConfiguration;
                if (configuration2 != null) {
                    this.pendingConfiguration = configuration2.copyWithOutputConfig(configuration2.outputConfig.buildUpon().setAudioSessionId(this.audioSessionId).build());
                }
                this.listener.onAudioSessionIdChanged(this.audioSessionId);
            }
        }
        return true;
    }

    private boolean isAudioOutputInitialized() {
        return this.audioOutput != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeAddAudioOutputProviderListener$0() {
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioCapabilitiesChanged();
        }
    }

    private void maybeAddAudioOutputProviderListener() {
        if (this.audioOutputProviderListener != null || this.context == null) {
            return;
        }
        AudioOutputProvider.Listener listener = new AudioOutputProvider.Listener() { // from class: cr0
            @Override // androidx.media3.exoplayer.audio.AudioOutputProvider.Listener
            public final void onFormatSupportChanged() {
                DefaultAudioSink.this.lambda$maybeAddAudioOutputProviderListener$0();
            }
        };
        this.audioOutputProviderListener = listener;
        this.audioOutputProvider.addListener(listener);
    }

    private void maybeDisableOffload() {
        if (this.configuration.outputConfig.isOffload) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private ByteBuffer maybeRampUpVolume(ByteBuffer byteBuffer) {
        if (this.configuration.isPcm()) {
            int durationUsToSampleCount = (int) Util.durationUsToSampleCount(Util.msToUs(20L), this.configuration.outputConfig.sampleRate);
            long writtenFrames = getWrittenFrames();
            if (writtenFrames < durationUsToSampleCount) {
                return PcmAudioUtil.rampUpVolume(byteBuffer, this.configuration.outputConfig.encoding, this.configuration.outputPcmFrameSize, (int) writtenFrames, durationUsToSampleCount);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportSkippedSilence() {
        if (this.accumulatedSkippedSilenceDurationUs >= 300000) {
            this.listener.onSilenceSkipped();
            this.accumulatedSkippedSilenceDurationUs = 0L;
        }
    }

    private void playPendingData() {
        if (this.stoppedAudioOutput) {
            return;
        }
        this.stoppedAudioOutput = true;
        if (this.audioOutput.isOffloadedPlayback()) {
            this.handledOffloadOnPresentationEnded = false;
        }
        this.audioOutput.stop();
    }

    private void processBuffers(long j) {
        drainOutputBuffer(j);
        if (this.outputBuffer != null) {
            return;
        }
        if (!this.audioProcessingPipeline.isOperational()) {
            ByteBuffer byteBuffer = this.inputBuffer;
            if (byteBuffer != null) {
                setOutputBuffer(byteBuffer);
                drainOutputBuffer(j);
                return;
            }
            return;
        }
        while (!this.audioProcessingPipeline.isEnded()) {
            do {
                ByteBuffer output = this.audioProcessingPipeline.getOutput();
                if (output.hasRemaining()) {
                    setOutputBuffer(output);
                    drainOutputBuffer(j);
                } else {
                    ByteBuffer byteBuffer2 = this.inputBuffer;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.audioProcessingPipeline.queueInput(this.inputBuffer);
                    }
                }
            } while (this.outputBuffer == null);
            return;
        }
    }

    private void reconfigureAndFlush() {
        Configuration configuration = this.configuration;
        if (configuration != null) {
            Configuration configuration2 = this.pendingConfiguration;
            if (configuration2 != null) {
                this.configuration = configuration2;
                this.pendingConfiguration = null;
                configuration = configuration2;
            }
            try {
                this.configuration = this.configuration.copyWithOutputConfig(this.audioOutputProvider.getOutputConfig(getFormatConfig(configuration.afterProcessingInputFormat)));
            } catch (AudioOutputProvider.ConfigurationException e) {
                throw new IllegalStateException(new AudioSink.ConfigurationException(e, this.configuration.inputFormat));
            }
        }
        flush();
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.inputBufferOriginalRemaining = 0;
        this.currentBufferFramesWritten = 0L;
        this.mediaPositionParameters = new MediaPositionParameters(this.playbackParameters, 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioOutput = false;
        this.handledEndOfStream = false;
        this.handledOffloadOnPresentationEnded = false;
        this.trimmingAudioProcessor.resetTrimmedFrameCount();
        setupAudioProcessors(C.TIME_UNSET);
    }

    private static int resolveDefaultVirtualDeviceIds(int i) {
        if (i == 0 || i == -1) {
            return -1;
        }
        return i;
    }

    private void setAudioOutputPlaybackParameters() {
        if (isAudioOutputInitialized()) {
            this.audioOutput.setPlaybackParameters(this.playbackParameters);
            this.playbackParameters = this.audioOutput.getPlaybackParameters();
        }
    }

    private void setAudioProcessorPlaybackParameters(PlaybackParameters playbackParameters) {
        MediaPositionParameters mediaPositionParameters = new MediaPositionParameters(playbackParameters, C.TIME_UNSET, C.TIME_UNSET);
        if (isAudioOutputInitialized()) {
            this.afterDrainParameters = mediaPositionParameters;
        } else {
            this.mediaPositionParameters = mediaPositionParameters;
        }
    }

    private void setOutputBuffer(ByteBuffer byteBuffer) {
        sp0.z(this.outputBuffer == null);
        if (byteBuffer.hasRemaining()) {
            this.outputBuffer = maybeRampUpVolume(byteBuffer);
        }
    }

    private void setVolumeInternal() {
        if (isAudioOutputInitialized()) {
            this.audioOutput.setVolume(this.volume);
        }
    }

    private void setupAudioProcessors(long j) {
        long j2;
        this.audioProcessingPipeline = this.configuration.audioProcessingPipeline;
        if (j == C.TIME_UNSET) {
            j2 = 0;
        } else {
            j2 = j - this.outputStreamOffsetUs;
            if (this.configuration.timeline != Timeline.EMPTY && this.configuration.periodUid != null) {
                Timeline.Period period = new Timeline.Period();
                this.configuration.timeline.getPeriodByUid(this.configuration.periodUid, period);
                j2 += period.getPositionInWindowUs();
            }
        }
        this.audioProcessingPipeline.flush(new AudioProcessor.StreamMetadata.Builder().setTimeline(this.configuration.timeline).setPeriodUid(this.configuration.periodUid).setPositionOffsetUs(j2).build());
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        return (this.tunneling || !this.configuration.isPcm() || shouldUseFloatOutput(this.configuration.inputFormat.pcmEncoding)) ? false : true;
    }

    private boolean shouldUseFloatOutput(int i) {
        return this.enableFloatOutput && Util.isEncodingHighResolutionPcm(i);
    }

    private boolean useAudioOutputPlaybackParams() {
        Configuration configuration = this.configuration;
        return configuration != null && configuration.outputConfig.usePlaybackParameters;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(AudioSink.AudioSinkConfig audioSinkConfig) {
        int i;
        int i2;
        AudioProcessingPipeline audioProcessingPipeline;
        boolean z;
        Format format;
        maybeAddAudioOutputProviderListener();
        Format format2 = audioSinkConfig.format;
        if (MimeTypes.AUDIO_RAW.equals(format2.sampleMimeType)) {
            sp0.o(Util.isEncodingLinearPcm(format2.pcmEncoding));
            i = Util.getPcmFrameSize(format2.pcmEncoding, format2.channelCount);
            zx1 zx1Var = new zx1(4);
            zx1Var.d(this.availableAudioProcessors);
            if (shouldUseFloatOutput(format2.pcmEncoding)) {
                zx1Var.c(this.toFloatPcmAudioProcessor);
            } else {
                zx1Var.c(this.toInt16PcmAudioProcessor);
                AudioProcessor[] audioProcessors = this.audioProcessorChain.getAudioProcessors();
                int length = audioProcessors.length;
                ut0.k(length, audioProcessors);
                zx1Var.e(length);
                System.arraycopy(audioProcessors, 0, zx1Var.a, zx1Var.b, length);
                zx1Var.b += length;
            }
            AudioProcessingPipeline audioProcessingPipeline2 = new AudioProcessingPipeline(zx1Var.f());
            if (audioProcessingPipeline2.equals(this.audioProcessingPipeline)) {
                audioProcessingPipeline2 = this.audioProcessingPipeline;
            }
            this.trimmingAudioProcessor.setTrimFrameCount(format2.encoderDelay, format2.encoderPadding);
            this.channelMappingAudioProcessor.setChannelMap(audioSinkConfig.outputChannelMapping);
            try {
                AudioProcessor.AudioFormat configure = audioProcessingPipeline2.configure(new AudioProcessor.AudioFormat(format2));
                Format build = format2.buildUpon().setPcmEncoding(configure.encoding).setSampleRate(configure.sampleRate).setChannelCount(configure.channelCount).setChannelMask(configure.channelCount == format2.channelCount ? format2.channelMask : -1).build();
                i2 = Util.getPcmFrameSize(configure.encoding, configure.channelCount);
                AudioProcessingPipeline audioProcessingPipeline3 = audioProcessingPipeline2;
                z = false;
                format = build;
                audioProcessingPipeline = audioProcessingPipeline3;
            } catch (AudioProcessor.UnhandledAudioFormatException e) {
                throw new AudioSink.ConfigurationException(e, format2);
            }
        } else {
            ay1 ay1Var = dy1.J;
            i = -1;
            i2 = -1;
            audioProcessingPipeline = new AudioProcessingPipeline(x24.M);
            z = false;
            format = format2;
        }
        int i3 = audioSinkConfig.preferredBufferSizeOverride;
        AudioOutputProvider.FormatConfig formatConfig = getFormatConfig(format, i3 != 0 ? i3 : -1);
        try {
            AudioOutputProvider.OutputConfig outputConfig = this.audioOutputProvider.getOutputConfig(formatConfig);
            if (outputConfig.encoding == 0) {
                throw new AudioSink.ConfigurationException("Invalid output encoding (isOffload=" + outputConfig.isOffload + ")", formatConfig.format);
            }
            if (outputConfig.channelMask == 0) {
                throw new AudioSink.ConfigurationException("Invalid output channel config (isOffload=" + outputConfig.isOffload + ")", formatConfig.format);
            }
            this.offloadDisabledUntilNextConfiguration = z;
            int i4 = i;
            Timeline timeline = audioSinkConfig.timeline;
            MediaSource.MediaPeriodId mediaPeriodId = audioSinkConfig.mediaPeriodId;
            Configuration configuration = new Configuration(format2, format, i4, i2, outputConfig, audioProcessingPipeline, timeline, mediaPeriodId != null ? mediaPeriodId.periodUid : null);
            if (isAudioOutputInitialized()) {
                this.pendingConfiguration = configuration;
            } else {
                this.configuration = configuration;
            }
        } catch (AudioOutputProvider.ConfigurationException e2) {
            throw new AudioSink.ConfigurationException(e2, format2);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            reconfigureAndFlush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
        sp0.z(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        if (isAudioOutputInitialized()) {
            resetSinkStateForFlush();
            this.audioOutputListener = null;
            Configuration configuration = this.pendingConfiguration;
            if (configuration != null) {
                this.configuration = configuration;
                this.pendingConfiguration = null;
            }
            this.audioOutput.release();
            this.audioOutput = null;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
        this.skippedOutputFrameCountAtLastPosition = 0L;
        this.accumulatedSkippedSilenceDurationUs = 0L;
        Handler handler = this.reportSkippedSilenceHandler;
        if (handler != null) {
            handler.getClass();
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioCapabilities getAudioCapabilities() {
        AudioOutputProvider audioOutputProvider = this.audioOutputProvider;
        if (audioOutputProvider instanceof AudioTrackAudioOutputProvider) {
            return ((AudioTrackAudioOutputProvider) audioOutputProvider).getAudioCapabilities();
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getAudioTrackBufferSizeUs() {
        return !isAudioOutputInitialized() ? C.TIME_UNSET : this.configuration.isPcm() ? this.configuration.framesToDurationUs(this.audioOutput.getBufferSizeInFrames()) : Util.scaleLargeValue(this.audioOutput.getBufferSizeInFrames(), 1000000L, getNonPcmMaximumEncodedRateBytesPerSecond(this.configuration.outputConfig.encoding), RoundingMode.DOWN);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        if (!isAudioOutputInitialized() || this.startMediaTimeUsNeedsInit) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(Math.min(this.audioOutput.getPositionUs(), this.configuration.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioOffloadSupport getFormatOffloadSupport(Format format) {
        if (this.offloadDisabledUntilNextConfiguration) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        AudioOutputProvider.FormatSupport formatSupport = this.audioOutputProvider.getFormatSupport(getFormatConfig(format));
        return new AudioOffloadSupport.Builder().setIsFormatSupported(formatSupport.isFormatSupportedForOffload).setIsGaplessSupported(formatSupport.isGaplessSupportedForOffload).setIsSpeedChangeSupported(formatSupport.isSpeedChangeSupportedForOffload).build();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(Format format) {
        boolean z;
        if (Util.isEncodingLinearPcm(format.pcmEncoding)) {
            boolean shouldUseFloatOutput = shouldUseFloatOutput(format.pcmEncoding);
            if (!shouldUseFloatOutput || format.pcmEncoding == 4) {
                z = false;
            } else {
                format = format.buildUpon().setPcmEncoding(4).build();
                z = true;
            }
            if (!shouldUseFloatOutput && format.pcmEncoding != 2) {
                format = format.buildUpon().setPcmEncoding(2).build();
                z = true;
            }
        } else {
            z = false;
        }
        int i = this.audioOutputProvider.getFormatSupport(getFormatConfig(format)).supportLevel;
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return 0;
        }
        return z ? 1 : 2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.skipSilenceEnabled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0100, code lost:
    
        if (r5 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0096, code lost:
    
        if (initializeAudioOutput() == false) goto L12;
     */
    @Override // androidx.media3.exoplayer.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleBuffer(java.nio.ByteBuffer r18, long r19, int r21) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.handleBuffer(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        if (isAudioOutputInitialized()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.audioOutput.isOffloadedPlayback() && this.handledOffloadOnPresentationEnded) && hasAudioOutputPendingData(getWrittenFrames());
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        if (isAudioOutputInitialized()) {
            return this.handledEndOfStream && !hasPendingData();
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioOutputInitialized()) {
            this.audioOutput.pause();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioOutputInitialized()) {
            this.audioOutput.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() {
        if (!this.handledEndOfStream && isAudioOutputInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        this.audioOutputProvider.release();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        ay1 listIterator = this.availableAudioProcessors.listIterator(0);
        while (listIterator.hasNext()) {
            ((AudioProcessor) listIterator.next()).reset();
        }
        this.toInt16PcmAudioProcessor.reset();
        this.toFloatPcmAudioProcessor.reset();
        AudioProcessingPipeline audioProcessingPipeline = this.audioProcessingPipeline;
        if (audioProcessingPipeline != null) {
            audioProcessingPipeline.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioOutputProvider(AudioOutputProvider audioOutputProvider) {
        if (audioOutputProvider.equals(this.audioOutputProvider)) {
            return;
        }
        this.audioOutputProvider.release();
        this.audioOutputProvider = audioOutputProvider;
        AudioOutputProvider.Listener listener = this.audioOutputProviderListener;
        if (listener != null) {
            audioOutputProvider.addListener(listener);
        }
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i) {
        if (this.pendingAudioSessionIdChangeConfirmation) {
            if (this.audioSessionId != i) {
                return;
            } else {
                this.pendingAudioSessionIdChangeConfirmation = false;
            }
        }
        if (this.audioSessionId != i) {
            this.audioSessionId = i;
            this.externalAudioSessionIdProvided = i != 0;
            reconfigureAndFlush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i = auxEffectInfo.effectId;
        float f = auxEffectInfo.sendLevel;
        AudioOutput audioOutput = this.audioOutput;
        if (audioOutput != null) {
            if (this.auxEffectInfo.effectId != i) {
                audioOutput.attachAuxEffect(i);
            }
            if (i != 0) {
                this.audioOutput.setAuxEffectSendLevel(f);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setClock(Clock clock) {
        this.audioOutputProvider.setClock(clock);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadDelayPadding(int i, int i2) {
        Configuration configuration;
        AudioOutput audioOutput = this.audioOutput;
        if (audioOutput == null || !audioOutput.isOffloadedPlayback() || (configuration = this.configuration) == null || !configuration.outputConfig.useOffloadGapless) {
            return;
        }
        this.audioOutput.setOffloadDelayPadding(i, i2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadMode(int i) {
        sp0.z(Build.VERSION.SDK_INT >= 29);
        this.offloadMode = i;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOutputStreamOffsetUs(long j) {
        this.outputStreamOffsetUs = j;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (useAudioOutputPlaybackParams()) {
            this.playbackParameters = playbackParameters;
            setAudioOutputPlaybackParameters();
        } else {
            PlaybackParameters playbackParameters2 = new PlaybackParameters(Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
            this.playbackParameters = playbackParameters2;
            setAudioProcessorPlaybackParameters(playbackParameters2);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlayerId(PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.preferredDevice = audioDeviceInfo;
        AudioOutput audioOutput = this.audioOutput;
        if (audioOutput != null) {
            audioOutput.setPreferredDevice(audioDeviceInfo);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        this.skipSilenceEnabled = z;
        setAudioProcessorPlaybackParameters(useAudioOutputPlaybackParams() ? PlaybackParameters.DEFAULT : this.playbackParameters);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVirtualDeviceId(int i) {
        int resolveDefaultVirtualDeviceIds = resolveDefaultVirtualDeviceIds(i);
        if (this.virtualDeviceId == resolveDefaultVirtualDeviceIds) {
            return;
        }
        this.virtualDeviceId = resolveDefaultVirtualDeviceIds;
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f) {
        if (this.volume != f) {
            this.volume = f;
            setVolumeInternal();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(Format format) {
        return getFormatSupport(format) != 0;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private AudioCapabilities audioCapabilities;
        private ExoPlayer.AudioOffloadListener audioOffloadListener;
        private AudioOffloadSupportProvider audioOffloadSupportProvider;
        private AudioOutputProvider audioOutputProvider;
        private androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
        private AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
        private AudioTrackProvider audioTrackProvider;
        private boolean buildCalled;
        private final Context context;
        private boolean enableAudioOutputPlaybackParameters;
        private boolean enableFloatOutput;

        @Deprecated
        public Builder() {
            this.context = null;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        }

        public DefaultAudioSink build() {
            sp0.z(!this.buildCalled);
            this.buildCalled = true;
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new DefaultAudioProcessorChain(new AudioProcessor[0]);
            }
            AudioOutputProvider audioOutputProvider = this.audioOutputProvider;
            AudioOffloadSupportProvider audioOffloadSupportProvider = this.audioOffloadSupportProvider;
            if (audioOutputProvider == null) {
                if (audioOffloadSupportProvider == null) {
                    this.audioOffloadSupportProvider = new DefaultAudioOffloadSupportProvider(this.context);
                }
                if (this.audioTrackBufferSizeProvider == null) {
                    this.audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;
                }
                this.audioOutputProvider = new AudioTrackAudioOutputProvider.Builder(this.context).setAudioCapabilities(this.context != null ? null : this.audioCapabilities).setAudioOffloadSupportProvider(this.audioOffloadSupportProvider).setAudioTrackBufferSizeProvider(this.audioTrackBufferSizeProvider).setAudioTrackProvider(this.audioTrackProvider).build();
            } else {
                sp0.z(audioOffloadSupportProvider == null);
                sp0.z(this.audioTrackBufferSizeProvider == null);
                sp0.z(this.audioTrackProvider == null);
            }
            return new DefaultAudioSink(this);
        }

        @Deprecated
        public Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            audioCapabilities.getClass();
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        @Deprecated
        public Builder setAudioOffloadSupportProvider(AudioOffloadSupportProvider audioOffloadSupportProvider) {
            this.audioOffloadSupportProvider = audioOffloadSupportProvider;
            return this;
        }

        public Builder setAudioOutputProvider(AudioOutputProvider audioOutputProvider) {
            sp0.A(this.context != null, "Cannot set AudioOutputProvider without a Context");
            this.audioOutputProvider = audioOutputProvider;
            return this;
        }

        public Builder setAudioProcessorChain(androidx.media3.common.audio.AudioProcessorChain audioProcessorChain) {
            audioProcessorChain.getClass();
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        public Builder setAudioProcessors(AudioProcessor[] audioProcessorArr) {
            audioProcessorArr.getClass();
            return setAudioProcessorChain(new DefaultAudioProcessorChain(audioProcessorArr));
        }

        @Deprecated
        public Builder setAudioTrackBufferSizeProvider(AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.audioTrackBufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        @Deprecated
        public Builder setAudioTrackProvider(AudioTrackProvider audioTrackProvider) {
            this.audioTrackProvider = audioTrackProvider;
            return this;
        }

        public Builder setEnableAudioOutputPlaybackParameters(boolean z) {
            this.enableAudioOutputPlaybackParameters = z;
            return this;
        }

        @Deprecated
        public Builder setEnableAudioTrackPlaybackParams(boolean z) {
            return setEnableAudioOutputPlaybackParameters(z);
        }

        public Builder setEnableFloatOutput(boolean z) {
            this.enableFloatOutput = z;
            return this;
        }

        public Builder setExperimentalAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
            this.audioOffloadListener = audioOffloadListener;
            return this;
        }

        public Builder(Context context) {
            this.context = context;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(AudioProcessor[] audioProcessorArr, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, SonicAudioProcessor sonicAudioProcessor) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.audioProcessors = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z) {
            this.silenceSkippingAudioProcessor.setEnabled(z);
            return z;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getMediaDuration(long j) {
            return this.sonicAudioProcessor.isActive() ? this.sonicAudioProcessor.getMediaDuration(j) : j;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }
    }

    private AudioOutputProvider.FormatConfig getFormatConfig(Format format) {
        return getFormatConfig(format, -1);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final /* synthetic */ void configure(Format format, int i, int[] iArr) {
        pt1.e(this, format, i, iArr);
    }
}
