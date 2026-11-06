package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.inputmethod.ExtractedText;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class jl2 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;
    public static hx1 d;
    public static Field e;
    public static boolean f;
    public static Class g;
    public static boolean h;
    public static Field i;
    public static boolean j;
    public static Field k;
    public static boolean l;

    public static void A(Resources resources) {
        Object obj;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return;
        }
        Object obj2 = null;
        if (i2 < 24) {
            if (!f) {
                try {
                    Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    obj2 = field.get(resources);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
                }
            }
            if (obj2 == null) {
                return;
            }
            B(obj2);
            return;
        }
        if (!l) {
            try {
                Field declaredField2 = Resources.class.getDeclaredField("mResourcesImpl");
                k = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e4);
            }
            l = true;
        }
        Field field2 = k;
        if (field2 == null) {
            return;
        }
        try {
            obj = field2.get(resources);
        } catch (IllegalAccessException e5) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e5);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f) {
            try {
                Field declaredField3 = obj.getClass().getDeclaredField("mDrawableCache");
                e = declaredField3;
                declaredField3.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e6);
            }
            f = true;
        }
        Field field3 = e;
        if (field3 != null) {
            try {
                obj2 = field3.get(obj);
            } catch (IllegalAccessException e7) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e7);
            }
        }
        if (obj2 != null) {
            B(obj2);
        }
    }

    public static void B(Object obj) {
        LongSparseArray longSparseArray;
        if (!h) {
            try {
                g = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            h = true;
        }
        Class cls = g;
        if (cls == null) {
            return;
        }
        if (!j) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            j = true;
        }
        Field field = i;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static int[] C(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            s83.d();
            return null;
        }
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static final Rect D(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i3) {
                    int nextSpanTransition = spanned.nextSpanTransition(i4, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        io.o(textPaint2, charSequence, i4, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            io.o(textPaint, charSequence, i4, i3, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i4, i3, rect3);
        return rect3;
    }

    public static final ArrayList E(b42 b42Var) {
        b42Var.getClass();
        wa2 q0 = ((hs2) b42Var).q0();
        boolean N = N(q0);
        a53 a53Var = (a53) q0.p();
        b53 b53Var = a53Var.I;
        ArrayList arrayList = new ArrayList(b53Var.K);
        int i2 = b53Var.K;
        for (int i3 = 0; i3 < i2; i3++) {
            wa2 wa2Var = (wa2) a53Var.get(i3);
            arrayList.add(N ? wa2Var.m() : wa2Var.n());
        }
        return arrayList;
    }

    public static final int F(q84 q84Var, String str) {
        q84Var.getClass();
        int t = dq2.t(q84Var, str);
        if (t >= 0) {
            return t;
        }
        int columnCount = q84Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i2 = 0; i2 < columnCount; i2++) {
            arrayList.add(q84Var.getColumnName(i2));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + o70.Z0(arrayList, null, null, null, 0, null, 63) + ']');
    }

    public static void G() {
        pr2 pr2Var = pr2.d;
    }

    public static final na3 H(vp3 vp3Var) {
        return ut0.S(vp3Var, 16);
    }

    public static final hx1 I() {
        hx1 hx1Var = c;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(6.0f, 19.0f);
        epVar.v(4.0f);
        epVar.x(10.0f, 5.0f);
        epVar.x(6.0f, 5.0f);
        epVar.M(14.0f);
        epVar.p();
        epVar.z(14.0f, 5.0f);
        epVar.M(14.0f);
        epVar.v(4.0f);
        epVar.x(18.0f, 5.0f);
        epVar.v(-4.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        c = b2;
        return b2;
    }

    public static boolean J(int[] iArr, int[] iArr2) {
        for (int i2 = 3; i2 >= 0; i2--) {
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

    public static boolean K(int[] iArr, int[] iArr2) {
        for (int i2 = 7; i2 >= 0; i2--) {
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

    public static int L(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int M(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static final boolean N(wa2 wa2Var) {
        int ordinal = wa2Var.o0.d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            s83.v();
                            return false;
                        }
                        wa2 v = wa2Var.v();
                        if (v != null) {
                            return N(v);
                        }
                        s83.t("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean O(float f2) {
        return Float.isNaN(f2) || Math.abs(f2) < 0.5f;
    }

    public static boolean P(int[] iArr) {
        if (iArr[0] == 1) {
            for (int i2 = 1; i2 < 4; i2++) {
                if (iArr[i2] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean Q(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < 8; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean R(long[] jArr) {
        if (jArr[0] == 1) {
            for (int i2 = 1; i2 < 4; i2++) {
                if (jArr[i2] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean S(int[] iArr) {
        for (int i2 = 0; i2 < 4; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean T(int[] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean U(long[] jArr) {
        for (int i2 = 0; i2 < 4; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean V(long[] jArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final void W(String str) {
        str.getClass();
        throw new IllegalArgumentException(r7.C("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static long X(long... jArr) {
        sp0.o(jArr.length > 0);
        long j2 = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 > j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public static int Y(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int i2 = 1;
        int numberOfLeadingZeros = (length * 32) - Integer.numberOfLeadingZeros(iArr[length - 1]);
        int i3 = 30;
        int i4 = (numberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[i4];
        int[] iArr6 = new int[i4];
        int[] iArr7 = new int[i4];
        int[] iArr8 = new int[i4];
        iArr5[0] = 1;
        w(numberOfLeadingZeros, iArr2, iArr7);
        w(numberOfLeadingZeros, iArr, iArr8);
        System.arraycopy(iArr8, 0, iArr6, 0, i4);
        int i5 = iArr8[0];
        char c2 = 2;
        int i6 = (2 - (i5 * i5)) * i5;
        int i7 = (2 - (i5 * i6)) * i6;
        int i8 = (2 - (i5 * i7)) * i7;
        int i9 = (2 - (i5 * i8)) * i8;
        int i10 = 0;
        int i11 = (int) (((numberOfLeadingZeros * 150964) + 99243) >>> 16);
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = iArr6[i10];
            int i15 = iArr7[i10];
            int i16 = i9;
            char c3 = c2;
            int i17 = i10;
            int i18 = i17;
            int i19 = 1073741824;
            int i20 = i2;
            int i21 = 1073741824;
            while (i18 < i3) {
                int i22 = i3;
                int i23 = i13 >> 31;
                int i24 = numberOfLeadingZeros;
                int i25 = -(i15 & 1);
                int i26 = i15 - ((i14 ^ i23) & i25);
                int i27 = i17 - ((i21 ^ i23) & i25);
                int i28 = i19 - ((i10 ^ i23) & i25);
                int i29 = i25 & (~i23);
                i13 = (i13 ^ i29) + 1;
                i14 += i26 & i29;
                i21 += i27 & i29;
                i10 += i29 & i28;
                i15 = i26 >> 1;
                i17 = i27 >> 1;
                i19 = i28 >> 1;
                i18++;
                i3 = i22;
                numberOfLeadingZeros = i24;
            }
            int i30 = numberOfLeadingZeros;
            int i31 = i3;
            int[] iArr9 = {i21, i10, i17, i19};
            int i32 = iArr9[i18];
            int i33 = iArr9[i20];
            int i34 = iArr9[c3];
            int i35 = iArr9[3];
            int i36 = i4 - 1;
            int i37 = iArr4[i36] >> 31;
            int i38 = iArr5[i36] >> 31;
            int i39 = (i32 & i37) + (i33 & i38);
            int i40 = (i37 & i34) + (i35 & i38);
            int[] iArr10 = iArr4;
            int i41 = iArr8[i18];
            int[] iArr11 = iArr5;
            int[] iArr12 = iArr8;
            int i42 = i11;
            int i43 = i12;
            long j2 = i32;
            long j3 = iArr10[i18];
            long j4 = i33;
            long j5 = iArr11[i18];
            long j6 = (j4 * j5) + (j2 * j3);
            long j7 = i34;
            long j8 = i35;
            long j9 = (j8 * j5) + (j3 * j7);
            long j10 = i41;
            long j11 = i39 - (((((int) j6) * i16) + i39) & 1073741823);
            long j12 = (j10 * j11) + j6;
            long j13 = j11;
            long j14 = i40 - (((((int) j9) * i16) + i40) & 1073741823);
            long j15 = ((j10 * j14) + j9) >> i31;
            long j16 = j12 >> i31;
            int i44 = i20;
            while (i44 < i4) {
                int i45 = iArr12[i44];
                long j17 = j14;
                long j18 = iArr10[i44];
                long j19 = j2 * j18;
                long j20 = iArr11[i44];
                long j21 = i45;
                long k2 = nt3.k(j21, j13, (j4 * j20) + j19, j16);
                long k3 = nt3.k(j21, j17, (j20 * j8) + (j7 * j18), j15);
                int i46 = i44 - 1;
                iArr10[i46] = ((int) k2) & 1073741823;
                j16 = k2 >> i31;
                iArr11[i46] = ((int) k3) & 1073741823;
                j15 = k3 >> i31;
                i44++;
                j14 = j17;
                j13 = j13;
            }
            iArr10[i36] = (int) j16;
            iArr11[i36] = (int) j15;
            s0(i4, iArr6, iArr7, iArr9);
            i12 = i43 + 30;
            c2 = c3;
            iArr4 = iArr10;
            i2 = i20;
            i10 = i18;
            i9 = i16;
            i3 = i31;
            numberOfLeadingZeros = i30;
            iArr5 = iArr11;
            iArr8 = iArr12;
            i11 = i42;
        }
        int i47 = numberOfLeadingZeros;
        int i48 = i2;
        int[] iArr13 = iArr4;
        int[] iArr14 = iArr8;
        int i49 = i10;
        int i50 = i4 - 1;
        int i51 = iArr6[i50] >> 31;
        int i52 = i49;
        int i53 = i52;
        while (i52 < i50) {
            int i54 = ((iArr6[i52] ^ i51) - i51) + i53;
            iArr6[i52] = i54 & 1073741823;
            i53 = i54 >> 30;
            i52++;
        }
        iArr6[i50] = ((iArr6[i50] ^ i51) - i51) + i53;
        int i55 = iArr13[i50] >> 31;
        int i56 = i49;
        int i57 = i56;
        while (i56 < i50) {
            int i58 = (((iArr13[i56] + (iArr14[i56] & i55)) ^ i51) - i51) + i57;
            iArr13[i56] = i58 & 1073741823;
            i57 = i58 >> 30;
            i56++;
        }
        int i59 = (((iArr13[i50] + (i55 & iArr14[i50])) ^ i51) - i51) + i57;
        iArr13[i50] = i59;
        int i60 = i59 >> 31;
        int i61 = i49;
        int i62 = i61;
        while (i61 < i50) {
            int i63 = iArr13[i61] + (iArr14[i61] & i60) + i62;
            iArr13[i61] = i63 & 1073741823;
            i62 = i63 >> 30;
            i61++;
        }
        iArr13[i50] = iArr13[i50] + (i60 & iArr14[i50]) + i62;
        long j22 = 0;
        int i64 = i49;
        int i65 = i64;
        int i66 = i65;
        int i67 = i47;
        while (i67 > 0) {
            while (i64 < Math.min(32, i67)) {
                j22 |= iArr13[i65] << i64;
                i64 += 30;
                i65++;
            }
            iArr3[i66] = (int) j22;
            j22 >>>= 32;
            i64 -= 32;
            i67 -= 32;
            i66++;
        }
        int i68 = iArr6[i49] ^ 1;
        for (int i69 = i48; i69 < i4; i69++) {
            i68 |= iArr6[i69];
        }
        int i70 = (~i68) & (i68 - 1);
        int i71 = iArr7[i49];
        for (int i72 = i48; i72 < i4; i72++) {
            i71 |= iArr7[i72];
        }
        return (i70 & ((i71 - 1) & (~i71))) >> 31;
    }

    public static void Z(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 4294967295L;
        long j3 = iArr2[0] & 4294967295L;
        int i2 = 1;
        long j4 = iArr2[1] & 4294967295L;
        long j5 = iArr2[2] & 4294967295L;
        long j6 = iArr2[3] & 4294967295L;
        long j7 = iArr[0] & 4294967295L;
        long j8 = j7 * j3;
        iArr3[0] = (int) j8;
        long j9 = (j7 * j4) + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = (j7 * j5) + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (j7 * j6) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        iArr3[4] = (int) (j11 >>> 32);
        for (int i3 = 4; i2 < i3; i3 = 4) {
            long j12 = iArr[i2] & j2;
            long j13 = (j12 * j3) + (iArr3[i2] & j2);
            iArr3[i2] = (int) j13;
            int i4 = i2 + 1;
            long j14 = j2;
            long j15 = (j12 * j4) + (iArr3[i4] & j14) + (j13 >>> 32);
            iArr3[i4] = (int) j15;
            long j16 = (j12 * j5) + (iArr3[r11] & j14) + (j15 >>> 32);
            iArr3[i2 + 2] = (int) j16;
            long j17 = j16 >>> 32;
            long j18 = (j12 * j6) + (iArr3[r3] & j14) + j17;
            iArr3[i2 + 3] = (int) j18;
            iArr3[i2 + 4] = (int) (j18 >>> 32);
            i2 = i4;
            j2 = j14;
        }
    }

    public static final void a(hx1 hx1Var, rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i2) {
        l13 l13Var2;
        rm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1929713238);
        int i3 = i2 | (go1Var.g(hx1Var) ? 4 : 2) | (go1Var.i(rm1Var) ? 2048 : 1024) | 24576;
        if (go1Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            t43 w = ut0.w(t33Var, go1Var);
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            long j2 = ((Boolean) t43Var.getValue()).booleanValue() ? k80Var.u : ((Boolean) w.getValue()).booleanValue() ? k80Var.H : x70.f;
            long j3 = ((Boolean) t43Var.getValue()).booleanValue() ? k80Var.v : k80Var.s;
            i13 i13Var = i13.a;
            l13 k2 = nq4.k(i13Var, 40.0f);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new xx2(t43Var, (byte) 8);
                go1Var.o0(Q3);
            }
            l13 B = mw2.B(r13.d(mw2.p(o7.m(i42.A0(k2, (tm1) Q3), l74.a), j2, mw2.j), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), false, null, 3);
            uw2 c2 = px.c(q8.N, false);
            long j4 = go1Var.T;
            int i4 = (int) (j4 ^ (j4 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, B);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            ow1.a(hx1Var, "设置", nq4.k(i13Var, 22.0f), j3, go1Var, (i3 & 14) | 432);
            go1Var.q(true);
            l13Var2 = i13Var;
        } else {
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tf((Object) hx1Var, (Object) rm1Var, l13Var2, i2, (byte) 7);
        }
    }

    public static void a0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr2[0] & 4294967295L;
        long j3 = iArr2[1] & 4294967295L;
        long j4 = iArr2[2] & 4294967295L;
        long j5 = iArr2[3] & 4294967295L;
        long j6 = iArr2[4] & 4294967295L;
        long j7 = iArr2[5] & 4294967295L;
        long j8 = iArr2[6] & 4294967295L;
        long j9 = iArr2[7] & 4294967295L;
        long j10 = iArr[0] & 4294967295L;
        long j11 = j10 * j2;
        iArr3[0] = (int) j11;
        long j12 = (j10 * j3) + (j11 >>> 32);
        iArr3[1] = (int) j12;
        long j13 = (j10 * j4) + (j12 >>> 32);
        iArr3[2] = (int) j13;
        long j14 = (j10 * j5) + (j13 >>> 32);
        iArr3[3] = (int) j14;
        long j15 = (j10 * j6) + (j14 >>> 32);
        iArr3[4] = (int) j15;
        long j16 = (j10 * j7) + (j15 >>> 32);
        iArr3[5] = (int) j16;
        long j17 = (j10 * j8) + (j16 >>> 32);
        iArr3[6] = (int) j17;
        long j18 = (j10 * j9) + (j17 >>> 32);
        iArr3[7] = (int) j18;
        iArr3[8] = (int) (j18 >>> 32);
        int i2 = 1;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            long j19 = iArr[i2] & 4294967295L;
            long j20 = (j19 * j2) + (iArr3[i2] & 4294967295L);
            iArr3[i2] = (int) j20;
            int i4 = i2 + 1;
            long j21 = j6;
            long j22 = (j19 * j3) + (iArr3[i4] & 4294967295L) + (j20 >>> 32);
            iArr3[i4] = (int) j22;
            long j23 = (j19 * j4) + (iArr3[r7] & 4294967295L) + (j22 >>> 32);
            iArr3[i2 + 2] = (int) j23;
            long j24 = (j19 * j5) + (iArr3[r7] & 4294967295L) + (j23 >>> 32);
            iArr3[i2 + 3] = (int) j24;
            long j25 = (j19 * j21) + (iArr3[r7] & 4294967295L) + (j24 >>> 32);
            iArr3[i2 + 4] = (int) j25;
            long j26 = (j19 * j7) + (iArr3[r7] & 4294967295L) + (j25 >>> 32);
            iArr3[i2 + 5] = (int) j26;
            long j27 = (j19 * j8) + (iArr3[r7] & 4294967295L) + (j26 >>> 32);
            iArr3[i2 + 6] = (int) j27;
            long j28 = (j19 * j9) + (iArr3[r7] & 4294967295L) + (j27 >>> 32);
            iArr3[i2 + 7] = (int) j28;
            iArr3[i2 + 8] = (int) (j28 >>> 32);
            i2 = i4;
            j6 = j21;
        }
    }

    public static final void b(long j2, m65 m65Var, hn1 hn1Var, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-684938728);
        int i3 = (go1Var.f(j2) ? 4 : 2) | i2 | (go1Var.g(m65Var) ? 32 : 16);
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.i(hn1Var) ? 256 : 128;
        }
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            i51 i51Var = r55.a;
            mw2.c(new ay3[]{yh0.a.a(new x70(j2)), i51Var.a(((m65) go1Var.k(i51Var)).e(m65Var))}, hn1Var, go1Var, ((i3 >> 3) & 112) | 8);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new zx3(j2, m65Var, hn1Var, i2, (byte) 0);
        }
    }

    public static int b0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr2[0] & 4294967295L;
        long j3 = iArr2[1] & 4294967295L;
        long j4 = iArr2[2] & 4294967295L;
        long j5 = iArr2[3] & 4294967295L;
        long j6 = iArr2[4] & 4294967295L;
        long j7 = iArr2[5] & 4294967295L;
        long j8 = iArr2[6] & 4294967295L;
        long j9 = iArr2[7] & 4294967295L;
        long j10 = 0;
        int i2 = 0;
        while (i2 < 8) {
            long j11 = iArr[i2] & 4294967295L;
            int i3 = i2;
            long j12 = (j11 * j2) + (iArr3[i3] & 4294967295L);
            iArr3[i3] = (int) j12;
            int i4 = i3 + 1;
            long j13 = (j11 * j3) + (iArr3[i4] & 4294967295L) + (j12 >>> 32);
            iArr3[i4] = (int) j13;
            long j14 = (j11 * j4) + (iArr3[r4] & 4294967295L) + (j13 >>> 32);
            iArr3[i3 + 2] = (int) j14;
            long j15 = (j11 * j5) + (iArr3[r4] & 4294967295L) + (j14 >>> 32);
            iArr3[i3 + 3] = (int) j15;
            long j16 = (j11 * j6) + (iArr3[r4] & 4294967295L) + (j15 >>> 32);
            iArr3[i3 + 4] = (int) j16;
            long j17 = (j11 * j7) + (iArr3[r4] & 4294967295L) + (j16 >>> 32);
            iArr3[i3 + 5] = (int) j17;
            long j18 = (j11 * j8) + (iArr3[r4] & 4294967295L) + (j17 >>> 32);
            iArr3[i3 + 6] = (int) j18;
            long j19 = (j11 * j9) + (iArr3[r4] & 4294967295L) + (j18 >>> 32);
            iArr3[i3 + 7] = (int) j19;
            long j20 = (j19 >>> 32) + (iArr3[r4] & 4294967295L) + j10;
            iArr3[i3 + 8] = (int) j20;
            j10 = j20 >>> 32;
            i2 = i4;
        }
        return (int) j10;
    }

    public static final Throwable c(Throwable th, kg3 kg3Var, wr4 wr4Var, bo1 bo1Var) {
        if (kg3Var == null) {
            return th;
        }
        c5.m0(th, new yj((Object) bo1Var, (Object) wr4Var, (Object) kg3Var, (byte) 11));
        return th;
    }

    public static final Object c0(f83 f83Var, Bundle bundle, String str, String str2) {
        str.getClass();
        Object d2 = f83Var.d(str2);
        f83Var.e(bundle, str, d2);
        return d2;
    }

    public static final Locale d(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (j42.c(forLanguageTag.toLanguageTag(), C.LANGUAGE_UNDETERMINED)) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }

    public static final Object d0(f83 f83Var, Bundle bundle, String str, String str2, Object obj) {
        if (!bundle.containsKey(str)) {
            s83.t("There is no previous value in this savedState.");
            return null;
        }
        Object c2 = f83Var.c(obj, str2);
        f83Var.e(bundle, str, c2);
        return c2;
    }

    public static final g12 e(kg3 kg3Var, wr4 wr4Var) {
        return new g12((Object) kg3Var, (Object) wr4Var, (byte) 22);
    }

    public static void e0(r2 r2Var, long j2) {
        LockSupport.parkNanos(r2Var, Math.min(j2, 2147483647999999999L));
    }

    public static int f(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j4 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j4;
        long j5 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j4 >>> 32);
        iArr3[3] = (int) j5;
        long j6 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j5 >>> 32);
        iArr3[4] = (int) j6;
        long j7 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j6 >>> 32);
        iArr3[5] = (int) j7;
        long j8 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j7 >>> 32);
        iArr3[6] = (int) j8;
        long j9 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (j8 >>> 32);
        iArr3[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static final void f0(wr4 wr4Var, ap apVar, int i2) {
        while (true) {
            int i3 = wr4Var.v;
            if (i2 > i3 && i2 < wr4Var.u) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            wr4Var.N();
            if (wr4Var.x(wr4Var.v)) {
                apVar.g();
            }
            wr4Var.i();
        }
    }

    public static int g(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j4 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j4;
        long j5 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j4 >>> 32);
        iArr3[3] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static final void g0(yp ypVar, tm1 tm1Var) {
        yp ypVar2 = new yp(999);
        int i2 = ypVar.K;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            ypVar2.put(ypVar.e(i3), ypVar.h(i3));
            i3++;
            i4++;
            if (i4 == 999) {
                tm1Var.invoke(ypVar2);
                ypVar2.clear();
                i4 = 0;
            }
        }
        if (i4 > 0) {
            tm1Var.invoke(ypVar2);
        }
    }

    public static int h(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j4 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j4;
        long j5 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j4 >>> 32);
        iArr3[3] = (int) j5;
        long j6 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j5 >>> 32);
        iArr3[4] = (int) j6;
        long j7 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j6 >>> 32);
        iArr3[5] = (int) j7;
        long j8 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j7 >>> 32);
        iArr3[6] = (int) j8;
        long j9 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L) + (j8 >>> 32);
        iArr3[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static final Object h0(hn1 hn1Var) {
        Thread.interrupted();
        return g4.b0(l91.I, new k((Object) hn1Var, (fj0) null, (byte) 15));
    }

    public static int i(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        long j2 = (iArr[i2] & 4294967295L) + (iArr2[i3] & 4294967295L) + (i4 & 4294967295L);
        iArr2[i3] = (int) j2;
        long j3 = (iArr[i2 + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j2 >>> 32);
        iArr2[i3 + 1] = (int) j3;
        long j4 = (iArr[i2 + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j3 >>> 32);
        iArr2[i3 + 2] = (int) j4;
        long j5 = (iArr[i2 + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j4 >>> 32);
        iArr2[i3 + 3] = (int) j5;
        long j6 = (iArr[i2 + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j5 >>> 32);
        iArr2[i3 + 4] = (int) j6;
        long j7 = (iArr[i2 + 5] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j6 >>> 32);
        iArr2[i3 + 5] = (int) j7;
        long j8 = (iArr[i2 + 6] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j7 >>> 32);
        iArr2[i3 + 6] = (int) j8;
        long j9 = (iArr[i2 + 7] & 4294967295L) + (4294967295L & iArr2[r10]) + (j8 >>> 32);
        iArr2[i3 + 7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static void i0(int[] iArr, int[] iArr2) {
        long j2 = iArr[0] & 4294967295L;
        int i2 = 8;
        int i3 = 0;
        int i4 = 3;
        while (true) {
            int i5 = i4 - 1;
            long j3 = iArr[i4] & 4294967295L;
            long j4 = j3 * j3;
            iArr2[i2 - 1] = (i3 << 31) | ((int) (j4 >>> 33));
            i2 -= 2;
            iArr2[i2] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i5 <= 0) {
                long j5 = j2 * j2;
                long j6 = (j5 >>> 33) | ((i3 << 31) & 4294967295L);
                iArr2[0] = (int) j5;
                int i6 = ((int) (j5 >>> 32)) & 1;
                long j7 = iArr[1] & 4294967295L;
                long j8 = (j7 * j2) + j6;
                int i7 = (int) j8;
                iArr2[1] = i6 | (i7 << 1);
                int i8 = i7 >>> 31;
                long j9 = iArr[2] & 4294967295L;
                long j10 = (j9 * j2) + (iArr2[2] & 4294967295L) + (j8 >>> 32);
                int i9 = (int) j10;
                iArr2[2] = i8 | (i9 << 1);
                long k2 = nt3.k(j9, j7, j10 >>> 32, iArr2[3] & 4294967295L);
                long j11 = (iArr2[4] & 4294967295L) + (k2 >>> 32);
                long j12 = iArr[3] & 4294967295L;
                long j13 = (iArr2[5] & 4294967295L) + (j11 >>> 32);
                long j14 = (j2 * j12) + (k2 & 4294967295L);
                int i10 = (int) j14;
                iArr2[3] = (i9 >>> 31) | (i10 << 1);
                long k3 = nt3.k(j12, j7, j14 >>> 32, j11 & 4294967295L);
                long k4 = nt3.k(j12, j9, k3 >>> 32, j13 & 4294967295L);
                long j15 = (iArr2[6] & 4294967295L) + (j13 >>> 32) + (k4 >>> 32);
                int i11 = (int) k3;
                iArr2[4] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                int i13 = (int) (k4 & 4294967295L);
                iArr2[5] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) j15;
                iArr2[6] = i14 | (i15 << 1);
                iArr2[7] = (i15 >>> 31) | ((iArr2[7] + ((int) (j15 >>> 32))) << 1);
                return;
            }
            i4 = i5;
        }
    }

    public static int j(int[] iArr, int[] iArr2) {
        long j2 = (iArr[8] & 4294967295L) + (iArr2[16] & 4294967295L);
        int i2 = (int) j2;
        iArr[8] = i2;
        iArr2[16] = i2;
        long j3 = (iArr[9] & 4294967295L) + (iArr2[17] & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[9] = i3;
        iArr2[17] = i3;
        long j4 = (iArr[10] & 4294967295L) + (iArr2[18] & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[10] = i4;
        iArr2[18] = i4;
        long j5 = (iArr[11] & 4294967295L) + (iArr2[19] & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[11] = i5;
        iArr2[19] = i5;
        long j6 = (iArr[12] & 4294967295L) + (iArr2[20] & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[12] = i6;
        iArr2[20] = i6;
        long j7 = (iArr[13] & 4294967295L) + (iArr2[21] & 4294967295L) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[13] = i7;
        iArr2[21] = i7;
        long j8 = (iArr[14] & 4294967295L) + (iArr2[22] & 4294967295L) + (j7 >>> 32);
        int i8 = (int) j8;
        iArr[14] = i8;
        iArr2[22] = i8;
        long j9 = (iArr[15] & 4294967295L) + (4294967295L & iArr2[23]) + (j8 >>> 32);
        int i9 = (int) j9;
        iArr[15] = i9;
        iArr2[23] = i9;
        return (int) (j9 >>> 32);
    }

    public static void j0(int[] iArr, int[] iArr2) {
        long j2 = iArr[0] & 4294967295L;
        int i2 = 16;
        int i3 = 0;
        int i4 = 7;
        while (true) {
            int i5 = i4 - 1;
            long j3 = iArr[i4] & 4294967295L;
            long j4 = j3 * j3;
            iArr2[i2 - 1] = (i3 << 31) | ((int) (j4 >>> 33));
            i2 -= 2;
            iArr2[i2] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i5 <= 0) {
                long j5 = j2 * j2;
                long j6 = (j5 >>> 33) | ((i3 << 31) & 4294967295L);
                iArr2[0] = (int) j5;
                int i6 = ((int) (j5 >>> 32)) & 1;
                long j7 = iArr[1] & 4294967295L;
                long j8 = (j7 * j2) + j6;
                int i7 = (int) j8;
                iArr2[1] = i6 | (i7 << 1);
                long j9 = iArr[2] & 4294967295L;
                long j10 = (j9 * j2) + (iArr2[2] & 4294967295L) + (j8 >>> 32);
                int i8 = (int) j10;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long k2 = nt3.k(j9, j7, j10 >>> 32, iArr2[3] & 4294967295L);
                long j11 = (iArr2[4] & 4294967295L) + (k2 >>> 32);
                long j12 = iArr[3] & 4294967295L;
                long j13 = (iArr2[5] & 4294967295L) + (j11 >>> 32);
                long j14 = j11 & 4294967295L;
                long j15 = (iArr2[6] & 4294967295L) + (j13 >>> 32);
                long j16 = j13 & 4294967295L;
                long j17 = (j12 * j2) + (k2 & 4294967295L);
                int i9 = (int) j17;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                int i10 = i9 >>> 31;
                long k3 = nt3.k(j12, j7, j17 >>> 32, j14);
                long k4 = nt3.k(j12, j9, k3 >>> 32, j16);
                long j18 = j15 + (k4 >>> 32);
                long j19 = k4 & 4294967295L;
                long j20 = iArr[4] & 4294967295L;
                long j21 = (iArr2[7] & 4294967295L) + (j18 >>> 32);
                long j22 = (iArr2[8] & 4294967295L) + (j21 >>> 32);
                long j23 = j21 & 4294967295L;
                long j24 = (j20 * j2) + (k3 & 4294967295L);
                int i11 = (int) j24;
                iArr2[4] = i10 | (i11 << 1);
                long k5 = nt3.k(j20, j7, j24 >>> 32, j19);
                long k6 = nt3.k(j20, j9, k5 >>> 32, j18 & 4294967295L);
                long k7 = nt3.k(j20, j12, k6 >>> 32, j23);
                long j25 = k6 & 4294967295L;
                long j26 = j22 + (k7 >>> 32);
                long j27 = k7 & 4294967295L;
                long j28 = iArr[5] & 4294967295L;
                long j29 = (iArr2[9] & 4294967295L) + (j26 >>> 32);
                long j30 = (j28 * j2) + (k5 & 4294967295L);
                int i12 = (int) j30;
                iArr2[5] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long k8 = nt3.k(j28, j7, j30 >>> 32, j25);
                long k9 = nt3.k(j28, j9, k8 >>> 32, j27);
                long k10 = nt3.k(j28, j12, k9 >>> 32, j26 & 4294967295L);
                long j31 = k9 & 4294967295L;
                long k11 = nt3.k(j28, j20, k10 >>> 32, j29 & 4294967295L);
                long j32 = k10 & 4294967295L;
                long j33 = (iArr2[10] & 4294967295L) + (j29 >>> 32) + (k11 >>> 32);
                long j34 = iArr[6] & 4294967295L;
                long j35 = (iArr2[11] & 4294967295L) + (j33 >>> 32);
                long j36 = (iArr2[12] & 4294967295L) + (j35 >>> 32);
                long j37 = (j34 * j2) + (k8 & 4294967295L);
                int i14 = (int) j37;
                iArr2[6] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long k12 = nt3.k(j34, j7, j37 >>> 32, j31);
                long k13 = nt3.k(j34, j9, k12 >>> 32, j32);
                long k14 = nt3.k(j34, j12, k13 >>> 32, k11 & 4294967295L);
                long j38 = k13 & 4294967295L;
                long k15 = nt3.k(j34, j20, k14 >>> 32, j33 & 4294967295L);
                long j39 = k14 & 4294967295L;
                long k16 = nt3.k(j34, j28, k15 >>> 32, j35 & 4294967295L);
                long j40 = j36 + (k16 >>> 32);
                long j41 = iArr[7] & 4294967295L;
                long j42 = (iArr2[13] & 4294967295L) + (j40 >>> 32);
                long j43 = (iArr2[14] & 4294967295L) + (j42 >>> 32);
                long j44 = j42 & 4294967295L;
                long j45 = (j41 * j2) + (k12 & 4294967295L);
                int i16 = (int) j45;
                iArr2[7] = (i16 << 1) | i15;
                int i17 = i16 >>> 31;
                long k17 = nt3.k(j41, j7, j45 >>> 32, j38);
                long k18 = nt3.k(j41, j9, k17 >>> 32, j39);
                long k19 = nt3.k(j41, j12, k18 >>> 32, k15 & 4294967295L);
                long k20 = nt3.k(j41, j20, k19 >>> 32, k16 & 4294967295L);
                long k21 = nt3.k(j41, j28, k20 >>> 32, j40 & 4294967295L);
                long k22 = nt3.k(j41, j34, k21 >>> 32, j44);
                long j46 = j43 + (k22 >>> 32);
                int i18 = (int) k17;
                iArr2[8] = (i18 << 1) | i17;
                int i19 = (int) k18;
                iArr2[9] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) k19;
                iArr2[10] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) k20;
                iArr2[11] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) k21;
                iArr2[12] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) k22;
                iArr2[13] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j46;
                iArr2[14] = i28 | (i29 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j46 >>> 32))) << 1) | (i29 >>> 31);
                return;
            }
            i4 = i5;
        }
    }

    public static final long k(long j2) {
        float[] fArr = {0.0f, 0.0f, 0.0f};
        int i0 = qb.i0(j2);
        int i2 = w90.a;
        b10.b(i0, hs5.k, null, fArr);
        float o = wx5.o(i0);
        fArr[2] = o;
        return qb.i(b10.d(fArr[0], fArr[1], ut0.q(o + (o > 50.0f ? 5.0f : -10.0f), 0.0f, 100.0f)));
    }

    public static int k0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j2 >> 32);
        iArr3[1] = (int) j3;
        long j4 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j3 >> 32);
        iArr3[2] = (int) j4;
        long j5 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j4 >> 32);
        iArr3[3] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static final Object l(fl2 fl2Var, fj0 fj0Var) {
        try {
            if (fl2Var.isDone()) {
                return n4.f(fl2Var);
            }
            k10 k10Var = new k10(1, mu0.G(fj0Var));
            k10Var.t();
            fl2Var.a(hx0.I, new g85(fl2Var, k10Var, (byte) 1));
            k10Var.v(new am0(fl2Var, (byte) 2));
            return k10Var.r();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            cause.getClass();
            throw cause;
        }
    }

    public static void l0(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3) {
        long j2 = (iArr[i2] & 4294967295L) - (iArr2[i3] & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((iArr[i2 + 1] & 4294967295L) - (iArr2[i3 + 1] & 4294967295L)) + (j2 >> 32);
        iArr3[1] = (int) j3;
        long j4 = ((iArr[i2 + 2] & 4294967295L) - (iArr2[i3 + 2] & 4294967295L)) + (j3 >> 32);
        iArr3[2] = (int) j4;
        long j5 = ((iArr[i2 + 3] & 4294967295L) - (iArr2[i3 + 3] & 4294967295L)) + (j4 >> 32);
        iArr3[3] = (int) j5;
        long j6 = ((iArr[i2 + 4] & 4294967295L) - (iArr2[i3 + 4] & 4294967295L)) + (j5 >> 32);
        iArr3[4] = (int) j6;
        long j7 = ((iArr[i2 + 5] & 4294967295L) - (iArr2[i3 + 5] & 4294967295L)) + (j6 >> 32);
        iArr3[5] = (int) j7;
        long j8 = ((iArr[i2 + 6] & 4294967295L) - (iArr2[i3 + 6] & 4294967295L)) + (j7 >> 32);
        iArr3[6] = (int) j8;
        iArr3[7] = (int) (((iArr[i2 + 7] & 4294967295L) - (iArr2[i3 + 7] & 4294967295L)) + (j8 >> 32));
    }

    public static final int m(float f2) {
        return (int) Math.ceil(f2);
    }

    public static int m0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j2 >> 32);
        iArr3[1] = (int) j3;
        long j4 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j3 >> 32);
        iArr3[2] = (int) j4;
        long j5 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j4 >> 32);
        iArr3[3] = (int) j5;
        long j6 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j5 >> 32);
        iArr3[4] = (int) j6;
        long j7 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j6 >> 32);
        iArr3[5] = (int) j7;
        long j8 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j7 >> 32);
        iArr3[6] = (int) j8;
        long j9 = ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L)) + (j8 >> 32);
        iArr3[7] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static void n(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    public static void n0(int[] iArr, int[] iArr2) {
        long j2 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j2 >> 32);
        iArr2[1] = (int) j3;
        long j4 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j3 >> 32);
        iArr2[2] = (int) j4;
        long j5 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j4 >> 32);
        iArr2[3] = (int) j5;
        long j6 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j5 >> 32);
        iArr2[4] = (int) j6;
        long j7 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j6 >> 32);
        iArr2[5] = (int) j7;
        long j8 = ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L)) + (j7 >> 32);
        iArr2[6] = (int) j8;
        iArr2[7] = (int) (((iArr2[7] & 4294967295L) - (4294967295L & iArr[7])) + (j8 >> 32));
    }

    public static long[] o(long[]... jArr) {
        long j2 = 0;
        for (long[] jArr2 : jArr) {
            j2 += jArr2.length;
        }
        int i2 = (int) j2;
        sp0.q(j2 == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", j2);
        long[] jArr3 = new long[i2];
        int i3 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i3, jArr4.length);
            i3 += jArr4.length;
        }
        return jArr3;
    }

    public static BigInteger o0(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                dq2.a0(bArr, i3, (7 - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void p(int i2, int[] iArr, int[] iArr2) {
        iArr2[i2] = iArr[0];
        iArr2[i2 + 1] = iArr[1];
        iArr2[i2 + 2] = iArr[2];
        iArr2[i2 + 3] = iArr[3];
    }

    public static BigInteger p0(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i2 = 0; i2 < 4; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                dq2.n0(bArr, (3 - i2) << 3, j2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void q(int i2, int[] iArr, int[] iArr2) {
        iArr2[i2] = iArr[0];
        iArr2[i2 + 1] = iArr[1];
        iArr2[i2 + 2] = iArr[2];
        iArr2[i2 + 3] = iArr[3];
        iArr2[i2 + 4] = iArr[4];
        iArr2[i2 + 5] = iArr[5];
        iArr2[i2 + 6] = iArr[6];
        iArr2[i2 + 7] = iArr[7];
    }

    public static final ExtractedText q0(d55 d55Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = d55Var.a.J;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = d55Var.b;
        extractedText.selectionStart = d65.f(j2);
        extractedText.selectionEnd = d65.e(j2);
        extractedText.flags = !jx4.E(d55Var.a.J, '\n') ? 1 : 0;
        return extractedText;
    }

    public static void r(int i2, long[] jArr, long[] jArr2) {
        jArr2[i2] = jArr[0];
        jArr2[i2 + 1] = jArr[1];
    }

    public static Long r0(String str) {
        byte b2;
        byte b3;
        str.getClass();
        if (str.isEmpty()) {
            return null;
        }
        int i2 = str.charAt(0) == '-' ? 1 : 0;
        if (i2 == str.length()) {
            return null;
        }
        int i3 = i2 + 1;
        char charAt = str.charAt(i2);
        if (charAt < 128) {
            b2 = cs2.a[charAt];
        } else {
            byte[] bArr = cs2.a;
            b2 = -1;
        }
        if (b2 < 0 || b2 >= 10) {
            return null;
        }
        long j2 = -b2;
        while (i3 < str.length()) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 128) {
                b3 = cs2.a[charAt2];
            } else {
                byte[] bArr2 = cs2.a;
                b3 = -1;
            }
            if (b3 < 0 || b3 >= 10 || j2 < -922337203685477580L) {
                return null;
            }
            long j3 = j2 * 10;
            long j4 = b3;
            if (j3 < Long.MIN_VALUE + j4) {
                return null;
            }
            j2 = j3 - j4;
            i3 = i4;
        }
        if (i2 != 0) {
            return Long.valueOf(j2);
        }
        if (j2 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j2);
    }

    public static void s(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static void s0(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        int i3 = iArr3[0];
        int i4 = 1;
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        long j2 = i3;
        long j3 = iArr[0];
        long j4 = i5;
        long j5 = iArr2[0];
        long j6 = (j4 * j5) + (j2 * j3);
        long j7 = i6;
        long j8 = i7;
        long j9 = ((j5 * j8) + (j3 * j7)) >> 30;
        int i8 = 1;
        long j10 = j6 >> 30;
        while (i8 < i2) {
            long j11 = iArr[i8];
            int i9 = i4;
            long j12 = j7;
            long j13 = iArr2[i8];
            long k2 = nt3.k(j4, j13, j2 * j11, j10);
            long j14 = j8;
            long k3 = nt3.k(j14, j13, j12 * j11, j9);
            int i10 = i8 - 1;
            iArr[i10] = ((int) k2) & 1073741823;
            j10 = k2 >> 30;
            iArr2[i10] = ((int) k3) & 1073741823;
            j9 = k3 >> 30;
            i8++;
            i4 = i9;
            j8 = j14;
            j7 = j12;
        }
        int i11 = i2 - i4;
        iArr[i11] = (int) j10;
        iArr2[i11] = (int) j9;
    }

    public static void t(int i2, long[] jArr, long[] jArr2) {
        jArr2[i2] = jArr[0];
        jArr2[i2 + 1] = jArr[1];
        jArr2[i2 + 2] = jArr[2];
        jArr2[i2 + 3] = jArr[3];
    }

    public static void u(int i2, long[] jArr, long[] jArr2) {
        jArr2[i2] = jArr[0];
        jArr2[i2 + 1] = jArr[1];
        jArr2[i2 + 2] = jArr[2];
        jArr2[i2 + 3] = jArr[3];
        jArr2[i2 + 4] = jArr[4];
        jArr2[i2 + 5] = jArr[5];
        jArr2[i2 + 6] = jArr[6];
        jArr2[i2 + 7] = jArr[7];
        jArr2[i2 + 8] = jArr[8];
    }

    public static boolean v(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i2 = 7;
        while (true) {
            z = true;
            if (i2 < 0) {
                break;
            }
            int i3 = iArr[8 + i2] - 2147483648;
            int i4 = iArr2[i2] - 2147483648;
            if (i3 < i4) {
                z = false;
                break;
            }
            if (i3 > i4) {
                break;
            }
            i2--;
        }
        if (z) {
            l0(iArr, 8, iArr2, 0, iArr3);
            return z;
        }
        l0(iArr2, 0, iArr, 8, iArr3);
        return z;
    }

    public static void w(int i2, int[] iArr, int[] iArr2) {
        int i3 = 0;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i3 < Math.min(30, i2)) {
                j2 |= (iArr[i4] & 4294967295L) << i3;
                i3 += 32;
                i4++;
            }
            iArr2[i5] = ((int) j2) & 1073741823;
            j2 >>>= 30;
            i3 -= 30;
            i2 -= 30;
            i5++;
        }
    }

    public static boolean x(int[] iArr, int[] iArr2) {
        for (int i2 = 7; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean y(long[] jArr, long[] jArr2) {
        for (int i2 = 3; i2 >= 0; i2--) {
            if (jArr[i2] != jArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
