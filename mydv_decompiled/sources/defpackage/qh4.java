package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qh4 extends h00 {
    public final transient byte[][] M;
    public final transient int[] N;

    public qh4(byte[][] bArr, int[] iArr) {
        super(h00.L.I);
        this.M = bArr;
        this.N = iArr;
    }

    @Override // defpackage.h00
    public final String a() {
        return a.b(u().I);
    }

    @Override // defpackage.h00
    public final h00 c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.M;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.N;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new h00(digest);
    }

    @Override // defpackage.h00
    public final int d() {
        return this.N[this.M.length - 1];
    }

    @Override // defpackage.h00
    public final String e() {
        return u().e();
    }

    @Override // defpackage.h00
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h00) {
            h00 h00Var = (h00) obj;
            if (h00Var.d() == d() && m(0, h00Var, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h00
    public final int f(int i, byte[] bArr) {
        bArr.getClass();
        return u().f(i, bArr);
    }

    @Override // defpackage.h00
    public final byte[] h() {
        return r();
    }

    @Override // defpackage.h00
    public final int hashCode() {
        int i = this.J;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.M;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.N;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.J = i3;
        return i3;
    }

    @Override // defpackage.h00
    public final byte i(int i) {
        byte[][] bArr = this.M;
        int length = bArr.length - 1;
        int[] iArr = this.N;
        o7.j(iArr[length], i, 1L);
        int D0 = qg5.D0(this, i);
        return bArr[D0][(i - (D0 == 0 ? 0 : iArr[D0 - 1])) + iArr[bArr.length + D0]];
    }

    @Override // defpackage.h00
    public final int j(int i, byte[] bArr) {
        bArr.getClass();
        return u().j(i, bArr);
    }

    @Override // defpackage.h00
    public final boolean l(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i >= 0 && i <= d() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int D0 = qg5.D0(this, i);
            while (i < i4) {
                int[] iArr = this.N;
                int i5 = D0 == 0 ? 0 : iArr[D0 - 1];
                int i6 = iArr[D0] - i5;
                byte[][] bArr2 = this.M;
                int i7 = iArr[bArr2.length + D0];
                int min = Math.min(i4, i6 + i5) - i;
                if (o7.f(bArr2[D0], (i - i5) + i7, i2, bArr, min)) {
                    i2 += min;
                    i += min;
                    D0++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.h00
    public final boolean m(int i, h00 h00Var, int i2) {
        h00Var.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int D0 = qg5.D0(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.N;
                int i5 = D0 == 0 ? 0 : iArr[D0 - 1];
                int i6 = iArr[D0] - i5;
                byte[][] bArr = this.M;
                int i7 = iArr[bArr.length + D0];
                int min = Math.min(i3, i6 + i5) - i;
                if (h00Var.l(i4, (i - i5) + i7, min, bArr[D0])) {
                    i4 += min;
                    i += min;
                    D0++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.h00
    public final String n(Charset charset) {
        charset.getClass();
        return u().n(charset);
    }

    @Override // defpackage.h00
    public final h00 o(int i, int i2) {
        if (i < 0) {
            s83.h(r7.z("beginIndex=", i, " < 0"));
            return null;
        }
        if (i2 > d()) {
            StringBuilder C = hf1.C("endIndex=", i2, " > length(");
            C.append(d());
            C.append(')');
            throw new IllegalArgumentException(C.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            s83.h(r7.x(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == d()) {
            return this;
        }
        if (i == i2) {
            return h00.L;
        }
        int D0 = qg5.D0(this, i);
        int D02 = qg5.D0(this, i2 - 1);
        byte[][] bArr = this.M;
        byte[][] bArr2 = (byte[][]) dq.W0(bArr, D0, D02 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.N;
        if (D0 <= D02) {
            int i4 = D0;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == D02) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = D0 != 0 ? iArr2[D0 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new qh4(bArr2, iArr);
    }

    @Override // defpackage.h00
    public final h00 q() {
        return u().q();
    }

    @Override // defpackage.h00
    public final byte[] r() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.M;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.N;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            dq.R0(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.h00
    public final void t(int i, cz czVar) {
        int D0 = qg5.D0(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.N;
            int i3 = D0 == 0 ? 0 : iArr[D0 - 1];
            int i4 = iArr[D0] - i3;
            byte[][] bArr = this.M;
            int i5 = iArr[bArr.length + D0];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            kh4 kh4Var = new kh4(bArr[D0], i6, i6 + min, true, false);
            kh4 kh4Var2 = czVar.I;
            if (kh4Var2 == null) {
                kh4Var.g = kh4Var;
                kh4Var.f = kh4Var;
                czVar.I = kh4Var;
            } else {
                kh4 kh4Var3 = kh4Var2.g;
                kh4Var3.getClass();
                kh4Var3.b(kh4Var);
            }
            i2 += min;
            D0++;
        }
        czVar.J += i;
    }

    @Override // defpackage.h00
    public final String toString() {
        return u().toString();
    }

    public final h00 u() {
        return new h00(r());
    }
}
