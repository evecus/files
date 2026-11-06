package defpackage;

import androidx.media3.extractor.ts.TsExtractor;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class cn0 extends u0 implements b1 {
    public static final y J = new y(cn0.class, (byte) 0);
    public final char[] I;

    public cn0(byte[] bArr) {
        if (bArr == null) {
            zy.m("'string' cannot be null");
            throw null;
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            s83.t("malformed BMPString encoding encountered");
            throw null;
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 * 2;
            cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
        }
        this.I = cArr;
    }

    @Override // defpackage.b1
    public final String e() {
        return new String(this.I);
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        char[] cArr = this.I;
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * TsExtractor.TS_STREAM_TYPE_AIT) ^ cArr[length];
        }
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (u0Var instanceof cn0) {
            return Arrays.equals(this.I, ((cn0) u0Var).I);
        }
        return false;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        char[] cArr = this.I;
        int length = cArr.length;
        uu2Var.U(30, z);
        uu2Var.N(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            uu2Var.L(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            uu2Var.L(bArr, 0, i3);
        }
    }

    @Override // defpackage.u0
    public final boolean o() {
        return false;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        return uu2.z(this.I.length * 2, z);
    }

    public final String toString() {
        return e();
    }
}
