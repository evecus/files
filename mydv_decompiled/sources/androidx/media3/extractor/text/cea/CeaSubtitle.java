package androidx.media3.extractor.text.cea;

import androidx.media3.common.text.Cue;
import androidx.media3.extractor.text.Subtitle;
import defpackage.sp0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class CeaSubtitle implements Subtitle {
    private final List<Cue> cues;

    public CeaSubtitle(List<Cue> list) {
        this.cues = list;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j) {
        return j >= 0 ? this.cues : Collections.EMPTY_LIST;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        sp0.o(i == 0);
        return 0L;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }
}
