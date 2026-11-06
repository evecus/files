package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.Util;
import defpackage.dy1;
import defpackage.sp0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class TrackSelectionOverride {
    public final TrackGroup mediaTrackGroup;
    public final dy1 trackIndices;
    private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
    private static final String FIELD_TRACKS = Util.intToStringMaxRadix(1);

    public TrackSelectionOverride(TrackGroup trackGroup, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= trackGroup.length)) {
            throw new IndexOutOfBoundsException();
        }
        this.mediaTrackGroup = trackGroup;
        this.trackIndices = dy1.p(list);
    }

    public static TrackSelectionOverride fromBundle(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(FIELD_TRACK_GROUP);
        bundle2.getClass();
        TrackGroup fromBundle = TrackGroup.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(FIELD_TRACKS);
        intArray.getClass();
        return new TrackSelectionOverride(fromBundle, (List<Integer>) sp0.j(intArray));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackSelectionOverride.class == obj.getClass()) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) obj;
            if (this.mediaTrackGroup.equals(trackSelectionOverride.mediaTrackGroup) && this.trackIndices.equals(trackSelectionOverride.trackIndices)) {
                return true;
            }
        }
        return false;
    }

    public int getType() {
        return this.mediaTrackGroup.type;
    }

    public int hashCode() {
        return (this.trackIndices.hashCode() * 31) + this.mediaTrackGroup.hashCode();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
        bundle.putIntArray(FIELD_TRACKS, sp0.j0(this.trackIndices));
        return bundle;
    }

    public TrackSelectionOverride(TrackGroup trackGroup, int i) {
        this(trackGroup, dy1.t(Integer.valueOf(i)));
    }
}
