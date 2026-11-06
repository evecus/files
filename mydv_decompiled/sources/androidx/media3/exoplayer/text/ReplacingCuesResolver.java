package androidx.media3.exoplayer.text;

import androidx.media3.common.C;
import androidx.media3.extractor.text.CuesWithTiming;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.rt0;
import defpackage.x24;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ReplacingCuesResolver implements CuesResolver {
    private final ArrayList<CuesWithTiming> cuesWithTimingList = new ArrayList<>();

    private int getIndexOfCuesStartingAfter(long j) {
        int i = 0;
        while (true) {
            int size = this.cuesWithTimingList.size();
            ArrayList<CuesWithTiming> arrayList = this.cuesWithTimingList;
            if (i >= size) {
                return arrayList.size();
            }
            if (j < arrayList.get(i).startTimeUs) {
                return i;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean addCues(androidx.media3.extractor.text.CuesWithTiming r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.startTimeUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            defpackage.sp0.o(r0)
            long r5 = r10.startTimeUs
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.endTimeUs
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r2 = r9.cuesWithTimingList
            int r2 = r2.size()
            int r2 = r2 - r4
        L2d:
            if (r2 < 0) goto L56
            long r5 = r10.startTimeUs
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r3 = r9.cuesWithTimingList
            java.lang.Object r3 = r3.get(r2)
            androidx.media3.extractor.text.CuesWithTiming r3 = (androidx.media3.extractor.text.CuesWithTiming) r3
            long r7 = r3.startTimeUs
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r5 = r9.cuesWithTimingList
            if (r3 < 0) goto L46
            int r2 = r2 + r4
            r5.add(r2, r10)
            return r0
        L46:
            java.lang.Object r3 = r5.get(r2)
            androidx.media3.extractor.text.CuesWithTiming r3 = (androidx.media3.extractor.text.CuesWithTiming) r3
            long r5 = r3.startTimeUs
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L53
            r0 = r1
        L53:
            int r2 = r2 + (-1)
            goto L2d
        L56:
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r9 = r9.cuesWithTimingList
            r9.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.ReplacingCuesResolver.addCues(androidx.media3.extractor.text.CuesWithTiming, long):boolean");
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            return;
        }
        long j2 = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1).endTimeUs;
        if (j2 == C.TIME_UNSET || j2 >= j) {
            indexOfCuesStartingAfter--;
        }
        this.cuesWithTimingList.subList(0, indexOfCuesStartingAfter).clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public dy1 getCuesAtTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            ay1 ay1Var = dy1.J;
            return x24.M;
        }
        CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1);
        long j2 = cuesWithTiming.endTimeUs;
        if (j2 == C.TIME_UNSET || j < j2) {
            return cuesWithTiming.cues;
        }
        ay1 ay1Var2 = dy1.J;
        return x24.M;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < this.cuesWithTimingList.get(0).startTimeUs) {
            return this.cuesWithTimingList.get(0).startTimeUs;
        }
        int i = 1;
        while (true) {
            int size = this.cuesWithTimingList.size();
            ArrayList<CuesWithTiming> arrayList = this.cuesWithTimingList;
            if (i >= size) {
                long j2 = ((CuesWithTiming) rt0.z(arrayList)).endTimeUs;
                if (j2 == C.TIME_UNSET || j >= j2) {
                    return Long.MIN_VALUE;
                }
                return j2;
            }
            CuesWithTiming cuesWithTiming = arrayList.get(i);
            if (j < cuesWithTiming.startTimeUs) {
                long j3 = this.cuesWithTimingList.get(i - 1).endTimeUs;
                return (j3 == C.TIME_UNSET || j3 <= j || j3 >= cuesWithTiming.startTimeUs) ? cuesWithTiming.startTimeUs : j3;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty() || j < this.cuesWithTimingList.get(0).startTimeUs) {
            return C.TIME_UNSET;
        }
        int i = 1;
        while (true) {
            int size = this.cuesWithTimingList.size();
            ArrayList<CuesWithTiming> arrayList = this.cuesWithTimingList;
            if (i >= size) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) rt0.z(arrayList);
                long j2 = cuesWithTiming.endTimeUs;
                return (j2 == C.TIME_UNSET || j < j2) ? cuesWithTiming.startTimeUs : j2;
            }
            long j3 = arrayList.get(i).startTimeUs;
            if (j == j3) {
                return j3;
            }
            if (j < j3) {
                CuesWithTiming cuesWithTiming2 = this.cuesWithTimingList.get(i - 1);
                long j4 = cuesWithTiming2.endTimeUs;
                return (j4 == C.TIME_UNSET || j4 > j) ? cuesWithTiming2.startTimeUs : j4;
            }
            i++;
        }
    }
}
