package defpackage;

import android.content.ContentProviderClient;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Path;
import android.graphics.RectF;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.media3.exoplayer.Renderer;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class hf1 {
    public static StringBuilder A(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder B(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder C(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder D(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ void E(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            em0.b((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else if (autoCloseable instanceof ContentProviderClient) {
            ((ContentProviderClient) autoCloseable).release();
        } else {
            s83.d();
        }
    }

    public static /* synthetic */ void F(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            em0.b((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else if (autoCloseable instanceof ContentProviderClient) {
            ((ContentProviderClient) autoCloseable).release();
        } else {
            s83.d();
        }
    }

    public static boolean a(j13 j13Var, tm1 tm1Var) {
        return ((Boolean) tm1Var.invoke(j13Var)).booleanValue();
    }

    public static qr5 b(ur5 ur5Var, k60 k60Var, l33 l33Var) {
        return ur5Var.b(sv2.B(k60Var), l33Var);
    }

    public static long c(Renderer renderer) {
        if (renderer.getState() != 1) {
            return Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        }
        if (renderer.isReady() || renderer.isEnded()) {
            return 1000000L;
        }
        return Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
    }

    public static g55 d(g55 g55Var, g55 g55Var2) {
        boolean z = g55Var2 instanceof yy;
        if (!z || !(g55Var instanceof yy)) {
            return (!z || (g55Var instanceof yy)) ? (z || !(g55Var instanceof yy)) ? g55Var2.c(new e55(g55Var, (byte) 1)) : g55Var : g55Var2;
        }
        yy yyVar = (yy) g55Var2;
        return new yy(yyVar.a, hc4.b(yyVar.b, new e55(g55Var, (byte) 0)));
    }

    public static l13 e(l13 l13Var, l13 l13Var2) {
        return l13Var2 == i13.a ? l13Var : new pa0(l13Var, l13Var2);
    }

    public static float f(long j, iu0 iu0Var) {
        float c;
        float L;
        if (!q65.a(p65.b(j), 4294967296L)) {
            s02.b("Only Sp can convert to Px");
        }
        float[] fArr = jk1.a;
        if (iu0Var.L() >= 1.03f) {
            ik1 a = jk1.a(iu0Var.L());
            c = p65.c(j);
            if (a != null) {
                return a.b(c);
            }
            L = iu0Var.L();
        } else {
            c = p65.c(j);
            L = iu0Var.L();
        }
        return L * c;
    }

    public static long g(float f, iu0 iu0Var) {
        float[] fArr = jk1.a;
        if (iu0Var.L() < 1.03f) {
            return oh4.p(4294967296L, f / iu0Var.L());
        }
        ik1 a = jk1.a(iu0Var.L());
        return oh4.p(4294967296L, a != null ? a.a(f) : f / iu0Var.L());
    }

    public static void h(yd ydVar, yd ydVar2) {
        ydVar.a.addPath(ydVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void i(yd ydVar, m14 m14Var) {
        float f = m14Var.a;
        float f2 = m14Var.d;
        float f3 = m14Var.c;
        float f4 = m14Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            ae.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = ydVar.b;
        if (rectF == null) {
            rectF = new RectF();
            ydVar.b = rectF;
        }
        rectF.set(f, f4, f3, f2);
        Path path = ydVar.a;
        RectF rectF2 = ydVar.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void j(yd ydVar, h74 h74Var) {
        RectF rectF = ydVar.b;
        if (rectF == null) {
            rectF = new RectF();
            ydVar.b = rectF;
        }
        float f = h74Var.a;
        long j = h74Var.h;
        long j2 = h74Var.g;
        long j3 = h74Var.f;
        long j4 = h74Var.e;
        rectF.set(f, h74Var.b, h74Var.c, h74Var.d);
        float[] fArr = ydVar.c;
        if (fArr == null) {
            fArr = new float[8];
            ydVar.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = ydVar.a;
        RectF rectF2 = ydVar.b;
        rectF2.getClass();
        float[] fArr2 = ydVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static int k(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static /* synthetic */ zf1 l(un1 un1Var, tk0 tk0Var, int i, ez ezVar, int i2) {
        if ((i2 & 1) != 0) {
            tk0Var = l91.I;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            ezVar = ez.I;
        }
        return un1Var.a(tk0Var, i, ezVar);
    }

    public static boolean m(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static int n(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static v2 o(za1 za1Var, za1 za1Var2) {
        za1Var.getClass();
        return new v2(za1Var2, (byte) 0);
    }

    public static ep p(float f, float f2, float f3, float f4) {
        ep epVar = new ep((byte) 13);
        epVar.z(f, f2);
        epVar.x(f3, f4);
        return epVar;
    }

    public static d92 q(String str) {
        t02.b(str);
        return new d92();
    }

    public static fw4 r(SharedPreferences sharedPreferences, String str, boolean z) {
        return o7.c(Boolean.valueOf(sharedPreferences.getBoolean(str, z)));
    }

    public static ub5 s(hh hhVar, kh khVar, go1 go1Var) {
        ub5 ub5Var = new ub5(hhVar, khVar);
        go1Var.o0(ub5Var);
        return ub5Var;
    }

    public static String t(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String u(int i, String str) {
        return str + i;
    }

    public static String v(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String w(String str, String str2) {
        return str + str2;
    }

    public static String x(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String y(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String z(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }
}
