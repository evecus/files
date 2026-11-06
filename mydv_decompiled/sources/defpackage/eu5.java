package defpackage;

import androidx.media3.common.C;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.R;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.LiveRoomUtilsKt;
import java.io.UnsupportedEncodingException;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class eu5 {
    public static final da A;
    public static final da B;
    public static final da C;
    public static final da D;
    public static final tc0 h;
    public static final x81 p;
    public static x81 q;
    public static final da z;
    public static final Object a = new Object();
    public static final byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] d = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    public static final pi5 e = pi5.J;
    public static final tc0 f = new tc0(210148896, new bd0((byte) 18), false);
    public static final tc0 g = new tc0(-1571120048, new xc0(), false);
    public static final tc0 i = new tc0(630419438, new uc0(11), false);
    public static final float j = 1.0f;
    public static final int[] k = {1, 10, 100, 1000, 10000, 100000, PlaybackException.CUSTOM_ERROR_CODE_BASE, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};
    public static final int[] l = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] m = {3, 6};
    public static final int[] n = {1, 2, 4, 5, 7, 8};
    public static final Object o = new Object();
    public static final String[] r = {"_id", "package_name", "type", "display_name", "description", "app_link_intent_uri", "internal_provider_id", "internal_provider_data", "internal_provider_flag1", "internal_provider_flag2", "internal_provider_flag3", "internal_provider_flag4"};
    public static final byte[] s = {48, 49, 53, 0};
    public static final byte[] t = {48, 49, 48, 0};
    public static final byte[] u = {48, 48, 57, 0};
    public static final byte[] v = {48, 48, 53, 0};
    public static final byte[] w = {48, 48, 49, 0};
    public static final byte[] x = {48, 48, 49, 0};
    public static final byte[] y = {48, 48, 50, 0};
    public static final int[] E = {-21389, -2, -1, -1, -1};
    public static final int[] F = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    public static final int[] G = {-457489321, -42779, -2, -1, -1, 42777, 2};
    public static final int[] H = {1, 0, 0, -1, -1, -1, -1};
    public static final int[] I = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    public static final int[] J = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};
    public static final int[] K = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};
    public static final long[] L = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};
    public static final zr4 M = new zr4();
    public static final as4 N = new as4();
    public static final ol4 O = new ol4(21);
    public static final m45 P = new m45(20);
    public static final m45 Q = new m45(21);
    public static final m45 R = new m45(22);

    static {
        byte b2 = 8;
        h = new tc0(-1455401925, new uc0(b2), false);
        byte b3 = 10;
        Object obj = null;
        byte b4 = 4;
        p = new x81(obj, obj, obj, b4);
        z = new da(new fa4((byte) 0), new yv3((byte) 6), b3);
        A = new da(new fa4((byte) 1), new yv3((byte) 7), b3);
        B = new da(new fa4((byte) 2), new yv3(b2), b3);
        C = new da(new fa4((byte) 3), new yv3((byte) 9), b3);
        D = new da(new fa4(b4), new yv3(b3), b3);
    }

    public static String A(int i2, byte[] bArr) {
        if (i2 < 0) {
            s83.t(hf1.u(i2, "Cannot have length offset: "));
            return null;
        }
        if (i2 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", 0, Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        }
        int i3 = ((i2 / 3) * 4) + (i2 % 3 <= 0 ? 0 : 4);
        byte[] bArr2 = new byte[i3];
        int i4 = i2 - 2;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            z(bArr, i5, 3, bArr2, i6, 0);
            i5 += 3;
            i6 += 4;
        }
        if (i5 < i2) {
            z(bArr, i5, i2 - i5, bArr2, i6, 0);
            i6 += 4;
        }
        if (i6 <= i3 - 1) {
            byte[] bArr3 = new byte[i6];
            System.arraycopy(bArr2, 0, bArr3, 0, i6);
            bArr2 = bArr3;
        }
        try {
            return new String(bArr2, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr2);
        }
    }

    public static boolean A0(byte[] bArr) {
        return y0(10, bArr) && x0(10, bArr) <= 59;
    }

    public static final void B(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static final l13 C() {
        return new d15(Q);
    }

    public static void D(int[] iArr, int[] iArr2, int[] iArr3) {
        jl2.a0(iArr, iArr2, iArr3);
        long j2 = iArr2[8] & 4294967295L;
        long j3 = iArr2[9] & 4294967295L;
        long j4 = iArr2[10] & 4294967295L;
        long j5 = iArr2[11] & 4294967295L;
        long j6 = iArr2[12] & 4294967295L;
        long j7 = iArr2[13] & 4294967295L;
        long j8 = iArr2[14] & 4294967295L;
        long j9 = iArr2[15] & 4294967295L;
        long j10 = iArr[8] & 4294967295L;
        long j11 = j10 * j2;
        iArr3[16] = (int) j11;
        int i2 = 32;
        long j12 = (j10 * j3) + (j11 >>> 32);
        iArr3[17] = (int) j12;
        long j13 = (j10 * j4) + (j12 >>> 32);
        iArr3[18] = (int) j13;
        long j14 = (j10 * j5) + (j13 >>> 32);
        iArr3[19] = (int) j14;
        long j15 = (j10 * j6) + (j14 >>> 32);
        iArr3[20] = (int) j15;
        long j16 = (j10 * j7) + (j15 >>> 32);
        iArr3[21] = (int) j16;
        long j17 = (j10 * j8) + (j16 >>> 32);
        iArr3[22] = (int) j17;
        long j18 = (j10 * j9) + (j17 >>> 32);
        iArr3[23] = (int) j18;
        iArr3[24] = (int) (j18 >>> 32);
        int i3 = 16;
        int i4 = 1;
        while (i4 < 8) {
            int i5 = i3 + 1;
            int i6 = i4;
            long j19 = j6;
            int i7 = i2;
            long j20 = iArr[8 + i4] & 4294967295L;
            long j21 = j7;
            long j22 = (j20 * j2) + (iArr3[i5] & 4294967295L);
            iArr3[i5] = (int) j22;
            long j23 = (j20 * j3) + (iArr3[r15] & 4294967295L) + (j22 >>> i7);
            iArr3[i3 + 2] = (int) j23;
            long j24 = (j20 * j4) + (iArr3[r8] & 4294967295L) + (j23 >>> i7);
            iArr3[i3 + 3] = (int) j24;
            long j25 = (j20 * j5) + (iArr3[r8] & 4294967295L) + (j24 >>> i7);
            iArr3[i3 + 4] = (int) j25;
            long j26 = (j20 * j19) + (iArr3[r8] & 4294967295L) + (j25 >>> i7);
            iArr3[i3 + 5] = (int) j26;
            long j27 = (j20 * j21) + (iArr3[r8] & 4294967295L) + (j26 >>> i7);
            iArr3[i3 + 6] = (int) j27;
            long j28 = (j20 * j8) + (iArr3[r8] & 4294967295L) + (j27 >>> i7);
            iArr3[i3 + 7] = (int) j28;
            long j29 = (j20 * j9) + (iArr3[r8] & 4294967295L) + (j28 >>> i7);
            iArr3[i3 + 8] = (int) j29;
            iArr3[i3 + 9] = (int) (j29 >>> i7);
            i4 = i6 + 1;
            i3 = i5;
            i2 = i7;
            j6 = j19;
            j4 = j4;
            j7 = j21;
        }
        int i8 = i2;
        int j30 = jl2.j(iArr3, iArr3);
        int i9 = 0;
        int i10 = jl2.i(24, 16, jl2.i(0, 8, 0, iArr3, iArr3) + j30, iArr3, iArr3) + j30;
        int[] iArr4 = new int[8];
        int[] iArr5 = new int[8];
        boolean z2 = jl2.v(iArr, iArr, iArr4) != jl2.v(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[16];
        jl2.a0(iArr4, iArr5, iArr6);
        dq2.h(i8, i10 + (z2 ? dq2.f(16, 8, iArr6, iArr3) : dq2.E0(16, 8, iArr6, iArr3)), 24, iArr3);
        int i11 = iArr[16];
        int i12 = iArr2[16];
        long j31 = i11 & 4294967295L;
        long j32 = i12 & 4294967295L;
        long j33 = 0;
        while (true) {
            long j34 = j31;
            long j35 = ((iArr[i9] & 4294967295L) * j32) + (j34 * (iArr2[i9] & 4294967295L)) + (iArr3[r8] & 4294967295L) + j33;
            iArr3[16 + i9] = (int) j35;
            long j36 = j35 >>> 32;
            i9++;
            if (i9 >= 16) {
                iArr3[32] = (i11 * i12) + ((int) j36);
                return;
            } else {
                j33 = j36;
                j31 = j34;
            }
        }
    }

    public static void E(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i2 = 0; i2 < 9; i2++) {
            G(jArr4, jArr[i2], jArr2[i2], jArr3, i2 << 1);
        }
        long j2 = jArr3[0];
        long j3 = jArr3[1];
        long j4 = jArr3[2] ^ j2;
        long j5 = j4 ^ j3;
        jArr3[1] = j5;
        long j6 = j3 ^ jArr3[3];
        long j7 = j4 ^ jArr3[4];
        long j8 = j7 ^ j6;
        jArr3[2] = j8;
        long j9 = j6 ^ jArr3[5];
        long j10 = j7 ^ jArr3[6];
        long j11 = j10 ^ j9;
        jArr3[3] = j11;
        long j12 = j9 ^ jArr3[7];
        long j13 = j10 ^ jArr3[8];
        long j14 = j13 ^ j12;
        jArr3[4] = j14;
        long j15 = j12 ^ jArr3[9];
        long j16 = j13 ^ jArr3[10];
        long j17 = j16 ^ j15;
        jArr3[5] = j17;
        long j18 = j15 ^ jArr3[11];
        long j19 = j16 ^ jArr3[12];
        long j20 = j19 ^ j18;
        jArr3[6] = j20;
        long j21 = j18 ^ jArr3[13];
        long j22 = j19 ^ jArr3[14];
        long j23 = j22 ^ j21;
        jArr3[7] = j23;
        long j24 = j21 ^ jArr3[15];
        long j25 = j22 ^ jArr3[16];
        long j26 = j25 ^ j24;
        jArr3[8] = j26;
        long j27 = (j24 ^ jArr3[17]) ^ j25;
        jArr3[9] = j2 ^ j27;
        jArr3[10] = j5 ^ j27;
        jArr3[11] = j8 ^ j27;
        jArr3[12] = j11 ^ j27;
        jArr3[13] = j14 ^ j27;
        jArr3[14] = j17 ^ j27;
        jArr3[15] = j20 ^ j27;
        jArr3[16] = j23 ^ j27;
        jArr3[17] = j26 ^ j27;
        G(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        G(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        G(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        G(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        G(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        G(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        G(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        G(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        G(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        G(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        G(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        G(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        G(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        G(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        G(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        G(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        G(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        G(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        G(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        G(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        G(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        G(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        G(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        G(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        G(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        G(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        G(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        G(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        G(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        G(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        G(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        G(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        G(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        G(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        G(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        G(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    public static void F(long[] jArr, long[] jArr2, long[] jArr3) {
        int i2 = 56;
        while (true) {
            long j2 = 0;
            int i3 = 0;
            if (i2 < 0) {
                break;
            }
            for (int i4 = 1; i4 < 9; i4 += 2) {
                int i5 = (int) (jArr[i4] >>> i2);
                u(jArr2, (i5 & 15) * 9, jArr2, (((i5 >>> 4) & 15) + 16) * 9, jArr3, i4 - 1);
            }
            while (i3 < 16) {
                long j3 = jArr3[i3];
                jArr3[i3] = (j2 >>> (-8)) | (j3 << 8);
                i3++;
                j2 = j3;
            }
            i2 -= 8;
        }
        for (int i6 = 56; i6 >= 0; i6 -= 8) {
            int i7 = 0;
            while (i7 < 9) {
                int i8 = (int) (jArr[i7] >>> i6);
                int i9 = i7;
                u(jArr2, (i8 & 15) * 9, jArr2, (((i8 >>> 4) & 15) + 16) * 9, jArr3, i9);
                i7 = i9 + 2;
            }
            if (i6 > 0) {
                long j4 = 0;
                int i10 = 0;
                while (i10 < 18) {
                    long j5 = jArr3[i10];
                    jArr3[i10] = (j4 >>> (-8)) | (j5 << 8);
                    i10++;
                    j4 = j5;
                }
            }
        }
    }

    public static void G(long[] jArr, long j2, long j3, long[] jArr2, int i2) {
        jArr[1] = j3;
        long j4 = 0;
        long j5 = j3;
        long j6 = j2;
        for (int i3 = 2; i3 < 16; i3 += 2) {
            long j7 = jArr[i3 >>> 1] << 1;
            jArr[i3] = j7;
            jArr[i3 + 1] = j7 ^ j3;
            j6 = (j6 & (-72340172838076674L)) >>> 1;
            j4 ^= (j5 >> 63) & j6;
            j5 <<= 1;
        }
        int i4 = (int) j2;
        long j8 = jArr[i4 & 15] ^ (jArr[(i4 >>> 4) & 15] << 4);
        int i5 = 56;
        do {
            int i6 = (int) (j2 >>> i5);
            long j9 = jArr[i6 & 15] ^ (jArr[(i6 >>> 4) & 15] << 4);
            j8 ^= j9 << i5;
            j4 ^= j9 >>> (-i5);
            i5 -= 8;
        } while (i5 > 0);
        jArr2[i2] = jArr2[i2] ^ j8;
        int i7 = i2 + 1;
        jArr2[i7] = jArr2[i7] ^ j4;
    }

    public static void H(int[] iArr, int[] iArr2) {
        long j2;
        jl2.j0(iArr, iArr2);
        long j3 = 4294967295L;
        long j4 = iArr[8] & 4294967295L;
        int i2 = 7;
        int i3 = 16;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            long j5 = iArr[i2 + 8] & j3;
            long j6 = j5 * j5;
            j2 = j3;
            iArr2[i3 + 15] = ((int) (j6 >>> 33)) | (i4 << 31);
            int i6 = i3 - 2;
            iArr2[i3 + 14] = (int) (j6 >>> 1);
            i4 = (int) j6;
            if (i5 <= 0) {
                break;
            }
            i3 = i6;
            i2 = i5;
            j3 = j2;
        }
        long j7 = j4 * j4;
        long j8 = ((i4 << 31) & j2) | (j7 >>> 33);
        iArr2[16] = (int) j7;
        int i7 = ((int) (j7 >>> 32)) & 1;
        long j9 = iArr[9] & j2;
        long j10 = (j9 * j4) + j8;
        int i8 = (int) j10;
        iArr2[17] = (i8 << 1) | i7;
        int i9 = i8 >>> 31;
        long j11 = (iArr2[18] & j2) + (j10 >>> 32);
        long j12 = iArr[10] & j2;
        long j13 = (j12 * j4) + j11;
        int i10 = (int) j13;
        iArr2[18] = (i10 << 1) | i9;
        long k2 = nt3.k(j12, j9, j13 >>> 32, iArr2[19] & j2);
        long j14 = (iArr2[20] & j2) + (k2 >>> 32);
        long j15 = iArr[11] & j2;
        long j16 = (iArr2[21] & j2) + (j14 >>> 32);
        long j17 = (iArr2[22] & j2) + (j16 >>> 32);
        long j18 = j16 & j2;
        long j19 = (j15 * j4) + (k2 & j2);
        int i11 = (int) j19;
        iArr2[19] = (i10 >>> 31) | (i11 << 1);
        long k3 = nt3.k(j15, j9, j19 >>> 32, j14 & j2);
        long k4 = nt3.k(j15, j12, k3 >>> 32, j18);
        long j20 = j17 + (k4 >>> 32);
        long j21 = k4 & j2;
        long j22 = iArr[12] & j2;
        long j23 = (iArr2[23] & j2) + (j20 >>> 32);
        long j24 = (iArr2[24] & j2) + (j23 >>> 32);
        long j25 = j23 & j2;
        long j26 = (j22 * j4) + (k3 & j2);
        int i12 = (int) j26;
        iArr2[20] = (i11 >>> 31) | (i12 << 1);
        long k5 = nt3.k(j22, j9, j26 >>> 32, j21);
        long k6 = nt3.k(j22, j12, k5 >>> 32, j20 & j2);
        long k7 = nt3.k(j22, j15, k6 >>> 32, j25);
        long j27 = k6 & j2;
        long j28 = j24 + (k7 >>> 32);
        long j29 = iArr[13] & j2;
        long j30 = (iArr2[25] & j2) + (j28 >>> 32);
        long j31 = j28 & j2;
        long j32 = (iArr2[26] & j2) + (j30 >>> 32);
        long j33 = j30 & j2;
        long j34 = (j29 * j4) + (k5 & j2);
        int i13 = (int) j34;
        iArr2[21] = (i12 >>> 31) | (i13 << 1);
        int i14 = i13 >>> 31;
        long k8 = nt3.k(j29, j9, j34 >>> 32, j27);
        long k9 = nt3.k(j29, j12, k8 >>> 32, k7 & j2);
        long k10 = nt3.k(j29, j15, k9 >>> 32, j31);
        long j35 = k9 & j2;
        long k11 = nt3.k(j29, j22, k10 >>> 32, j33);
        long j36 = j32 + (k11 >>> 32);
        long j37 = k11 & j2;
        long j38 = iArr[14] & j2;
        long j39 = (iArr2[27] & j2) + (j36 >>> 32);
        long j40 = j36 & j2;
        long j41 = (iArr2[28] & j2) + (j39 >>> 32);
        long j42 = (j38 * j4) + (k8 & j2);
        int i15 = (int) j42;
        iArr2[22] = (i15 << 1) | i14;
        long k12 = nt3.k(j38, j9, j42 >>> 32, j35);
        long k13 = nt3.k(j38, j12, k12 >>> 32, k10 & j2);
        long k14 = nt3.k(j38, j15, k13 >>> 32, j37);
        long j43 = k13 & j2;
        long k15 = nt3.k(j38, j22, k14 >>> 32, j40);
        long k16 = nt3.k(j38, j29, k15 >>> 32, j39 & j2);
        long j44 = k15 & j2;
        long j45 = j41 + (k16 >>> 32);
        long j46 = k16 & j2;
        long j47 = iArr[15] & j2;
        long j48 = (iArr2[29] & j2) + (j45 >>> 32);
        long j49 = (j47 * j4) + (k12 & j2);
        int i16 = (int) j49;
        iArr2[23] = (i15 >>> 31) | (i16 << 1);
        int i17 = i16 >>> 31;
        long k17 = nt3.k(j47, j9, j49 >>> 32, j43);
        long k18 = nt3.k(j47, j12, k17 >>> 32, k14 & j2);
        long k19 = nt3.k(j47, j15, k18 >>> 32, j44);
        long k20 = nt3.k(j47, j22, k19 >>> 32, j46);
        long k21 = nt3.k(j47, j29, k20 >>> 32, j45 & j2);
        long k22 = nt3.k(j47, j38, k21 >>> 32, j48 & j2);
        long j50 = (iArr2[30] & j2) + (j48 >>> 32) + (k22 >>> 32);
        int i18 = (int) k17;
        iArr2[24] = (i18 << 1) | i17;
        int i19 = (int) k18;
        iArr2[25] = (i18 >>> 31) | (i19 << 1);
        int i20 = (int) k19;
        iArr2[26] = (i20 << 1) | (i19 >>> 31);
        int i21 = (int) k20;
        iArr2[27] = (i20 >>> 31) | (i21 << 1);
        int i22 = i21 >>> 31;
        int i23 = (int) k21;
        iArr2[28] = i22 | (i23 << 1);
        int i24 = i23 >>> 31;
        int i25 = (int) k22;
        iArr2[29] = i24 | (i25 << 1);
        int i26 = i25 >>> 31;
        int i27 = (int) j50;
        iArr2[30] = i26 | (i27 << 1);
        iArr2[31] = (i27 >>> 31) | ((iArr2[31] + ((int) (j50 >>> 32))) << 1);
        int j51 = jl2.j(iArr2, iArr2);
        int i28 = 0;
        int i29 = jl2.i(24, 16, jl2.i(0, 8, 0, iArr2, iArr2) + j51, iArr2, iArr2) + j51;
        int[] iArr3 = new int[8];
        jl2.v(iArr, iArr, iArr3);
        int[] iArr4 = new int[16];
        jl2.j0(iArr3, iArr4);
        dq2.h(32, dq2.E0(16, 8, iArr4, iArr2) + i29, 24, iArr2);
        int i30 = iArr[16];
        long j52 = (i30 << 1) & j2;
        long j53 = 0;
        do {
            long j54 = ((iArr[i28] & j2) * j52) + (iArr2[r3] & j2) + j53;
            iArr2[16 + i28] = (int) j54;
            j53 = j54 >>> 32;
            i28++;
        } while (i28 < 16);
        iArr2[32] = (i30 * i30) + ((int) j53);
    }

    public static void I(long[] jArr, long[] jArr2) {
        e41.E(9, jArr, jArr2);
    }

    public static boolean J(byte b2) {
        return b2 >= 48 && b2 <= 57;
    }

    public static boolean K(byte[] bArr, int i2, int i3) {
        if (i2 + i3 <= bArr.length) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (J(bArr[i2 + i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean L(int i2, byte[] bArr) {
        byte b2;
        if (i2 + 5 != bArr.length || ((b2 = bArr[i2]) != 43 && b2 != 45)) {
            return false;
        }
        int i3 = i2 + 1;
        return K(bArr, i3, 4) && x0(i3, bArr) <= 14 && x0(i2 + 3, bArr) <= 59;
    }

    public static final l13 M(l13 l13Var, ie2 ie2Var) {
        return l13Var.then(new wx0(ie2Var));
    }

    public static void N(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        dq2.p0(iArr, iArr2, iArr4);
        d0(iArr4, iArr3);
    }

    public static void O(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        E(jArr, jArr2, jArr4);
        e0(jArr4, jArr3);
    }

    public static void P(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        il2.Q(iArr, iArr2, iArr4);
        f0(iArr4, iArr3);
    }

    public static void Q(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((dq2.q0(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && dq2.U(10, iArr3, F))) && dq2.g(7, G, iArr3) != 0) {
            dq2.Y(10, 7, iArr3);
        }
    }

    public static void R(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        E(jArr, jArr2, jArr4);
        w(jArr3, jArr4, jArr3);
    }

    public static void S(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        F(jArr, jArr2, jArr4);
        e0(jArr4, jArr3);
    }

    public static final l13 T(l13 l13Var) {
        return l13Var.then(new d15(R));
    }

    public static void U(int[] iArr, int[] iArr2) {
        int D2 = dq2.D(7, iArr);
        int[] iArr3 = H;
        if (D2 != 0) {
            il2.e0(iArr3, iArr3, iArr2);
        } else {
            il2.e0(iArr3, iArr, iArr2);
        }
    }

    public static final l13 V(l13 l13Var, float f2, float f3) {
        return l13Var.then(new qd3(f2, f3, new rd3(f2, f3)));
    }

    public static l13 W(l13 l13Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return V(l13Var, f2, f3);
    }

    public static final g12 X(String str, String str2, int i2, tm1 tm1Var) {
        char charAt = str.charAt(i2);
        if (((Boolean) tm1Var.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return Y(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i2);
    }

    public static final g12 Y(String str, String str2) {
        return new g12((Object) (str2 + " when parsing an Instant from \"" + u0(64, str) + '\"'), (Object) str, (byte) 16);
    }

    public static final int Z(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static final void a(ml0 ml0Var, l13 l13Var, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(56377258);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(ml0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.g(l13Var) ? 32 : 16;
        }
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            l13 E0 = i42.E0(mw2.p(nq4.g(l13Var, 22.0f), k80Var.K, l74.a(8.0f)), 7.0f, 0.0f, 2);
            u74 a2 = t74.a(new kp(4.0f, true, new y9()), q8.T, go1Var, 54);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            if (ml0Var.b != null) {
                go1Var.d0(-365649176);
                ow1.a(ml0Var.b, null, nq4.k(i13.a, 14.0f), k80Var.M, go1Var, 432);
                go1Var.q(false);
            } else {
                go1Var.d0(-365443212);
                go1Var.q(false);
            }
            r55.b(ml0Var.a, null, k80Var.M, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.o, go1Var, 0, 24576, 114682);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new qj((byte) 2, i2, ml0Var, l13Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a0(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = defpackage.eu5.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L60
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L57
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L51
        L44:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r1, r2, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L5f
        L51:
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L56
        L56:
            throw r6     // Catch: java.lang.Throwable -> L12
        L57:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L5f:
            return
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu5.a0(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c6  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r14v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r53, final defpackage.rm1 r54, final defpackage.l13 r55, float r56, final java.lang.String r57, java.lang.String r58, java.lang.String r59, final java.lang.String r60, java.lang.String r61, java.lang.String r62, final defpackage.ml0 r63, final java.lang.String r64, defpackage.hx1 r65, long r66, defpackage.fe0 r68, final int r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 2192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu5.b(java.lang.String, rm1, l13, float, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ml0, java.lang.String, hx1, long, fe0, int, int, int):void");
    }

    public static long[] b0(long[] jArr) {
        long j2;
        long[] jArr2 = new long[288];
        int i2 = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i3 = 7;
        int i4 = 0;
        while (true) {
            j2 = 0;
            if (i3 <= 0) {
                break;
            }
            int i5 = i4 + 18;
            int i6 = i5 >>> 1;
            int i7 = 0;
            while (i7 < 9) {
                long j3 = jArr2[i6 + i7];
                jArr2[i5 + i7] = (j2 >>> 63) | (j3 << 1);
                i7++;
                j2 = j3;
            }
            int i8 = i4 + 26;
            long j4 = jArr2[i8];
            long j5 = j4 >>> 59;
            jArr2[i5] = ((j5 << 10) ^ (((j5 << 2) ^ j5) ^ (j5 << 5))) ^ jArr2[i5];
            jArr2[i8] = j4 & 576460752303423487L;
            int i9 = i4 + 27;
            for (int i10 = 0; i10 < 9; i10++) {
                jArr2[i9 + i10] = jArr2[9 + i10] ^ jArr2[i5 + i10];
            }
            i3--;
            i4 = i5;
        }
        while (i2 < 144) {
            long j6 = jArr2[i2];
            jArr2[144 + i2] = (j2 >>> (-4)) | (j6 << 4);
            i2++;
            j2 = j6;
        }
        return jArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final com.github.mytv.dv.model.Aweme r34, final defpackage.rm1 r35, final defpackage.l13 r36, float r37, defpackage.ml0 r38, boolean r39, boolean r40, boolean r41, long r42, long r44, defpackage.fe0 r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu5.c(com.github.mytv.dv.model.Aweme, rm1, l13, float, ml0, boolean, boolean, boolean, long, long, fe0, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        if (r5 != 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0053, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c0(android.content.Context r8) {
        /*
            java.lang.Object r0 = defpackage.eu5.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L64
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L44:
            if (r2 == 0) goto L56
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L56
            goto L56
        L4a:
            r8 = move-exception
            goto L6c
        L4c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L56
            goto L46
        L56:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5d
            goto L62
        L5d:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L64:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L69
        L69:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu5.c0(android.content.Context):java.lang.String");
    }

    public static final void d(rm1 rm1Var, rm1 rm1Var2, l13 l13Var, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1589706563);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.h(false) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.i(rm1Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.i(rm1Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go1Var.g(l13Var) ? 2048 : 1024;
        }
        if (go1Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = pt1.r(go1Var);
            }
            ki1 ki1Var = (ki1) Q2;
            Boolean bool = Boolean.FALSE;
            boolean z2 = (i3 & 14) == 4;
            Object Q3 = go1Var.Q();
            fj0 fj0Var = null;
            if (z2 || Q3 == jpVar) {
                Q3 = new oo0(ki1Var, fj0Var, (byte) 15);
                go1Var.o0(Q3);
            }
            mw2.h(go1Var, (hn1) Q3, bool);
            l13 p2 = mw2.p(l13Var.then(nq4.c), k80Var.p, mw2.j);
            uw2 c2 = px.c(q8.N, false);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, p2);
            xd0.c.getClass();
            go1Var.h0();
            boolean z3 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z3) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, c2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m2);
            Integer valueOf = Integer.valueOf(i4);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            ba0 a2 = z90.a(i42.d, q8.W, go1Var, 48);
            long j3 = go1Var.T;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            i13 i13Var = i13.a;
            l13 x02 = i42.x0(go1Var, i13Var);
            go1Var.h0();
            int i6 = i3;
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a2);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(i5, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            ut0.a(vt0.M(go1Var, R.mipmap.ic_launcher_foreground), "myDV", o7.m(nq4.k(i13Var, 80.0f), l74.a(20.0f)), null, li0.b, 0.0f, null, go1Var, rj3.$stable | 24624, 104);
            oh4.a(go1Var, nq4.g(i13Var, 16.0f));
            r55.b("myDV", null, k80Var.q, oh4.j(32), qk1.P, 0L, null, 0L, 0, false, 0, 0, null, go1Var, 1597446, 0, 262058);
            go1Var = go1Var;
            oh4.a(go1Var, nq4.g(i13Var, 24.0f));
            go1Var.d0(850769218);
            p70.q(li4.g(), "没有可播放的视频", null, null, rw4.I, false, p70.u0(1203371913, new p30(ki1Var, rm1Var2, rm1Var, (byte) 2), go1Var), go1Var, 1597488, 44);
            go1Var.q(false);
            oh4.a(go1Var, nq4.g(i13Var, 40.0f));
            l(((i6 >> 3) & 112) | 3078, go1Var, rm1Var2, null, false);
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new ve(rm1Var, rm1Var2, l13Var, i2, (byte) 8);
        }
    }

    public static void d0(int[] iArr, int[] iArr2) {
        long j2 = iArr[5] & 4294967295L;
        long j3 = (21389 * j2) + (iArr[0] & 4294967295L);
        int i2 = (int) j3;
        iArr2[0] = i2;
        long j4 = iArr[6] & 4294967295L;
        long j5 = (21389 * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i3 = (int) j5;
        iArr2[1] = i3;
        long j6 = iArr[7] & 4294967295L;
        long j7 = (21389 * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i4 = (int) j7;
        iArr2[2] = i4;
        long j8 = iArr[8] & 4294967295L;
        long j9 = (21389 * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i5 = (int) j9;
        iArr2[3] = i5;
        long j10 = iArr[9] & 4294967295L;
        long j11 = (21389 * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = (j11 >>> 32) + j10;
        long j13 = j12 & 4294967295L;
        long j14 = (21389 * j13) + (i2 & 4294967295L);
        iArr2[0] = (int) j14;
        long j15 = j12 >>> 32;
        long j16 = (21389 * j15) + j13 + (i3 & 4294967295L) + (j14 >>> 32);
        iArr2[1] = (int) j16;
        long j17 = j15 + (i4 & 4294967295L) + (j16 >>> 32);
        iArr2[2] = (int) j17;
        long j18 = (j17 >>> 32) + (i5 & 4294967295L);
        iArr2[3] = (int) j18;
        if (((j18 >>> 32) == 0 ? 0 : dq2.Z(5, 4, iArr2)) != 0 || (iArr2[4] == -1 && dq2.V(iArr2, E))) {
            dq2.c(5, 21389, iArr2);
        }
    }

    public static final void e(l13 l13Var, tc0 tc0Var, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(182924905);
        int i3 = (go1Var.g(l13Var) ? 4 : 2) | i2;
        byte b2 = 0;
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object Q2 = go1Var.Q();
            if (Q2 == de0.a) {
                Q2 = kc.e;
                go1Var.o0(Q2);
            }
            uw2 uw2Var = (uw2) Q2;
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, l13Var);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, uw2Var);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            tc0Var.invoke(go1Var, 6);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new ql0(l13Var, tc0Var, i2, b2);
        }
    }

    public static void e0(long[] jArr, long[] jArr2) {
        long j2 = jArr[9];
        long j3 = jArr[17];
        long j4 = (((j2 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j5 = (j3 << 15) ^ (((jArr[8] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        for (int i2 = 16; i2 >= 10; i2--) {
            long j6 = jArr[i2];
            jArr2[i2 - 8] = (((j5 ^ (j6 >>> 59)) ^ (j6 >>> 57)) ^ (j6 >>> 54)) ^ (j6 >>> 49);
            j5 = (((jArr[i2 - 9] ^ (j6 << 5)) ^ (j6 << 7)) ^ (j6 << 10)) ^ (j6 << 15);
        }
        jArr2[1] = (((j5 ^ (j4 >>> 59)) ^ (j4 >>> 57)) ^ (j4 >>> 54)) ^ (j4 >>> 49);
        long j7 = (j4 << 15) ^ (((jArr[0] ^ (j4 << 5)) ^ (j4 << 7)) ^ (j4 << 10));
        long j8 = jArr2[8];
        long j9 = j8 >>> 59;
        jArr2[0] = (((j7 ^ j9) ^ (j9 << 2)) ^ (j9 << 5)) ^ (j9 << 10);
        jArr2[8] = 576460752303423487L & j8;
    }

    public static final void f(rm1 rm1Var, tw0 tw0Var, tc0 tc0Var, fe0 fe0Var, int i2) {
        int i3;
        tw0 tw0Var2;
        x04 u2;
        ic icVar;
        rm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2334882);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (go1Var.i(rm1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var.i(tc0Var) ? 256 : 128;
        }
        byte b3 = 0;
        if (go1Var.T(i4 & 1, (i4 & 147) != 146)) {
            int i5 = i4;
            tw0Var2 = new tw0(true, true, true);
            cj1 cj1Var = (cj1) go1Var.k(dj1.a);
            if (!cj1Var.c()) {
                go1Var.d0(839215663);
                d4.b(rm1Var, tw0Var2, p70.u0(1252283092, new x10(tc0Var, b2), go1Var), go1Var, (i5 & 112) | (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK);
                go1Var.q(false);
                u2 = go1Var.u();
                if (u2 != null) {
                    icVar = new ic(rm1Var, tw0Var2, tc0Var, i2, (byte) 1);
                    u2.d = icVar;
                }
                return;
            }
            go1Var.d0(839324256);
            go1Var.q(false);
            d4.b(rm1Var, new tw0(true, true, false), p70.u0(1781273529, new bj1(cj1Var, tc0Var, b3), go1Var), go1Var, (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK);
        } else {
            go1Var.W();
            tw0Var2 = tw0Var;
        }
        u2 = go1Var.u();
        if (u2 != null) {
            icVar = new ic(rm1Var, tw0Var2, tc0Var, i2, (byte) 2);
            u2.d = icVar;
        }
    }

    public static void f0(int[] iArr, int[] iArr2) {
        long j2 = iArr[10] & 4294967295L;
        long j3 = iArr[11] & 4294967295L;
        long j4 = iArr[12] & 4294967295L;
        long j5 = iArr[13] & 4294967295L;
        long j6 = ((iArr[7] & 4294967295L) + j3) - 1;
        long j7 = (iArr[8] & 4294967295L) + j4;
        long j8 = (iArr[9] & 4294967295L) + j5;
        long j9 = (iArr[0] & 4294967295L) - j6;
        long j10 = j9 & 4294967295L;
        long j11 = ((iArr[1] & 4294967295L) - j7) + (j9 >> 32);
        int i2 = (int) j11;
        iArr2[1] = i2;
        long j12 = ((iArr[2] & 4294967295L) - j8) + (j11 >> 32);
        int i3 = (int) j12;
        iArr2[2] = i3;
        long j13 = (((iArr[3] & 4294967295L) + j6) - j2) + (j12 >> 32);
        long j14 = j13 & 4294967295L;
        long j15 = (((iArr[4] & 4294967295L) + j7) - j3) + (j13 >> 32);
        iArr2[4] = (int) j15;
        long j16 = (((iArr[5] & 4294967295L) + j8) - j4) + (j15 >> 32);
        iArr2[5] = (int) j16;
        long j17 = (((iArr[6] & 4294967295L) + j2) - j5) + (j16 >> 32);
        iArr2[6] = (int) j17;
        long j18 = (j17 >> 32) + 1;
        long j19 = j14 + j18;
        long j20 = j10 - j18;
        iArr2[0] = (int) j20;
        long j21 = j20 >> 32;
        if (j21 != 0) {
            long j22 = j21 + (i2 & 4294967295L);
            iArr2[1] = (int) j22;
            long j23 = (j22 >> 32) + (i3 & 4294967295L);
            iArr2[2] = (int) j23;
            j19 += j23 >> 32;
        }
        iArr2[3] = (int) j19;
        if (((j19 >> 32) == 0 || dq2.Y(7, 4, iArr2) == 0) && !(iArr2[6] == -1 && il2.J(iArr2, H))) {
            return;
        }
        x(iArr2);
    }

    public static final void g(tc0 tc0Var, fe0 fe0Var, int i2) {
        x04 u2;
        x10 x10Var;
        vv vvVar;
        vv vvVar2 = q8.N;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-716443044);
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            cj1 cj1Var = (cj1) go1Var.k(dj1.a);
            boolean c2 = cj1Var.c();
            br3 br3Var = cj1Var.a;
            if (!c2) {
                go1Var.d0(-1862097794);
                tc0Var.invoke(go1Var, 6);
                go1Var.q(false);
                u2 = go1Var.u();
                if (u2 != null) {
                    x10Var = new x10(tc0Var, i2, (byte) 3);
                    u2.d = x10Var;
                }
                return;
            }
            go1Var.d0(-1862059354);
            go1Var.q(false);
            ne1 ne1Var = nq4.c;
            int ordinal = br3Var.ordinal();
            if (ordinal == 0) {
                vvVar = vvVar2;
            } else if (ordinal == 1) {
                vvVar = q8.Q;
            } else {
                if (ordinal != 2) {
                    s83.v();
                    return;
                }
                vvVar = q8.O;
            }
            uw2 c3 = px.c(vvVar, false);
            long j2 = go1Var.T;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, ne1Var);
            xd0.c.getClass();
            go1Var.h0();
            boolean z2 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z2) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, c3);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m2);
            Integer valueOf = Integer.valueOf(i3);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            l13 l13Var = i13.a;
            l13 C0 = i42.C0(l13Var, 20.0f);
            int ordinal2 = br3Var.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    l13 e2 = nq4.e(l13Var, 1.0f);
                    r11 r11Var = new r11(cj1Var.f() - 40.0f);
                    r11 r11Var2 = new r11(0.0f);
                    if (r11Var.compareTo(r11Var2) < 0) {
                        r11Var = r11Var2;
                    }
                    l13Var = nq4.i(e2, 0.0f, r11Var.I, 1);
                } else {
                    if (ordinal2 != 2) {
                        s83.v();
                        return;
                    }
                    r11 r11Var3 = new r11(cj1Var.g() - 40.0f);
                    r11 r11Var4 = new r11(0.0f);
                    if (r11Var3.compareTo(r11Var4) < 0) {
                        r11Var3 = r11Var4;
                    }
                    l13Var = nq4.b(nq4.n(l13Var, r11Var3.I), 1.0f);
                }
            }
            l13 then = C0.then(l13Var);
            uw2 c4 = px.c(vvVar2, false);
            long j3 = go1Var.T;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            l13 x02 = i42.x0(go1Var, then);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c4);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(i4, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            tc0Var.invoke(go1Var, 6);
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        u2 = go1Var.u();
        if (u2 != null) {
            x10Var = new x10(tc0Var, i2, (byte) 4);
            u2.d = x10Var;
        }
    }

    public static void g0(int[] iArr, int[] iArr2) {
        int i2 = iArr[32];
        int i3 = i2;
        int i4 = 16;
        while (true) {
            int i5 = i4 - 1;
            if (i5 < 0) {
                break;
            }
            int i6 = iArr[i4 + 15];
            iArr2[i5] = (i3 << (-9)) | (i6 >>> 9);
            i3 = i6;
            i4 = i5;
        }
        int g2 = dq2.g(16, iArr, iArr2) + ((i3 << (-9)) >>> 23) + (i2 >>> 9);
        if (g2 > 511 || (g2 == 511 && dq2.B(16, iArr2, K))) {
            g2 = (dq2.X(iArr2) + g2) & 511;
        }
        iArr2[16] = g2;
    }

    public static final void h(final long j2, final boolean z2, l13 l13Var, fe0 fe0Var, final int i2) {
        int i3;
        final l13 l13Var2;
        e02 e02Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-110330459);
        if ((i2 & 6) == 0) {
            i3 = i2 | (go1Var.f(j2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.h(z2) ? 32 : 16;
        }
        int i4 = i3 | RendererCapabilities.DECODER_SUPPORT_MASK;
        if (go1Var.T(i4 & 1, (i4 & 147) != 146)) {
            if (z2) {
                go1Var.d0(-1204594659);
                e02Var = c21.i(c21.F("liveDot", go1Var), 1.0f, 0.35f, qb.R(qb.k0(800, 2, m61.a), d44.J, 0L, 4), "liveDotAlpha", go1Var);
                go1Var.q(false);
            } else {
                go1Var.d0(-1204219063);
                go1Var.q(false);
                e02Var = null;
            }
            i13 i13Var = i13.a;
            l13 k2 = nq4.k(i13Var, 8.0f);
            boolean g2 = go1Var.g(e02Var) | ((i4 & 14) == 4);
            Object Q2 = go1Var.Q();
            if (g2 || Q2 == de0.a) {
                Q2 = new bm2(j2, e02Var);
                go1Var.o0(Q2);
            }
            oh4.a(go1Var, j42.t(k2, (tm1) Q2));
            l13Var2 = i13Var;
        } else {
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1() { // from class: cm2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eu5.h(j2, z2, l13Var2, (fe0) obj, mu0.X(i2 | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static void h0(int[] iArr) {
        int i2 = iArr[16];
        int i3 = dq2.i(16, i2 >>> 9, iArr) + (i2 & 511);
        if (i3 > 511 || (i3 == 511 && dq2.B(16, iArr, K))) {
            i3 = (dq2.X(iArr) + i3) & 511;
        }
        iArr[16] = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x014e, code lost:
    
        if (r30 == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0302 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x039e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0427 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final defpackage.op2 r48, boolean r49, final defpackage.hn1 r50, final defpackage.rm1 r51, final defpackage.l13 r52, defpackage.x70 r53, final defpackage.tm1 r54, defpackage.fe0 r55, int r56) {
        /*
            Method dump skipped, instructions count: 1193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu5.i(op2, boolean, hn1, rm1, l13, x70, tm1, fe0, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (((r1 >>> 32) != 0 ? defpackage.dq2.Z(5, 3, r12) : 0) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i0(int r11, int[] r12) {
        /*
            r0 = 5
            if (r11 == 0) goto L3c
            long r1 = (long) r11
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 21389(0x538d, double:1.05676E-319)
            long r5 = r5 * r1
            r11 = 0
            r7 = r12[r11]
            long r7 = (long) r7
            long r7 = r7 & r3
            long r5 = r5 + r7
            int r7 = (int) r5
            r12[r11] = r7
            r7 = 32
            long r5 = r5 >>> r7
            r8 = 1
            r9 = r12[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r1 = r1 + r9
            long r1 = r1 + r5
            int r5 = (int) r1
            r12[r8] = r5
            long r1 = r1 >>> r7
            r5 = 2
            r6 = r12[r5]
            long r8 = (long) r6
            long r3 = r3 & r8
            long r1 = r1 + r3
            int r3 = (int) r1
            r12[r5] = r3
            long r1 = r1 >>> r7
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L35
            goto L3a
        L35:
            r11 = 3
            int r11 = defpackage.dq2.Z(r0, r11, r12)
        L3a:
            if (r11 != 0) goto L4a
        L3c:
            r11 = 4
            r11 = r12[r11]
            r1 = -1
            if (r11 != r1) goto L4f
            int[] r11 = defpackage.eu5.E
            boolean r11 = defpackage.dq2.V(r12, r11)
            if (r11 == 0) goto L4f
        L4a:
            r11 = 21389(0x538d, float:2.9972E-41)
            defpackage.dq2.c(r0, r11, r12)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu5.i0(int, int[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v18, types: [l13] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    public static final void j(go2 go2Var, boolean z2, boolean z3, ki1 ki1Var, rm1 rm1Var, rm1 rm1Var2, fe0 fe0Var, int i2) {
        go1 go1Var;
        i51 i51Var;
        long j2;
        boolean z4;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1788246695);
        int i3 = i2 | (go1Var2.g(go2Var) ? 4 : 2) | (go1Var2.h(z2) ? 32 : 16) | (go1Var2.g(ki1Var) ? 2048 : 1024) | (go1Var2.i(rm1Var) ? 16384 : 8192) | (go1Var2.i(rm1Var2) ? 131072 : 65536);
        if (go1Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            i51 i51Var2 = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var2)).a;
            Object Q2 = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var2);
            }
            t33 t33Var = (t33) Q2;
            t43 w2 = ut0.w(t33Var, go1Var2);
            Object Q3 = go1Var2.Q();
            if (Q3 == jpVar) {
                Q3 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q3);
            }
            t43 t43Var = (t43) Q3;
            long j3 = z3 ? k80Var.G : x70.f;
            if (z2) {
                i51Var = i51Var2;
                j2 = k80Var.d;
            } else {
                i51Var = i51Var2;
                j2 = k80Var.s;
            }
            long j4 = j2;
            boolean booleanValue = ((Boolean) t43Var.getValue()).booleanValue();
            if (z2) {
                j3 = k80Var.c;
            }
            cw4 t0 = p70.t0(booleanValue, j3, k80Var.u, ((Boolean) w2.getValue()).booleanValue(), "livePartitionContainer", go1Var2, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j4, k80Var.v, "livePartitionFg", go1Var2, 3072);
            vv vvVar = z3 ? q8.N : q8.M;
            i13 i13Var = i13.a;
            l13 H2 = p70.H(o7.m((z3 ? nq4.g(i13Var, 32.0f) : nq4.g(nq4.e(i13Var, 1.0f), 44.0f)).then(ki1Var != null ? j42.x(i13Var, ki1Var) : i13Var), jo.b), t0);
            boolean z5 = (i3 & 57344) == 16384;
            Object Q4 = go1Var2.Q();
            if (z5 || Q4 == jpVar) {
                z4 = false;
                Q4 = new xl2(rm1Var, t43Var, 0 == true ? 1 : 0);
                go1Var2.o0(Q4);
            } else {
                z4 = false;
            }
            i51 i51Var3 = i51Var;
            l13 E0 = i42.E0(i42.g0(r13.d(mw2.B(i42.A0(H2, (tm1) Q4), z4, t33Var, 1), null, null, null, null, rm1Var2, null, null, null, null, null, null, t33Var, 114431), false, null, new t64(0), t33Var, rm1Var, 3), 12.0f, 0.0f, 2);
            uw2 c2 = px.c(vvVar, false);
            long j5 = go1Var2.T;
            int i4 = (int) (j5 ^ (j5 >>> 32));
            am3 m2 = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, E0);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, c2);
            qi4.k(go1Var2, q8.b0, m2);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            r55.b(go2Var.b, p70.G(z3 ? i13Var : wx5.e(nq4.e(i13Var, 1.0f)), s0, j4, false, null, 12), j4, 0L, (((Boolean) t43Var.getValue()).booleanValue() || z2) ? qk1.P : qk1.N, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var2.k(i51Var3)).b.m, go1Var2, 0, 24960, 110520);
            go1Var = go1Var2;
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new yl2(go2Var, z2, z3, ki1Var, rm1Var, rm1Var2, i2, (byte) 0);
        }
    }

    public static void j0(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = i2 & 4294967295L;
            long j4 = (iArr[0] & 4294967295L) - j3;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j6;
                long j7 = (j6 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j7;
                j5 = j7 >> 32;
            }
            long j8 = (4294967295L & iArr[3]) + j3 + j5;
            iArr[3] = (int) j8;
            j2 = j8 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || dq2.Y(7, 4, iArr) == 0) && !(iArr[6] == -1 && il2.J(iArr, H))) {
            return;
        }
        x(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r16v9, types: [l13] */
    public static final void k(final LiveRoom liveRoom, final int i2, final boolean z2, final boolean z3, final boolean z4, final ki1 ki1Var, final ki1 ki1Var2, final tm1 tm1Var, final rm1 rm1Var, fe0 fe0Var, final int i3) {
        int i4;
        boolean z5;
        long j2;
        t43 t43Var;
        l13 R2;
        ?? r12;
        sg sgVar;
        i13 i13Var;
        df0 df0Var;
        float f2;
        cw4 cw4Var;
        long j3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(827838841);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? go1Var.g(liveRoom) : go1Var.i(liveRoom) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= go1Var.e(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var.h(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= go1Var.h(z3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= go1Var.h(z4) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= go1Var.g(ki1Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= go1Var.g(ki1Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= go1Var.i(tm1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= go1Var.i(rm1Var) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        int i5 = i4;
        if (go1Var.T(i5 & 1, (38347923 & i4) != 38347922)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            t43 w2 = ut0.w(t33Var, go1Var);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q3);
            }
            t43 t43Var2 = (t43) Q3;
            long j4 = z2 ? k80Var.d : k80Var.q;
            long j5 = z2 ? k80Var.d : k80Var.s;
            boolean booleanValue = ((Boolean) t43Var2.getValue()).booleanValue();
            if (z2) {
                z5 = booleanValue;
                j2 = k80Var.c;
            } else {
                z5 = booleanValue;
                j2 = x70.f;
            }
            cw4 t0 = p70.t0(z5, j2, k80Var.u, ((Boolean) w2.getValue()).booleanValue(), "liveRoomContainer", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), j4, k80Var.v, "liveRoomFg", go1Var, 3072);
            cw4 s02 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), j5, k80Var.v, "liveRoomMeta", go1Var, 3072);
            go1 go1Var2 = go1Var;
            String str = (String) o70.U0(liveRoom.getCover().getUrlList());
            if (str == null) {
                str = "";
            }
            boolean e2 = r13.e(go1Var2);
            i13 i13Var2 = i13.a;
            l13 H2 = p70.H(o7.m(nq4.e(i13Var2, 1.0f).then(ki1Var != null ? j42.x(i13Var2, ki1Var) : i13Var2), jo.b), t0);
            boolean g2 = ((i5 & 29360128) == 8388608) | go1Var2.g(str);
            Object Q4 = go1Var2.Q();
            if (g2 || Q4 == jpVar) {
                t43Var = t43Var2;
                Q4 = new m6(tm1Var, str, t43Var);
                go1Var2.o0(Q4);
            } else {
                t43Var = t43Var2;
            }
            l13 A0 = i42.A0(H2, (tm1) Q4);
            if (e2) {
                go1Var2.d0(984248001);
                go1Var2.q(false);
                r12 = 0;
                R2 = i13Var2;
            } else {
                go1Var2.d0(984248774);
                boolean z6 = (i5 & 3670016) == 1048576;
                Object Q5 = go1Var2.Q();
                if (z6 || Q5 == jpVar) {
                    Q5 = new vl2(ki1Var2, (byte) 3);
                    go1Var2.o0(Q5);
                }
                R2 = qg5.R(i13Var2, (tm1) Q5);
                r12 = 0;
                go1Var2.q(false);
            }
            l13 C0 = i42.C0(r13.d(mw2.B(A0.then(R2), r12, t33Var, 1), null, null, null, null, rm1Var, null, null, null, null, null, new t64(r12), t33Var, 65279), 8.0f);
            uv uvVar = q8.T;
            t43 t43Var3 = t43Var;
            u74 a2 = t74.a(new kp(12.0f, true, new y9()), uvVar, go1Var2, 54);
            long j6 = go1Var2.T;
            int i6 = (int) (j6 ^ (j6 >>> 32));
            am3 m2 = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, C0);
            xd0.c.getClass();
            go1Var2.h0();
            boolean z7 = go1Var2.S;
            df0 df0Var2 = wa2.A0;
            if (z7) {
                go1Var2.l(df0Var2);
            } else {
                go1Var2.r0();
            }
            sg sgVar2 = q8.c0;
            qi4.k(go1Var2, sgVar2, a2);
            sg sgVar3 = q8.b0;
            qi4.k(go1Var2, sgVar3, m2);
            Integer valueOf = Integer.valueOf(i6);
            sg sgVar4 = q8.d0;
            qi4.k(go1Var2, sgVar4, valueOf);
            qi4.j(go1Var2);
            sg sgVar5 = q8.a0;
            qi4.k(go1Var2, sgVar5, x0);
            l13 p2 = mw2.p(o7.m(j42.e(nq4.n(i13Var2, z3 ? 104.0f : 112.0f), 1.7777778f, false), l74.a(10.0f)), k80Var.H, mw2.j);
            uw2 c2 = px.c(q8.N, false);
            long j7 = go1Var2.T;
            int i7 = (int) (j7 ^ (j7 >>> 32));
            am3 m3 = go1Var2.m();
            l13 x02 = i42.x0(go1Var2, p2);
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(df0Var2);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar2, c2);
            qi4.k(go1Var2, sgVar3, m3);
            r7.G(i7, go1Var2, sgVar4, go1Var2);
            qi4.k(go1Var2, sgVar5, x02);
            if (str.length() > 0) {
                go1Var2.d0(1998083257);
                sgVar = sgVar2;
                i13Var = i13Var2;
                df0Var = df0Var2;
                f2 = 1.0f;
                SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str, go1Var2), null, nq4.c, null, null, null, li0.a, 0.0f, null, 0, false, go1Var2, 1573296, 0, 1976);
                go1Var2 = go1Var2;
                go1Var2.q(false);
            } else {
                sgVar = sgVar2;
                i13Var = i13Var2;
                df0Var = df0Var2;
                f2 = 1.0f;
                go1Var2.d0(1998337395);
                go1Var2.q(false);
            }
            go1Var2.q(true);
            sc2 sc2Var = new sc2(f2, true);
            ba0 a3 = z90.a(new kp(2.0f, true, new y9()), q8.V, go1Var2, 6);
            long j8 = go1Var2.T;
            int i8 = (int) (j8 ^ (j8 >>> 32));
            am3 m4 = go1Var2.m();
            l13 x03 = i42.x0(go1Var2, sc2Var);
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, a3);
            qi4.k(go1Var2, sgVar3, m4);
            r7.G(i8, go1Var2, sgVar4, go1Var2);
            qi4.k(go1Var2, sgVar5, x03);
            String nickname = liveRoom.getOwner().getNickname();
            if (nickname.length() == 0) {
                nickname = hf1.u(i2 + 1, "频道 ");
            }
            go1 go1Var3 = go1Var2;
            r55.b(nickname, p70.G(wx5.e(nq4.e(i13Var, f2)), s0, j4, false, null, 12), j4, 0L, (((Boolean) t43Var3.getValue()).booleanValue() || z2) ? qk1.P : qk1.O, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var2.k(i51Var)).b.i, go1Var3, 0, 24960, 110520);
            go1 go1Var4 = go1Var3;
            if (z3) {
                cw4Var = s02;
                j3 = j5;
                go1Var4.d0(481251171);
                go1Var4.q(false);
            } else {
                go1Var4.d0(480758705);
                String title = liveRoom.getTitle();
                if (title.length() == 0) {
                    title = "暂无节目";
                }
                m65 m65Var = ((fw2) go1Var4.k(i51Var)).b.l;
                l13 G2 = p70.G(wx5.e(nq4.e(i13Var, f2)), s02, j5, false, null, 12);
                cw4Var = s02;
                r55.b(title, G2, j5, 0L, null, 0L, null, 0L, 2, false, 1, 0, m65Var, go1Var4, 0, 24960, 110584);
                j3 = j5;
                go1Var4 = go1Var4;
                go1Var4.q(false);
            }
            String displayViewerCount = LiveRoomUtilsKt.displayViewerCount(liveRoom);
            u74 a4 = t74.a(new kp(4.0f, true, new y9()), uvVar, go1Var4, 54);
            long j9 = go1Var4.T;
            int i9 = (int) (j9 ^ (j9 >>> 32));
            am3 m5 = go1Var4.m();
            l13 x04 = i42.x0(go1Var4, i13Var);
            go1Var4.h0();
            if (go1Var4.S) {
                go1Var4.l(df0Var);
            } else {
                go1Var4.r0();
            }
            qi4.k(go1Var4, sgVar, a4);
            qi4.k(go1Var4, sgVar3, m5);
            r7.G(i9, go1Var4, sgVar4, go1Var4);
            qi4.k(go1Var4, sgVar5, x04);
            if (z2) {
                go1Var4.d0(676973062);
                h(((Boolean) t43Var3.getValue()).booleanValue() ? k80Var.v : k80Var.d, z4, null, go1Var4, (i5 >> 9) & 112);
                go1Var4.q(false);
            } else {
                go1Var4.d0(677373799);
                go1Var4.q(false);
            }
            go1 go1Var5 = go1Var4;
            r55.b(z2 ? r7.C("正在看 · ", displayViewerCount, " 人") : r7.B(displayViewerCount, " 人在看"), p70.G(i13Var, cw4Var, j3, false, null, 12), j3, 0L, null, 0L, null, 0L, 2, false, 1, 0, xc3.f, go1Var5, 0, 24960, 110584);
            go1Var = go1Var5;
            r7.J(go1Var, true, true, true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1() { // from class: am2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eu5.k(LiveRoom.this, i2, z2, z3, z4, ki1Var, ki1Var2, tm1Var, rm1Var, (fe0) obj, mu0.X(i3 | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static void k0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        dq2.A0(iArr, iArr3);
        d0(iArr3, iArr2);
    }

    public static final void l(int i2, fe0 fe0Var, rm1 rm1Var, l13 l13Var, boolean z2) {
        int i3;
        rm1 rm1Var2;
        l13 l13Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1721869390);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g("返回上一级") ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            rm1Var2 = rm1Var;
            i3 |= go1Var.i(rm1Var2) ? 32 : 16;
        } else {
            rm1Var2 = rm1Var;
        }
        int i4 = i3 | RendererCapabilities.DECODER_SUPPORT_MASK;
        if ((i2 & 3072) == 0) {
            i4 |= go1Var.h(z2) ? 2048 : 1024;
        }
        int i5 = i4 | 24576;
        if (go1Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q3);
            }
            t43 t43Var = (t43) Q3;
            t43 w2 = ut0.w(t33Var, go1Var);
            long j2 = z2 ? k80Var.d : k80Var.s;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), z2 ? k80Var.c : k80Var.G, k80Var.u, ((Boolean) w2.getValue()).booleanValue(), "player-btn-bg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j2, k80Var.v, "player-btn-fg", go1Var, 3072);
            i13 i13Var = i13.a;
            l13 H2 = p70.H(o7.m(nq4.g(i13Var, 48.0f), jo.b), t0);
            Object Q4 = go1Var.Q();
            if (Q4 == jpVar) {
                Q4 = new gm4(t43Var, (byte) 11);
                go1Var.o0(Q4);
            }
            l13 d2 = r13.d(i42.A0(H2, (tm1) Q4), null, null, null, null, rm1Var2, null, null, null, null, null, null, t33Var, 130815);
            uw2 c2 = px.c(q8.N, false);
            long j3 = go1Var.T;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, d2);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i6));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            r55.b("返回上一级", p70.G(i13Var, s0, j2, false, null, 12), j2, oh4.j(15), qk1.P, 0L, null, 0L, 0, false, 0, 0, null, go1Var, (i5 & 14) | 1597440, 0, 262056);
            go1Var = go1Var;
            go1Var.q(true);
            l13Var2 = i13Var;
        } else {
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new rv0((Object) rm1Var, (Object) l13Var2, z2, i2, (byte) 5);
        }
    }

    public static void l0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        I(jArr, jArr3);
        e0(jArr3, jArr2);
    }

    public static final void m(rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i2) {
        int i3;
        rm1 rm1Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1530382070);
        if ((i2 & 6) == 0) {
            i3 = i2 | (go1Var.i(rm1Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.g(l13Var) ? 32 : 16;
        }
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q3);
            }
            t43 t43Var = (t43) Q3;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.G, k80Var.u, ((Boolean) ut0.w(t33Var, go1Var).getValue()).booleanValue(), "player-icon-btn-bg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.q, k80Var.v, "player-icon-btn-fg", go1Var, 3072);
            l13 H2 = p70.H(o7.m(nq4.k(l13Var, 48.0f), jo.b), t0);
            Object Q4 = go1Var.Q();
            if (Q4 == jpVar) {
                Q4 = new gm4(t43Var, (byte) 10);
                go1Var.o0(Q4);
            }
            l13 d2 = r13.d(i42.A0(H2, (tm1) Q4), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815);
            rm1Var2 = rm1Var;
            uw2 c2 = px.c(q8.N, false);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, d2);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            ow1.a(c5.I(), "返回", p70.G(nq4.k(i13.a, 24.0f), s0, k80Var.q, false, null, 12), k80Var.q, go1Var, 48);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            rm1Var2 = rm1Var;
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new jo0(rm1Var2, l13Var, i2, (byte) 2);
        }
    }

    public static void m0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        il2.d0(iArr, iArr3);
        f0(iArr3, iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x074f  */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final defpackage.hu2 r79, final java.util.List r80, final int r81, final long r82, final int r84, final int r85, final boolean r86, defpackage.rm1 r87, final defpackage.tm1 r88, final defpackage.in1 r89, final defpackage.rm1 r90, final defpackage.tm1 r91, final defpackage.tm1 r92, final defpackage.tm1 r93, defpackage.l13 r94, defpackage.fe0 r95, final int r96) {
        /*
            Method dump skipped, instructions count: 2626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu5.n(hu2, java.util.List, int, long, int, int, boolean, rm1, tm1, in1, rm1, tm1, tm1, tm1, l13, fe0, int):void");
    }

    public static void n0(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        dq2.A0(iArr, iArr3);
        while (true) {
            d0(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                dq2.A0(iArr2, iArr3);
            }
        }
    }

    public static final void o(dl0 dl0Var, t43 t43Var, t43 t43Var2, t43 t43Var3, String str, boolean z2) {
        t43Var.setValue(str);
        t43Var2.setValue(Boolean.valueOf(z2));
        p70.g0(dl0Var, null, null, new dg5(str, t43Var, t43Var3, t43Var2, null, (byte) 0), 3);
    }

    public static void o0(int i2, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        I(jArr, jArr3);
        while (true) {
            e0(jArr3, jArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                I(jArr2, jArr3);
            }
        }
    }

    public static final String p(a22 a22Var) {
        long j2;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j3 = a22Var.I;
        long j4 = j3 / 86400;
        if ((j3 ^ 86400) < 0 && j4 * 86400 != j3) {
            j4--;
        }
        long j5 = j3 % 86400;
        int i2 = (int) (j5 + (86400 & (((j5 ^ 86400) & ((-j5) | j5)) >> 63)));
        long j6 = 719468 + j4;
        if (j6 < 0) {
            long j7 = ((j4 + 719469) / 146097) - 1;
            j2 = j7 * 400;
            j6 += (-j7) * 146097;
        } else {
            j2 = 0;
        }
        long j8 = ((400 * j6) + 591) / 146097;
        long j9 = j6 - ((j8 / 400) + (((j8 / 4) + (365 * j8)) - (j8 / 100)));
        if (j9 < 0) {
            j8--;
            j9 = j6 - ((j8 / 400) + (((j8 / 4) + (365 * j8)) - (j8 / 100)));
        }
        int i3 = (int) j9;
        int i4 = ((i3 * 5) + 2) / 153;
        int i5 = ((i4 + 2) % 12) + 1;
        int i6 = (i3 - (((i4 * 306) + 5) / 10)) + 1;
        int i7 = (int) (j8 + j2 + (i4 / 10));
        int i8 = i2 / 3600;
        int i9 = i2 - (i8 * 3600);
        int i10 = i9 / 60;
        int i11 = i9 - (i10 * 60);
        int i12 = a22Var.J;
        int i13 = 0;
        if (Math.abs(i7) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i7 >= 0) {
                sb2.append(i7 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i7 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i7 >= 10000) {
                sb.append('+');
            }
            sb.append(i7);
        }
        sb.append('-');
        B(sb, sb, i5);
        sb.append('-');
        B(sb, sb, i6);
        sb.append('T');
        B(sb, sb, i8);
        sb.append(':');
        B(sb, sb, i10);
        sb.append(':');
        B(sb, sb, i11);
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                int i14 = i13 + 1;
                iArr = k;
                if (i12 % iArr[i14] != 0) {
                    break;
                }
                i13 = i14;
            }
            int i15 = i13 - (i13 % 3);
            String valueOf = String.valueOf((i12 / iArr[i15]) + iArr[9 - i15]);
            valueOf.getClass();
            sb.append(valueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }

    public static void p0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (dq2.C0(iArr, iArr2, iArr3) != 0) {
            dq2.D0(5, 21389, iArr3);
        }
    }

    public static final e22 q(String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt;
        char charAt2;
        byte b2 = 16;
        if (str.length() == 0) {
            return new g12("An empty string is not a valid Instant", str, b2);
        }
        byte b3 = 0;
        char charAt3 = str.charAt(0);
        byte b4 = 1;
        if (charAt3 == '+' || charAt3 == '-') {
            i2 = 1;
        } else {
            i2 = 0;
            charAt3 = ' ';
        }
        int i7 = 0;
        int i8 = i2;
        while (i8 < str.length() && '0' <= (charAt2 = str.charAt(i8)) && charAt2 < ':') {
            i7 = (i7 * 10) + (str.charAt(i8) - '0');
            i8++;
        }
        int i9 = i8 - i2;
        if (i9 > 10) {
            return Y(str, "Expected at most 10 digits for the year number, got " + i9 + " digits");
        }
        if (i9 == 10 && str.charAt(i2) >= '2') {
            return Y(str, "Expected at most 9 digits for the year number or year 1000000000, got " + i9 + " digits");
        }
        if (i9 < 4) {
            return Y(str, "The year number must be padded to 4 digits, got " + i9 + " digits");
        }
        if (charAt3 == '+' && i9 == 4) {
            return Y(str, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (charAt3 == ' ' && i9 != 4) {
            return Y(str, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (charAt3 == '-') {
            i7 = -i7;
        }
        int i10 = i8 + 16;
        if (str.length() < i10) {
            return Y(str, "The input string is too short");
        }
        g12 X = X(str, "'-'", i8, new m90((byte) 27));
        if (X != null) {
            return X;
        }
        g12 X2 = X(str, "'-'", i8 + 3, new m90((byte) 28));
        if (X2 != null) {
            return X2;
        }
        g12 X3 = X(str, "'T' or 't'", i8 + 6, new m90((byte) 29));
        if (X3 != null) {
            return X3;
        }
        g12 X4 = X(str, "':'", i8 + 9, new c22(b3));
        if (X4 != null) {
            return X4;
        }
        g12 X5 = X(str, "':'", i8 + 12, new c22(b4));
        if (X5 != null) {
            return X5;
        }
        int i11 = 0;
        while (true) {
            byte b5 = 2;
            if (i11 >= 10) {
                int Z = Z(i8 + 1, str);
                int Z2 = Z(i8 + 4, str);
                int Z3 = Z(i8 + 7, str);
                int Z4 = Z(i8 + 10, str);
                int Z5 = Z(i8 + 13, str);
                int i12 = i8 + 15;
                if (str.charAt(i12) == '.') {
                    i12 = i10;
                    int i13 = 0;
                    while (i12 < str.length() && '0' <= (charAt = str.charAt(i12)) && charAt < ':') {
                        i13 = (i13 * 10) + (str.charAt(i12) - '0');
                        i12++;
                    }
                    int i14 = i12 - i10;
                    if (1 > i14 || i14 >= 10) {
                        return Y(str, "1..9 digits are supported for the fraction of the second, got " + i14 + " digits");
                    }
                    i3 = i13 * k[9 - i14];
                } else {
                    i3 = 0;
                }
                if (i12 >= str.length()) {
                    return Y(str, "The UTC offset at the end of the string is missing");
                }
                char charAt4 = str.charAt(i12);
                if (charAt4 == '+' || charAt4 == '-') {
                    int length = str.length() - i12;
                    if (length > 9) {
                        return Y(str, "The UTC offset string \"" + u0(16, str.subSequence(i12, str.length()).toString()) + "\" is too long");
                    }
                    if (length % 3 != 0) {
                        return Y(str, "Invalid UTC offset string \"" + str.subSequence(i12, str.length()).toString() + '\"');
                    }
                    for (int i15 = 0; i15 < 2 && (i6 = m[i15] + i12) < str.length(); i15++) {
                        if (str.charAt(i6) != ':') {
                            StringBuilder C2 = hf1.C("Expected ':' at index ", i6, ", got '");
                            C2.append(str.charAt(i6));
                            C2.append('\'');
                            return Y(str, C2.toString());
                        }
                    }
                    int i16 = 0;
                    while (i16 < 6 && (i5 = n[i16] + i12) < str.length()) {
                        char charAt5 = str.charAt(i5);
                        int i17 = i16;
                        if ('0' > charAt5 || charAt5 >= ':') {
                            StringBuilder C3 = hf1.C("Expected an ASCII digit at index ", i5, ", got '");
                            C3.append(str.charAt(i5));
                            C3.append('\'');
                            return Y(str, C3.toString());
                        }
                        i16 = i17 + 1;
                    }
                    int Z6 = Z(i12 + 1, str);
                    int Z7 = length > 3 ? Z(i12 + 4, str) : 0;
                    int Z8 = length > 6 ? Z(i12 + 7, str) : 0;
                    if (Z7 > 59) {
                        return Y(str, "Expected offset-minute-of-hour in 0..59, got " + Z7);
                    }
                    if (Z8 > 59) {
                        return Y(str, "Expected offset-second-of-minute in 0..59, got " + Z8);
                    }
                    if (Z6 > 17 && (Z6 != 18 || Z7 != 0 || Z8 != 0)) {
                        return Y(str, "Expected an offset in -18:00..+18:00, got " + str.subSequence(i12, str.length()).toString());
                    }
                    i4 = ((Z7 * 60) + (Z6 * 3600) + Z8) * (charAt4 == '-' ? -1 : 1);
                } else {
                    if (charAt4 != 'Z' && charAt4 != 'z') {
                        return Y(str, "Expected the UTC offset at position " + i12 + ", got '" + charAt4 + '\'');
                    }
                    int i18 = i12 + 1;
                    if (str.length() != i18) {
                        return Y(str, "Extra text after the instant at position " + i18);
                    }
                    i4 = 0;
                }
                if (1 > Z || Z >= 13) {
                    return Y(str, "Expected a month number in 1..12, got " + Z);
                }
                if (1 <= Z2) {
                    int i19 = i7 & 3;
                    if (Z2 <= (Z != 2 ? (Z == 4 || Z == 6 || Z == 9 || Z == 11) ? 30 : 31 : i19 == 0 && (i7 % 100 != 0 || i7 % 400 == 0) ? 29 : 28)) {
                        if (Z3 > 23) {
                            return Y(str, "Expected hour in 0..23, got " + Z3);
                        }
                        if (Z4 > 59) {
                            return Y(str, "Expected minute-of-hour in 0..59, got " + Z4);
                        }
                        if (Z5 > 59) {
                            return Y(str, "Expected second-of-minute in 0..59, got " + Z5);
                        }
                        long j2 = i7;
                        long j3 = 365 * j2;
                        long j4 = (j2 >= 0 ? ((j2 + 399) / 400) + (((j2 + 3) / 4) - ((j2 + 99) / 100)) + j3 : j3 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))))) + (((Z * 367) - 362) / 12) + (Z2 - 1);
                        if (Z > 2) {
                            j4 = (i19 != 0 || (i7 % 100 == 0 && i7 % 400 != 0)) ? j4 - 2 : (-1) + j4;
                        }
                        return new d22((((j4 - 719528) * 86400) + (((Z4 * 60) + (Z3 * 3600)) + Z5)) - i4, i3);
                    }
                }
                StringBuilder D2 = hf1.D("Expected a valid day-of-month for month ", Z, " of year ", i7, ", got ");
                D2.append(Z2);
                return Y(str, D2.toString());
            }
            g12 X6 = X(str, "an ASCII digit", l[i11] + i8, new c22(b5));
            if (X6 != null) {
                return X6;
            }
            i11++;
        }
    }

    public static void q0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (il2.e0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) + 1;
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j4;
                long j5 = (j4 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = ((4294967295L & iArr3[3]) - 1) + j3;
            iArr3[3] = (int) j6;
            if ((j6 >> 32) != 0) {
                dq2.z(7, 4, iArr3);
            }
        }
    }

    public static void r(int[] iArr, int[] iArr2, int[] iArr3) {
        if (il2.f(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && il2.J(iArr3, H))) {
            x(iArr3);
        }
    }

    public static void r0(int[] iArr, int[] iArr2, int[] iArr3) {
        int B0 = (dq2.B0(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (B0 < 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= 16) {
                    i2 = -1;
                    break;
                }
                int i4 = iArr3[i3] - 1;
                iArr3[i3] = i4;
                if (i4 != -1) {
                    break;
                } else {
                    i3++;
                }
            }
            B0 = (B0 + i2) & 511;
        }
        iArr3[16] = B0;
    }

    public static void s(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 9; i2++) {
            jArr3[i2] = jArr[i2] ^ jArr2[i2];
        }
    }

    public static final l13 s0() {
        return new d15(P);
    }

    public static void t(int[] iArr, int[] iArr2, int[] iArr3) {
        int a2 = dq2.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (a2 > 511 || (a2 == 511 && dq2.B(16, iArr3, K))) {
            a2 = (dq2.X(iArr3) + a2) & 511;
        }
        iArr3[16] = a2;
    }

    public static final l13 t0(l13 l13Var, v05 v05Var, o45 o45Var, p45 p45Var, ck0 ck0Var) {
        return l13Var.then(new k35(v05Var, o45Var, p45Var, ck0Var));
    }

    public static void u(long[] jArr, int i2, long[] jArr2, int i3, long[] jArr3, int i4) {
        for (int i5 = 0; i5 < 9; i5++) {
            int i6 = i4 + i5;
            jArr3[i6] = jArr3[i6] ^ (jArr[i2 + i5] ^ jArr2[i3 + i5]);
        }
    }

    public static final String u0(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    public static void v(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 9; i2++) {
            jArr3[i2] = jArr3[i2] ^ (jArr[i2] ^ jArr2[i2]);
        }
    }

    public static void v0(int[] iArr, int[] iArr2) {
        if (dq2.x0(5, 0, iArr, iArr2) != 0 || (iArr2[4] == -1 && dq2.V(iArr2, E))) {
            dq2.c(5, 21389, iArr2);
        }
    }

    public static void w(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 18; i2++) {
            jArr3[i2] = jArr[i2] ^ jArr2[i2];
        }
    }

    public static void w0(int[] iArr, int[] iArr2) {
        if (dq2.x0(7, 0, iArr, iArr2) != 0 || (iArr2[6] == -1 && il2.J(iArr2, H))) {
            x(iArr2);
        }
    }

    public static void x(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        long j6 = (4294967295L & iArr[3]) + 1 + j3;
        iArr[3] = (int) j6;
        if ((j6 >> 32) != 0) {
            dq2.Y(7, 4, iArr);
        }
    }

    public static int x0(int i2, byte[] bArr) {
        return (bArr[i2 + 1] - 48) + ((bArr[i2] - 48) * 10);
    }

    public static boolean y(sz5 sz5Var, sz5 sz5Var2) {
        rz3[] rz3VarArr = sz5Var.L;
        if (rz3VarArr.length == sz5Var2.L.length) {
            rz3[] rz3VarArr2 = (rz3[]) rz3VarArr.clone();
            rz3[] rz3VarArr3 = (rz3[]) sz5Var2.L.clone();
            boolean z2 = (rz3VarArr2[0].m() == null || rz3VarArr3[0].m() == null) ? false : !r0.I.r(r1.I);
            for (int i2 = 0; i2 != rz3VarArr2.length; i2++) {
                rz3 rz3Var = rz3VarArr2[i2];
                if (z2) {
                    for (int length = rz3VarArr3.length - 1; length >= 0; length--) {
                        rz3 rz3Var2 = rz3VarArr3[length];
                        if (rz3Var2 != null && e21.L(rz3Var, rz3Var2)) {
                            rz3VarArr3[length] = null;
                        }
                    }
                } else {
                    for (int i3 = 0; i3 != rz3VarArr3.length; i3++) {
                        rz3 rz3Var3 = rz3VarArr3[i3];
                        if (rz3Var3 != null && e21.L(rz3Var, rz3Var3)) {
                            rz3VarArr3[i3] = null;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean y0(int i2, byte[] bArr) {
        return i2 + 2 <= bArr.length && J(bArr[i2]) && J(bArr[i2 + 1]);
    }

    public static void z(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        byte[] bArr3 = (i5 & 16) == 16 ? c : (i5 & 32) == 32 ? d : b;
        int i6 = (i3 > 1 ? (bArr[i2 + 1] << 24) >>> 16 : 0) | (i3 > 0 ? (bArr[i2] << 24) >>> 8 : 0) | (i3 > 2 ? (bArr[i2 + 2] << 24) >>> 24 : 0);
        if (i3 == 1) {
            bArr2[i4] = bArr3[i6 >>> 18];
            bArr2[i4 + 1] = bArr3[(i6 >>> 12) & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            return;
        }
        if (i3 == 2) {
            bArr2[i4] = bArr3[i6 >>> 18];
            bArr2[i4 + 1] = bArr3[(i6 >>> 12) & 63];
            bArr2[i4 + 2] = bArr3[(i6 >>> 6) & 63];
            bArr2[i4 + 3] = 61;
            return;
        }
        if (i3 != 3) {
            return;
        }
        bArr2[i4] = bArr3[i6 >>> 18];
        bArr2[i4 + 1] = bArr3[(i6 >>> 12) & 63];
        bArr2[i4 + 2] = bArr3[(i6 >>> 6) & 63];
        bArr2[i4 + 3] = bArr3[i6 & 63];
    }

    public static boolean z0(int i2, byte[] bArr) {
        int x0 = x0(i2, bArr);
        int x02 = x0(i2 + 2, bArr);
        return x0 >= 1 && x0 <= 12 && x02 >= 1 && x02 <= 31 && x0(i2 + 4, bArr) <= 23;
    }
}
