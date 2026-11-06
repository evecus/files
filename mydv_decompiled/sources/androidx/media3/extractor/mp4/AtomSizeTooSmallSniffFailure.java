package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SniffFailure;
import defpackage.nt3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class AtomSizeTooSmallSniffFailure implements SniffFailure {
    public final long atomSize;
    public final int atomType;
    public final int minimumHeaderSize;

    public AtomSizeTooSmallSniffFailure(int i, long j, int i2) {
        this.atomType = i;
        this.atomSize = j;
        this.minimumHeaderSize = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
        sb.append(Util.toFourccString(this.atomType));
        sb.append(", size=");
        sb.append(this.atomSize);
        sb.append(", minHeaderSize=");
        return nt3.n(sb, this.minimumHeaderSize, "}");
    }
}
