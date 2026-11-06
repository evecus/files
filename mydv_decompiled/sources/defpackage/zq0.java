package defpackage;

import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class zq0 implements ListenerSet.Event, Consumer {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ zq0(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.I = (byte) 0;
        this.J = eventTime;
        this.K = i;
        this.L = positionInfo;
        this.M = positionInfo2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaSourceEventListener.EventDispatcher) this.J).lambda$loadStarted$0((LoadEventInfo) this.L, (MediaLoadData) this.M, this.K, (MediaSourceEventListener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.I) {
            case 0:
                DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$46((AnalyticsListener.EventTime) this.J, this.K, (Player.PositionInfo) this.L, (Player.PositionInfo) this.M, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onLoadStarted$26((AnalyticsListener.EventTime) this.J, (LoadEventInfo) this.L, (MediaLoadData) this.M, this.K, (AnalyticsListener) obj);
                break;
        }
    }

    public /* synthetic */ zq0(Object obj, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i, byte b) {
        this.I = b;
        this.J = obj;
        this.L = loadEventInfo;
        this.M = mediaLoadData;
        this.K = i;
    }
}
