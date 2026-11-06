package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import defpackage.hf1;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface AudioOutput {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onOffloadDataRequest();

        void onOffloadPresentationEnded();

        void onPositionAdvancing(long j);

        void onReleased();

        void onUnderrun();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class WriteException extends Exception {
        public final int errorCode;
        public final boolean isRecoverable;

        public WriteException(int i, boolean z) {
            super(hf1.u(i, "AudioOutput write failed: "));
            this.isRecoverable = z;
            this.errorCode = i;
        }
    }

    void addListener(Listener listener);

    void attachAuxEffect(int i);

    boolean canReuseAudioOutput(AudioOutputProvider.OutputConfig outputConfig, AudioOutputProvider.FormatConfig formatConfig, AudioOutputProvider.OutputConfig outputConfig2);

    void flush();

    int getAudioSessionId();

    long getBufferSizeInFrames();

    PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    int getSampleRate();

    boolean isOffloadedPlayback();

    boolean isStalled();

    void pause();

    void play();

    void release();

    void removeListener(Listener listener);

    void setAuxEffectSendLevel(float f);

    void setOffloadDelayPadding(int i, int i2);

    void setOffloadEndOfStream();

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setPlayerId(PlayerId playerId);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void setVolume(float f);

    void stop();

    boolean write(ByteBuffer byteBuffer, int i, long j);
}
