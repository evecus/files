package defpackage;

import androidx.media3.common.Format;
import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.util.Comparator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class qe implements Comparator {
    public final /* synthetic */ byte I;

    public /* synthetic */ qe(byte b) {
        this.I = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        int lambda$static$02;
        int compare;
        switch (this.I) {
            case 0:
                return j42.m(((pt3) obj2).a ? 1 : 0, ((pt3) obj).a ? 1 : 0);
            case 1:
                lambda$static$0 = BaseTrackSelection.lambda$static$0((Format) obj, (Format) obj2);
                return lambda$static$0;
            case 2:
                lambda$static$02 = DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
                return lambda$static$02;
            case 3:
                return j42.m(((b52) obj).b, ((b52) obj2).b);
            case 4:
                u22 u22Var = (u22) obj;
                u22 u22Var2 = (u22) obj2;
                return (u22Var.J - u22Var.I) - (u22Var2.J - u22Var2.I);
            case 5:
                wa2 wa2Var = (wa2) obj;
                wa2 wa2Var2 = (wa2) obj2;
                float f = wa2Var.o0.p.m0;
                float f2 = wa2Var2.o0.p.m0;
                return f == f2 ? j42.m(wa2Var.w(), wa2Var2.w()) : Float.compare(f, f2);
            default:
                compare = LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
                return compare;
        }
    }
}
