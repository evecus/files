package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bw implements Cloneable {
    public static final int[] K = new int[0];
    public int J = 0;
    public int[] I = K;

    public final void a(boolean z) {
        c(this.J + 1);
        if (z) {
            int[] iArr = this.I;
            int i = this.J;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.J++;
    }

    public final void b(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            s83.t("Num bits must be between 0 and 32");
            return;
        }
        int i3 = this.J;
        c(i3 + i2);
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (((1 << i4) & i) != 0) {
                int[] iArr = this.I;
                int i5 = i3 / 32;
                iArr[i5] = iArr[i5] | (1 << (i3 & 31));
            }
            i3++;
        }
        this.J = i3;
    }

    public final void c(int i) {
        if (i > this.I.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i / 0.75f)) + 31) / 32];
            int[] iArr2 = this.I;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.I = iArr;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.I.clone();
        int i = this.J;
        bw bwVar = new bw();
        bwVar.I = iArr;
        bwVar.J = i;
        return bwVar;
    }

    public final boolean d(int i) {
        return (this.I[i / 32] & (1 << (i & 31))) != 0;
    }

    public final int e() {
        return (this.J + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return this.J == bwVar.J && Arrays.equals(this.I, bwVar.I);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.I) + (this.J * 31);
    }

    public final String toString() {
        int i = this.J;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.J; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(d(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
