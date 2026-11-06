package androidx.media3.exoplayer.text;

import androidx.media3.common.C;
import androidx.media3.extractor.text.CuesWithTiming;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.lf0;
import defpackage.m63;
import defpackage.o54;
import defpackage.og3;
import defpackage.pn1;
import defpackage.sp0;
import defpackage.vz;
import defpackage.x24;
import defpackage.zx1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class MergingCuesResolver implements CuesResolver {
    private static final og3 CUES_DISPLAY_PRIORITY_COMPARATOR;
    private final List<CuesWithTiming> cuesWithTimingList = new ArrayList();

    static {
        final byte b = 0;
        final byte b2 = 1;
        CUES_DISPLAY_PRIORITY_COMPARATOR = new lf0(new vz(new pn1() { // from class: androidx.media3.exoplayer.text.a
            @Override // defpackage.pn1
            public final Object apply(Object obj) {
                Long lambda$static$0;
                Long lambda$static$1;
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (b) {
                    case 0:
                        lambda$static$0 = MergingCuesResolver.lambda$static$0(cuesWithTiming);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = MergingCuesResolver.lambda$static$1(cuesWithTiming);
                        return lambda$static$1;
                }
            }
        }, m63.I), new vz(new pn1() { // from class: androidx.media3.exoplayer.text.a
            @Override // defpackage.pn1
            public final Object apply(Object obj) {
                Long lambda$static$0;
                Long lambda$static$1;
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (b2) {
                    case 0:
                        lambda$static$0 = MergingCuesResolver.lambda$static$0(cuesWithTiming);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = MergingCuesResolver.lambda$static$1(cuesWithTiming);
                        return lambda$static$1;
                }
            }
        }, o54.I));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$0(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(cuesWithTiming.startTimeUs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$1(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(cuesWithTiming.durationUs);
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(CuesWithTiming cuesWithTiming, long j) {
        sp0.o(cuesWithTiming.startTimeUs != C.TIME_UNSET);
        sp0.o(cuesWithTiming.durationUs != C.TIME_UNSET);
        boolean z = cuesWithTiming.startTimeUs <= j && j < cuesWithTiming.endTimeUs;
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int i = 0;
        while (i < this.cuesWithTimingList.size()) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            if (j > j2 && j > this.cuesWithTimingList.get(i).endTimeUs) {
                this.cuesWithTimingList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public dy1 getCuesAtTimeUs(long j) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j >= this.cuesWithTimingList.get(0).startTimeUs) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
                    CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i);
                    if (j >= cuesWithTiming.startTimeUs && j < cuesWithTiming.endTimeUs) {
                        arrayList.add(cuesWithTiming);
                    }
                    if (j < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                x24 v = dy1.v(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                zx1 n = dy1.n();
                for (int i2 = 0; i2 < v.L; i2++) {
                    n.d(((CuesWithTiming) v.get(i2)).cues);
                }
                return n.f();
            }
        }
        ay1 ay1Var = dy1.J;
        return x24.M;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            if (i >= this.cuesWithTimingList.size()) {
                break;
            }
            long j3 = this.cuesWithTimingList.get(i).startTimeUs;
            long j4 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j < j3) {
                j2 = j2 == C.TIME_UNSET ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == C.TIME_UNSET ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != C.TIME_UNSET) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j < this.cuesWithTimingList.get(0).startTimeUs) {
            return C.TIME_UNSET;
        }
        long j2 = this.cuesWithTimingList.get(0).startTimeUs;
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            long j3 = this.cuesWithTimingList.get(i).startTimeUs;
            long j4 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }
}
