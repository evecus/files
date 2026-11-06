package defpackage;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class xq0 implements ListenerSet.Event, DefaultTrackSelector.TrackInfo.Factory {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ xq0(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        List lambda$selectTextTrack$4;
        lambda$selectTextTrack$4 = DefaultTrackSelector.lambda$selectTextTrack$4((DefaultTrackSelector.Parameters) this.J, (String) this.K, (String) this.L, i, trackGroup, iArr);
        return lambda$selectTextTrack$4;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.I) {
            case 0:
                ((AnalyticsListener) obj).onVideoInputFormatChanged((AnalyticsListener.EventTime) this.J, (Format) this.K, (DecoderReuseEvaluation) this.L);
                break;
            default:
                ((AnalyticsListener) obj).onAudioInputFormatChanged((AnalyticsListener.EventTime) this.J, (Format) this.K, (DecoderReuseEvaluation) this.L);
                break;
        }
    }
}
