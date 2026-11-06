package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vq0 implements ListenerSet.Event {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AnalyticsListener.EventTime J;
    public final /* synthetic */ LoadEventInfo K;
    public final /* synthetic */ MediaLoadData L;

    public /* synthetic */ vq0(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, byte b) {
        this.I = b;
        this.J = eventTime;
        this.K = loadEventInfo;
        this.L = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.I) {
            case 0:
                ((AnalyticsListener) obj).onLoadCanceled(this.J, this.K, this.L);
                break;
            default:
                ((AnalyticsListener) obj).onLoadCompleted(this.J, this.K, this.L);
                break;
        }
    }
}
