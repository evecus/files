package defpackage;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Track;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cc1 implements pn1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cc1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.pn1
    public final Object apply(Object obj) {
        AnalyticsCollector lambda$setAnalyticsCollector$21;
        AnalyticsCollector lambda$new$13;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                lambda$setAnalyticsCollector$21 = ExoPlayer.Builder.lambda$setAnalyticsCollector$21((AnalyticsCollector) obj2, (Clock) obj);
                return lambda$setAnalyticsCollector$21;
            case 1:
                lambda$new$13 = ExoPlayer.Builder.lambda$new$13((AnalyticsCollector) obj2, (Clock) obj);
                return lambda$new$13;
            default:
                return ((FragmentedMp4Extractor) obj2).modifyTrack((Track) obj);
        }
    }
}
