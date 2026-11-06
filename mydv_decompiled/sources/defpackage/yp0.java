package defpackage;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleExtractor;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.Question;
import okhttp3.internal.dns.RealDnsCache;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yp0 implements ListenerSet.Event, Consumer, DnsQuery.Factory, w00 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ yp0(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // defpackage.w00
    public Object a(v00 v00Var) {
        Executor executor = (Executor) this.J;
        rm1 rm1Var = (rm1) this.K;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        gl2 gl2Var = new gl2(atomicBoolean, (byte) 1);
        p44 p44Var = v00Var.c;
        if (p44Var != null) {
            p44Var.a(fx0.I, gl2Var);
        }
        executor.execute(new hl2(atomicBoolean, v00Var, rm1Var, (byte) 1));
        return wd5.a;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        byte b = this.I;
        Object obj2 = this.K;
        Object obj3 = this.J;
        switch (b) {
            case 10:
                HlsInterstitialsAdsLoader.lambda$stop$10((AdsMediaSource) obj3, (AdPlaybackState) obj2, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            default:
                ((SubtitleExtractor) obj3).lambda$parseAndWriteToOutput$0((AtomicLong) obj2, (CuesWithTiming) obj);
                break;
        }
    }

    public yz b(j81 j81Var) {
        y55 y55Var = (y55) this.J;
        nj njVar = (nj) this.K;
        u55 u55Var = (u55) y55Var.a.getValue();
        if (u55Var == null) {
            return new yz(0, 0, new yw4((byte) 7));
        }
        nj c = y55.c(njVar, u55Var);
        if (c == null) {
            return new yz(0, 0, new yw4((byte) 6));
        }
        v22 F = rt0.F(u55Var.j(c.b, c.c).a());
        return new yz(F.c(), F.a(), new iy3(F, (byte) 14));
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.I) {
            case 0:
                ((AnalyticsListener) obj).onPlaybackParametersChanged((AnalyticsListener.EventTime) this.J, (PlaybackParameters) this.K);
                break;
            case 1:
                ((AnalyticsListener) obj).onTrackSelectionParametersChanged((AnalyticsListener.EventTime) this.J, (TrackSelectionParameters) this.K);
                break;
            case 2:
                ((AnalyticsListener) obj).onAudioAttributesChanged((AnalyticsListener.EventTime) this.J, (AudioAttributes) this.K);
                break;
            case 3:
                ((AnalyticsListener) obj).onMetadata((AnalyticsListener.EventTime) this.J, (Metadata) this.K);
                break;
            case 4:
                DefaultAnalyticsCollector.lambda$onDrmKeysLoaded$65((AnalyticsListener.EventTime) this.J, (KeyRequestInfo) this.K, (AnalyticsListener) obj);
                break;
            case 5:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.J, (List<Cue>) this.K);
                break;
            case 6:
                ((AnalyticsListener) obj).onDeviceInfoChanged((AnalyticsListener.EventTime) this.J, (DeviceInfo) this.K);
                break;
            case 7:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.J, (CueGroup) this.K);
                break;
            case 8:
                ((AnalyticsListener) obj).onUpstreamDiscarded((AnalyticsListener.EventTime) this.J, (MediaLoadData) this.K);
                break;
            default:
                ((AnalyticsListener) obj).onAudioTrackReleased((AnalyticsListener.EventTime) this.J, (AudioSink.AudioTrackConfig) this.K);
                break;
        }
    }

    @Override // okhttp3.internal.dns.DnsQuery.Factory
    public DnsQuery newQuery(Question question) {
        DnsQuery wrap$lambda$0;
        wrap$lambda$0 = RealDnsCache.wrap$lambda$0((RealDnsCache) this.J, (DnsQuery.Factory) this.K, question);
        return wrap$lambda$0;
    }
}
