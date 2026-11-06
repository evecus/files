package androidx.media3.extractor.ts;

import defpackage.sp0;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class NalUnitTargetBuffer {
    private boolean isCompleted;
    private boolean isFilling;
    public byte[] nalData;
    public int nalLength;
    private final int targetType;

    public NalUnitTargetBuffer(int i, int i2) {
        this.targetType = i;
        byte[] bArr = new byte[i2 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i, int i2) {
        if (this.isFilling) {
            int i3 = i2 - i;
            byte[] bArr2 = this.nalData;
            int length = bArr2.length;
            int i4 = this.nalLength;
            if (length < i4 + i3) {
                bArr2 = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                this.nalData = bArr2;
            }
            System.arraycopy(bArr, i, bArr2, this.nalLength, i3);
            this.nalLength += i3;
        }
    }

    public boolean endNalUnit(int i) {
        if (!this.isFilling) {
            return false;
        }
        this.nalLength -= i;
        this.isFilling = false;
        this.isCompleted = true;
        return true;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void reset() {
        this.isFilling = false;
        this.isCompleted = false;
    }

    public void startNalUnit(int i) {
        sp0.z(!this.isFilling);
        boolean z = i == this.targetType;
        this.isFilling = z;
        if (z) {
            this.nalLength = 3;
            this.isCompleted = false;
        }
    }
}
