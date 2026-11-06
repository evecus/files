package androidx.media3.decoder;

import androidx.media3.common.C;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class Buffer {
    private int flags;

    public final void addFlag(int i) {
        this.flags = i | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i) {
        this.flags = (~i) & this.flags;
    }

    public final boolean getFlag(int i) {
        return (this.flags & i) == i;
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isFirstSample() {
        return getFlag(C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final boolean isLastSample() {
        return getFlag(C.BUFFER_FLAG_LAST_SAMPLE);
    }

    public final boolean notDependedOn() {
        return getFlag(C.BUFFER_FLAG_NOT_DEPENDED_ON);
    }

    public final void setFlags(int i) {
        this.flags = i;
    }
}
