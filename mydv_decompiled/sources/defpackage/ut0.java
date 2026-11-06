package defpackage;

import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ut0 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;

    public static final float A(is0 is0Var) {
        return is0Var.k().e == pg3.J ? Float.intBitsToFloat((int) (is0Var.q() >> 32)) : Float.intBitsToFloat((int) (is0Var.q() & 4294967295L));
    }

    public static final String B(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static k80 C(fe0 fe0Var) {
        return ((fw2) ((go1) fe0Var).k(lw2.b)).a;
    }

    public static final hx1 D() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.LiveTv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(21.0f, 6.0f);
        epVar.v(-7.59f);
        epVar.y(3.29f, -3.29f);
        epVar.x(16.0f, 2.0f);
        epVar.y(-4.0f, 4.0f);
        epVar.y(-4.0f, -4.0f);
        epVar.y(-0.71f, 0.71f);
        epVar.x(10.59f, 6.0f);
        epVar.x(3.0f, 6.0f);
        epVar.r(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        epVar.M(12.0f);
        epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        epVar.v(18.0f);
        epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        epVar.x(23.0f, 8.0f);
        epVar.r(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        epVar.p();
        epVar.z(21.0f, 20.0f);
        epVar.x(3.0f, 20.0f);
        epVar.x(3.0f, 8.0f);
        epVar.v(18.0f);
        epVar.M(12.0f);
        epVar.p();
        epVar.z(9.0f, 10.0f);
        epVar.M(8.0f);
        epVar.y(7.0f, -4.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    public static final s13 E(tk0 tk0Var) {
        s13 s13Var = (s13) tk0Var.get(q8.s0);
        if (s13Var != null) {
            return s13Var;
        }
        zy.i("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static double F(zs1 zs1Var, double[] dArr, double[] dArr2) {
        double d;
        zs1Var.getClass();
        int min = Math.min(dArr.length - 1, dArr2.length);
        double d2 = zs1Var.b;
        int i = 0;
        while (true) {
            if (i >= min) {
                d = d2;
                break;
            }
            if (d2 < dArr[i] || d2 >= dArr[i + 1]) {
                i++;
            } else {
                d = dArr2[i] % 360.0d;
                if (d < 0.0d) {
                    d += 360.0d;
                }
            }
        }
        if (Math.min(dArr.length - 1, dArr2.length) <= 0) {
            d = 0.0d;
        }
        double d3 = (d2 + d) % 360.0d;
        return d3 < 0.0d ? d3 + 360.0d : d3;
    }

    public static final q74 G(a42 a42Var) {
        Object z = a42Var.z();
        if (z instanceof q74) {
            return (q74) z;
        }
        return null;
    }

    public static lc5 H(fe0 fe0Var) {
        return ((fw2) ((go1) fe0Var).k(lw2.b)).b;
    }

    public static final float I(q74 q74Var) {
        if (q74Var != null) {
            return q74Var.a;
        }
        return 0.0f;
    }

    public static final boolean J(is0 is0Var, float f) {
        is0Var.k().getClass();
        return !(((is0Var.r() ? -f : A(is0Var)) > 0.0f ? 1 : ((is0Var.r() ? -f : A(is0Var)) == 0.0f ? 0 : -1)) > 0);
    }

    public static uc2 K(dh2 dh2Var, rm1 rm1Var) {
        q8 q8Var = q8.D0;
        int ordinal = dh2Var.ordinal();
        if (ordinal == 0) {
            return new u05(rm1Var);
        }
        if (ordinal == 1) {
            a94 a94Var = new a94();
            a94Var.I = rm1Var;
            a94Var.J = q8Var;
            return a94Var;
        }
        if (ordinal != 2) {
            s83.v();
            return null;
        }
        le5 le5Var = new le5();
        le5Var.I = rm1Var;
        le5Var.J = q8Var;
        return le5Var;
    }

    public static u05 L(rm1 rm1Var) {
        rm1Var.getClass();
        return new u05(rm1Var);
    }

    public static final k13 M(b53 b53Var) {
        int i;
        if (b53Var == null || (i = b53Var.K) == 0) {
            return null;
        }
        return (k13) b53Var.l(i - 1);
    }

    public static final Object N(Object[] objArr, rm1 rm1Var, fe0 fe0Var) {
        return P(Arrays.copyOf(objArr, objArr.length), o7.r, rm1Var, fe0Var, 3456, 0);
    }

    public static final Object O(Object[] objArr, z94 z94Var, rm1 rm1Var, fe0 fe0Var, int i) {
        return P(Arrays.copyOf(objArr, objArr.length), z94Var, rm1Var, fe0Var, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object P(Object[] objArr, z94 z94Var, rm1 rm1Var, fe0 fe0Var, int i, int i2) {
        Object[] objArr2;
        z94 z94Var2;
        final Object obj;
        Object e;
        go1 go1Var = (go1) fe0Var;
        long j = go1Var.T;
        o7.k(36);
        final String l = Long.toString(j, 36);
        l.getClass();
        z94Var.getClass();
        final j94 j94Var = (j94) go1Var.k(l94.a);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Object a2 = (j94Var == null || (e = j94Var.e(l)) == null) ? null : z94Var.a(e);
            if (a2 == null) {
                a2 = rm1Var.invoke();
            }
            objArr2 = objArr;
            z94Var2 = z94Var;
            f94 f94Var = new f94(z94Var2, j94Var, l, a2, objArr2);
            go1Var.o0(f94Var);
            Q = f94Var;
        } else {
            objArr2 = objArr;
            z94Var2 = z94Var;
        }
        final f94 f94Var2 = (f94) Q;
        Object obj2 = Arrays.equals(objArr2, f94Var2.M) ? f94Var2.L : null;
        if (obj2 == null) {
            obj2 = rm1Var.invoke();
        }
        boolean i3 = go1Var.i(f94Var2) | ((((i & 112) ^ 48) > 32 && go1Var.i(z94Var2)) || (i & 48) == 32) | go1Var.i(j94Var) | go1Var.g(l) | go1Var.i(obj2) | go1Var.i(objArr2);
        Object Q2 = go1Var.Q();
        if (i3 || Q2 == jpVar) {
            final Object[] objArr3 = objArr2;
            obj = obj2;
            final z94 z94Var3 = z94Var2;
            rm1 rm1Var2 = new rm1() { // from class: l34
                @Override // defpackage.rm1
                public final Object invoke() {
                    boolean z;
                    f94 f94Var3 = f94.this;
                    j94 j94Var2 = f94Var3.J;
                    j94 j94Var3 = j94Var;
                    boolean z2 = true;
                    if (j94Var2 != j94Var3) {
                        f94Var3.J = j94Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = f94Var3.K;
                    String str2 = l;
                    if (j42.c(str, str2)) {
                        z2 = z;
                    } else {
                        f94Var3.K = str2;
                    }
                    f94Var3.I = z94Var3;
                    f94Var3.L = obj;
                    f94Var3.M = objArr3;
                    i94 i94Var = f94Var3.N;
                    if (i94Var != null && z2) {
                        ((pn) i94Var).Z();
                        f94Var3.N = null;
                        f94Var3.a();
                    }
                    return wd5.a;
                }
            };
            go1Var.o0(rm1Var2);
            Q2 = rm1Var2;
        } else {
            obj = obj2;
        }
        mw2.L(go1Var, (rm1) Q2);
        return obj;
    }

    public static final boolean Q(n43 n43Var, Object obj, Object obj2) {
        Object g = n43Var.g(obj);
        if (g == null) {
            return false;
        }
        if (!(g instanceof o43)) {
            if (!g.equals(obj2)) {
                return false;
            }
            n43Var.k(obj);
            return true;
        }
        o43 o43Var = (o43) g;
        boolean l = o43Var.l(obj2);
        if (l && o43Var.b()) {
            n43Var.k(obj);
        }
        return l;
    }

    public static final void R(n43 n43Var, Object obj) {
        boolean z;
        long[] jArr = n43Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = n43Var.b[i4];
                        Object obj3 = n43Var.c[i4];
                        if (obj3 instanceof o43) {
                            o43 o43Var = (o43) obj3;
                            o43Var.l(obj);
                            z = o43Var.b();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            n43Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final na3 S(tt0 tt0Var, int i) {
        na3 coordinator$ui = tt0Var.getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        if (coordinator$ui.K0() != tt0Var || !oa3.h(i)) {
            return coordinator$ui;
        }
        na3 na3Var = coordinator$ui.d0;
        na3Var.getClass();
        return na3Var;
    }

    public static final na3 T(tt0 tt0Var) {
        if (!tt0Var.getNode().isAttached()) {
            q02.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        na3 S = S(tt0Var, 2);
        if (!S.h()) {
            q02.b("LayoutCoordinates is not attached.");
        }
        return S;
    }

    public static final wa2 U(tt0 tt0Var) {
        na3 coordinator$ui = tt0Var.getNode().getCoordinator$ui();
        if (coordinator$ui != null) {
            return coordinator$ui.c0;
        }
        throw r7.t("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final qh3 V(tt0 tt0Var) {
        qh3 qh3Var = U(tt0Var).V;
        if (qh3Var != null) {
            return qh3Var;
        }
        throw r7.t("This node does not have an owner.");
    }

    public static final void W(k10 k10Var, fj0 fj0Var, boolean z) {
        Object s = k10Var.s();
        Throwable e = k10Var.e(s);
        Object g54Var = e != null ? new g54(e) : k10Var.f(s);
        if (!z) {
            fj0Var.resumeWith(g54Var);
            return;
        }
        fj0Var.getClass();
        nx0 nx0Var = (nx0) fj0Var;
        fj0 fj0Var2 = nx0Var.M;
        Object obj = nx0Var.O;
        tk0 context = fj0Var2.getContext();
        Object l0 = j42.l0(context, obj);
        qd5 l02 = l0 != j42.s ? qb.l0(fj0Var2, context, l0) : null;
        try {
            fj0Var2.resumeWith(g54Var);
            if (l02 == null || l02.j0()) {
                j42.Y(context, l0);
            }
        } catch (Throwable th) {
            if (l02 == null || l02.j0()) {
                j42.Y(context, l0);
            }
            throw th;
        }
    }

    public static int X(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int Y(Object obj) {
        return X(obj == null ? 0 : obj.hashCode());
    }

    public static s22 Z(u22 u22Var, int i) {
        u22Var.getClass();
        m(i > 0, Integer.valueOf(i));
        int i2 = u22Var.I;
        int i3 = u22Var.J;
        if (u22Var.K <= 0) {
            i = -i;
        }
        return new s22(i2, i3, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.rj3 r18, final java.lang.String r19, final defpackage.l13 r20, defpackage.u8 r21, defpackage.ni0 r22, float r23, defpackage.c80 r24, defpackage.fe0 r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut0.a(rj3, java.lang.String, l13, u8, ni0, float, c80, fe0, int, int):void");
    }

    public static wr2 a0(long j, yr2 yr2Var) {
        yr2Var.getClass();
        m(j > 0, Long.valueOf(j));
        long c2 = yr2Var.c();
        long d = yr2Var.d();
        if (yr2Var.e() <= 0) {
            j = -j;
        }
        return dq2.N(c2, d, j);
    }

    public static final void b(tw1 tw1Var, String str, l13 l13Var, c80 c80Var, fe0 fe0Var, int i, int i2) {
        vv vvVar = q8.N;
        if ((i2 & 64) != 0) {
            c80Var = null;
        }
        c80 c80Var2 = c80Var;
        go1 go1Var = (go1) fe0Var;
        boolean g = go1Var.g(tw1Var);
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            Q = i42.G(tw1Var, 1);
            go1Var.o0(Q);
        }
        a((dw) Q, str, l13Var, vvVar, li0.b, 1.0f, c80Var2, go1Var, (i & 112) | 8 | (i & 896) | (57344 & i), 0);
    }

    public static final long b0(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.q73 r36, final defpackage.k73 r37, final defpackage.l13 r38, final defpackage.u8 r39, final defpackage.tm1 r40, final defpackage.tm1 r41, final defpackage.tm1 r42, final defpackage.tm1 r43, defpackage.fe0 r44, final int r45) {
        /*
            Method dump skipped, instructions count: 2950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut0.c(q73, k73, l13, u8, tm1, tm1, tm1, tm1, fe0, int):void");
    }

    public static u22 c0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new u22(i, i2 - 1, 1);
        }
        u22 u22Var = u22.L;
        return u22.L;
    }

    public static final void d(final q73 q73Var, final String str, final l13 l13Var, u8 u8Var, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, tm1 tm1Var4, final tm1 tm1Var5, fe0 fe0Var, final int i) {
        int i2;
        u8 u8Var2;
        tm1 tm1Var6;
        int i3;
        tm1 tm1Var7;
        tm1 tm1Var8;
        char c2;
        tm1 tm1Var9;
        go1 go1Var;
        final tm1 tm1Var10;
        final tm1 tm1Var11;
        final tm1 tm1Var12;
        final tm1 tm1Var13;
        final u8 u8Var3;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1840250294);
        if ((i & 6) == 0) {
            i2 = (go1Var2.i(q73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var2.g(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var2.g(l13Var) ? 256 : 128;
        }
        int i4 = 1797120 | i2;
        if ((12582912 & i) == 0) {
            i4 = 5991424 | i2;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        int i5 = 805306368 | i4;
        char c3 = go1Var2.i(tm1Var5) ? (char) 4 : (char) 2;
        if ((306783379 & i5) == 306783378 && (c3 & 3) == 2 && go1Var2.F()) {
            go1Var2.W();
            u8Var3 = u8Var;
            tm1Var13 = tm1Var;
            tm1Var12 = tm1Var2;
            tm1Var11 = tm1Var3;
            go1Var = go1Var2;
            tm1Var10 = tm1Var4;
        } else {
            go1Var2.Y();
            int i6 = i & 1;
            jp jpVar = de0.a;
            if (i6 == 0 || go1Var2.C()) {
                u8Var2 = q8.J;
                Object Q = go1Var2.Q();
                if (Q == jpVar) {
                    Q = new yy0((byte) 27);
                    go1Var2.o0(Q);
                }
                tm1 tm1Var14 = (tm1) Q;
                Object Q2 = go1Var2.Q();
                if (Q2 == jpVar) {
                    Q2 = new yy0((byte) 29);
                    go1Var2.o0(Q2);
                }
                tm1Var6 = (tm1) Q2;
                i3 = i5 & (-264241153);
                tm1Var7 = tm1Var14;
                tm1Var8 = tm1Var6;
                c2 = c3;
                tm1Var9 = tm1Var7;
            } else {
                go1Var2.W();
                i3 = i5 & (-264241153);
                u8Var2 = u8Var;
                tm1Var7 = tm1Var;
                tm1Var6 = tm1Var2;
                tm1Var8 = tm1Var4;
                c2 = c3;
                tm1Var9 = tm1Var3;
            }
            go1Var2.r();
            boolean z = ((i3 & 57344) == 16384) | ((i3 & 112) == 32) | ((c2 & 14) == 4);
            Object Q3 = go1Var2.Q();
            if (z || Q3 == jpVar) {
                l73 l73Var = new l73(q73Var.b.t, str);
                tm1Var5.invoke(l73Var);
                Q3 = l73Var.c();
                go1Var2.o0(Q3);
            }
            k73 k73Var = (k73) Q3;
            int i7 = i3 & 8078;
            int i8 = i3 >> 3;
            int i9 = i7 | (i8 & 57344) | (458752 & i8) | (i8 & 234881024);
            u8 u8Var4 = u8Var2;
            tm1 tm1Var15 = tm1Var6;
            c(q73Var, k73Var, l13Var, u8Var4, tm1Var7, tm1Var15, tm1Var9, tm1Var8, go1Var2, i9);
            go1Var = go1Var2;
            tm1Var10 = tm1Var8;
            tm1Var11 = tm1Var9;
            tm1Var12 = tm1Var15;
            tm1Var13 = tm1Var7;
            u8Var3 = u8Var4;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: t73
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ut0.d(q73.this, str, l13Var, u8Var3, tm1Var13, tm1Var12, tm1Var11, tm1Var10, tm1Var5, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static yr2 d0(long j) {
        if (j > Long.MIN_VALUE) {
            return new yr2(0L, j - 1);
        }
        yr2 yr2Var = yr2.L;
        return lq2.I();
    }

    public static final void e(l13 l13Var, is0 is0Var, final ji3 ji3Var, final is4 is4Var, final boolean z, final sc scVar, final q8 q8Var, a93 a93Var, final tm1 tm1Var, final tv tvVar, final q8 q8Var2, final tc0 tc0Var, fe0 fe0Var, final int i, final int i2) {
        int i3;
        int i4;
        go1 go1Var;
        final a93 a93Var2;
        l13 l13Var2;
        Object yi3Var;
        int i5;
        dl0 dl0Var;
        c82 c82Var;
        go1 go1Var2;
        boolean z2;
        l13 l13Var3;
        byte b2;
        l13 then;
        final is0 is0Var2 = is0Var;
        uv uvVar = q8.T;
        go1 go1Var3 = (go1) fe0Var;
        go1Var3.f0(-572816025);
        if ((i & 6) == 0) {
            i3 = i | (go1Var3.g(l13Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= go1Var3.g(is0Var2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var3.g(ji3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= go1Var3.h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= go1Var3.e(0) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= go1Var3.g(is4Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= go1Var3.h(z) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= go1Var3.g(scVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= go1Var3.e(0) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= go1Var3.d(0.0f) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (go1Var3.g(q8Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go1Var3.i(a93Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var3.i(tm1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= go1Var3.g(tvVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= go1Var3.g(uvVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= go1Var3.g(q8Var2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= go1Var3.i(tc0Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i6 = i4;
        if (go1Var3.T(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i6) == 599186) ? false : true)) {
            int i7 = i3 & 112;
            boolean z3 = i7 == 32;
            Object Q = go1Var3.Q();
            jp jpVar = de0.a;
            Object obj = Q;
            if (z3 || Q == jpVar) {
                final byte b3 = 0;
                rm1 rm1Var = new rm1() { // from class: se2
                    @Override // defpackage.rm1
                    public final Object invoke() {
                        int l;
                        byte b4 = b3;
                        is0 is0Var3 = is0Var2;
                        switch (b4) {
                            case 0:
                                l = is0Var3.l();
                                break;
                            default:
                                l = is0Var3.l();
                                break;
                        }
                        return Integer.valueOf(l);
                    }
                };
                go1Var3.o0(rm1Var);
                obj = rm1Var;
            }
            rm1 rm1Var2 = (rm1) obj;
            int i8 = i3 >> 3;
            int i9 = i8 & 14;
            int i10 = i6 >> 15;
            int i11 = i9 | (i10 & 112) | (i6 & 896);
            t43 x = ad4.x(tc0Var, go1Var3);
            t43 x2 = ad4.x(tm1Var, go1Var3);
            boolean g = ((((i11 & 14) ^ 6) > 4 && go1Var3.g(is0Var2)) || (i11 & 6) == 4) | go1Var3.g(x) | go1Var3.g(x2) | go1Var3.g(rm1Var2);
            Object Q2 = go1Var3.Q();
            if (g || Q2 == jpVar) {
                q8 q8Var3 = q8.y0;
                ls lsVar = new ls(x, x2, rm1Var2, (byte) 3);
                lt4 lt4Var = dt4.a;
                Q2 = new ve2(new wu0(new k9(new wu0(lsVar, q8Var3), is0Var2, (byte) 9), q8Var3), cw4.class, "value", "getValue()Ljava/lang/Object;", 0);
                go1Var3.o0(Q2);
            }
            c82 c82Var2 = (c82) Q2;
            Object Q3 = go1Var3.Q();
            Object obj2 = Q3;
            if (Q3 == jpVar) {
                dl0 w = mw2.w(go1Var3);
                go1Var3.o0(w);
                obj2 = w;
            }
            dl0 dl0Var2 = (dl0) obj2;
            boolean z4 = i7 == 32;
            Object Q4 = go1Var3.Q();
            Object obj3 = Q4;
            if (z4 || Q4 == jpVar) {
                final byte b4 = 1;
                rm1 rm1Var3 = new rm1() { // from class: se2
                    @Override // defpackage.rm1
                    public final Object invoke() {
                        int l;
                        byte b42 = b4;
                        is0 is0Var3 = is0Var2;
                        switch (b42) {
                            case 0:
                                l = is0Var3.l();
                                break;
                            default:
                                l = is0Var3.l();
                                break;
                        }
                        return Integer.valueOf(l);
                    }
                };
                go1Var3.o0(rm1Var3);
                obj3 = rm1Var3;
            }
            rm1 rm1Var4 = (rm1) obj3;
            int i12 = i3 >> 9;
            int i13 = (i3 & 65520) | (i12 & 458752) | (i12 & 3670016) | ((i6 << 21) & 29360128);
            int i14 = i6 << 15;
            int i15 = i13 | (i14 & 234881024) | (i14 & C.ENCODING_PCM_DOUBLE);
            boolean g2 = ((((i15 & 458752) ^ 196608) > 131072 && go1Var3.e(0)) || (i15 & 196608) == 131072) | ((((i15 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && go1Var3.g(ji3Var)) || (i15 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i15 & 112) ^ 48) > 32 && go1Var3.g(is0Var2)) || (i15 & 48) == 32) | ((((i15 & 7168) ^ 3072) > 2048 && go1Var3.h(false)) || (i15 & 3072) == 2048) | ((((57344 & i15) ^ 24576) > 16384 && go1Var3.e(0)) || (i15 & 24576) == 16384) | ((((i15 & 234881024) ^ 100663296) > 67108864 && go1Var3.g(tvVar)) || (i15 & 100663296) == 67108864) | ((((i15 & C.ENCODING_PCM_DOUBLE) ^ 805306368) > 536870912 && go1Var3.g(uvVar)) || (i15 & 805306368) == 536870912) | ((((i15 & 3670016) ^ 1572864) > 1048576 && go1Var3.d(0.0f)) || (i15 & 1572864) == 1048576) | ((((i15 & 29360128) ^ 12582912) > 8388608 && go1Var3.g(q8Var)) || (i15 & 12582912) == 8388608) | ((((i10 & 14) ^ 6) > 4 && go1Var3.g(q8Var2)) || (i10 & 6) == 4) | go1Var3.g(rm1Var4) | go1Var3.g(dl0Var2);
            Object Q5 = go1Var3.Q();
            if (g2 || Q5 == jpVar) {
                go1 go1Var4 = go1Var3;
                is0Var2 = is0Var;
                i5 = 32;
                yi3Var = new yi3(is0Var2, ji3Var, q8Var, c82Var2, rm1Var4, tvVar, q8Var2, dl0Var2);
                dl0Var = dl0Var2;
                c82Var = c82Var2;
                go1Var4.o0(yi3Var);
                go1Var2 = go1Var4;
            } else {
                yi3Var = Q5;
                go1Var2 = go1Var3;
                dl0Var = dl0Var2;
                c82Var = c82Var2;
                i5 = 32;
                is0Var2 = is0Var;
            }
            oe2 oe2Var = (oe2) yi3Var;
            boolean h = (((i9 ^ 6) > 4 && go1Var2.g(is0Var2)) || (i8 & 6) == 4) | go1Var2.h(true);
            Object Q6 = go1Var2.Q();
            Object obj4 = Q6;
            if (h || Q6 == jpVar) {
                gf2 gf2Var = new gf2(is0Var2, true);
                go1Var2.o0(gf2Var);
                obj4 = gf2Var;
            }
            ff2 ff2Var = (ff2) obj4;
            boolean z5 = (i7 == i5) | ((i3 & 458752) == 131072);
            Object Q7 = go1Var2.Q();
            Object obj5 = Q7;
            if (z5 || Q7 == jpVar) {
                pj3 pj3Var = new pj3(is4Var, is0Var2);
                go1Var2.o0(pj3Var);
                obj5 = pj3Var;
            }
            pj3 pj3Var2 = (pj3) obj5;
            oy oyVar = (oy) go1Var2.k(py.a);
            da2 da2Var = (da2) go1Var2.k(hf0.n);
            boolean g3 = (i7 == i5) | go1Var2.g(oyVar) | go1Var2.e(da2Var.ordinal());
            Object Q8 = go1Var2.Q();
            Object obj6 = Q8;
            if (g3 || Q8 == jpVar) {
                oi3 oi3Var = new oi3(is0Var2, oyVar, da2Var);
                go1Var2.o0(oi3Var);
                obj6 = oi3Var;
            }
            oi3 oi3Var2 = (oi3) obj6;
            i13 i13Var = i13.a;
            pg3 pg3Var = pg3.I;
            if (z) {
                go1Var2.d0(-853734429);
                int i16 = i9 | ((i3 >> 21) & 112);
                boolean z6 = ((((i16 & 112) ^ 48) > i5 && go1Var2.e(0)) || (i16 & 48) == i5) | ((((i16 & 14) ^ 6) > 4 && go1Var2.g(is0Var2)) || (i16 & 6) == 4);
                Object Q9 = go1Var2.Q();
                Object obj7 = Q9;
                if (z6 || Q9 == jpVar) {
                    ni3 ni3Var = new ni3(is0Var2);
                    go1Var2.o0(ni3Var);
                    obj7 = ni3Var;
                }
                l13Var3 = mw2.K((ni3) obj7, is0Var2.w, pg3Var);
                z2 = false;
                go1Var2.q(false);
            } else {
                z2 = false;
                go1Var2.d0(-853304645);
                go1Var2.q(false);
                l13Var3 = i13Var;
            }
            l13Var2 = l13Var;
            l13 h0 = p70.h0(l13Var2.then(is0Var2.z).then(is0Var2.x), c82Var, ff2Var, pg3Var, z);
            if (z) {
                b2 = 1;
                then = h0.then(oi4.a(i13Var, z2, new jw0(true ? 1 : 0, is0Var2, dl0Var)));
            } else {
                b2 = 1;
                then = h0.then(i13Var);
            }
            a93Var2 = a93Var;
            go1Var = go1Var2;
            rt0.b(c82Var, j42.R(i42.J0(then.then(l13Var3), is0Var2, pg3Var, scVar, z, pj3Var2, is0Var2.p, oi3Var2).then(new l05(is0Var2, null, null, new rc(is0Var2, b2), 6)), a93Var2, null), is0Var2.u, oe2Var, go1Var, 0);
        } else {
            go1Var = go1Var3;
            a93Var2 = a93Var;
            l13Var2 = l13Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            final is0 is0Var3 = is0Var2;
            final l13 l13Var4 = l13Var2;
            u.d = new hn1() { // from class: te2
                @Override // defpackage.hn1
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    int X = mu0.X(i | 1);
                    int X2 = mu0.X(i2);
                    ut0.e(l13.this, is0Var3, ji3Var, is4Var, z, scVar, q8Var, a93Var2, tm1Var, tvVar, q8Var2, tc0Var, (fe0) obj8, X, X2);
                    return wd5.a;
                }
            };
        }
    }

    public static final Object e0(tm1 tm1Var, k05 k05Var) {
        return E(k05Var.getContext()).E(new yq1(tm1Var, (byte) 1), k05Var);
    }

    public static final void f(final boolean z, final hn1 hn1Var, fe0 fe0Var, final int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1818896922);
        int i2 = (go1Var.h(z) ? 4 : 2) | i | (go1Var.i(hn1Var) ? 32 : 16);
        if ((i2 & 19) == 18 && go1Var.F()) {
            go1Var.W();
        } else {
            rt0.d(z, hn1Var, go1Var, i2 & WebSocketProtocol.PAYLOAD_SHORT);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(z, hn1Var, i) { // from class: u63
                public final /* synthetic */ boolean I;
                public final /* synthetic */ hn1 J;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(1);
                    ut0.f(this.I, this.J, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void g(n43 n43Var, Object obj, Object obj2) {
        int f = n43Var.f(obj);
        boolean z = f < 0;
        Object obj3 = z ? null : n43Var.c[f];
        if (obj3 != null) {
            if (obj3 instanceof o43) {
                ((o43) obj3).d(obj2);
            } else if (obj3 != obj2) {
                o43 o43Var = new o43();
                o43Var.d(obj3);
                o43Var.d(obj2);
                obj2 = o43Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            n43Var.c[f] = obj2;
            return;
        }
        int i = ~f;
        n43Var.b[i] = obj;
        n43Var.c[i] = obj2;
    }

    public static final void h(b53 b53Var, k13 k13Var) {
        b53 A = U(k13Var).A();
        int i = A.K - 1;
        Object[] objArr = A.I;
        if (i < objArr.length) {
            while (i >= 0) {
                b53Var.c(((wa2) objArr[i]).n0.f);
                i--;
            }
        }
    }

    public static final bo1 i(bo1 bo1Var) {
        if (bo1Var == null) {
            bo1Var = null;
        }
        if (bo1Var != null) {
            return bo1Var;
        }
        ke0.b("Inconsistent composition");
        zy.n();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final na2 j(k13 k13Var) {
        if ((k13Var.getKindSet$ui() & 2) == 0) {
            return null;
        }
        if (k13Var instanceof na2) {
            return (na2) k13Var;
        }
        if (!(k13Var instanceof wt0)) {
            return null;
        }
        k13 k13Var2 = ((wt0) k13Var).J;
        while (k13Var2 != 0) {
            if (k13Var2 instanceof na2) {
                return (na2) k13Var2;
            }
            k13Var2 = (!(k13Var2 instanceof wt0) || (k13Var2.getKindSet$ui() & 2) == 0) ? k13Var2.getChild$ui() : ((wt0) k13Var2).J;
        }
        return null;
    }

    public static void k(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                zy.m(hf1.u(i2, "at index "));
                return;
            }
        }
    }

    public static final void l(int i) {
        if (i >= 1) {
            return;
        }
        s83.h(hf1.u(i, "Expected positive parallelism level, but got "));
    }

    public static final void m(boolean z, Number number) {
        if (z) {
            return;
        }
        s83.w(number, "Step must be positive, was: ");
    }

    public static final String n(i62 i62Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        i62Var.getClass();
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof m62) {
                return ((m62) annotation).discriminator();
            }
        }
        return i62Var.a.g;
    }

    public static void o(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static double p(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float q(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int r(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long s(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        StringBuilder A = hf1.A(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        A.append(j2);
        A.append('.');
        throw new IllegalArgumentException(A.toString());
    }

    public static long t(long j, yr2 yr2Var) {
        if (!yr2Var.isEmpty()) {
            return j < ((Number) yr2Var.h()).longValue() ? ((Number) yr2Var.h()).longValue() : j > ((Number) yr2Var.f()).longValue() ? ((Number) yr2Var.f()).longValue() : j;
        }
        s83.w(yr2Var, "Cannot coerce value to an empty range: ");
        return 0L;
    }

    public static Comparable u(Comparable comparable, z60 z60Var) {
        z60Var.getClass();
        float f = z60Var.b;
        float f2 = z60Var.a;
        if (!z60Var.a()) {
            return (!z60.b(comparable, Float.valueOf(f2)) || z60.b(Float.valueOf(f2), comparable)) ? (!z60.b(Float.valueOf(f), comparable) || z60.b(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f) : Float.valueOf(f2);
        }
        s83.w(z60Var, "Cannot coerce value to an empty range: ");
        return null;
    }

    public static final t43 v(t33 t33Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Q = ad4.w(Boolean.FALSE);
            go1Var.o0(Q);
        }
        t43 t43Var = (t43) Q;
        byte b2 = 0;
        boolean z = (((i & 14) ^ 6) > 4 && go1Var.g(t33Var)) || (i & 6) == 4;
        Object Q2 = go1Var.Q();
        if (z || Q2 == jpVar) {
            Q2 = new xh1(t33Var, t43Var, null, b2);
            go1Var.o0(Q2);
        }
        mw2.h(go1Var, (hn1) Q2, t33Var);
        return t43Var;
    }

    public static final t43 w(t33 t33Var, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Q = ad4.w(Boolean.FALSE);
            go1Var.o0(Q);
        }
        t43 t43Var = (t43) Q;
        Object Q2 = go1Var.Q();
        if (Q2 == jpVar) {
            Q2 = new xh1(t33Var, t43Var, null, (byte) 1);
            go1Var.o0(Q2);
        }
        mw2.h(go1Var, (hn1) Q2, t33Var);
        return t43Var;
    }

    public static final Object x(zf1 zf1Var, hn1 hn1Var, k05 k05Var) {
        int i = sg1.a;
        Object collect = vt0.g(new x40(new rg1(hn1Var, null), zf1Var, l91.I, -2, ez.I), 0).collect(xa3.I, k05Var);
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        if (collect != el0Var) {
            collect = wd5Var;
        }
        return collect == el0Var ? collect : wd5Var;
    }

    public static n43 y() {
        long[] jArr = ia4.a;
        return new n43();
    }

    public static boolean z(t95 t95Var, Object obj) {
        if (obj == null) {
            while (t95Var.hasNext()) {
                if (t95Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (t95Var.hasNext()) {
            if (obj.equals(t95Var.next())) {
                return true;
            }
        }
        return false;
    }
}
