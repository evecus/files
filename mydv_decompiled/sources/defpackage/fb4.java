package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.TtsSpan;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class fb4 implements cs5 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;
    public static hx1 d;

    public static void A(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    public static void B(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((j4 >>> 57) ^ (jArr2[1] << 7)) & 144115188075855871L;
        long j6 = j4 & 144115188075855871L;
        long[] jArr4 = new long[6];
        D(jArr3, j3, j6, jArr4, 0);
        D(jArr3, j2, j5, jArr4, 2);
        D(jArr3, j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr4[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    public static void C(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        A(jArr, jArr4);
        A(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i = 0; i < 7; i++) {
            E(jArr6, jArr4[i], jArr5[i], jArr3, i << 1);
        }
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2] ^ j;
        long j4 = j3 ^ j2;
        jArr3[1] = j4;
        long j5 = j2 ^ jArr3[3];
        long j6 = j3 ^ jArr3[4];
        long j7 = j6 ^ j5;
        jArr3[2] = j7;
        long j8 = j5 ^ jArr3[5];
        long j9 = j6 ^ jArr3[6];
        long j10 = j9 ^ j8;
        jArr3[3] = j10;
        long j11 = j8 ^ jArr3[7];
        long j12 = j9 ^ jArr3[8];
        long j13 = j12 ^ j11;
        jArr3[4] = j13;
        long j14 = j11 ^ jArr3[9];
        long j15 = j12 ^ jArr3[10];
        long j16 = j15 ^ j14;
        jArr3[5] = j16;
        long j17 = j14 ^ jArr3[11];
        long j18 = j15 ^ jArr3[12];
        long j19 = j18 ^ j17;
        jArr3[6] = j19;
        long j20 = (j17 ^ jArr3[13]) ^ j18;
        jArr3[7] = j ^ j20;
        jArr3[8] = j4 ^ j20;
        jArr3[9] = j7 ^ j20;
        jArr3[10] = j10 ^ j20;
        jArr3[11] = j13 ^ j20;
        jArr3[12] = j16 ^ j20;
        jArr3[13] = j19 ^ j20;
        E(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        E(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        E(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        E(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        E(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        E(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        E(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        E(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        E(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        E(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        E(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        E(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        E(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        E(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        E(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        E(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        E(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        E(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        E(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        E(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        E(jArr6, jArr4[5] ^ jArr4[6], jArr5[5] ^ jArr5[6], jArr3, 11);
        long j21 = jArr3[0];
        long j22 = jArr3[1];
        long j23 = jArr3[2];
        long j24 = jArr3[3];
        long j25 = jArr3[4];
        long j26 = jArr3[5];
        long j27 = jArr3[6];
        long j28 = jArr3[7];
        long j29 = jArr3[8];
        long j30 = jArr3[9];
        long j31 = jArr3[10];
        long j32 = jArr3[11];
        long j33 = jArr3[12];
        long j34 = jArr3[13];
        jArr3[0] = j21 ^ (j22 << 59);
        jArr3[1] = (j22 >>> 5) ^ (j23 << 54);
        jArr3[2] = (j23 >>> 10) ^ (j24 << 49);
        jArr3[3] = (j24 >>> 15) ^ (j25 << 44);
        jArr3[4] = (j25 >>> 20) ^ (j26 << 39);
        jArr3[5] = (j26 >>> 25) ^ (j27 << 34);
        jArr3[6] = (j27 >>> 30) ^ (j28 << 29);
        jArr3[7] = (j28 >>> 35) ^ (j29 << 24);
        jArr3[8] = (j29 >>> 40) ^ (j30 << 19);
        jArr3[9] = (j30 >>> 45) ^ (j31 << 14);
        jArr3[10] = (j31 >>> 50) ^ (j32 << 9);
        jArr3[11] = ((j32 >>> 55) ^ (j33 << 4)) ^ (j34 << 63);
        jArr3[12] = j34 >>> 1;
    }

    public static void D(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        long j7 = jArr[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = 144115188075855871L & j7;
        jArr2[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void E(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        int i2 = (int) j;
        long j7 = (jArr[(i2 >>> 3) & 7] << 3) ^ jArr[i2 & 7];
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (576460752303423487L & j7);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j7 >>> 59) ^ (j8 << 5));
    }

    public static void F(long[] jArr, long[] jArr2) {
        e41.E(6, jArr, jArr2);
        jArr2[12] = e41.D((int) jArr[6]);
    }

    public static boolean G(Object obj) {
        return ((sk1) obj).d;
    }

    public static final boolean H(int i, KeyEvent keyEvent) {
        return ((int) (e21.w(keyEvent) >> 32)) == i;
    }

    public static boolean I(byte b2) {
        return b2 > -65;
    }

    public static final void J(Context context) {
        Map map;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            fr2.e().a(hx5.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = hx5.b;
            int J = sv2.J(strArr.length);
            if (J < 16) {
                J = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(J);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                map = Collections.singletonMap(databasePath2, noBackupFilesDir);
                map.getClass();
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, noBackupFilesDir);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        fr2.e().i(hx5.a, "Over-writing contents of " + file2);
                    }
                    fr2.e().a(hx5.a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public static void K(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        B(jArr, jArr2, jArr4);
        Q(jArr4, jArr3);
    }

    public static void L(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        C(jArr, jArr2, jArr4);
        R(jArr4, jArr3);
    }

    public static long M(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    public static final void O(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            q02.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float k = k(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * k);
                }
            }
            float sqrt = (float) Math.sqrt(k(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : k(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float k2 = k(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    k2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = k2 / fArr11[i14];
        }
    }

    public static byte[] P(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr, 0, 4096);
            if (read < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static void Q(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    public static void R(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j6 ^ (j9 << 39);
        long j11 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j12 = j8 ^ (j9 >>> 2);
        long j13 = jArr[11];
        long j14 = j5 ^ (j13 << 39);
        long j15 = j10 ^ ((j13 >>> 25) ^ (j13 << 62));
        long j16 = j11 ^ (j13 >>> 2);
        long j17 = jArr[10];
        long j18 = j4 ^ (j17 << 39);
        long j19 = j14 ^ ((j17 >>> 25) ^ (j17 << 62));
        long j20 = j15 ^ (j17 >>> 2);
        long j21 = jArr[9];
        long j22 = j3 ^ (j21 << 39);
        long j23 = j18 ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[8];
        long j26 = j ^ (j12 << 39);
        long j27 = (j2 ^ (j25 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j28 = (j22 ^ ((j25 >>> 25) ^ (j25 << 62))) ^ (j12 >>> 2);
        long j29 = j16 >>> 25;
        jArr2[0] = j26 ^ j29;
        jArr2[1] = (j29 << 23) ^ j27;
        jArr2[2] = j28;
        jArr2[3] = j23 ^ (j25 >>> 2);
        jArr2[4] = j24;
        jArr2[5] = j20;
        jArr2[6] = j16 & 33554431;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [qe0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [qe0] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, vo] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.runtime.Recomposer] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v5, types: [v52] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(defpackage.a85 r18, android.content.Context r19, defpackage.vo r20, defpackage.z75 r21, defpackage.wd3 r22, defpackage.gj0 r23) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb4.T(a85, android.content.Context, vo, z75, wd3, gj0):java.lang.Object");
    }

    public static l13 U(l13 l13Var, float f, dn4 dn4Var) {
        boolean z = r11.b(f, 0.0f) > 0;
        long j = nr1.a;
        return (r11.b(f, 0.0f) > 0 || z) ? l13Var.then(new bn4(f, dn4Var, z, j, j)) : l13Var;
    }

    public static final lq1 V(lq1 lq1Var, float f) {
        return y(f0(lq1Var, f), f);
    }

    public static void W(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        e41.E(2, jArr, jArr3);
        while (true) {
            Q(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                e41.E(2, jArr2, jArr3);
            }
        }
    }

    public static void X(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[13];
        F(jArr, jArr3);
        while (true) {
            R(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                F(jArr2, jArr3);
            }
        }
    }

    public static final TtsSpan Y(oi5 oi5Var) {
        if (oi5Var instanceof oi5) {
            return new TtsSpan.VerbatimBuilder(oi5Var.a).build();
        }
        s83.v();
        return null;
    }

    public static final String Z(int i) {
        o7.k(16);
        return li4.t(16, i & 4294967295L);
    }

    public static final uc5 a0(String str) {
        int i;
        o7.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (charAt < '0') {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647 || Integer.compare(i4, -1717986919) > 0) {
                    return null;
                }
                i3 = 429496729;
            }
            int i5 = i2 * 10;
            int i6 = digit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new uc5(i2);
    }

    public static final zc5 b0(String str) {
        str.getClass();
        int i = 10;
        o7.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (charAt < '0') {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), i);
            if (digit < 0) {
                return null;
            }
            long j3 = j ^ Long.MIN_VALUE;
            int i3 = length;
            if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                if (j2 != 512409557603043100L || Long.compare(j3, -7378697629483820647L) > 0) {
                    return null;
                }
                j2 = 1844674407370955161L;
            }
            long j4 = j * 10;
            long j5 = (digit & 4294967295L) + j4;
            if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = j5;
            length = i3;
            i = 10;
        }
        return new zc5(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c0(android.view.inputmethod.EditorInfo r12, defpackage.mx1 r13, defpackage.d55 r14) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb4.c0(android.view.inputmethod.EditorInfo, mx1, d55):void");
    }

    public static final void d(EditorInfo editorInfo) {
        if (c81.d()) {
            c81.a().i(editorInfo);
        }
    }

    public static final void d0(si4 si4Var, int i, cb4 cb4Var) {
        si4 si4Var2;
        b53 b53Var = new b53(new si4[16]);
        List i2 = si4Var.i(false, false);
        while (true) {
            b53Var.e(b53Var.K, i2);
            while (true) {
                int i3 = b53Var.K;
                if (i3 == 0) {
                    return;
                }
                si4Var2 = (si4) b53Var.l(i3 - 1);
                boolean H = mw2.H(si4Var2);
                ki4 ki4Var = si4Var2.d;
                n43 n43Var = ki4Var.I;
                if (!H && !n43Var.c(zi4.j)) {
                    na3 d2 = si4Var2.d();
                    if (d2 == null) {
                        throw r7.t("Expected semantics node to have a coordinator.");
                    }
                    v22 F = rt0.F(mu0.i(d2, true));
                    if (F.a < F.c && F.b < F.d) {
                        Object g = ki4Var.I.g(ii4.e);
                        if (g == null) {
                            g = null;
                        }
                        hn1 hn1Var = (hn1) g;
                        Object g2 = n43Var.g(zi4.w);
                        bb4 bb4Var = (bb4) (g2 != null ? g2 : null);
                        if (hn1Var != null && bb4Var != null && ((Number) bb4Var.b.invoke()).floatValue() > 0.0f) {
                            int i4 = 1 + i;
                            cb4Var.invoke(new eb4(si4Var2, i4, F, d2));
                            d0(si4Var2, i4, cb4Var);
                        }
                    }
                }
            }
            i2 = si4Var2.i(false, false);
        }
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static final void f(g73 g73Var, rp3 rp3Var) {
        ts2 ts2Var = (ts2) g73Var.J;
        li5 li5Var = ts2Var.b;
        li5 li5Var2 = ts2Var.a;
        boolean m = dq2.m(rp3Var);
        long j = rp3Var.b;
        if (m) {
            li5Var2.d();
            li5Var.d();
            ts2Var.c = 0L;
        }
        if (!dq2.o(rp3Var)) {
            List c2 = rp3Var.c();
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                gt1 gt1Var = (gt1) c2.get(i);
                ts2Var.a(gt1Var.a, pd3.f(gt1Var.e, 0L));
            }
            ts2Var.a(j, pd3.f(rp3Var.n, 0L));
        }
        if (dq2.o(rp3Var) && j - ts2Var.c > 40) {
            li5Var2.d();
            li5Var.d();
            ts2Var.c = 0L;
        }
        ts2Var.c = j;
    }

    public static final lq1 f0(lq1 lq1Var, float f) {
        return lq1Var.a(new yt5(new ax0(f)));
    }

    public static boolean g(dt5 dt5Var, ByteChannel byteChannel) {
        x11 x11Var;
        int i;
        LinkedBlockingQueue linkedBlockingQueue = dt5Var.b;
        ByteBuffer byteBuffer = (ByteBuffer) linkedBlockingQueue.peek();
        if (byteBuffer != null) {
            do {
                byteChannel.write(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    return false;
                }
                linkedBlockingQueue.poll();
                byteBuffer = (ByteBuffer) linkedBlockingQueue.peek();
            } while (byteBuffer != null);
        }
        if (!linkedBlockingQueue.isEmpty() || !dt5Var.h || (x11Var = dt5Var.k) == null || (i = x11Var.a) == 0 || i != 2) {
            return true;
        }
        if (dt5Var.p != null) {
            dt5Var.b(dt5Var.o.intValue(), dt5Var.n, dt5Var.p.booleanValue());
            return true;
        }
        zy.i("this method must be used in conjunction with flushAndClose");
        return false;
    }

    public static final void h(q44 q44Var, float f, long j) {
        float ceil = r11.c(f, Float.NaN) ? 0.0f : r11.c(f, 0.0f) ? 1.0f : (float) Math.ceil(f * q44Var.I);
        q44Var.f((byte) 8, q44Var.T, q44Var.U);
        ey4 ey4Var = q44Var.K;
        if (ey4Var != null) {
            ey4Var.a |= 256;
            ey4Var.k = ceil;
        }
        q44Var.f((byte) 35, q44Var.T, q44Var.U);
        bj bjVar = q44Var.T;
        bj bjVar2 = q44Var.U;
        ze5 ze5Var = ze5.a;
        if (bjVar == ze5Var) {
            if ((q44Var.S & 1) != 0) {
                q33 q33Var = q44Var.O;
                if (q33Var == null || (bjVar = (bj) q33Var.b(50)) == null) {
                    bjVar = r44.a;
                }
            } else {
                bjVar = null;
            }
        }
        if (bjVar2 == ze5Var) {
            if ((q44Var.S & 1) != 0) {
                q33 q33Var2 = q44Var.P;
                if (q33Var2 == null || (bjVar2 = (bj) q33Var2.b(50)) == null) {
                    bjVar2 = r44.a;
                }
            } else {
                bjVar2 = null;
            }
        }
        q44Var.S = (bjVar == null || bjVar2 == null) ? q44Var.S & (-2) : q44Var.S | 1;
        q44Var.g(50, bjVar, bjVar2);
        ey4 ey4Var2 = q44Var.K;
        if (ey4Var2 != null) {
            ey4Var2.d(j);
        }
    }

    public static final float k(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final lq1 m(lq1 lq1Var) {
        return lq1Var.a(new dt1(cx0.a));
    }

    public static final lq1 n(lq1 lq1Var) {
        return m(o(lq1Var));
    }

    public static final lq1 o(lq1 lq1Var) {
        return lq1Var.a(new yt5(cx0.a));
    }

    public static int p(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    public static final oj q(d55 d55Var) {
        oj ojVar = d55Var.a;
        long j = d55Var.b;
        ojVar.getClass();
        return ojVar.subSequence(d65.f(j), d65.e(j));
    }

    public static final oj r(d55 d55Var, int i) {
        oj ojVar = d55Var.a;
        oj ojVar2 = d55Var.a;
        long j = d55Var.b;
        int e = d65.e(j);
        int e2 = d65.e(j);
        int i2 = e2 + i;
        if (((i ^ i2) & (e2 ^ i2)) < 0) {
            i2 = ojVar2.J.length();
        }
        return ojVar.subSequence(e, Math.min(i2, ojVar2.J.length()));
    }

    public static final oj s(d55 d55Var, int i) {
        oj ojVar = d55Var.a;
        long j = d55Var.b;
        int f = d65.f(j);
        int i2 = f - i;
        if (((f ^ i2) & (i ^ f)) < 0) {
            i2 = 0;
        }
        return ojVar.subSequence(Math.max(0, i2), d65.f(j));
    }

    public static final s44 t(u55 u55Var, int i) {
        t55 t55Var = u55Var.a;
        w23 w23Var = u55Var.b;
        if (t55Var.a.J.length() != 0) {
            int d2 = w23Var.d(i);
            if ((i != 0 && d2 == w23Var.d(i - 1)) || (i != t55Var.a.J.length() && d2 == w23Var.d(i + 1))) {
                return u55Var.a(i);
            }
        }
        return u55Var.i(i);
    }

    public static final hx1 u() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Outlined.ThumbDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep p = hf1.p(15.0f, 3.0f, 6.0f, 3.0f);
        p.r(-0.83f, 0.0f, -1.54f, 0.5f, -1.84f, 1.22f);
        p.y(-3.02f, 7.05f);
        p.r(-0.09f, 0.23f, -0.14f, 0.47f, -0.14f, 0.73f);
        p.M(2.0f);
        p.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.v(6.31f);
        p.y(-0.95f, 4.57f);
        p.y(-0.03f, 0.32f);
        p.r(0.0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f);
        p.x(9.83f, 23.0f);
        p.y(6.59f, -6.59f);
        p.r(0.36f, -0.36f, 0.58f, -0.86f, 0.58f, -1.41f);
        p.x(17.0f, 5.0f);
        p.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        p.p();
        p.z(15.0f, 15.0f);
        p.y(-4.34f, 4.34f);
        p.x(12.0f, 14.0f);
        p.x(3.0f, 14.0f);
        p.M(-2.0f);
        p.y(3.0f, -7.0f);
        p.v(9.0f);
        p.M(10.0f);
        p.p();
        p.z(19.0f, 3.0f);
        p.v(4.0f);
        p.M(12.0f);
        p.v(-4.0f);
        p.p();
        gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    public static int v(Object obj) {
        return ((sk1) obj).c;
    }

    public static final hx1 w() {
        hx1 hx1Var = d;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.WifiOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(22.99f, 9.0f);
        r.q(19.15f, 5.16f, 13.8f, 3.76f, 8.84f, 4.78f);
        r.y(2.52f, 2.52f);
        r.r(3.47f, -0.17f, 6.99f, 1.05f, 9.63f, 3.7f);
        r.y(2.0f, -2.0f);
        r.p();
        r.z(18.99f, 13.0f);
        r.r(-1.29f, -1.29f, -2.84f, -2.13f, -4.49f, -2.56f);
        r.y(3.53f, 3.53f);
        r.y(0.96f, -0.97f);
        r.p();
        r.z(2.0f, 3.05f);
        r.x(5.07f, 6.1f);
        r.q(3.6f, 6.82f, 2.22f, 7.78f, 1.0f, 9.0f);
        r.y(1.99f, 2.0f);
        r.r(1.24f, -1.24f, 2.67f, -2.16f, 4.2f, -2.77f);
        r.y(2.24f, 2.24f);
        r.q(7.81f, 10.89f, 6.27f, 11.73f, 5.0f, 13.0f);
        r.M(0.01f);
        r.x(6.99f, 15.0f);
        r.r(1.36f, -1.36f, 3.14f, -2.04f, 4.92f, -2.06f);
        r.x(18.98f, 20.0f);
        r.y(1.27f, -1.26f);
        r.x(3.29f, 1.79f);
        r.x(2.0f, 3.05f);
        r.p();
        r.z(9.0f, 17.0f);
        r.y(3.0f, 3.0f);
        r.y(3.0f, -3.0f);
        r.r(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        d = b2;
        return b2;
    }

    public static final boolean x(oj ojVar) {
        int length = ojVar.J.length();
        List list = ojVar.I;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                nj njVar = (nj) list.get(i);
                if ((njVar.f() instanceof ek2) && pj.c(0, length, njVar.g(), njVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final lq1 y(lq1 lq1Var, float f) {
        return lq1Var.a(new dt1(new ax0(f)));
    }

    public static final int z(b73 b73Var) {
        return System.identityHashCode(b73Var);
    }

    public abstract int N(byte[] bArr, int i, int i2);

    public abstract Object i();

    public abstract String j(byte[] bArr, int i, int i2);

    public abstract int l(String str, byte[] bArr, int i, int i2);

    @Override // defpackage.cs5
    public void a() {
    }

    @Override // defpackage.cs5
    public void b() {
    }

    public fb4 S(String str, tm1 tm1Var) {
        return this;
    }
}
