package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.audio.AudioOutputProvider;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ForwardingAudioOutputProvider implements AudioOutputProvider {
    private final AudioOutputProvider audioOutputProvider;

    public ForwardingAudioOutputProvider(AudioOutputProvider audioOutputProvider) {
        this.audioOutputProvider = audioOutputProvider;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void addListener(AudioOutputProvider.Listener listener) {
        this.audioOutputProvider.addListener(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public AudioOutput getAudioOutput(AudioOutputProvider.OutputConfig outputConfig) {
        return this.audioOutputProvider.getAudioOutput(outputConfig);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public AudioOutputProvider.FormatSupport getFormatSupport(AudioOutputProvider.FormatConfig formatConfig) {
        return this.audioOutputProvider.getFormatSupport(formatConfig);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public AudioOutputProvider.OutputConfig getOutputConfig(AudioOutputProvider.FormatConfig formatConfig) {
        return this.audioOutputProvider.getOutputConfig(formatConfig);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public boolean hasPendingReleases() {
        return this.audioOutputProvider.hasPendingReleases();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void release() {
        this.audioOutputProvider.release();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void removeListener(AudioOutputProvider.Listener listener) {
        this.audioOutputProvider.removeListener(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void setClock(Clock clock) {
        this.audioOutputProvider.setClock(clock);
    }
}
