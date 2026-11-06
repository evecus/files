package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ku {
    public static final hu e;
    public final gu a;
    public final Character b;
    public volatile ku c;
    public volatile ku d;

    static {
        new iu("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new iu("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new ku("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new ku("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        e = new hu(new gu("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public ku(gu guVar, Character ch) {
        boolean z;
        this.a = guVar;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = guVar.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                sp0.s(z, "Padding character %s was already in alphabet", ch);
                this.b = ch;
            }
        }
        z = true;
        sp0.s(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public static hu a() {
        return e;
    }

    public final byte[] b(String str) {
        try {
            int length = (int) (((this.a.d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int c = c(bArr, j(str));
            if (c == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[c];
            System.arraycopy(bArr, 0, bArr2, 0, c);
            return bArr2;
        } catch (ju e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public int c(byte[] bArr, CharSequence charSequence) {
        CharSequence j = j(charSequence);
        int length = j.length();
        gu guVar = this.a;
        boolean[] zArr = guVar.h;
        int i = guVar.d;
        int i2 = guVar.e;
        if (!zArr[length % i2]) {
            throw new ju("Invalid input length " + j.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < j.length(); i4 += i2) {
            long j2 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j2 <<= i;
                if (i4 + i6 < j.length()) {
                    j2 |= guVar.a(j.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = guVar.f;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((j2 >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    public final String d(byte[] bArr, int i, int i2) {
        sp0.y(i, i + i2, bArr.length);
        gu guVar = this.a;
        int i3 = guVar.e;
        int i4 = guVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(k21.s(i2, i4) * i3);
        try {
            f(sb, bArr, i, i2);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void e(StringBuilder sb, byte[] bArr, int i, int i2) {
        sp0.y(i, i + i2, bArr.length);
        gu guVar = this.a;
        int i3 = guVar.f;
        int i4 = guVar.d;
        int i5 = 0;
        sp0.o(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(guVar.b[((int) (j >>> (i7 - i5))) & guVar.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < guVar.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ku) {
            ku kuVar = (ku) obj;
            if (this.a.equals(kuVar.a) && Objects.equals(this.b, kuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public void f(StringBuilder sb, byte[] bArr, int i, int i2) {
        sp0.y(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            gu guVar = this.a;
            e(sb, bArr, i + i3, Math.min(guVar.f, i2 - i3));
            i3 += guVar.f;
        }
    }

    public final ku g() {
        ku kuVar = this.d;
        if (kuVar == null) {
            gu b = this.a.b();
            kuVar = b == this.a ? this : i(b, this.b);
            this.d = kuVar;
        }
        return kuVar;
    }

    public final ku h() {
        boolean z;
        ku kuVar = this.c;
        if (kuVar == null) {
            gu guVar = this.a;
            char[] cArr = guVar.b;
            int length = cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (j42.H(cArr[i])) {
                    int length2 = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            z = false;
                            break;
                        }
                        char c = cArr[i2];
                        if (c >= 'a' && c <= 'z') {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    sp0.A(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c2 = cArr[i3];
                        if (j42.H(c2)) {
                            c2 = (char) (c2 ^ ' ');
                        }
                        cArr2[i3] = c2;
                    }
                    gu guVar2 = new gu(hf1.z(new StringBuilder(), guVar.a, ".lowerCase()"), cArr2);
                    guVar = guVar.i ? guVar2.b() : guVar2;
                } else {
                    i++;
                }
            }
            kuVar = guVar == this.a ? this : i(guVar, this.b);
            this.c = kuVar;
        }
        return kuVar;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public ku i(gu guVar, Character ch) {
        return new ku(guVar, ch);
    }

    public final CharSequence j(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.b;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        gu guVar = this.a;
        sb.append(guVar);
        if (8 % guVar.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public ku(String str, String str2) {
        this(new gu(str, str2.toCharArray()), (Character) '=');
    }
}
