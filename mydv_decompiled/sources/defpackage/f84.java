package defpackage;

/* loaded from: classes2.dex */
public final class f84 implements xw0 {
    public static final int[] n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int m;
    public final byte[] a = new byte[4];
    public int b = 0;
    public final int[] l = new int[16];

    public f84() {
        ((hm0) jm0.c.get()).getClass();
        m();
    }

    public static int e(int i, int i2, int i3) {
        return (i & (i2 ^ i3)) ^ i3;
    }

    public static int f(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    public static int g(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    public static int h(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    public static int i(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    public static int j(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    @Override // defpackage.xw0
    public final int a(int i, byte[] bArr) {
        long j = this.c << 3;
        byte b = Byte.MIN_VALUE;
        while (true) {
            b(b);
            if (this.b == 0) {
                break;
            }
            b = 0;
        }
        if (this.m > 14) {
            k();
        }
        int[] iArr = this.l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
        k();
        dq2.a0(bArr, this.d, i);
        dq2.a0(bArr, this.e, i + 4);
        dq2.a0(bArr, this.f, i + 8);
        dq2.a0(bArr, this.g, i + 12);
        dq2.a0(bArr, this.h, i + 16);
        dq2.a0(bArr, this.i, i + 20);
        dq2.a0(bArr, this.j, i + 24);
        dq2.a0(bArr, this.k, i + 28);
        m();
        return 32;
    }

    @Override // defpackage.xw0
    public final void b(byte b) {
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte[] bArr = this.a;
        bArr[i] = b;
        if (i2 == bArr.length) {
            l(0, bArr);
            this.b = 0;
        }
        this.c++;
    }

    @Override // defpackage.xw0
    public final String c() {
        return "SHA-256";
    }

    @Override // defpackage.xw0
    public final int d() {
        return 32;
    }

    public final void k() {
        int i;
        int f;
        int i2;
        int f2;
        int i3;
        int f3;
        int i4;
        int f4;
        int[] iArr = this.l;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int i13 = iArr[8];
        int i14 = iArr[9];
        int i15 = iArr[10];
        int i16 = iArr[11];
        int i17 = iArr[12];
        int i18 = iArr[13];
        int i19 = iArr[14];
        int i20 = iArr[15];
        int i21 = this.d;
        int i22 = this.e;
        int i23 = this.f;
        int i24 = this.g;
        int i25 = this.h;
        int i26 = this.i;
        int i27 = i21;
        int i28 = i25;
        int i29 = i18;
        int i30 = i13;
        int i31 = i8;
        int i32 = i23;
        int i33 = i17;
        int i34 = i12;
        int i35 = i7;
        int i36 = i22;
        int i37 = i16;
        int i38 = i11;
        int i39 = i6;
        int i40 = this.j;
        int i41 = i20;
        int i42 = i15;
        int i43 = i10;
        int i44 = i5;
        int i45 = i26;
        int i46 = i19;
        int i47 = i14;
        int i48 = i9;
        int i49 = this.k;
        int i50 = 0;
        while (true) {
            int e = e(i28, i45, i40) + h(i28);
            int[] iArr2 = n;
            int i51 = e + iArr2[i50] + i44 + i49;
            int i52 = i40;
            int i53 = i24 + i51;
            int i54 = i32;
            int f5 = f(i27, i36, i32) + g(i27) + i51;
            int e2 = e(i53, i28, i45) + h(i53) + iArr2[i50 + 1] + i39 + i52;
            int i55 = i45;
            int i56 = i54 + e2;
            int i57 = i36;
            int f6 = f(f5, i27, i36) + g(f5) + e2;
            int e3 = e(i56, i53, i28) + h(i56) + iArr2[i50 + 2] + i35 + i55;
            int i58 = i28;
            int i59 = i57 + e3;
            int i60 = i27;
            int f7 = f(f6, f5, i27) + g(f6) + e3;
            int e4 = e(i59, i56, i53) + h(i59) + iArr2[i50 + 3] + i31 + i58;
            int i61 = i60 + e4;
            int f8 = f(f7, f6, f5) + g(f7) + e4;
            int e5 = e(i61, i59, i56) + h(i61) + iArr2[i50 + 4] + i48 + i53;
            int i62 = f5 + e5;
            int f9 = f(f8, f7, f6) + g(f8) + e5;
            int e6 = e(i62, i61, i59) + h(i62) + iArr2[i50 + 5] + i43 + i56;
            int i63 = f6 + e6;
            int f10 = f(f9, f8, f7) + g(f9) + e6;
            int e7 = e(i63, i62, i61) + h(i63) + iArr2[i50 + 6] + i38 + i59;
            int i64 = f7 + e7;
            int f11 = f(f10, f9, f8) + g(f10) + e7;
            int e8 = e(i64, i63, i62) + h(i64) + iArr2[i50 + 7] + i34 + i61;
            int i65 = f8 + e8;
            int f12 = f(f11, f10, f9) + g(f11) + e8;
            int e9 = e(i65, i64, i63) + h(i65) + iArr2[i50 + 8] + i30 + i62;
            int i66 = f9 + e9;
            int f13 = f(f12, f11, f10) + g(f12) + e9;
            int e10 = e(i66, i65, i64) + h(i66) + iArr2[i50 + 9] + i47 + i63;
            int i67 = f10 + e10;
            int f14 = f(f13, f12, f11) + g(f13) + e10;
            int e11 = e(i67, i66, i65) + h(i67) + iArr2[i50 + 10] + i42 + i64;
            int i68 = f11 + e11;
            int f15 = f(f14, f13, f12) + g(f14) + e11;
            int e12 = e(i68, i67, i66) + h(i68) + iArr2[i50 + 11] + i37 + i65;
            int i69 = f12 + e12;
            int f16 = f(f15, f14, f13) + g(f15) + e12;
            int e13 = e(i69, i68, i67) + h(i69) + iArr2[i50 + 12] + i33 + i66;
            i = f13 + e13;
            f = f(f16, f15, f14) + g(f16) + e13;
            int e14 = e(i, i69, i68) + h(i) + iArr2[i50 + 13] + i29 + i67;
            i2 = f14 + e14;
            f2 = f(f, f16, f15) + g(f) + e14;
            int e15 = e(i2, i, i69) + h(i2) + iArr2[i50 + 14] + i46 + i68;
            i3 = f15 + e15;
            f3 = f(f2, f, f16) + g(f2) + e15;
            int e16 = e(i3, i2, i) + h(i3) + iArr2[i50 + 15] + i41 + i69;
            i4 = f16 + e16;
            f4 = f(f3, f2, f) + g(f3) + e16;
            if (i50 == 48) {
                break;
            }
            i44 = i(i39) + j(i46) + i47 + i44;
            i39 = i(i35) + j(i41) + i42 + i39;
            i35 = i(i31) + j(i44) + i37 + i35;
            i31 = i(i48) + j(i39) + i33 + i31;
            i48 = i(i43) + j(i35) + i29 + i48;
            i43 = i(i38) + j(i31) + i46 + i43;
            i38 = i(i34) + j(i48) + i41 + i38;
            i34 = i(i30) + j(i43) + i44 + i34;
            i30 = i(i47) + j(i38) + i39 + i30;
            i47 = i(i42) + j(i34) + i35 + i47;
            i42 = i(i37) + j(i30) + i31 + i42;
            i37 = i(i33) + j(i47) + i48 + i37;
            i33 = i(i29) + j(i42) + i43 + i33;
            i29 = i(i46) + j(i37) + i38 + i29;
            i46 = i(i41) + j(i33) + i34 + i46;
            i41 = i(i44) + j(i29) + i30 + i41;
            i50 += 16;
            i28 = i4;
            i24 = f;
            i32 = f2;
            i36 = f3;
            i27 = f4;
            i49 = i;
            i40 = i2;
            i45 = i3;
        }
        this.d += f4;
        this.e += f3;
        this.f += f2;
        this.g += f;
        this.h += i4;
        this.i += i3;
        this.j += i2;
        this.k += i;
        this.m = 0;
        for (int i70 = 0; i70 < 16; i70++) {
            iArr[i70] = 0;
        }
    }

    public final void l(int i, byte[] bArr) {
        this.l[this.m] = dq2.k(i, bArr);
        int i2 = this.m + 1;
        this.m = i2;
        if (i2 == 16) {
            k();
        }
    }

    public final void m() {
        this.c = 0L;
        this.b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.d = 1779033703;
        this.e = -1150833019;
        this.f = 1013904242;
        this.g = -1521486534;
        this.h = 1359893119;
        this.i = -1694144372;
        this.j = 528734635;
        this.k = 1541459225;
        this.m = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.l;
            if (i2 == iArr.length) {
                return;
            }
            iArr[i2] = 0;
            i2++;
        }
    }

    @Override // defpackage.xw0
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        int i4 = this.b;
        byte[] bArr2 = this.a;
        if (i4 != 0) {
            int i5 = 0;
            while (true) {
                if (i5 >= max) {
                    i3 = i5;
                    break;
                }
                int i6 = this.b;
                int i7 = i6 + 1;
                this.b = i7;
                int i8 = i5 + 1;
                bArr2[i6] = bArr[i5 + i];
                if (i7 == 4) {
                    l(0, bArr2);
                    this.b = 0;
                    i3 = i8;
                    break;
                }
                i5 = i8;
            }
        }
        int i9 = max - 3;
        while (i3 < i9) {
            l(i + i3, bArr);
            i3 += 4;
        }
        while (i3 < max) {
            int i10 = this.b;
            this.b = i10 + 1;
            bArr2[i10] = bArr[i3 + i];
            i3++;
        }
        this.c += max;
    }
}
