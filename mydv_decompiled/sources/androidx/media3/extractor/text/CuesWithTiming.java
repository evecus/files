package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import defpackage.dy1;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class CuesWithTiming {
    public final dy1 cues;
    public final long durationUs;
    public final long endTimeUs;
    public final long startTimeUs;

    public CuesWithTiming(List<Cue> list, long j, long j2) {
        this.cues = dy1.p(list);
        this.startTimeUs = j;
        this.durationUs = j2;
        long j3 = C.TIME_UNSET;
        if (j != C.TIME_UNSET && j2 != C.TIME_UNSET) {
            j3 = j + j2;
        }
        this.endTimeUs = j3;
    }
}
