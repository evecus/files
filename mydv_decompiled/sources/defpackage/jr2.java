package defpackage;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;

/* loaded from: classes2.dex */
public final class jr2 implements Cloneable {
    public static final short[] J = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, SilenceSkippingAudioProcessor.DEFAULT_SILENCE_THRESHOLD_LEVEL, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    public long[] I;

    public jr2(long[] jArr, int i) {
        if (i == jArr.length) {
            this.I = jArr;
            return;
        }
        long[] jArr2 = new long[i];
        this.I = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i);
    }

    public static void a(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            jArr[i5] = jArr[i5] ^ jArr2[i2 + i4];
        }
    }

    public static long d(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr2[i2 + i6];
            int i7 = i + i6;
            jArr[i7] = (j | (j2 << i4)) ^ jArr[i7];
            j = j2 >>> i5;
        }
        return j;
    }

    public static void g(long[] jArr, int i) {
        int i2 = i >>> 6;
        jArr[i2] = (1 << (i & 63)) ^ jArr[i2];
    }

    public static void h(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        int i4 = i3 >>> 6;
        int i5 = i3 & 63;
        int i6 = i2;
        if (i5 == 0) {
            a(i4, i, i6, jArr, jArr2);
            return;
        }
        int i7 = i4 + 1;
        int i8 = 64 - i5;
        int i9 = 64 - i8;
        long j = 0;
        while (true) {
            i6--;
            if (i6 < 0) {
                jArr[i4] = jArr[i4] ^ j;
                return;
            }
            long j2 = jArr2[i + i6];
            int i10 = i7 + i6;
            jArr[i10] = (j | (j2 >>> i8)) ^ jArr[i10];
            j = j2 << i9;
        }
    }

    public static void i(long[] jArr, int i, long j) {
        int i2 = i >>> 6;
        int i3 = i & 63;
        if (i3 == 0) {
            jArr[i2] = j ^ jArr[i2];
            return;
        }
        jArr[i2] = jArr[i2] ^ (j << i3);
        long j2 = j >>> (64 - i3);
        if (j2 != 0) {
            int i4 = i2 + 1;
            jArr[i4] = j2 ^ jArr[i4];
        }
    }

    public static long k(int i) {
        short[] sArr = J;
        return ((((sArr[i >>> 24] << 16) | sArr[(i >>> 16) & 255]) & 4294967295L) << 32) | (4294967295L & (sArr[i & 255] | (sArr[(i >>> 8) & 255] << 16)));
    }

    public static void n(long j, long[] jArr, int i, long[] jArr2) {
        int i2 = i;
        long[] jArr3 = jArr2;
        if ((j & 1) != 0) {
            a(0, 0, i2, jArr3, jArr);
        }
        long j2 = j;
        int i3 = 1;
        while (true) {
            j2 >>>= 1;
            if (j2 == 0) {
                return;
            }
            if ((j2 & 1) != 0) {
                long d = d(jArr3, 0, jArr, 0, i2, i3);
                if (d != 0) {
                    jArr2[i] = jArr2[i] ^ d;
                }
            }
            i3++;
            i2 = i;
            jArr3 = jArr2;
        }
    }

    public static int o(long[] jArr, int i, int i2, int[] iArr) {
        int i3 = (i2 + 63) >>> 6;
        if (i < i3) {
            return i;
        }
        int i4 = i << 6;
        int min = Math.min(i4, (i2 << 1) - 1);
        int i5 = i4 - min;
        while (i5 >= 64) {
            i--;
            i5 -= 64;
        }
        int length = iArr.length;
        int i6 = iArr[length - 1];
        int i7 = length > 1 ? iArr[length - 2] : 0;
        int max = Math.max(i2, i6 + 64);
        int min2 = (Math.min(min - max, i2 - i7) + i5) >> 6;
        if (min2 > 1) {
            int i8 = i - min2;
            min = i8 << 6;
            int i9 = min - i2;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                h(i8, i - i8, iArr[length2] + i9, jArr, jArr);
            }
            h(i8, i - i8, i9, jArr, jArr);
            while (i > i8) {
                i--;
                jArr[i] = 0;
            }
        }
        if (min > max) {
            int i10 = max >>> 6;
            while (true) {
                i--;
                if (i <= i10) {
                    break;
                }
                long j = jArr[i];
                if (j != 0) {
                    jArr[i] = 0;
                    int i11 = (i << 6) - i2;
                    int length3 = iArr.length;
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        i(jArr, iArr[length3] + i11, j);
                    }
                    i(jArr, i11, j);
                }
            }
            int i12 = max & 63;
            long j2 = jArr[i10];
            long j3 = j2 >>> i12;
            if (j3 != 0) {
                jArr[i10] = j2 ^ (j3 << i12);
                int i13 = max - i2;
                int length4 = iArr.length;
                while (true) {
                    length4--;
                    if (length4 < 0) {
                        break;
                    }
                    i(jArr, iArr[length4] + i13, j3);
                }
                i(jArr, i13, j3);
            }
        } else {
            max = min;
        }
        if (max > i2) {
            while (true) {
                max--;
                if (max < i2) {
                    break;
                }
                if (((1 << (max & 63)) & jArr[max >>> 6]) != 0) {
                    g(jArr, max);
                    int i14 = max - i2;
                    int length5 = iArr.length;
                    while (true) {
                        length5--;
                        if (length5 < 0) {
                            break;
                        }
                        g(jArr, iArr[length5] + i14);
                    }
                    g(jArr, i14);
                }
            }
        }
        return i3;
    }

    public static void p(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr[i + i6];
            jArr2[i2 + i6] = j | (j2 << i4);
            j = j2 >>> i5;
        }
    }

    public final void b(jr2 jr2Var, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 >>> 6;
        int i5 = i2 & 63;
        long[] jArr = this.I;
        if (i5 == 0) {
            a(i4, 0, i3, jArr, jr2Var.I);
            return;
        }
        long d = d(jArr, i4, jr2Var.I, 0, i3, i5);
        if (d != 0) {
            long[] jArr2 = this.I;
            int i6 = i3 + i4;
            jArr2[i6] = d ^ jArr2[i6];
        }
    }

    public final void c(jr2 jr2Var) {
        int j = jr2Var.j();
        if (j == 0) {
            return;
        }
        long[] jArr = this.I;
        if (j > jArr.length) {
            long[] jArr2 = new long[j];
            System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, j));
            this.I = jArr2;
            jArr = jArr2;
        }
        a(0, 0, j, jArr, jr2Var.I);
    }

    public final Object clone() {
        long[] jArr = this.I;
        return new jr2(jArr == null ? null : (long[]) jArr.clone());
    }

    public final int e() {
        int length = this.I.length;
        while (length != 0) {
            length--;
            long j = this.I[length];
            if (j != 0) {
                return (64 - Long.numberOfLeadingZeros(j)) + (length * 64);
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jr2)) {
            return false;
        }
        jr2 jr2Var = (jr2) obj;
        int j = j();
        if (jr2Var.j() != j) {
            return false;
        }
        for (int i = 0; i < j; i++) {
            if (this.I[i] != jr2Var.I[i]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        int i2 = (i + 62) >>> 6;
        while (i2 != 0) {
            i2--;
            long j = this.I[i2];
            if (j != 0) {
                return (64 - Long.numberOfLeadingZeros(j)) + (i2 * 64);
            }
        }
        return 0;
    }

    public final int hashCode() {
        int j = j();
        int i = 1;
        for (int i2 = 0; i2 < j; i2++) {
            long j2 = this.I[i2];
            i = (((i * 31) ^ ((int) j2)) * 31) ^ ((int) (j2 >>> 32));
        }
        return i;
    }

    public final int j() {
        long[] jArr = this.I;
        int min = Math.min(jArr.length, jArr.length);
        if (min >= 1) {
            if (jArr[0] != 0) {
                while (true) {
                    int i = min - 1;
                    if (jArr[i] != 0) {
                        return min;
                    }
                    min = i;
                }
            } else {
                while (true) {
                    int i2 = min - 1;
                    if (jArr[i2] != 0) {
                        return min;
                    }
                    if (i2 <= 0) {
                        break;
                    }
                    min = i2;
                }
            }
        }
        return 0;
    }

    public final boolean l() {
        long[] jArr = this.I;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final jr2 m(jr2 jr2Var) {
        int i;
        int i2;
        jr2 jr2Var2;
        jr2 jr2Var3;
        long[] jArr;
        int e = e();
        if (e == 0) {
            return this;
        }
        int e2 = jr2Var.e();
        if (e2 == 0) {
            return jr2Var;
        }
        if (e > e2) {
            i2 = e;
            i = e2;
            jr2Var3 = this;
            jr2Var2 = jr2Var;
        } else {
            i = e;
            i2 = e2;
            jr2Var2 = this;
            jr2Var3 = jr2Var;
        }
        int i3 = (i + 63) >>> 6;
        int i4 = (i2 + 63) >>> 6;
        int i5 = ((i + i2) + 62) >>> 6;
        if (i3 == 1) {
            long j = jr2Var2.I[0];
            if (j == 1) {
                return jr2Var3;
            }
            long[] jArr2 = new long[i5];
            n(j, jr2Var3.I, i4, jArr2);
            return new jr2(jArr2, i5);
        }
        int i6 = (i2 + 70) >>> 6;
        int[] iArr = new int[16];
        int i7 = i6 << 4;
        long[] jArr3 = new long[i7];
        iArr[1] = i6;
        System.arraycopy(jr2Var3.I, 0, jArr3, i6, i4);
        int i8 = 2;
        int i9 = i6;
        while (i8 < 16) {
            int i10 = i9 + i6;
            iArr[i8] = i10;
            if ((i8 & 1) == 0) {
                p(jArr3, i10 >>> 1, jArr3, i10, i6, 1);
                jArr = jArr3;
            } else {
                jArr = jArr3;
                int i11 = i10 - i6;
                for (int i12 = 0; i12 < i6; i12++) {
                    jArr[i10 + i12] = jArr[i6 + i12] ^ jArr[i11 + i12];
                }
            }
            i8++;
            i9 = i10;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        long[] jArr5 = new long[i7];
        p(jArr4, 0, jArr5, 0, i7, 4);
        long[] jArr6 = jr2Var2.I;
        int i13 = i5 << 3;
        long[] jArr7 = new long[i13];
        for (int i14 = 0; i14 < i3; i14++) {
            long j2 = jArr6[i14];
            int i15 = i14;
            while (true) {
                int i16 = iArr[((int) j2) & 15];
                int i17 = iArr[((int) (j2 >>> 4)) & 15];
                for (int i18 = 0; i18 < i6; i18++) {
                    int i19 = i15 + i18;
                    jArr7[i19] = jArr7[i19] ^ (jArr4[i16 + i18] ^ jArr5[i17 + i18]);
                }
                j2 >>>= 8;
                if (j2 == 0) {
                    break;
                }
                i15 += i5;
            }
        }
        while (true) {
            int i20 = i13 - i5;
            if (i20 == 0) {
                return new jr2(jArr7, i5);
            }
            d(jArr7, i20 - i5, jArr7, i20, i5, 8);
            i13 = i20;
        }
    }

    public final String toString() {
        int j = j();
        if (j == 0) {
            return "0";
        }
        int i = j - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.I[i]));
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.I[i]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    public jr2(long[] jArr) {
        this.I = jArr;
    }

    public jr2(int i) {
        this.I = new long[i];
    }
}
