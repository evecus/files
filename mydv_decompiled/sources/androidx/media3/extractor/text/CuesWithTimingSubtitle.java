package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.m63;
import defpackage.og3;
import defpackage.sp0;
import defpackage.vz;
import defpackage.x24;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class CuesWithTimingSubtitle implements Subtitle {
    private static final og3 CUES_BY_START_TIME_ASCENDING = new vz(new a(), m63.I);
    private static final String TAG = "CuesWithTimingSubtitle";
    private final dy1 eventCues;
    private final long[] eventTimesUs;

    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CuesWithTimingSubtitle(java.util.List<androidx.media3.extractor.text.CuesWithTiming> r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.CuesWithTimingSubtitle.<init>(java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lambda$static$0(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs));
    }

    private static long normalizeUnsetStartTimeToZero(long j) {
        if (j == C.TIME_UNSET) {
            return 0L;
        }
        return j;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public dy1 getCues(long j) {
        int binarySearchFloor = Util.binarySearchFloor(this.eventTimesUs, j, true, false);
        if (binarySearchFloor != -1) {
            return (dy1) this.eventCues.get(binarySearchFloor);
        }
        ay1 ay1Var = dy1.J;
        return x24.M;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        sp0.o(i < this.eventCues.size());
        return this.eventTimesUs[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j, false, false);
        if (binarySearchCeil < this.eventCues.size()) {
            return binarySearchCeil;
        }
        return -1;
    }
}
