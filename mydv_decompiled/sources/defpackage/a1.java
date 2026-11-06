package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a1 {
    public final /* synthetic */ byte a = 2;
    public Object b;
    public int c;
    public int d;
    public Object e;

    public a1(CharSequence charSequence, int i, Locale locale) {
        this.e = charSequence;
        if (charSequence.length() < 0) {
            r02.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            r02.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.b = wordInstance;
        this.c = Math.max(0, -50);
        this.d = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new v50(charSequence, i));
    }

    public void a(int i) {
        int i2 = this.d;
        int i3 = i & (-128);
        byte[] bArr = (byte[]) this.b;
        if (i3 == 0) {
            bArr[i2] = (byte) i;
            this.d = i2 + 1;
            return;
        }
        bArr[i2] = (byte) (i | 128);
        int i4 = i >>> 7;
        if ((i4 & (-128)) == 0) {
            bArr[i2 + 1] = (byte) i4;
            this.d = i2 + 2;
            return;
        }
        bArr[i2 + 1] = (byte) (i4 | 128);
        int i5 = i >>> 14;
        if ((i5 & (-128)) == 0) {
            bArr[i2 + 2] = (byte) i5;
            this.d = i2 + 3;
            return;
        }
        bArr[i2 + 2] = (byte) (i5 | 128);
        int i6 = i >>> 21;
        if ((i6 & (-128)) == 0) {
            bArr[i2 + 3] = (byte) i6;
            this.d = i2 + 4;
        } else {
            bArr[i2 + 3] = (byte) (i6 | 128);
            bArr[i2 + 4] = (byte) (i >>> 28);
            this.d = i2 + 5;
        }
    }

    public void b(int i) {
        int i2 = this.c;
        int i3 = this.d;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder D = hf1.D("Invalid offset: ", i, ". Valid range is [", i2, " , ");
        D.append(i3);
        D.append("]");
        r02.a(D.toString());
    }

    public void c() {
        ((ByteArrayOutputStream) this.e).write((byte[]) this.b, 0, this.d);
        this.d = 0;
    }

    public int d() {
        h60 h60Var = (h60) this.b;
        String str = (String) this.e;
        if (h60Var == null) {
            return str.length();
        }
        return (h60Var.b - h60Var.c()) + (str.length() - (this.d - this.c));
    }

    public e0 e(int i) {
        e0 e0Var;
        long j;
        long j2;
        int i2 = this.c;
        byte[] bArr = (byte[]) this.b;
        int i3 = this.d;
        jj2 jj2Var = (jj2) this.e;
        if (jj2Var instanceof az1) {
            az1 az1Var = (az1) jj2Var;
            az1Var.N = false;
            az1Var.g();
        }
        int t = k0.t(jj2Var, i);
        int read = jj2Var.read();
        byte b = 1;
        long j3 = 0;
        if ((read >>> 7) == 0) {
            j2 = read;
        } else if (128 == read) {
            j2 = -1;
        } else {
            if (read < 0) {
                throw new EOFException("EOF found when length expected");
            }
            if (255 == read) {
                zl1.g("invalid long form definite-length 0xFF");
                return null;
            }
            int i4 = read & 127;
            int i5 = 0;
            long j4 = 0;
            e0Var = null;
            while (true) {
                int read2 = jj2Var.read();
                if (read2 < 0) {
                    throw new EOFException("EOF found reading length");
                }
                if ((j4 >>> 55) != j3) {
                    zl1.g("long form definite-length more than 63 bits");
                    return null;
                }
                j = j3;
                j4 = (j4 << 8) + read2;
                i5++;
                if (i5 >= i4) {
                    j2 = j4;
                    break;
                }
                j3 = j;
            }
        }
        j = 0;
        e0Var = null;
        byte b2 = 4;
        byte b3 = 3;
        if (j2 < j) {
            if ((i & 32) == 0) {
                zl1.g("indefinite-length primitive encoding encountered");
                return e0Var;
            }
            az1 az1Var2 = new az1(jj2Var, i3);
            if (i2 <= 0) {
                throw new h0("maximum nested construction level reached", (byte) 0);
            }
            a1 a1Var = new a1(az1Var2, i2 - 1, i3, bArr);
            int i6 = i & PsExtractor.AUDIO_STREAM;
            if (i6 != 0) {
                return new dt(i6, t, a1Var);
            }
            if (t == 3) {
                return new vs(a1Var);
            }
            if (t == 4) {
                return new ys(a1Var);
            }
            if (t == 8) {
                return new at(a1Var);
            }
            if (t == 16) {
                at atVar = new at((byte) 0);
                atVar.J = a1Var;
                return atVar;
            }
            if (t != 17) {
                j0.j(Integer.toHexString(t), "unknown BER object encountered: 0x");
                return e0Var;
            }
            at atVar2 = new at(b);
            atVar2.J = a1Var;
            return atVar2;
        }
        int min = (int) Math.min(i3, j2);
        nt0 nt0Var = new nt0(jj2Var, j2, min);
        if ((i & 224) == 0) {
            if (t == 3) {
                return new ao0(nt0Var);
            }
            if (t == 4) {
                ys ysVar = new ys();
                ysVar.J = nt0Var;
                return ysVar;
            }
            if (t == 8) {
                throw new h0("externals must use constructed encoding (see X.690 8.18)", (byte) 0);
            }
            if (t == 16) {
                throw new h0("sets must use constructed encoding (see X.690 8.11.1/8.12.1)", (byte) 0);
            }
            if (t == 17) {
                throw new h0("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)", (byte) 0);
            }
            eg5.i(nt0Var.L, nt0Var.J);
            try {
                return k0.g(t, nt0Var, bArr);
            } catch (IllegalArgumentException e) {
                throw new h0("corrupted stream detected", e, (byte) 0);
            }
        }
        if (i2 <= 0) {
            throw new h0("maximum nested construction level reached", (byte) 0);
        }
        a1 a1Var2 = new a1(nt0Var, i2 - 1, min, bArr);
        int i7 = i & PsExtractor.AUDIO_STREAM;
        if (i7 != 0) {
            return new do0(i7, t, (i & 32) != 0, a1Var2);
        }
        if (t == 3) {
            return new vs(a1Var2);
        }
        if (t == 4) {
            return new ys(a1Var2);
        }
        if (t == 8) {
            return new at(a1Var2);
        }
        if (t == 16) {
            at atVar3 = new at(b3);
            atVar3.J = a1Var2;
            return atVar3;
        }
        if (t != 17) {
            j0.j(Integer.toHexString(t), "unknown DL object encountered: 0x");
            return e0Var;
        }
        at atVar4 = new at(b2);
        atVar4.J = a1Var2;
        return atVar4;
    }

    public boolean f(int i) {
        CharSequence charSequence = (CharSequence) this.e;
        int i2 = this.c + 1;
        if (i > this.d || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!c81.d()) {
                    return false;
                }
                c81 a = c81.a();
                if (a.c() != 1 || a.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean g(int i) {
        int i2 = this.c + 1;
        if (i > this.d || i2 > i) {
            return false;
        }
        return eg5.u(Character.codePointBefore((CharSequence) this.e, i));
    }

    public boolean h(int i) {
        b(i);
        if (!((BreakIterator) this.b).isBoundary(i)) {
            return false;
        }
        if (j(i) && j(i - 1) && j(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.e).length() - 1 || !(i(i) || i(i + 1));
    }

    public boolean i(int i) {
        CharSequence charSequence = (CharSequence) this.e;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (j42.c(of, unicodeBlock) && j42.c(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return j42.c(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && j42.c(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean j(int i) {
        CharSequence charSequence = (CharSequence) this.e;
        int i2 = this.c;
        if (i >= this.d || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!c81.d()) {
                return false;
            }
            c81 a = c81.a();
            if (a.c() != 1 || a.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean k(int i) {
        int i2 = this.c;
        if (i >= this.d || i2 > i) {
            return false;
        }
        return eg5.u(Character.codePointAt((CharSequence) this.e, i));
    }

    public ct l(int i, int i2) {
        f0 o = o();
        int i3 = o.b;
        if (i3 == 1) {
            return new ct(3, i, i2, o.c(0), (byte) 0);
        }
        zs zsVar = ws.a;
        return new ct(4, i, i2, i3 < 1 ? ws.a : new zs(o), (byte) 0);
    }

    public int m(int i) {
        b(i);
        int following = ((BreakIterator) this.b).following(i);
        return (j(following + (-1)) && j(following) && !i(following)) ? m(following) : following;
    }

    public int n(int i) {
        b(i);
        int preceding = ((BreakIterator) this.b).preceding(i);
        return (j(preceding) && f(preceding) && !i(preceding)) ? n(preceding) : preceding;
    }

    public f0 o() {
        jj2 jj2Var = (jj2) this.e;
        int read = jj2Var.read();
        if (read < 0) {
            return new f0(0);
        }
        f0 f0Var = new f0();
        do {
            e0 e = e(read);
            f0Var.a(e instanceof uy1 ? ((uy1) e).j() : e.d());
            read = jj2Var.read();
        } while (read >= 0);
        return f0Var;
    }

    public void p(int i, int i2, String str) {
        if (i > i2) {
            r02.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            r02.a("start must be non-negative, but was " + i);
        }
        h60 h60Var = (h60) this.b;
        if (h60Var == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.e).length() - i2, 64);
            String str2 = (String) this.e;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.e;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            h60 h60Var2 = new h60((byte) 3);
            h60Var2.b = max;
            h60Var2.e = cArr;
            h60Var2.c = length;
            h60Var2.d = i4;
            this.b = h60Var2;
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > h60Var.b - h60Var.c()) {
            this.e = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            p(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > h60Var.c()) {
            int c = length2 - h60Var.c();
            int i9 = h60Var.b;
            do {
                i9 *= 2;
            } while (i9 - h60Var.b < c);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) h60Var.e, 0, cArr2, 0, h60Var.c);
            int i10 = h60Var.b;
            int i11 = h60Var.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) h60Var.e, i11, cArr2, i13, (i12 + i11) - i11);
            h60Var.e = cArr2;
            h60Var.b = i9;
            h60Var.d = i13;
        }
        int i14 = h60Var.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) h60Var.e;
            System.arraycopy(cArr3, i8, cArr3, h60Var.d - i15, i15);
            h60Var.c = i7;
            h60Var.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int c2 = h60Var.c() + i7;
            int c3 = h60Var.c() + i8;
            int i16 = h60Var.d;
            int i17 = c2 - i16;
            char[] cArr4 = (char[]) h60Var.e;
            System.arraycopy(cArr4, i16, cArr4, h60Var.c, i17);
            i7 = h60Var.c + i17;
            h60Var.c = i7;
            h60Var.d = c3;
        } else {
            h60Var.d = h60Var.c() + i8;
            h60Var.c = i7;
        }
        str.getChars(0, str.length(), (char[]) h60Var.e, i7);
        h60Var.c = str.length() + h60Var.c;
    }

    public void q(int i, byte[] bArr) {
        int i2 = this.c;
        int i3 = this.d;
        int i4 = i2 - i3;
        byte[] bArr2 = (byte[]) this.b;
        if (i4 >= i) {
            System.arraycopy(bArr, 0, bArr2, i3, i);
            this.d += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i3, i4);
        int i5 = i - i4;
        this.d = i2;
        c();
        if (i5 > i2) {
            ((ByteArrayOutputStream) this.e).write(bArr, i4, i5);
        } else {
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            this.d = i5;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                h60 h60Var = (h60) this.b;
                String str = (String) this.e;
                if (h60Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.c);
                sb.append((char[]) h60Var.e, 0, h60Var.c);
                char[] cArr = (char[]) h60Var.e;
                int i = h60Var.d;
                sb.append(cArr, i, h60Var.b - i);
                String str2 = (String) this.e;
                sb.append((CharSequence) str2, this.d, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public a1(jj2 jj2Var, int i, int i2, byte[] bArr) {
        this.e = jj2Var;
        this.c = i;
        this.d = i2;
        this.b = bArr;
    }

    public a1(ByteArrayOutputStream byteArrayOutputStream) {
        this.e = byteArrayOutputStream;
        int max = Math.max(4096, 20);
        this.b = new byte[max];
        this.c = max;
    }

    public /* synthetic */ a1() {
    }
}
