package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qq0 implements ListenerSet.Event {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AnalyticsListener.EventTime J;
    public final /* synthetic */ int K;

    public /* synthetic */ qq0(AnalyticsListener.EventTime eventTime, int i, byte b) {
        this.I = b;
        this.J = eventTime;
        this.K = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.I) {
            case 0:
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(this.J, this.K);
                break;
            case 1:
                ((AnalyticsListener) obj).onDroppedSeeksWhileScrubbing(this.J, this.K);
                break;
            case 2:
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$64(this.J, this.K, (AnalyticsListener) obj);
                break;
            default:
                ((AnalyticsListener) obj).onRepeatModeChanged(this.J, this.K);
                break;
        }
    }
}
