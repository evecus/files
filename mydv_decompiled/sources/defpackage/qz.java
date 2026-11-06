package defpackage;

import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.BundledExtractorsAdapter;
import androidx.media3.extractor.Extractor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class qz implements pn1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ qz(byte b) {
        this.a = b;
    }

    @Override // defpackage.pn1
    public final Object apply(Object obj) {
        String lambda$init$0;
        Integer lambda$static$0;
        switch (this.a) {
            case 0:
                lambda$init$0 = BundledExtractorsAdapter.lambda$init$0((Extractor) obj);
                return lambda$init$0;
            case 1:
                lambda$static$0 = CueGroup.lambda$static$0((Cue) obj);
                return lambda$static$0;
            case 2:
                return new DefaultAnalyticsCollector((Clock) obj);
            default:
                return new IndexOutOfBoundsException((String) obj);
        }
    }
}
