package androidx.media3.exoplayer.hls;

import androidx.media3.exoplayer.source.chunk.MediaChunk;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final MediaChunk mediaChunk;
    public final long rejectedSampleTimeUs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UnexpectedSampleTimestampException(androidx.media3.exoplayer.source.chunk.MediaChunk r5, long r6, long r8) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected sample timestamp: "
            r0.<init>(r1)
            long r1 = androidx.media3.common.util.Util.usToMs(r8)
            r0.append(r1)
            java.lang.String r1 = " in chunk ["
            r0.append(r1)
            long r1 = r5.startTimeUs
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r1 = r5.endTimeUs
            java.lang.String r3 = "]"
            java.lang.String r0 = defpackage.r7.D(r0, r1, r3)
            r4.<init>(r0)
            r4.mediaChunk = r5
            r4.lastAcceptedSampleTimeUs = r6
            r4.rejectedSampleTimeUs = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.UnexpectedSampleTimestampException.<init>(androidx.media3.exoplayer.source.chunk.MediaChunk, long, long):void");
    }
}
