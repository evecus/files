package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.CuesWithTiming;
import defpackage.dy1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
interface CuesResolver {
    boolean addCues(CuesWithTiming cuesWithTiming, long j);

    void clear();

    void discardCuesBeforeTimeUs(long j);

    dy1 getCuesAtTimeUs(long j);

    long getNextCueChangeTimeUs(long j);

    long getPreviousCueChangeTimeUs(long j);
}
