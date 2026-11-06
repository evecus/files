package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class cq0 implements ListenerSet.Event {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AnalyticsListener.EventTime J;
    public final /* synthetic */ boolean K;

    public /* synthetic */ cq0(AnalyticsListener.EventTime eventTime, boolean z, byte b) {
        this.I = b;
        this.J = eventTime;
        this.K = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.I) {
            case 0:
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$35(this.J, this.K, (AnalyticsListener) obj);
                break;
            default:
                ((AnalyticsListener) obj).onIsPlayingChanged(this.J, this.K);
                break;
        }
    }
}
