package defpackage;

import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fr4 {
    public static final fr4 a = new fr4();
    public static final float b;
    public static final float c;
    public static final yd d;

    static {
        float f = qg5.T;
        b = f;
        c = f;
        d = ae.a();
    }

    public static yq4 e(fe0 fe0Var) {
        k80 k80Var = ((fw2) ((go1) fe0Var).k(lw2.b)).a;
        yq4 yq4Var = k80Var.X;
        if (yq4Var != null) {
            return yq4Var;
        }
        long d2 = q80.d(k80Var, qg5.N);
        l80 l80Var = qg5.G;
        long d3 = q80.d(k80Var, l80Var);
        l80 l80Var2 = qg5.R;
        long d4 = q80.d(k80Var, l80Var2);
        long d5 = q80.d(k80Var, l80Var2);
        long d6 = q80.d(k80Var, l80Var);
        long A = qb.A(x70.c(q80.d(k80Var, qg5.J), qg5.K), k80Var.p);
        l80 l80Var3 = qg5.H;
        long d7 = q80.d(k80Var, l80Var3);
        float f = qg5.I;
        long c2 = x70.c(d7, f);
        l80 l80Var4 = qg5.L;
        long d8 = q80.d(k80Var, l80Var4);
        float f2 = qg5.M;
        yq4 yq4Var2 = new yq4(d2, d3, d4, d5, d6, A, c2, x70.c(d8, f2), x70.c(q80.d(k80Var, l80Var4), f2), x70.c(q80.d(k80Var, l80Var3), f));
        k80Var.X = yq4Var2;
        return yq4Var2;
    }

    public static void f(y31 y31Var, pg3 pg3Var, long j, long j2, long j3, float f, float f2) {
        h74 h74Var;
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        if (pg3Var == pg3.I) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            m14 g = sv2.g(j, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            h74Var = new h74(g.a, g.b, g.c, g.d, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits2);
        } else {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            m14 g2 = sv2.g(j, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
            h74Var = new h74(g2.a, g2.b, g2.c, g2.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits);
        }
        yd ydVar = d;
        hf1.j(ydVar, h74Var);
        r7.k(y31Var, ydVar, j3, null, 60);
        ydVar.e();
    }

    public final void a(final t33 t33Var, l13 l13Var, final yq4 yq4Var, final boolean z, long j, fe0 fe0Var, final int i) {
        final l13 l13Var2;
        final long j2;
        int i2;
        l13 l13Var3;
        long j3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-290277409);
        int i3 = i | (go1Var.g(t33Var) ? 4 : 2) | 48 | (go1Var.g(yq4Var) ? 256 : 128) | (go1Var.h(z) ? 2048 : 1024) | 8192;
        if (go1Var.T(i3 & 1, (74899 & i3) != 74898)) {
            go1Var.Y();
            if ((i & 1) == 0 || go1Var.C()) {
                xi5 xi5Var = or4.a;
                long a2 = vt0.a(qg5.Q, qg5.O);
                i2 = i3 & (-57345);
                l13Var3 = i13.a;
                j3 = a2;
            } else {
                go1Var.W();
                i2 = i3 & (-57345);
                l13Var3 = l13Var;
                j3 = j;
            }
            go1Var.r();
            int i4 = i2 & 14;
            int i5 = i2 << 3;
            b(t33Var, l13Var3, yq4Var, z, j3, go1Var, (i5 & 57344) | i4 | 432 | (i5 & 7168) | 1572864);
            l13Var2 = l13Var3;
            j2 = j3;
        } else {
            go1Var.W();
            l13Var2 = l13Var;
            j2 = j;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(t33Var, l13Var2, yq4Var, z, j2, i) { // from class: br4
                public final /* synthetic */ t33 J;
                public final /* synthetic */ l13 K;
                public final /* synthetic */ yq4 L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ long N;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(196609);
                    fr4.this.a(this.J, this.K, this.L, this.M, this.N, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public final void b(final t33 t33Var, final l13 l13Var, final yq4 yq4Var, final boolean z, final long j, fe0 fe0Var, final int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-949601789);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(t33Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.h(false) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(l13Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.g(yq4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go1Var.f(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= go1Var.g(this) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (go1Var.T(i2 & 1, (599187 & i2) != 599186)) {
            go1Var.Y();
            if ((i & 1) != 0 && !go1Var.C()) {
                go1Var.W();
            }
            go1Var.r();
            int i3 = i2 >> 3;
            or4.e(t33Var, l13Var, yq4Var, z, j, go1Var, (i2 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | ((i2 << 12) & 458752));
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: cr4
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fr4.this.b(t33Var, l13Var, yq4Var, z, j, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public final void c(final qr4 qr4Var, l13 l13Var, final boolean z, final yq4 yq4Var, hn1 hn1Var, in1 in1Var, float f, float f2, fe0 fe0Var, final int i) {
        int i2;
        final l13 l13Var2;
        final hn1 hn1Var2;
        final in1 in1Var2;
        final float f3;
        go1 go1Var;
        final float f4;
        hn1 hn1Var3;
        int i3;
        float f5;
        float f6;
        in1 in1Var3;
        l13 l13Var3;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(49984771);
        if ((i & 6) == 0) {
            i2 = (go1Var2.i(qr4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= go1Var2.g(yq4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = 720896 | i4;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= go1Var2.g(this) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if (go1Var2.T(i5 & 1, (38347923 & i5) != 38347922)) {
            go1Var2.Y();
            if ((i & 1) == 0 || go1Var2.C()) {
                boolean z2 = ((((i5 & 7168) ^ 3072) > 2048 && go1Var2.g(yq4Var)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object Q = go1Var2.Q();
                Object obj = de0.a;
                if (z2 || Q == obj) {
                    Q = new bc(yq4Var, z);
                    go1Var2.o0(Q);
                }
                hn1 hn1Var4 = (hn1) Q;
                Object Q2 = go1Var2.Q();
                if (Q2 == obj) {
                    Q2 = zc0.K;
                    go1Var2.o0(Q2);
                }
                xi5 xi5Var = or4.a;
                hn1Var3 = hn1Var4;
                i3 = i5 & (-33087489);
                f5 = 2.0f;
                f6 = 6.0f;
                in1Var3 = (in1) Q2;
                l13Var3 = i13.a;
            } else {
                go1Var2.W();
                i3 = i5 & (-33087489);
                l13Var3 = l13Var;
                hn1Var3 = hn1Var;
                in1Var3 = in1Var;
                f6 = f;
                f5 = f2;
            }
            go1Var2.r();
            int i6 = i3 << 3;
            d(qr4Var, l13Var3, z, yq4Var, hn1Var3, in1Var3, f6, f5, go1Var2, 805306416 | (i3 & 14) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 3670016), ((i3 >> 21) & 112) | 6);
            l13Var2 = l13Var3;
            go1Var = go1Var2;
            f4 = f5;
            f3 = f6;
            in1Var2 = in1Var3;
            hn1Var2 = hn1Var3;
        } else {
            go1Var2.W();
            l13Var2 = l13Var;
            hn1Var2 = hn1Var;
            in1Var2 = in1Var;
            f3 = f;
            go1Var = go1Var2;
            f4 = f2;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ar4
                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    fr4.this.c(qr4Var, l13Var2, z, yq4Var, hn1Var2, in1Var2, f3, f4, (fe0) obj2, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public final void d(final qr4 qr4Var, final l13 l13Var, final boolean z, final yq4 yq4Var, final hn1 hn1Var, final in1 in1Var, final float f, final float f2, fe0 fe0Var, final int i, final int i2) {
        int i3;
        int i4;
        go1 go1Var;
        l13 g;
        l13 l13Var2;
        float f3 = qg5.S;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(133396521);
        if ((i & 6) == 0) {
            i3 = (go1Var2.i(qr4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= go1Var2.d(Float.NaN) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var2.g(l13Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= go1Var2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= go1Var2.g(yq4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= go1Var2.i(hn1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= go1Var2.i(in1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= go1Var2.d(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= go1Var2.d(f2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= go1Var2.h(false) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (go1Var2.h(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (go1Var2.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final long a2 = yq4Var.a(z, false);
            final long a3 = yq4Var.a(z, true);
            long j = z ? yq4Var.e : yq4Var.j;
            long j2 = z ? yq4Var.c : yq4Var.h;
            r64 r64Var = ((s64) go1Var2.k(d64.a)).a;
            if (qr4Var.c()) {
                xi5 xi5Var = or4.a;
                g = nq4.b(nq4.n(l13Var, f3), 1.0f);
            } else {
                l13 e = nq4.e(l13Var, 1.0f);
                xi5 xi5Var2 = or4.a;
                g = nq4.g(e, f3);
            }
            int i5 = i3 & 112;
            boolean i6 = (i5 == 32) | go1Var2.i(qr4Var);
            Object Q = go1Var2.Q();
            int i7 = i3;
            jp jpVar = de0.a;
            if (i6 || Q == jpVar) {
                Q = new j10((Object) qr4Var, (byte) 10);
                go1Var2.o0(Q);
            }
            l13 then = g.then(j42.I(i13.a, (in1) Q));
            boolean i8 = ((i7 & 29360128) == 8388608) | (i5 == 32) | go1Var2.i(qr4Var) | ((i4 & 14) == 4) | go1Var2.f(a2) | go1Var2.f(a3) | go1Var2.f(j) | go1Var2.f(j2) | go1Var2.d(0.0f) | ((i7 & 234881024) == 67108864) | ((i7 & 458752) == 131072) | ((i7 & 3670016) == 1048576) | ((i7 & C.ENCODING_PCM_DOUBLE) == 536870912);
            Object Q2 = go1Var2.Q();
            if (i8 || Q2 == jpVar) {
                l13Var2 = then;
                go1Var = go1Var2;
                final long j3 = j;
                final long j4 = j2;
                tm1 tm1Var = new tm1() { // from class: dr4
                    /* JADX WARN: Removed duplicated region for block: B:72:0x0254  */
                    @Override // defpackage.tm1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r32) {
                        /*
                            Method dump skipped, instructions count: 946
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr4.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                go1Var.o0(tm1Var);
                Q2 = tm1Var;
            } else {
                l13Var2 = then;
                go1Var = go1Var2;
            }
            p70.j(0, go1Var, (tm1) Q2, l13Var2);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: er4
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fr4.this.d(qr4Var, l13Var, z, yq4Var, hn1Var, in1Var, f, f2, (fe0) obj, mu0.X(i | 1), mu0.X(i2));
                    return wd5.a;
                }
            };
        }
    }
}
