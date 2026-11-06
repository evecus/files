package androidx.media3.exoplayer.trackselection;

import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ byte I;

    public /* synthetic */ b(byte b) {
        this.I = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareNonQualityPreferences;
        int compareQualityPreferences;
        switch (this.I) {
            case 0:
                return DefaultTrackSelector.ImageTrackInfo.compareSelections((List) obj, (List) obj2);
            case 1:
                compareNonQualityPreferences = DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                return compareNonQualityPreferences;
            default:
                compareQualityPreferences = DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                return compareQualityPreferences;
        }
    }
}
