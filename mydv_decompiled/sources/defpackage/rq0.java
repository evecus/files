package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rq0 implements ListenerSet.Event {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ AnalyticsListener.EventTime J;
    public final /* synthetic */ long K;
    public final /* synthetic */ int L;

    public /* synthetic */ rq0(AnalyticsListener.EventTime eventTime, int i, long j) {
        this.J = eventTime;
        this.L = i;
        this.K = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.I) {
            case 0:
                ((AnalyticsListener) obj).onDroppedVideoFrames(this.J, this.L, this.K);
                break;
            default:
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(this.J, this.K, this.L);
                break;
        }
    }

    public /* synthetic */ rq0(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.J = eventTime;
        this.K = j;
        this.L = i;
    }
}
