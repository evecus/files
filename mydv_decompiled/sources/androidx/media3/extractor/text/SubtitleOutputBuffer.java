package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import androidx.media3.decoder.DecoderOutputBuffer;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {
    private long subsampleOffsetUs;
    private Subtitle subtitle;

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.subtitle = null;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j) {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getCues(j - this.subsampleOffsetUs);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getEventTime(i) + this.subsampleOffsetUs;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getEventTimeCount();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getNextEventTimeIndex(j - this.subsampleOffsetUs);
    }

    public void setContent(long j, Subtitle subtitle, long j2) {
        this.timeUs = j;
        this.subtitle = subtitle;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.subsampleOffsetUs = j;
    }
}
