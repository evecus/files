package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioCapabilities;
import androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.video.FixedFrameRateEstimator;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class sr implements AudioCapabilitiesReceiver.Listener, ListenerSet.Event, ReorderingBufferQueue.OutputConsumer, FixedFrameRateEstimator.Listener, ProgressiveMediaExtractor.Factory, EventListener.Factory {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ sr(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    private final void b() {
        hn1 hn1Var = (hn1) this.J;
        synchronized (ws4.c) {
            ws4.h = o70.e1(ws4.h, hn1Var);
        }
    }

    public void a() {
        switch (this.I) {
            case 6:
                b();
                return;
            default:
                be beVar = (be) this.J;
                synchronized (ws4.c) {
                    ws4.i = o70.e1(ws4.i, beVar);
                }
                ws4.c();
                return;
        }
    }

    @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
    public void consume(long j, ParsableByteArray parsableByteArray) {
        ((FragmentedMp4Extractor) this.J).lambda$new$2(j, parsableByteArray);
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        EventListener asFactory$lambda$0;
        asFactory$lambda$0 = _UtilJvmKt.asFactory$lambda$0((EventListener) this.J, call);
        return asFactory$lambda$0;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        ProgressiveMediaExtractor lambda$new$0;
        lambda$new$0 = ProgressiveMediaSource.Factory.lambda$new$0((ExtractorsFactory) this.J, playerId);
        return lambda$new$0;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onSeekStarted((AnalyticsListener.EventTime) this.J);
    }

    @Override // androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener
    public void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
        ((AudioTrackAudioOutputProvider) this.J).onAudioCapabilitiesChanged(audioCapabilities);
    }

    @Override // androidx.media3.exoplayer.video.FixedFrameRateEstimator.Listener
    public void onFrameRateEstimateChanged(float f) {
        ((MediaCodecVideoRenderer) this.J).onFrameRateEstimateChanged(f);
    }
}
