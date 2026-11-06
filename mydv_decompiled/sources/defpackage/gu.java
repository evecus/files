package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gu {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;
    public final boolean i;

    public gu(String str, char[] cArr, byte[] bArr, boolean z) {
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int a0 = k21.a0(length);
            this.d = a0;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(a0);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.e = i;
            this.f = a0 >> numberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                int i3 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[k21.s(i2 * 8, i3)] = true;
            }
            this.h = zArr;
            this.i = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final int a(char c) {
        if (c > 127) {
            throw new ju("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c > ' ' && c != 127) {
            throw new ju("Unrecognized character: " + c);
        }
        throw new ju("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final gu b() {
        if (this.i) {
            return this;
        }
        byte[] bArr = this.g;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        for (int i = 65; i <= 90; i++) {
            int i2 = i | 32;
            byte b = bArr[i];
            byte b2 = bArr[i2];
            if (b == -1) {
                copyOf[i] = b2;
            } else {
                char c = (char) i;
                char c2 = (char) i2;
                if (!(b2 == -1)) {
                    zy.i(li4.h("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                    return null;
                }
                copyOf[i2] = b;
            }
        }
        return new gu(hf1.z(new StringBuilder(), this.a, ".ignoreCase()"), this.b, copyOf, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gu)) {
            return false;
        }
        gu guVar = (gu) obj;
        return this.i == guVar.i && Arrays.equals(this.b, guVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gu(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L4b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            r8 = 0
            if (r7 == 0) goto L39
            r7 = r1[r5]
            if (r7 != r2) goto L1e
            r7 = r6
            goto L1f
        L1e:
            r7 = r3
        L1f:
            if (r7 == 0) goto L27
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L27:
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r3] = r9
            java.lang.String r9 = "Duplicate character: %s"
            java.lang.String r9 = defpackage.li4.h(r9, r10)
            defpackage.s83.t(r9)
            throw r8
        L39:
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r3] = r9
            java.lang.String r9 = "Non-ASCII character: %s"
            java.lang.String r9 = defpackage.li4.h(r9, r10)
            defpackage.s83.t(r9)
            throw r8
        L4b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu.<init>(java.lang.String, char[]):void");
    }
}
