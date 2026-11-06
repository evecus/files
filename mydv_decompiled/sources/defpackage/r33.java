package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r33 {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public r33(int i) {
        this.a = ia4.a;
        this.b = y22.a;
        if (i >= 0) {
            f(ia4.d(i));
        } else {
            dq2.H0("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(int i) {
        int i2 = this.d;
        this.b[d(i)] = i;
        return this.d != i2;
    }

    public final void b() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != ia4.a) {
            dq.Z0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.e = ia4.a(this.c) - this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0.c
            int r2 = r2 >>> 7
            r2 = r2 & r4
            r5 = 0
            r6 = r5
        L14:
            long[] r7 = r0.a
            int r8 = r2 >> 3
            r9 = r2 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L40:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L5b
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            int[] r15 = r0.b
            r15 = r15[r11]
            if (r15 != r1) goto L55
            goto L65
        L55:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L40
        L5b:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L69
            r11 = -1
        L65:
            if (r11 < 0) goto L68
            return r12
        L68:
            return r5
        L69:
            int r6 = r6 + 8
            int r2 = r2 + r6
            r2 = r2 & r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r33.c(int):boolean");
    }

    public final int d(int i) {
        long j;
        int i2;
        long j2;
        int i3;
        long[] jArr;
        long[] jArr2;
        int compare;
        int i4;
        int i5;
        int i6;
        int i7 = -862048943;
        int i8 = i * (-862048943);
        int i9 = i8 ^ (i8 << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.c;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            int i17 = 1;
            int i18 = i14;
            long j3 = (((-i16) >> 63) & (jArr3[i15 + 1] << (64 - i16))) | (jArr3[i15] >>> i16);
            long j4 = i11;
            int i19 = i7;
            int i20 = i11;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = -9187201950435737472L;
            long j7 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j7) >> 3)) & i12;
                long j8 = j6;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                j6 = j8;
            }
            long j9 = j6;
            char c = '\b';
            if ((((~j3) << 6) & j3 & j9) != 0) {
                int e = e(i10);
                long j10 = 255;
                if (this.e != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i2 = 1;
                    j2 = 128;
                } else {
                    int i21 = this.c;
                    if (i21 > 8) {
                        j2 = 128;
                        compare = Long.compare((this.d * 32) ^ Long.MIN_VALUE, (i21 * 25) ^ Long.MIN_VALUE);
                        if (compare <= 0) {
                            long[] jArr4 = this.a;
                            int i22 = this.c;
                            int[] iArr = this.b;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = 0;
                            while (i24 < i23) {
                                long j11 = j10;
                                long j12 = jArr4[i24] & j9;
                                int i25 = i24;
                                jArr4[i25] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i24 = i25 + 1;
                                j10 = j11;
                            }
                            j = j10;
                            int d1 = dq.d1(jArr4);
                            int i26 = d1 - 1;
                            jArr4[i26] = (jArr4[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[d1] = jArr4[0];
                            int i27 = 0;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j13 = (jArr4[i28] >> i29) & j;
                                if (j13 != 128 && j13 == 254) {
                                    int i30 = iArr[i27] * i19;
                                    int i31 = (i30 ^ (i30 << 16)) >>> 7;
                                    int e2 = e(i31);
                                    int i32 = i31 & i22;
                                    char c2 = c;
                                    if (((e2 - i32) & i22) / 8 == ((i27 - i32) & i22) / 8) {
                                        int i33 = i17;
                                        jArr4[i28] = ((r11 & 127) << i29) | (jArr4[i28] & (~(j << i29)));
                                        jArr4[jArr4.length - i33] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i27++;
                                        i17 = i33;
                                        c = c2;
                                        i19 = i19;
                                    } else {
                                        int i34 = i19;
                                        int i35 = i17;
                                        int i36 = e2 >> 3;
                                        long j14 = jArr4[i36];
                                        int i37 = (e2 & 7) << 3;
                                        if (((j14 >> i37) & j) == 128) {
                                            i5 = i35;
                                            i6 = i10;
                                            i4 = i22;
                                            jArr4[i36] = ((~(j << i37)) & j14) | ((r11 & 127) << i37);
                                            jArr4[i28] = (jArr4[i28] & (~(j << i29))) | (128 << i29);
                                            iArr[e2] = iArr[i27];
                                            iArr[i27] = 0;
                                        } else {
                                            i4 = i22;
                                            i5 = i35;
                                            i6 = i10;
                                            jArr4[i36] = ((r11 & 127) << i37) | ((~(j << i37)) & j14);
                                            int i38 = iArr[e2];
                                            iArr[e2] = iArr[i27];
                                            iArr[i27] = i38;
                                            i27--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i27++;
                                        c = c2;
                                        i19 = i34;
                                        i10 = i6;
                                        i17 = i5;
                                        i22 = i4;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            i3 = i10;
                            i2 = i17;
                            this.e = ia4.a(this.c) - this.d;
                            e = e(i3);
                        }
                    } else {
                        j2 = 128;
                    }
                    i3 = i10;
                    j = 255;
                    i2 = 1;
                    int b = ia4.b(this.c);
                    long[] jArr5 = this.a;
                    int[] iArr2 = this.b;
                    int i39 = this.c;
                    f(b);
                    long[] jArr6 = this.a;
                    int[] iArr3 = this.b;
                    int i40 = this.c;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr5[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < j2) {
                            int i42 = iArr2[i41];
                            int i43 = i42 * i19;
                            int i44 = i43 ^ (i43 << 16);
                            int e3 = e(i44 >>> 7);
                            long j15 = i44 & 127;
                            int i45 = e3 >> 3;
                            int i46 = (e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j16 = (jArr6[i45] & (~(255 << i46))) | (j15 << i46);
                            jArr[i45] = j16;
                            jArr[(((e3 - 7) & i40) + (i40 & 7)) >> 3] = j16;
                            iArr3[e3] = i42;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i41++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i3);
                }
                this.d++;
                int i47 = this.e;
                long[] jArr7 = this.a;
                int i48 = e >> 3;
                long j17 = jArr7[i48];
                int i49 = (e & 7) << 3;
                if (((j17 >> i49) & j) != j2) {
                    i2 = 0;
                }
                this.e = i47 - i2;
                int i50 = this.c;
                long j18 = (j17 & (~(j << i49))) | (j4 << i49);
                jArr7[i48] = j18;
                jArr7[(((e - 7) & i50) + (i50 & 7)) >> 3] = j18;
                return e;
            }
            i14 = i18 + 8;
            i13 = (i13 + i14) & i12;
            i11 = i20;
            i7 = i19;
        }
    }

    public final int e(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r33)) {
            return false;
        }
        r33 r33Var = (r33) obj;
        if (r33Var.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !r33Var.c(iArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, ia4.c(i)) : 0;
        this.c = max;
        if (max == 0) {
            jArr = ia4.a;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.e = ia4.a(this.c) - this.d;
        this.b = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0.c
            int r2 = r2 >>> 7
            r2 = r2 & r4
            r5 = 0
            r6 = r5
        L14:
            long[] r7 = r0.a
            int r8 = r2 >> 3
            r9 = r2 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L40:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L5b
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            int[] r15 = r0.b
            r15 = r15[r11]
            if (r15 != r1) goto L55
            goto L65
        L55:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L40
        L5b:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L6e
            r11 = -1
        L65:
            if (r11 < 0) goto L68
            r5 = r12
        L68:
            if (r5 == 0) goto L6d
            r0.h(r11)
        L6d:
            return r5
        L6e:
            int r6 = r6 + 8
            int r2 = r2 + r6
            r2 = r2 & r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r33.g(int):boolean");
    }

    public final void h(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        i2 += iArr[(i << 3) + i4];
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i5);
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return sb.toString();
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ r33() {
        this(6);
    }
}
