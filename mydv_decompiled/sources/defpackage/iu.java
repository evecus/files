package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class iu extends ku {
    public iu(String str, String str2) {
        this(new gu(str, str2.toCharArray()), (Character) '=');
    }

    @Override // defpackage.ku
    public final int c(byte[] bArr, CharSequence charSequence) {
        CharSequence j = j(charSequence);
        int length = j.length();
        gu guVar = this.a;
        if (!guVar.h[length % guVar.e]) {
            throw new ju("Invalid input length " + j.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < j.length()) {
            int i3 = i + 2;
            int a = (guVar.a(j.charAt(i + 1)) << 12) | (guVar.a(j.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (a >>> 16);
            if (i3 < j.length()) {
                int i5 = i + 3;
                int a2 = a | (guVar.a(j.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((a2 >>> 8) & 255);
                if (i5 < j.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((a2 | guVar.a(j.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.ku
    public final void f(StringBuilder sb, byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        sp0.y(i, i3, bArr.length);
        while (i2 >= 3) {
            int i4 = i + 2;
            int i5 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
            i += 3;
            int i6 = i5 | (bArr[i4] & 255);
            gu guVar = this.a;
            char[] cArr = guVar.b;
            char[] cArr2 = guVar.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
            i2 -= 3;
        }
        if (i < i3) {
            e(sb, bArr, i, i3 - i);
        }
    }

    @Override // defpackage.ku
    public final ku i(gu guVar, Character ch) {
        return new iu(guVar, ch);
    }

    public iu(gu guVar, Character ch) {
        super(guVar, ch);
        sp0.o(guVar.b.length == 64);
    }
}
