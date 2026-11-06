package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class tn0 extends u0 implements b1 {
    public static final y J = new y(tn0.class, (byte) 22);
    public static final char[] K = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] I;

    public tn0(byte[] bArr) {
        this.I = bArr;
    }

    public static void v(int i, StringBuilder sb) {
        char[] cArr = K;
        sb.append(cArr[(i >>> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    @Override // defpackage.b1
    public final String e() {
        int i;
        byte[] bArr = this.I;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(((uu2.y(length) + length) * 2) + 3);
        sb.append("#1C");
        if (length < 128) {
            v(length, sb);
        } else {
            byte[] bArr2 = new byte[5];
            int i2 = length;
            int i3 = 5;
            while (true) {
                i = i3 - 1;
                bArr2[i] = (byte) i2;
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3 = i;
            }
            int i4 = i3 - 2;
            bArr2[i4] = (byte) (128 | (5 - i));
            while (true) {
                int i5 = i4 + 1;
                v(bArr2[i4], sb);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (byte b : bArr) {
            v(b, sb);
        }
        return sb.toString();
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return g4.N(this.I);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (u0Var instanceof tn0) {
            return Arrays.equals(this.I, ((tn0) u0Var).I);
        }
        return false;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.P(this.I, 28, z);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return false;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        return uu2.z(this.I.length, z);
    }

    public final String toString() {
        return e();
    }
}
