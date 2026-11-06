package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WebvttCueInfo {
    public final Cue cue;
    public final long endTimeUs;
    public final long startTimeUs;

    public WebvttCueInfo(Cue cue, long j, long j2) {
        this.cue = cue;
        this.startTimeUs = j;
        this.endTimeUs = j2;
    }
}
