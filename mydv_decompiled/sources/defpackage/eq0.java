package defpackage;

import android.net.Uri;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.ThrowingRunnable;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class eq0 implements ListenerSet.Event, ListenerSet.IterationFinishedEvent, ExtractorsFactory, ThrowingRunnable, Consumer, wn4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ eq0(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // defpackage.wn4
    public boolean a() {
        ms3 ms3Var = (ms3) this.J;
        fs fsVar = (fs) this.K;
        boolean z = ms3Var.q;
        if (z) {
            return z;
        }
        ms3Var.h();
        long a = fs.a(ms3Var.o, fsVar.a);
        fsVar.a = a;
        boolean z2 = !ms3Var.g(ms3Var.n, a + fsVar.b);
        ms3Var.q = z2;
        return z2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaSourceEventListener.EventDispatcher) this.J).lambda$downstreamFormatChanged$5((MediaLoadData) this.K, (MediaSourceEventListener) obj);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        Extractor[] lambda$createMediaSource$0;
        lambda$createMediaSource$0 = ((DefaultMediaSourceFactory) this.J).lambda$createMediaSource$0((Format) this.K);
        return lambda$createMediaSource$0;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.I) {
            case 0:
                ((AnalyticsListener) obj).onAvailableCommandsChanged((AnalyticsListener.EventTime) this.J, (Player.Commands) this.K);
                break;
            case 1:
            default:
                DefaultAnalyticsCollector.lambda$onVideoSizeChanged$59((AnalyticsListener.EventTime) this.J, (VideoSize) this.K, (AnalyticsListener) obj);
                break;
            case 2:
                ((AnalyticsListener) obj).onTracksChanged((AnalyticsListener.EventTime) this.J, (Tracks) this.K);
                break;
            case 3:
                ((AnalyticsListener) obj).onDownstreamFormatChanged((AnalyticsListener.EventTime) this.J, (MediaLoadData) this.K);
                break;
            case 4:
                ((AnalyticsListener) obj).onAudioTrackInitialized((AnalyticsListener.EventTime) this.J, (AudioSink.AudioTrackConfig) this.K);
                break;
        }
    }

    @Override // androidx.media3.common.util.ThrowingRunnable
    public void run() {
        ((MediaCodecRenderer) this.J).lambda$feedInputBuffer$0((FormatHolder) this.K);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return jp0.a(this);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* renamed from: experimentalSetCodecsToParseWithinGopSampleDependencies */
    public /* synthetic */ ExtractorsFactory mo364experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory setParseHagcMetadata(boolean z) {
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* renamed from: setSubtitleParserFactory */
    public /* synthetic */ ExtractorsFactory mo365setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this;
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((DefaultAnalyticsCollector) this.J).lambda$setPlayer$0((Player) this.K, (AnalyticsListener) obj, flagSet);
    }
}
