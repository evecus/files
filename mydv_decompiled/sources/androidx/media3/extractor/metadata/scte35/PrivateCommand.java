package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.ParsableByteArray;
import defpackage.r7;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.ptsAdjustment = j2;
        this.identifier = j;
        this.commandBytes = bArr;
    }

    public static PrivateCommand parseFromSection(ParsableByteArray parsableByteArray, int i, long j) {
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new PrivateCommand(readUnsignedInt, bArr, j);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.ptsAdjustment);
        sb.append(", identifier= ");
        return r7.D(sb, this.identifier, " }");
    }
}
