package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioOffloadSupport;
import androidx.media3.exoplayer.audio.DefaultAudioSink;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DefaultAudioOffloadSupportProvider implements DefaultAudioSink.AudioOffloadSupportProvider {
    private static final String OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY = "offloadVariableRateSupported";
    private final Context context;
    private Boolean isOffloadVariableRateSupported;

    public DefaultAudioOffloadSupportProvider(Context context) {
        this.context = context == null ? null : context.getApplicationContext();
    }

    private static AudioOffloadSupport getOffloadedPlaybackSupportV29(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? AudioOffloadSupport.DEFAULT_UNSUPPORTED : new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsSpeedChangeSupported(z).build();
    }

    private static AudioOffloadSupport getOffloadedPlaybackSupportV31(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        return new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsGaplessSupported(Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2).setIsSpeedChangeSupported(z).build();
    }

    private static AudioOffloadSupport getOffloadedPlaybackSupportV33(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormat, audioAttributes);
        if ((directPlaybackSupport & 1) == 0) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        return new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsGaplessSupported((directPlaybackSupport & 3) == 3).setIsSpeedChangeSupported(z).build();
    }

    private boolean isOffloadVariableRateSupported(Context context) {
        Boolean bool;
        Boolean bool2 = this.isOffloadVariableRateSupported;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (context != null) {
            String parameters = AudioManagerCompat.getAudioManager(context).getParameters(OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY);
            bool = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            this.isOffloadVariableRateSupported = bool;
        } else {
            bool = Boolean.FALSE;
            this.isOffloadVariableRateSupported = bool;
        }
        return bool.booleanValue();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider
    public AudioOffloadSupport getAudioOffloadSupport(Format format, androidx.media3.common.AudioAttributes audioAttributes) {
        format.getClass();
        audioAttributes.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || format.sampleRate == -1) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        boolean isOffloadVariableRateSupported = isOffloadVariableRateSupported(this.context);
        String str = format.sampleMimeType;
        str.getClass();
        int encoding = MimeTypes.getEncoding(str, format.codecs);
        if (encoding == 0 || i < Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(encoding)) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format);
        if (audioTrackChannelConfig == 0) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        try {
            AudioFormat audioFormat = Util.getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding);
            return i >= 33 ? getOffloadedPlaybackSupportV33(audioFormat, audioAttributes.getPlatformAudioAttributes(), isOffloadVariableRateSupported) : i >= 31 ? getOffloadedPlaybackSupportV31(audioFormat, audioAttributes.getPlatformAudioAttributes(), isOffloadVariableRateSupported) : getOffloadedPlaybackSupportV29(audioFormat, audioAttributes.getPlatformAudioAttributes(), isOffloadVariableRateSupported);
        } catch (IllegalArgumentException unused) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
    }

    public DefaultAudioOffloadSupportProvider() {
        this(null);
    }
}
