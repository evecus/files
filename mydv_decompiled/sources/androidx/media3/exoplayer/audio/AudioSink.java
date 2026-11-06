package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import defpackage.hf1;
import defpackage.sp0;
import defpackage.yx1;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int SINK_FORMAT_SUPPORTED_DIRECTLY = 2;
    public static final int SINK_FORMAT_SUPPORTED_WITH_TRANSCODING = 1;
    public static final int SINK_FORMAT_UNSUPPORTED = 0;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class AudioTrackConfig {
        public final int bufferSize;
        public final int channelConfig;
        public final int encoding;
        public final boolean offload;
        public final int sampleRate;
        public final boolean tunneling;

        public AudioTrackConfig(int i, int i2, int i3, boolean z, boolean z2, int i4) {
            this.encoding = i;
            this.sampleRate = i2;
            this.channelConfig = i3;
            this.tunneling = z;
            this.offload = z2;
            this.bufferSize = i4;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onAudioCapabilitiesChanged();

        void onAudioSessionIdChanged(int i);

        void onAudioSinkError(Exception exc);

        void onAudioTrackInitialized(AudioTrackConfig audioTrackConfig);

        void onAudioTrackReleased(AudioTrackConfig audioTrackConfig);

        void onOffloadBufferEmptying();

        void onOffloadBufferFull();

        void onPositionAdvancing(long j);

        void onPositionDiscontinuity();

        void onSilenceSkipped();

        void onSkipSilenceEnabledChanged(boolean z);

        void onUnderrun(int i, long j, long j2);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface OffloadMode {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface SinkFormatSupport {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public UnexpectedDiscontinuityException(long r3, long r5) {
            /*
                r2 = this;
                java.lang.String r0 = "Unexpected audio track timestamp discontinuity: expected "
                java.lang.String r1 = ", got "
                java.lang.StringBuilder r0 = defpackage.hf1.A(r5, r0, r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.actualPresentationTimeUs = r3
                r2.expectedPresentationTimeUs = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.AudioSink.UnexpectedDiscontinuityException.<init>(long, long):void");
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class WriteException extends Exception {
        public final int errorCode;
        public final Format format;
        public final boolean isRecoverable;

        public WriteException(int i, Format format, boolean z) {
            super(hf1.u(i, "AudioTrack write failed: "));
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = format;
        }
    }

    @Deprecated
    void configure(Format format, int i, int[] iArr);

    void configure(AudioSinkConfig audioSinkConfig);

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    AudioAttributes getAudioAttributes();

    AudioCapabilities getAudioCapabilities();

    long getAudioTrackBufferSizeUs();

    long getCurrentPositionUs(boolean z);

    AudioOffloadSupport getFormatOffloadSupport(Format format);

    int getFormatSupport(Format format);

    PlaybackParameters getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j, int i);

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream();

    void release();

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioOutputProvider(AudioOutputProvider audioOutputProvider);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setClock(Clock clock);

    void setListener(Listener listener);

    void setOffloadDelayPadding(int i, int i2);

    void setOffloadMode(int i);

    void setOutputStreamOffsetUs(long j);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setPlayerId(PlayerId playerId);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void setSkipSilenceEnabled(boolean z);

    void setVirtualDeviceId(int i);

    void setVolume(float f);

    boolean supportsFormat(Format format);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ConfigurationException extends Exception {
        public final Format format;

        public ConfigurationException(Throwable th, Format format) {
            super(th);
            this.format = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.format = format;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class AudioSinkConfig {
        public final Format format;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final yx1 outputChannelMapping;

        @Deprecated
        public final int preferredBufferSizeOverride;
        public final Timeline timeline;

        private AudioSinkConfig(Builder builder) {
            this.format = builder.format;
            this.preferredBufferSizeOverride = builder.preferredBufferSizeOverride;
            this.outputChannelMapping = builder.outputChannelMapping;
            this.timeline = builder.timeline;
            this.mediaPeriodId = builder.mediaPeriodId;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioSinkConfig)) {
                return false;
            }
            AudioSinkConfig audioSinkConfig = (AudioSinkConfig) obj;
            return this.preferredBufferSizeOverride == audioSinkConfig.preferredBufferSizeOverride && this.format.equals(audioSinkConfig.format) && Objects.equals(this.outputChannelMapping, audioSinkConfig.outputChannelMapping) && this.timeline.equals(audioSinkConfig.timeline) && Objects.equals(this.mediaPeriodId, audioSinkConfig.mediaPeriodId);
        }

        public int hashCode() {
            int hashCode = ((this.format.hashCode() * 31) + this.preferredBufferSizeOverride) * 31;
            yx1 yx1Var = this.outputChannelMapping;
            int hashCode2 = (this.timeline.hashCode() + ((hashCode + (yx1Var == null ? 0 : yx1Var.hashCode())) * 31)) * 31;
            MediaSource.MediaPeriodId mediaPeriodId = this.mediaPeriodId;
            return hashCode2 + (mediaPeriodId != null ? mediaPeriodId.hashCode() : 0);
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Builder {
            private final Format format;
            private MediaSource.MediaPeriodId mediaPeriodId;
            private yx1 outputChannelMapping;
            private int preferredBufferSizeOverride;
            private Timeline timeline;

            private Builder(AudioSinkConfig audioSinkConfig) {
                this.format = audioSinkConfig.format;
                this.preferredBufferSizeOverride = audioSinkConfig.preferredBufferSizeOverride;
                this.outputChannelMapping = audioSinkConfig.outputChannelMapping;
                this.timeline = audioSinkConfig.timeline;
                this.mediaPeriodId = audioSinkConfig.mediaPeriodId;
            }

            public AudioSinkConfig build() {
                MediaSource.MediaPeriodId mediaPeriodId;
                if (!this.timeline.isEmpty() && (mediaPeriodId = this.mediaPeriodId) != null) {
                    sp0.o(this.timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1);
                }
                return new AudioSinkConfig(this);
            }

            public Builder setMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
                this.mediaPeriodId = mediaPeriodId;
                return this;
            }

            public Builder setOutputChannelMapping(yx1 yx1Var) {
                this.outputChannelMapping = yx1Var;
                return this;
            }

            @Deprecated
            public Builder setPreferredBufferSizeOverride(int i) {
                this.preferredBufferSizeOverride = i;
                return this;
            }

            public Builder setTimeline(Timeline timeline) {
                this.timeline = timeline;
                return this;
            }

            public Builder(Format format) {
                this.format = format;
                this.preferredBufferSizeOverride = 0;
                this.outputChannelMapping = null;
                this.timeline = Timeline.EMPTY;
                this.mediaPeriodId = null;
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final Format format;
        public final boolean isRecoverable;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public InitializationException(int r7, int r8, int r9, int r10, int r11, androidx.media3.common.Format r12, boolean r13, java.lang.Exception r14) {
            /*
                r6 = this;
                java.lang.String r0 = "AudioTrack init failed "
                java.lang.String r1 = " Config("
                java.lang.String r2 = ", "
                java.lang.StringBuilder r8 = defpackage.hf1.D(r0, r7, r1, r8, r2)
                r8.append(r9)
                r8.append(r2)
                r8.append(r10)
                r8.append(r2)
                r8.append(r11)
                java.lang.String r9 = ") "
                r8.append(r9)
                r8.append(r12)
                if (r13 == 0) goto L26
                java.lang.String r9 = " (recoverable)"
                goto L28
            L26:
                java.lang.String r9 = ""
            L28:
                r8.append(r9)
                java.lang.String r1 = r8.toString()
                r0 = r6
                r2 = r7
                r3 = r12
                r4 = r13
                r5 = r14
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.AudioSink.InitializationException.<init>(int, int, int, int, int, androidx.media3.common.Format, boolean, java.lang.Exception):void");
        }

        public InitializationException(String str, int i, Format format, boolean z, Throwable th) {
            super(str, th);
            this.audioTrackState = i;
            this.isRecoverable = z;
            this.format = format;
        }
    }
}
