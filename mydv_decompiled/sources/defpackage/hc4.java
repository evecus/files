package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.RemoteViews;
import androidx.recyclerview.widget.e;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class hc4 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;
    public static hx1 d;

    public static final String A(Collection collection) {
        return !collection.isEmpty() ? kx4.o(o70.Z0(collection, ",\n", "\n", "\n", 0, null, 56), "    ").concat("},") : " }";
    }

    public static final nx5 B(ky5 ky5Var) {
        ky5Var.getClass();
        return new nx5(ky5Var.a, ky5Var.t);
    }

    public static final float C(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final m14 D(an3 an3Var, int i, u95 u95Var, u55 u55Var, boolean z, int i2) {
        m14 c2 = u55Var != null ? u55Var.c(u95Var.b.k(i)) : m14.e;
        an3Var.getClass();
        int b2 = r7.b(2.0f, an3Var);
        float f = c2.a;
        return new m14(z ? (i2 - f) - b2 : f, c2.b, z ? i2 - f : b2 + f, c2.d);
    }

    public static final c81 E() {
        if (!c81.d()) {
            return null;
        }
        c81 a2 = c81.a();
        if (a2.c() == 1) {
            return a2;
        }
        return null;
    }

    public static jk3 F() {
        return su5.a;
    }

    public static boolean G(TypedArray typedArray, XmlPullParser xmlPullParser, boolean z) {
        return !R(xmlPullParser, "autoMirrored") ? z : typedArray.getBoolean(5, z);
    }

    public static ColorStateList H(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!R(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = q90.a;
        try {
            return q90.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static yv I(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        yv yvVar;
        if (R(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new yv(null, null, typedValue.data);
            }
            try {
                yvVar = yv.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                yvVar = null;
            }
            if (yvVar != null) {
                return yvVar;
            }
        }
        return new yv(null, null, 0);
    }

    public static float J(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !R(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int K(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !R(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static String L(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (R(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static final int[] M(s55 s55Var, Layout layout, zw zwVar, RectF rectF, int i, rd rdVar) {
        nh4 gr1Var;
        int i2;
        if (i == 1) {
            gr1Var = new v05(s55Var.f.getText(), s55Var.l());
        } else {
            CharSequence text = s55Var.f.getText();
            gr1Var = Build.VERSION.SDK_INT >= 29 ? new gr1(text, s55Var.a) : new hr1(text);
        }
        nh4 nh4Var = gr1Var;
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > s55Var.e(lineForVertical) && (lineForVertical = lineForVertical + 1) >= s55Var.g) {
            return null;
        }
        int i3 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < s55Var.i(0)) {
            return null;
        }
        int O = O(s55Var, layout, zwVar, i3, rectF, nh4Var, rdVar, true);
        while (true) {
            i2 = i3;
            if (O != -1 || i2 >= lineForVertical2) {
                break;
            }
            i3 = i2 + 1;
            O = O(s55Var, layout, zwVar, i3, rectF, nh4Var, rdVar, true);
        }
        if (O == -1) {
            return null;
        }
        int O2 = O(s55Var, layout, zwVar, lineForVertical2, rectF, nh4Var, rdVar, false);
        while (O2 == -1 && i2 < lineForVertical2) {
            int i4 = lineForVertical2 - 1;
            O2 = O(s55Var, layout, zwVar, i4, rectF, nh4Var, rdVar, false);
            lineForVertical2 = i4;
        }
        if (O2 == -1) {
            return null;
        }
        return new int[]{nh4Var.c(O + 1), nh4Var.d(O2 - 1)};
    }

    public static final hx1 N() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Outlined.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep p = hf1.p(12.0f, 17.27f, 18.18f, 21.0f);
        p.y(-1.64f, -7.03f);
        p.x(22.0f, 9.24f);
        p.y(-7.19f, -0.61f);
        p.x(12.0f, 2.0f);
        p.x(9.19f, 8.63f);
        p.x(2.0f, 9.24f);
        p.y(5.46f, 4.73f);
        p.x(5.82f, 21.0f);
        p.x(12.0f, 17.27f);
        p.p();
        gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
        hx1 b2 = gx1Var.b();
        a = b2;
        return b2;
    }

    public static final int O(s55 s55Var, Layout layout, zw zwVar, int i, RectF rectF, nh4 nh4Var, rd rdVar, boolean z) {
        fa2[] fa2VarArr;
        int i2;
        fa2[] fa2VarArr2;
        int i3;
        int d2;
        int i4;
        int i5;
        int c2;
        Bidi createLineBidi;
        boolean z2;
        float a2;
        float a3;
        float f;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i6 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i6];
        Layout layout2 = s55Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int f2 = s55Var.f(i);
        if (i6 < (f2 - lineStart2) * 2) {
            r02.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        ev1 ev1Var = new ev1(s55Var);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i7 = 0;
        while (lineStart2 < f2) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !isRtlCharAt) {
                a2 = ev1Var.a(lineStart2, z3, z3, true);
                f = ev1Var.a(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && isRtlCharAt) {
                z2 = z4;
                f = ev1Var.a(lineStart2, false, false, false);
                a2 = ev1Var.a(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (isRtlCharAt) {
                    a3 = ev1Var.a(lineStart2, false, false, true);
                    a2 = ev1Var.a(lineStart2 + 1, true, true, true);
                } else {
                    a2 = ev1Var.a(lineStart2, false, false, false);
                    a3 = ev1Var.a(lineStart2 + 1, true, true, false);
                }
                f = a3;
            }
            fArr[i7] = a2;
            fArr[i7 + 1] = f;
            i7 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) zwVar.a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int g = zwVar.g(lineStart3, false);
        int h = zwVar.h(g);
        int i8 = lineStart3 - h;
        int i9 = lineEnd2 - h;
        Bidi d3 = zwVar.d(g);
        if (d3 == null || (createLineBidi = d3.createLineBidi(i8, i9)) == null) {
            i2 = 0;
            fa2VarArr = new fa2[]{new fa2(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            fa2VarArr = new fa2[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int i11 = runCount;
                fa2VarArr[i10] = new fa2(createLineBidi.getRunStart(i10) + lineStart3, createLineBidi.getRunLimit(i10) + lineStart3, createLineBidi.getRunLevel(i10) % 2 == 1);
                i10++;
                runCount = i11;
            }
            i2 = 0;
        }
        s22 u22Var = z ? new u22(i2, fa2VarArr.length - 1, 1) : new s22(fa2VarArr.length - 1, i2, -1);
        int i12 = u22Var.I;
        int i13 = u22Var.J;
        int i14 = u22Var.K;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            fa2 fa2Var = fa2VarArr[i12];
            boolean z5 = fa2Var.c;
            int i15 = fa2Var.a;
            int i16 = fa2Var.b;
            float f3 = z5 ? fArr[((i16 - 1) - lineStart) * 2] : fArr[(i15 - lineStart) * 2];
            float C = z5 ? C(i15, lineStart, fArr) : C(i16 - 1, lineStart, fArr);
            float f4 = rectF.left;
            int i17 = i14;
            if (z) {
                if (C >= f4) {
                    float f5 = rectF.right;
                    if (f3 <= f5) {
                        if ((z5 || f4 > f3) && (!z5 || f5 < C)) {
                            int i18 = i16;
                            int i19 = i15;
                            while (true) {
                                i4 = i18;
                                if (i18 - i19 <= 1) {
                                    break;
                                }
                                int i20 = (i4 + i19) / 2;
                                float f6 = fArr[(i20 - lineStart) * 2];
                                if ((z5 || f6 <= rectF.left) && (!z5 || f6 >= rectF.right)) {
                                    i18 = i4;
                                    i19 = i20;
                                } else {
                                    i18 = i20;
                                }
                            }
                            i5 = z5 ? i4 : i19;
                        } else {
                            i5 = i15;
                        }
                        int d4 = nh4Var.d(i5);
                        if (d4 != -1 && (c2 = nh4Var.c(d4)) < i16) {
                            if (c2 >= i15) {
                                i15 = c2;
                            }
                            if (d4 > i16) {
                                d4 = i16;
                            }
                            fa2VarArr2 = fa2VarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i21 = d4;
                            while (true) {
                                rectF2.left = z5 ? fArr[((i21 - 1) - lineStart) * 2] : fArr[(i15 - lineStart) * 2];
                                rectF2.right = z5 ? C(i15, lineStart, fArr) : C(i21 - 1, lineStart, fArr);
                                if (!((Boolean) rdVar.invoke(rectF2, rectF)).booleanValue()) {
                                    i15 = nh4Var.a(i15);
                                    if (i15 == -1 || i15 >= i16) {
                                        break;
                                    }
                                    i21 = nh4Var.d(i15);
                                    if (i21 > i16) {
                                        i21 = i16;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i15 = -1;
                        }
                    }
                }
                fa2VarArr2 = fa2VarArr;
                i15 = -1;
            } else {
                fa2VarArr2 = fa2VarArr;
                if (C >= f4) {
                    float f7 = rectF.right;
                    if (f3 <= f7) {
                        if ((z5 || f7 < C) && (!z5 || f4 > f3)) {
                            int i22 = i16;
                            int i23 = i15;
                            while (i22 - i23 > 1) {
                                int i24 = (i22 + i23) / 2;
                                float f8 = fArr[(i24 - lineStart) * 2];
                                int i25 = i22;
                                if ((z5 || f8 <= rectF.right) && (!z5 || f8 >= rectF.left)) {
                                    i22 = i25;
                                    i23 = i24;
                                } else {
                                    i22 = i24;
                                }
                            }
                            i3 = z5 ? i22 : i23;
                        } else {
                            i3 = i16 - 1;
                        }
                        int c3 = nh4Var.c(i3 + 1);
                        if (c3 != -1 && (d2 = nh4Var.d(c3)) > i15) {
                            if (c3 < i15) {
                                c3 = i15;
                            }
                            if (d2 <= i16) {
                                i16 = d2;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i26 = c3;
                            while (true) {
                                rectF3.left = z5 ? fArr[((i16 - 1) - lineStart) * 2] : fArr[(i26 - lineStart) * 2];
                                rectF3.right = z5 ? C(i26, lineStart, fArr) : C(i16 - 1, lineStart, fArr);
                                if (!((Boolean) rdVar.invoke(rectF3, rectF)).booleanValue()) {
                                    i16 = nh4Var.b(i16);
                                    if (i16 == -1 || i16 <= i15) {
                                        break;
                                    }
                                    i26 = nh4Var.c(i16);
                                    if (i26 < i15) {
                                        i26 = i15;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i16 = -1;
                i15 = i16;
            }
            if (i15 >= 0) {
                return i15;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i17;
            i14 = i17;
            fa2VarArr = fa2VarArr2;
        }
    }

    public static final hx1 P() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.SwapHoriz", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep p = hf1.p(6.99f, 11.0f, 3.0f, 15.0f);
        p.y(3.99f, 4.0f);
        p.M(-3.0f);
        p.u(14.0f);
        p.M(-2.0f);
        p.u(6.99f);
        p.M(-3.0f);
        p.p();
        p.z(21.0f, 9.0f);
        p.y(-3.99f, -4.0f);
        p.M(3.0f);
        p.u(10.0f);
        p.M(2.0f);
        p.v(7.01f);
        p.M(3.0f);
        p.x(21.0f, 9.0f);
        p.p();
        gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    public static final hx1 Q() {
        hx1 hx1Var = d;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(1.0f, 21.0f);
        epVar.v(22.0f);
        epVar.x(12.0f, 2.0f);
        epVar.x(1.0f, 21.0f);
        epVar.p();
        epVar.z(13.0f, 18.0f);
        epVar.v(-2.0f);
        epVar.M(-2.0f);
        epVar.v(2.0f);
        epVar.M(2.0f);
        epVar.p();
        epVar.z(13.0f, 14.0f);
        epVar.v(-2.0f);
        epVar.M(-4.0f);
        epVar.v(2.0f);
        epVar.M(4.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        d = b2;
        return b2;
    }

    public static boolean R(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static void S(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    public static void T(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        S(jArr, jArr4);
        S(jArr2, jArr5);
        long[] jArr6 = new long[8];
        U(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        U(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        U(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        U(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        U(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        U(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        U(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        U(jArr6, j, j3, jArr7, 0);
        U(jArr6, j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 59);
        jArr3[1] = (j13 >>> 5) ^ (j8 << 54);
        jArr3[2] = (j8 >>> 10) ^ (j9 << 49);
        jArr3[3] = (j9 >>> 15) ^ (j10 << 44);
        jArr3[4] = (j10 >>> 20) ^ (j11 << 39);
        jArr3[5] = (j11 >>> 25) ^ (j14 << 34);
        jArr3[6] = (j14 >>> 30) ^ (j15 << 29);
        jArr3[7] = j15 >>> 35;
    }

    public static void U(long[] jArr, long j, long j2, long[] jArr2, int i) {
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

    public static final int V(RemoteViews remoteViews, ha5 ha5Var, int i, int i2, Integer num) {
        int i3;
        if (i == -1) {
            s83.t("viewStubId must not be View.NO_ID");
            return 0;
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            int incrementAndGet = ha5Var.g.incrementAndGet();
            if (incrementAndGet >= to1.j) {
                zy.i("There are too many views");
                return 0;
            }
            i3 = incrementAndGet + to1.i;
        }
        if (i3 != -1) {
            remoteViews.setInt(i, "setInflatedId", i3);
        }
        if (i2 != 0) {
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return i3;
    }

    public static final an4 W(an4 an4Var, an4 an4Var2, float f) {
        return new an4(qb.T(an4Var.a, an4Var2.a, f), dq2.i0(an4Var.b, an4Var2.b, f), vt0.G(an4Var.c, an4Var2.c, f));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ix1 X(android.content.res.Resources.Theme r54, android.content.res.Resources r55, android.content.res.XmlResourceParser r56, int r57) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc4.X(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):ix1");
    }

    public static final long Y(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : x70.c(j, x70.d(j) * f);
    }

    public static void Z(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        T(jArr, jArr2, jArr4);
        d0(jArr4, jArr3);
    }

    public static final void a(l13 l13Var, tc0 tc0Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1854833411);
        int i2 = (go1Var.g(l13Var) ? 4 : 2) | i;
        byte b2 = 1;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = kc.f;
                go1Var.o0(Q);
            }
            uw2 uw2Var = (uw2) Q;
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, l13Var);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, uw2Var);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            tc0Var.invoke(go1Var, 6);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ql0(l13Var, tc0Var, i, b2);
        }
    }

    public static TypedArray a0(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final float b(float f, e55 e55Var) {
        return Float.isNaN(f) ? ((Number) e55Var.invoke()).floatValue() : f;
    }

    public static ti5 b0(String str) {
        String group;
        if (str == null || jx4.L(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
        group4.getClass();
        return new ti5(group4, parseInt, parseInt2, parseInt3);
    }

    public static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static final th4 d(zp4 zp4Var, n84 n84Var) {
        yl0 a2 = zp4Var.a();
        h60 h60Var = (h60) zp4Var.d;
        boolean z = a2 == yl0.I;
        return new th4(e(h60Var, z, true, n84Var), e(h60Var, z, false, n84Var), z);
    }

    public static void d0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = (j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33));
        long j14 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j15 = j11 >>> 41;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = (j15 << 10) ^ j13;
        jArr2[2] = j14;
        jArr2[3] = 2199023255551L & j11;
    }

    public static final sh4 e(h60 h60Var, boolean z, boolean z2, n84 n84Var) {
        long c2;
        long j;
        int i = z2 ? h60Var.b : h60Var.c;
        switch (n84Var.I) {
            case 2:
                String str = ((u55) h60Var.e).a.a.J;
                c2 = ui4.c(kb4.t(str, i), kb4.s(str, i));
                break;
            default:
                c2 = ((u55) h60Var.e).k(i);
                break;
        }
        if (z ^ z2) {
            int i2 = d65.c;
            j = c2 >> 32;
        } else {
            int i3 = d65.c;
            j = 4294967295L & c2;
        }
        return h60Var.b((int) j);
    }

    public static void e0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        e41.E(4, jArr, jArr3);
        d0(jArr3, jArr2);
    }

    public static final long f(kp3 kp3Var, boolean z) {
        List list = kp3Var.a;
        int size = list.size();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            rp3 rp3Var = (rp3) list.get(i2);
            if (rp3Var.d && rp3Var.h) {
                j = pd3.f(j, z ? rp3Var.c : rp3Var.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return pd3.b(j, i);
    }

    public static void f0(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        e41.E(4, jArr, jArr3);
        while (true) {
            d0(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                e41.E(4, jArr2, jArr3);
            }
        }
    }

    public static final float g(kp3 kp3Var, boolean z) {
        long f = f(kp3Var, z);
        float f2 = 0.0f;
        if (pd3.c(f, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = kp3Var.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            rp3 rp3Var = (rp3) list.get(i2);
            if (rp3Var.d && rp3Var.h) {
                i++;
                f2 = pd3.d(pd3.e(z ? rp3Var.c : rp3Var.g, f)) + f2;
            }
        }
        return f2 / i;
    }

    public static final sh4 g0(final zp4 zp4Var, final h60 h60Var, sh4 sh4Var) {
        int i = h60Var.c;
        int i2 = h60Var.b;
        boolean z = zp4Var.b;
        final int i3 = z ? i2 : i;
        u55 u55Var = (u55) h60Var.e;
        int i4 = h60Var.d;
        e03 e03Var = new e03(h60Var, i3, (byte) 2);
        dh2 dh2Var = dh2.J;
        final uc2 K = ut0.K(dh2Var, e03Var);
        final int i5 = z ? i : i2;
        uc2 K2 = ut0.K(dh2Var, new rm1() { // from class: uh4
            @Override // defpackage.rm1
            public final Object invoke() {
                h60 h60Var2 = h60.this;
                u55 u55Var2 = (u55) h60Var2.e;
                int intValue = ((Number) K.getValue()).intValue();
                zp4 zp4Var2 = zp4Var;
                boolean z2 = zp4Var2.b;
                boolean z3 = zp4Var2.a() == yl0.I;
                int i6 = i3;
                long k = u55Var2.k(i6);
                w23 w23Var = u55Var2.b;
                int i7 = d65.c;
                int i8 = (int) (k >> 32);
                int d2 = w23Var.d(i8);
                int i9 = w23Var.f;
                if (d2 != intValue) {
                    i8 = intValue >= i9 ? u55Var2.h(i9 - 1) : u55Var2.h(intValue);
                }
                int i10 = (int) (k & 4294967295L);
                if (w23Var.d(i10) != intValue) {
                    i10 = intValue >= i9 ? w23Var.c(i9 - 1, false) : w23Var.c(intValue, false);
                }
                int i11 = i5;
                if (i8 == i11) {
                    return h60Var2.b(i10);
                }
                if (i10 == i11) {
                    return h60Var2.b(i8);
                }
                if (!(z2 ^ z3) ? i6 >= i8 : i6 > i10) {
                    i8 = i10;
                }
                return h60Var2.b(i8);
            }
        });
        if (1 != sh4Var.c) {
            return (sh4) K2.getValue();
        }
        if (i3 == i4) {
            return sh4Var;
        }
        if (((Number) K.getValue()).intValue() != u55Var.b.d(i4)) {
            return (sh4) K2.getValue();
        }
        int i6 = sh4Var.b;
        long k = u55Var.k(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                yl0 yl0Var = yl0.I;
                if (!(((i2 < i ? yl0.J : i2 > i ? yl0Var : yl0.K) == yl0Var) ^ z)) {
                }
            }
            return h60Var.b(i3);
        }
        int i7 = d65.c;
        return (i6 == ((int) (k >> 32)) || i6 == ((int) (4294967295L & k))) ? (sh4) K2.getValue() : h60Var.b(i3);
    }

    public static final long h(kp3 kp3Var) {
        long f = f(kp3Var, true);
        if (pd3.c(f, 9205357640488583168L)) {
            return 0L;
        }
        return pd3.e(f, f(kp3Var, false));
    }

    public static final Iterator h0(Iterator it, int i, int i2) {
        it.getClass();
        return !it.hasNext() ? n91.I : oh4.n(new rr4(i, i2, it, null));
    }

    public static final sh4 i(sh4 sh4Var, h60 h60Var, int i) {
        return new sh4(((u55) h60Var.e).a(i), i, sh4Var.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i0(defpackage.hn3 r4, defpackage.o1 r5, defpackage.gj0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.b85
            if (r0 == 0) goto L13
            r0 = r6
            b85 r0 = (defpackage.b85) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            b85 r0 = new b85
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.J
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            o1 r5 = r0.I
            defpackage.mu0.V(r6)     // Catch: defpackage.w75 -> L28
            return r6
        L28:
            r4 = move-exception
            goto L48
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L30:
            defpackage.mu0.V(r6)
            r0.I = r5     // Catch: defpackage.w75 -> L28
            r0.K = r3     // Catch: defpackage.w75 -> L28
            o1 r6 = new o1     // Catch: defpackage.w75 -> L28
            r1 = 21
            r6.<init>(r5, r4, r2, r1)     // Catch: defpackage.w75 -> L28
            java.lang.Object r4 = defpackage.i42.o0(r6, r0)     // Catch: defpackage.w75 -> L28
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L47
            return r5
        L47:
            return r4
        L48:
            int r6 = r4.J
            int r5 = r5.hashCode()
            if (r6 != r5) goto L51
            return r2
        L51:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc4.i0(hn3, o1, gj0):java.lang.Object");
    }

    public static final void j(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            s83.h(i != i2 ? hf1.v("Both size ", i, " and step ", i2, " must be greater than zero.") : r7.z("size ", i, " must be greater than zero."));
        }
    }

    public static int k(long j) {
        sp0.q((j >> 32) == 0, "out of range: %s", j);
        return (int) j;
    }

    public static int m(h24 h24Var, sg3 sg3Var, View view, View view2, e eVar, boolean z) {
        if (eVar.u() == 0 || h24Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(((z14) view.getLayoutParams()).a.getLayoutPosition() - ((z14) view2.getLayoutParams()).a.getLayoutPosition()) + 1;
        }
        return Math.min(sg3Var.l(), sg3Var.b(view2) - sg3Var.e(view));
    }

    public static int n(h24 h24Var, sg3 sg3Var, View view, View view2, e eVar, boolean z, boolean z2) {
        if (eVar.u() == 0 || h24Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (h24Var.b() - Math.max(((z14) view.getLayoutParams()).a.getLayoutPosition(), ((z14) view2.getLayoutParams()).a.getLayoutPosition())) - 1) : Math.max(0, Math.min(((z14) view.getLayoutParams()).a.getLayoutPosition(), ((z14) view2.getLayoutParams()).a.getLayoutPosition()));
        if (z) {
            return Math.round((max * (Math.abs(sg3Var.b(view2) - sg3Var.e(view)) / (Math.abs(((z14) view.getLayoutParams()).a.getLayoutPosition() - ((z14) view2.getLayoutParams()).a.getLayoutPosition()) + 1))) + (sg3Var.k() - sg3Var.e(view)));
        }
        return max;
    }

    public static int o(h24 h24Var, sg3 sg3Var, View view, View view2, e eVar, boolean z) {
        if (eVar.u() == 0 || h24Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return h24Var.b();
        }
        return (int) (((sg3Var.b(view2) - sg3Var.e(view)) / (Math.abs(((z14) view.getLayoutParams()).a.getLayoutPosition() - ((z14) view2.getLayoutParams()).a.getLayoutPosition()) + 1)) * h24Var.b());
    }

    public static boolean p(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static boolean q(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean r(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean s(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    public static final long t() {
        return Thread.currentThread().getId();
    }

    public static final boolean v(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return j42.c(jx4.g0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static String x(f00 f00Var) {
        StringBuilder sb = new StringBuilder(f00Var.size());
        for (int i = 0; i < f00Var.size(); i++) {
            byte b2 = f00Var.J[i];
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int y(int i, String str) {
        String str2;
        int i2;
        c81 E = E();
        Integer num = null;
        if (E != null) {
            if (!(E.c() == 1)) {
                zy.i("Not initialized yet");
                return 0;
            }
            sv2.q(str, "charSequence cannot be null");
            x81 x81Var = E.e.b;
            x81Var.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    fc5[] fc5VarArr = (fc5[]) spanned.getSpans(i, i + 1, fc5.class);
                    if (fc5VarArr.length > 0) {
                        i2 = spanned.getSpanEnd(fc5VarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((v81) x81Var.s(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), androidx.media3.common.util.Log.LOG_LEVEL_OFF, true, new v81(i))).K;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int z(int i, String str) {
        c81 E = E();
        Integer num = null;
        if (E != null) {
            Integer valueOf = Integer.valueOf(E.b(str, Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public abstract int c0(byte[] bArr, int i, int i2);

    public abstract String u(byte[] bArr, int i, int i2);

    public abstract int w(String str, byte[] bArr, int i, int i2);
}
