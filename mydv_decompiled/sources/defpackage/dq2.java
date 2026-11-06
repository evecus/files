package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.SizeF;
import android.view.MotionEvent;
import android.widget.RemoteViews;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class dq2 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;
    public static hx1 d;
    public static hx1 e;
    public static hx1 f;

    public static final void A(long j, zp3 zp3Var) {
        MotionEvent obtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        zp3Var.invoke(obtain);
        obtain.recycle();
    }

    public static void A0(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 10;
        int i2 = 0;
        int i3 = 4;
        while (true) {
            int i4 = i3 - 1;
            long j2 = iArr[i3] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i2 << 31) & 4294967295L);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[1] & 4294967295L;
                long j7 = (j6 * j) + j5;
                int i6 = (int) j7;
                iArr2[1] = i5 | (i6 << 1);
                long j8 = iArr[2] & 4294967295L;
                long j9 = (j8 * j) + (iArr2[2] & 4294967295L) + (j7 >>> 32);
                int i7 = (int) j9;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long k = nt3.k(j8, j6, j9 >>> 32, iArr2[3] & 4294967295L);
                long j10 = (iArr2[4] & 4294967295L) + (k >>> 32);
                long j11 = iArr[3] & 4294967295L;
                long j12 = (iArr2[5] & 4294967295L) + (j10 >>> 32);
                long j13 = j10 & 4294967295L;
                long j14 = (iArr2[6] & 4294967295L) + (j12 >>> 32);
                long j15 = j12 & 4294967295L;
                long j16 = (j11 * j) + (k & 4294967295L);
                int i8 = (int) j16;
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long k2 = nt3.k(j11, j6, j16 >>> 32, j13);
                long k3 = nt3.k(j11, j8, k2 >>> 32, j15);
                long j17 = j14 + (k3 >>> 32);
                long j18 = iArr[4] & 4294967295L;
                long j19 = (iArr2[7] & 4294967295L) + (j17 >>> 32);
                long j20 = j17 & 4294967295L;
                long j21 = (iArr2[8] & 4294967295L) + (j19 >>> 32);
                long j22 = (j18 * j) + (k2 & 4294967295L);
                int i10 = (int) j22;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long k4 = nt3.k(j18, j6, j22 >>> 32, k3 & 4294967295L);
                long k5 = nt3.k(j18, j8, k4 >>> 32, j20);
                long k6 = nt3.k(j18, j11, k5 >>> 32, j19 & 4294967295L);
                long j23 = j21 + (k6 >>> 32);
                int i12 = (int) k4;
                iArr2[5] = (i12 << 1) | i11;
                int i13 = (int) k5;
                iArr2[6] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) k6;
                iArr2[7] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j23;
                iArr2[8] = i16 | (i17 << 1);
                iArr2[9] = ((iArr2[9] + ((int) (j23 >>> 32))) << 1) | (i17 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static boolean B(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int B0(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((iArr[i2] & 4294967295L) - (4294967295L & iArr2[i2])) + j;
            iArr3[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static boolean C(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int C0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static int D(int i, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 |= iArr[i3];
        }
        return ((i2 - 1) & (~i2)) >> 31;
    }

    public static void D0(int i, int i2, int[] iArr) {
        long j = (iArr[0] & 4294967295L) - (i2 & 4294967295L);
        iArr[0] = (int) j;
        long j2 = ((4294967295L & iArr[1]) - 1) + (j >> 32);
        iArr[1] = (int) j2;
        if ((j2 >> 32) == 0) {
            return;
        }
        z(i, 2, iArr);
    }

    public static final boolean E(int i, int i2) {
        return i == i2;
    }

    public static int E0(int i, int i2, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j2 = ((iArr2[r3] & 4294967295L) - (4294967295L & iArr[i3])) + j;
            iArr2[i2 + i3] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static final int F(int i, List list) {
        int i2;
        int i3 = ((yj3) o70.a1(list)).c;
        if (i > ((yj3) o70.a1(list)).c) {
            r02.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            yj3 yj3Var = (yj3) list.get(i2);
            char c2 = yj3Var.b > i ? (char) 1 : yj3Var.c <= i ? (char) 65535 : (char) 0;
            if (c2 >= 0) {
                if (c2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String a2 = dl2.a(list, null, new do2((byte) 9), 31);
        StringBuilder D = hf1.D("Found paragraph index ", i2, " should be in range [0, ", size2, ").\nDebug info: index=");
        D.append(i);
        D.append(", paragraphs=[");
        D.append(a2);
        D.append("]");
        r02.a(D.toString());
        return i2;
    }

    public static void F0(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((iArr2[i2] & 4294967295L) - (4294967295L & iArr[i2])) + j;
            iArr2[i2] = (int) j2;
            j = j2 >> 32;
        }
    }

    public static final int G(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            yj3 yj3Var = (yj3) list.get(i3);
            char c2 = yj3Var.d > i ? (char) 1 : yj3Var.e <= i ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i2 = i3 + 1;
            } else {
                if (c2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static void G0(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        iArr2[4] = (int) (((iArr2[4] & 4294967295L) - (4294967295L & iArr[4])) + (j4 >> 32));
    }

    public static final int H(ArrayList arrayList, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((yj3) o70.a1(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            yj3 yj3Var = (yj3) arrayList.get(i2);
            char c2 = yj3Var.f > f2 ? (char) 1 : yj3Var.g <= f2 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i = i2 + 1;
            } else {
                if (c2 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void H0(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void I(ArrayList arrayList, long j, tm1 tm1Var) {
        int size = arrayList.size();
        for (int F = F(d65.f(j), arrayList); F < size; F++) {
            yj3 yj3Var = (yj3) arrayList.get(F);
            if (yj3Var.b >= d65.e(j)) {
                return;
            }
            if (yj3Var.b != yj3Var.c) {
                tm1Var.invoke(yj3Var);
            }
        }
    }

    public static final void I0(String str) {
        throw new IllegalStateException(str);
    }

    public static Object J(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        zy.m("Both parameters are null");
        return null;
    }

    public static final void J0(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static int[] K(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            s83.d();
            return null;
        }
        int i2 = (i + 31) >> 5;
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static final void K0(String str) {
        throw new NoSuchElementException(str);
    }

    public static int[] L(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            s83.d();
            return null;
        }
        int[] iArr = new int[5];
        for (int i = 0; i < 5; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static BigInteger L0(int i, int[] iArr) {
        byte[] bArr = new byte[i << 2];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                a0(bArr, i3, ((i - 1) - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static long[] M(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            s83.d();
            return null;
        }
        int i2 = (i + 63) >> 6;
        long[] jArr = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArr;
    }

    public static BigInteger M0(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                a0(bArr, i2, (4 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static wr2 N(long j, long j2, long j3) {
        return new wr2(j, j2, j3);
    }

    public static final long N0(long j) {
        return eh0.a(dh0.j(j), dh0.h(j), dh0.i(j), dh0.g(j));
    }

    public static int O(int[] iArr) {
        return iArr[0] & 1;
    }

    public static final void O0(kp3 kp3Var, long j, zp3 zp3Var) {
        R0(kp3Var, j, zp3Var, true);
    }

    public static int P(int[] iArr) {
        return iArr[0] & 1;
    }

    public static final int P0(t8 t8Var) {
        int i = t8Var.a;
        int i2 = 8388611;
        if (i != 0) {
            if (i == 2) {
                i2 = 8388613;
            } else if (i == 1) {
                i2 = 1;
            } else {
                Log.w("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) r8.b(i)));
            }
        }
        int i3 = t8Var.b;
        int i4 = 48;
        if (i3 != 0) {
            if (i3 == 2) {
                i4 = 80;
            } else if (i3 == 1) {
                i4 = 16;
            } else {
                Log.w("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) s8.b(i3)));
            }
        }
        return i2 | i4;
    }

    public static final hx1 Q() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(18.0f, 8.0f);
        epVar.v(-1.0f);
        epVar.x(17.0f, 6.0f);
        epVar.r(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        epVar.C(7.0f, 3.24f, 7.0f, 6.0f);
        epVar.M(2.0f);
        epVar.x(6.0f, 8.0f);
        epVar.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        epVar.M(10.0f);
        epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        epVar.v(12.0f);
        epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        epVar.x(20.0f, 10.0f);
        epVar.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        epVar.p();
        epVar.z(12.0f, 17.0f);
        epVar.r(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        epVar.D(0.9f, -2.0f, 2.0f, -2.0f);
        epVar.D(2.0f, 0.9f, 2.0f, 2.0f);
        epVar.D(-0.9f, 2.0f, -2.0f, 2.0f);
        epVar.p();
        epVar.z(15.1f, 8.0f);
        epVar.x(8.9f, 8.0f);
        epVar.x(8.9f, 6.0f);
        epVar.r(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        epVar.r(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        epVar.M(2.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        a = b2;
        return b2;
    }

    public static final void Q0(kp3 kp3Var, long j, ap3 ap3Var) {
        R0(kp3Var, j, ap3Var, false);
    }

    public static final hx1 R() {
        hx1 hx1Var = d;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Palette", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(12.0f, 2.0f);
        r.q(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f);
        r.D(4.49f, 10.0f, 10.0f, 10.0f);
        r.r(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        r.r(0.0f, -0.61f, -0.23f, -1.2f, -0.64f, -1.67f);
        r.r(-0.08f, -0.1f, -0.13f, -0.21f, -0.13f, -0.33f);
        r.r(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        r.u(16.0f);
        r.r(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        r.q(22.0f, 6.04f, 17.51f, 2.0f, 12.0f, 2.0f);
        r.p();
        r.z(17.5f, 13.0f);
        r.r(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        r.r(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        r.D(1.5f, 0.67f, 1.5f, 1.5f);
        r.q(19.0f, 12.33f, 18.33f, 13.0f, 17.5f, 13.0f);
        r.p();
        r.z(14.5f, 9.0f);
        r.q(13.67f, 9.0f, 13.0f, 8.33f, 13.0f, 7.5f);
        r.q(13.0f, 6.67f, 13.67f, 6.0f, 14.5f, 6.0f);
        r.C(16.0f, 6.67f, 16.0f, 7.5f);
        r.q(16.0f, 8.33f, 15.33f, 9.0f, 14.5f, 9.0f);
        r.p();
        r.z(5.0f, 11.5f);
        r.q(5.0f, 10.67f, 5.67f, 10.0f, 6.5f, 10.0f);
        r.C(8.0f, 10.67f, 8.0f, 11.5f);
        r.q(8.0f, 12.33f, 7.33f, 13.0f, 6.5f, 13.0f);
        r.C(5.0f, 12.33f, 5.0f, 11.5f);
        r.p();
        r.z(11.0f, 7.5f);
        r.q(11.0f, 8.33f, 10.33f, 9.0f, 9.5f, 9.0f);
        r.C(8.0f, 8.33f, 8.0f, 7.5f);
        r.q(8.0f, 6.67f, 8.67f, 6.0f, 9.5f, 6.0f);
        r.C(11.0f, 6.67f, 11.0f, 7.5f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        d = b2;
        return b2;
    }

    public static final void R0(kp3 kp3Var, long j, tm1 tm1Var, boolean z) {
        MotionEvent a2 = kp3Var.a();
        if (a2 == null) {
            s83.t("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = a2.getAction();
        if (z) {
            a2.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        a2.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        tm1Var.invoke(a2);
        a2.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        a2.setAction(action);
    }

    public static final hx1 S() {
        hx1 hx1Var = f;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.QrCode2", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(15.0f, 21.0f);
        epVar.v(-2.0f);
        epVar.M(-2.0f);
        epVar.v(2.0f);
        epVar.L(21.0f);
        epVar.p();
        epVar.z(13.0f, 14.0f);
        epVar.v(-2.0f);
        epVar.M(5.0f);
        epVar.v(2.0f);
        epVar.L(14.0f);
        epVar.p();
        epVar.z(21.0f, 12.0f);
        epVar.v(-2.0f);
        epVar.M(4.0f);
        epVar.v(2.0f);
        epVar.L(12.0f);
        epVar.p();
        epVar.z(19.0f, 10.0f);
        epVar.v(-2.0f);
        epVar.M(2.0f);
        epVar.v(2.0f);
        epVar.L(10.0f);
        epVar.p();
        epVar.z(7.0f, 12.0f);
        epVar.u(5.0f);
        epVar.M(2.0f);
        epVar.v(2.0f);
        epVar.L(12.0f);
        epVar.p();
        epVar.z(5.0f, 10.0f);
        epVar.u(3.0f);
        epVar.M(2.0f);
        epVar.v(2.0f);
        epVar.L(10.0f);
        epVar.p();
        epVar.z(12.0f, 5.0f);
        epVar.v(2.0f);
        epVar.L(3.0f);
        epVar.v(-2.0f);
        epVar.L(5.0f);
        epVar.p();
        epVar.z(4.5f, 4.5f);
        epVar.M(3.0f);
        epVar.v(3.0f);
        epVar.M(-3.0f);
        epVar.u(4.5f);
        epVar.p();
        epVar.z(9.0f, 9.0f);
        epVar.u(3.0f);
        epVar.L(3.0f);
        epVar.v(6.0f);
        epVar.L(9.0f);
        epVar.p();
        epVar.z(4.5f, 16.5f);
        epVar.M(3.0f);
        epVar.v(3.0f);
        epVar.M(-3.0f);
        epVar.u(4.5f);
        epVar.p();
        epVar.z(9.0f, 21.0f);
        epVar.u(3.0f);
        epVar.M(-6.0f);
        epVar.v(6.0f);
        epVar.L(21.0f);
        epVar.p();
        epVar.z(16.5f, 4.5f);
        epVar.M(3.0f);
        epVar.v(3.0f);
        epVar.M(-3.0f);
        epVar.u(16.5f);
        epVar.p();
        epVar.z(21.0f, 9.0f);
        epVar.v(-6.0f);
        epVar.L(3.0f);
        epVar.v(6.0f);
        epVar.L(9.0f);
        epVar.p();
        epVar.z(19.0f, 19.0f);
        epVar.M(-3.0f);
        epVar.y(-4.0f, 0.0f);
        epVar.M(2.0f);
        epVar.v(2.0f);
        epVar.M(3.0f);
        epVar.v(4.0f);
        epVar.M(-2.0f);
        epVar.u(19.0f);
        epVar.p();
        epVar.z(17.0f, 12.0f);
        epVar.y(-4.0f, 0.0f);
        epVar.M(2.0f);
        epVar.v(4.0f);
        epVar.L(12.0f);
        epVar.p();
        epVar.z(13.0f, 10.0f);
        epVar.u(7.0f);
        epVar.M(2.0f);
        epVar.v(2.0f);
        epVar.M(2.0f);
        epVar.v(2.0f);
        epVar.M(-2.0f);
        epVar.v(2.0f);
        epVar.L(10.0f);
        epVar.p();
        epVar.z(14.0f, 9.0f);
        epVar.L(7.0f);
        epVar.v(-2.0f);
        epVar.L(5.0f);
        epVar.v(-2.0f);
        epVar.M(4.0f);
        epVar.x(14.0f, 9.0f);
        epVar.p();
        epVar.z(6.75f, 5.25f);
        epVar.v(-1.5f);
        epVar.M(1.5f);
        epVar.v(1.5f);
        epVar.L(5.25f);
        epVar.p();
        epVar.z(6.75f, 17.25f);
        epVar.v(-1.5f);
        epVar.M(1.5f);
        epVar.v(1.5f);
        epVar.L(17.25f);
        epVar.p();
        epVar.z(18.75f, 5.25f);
        epVar.v(-1.5f);
        epVar.M(1.5f);
        epVar.v(1.5f);
        epVar.L(5.25f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        f = b2;
        return b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0339, code lost:
    
        if (defpackage.j42.c(r0 != null ? r0.a : null, r2) != false) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void S0(android.widget.RemoteViews r14, defpackage.ha5 r15, defpackage.k71 r16) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq2.S0(android.widget.RemoteViews, ha5, k71):void");
    }

    public static final js2 T(js2 js2Var) {
        wa2 wa2Var = js2Var.c0.c0;
        while (true) {
            wa2 v = wa2Var.v();
            wa2 wa2Var2 = null;
            if ((v != null ? v.P : null) == null) {
                js2 I0 = wa2Var.n0.d.I0();
                I0.getClass();
                return I0;
            }
            wa2 v2 = wa2Var.v();
            if (v2 != null) {
                wa2Var2 = v2.P;
            }
            wa2Var2.getClass();
            wa2 v3 = wa2Var.v();
            v3.getClass();
            wa2Var = v3.P;
            wa2Var.getClass();
        }
    }

    public static final RemoteViews T0(Context context, int i, y34 y34Var, ba2 ba2Var, int i2, ComponentName componentName, hq1 hq1Var) {
        boolean z = true;
        if (context.getResources().getConfiguration().getLayoutDirection() != 1) {
            z = false;
        }
        ha5 ha5Var = new ha5(context, i, z, ba2Var, -1, false, new AtomicInteger(-1), new n12(0, 0, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName, hq1Var);
        ArrayList arrayList = y34Var.b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (!(((k71) obj) instanceof s71)) {
                    k71 k71Var = (k71) o70.i1(arrayList);
                    x34 a2 = mc2.a(ha5Var, k71Var.b(), i2);
                    RemoteViews remoteViews = a2.a;
                    S0(remoteViews, ha5.a(ha5Var.b(a2.b, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), 0L, null, 65215), k71Var);
                    return remoteViews;
                }
            }
        }
        Object T0 = o70.T0(arrayList);
        T0.getClass();
        rq4 rq4Var = ((s71) T0).d;
        ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            k71 k71Var2 = (k71) obj2;
            k71Var2.getClass();
            s71 s71Var = (s71) k71Var2;
            long j = s71Var.c;
            x34 a3 = mc2.a(ha5Var, s71Var.b(), i2);
            RemoteViews remoteViews2 = a3.a;
            S0(remoteViews2, ha5.a(ha5Var.b(a3.b, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), j, null, 64703), k71Var2);
            arrayList2.add(new uj3(new SizeF(v11.b(j), v11.a(j)), remoteViews2));
        }
        if (rq4Var instanceof qq4) {
            return (RemoteViews) ((uj3) o70.i1(arrayList2)).J;
        }
        if (!(rq4Var instanceof pq4) && !j42.c(rq4Var, oq4.a)) {
            s83.v();
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ub.e(sv2.W(arrayList2));
        }
        if (arrayList2.size() != 1 && arrayList2.size() != 2) {
            s83.t("unsupported views size");
            return null;
        }
        ArrayList arrayList3 = new ArrayList(p70.J(arrayList2, 10));
        int size3 = arrayList2.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            arrayList3.add((RemoteViews) ((uj3) obj3).J);
        }
        int size4 = arrayList3.size();
        if (size4 == 1) {
            return (RemoteViews) arrayList3.get(0);
        }
        if (size4 == 2) {
            return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        s83.t("There must be between 1 and 2 views.");
        return null;
    }

    public static boolean U(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] - 2147483648;
            int i4 = iArr2[i2] - 2147483648;
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    public static void U0(int i, xw0 xw0Var) {
        xw0Var.b((byte) (i >>> 24));
        xw0Var.b((byte) (i >>> 16));
        xw0Var.b((byte) (i >>> 8));
        xw0Var.b((byte) i);
    }

    public static boolean V(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            int i2 = iArr[i] - 2147483648;
            int i3 = iArr2[i] - 2147483648;
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static int W(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != 0) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int X(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i] + 1;
            iArr[i] = i2;
            if (i2 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int Y(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    public static int Z(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    public static int a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (iArr[i2] & 4294967295L) + (4294967295L & iArr2[i2]) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static void a0(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static void b0(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void c(int i, int i2, int[] iArr) {
        long j = (iArr[0] & 4294967295L) + (i2 & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (4294967295L & iArr[1]) + 1 + (j >>> 32);
        iArr[1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return;
        }
        Y(i, 2, iArr);
    }

    public static boolean c0(int i, int[] iArr) {
        if (iArr[0] == 1) {
            for (int i2 = 1; i2 < i; i2++) {
                if (iArr[i2] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static int d(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (iArr[i2] & 4294967295L) + (iArr2[i2] & 4294967295L) + (4294967295L & iArr3[i2]) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static boolean d0(int[] iArr) {
        if (iArr[0] == 1) {
            for (int i = 1; i < 5; i++) {
                if (iArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static int e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static final boolean e0(long j, rp3 rp3Var) {
        long j2 = rp3Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return (intBitsToFloat2 < 0.0f) | (intBitsToFloat > ((float) i)) | (intBitsToFloat < 0.0f) | (intBitsToFloat2 > ((float) i2));
    }

    public static int f(int i, int i2, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j2 = (iArr[i3] & 4294967295L) + (4294967295L & iArr2[r7]) + j;
            iArr2[i2 + i3] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static final boolean f0(rp3 rp3Var, long j, long j2) {
        int i = rp3Var.i == 1 ? 1 : 0;
        long j3 = rp3Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f2 = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float f3 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f2;
        return (intBitsToFloat > f3) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4);
    }

    public static int g(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (iArr[i2] & 4294967295L) + (4294967295L & iArr2[i2]) + j;
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static boolean g0(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void h(int i, int i2, int i3, int[] iArr) {
        long j = (i2 & 4294967295L) + (4294967295L & iArr[i3]);
        iArr[i3] = (int) j;
        if ((j >>> 32) == 0) {
            return;
        }
        Y(i, i3 + 1, iArr);
    }

    public static boolean h0(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int i(int i, int i2, int[] iArr) {
        long j = (i2 & 4294967295L) + (4294967295L & iArr[0]);
        iArr[0] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return Y(i, 1, iArr);
    }

    public static final long i0(long j, long j2, float f2) {
        float G = vt0.G(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f2);
        float G2 = vt0.G(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f2);
        return (Float.floatToRawIntBits(G) << 32) | (Float.floatToRawIntBits(G2) & 4294967295L);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003b -> B:10:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.q05 r6, defpackage.fu r7) {
        /*
            boolean r0 = r7 instanceof defpackage.w54
            if (r0 == 0) goto L13
            r0 = r7
            w54 r0 = (defpackage.w54) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            w54 r0 = new w54
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.J
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            q05 r6 = r0.I
            defpackage.mu0.V(r7)
            goto L3e
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.mu0.V(r7)
        L31:
            r0.I = r6
            r0.K = r2
            java.lang.Object r7 = defpackage.pt1.g(r6, r0)
            el0 r1 = defpackage.el0.I
            if (r7 != r1) goto L3e
            return r1
        L3e:
            kp3 r7 = (defpackage.kp3) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L4e:
            if (r4 >= r1) goto L60
            java.lang.Object r5 = r7.get(r4)
            rp3 r5 = (defpackage.rp3) r5
            boolean r5 = l(r5)
            if (r5 != 0) goto L5d
            goto L31
        L5d:
            int r4 = r4 + 1
            goto L4e
        L60:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq2.j(q05, fu):java.lang.Object");
    }

    public static int j0(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (((iArr[i2] & 4294967295L) - (4294967295L & iArr2[i2])) + j) >> 32;
        }
        return (int) j;
    }

    public static int k(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int k0(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static final boolean l(rp3 rp3Var) {
        return (rp3Var.l() || rp3Var.h || !rp3Var.d) ? false : true;
    }

    public static void l0(byte[] bArr, int[] iArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = k0(i2, bArr);
            i2 += 4;
        }
    }

    public static final boolean m(rp3 rp3Var) {
        return !rp3Var.h && rp3Var.d;
    }

    public static long m0(int i, byte[] bArr) {
        return ((k0(i + 4, bArr) & 4294967295L) << 32) | (4294967295L & k0(i, bArr));
    }

    public static final boolean n(rp3 rp3Var) {
        return (rp3Var.l() || !rp3Var.h || rp3Var.d) ? false : true;
    }

    public static void n0(byte[] bArr, int i, long j) {
        a0(bArr, (int) (j >>> 32), i);
        a0(bArr, (int) (j & 4294967295L), i + 4);
    }

    public static final boolean o(rp3 rp3Var) {
        return rp3Var.h && !rp3Var.d;
    }

    public static int o0(long j) {
        return (int) ((j - (((int) (58728449 * j)) * 8380417)) >>> 32);
    }

    public static void p(long j, long j2, boolean z) {
        if (!z) {
            throw new ArithmeticException(r7.D(hf1.A(j, "overflow: checkedAdd(", ", "), j2, ")"));
        }
    }

    public static void p0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr[0] & 4294967295L;
        long j7 = j6 * j;
        iArr3[0] = (int) j7;
        char c2 = ' ';
        long j8 = (j7 >>> 32) + (j6 * j2);
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + (j6 * j3);
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + (j6 * j4);
        iArr3[3] = (int) j10;
        long j11 = (j6 * j5) + (j10 >>> 32);
        iArr3[4] = (int) j11;
        iArr3[5] = (int) (j11 >>> 32);
        int i = 1;
        for (int i2 = 5; i < i2; i2 = 5) {
            long j12 = iArr[i] & 4294967295L;
            int i3 = i;
            long j13 = (j12 * j) + (iArr3[i] & 4294967295L);
            iArr3[i3] = (int) j13;
            long j14 = j13 >>> c2;
            long j15 = j12 * j2;
            int i4 = i3 + 1;
            char c3 = c2;
            long j16 = j15 + (iArr3[i4] & 4294967295L) + j14;
            iArr3[i4] = (int) j16;
            long j17 = (j12 * j3) + (iArr3[r11] & 4294967295L) + (j16 >>> c3);
            iArr3[i3 + 2] = (int) j17;
            long j18 = (j12 * j4) + (iArr3[r11] & 4294967295L) + (j17 >>> c3);
            iArr3[i3 + 3] = (int) j18;
            long j19 = j18 >>> c3;
            long j20 = (j12 * j5) + (iArr3[r7] & 4294967295L) + j19;
            iArr3[i3 + 4] = (int) j20;
            iArr3[i3 + 5] = (int) (j20 >>> c3);
            i = i4;
            c2 = c3;
        }
    }

    public static void q(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static int q0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = iArr2[0] & 4294967295L;
        long j3 = iArr2[1] & 4294967295L;
        long j4 = iArr2[2] & 4294967295L;
        long j5 = iArr2[3] & 4294967295L;
        long j6 = iArr2[4] & 4294967295L;
        long j7 = 0;
        while (i < 5) {
            long j8 = j;
            long j9 = iArr[i] & j8;
            int i2 = i;
            long j10 = (j9 * j2) + (iArr3[i] & j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j9 * j3) + (iArr3[i3] & j8) + (j10 >>> 32);
            iArr3[i3] = (int) j11;
            long j12 = (j9 * j4) + (iArr3[r15] & j8) + (j11 >>> 32);
            iArr3[i2 + 2] = (int) j12;
            long j13 = (j9 * j5) + (iArr3[r2] & j8) + (j12 >>> 32);
            iArr3[i2 + 3] = (int) j13;
            long j14 = (j9 * j6) + (iArr3[r2] & j8) + (j13 >>> 32);
            iArr3[i2 + 4] = (int) j14;
            long j15 = (j14 >>> 32) + (iArr3[r2] & j8) + j7;
            iArr3[i2 + 5] = (int) j15;
            j7 = j15 >>> 32;
            j = j8;
            j2 = j2;
            i = i3;
        }
        return (int) j7;
    }

    public static void r(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static final long r0(rp3 rp3Var) {
        return t0(rp3Var, false);
    }

    public static void s(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            s83.t(r7.C("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }

    public static final long s0(rp3 rp3Var) {
        return t0(rp3Var, true);
    }

    public static final int t(q84 q84Var, String str) {
        q84Var.getClass();
        int columnCount = q84Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(q84Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String t = hf1.t('`', "`", str);
        int columnCount2 = q84Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (t.equals(q84Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = q84Var.getColumnCount();
            String concat = ".".concat(str);
            String t2 = hf1.t('`', ".", str);
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = q84Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (qx4.s(columnName, concat, false) || (columnName.charAt(0) == '`' && qx4.s(columnName, t2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static final long t0(rp3 rp3Var, boolean z) {
        long e2 = pd3.e(rp3Var.c, rp3Var.g);
        if (z || !rp3Var.l()) {
            return e2;
        }
        return 0L;
    }

    public static final int u(float f2) {
        return mw2.P(f2) * (-1);
    }

    public static final boolean u0(rp3 rp3Var) {
        return !pd3.c(t0(rp3Var, true), 0L);
    }

    public static long v(long j, lb2 lb2Var) {
        lb2 lb2Var2 = lb2.I;
        return eh0.a(lb2Var == lb2Var2 ? dh0.j(j) : dh0.i(j), lb2Var == lb2Var2 ? dh0.h(j) : dh0.g(j), lb2Var == lb2Var2 ? dh0.i(j) : dh0.j(j), lb2Var == lb2Var2 ? dh0.g(j) : dh0.h(j));
    }

    public static final File v0(Context context, String str) {
        context.getClass();
        str.getClass();
        return d4.t(context, j42.d0(".preferences_pb", str));
    }

    public static void w(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
    }

    public static final void w0(RemoteViews remoteViews, ha5 ha5Var, n12 n12Var, ArrayList arrayList) {
        int i = 0;
        for (Object obj : o70.l1(arrayList, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                p70.A0();
                throw null;
            }
            S0(remoteViews, ha5Var.b(n12Var, i), (k71) obj);
            i = i2;
        }
    }

    public static long x(int i, long j) {
        return eh0.a(0, dh0.h(j), (i & 4) != 0 ? dh0.i(j) : 0, dh0.g(j));
    }

    public static int x0(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        return i2 >>> 31;
    }

    public static void y(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
    }

    public static int y0(int i, int[] iArr) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            iArr[i2] = (i3 >>> (-2)) | (i4 << 2);
            i2++;
            i3 = i4;
        }
        return i3 >>> (-2);
    }

    public static int z(int i, int i2, int[] iArr) {
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
            i2++;
        }
        return -1;
    }

    public static int z0(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            iArr2[i2] = (i3 >>> (-3)) | (i4 << 3);
            i2++;
            i3 = i4;
        }
        return i3 >>> (-3);
    }
}
