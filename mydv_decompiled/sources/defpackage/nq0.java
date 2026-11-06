package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class nq0 implements ListenerSet.Event {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AnalyticsListener.EventTime J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ int L;

    public /* synthetic */ nq0(AnalyticsListener.EventTime eventTime, boolean z, int i, byte b) {
        this.I = b;
        this.J = eventTime;
        this.K = z;
        this.L = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.I) {
            case 0:
                ((AnalyticsListener) obj).onPlayerStateChanged(this.J, this.K, this.L);
                break;
            default:
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(this.J, this.K, this.L);
                break;
        }
    }
}
