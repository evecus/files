package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.media.tv.TvContentRating;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.Cover;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.Video;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.WeakHashMap;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class qg5 {
    public static final l80 G;
    public static final l80 H;
    public static final float I;
    public static final l80 J;
    public static final float K;
    public static final l80 L;
    public static final float M;
    public static final l80 N;
    public static final float O;
    public static final fn4 P;
    public static final float Q;
    public static final l80 R;
    public static final float S;
    public static final float T;
    public static final l80 U;
    public static final float V;
    public static final l80 W;
    public static final float X;
    public static final l80 Y;
    public static final float Z;
    public static pg5 a = null;
    public static final l80 a0;
    public static boolean b = false;
    public static final float b0;
    public static final l80 c0;
    public static final float d0;
    public static final l80 e0;
    public static final l80 f0;
    public static final fn4 g0;
    public static final float h0;
    public static final l80 i0;
    public static int j;
    public static final float j0;
    public static final l80 k0;
    public static final l80 l0;
    public static final float m0;
    public static final float n0;
    public static final float o0;
    public static final fn4 p0;
    public static final float q0;
    public static final l80 r0;
    public static final float s0;
    public static final l80 t0;
    public static final l80 u0;
    public static final TvContentRating[] v0;
    public static final int[] w0;
    public static final sv c = new sv(-1.0f);
    public static final sv d = new sv(1.0f);
    public static final int[] e = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] f = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] g = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] h = {R.attr.name, R.attr.pathData};
    public static final byte[] i = new byte[32];
    public static final tc0 k = new tc0(-395857719, new uc0(6), false);
    public static final tc0 l = new tc0(-1574453504, new uc0(7), false);
    public static final tc0 m = new tc0(-958263031, new uc0(10), false);
    public static final tc0 n = new tc0(-1236986954, new cd0(3), false);
    public static final tc0 o = new tc0(-456072723, new cd0(4), false);
    public static final el0 p = el0.I;
    public static final short[] q = {2285, 2571, 2970, 1812, 1493, 1422, 287, 202, 3158, 622, 1577, 182, 962, 2127, 1855, 1468, 573, 2004, 264, 383, 2500, 1458, 1727, 3199, 2648, 1017, 732, 608, 1787, 411, 3124, 1758, 1223, 652, 2777, 1015, 2036, 1491, 3047, 1785, 516, 3321, 3009, 2663, 1711, 2167, 126, 1469, 2476, 3239, 3058, 830, 107, 1908, 3082, 2378, 2931, 961, 1821, 2604, 448, 2264, 677, 2054, 2226, 430, 555, 843, 2078, 871, 1550, 105, 422, 587, 177, 3094, 3038, 2869, 1574, 1653, 3083, 778, 1159, 3182, 2552, 1483, 2727, 1119, 1739, 644, 2457, 349, 418, 329, 3173, 3254, 817, 1097, 603, 610, 1322, 2044, 1864, 384, 2114, 3193, 1218, 1994, 2455, 220, 2142, 1670, 2144, 1799, 2051, 794, 1819, 2475, 2459, 478, 3221, 3021, 996, 991, 958, 1869, 1522, 1628};
    public static final StackTraceElement[] r = new StackTraceElement[0];
    public static final byte[] s = {112, 114, 111, 0};
    public static final byte[] t = {112, 114, 109, 0};
    public static final int[] u = {-1, -1, 0, -1, -1, -1, -1, -2};
    public static final int[] v = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};
    public static final int[] w = {Log.LOG_LEVEL_OFF, -1, -1, -1, -1};
    public static final int[] x = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    public static final int[] y = {-1, -1073741826, -1, -1, -1, 1, 1};
    public static final int[] z = {-6803, -2, -1, -1, -1, -1, -1};
    public static final int[] A = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    public static final int[] B = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};
    public static final int[] C = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] D = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] E = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};
    public static final long[] F = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    static {
        l80 l80Var = l80.P;
        G = l80Var;
        l80 l80Var2 = l80.L;
        H = l80Var2;
        I = 0.38f;
        J = l80Var2;
        K = 0.38f;
        L = l80Var2;
        M = 0.12f;
        N = l80Var;
        O = 44.0f;
        P = fn4.J;
        Q = 4.0f;
        R = l80.R;
        S = 16.0f;
        T = 4.0f;
        U = l80.S;
        V = 1.0f;
        W = l80Var2;
        X = 0.38f;
        Y = l80Var2;
        Z = 0.12f;
        a0 = l80Var2;
        b0 = 0.38f;
        l80 l80Var3 = l80.T;
        c0 = l80Var3;
        d0 = 0.38f;
        e0 = l80Var3;
        f0 = l80Var2;
        fn4 fn4Var = fn4.J;
        g0 = fn4Var;
        h0 = 28.0f;
        i0 = l80.J;
        j0 = 24.0f;
        k0 = l80.K;
        l0 = l80Var;
        m0 = 40.0f;
        n0 = 32.0f;
        o0 = 2.0f;
        p0 = fn4Var;
        q0 = 52.0f;
        r0 = l80.N;
        s0 = 16.0f;
        t0 = l80Var3;
        u0 = l80Var3;
        v0 = new TvContentRating[0];
        w0 = new int[]{13, 41, 121, 337, 897, 2305};
    }

    public static final boolean A(cw4 cw4Var) {
        return ((Boolean) cw4Var.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (((r1 >>> 32) != 0 ? defpackage.dq2.Z(7, 3, r12) : 0) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0(int r11, int[] r12) {
        /*
            r0 = 7
            if (r11 == 0) goto L3c
            long r1 = (long) r11
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 6803(0x1a93, double:3.361E-320)
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
            r11 = 6
            r11 = r12[r11]
            r1 = -1
            if (r11 != r1) goto L4f
            int[] r11 = defpackage.qg5.z
            boolean r11 = defpackage.il2.J(r12, r11)
            if (r11 == 0) goto L4f
        L4a:
            r11 = 6803(0x1a93, float:9.533E-42)
            defpackage.dq2.c(r0, r11, r12)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg5.A0(int, int[]):void");
    }

    public static final void B(List list, int i2, fe0 fe0Var, int i3) {
        int i4;
        char c2;
        boolean z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1328211233);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? go1Var.g(list) : go1Var.i(list) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= go1Var.e(i2) ? 32 : 16;
        }
        if (go1Var.T(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) go1Var.k(rb.b);
            r80 r80Var = (r80) go1Var.k(xh0.c);
            if (r80Var.a == t80.K) {
                c2 = 2;
                z2 = true;
            } else {
                c2 = 2;
                z2 = false;
            }
            Integer valueOf = Integer.valueOf(i2);
            Boolean valueOf2 = Boolean.valueOf(z2);
            s90 s90Var = r80Var.b;
            z70 z70Var = r80Var.c;
            Object[] objArr = new Object[5];
            objArr[0] = valueOf;
            objArr[1] = list;
            objArr[c2] = valueOf2;
            objArr[3] = s90Var;
            objArr[4] = z70Var;
            boolean h2 = ((i4 & 112) == 32) | go1Var.h(z2) | go1Var.i(context) | go1Var.g(r80Var) | ((i4 & 14) == 4 || ((i4 & 8) != 0 && go1Var.i(list)));
            Object Q2 = go1Var.Q();
            if (h2 || Q2 == de0.a) {
                o40 o40Var = new o40(z2, i2, context, r80Var, list, null);
                go1Var.o0(o40Var);
                Q2 = o40Var;
            }
            mw2.k(objArr, (hn1) Q2, go1Var);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new f30(list, i2, i3);
        }
    }

    public static void B0(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = i2 & 4294967295L;
            long j4 = (iArr[0] & 4294967295L) + j3;
            iArr[0] = (int) j4;
            long j5 = ((iArr[1] & 4294967295L) - j3) + (j4 >> 32);
            iArr[1] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (iArr[2] & 4294967295L);
                iArr[2] = (int) j7;
                j6 = j7 >> 32;
            }
            long j8 = (iArr[3] & 4294967295L) + j3 + j6;
            iArr[3] = (int) j8;
            long j9 = (4294967295L & iArr[4]) + j3 + (j8 >> 32);
            iArr[4] = (int) j9;
            j2 = j9 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || dq2.Y(12, 5, iArr) == 0) && !(iArr[11] == -1 && dq2.U(12, iArr, C))) {
            return;
        }
        G(iArr);
    }

    public static final l00 C(tm1 tm1Var) {
        return new l00(tm1Var, (byte) 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a5, code lost:
    
        if (((java.lang.Integer) r11).intValue() == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a7, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b9, code lost:
    
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01cb, code lost:
    
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void C0(defpackage.bp1 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg5.C0(bp1, java.lang.StringBuilder, int):void");
    }

    public static void D(int[] iArr, int[] iArr2, int[] iArr3) {
        if (jl2.f(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && jl2.K(iArr3, u))) {
            F(iArr3);
        }
    }

    public static final int D0(qh4 qh4Var, int i2) {
        int i3;
        int[] iArr = qh4Var.N;
        int i4 = i2 + 1;
        int length = qh4Var.M.length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= length) {
                i3 = (i5 + length) >>> 1;
                int i6 = iArr[i3];
                if (i6 >= i4) {
                    if (i6 <= i4) {
                        break;
                    }
                    length = i3 - 1;
                } else {
                    i5 = i3 + 1;
                }
            } else {
                i3 = (-i5) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static void E(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void E0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        jl2.j0(iArr, iArr3);
        t0(iArr3, iArr2);
    }

    public static void F(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = ((iArr[2] & 4294967295L) - 1) + j3;
        iArr[2] = (int) j5;
        long j6 = (iArr[3] & 4294967295L) + 1 + (j5 >> 32);
        iArr[3] = (int) j6;
        long j7 = j6 >> 32;
        if (j7 != 0) {
            long j8 = j7 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j8;
            long j9 = (j8 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j9;
            long j10 = (j9 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j10;
            j7 = j10 >> 32;
        }
        iArr[7] = (int) ((4294967295L & iArr[7]) + 1 + j7);
    }

    public static void F0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        Y(jArr, jArr3);
        u0(jArr3, jArr2);
    }

    public static void G(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = ((iArr[1] & 4294967295L) - 1) + (j2 >> 32);
        iArr[1] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            long j5 = j4 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j5;
            j4 = j5 >> 32;
        }
        long j6 = (iArr[3] & 4294967295L) + 1 + j4;
        iArr[3] = (int) j6;
        long j7 = (4294967295L & iArr[4]) + 1 + (j6 >> 32);
        iArr[4] = (int) j7;
        if ((j7 >> 32) != 0) {
            dq2.Y(12, 5, iArr);
        }
    }

    public static void G0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        dq2.A0(iArr, iArr3);
        v0(iArr3, iArr2);
    }

    public static final l13 H(l13 l13Var, bj1 bj1Var) {
        return l13Var.then(new e8(bj1Var));
    }

    public static void H0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        il2.d0(iArr, iArr3);
        w0(iArr3, iArr2);
    }

    public static void I(short[] sArr, int i2, short s2, short s3, short s4, short s5, short s6) {
        sArr[i2] = (short) (lq2.U(s2 * s4) + lq2.U(lq2.U(s3 * s5) * s6));
        int i3 = i2 + 1;
        sArr[i3] = (short) (lq2.U(s3 * s4) + lq2.U(s2 * s5));
    }

    public static void I0(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        jl2.j0(iArr, iArr3);
        while (true) {
            t0(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                jl2.j0(iArr2, iArr3);
            }
        }
    }

    public static final l13 J(l13 l13Var, fy fyVar) {
        return l13Var.then(new dy(fyVar));
    }

    public static void J0(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        lq2.h0(iArr, iArr3);
        while (true) {
            x0(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                lq2.h0(iArr2, iArr3);
            }
        }
    }

    public static final String K(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static void K0(int i2, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        Y(jArr, jArr3);
        while (true) {
            u0(jArr3, jArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                Y(jArr2, jArr3);
            }
        }
    }

    public static void L(byte[] bArr) {
        if (bArr == null || bArr.length < 8 || bArr.length > 4194304) {
            zl1.g("BDS state encoding size out of bounds");
        }
    }

    public static void L0(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        dq2.A0(iArr, iArr3);
        while (true) {
            v0(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                dq2.A0(iArr2, iArr3);
            }
        }
    }

    public static int M(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr.length >= 40) {
            int length = bArr.length - 32;
            byte[] bArr3 = new byte[32];
            f84 f84Var = new f84();
            if (bArr2 != null) {
                f84Var.update(bArr2, 0, bArr2.length);
            }
            f84Var.update(bArr, 0, length);
            f84Var.a(0, bArr3);
            if (g4.i(bArr3, 32, length, bArr, bArr.length)) {
                return length;
            }
            str = "BDS state checksum does not match";
        } else {
            str = "BDS state encoding size out of bounds";
        }
        zl1.g(str);
        return 0;
    }

    public static void M0(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        il2.d0(iArr, iArr3);
        while (true) {
            w0(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                il2.d0(iArr2, iArr3);
            }
        }
    }

    public static void N(g61 g61Var) {
        v51 v51Var = g61Var.a;
        if (v51Var == null) {
            return;
        }
        BigInteger bigInteger = v51Var.d;
        int j2 = bigInteger == null ? v51Var.j() + 1 : bigInteger.bitLength();
        int i2 = 0;
        while (i2 < 6 && j2 >= w0[i2]) {
            i2++;
        }
        v51Var.n(g61Var, "bc_wnaf", new ms5(Math.min(16, Math.max(2, Math.min(16, i2 + 2)) + 3)));
    }

    public static void N0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (jl2.m0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j4;
                j3 = j4 >> 32;
            }
            long j5 = (iArr3[2] & 4294967295L) + 1 + j3;
            iArr3[2] = (int) j5;
            long j6 = ((iArr3[3] & 4294967295L) - 1) + (j5 >> 32);
            iArr3[3] = (int) j6;
            long j7 = j6 >> 32;
            if (j7 != 0) {
                long j8 = j7 + (iArr3[4] & 4294967295L);
                iArr3[4] = (int) j8;
                long j9 = (j8 >> 32) + (iArr3[5] & 4294967295L);
                iArr3[5] = (int) j9;
                long j10 = (j9 >> 32) + (iArr3[6] & 4294967295L);
                iArr3[6] = (int) j10;
                j7 = j10 >> 32;
            }
            iArr3[7] = (int) (((4294967295L & iArr3[7]) - 1) + j7);
        }
    }

    public static byte[] O(fw0[] fw0VarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (fw0 fw0Var : fw0VarArr) {
            i3 += ((((fw0Var.g * 2) + 7) & (-8)) / 8) + (fw0Var.e * 2) + S(bArr, fw0Var.a, fw0Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + fw0Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, eu5.u)) {
            int length = fw0VarArr.length;
            while (i2 < length) {
                fw0 fw0Var2 = fw0VarArr[i2];
                U0(byteArrayOutputStream, fw0Var2, S(bArr, fw0Var2.a, fw0Var2.b));
                T0(byteArrayOutputStream, fw0Var2);
                i2++;
            }
        } else {
            for (fw0 fw0Var3 : fw0VarArr) {
                U0(byteArrayOutputStream, fw0Var3, S(bArr, fw0Var3.a, fw0Var3.b));
            }
            int length2 = fw0VarArr.length;
            while (i2 < length2) {
                T0(byteArrayOutputStream, fw0VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static void O0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (dq2.C0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 2147483649L;
            iArr3[0] = (int) j2;
            if ((j2 >> 32) == 0) {
                return;
            }
            dq2.z(5, 1, iArr3);
        }
    }

    public static final void P(zh0 zh0Var, float f2, long j2, float f3, float f4, rx4 rx4Var, long j3) {
        float min = Math.min(rx4Var.a, ((ya2) zh0Var).P(f3));
        float f5 = rx4Var.a;
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat = (Float.intBitsToFloat(i2) - min) - (min == f5 ? 0.0f : f5 / 4.0f);
        float intBitsToFloat2 = (Float.intBitsToFloat(i2) * f2) + f4;
        if (intBitsToFloat <= intBitsToFloat2) {
            min = Math.max(0.0f, min - (intBitsToFloat2 - intBitsToFloat));
            intBitsToFloat = intBitsToFloat2;
        }
        if (min > 0.0f) {
            if (rx4Var.c == 1) {
                r7.g(zh0Var, j3, min / 2.0f, (Float.floatToRawIntBits(intBitsToFloat + r12) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f) & 4294967295L), 0.0f, 120);
            } else {
                r7.m(zh0Var, j3, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (j2 & 4294967295L)) - min) / 2.0f) & 4294967295L), (Float.floatToRawIntBits(min) & 4294967295L) | (Float.floatToRawIntBits(min) << 32), 0.0f, 120);
            }
        }
    }

    public static void P0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (il2.e0(iArr, iArr2, iArr3) != 0) {
            dq2.D0(7, 6803, iArr3);
        }
    }

    public static final boolean Q(bw0 bw0Var) {
        bw0Var.getClass();
        return bw0Var.c == aw0.I && bw0Var.a.compareTo(ww5.K) >= 0;
    }

    public static void Q0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (dq2.B0(12, iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j2;
            long j3 = (iArr3[1] & 4294967295L) + 1 + (j2 >> 32);
            iArr3[1] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = ((iArr3[3] & 4294967295L) - 1) + j4;
            iArr3[3] = (int) j6;
            long j7 = ((4294967295L & iArr3[4]) - 1) + (j6 >> 32);
            iArr3[4] = (int) j7;
            if ((j7 >> 32) != 0) {
                dq2.z(12, 5, iArr3);
            }
        }
    }

    public static final l13 R(l13 l13Var, tm1 tm1Var) {
        return l13Var.then(new fi1(new hi1(tm1Var)));
    }

    /* JADX WARN: Finally extract failed */
    public static boolean R0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, fw0[] fw0VarArr) {
        int i2;
        int i3;
        int length;
        byte[] bArr2 = eu5.w;
        byte[] bArr3 = eu5.v;
        byte[] bArr4 = eu5.s;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = eu5.t;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] O2 = O(fw0VarArr, bArr5);
                k21.w0(byteArrayOutputStream, fw0VarArr.length, 1);
                k21.w0(byteArrayOutputStream, O2.length, 4);
                byte[] p2 = k21.p(O2);
                k21.w0(byteArrayOutputStream, p2.length, 4);
                byteArrayOutputStream.write(p2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                k21.w0(byteArrayOutputStream, fw0VarArr.length, 1);
                for (fw0 fw0Var : fw0VarArr) {
                    int size = fw0Var.i.size() * 4;
                    String S2 = S(bArr3, fw0Var.a, fw0Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    k21.x0(S2.getBytes(charset).length, byteArrayOutputStream);
                    k21.x0(fw0Var.h.length, byteArrayOutputStream);
                    k21.w0(byteArrayOutputStream, size, 4);
                    k21.w0(byteArrayOutputStream, fw0Var.c, 4);
                    byteArrayOutputStream.write(S2.getBytes(charset));
                    Iterator it = fw0Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        k21.x0(((Integer) it.next()).intValue(), byteArrayOutputStream);
                        k21.x0(0, byteArrayOutputStream);
                    }
                    for (int i5 : fw0Var.h) {
                        k21.x0(i5, byteArrayOutputStream);
                    }
                }
                return true;
            }
            byte[] bArr6 = eu5.u;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] O3 = O(fw0VarArr, bArr6);
                k21.w0(byteArrayOutputStream, fw0VarArr.length, 1);
                k21.w0(byteArrayOutputStream, O3.length, 4);
                byte[] p3 = k21.p(O3);
                k21.w0(byteArrayOutputStream, p3.length, 4);
                byteArrayOutputStream.write(p3);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            k21.x0(fw0VarArr.length, byteArrayOutputStream);
            for (fw0 fw0Var2 : fw0VarArr) {
                String str = fw0Var2.a;
                TreeMap treeMap = fw0Var2.i;
                String S3 = S(bArr2, str, fw0Var2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                k21.x0(S3.getBytes(charset2).length, byteArrayOutputStream);
                k21.x0(treeMap.size(), byteArrayOutputStream);
                k21.x0(fw0Var2.h.length, byteArrayOutputStream);
                k21.w0(byteArrayOutputStream, fw0Var2.c, 4);
                byteArrayOutputStream.write(S3.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    k21.x0(((Integer) it2.next()).intValue(), byteArrayOutputStream);
                }
                for (int i6 : fw0Var2.h) {
                    k21.x0(i6, byteArrayOutputStream);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            k21.x0(fw0VarArr.length, byteArrayOutputStream2);
            int i7 = 2;
            int i8 = 2;
            for (fw0 fw0Var3 : fw0VarArr) {
                k21.w0(byteArrayOutputStream2, fw0Var3.c, 4);
                k21.w0(byteArrayOutputStream2, fw0Var3.d, 4);
                k21.w0(byteArrayOutputStream2, fw0Var3.g, 4);
                String S4 = S(bArr4, fw0Var3.a, fw0Var3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = S4.getBytes(charset3).length;
                k21.x0(length2, byteArrayOutputStream2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(S4.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i8 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            }
            oz5 oz5Var = new oz5(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList.add(oz5Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            int i10 = 0;
            while (i9 < fw0VarArr.length) {
                try {
                    fw0 fw0Var4 = fw0VarArr[i9];
                    k21.x0(i9, byteArrayOutputStream3);
                    k21.x0(fw0Var4.e, byteArrayOutputStream3);
                    i10 = i10 + 4 + (fw0Var4.e * i7);
                    int[] iArr = fw0Var4.h;
                    int length3 = iArr.length;
                    int i11 = i4;
                    while (i4 < length3) {
                        int i12 = iArr[i4];
                        k21.x0(i12 - i11, byteArrayOutputStream3);
                        i4++;
                        i7 = i7;
                        i11 = i12;
                    }
                    i9++;
                    i4 = 0;
                } catch (Throwable th) {
                }
            }
            int i13 = i7;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i10 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
            }
            oz5 oz5Var2 = new oz5(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList.add(oz5Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            for (int i15 = 0; i15 < fw0VarArr.length; i15++) {
                try {
                    fw0 fw0Var5 = fw0VarArr[i15];
                    Iterator it3 = fw0Var5.i.entrySet().iterator();
                    int i16 = 0;
                    while (it3.hasNext()) {
                        i16 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        V0(byteArrayOutputStream4, i16, fw0Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            W0(byteArrayOutputStream4, fw0Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            k21.x0(i15, byteArrayOutputStream3);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i17 = i14 + 6;
                            k21.w0(byteArrayOutputStream3, length4, 4);
                            k21.x0(i16, byteArrayOutputStream3);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i14 = i17 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            oz5 oz5Var3 = new oz5(byteArray5, 4, true);
            byteArrayOutputStream3.close();
            arrayList.add(oz5Var3);
            long size2 = 12 + (arrayList.size() * 16);
            k21.w0(byteArrayOutputStream, arrayList.size(), 4);
            int i18 = 0;
            while (i18 < arrayList.size()) {
                oz5 oz5Var4 = (oz5) arrayList.get(i18);
                int i19 = oz5Var4.a;
                byte[] bArr7 = oz5Var4.b;
                if (i19 != 1) {
                    i2 = i13;
                    if (i19 == i2) {
                        i3 = 1;
                    } else if (i19 == 3) {
                        i3 = i2;
                    } else if (i19 == 4) {
                        i3 = 3;
                    } else {
                        if (i19 != 5) {
                            throw null;
                        }
                        i3 = 4;
                    }
                } else {
                    i2 = i13;
                    i3 = 0;
                }
                k21.w0(byteArrayOutputStream, i3, 4);
                k21.w0(byteArrayOutputStream, size2, 4);
                if (oz5Var4.c) {
                    long length5 = bArr7.length;
                    byte[] p4 = k21.p(bArr7);
                    arrayList2.add(p4);
                    k21.w0(byteArrayOutputStream, p4.length, 4);
                    k21.w0(byteArrayOutputStream, length5, 4);
                    length = p4.length;
                } else {
                    arrayList2.add(bArr7);
                    k21.w0(byteArrayOutputStream, bArr7.length, 4);
                    k21.w0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i18++;
                i13 = i2;
            }
            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i20));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static String S(byte[] bArr, String str, String str2) {
        byte[] bArr2 = eu5.v;
        byte[] bArr3 = eu5.w;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return hf1.z(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void S0(DataOutputStream dataOutputStream, qs qsVar) {
        try {
            qsVar.c();
            int i2 = qsVar.J;
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeInt(qsVar.L);
            dataOutputStream.writeInt(qsVar.T);
            dataOutputStream.writeInt(qsVar.R);
            dataOutputStream.writeByte(qsVar.S ? 1 : 0);
            o06 o06Var = qsVar.M;
            dataOutputStream.writeByte(o06Var != null ? 1 : 0);
            if (o06Var != null) {
                X0(dataOutputStream, o06Var, i2);
            }
            ArrayList arrayList = qsVar.N;
            dataOutputStream.writeInt(arrayList.size());
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                X0(dataOutputStream, (o06) arrayList.get(i3), i2);
            }
            TreeMap treeMap = qsVar.O;
            dataOutputStream.writeInt(treeMap.size());
            for (Integer num : treeMap.keySet()) {
                List list = (List) treeMap.get(num);
                dataOutputStream.writeInt(num.intValue());
                dataOutputStream.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    X0(dataOutputStream, (o06) it.next(), i2);
                }
            }
            Stack stack = qsVar.P;
            dataOutputStream.writeInt(stack.size());
            Iterator it2 = stack.iterator();
            while (it2.hasNext()) {
                X0(dataOutputStream, (o06) it2.next(), i2);
            }
            ArrayList arrayList2 = qsVar.K;
            dataOutputStream.writeInt(arrayList2.size());
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                ts tsVar = (ts) obj;
                dataOutputStream.writeInt(tsVar.J);
                dataOutputStream.writeInt(tsVar.K);
                dataOutputStream.writeInt(tsVar.L);
                dataOutputStream.writeByte(tsVar.M ? 1 : 0);
                dataOutputStream.writeByte(tsVar.N ? 1 : 0);
                o06 o06Var2 = tsVar.I;
                dataOutputStream.writeByte(o06Var2 != null ? 1 : 0);
                if (o06Var2 != null) {
                    X0(dataOutputStream, o06Var2, i2);
                }
            }
            TreeMap treeMap2 = qsVar.Q;
            dataOutputStream.writeInt(treeMap2.size());
            for (Integer num2 : treeMap2.keySet()) {
                dataOutputStream.writeInt(num2.intValue());
                X0(dataOutputStream, (o06) treeMap2.get(num2), i2);
            }
        } catch (IllegalStateException e2) {
            throw k21.Z("invalid BDS state", e2);
        }
    }

    public static final Object T(pw2 pw2Var) {
        Object z2 = pw2Var.z();
        ha2 ha2Var = z2 instanceof ha2 ? (ha2) z2 : null;
        if (ha2Var != null) {
            return ha2Var.I;
        }
        return null;
    }

    public static void T0(ByteArrayOutputStream byteArrayOutputStream, fw0 fw0Var) {
        W0(byteArrayOutputStream, fw0Var);
        int i2 = fw0Var.g;
        int[] iArr = fw0Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            k21.x0(i5 - i4, byteArrayOutputStream);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : fw0Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static l13 U(l13 l13Var, t33 t33Var) {
        return l13Var.then(new ov1(t33Var));
    }

    public static void U0(ByteArrayOutputStream byteArrayOutputStream, fw0 fw0Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        k21.x0(str.getBytes(charset).length, byteArrayOutputStream);
        k21.x0(fw0Var.e, byteArrayOutputStream);
        k21.w0(byteArrayOutputStream, fw0Var.f, 4);
        k21.w0(byteArrayOutputStream, fw0Var.c, 4);
        k21.w0(byteArrayOutputStream, fw0Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void V(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        jArr2[0] = j2 & 144115188075855871L;
        jArr2[1] = ((j2 >>> 57) ^ (j3 << 7)) & 144115188075855871L;
        jArr2[2] = ((j3 >>> 50) ^ (j4 << 14)) & 144115188075855871L;
        jArr2[3] = ((j4 >>> 43) ^ (j5 << 21)) & 144115188075855871L;
        jArr2[4] = (j5 >>> 36) ^ (j6 << 28);
    }

    public static void V0(ByteArrayOutputStream byteArrayOutputStream, int i2, fw0 fw0Var) {
        int i3 = fw0Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : fw0Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void W(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        V(jArr, jArr4);
        V(jArr2, jArr5);
        long[] jArr6 = new long[26];
        X(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        X(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        X(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        X(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        X(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j2 = jArr4[0];
        long j3 = j2 ^ jArr4[1];
        long j4 = jArr5[0];
        long j5 = j4 ^ jArr5[1];
        long j6 = jArr4[2];
        long j7 = j2 ^ j6;
        long j8 = jArr5[2];
        long j9 = j4 ^ j8;
        long j10 = jArr4[4];
        long j11 = j6 ^ j10;
        long j12 = jArr5[4];
        long j13 = j8 ^ j12;
        long j14 = jArr4[3];
        long j15 = j14 ^ j10;
        long j16 = jArr5[3];
        long j17 = j16 ^ j12;
        X(jArr3, j7 ^ j14, j9 ^ j16, jArr6, 18);
        X(jArr3, j11 ^ jArr4[1], j13 ^ jArr5[1], jArr6, 20);
        long j18 = j3 ^ j15;
        long j19 = j5 ^ j17;
        long j20 = j18 ^ jArr4[2];
        long j21 = jArr5[2] ^ j19;
        X(jArr3, j18, j19, jArr6, 22);
        X(jArr3, j20, j21, jArr6, 24);
        X(jArr3, j3, j5, jArr6, 10);
        X(jArr3, j7, j9, jArr6, 12);
        X(jArr3, j11, j13, jArr6, 14);
        X(jArr3, j15, j17, jArr6, 16);
        long j22 = jArr6[0];
        jArr3[0] = j22;
        long j23 = jArr6[9];
        jArr3[9] = j23;
        long j24 = jArr6[0];
        long j25 = jArr6[1] ^ j24;
        long j26 = j25 ^ jArr6[2];
        long j27 = j26 ^ jArr6[10];
        jArr3[1] = j27;
        long j28 = jArr6[3] ^ jArr6[4];
        long j29 = j26 ^ (j28 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j29;
        long j30 = j25 ^ j28;
        long j31 = jArr6[5] ^ jArr6[6];
        long j32 = jArr6[8];
        long j33 = (j30 ^ j31) ^ j32;
        long j34 = jArr6[13] ^ jArr6[14];
        long j35 = jArr6[18];
        long j36 = jArr6[22];
        long j37 = jArr6[24];
        long j38 = (j33 ^ j34) ^ ((j35 ^ j36) ^ j37);
        jArr3[3] = j38;
        long j39 = jArr6[7] ^ j32;
        long j40 = jArr6[9];
        long j41 = j39 ^ j40;
        long j42 = j41 ^ jArr6[17];
        jArr3[8] = j42;
        long j43 = (j41 ^ j31) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j43;
        long j44 = jArr6[19] ^ jArr6[20];
        long j45 = jArr6[25];
        long j46 = jArr6[23];
        long j47 = j44 ^ (j45 ^ j37);
        long j48 = (j47 ^ (j35 ^ j46)) ^ (j43 ^ j27);
        jArr3[4] = j48;
        long j49 = jArr6[21];
        long j50 = (j47 ^ (j29 ^ j42)) ^ (j49 ^ j36);
        jArr3[5] = j50;
        long j51 = (((((j24 ^ j33) ^ j40) ^ j34) ^ j49) ^ j46) ^ j45;
        jArr3[6] = j51;
        jArr3[0] = j22 ^ (j27 << 57);
        jArr3[1] = (j27 >>> 7) ^ (j29 << 50);
        jArr3[2] = (j29 >>> 14) ^ (j38 << 43);
        jArr3[3] = (j38 >>> 21) ^ (j48 << 36);
        jArr3[4] = (j48 >>> 28) ^ (j50 << 29);
        jArr3[5] = (j50 >>> 35) ^ (j51 << 22);
        jArr3[6] = (j51 >>> 42) ^ (j43 << 15);
        jArr3[7] = (j43 >>> 49) ^ (j42 << 8);
        jArr3[8] = (j42 >>> 56) ^ (j23 << 1);
        jArr3[9] = j23 >>> 63;
    }

    public static void W0(ByteArrayOutputStream byteArrayOutputStream, fw0 fw0Var) {
        int i2 = 0;
        for (Map.Entry entry : fw0Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                k21.x0(intValue - i2, byteArrayOutputStream);
                k21.x0(0, byteArrayOutputStream);
                i2 = intValue;
            }
        }
    }

    public static void X(long[] jArr, long j2, long j3, long[] jArr2, int i2) {
        jArr[1] = j3;
        long j4 = j3 << 1;
        jArr[2] = j4;
        long j5 = j4 ^ j3;
        jArr[3] = j5;
        long j6 = j3 << 2;
        jArr[4] = j6;
        jArr[5] = j6 ^ j3;
        long j7 = j5 << 1;
        jArr[6] = j7;
        jArr[7] = j7 ^ j3;
        long j8 = jArr[((int) j2) & 7];
        long j9 = 0;
        int i3 = 48;
        do {
            int i4 = (int) (j2 >>> i3);
            long j10 = (jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 9;
        } while (i3 > 0);
        jArr2[i2] = 144115188075855871L & j8;
        jArr2[i2 + 1] = (((((j2 & 72198606942111744L) & ((j3 << 7) >> 63)) >>> 8) ^ j9) << 7) ^ (j8 >>> 57);
    }

    public static void X0(DataOutputStream dataOutputStream, o06 o06Var, int i2) {
        if (o06Var == null) {
            zl1.g("null XMSS node");
            return;
        }
        byte[] bArr = o06Var.J;
        int length = bArr.length;
        int i3 = o06Var.I;
        if (i3 < 0 || i3 > i2 || length < 1 || length > 64) {
            zl1.g("XMSS node out of bounds");
            return;
        }
        dataOutputStream.writeInt(i3);
        dataOutputStream.writeInt(length);
        dataOutputStream.write(bArr, 0, bArr.length);
    }

    public static void Y(long[] jArr, long[] jArr2) {
        e41.E(4, jArr, jArr2);
        jArr2[8] = e41.D((int) jArr[4]);
    }

    public static final Object Z(uu2 uu2Var) {
        m72 m72Var = (m72) uu2Var.I;
        xp0 xp0Var = new xp0();
        xp0Var.I = m72Var;
        xp0Var.J = xp0Var;
        el0 el0Var = p;
        xp0Var.K = el0Var;
        while (true) {
            Object obj = xp0Var.K;
            fj0 fj0Var = xp0Var.J;
            if (fj0Var == null) {
                mu0.V(obj);
                return obj;
            }
            if (j42.c(el0Var, obj)) {
                try {
                    m72 m72Var2 = xp0Var.I;
                    p70.A(3, m72Var2);
                    m72 m72Var3 = new m72(m72Var2.L, fj0Var);
                    m72Var3.K = xp0Var;
                    Object invokeSuspend = m72Var3.invokeSuspend(wd5.a);
                    if (invokeSuspend != el0.I) {
                        fj0Var.resumeWith(invokeSuspend);
                    }
                } catch (Throwable th) {
                    fj0Var.resumeWith(new g54(th));
                }
            } else {
                xp0Var.K = el0Var;
                fj0Var.resumeWith(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0310, code lost:
    
        r11.d0(-277052114);
        r0 = (defpackage.b50) defpackage.o70.V0(r8.d.b.h(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0324, code lost:
    
        if (r0 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0326, code lost:
    
        r3 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x032b, code lost:
    
        r13 = (java.util.List) r6.getValue();
        r0 = (r11.g(r6) ? 1 : 0) | (r11.g(r3) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x033c, code lost:
    
        if (r4 == 4) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0342, code lost:
    
        if (r11.i(r34) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0345, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0349, code lost:
    
        r0 = r0 | r4;
        r4 = r11.Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x034e, code lost:
    
        if (r0 != 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0350, code lost:
    
        if (r4 != r2) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0353, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0363, code lost:
    
        defpackage.mw2.i(r3, r13, (defpackage.hn1) r4, r11);
        r12 = defpackage.nq4.c;
        r0 = defpackage.px.c(defpackage.q8.J, r9);
        r1 = r11.T;
        r1 = (int) (r1 ^ (r1 >>> 32));
        r2 = r11.m();
        r3 = defpackage.i42.x0(r11, r12);
        defpackage.xd0.c.getClass();
        r11.h0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x038b, code lost:
    
        if (r11.S == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x038d, code lost:
    
        r11.l(defpackage.wa2.A0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0396, code lost:
    
        defpackage.qi4.k(r11, defpackage.q8.c0, r0);
        defpackage.qi4.k(r11, defpackage.q8.b0, r2);
        defpackage.qi4.k(r11, defpackage.q8.d0, java.lang.Integer.valueOf(r1));
        defpackage.qi4.j(r11);
        defpackage.qi4.k(r11, defpackage.q8.a0, r3);
        r0 = r11.i(r7);
        r1 = r11.Q();
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03b9, code lost:
    
        if (r0 != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03bb, code lost:
    
        if (r1 != r6) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03c5, code lost:
    
        r2 = r24;
        r24 = r9;
        r0 = new defpackage.m30(r7, r2, r34, r10, r22, r9, r20, r19, r21);
        r7 = r34;
        r22 = defpackage.p70.u0(-2117225613, r0, r11);
        r8 = r12;
        r0 = r33;
        defpackage.mu0.f(r8, r12, null, null, null, null, true, (defpackage.tm1) r1, null, null, null, r22, r11, 100663344);
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0407, code lost:
    
        if (r25 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0409, code lost:
    
        r5.d0(773947134);
        defpackage.p70.o("正在加载精选视频...", defpackage.mw2.p(r12, ((defpackage.fw2) r5.k(defpackage.lw2.b)).a.p, defpackage.mw2.j), r5, 6, r24 ? 1 : 0);
        r5.q(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0434, code lost:
    
        r5.q(r0);
        r5.q(r24);
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x042b, code lost:
    
        r5.d0(774193150);
        r5.q(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03bd, code lost:
    
        r1 = new defpackage.l30(r7, r9);
        r11.o0(r1);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0393, code lost:
    
        r11.r0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0355, code lost:
    
        r6 = r2;
        r0 = new defpackage.q30((java.lang.Object) r34, r6, (java.lang.Object) r3, (defpackage.fj0) null, (byte) 0);
        r11.o0(r0);
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0347, code lost:
    
        r4 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x032a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02ef, code lost:
    
        if (((java.lang.Boolean) r26.getValue()).booleanValue() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02fb, code lost:
    
        if (r13 != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02fd, code lost:
    
        r11.d0(-277276058);
        b(r34, r12, r11, r4 | 56);
        r11.q(r9);
        r7 = r34;
        r5 = r11;
        r8 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b9  */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v1, types: [fe0, go1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r5v15, types: [fe0, go1] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hu2 r34, defpackage.l13 r35, final int r36, final boolean r37, final int r38, final defpackage.rm1 r39, final boolean r40, defpackage.fe0 r41, final int r42) {
        /*
            Method dump skipped, instructions count: 1261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg5.a(hu2, l13, int, boolean, int, rm1, boolean, fe0, int):void");
    }

    public static final l13 a0(l13 l13Var, Object obj) {
        return l13Var.then(new ga2(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x018b, code lost:
    
        if (r4 == r0) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.hu2 r51, defpackage.l13 r52, defpackage.fe0 r53, int r54) {
        /*
            Method dump skipped, instructions count: 1464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg5.b(hu2, l13, fe0, int):void");
    }

    public static final l13 b0(l13 l13Var, rm1 rm1Var, rm1 rm1Var2, rm1 rm1Var3, rm1 rm1Var4, long j2, long j3, rx4 rx4Var, rx4 rx4Var2, float f2, float f3, float f4, float f5) {
        return l13Var.then(new dz1(f2, f4, f5, f3, j2, j3, rm1Var, rm1Var2, rm1Var3, rm1Var4, rx4Var, rx4Var2));
    }

    public static final void c(hu2 hu2Var, final b50 b50Var, final int i2, final boolean z2, l13 l13Var, fe0 fe0Var, final int i3) {
        int i4;
        String str;
        boolean z3;
        zg2 zg2Var;
        final hu2 hu2Var2 = hu2Var;
        l13 l13Var2 = l13Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1240205918);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? go1Var.g(hu2Var2) : go1Var.i(hu2Var2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? go1Var.g(b50Var) : go1Var.i(b50Var) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= go1Var.h(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= go1Var.g(l13Var2) ? 16384 : 8192;
        }
        int i5 = i4;
        if (go1Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            float f2 = z2 ? 8.0f : 10.0f;
            if (b50Var != null) {
                String str2 = b50Var.b;
                List list = b50Var.c;
                if (!list.isEmpty() || (!b50Var.d && b50Var.f)) {
                    if (list.isEmpty() && b50Var.e != null) {
                        go1Var.d0(-1665349016);
                        p70.q(hc4.Q(), "该分区加载失败", l13Var2, null, rw4.J, false, p70.u0(-2072034711, new a91(hu2Var2, b50Var, (byte) 3), go1Var), go1Var, ((i5 >> 6) & 896) | 1597488, 40);
                        go1Var.q(false);
                        l13Var2 = l13Var;
                    } else if (list.isEmpty()) {
                        go1Var.d0(-1664882869);
                        l13Var2 = l13Var;
                        p70.q(li4.g(), "该分区暂无内容", l13Var2, null, rw4.I, false, null, go1Var, ((i5 >> 6) & 896) | 24624, 104);
                        go1Var.q(false);
                    } else {
                        go1Var.d0(-1664603807);
                        go1Var.a0(-2131905308, str2);
                        zg2 e02 = e41.e0(go1Var);
                        int i6 = i5 & 112;
                        int i7 = i5 & 14;
                        boolean g2 = go1Var.g(e02) | (i6 == 32 || ((i5 & 64) != 0 && go1Var.i(b50Var))) | (i7 == 4 || ((i5 & 8) != 0 && go1Var.i(hu2Var2)));
                        Object Q2 = go1Var.Q();
                        jp jpVar = de0.a;
                        if (g2 || Q2 == jpVar) {
                            str = str2;
                            z3 = false;
                            o1 o1Var = new o1(e02, b50Var, hu2Var2, null, (byte) 2);
                            zg2Var = e02;
                            hu2Var2 = hu2Var2;
                            go1Var.o0(o1Var);
                            Q2 = o1Var;
                        } else {
                            str = str2;
                            zg2Var = e02;
                            z3 = false;
                        }
                        mw2.i(zg2Var, str, (hn1) Q2, go1Var);
                        kv4 kv4Var = new kv4(i2);
                        li3 T2 = i42.T(z2 ? 12.0f : 16.0f, z2 ? 12.0f : 16.0f, 12.0f, 2);
                        kp kpVar = new kp(f2, true, new y9());
                        boolean z4 = ((i6 == 32 || ((i5 & 64) != 0 && go1Var.i(b50Var))) ? true : z3) | ((i7 == 4 || ((i5 & 8) != 0 && go1Var.i(hu2Var2))) ? true : z3);
                        Object Q3 = go1Var.Q();
                        if (z4 || Q3 == jpVar) {
                            Q3 = new o20(b50Var, hu2Var2);
                            go1Var.o0(Q3);
                        }
                        boolean z5 = z3;
                        c21.e(kv4Var, l13Var, zg2Var, T2, f2, kpVar, null, false, null, (tm1) Q3, go1Var, (i5 >> 9) & 112);
                        l13Var2 = l13Var;
                        go1Var = go1Var;
                        go1Var.q(z5);
                        go1Var.q(z5);
                    }
                }
            }
            go1Var.d0(-1665491430);
            p70.o(null, l13Var2, go1Var, ((i5 >> 9) & 112) | 6, 0);
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            final l13 l13Var3 = l13Var2;
            u2.d = new hn1() { // from class: p20
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qg5.c(hu2.this, b50Var, i2, z2, l13Var3, (fe0) obj, mu0.X(i3 | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final l13 c0(l13 l13Var, rm1 rm1Var, tm1 tm1Var, long j2, long j3, rx4 rx4Var, rx4 rx4Var2, float f2, float f3, float f4, float f5) {
        return l13Var.then(new xv0(f2, f3, f4, f5, j2, j3, rm1Var, tm1Var, rx4Var, rx4Var2));
    }

    public static final void d(String str, l13 l13Var, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(388139656);
        int i3 = (go1Var.g(str) ? 4 : 2) | i2 | 48;
        byte b2 = 0;
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            l13Var = i13.a;
            l13 e2 = nq4.e(l13Var, 1.0f);
            WeakHashMap weakHashMap = dw5.w;
            l13 a02 = mw2.a0(e2, new fj2(wi4.h(go1Var).l, ad4.g | 16));
            ba0 a2 = z90.a(i42.d, q8.V, go1Var, 0);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, a02);
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
            i(str, i42.E0(l13Var, 32.0f, 0.0f, 2), go1Var, (i3 & 14) | 48);
            p70.o("正在加载该分区视频...", mw2.p(o7.m(i42.E0(nq4.g(nq4.e(l13Var, 1.0f), 220.0f), 32.0f, 0.0f, 2), jo.c), ((fw2) go1Var.k(lw2.b)).a.G, mw2.j), go1Var, 6, 0);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new s20(str, l13Var, i2, b2);
        }
    }

    public static final String d0(LiveRoom liveRoom) {
        liveRoom.getClass();
        String str = (String) o70.U0(liveRoom.getCover().getUrlList());
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static final void e(final boolean z2, final boolean z3, final int i2, final rm1 rm1Var, final rm1 rm1Var2, fe0 fe0Var, final int i3) {
        int i4;
        int i5;
        float f2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1054094651);
        if ((i3 & 6) == 0) {
            i4 = (go1Var.h(z2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= go1Var.h(z3) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 = i2;
            i4 |= go1Var.e(i5) ? 256 : 128;
        } else {
            i5 = i2;
        }
        if ((i3 & 3072) == 0) {
            i4 |= go1Var.i(rm1Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= go1Var.i(rm1Var2) ? 16384 : 8192;
        }
        if (go1Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = pt1.r(go1Var);
            }
            ki1 ki1Var = (ki1) Q2;
            Integer valueOf = Integer.valueOf(i5);
            Boolean valueOf2 = Boolean.valueOf(z3);
            Boolean valueOf3 = Boolean.valueOf(z2);
            boolean z4 = (i4 & 14) == 4;
            Object Q3 = go1Var.Q();
            if (z4 || Q3 == jpVar) {
                Q3 = new a40(z2, ki1Var, (fj0) null);
                go1Var.o0(Q3);
            }
            mw2.j(valueOf, valueOf2, valueOf3, (hn1) Q3, go1Var);
            l13 p2 = mw2.p(nq4.c, ((fw2) go1Var.k(i51Var)).a.p, mw2.j);
            uw2 c2 = px.c(q8.N, false);
            long j2 = go1Var.T;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, p2);
            xd0.c.getClass();
            go1Var.h0();
            boolean z5 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z5) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, c2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m2);
            Integer valueOf4 = Integer.valueOf(i6);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf4);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            tv tvVar = q8.W;
            ba0 a2 = z90.a(i42.d, tvVar, go1Var, 48);
            long j3 = go1Var.T;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            i13 i13Var = i13.a;
            l13 x02 = i42.x0(go1Var, i13Var);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a2);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(i7, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            byte b2 = 2;
            ut0.a(vt0.M(go1Var, com.github.mytv.dv.R.mipmap.ic_launcher_foreground), "myDV", o7.m(nq4.k(i13Var, 80.0f), l74.a(20.0f)), null, li0.b, 0.0f, null, go1Var, rj3.$stable | 24624, 104);
            oh4.a(go1Var, nq4.g(i13Var, 16.0f));
            r55.b("精选频道", null, k80Var.q, oh4.j(32), qk1.P, 0L, null, 0L, 0, false, 0, 0, null, go1Var, 1597446, 0, 262058);
            go1Var = go1Var;
            oh4.a(go1Var, nq4.g(i13Var, 24.0f));
            if (z2) {
                go1Var.d0(482599305);
                p70.o("正在加载精选视频...", null, go1Var, 6, 2);
                go1Var.q(false);
                f2 = 24.0f;
            } else {
                byte b3 = 0;
                if (z3) {
                    f2 = 24.0f;
                    go1Var.d0(483206812);
                    p70.q(li4.g(), "暂无视频", null, "请检查网络或认证配置", rw4.I, false, p70.u0(120038017, new p30(ki1Var, rm1Var2, rm1Var, b3), go1Var), go1Var, 1600560, 36);
                    go1Var.q(false);
                } else {
                    go1Var.d0(482702876);
                    f2 = 24.0f;
                    p70.q(a5.K(), "请先配置Cookie", null, null, rw4.K, false, p70.u0(1653136481, new o30(ki1Var, rm1Var, b3), go1Var), go1Var, 1597488, 44);
                    go1Var.q(false);
                }
            }
            oh4.a(go1Var, nq4.g(i13Var, 40.0f));
            e41.d(i42.E0(i13Var, r13.e(go1Var) ? 0.0f : f2, 0.0f, 2), new kp(r13.e(go1Var) ? 16.0f : f2, true, new w7(r13.e(go1Var) ? q8.V : tvVar, b2)), new kp(10.0f, true, new y9()), null, 0, 0, p70.u0(1355548892, new uc0((byte) 3), go1Var), go1Var, 1573248, 56);
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1() { // from class: n20
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    qg5.e(z2, z3, i2, rm1Var, rm1Var2, (fe0) obj, mu0.X(i3 | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static void e0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        jl2.a0(iArr, iArr2, iArr4);
        t0(iArr4, iArr3);
    }

    public static final void f(boolean z2, rm1 rm1Var, rm1 rm1Var2, l13 l13Var, fe0 fe0Var, int i2) {
        l13 l13Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(303712158);
        int i3 = (go1Var.h(z2) ? 4 : 2) | i2 | (go1Var.g(l13Var) ? 2048 : 1024);
        if (go1Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            long longValue = ((Number) rm1Var2.invoke()).longValue();
            long j2 = 0;
            if (longValue > 0) {
                long longValue2 = longValue - ((Number) rm1Var.invoke()).longValue();
                if (longValue2 >= 0) {
                    j2 = longValue2;
                }
            } else {
                j2 = Long.MAX_VALUE;
            }
            on5.r(z2 && longValue > 0 && j2 <= 5000, "即将自动重播当前视频", j2 <= 2000, so3.M, l13Var, go1Var, ((i3 << 3) & 57344) | 3120, 0);
            l13Var2 = l13Var;
        } else {
            l13Var2 = l13Var;
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new g30(z2, rm1Var, rm1Var2, l13Var2, i2);
        }
    }

    public static void f0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        W(jArr, jArr2, jArr4);
        u0(jArr4, jArr3);
    }

    public static final void g(final Aweme aweme, final String str, final int i2, final int i3, final boolean z2, final boolean z3, fe0 fe0Var, final int i4) {
        int i5;
        boolean z4;
        m65 m65Var;
        byte b2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1553410617);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? go1Var.g(aweme) : go1Var.i(aweme) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= go1Var.g(str) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= go1Var.e(i2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= go1Var.e(i3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= go1Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= go1Var.h(z3) ? 131072 : 65536;
        }
        if (go1Var.T(i5 & 1, (74899 & i5) != 74898)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            ba0 a2 = z90.a(new kp(10.0f, true, new y9()), q8.V, go1Var, 6);
            long j2 = go1Var.T;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var, i13Var);
            xd0.c.getClass();
            go1Var.h0();
            int i7 = i5;
            boolean z5 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z5) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m2);
            Integer valueOf = Integer.valueOf(i6);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            uv uvVar = q8.T;
            u74 a3 = t74.a(new kp(10.0f, true, new y9()), uvVar, go1Var, 54);
            long j3 = go1Var.T;
            int i8 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            l13 x02 = i42.x0(go1Var, i13Var);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a3);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(i8, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            l13 E0 = i42.E0(mw2.p(nq4.g(i13Var, 26.0f), k80Var.c, l74.a(8.0f)), 9.0f, 0.0f, 2);
            uw2 c2 = px.c(q8.N, false);
            long j4 = go1Var.T;
            int i9 = (int) (j4 ^ (j4 >>> 32));
            am3 m4 = go1Var.m();
            l13 x03 = i42.x0(go1Var, E0);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c2);
            qi4.k(go1Var, sgVar2, m4);
            r7.G(i9, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x03);
            r55.b(str, null, k80Var.d, 0L, qk1.P, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.m, go1Var, ((i7 >> 3) & 14) | 1572864, 24576, 114618);
            go1Var.q(true);
            r55.b(hf1.v("分区 ", i2 + 1, " / ", i3, " · ↑↓ 换分区"), null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 1, 0, xc3.e, go1Var, 0, 24576, 114682);
            go1Var.q(true);
            String w2 = hf1.w("@", aweme.getAuthor().getNickname());
            if (z3) {
                go1Var.d0(543806749);
                m65Var = ((fw2) go1Var.k(i51Var)).b.c;
                z4 = false;
            } else {
                z4 = false;
                go1Var.d0(543808126);
                m65Var = ((fw2) go1Var.k(i51Var)).b.b;
            }
            go1Var.q(z4);
            m65 m65Var2 = m65Var;
            r55.b(w2, i42.G0(i13Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), k80Var.q, 0L, qk1.R, 0L, null, 0L, 2, false, 1, 0, m65Var2, go1Var, 1572912, 24960, 110520);
            go1 go1Var2 = go1Var;
            u74 a4 = t74.a(new kp(16.0f, true, new y9()), uvVar, go1Var2, 54);
            long j5 = go1Var2.T;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            am3 m5 = go1Var2.m();
            l13 x04 = i42.x0(go1Var2, i13Var);
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, a4);
            qi4.k(go1Var2, sgVar2, m5);
            r7.G(i10, go1Var2, sgVar3, go1Var2);
            qi4.k(go1Var2, sgVar4, x04);
            l(sp0.O(), DataModelKt.formatCount(aweme.getStatistics().getDiggCount()), k80Var.a, go1Var2, 0, 0);
            l(i42.r0(), DataModelKt.formatCount(aweme.getStatistics().getCommentCount()), 0L, go1Var2, 0, 4);
            if (aweme.getStatistics().getPlayCount() > 0) {
                go1Var2.d0(-108306321);
                l(il2.H(), DataModelKt.formatCount(aweme.getStatistics().getPlayCount()), 0L, go1Var2, 0, 4);
                go1Var2.q(false);
            } else {
                go1Var2.d0(-108186196);
                go1Var2.q(false);
            }
            go1Var2.q(true);
            if (jx4.L(aweme.getDesc())) {
                b2 = 0;
                go1Var2.d0(-320517167);
                go1Var2.q(false);
            } else {
                go1Var2.d0(-320847100);
                r55.b(aweme.getDesc(), nq4.p(i13Var, 0.0f, 460.0f, 1), k80Var.s, 0L, null, 0L, null, 0L, 2, false, z3 ? 2 : 3, 0, ((fw2) go1Var2.k(i51Var)).b.j, go1Var2, 48, RendererCapabilities.DECODER_SUPPORT_MASK, 110584);
                go1Var2 = go1Var2;
                b2 = 0;
                go1Var2.q(false);
            }
            go1 go1Var3 = go1Var2;
            p70.d(z2, null, ma1.e(null, 3), ma1.f(null, 3), null, p70.u0(-737462727, new h30(k80Var, b2), go1Var2), go1Var3, 1600518 | ((i7 >> 9) & 112));
            go1Var = go1Var3;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1() { // from class: i30
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qg5.g(Aweme.this, str, i2, i3, z2, z3, (fe0) obj, mu0.X(i4 | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static void g0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        dq2.p0(iArr, iArr2, iArr4);
        v0(iArr4, iArr3);
    }

    public static final void h(String str, boolean z2, rm1 rm1Var, fe0 fe0Var, int i2) {
        char c2;
        long j2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(177930445);
        int i3 = i2 | (go1Var.g(str) ? 4 : 2) | (go1Var.h(z2) ? 32 : 16) | (go1Var.i(rm1Var) ? 256 : 128);
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q2);
            }
            t43 t43Var = (t43) Q2;
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q3;
            t43 w2 = ut0.w(t33Var, go1Var);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            long j3 = z2 ? k80Var.d : k80Var.s;
            boolean booleanValue = ((Boolean) t43Var.getValue()).booleanValue();
            if (z2) {
                c2 = ' ';
                j2 = k80Var.c;
            } else {
                c2 = ' ';
                j2 = k80Var.G;
            }
            cw4 t02 = p70.t0(booleanValue, j2, k80Var.u, ((Boolean) w2.getValue()).booleanValue(), "featured-chip-bg", go1Var, 24576, 0);
            cw4 s02 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j3, k80Var.v, "featured-chip-fg", go1Var, 3072);
            i13 i13Var = i13.a;
            l13 g2 = nq4.g(i13Var, 32.0f);
            Object Q4 = go1Var.Q();
            if (Q4 == jpVar) {
                Q4 = new uf(t43Var, (byte) 9);
                go1Var.o0(Q4);
            }
            l13 E0 = i42.E0(mw2.B(r13.d(r7.u(12.0f, i42.A0(g2, (tm1) Q4), t02), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), false, null, 3), 12.0f, 0.0f, 2);
            uw2 c3 = px.c(q8.N, false);
            long j4 = go1Var.T;
            int i4 = (int) (j4 ^ (j4 >>> c2));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c3);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            r55.b(str, p70.G(i13Var, s02, j3, false, null, 12), j3, 0L, z2 ? qk1.P : qk1.N, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.m, go1Var, i3 & 14, 24576, 114616);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new t20(str, z2, rm1Var, i2, (byte) 2);
        }
    }

    public static void h0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        il2.Q(iArr, iArr2, iArr4);
        w0(iArr4, iArr3);
    }

    public static final void i(String str, l13 l13Var, fe0 fe0Var, int i2) {
        int i3;
        byte b2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1912888999);
        if ((i2 & 6) == 0) {
            i3 = i2 | (go1Var.g(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.g(l13Var) ? 32 : 16;
        }
        int i4 = i3;
        if (go1Var.T(i4 & 1, (i4 & 19) != 18)) {
            l13 E0 = i42.E0(l13Var, 0.0f, 10.0f, 1);
            u74 a2 = t74.a(i42.b, q8.T, go1Var, 48);
            long j2 = go1Var.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
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
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m2);
            Integer valueOf = Integer.valueOf(i5);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            i13 i13Var = i13.a;
            l13 k2 = nq4.k(i13Var, 26.0f);
            i51 i51Var = lw2.b;
            l13 p2 = mw2.p(k2, ((fw2) go1Var.k(i51Var)).a.l, l74.a(6.0f));
            uw2 c2 = px.c(q8.N, false);
            long j3 = go1Var.T;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p2);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c2);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(i6, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            ow1.a(sp0.T(), null, nq4.k(i13Var, 15.0f), ((fw2) go1Var.k(i51Var)).a.m, go1Var, 432);
            go1Var.q(true);
            oh4.a(go1Var, nq4.n(i13Var, 12.0f));
            r55.b(str, null, ((fw2) go1Var.k(i51Var)).a.q, oh4.j(15), qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.i, go1Var, (i4 & 14) | 1597440, 0, 130986);
            go1Var = go1Var;
            b2 = 1;
            go1Var.q(true);
        } else {
            b2 = 1;
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new qj(b2, i2, str, l13Var);
        }
    }

    public static final void i0(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i0(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i0(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            f00 f00Var = f00.K;
            sb.append(hc4.x(new f00(((String) obj).getBytes(r32.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof f00) {
            sb.append(": \"");
            sb.append(hc4.x((f00) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof bp1) {
            sb.append(" {");
            C0((bp1) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        i0(sb, i5, "key", entry.getKey());
        i0(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(String str, boolean z2, rm1 rm1Var, fe0 fe0Var, int i2) {
        t43 t43Var;
        long j2;
        boolean z3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-457252311);
        int i3 = i2 | (go1Var.g(str) ? 4 : 2) | (go1Var.h(z2) ? 32 : 16) | (go1Var.i(rm1Var) ? 256 : 128);
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            Object Q2 = go1Var.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q2);
            }
            t43 t43Var2 = (t43) Q2;
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            i13 i13Var = i13.a;
            l13 i4 = nq4.i(nq4.e(i13Var, 1.0f), 48.0f, 0.0f, 2);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new uf(t43Var2, (byte) 7);
                go1Var.o0(Q3);
            }
            l13 m2 = o7.m(i42.A0(i4, (tm1) Q3), l74.a(12.0f));
            if (((Boolean) t43Var2.getValue()).booleanValue()) {
                t43Var = t43Var2;
                j2 = k80Var.u;
            } else {
                t43Var = t43Var2;
                j2 = z2 ? k80Var.c : x70.f;
            }
            t43 t43Var3 = t43Var;
            l13 d2 = r13.d(mw2.p(m2, j2, mw2.j), null, null, null, null, rm1Var, null, null, null, null, null, null, null, 261887);
            boolean z4 = (i3 & 896) == 256;
            Object Q4 = go1Var.Q();
            if (z4 || Q4 == jpVar) {
                z3 = false;
                Q4 = new c40(rm1Var, 0 == true ? 1 : 0);
                go1Var.o0(Q4);
            } else {
                z3 = false;
            }
            l13 b2 = m05.b(d2, wd5.a, (PointerInputEventHandler) Q4);
            uw2 c2 = px.c(q8.M, z3);
            long j3 = go1Var.T;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            l13 x0 = i42.x0(go1Var, b2);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m3);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i5));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            m65 m65Var = ((fw2) go1Var.k(i51Var)).b.j;
            r55.b(str, i42.E0(i13Var, 14.0f, 0.0f, 2), ((Boolean) t43Var3.getValue()).booleanValue() ? k80Var.v : z2 ? k80Var.d : k80Var.q, 0L, z2 ? qk1.P : qk1.M, 0L, null, 0L, 2, false, 1, 0, m65Var, go1Var, (i3 & 14) | 48, 24960, 110520);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new t20(str, z2, rm1Var, i2, (byte) 1);
        }
    }

    public static qs j0(DataInputStream dataInputStream, rs rsVar) {
        qs qsVar;
        String str;
        int i2;
        int i3;
        o06 q02;
        String str2;
        int readInt = dataInputStream.readInt();
        int readInt2 = dataInputStream.readInt();
        int readInt3 = dataInputStream.readInt();
        int readInt4 = dataInputStream.readInt();
        boolean k02 = k0(dataInputStream);
        if (readInt < 2 || readInt > 30) {
            qsVar = null;
            str = "BDS tree height out of bounds";
        } else {
            if (readInt2 >= 2 && readInt2 <= readInt) {
                int i4 = readInt - readInt2;
                if ((i4 & 1) == 0) {
                    int i5 = 1;
                    int i6 = (1 << readInt) - 1;
                    if (readInt3 >= 0 && readInt3 <= i6 && readInt4 >= 0 && readInt4 <= readInt3 + 1) {
                        o06 q03 = !k0(dataInputStream) ? null : q0(dataInputStream, 0, readInt, rsVar);
                        if (q03 == null || q03.I == readInt) {
                            int m02 = m0(dataInputStream, readInt, "BDS authentication path");
                            if (m02 == 0 || m02 == readInt) {
                                ArrayList arrayList = new ArrayList(m02);
                                int i7 = 0;
                                while (true) {
                                    i2 = i5;
                                    if (i7 >= m02) {
                                        break;
                                    }
                                    arrayList.add(q0(dataInputStream, i7, i7, rsVar));
                                    i7++;
                                    i5 = i2;
                                }
                                if ((q03 == null ? i2 : 0) == arrayList.isEmpty()) {
                                    int m03 = m0(dataInputStream, readInt2 - 1, "BDS retain map");
                                    TreeMap treeMap = new TreeMap();
                                    int i8 = i4 - 1;
                                    qsVar = null;
                                    int i9 = 0;
                                    while (i9 < m03) {
                                        int readInt5 = dataInputStream.readInt();
                                        if (readInt5 <= i8 || readInt5 > readInt - 2) {
                                            str = "invalid BDS retain height";
                                            break;
                                        }
                                        int i10 = readInt2;
                                        LinkedList linkedList = new LinkedList();
                                        int i11 = readInt3;
                                        int i12 = 0;
                                        for (int m04 = m0(dataInputStream, Math.min((i2 << ((readInt - readInt5) - 1)) - 1, rsVar.I), "BDS retain queue"); i12 < m04; m04 = m04) {
                                            linkedList.add(q0(dataInputStream, readInt5, readInt5, rsVar));
                                            i12++;
                                        }
                                        treeMap.put(Integer.valueOf(readInt5), linkedList);
                                        i9++;
                                        i8 = readInt5;
                                        readInt2 = i10;
                                        readInt3 = i11;
                                    }
                                    int i13 = readInt2;
                                    int i14 = readInt3;
                                    int m05 = m0(dataInputStream, Math.min(readInt, rsVar.I), "BDS stack");
                                    Stack stack = new Stack();
                                    for (int i15 = 0; i15 < m05; i15++) {
                                        stack.push(q0(dataInputStream, 0, readInt, rsVar));
                                    }
                                    int m06 = m0(dataInputStream, i4, "BDS tree hash");
                                    if (m06 == i4) {
                                        ArrayList arrayList2 = new ArrayList(m06);
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= m06) {
                                                int i17 = readInt4;
                                                int m07 = m0(dataInputStream, Math.min(readInt, rsVar.I), "BDS keep map");
                                                o06 o06Var = q03;
                                                TreeMap treeMap2 = new TreeMap();
                                                int i18 = -1;
                                                int i19 = 0;
                                                while (i19 < m07) {
                                                    int readInt6 = dataInputStream.readInt();
                                                    if (readInt6 <= i18 || readInt6 > readInt - 2) {
                                                        str = "invalid BDS keep height";
                                                    } else {
                                                        treeMap2.put(Integer.valueOf(readInt6), q0(dataInputStream, readInt6, readInt6, rsVar));
                                                        i19++;
                                                        i18 = readInt6;
                                                    }
                                                }
                                                try {
                                                    return new qs(readInt, i13, i14, i17, k02, o06Var, arrayList, treeMap, stack, arrayList2, treeMap2);
                                                } catch (IllegalStateException e2) {
                                                    throw k21.Z("invalid BDS state", e2);
                                                }
                                            }
                                            int readInt7 = dataInputStream.readInt();
                                            int readInt8 = dataInputStream.readInt();
                                            int readInt9 = dataInputStream.readInt();
                                            boolean k03 = k0(dataInputStream);
                                            boolean k04 = k0(dataInputStream);
                                            if (readInt7 != i16 || readInt8 < 0 || readInt8 > readInt7 || readInt9 < 0 || readInt9 > i6) {
                                                break;
                                            }
                                            if (k0(dataInputStream)) {
                                                i3 = m06;
                                                q02 = q0(dataInputStream, 0, readInt, rsVar);
                                            } else {
                                                i3 = m06;
                                                q02 = null;
                                            }
                                            int i20 = readInt4;
                                            if (q02 != null && q02.I > readInt7) {
                                                str = "BDS tree hash tail has wrong height";
                                                break;
                                            }
                                            arrayList2.add(new ts(readInt7, readInt8, readInt9, k03, k04, q02));
                                            i16++;
                                            m06 = i3;
                                            readInt4 = i20;
                                        }
                                    } else {
                                        str = "BDS tree hash has wrong size";
                                    }
                                } else {
                                    qsVar = null;
                                    str = "inconsistent BDS root and authentication path";
                                }
                            } else {
                                str2 = "BDS authentication path has wrong size";
                            }
                        } else {
                            str2 = "BDS root has wrong height";
                        }
                        zl1.g(str2);
                        return null;
                    }
                    qsVar = null;
                    str = "BDS index out of bounds";
                }
            }
            qsVar = null;
            str = "BDS k out of bounds";
        }
        zl1.g(str);
        return qsVar;
    }

    public static final void k(String str, boolean z2, rm1 rm1Var, fe0 fe0Var, int i2) {
        go1 go1Var;
        t43 t43Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1718158967);
        int i3 = i2 | (go1Var2.g(str) ? 4 : 2) | (go1Var2.h(z2) ? 32 : 16) | (go1Var2.i(rm1Var) ? 256 : 128);
        if (go1Var2.T(i3 & 1, (i3 & 147) != 146)) {
            Object Q2 = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q2 == jpVar) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q2);
            }
            t43 t43Var2 = (t43) Q2;
            Object Q3 = go1Var2.Q();
            if (Q3 == jpVar) {
                Q3 = r7.v(go1Var2);
            }
            t33 t33Var = (t33) Q3;
            t43 w2 = ut0.w(t33Var, go1Var2);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            long j2 = z2 ? k80Var.a : k80Var.s;
            boolean booleanValue = ((Boolean) t43Var2.getValue()).booleanValue();
            long j3 = x70.f;
            cw4 t02 = p70.t0(booleanValue, j3, k80Var.u, ((Boolean) w2.getValue()).booleanValue(), "featured-text-tab-bg", go1Var2, 24624, 0);
            cw4 s02 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), j2, k80Var.v, "featured-text-tab-fg", go1Var2, 3072);
            Object Q4 = go1Var2.Q();
            if (Q4 == jpVar) {
                t43Var = t43Var2;
                Q4 = new uf(t43Var, (byte) 6);
                go1Var2.o0(Q4);
            } else {
                t43Var = t43Var2;
            }
            i13 i13Var = i13.a;
            l13 D0 = i42.D0(mw2.B(r13.d(r7.u(12.0f, i42.A0(i13Var, (tm1) Q4), t02), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), false, null, 3), 10.0f, 6.0f);
            ba0 a2 = z90.a(i42.d, q8.W, go1Var2, 48);
            long j4 = go1Var2.T;
            int i4 = (int) (j4 ^ (j4 >>> 32));
            am3 m2 = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, D0);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, a2);
            qi4.k(go1Var2, q8.b0, m2);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            t43 t43Var3 = t43Var;
            r55.b(str, p70.G(i13Var, s02, j2, false, null, 12), j2, 0L, z2 ? qk1.Q : qk1.N, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var2.k(i51Var)).b.h, go1Var2, i3 & 14, 24576, 114616);
            go1Var = go1Var2;
            oh4.a(go1Var, nq4.g(i13Var, 4.0f));
            px.a(mw2.p(o7.m(nq4.l(i13Var, 20.0f, 3.0f), l74.a(2.0f)), (!z2 || ((Boolean) t43Var3.getValue()).booleanValue()) ? j3 : k80Var.a, mw2.j), go1Var, 0);
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new t20(str, z2, rm1Var, i2, (byte) 0);
        }
    }

    public static boolean k0(DataInputStream dataInputStream) {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if (readUnsignedByte <= 1) {
            return readUnsignedByte == 1;
        }
        zl1.g("invalid boolean in BDS state");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if ((r29 & 4) != 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(defpackage.hx1 r23, java.lang.String r24, long r25, defpackage.fe0 r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg5.l(hx1, java.lang.String, long, fe0, int, int):void");
    }

    public static int[] l0(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) k21.p0(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static final void m(final List list, final String str, final boolean z2, final int i2, final int i3, final ki1 ki1Var, final tm1 tm1Var, final tm1 tm1Var2, final tm1 tm1Var3, final boolean z3, final so3 so3Var, final dp3 dp3Var, final int i4, final OkHttpClient okHttpClient, final l13 l13Var, fe0 fe0Var, final int i5) {
        int i6;
        go1 go1Var;
        List list2;
        Object obj;
        Object obj2;
        long j2;
        t43 t43Var;
        String str2;
        String awemeId;
        String str3;
        t43 t43Var2;
        final t43 t43Var3;
        t43 t43Var4;
        t43 t43Var5;
        t43 t43Var6;
        String str4;
        t43 t43Var7;
        so3 so3Var2;
        ag2 ag2Var;
        t43 t43Var8;
        int i7;
        Video video;
        Cover cover;
        List<String> urlList;
        String str5;
        list.getClass();
        str.getClass();
        tm1Var.getClass();
        tm1Var2.getClass();
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1627301449);
        if ((i5 & 6) == 0) {
            i6 = ((i5 & 8) == 0 ? go1Var2.g(list) : go1Var2.i(list) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= go1Var2.g(str) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i6 |= go1Var2.h(z2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= go1Var2.e(i2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= go1Var2.e(i3) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i6 |= go1Var2.g(ki1Var) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i6 |= go1Var2.i(tm1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i6 |= go1Var2.i(tm1Var2) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i6 |= go1Var2.i(tm1Var3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i6 |= go1Var2.h(z3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i8 = -1;
        int i9 = (go1Var2.e(dp3Var == null ? -1 : dp3Var.ordinal()) ? 32 : 16) | 24576 | (go1Var2.e(so3Var == null ? -1 : so3Var.ordinal()) ? (char) 4 : (char) 2) | (go1Var2.e(i4) ? 256 : 128) | (go1Var2.i(okHttpClient) ? 2048 : 1024);
        int i10 = i6;
        if (go1Var2.T(i10 & 1, ((i6 & 306783379) == 306783378 && (i9 & 9363) == 9362) ? false : true)) {
            Object Q2 = go1Var2.Q();
            Object obj3 = de0.a;
            if (Q2 == obj3) {
                Q2 = ad4.w(null);
                go1Var2.o0(Q2);
            }
            t43 t43Var9 = (t43) Q2;
            Object Q3 = go1Var2.Q();
            if (Q3 == obj3) {
                Q3 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q3);
            }
            final t43 t43Var10 = (t43) Q3;
            ag2 a2 = bg2.a(go1Var2);
            Object Q4 = go1Var2.Q();
            if (Q4 == obj3) {
                Q4 = new ArrayList();
                go1Var2.o0(Q4);
            }
            List list3 = (List) Q4;
            while (list3.size() < list.size()) {
                list3.add(new ki1());
            }
            Object Q5 = go1Var2.Q();
            if (Q5 == obj3) {
                Q5 = new fy();
                go1Var2.o0(Q5);
            }
            final fy fyVar = (fy) Q5;
            Object Q6 = go1Var2.Q();
            if (Q6 == obj3) {
                Q6 = mw2.w(go1Var2);
                go1Var2.o0(Q6);
            }
            final dl0 dl0Var = (dl0) Q6;
            t43 x2 = ad4.x(tm1Var2, go1Var2);
            Integer valueOf = Integer.valueOf(list.size());
            int i11 = i10 & 14;
            boolean g2 = go1Var2.g(a2) | (i11 == 4 || ((i10 & 8) != 0 && go1Var2.i(list))) | go1Var2.g(x2);
            Object Q7 = go1Var2.Q();
            if (g2 || Q7 == obj3) {
                list2 = list3;
                obj = null;
                Q7 = new e40(a2, list, x2, (fj0) null);
                go1Var2.o0(Q7);
            } else {
                list2 = list3;
                obj = null;
            }
            mw2.i(a2, valueOf, (hn1) Q7, go1Var2);
            Object Q8 = go1Var2.Q();
            if (Q8 == obj3) {
                Q8 = ad4.w(obj);
                go1Var2.o0(Q8);
            }
            t43 t43Var11 = (t43) Q8;
            Object Q9 = go1Var2.Q();
            if (Q9 == obj3) {
                Q9 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q9);
            }
            t43 t43Var12 = (t43) Q9;
            Object Q10 = go1Var2.Q();
            if (Q10 == obj3) {
                Q10 = new hk3(0L);
                go1Var2.o0(Q10);
            }
            hk3 hk3Var = (hk3) Q10;
            Object Q11 = go1Var2.Q();
            if (Q11 == obj3) {
                Q11 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q11);
            }
            final t43 t43Var13 = (t43) Q11;
            Object Q12 = go1Var2.Q();
            if (Q12 == obj3) {
                Q12 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q12);
            }
            t43 t43Var14 = (t43) Q12;
            Object Q13 = go1Var2.Q();
            if (Q13 == obj3) {
                obj2 = null;
                Q13 = ad4.w(null);
                go1Var2.o0(Q13);
            } else {
                obj2 = null;
            }
            t43 t43Var15 = (t43) Q13;
            Object Q14 = go1Var2.Q();
            if (Q14 == obj3) {
                Q14 = ad4.w(obj2);
                go1Var2.o0(Q14);
            }
            t43 t43Var16 = (t43) Q14;
            Object Q15 = go1Var2.Q();
            if (Q15 == obj3) {
                Q15 = new gk3(1);
                go1Var2.o0(Q15);
            }
            final s33 s33Var = (s33) Q15;
            Object Q16 = go1Var2.Q();
            if (Q16 == obj3) {
                Q16 = new gk3(0);
                go1Var2.o0(Q16);
            }
            final s33 s33Var2 = (s33) Q16;
            Object Q17 = go1Var2.Q();
            if (Q17 == obj3) {
                Q17 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q17);
            }
            t43 t43Var17 = (t43) Q17;
            Object Q18 = go1Var2.Q();
            if (Q18 == obj3) {
                Q18 = new gk3(0);
                go1Var2.o0(Q18);
            }
            final s33 s33Var3 = (s33) Q18;
            Object Q19 = go1Var2.Q();
            if (Q19 == obj3) {
                Q19 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q19);
            }
            final t43 t43Var18 = (t43) Q19;
            Object Q20 = go1Var2.Q();
            if (Q20 == obj3) {
                Q20 = ad4.w(null);
                go1Var2.o0(Q20);
            }
            final t43 t43Var19 = (t43) Q20;
            Object Q21 = go1Var2.Q();
            if (Q21 == obj3) {
                j2 = 0;
                Q21 = new hk3(0L);
                go1Var2.o0(Q21);
            } else {
                j2 = 0;
            }
            final hk3 hk3Var2 = (hk3) Q21;
            Object Q22 = go1Var2.Q();
            if (Q22 == obj3) {
                Q22 = new hk3(j2);
                go1Var2.o0(Q22);
            }
            final hk3 hk3Var3 = (hk3) Q22;
            Aweme aweme = (Aweme) t43Var11.getValue();
            Object awemeId2 = aweme != null ? aweme.getAwemeId() : null;
            gk3 gk3Var = (gk3) s33Var;
            gk3 gk3Var2 = (gk3) s33Var2;
            boolean e2 = go1Var2.e(gk3Var2.h()) | go1Var2.g(awemeId2) | go1Var2.e(gk3Var.h());
            Object Q23 = go1Var2.Q();
            String str6 = "";
            if (e2 || Q23 == obj3) {
                Aweme aweme2 = (Aweme) t43Var11.getValue();
                String awemeId3 = aweme2 != null ? aweme2.getAwemeId() : null;
                if (awemeId3 == null) {
                    awemeId3 = "";
                }
                t43Var = t43Var16;
                Q23 = awemeId3 + ":" + gk3Var.h() + ":" + gk3Var2.h();
                go1Var2.o0(Q23);
            } else {
                t43Var = t43Var16;
            }
            String str7 = (String) Q23;
            Aweme aweme3 = (Aweme) t43Var9.getValue();
            if (aweme3 == null) {
                aweme3 = (Aweme) o70.U0(list);
            }
            final Aweme aweme4 = aweme3;
            if (aweme4 != null && (video = aweme4.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && (str5 = (String) o70.U0(urlList)) != null) {
                str6 = str5;
            }
            String str8 = str6.length() == 0 ? null : str6;
            Object obj4 = (Context) go1Var2.k(rb.b);
            final String str9 = str6;
            boolean z4 = ((r80) go1Var2.k(xh0.c)).a == t80.K;
            Object Q24 = go1Var2.Q();
            if (Q24 == obj3) {
                if (str8 != null) {
                    ri0 ri0Var = ri0.a;
                    Integer a3 = ri0.a(str8);
                    if (a3 != null) {
                        i7 = a3.intValue();
                        Object gk3Var3 = new gk3(i7);
                        go1Var2.o0(gk3Var3);
                        Q24 = gk3Var3;
                    }
                }
                i7 = j;
                Object gk3Var32 = new gk3(i7);
                go1Var2.o0(gk3Var32);
                Q24 = gk3Var32;
            }
            s33 s33Var4 = (s33) Q24;
            Boolean valueOf2 = Boolean.valueOf(z4);
            boolean h2 = go1Var2.h(z4) | go1Var2.g(str8) | go1Var2.i(obj4);
            String str10 = str8;
            Object Q25 = go1Var2.Q();
            if (h2 || Q25 == obj3) {
                Q25 = new zj((byte) 1, null, str10, obj4, s33Var4, z4);
                str2 = str10;
                go1Var2.o0(Q25);
            } else {
                str2 = str10;
            }
            mw2.i(str2, valueOf2, (hn1) Q25, go1Var2);
            gk3 gk3Var4 = (gk3) s33Var4;
            x70 x70Var = gk3Var4.h() == 0 ? null : new x70(qb.i(gk3Var4.h()));
            Aweme aweme5 = (Aweme) t43Var9.getValue();
            boolean g3 = go1Var2.g(aweme5 != null ? aweme5.getAwemeId() : null) | (i11 == 4 || ((i10 & 8) != 0 && go1Var2.g(list)));
            Object Q26 = go1Var2.Q();
            if (g3 || Q26 == obj3) {
                Aweme aweme6 = (Aweme) t43Var9.getValue();
                if (aweme6 != null && (awemeId = aweme6.getAwemeId()) != null) {
                    Iterator it = list.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (j42.c(((Aweme) it.next()).getAwemeId(), awemeId)) {
                            i8 = i12;
                            break;
                        }
                        i12++;
                    }
                }
                Q26 = Integer.valueOf(i8);
                go1Var2.o0(Q26);
            }
            B(list, ((Number) Q26).intValue(), go1Var2, i11);
            Aweme aweme7 = (Aweme) t43Var9.getValue();
            String awemeId4 = aweme7 != null ? aweme7.getAwemeId() : null;
            boolean g4 = (i11 == 4 || ((i10 & 8) != 0 && go1Var2.i(list))) | go1Var2.g(a2);
            Object Q27 = go1Var2.Q();
            if (g4 || Q27 == obj3) {
                str3 = null;
                Q27 = new e40(a2, t43Var9, list, (fj0) null);
                go1Var2.o0(Q27);
            } else {
                str3 = null;
            }
            mw2.i(awemeId4, list, (hn1) Q27, go1Var2);
            Aweme aweme8 = (Aweme) t43Var9.getValue();
            Boolean valueOf3 = Boolean.valueOf(z3);
            boolean z5 = (i10 & C.ENCODING_PCM_DOUBLE) == 536870912;
            Object Q28 = go1Var2.Q();
            if (z5 || Q28 == obj3) {
                t43Var2 = t43Var9;
                Q28 = new f40(z3, t43Var2, t43Var11, hk3Var, t43Var13, t43Var12, t43Var14, t43Var15, s33Var, s33Var2, t43Var17, s33Var3, t43Var18, t43Var19, hk3Var2, hk3Var3, null);
                t43Var3 = t43Var11;
                t43Var4 = t43Var12;
                t43Var5 = t43Var14;
                t43Var6 = t43Var15;
                s33Var3 = s33Var3;
                t43Var13 = t43Var13;
                go1Var2.o0(Q28);
            } else {
                t43Var2 = t43Var9;
                t43Var3 = t43Var11;
                t43Var4 = t43Var12;
                t43Var5 = t43Var14;
                t43Var6 = t43Var15;
            }
            Aweme.Companion companion = Aweme.Companion;
            mw2.i(aweme8, valueOf3, (hn1) Q28, go1Var2);
            Integer valueOf4 = Integer.valueOf(((gk3) s33Var3).h());
            Boolean bool = (Boolean) t43Var17.getValue();
            bool.getClass();
            Integer valueOf5 = Integer.valueOf(i4);
            Aweme aweme9 = (Aweme) t43Var3.getValue();
            if (aweme9 != null) {
                str3 = aweme9.getAwemeId();
            }
            Object[] objArr = {str7, valueOf4, bool, valueOf5, str3};
            boolean g5 = go1Var2.g(str7) | ((i9 & 896) == 256);
            Object Q29 = go1Var2.Q();
            if (g5 || Q29 == obj3) {
                str4 = str7;
                Q29 = new g40(str4, i4, t43Var17, t43Var19, t43Var18, s33Var, s33Var2, null);
                t43Var17 = t43Var17;
                go1Var2.o0(Q29);
            } else {
                str4 = str7;
            }
            mw2.k(objArr, (hn1) Q29, go1Var2);
            Boolean valueOf6 = Boolean.valueOf(((Boolean) t43Var4.getValue()).booleanValue());
            ExoPlayer exoPlayer = (ExoPlayer) t43Var.getValue();
            boolean z6 = (i9 & 14) == 4;
            Object Q30 = go1Var2.Q();
            if (z6 || Q30 == obj3) {
                t43Var7 = t43Var4;
                so3Var2 = so3Var;
                ag2Var = a2;
                t43Var8 = t43Var;
                Object ldVar = new ld(so3Var2, t43Var7, t43Var8, hk3Var2, hk3Var3, null, (byte) 1);
                go1Var2.o0(ldVar);
                Q30 = ldVar;
            } else {
                so3Var2 = so3Var;
                t43Var7 = t43Var4;
                ag2Var = a2;
                t43Var8 = t43Var;
            }
            mw2.j(valueOf6, so3Var2, exoPlayer, (hn1) Q30, go1Var2);
            final boolean z7 = ((Boolean) t43Var10.getValue()).booleanValue() && ((Boolean) t43Var7.getValue()).booleanValue() && ((Boolean) t43Var5.getValue()).booleanValue() && ((String) t43Var19.getValue()) == null;
            final boolean z8 = ((bw0) go1Var2.k(cw0.a)).b;
            final t43 t43Var20 = t43Var17;
            final String str11 = str4;
            final t43 t43Var21 = t43Var2;
            final ag2 ag2Var2 = ag2Var;
            final t43 t43Var22 = t43Var7;
            final List list4 = list2;
            final so3 so3Var3 = so3Var2;
            final t43 t43Var23 = t43Var5;
            final t43 t43Var24 = t43Var6;
            final t43 t43Var25 = t43Var8;
            hn1 hn1Var = new hn1() { // from class: q20
                /* JADX WARN: Code restructure failed: missing block: B:66:0x04c4, code lost:
                
                    if (r12 == r11) goto L93;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.hn1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r60, java.lang.Object r61) {
                    /*
                        Method dump skipped, instructions count: 1912
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.q20.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            };
            go1Var = go1Var2;
            xh0.a(x70Var, ma4.L, p70.u0(-194341400, hn1Var, go1Var), go1Var, 432);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1() { // from class: r20
                @Override // defpackage.hn1
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int X2 = mu0.X(i5 | 1);
                    qg5.m(list, str, z2, i2, i3, ki1Var, tm1Var, tm1Var2, tm1Var3, z3, so3Var, dp3Var, i4, okHttpClient, l13Var, (fe0) obj5, X2);
                    return wd5.a;
                }
            };
        }
    }

    public static int m0(DataInputStream dataInputStream, int i2, String str) {
        int readInt = dataInputStream.readInt();
        if (readInt >= 0 && readInt <= i2) {
            return readInt;
        }
        zl1.g(str.concat(" size out of bounds"));
        return 0;
    }

    public static final void n(t43 t43Var, boolean z2) {
        t43Var.setValue(Boolean.valueOf(z2));
    }

    public static fw0[] n0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, fw0[] fw0VarArr) {
        byte[] bArr3 = eu5.x;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, eu5.y)) {
                zy.i("Unsupported meta version");
                return null;
            }
            int p02 = (int) k21.p0(fileInputStream, 2);
            byte[] o02 = k21.o0(fileInputStream, (int) k21.p0(fileInputStream, 4), (int) k21.p0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                zy.i("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(o02);
            try {
                fw0[] p03 = p0(byteArrayInputStream, bArr2, p02, fw0VarArr);
                byteArrayInputStream.close();
                return p03;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(eu5.s, bArr2)) {
            zy.i("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            zy.i("Unsupported meta version");
            return null;
        }
        int p04 = (int) k21.p0(fileInputStream, 1);
        byte[] o03 = k21.o0(fileInputStream, (int) k21.p0(fileInputStream, 4), (int) k21.p0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            zy.i("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(o03);
        try {
            fw0[] o04 = o0(byteArrayInputStream2, p04, fw0VarArr);
            byteArrayInputStream2.close();
            return o04;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final void o(t43 t43Var, boolean z2) {
        t43Var.setValue(Boolean.valueOf(z2));
    }

    public static fw0[] o0(ByteArrayInputStream byteArrayInputStream, int i2, fw0[] fw0VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new fw0[0];
        }
        if (i2 != fw0VarArr.length) {
            zy.i("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int p02 = (int) k21.p0(byteArrayInputStream, 2);
            iArr[i3] = (int) k21.p0(byteArrayInputStream, 2);
            strArr[i3] = new String(k21.m0(byteArrayInputStream, p02), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            fw0 fw0Var = fw0VarArr[i4];
            if (!fw0Var.b.equals(strArr[i4])) {
                zy.i("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            fw0Var.e = i5;
            fw0Var.h = l0(byteArrayInputStream, i5);
        }
        return fw0VarArr;
    }

    public static final void p(t43 t43Var, boolean z2) {
        t43Var.setValue(Boolean.valueOf(z2));
    }

    public static fw0[] p0(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, fw0[] fw0VarArr) {
        fw0 fw0Var;
        if (byteArrayInputStream.available() == 0) {
            return new fw0[0];
        }
        if (i2 != fw0VarArr.length) {
            zy.i("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            k21.p0(byteArrayInputStream, 2);
            String str = new String(k21.m0(byteArrayInputStream, (int) k21.p0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long p02 = k21.p0(byteArrayInputStream, 4);
            int p03 = (int) k21.p0(byteArrayInputStream, 2);
            if (fw0VarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < fw0VarArr.length; i4++) {
                    if (fw0VarArr[i4].b.equals(substring)) {
                        fw0Var = fw0VarArr[i4];
                        break;
                    }
                }
            }
            fw0Var = null;
            if (fw0Var == null) {
                zy.i("Missing profile key: ".concat(str));
                return null;
            }
            fw0Var.d = p02;
            int[] l02 = l0(byteArrayInputStream, p03);
            if (Arrays.equals(bArr, eu5.w)) {
                fw0Var.e = p03;
                fw0Var.h = l02;
            }
        }
        return fw0VarArr;
    }

    public static final void q(t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6, s33 s33Var, s33 s33Var2, t43 t43Var7, s33 s33Var3, t43 t43Var8) {
        if (((Aweme) t43Var.getValue()) == null) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        t43Var2.setValue(bool);
        t43Var3.setValue(bool);
        t43Var4.setValue((Aweme) t43Var.getValue());
        Boolean bool2 = Boolean.FALSE;
        t43Var5.setValue(bool2);
        t43Var6.setValue(null);
        ((gk3) s33Var).i(1);
        gk3 gk3Var = (gk3) s33Var2;
        gk3Var.i(gk3Var.h() + 1);
        t43Var7.setValue(bool2);
        gk3 gk3Var2 = (gk3) s33Var3;
        gk3Var2.i(gk3Var2.h() + 1);
        p(t43Var8, false);
    }

    public static o06 q0(DataInputStream dataInputStream, int i2, int i3, rs rsVar) {
        int i4 = rsVar.I;
        if (i4 == 0) {
            zl1.g("too many XMSS nodes in BDS state");
            return null;
        }
        rsVar.I = i4 - 1;
        int readInt = dataInputStream.readInt();
        int readInt2 = dataInputStream.readInt();
        if (readInt < i2 || readInt > i3) {
            zl1.g("XMSS node height out of bounds");
            return null;
        }
        if (readInt2 < 1 || readInt2 > 64) {
            zl1.g("XMSS node value size out of bounds");
            return null;
        }
        int i5 = rsVar.J;
        if (i5 == 0) {
            rsVar.J = readInt2;
        } else if (i5 != readInt2) {
            zl1.g("inconsistent XMSS node value sizes");
            return null;
        }
        byte[] bArr = new byte[readInt2];
        dataInputStream.readFully(bArr);
        return new o06(readInt, bArr);
    }

    public static final void r(rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-144857243);
        int i3 = (go1Var.i(rm1Var) ? 4 : 2) | i2;
        byte b2 = 1;
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            xh0.a(null, ma4.M, p70.u0(-1531791036, new ko2(l13Var, rm1Var), go1Var), go1Var, 438);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new ko2(rm1Var, l13Var, i2, b2);
        }
    }

    public static fw0[] r0(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, eu5.t)) {
            zy.i("Unsupported version");
            return null;
        }
        int p02 = (int) k21.p0(fileInputStream, 1);
        byte[] o02 = k21.o0(fileInputStream, (int) k21.p0(fileInputStream, 4), (int) k21.p0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            zy.i("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(o02);
        try {
            fw0[] s02 = s0(byteArrayInputStream, str, p02);
            byteArrayInputStream.close();
            return s02;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final void s(l13 l13Var, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(808799328);
        byte b2 = 1;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            xh0.a(null, ma4.M, p70.u0(-1538413249, new wo2(l13Var), go1Var), go1Var, 438);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new wo2(l13Var, i2, b2);
        }
    }

    public static fw0[] s0(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new fw0[0];
        }
        fw0[] fw0VarArr = new fw0[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int p02 = (int) k21.p0(byteArrayInputStream, 2);
            int p03 = (int) k21.p0(byteArrayInputStream, 2);
            fw0VarArr[i4] = new fw0(str, new String(k21.m0(byteArrayInputStream, p02), StandardCharsets.UTF_8), k21.p0(byteArrayInputStream, 4), p03, (int) k21.p0(byteArrayInputStream, 4), (int) k21.p0(byteArrayInputStream, 4), new int[p03], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            fw0 fw0Var = fw0VarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = fw0Var.f;
            int i7 = fw0Var.g;
            TreeMap treeMap = fw0Var.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) k21.p0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int p04 = (int) k21.p0(byteArrayInputStream, 2);
                while (p04 > 0) {
                    k21.p0(byteArrayInputStream, 2);
                    int p05 = (int) k21.p0(byteArrayInputStream, 1);
                    if (p05 != 6 && p05 != 7) {
                        while (p05 > 0) {
                            k21.p0(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int p06 = (int) k21.p0(byteArrayInputStream, 1); p06 > 0; p06--) {
                                k21.p0(byteArrayInputStream, 2);
                            }
                            p05--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    p04--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                zy.i("Read too much data during profile line parse");
                return null;
            }
            fw0Var.h = l0(byteArrayInputStream, fw0Var.e);
            BitSet valueOf = BitSet.valueOf(k21.m0(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return fw0VarArr;
    }

    public static final void t(LiveRoom liveRoom, l13 l13Var, fe0 fe0Var, int i2) {
        int i3;
        boolean z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1612899);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go1Var.g(liveRoom) : go1Var.i(liveRoom) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.g(l13Var) ? 32 : 16;
        }
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            String str = (String) o70.U0(liveRoom.getCover().getUrlList());
            if (str == null) {
                str = "";
            }
            ne1 ne1Var = nq4.c;
            l13 p2 = mw2.p(l13Var.then(ne1Var), hx2.f, mw2.j);
            uw2 c2 = px.c(q8.J, false);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, p2);
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
            if (str.length() > 0) {
                go1Var.d0(-1118400525);
                z2 = true;
                SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str, go1Var), null, ne1Var, null, null, null, li0.b, 0.0f, null, 0, false, go1Var, 1573296, 0, 1976);
                go1Var.q(false);
            } else {
                z2 = true;
                go1Var.d0(-1118169575);
                go1Var.q(false);
            }
            go1Var.q(z2);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new qj((byte) 9, i2, liveRoom, l13Var);
        }
    }

    public static void t0(int[] iArr, int[] iArr2) {
        long j2 = iArr[8] & 4294967295L;
        long j3 = iArr[9] & 4294967295L;
        long j4 = iArr[10] & 4294967295L;
        long j5 = iArr[11] & 4294967295L;
        long j6 = iArr[12] & 4294967295L;
        long j7 = iArr[13] & 4294967295L;
        long j8 = iArr[14] & 4294967295L;
        long j9 = iArr[15] & 4294967295L;
        long j10 = j4 + j5;
        long j11 = j7 + j8;
        long j12 = j11 + (j9 << 1);
        long j13 = j2 + j3 + j11;
        long j14 = j10 + j6 + j9 + j13;
        long j15 = (iArr[0] & 4294967295L) + j14 + j7 + j8 + j9;
        iArr2[0] = (int) j15;
        long j16 = (((iArr[1] & 4294967295L) + j14) - j2) + j8 + j9 + (j15 >> 32);
        iArr2[1] = (int) j16;
        long j17 = ((iArr[2] & 4294967295L) - j13) + (j16 >> 32);
        iArr2[2] = (int) j17;
        long j18 = ((((iArr[3] & 4294967295L) + j14) - j3) - j4) + j7 + (j17 >> 32);
        iArr2[3] = (int) j18;
        long j19 = ((((iArr[4] & 4294967295L) + j14) - j10) - j2) + j8 + (j18 >> 32);
        iArr2[4] = (int) j19;
        long j20 = (iArr[5] & 4294967295L) + j12 + j4 + (j19 >> 32);
        iArr2[5] = (int) j20;
        long j21 = (iArr[6] & 4294967295L) + j5 + j8 + j9 + (j20 >> 32);
        iArr2[6] = (int) j21;
        long j22 = (iArr[7] & 4294967295L) + j14 + j12 + j6 + (j21 >> 32);
        iArr2[7] = (int) j22;
        y0((int) (j22 >> 32), iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u(final hu2 hu2Var, l13 l13Var, int i2, rm1 rm1Var, final boolean z2, fe0 fe0Var, int i3) {
        go1 go1Var;
        l13 l13Var2;
        boolean z3;
        float f2;
        float i4;
        float f3;
        float f4;
        Object obj;
        t43 t43Var;
        t43 t43Var2;
        Object obj2;
        t43 t43Var3;
        Object obj3;
        ne1 ne1Var;
        t43 t43Var4;
        t43 t43Var5;
        ki1 ki1Var;
        dl0 dl0Var;
        t43 t43Var6;
        t43 t43Var7;
        Object obj4;
        Object ep2Var;
        int i5;
        ki1 ki1Var2;
        ExoPlayer exoPlayer;
        dl0 dl0Var2;
        t43 t43Var8;
        t43 t43Var9;
        Object[] objArr;
        jp jpVar;
        t43 t43Var10;
        t43 t43Var11;
        t43 t43Var12;
        hk3 hk3Var;
        String str;
        is0 is0Var;
        is0 is0Var2;
        Object pn2Var;
        ki1 ki1Var3;
        int i6;
        int i7;
        t43 t43Var13;
        t43 t43Var14;
        ExoPlayer exoPlayer2;
        final hk3 hk3Var2;
        dl0 dl0Var3;
        t43 t43Var15;
        t43 t43Var16;
        ki1 ki1Var4;
        int i8;
        is0 is0Var3;
        byte b2;
        Object obj5;
        byte b3;
        Object obj6;
        ki1 ki1Var5;
        t43 t43Var17;
        dl0 dl0Var4;
        dl0 dl0Var5;
        final t43 t43Var18;
        t43 t43Var19;
        t43 t43Var20;
        t43 t43Var21;
        boolean z4;
        wm4 wm4Var = hu2Var.h;
        op2 op2Var = hu2Var.n;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1428866551);
        int i9 = i3 | (go1Var2.i(hu2Var) ? 4 : 2) | 48 | (go1Var2.e(i2) ? 256 : 128) | (go1Var2.h(z2) ? 16384 : 8192);
        if (go1Var2.T(i9 & 1, (i9 & 8339) != 8338)) {
            t43 g2 = wi4.g(op2Var.u, go1Var2);
            t43 g3 = wi4.g(op2Var.v, go1Var2);
            t43 g4 = wi4.g(op2Var.p, go1Var2);
            final t43 g5 = wi4.g(op2Var.l, go1Var2);
            t43 g6 = wi4.g(op2Var.n, go1Var2);
            byte b4 = 2;
            t43 g7 = wi4.g(op2Var.s, go1Var2);
            t43 g8 = wi4.g(op2Var.D, go1Var2);
            final t43 g9 = wi4.g(op2Var.K, go1Var2);
            final t43 g10 = wi4.g(op2Var.P, go1Var2);
            final t43 g11 = wi4.g(op2Var.N, go1Var2);
            final t43 g12 = wi4.g(op2Var.R, go1Var2);
            final t43 g13 = wi4.g(wm4Var.k0, go1Var2);
            final t43 g14 = wi4.g(wm4Var.h, go1Var2);
            final t43 g15 = wi4.g(wm4Var.f, go1Var2);
            final t43 g16 = wi4.g(wm4Var.z0, go1Var2);
            final t43 g17 = wi4.g(wm4Var.n, go1Var2);
            final t43 g18 = wi4.g(wm4Var.p, go1Var2);
            t43 g19 = wi4.g(hu2Var.i.l, go1Var2);
            Object Q2 = go1Var2.Q();
            jp jpVar2 = de0.a;
            Object obj7 = Q2;
            if (Q2 == jpVar2) {
                OkHttpClient okHttpClient = (OkHttpClient) hu2Var.f.m.getValue();
                go1Var2.o0(okHttpClient);
                obj7 = okHttpClient;
            }
            final OkHttpClient okHttpClient2 = (OkHttpClient) obj7;
            Object Q3 = go1Var2.Q();
            Object obj8 = Q3;
            if (Q3 == jpVar2) {
                obj8 = pt1.r(go1Var2);
            }
            ki1 ki1Var6 = (ki1) obj8;
            Object Q4 = go1Var2.Q();
            Object obj9 = Q4;
            if (Q4 == jpVar2) {
                dl0 w2 = mw2.w(go1Var2);
                go1Var2.o0(w2);
                obj9 = w2;
            }
            dl0 dl0Var6 = (dl0) obj9;
            Object Q5 = go1Var2.Q();
            Object obj10 = Q5;
            if (Q5 == jpVar2) {
                jk3 w3 = ad4.w(Boolean.FALSE);
                go1Var2.o0(w3);
                obj10 = w3;
            }
            t43 t43Var22 = (t43) obj10;
            Object Q6 = go1Var2.Q();
            Object obj11 = Q6;
            if (Q6 == jpVar2) {
                jk3 w4 = ad4.w(Boolean.FALSE);
                go1Var2.o0(w4);
                obj11 = w4;
            }
            t43 t43Var23 = (t43) obj11;
            Object Q7 = go1Var2.Q();
            Object obj12 = Q7;
            if (Q7 == jpVar2) {
                jk3 w5 = ad4.w(Boolean.FALSE);
                go1Var2.o0(w5);
                obj12 = w5;
            }
            final t43 t43Var24 = (t43) obj12;
            t43 x2 = ad4.x(Boolean.valueOf(z2), go1Var2);
            bw0 bw0Var = (bw0) go1Var2.k(cw0.a);
            final cj1 cj1Var = (cj1) go1Var2.k(dj1.a);
            final int i10 = ((Configuration) go1Var2.k(rb.a)).screenWidthDp;
            boolean z5 = bp3.f(bw0Var) > 0.0f;
            final boolean M0 = on5.M0(bw0Var);
            if (z5) {
                go1Var2.d0(1248864203);
                z3 = false;
                go1Var2.q(false);
                f2 = 0.0f;
            } else {
                go1Var2.d0(1248864480);
                float j2 = bp3.j(go1Var2);
                z3 = false;
                go1Var2.q(false);
                f2 = j2;
            }
            if (M0) {
                go1Var2.d0(1248866571);
                go1Var2.q(z3);
                i4 = 0.0f;
            } else {
                go1Var2.d0(1248866846);
                i4 = bp3.i(go1Var2);
                go1Var2.q(z3);
            }
            Object Q8 = go1Var2.Q();
            if (Q8 == jpVar2) {
                f3 = i4;
                f4 = 0.0f;
                jk3 w6 = ad4.w(new r11(0.0f));
                go1Var2.o0(w6);
                obj = w6;
            } else {
                f3 = i4;
                f4 = 0.0f;
                obj = Q8;
            }
            final t43 t43Var25 = (t43) obj;
            Object Q9 = go1Var2.Q();
            Object obj13 = Q9;
            if (Q9 == jpVar2) {
                jk3 w7 = ad4.w(new r11(f4));
                go1Var2.o0(w7);
                obj13 = w7;
            }
            final t43 t43Var26 = (t43) obj13;
            Object Q10 = go1Var2.Q();
            Object obj14 = Q10;
            if (Q10 == jpVar2) {
                jk3 w8 = ad4.w(Boolean.FALSE);
                go1Var2.o0(w8);
                obj14 = w8;
            }
            t43 t43Var27 = (t43) obj14;
            LiveRoom liveRoom = (LiveRoom) g5.getValue();
            x70 d2 = p9.d(liveRoom != null ? d0(liveRoom) : null, false, go1Var2, 48);
            t43 g20 = wi4.g(hu2Var.O, go1Var2);
            t43 g21 = wi4.g(hu2Var.I, go1Var2);
            boolean z6 = (cj1Var.a == br3.I || v(g21)) ? false : true;
            t43 g22 = wi4.g(hu2Var.Q, go1Var2);
            t43 g23 = wi4.g(hu2Var.S, go1Var2);
            Object Q11 = go1Var2.Q();
            if (Q11 == jpVar2) {
                t43Var = g21;
                t43Var2 = g22;
                hk3 hk3Var3 = new hk3(0L);
                go1Var2.o0(hk3Var3);
                obj2 = hk3Var3;
            } else {
                t43Var = g21;
                t43Var2 = g22;
                obj2 = Q11;
            }
            final hk3 hk3Var4 = (hk3) obj2;
            LiveRoom liveRoom2 = (LiveRoom) g5.getValue();
            String resolvedRoomId = liveRoom2 != null ? liveRoom2.getResolvedRoomId() : null;
            Object Q12 = go1Var2.Q();
            if (Q12 == jpVar2) {
                t43Var3 = g20;
                xo2 xo2Var = new xo2(t43Var22, t43Var23, null, (byte) 0);
                go1Var2.o0(xo2Var);
                obj3 = xo2Var;
            } else {
                t43Var3 = g20;
                obj3 = Q12;
            }
            mw2.h(go1Var2, (hn1) obj3, resolvedRoomId);
            ne1 ne1Var2 = nq4.c;
            l13 p2 = mw2.p(ne1Var2, hx2.f, mw2.j);
            uw2 c2 = px.c(q8.J, false);
            t43 t43Var28 = g7;
            long j3 = go1Var2.T;
            int i11 = (int) (j3 ^ (j3 >>> 32));
            am3 m2 = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, p2);
            xd0.c.getClass();
            go1Var2.h0();
            t43 t43Var29 = t43Var23;
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, c2);
            qi4.k(go1Var2, q8.b0, m2);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i11));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            byte b5 = 6;
            if (((List) g2.getValue()).isEmpty() && (((Boolean) g3.getValue()).booleanValue() || ((Boolean) g4.getValue()).booleanValue())) {
                go1Var2.d0(1716623648);
                s(ne1Var2, go1Var2, 6);
                go1Var2.q(false);
            } else if (((List) g2.getValue()).isEmpty()) {
                go1Var2.d0(1716759118);
                boolean z7 = (i9 & 14) == 4 || go1Var2.i(hu2Var);
                Object Q13 = go1Var2.Q();
                Object obj15 = Q13;
                if (z7 || Q13 == jpVar2) {
                    ao aoVar = new ao(hu2Var, b5);
                    go1Var2.o0(aoVar);
                    obj15 = aoVar;
                }
                r((rm1) obj15, ne1Var2, go1Var2, 48);
                go1Var2.q(false);
            } else {
                go1Var2.d0(1717730751);
                int r2 = ut0.r(((Number) g6.getValue()).intValue(), 0, p70.X((List) g2.getValue()));
                boolean g24 = go1Var2.g(g2);
                Object Q14 = go1Var2.Q();
                Object obj16 = Q14;
                if (g24 || Q14 == jpVar2) {
                    sf sfVar = new sf(g2, (byte) 12);
                    go1Var2.o0(sfVar);
                    obj16 = sfVar;
                }
                is0 b6 = nj3.b(r2, (rm1) obj16, go1Var2, 0);
                ExoPlayer h2 = ro5.h(okHttpClient2, go1Var2);
                Object Q15 = go1Var2.Q();
                Object obj17 = Q15;
                if (Q15 == jpVar2) {
                    jk3 w9 = ad4.w(Boolean.FALSE);
                    go1Var2.o0(w9);
                    obj17 = w9;
                }
                t43 t43Var30 = (t43) obj17;
                Boolean valueOf = Boolean.valueOf(((Boolean) t43Var29.getValue()).booleanValue());
                boolean i12 = go1Var2.i(dl0Var6) | go1Var2.g(x2) | go1Var2.g(t43Var28) | go1Var2.g(g8);
                Object Q16 = go1Var2.Q();
                if (i12 || Q16 == jpVar2) {
                    ne1Var = ne1Var2;
                    Q16 = new dp2(t43Var29, dl0Var6, x2, t43Var28, g8, ki1Var6, null);
                    t43Var4 = t43Var28;
                    t43Var5 = g8;
                    ki1Var = ki1Var6;
                    t43Var29 = t43Var29;
                    dl0Var = dl0Var6;
                    t43Var6 = x2;
                    go1Var2.o0(Q16);
                } else {
                    t43Var6 = x2;
                    t43Var5 = g8;
                    ne1Var = ne1Var2;
                    ki1Var = ki1Var6;
                    dl0Var = dl0Var6;
                    t43Var4 = t43Var28;
                }
                mw2.h(go1Var2, (hn1) Q16, valueOf);
                boolean e2 = r13.e(go1Var2);
                Object Q17 = go1Var2.Q();
                if (Q17 == jpVar2) {
                    hk3 hk3Var5 = new hk3(System.currentTimeMillis());
                    go1Var2.o0(hk3Var5);
                    Q17 = hk3Var5;
                }
                hk3 hk3Var6 = (hk3) Q17;
                Boolean valueOf2 = Boolean.valueOf(e2);
                int i13 = i9 & 14;
                boolean h3 = (i13 == 4 || go1Var2.i(hu2Var)) | go1Var2.h(e2);
                Object Q18 = go1Var2.Q();
                if (h3 || Q18 == jpVar2) {
                    t43Var7 = g2;
                    pu1 pu1Var = new pu1(e2, hu2Var, null, (byte) 1);
                    go1Var2.o0(pu1Var);
                    obj4 = pu1Var;
                } else {
                    t43Var7 = g2;
                    obj4 = Q18;
                }
                mw2.h(go1Var2, (hn1) obj4, valueOf2);
                Boolean valueOf3 = Boolean.valueOf(e2);
                Boolean bool = (Boolean) g19.getValue();
                bool.getClass();
                Boolean valueOf4 = Boolean.valueOf(((Boolean) t43Var22.getValue()).booleanValue());
                Boolean valueOf5 = Boolean.valueOf(v(t43Var));
                Boolean valueOf6 = Boolean.valueOf(z(t43Var4));
                Boolean valueOf7 = Boolean.valueOf(A(t43Var5));
                Boolean bool2 = (Boolean) t43Var29.getValue();
                bool2.getClass();
                Object[] objArr2 = {valueOf3, bool, valueOf4, valueOf5, valueOf6, valueOf7, bool2};
                t43 t43Var31 = t43Var;
                boolean h4 = (i13 == 4 || go1Var2.i(hu2Var)) | go1Var2.h(e2) | go1Var2.g(t43Var31) | go1Var2.g(g19) | go1Var2.g(t43Var4) | go1Var2.g(t43Var5);
                Object Q19 = go1Var2.Q();
                if (h4 || Q19 == jpVar2) {
                    i5 = i13;
                    ki1Var2 = ki1Var;
                    exoPlayer = h2;
                    dl0Var2 = dl0Var;
                    t43Var8 = t43Var29;
                    t43Var9 = t43Var6;
                    objArr = objArr2;
                    jpVar = jpVar2;
                    t43 t43Var32 = t43Var4;
                    t43Var10 = t43Var22;
                    t43Var11 = t43Var7;
                    ep2Var = new ep2(e2, hu2Var, t43Var31, g19, t43Var10, t43Var32, t43Var5, t43Var8, hk3Var6, null);
                    t43Var12 = t43Var31;
                    hk3Var = hk3Var6;
                    t43Var4 = t43Var32;
                    go1Var2.o0(ep2Var);
                } else {
                    ep2Var = Q19;
                    t43Var12 = t43Var31;
                    i5 = i13;
                    ki1Var2 = ki1Var;
                    t43Var10 = t43Var22;
                    exoPlayer = h2;
                    hk3Var = hk3Var6;
                    t43Var11 = t43Var7;
                    dl0Var2 = dl0Var;
                    t43Var8 = t43Var29;
                    t43Var9 = t43Var6;
                    jpVar = jpVar2;
                    objArr = objArr2;
                }
                mw2.k(objArr, (hn1) ep2Var, go1Var2);
                LiveRoom liveRoom3 = (LiveRoom) g5.getValue();
                String resolvedRoomId2 = liveRoom3 != null ? liveRoom3.getResolvedRoomId() : null;
                List list = (List) t43Var11.getValue();
                Integer valueOf8 = Integer.valueOf(((Number) g6.getValue()).intValue());
                boolean g25 = go1Var2.g(t43Var11) | go1Var2.g(resolvedRoomId2) | go1Var2.g(g6) | go1Var2.g(b6);
                Object Q20 = go1Var2.Q();
                if (g25 || Q20 == jpVar) {
                    String str2 = resolvedRoomId2;
                    Q20 = new n6(str2, b6, t43Var11, g6, null, (byte) 11, false);
                    str = str2;
                    is0Var = b6;
                    go1Var2.o0(Q20);
                } else {
                    str = resolvedRoomId2;
                    is0Var = b6;
                }
                mw2.j(list, str, valueOf8, (hn1) Q20, go1Var2);
                Integer valueOf9 = Integer.valueOf(is0Var.o());
                int i14 = i5;
                dl0 dl0Var7 = dl0Var2;
                t43 t43Var33 = t43Var9;
                boolean g26 = go1Var2.g(is0Var) | go1Var2.g(t43Var11) | (i14 == 4 || go1Var2.i(hu2Var)) | go1Var2.i(dl0Var7) | go1Var2.g(t43Var33) | go1Var2.g(t43Var4) | go1Var2.g(t43Var5);
                Object Q21 = go1Var2.Q();
                if (g26 || Q21 == jpVar) {
                    is0Var2 = is0Var;
                    t43 t43Var34 = t43Var11;
                    t43 t43Var35 = t43Var5;
                    t43 t43Var36 = t43Var8;
                    ki1Var3 = ki1Var2;
                    i6 = i14;
                    i7 = i9;
                    pn2Var = new pn2(is0Var2, hu2Var, t43Var34, hk3Var, t43Var10, dl0Var7, t43Var36, t43Var33, t43Var4, t43Var35, ki1Var3, (fj0) null);
                    t43Var13 = t43Var36;
                    t43Var5 = t43Var35;
                    t43Var11 = t43Var34;
                    t43Var14 = t43Var33;
                    exoPlayer2 = exoPlayer;
                    hk3Var2 = hk3Var;
                    dl0Var3 = dl0Var7;
                    go1Var2.o0(pn2Var);
                } else {
                    is0Var2 = is0Var;
                    i6 = i14;
                    t43Var14 = t43Var33;
                    pn2Var = Q21;
                    i7 = i9;
                    ki1Var3 = ki1Var2;
                    t43Var13 = t43Var8;
                    exoPlayer2 = exoPlayer;
                    hk3Var2 = hk3Var;
                    dl0Var3 = dl0Var7;
                }
                mw2.h(go1Var2, (hn1) pn2Var, valueOf9);
                Boolean bool3 = (Boolean) t43Var3.getValue();
                bool3.getClass();
                t43 t43Var37 = t43Var3;
                boolean g27 = go1Var2.g(t43Var37);
                Object Q22 = go1Var2.Q();
                Object obj18 = Q22;
                if (g27 || Q22 == jpVar) {
                    xo2 xo2Var2 = new xo2(t43Var37, t43Var10, null, b4);
                    go1Var2.o0(xo2Var2);
                    obj18 = xo2Var2;
                }
                mw2.h(go1Var2, (hn1) obj18, bool3);
                Integer valueOf10 = Integer.valueOf(((Number) t43Var2.getValue()).intValue());
                t43 t43Var38 = t43Var2;
                boolean g28 = go1Var2.g(t43Var38);
                Object Q23 = go1Var2.Q();
                Object obj19 = Q23;
                if (g28 || Q23 == jpVar) {
                    xo2 xo2Var3 = new xo2(t43Var38, t43Var10, null, (byte) 3);
                    go1Var2.o0(xo2Var3);
                    obj19 = xo2Var3;
                }
                mw2.h(go1Var2, (hn1) obj19, valueOf10);
                Boolean bool4 = (Boolean) g23.getValue();
                bool4.getClass();
                int i15 = i6;
                boolean g29 = go1Var2.g(g23) | go1Var2.g(is0Var2) | (i15 == 4 || go1Var2.i(hu2Var));
                Object Q24 = go1Var2.Q();
                if (g29 || Q24 == jpVar) {
                    t43 t43Var39 = t43Var10;
                    t43Var15 = t43Var13;
                    t43Var16 = t43Var14;
                    ki1Var4 = ki1Var3;
                    i8 = i15;
                    fp2 fp2Var = new fp2(is0Var2, hu2Var, g23, t43Var39, null, (byte) 0);
                    t43Var10 = t43Var39;
                    go1Var2.o0(fp2Var);
                    Q24 = fp2Var;
                } else {
                    t43Var15 = t43Var13;
                    t43Var16 = t43Var14;
                    ki1Var4 = ki1Var3;
                    i8 = i15;
                }
                mw2.h(go1Var2, (hn1) Q24, bool4);
                LiveRoom liveRoom4 = (LiveRoom) g5.getValue();
                String resolvedRoomId3 = liveRoom4 != null ? liveRoom4.getResolvedRoomId() : null;
                Boolean bool5 = (Boolean) t43Var10.getValue();
                bool5.getClass();
                boolean g30 = go1Var2.g(g5);
                Object Q25 = go1Var2.Q();
                if (g30 || Q25 == jpVar) {
                    is0Var3 = is0Var2;
                    b2 = 1;
                    xo2 xo2Var4 = new xo2(g5, t43Var10, null, b2);
                    go1Var2.o0(xo2Var4);
                    obj5 = xo2Var4;
                } else {
                    is0Var3 = is0Var2;
                    b2 = 1;
                    obj5 = Q25;
                }
                mw2.i(resolvedRoomId3, bool5, (hn1) obj5, go1Var2);
                byte b7 = (i8 == 4 || go1Var2.i(hu2Var)) ? b2 : (byte) 0;
                Object Q26 = go1Var2.Q();
                if (b7 != 0 || Q26 == jpVar) {
                    b3 = 4;
                    go goVar = new go(hu2Var, null, b3);
                    go1Var2.o0(goVar);
                    obj6 = goVar;
                } else {
                    b3 = 4;
                    obj6 = Q26;
                }
                wd5 wd5Var = wd5.a;
                mw2.h(go1Var2, (hn1) obj6, wd5Var);
                byte b8 = (i8 == b3 || go1Var2.i(hu2Var)) ? b2 : (byte) 0;
                Object Q27 = go1Var2.Q();
                Object obj20 = Q27;
                if (b8 != 0 || Q27 == jpVar) {
                    bo boVar = new bo(hu2Var, (byte) 4);
                    go1Var2.o0(boVar);
                    obj20 = boVar;
                }
                mw2.e(wd5Var, (tm1) obj20, go1Var2);
                Boolean valueOf11 = Boolean.valueOf((((List) t43Var11.getValue()).isEmpty() ? 1 : 0) ^ b2);
                boolean g31 = go1Var2.g(t43Var11) | go1Var2.i(dl0Var3);
                Object Q28 = go1Var2.Q();
                if (g31 || Q28 == jpVar) {
                    ki1Var5 = ki1Var4;
                    Q28 = new hk0(dl0Var3, t43Var11, t43Var30, ki1Var5, null, (byte) 2);
                    go1Var2.o0(Q28);
                } else {
                    ki1Var5 = ki1Var4;
                }
                mw2.h(go1Var2, (hn1) Q28, valueOf11);
                Integer valueOf12 = Integer.valueOf(i2);
                Boolean bool6 = (Boolean) t43Var4.getValue();
                bool6.getClass();
                Integer valueOf13 = Integer.valueOf(((List) t43Var11.getValue()).size());
                boolean g32 = ((i7 & 896) == 256) | go1Var2.g(t43Var4) | go1Var2.g(t43Var11) | go1Var2.i(dl0Var3) | go1Var2.g(t43Var16) | go1Var2.g(t43Var5);
                Object Q29 = go1Var2.Q();
                if (g32 || Q29 == jpVar) {
                    t43Var17 = t43Var15;
                    dl0 dl0Var8 = dl0Var3;
                    Q29 = new yo2(i2, t43Var4, t43Var11, dl0Var8, t43Var17, t43Var16, t43Var5, ki1Var5, null);
                    dl0Var4 = dl0Var8;
                    go1Var2.o0(Q29);
                } else {
                    t43Var17 = t43Var15;
                    dl0Var4 = dl0Var3;
                }
                mw2.j(valueOf12, bool6, valueOf13, (hn1) Q29, go1Var2);
                Boolean bool7 = (Boolean) t43Var4.getValue();
                bool7.getClass();
                Boolean bool8 = (Boolean) t43Var5.getValue();
                bool8.getClass();
                Integer valueOf14 = Integer.valueOf(((List) t43Var11.getValue()).size());
                boolean g33 = go1Var2.g(t43Var4) | go1Var2.g(t43Var5) | go1Var2.g(t43Var11) | go1Var2.i(dl0Var4) | go1Var2.g(t43Var16);
                Object Q30 = go1Var2.Q();
                if (g33 || Q30 == jpVar) {
                    dl0Var5 = dl0Var4;
                    Q30 = new zo2(t43Var4, t43Var5, t43Var11, dl0Var5, t43Var17, t43Var16, ki1Var5, null);
                    go1Var2.o0(Q30);
                } else {
                    dl0Var5 = dl0Var4;
                }
                mw2.j(bool7, bool8, valueOf14, (hn1) Q30, go1Var2);
                boolean z8 = (((Boolean) t43Var4.getValue()).booleanValue() || ((Boolean) t43Var24.getValue()).booleanValue()) ? false : true;
                boolean g34 = go1Var2.g(t43Var11);
                Object Q31 = go1Var2.Q();
                Object obj21 = Q31;
                if (g34 || Q31 == jpVar) {
                    uf ufVar = new uf(t43Var11, (byte) 25);
                    go1Var2.o0(ufVar);
                    obj21 = ufVar;
                }
                tm1 tm1Var = (tm1) obj21;
                final is0 is0Var4 = is0Var3;
                g5 = g5;
                final t43 t43Var40 = t43Var4;
                final ki1 ki1Var7 = ki1Var5;
                final t43 t43Var41 = t43Var11;
                final dl0 dl0Var9 = dl0Var5;
                final t43 t43Var42 = t43Var17;
                final ExoPlayer exoPlayer3 = exoPlayer2;
                final boolean z9 = z5;
                t43Var18 = t43Var27;
                final t43 t43Var43 = t43Var12;
                final t43 t43Var44 = t43Var10;
                final t43 t43Var45 = t43Var5;
                final float f5 = f2;
                final float f6 = f3;
                final boolean z10 = z6;
                jn1 jn1Var = new jn1() { // from class: ro2
                    /* JADX WARN: Removed duplicated region for block: B:145:0x0549  */
                    /* JADX WARN: Removed duplicated region for block: B:156:0x059d  */
                    /* JADX WARN: Removed duplicated region for block: B:159:0x05ad  */
                    /* JADX WARN: Removed duplicated region for block: B:166:0x05d7  */
                    /* JADX WARN: Removed duplicated region for block: B:172:0x0639  */
                    /* JADX WARN: Removed duplicated region for block: B:179:0x068f  */
                    /* JADX WARN: Removed duplicated region for block: B:186:0x06ea  */
                    /* JADX WARN: Removed duplicated region for block: B:193:0x0734  */
                    /* JADX WARN: Removed duplicated region for block: B:199:0x078d  */
                    /* JADX WARN: Removed duplicated region for block: B:205:0x07b0  */
                    /* JADX WARN: Removed duplicated region for block: B:211:0x07cf A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:215:0x07f7 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:218:0x0809  */
                    /* JADX WARN: Removed duplicated region for block: B:221:0x0826  */
                    /* JADX WARN: Removed duplicated region for block: B:224:0x0848 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:227:0x085b  */
                    /* JADX WARN: Removed duplicated region for block: B:230:0x08aa  */
                    /* JADX WARN: Removed duplicated region for block: B:239:0x086b  */
                    /* JADX WARN: Removed duplicated region for block: B:241:0x0835  */
                    /* JADX WARN: Removed duplicated region for block: B:242:0x081a  */
                    /* JADX WARN: Removed duplicated region for block: B:248:0x0761  */
                    /* JADX WARN: Removed duplicated region for block: B:250:0x0717  */
                    /* JADX WARN: Removed duplicated region for block: B:252:0x06c7  */
                    /* JADX WARN: Removed duplicated region for block: B:254:0x066d  */
                    /* JADX WARN: Removed duplicated region for block: B:255:0x05ca  */
                    /* JADX WARN: Removed duplicated region for block: B:256:0x05a2  */
                    @Override // defpackage.jn1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object c(java.lang.Object r64, java.lang.Object r65, java.lang.Object r66, java.lang.Object r67) {
                        /*
                            Method dump skipped, instructions count: 2639
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro2.c(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                t43Var19 = g13;
                t43Var20 = t43Var45;
                t43Var28 = t43Var40;
                t43Var21 = t43Var25;
                z4 = M0;
                go1Var = go1Var2;
                mu0.f(is0Var4, ne1Var, null, null, null, null, z8, tm1Var, null, null, null, p70.u0(-1053366273, jn1Var, go1Var2), go1Var, 48);
                go1Var.q(false);
                bp3.b(z(t43Var28), ne1Var, p70.u0(-97580019, new so2((Object) hu2Var, (Object) d2, (Object) t43Var19, (Object) t43Var21, (byte) 0), go1Var), go1Var, 432, 0);
                bp3.b(A(t43Var20), ne1Var, p70.u0(1185751748, new to2(d2, hu2Var, g5, z4, t43Var18, t43Var26), go1Var), go1Var, 432, 0);
                go1Var.q(true);
                l13Var2 = i13.a;
            }
            t43Var20 = g8;
            ne1Var = ne1Var2;
            go1Var = go1Var2;
            t43Var19 = g13;
            z4 = M0;
            t43Var21 = t43Var25;
            t43Var18 = t43Var27;
            bp3.b(z(t43Var28), ne1Var, p70.u0(-97580019, new so2((Object) hu2Var, (Object) d2, (Object) t43Var19, (Object) t43Var21, (byte) 0), go1Var), go1Var, 432, 0);
            bp3.b(A(t43Var20), ne1Var, p70.u0(1185751748, new to2(d2, hu2Var, g5, z4, t43Var18, t43Var26), go1Var), go1Var, 432, 0);
            go1Var.q(true);
            l13Var2 = i13.a;
        } else {
            go1Var = go1Var2;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new uo2(hu2Var, l13Var2, i2, rm1Var, z2, i3);
        }
    }

    public static void u0(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        long j10 = jArr[8];
        long j11 = j6 ^ ((((j10 >>> 27) ^ (j10 >>> 22)) ^ (j10 >>> 20)) ^ (j10 >>> 15));
        long j12 = j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49));
        long j13 = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        long j14 = j11 >>> 27;
        jArr2[0] = (((j12 ^ j14) ^ (j14 << 5)) ^ (j14 << 7)) ^ (j14 << 12);
        jArr2[1] = j13;
        jArr2[2] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[3] = (j5 ^ ((((j10 << 37) ^ (j10 << 42)) ^ (j10 << 44)) ^ (j10 << 49))) ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        jArr2[4] = 134217727 & j11;
    }

    public static final boolean v(t43 t43Var) {
        return ((Boolean) t43Var.getValue()).booleanValue();
    }

    public static void v0(int[] iArr, int[] iArr2) {
        long j2 = iArr[5] & 4294967295L;
        long j3 = iArr[6] & 4294967295L;
        long j4 = iArr[7] & 4294967295L;
        long j5 = iArr[8] & 4294967295L;
        long j6 = iArr[9] & 4294967295L;
        long j7 = (iArr[0] & 4294967295L) + j2 + (j2 << 31);
        iArr2[0] = (int) j7;
        long j8 = (iArr[1] & 4294967295L) + j3 + (j3 << 31) + (j7 >>> 32);
        iArr2[1] = (int) j8;
        long j9 = (iArr[2] & 4294967295L) + j4 + (j4 << 31) + (j8 >>> 32);
        iArr2[2] = (int) j9;
        long j10 = (iArr[3] & 4294967295L) + j5 + (j5 << 31) + (j9 >>> 32);
        iArr2[3] = (int) j10;
        long j11 = (4294967295L & iArr[4]) + j6 + (j6 << 31) + (j10 >>> 32);
        iArr2[4] = (int) j11;
        z0((int) (j11 >>> 32), iArr2);
    }

    public static final void w(dl0 dl0Var, hk3 hk3Var, t43 t43Var, is0 is0Var, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - hk3Var.h() >= 300 && i2 >= 0 && i2 < ((List) t43Var.getValue()).size()) {
            hk3Var.i(currentTimeMillis);
            p70.g0(dl0Var, null, null, new gp2(is0Var, i2, null, (byte) 0), 3);
        }
    }

    public static void w0(int[] iArr, int[] iArr2) {
        long j2 = iArr[7] & 4294967295L;
        long j3 = (6803 * j2) + (iArr[0] & 4294967295L);
        int i2 = (int) j3;
        iArr2[0] = i2;
        long j4 = iArr[8] & 4294967295L;
        long j5 = (6803 * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i3 = (int) j5;
        iArr2[1] = i3;
        long j6 = iArr[9] & 4294967295L;
        long j7 = (6803 * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i4 = (int) j7;
        iArr2[2] = i4;
        long j8 = iArr[10] & 4294967295L;
        long j9 = (6803 * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i5 = (int) j9;
        iArr2[3] = i5;
        long j10 = iArr[11] & 4294967295L;
        long j11 = (6803 * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = iArr[12] & 4294967295L;
        long j13 = (6803 * j12) + j10 + (iArr[5] & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = iArr[13] & 4294967295L;
        long j15 = (6803 * j14) + j12 + (iArr[6] & 4294967295L) + (j13 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = (j15 >>> 32) + j14;
        long j17 = j16 & 4294967295L;
        long j18 = (6803 * j17) + (i2 & 4294967295L);
        iArr2[0] = (int) j18;
        long j19 = j16 >>> 32;
        long j20 = (6803 * j19) + j17 + (i3 & 4294967295L) + (j18 >>> 32);
        iArr2[1] = (int) j20;
        long j21 = j19 + (i4 & 4294967295L) + (j20 >>> 32);
        iArr2[2] = (int) j21;
        long j22 = (j21 >>> 32) + (i5 & 4294967295L);
        iArr2[3] = (int) j22;
        if (((j22 >>> 32) == 0 ? 0 : dq2.Z(7, 4, iArr2)) != 0 || (iArr2[6] == -1 && il2.J(iArr2, z))) {
            dq2.c(7, 6803, iArr2);
        }
    }

    public static final void x(hu2 hu2Var, hk3 hk3Var) {
        hk3Var.i(System.currentTimeMillis());
        hu2Var.i.q(true);
    }

    public static void x0(int[] iArr, int[] iArr2) {
        long j2 = iArr[16] & 4294967295L;
        long j3 = iArr[17] & 4294967295L;
        long j4 = iArr[18] & 4294967295L;
        long j5 = iArr[19] & 4294967295L;
        long j6 = iArr[20] & 4294967295L;
        long j7 = iArr[21] & 4294967295L;
        long j8 = iArr[22] & 4294967295L;
        long j9 = iArr[23] & 4294967295L;
        long j10 = ((iArr[12] & 4294967295L) + j6) - 1;
        long j11 = (iArr[13] & 4294967295L) + j8;
        long j12 = (iArr[14] & 4294967295L) + j8 + j9;
        long j13 = (iArr[15] & 4294967295L) + j9;
        long j14 = j3 + j7;
        long j15 = j7 - j9;
        long j16 = j8 - j9;
        long j17 = j10 + j15;
        long j18 = (iArr[0] & 4294967295L) + j17;
        iArr2[0] = (int) j18;
        long j19 = (((iArr[1] & 4294967295L) + j9) - j10) + j11 + (j18 >> 32);
        iArr2[1] = (int) j19;
        long j20 = (((iArr[2] & 4294967295L) - j7) - j11) + j12 + (j19 >> 32);
        iArr2[2] = (int) j20;
        long j21 = ((iArr[3] & 4294967295L) - j12) + j13 + j17 + (j20 >> 32);
        iArr2[3] = (int) j21;
        long j22 = (((((iArr[4] & 4294967295L) + j2) + j7) + j11) - j13) + j17 + (j21 >> 32);
        iArr2[4] = (int) j22;
        long j23 = ((iArr[5] & 4294967295L) - j2) + j11 + j12 + j14 + (j22 >> 32);
        iArr2[5] = (int) j23;
        long j24 = (((iArr[6] & 4294967295L) + j4) - j3) + j12 + j13 + (j23 >> 32);
        iArr2[6] = (int) j24;
        long j25 = ((((iArr[7] & 4294967295L) + j2) + j5) - j4) + j13 + (j24 >> 32);
        iArr2[7] = (int) j25;
        long j26 = (((((iArr[8] & 4294967295L) + j2) + j3) + j6) - j5) + (j25 >> 32);
        iArr2[8] = (int) j26;
        long j27 = (((iArr[9] & 4294967295L) + j4) - j6) + j14 + (j26 >> 32);
        iArr2[9] = (int) j27;
        long j28 = ((((iArr[10] & 4294967295L) + j4) + j5) - j15) + j16 + (j27 >> 32);
        iArr2[10] = (int) j28;
        long j29 = ((((iArr[11] & 4294967295L) + j5) + j6) - j16) + (j28 >> 32);
        iArr2[11] = (int) j29;
        B0((int) ((j29 >> 32) + 1), iArr2);
    }

    public static final void y(dl0 dl0Var, t43 t43Var, t43 t43Var2, cw4 cw4Var, cw4 cw4Var2, ki1 ki1Var) {
        p70.g0(dl0Var, null, null, new tg0(t43Var, t43Var2, cw4Var, cw4Var2, ki1Var, null, (byte) 1), 3);
    }

    public static void y0(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = i2 & 4294967295L;
            long j4 = (iArr[0] & 4294967295L) + j3;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = ((iArr[2] & 4294967295L) - j3) + j5;
            iArr[2] = (int) j7;
            long j8 = (iArr[3] & 4294967295L) + j3 + (j7 >> 32);
            iArr[3] = (int) j8;
            long j9 = j8 >> 32;
            if (j9 != 0) {
                long j10 = j9 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j10;
                long j11 = (j10 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j11;
                long j12 = (j11 >> 32) + (iArr[6] & 4294967295L);
                iArr[6] = (int) j12;
                j9 = j12 >> 32;
            }
            long j13 = (4294967295L & iArr[7]) + j3 + j9;
            iArr[7] = (int) j13;
            j2 = j13 >> 32;
        } else {
            j2 = 0;
        }
        if (j2 != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && jl2.K(iArr, u))) {
            F(iArr);
        }
    }

    public static final boolean z(cw4 cw4Var) {
        return ((Boolean) cw4Var.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (((r1 >>> 32) != 0 ? defpackage.dq2.Z(5, 2, r10) : 0) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void z0(int r9, int[] r10) {
        /*
            r0 = 5
            if (r9 == 0) goto L34
            long r1 = (long) r9
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 2147483649(0x80000001, double:1.060997896E-314)
            long r1 = r1 * r5
            r9 = 0
            r5 = r10[r9]
            long r5 = (long) r5
            long r5 = r5 & r3
            long r1 = r1 + r5
            int r5 = (int) r1
            r10[r9] = r5
            r5 = 32
            long r1 = r1 >>> r5
            r6 = 1
            r7 = r10[r6]
            long r7 = (long) r7
            long r3 = r3 & r7
            long r1 = r1 + r3
            int r3 = (int) r1
            r10[r6] = r3
            long r1 = r1 >>> r5
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2d
            goto L32
        L2d:
            r9 = 2
            int r9 = defpackage.dq2.Z(r0, r9, r10)
        L32:
            if (r9 != 0) goto L42
        L34:
            r9 = 4
            r9 = r10[r9]
            r1 = -1
            if (r9 != r1) goto L48
            int[] r9 = defpackage.qg5.w
            boolean r9 = defpackage.dq2.V(r10, r9)
            if (r9 == 0) goto L48
        L42:
            r9 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            defpackage.dq2.i(r0, r9, r10)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg5.z0(int, int[]):void");
    }
}
