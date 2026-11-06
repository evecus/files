package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.ColorMatrixColorFilter;
import androidx.media3.exoplayer.RendererCapabilities;
import com.github.mytv.dv.model.Aweme;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class p9 {
    public static final f80 a;

    static {
        float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 1.2361f;
        fArr[1] = -0.21449997f;
        fArr[2] = -0.021599995f;
        fArr[5] = -0.06389999f;
        fArr[6] = 1.0855f;
        fArr[7] = -0.021599995f;
        fArr[10] = -0.06389999f;
        fArr[11] = -0.21449997f;
        fArr[12] = 1.2784f;
        f80 f80Var = new f80(new ColorMatrixColorFilter(fArr));
        f80Var.b = fArr;
        a = f80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r25, final defpackage.hv4 r26, defpackage.l13 r27, boolean r28, defpackage.fe0 r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p9.a(java.lang.String, hv4, l13, boolean, fe0, int, int):void");
    }

    public static final void b(y31 y31Var, tw1 tw1Var, float f, wy wyVar, long j) {
        r7.m(y31Var, hx2.f, 0L, 0L, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
        if (tw1Var == null || f <= 0.0f) {
            return;
        }
        r7.h(y31Var, tw1Var, 0L, 0L, 0L, (((int) Math.ceil(Float.intBitsToFloat((int) (y31Var.c() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (y31Var.c() & 4294967295L)))) & 4294967295L), f, a, 1, 334);
        if (Float.intBitsToFloat((int) (y31Var.c() >> 32)) > Float.intBitsToFloat((int) (y31Var.c() & 4294967295L))) {
            r7.l(y31Var, wyVar, 0L, 0L, f, null, null, 118);
        } else {
            r7.m(y31Var, j, 0L, 0L, f, 118);
        }
    }

    public static final void c(final String str, final boolean z, ma4 ma4Var, fe0 fe0Var, final int i, final int i2) {
        final ma4 ma4Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1189012434);
        int i3 = (go1Var.g(str) ? 4 : 2) | i | (go1Var.h(z) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.e(ma4Var == null ? -1 : ma4Var.ordinal()) ? 256 : 128;
        }
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            ma4 ma4Var3 = i4 != 0 ? ma4.K : ma4Var;
            Context context = (Context) go1Var.k(rb.b);
            r80 r80Var = (r80) go1Var.k(xh0.c);
            Object[] objArr = {str, Boolean.valueOf(z), ma4Var3, Boolean.valueOf(r80Var.d), r80Var.a, r80Var.b, r80Var.c};
            boolean i5 = ((i3 & 112) == 32) | ((i3 & 14) == 4) | go1Var.i(context) | go1Var.g(r80Var) | ((i3 & 896) == 256);
            Object Q = go1Var.Q();
            if (i5 || Q == de0.a) {
                n9 n9Var = new n9(z, str, context, r80Var, ma4Var3, null);
                go1Var.o0(n9Var);
                Q = n9Var;
            }
            mw2.k(objArr, (hn1) Q, go1Var);
            ma4Var2 = ma4Var3;
        } else {
            go1Var.W();
            ma4Var2 = ma4Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: h9
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p9.c(str, z, ma4Var2, (fe0) obj, mu0.X(i | 1), i2);
                    return wd5.a;
                }
            };
        }
    }

    public static final x70 d(String str, boolean z, fe0 fe0Var, int i) {
        int i2;
        String str2;
        go1 go1Var = (go1) fe0Var;
        Context context = (Context) go1Var.k(rb.b);
        boolean z2 = ((r80) go1Var.k(xh0.c)).a == t80.K;
        int i3 = (i & 14) ^ 6;
        boolean z3 = (i3 > 4 && go1Var.g(str)) || (i & 6) == 4;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (z3 || Q == jpVar) {
            if (str != null) {
                ri0 ri0Var = ri0.a;
                Integer a2 = ri0.a(str);
                if (a2 != null) {
                    i2 = a2.intValue();
                    Q = new gk3(i2);
                    go1Var.o0(Q);
                }
            }
            i2 = qu4.c;
            Q = new gk3(i2);
            go1Var.o0(Q);
        }
        s33 s33Var = (s33) Q;
        Boolean valueOf = Boolean.valueOf(z2);
        boolean h = ((i3 > 4 && go1Var.g(str)) || (i & 6) == 4) | go1Var.h(z2) | go1Var.g(s33Var) | go1Var.i(context);
        Object Q2 = go1Var.Q();
        if (h || Q2 == jpVar) {
            str2 = str;
            Q2 = new o9(z2, str2, context, s33Var, null);
            go1Var.o0(Q2);
        } else {
            str2 = str;
        }
        mw2.i(str2, valueOf, (hn1) Q2, go1Var);
        boolean g = go1Var.g(s33Var) | ((((i & 112) ^ 48) > 32 && go1Var.h(z)) || (i & 48) == 32);
        Object Q3 = go1Var.Q();
        if (g || Q3 == jpVar) {
            Q3 = new g9(z, s33Var);
            go1Var.o0(Q3);
        }
        mw2.L(go1Var, (rm1) Q3);
        gk3 gk3Var = (gk3) s33Var;
        if (gk3Var.h() == 0) {
            return null;
        }
        return new x70(qb.i(gk3Var.h()));
    }

    public static final hv4 e(int i, int i2, uu4 uu4Var, boolean z, fe0 fe0Var, int i3) {
        uu4 uu4Var2;
        float f;
        float f2;
        if ((i3 & 4) != 0) {
            uu4.Companion.getClass();
            uu4Var2 = uu4.d;
        } else {
            uu4Var2 = uu4Var;
        }
        boolean z2 = (i3 & 8) != 0 ? false : z;
        go1 go1Var = (go1) fe0Var;
        bw0 bw0Var = (bw0) go1Var.k(cw0.a);
        iu0 iu0Var = (iu0) go1Var.k(hf0.h);
        Configuration configuration = (Configuration) go1Var.k(rb.a);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            hv4 hv4Var = new hv4((iu0Var.X(configuration.screenHeightDp) & 4294967295L) | (iu0Var.X(configuration.screenWidthDp) << 32));
            go1Var.o0(hv4Var);
            Q = hv4Var;
        }
        hv4 hv4Var2 = (hv4) Q;
        long j = ((z22) hv4Var2.a.getValue()).a;
        boolean f3 = go1Var.f(j) | go1Var.e(i) | go1Var.e(i2) | go1Var.g(bw0Var) | go1Var.h(z2) | go1Var.g(iu0Var);
        Object Q2 = go1Var.Q();
        if (f3 || Q2 == jpVar) {
            float F = iu0Var.F((int) (j >> 32));
            float F2 = iu0Var.F((int) (j & 4294967295L));
            bw0Var.getClass();
            float f4 = (i <= 0 || i2 <= 0) ? 0.0f : i / i2;
            boolean z3 = r11.b(F, 0.0f) > 0 && r11.b(F2, 0.0f) > 0;
            if (f4 <= 0.0f || !z3) {
                f = F;
                f2 = F2;
            } else if (f4 >= F / F2) {
                f = F;
                f2 = F / f4;
            } else {
                f2 = F2;
                f = F2 * f4;
            }
            ou4 ou4Var = bw0Var.c == aw0.I ? ou4.Tv : bw0Var.a.compareTo(ww5.L) < 0 ? ou4.Compact : ou4.Tablet;
            r11 r11Var = new r11((F - f) / 2.0f);
            r11 r11Var2 = new r11(0.0f);
            if (r11Var.compareTo(r11Var2) < 0) {
                r11Var = r11Var2;
            }
            float f5 = (r11Var.I - ou4Var.I) - 24.0f;
            su4 su4Var = !z2 && z3 && r11.b(F, F2) > 0 && f4 > 0.0f && f4 < 1.0f && r11.b(f5, 160.0f) >= 0 ? su4.J : su4.I;
            r11 r11Var3 = new r11(ou4Var.K);
            r11 r11Var4 = new r11(f5);
            r11 r11Var5 = new r11(0.0f);
            if (r11Var4.compareTo(r11Var5) < 0) {
                r11Var4 = r11Var5;
            }
            float f6 = ((r11) j42.P(r11Var3, r11Var4)).I;
            r11 r11Var6 = new r11(ou4Var.L);
            r11 r11Var7 = new r11(f5);
            r11 r11Var8 = new r11(0.0f);
            if (r11Var7.compareTo(r11Var8) < 0) {
                r11Var7 = r11Var8;
            }
            Q2 = new ru4(su4Var, ou4Var, F, F2, f, f2, f4, f6, ((r11) j42.P(r11Var6, r11Var7)).I);
            go1Var.o0(Q2);
        }
        ru4 ru4Var = (ru4) Q2;
        ru4Var.getClass();
        hv4Var2.f = ru4Var;
        float f7 = ru4Var.b() ? (uu4Var2.a - uu4Var2.b) / 2.0f : 0.0f;
        i51 i51Var = lw2.b;
        cw4 a2 = eh.a(f7, ((fw2) go1Var.k(i51Var)).d.f(), "stageYield", go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
        a2.getClass();
        hv4Var2.d = a2;
        r11 r11Var9 = new r11(uu4Var2.c);
        r11 r11Var10 = new r11(0.0f);
        if (r11Var9.compareTo(r11Var10) < 0) {
            r11Var9 = r11Var10;
        }
        cw4 a3 = eh.a(r11Var9.I, ((fw2) go1Var.k(i51Var)).d.f(), "stageSheetYield", go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
        a3.getClass();
        hv4Var2.e = a3;
        boolean g = go1Var.g(ru4Var);
        Object Q3 = go1Var.Q();
        if (g || Q3 == jpVar) {
            Q3 = new k9(hv4Var2, ru4Var, (byte) 0);
            go1Var.o0(Q3);
        }
        mw2.L(go1Var, (rm1) Q3);
        return hv4Var2;
    }

    public static final String f(Aweme aweme) {
        String str = (String) o70.U0(aweme.getVideo().getOriginCover().getUrlList());
        return str == null ? (String) o70.U0(aweme.getVideo().getCover().getUrlList()) : str;
    }

    public static final l13 g(hv4 hv4Var) {
        return new iv4(hv4Var);
    }

    public static final v22 h(int i, int i2, float f, int i3, int i4) {
        int i5;
        int i6;
        if (i4 < 0) {
            i4 = 0;
        }
        int i7 = i2 - i4;
        if (i2 < 1) {
            i2 = 1;
        }
        int r = ut0.r(i7, 1, i2);
        if (f <= 0.0f || i <= 0 || r <= 0) {
            i5 = i;
        } else {
            float f2 = i;
            float f3 = r;
            if (f >= f2 / f3) {
                i6 = ut0.r(mw2.P(f2 / f), 1, r);
                i5 = i;
                long j = (i5 << 32) | (i6 & 4294967295L);
                int i8 = (int) (j >> 32);
                int i9 = ((i - i8) / 2) + i3;
                int i10 = (int) (j & 4294967295L);
                int i11 = (r - i10) / 2;
                return new v22(i9, i11, i8 + i9, i10 + i11);
            }
            i5 = ut0.r(mw2.P(f3 * f), 1, i);
        }
        i6 = r;
        long j2 = (i5 << 32) | (i6 & 4294967295L);
        int i82 = (int) (j2 >> 32);
        int i92 = ((i - i82) / 2) + i3;
        int i102 = (int) (j2 & 4294967295L);
        int i112 = (r - i102) / 2;
        return new v22(i92, i112, i82 + i92, i102 + i112);
    }

    public static final long i(int i, int i2, uj3 uj3Var) {
        int intValue = uj3Var != null ? ((Number) uj3Var.I).intValue() : 0;
        int intValue2 = uj3Var != null ? ((Number) uj3Var.J).intValue() : 0;
        boolean z = intValue > 0 && intValue2 > 0;
        if (i <= 0 || i2 <= 0) {
            if (z) {
                return (intValue << 32) | (intValue2 & 4294967295L);
            }
            return 0L;
        }
        if (z) {
            if ((intValue > intValue2) != (i > i2)) {
                return (intValue << 32) | (intValue2 & 4294967295L);
            }
        }
        return (i2 & 4294967295L) | (i << 32);
    }
}
