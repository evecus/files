package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hu extends ku {
    public final char[] f;

    public hu(gu guVar) {
        super(guVar, (Character) null);
        this.f = new char[512];
        char[] cArr = guVar.b;
        sp0.o(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.ku
    public final int c(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new ju("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            gu guVar = this.a;
            bArr[i2] = (byte) ((guVar.a(charAt) << 4) | guVar.a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.ku
    public final void f(StringBuilder sb, byte[] bArr, int i, int i2) {
        sp0.y(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i + i3] & 255;
            char[] cArr = this.f;
            sb.append(cArr[i4]);
            sb.append(cArr[i4 | 256]);
        }
    }

    @Override // defpackage.ku
    public final ku i(gu guVar, Character ch) {
        return new hu(guVar);
    }
}
