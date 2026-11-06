package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zp0 implements ListenerSet.Event {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AnalyticsListener.EventTime J;

    public /* synthetic */ zp0(AnalyticsListener.EventTime eventTime, byte b) {
        this.I = b;
        this.J = eventTime;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        byte b = this.I;
        AnalyticsListener.EventTime eventTime = this.J;
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (b) {
            case 0:
                analyticsListener.onPlayerReleased(eventTime);
                break;
            case 1:
                analyticsListener.onDrmKeysRemoved(eventTime);
                break;
            case 2:
                analyticsListener.onDrmKeysRestored(eventTime);
                break;
            default:
                analyticsListener.onDrmSessionReleased(eventTime);
                break;
        }
    }
}
