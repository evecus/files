package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@Deprecated
/* loaded from: classes2.dex */
public class DefaultAudioTrackProvider implements DefaultAudioSink.AudioTrackProvider {
    private AudioAttributes getAudioTrackAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        return z ? getAudioTrackTunnelingAttributes() : audioAttributes.getPlatformAudioAttributes();
    }

    private AudioAttributes getAudioTrackTunnelingAttributes() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void setOffloadedPlaybackV29(AudioTrack.Builder builder, boolean z) {
        builder.setOffloadedPlayback(z);
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackProvider
    public final AudioTrack getAudioTrack(AudioSink.AudioTrackConfig audioTrackConfig, androidx.media3.common.AudioAttributes audioAttributes, int i, Context context) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributes(audioAttributes, audioTrackConfig.tunneling)).setAudioFormat(Util.getAudioFormat(audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding)).setTransferMode(1).setBufferSizeInBytes(audioTrackConfig.bufferSize).setSessionId(i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            setOffloadedPlaybackV29(sessionId, audioTrackConfig.offload);
        }
        if (i2 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return customizeAudioTrackBuilder(sessionId).build();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackProvider
    public final int getAudioTrackChannelConfig(int i) {
        return Util.getAudioTrackChannelConfig(i);
    }

    public AudioTrack.Builder customizeAudioTrackBuilder(AudioTrack.Builder builder) {
        return builder;
    }
}
