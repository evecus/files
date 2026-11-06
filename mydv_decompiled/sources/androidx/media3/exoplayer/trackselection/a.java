package androidx.media3.exoplayer.trackselection;

import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ byte I;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        switch (this.I) {
            case 0:
                return DefaultTrackSelector.TextTrackInfo.compareSelections(list, list2);
            case 1:
                return DefaultTrackSelector.VideoTrackInfo.compareSelections(list, list2);
            default:
                return DefaultTrackSelector.AudioTrackInfo.compareSelections(list, list2);
        }
    }
}
