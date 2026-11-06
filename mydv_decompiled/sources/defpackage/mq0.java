package defpackage;

import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mq0 implements ListenerSet.Event, Consumer {
    public final /* synthetic */ LoadEventInfo I;
    public final /* synthetic */ MediaLoadData J;
    public final /* synthetic */ IOException K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ Object M;

    public /* synthetic */ mq0(Object obj, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.M = obj;
        this.I = loadEventInfo;
        this.J = mediaLoadData;
        this.K = iOException;
        this.L = z;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaSourceEventListener.EventDispatcher) this.M).lambda$loadError$3(this.I, this.J, this.K, this.L, (MediaSourceEventListener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadError((AnalyticsListener.EventTime) this.M, this.I, this.J, this.K, this.L);
    }
}
