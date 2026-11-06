package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class h00 implements Serializable, Comparable {
    public static final h00 L = new h00(new byte[0]);
    public final byte[] I;
    public transient int J;
    public transient String K;

    public h00(byte[] bArr) {
        bArr.getClass();
        this.I = bArr;
    }

    public static int g(h00 h00Var, h00 h00Var2) {
        h00Var.getClass();
        h00Var2.getClass();
        return h00Var.f(0, h00Var2.h());
    }

    public static int k(h00 h00Var, h00 h00Var2) {
        int d = h00Var.d();
        h00Var.getClass();
        h00Var2.getClass();
        return h00Var.j(d, h00Var2.h());
    }

    public static h00 p(h00 h00Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = h00Var.d();
        }
        return h00Var.o(i, i2);
    }

    public String a() {
        return a.b(this.I);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h00 h00Var) {
        h00Var.getClass();
        int d = d();
        int d2 = h00Var.d();
        int min = Math.min(d, d2);
        for (int i = 0; i < min; i++) {
            int i2 = i(i) & 255;
            int i3 = h00Var.i(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (d == d2) {
            return 0;
        }
        return d < d2 ? -1 : 1;
    }

    public h00 c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.I, 0, d());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new h00(digest);
    }

    public int d() {
        return this.I.length;
    }

    public String e() {
        byte[] bArr = this.I;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = qb.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h00) {
            h00 h00Var = (h00) obj;
            int d = h00Var.d();
            byte[] bArr = this.I;
            if (d == bArr.length && h00Var.l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.I;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!o7.f(bArr2, max, 0, bArr, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public byte[] h() {
        return this.I;
    }

    public int hashCode() {
        int i = this.J;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.I);
        this.J = hashCode;
        return hashCode;
    }

    public byte i(int i) {
        return this.I[i];
    }

    public int j(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.I;
        for (int min = Math.min(i, bArr2.length - bArr.length); -1 < min; min--) {
            if (o7.f(bArr2, min, 0, bArr, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.I;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && o7.f(bArr2, i, i2, bArr, i3);
    }

    public boolean m(int i, h00 h00Var, int i2) {
        h00Var.getClass();
        return h00Var.l(0, i, i2, this.I);
    }

    public String n(Charset charset) {
        charset.getClass();
        return new String(this.I, charset);
    }

    public h00 o(int i, int i2) {
        if (i < 0) {
            s83.t("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.I;
        if (i2 > bArr.length) {
            s83.h(hf1.y(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new h00(dq.V0(bArr, i, i2));
        }
        s83.t("endIndex < beginIndex");
        return null;
    }

    public h00 q() {
        int i = 0;
        while (true) {
            byte[] bArr = this.I;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new h00(copyOf);
            }
            i++;
        }
    }

    public byte[] r() {
        byte[] bArr = this.I;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String s() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        byte[] h = h();
        h.getClass();
        String str2 = new String(h, z50.a);
        this.K = str2;
        return str2;
    }

    public void t(int i, cz czVar) {
        czVar.m196write(this.I, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ef, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0127, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012b, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00cf, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x016a, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0171, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0163, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01a2, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01a5, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01a8, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0137, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01ab, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0092, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0081, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f7, code lost:
    
        if (r6 == 64) goto L178;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h00.toString():java.lang.String");
    }
}
