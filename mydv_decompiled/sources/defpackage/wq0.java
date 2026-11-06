package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wq0 implements ListenerSet.Event {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AnalyticsListener.EventTime J;
    public final /* synthetic */ DecoderCounters K;

    public /* synthetic */ wq0(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, byte b) {
        this.I = b;
        this.J = eventTime;
        this.K = decoderCounters;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.I) {
            case 0:
                ((AnalyticsListener) obj).onAudioDisabled(this.J, this.K);
                break;
            default:
                ((AnalyticsListener) obj).onVideoDisabled(this.J, this.K);
                break;
        }
    }
}
