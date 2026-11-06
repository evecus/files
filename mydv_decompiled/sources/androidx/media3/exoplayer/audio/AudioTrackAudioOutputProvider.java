package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import defpackage.gz4;
import defpackage.j0;
import defpackage.li4;
import defpackage.r7;
import defpackage.sp0;
import defpackage.sr;
import defpackage.tr;
import defpackage.wi4;
import defpackage.zy;
import j$.util.Objects;
import java.util.function.BiConsumer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AudioTrackAudioOutputProvider implements AudioOutputProvider {
    private static final gz4 COMPRESSED_OFFLOAD_EXPLICIT_AAC_ENABLED = wi4.t(new tr(0));
    private static final String TAG = "ATAudioOutputProvider";
    private AudioCapabilities audioCapabilities;
    private AudioCapabilitiesReceiver audioCapabilitiesReceiver;
    private final DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider;
    private final DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private final DefaultAudioSink.AudioTrackProvider audioTrackProvider;
    private final BiConsumer<AudioTrack.Builder, AudioOutputProvider.OutputConfig> builderModifier;
    private final CapabilityChangeListener capabilityChangeListener;
    private Clock clock;
    private final Context context;
    private Context contextWithDeviceId;
    private ListenerSet<AudioOutputProvider.Listener> listeners;
    private final float maxPlaybackSpeed;
    private Looper playbackLooper;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private AudioCapabilities audioCapabilities;
        private DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider;
        private BiConsumer<AudioTrack.Builder, AudioOutputProvider.OutputConfig> audioTrackBuilderModifier;
        private DefaultAudioSink.AudioTrackProvider audioTrackProvider;
        private DefaultAudioSink.AudioTrackBufferSizeProvider bufferSizeProvider;
        private final Context context;
        private float maxPlaybackSpeed;

        public Builder(Context context) {
            this.context = context != null ? context.getApplicationContext() : null;
            this.bufferSizeProvider = DefaultAudioSink.AudioTrackBufferSizeProvider.DEFAULT;
            if (context == null) {
                this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            }
            this.maxPlaybackSpeed = 8.0f;
        }

        public AudioTrackAudioOutputProvider build() {
            if (this.audioOffloadSupportProvider == null) {
                this.audioOffloadSupportProvider = new DefaultAudioOffloadSupportProvider(this.context);
            }
            return new AudioTrackAudioOutputProvider(this);
        }

        public Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            if (this.context == null) {
                this.audioCapabilities = audioCapabilities;
            }
            return this;
        }

        public Builder setAudioOffloadSupportProvider(DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider) {
            this.audioOffloadSupportProvider = audioOffloadSupportProvider;
            return this;
        }

        public Builder setAudioTrackBufferSizeProvider(DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.bufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        public Builder setAudioTrackBuilderModifier(BiConsumer<AudioTrack.Builder, AudioOutputProvider.OutputConfig> biConsumer) {
            this.audioTrackBuilderModifier = biConsumer;
            return this;
        }

        public Builder setAudioTrackProvider(DefaultAudioSink.AudioTrackProvider audioTrackProvider) {
            this.audioTrackProvider = audioTrackProvider;
            return this;
        }

        public Builder setMaxPlaybackSpeed(float f) {
            sp0.o(f >= 1.0f);
            this.maxPlaybackSpeed = f;
            return this;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class CapabilityChangeListener implements AudioTrackAudioOutput.CapabilityChangeListener {
        private CapabilityChangeListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackAudioOutput.CapabilityChangeListener
        public void onRecoverableWriteError() {
            if (AudioTrackAudioOutputProvider.this.audioCapabilitiesReceiver != null) {
                AudioTrackAudioOutputProvider audioTrackAudioOutputProvider = AudioTrackAudioOutputProvider.this;
                AudioCapabilities audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
                audioTrackAudioOutputProvider.audioCapabilities = audioCapabilities;
                AudioTrackAudioOutputProvider.this.audioCapabilitiesReceiver.overrideCapabilities(audioCapabilities);
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackAudioOutput.CapabilityChangeListener
        public void onRoutedDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
            if (AudioTrackAudioOutputProvider.this.audioCapabilitiesReceiver != null) {
                AudioTrackAudioOutputProvider.this.audioCapabilitiesReceiver.setRoutedDevice(audioDeviceInfo);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AudioTrackAudioOutputProvider(Builder builder) {
        this.context = builder.context;
        this.builderModifier = builder.audioTrackBuilderModifier;
        DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider = builder.audioOffloadSupportProvider;
        audioOffloadSupportProvider.getClass();
        this.audioOffloadSupportProvider = audioOffloadSupportProvider;
        this.audioTrackBufferSizeProvider = builder.bufferSizeProvider;
        this.audioCapabilities = builder.audioCapabilities;
        this.audioTrackProvider = builder.audioTrackProvider;
        this.capabilityChangeListener = builder.context != null ? new CapabilityChangeListener() : null;
        this.maxPlaybackSpeed = builder.maxPlaybackSpeed;
        this.clock = Clock.DEFAULT;
    }

    private int getAudioOutputChannelConfig(Format format) {
        DefaultAudioSink.AudioTrackProvider audioTrackProvider = this.audioTrackProvider;
        return audioTrackProvider != null ? audioTrackProvider.getAudioTrackChannelConfig(format.channelCount) : Util.getAudioTrackChannelConfig(format);
    }

    private AudioAttributes getAudioTrackAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        return z ? getAudioTrackTunnelingAttributes() : audioAttributes.getPlatformAudioAttributes();
    }

    private AudioSink.AudioTrackConfig getAudioTrackConfig(AudioOutputProvider.OutputConfig outputConfig) {
        return new AudioSink.AudioTrackConfig(outputConfig.encoding, outputConfig.sampleRate, outputConfig.channelMask, outputConfig.isTunneling, outputConfig.isOffload, outputConfig.bufferSize);
    }

    private int getAudioTrackMinBufferSize(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        sp0.z(minBufferSize != -2);
        return minBufferSize;
    }

    private AudioAttributes getAudioTrackTunnelingAttributes() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    @RequiresNonNull({"audioCapabilities"})
    private int getFormatSupportLevel(AudioOutputProvider.FormatConfig formatConfig) {
        Format format = formatConfig.format;
        if (!Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_RAW)) {
            return this.audioCapabilities.isPassthroughPlaybackSupported(format, formatConfig.audioAttributes) ? 2 : 0;
        }
        int i = format.pcmEncoding;
        if (i == 2) {
            return 2;
        }
        if (!formatConfig.enableHighResolutionPcmOutput) {
            return 0;
        }
        boolean isEncodingLinearPcm = Util.isEncodingLinearPcm(i);
        int i2 = format.pcmEncoding;
        if (isEncodingLinearPcm) {
            return Build.VERSION.SDK_INT < Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(i2) ? 0 : 2;
        }
        r7.L("Invalid PCM encoding: ", i2, TAG);
        return 0;
    }

    private static String getLooperThreadName(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isCompressedOffloadExplicitAacEnabled() {
        return Build.VERSION.SDK_INT > 37 && Objects.equals(Util.getSystemProperty("persist.audio.compressed_offload_implicit_aac"), "false");
    }

    @EnsuresNonNull({"audioCapabilities"})
    private void updateAudioCapabilitiesReceiver(AudioOutputProvider.FormatConfig formatConfig) {
        Context context;
        verifySinglePlaybackLooper();
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver == null && (context = this.context) != null) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver2 = new AudioCapabilitiesReceiver(context, new sr(this, (byte) 0), formatConfig.audioAttributes, formatConfig.preferredDevice);
            this.audioCapabilitiesReceiver = audioCapabilitiesReceiver2;
            this.audioCapabilities = audioCapabilitiesReceiver2.register();
        } else if (audioCapabilitiesReceiver != null) {
            AudioDeviceInfo audioDeviceInfo = formatConfig.preferredDevice;
            if (audioDeviceInfo != null) {
                audioCapabilitiesReceiver.setRoutedDevice(audioDeviceInfo);
            }
            this.audioCapabilitiesReceiver.setAudioAttributes(formatConfig.audioAttributes);
        }
        this.audioCapabilities.getClass();
    }

    private void verifySinglePlaybackLooper() {
        if (this.context == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.playbackLooper;
        boolean z = looper == null || looper == myLooper;
        String looperThreadName = getLooperThreadName(looper);
        String looperThreadName2 = getLooperThreadName(myLooper);
        if (z) {
            this.playbackLooper = myLooper;
        } else {
            zy.i(li4.h("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", looperThreadName, looperThreadName2));
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void addListener(AudioOutputProvider.Listener listener) {
        verifySinglePlaybackLooper();
        ListenerSet<AudioOutputProvider.Listener> listenerSet = this.listeners;
        if (listenerSet == null) {
            listenerSet = new ListenerSet<>(Thread.currentThread());
            this.listeners = listenerSet;
        }
        listenerSet.add(listener);
    }

    public AudioCapabilities getAudioCapabilities() {
        return this.audioCapabilities;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r0 != r1) goto L12;
     */
    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.audio.AudioTrackAudioOutput getAudioOutput(androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig r13) {
        /*
            r12 = this;
            int r0 = r13.audioSessionId     // Catch: java.lang.Throwable -> Lbc
            int r1 = r13.virtualDeviceId     // Catch: java.lang.Throwable -> Lbc
            r2 = -1
            r3 = 34
            if (r1 == r2) goto L2c
            android.content.Context r2 = r12.context     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L2c
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lbc
            if (r2 < r3) goto L2c
            android.content.Context r0 = r12.contextWithDeviceId     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L1d
            int r0 = r0.getDeviceId()     // Catch: java.lang.Throwable -> Lbc
            int r1 = r13.virtualDeviceId     // Catch: java.lang.Throwable -> Lbc
            if (r0 == r1) goto L25
        L1d:
            android.content.Context r0 = r12.context     // Catch: java.lang.Throwable -> Lbc
            android.content.Context r0 = r0.createDeviceContext(r1)     // Catch: java.lang.Throwable -> Lbc
            r12.contextWithDeviceId = r0     // Catch: java.lang.Throwable -> Lbc
        L25:
            android.content.Context r0 = r12.contextWithDeviceId     // Catch: java.lang.Throwable -> Lbc
            r1 = 0
            r11 = r1
            r1 = r0
            r0 = r11
            goto L2d
        L2c:
            r1 = 0
        L2d:
            androidx.media3.exoplayer.audio.DefaultAudioSink$AudioTrackProvider r2 = r12.audioTrackProvider     // Catch: java.lang.Throwable -> Lbc
            r4 = 1
            if (r2 == 0) goto L40
            androidx.media3.exoplayer.audio.AudioSink$AudioTrackConfig r2 = r12.getAudioTrackConfig(r13)     // Catch: java.lang.Throwable -> Lbc
            androidx.media3.exoplayer.audio.DefaultAudioSink$AudioTrackProvider r3 = r12.audioTrackProvider     // Catch: java.lang.Throwable -> Lbc
            androidx.media3.common.AudioAttributes r5 = r13.audioAttributes     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioTrack r0 = r3.getAudioTrack(r2, r5, r0, r1)     // Catch: java.lang.Throwable -> Lbc
        L3e:
            r6 = r0
            goto La0
        L40:
            android.media.AudioFormat$Builder r2 = new android.media.AudioFormat$Builder     // Catch: java.lang.Throwable -> Lbc
            r2.<init>()     // Catch: java.lang.Throwable -> Lbc
            int r5 = r13.sampleRate     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioFormat$Builder r2 = r2.setSampleRate(r5)     // Catch: java.lang.Throwable -> Lbc
            int r5 = r13.channelMask     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioFormat$Builder r2 = r2.setChannelMask(r5)     // Catch: java.lang.Throwable -> Lbc
            int r5 = r13.encoding     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioFormat$Builder r2 = r2.setEncoding(r5)     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioFormat r2 = r2.build()     // Catch: java.lang.Throwable -> Lbc
            androidx.media3.common.AudioAttributes r5 = r13.audioAttributes     // Catch: java.lang.Throwable -> Lbc
            boolean r6 = r13.isTunneling     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioAttributes r5 = r12.getAudioTrackAttributes(r5, r6)     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioTrack$Builder r6 = new android.media.AudioTrack$Builder     // Catch: java.lang.Throwable -> Lbc
            r6.<init>()     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioTrack$Builder r5 = r6.setAudioAttributes(r5)     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioTrack$Builder r2 = r5.setAudioFormat(r2)     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioTrack$Builder r2 = r2.setTransferMode(r4)     // Catch: java.lang.Throwable -> Lbc
            int r5 = r13.bufferSize     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioTrack$Builder r2 = r2.setBufferSizeInBytes(r5)     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioTrack$Builder r0 = r2.setSessionId(r0)     // Catch: java.lang.Throwable -> Lbc
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lbc
            r5 = 29
            if (r2 < r5) goto L89
            boolean r5 = r13.isOffload     // Catch: java.lang.Throwable -> Lbc
            r0.setOffloadedPlayback(r5)     // Catch: java.lang.Throwable -> Lbc
        L89:
            if (r2 < r3) goto L90
            if (r1 == 0) goto L90
            r0.setContext(r1)     // Catch: java.lang.Throwable -> Lbc
        L90:
            java.util.function.BiConsumer<android.media.AudioTrack$Builder, androidx.media3.exoplayer.audio.AudioOutputProvider$OutputConfig> r1 = r12.builderModifier     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L9b
            r3 = 24
            if (r2 < r3) goto L9b
            r1.accept(r0, r13)     // Catch: java.lang.Throwable -> Lbc
        L9b:
            android.media.AudioTrack r0 = r0.build()     // Catch: java.lang.Throwable -> Lbc
            goto L3e
        La0:
            int r0 = r6.getState()
            if (r0 != r4) goto Lb3
            androidx.media3.exoplayer.audio.AudioTrackAudioOutput r5 = new androidx.media3.exoplayer.audio.AudioTrackAudioOutput
            androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider$CapabilityChangeListener r8 = r12.capabilityChangeListener
            float r9 = r12.maxPlaybackSpeed
            androidx.media3.common.util.Clock r10 = r12.clock
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        Lb3:
            r6.release()     // Catch: java.lang.Exception -> Lb6
        Lb6:
            androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException r12 = new androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException
            r12.<init>()
            throw r12
        Lbc:
            r0 = move-exception
            r12 = r0
            androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException r13 = new androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider.getAudioOutput(androidx.media3.exoplayer.audio.AudioOutputProvider$OutputConfig):androidx.media3.exoplayer.audio.AudioTrackAudioOutput");
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public AudioOutputProvider.FormatSupport getFormatSupport(AudioOutputProvider.FormatConfig formatConfig) {
        updateAudioCapabilitiesReceiver(formatConfig);
        AudioOffloadSupport audioOffloadSupport = this.audioOffloadSupportProvider.getAudioOffloadSupport(formatConfig.format, formatConfig.audioAttributes);
        return new AudioOutputProvider.FormatSupport.Builder().setFormatSupportLevel(getFormatSupportLevel(formatConfig)).setIsFormatSupportedForOffload(audioOffloadSupport.isFormatSupported).setIsGaplessSupportedForOffload(audioOffloadSupport.isGaplessSupported).setIsSpeedChangeSupportedForOffload(audioOffloadSupport.isSpeedChangeSupported).build();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public AudioOutputProvider.OutputConfig getOutputConfig(AudioOutputProvider.FormatConfig formatConfig) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        double d;
        Format format = formatConfig.format;
        updateAudioCapabilitiesReceiver(formatConfig);
        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_RAW)) {
            sp0.o(Util.isEncodingLinearPcm(format.pcmEncoding));
            int i7 = format.pcmEncoding;
            i = format.sampleRate;
            i4 = getAudioOutputChannelConfig(format);
            i5 = Util.getPcmFrameSize(i7, format.channelCount);
            z = formatConfig.enablePlaybackParameters;
            i2 = i7;
            z2 = false;
            i3 = 0;
        } else {
            i = format.sampleRate;
            AudioOffloadSupport audioOffloadSupport = formatConfig.enableOffload ? this.audioOffloadSupportProvider.getAudioOffloadSupport(format, formatConfig.audioAttributes) : AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            if (formatConfig.enableOffload && audioOffloadSupport.isFormatSupported) {
                String str = format.sampleMimeType;
                str.getClass();
                int encoding = MimeTypes.getEncoding(str, format.codecs);
                int audioOutputChannelConfig = getAudioOutputChannelConfig(format);
                if ((encoding == 11 || encoding == 12) && i >= 16000 && !((Boolean) COMPRESSED_OFFLOAD_EXPLICIT_AAC_ENABLED.get()).booleanValue()) {
                    if (encoding == 12 && format.channelCount == 2) {
                        audioOutputChannelConfig = 4;
                    }
                    i /= 2;
                    encoding = 10;
                }
                z2 = audioOffloadSupport.isGaplessSupported;
                i5 = -1;
                i3 = 1;
                i2 = encoding;
                i4 = audioOutputChannelConfig;
                z = true;
            } else {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(format, formatConfig.audioAttributes);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new AudioOutputProvider.ConfigurationException("Unable to configure passthrough for: " + format);
                }
                int intValue = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                int intValue2 = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                z = formatConfig.enablePlaybackParameters;
                i2 = intValue;
                i3 = 2;
                i4 = intValue2;
                i5 = -1;
                z2 = false;
            }
        }
        int i8 = format.bitrate;
        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_DTS_EXPRESS) && i8 == -1) {
            i8 = 768000;
        }
        int i9 = i8;
        int i10 = formatConfig.preferredBufferSize;
        if (i10 == -1) {
            DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider = this.audioTrackBufferSizeProvider;
            int audioTrackMinBufferSize = getAudioTrackMinBufferSize(i, i4, i2);
            int i11 = i5 != -1 ? i5 : 1;
            if (z) {
                i6 = i;
                d = this.maxPlaybackSpeed;
            } else {
                i6 = i;
                d = 1.0d;
            }
            i10 = audioTrackBufferSizeProvider.getBufferSizeInBytes(audioTrackMinBufferSize, i2, i3, i11, i6, i9, d);
            i = i6;
        }
        return new AudioOutputProvider.OutputConfig.Builder().setSampleRate(i).setChannelMask(i4).setEncoding(i2).setBufferSize(i10).setAudioSessionId(formatConfig.audioSessionId).setAudioAttributes(formatConfig.audioAttributes).setIsOffload(i3 == 1).setIsTunneling(formatConfig.enableTunneling).setUsePlaybackParameters(z).setUseOffloadGapless(z2).setVirtualDeviceId(formatConfig.virtualDeviceId).build();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public boolean hasPendingReleases() {
        return AudioTrackAudioOutput.hasPendingReleases();
    }

    public void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
        verifySinglePlaybackLooper();
        AudioCapabilities audioCapabilities2 = this.audioCapabilities;
        if (audioCapabilities2 == null || audioCapabilities.equals(audioCapabilities2)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        ListenerSet<AudioOutputProvider.Listener> listenerSet = this.listeners;
        if (listenerSet != null) {
            listenerSet.sendEvent(new j0((byte) 14));
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void release() {
        ListenerSet<AudioOutputProvider.Listener> listenerSet = this.listeners;
        if (listenerSet != null) {
            listenerSet.release();
        }
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.unregister();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void removeListener(AudioOutputProvider.Listener listener) {
        ListenerSet<AudioOutputProvider.Listener> listenerSet = this.listeners;
        if (listenerSet != null) {
            listenerSet.remove(listener);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void setClock(Clock clock) {
        this.clock = clock;
    }
}
