package defpackage;

import androidx.media3.common.util.Log;
import java.io.FileInputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d70 {
    public final /* synthetic */ byte a;
    public int b;
    public final FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public Object k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d70(java.io.FileInputStream r4, byte r5) {
        /*
            r3 = this;
            r3.a = r5
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 4096(0x1000, float:5.74E-42)
            r2 = 0
            switch(r5) {
                case 1: goto L1f;
                default: goto Lb;
            }
        Lb:
            r3.<init>(r2)
            r3.j = r0
            java.nio.charset.Charset r5 = defpackage.p32.a
            r3.c = r4
            byte[] r4 = new byte[r1]
            r3.d = r4
            r3.e = r2
            r3.g = r2
            r3.i = r2
            return
        L1f:
            r5 = 1
            r3.<init>(r5)
            r3.j = r0
            java.nio.charset.Charset r5 = defpackage.r32.a
            r3.c = r4
            byte[] r4 = new byte[r1]
            r3.d = r4
            r3.e = r2
            r3.g = r2
            r3.i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d70.<init>(java.io.FileInputStream, byte):void");
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public final long A() {
        switch (this.a) {
            case 0:
                return c(v());
            default:
                long v = v();
                return (-(v & 1)) ^ (v >>> 1);
        }
    }

    public final String B() {
        byte b = this.a;
        byte[] bArr = this.d;
        switch (b) {
            case 0:
                int u = u();
                if (u > 0) {
                    int i = this.e;
                    int i2 = this.g;
                    if (u <= i - i2) {
                        String str = new String(bArr, i2, u, p32.a);
                        this.g += u;
                        return str;
                    }
                }
                if (u == 0) {
                    return "";
                }
                if (u < 0) {
                    throw x42.d();
                }
                if (u > this.e) {
                    return new String(p(u), p32.a);
                }
                H(u);
                String str2 = new String(bArr, this.g, u, p32.a);
                this.g += u;
                return str2;
            default:
                int u2 = u();
                if (u2 > 0) {
                    int i3 = this.e;
                    int i4 = this.g;
                    if (u2 <= i3 - i4) {
                        String str3 = new String(bArr, i4, u2, r32.a);
                        this.g += u2;
                        return str3;
                    }
                }
                if (u2 == 0) {
                    return "";
                }
                if (u2 > this.e) {
                    return new String(p(u2), r32.a);
                }
                H(u2);
                String str4 = new String(bArr, this.g, u2, r32.a);
                this.g += u2;
                return str4;
        }
    }

    public final String C() {
        byte b = this.a;
        int i = 0;
        byte[] bArr = this.d;
        switch (b) {
            case 0:
                int u = u();
                int i2 = this.g;
                int i3 = this.e;
                if (u <= i3 - i2 && u > 0) {
                    this.g = i2 + u;
                    i = i2;
                } else {
                    if (u == 0) {
                        return "";
                    }
                    if (u < 0) {
                        throw x42.d();
                    }
                    if (u <= i3) {
                        H(u);
                        this.g = u;
                    } else {
                        bArr = p(u);
                    }
                }
                return lg5.a.u(bArr, i, u);
            default:
                int u2 = u();
                int i4 = this.g;
                int i5 = this.e;
                if (u2 <= i5 - i4 && u2 > 0) {
                    this.g = i4 + u2;
                    i = i4;
                } else {
                    if (u2 == 0) {
                        return "";
                    }
                    if (u2 <= i5) {
                        H(u2);
                        this.g = u2;
                    } else {
                        bArr = p(u2);
                    }
                }
                return ng5.a.j(bArr, i, u2);
        }
    }

    public final int D() {
        int i = 0;
        switch (this.a) {
            case 0:
                if (e()) {
                    this.h = 0;
                } else {
                    i = u();
                    this.h = i;
                    if ((i >>> 3) == 0) {
                        throw x42.a();
                    }
                }
                return i;
            default:
                if (e()) {
                    this.h = 0;
                } else {
                    i = u();
                    this.h = i;
                    if ((i >>> 3) == 0) {
                        throw new z42("Protocol message contained an invalid tag (zero).");
                    }
                }
                return i;
        }
    }

    public final int E() {
        switch (this.a) {
        }
        return u();
    }

    public final long F() {
        switch (this.a) {
        }
        return v();
    }

    public final void G() {
        switch (this.a) {
            case 0:
                int i = this.e + this.f;
                this.e = i;
                int i2 = this.i + i;
                int i3 = this.j;
                if (i2 <= i3) {
                    this.f = 0;
                    break;
                } else {
                    int i4 = i2 - i3;
                    this.f = i4;
                    this.e = i - i4;
                    break;
                }
            default:
                int i5 = this.e + this.f;
                this.e = i5;
                int i6 = this.i + i5;
                int i7 = this.j;
                if (i6 <= i7) {
                    this.f = 0;
                    break;
                } else {
                    int i8 = i6 - i7;
                    this.f = i8;
                    this.e = i5 - i8;
                    break;
                }
        }
    }

    public final void H(int i) {
        switch (this.a) {
            case 0:
                if (K(i)) {
                    return;
                }
                if (i <= (Log.LOG_LEVEL_OFF - this.i) - this.g) {
                    throw x42.f();
                }
                throw new x42("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            default:
                if (K(i)) {
                    return;
                }
                if (i <= (Log.LOG_LEVEL_OFF - this.i) - this.g) {
                    throw z42.f();
                }
                throw new z42("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
    }

    public boolean I(int i) {
        int D;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.e - this.g;
            byte[] bArr = this.d;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.g;
                    this.g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw z42.c();
            }
            while (i3 < 10) {
                if (this.g == this.e) {
                    H(1);
                }
                int i6 = this.g;
                this.g = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw z42.c();
            return true;
        }
        if (i2 == 1) {
            J(8);
            return true;
        }
        if (i2 == 2) {
            J(u());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw z42.b();
            }
            J(4);
            return true;
        }
        do {
            D = D();
            if (D == 0) {
                break;
            }
        } while (I(D));
        a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(int r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d70.J(int):void");
    }

    public final boolean K(int i) {
        byte b = this.a;
        byte[] bArr = this.d;
        FileInputStream fileInputStream = this.c;
        switch (b) {
            case 0:
                int i2 = this.g;
                int i3 = i2 + i;
                int i4 = this.e;
                if (i3 > i4) {
                    int i5 = this.i;
                    if (i <= (Log.LOG_LEVEL_OFF - i5) - i2 && i5 + i2 + i <= this.j) {
                        if (i2 > 0) {
                            if (i4 > i2) {
                                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                            }
                            i5 = this.i + i2;
                            this.i = i5;
                            i4 = this.e - i2;
                            this.e = i4;
                            this.g = 0;
                        }
                        try {
                            int read = fileInputStream.read(bArr, i4, Math.min(bArr.length - i4, (Log.LOG_LEVEL_OFF - i5) - i4));
                            if (read == 0 || read < -1 || read > bArr.length) {
                                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                            }
                            if (read > 0) {
                                this.e += read;
                                G();
                                if (this.e >= i) {
                                    return true;
                                }
                                return K(i);
                            }
                        } catch (x42 e) {
                            e.I = true;
                            throw e;
                        }
                    }
                } else {
                    zy.i(r7.z("refillBuffer() called when ", i, " bytes were already available in buffer"));
                }
                return false;
            default:
                int i6 = this.g;
                int i7 = i6 + i;
                int i8 = this.e;
                if (i7 > i8) {
                    int i9 = this.i;
                    if (i <= (Log.LOG_LEVEL_OFF - i9) - i6 && i9 + i6 + i <= this.j) {
                        if (i6 > 0) {
                            if (i8 > i6) {
                                System.arraycopy(bArr, i6, bArr, 0, i8 - i6);
                            }
                            i9 = this.i + i6;
                            this.i = i9;
                            i8 = this.e - i6;
                            this.e = i8;
                            this.g = 0;
                        }
                        int read2 = fileInputStream.read(bArr, i8, Math.min(bArr.length - i8, (Log.LOG_LEVEL_OFF - i9) - i8));
                        if (read2 == 0 || read2 < -1 || read2 > bArr.length) {
                            throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read2 + "\nThe InputStream implementation is buggy.");
                        }
                        if (read2 > 0) {
                            this.e += read2;
                            G();
                            if (this.e >= i) {
                                return true;
                            }
                            return K(i);
                        }
                    }
                } else {
                    zy.i(r7.z("refillBuffer() called when ", i, " bytes were already available in buffer"));
                }
                return false;
        }
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                if (this.h != i) {
                    throw new x42("Protocol message end-group tag did not match expected tag.");
                }
                return;
            default:
                if (this.h != i) {
                    throw new z42("Protocol message end-group tag did not match expected tag.");
                }
                return;
        }
    }

    public final int d() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                i = this.i;
                i2 = this.g;
                break;
            default:
                i = this.i;
                i2 = this.g;
                break;
        }
        return i + i2;
    }

    public final boolean e() {
        switch (this.a) {
            case 0:
                if (this.g != this.e || K(1)) {
                }
                break;
            default:
                if (this.g != this.e || K(1)) {
                }
                break;
        }
        return true;
    }

    public final void f(int i) {
        switch (this.a) {
            case 0:
                this.j = i;
                G();
                break;
            default:
                this.j = i;
                G();
                break;
        }
    }

    public final int g(int i) {
        switch (this.a) {
            case 0:
                if (i < 0) {
                    throw x42.d();
                }
                int i2 = this.i + this.g + i;
                if (i2 < 0) {
                    throw x42.e();
                }
                int i3 = this.j;
                if (i2 > i3) {
                    throw x42.f();
                }
                this.j = i2;
                G();
                return i3;
            default:
                if (i < 0) {
                    throw z42.d();
                }
                int i4 = this.i + this.g + i;
                int i5 = this.j;
                if (i4 > i5) {
                    throw z42.f();
                }
                this.j = i4;
                G();
                return i5;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                if (v() != 0) {
                }
                break;
            default:
                if (v() != 0) {
                }
                break;
        }
        return false;
    }

    public final double i() {
        switch (this.a) {
        }
        return Double.longBitsToDouble(t());
    }

    public final int j() {
        switch (this.a) {
        }
        return u();
    }

    public final int k() {
        switch (this.a) {
        }
        return s();
    }

    public final long l() {
        switch (this.a) {
        }
        return t();
    }

    public final float m() {
        switch (this.a) {
        }
        return Float.intBitsToFloat(s());
    }

    public final int n() {
        switch (this.a) {
        }
        return u();
    }

    public final long o() {
        switch (this.a) {
        }
        return v();
    }

    public final byte[] p(int i) {
        byte b = this.a;
        byte[] bArr = this.d;
        switch (b) {
            case 0:
                byte[] q = q(i);
                if (q != null) {
                    return q;
                }
                int i2 = this.g;
                int i3 = this.e;
                int i4 = i3 - i2;
                this.i += i3;
                this.g = 0;
                this.e = 0;
                ArrayList r = r(i - i4);
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, i2, bArr2, 0, i4);
                int size = r.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = r.get(i5);
                    i5++;
                    byte[] bArr3 = (byte[]) obj;
                    System.arraycopy(bArr3, 0, bArr2, i4, bArr3.length);
                    i4 += bArr3.length;
                }
                return bArr2;
            default:
                byte[] q2 = q(i);
                if (q2 != null) {
                    return q2;
                }
                int i6 = this.g;
                int i7 = this.e;
                int i8 = i7 - i6;
                this.i += i7;
                this.g = 0;
                this.e = 0;
                ArrayList r2 = r(i - i8);
                byte[] bArr4 = new byte[i];
                System.arraycopy(bArr, i6, bArr4, 0, i8);
                int size2 = r2.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj2 = r2.get(i9);
                    i9++;
                    byte[] bArr5 = (byte[]) obj2;
                    System.arraycopy(bArr5, 0, bArr4, i8, bArr5.length);
                    i8 += bArr5.length;
                }
                return bArr4;
        }
    }

    public final byte[] q(int i) {
        byte b = this.a;
        byte[] bArr = this.d;
        FileInputStream fileInputStream = this.c;
        switch (b) {
            case 0:
                if (i == 0) {
                    return p32.b;
                }
                if (i < 0) {
                    throw x42.d();
                }
                int i2 = this.i;
                int i3 = this.g;
                int i4 = i2 + i3 + i;
                if (i4 - Log.LOG_LEVEL_OFF > 0) {
                    throw new x42("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                int i5 = this.j;
                if (i4 > i5) {
                    J((i5 - i2) - i3);
                    throw x42.f();
                }
                int i6 = this.e - i3;
                int i7 = i - i6;
                if (i7 >= 4096) {
                    try {
                        if (i7 > fileInputStream.available()) {
                            return null;
                        }
                    } catch (x42 e) {
                        e.I = true;
                        throw e;
                    }
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, this.g, bArr2, 0, i6);
                this.i += this.e;
                this.g = 0;
                this.e = 0;
                while (i6 < i) {
                    try {
                        int read = fileInputStream.read(bArr2, i6, i - i6);
                        if (read == -1) {
                            throw x42.f();
                        }
                        this.i += read;
                        i6 += read;
                    } catch (x42 e2) {
                        e2.I = true;
                        throw e2;
                    }
                }
                return bArr2;
            default:
                if (i == 0) {
                    return r32.b;
                }
                if (i < 0) {
                    throw z42.d();
                }
                int i8 = this.i;
                int i9 = this.g;
                int i10 = i8 + i9 + i;
                if (i10 - Log.LOG_LEVEL_OFF > 0) {
                    throw new z42("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                int i11 = this.j;
                if (i10 > i11) {
                    J((i11 - i8) - i9);
                    throw z42.f();
                }
                int i12 = this.e - i9;
                int i13 = i - i12;
                if (i13 >= 4096 && i13 > fileInputStream.available()) {
                    return null;
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(bArr, this.g, bArr3, 0, i12);
                this.i += this.e;
                this.g = 0;
                this.e = 0;
                while (i12 < i) {
                    int read2 = fileInputStream.read(bArr3, i12, i - i12);
                    if (read2 == -1) {
                        throw z42.f();
                    }
                    this.i += read2;
                    i12 += read2;
                }
                return bArr3;
        }
    }

    public final ArrayList r(int i) {
        byte b = this.a;
        FileInputStream fileInputStream = this.c;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                while (i > 0) {
                    int min = Math.min(i, 4096);
                    byte[] bArr = new byte[min];
                    int i2 = 0;
                    while (i2 < min) {
                        int read = fileInputStream.read(bArr, i2, min - i2);
                        if (read == -1) {
                            throw x42.f();
                        }
                        this.i += read;
                        i2 += read;
                    }
                    i -= min;
                    arrayList.add(bArr);
                }
                return arrayList;
            default:
                ArrayList arrayList2 = new ArrayList();
                while (i > 0) {
                    int min2 = Math.min(i, 4096);
                    byte[] bArr2 = new byte[min2];
                    int i3 = 0;
                    while (i3 < min2) {
                        int read2 = fileInputStream.read(bArr2, i3, min2 - i3);
                        if (read2 == -1) {
                            throw z42.f();
                        }
                        this.i += read2;
                        i3 += read2;
                    }
                    i -= min2;
                    arrayList2.add(bArr2);
                }
                return arrayList2;
        }
    }

    public final int s() {
        int i;
        byte b;
        byte b2 = this.a;
        byte[] bArr = this.d;
        switch (b2) {
            case 0:
                int i2 = this.g;
                if (this.e - i2 < 4) {
                    H(4);
                    i2 = this.g;
                }
                this.g = i2 + 4;
                i = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
                b = bArr[i2 + 3];
                break;
            default:
                int i3 = this.g;
                if (this.e - i3 < 4) {
                    H(4);
                    i3 = this.g;
                }
                this.g = i3 + 4;
                i = (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
                b = bArr[i3 + 3];
                break;
        }
        return i | ((b & 255) << 24);
    }

    public final long t() {
        long j;
        byte b;
        byte b2 = this.a;
        byte[] bArr = this.d;
        switch (b2) {
            case 0:
                int i = this.g;
                if (this.e - i < 8) {
                    H(8);
                    i = this.g;
                }
                this.g = i + 8;
                j = ((bArr[i + 5] & 255) << 40) | ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 6] & 255) << 48);
                b = bArr[i + 7];
                break;
            default:
                int i2 = this.g;
                if (this.e - i2 < 8) {
                    H(8);
                    i2 = this.g;
                }
                this.g = i2 + 8;
                j = ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 6] & 255) << 48);
                b = bArr[i2 + 7];
                break;
        }
        return ((b & 255) << 56) | j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        if (r3[r2] < 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e8, code lost:
    
        if (r3[r2] < 0) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int u() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d70.u():int");
    }

    public final long v() {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        byte b = this.a;
        byte[] bArr = this.d;
        switch (b) {
            case 0:
                int i2 = this.g;
                int i3 = this.e;
                if (i3 != i2) {
                    int i4 = i2 + 1;
                    byte b2 = bArr[i2];
                    if (b2 >= 0) {
                        this.g = i4;
                        return b2;
                    }
                    if (i3 - i4 >= 9) {
                        int i5 = i2 + 2;
                        int i6 = (bArr[i4] << 7) ^ b2;
                        if (i6 < 0) {
                            long j6 = i6 ^ (-128);
                            i = i5;
                            j2 = j6;
                        } else {
                            int i7 = i2 + 3;
                            int i8 = (bArr[i5] << 14) ^ i6;
                            if (i8 >= 0) {
                                j2 = i8 ^ 16256;
                                i = i7;
                            } else {
                                i = i2 + 4;
                                int i9 = i8 ^ (bArr[i7] << 21);
                                if (i9 < 0) {
                                    j2 = i9 ^ (-2080896);
                                } else {
                                    long j7 = i9;
                                    int i10 = i2 + 5;
                                    long j8 = j7 ^ (bArr[i] << 28);
                                    if (j8 >= 0) {
                                        j = j8 ^ 266354560;
                                    } else {
                                        i = i2 + 6;
                                        long j9 = j8 ^ (bArr[i10] << 35);
                                        if (j9 < 0) {
                                            j2 = j9 ^ (-34093383808L);
                                        } else {
                                            i10 = i2 + 7;
                                            long j10 = j9 ^ (bArr[i] << 42);
                                            if (j10 >= 0) {
                                                j = j10 ^ 4363953127296L;
                                            } else {
                                                i = i2 + 8;
                                                long j11 = j10 ^ (bArr[i10] << 49);
                                                if (j11 < 0) {
                                                    j2 = (-558586000294016L) ^ j11;
                                                } else {
                                                    i10 = i2 + 9;
                                                    j = (j11 ^ (bArr[i] << 56)) ^ 71499008037633920L;
                                                    if (j < 0) {
                                                        int i11 = i2 + 10;
                                                        if (bArr[i10] >= 0) {
                                                            i = i11;
                                                            j2 = j;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i10;
                                    j2 = j;
                                }
                            }
                        }
                        this.g = i;
                        return j2;
                    }
                }
                return w();
            default:
                int i12 = this.g;
                int i13 = this.e;
                if (i13 != i12) {
                    int i14 = i12 + 1;
                    byte b3 = bArr[i12];
                    if (b3 >= 0) {
                        this.g = i14;
                        return b3;
                    }
                    if (i13 - i14 >= 9) {
                        int i15 = i12 + 2;
                        int i16 = (bArr[i14] << 7) ^ b3;
                        if (i16 < 0) {
                            j3 = i16 ^ (-128);
                        } else {
                            int i17 = i12 + 3;
                            int i18 = (bArr[i15] << 14) ^ i16;
                            if (i18 >= 0) {
                                j5 = i18 ^ 16256;
                                i15 = i17;
                            } else {
                                int i19 = i12 + 4;
                                int i20 = i18 ^ (bArr[i17] << 21);
                                if (i20 < 0) {
                                    j5 = i20 ^ (-2080896);
                                    i15 = i19;
                                } else {
                                    long j12 = i20;
                                    i15 = i12 + 5;
                                    long j13 = (bArr[i19] << 28) ^ j12;
                                    if (j13 >= 0) {
                                        j3 = j13 ^ 266354560;
                                    } else {
                                        int i21 = i12 + 6;
                                        long j14 = j13 ^ (bArr[i15] << 35);
                                        if (j14 < 0) {
                                            j4 = j14 ^ (-34093383808L);
                                        } else {
                                            i15 = i12 + 7;
                                            long j15 = j14 ^ (bArr[i21] << 42);
                                            if (j15 >= 0) {
                                                j3 = j15 ^ 4363953127296L;
                                            } else {
                                                i21 = i12 + 8;
                                                long j16 = j15 ^ (bArr[i15] << 49);
                                                if (j16 < 0) {
                                                    j4 = (-558586000294016L) ^ j16;
                                                } else {
                                                    i15 = i12 + 9;
                                                    j3 = (j16 ^ (bArr[i21] << 56)) ^ 71499008037633920L;
                                                    if (j3 < 0) {
                                                        int i22 = i12 + 10;
                                                        if (bArr[i15] >= 0) {
                                                            i15 = i22;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        j3 = j4;
                                        i15 = i21;
                                    }
                                }
                            }
                            j3 = j5;
                        }
                        this.g = i15;
                        return j3;
                    }
                }
                return w();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final long w() {
        byte b = this.a;
        byte[] bArr = this.d;
        int i = 0;
        long j = 0;
        switch (b) {
            case 0:
                while (i < 64) {
                    if (this.g == this.e) {
                        H(1);
                    }
                    int i2 = this.g;
                    this.g = i2 + 1;
                    j |= (r0 & Byte.MAX_VALUE) << i;
                    if ((bArr[i2] & 128) == 0) {
                        return j;
                    }
                    i += 7;
                }
                throw new x42("CodedInputStream encountered a malformed varint.");
            default:
                while (i < 64) {
                    if (this.g == this.e) {
                        H(1);
                    }
                    int i3 = this.g;
                    this.g = i3 + 1;
                    j |= (r0 & Byte.MAX_VALUE) << i;
                    if ((bArr[i3] & 128) == 0) {
                        return j;
                    }
                    i += 7;
                }
                throw z42.c();
        }
    }

    public final int x() {
        switch (this.a) {
        }
        return s();
    }

    public final long y() {
        switch (this.a) {
        }
        return t();
    }

    public final int z() {
        switch (this.a) {
            case 0:
                return b(u());
            default:
                int u = u();
                return (-(u & 1)) ^ (u >>> 1);
        }
    }

    public /* synthetic */ d70(byte b) {
        this.a = b;
    }
}
