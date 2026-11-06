package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Util;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.m63;
import defpackage.mm0;
import defpackage.og3;
import defpackage.qz;
import defpackage.vz;
import defpackage.x24;
import defpackage.zx1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CueGroup {
    private static final og3 CUES_PRIORITY_COMPARATOR = new vz(new qz(1), m63.I);
    public static final CueGroup EMPTY_TIME_ZERO;
    private static final String FIELD_CUES;
    private static final String FIELD_PRESENTATION_TIME_US;
    public final dy1 cues;
    public final long presentationTimeUs;

    static {
        ay1 ay1Var = dy1.J;
        EMPTY_TIME_ZERO = new CueGroup(x24.M, 0L);
        FIELD_CUES = Util.intToStringMaxRadix(0);
        FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
    }

    public CueGroup(List<Cue> list, long j) {
        this.cues = dy1.v(CUES_PRIORITY_COMPARATOR, list);
        this.presentationTimeUs = j;
    }

    private static dy1 filterOutBitmapCues(List<Cue> list) {
        zx1 n = dy1.n();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bitmap == null) {
                n.c(list.get(i));
            }
        }
        return n.f();
    }

    public static CueGroup fromBundle(Bundle bundle) {
        List fromBundleList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        if (parcelableArrayList == null) {
            ay1 ay1Var = dy1.J;
            fromBundleList = x24.M;
        } else {
            fromBundleList = BundleCollectionUtil.fromBundleList(new mm0((byte) 1), parcelableArrayList);
        }
        return new CueGroup(fromBundleList, bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$static$0(Cue cue) {
        return Integer.valueOf(cue.zIndex);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, BundleCollectionUtil.toBundleArrayList(filterOutBitmapCues(this.cues), new mm0((byte) 2)));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }
}
