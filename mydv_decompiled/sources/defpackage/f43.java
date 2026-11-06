package defpackage;

import androidx.media3.common.util.Log;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f43 {
    public long[] a = ia4.a;
    public Object[] b = o7.g;
    public long[] c = i42.n;
    public int d = Log.LOG_LEVEL_OFF;
    public int e = Log.LOG_LEVEL_OFF;
    public int f;
    public int g;
    public int h;

    public f43(int i) {
        if (i >= 0) {
            f(ia4.d(i));
        } else {
            dq2.H0("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.g;
        int d = d(obj);
        this.b[d] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[d] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((2147483647L & d) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = d;
        if (this.e == Integer.MAX_VALUE) {
            this.e = d;
        }
        return this.g != i;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.a;
        if (jArr != ia4.a) {
            dq.Z0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        dq.X0(0, this.f, null, this.b);
        dq.Z0(this.c, 4611686018427387903L);
        this.d = Log.LOG_LEVEL_OFF;
        this.e = Log.LOG_LEVEL_OFF;
        this.h = ia4.a(this.f) - this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
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
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.j42.c(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f43.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        int compare;
        long j4;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j6 = i5;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                int i11 = i2;
                if (j42.c(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int e = e(i4);
                long j9 = 255;
                if (this.h != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.f;
                    if (i13 > 8) {
                        c = 31;
                        j3 = 128;
                        compare = Long.compare((this.g * 32) ^ Long.MIN_VALUE, (i13 * 25) ^ Long.MIN_VALUE);
                        if (compare <= 0) {
                            long[] jArr4 = this.a;
                            if (jArr4 == null) {
                                i = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i14 = this.f;
                                Object[] objArr = this.b;
                                long[] jArr5 = this.c;
                                long[] jArr6 = new long[i14];
                                Arrays.fill(jArr6, 0, i14, 9223372034707292159L);
                                i = 0;
                                int i15 = (i14 + 7) >> 3;
                                int i16 = 0;
                                while (i16 < i15) {
                                    long j10 = j9;
                                    long j11 = jArr4[i16] & (-9187201950435737472L);
                                    int i17 = i16;
                                    jArr4[i17] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                    i16 = i17 + 1;
                                    j9 = j10;
                                }
                                j2 = j9;
                                int length = jArr4.length;
                                int i18 = length - 1;
                                int i19 = length - 2;
                                jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i18] = jArr4[0];
                                int i20 = 0;
                                while (i20 != i14) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j12 = (jArr4[i21] >> i22) & j2;
                                    if (j12 != 128 && j12 == 254) {
                                        Object obj2 = objArr[i20];
                                        int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                        int i23 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                        int e2 = e(i23);
                                        int i24 = i23 & i14;
                                        if (((e2 - i24) & i14) / 8 == ((i20 - i24) & i14) / 8) {
                                            int i25 = i14;
                                            Object[] objArr2 = objArr;
                                            jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | ((r17 & 127) << i22);
                                            if (jArr6[i20] == 9223372034707292159L) {
                                                long j13 = i20;
                                                jArr6[i20] = j13 | (j13 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i25;
                                            objArr = objArr2;
                                        } else {
                                            int i26 = i14;
                                            Object[] objArr3 = objArr;
                                            int i27 = e2 >> 3;
                                            long j14 = jArr4[i27];
                                            int i28 = (e2 & 7) << 3;
                                            if (((j14 >> i28) & j2) == 128) {
                                                jArr4[i27] = (j14 & (~(j2 << i28))) | ((r17 & 127) << i28);
                                                jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (128 << i22);
                                                objArr3[e2] = objArr3[i20];
                                                objArr3[i20] = null;
                                                jArr5[e2] = jArr5[i20];
                                                jArr5[i20] = 4611686018427387903L;
                                                int i29 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i29 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i29] = e2 | (jArr6[i29] & (-4294967296L));
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i20] = 9223372032559808512L | e2;
                                                }
                                                jArr6[e2] = (i20 << 32) | 2147483647L;
                                            } else {
                                                j4 = j6;
                                                jArr4[i27] = ((r17 & 127) << i28) | (j14 & (~(j2 << i28)));
                                                Object obj3 = objArr3[e2];
                                                objArr3[e2] = objArr3[i20];
                                                objArr3[i20] = obj3;
                                                long j15 = jArr5[e2];
                                                jArr5[e2] = jArr5[i20];
                                                jArr5[i20] = j15;
                                                int i30 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i30 != Integer.MAX_VALUE) {
                                                    long j16 = e2;
                                                    jArr6[i30] = (jArr6[i30] & (-4294967296L)) | j16;
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = e2;
                                                    jArr6[i20] = j17 | (j17 << 32);
                                                    i30 = i20;
                                                }
                                                jArr6[e2] = (i30 << 32) | i20;
                                                i20--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i26;
                                            objArr = objArr3;
                                            j6 = j4;
                                        }
                                    } else {
                                        i20++;
                                    }
                                }
                                j = j6;
                                this.h = ia4.a(this.f) - this.g;
                                long[] jArr7 = this.c;
                                int length2 = jArr7.length;
                                for (int i31 = 0; i31 < length2; i31++) {
                                    long j18 = jArr7[i31];
                                    jArr7[i31] = (((j18 & (-4611686018427387904L)) | (((int) ((j18 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j18 & 2147483647L)) == Integer.MAX_VALUE ? Log.LOG_LEVEL_OFF : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i32 = this.d;
                                if (i32 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr6[i32] & 4294967295L);
                                }
                                int i33 = this.e;
                                if (i33 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr6[i33] & 4294967295L);
                                }
                            }
                            e = e(i4);
                        }
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j6;
                    j2 = 255;
                    int b = ia4.b(this.f);
                    long[] jArr8 = this.a;
                    Object[] objArr4 = this.b;
                    long[] jArr9 = this.c;
                    int i34 = this.f;
                    int[] iArr = new int[i34];
                    f(b);
                    long[] jArr10 = this.a;
                    Object[] objArr5 = this.b;
                    long[] jArr11 = this.c;
                    int i35 = this.f;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr8[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i36];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i37 = hashCode3 ^ (hashCode3 << 16);
                            int e3 = e(i37 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j19 = i37 & 127;
                            int i38 = e3 >> 3;
                            int i39 = (e3 & 7) << 3;
                            long j20 = (jArr[i38] & (~(255 << i39))) | (j19 << i39);
                            jArr[i38] = j20;
                            jArr[(((e3 - 7) & i35) + (i35 & 7)) >> 3] = j20;
                            objArr5[e3] = obj4;
                            jArr11[e3] = jArr9[i36];
                            iArr[i36] = e3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i36++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.c;
                    int length3 = jArr12.length;
                    for (int i40 = 0; i40 < length3; i40++) {
                        long j21 = jArr12[i40];
                        jArr12[i40] = (((j21 & (-4611686018427387904L)) | (((int) ((j21 >> c) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c) | (((int) (j21 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i41 = this.d;
                    if (i41 != Integer.MAX_VALUE) {
                        this.d = iArr[i41];
                    }
                    int i42 = this.e;
                    if (i42 != Integer.MAX_VALUE) {
                        this.e = iArr[i42];
                    }
                    e = e(i4);
                }
                this.g++;
                int i43 = this.h;
                long[] jArr13 = this.a;
                int i44 = e >> 3;
                long j22 = jArr13[i44];
                int i45 = (e & 7) << 3;
                if (((j22 >> i45) & j2) == j3) {
                    i = 1;
                }
                this.h = i43 - i;
                int i46 = this.f;
                long j23 = (j22 & (~(j2 << i45))) | (j << i45);
                jArr13[i44] = j23;
                jArr13[(((e - 7) & i46) + (i46 & 7)) >> 3] = j23;
                return e;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
        }
    }

    public final int e(int i) {
        int i2 = this.f;
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
        if (!(obj instanceof f43)) {
            return false;
        }
        f43 f43Var = (f43) obj;
        if (f43Var.g != this.g) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !f43Var.c(objArr[(i << 3) + i3])) {
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
        long[] jArr2;
        int max = i > 0 ? Math.max(7, ia4.c(i)) : 0;
        this.f = max;
        if (max == 0) {
            jArr = ia4.a;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.a = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.h = ia4.a(this.f) - this.g;
        this.b = max == 0 ? o7.g : new Object[max];
        if (max == 0) {
            jArr2 = i42.n;
        } else {
            long[] jArr4 = new long[max];
            Arrays.fill(jArr4, 0, max, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
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
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.j42.c(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f43.g(java.lang.Object):boolean");
    }

    public final void h(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = this.f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (i6 & 2147483647L);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((i5 & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i = (this.f * 31) + this.g;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            if (!j42.c(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return i;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final boolean i(Collection collection) {
        collection.getClass();
        Object[] objArr = this.b;
        int i = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!o70.O0(collection, objArr[i5])) {
                                h(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this.g;
    }

    public final String toString() {
        am0 am0Var = new am0(this, (byte) 4);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) am0Var.invoke(obj));
            i2++;
            i = i3;
        }
        return sb.toString();
    }
}
