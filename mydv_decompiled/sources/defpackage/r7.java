package defpackage;

import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.drm.DrmSession;
import com.materialkolor.ktx.DynamicColorKt;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class r7 {
    public static String A(String str, long j) {
        return str + j;
    }

    public static String B(String str, String str2) {
        return str + str2;
    }

    public static String C(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String D(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder E(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder F(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void G(int i, go1 go1Var, sg sgVar, go1 go1Var2) {
        qi4.k(go1Var, sgVar, Integer.valueOf(i));
        qi4.j(go1Var2);
    }

    public static void H(pn pnVar, long j) {
        pnVar.q().n();
        pnVar.X(j);
    }

    public static void I(oi1 oi1Var, t43 t43Var) {
        t43Var.setValue(Boolean.valueOf(oi1Var.b()));
    }

    public static void J(go1 go1Var, boolean z, boolean z2, boolean z3) {
        go1Var.q(z);
        go1Var.q(z2);
        go1Var.q(z3);
    }

    public static /* synthetic */ void K(Object obj) {
        if (obj == null) {
            return;
        }
        zl1.c();
    }

    public static void L(String str, int i, String str2) {
        Log.w(str2, str + i);
    }

    public static void M(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static void N(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ boolean O(Object obj) {
        return obj != null;
    }

    public static void P(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.acquire(null);
        }
        if (drmSession != null) {
            drmSession.release(null);
        }
    }

    public static boolean a(wi wiVar, long j) {
        return j >= wiVar.b();
    }

    public static int b(float f, iu0 iu0Var) {
        float P = iu0Var.P(f);
        return Float.isInfinite(P) ? Log.LOG_LEVEL_OFF : Math.round(P);
    }

    public static long c(long j, iu0 iu0Var) {
        if (j != 9205357640488583168L) {
            return vt0.a(iu0Var.H(Float.intBitsToFloat((int) (j >> 32))), iu0Var.H(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static float d(long j, iu0 iu0Var) {
        if (!q65.a(p65.b(j), 4294967296L)) {
            s02.b("Only Sp can convert to Px");
        }
        return iu0Var.P(iu0Var.q(j));
    }

    public static long e(long j, iu0 iu0Var) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float P = iu0Var.P(v11.b(j));
        float P2 = iu0Var.P(v11.a(j));
        return (Float.floatToRawIntBits(P) << 32) | (Float.floatToRawIntBits(P2) & 4294967295L);
    }

    public static long f(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static void g(y31 y31Var, long j, float f, long j2, float f2, int i) {
        if ((i & 2) != 0) {
            f = fq4.b(y31Var.c()) / 2.0f;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            j2 = y31Var.Y();
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            f2 = 1.0f;
        }
        y31Var.r(j, f3, j3, f2);
    }

    public static void h(y31 y31Var, tw1 tw1Var, long j, long j2, long j3, long j4, float f, c80 c80Var, int i, int i2) {
        long j5;
        long j6 = (i2 & 2) != 0 ? 0L : j;
        if ((i2 & 4) != 0) {
            j5 = (((dd) tw1Var).a.getHeight() & 4294967295L) | (((dd) tw1Var).a.getWidth() << 32);
        } else {
            j5 = j2;
        }
        y31Var.K(tw1Var, j6, j5, (i2 & 8) != 0 ? 0L : j3, (i2 & 16) != 0 ? j5 : j4, (i2 & 32) != 0 ? 1.0f : f, (i2 & 128) != 0 ? null : c80Var, (i2 & 512) != 0 ? 1 : i);
    }

    public static void i(y31 y31Var, tw1 tw1Var, long j, float f, c80 c80Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        y31Var.e(tw1Var, j2, f, c80Var, (i & 32) != 0 ? 3 : 0);
    }

    public static void j(y31 y31Var, yd ydVar, wy wyVar, float f, rx4 rx4Var, c80 c80Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        z31 z31Var = rx4Var;
        if ((i & 8) != 0) {
            z31Var = me1.a;
        }
        z31 z31Var2 = z31Var;
        if ((i & 16) != 0) {
            c80Var = null;
        }
        y31Var.m(ydVar, wyVar, f2, z31Var2, c80Var, (i & 32) != 0 ? 3 : 0);
    }

    public static void k(y31 y31Var, yd ydVar, long j, z31 z31Var, int i) {
        if ((i & 8) != 0) {
            z31Var = me1.a;
        }
        y31Var.Z(ydVar, j, z31Var);
    }

    public static void l(y31 y31Var, wy wyVar, long j, long j2, float f, z31 z31Var, c80 c80Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        y31Var.i0(wyVar, j3, (i & 4) != 0 ? f(y31Var.c(), j3) : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? me1.a : z31Var, (i & 32) != 0 ? null : c80Var, (i & 64) != 0 ? 3 : 0);
    }

    public static void m(y31 y31Var, long j, long j2, long j3, float f, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        y31Var.h0(j, j4, (i & 4) != 0 ? f(y31Var.c(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 64) != 0 ? 3 : 0);
    }

    public static void n(y31 y31Var, wy wyVar, long j, long j2, long j3, float f, z31 z31Var, c80 c80Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        y31Var.b0(wyVar, j4, (i & 4) != 0 ? f(y31Var.c(), j4) : j2, j3, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? me1.a : z31Var, (i & 64) != 0 ? null : c80Var, (i & 128) != 0 ? 3 : 0);
    }

    public static void o(y31 y31Var, long j, long j2, long j3, long j4, float f, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        y31Var.n((i & 32) != 0 ? 1.0f : f, j, j5, (i & 4) != 0 ? f(y31Var.c(), j5) : j3, j4);
    }

    public static double p(double d, double d2, double d3, double d4) {
        return (d3 - (d * d2)) / d4;
    }

    public static long q(a51 a51Var, b51 b51Var, k51 k51Var) {
        return DynamicColorKt.getColor(a51Var.a().b().b(b51Var).a(), k51Var);
    }

    public static ep r(float f, float f2) {
        ep epVar = new ep((byte) 13);
        epVar.z(f, f2);
        return epVar;
    }

    public static d92 s(Object obj) {
        mu0.V(obj);
        return new d92();
    }

    public static d92 t(String str) {
        q02.c(str);
        return new d92();
    }

    public static l13 u(float f, l13 l13Var, cw4 cw4Var) {
        return p70.H(o7.m(l13Var, l74.a(f)), cw4Var);
    }

    public static t33 v(go1 go1Var) {
        t33 t33Var = new t33();
        go1Var.o0(t33Var);
        return t33Var;
    }

    public static Object w(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String x(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String y(ok3 ok3Var, String str) {
        return str + ok3Var;
    }

    public static String z(String str, int i, String str2) {
        return str + i + str2;
    }
}
