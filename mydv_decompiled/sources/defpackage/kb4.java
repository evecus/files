package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class kb4 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;
    public static hx1 d;
    public static hx1 e;
    public static hx1 f;
    public static hx1 g;
    public static hx1 h;

    public static final hx1 A() {
        hx1 hx1Var = c;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Outlined.StarBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(22.0f, 9.24f);
        epVar.y(-7.19f, -0.62f);
        epVar.x(12.0f, 2.0f);
        epVar.x(9.19f, 8.63f);
        epVar.x(2.0f, 9.24f);
        epVar.y(5.46f, 4.73f);
        epVar.x(5.82f, 21.0f);
        epVar.x(12.0f, 17.27f);
        epVar.x(18.18f, 21.0f);
        epVar.y(-1.63f, -7.03f);
        epVar.x(22.0f, 9.24f);
        epVar.p();
        epVar.z(12.0f, 15.4f);
        epVar.y(-3.76f, 2.27f);
        epVar.y(1.0f, -4.28f);
        epVar.y(-3.32f, -2.88f);
        epVar.y(4.38f, -0.38f);
        epVar.x(12.0f, 6.1f);
        epVar.y(1.71f, 4.04f);
        epVar.y(4.38f, 0.38f);
        epVar.y(-3.32f, 2.88f);
        epVar.y(1.0f, 4.28f);
        epVar.x(12.0f, 15.4f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        c = b2;
        return b2;
    }

    public static final hx1 B() {
        hx1 hx1Var = d;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Subtitles", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep p = hf1.p(20.0f, 4.0f, 4.0f, 4.0f);
        p.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p.M(12.0f);
        p.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.v(16.0f);
        p.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.x(22.0f, 6.0f);
        p.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        p.p();
        p.z(4.0f, 12.0f);
        p.v(4.0f);
        p.M(2.0f);
        p.x(4.0f, 14.0f);
        p.M(-2.0f);
        p.p();
        p.z(14.0f, 18.0f);
        p.x(4.0f, 18.0f);
        p.M(-2.0f);
        p.v(10.0f);
        p.M(2.0f);
        p.p();
        p.z(20.0f, 18.0f);
        p.v(-4.0f);
        p.M(-2.0f);
        p.v(4.0f);
        p.M(2.0f);
        p.p();
        p.z(20.0f, 14.0f);
        p.x(10.0f, 14.0f);
        p.M(-2.0f);
        p.v(10.0f);
        p.M(2.0f);
        p.p();
        gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
        hx1 b2 = gx1Var.b();
        d = b2;
        return b2;
    }

    public static File C(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, hf1.u(i, str));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static hr3 D(um umVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new hr3(ck.y(umVar));
        }
        TextPaint textPaint = new TextPaint(umVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = umVar.getBreakStrategy();
        int hyphenationFrequency = umVar.getHyphenationFrequency();
        if (umVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (umVar.getInputType() & 15) != 3) {
                boolean z = umVar.getLayoutDirection() == 1;
                switch (umVar.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(ck.m(g7.f(umVar.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new hr3(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final hx1 E() {
        hx1 hx1Var = f;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Tune", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(3.0f, 17.0f);
        epVar.M(2.0f);
        epVar.v(6.0f);
        epVar.M(-2.0f);
        epVar.x(3.0f, 17.0f);
        epVar.p();
        epVar.z(3.0f, 5.0f);
        epVar.M(2.0f);
        epVar.v(10.0f);
        epVar.x(13.0f, 5.0f);
        epVar.x(3.0f, 5.0f);
        epVar.p();
        epVar.z(13.0f, 21.0f);
        epVar.M(-2.0f);
        epVar.v(8.0f);
        epVar.M(-2.0f);
        epVar.v(-8.0f);
        epVar.M(-2.0f);
        epVar.v(-2.0f);
        epVar.M(6.0f);
        epVar.v(2.0f);
        epVar.p();
        epVar.z(7.0f, 9.0f);
        epVar.M(2.0f);
        epVar.x(3.0f, 11.0f);
        epVar.M(2.0f);
        epVar.v(4.0f);
        epVar.M(2.0f);
        epVar.v(2.0f);
        epVar.x(9.0f, 9.0f);
        epVar.x(7.0f, 9.0f);
        epVar.p();
        epVar.z(21.0f, 13.0f);
        epVar.M(-2.0f);
        epVar.x(11.0f, 11.0f);
        epVar.M(2.0f);
        epVar.v(10.0f);
        epVar.p();
        epVar.z(15.0f, 9.0f);
        epVar.v(2.0f);
        epVar.x(17.0f, 7.0f);
        epVar.v(4.0f);
        epVar.x(21.0f, 5.0f);
        epVar.v(-4.0f);
        epVar.x(17.0f, 3.0f);
        epVar.v(-2.0f);
        epVar.M(6.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        f = b2;
        return b2;
    }

    public static void F(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (!Q(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !Q(b4) && !Q(b5)) {
                int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + 56320);
                return;
            }
        }
        throw z42.a();
    }

    public static void G(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (Q(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || Q(b4)))) {
            throw z42.a();
        }
        cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    public static void H(byte b2, byte b3, char[] cArr, int i) {
        if (b2 < -62 || Q(b3)) {
            throw z42.a();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static int I(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static void J(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    public static void K(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        J(jArr, jArr4);
        J(jArr2, jArr5);
        long[] jArr6 = new long[8];
        L(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        L(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        L(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        L(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        L(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        L(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        L(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        L(jArr6, j, j3, jArr7, 0);
        L(jArr6, j2, j4, jArr7, 1);
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
        jArr3[0] = j12 ^ (j13 << 49);
        jArr3[1] = (j13 >>> 15) ^ (j8 << 34);
        jArr3[2] = (j8 >>> 30) ^ (j9 << 19);
        jArr3[3] = ((j9 >>> 45) ^ (j10 << 4)) ^ (j11 << 53);
        jArr3[4] = ((j10 >>> 60) ^ (j14 << 38)) ^ (j11 >>> 11);
        jArr3[5] = (j14 >>> 26) ^ (j15 << 23);
        jArr3[6] = j15 >>> 41;
        jArr3[7] = 0;
    }

    public static void L(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
        int i3 = 36;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (((jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6)) ^ (jArr[(i4 >>> 9) & 7] << 9)) ^ (jArr[(i4 >>> 12) & 7] << 12);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (562949953421311L & j7);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j7 >>> 49) ^ (j8 << 15));
    }

    public static void M(long[] jArr, long[] jArr2) {
        e41.E(3, jArr, jArr2);
        jArr2[6] = jArr[3] & 1;
    }

    public static vk4 N(sy1 sy1Var, sy1 sy1Var2) {
        sp0.w(sy1Var, "set1");
        sp0.w(sy1Var2, "set2");
        return new vk4(sy1Var, sy1Var2);
    }

    public static boolean O(yg3 yg3Var, float f2, float f3) {
        if (yg3Var instanceof wg3) {
            m14 m14Var = ((wg3) yg3Var).a;
            if (m14Var.a <= f2 && f2 < m14Var.c && m14Var.b <= f3 && f3 < m14Var.d) {
                return true;
            }
        } else {
            if (!(yg3Var instanceof xg3)) {
                if (yg3Var instanceof vg3) {
                    return P(f2, f3, ((vg3) yg3Var).a);
                }
                s83.v();
                return false;
            }
            h74 h74Var = ((xg3) yg3Var).a;
            float f4 = h74Var.a;
            long j = h74Var.f;
            long j2 = h74Var.h;
            long j3 = h74Var.g;
            float f5 = h74Var.d;
            float f6 = h74Var.b;
            float f7 = h74Var.c;
            long j4 = h74Var.e;
            if (f2 >= f4 && f2 < f7 && f3 >= f6 && f3 < f5) {
                int i = (int) (j4 >> 32);
                int i2 = (int) (j >> 32);
                if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= h74Var.b()) {
                    int i3 = (int) (j2 >> 32);
                    int i4 = (int) (j3 >> 32);
                    if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= h74Var.b()) {
                        int i5 = (int) (j4 & 4294967295L);
                        int i6 = (int) (j2 & 4294967295L);
                        if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= h74Var.a()) {
                            int i7 = (int) (j & 4294967295L);
                            int i8 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= h74Var.a()) {
                                float intBitsToFloat = Float.intBitsToFloat(i) + f4;
                                float intBitsToFloat2 = Float.intBitsToFloat(i5) + f6;
                                float intBitsToFloat3 = f7 - Float.intBitsToFloat(i2);
                                float intBitsToFloat4 = Float.intBitsToFloat(i7) + f6;
                                float intBitsToFloat5 = f7 - Float.intBitsToFloat(i4);
                                float intBitsToFloat6 = f5 - Float.intBitsToFloat(i8);
                                float intBitsToFloat7 = f5 - Float.intBitsToFloat(i6);
                                float intBitsToFloat8 = Float.intBitsToFloat(i3) + f4;
                                if (f2 < intBitsToFloat && f3 < intBitsToFloat2) {
                                    return R(f2, f3, intBitsToFloat, intBitsToFloat2, h74Var.e);
                                }
                                if (f2 < intBitsToFloat8 && f3 > intBitsToFloat7) {
                                    return R(f2, f3, intBitsToFloat8, intBitsToFloat7, h74Var.h);
                                }
                                if (f2 > intBitsToFloat3 && f3 < intBitsToFloat4) {
                                    return R(f2, f3, intBitsToFloat3, intBitsToFloat4, h74Var.f);
                                }
                                if (f2 <= intBitsToFloat5 || f3 <= intBitsToFloat6) {
                                    return true;
                                }
                                return R(f2, f3, intBitsToFloat5, intBitsToFloat6, h74Var.g);
                            }
                        }
                    }
                }
                yd a2 = ae.a();
                hf1.j(a2, h74Var);
                return P(f2, f3, a2);
            }
        }
        return false;
    }

    public static final boolean P(float f2, float f3, yd ydVar) {
        float f4 = f2 - 0.005f;
        float f5 = f3 - 0.005f;
        float f6 = f2 + 0.005f;
        float f7 = f3 + 0.005f;
        yd a2 = ae.a();
        if (Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7)) {
            ae.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = a2.b;
        if (rectF == null) {
            rectF = new RectF();
            a2.b = rectF;
        }
        rectF.set(f4, f5, f6, f7);
        Path path = a2.a;
        RectF rectF2 = a2.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        yd a3 = ae.a();
        a3.c(ydVar, a2, 1);
        boolean isEmpty = a3.a.isEmpty();
        a3.d();
        a2.d();
        return !isEmpty;
    }

    public static boolean Q(byte b2) {
        return b2 > -65;
    }

    public static final boolean R(float f2, float f3, float f4, float f5, long j) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f7 * f7) / (intBitsToFloat2 * intBitsToFloat2)) + ((f6 * f6) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static MappedByteBuffer S(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static void T(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        K(jArr, jArr2, jArr4);
        V(jArr4, jArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e0, code lost:
    
        r0 = r8.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e4, code lost:
    
        defpackage.mw2.v(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.o15 U(defpackage.o84 r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb4.U(o84, java.lang.String):o15");
    }

    public static void V(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j9 >>> 50) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W(defpackage.gc4 r4, float r5, defpackage.gj0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ib4
            if (r0 == 0) goto L13
            r0 = r6
            ib4 r0 = (defpackage.ib4) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            ib4 r0 = new ib4
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.J
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            o24 r4 = r0.I
            defpackage.mu0.V(r6)
            goto L4b
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L2e:
            defpackage.mu0.V(r6)
            o24 r6 = new o24
            r6.<init>()
            jb4 r1 = new jb4
            r1.<init>(r6, r5, r2)
            r0.I = r6
            r0.K = r3
            d53 r5 = defpackage.d53.I
            java.lang.Object r4 = r4.d(r5, r1, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L4a
            return r5
        L4a:
            r4 = r6
        L4b:
            float r4 = r4.I
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb4.W(gc4, float, gj0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void X(TextView textView, ColorStateList colorStateList) {
        textView.getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof f85) {
            ((f85) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y(TextView textView, PorterDuff.Mode mode) {
        textView.getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof f85) {
            ((f85) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void Z(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x0409, code lost:
    
        if (r37 != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x03bd, code lost:
    
        if (r37 != false) goto L232;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x040c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.CharSequence r41, final defpackage.hn1 r42, final defpackage.f45 r43, final defpackage.in1 r44, final defpackage.hn1 r45, final boolean r46, final boolean r47, final defpackage.t33 r48, final defpackage.ji3 r49, final defpackage.t35 r50, final defpackage.tc0 r51, defpackage.fe0 r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb4.a(java.lang.CharSequence, hn1, f45, in1, hn1, boolean, boolean, t33, ji3, t35, tc0, fe0, int, int):void");
    }

    public static void a0(TextView textView, int i) {
        if (i < 0) {
            s83.d();
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ck.H(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x05bd, code lost:
    
        if (r2.i(r0) != false) goto L283;
     */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0616  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.hn1 r41, java.lang.CharSequence r42, final defpackage.in1 r43, defpackage.hn1 r44, final defpackage.hn1 r45, final defpackage.hn1 r46, final defpackage.hn1 r47, final defpackage.hn1 r48, final boolean r49, final defpackage.f45 r50, final defpackage.c45 r51, final defpackage.c45 r52, final defpackage.c45 r53, final defpackage.tm1 r54, final defpackage.tc0 r55, defpackage.hn1 r56, final defpackage.ji3 r57, defpackage.fe0 r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb4.b(hn1, java.lang.CharSequence, in1, hn1, hn1, hn1, hn1, hn1, boolean, f45, c45, c45, c45, tm1, tc0, hn1, ji3, fe0, int, int):void");
    }

    public static void b0(TextView textView, int i) {
        if (i < 0) {
            s83.d();
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0544 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.cw4 r57, defpackage.t35 r58, boolean r59, boolean r60, boolean r61, defpackage.ea5 r62, defpackage.m65 r63, defpackage.m65 r64, defpackage.in1 r65, defpackage.fe0 r66, int r67) {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb4.c(cw4, t35, boolean, boolean, boolean, ea5, m65, m65, in1, fe0, int):void");
    }

    public static void c0(TextView textView, int i) {
        if (i < 0) {
            s83.d();
            return;
        }
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static final void d(long j, m65 m65Var, hn1 hn1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(396611577);
        int i2 = (go1Var.f(j) ? 4 : 2) | i | (go1Var.g(m65Var) ? 32 : 16);
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(hn1Var) ? 256 : 128;
        }
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            jl2.b(j, m65Var, hn1Var, go1Var, i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new zx3(j, m65Var, hn1Var, i, (byte) 1);
        }
    }

    public static void d0(TextView textView, int i, float f2) {
        if (Build.VERSION.SDK_INT >= 34) {
            z4.r(textView, i, f2);
        } else {
            c0(textView, Math.round(TypedValue.applyDimension(i, f2, textView.getResources().getDisplayMetrics())));
        }
    }

    public static final void e(final String str, lq1 lq1Var, final l65 l65Var, int i, fe0 fe0Var, final int i2, final int i3) {
        int i4;
        int i5;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-192911377);
        if ((i2 & 6) == 0) {
            i4 = (go1Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i5 = i4 | 48;
        } else {
            i5 = i4 | (go1Var.g(lq1Var) ? 32 : 16);
        }
        int i7 = i5 | (go1Var.g(l65Var) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i7 |= go1Var.e(i) ? 2048 : 1024;
        }
        if ((i7 & 1171) == 1170 && go1Var.F()) {
            go1Var.W();
        } else {
            go1Var.Y();
            if ((i2 & 1) == 0 || go1Var.C()) {
                if (i6 != 0) {
                    lq1Var = jq1.a;
                }
                if (i8 != 0) {
                    i = Log.LOG_LEVEL_OFF;
                }
            } else {
                go1Var.W();
            }
            go1Var.r();
            go1Var.e0(1849434622);
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = q55.I;
                go1Var.o0(Q);
            }
            byte b2 = 0;
            go1Var.q(false);
            rm1 rm1Var = (rm1) ((v72) Q);
            go1Var.e0(-1115894518);
            go1Var.e0(1886828752);
            if (!(go1Var.a instanceof zo)) {
                qb.S();
                throw null;
            }
            go1Var.b0();
            if (go1Var.S) {
                go1Var.l(new mq1(rm1Var, b2));
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, new fa4((byte) 25), str);
            qi4.k(go1Var, new fa4((byte) 26), lq1Var);
            qi4.k(go1Var, new fa4((byte) 27), l65Var);
            fa4 fa4Var = new fa4((byte) 28);
            if (go1Var.S || !j42.c(go1Var.Q(), Integer.valueOf(i))) {
                go1Var.o0(Integer.valueOf(i));
                go1Var.b(Integer.valueOf(i), fa4Var);
            }
            r7.J(go1Var, true, false, false);
        }
        final lq1 lq1Var2 = lq1Var;
        final int i9 = i;
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: o55
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kb4.e(str, lq1Var2, l65Var, i9, (fe0) obj, mu0.X(i2 | 1), i3);
                    return wd5.a;
                }
            };
        }
    }

    public static void e0(um umVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        D(umVar);
        throw null;
    }

    public static final String f(String str) {
        return str.length() <= 64 ? str : str.substring(0, 64).concat("...");
    }

    public static void f0(um umVar, hr3 hr3Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = hr3Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        umVar.setTextDirection(i);
        umVar.getPaint().set(hr3Var.a);
        umVar.setBreakStrategy(hr3Var.c);
        umVar.setHyphenationFrequency(hr3Var.d);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static long g0(String str) {
        long j;
        int length = str.length();
        str.getClass();
        long j2 = 0;
        if (length < 0) {
            s83.h(r7.z("endIndex < beginIndex: ", length, " < 0"));
            return 0L;
        }
        if (length > str.length()) {
            s83.f(str.length(), hf1.C("endIndex > string.length: ", length, " > "));
            return 0L;
        }
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    j = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char charAt2 = i2 < length ? str.charAt(i2) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.gc4 r4, float r5, defpackage.ku4 r6, defpackage.gj0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.gb4
            if (r0 == 0) goto L13
            r0 = r7
            gb4 r0 = (defpackage.gb4) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            gb4 r0 = new gb4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.J
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            o24 r4 = r0.I
            defpackage.mu0.V(r7)
            goto L4b
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L2e:
            defpackage.mu0.V(r7)
            o24 r7 = new o24
            r7.<init>()
            hb4 r1 = new hb4
            r1.<init>(r5, r6, r7, r2)
            r0.I = r7
            r0.K = r3
            d53 r5 = defpackage.d53.I
            java.lang.Object r4 = r4.d(r5, r1, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L4a
            return r5
        L4a:
            r4 = r7
        L4b:
            float r4 = r4.I
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb4.h(gc4, float, ku4, gj0):java.lang.Object");
    }

    public static void h0(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        M(jArr, jArr3);
        while (true) {
            V(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                M(jArr2, jArr3);
            }
        }
    }

    public static int i0(byte b2) {
        return b2 & 255;
    }

    public static long j(boolean z, int i, ut utVar, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        utVar.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long scalb = utVar == ut.J ? j * i : (long) Math.scalb(j, i - 1);
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j2 + scalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static ActionMode.Callback j0(ActionMode.Callback callback) {
        return (!(callback instanceof r65) || Build.VERSION.SDK_INT < 26) ? callback : ((r65) callback).a;
    }

    public static byte k(long j) {
        sp0.q((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static final vg5 k0(String str) {
        int i = 0;
        long j = 0;
        while (true) {
            if (i >= 16) {
                long j2 = 0;
                for (int i2 = 16; i2 < 32; i2++) {
                    long j3 = j2 << 4;
                    char charAt = str.charAt(i2);
                    if ((charAt >>> '\b') == 0) {
                        long j4 = ft1.b[charAt];
                        if (j4 >= 0) {
                            j2 = j3 | j4;
                        }
                    }
                    m0(str, i2, "a hexadecimal digit");
                    throw null;
                }
                return (j == 0 && j2 == 0) ? vg5.K : new vg5(j, j2);
            }
            long j5 = j << 4;
            char charAt2 = str.charAt(i);
            if ((charAt2 >>> '\b') != 0) {
                break;
            }
            long j6 = ft1.b[charAt2];
            if (j6 < 0) {
                break;
            }
            j = j5 | j6;
            i++;
        }
        m0(str, i, "a hexadecimal digit");
        throw null;
    }

    public static final v25 l(tt0 tt0Var) {
        h35 h35Var;
        t25 t25Var = new t25();
        ad4.C(tt0Var, x25.a, new e35(new tf2(t25Var, (byte) 29), new sd(1, t25Var, t25.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 4)));
        e43 e43Var = new e43();
        e43 e43Var2 = t25Var.a;
        Object[] objArr = e43Var2.a;
        int i = e43Var2.b;
        int i2 = 0;
        boolean z = true;
        u25 u25Var = null;
        while (true) {
            h35Var = h35.b;
            if (i2 >= i) {
                break;
            }
            u25 u25Var2 = (u25) objArr[i2];
            if (!z || u25Var2 != h35Var) {
                if (u25Var2 != h35Var || u25Var != h35Var) {
                    if (u25Var2 != h35Var) {
                        e43 e43Var3 = t25Var.b;
                        Object[] objArr2 = e43Var3.a;
                        int i3 = e43Var3.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((tm1) objArr2[i4]).invoke(u25Var2)).booleanValue()) {
                            }
                        }
                    }
                    e43Var.a(u25Var2);
                    z = false;
                    u25Var = u25Var2;
                }
                z = false;
                break;
            }
            i2++;
        }
        if (((u25) (e43Var.i() ? null : e43Var.a[e43Var.b - 1])) == h35Var) {
            e43Var.l(e43Var.b - 1);
        }
        c43 c43Var = e43Var.c;
        if (c43Var == null) {
            c43Var = new c43(e43Var);
            e43Var.c = c43Var;
        }
        return new v25(c43Var);
    }

    public static final vg5 l0(String str) {
        long j = 0;
        for (int i = 0; i < 8; i++) {
            long j2 = j << 4;
            char charAt = str.charAt(i);
            if ((charAt >>> '\b') == 0) {
                long j3 = ft1.b[charAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                }
            }
            m0(str, i, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(8) != '-') {
            m0(str, 8, "'-' (hyphen)");
            throw null;
        }
        long j4 = 0;
        for (int i2 = 9; i2 < 13; i2++) {
            long j5 = j4 << 4;
            char charAt2 = str.charAt(i2);
            if ((charAt2 >>> '\b') == 0) {
                long j6 = ft1.b[charAt2];
                if (j6 >= 0) {
                    j4 = j5 | j6;
                }
            }
            m0(str, i2, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(13) != '-') {
            m0(str, 13, "'-' (hyphen)");
            throw null;
        }
        long j7 = 0;
        for (int i3 = 14; i3 < 18; i3++) {
            long j8 = j7 << 4;
            char charAt3 = str.charAt(i3);
            if ((charAt3 >>> '\b') == 0) {
                long j9 = ft1.b[charAt3];
                if (j9 >= 0) {
                    j7 = j8 | j9;
                }
            }
            m0(str, i3, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(18) != '-') {
            m0(str, 18, "'-' (hyphen)");
            throw null;
        }
        long j10 = 0;
        for (int i4 = 19; i4 < 23; i4++) {
            long j11 = j10 << 4;
            char charAt4 = str.charAt(i4);
            if ((charAt4 >>> '\b') == 0) {
                long j12 = ft1.b[charAt4];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                }
            }
            m0(str, i4, "a hexadecimal digit");
            throw null;
        }
        if (str.charAt(23) != '-') {
            m0(str, 23, "'-' (hyphen)");
            throw null;
        }
        long j13 = 0;
        for (int i5 = 24; i5 < 36; i5++) {
            long j14 = j13 << 4;
            char charAt5 = str.charAt(i5);
            if ((charAt5 >>> '\b') == 0) {
                long j15 = ft1.b[charAt5];
                if (j15 >= 0) {
                    j13 = j14 | j15;
                }
            }
            m0(str, i5, "a hexadecimal digit");
            throw null;
        }
        long j16 = (j << 32) | (j4 << 16) | j7;
        long j17 = (j10 << 48) | j13;
        return (j16 == 0 && j17 == 0) ? vg5.K : new vg5(j16, j17);
    }

    public static boolean m(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean n = n(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return n;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static final void m0(String str, int i, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    public static boolean n(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            android.util.Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final m14 n0(ca2 ca2Var) {
        m14 i = mu0.i(ca2Var, true);
        long w = ca2Var.w(i.d());
        float f2 = i.c;
        float f3 = i.d;
        long w2 = ca2Var.w((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        return new m14(Float.intBitsToFloat((int) (w >> 32)), Float.intBitsToFloat((int) (w & 4294967295L)), Float.intBitsToFloat((int) (w2 >> 32)), Float.intBitsToFloat((int) (w2 & 4294967295L)));
    }

    public static boolean o(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static ActionMode.Callback o0(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof r65) || callback == null) ? callback : new r65(callback, textView);
    }

    public static String p(g00 g00Var) {
        StringBuilder sb = new StringBuilder(g00Var.size());
        for (int i = 0; i < g00Var.size(); i++) {
            byte c2 = g00Var.c(i);
            if (c2 == 34) {
                sb.append("\\\"");
            } else if (c2 == 39) {
                sb.append("\\'");
            } else if (c2 != 92) {
                switch (c2) {
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
                        if (c2 < 32 || c2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c2 >>> 6) & 3) + 48));
                            sb.append((char) (((c2 >>> 3) & 7) + 48));
                            sb.append((char) ((c2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c2);
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

    public static final Object q(jq3 jq3Var, String str, gj0 gj0Var) {
        Object b2 = jq3Var.b(str, new m45((byte) 6), gj0Var);
        return b2 == el0.I ? b2 : wd5.a;
    }

    public static wk4 r(Set set, mr3 mr3Var) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof wk4)) {
                return new xk4(collection, mr3Var);
            }
            wk4 wk4Var = (wk4) collection;
            return new xk4((SortedSet) wk4Var.I, new nr3(Arrays.asList(wk4Var.J, mr3Var)));
        }
        if (set instanceof wk4) {
            wk4 wk4Var2 = (wk4) set;
            return new wk4((Set) wk4Var2.I, new nr3(Arrays.asList(wk4Var2.J, mr3Var)));
        }
        set.getClass();
        return new wk4(set, mr3Var);
    }

    public static final int s(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int t(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final void u(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = ft1.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final fq v(View view) {
        view.getClass();
        return new fq(new qc(view, null, (byte) 2), (byte) 1);
    }

    public static final oj4 w(View view) {
        return qj4.x(view.getParent(), lr5.I);
    }

    public static int x(um umVar) {
        return umVar.getPaddingTop() - umVar.getPaint().getFontMetricsInt().top;
    }

    public static int y(um umVar) {
        return umVar.getPaddingBottom() + umVar.getPaint().getFontMetricsInt().bottom;
    }

    public static final hx1 z() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.SkipPrevious", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(6.0f, 6.0f);
        epVar.v(2.0f);
        epVar.M(12.0f);
        epVar.x(6.0f, 18.0f);
        epVar.p();
        epVar.z(9.5f, 12.0f);
        epVar.y(8.5f, 6.0f);
        epVar.x(18.0f, 6.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }
}
