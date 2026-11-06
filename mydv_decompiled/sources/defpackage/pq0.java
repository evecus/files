package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class pq0 implements ListenerSet.Event {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AnalyticsListener.EventTime J;
    public final /* synthetic */ String K;
    public final /* synthetic */ long L;
    public final /* synthetic */ long M;

    public /* synthetic */ pq0(AnalyticsListener.EventTime eventTime, String str, long j, long j2, byte b) {
        this.I = b;
        this.J = eventTime;
        this.K = str;
        this.L = j;
        this.M = j2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.I) {
            case 0:
                DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$4(this.J, this.K, this.L, this.M, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$16(this.J, this.K, this.L, this.M, (AnalyticsListener) obj);
                break;
        }
    }
}
