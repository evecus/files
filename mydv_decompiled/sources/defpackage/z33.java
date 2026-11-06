package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class z33 {
    public long[] a = ia4.a;
    public Object[] b = o7.g;
    public float[] c = uf1.a;
    public int d;
    public int e;
    public int f;

    public z33(int i) {
        if (i >= 0) {
            c(ia4.d(i));
        } else {
            dq2.H0("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
        int i2 = this.d;
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

    public final int b(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (j42.c(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final void c(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, ia4.c(i)) : 0;
        this.d = max;
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
        this.f = ia4.a(this.d) - this.e;
        this.b = new Object[max];
        this.c = new float[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        r2 = a(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r37.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (((r37.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        r2 = r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r2 <= 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        r19 = 128;
        r2 = java.lang.Long.compare((r37.e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        if (r2 > 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        r2 = r37.a;
        r3 = r37.d;
        r5 = r37.b;
        r6 = r37.c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
    
        if (r7 >= r13) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f1, code lost:
    
        r27 = r9;
        r25 = r11;
        r12 = 7;
        r7 = defpackage.dq.d1(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        if (r7 == r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011f, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0126, code lost:
    
        if (r9 == 254) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0129, code lost:
    
        r9 = r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012b, code lost:
    
        if (r9 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012d, code lost:
    
        r9 = r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0133, code lost:
    
        r9 = r9 * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = a(r10);
        r10 = r10 & r3;
        r29 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014e, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0175, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0187, code lost:
    
        if (((r14 >> r12) & r25) != 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0189, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r25 << r12)) & r14) | ((r9 & 127) << r12);
        r2[r8] = (r2[r8] & (~(r25 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = null;
        r34[r13] = r34[r7];
        r34[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d6, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r29;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b5, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((r9 & 127) << r12) | ((~(r25 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0150, code lost:
    
        r32 = r15;
        r2[r8] = ((r9 & 127) << r11) | (r2[r8] & (~(r25 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r29;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0132, code lost:
    
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ef, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.f = defpackage.ia4.a(r37.d) - r37.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0284, code lost:
    
        r2 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0288, code lost:
    
        r37.e++;
        r1 = r37.f;
        r3 = r37.a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a0, code lost:
    
        if (((r5 >> r7) & r25) != r19) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a2, code lost:
    
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a4, code lost:
    
        r37.f = r1 - r32;
        r1 = r37.d;
        r5 = (r5 & (~(r25 << r7))) | (r27 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0202, code lost:
    
        r27 = r9;
        r25 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0210, code lost:
    
        r2 = defpackage.ia4.b(r37.d);
        r3 = r37.a;
        r5 = r37.b;
        r6 = r37.c;
        r7 = r37.d;
        c(r2);
        r2 = r37.a;
        r8 = r37.b;
        r9 = r37.c;
        r10 = r37.d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022b, code lost:
    
        if (r11 >= r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023a, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x023c, code lost:
    
        r12 = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x023e, code lost:
    
        if (r12 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0240, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0247, code lost:
    
        r13 = r13 * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x027e, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0245, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x027d, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x020d, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009e, code lost:
    
        r27 = r9;
        r25 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r38, float r39) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z33.d(java.lang.String, float):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33)) {
            return false;
        }
        z33 z33Var = (z33) obj;
        if (z33Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            float f = fArr[i4];
                            int b = z33Var.b(obj2);
                            if (b < 0 || f != z33Var.c[b]) {
                                break loop0;
                            }
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        float[] fArr = this.c;
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
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        i2 += Float.floatToIntBits(fArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
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
        }
        sb.append('}');
        return sb.toString();
    }
}
