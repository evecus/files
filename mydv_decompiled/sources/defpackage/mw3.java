package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.DataModelKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class mw3 {
    public static final ml0 a = new ml0("合集", li4.g());

    public static final void a(final String str, final l13 l13Var, final float f, fe0 fe0Var, final int i) {
        long j;
        String str2;
        jp jpVar;
        Object hp0Var;
        bh bhVar;
        final long j2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(737253462);
        int i2 = (go1Var.g(str) ? 4 : 2) | i | (go1Var.g(l13Var) ? 32 : 16) | (go1Var.d(f) ? 256 : 128);
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) go1Var.k(rb.b);
            long j3 = ((fw2) go1Var.k(lw2.b)).a.p;
            tw1 tw1Var = null;
            if (str == null || jx4.L(str)) {
                j = j3;
                str2 = null;
            } else {
                j = j3;
                str2 = str;
            }
            boolean g = go1Var.g(str2);
            Object Q = go1Var.Q();
            jp jpVar2 = de0.a;
            if (g || Q == jpVar2) {
                if (str2 != null) {
                    qu4 qu4Var = qu4.a;
                    tw1Var = (tw1) qu4.b.get(str2);
                }
                Q = ad4.w(tw1Var);
                go1Var.o0(Q);
            }
            final t43 t43Var = (t43) Q;
            boolean g2 = go1Var.g(str2);
            Object Q2 = go1Var.Q();
            if (g2 || Q2 == jpVar2) {
                Q2 = p70.a(((tw1) t43Var.getValue()) != null ? 1.0f : 0.0f);
                go1Var.o0(Q2);
            }
            bh bhVar2 = (bh) Q2;
            boolean g3 = go1Var.g(str2) | go1Var.g(t43Var) | go1Var.i(context) | go1Var.i(bhVar2);
            Object Q3 = go1Var.Q();
            if (g3 || Q3 == jpVar2) {
                jpVar = jpVar2;
                long j4 = j;
                bhVar = bhVar2;
                j2 = j4;
                hp0Var = new hp0(str2, context, bhVar, t43Var, null);
                go1Var.o0(hp0Var);
            } else {
                jpVar = jpVar2;
                hp0Var = Q3;
                long j5 = j;
                bhVar = bhVar2;
                j2 = j5;
            }
            mw2.h(go1Var, (hn1) hp0Var, str2);
            final long c = x70.c(j2, 0.62f);
            boolean f2 = go1Var.f(c) | ((i2 & 896) == 256) | go1Var.f(j2) | go1Var.g(t43Var) | go1Var.i(bhVar);
            Object Q4 = go1Var.Q();
            if (f2 || Q4 == jpVar) {
                final bh bhVar3 = bhVar;
                tm1 tm1Var = new tm1() { // from class: hv3
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        m00 m00Var = (m00) obj;
                        m00Var.getClass();
                        final float density = m00Var.getDensity() * f;
                        final long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (m00Var.I.c() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (m00Var.I.c() & 4294967295L)) + density) & 4294967295L);
                        Float valueOf = Float.valueOf(0.0f);
                        long j6 = c;
                        final sj2 B = jp.B(new uj3[]{new uj3(valueOf, new x70(j6)), new uj3(Float.valueOf(0.4f), new x70(j6)), new uj3(Float.valueOf(1.0f), new x70(j2))}, -density, Float.intBitsToFloat((int) (4294967295L & m00Var.I.c())), 8);
                        final bh bhVar4 = bhVar3;
                        final t43 t43Var2 = t43Var;
                        return m00Var.a(new l00(new tm1() { // from class: kv3
                            @Override // defpackage.tm1
                            public final Object invoke(Object obj2) {
                                long j7;
                                int height;
                                int width;
                                y31 y31Var = (y31) obj2;
                                y31Var.getClass();
                                tw1 tw1Var2 = (tw1) t43Var2.getValue();
                                float floatValue = ((Number) bh.this.d()).floatValue();
                                long j8 = floatToRawIntBits;
                                float f3 = density;
                                if (tw1Var2 != null && floatValue > 0.0f) {
                                    int i3 = (int) (j8 >> 32);
                                    if (Float.intBitsToFloat(i3) > 0.0f) {
                                        int i4 = (int) (j8 & 4294967295L);
                                        if (Float.intBitsToFloat(i4) > 0.0f) {
                                            float intBitsToFloat = Float.intBitsToFloat(i3) / Float.intBitsToFloat(i4);
                                            if (intBitsToFloat > 1.0f) {
                                                height = ut0.r(mw2.P(r9.getHeight() / intBitsToFloat), 1, ((dd) tw1Var2).a.getHeight());
                                            } else {
                                                height = ((dd) tw1Var2).a.getHeight();
                                            }
                                            if (intBitsToFloat < 1.0f) {
                                                width = ut0.r(mw2.P(r8.getWidth() * intBitsToFloat), 1, ((dd) tw1Var2).a.getWidth());
                                            } else {
                                                width = ((dd) tw1Var2).a.getWidth();
                                            }
                                            long j9 = (-((int) Math.ceil(f3))) & 4294967295L;
                                            long ceil = ((int) Math.ceil(Float.intBitsToFloat(i3))) << 32;
                                            j7 = j8;
                                            y31Var = y31Var;
                                            r7.h(y31Var, tw1Var2, (((r8.getHeight() - height) / 2) & 4294967295L) | (((((dd) tw1Var2).a.getWidth() - width) / 2) << 32), (width << 32) | (height & 4294967295L), j9, (((int) Math.ceil(Float.intBitsToFloat(i4))) & 4294967295L) | ceil, floatValue, p9.a, 1, 320);
                                            y31 y31Var2 = y31Var;
                                            r7.l(y31Var2, B, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(-f3) & 4294967295L), j7, 0.0f, null, null, 120);
                                            return wd5.a;
                                        }
                                    }
                                }
                                j7 = j8;
                                y31 y31Var22 = y31Var;
                                r7.l(y31Var22, B, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(-f3) & 4294967295L), j7, 0.0f, null, null, 120);
                                return wd5.a;
                            }
                        }, (byte) 0));
                    }
                };
                go1Var.o0(tm1Var);
                Q4 = tm1Var;
            }
            oh4.a(go1Var, j42.u(l13Var, (tm1) Q4));
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(str, l13Var, f, i) { // from class: iv3
                public final /* synthetic */ String I;
                public final /* synthetic */ l13 J;
                public final /* synthetic */ float K;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(1);
                    mw3.a(this.I, this.J, this.K, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void b(rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i) {
        rm1 rm1Var2;
        rm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(676407887);
        int i2 = i | (go1Var.i(rm1Var) ? 4 : 2) | (go1Var.g(l13Var) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q;
            t43 v = ut0.v(t33Var, go1Var, 6);
            t43 w = ut0.w(t33Var, go1Var);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            cw4 t0 = p70.t0(((Boolean) v.getValue()).booleanValue(), x70.f, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "profileBackBg", go1Var, 24624, 0);
            cw4 s0 = p70.s0(((Boolean) v.getValue()).booleanValue(), k80Var.s, k80Var.v, "profileBackFg", go1Var, 3072);
            rm1Var2 = rm1Var;
            l13 D0 = i42.D0(r13.d(p70.H(o7.m(l13Var, jo.b), t0), null, null, null, null, rm1Var, null, null, null, null, null, new t64(0), t33Var, 65279), 12.0f, 6.0f);
            u74 a2 = t74.a(new kp(6.0f, true, new y9()), q8.T, go1Var, 54);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, D0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            hx1 E = a5.E();
            long j2 = k80Var.s;
            i13 i13Var = i13.a;
            ow1.a(E, null, p70.G(nq4.k(i13Var, 18.0f), s0, k80Var.s, false, null, 12), j2, go1Var, 48);
            go1Var = go1Var;
            m65 m65Var = ((fw2) go1Var.k(i51Var)).b.m;
            long j3 = k80Var.s;
            r55.b("返回", p70.G(i13Var, s0, j3, false, null, 12), j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var, 6, 0, 131064);
            go1Var.q(true);
        } else {
            rm1Var2 = rm1Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ko2(rm1Var2, l13Var, i, (byte) 2);
        }
    }

    public static final void c(boolean z, boolean z2, rm1 rm1Var, rm1 rm1Var2, rm1 rm1Var3, ki1 ki1Var, fe0 fe0Var, int i) {
        int i2;
        sg sgVar = q8.a0;
        sg sgVar2 = q8.d0;
        sg sgVar3 = q8.b0;
        sg sgVar4 = q8.c0;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1273319305);
        if ((i & 6) == 0) {
            i2 = (go1Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.h(z2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(rm1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.i(rm1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.i(rm1Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go1Var.g(ki1Var) ? 131072 : 65536;
        }
        if (go1Var.T(i2 & 1, (74899 & i2) != 74898)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q2);
            }
            t43 t43Var = (t43) Q2;
            t43 w = ut0.w(t33Var, go1Var);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.G, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "workDateButtonBg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.q, k80Var.v, "workDateButtonFg", go1Var, 3072);
            go1Var = go1Var;
            i13 i13Var = i13.a;
            l13 u = r7.u(12.0f, nq4.g(i13Var, 40.0f).then(ki1Var != null ? j42.x(i13Var, ki1Var) : i13Var), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new xx2(t43Var, (byte) 16);
                go1Var.o0(Q3);
            }
            l13 B = mw2.B(r13.d(i42.A0(u, (tm1) Q3), null, null, rm1Var, rm1Var2, rm1Var3, null, null, null, null, null, new t64(0), t33Var, 65199), false, null, 3);
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var.d0(305678459);
                l13 n = nq4.n(B, 40.0f);
                uw2 c = px.c(q8.N, false);
                long j = go1Var.T;
                int i3 = (int) (j ^ (j >>> 32));
                am3 m = go1Var.m();
                l13 x0 = i42.x0(go1Var, n);
                xd0.c.getClass();
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, c);
                qi4.k(go1Var, sgVar3, m);
                r7.G(i3, go1Var, sgVar2, go1Var);
                qi4.k(go1Var, sgVar, x0);
                ow1.a(g4.E(), "按日期查找", p70.G(nq4.k(i13Var, 20.0f), s0, k80Var.q, false, null, 12), k80Var.q, go1Var, 48);
                go1Var.q(true);
                go1Var.q(false);
            } else {
                go1Var.d0(306120984);
                l13 E0 = i42.E0(B, 14.0f, 0.0f, 2);
                u74 a2 = t74.a(new kp(8.0f, true, new y9()), q8.T, go1Var, 54);
                long j2 = go1Var.T;
                int i4 = (int) (j2 ^ (j2 >>> 32));
                am3 m2 = go1Var.m();
                l13 x02 = i42.x0(go1Var, E0);
                xd0.c.getClass();
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a2);
                qi4.k(go1Var, sgVar3, m2);
                r7.G(i4, go1Var, sgVar2, go1Var);
                qi4.k(go1Var, sgVar, x02);
                ow1.a(g4.E(), null, p70.G(nq4.k(i13Var, 18.0f), s0, k80Var.q, false, null, 12), k80Var.q, go1Var, 48);
                String str = z2 ? "加载中…" : "按日期查找";
                m65 m65Var = ((fw2) go1Var.k(i51Var)).b.m;
                qk1 qk1Var = qk1.O;
                long j3 = k80Var.q;
                r55.b(str, p70.G(i13Var, s0, j3, false, null, 12), j3, 0L, qk1Var, 0L, null, 0L, 0, false, 1, 0, m65Var, go1Var, 1572864, 27648, 106424);
                go1Var = go1Var;
                go1Var.q(true);
                go1Var.q(false);
            }
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new lv3(z, z2, rm1Var, rm1Var2, rm1Var3, ki1Var, i);
        }
    }

    public static final void d(final String str, final hy5 hy5Var, final tm1 tm1Var, final boolean z, final boolean z2, final rm1 rm1Var, final rm1 rm1Var2, final rm1 rm1Var3, final ki1 ki1Var, fe0 fe0Var, final int i) {
        boolean z3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1758221585);
        int i2 = (go1Var.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= go1Var.e(hy5Var == null ? -1 : hy5Var.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(tm1Var) ? 256 : 128;
        }
        int i3 = i2 | (go1Var.h(z) ? 2048 : 1024) | (go1Var.h(z2) ? 16384 : 8192) | (go1Var.i(rm1Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (go1Var.i(rm1Var3) ? 8388608 : 4194304);
        if (go1Var.T(i3 & 1, (38347923 & i3) != 38347922)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            i13 i13Var = i13.a;
            l13 F0 = i42.F0(nq4.e(i13Var, 1.0f), z ? 16.0f : 0.0f, 4.0f, z ? 16.0f : 0.0f, 6.0f);
            u74 a2 = t74.a(new kp(10.0f, true, new y9()), q8.T, go1Var, 54);
            long j = go1Var.T;
            int i4 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, F0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z4 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z4) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(i4);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            r55.b(str, new sc2(1.0f, true), k80Var.s, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, i3 & 14, 24960, 110584);
            if (hy5Var != null) {
                go1Var.d0(-478286071);
                l13 n = nq4.n(i13Var, z ? 168.0f : 220.0f);
                uw2 c = px.c(q8.J, false);
                long j2 = go1Var.T;
                int i5 = (int) (j2 ^ (j2 >>> 32));
                am3 m2 = go1Var.m();
                l13 x02 = i42.x0(go1Var, n);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, c);
                qi4.k(go1Var, sgVar2, m2);
                r7.G(i5, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x02);
                boolean z5 = (i3 & 7168) == 2048;
                Object Q = go1Var.Q();
                if (z5 || Q == de0.a) {
                    Q = new c03((byte) 1, z);
                    go1Var.o0(Q);
                }
                lq2.g(hy5.M, hy5Var, (hn1) Q, tm1Var, null, ki1Var, 40.0f, false, null, go1Var, (i3 & 112) | 1572864 | ((i3 << 3) & 7168) | 196608, 400);
                go1Var = go1Var;
                z3 = true;
                go1Var.q(true);
                go1Var.q(false);
            } else {
                go1Var = go1Var;
                z3 = true;
                go1Var.d0(-477820947);
                go1Var.q(false);
            }
            ki1 ki1Var2 = hy5Var == null ? ki1Var : null;
            int i6 = (i3 >> 9) & WebSocketProtocol.PAYLOAD_SHORT;
            int i7 = i3 >> 12;
            c(z, z2, rm1Var2, rm1Var3, rm1Var, ki1Var2, go1Var, (i7 & 7168) | i6 | (i7 & 896) | 24576);
            go1Var.q(z3);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: zu3
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mw3.d(str, hy5Var, tm1Var, z, z2, rm1Var, rm1Var2, rm1Var3, ki1Var, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void e(final String str, final String str2, final boolean z, final boolean z2, final float f, final rm1 rm1Var, final l13 l13Var, fe0 fe0Var, final int i) {
        t43 t43Var;
        long j;
        long j2;
        long c;
        t43 t43Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1245135190);
        int i2 = (go1Var.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= go1Var.g(str2) ? 32 : 16;
        }
        int i3 = i2 | (go1Var.h(z) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= go1Var.h(z2) ? 2048 : 1024;
        }
        int i4 = i3 | (go1Var.i(rm1Var) ? 131072 : 65536) | (go1Var.g(l13Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (go1Var.T(i4 & 1, (i4 & 599187) != 599186)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q2);
            }
            t43 t43Var3 = (t43) Q2;
            t43 w = ut0.w(t33Var, go1Var);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            if (z) {
                go1Var.d0(1720973594);
                go1Var.q(false);
                t43Var = t43Var3;
                j = k80Var.c;
            } else {
                t43Var = t43Var3;
                if (z2) {
                    go1Var.d0(1720975319);
                    j = ((fw2) go1Var.k(i51Var)).a.H;
                    go1Var.q(false);
                } else {
                    go1Var.d0(1720976670);
                    go1Var.q(false);
                    j = k80Var.G;
                }
            }
            if (z) {
                j2 = j;
                c = k80Var.d;
            } else {
                j2 = j;
                c = z2 ? k80Var.q : x70.c(k80Var.s, 0.7f);
            }
            long j3 = c;
            t43 t43Var4 = t43Var;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), j2, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "datePickerCellBg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var4.getValue()).booleanValue(), j3, k80Var.v, "datePickerCellFg", go1Var, 3072);
            l13 u = r7.u(12.0f, nq4.g(l13Var, f), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                t43Var2 = t43Var4;
                Q3 = new xx2(t43Var2, (byte) 15);
                go1Var.o0(Q3);
            } else {
                t43Var2 = t43Var4;
            }
            l13 B = mw2.B(r13.d(i42.A0(u, (tm1) Q3), null, null, null, null, rm1Var, null, null, null, null, null, new t64(0), t33Var, 65279), false, null, 3);
            ba0 a2 = z90.a(i42.e, q8.W, go1Var, 54);
            long j4 = go1Var.T;
            int i5 = (int) (j4 ^ (j4 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, B);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i5));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            m65 m65Var = ((fw2) go1Var.k(i51Var)).b.m;
            qk1 qk1Var = (z || ((Boolean) t43Var2.getValue()).booleanValue()) ? qk1.P : qk1.O;
            i13 i13Var = i13.a;
            r55.b(str, p70.G(i13Var, s0, j3, false, null, 12), j3, 0L, qk1Var, 0L, null, 0L, 0, false, 1, 0, m65Var, go1Var, i4 & 14, 27648, 106424);
            go1Var = go1Var;
            if (str2 != null) {
                go1Var.d0(2046993734);
                r55.b(str2, p70.G(i13Var, s0, k80Var.s, false, null, 12), z ? x70.c(k80Var.d, 0.8f) : k80Var.s, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.o, go1Var, (i4 >> 3) & 14, 27648, 106488);
                go1Var = go1Var;
                go1Var.q(false);
            } else {
                go1Var.d0(2047461090);
                go1Var.q(false);
            }
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1() { // from class: gv3
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mw3.e(str, str2, z, z2, f, rm1Var, l13Var, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void f(Aweme aweme, rm1 rm1Var, l13 l13Var, String str, fe0 fe0Var, int i) {
        int i2;
        sg sgVar;
        sg sgVar2;
        df0 df0Var;
        sg sgVar3;
        String str2;
        sg sgVar4;
        i13 i13Var;
        hx1 hx1Var;
        long j;
        int i3;
        float f;
        boolean z;
        vv vvVar = q8.P;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2086811224);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(aweme) : go1Var.i(aweme) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(rm1Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(l13Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.g(str) ? 2048 : 1024;
        }
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q;
            t43 v = ut0.v(t33Var, go1Var, 6);
            t43 w = ut0.w(t33Var, go1Var);
            boolean booleanValue = ((Boolean) v.getValue()).booleanValue();
            long j2 = x70.f;
            int i4 = i2;
            cw4 t0 = p70.t0(booleanValue, j2, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "profileDenseTileBg", go1Var, 24624, 0);
            String str3 = (String) o70.U0(aweme.getVideo().getCover().getUrlList());
            if (str3 == null) {
                str3 = (String) o70.U0(aweme.getVideo().getDynamicCover().getUrlList());
            }
            long playCount = aweme.getStatistics().getPlayCount();
            hx1 H = playCount > 0 ? il2.H() : sp0.O();
            if (playCount <= 0) {
                playCount = aweme.getStatistics().getDiggCount();
            }
            String formatCount = DataModelKt.formatCount(playCount);
            l13 C0 = i42.C0(r13.d(r7.u(4.0f, l13Var, t0), null, null, null, null, rm1Var, null, null, null, null, null, new t64(0), t33Var, 65279), 2.0f);
            vv vvVar2 = q8.J;
            uw2 c = px.c(vvVar2, false);
            long j3 = go1Var.T;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, C0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z2 = go1Var.S;
            df0 df0Var2 = wa2.A0;
            if (z2) {
                go1Var.l(df0Var2);
            } else {
                go1Var.r0();
            }
            sg sgVar5 = q8.c0;
            qi4.k(go1Var, sgVar5, c);
            sg sgVar6 = q8.b0;
            qi4.k(go1Var, sgVar6, m);
            Integer valueOf = Integer.valueOf(i5);
            sg sgVar7 = q8.d0;
            qi4.k(go1Var, sgVar7, valueOf);
            qi4.j(go1Var);
            sg sgVar8 = q8.a0;
            qi4.k(go1Var, sgVar8, x0);
            i13 i13Var2 = i13.a;
            l13 p = mw2.p(o7.m(j42.e(nq4.e(i13Var2, 1.0f), 0.75f, false), l74.a(2.0f)), k80Var.H, mw2.j);
            uw2 c2 = px.c(vvVar2, false);
            long j4 = go1Var.T;
            int i6 = (int) (j4 ^ (j4 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var2);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar5, c2);
            qi4.k(go1Var, sgVar6, m2);
            r7.G(i6, go1Var, sgVar7, go1Var);
            qi4.k(go1Var, sgVar8, x02);
            if (str3 == null || str3.length() == 0) {
                sgVar = sgVar8;
                sgVar2 = sgVar7;
                df0Var = df0Var2;
                sgVar3 = sgVar5;
                str2 = formatCount;
                sgVar4 = sgVar6;
                i13Var = i13Var2;
                hx1Var = H;
                j = j2;
                i3 = 2;
                f = 4.0f;
                go1Var.d0(-1524905314);
                go1Var.q(false);
            } else {
                go1Var.d0(-1525260357);
                Object d0 = c5.d0(str3, go1Var);
                ne1 ne1Var = nq4.c;
                boolean g = go1Var.g(v);
                Object Q2 = go1Var.Q();
                if (g || Q2 == jpVar) {
                    Q2 = new xx2(v, (byte) 19);
                    go1Var.o0(Q2);
                }
                l13 O = qb.O(ne1Var, (tm1) Q2);
                j = j2;
                sgVar3 = sgVar5;
                sgVar = sgVar8;
                str2 = formatCount;
                hx1Var = H;
                df0Var = df0Var2;
                sgVar4 = sgVar6;
                i3 = 2;
                f = 4.0f;
                sgVar2 = sgVar7;
                i13Var = i13Var2;
                SingletonAsyncImageKt.m55AsyncImage10Xjiaw(d0, null, O, null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1572912, 0, 1976);
                go1Var = go1Var;
                go1Var.q(false);
            }
            vv vvVar3 = q8.Q;
            ux uxVar = ux.a;
            l13 b = nq4.b(nq4.e(uxVar.align(i13Var, vvVar3), 1.0f), 0.3f);
            x70 x70Var = new x70(j);
            x70 x70Var2 = new x70(hx2.h);
            x70[] x70VarArr = new x70[i3];
            x70VarArr[0] = x70Var;
            x70VarArr[1] = x70Var2;
            px.a(mw2.o(b, jp.A(p70.k0(x70VarArr))), go1Var, 0);
            if (str != null) {
                go1Var.d0(-1524523983);
                l13 E0 = i42.E0(mw2.p(nq4.g(i42.G0(uxVar.align(i13Var, vvVar), f, 0.0f, 0.0f, f, 6), 22.0f), hx2.e, hx2.i), 8.0f, 0.0f, i3);
                u74 a2 = t74.a(i42.b, q8.T, go1Var, 48);
                long j5 = go1Var.T;
                int i7 = (int) (j5 ^ (j5 >>> 32));
                am3 m3 = go1Var.m();
                l13 x03 = i42.x0(go1Var, E0);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar3, a2);
                qi4.k(go1Var, sgVar4, m3);
                r7.G(i7, go1Var, sgVar2, go1Var);
                qi4.k(go1Var, sgVar, x03);
                go1 go1Var2 = go1Var;
                r55.b(str, null, hx2.a, 0L, null, 0L, null, 0L, 0, false, 1, 0, xc3.f, go1Var2, (i4 >> 9) & 14, 27648, 106490);
                go1Var = go1Var2;
                go1Var.q(true);
                go1Var.q(false);
                z = true;
            } else {
                go1Var.d0(-1523755803);
                l13 G0 = i42.G0(uxVar.align(i13Var, vvVar), 6.0f, 0.0f, 6.0f, f, 2);
                z = true;
                eu5.e(G0, p70.u0(-1587446295, new ol0(hx1Var, str2, (byte) (1 == true ? 1 : 0)), go1Var), go1Var, 48);
                go1Var.q(false);
            }
            go1Var.q(z);
            go1Var.q(z);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new oc0(aweme, rm1Var, l13Var, str, i, (byte) 4);
        }
    }

    public static final void g(boolean z, rm1 rm1Var, fe0 fe0Var, int i) {
        go1 go1Var;
        rm1 rm1Var2;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-2066790990);
        int i2 = (go1Var2.h(z) ? 4 : 2) | i | (go1Var2.i(rm1Var) ? 32 : 16);
        if (go1Var2.T(i2 & 1, (i2 & 19) != 18)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            Object Q = go1Var2.Q();
            if (Q == de0.a) {
                Q = r7.v(go1Var2);
            }
            t33 t33Var = (t33) Q;
            t43 v = ut0.v(t33Var, go1Var2, 6);
            i13 i13Var = i13.a;
            l13 E0 = i42.E0(nq4.e(i13Var, 1.0f), 0.0f, 12.0f, 1);
            uw2 c = px.c(q8.N, false);
            long j = go1Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, E0);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, c);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            if (z) {
                go1Var2.d0(1099417101);
                long j2 = ((Boolean) v.getValue()).booleanValue() ? k80Var.v : k80Var.w;
                m65 m65Var = ((fw2) go1Var2.k(i51Var)).b.k;
                rm1Var2 = rm1Var;
                r55.b("加载失败，点击重试", i42.D0(r13.d(mw2.p(o7.m(i13Var, l74.a(12.0f)), ((Boolean) v.getValue()).booleanValue() ? k80Var.u : k80Var.G, mw2.j), null, null, null, null, rm1Var, null, null, null, null, null, new t64(0), t33Var, 65279), 16.0f, 10.0f), j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var2, 6, 0, 131064);
                go1Var = go1Var2;
                go1Var.q(false);
            } else {
                go1Var = go1Var2;
                rm1Var2 = rm1Var;
                go1Var.d0(1100139153);
                p70.i(null, 32.0f, 0L, go1Var, 48, 5);
                go1Var.q(false);
            }
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            rm1Var2 = rm1Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bc(z, rm1Var2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [l13] */
    public static final void h(hx1 hx1Var, long j, cw4 cw4Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(46081409);
        int i2 = i | (go1Var.g(hx1Var) ? 32 : 16) | (go1Var.f(j) ? 256 : 128) | (go1Var.g(cw4Var) ? 2048 : 1024);
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            u74 a2 = t74.a(i42.b, q8.T, go1Var, 48);
            long j2 = go1Var.T;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var, i13Var);
            xd0.c.getClass();
            go1Var.h0();
            boolean z = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(i3);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            l13 k = nq4.k(i13Var, 26.0f);
            i51 i51Var = lw2.b;
            l13 p = mw2.p(k, ((fw2) go1Var.k(i51Var)).a.l, l74.a(6.0f));
            uw2 c = px.c(q8.N, false);
            long j3 = go1Var.T;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(i4, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            ow1.a(hx1Var, null, nq4.k(i13Var, 15.0f), ((fw2) go1Var.k(i51Var)).a.m, go1Var, ((i2 >> 3) & 14) | 432);
            go1Var.q(true);
            oh4.a(go1Var, nq4.n(i13Var, 10.0f));
            m65 m65Var = ((fw2) go1Var.k(i51Var)).b.i;
            qk1 qk1Var = qk1.P;
            r55.b("扫码推送", cw4Var != null ? p70.G(i13Var, cw4Var, j, false, null, 12) : i13Var, j, oh4.j(15), qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var, 1597446 | (i2 & 896), 0, 130984);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ac(hx1Var, j, cw4Var, i);
        }
    }

    public static final void i(final List list, final ki1 ki1Var, final ki1 ki1Var2, rm1 rm1Var, final gu3 gu3Var, final rm1 rm1Var2, final tm1 tm1Var, fe0 fe0Var, int i) {
        go1 go1Var;
        x04 u;
        ev3 ev3Var;
        boolean z;
        jp jpVar;
        zg2 zg2Var;
        final int i2;
        kp kpVar;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1476786549);
        int i3 = (go1Var2.i(tm1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | i | (go1Var2.g(list) ? 4 : 2) | (go1Var2.g(ki1Var2) ? 256 : 128) | (go1Var2.i(rm1Var) ? 2048 : 1024) | (go1Var2.g(gu3Var) ? 16384 : 8192) | (go1Var2.i(rm1Var2) ? 131072 : 65536);
        if (go1Var2.T(i3 & 1, (599187 & i3) != 599186)) {
            go1Var2.Y();
            if ((i & 1) != 0 && !go1Var2.C()) {
                go1Var2.W();
            }
            go1Var2.r();
            boolean isEmpty = list.isEmpty();
            jp jpVar2 = de0.a;
            if (isEmpty) {
                go1Var2.d0(-1597745557);
                hx1 hx1Var = a5.e;
                if (hx1Var == null) {
                    gx1 gx1Var = new gx1("Filled.Collections", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i4 = th5.a;
                    rt4 rt4Var = new rt4(x70.b);
                    ep p = hf1.p(22.0f, 16.0f, 22.0f, 4.0f);
                    p.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    p.x(8.0f, 2.0f);
                    p.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    p.M(12.0f);
                    p.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    p.v(12.0f);
                    p.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    p.p();
                    p.z(11.0f, 12.0f);
                    p.y(2.03f, 2.71f);
                    p.x(16.0f, 11.0f);
                    p.y(4.0f, 5.0f);
                    p.x(8.0f, 16.0f);
                    p.y(3.0f, -4.0f);
                    p.p();
                    p.z(2.0f, 6.0f);
                    p.M(14.0f);
                    p.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    p.v(14.0f);
                    p.M(-2.0f);
                    p.x(4.0f, 20.0f);
                    p.x(4.0f, 6.0f);
                    p.x(2.0f, 6.0f);
                    p.p();
                    gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
                    hx1Var = gx1Var.b();
                    a5.e = hx1Var;
                }
                hx1 hx1Var2 = hx1Var;
                l13 B = mw2.B(j42.x(i42.E0(nq4.e(i13.a, 1.0f), 0.0f, 40.0f, 1), ki1Var), false, null, 3);
                boolean z2 = (i3 & 896) == 256;
                Object Q = go1Var2.Q();
                if (z2 || Q == jpVar2) {
                    Q = new yz2(ki1Var2, (byte) 7);
                    go1Var2.o0(Q);
                }
                Map singletonMap = Collections.singletonMap(19, (rm1) Q);
                singletonMap.getClass();
                p70.q(hx1Var2, "暂无合集", r13.c(B, singletonMap), null, null, true, null, go1Var2, 196656, 88);
                go1Var2.q(false);
                u = go1Var2.u();
                if (u != null) {
                    ev3Var = new ev3(list, ki1Var, ki1Var2, rm1Var, gu3Var, rm1Var2, tm1Var, i, (byte) 0);
                    u.d = ev3Var;
                }
                return;
            }
            go1Var2.d0(-1597149737);
            go1Var2.q(false);
            zg2 e0 = e41.e0(go1Var2);
            int x = x(go1Var2);
            float y = y(go1Var2);
            Object[] objArr = {e0, Integer.valueOf(list.size()), Integer.valueOf(x), Boolean.valueOf(gu3Var.a), Boolean.valueOf(gu3Var.b), Boolean.valueOf(gu3Var.c)};
            int i5 = i3 & 14;
            int i6 = (57344 & i3) ^ 24576;
            boolean g = (i5 == 4) | ((i6 > 16384 && go1Var2.i(gu3Var)) || (i3 & 24576) == 16384) | go1Var2.g(e0) | go1Var2.e(x) | ((i3 & 7168) == 2048);
            Object Q2 = go1Var2.Q();
            if (g || Q2 == jpVar2) {
                z = false;
                jpVar = jpVar2;
                eq1 eq1Var = new eq1(list, gu3Var, rm1Var, e0, x, (fj0) null);
                zg2Var = e0;
                i2 = x;
                go1Var2.o0(eq1Var);
                Q2 = eq1Var;
            } else {
                z = false;
                zg2Var = e0;
                i2 = x;
                jpVar = jpVar2;
            }
            mw2.k(objArr, (hn1) Q2, go1Var2);
            kv4 kv4Var = new kv4(i2);
            ne1 ne1Var = nq4.c;
            li3 S = i42.S(8.0f, 1);
            kp kpVar2 = new kp(y, true, new y9());
            boolean e = go1Var2.e(i2) | (i5 != 4 ? z : true) | ((i3 & 896) == 256 ? true : z) | ((3670016 & i3) == 1048576 ? true : z) | (((i6 <= 16384 || !go1Var2.i(gu3Var)) && (i3 & 24576) != 16384) ? z : true);
            if ((458752 & i3) == 131072) {
                z = true;
            }
            boolean z3 = e | z;
            Object Q3 = go1Var2.Q();
            if (z3 || Q3 == jpVar) {
                kpVar = kpVar2;
                tm1 tm1Var2 = new tm1() { // from class: fv3
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        kg2 kg2Var = (kg2) obj;
                        kg2Var.getClass();
                        zw1 zw1Var = new zw1((byte) 23);
                        List list2 = list;
                        byte b = 1;
                        kg2Var.a0(list2.size(), new ee(zw1Var, list2, (byte) 17), new v30(list2, (byte) 11), null, new tc0(-1466459515, new wv3(list2, ki1Var, i2, ki1Var2, tm1Var), true));
                        gu3 gu3Var2 = gu3Var;
                        if (gu3Var2.a || gu3Var2.b) {
                            i82.N(kg2Var, "listPagingFooter", new tc0(-1755710202, new ov3(gu3Var2, rm1Var2, b), true), 2);
                        }
                        return wd5.a;
                    }
                };
                go1Var2.o0(tm1Var2);
                Q3 = tm1Var2;
            } else {
                kpVar = kpVar2;
            }
            c21.e(kv4Var, ne1Var, zg2Var, S, y, kpVar, null, false, null, (tm1) Q3, go1Var2, 3120);
            go1Var = go1Var2;
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        u = go1Var.u();
        if (u != null) {
            ev3Var = new ev3(list, ki1Var, ki1Var2, rm1Var, gu3Var, rm1Var2, tm1Var, i, (byte) 1);
            u.d = ev3Var;
        }
    }

    public static final void j(hu2 hu2Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-186044411);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(hu2Var) : go1Var.i(hu2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            l13 e = nq4.e(i13.a, 1.0f);
            u74 a2 = t74.a(i42.c, q8.T, go1Var, 54);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, e);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            hx1 t = ad4.t();
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && go1Var.i(hu2Var))) {
                z = true;
            }
            Object Q = go1Var.Q();
            if (z || Q == de0.a) {
                Q = new ao(hu2Var, (byte) 14);
                go1Var.o0(Q);
            }
            jl2.a(t, (rm1) Q, null, go1Var, 432);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new zu0(hu2Var, i, (byte) 5);
        }
    }

    public static final void k(String str, float f, boolean z, rm1 rm1Var, fe0 fe0Var, int i) {
        int i2;
        boolean z2;
        float f2 = f;
        aj5 aj5Var = mw2.j;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1398096150);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.d(f2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.i(rm1Var) ? 2048 : 1024;
        }
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            jp jpVar = dw2.a;
            ew2 L = rt0.L(jp.k(), go1Var);
            Object d0 = c5.d0(str == null ? "" : str, go1Var);
            uw2 c = px.c(q8.J, false);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var, i13Var);
            xd0.c.getClass();
            go1Var.h0();
            boolean z3 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z3) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, c);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(i3);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            jp jpVar2 = li0.a;
            if (z) {
                go1Var.d0(-2131347795);
                Object Q = go1Var.Q();
                jp jpVar3 = de0.a;
                if (Q == jpVar3) {
                    Q = ad4.w(Boolean.FALSE);
                    go1Var.o0(Q);
                }
                t43 t43Var = (t43) Q;
                Object Q2 = go1Var.Q();
                if (Q2 == jpVar3) {
                    Q2 = r7.v(go1Var);
                }
                t33 t33Var = (t33) Q2;
                l13 H = p70.H(o7.m(nq4.k(i13Var, f2), L), p70.t0(((Boolean) t43Var.getValue()).booleanValue(), x70.f, k80Var.u, ((Boolean) ut0.w(t33Var, go1Var).getValue()).booleanValue(), "profile_avatar_switch_bg", go1Var, 24624, 0));
                Object Q3 = go1Var.Q();
                if (Q3 == jpVar3) {
                    Q3 = new xx2(t43Var, (byte) 18);
                    go1Var.o0(Q3);
                }
                l13 C0 = i42.C0(r13.d(i42.A0(H, (tm1) Q3), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), 6.0f);
                vv vvVar = q8.N;
                uw2 c2 = px.c(vvVar, false);
                long j2 = go1Var.T;
                int i4 = (int) (j2 ^ (j2 >>> 32));
                am3 m2 = go1Var.m();
                l13 x02 = i42.x0(go1Var, C0);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, c2);
                qi4.k(go1Var, sgVar2, m2);
                r7.G(i4, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x02);
                SingletonAsyncImageKt.m55AsyncImage10Xjiaw(d0, null, mw2.p(o7.m(nq4.c, L), k80Var.H, aj5Var), null, null, null, jpVar2, 0.0f, null, 0, false, go1Var, 1572912, 0, 1976);
                go1Var = go1Var;
                go1Var.q(true);
                l13 p = mw2.p(o7.m(nq4.k(ux.a.align(i13Var, q8.R), 28.0f), l74.a), k80Var.a, aj5Var);
                uw2 c3 = px.c(vvVar, false);
                long j3 = go1Var.T;
                int i5 = (int) (j3 ^ (j3 >>> 32));
                am3 m3 = go1Var.m();
                l13 x03 = i42.x0(go1Var, p);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, c3);
                qi4.k(go1Var, sgVar2, m3);
                r7.G(i5, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x03);
                ow1.a(hc4.P(), null, nq4.k(i13Var, 16.0f), k80Var.b, go1Var, 432);
                go1Var.q(true);
                go1Var.q(false);
                f2 = f;
                z2 = true;
            } else {
                go1Var.d0(-2129375668);
                f2 = f;
                l13 p2 = mw2.p(o7.m(nq4.k(i13Var, f2), L), k80Var.H, aj5Var);
                z2 = true;
                SingletonAsyncImageKt.m55AsyncImage10Xjiaw(d0, null, p2, null, null, null, jpVar2, 0.0f, null, 0, false, go1Var, 1572912, 0, 1976);
                go1Var = go1Var;
                go1Var.q(false);
            }
            go1Var.q(z2);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qv3(str, f2, z, rm1Var, i);
        }
    }

    public static final void l(final Author author, final String str, final boolean z, final float f, final List list, final String str2, final tm1 tm1Var, fe0 fe0Var, final int i) {
        t43 t43Var;
        ki1 ki1Var;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        i13 i13Var;
        k80 k80Var;
        boolean z2;
        float f2;
        uv uvVar;
        Object obj;
        boolean z3;
        i13 i13Var2;
        long j;
        boolean z4;
        aj5 aj5Var = mw2.j;
        sg sgVar = q8.a0;
        sg sgVar2 = q8.d0;
        sg sgVar3 = q8.b0;
        sg sgVar4 = q8.c0;
        uv uvVar2 = q8.T;
        uv uvVar3 = q8.S;
        tv tvVar = q8.V;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(330684295);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? go1Var.g(author) : go1Var.i(author) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= go1Var.g(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? go1Var.g(list) : go1Var.i(list) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go1Var.g(str2) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((1572864 & i) == 0) {
            i3 |= go1Var.i(tm1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = i3;
        if (go1Var.T(i4 & 1, (i4 & 599187) != 599186)) {
            i51 i51Var = lw2.b;
            k80 k80Var2 = ((fw2) go1Var.k(i51Var)).a;
            Object Q = go1Var.Q();
            Object obj2 = de0.a;
            if (Q == obj2) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var2 = (t43) Q;
            boolean z5 = list.size() > 1;
            Object Q2 = go1Var.Q();
            if (Q2 == obj2) {
                Q2 = pt1.r(go1Var);
            }
            ki1 ki1Var2 = (ki1) Q2;
            Boolean bool = (Boolean) t43Var2.getValue();
            bool.getClass();
            Boolean valueOf = Boolean.valueOf(z5);
            boolean h = go1Var.h(z5);
            boolean z6 = z5;
            Object Q3 = go1Var.Q();
            fj0 fj0Var = null;
            if (h || Q3 == obj2) {
                Q3 = new su1(z6, t43Var2, ki1Var2, fj0Var, (byte) 1);
                t43Var = t43Var2;
                ki1Var = ki1Var2;
                go1Var.o0(Q3);
            } else {
                t43Var = t43Var2;
                ki1Var = ki1Var2;
            }
            mw2.i(bool, valueOf, (hn1) Q3, go1Var);
            if (author == null || (str3 = author.getNickname()) == null) {
                str3 = "未登录用户";
            }
            if (author == null || (str4 = author.getSignature()) == null) {
                str4 = "暂无简介";
            }
            String str9 = str3;
            String x = qx4.x(qx4.x(str4, "\r\n", " ", false), "\n", " ", false);
            if (author == null || (str5 = DataModelKt.formatCount(author.getAwemeCount())) == null) {
                str5 = "0";
            }
            uj3 uj3Var = new uj3(str5, "作品");
            if (author == null || (str6 = DataModelKt.formatCount(author.getFollowingCount())) == null) {
                str6 = "0";
            }
            uj3 uj3Var2 = new uj3(str6, "关注");
            if (author == null || (str7 = DataModelKt.formatCount(author.getFollowerCount())) == null) {
                str7 = "0";
            }
            uj3 uj3Var3 = new uj3(str7, "粉丝");
            if (author == null || (str8 = DataModelKt.formatCount(author.getTotalFavorited())) == null) {
                str8 = "0";
            }
            List<uj3> k0 = p70.k0(uj3Var, uj3Var2, uj3Var3, new uj3(str8, "获赞"));
            i13 i13Var3 = i13.a;
            l13 e = nq4.e(i13Var3, 1.0f);
            ba0 a2 = z90.a(i42.K0(12.0f), tvVar, go1Var, 6);
            long j2 = go1Var.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, e);
            xd0.c.getClass();
            go1Var.h0();
            boolean z7 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z7) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar4, a2);
            qi4.k(go1Var, sgVar3, m);
            sg sgVar5 = sgVar2;
            r7.G(i5, go1Var, sgVar5, go1Var);
            qi4.k(go1Var, sgVar, x0);
            if (z) {
                go1Var.d0(-598946638);
                f2 = 8.0f;
                l13 e2 = nq4.e(i13Var3, 1.0f);
                ba0 a3 = z90.a(i42.K0(8.0f), q8.W, go1Var, 54);
                long j3 = go1Var.T;
                int i6 = (int) (j3 ^ (j3 >>> 32));
                am3 m2 = go1Var.m();
                l13 x02 = i42.x0(go1Var, e2);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a3);
                qi4.k(go1Var, sgVar3, m2);
                r7.G(i6, go1Var, sgVar5, go1Var);
                qi4.k(go1Var, sgVar, x02);
                Object Q4 = go1Var.Q();
                if (Q4 == obj2) {
                    Q4 = new sf(t43Var, (byte) 22);
                    go1Var.o0(Q4);
                }
                k80Var = k80Var2;
                k(str, 96.0f, z6, (rm1) Q4, go1Var, ((i4 >> 3) & 14) | 3120);
                z2 = z6;
                r55.b(str9, null, k80Var.q, 0L, qk1.Q, 0L, new k25(3), 0L, 2, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.e, go1Var, 1572864, 24960, 109498);
                r55.b(x, null, k80Var.s, 0L, null, 0L, new k25(3), 0L, 2, false, 2, 0, ((fw2) go1Var.k(i51Var)).b.l, go1Var, 0, 24960, 109562);
                go1Var = go1Var;
                l13 G0 = i42.G0(i13Var3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                i13Var = i13Var3;
                u74 a4 = t74.a(i42.K0(20.0f), uvVar3, go1Var, 6);
                long j4 = go1Var.T;
                int i7 = (int) (j4 ^ (j4 >>> 32));
                am3 m3 = go1Var.m();
                l13 x03 = i42.x0(go1Var, G0);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a4);
                qi4.k(go1Var, sgVar3, m3);
                r7.G(i7, go1Var, sgVar5, go1Var);
                qi4.k(go1Var, sgVar, x03);
                go1Var.d0(951528585);
                for (uj3 uj3Var4 : k0) {
                    o((String) uj3Var4.I, (String) uj3Var4.J, true, go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
                }
                go1Var.q(false);
                go1Var.q(true);
                go1Var.q(true);
                go1Var.q(false);
                uvVar = uvVar2;
                obj = obj2;
            } else {
                i13Var = i13Var3;
                k80Var = k80Var2;
                z2 = z6;
                f2 = 8.0f;
                go1Var.d0(-597400637);
                u74 a5 = t74.a(i42.K0(24.0f), uvVar2, go1Var, 54);
                long j5 = go1Var.T;
                int i8 = (int) (j5 ^ (j5 >>> 32));
                am3 m4 = go1Var.m();
                uvVar = uvVar2;
                l13 x04 = i42.x0(go1Var, i13Var);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a5);
                qi4.k(go1Var, sgVar3, m4);
                r7.G(i8, go1Var, sgVar5, go1Var);
                qi4.k(go1Var, sgVar, x04);
                Object Q5 = go1Var.Q();
                obj = obj2;
                if (Q5 == obj) {
                    Q5 = new sf(t43Var, (byte) 23);
                    go1Var.o0(Q5);
                }
                k(str, f, z2, (rm1) Q5, go1Var, ((i4 >> 3) & 14) | 3072 | ((i4 >> 6) & 112));
                sc2 sc2Var = new sc2(1.0f, true);
                ba0 a6 = z90.a(i42.K0(6.0f), tvVar, go1Var, 6);
                long j6 = go1Var.T;
                int i9 = (int) (j6 ^ (j6 >>> 32));
                am3 m5 = go1Var.m();
                l13 x05 = i42.x0(go1Var, sc2Var);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a6);
                qi4.k(go1Var, sgVar3, m5);
                sgVar5 = sgVar5;
                r7.G(i9, go1Var, sgVar5, go1Var);
                qi4.k(go1Var, sgVar, x05);
                r55.b(str9, null, k80Var.q, 0L, qk1.Q, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.c, go1Var, 1572864, 24960, 110522);
                r55.b(x, nq4.e(i13Var, 1.0f), k80Var.s, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.k, go1Var, 48, 24960, 110584);
                go1Var = go1Var;
                l13 G02 = i42.G0(i13Var, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                u74 a7 = t74.a(i42.K0(24.0f), uvVar3, go1Var, 6);
                long j7 = go1Var.T;
                int i10 = (int) (j7 ^ (j7 >>> 32));
                am3 m6 = go1Var.m();
                l13 x06 = i42.x0(go1Var, G02);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a7);
                qi4.k(go1Var, sgVar3, m6);
                r7.G(i10, go1Var, sgVar5, go1Var);
                qi4.k(go1Var, sgVar, x06);
                go1Var.d0(1663084535);
                for (uj3 uj3Var5 : k0) {
                    o((String) uj3Var5.I, (String) uj3Var5.J, false, go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
                }
                go1Var.q(false);
                go1Var.q(true);
                go1Var.q(true);
                go1Var.q(true);
                go1Var.q(false);
            }
            if (((Boolean) t43Var.getValue()).booleanValue() && z2) {
                go1Var.d0(-595578612);
                l13 C0 = i42.C0(mw2.p(o7.m(nq4.e(i13Var, 1.0f), l74.a(14.0f)), k80Var.G, aj5Var), f2);
                t43 t43Var3 = t43Var;
                ba0 a8 = z90.a(new kp(4.0f, true, new y9()), tvVar, go1Var, 6);
                Object obj3 = obj;
                long j8 = go1Var.T;
                int i11 = (int) (j8 ^ (j8 >>> 32));
                am3 m7 = go1Var.m();
                l13 x07 = i42.x0(go1Var, C0);
                xd0.c.getClass();
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a8);
                qi4.k(go1Var, sgVar3, m7);
                r7.G(i11, go1Var, sgVar5, go1Var);
                qi4.k(go1Var, sgVar, x07);
                go1 go1Var2 = go1Var;
                r55.b("切换配置", i42.D0(i13Var, 8.0f, 4.0f), k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(lw2.b)).b.n, go1Var2, 54, 0, 131064);
                go1Var = go1Var2;
                go1Var.d0(-387861621);
                Iterator it = list.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        p70.A0();
                        throw null;
                    }
                    dl4 dl4Var = (dl4) next;
                    boolean c = j42.c(dl4Var.a, str2);
                    Object Q6 = go1Var.Q();
                    Object obj4 = obj3;
                    if (Q6 == obj4) {
                        Q6 = ad4.w(Boolean.FALSE);
                        go1Var.o0(Q6);
                    }
                    t43 t43Var4 = (t43) Q6;
                    Iterator it2 = it;
                    l13 m8 = o7.m(j42.x(nq4.e(i13Var, 1.0f), i12 == 0 ? ki1Var : ki1.b), l74.a(10.0f));
                    if (((Boolean) t43Var4.getValue()).booleanValue()) {
                        i13Var2 = i13Var;
                        i12 = i13;
                        j = k80Var.u;
                    } else {
                        i13Var2 = i13Var;
                        i12 = i13;
                        j = c ? k80Var.c : x70.f;
                    }
                    l13 p = mw2.p(m8, j, aj5Var);
                    Object Q7 = go1Var.Q();
                    if (Q7 == obj4) {
                        Q7 = new xx2(t43Var4, (byte) 17);
                        go1Var.o0(Q7);
                    }
                    l13 A0 = i42.A0(p, (tm1) Q7);
                    boolean h2 = go1Var.h(c) | ((i4 & 3670016) == 1048576) | go1Var.i(dl4Var);
                    Object Q8 = go1Var.Q();
                    if (h2 || Q8 == obj4) {
                        Q8 = new lo0(c, tm1Var, dl4Var, t43Var3, (byte) 1);
                        z4 = c;
                        go1Var.o0(Q8);
                    } else {
                        z4 = c;
                    }
                    obj3 = obj4;
                    l13 D0 = i42.D0(mw2.B(i42.g0(A0, false, null, null, null, (rm1) Q8, 15), false, null, 3), 12.0f, 8.0f);
                    u74 a9 = t74.a(i42.b, uvVar, go1Var, 48);
                    long j9 = go1Var.T;
                    int i14 = (int) (j9 ^ (j9 >>> 32));
                    am3 m9 = go1Var.m();
                    l13 x08 = i42.x0(go1Var, D0);
                    xd0.c.getClass();
                    go1Var.h0();
                    boolean z8 = z4;
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, sgVar4, a9);
                    qi4.k(go1Var, sgVar3, m9);
                    r7.G(i14, go1Var, sgVar5, go1Var);
                    qi4.k(go1Var, sgVar, x08);
                    long j10 = ((Boolean) t43Var4.getValue()).booleanValue() ? k80Var.v : z8 ? k80Var.d : k80Var.q;
                    i13 i13Var4 = i13Var2;
                    go1 go1Var3 = go1Var;
                    ow1.a(z8 ? d4.w() : il2.G(), null, nq4.k(i13Var4, 18.0f), j10, go1Var3, 432);
                    oh4.a(go1Var3, nq4.n(i13Var4, 8.0f));
                    String str10 = dl4Var.a;
                    i51 i51Var2 = lw2.b;
                    r55.b(str10, null, j10, 0L, z8 ? qk1.P : qk1.M, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var3.k(i51Var2)).b.k, go1Var3, 0, 24576, 114618);
                    go1Var = go1Var3;
                    if (z8) {
                        go1Var.d0(-1816175237);
                        oh4.a(go1Var, nq4.n(i13Var4, 6.0f));
                        r55.b("(当前)", null, j10, oh4.j(11), null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var2)).b.l, go1Var, 24582, 0, 131050);
                        go1Var = go1Var;
                        go1Var.q(false);
                    } else {
                        go1Var.d0(-1815781227);
                        go1Var.q(false);
                    }
                    go1Var.q(true);
                    i13Var = i13Var4;
                    it = it2;
                }
                z3 = true;
                r7.J(go1Var, false, true, false);
            } else {
                z3 = true;
                go1Var.d0(-591895099);
                go1Var.q(false);
            }
            go1Var.q(z3);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: pv3
                @Override // defpackage.hn1
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    mw3.l(Author.this, str, z, f, list, str2, tm1Var, (fe0) obj5, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void m(String str, String str2, fe0 fe0Var, int i) {
        String str3 = str;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(301429598);
        int i2 = i | (go1Var.g(str3) ? 4 : 2) | (go1Var.g(str2) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            i13 i13Var = i13.a;
            l13 e = nq4.e(i13Var, 1.0f);
            u74 a2 = t74.a(new kp(12.0f, true, new y9()), q8.T, go1Var, 54);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, e);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            Object d0 = c5.d0(str2 == null ? "" : str2, go1Var);
            l13 k = nq4.k(i13Var, 40.0f);
            jp jpVar = dw2.a;
            l13 m2 = o7.m(k, rt0.L(jp.k(), go1Var));
            i51 i51Var = lw2.b;
            SingletonAsyncImageKt.m55AsyncImage10Xjiaw(d0, null, mw2.p(m2, ((fw2) go1Var.k(i51Var)).a.H, mw2.j), null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1572912, 0, 1976);
            m65 m65Var = ((fw2) go1Var.k(i51Var)).b.h;
            str3 = str;
            r55.b(str3, null, ((fw2) go1Var.k(i51Var)).a.q, 0L, qk1.P, 0L, null, 0L, 2, false, 1, 0, m65Var, go1Var, (i2 & 14) | 1572864, 24960, 110522);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj1((byte) 15, i, str3, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0b5d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0757  */
    /* JADX WARN: Type inference failed for: r1v39, types: [ki1] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46, types: [fj0] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v69 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(defpackage.hu2 r63, final defpackage.l13 r64, int r65, defpackage.fe0 r66, int r67) {
        /*
            Method dump skipped, instructions count: 3038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw3.n(hu2, l13, int, fe0, int):void");
    }

    public static final void o(String str, String str2, boolean z, fe0 fe0Var, int i) {
        String str3;
        go1 go1Var;
        i51 i51Var;
        boolean z2;
        m65 m65Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-297614622);
        int i2 = i | (go1Var2.g(str) ? 4 : 2) | (go1Var2.g(str2) ? 32 : 16);
        if (go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
            ba0 a2 = z90.a(i42.d, z ? q8.W : q8.V, go1Var2, 0);
            long j = go1Var2.T;
            int i3 = (int) ((j >>> 32) ^ j);
            am3 m = go1Var2.m();
            l13 l13Var = i13.a;
            l13 x0 = i42.x0(go1Var2, l13Var);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, a2);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            m65 a3 = z ? m65.a(xc3.c, 0L, 0L, qk1.P, null, 0L, null, 0L, null, 16777211) : xc3.b;
            i51 i51Var2 = lw2.b;
            long j2 = ((fw2) go1Var2.k(i51Var2)).a.q;
            long j3 = oh4.j(z ? 19 : 26);
            long j4 = oh4.j(z ? 5 : 7);
            q65[] q65VarArr = p65.b;
            l13 w = (j3 & 1095216660480L) == 0 ? l13Var : wx5.w(z8.a, j3, 0L, 4);
            if ((j4 & 1095216660480L) != 0) {
                l13Var = wx5.w(z8.b, 0L, j4, 2);
            }
            r55.b(str, w.then(l13Var), j2, 0L, null, 0L, null, 0L, 0, false, 1, 0, a3, go1Var2, i2 & 14, 24576, 114680);
            if (z) {
                go1Var2.d0(418577174);
                i51Var = i51Var2;
                m65Var = ((fw2) go1Var2.k(i51Var)).b.o;
                z2 = false;
            } else {
                i51Var = i51Var2;
                z2 = false;
                go1Var2.d0(418578487);
                m65Var = ((fw2) go1Var2.k(i51Var)).b.n;
            }
            go1Var2.q(z2);
            str3 = str2;
            r55.b(str3, null, ((fw2) go1Var2.k(i51Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 1, 0, m65Var, go1Var2, (i2 >> 3) & 14, 24576, 114682);
            go1Var = go1Var2;
            go1Var.q(true);
        } else {
            str3 = str2;
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new uj(z, str, i, str3);
        }
    }

    public static final void p(ow3 ow3Var, boolean z, boolean z2, rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i) {
        go1 go1Var;
        ow3 ow3Var2;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1610921632);
        int i2 = i | (go1Var2.e(ow3Var.ordinal()) ? 4 : 2) | (go1Var2.h(z) ? 32 : 16) | (go1Var2.h(z2) ? 256 : 128) | (go1Var2.i(rm1Var) ? 2048 : 1024) | (go1Var2.g(l13Var) ? 16384 : 8192);
        if (go1Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = r7.v(go1Var2);
            }
            t33 t33Var = (t33) Q;
            t43 v = ut0.v(t33Var, go1Var2, 6);
            t43 w = ut0.w(t33Var, go1Var2);
            k80 k80Var = ((fw2) go1Var2.k(lw2.b)).a;
            Boolean bool = (Boolean) v.getValue();
            bool.getClass();
            Boolean valueOf = Boolean.valueOf(z);
            boolean g = ((i2 & 7168) == 2048) | go1Var2.g(v) | ((i2 & 112) == 32);
            Object Q2 = go1Var2.Q();
            if (g || Q2 == jpVar) {
                Q2 = new gu2(z, rm1Var, v, (fj0) null);
                go1Var2.o0(Q2);
            }
            mw2.i(bool, valueOf, (hn1) Q2, go1Var2);
            long j = z ? k80Var.d : k80Var.s;
            cw4 t0 = p70.t0(((Boolean) v.getValue()).booleanValue(), z ? k80Var.c : k80Var.G, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "profileTabBg", go1Var2, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) v.getValue()).booleanValue(), j, k80Var.v, "profileTabFg", go1Var2, 3072);
            l13 E0 = i42.E0(r13.d(r7.u(12.0f, nq4.g(l13Var, z2 ? 32.0f : 40.0f), t0), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), z2 ? 12.0f : 16.0f, 0.0f, 2);
            uw2 c = px.c(q8.N, false);
            long j2 = go1Var2.T;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, E0);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, c);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            ow3Var2 = ow3Var;
            r55.b(ow3Var2.I, p70.G(i13.a, s0, j, false, null, 12), j, oh4.j(z2 ? 13 : 14), (z || ((Boolean) v.getValue()).booleanValue()) ? qk1.P : qk1.M, 0L, null, 0L, 0, false, 1, 0, null, go1Var2, 0, 24576, 245672);
            go1Var = go1Var2;
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            ow3Var2 = ow3Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new jv3(ow3Var2, z, z2, rm1Var, l13Var, i);
        }
    }

    public static final void q(String str, l13 l13Var, fe0 fe0Var, int i) {
        go1 go1Var;
        byte b;
        l13 l13Var2;
        t43 t43Var;
        String str2 = str;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(738190603);
        int i2 = i | 48;
        if (go1Var2.T(i2 & 1, (i2 & 19) != 18)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            cy3 h = hy3.h(go1Var2);
            Bitmap g = hy3.g(str2, h, go1Var2, 6, 2);
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q);
            }
            t43 t43Var2 = (t43) Q;
            cw4 t0 = p70.t0(((Boolean) t43Var2.getValue()).booleanValue(), k80Var.G, k80Var.u, false, "profile_qr_push_bg", go1Var2, 24576, 8);
            cw4 s0 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), k80Var.q, k80Var.v, "profile_qr_push_title", go1Var2, 3072);
            cw4 s02 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), k80Var.s, k80Var.v, "profile_qr_push_sub", go1Var2, 3072);
            cw4 s03 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), k80Var.a, k80Var.v, "profile_qr_push_url", go1Var2, 3072);
            i13 i13Var = i13.a;
            l13 e = nq4.e(i13Var, 1.0f);
            Object Q2 = go1Var2.Q();
            if (Q2 == jpVar) {
                t43Var = t43Var2;
                Q2 = new xx2(t43Var, (byte) 11);
                go1Var2.o0(Q2);
            } else {
                t43Var = t43Var2;
            }
            l13 C0 = i42.C0(mw2.B(r7.u(16.0f, i42.A0(e, (tm1) Q2), t0), false, null, 3), 24.0f);
            ba0 a2 = z90.a(i42.d, q8.W, go1Var2, 48);
            long j = go1Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, C0);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, a2);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            h(dq2.S(), k80Var.q, s0, go1Var2, 6);
            oh4.a(go1Var2, nq4.g(i13Var, 12.0f));
            hy3.d(h, 280.0f, null, p70.u0(2031348763, new xh2(g, (byte) 1), go1Var2), go1Var2, 3120);
            oh4.a(go1Var2, nq4.g(i13Var, 16.0f));
            m65 m65Var = ((fw2) go1Var2.k(i51Var)).b.i;
            qk1 qk1Var = qk1.P;
            long j2 = k80Var.q;
            r55.b("手机扫码推送登录信息", p70.G(i13Var, s0, j2, false, null, 12), j2, 0L, qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var2, 1572870, 0, 131000);
            oh4.a(go1Var2, nq4.g(i13Var, 4.0f));
            r55.b("支持同时推送 Cookie、ticket、ts_sign 和 private key", p70.G(i13Var, s02, k80Var.s, false, null, 12), k80Var.s, oh4.j(12), null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var)).b.l, go1Var2, 24582, 0, 131048);
            oh4.a(go1Var2, nq4.g(i13Var, 8.0f));
            str2 = str;
            r55.b(str2, p70.G(i13Var, s03, k80Var.a, false, null, 12), k80Var.a, oh4.j(11), null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var)).b.l, go1Var2, 24582, 0, 131048);
            go1Var = go1Var2;
            l13Var2 = i13Var;
            oh4.a(go1Var, nq4.g(l13Var2, 10.0f));
            qm4.t(((Boolean) t43Var.getValue()).booleanValue(), go1Var, 0);
            b = 1;
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            b = 1;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new s20(str2, l13Var2, i, b);
        }
    }

    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [fj0, l13] */
    public static final void r(hu2 hu2Var, l13 l13Var, int i, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var;
        t43 t43Var;
        k80 k80Var;
        i51 i51Var;
        int i4;
        Integer num;
        wd5 wd5Var;
        ?? r4;
        ez3 ez3Var;
        boolean z;
        boolean z2;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1110121091);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go1Var2.g(hu2Var) : go1Var2.i(hu2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var2.g(l13Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var2.e(i) ? 256 : 128;
        }
        int i5 = i3;
        if (go1Var2.T(i5 & 1, (i5 & 147) != 146)) {
            i51 i51Var2 = lw2.b;
            k80 k80Var2 = ((fw2) go1Var2.k(i51Var2)).a;
            Context context = (Context) go1Var2.k(rb.b);
            fl4 fl4Var = hu2Var.d;
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            Object obj = Q;
            if (Q == jpVar) {
                jk3 w = ad4.w(0);
                go1Var2.o0(w);
                obj = w;
            }
            t43 t43Var2 = (t43) obj;
            Object Q2 = go1Var2.Q();
            Object obj2 = Q2;
            if (Q2 == jpVar) {
                String h = hu2Var.r.h();
                go1Var2.o0(h);
                obj2 = h;
            }
            String str = (String) obj2;
            int i6 = i5 & 14;
            boolean z3 = i6 == 4 || ((i5 & 8) != 0 && go1Var2.i(hu2Var));
            Object Q3 = go1Var2.Q();
            Object obj3 = Q3;
            if (z3 || Q3 == jpVar) {
                bo boVar = new bo(hu2Var, (byte) 7);
                go1Var2.o0(boVar);
                obj3 = boVar;
            }
            wd5 wd5Var2 = wd5.a;
            mw2.e(wd5Var2, (tm1) obj3, go1Var2);
            if (((Number) t43Var2.getValue()).intValue() == 1) {
                go1Var2.d0(370039948);
                boolean g = go1Var2.g(context);
                Object Q4 = go1Var2.Q();
                Object obj4 = Q4;
                if (g || Q4 == jpVar) {
                    ez3 ez3Var2 = new ez3();
                    go1Var2.o0(ez3Var2);
                    obj4 = ez3Var2;
                }
                ez3Var = (ez3) obj4;
                boolean i7 = go1Var2.i(ez3Var);
                Object Q5 = go1Var2.Q();
                Object obj5 = Q5;
                if (i7 || Q5 == jpVar) {
                    ru3 ru3Var = new ru3(ez3Var, (byte) 0);
                    go1Var2.o0(ru3Var);
                    obj5 = ru3Var;
                }
                mw2.e(ez3Var, (tm1) obj5, go1Var2);
                boolean i8 = go1Var2.i(ez3Var) | (i6 == 4 || ((i5 & 8) != 0 && go1Var2.i(hu2Var))) | go1Var2.i(fl4Var);
                Object Q6 = go1Var2.Q();
                if (i8 || Q6 == jpVar) {
                    t43Var = t43Var2;
                    k80Var = k80Var2;
                    i51Var = i51Var2;
                    num = 0;
                    wd5Var = wd5Var2;
                    z2 = false;
                    i4 = 1;
                    o1 o1Var = new o1(ez3Var, hu2Var, fl4Var, false ? 1 : 0, (byte) 11);
                    go1Var2.o0(o1Var);
                    Q6 = o1Var;
                } else {
                    t43Var = t43Var2;
                    k80Var = k80Var2;
                    i51Var = i51Var2;
                    num = 0;
                    wd5Var = wd5Var2;
                    z2 = false;
                    i4 = 1;
                }
                el4 el4Var = fl4.Companion;
                mw2.j(ez3Var, hu2Var, fl4Var, (hn1) Q6, go1Var2);
                go1Var2.q(false);
                r4 = z2;
            } else {
                t43Var = t43Var2;
                k80Var = k80Var2;
                i51Var = i51Var2;
                i4 = 1;
                num = 0;
                wd5Var = wd5Var2;
                r4 = 0;
                go1Var2.d0(370833579);
                go1Var2.q(false);
                ez3Var = null;
            }
            Object Q7 = go1Var2.Q();
            Object obj6 = Q7;
            if (Q7 == jpVar) {
                obj6 = pt1.r(go1Var2);
            }
            ki1 ki1Var = (ki1) obj6;
            Object Q8 = go1Var2.Q();
            byte b = 6;
            Object obj7 = Q8;
            if (Q8 == jpVar) {
                oo0 oo0Var = new oo0(ki1Var, r4, b);
                go1Var2.o0(oo0Var);
                obj7 = oo0Var;
            }
            mw2.h(go1Var2, (hn1) obj7, wd5Var);
            Integer valueOf = Integer.valueOf(i);
            int i9 = (i5 & 896) == 256 ? i4 : 0;
            Object Q9 = go1Var2.Q();
            Object obj8 = Q9;
            if (i9 != 0 || Q9 == jpVar) {
                dw3 dw3Var = new dw3(i, ki1Var, r4, (byte) 0);
                go1Var2.o0(dw3Var);
                obj8 = dw3Var;
            }
            mw2.h(go1Var2, (hn1) obj8, valueOf);
            l13 D0 = i42.D0(mw2.p(l13Var.then(nq4.c), k80Var.p, mw2.j), 32.0f, 24.0f);
            ba0 a2 = z90.a(i42.e, q8.W, go1Var2, 54);
            long j = go1Var2.T;
            int i10 = (int) (j ^ (j >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, D0);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, a2);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i10));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            t43 t43Var3 = t43Var;
            r55.b("登录 myDV", null, k80Var.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var)).b.e, go1Var2, 1572870, 0, 131002);
            i13 i13Var = i13.a;
            oh4.a(go1Var2, nq4.g(i13Var, 8.0f));
            r55.b("扫描二维码添加Cookie或登录后即可使用", null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var)).b.j, go1Var2, 6, 0, 131066);
            oh4.a(go1Var2, nq4.g(i13Var, 32.0f));
            Integer valueOf2 = Integer.valueOf(i4);
            Integer[] numArr = new Integer[2];
            numArr[0] = num;
            numArr[i4] = valueOf2;
            List k0 = p70.k0(numArr);
            Integer valueOf3 = Integer.valueOf(((Number) t43Var3.getValue()).intValue());
            Object Q10 = go1Var2.Q();
            Object obj9 = Q10;
            if (Q10 == jpVar) {
                zw1 zw1Var = new zw1((byte) 22);
                go1Var2.o0(zw1Var);
                obj9 = zw1Var;
            }
            hn1 hn1Var = (hn1) obj9;
            Object Q11 = go1Var2.Q();
            Object obj10 = Q11;
            if (Q11 == jpVar) {
                xx2 xx2Var = new xx2(t43Var3, (byte) 12);
                go1Var2.o0(xx2Var);
                obj10 = xx2Var;
            }
            lq2.g(k0, valueOf3, hn1Var, (tm1) obj10, null, ki1Var, 44.0f, false, null, go1Var2, 1772934, 400);
            go1 go1Var3 = go1Var2;
            oh4.a(go1Var3, nq4.g(i13Var, 16.0f));
            if (((Number) t43Var3.getValue()).intValue() == i4) {
                go1Var3.d0(-907103928);
                if (ez3Var == null) {
                    go1Var3.d0(-907103929);
                    z = false;
                } else {
                    z = false;
                    go1Var3.d0(-907103928);
                    hy3.e(ez3Var, r4, go1Var3, 8);
                }
                go1Var3.q(z);
                go1Var3.q(z);
            } else {
                go1Var3.d0(-907054452);
                q(str, r4, go1Var3, 6);
                go1Var3.q(false);
            }
            go1Var3.q(true);
            go1Var = go1Var3;
        } else {
            go1Var2.W();
            go1Var = go1Var2;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new su3(hu2Var, l13Var, i, i2);
        }
    }

    public static final void s(final List list, final ag2 ag2Var, final ki1 ki1Var, final ki1 ki1Var2, final gu3 gu3Var, final rm1 rm1Var, final rm1 rm1Var2, final tm1 tm1Var, fe0 fe0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        Object obj;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        gu3 gu3Var2;
        kp kpVar;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1363956483);
        int i10 = 4;
        int i11 = i | (go1Var.g(list) ? 4 : 2) | (go1Var.g(ag2Var) ? 32 : 16) | (go1Var.g(ki1Var2) ? 2048 : 1024) | (go1Var.g(gu3Var) ? 16384 : 8192) | (go1Var.i(rm1Var) ? 131072 : 65536) | (go1Var.i(rm1Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (go1Var.i(tm1Var) ? 8388608 : 4194304);
        if (go1Var.T(i11 & 1, (4793491 & i11) != 4793490)) {
            int i12 = i11 & 14;
            boolean z2 = i12 == 4;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (z2 || Q == jpVar) {
                list.getClass();
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList(p70.J(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Author author = (Author) it.next();
                    if (jx4.L(author.getUid())) {
                        i4 = i11;
                        i5 = i10;
                        if (jx4.L(author.getSecUid())) {
                            str = "missing";
                        } else {
                            str = "secUid:" + author.getSecUid().length() + ":" + author.getSecUid();
                        }
                    } else {
                        i5 = i10;
                        i4 = i11;
                        str = "uid:" + author.getUid().length() + ":" + author.getUid();
                    }
                    Integer num = (Integer) hashMap.get(str);
                    int intValue = num != null ? num.intValue() : 0;
                    hashMap.put(str, Integer.valueOf(intValue + 1));
                    arrayList.add("user:" + str + ":" + intValue);
                    i11 = i4;
                    i10 = i5;
                }
                i2 = i11;
                i3 = i10;
                go1Var.o0(arrayList);
                obj = arrayList;
            } else {
                i2 = i11;
                i3 = 4;
                obj = Q;
            }
            List list2 = (List) obj;
            t43 x = ad4.x(rm1Var, go1Var);
            Integer valueOf = Integer.valueOf(list.size());
            boolean z3 = gu3Var.a;
            boolean z4 = gu3Var.b;
            Boolean valueOf2 = Boolean.valueOf(z3);
            Boolean valueOf3 = Boolean.valueOf(z4);
            Boolean valueOf4 = Boolean.valueOf(gu3Var.c);
            Object[] objArr = new Object[5];
            objArr[0] = ag2Var;
            objArr[1] = valueOf;
            objArr[2] = valueOf2;
            objArr[3] = valueOf3;
            objArr[i3] = valueOf4;
            int i13 = i2 & 57344;
            int i14 = i2 & 112;
            boolean g = (i12 == i3) | (i13 == 16384) | (i14 == 32) | go1Var.g(x);
            Object Q2 = go1Var.Q();
            if (g || Q2 == jpVar) {
                i6 = i13;
                i7 = i14;
                i8 = i12;
                z = z4;
                i9 = i2;
                gu3Var2 = gu3Var;
                n6 n6Var = new n6((Object) list, (Object) gu3Var2, (Object) ag2Var, (Object) x, (fj0) null, (byte) 14);
                go1Var.o0(n6Var);
                Q2 = n6Var;
            } else {
                i6 = i13;
                i7 = i14;
                i8 = i12;
                gu3Var2 = gu3Var;
                z = z4;
                i9 = i2;
            }
            mw2.k(objArr, (hn1) Q2, go1Var);
            ne1 ne1Var = nq4.c;
            li3 T = i42.T(0.0f, 0.0f, (gu3Var2.a || z) ? 0.0f : 30.0f, 7);
            kp kpVar2 = new kp(10.0f, true, new y9());
            boolean i15 = (i8 == 4) | ((i9 & 7168) == 2048) | go1Var.i(list2) | ((29360128 & i9) == 8388608) | (i6 == 16384) | ((3670016 & i9) == 1048576);
            Object Q3 = go1Var.Q();
            if (i15 || Q3 == jpVar) {
                kpVar = kpVar2;
                zt1 zt1Var = new zt1(list, gu3Var2, ki1Var, ki1Var2, list2, tm1Var, rm1Var2);
                go1Var.o0(zt1Var);
                Q3 = zt1Var;
            } else {
                kpVar = kpVar2;
            }
            e21.c(ne1Var, ag2Var, T, kpVar, null, null, false, null, (tm1) Q3, go1Var, i7 | 24582, 488);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(list, ag2Var, ki1Var, ki1Var2, gu3Var, rm1Var, rm1Var2, tm1Var, i) { // from class: dv3
                public final /* synthetic */ List I;
                public final /* synthetic */ ag2 J;
                public final /* synthetic */ ki1 K;
                public final /* synthetic */ ki1 L;
                public final /* synthetic */ gu3 M;
                public final /* synthetic */ rm1 N;
                public final /* synthetic */ rm1 O;
                public final /* synthetic */ tm1 P;

                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int X = mu0.X(385);
                    mw3.s(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (fe0) obj2, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void t(Author author, rm1 rm1Var, rm1 rm1Var2, l13 l13Var, fe0 fe0Var, int i) {
        int i2;
        rm1 rm1Var3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1139335960);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(author) : go1Var.i(author) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            rm1Var3 = rm1Var;
            i2 |= go1Var.i(rm1Var3) ? 32 : 16;
        } else {
            rm1Var3 = rm1Var;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(rm1Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.g(l13Var) ? 2048 : 1024;
        }
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q;
            t43 v = ut0.v(t33Var, go1Var, 6);
            t43 w = ut0.w(t33Var, go1Var);
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            long j = k80Var.q;
            long j2 = k80Var.s;
            cw4 t0 = p70.t0(((Boolean) v.getValue()).booleanValue(), k80Var.G, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "profileUserBg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) v.getValue()).booleanValue(), j, k80Var.v, "profileUserFg", go1Var, 3072);
            cw4 s02 = p70.s0(((Boolean) v.getValue()).booleanValue(), j2, k80Var.v, "profileUserMeta", go1Var, 3072);
            l13 C0 = i42.C0(r13.d(r7.u(14.0f, nq4.e(l13Var, 1.0f), t0), null, null, rm1Var2, null, rm1Var3, null, null, null, null, null, null, t33Var, 130799), 14.0f);
            u74 a2 = t74.a(new kp(10.0f, true, new y9()), q8.T, go1Var, 54);
            long j3 = go1Var.T;
            int i3 = (int) (j3 ^ (j3 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, C0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(i3);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            String str = (String) o70.U0(author.getAvatarMedium().getUrlList());
            if (str == null && (str = (String) o70.U0(author.getAvatarThumb().getUrlList())) == null) {
                str = "";
            }
            Object d0 = c5.d0(str, go1Var);
            i13 i13Var = i13.a;
            SingletonAsyncImageKt.m55AsyncImage10Xjiaw(d0, null, o7.m(nq4.k(i13Var, 40.0f), l74.a), null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1572912, 0, 1976);
            ba0 a3 = z90.a(i42.d, q8.V, go1Var, 0);
            long j4 = go1Var.T;
            int i4 = (int) (j4 ^ (j4 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, i13Var);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a3);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(i4, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            r55.b(author.getNickname(), p70.G(i13Var, s0, j, false, null, 12), j, 0L, qk1.N, 0L, null, 0L, 0, false, 0, 0, null, go1Var, 1572864, 0, 262072);
            r55.b("粉丝 " + DataModelKt.formatCount(author.getFollowerCount()) + " · 关注 " + DataModelKt.formatCount(author.getFollowingCount()), p70.G(i13Var, s02, j2, false, null, 12), j2, oh4.j(13), null, 0L, null, 0L, 0, false, 0, 0, null, go1Var, 24576, 0, 262120);
            go1Var = go1Var;
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new oc0(author, rm1Var, rm1Var2, l13Var, i, (byte) 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x053b, code lost:
    
        if ((defpackage.o70.V0(r15, r1) instanceof defpackage.px5) != false) goto L279;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final java.util.List r48, final java.util.Set r49, final defpackage.ki1 r50, final defpackage.ki1 r51, final defpackage.rm1 r52, final defpackage.gu3 r53, final defpackage.rm1 r54, final boolean r55, boolean r56, boolean r57, boolean r58, boolean r59, java.util.Map r60, java.lang.String r61, defpackage.tn5 r62, defpackage.rm1 r63, final defpackage.tm1 r64, defpackage.fe0 r65, final int r66, final int r67, final int r68) {
        /*
            Method dump skipped, instructions count: 2085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw3.u(java.util.List, java.util.Set, ki1, ki1, rm1, gu3, rm1, boolean, boolean, boolean, boolean, boolean, java.util.Map, java.lang.String, tn5, rm1, tm1, fe0, int, int, int):void");
    }

    public static final void v(List list, Map map, final String str, final tn5 tn5Var, rm1 rm1Var, final tm1 tm1Var, fe0 fe0Var, int i) {
        int i2;
        t43 t43Var;
        final rm1 rm1Var2;
        boolean z;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-949102959);
        int i3 = i | (go1Var.g(list) ? 4 : 2) | (go1Var.g(map) ? 32 : 16) | (go1Var.g(str) ? 256 : 128) | (go1Var.g(tn5Var) ? 2048 : 1024) | (go1Var.i(tm1Var) ? 131072 : 65536);
        if (go1Var.T(i3 & 1, (74899 & i3) != 74898)) {
            final k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            boolean z2 = ((bw0) go1Var.k(cw0.a)).a == ww5.I;
            final cj1 cj1Var = (cj1) go1Var.k(dj1.a);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = Integer.valueOf(Calendar.getInstance().get(1));
                go1Var.o0(Q);
            }
            int intValue = ((Number) Q).intValue();
            int i4 = i3 & 14;
            int i5 = i3 & 112;
            boolean z3 = (i4 == 4) | (i5 == 32);
            Object Q2 = go1Var.Q();
            if (z3 || Q2 == jpVar) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    tn5 Z = eg5.Z(eg5.h((Aweme) it.next(), map));
                    Integer valueOf = Z != null ? Integer.valueOf(Z.a) : null;
                    if (valueOf != null) {
                        arrayList.add(valueOf);
                    }
                }
                Q2 = o70.k1(o70.P0(o70.g1(arrayList, Integer.valueOf(intValue))), l63.K);
                go1Var.o0(Q2);
            }
            final List list2 = (List) Q2;
            boolean z4 = (i4 == 4) | (i5 == 32);
            Object Q3 = go1Var.Q();
            if (z4 || Q3 == jpVar) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    tn5 Z2 = eg5.Z(eg5.h((Aweme) it2.next(), map));
                    if (Z2 != null) {
                        arrayList2.add(Z2);
                    }
                }
                Q3 = sv2.w(new d63(arrayList2, (byte) 1));
                go1Var.o0(Q3);
            }
            final Map map2 = (Map) Q3;
            boolean g = go1Var.g(list2);
            Object Q4 = go1Var.Q();
            if (g || Q4 == jpVar) {
                Integer num = (Integer) o70.U0(list2);
                Q4 = ad4.w(Integer.valueOf(num != null ? num.intValue() : intValue));
                go1Var.o0(Q4);
            }
            final t43 t43Var2 = (t43) Q4;
            boolean g2 = go1Var.g(list2);
            Object Q5 = go1Var.Q();
            if (g2 || Q5 == jpVar) {
                Integer num2 = (Integer) o70.c1(map2.keySet());
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    Integer num3 = (Integer) o70.U0(list2);
                    if (num3 != null) {
                        intValue = num3.intValue();
                    }
                    i2 = (intValue * 100) + 12;
                }
                Q5 = ad4.w(Integer.valueOf(i2));
                go1Var.o0(Q5);
            }
            t43 t43Var3 = (t43) Q5;
            Object Q6 = go1Var.Q();
            if (Q6 == jpVar) {
                Q6 = pt1.r(go1Var);
            }
            final ki1 ki1Var = (ki1) Q6;
            Object Q7 = go1Var.Q();
            if (Q7 == jpVar) {
                t43Var = t43Var3;
                Q7 = new oo0(ki1Var, null, (byte) 7);
                go1Var.o0(Q7);
            } else {
                t43Var = t43Var3;
            }
            mw2.h(go1Var, (hn1) Q7, wd5.a);
            boolean z5 = (i3 & 7168) == 2048;
            Object Q8 = go1Var.Q();
            if (z5 || Q8 == jpVar) {
                rm1Var2 = rm1Var;
                z = false;
                Q8 = new ou3(tn5Var, rm1Var2, (byte) 0);
                go1Var.o0(Q8);
            } else {
                rm1Var2 = rm1Var;
                z = false;
            }
            rm1 rm1Var3 = (rm1) Q8;
            final boolean z6 = z2;
            final t43 t43Var4 = t43Var;
            d4.b(rm1Var3, new tw0(tn5Var == null ? true : z, tn5Var == null ? true : z, z), p70.u0(-189335526, new hn1() { // from class: pu3
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    vv vvVar;
                    l13 e;
                    final t43 t43Var5;
                    final t43 t43Var6;
                    final Map map3;
                    Object obj3;
                    int i6;
                    Object obj4;
                    sg sgVar = q8.a0;
                    sg sgVar2 = q8.d0;
                    sg sgVar3 = q8.b0;
                    sg sgVar4 = q8.c0;
                    fe0 fe0Var2 = (fe0) obj;
                    int intValue2 = ((Integer) obj2).intValue();
                    uv uvVar = q8.S;
                    tv tvVar = q8.V;
                    go1 go1Var2 = (go1) fe0Var2;
                    if (go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                        ne1 ne1Var = nq4.c;
                        boolean z7 = z6;
                        l13 C0 = i42.C0(ne1Var, z7 ? 16.0f : 48.0f);
                        cj1 cj1Var2 = cj1Var;
                        int ordinal = cj1Var2.a.ordinal();
                        if (ordinal == 0) {
                            vvVar = q8.N;
                        } else if (ordinal == 1) {
                            vvVar = q8.Q;
                        } else {
                            if (ordinal != 2) {
                                s83.v();
                                return null;
                            }
                            vvVar = q8.O;
                        }
                        uw2 c = px.c(vvVar, false);
                        long j = go1Var2.T;
                        int i7 = (int) (j ^ (j >>> 32));
                        am3 m = go1Var2.m();
                        l13 x0 = i42.x0(go1Var2, C0);
                        xd0.c.getClass();
                        go1Var2.h0();
                        boolean z8 = go1Var2.S;
                        df0 df0Var = wa2.A0;
                        if (z8) {
                            go1Var2.l(df0Var);
                        } else {
                            go1Var2.r0();
                        }
                        qi4.k(go1Var2, sgVar4, c);
                        qi4.k(go1Var2, sgVar3, m);
                        r7.G(i7, go1Var2, sgVar2, go1Var2);
                        qi4.k(go1Var2, sgVar, x0);
                        int ordinal2 = cj1Var2.a.ordinal();
                        i13 i13Var = i13.a;
                        if (ordinal2 == 0) {
                            e = nq4.e(i13Var, z7 ? 1.0f : 0.62f);
                        } else if (ordinal2 == 1) {
                            l13 e2 = nq4.e(i13Var, 1.0f);
                            r11 r11Var = new r11(cj1Var2.f() - 40.0f);
                            r11 r11Var2 = new r11(0.0f);
                            if (r11Var.compareTo(r11Var2) < 0) {
                                r11Var = r11Var2;
                            }
                            e = nq4.i(e2, 0.0f, r11Var.I, 1);
                        } else {
                            if (ordinal2 != 2) {
                                s83.v();
                                return null;
                            }
                            r11 r11Var3 = new r11(cj1Var2.g() - 40.0f);
                            r11 r11Var4 = new r11(0.0f);
                            if (r11Var3.compareTo(r11Var4) < 0) {
                                r11Var3 = r11Var4;
                            }
                            e = nq4.b(nq4.n(i13Var, r11Var3.I), 1.0f);
                        }
                        l13 m2 = o7.m(e, jo.f);
                        i51 i51Var = lw2.b;
                        l13 C02 = i42.C0(mw2.p(m2, ((fw2) go1Var2.k(i51Var)).a.G, mw2.j), 24.0f);
                        ba0 a2 = z90.a(new kp(14.0f, true, new y9()), tvVar, go1Var2, 6);
                        long j2 = go1Var2.T;
                        int i8 = (int) (j2 ^ (j2 >>> 32));
                        am3 m3 = go1Var2.m();
                        l13 x02 = i42.x0(go1Var2, C02);
                        go1Var2.h0();
                        if (go1Var2.S) {
                            go1Var2.l(df0Var);
                        } else {
                            go1Var2.r0();
                        }
                        qi4.k(go1Var2, sgVar4, a2);
                        qi4.k(go1Var2, sgVar3, m3);
                        r7.G(i8, go1Var2, sgVar2, go1Var2);
                        qi4.k(go1Var2, sgVar, x02);
                        ba0 a3 = z90.a(new kp(4.0f, true, new y9()), tvVar, go1Var2, 6);
                        long j3 = go1Var2.T;
                        int i9 = (int) (j3 ^ (j3 >>> 32));
                        am3 m4 = go1Var2.m();
                        l13 x03 = i42.x0(go1Var2, i13Var);
                        go1Var2.h0();
                        if (go1Var2.S) {
                            go1Var2.l(df0Var);
                        } else {
                            go1Var2.r0();
                        }
                        qi4.k(go1Var2, sgVar4, a3);
                        qi4.k(go1Var2, sgVar3, m4);
                        r7.G(i9, go1Var2, sgVar2, go1Var2);
                        qi4.k(go1Var2, sgVar, x03);
                        String concat = "按日期查找".concat(str);
                        m65 m65Var = ((fw2) go1Var2.k(i51Var)).b.h;
                        qk1 qk1Var = qk1.P;
                        k80 k80Var2 = k80Var;
                        uv uvVar2 = uvVar;
                        r55.b(concat, null, k80Var2.q, 0L, qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var2, 1572864, 0, 131002);
                        r55.b("选择年月，列表会定位到该月的第一项；还没加载的月份会继续下拉加载。", null, k80Var2.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(i51Var)).b.l, go1Var2, 6, 0, 131066);
                        go1 go1Var3 = go1Var2;
                        go1Var3.q(true);
                        u74 a4 = t74.a(new kp(14.0f, true, new y9()), uvVar2, go1Var3, 6);
                        long j4 = go1Var3.T;
                        int i10 = (int) (j4 ^ (j4 >>> 32));
                        am3 m5 = go1Var3.m();
                        l13 x04 = i42.x0(go1Var3, i13Var);
                        go1Var3.h0();
                        if (go1Var3.S) {
                            go1Var3.l(df0Var);
                        } else {
                            go1Var3.r0();
                        }
                        qi4.k(go1Var3, sgVar4, a4);
                        qi4.k(go1Var3, sgVar3, m5);
                        r7.G(i10, go1Var3, sgVar2, go1Var3);
                        qi4.k(go1Var3, sgVar, x04);
                        l13 n = nq4.n(i13Var, z7 ? 96.0f : 116.0f);
                        ba0 a5 = z90.a(new kp(6.0f, true, new y9()), tvVar, go1Var3, 6);
                        long j5 = go1Var3.T;
                        int i11 = (int) (j5 ^ (j5 >>> 32));
                        am3 m6 = go1Var3.m();
                        l13 x05 = i42.x0(go1Var3, n);
                        go1Var3.h0();
                        if (go1Var3.S) {
                            go1Var3.l(df0Var);
                        } else {
                            go1Var3.r0();
                        }
                        qi4.k(go1Var3, sgVar4, a5);
                        qi4.k(go1Var3, sgVar3, m6);
                        r7.G(i11, go1Var3, sgVar2, go1Var3);
                        qi4.k(go1Var3, sgVar, x05);
                        go1Var3.d0(-175284547);
                        Iterator it3 = list2.iterator();
                        while (true) {
                            boolean hasNext = it3.hasNext();
                            t43Var5 = t43Var2;
                            t43Var6 = t43Var4;
                            map3 = map2;
                            Iterator it4 = it3;
                            obj3 = de0.a;
                            if (!hasNext) {
                                break;
                            }
                            final int intValue3 = ((Number) it4.next()).intValue();
                            k80 k80Var3 = k80Var2;
                            boolean z9 = intValue3 == ((Number) t43Var5.getValue()).intValue();
                            String t = pt1.t(intValue3, " 年");
                            boolean g3 = go1Var3.g(t43Var5) | go1Var3.e(intValue3) | go1Var3.g(t43Var6) | go1Var3.i(map3);
                            Object Q9 = go1Var3.Q();
                            if (g3 || Q9 == obj3) {
                                Q9 = new rm1() { // from class: vu3
                                    @Override // defpackage.rm1
                                    public final Object invoke() {
                                        int i12 = intValue3;
                                        t43Var5.setValue(Integer.valueOf(i12));
                                        Set keySet = map3.keySet();
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj5 : keySet) {
                                            if (((Number) obj5).intValue() / 100 == i12) {
                                                arrayList3.add(obj5);
                                            }
                                        }
                                        Integer num4 = (Integer) o70.c1(arrayList3);
                                        t43Var6.setValue(Integer.valueOf(num4 != null ? num4.intValue() : (i12 * 100) + 12));
                                        return wd5.a;
                                    }
                                };
                                go1Var3.o0(Q9);
                            }
                            go1 go1Var4 = go1Var3;
                            mw3.e(t, null, z9, true, 48.0f, (rm1) Q9, z9 ? j42.x(i13Var, ki1Var) : i13Var, go1Var4, 27696);
                            go1Var3 = go1Var4;
                            it3 = it4;
                            k80Var2 = k80Var3;
                        }
                        k80 k80Var4 = k80Var2;
                        go1Var3.q(false);
                        go1Var3.q(true);
                        sc2 sc2Var = new sc2(1.0f, true);
                        Object obj5 = obj3;
                        ba0 a6 = z90.a(new kp(6.0f, true, new y9()), tvVar, go1Var3, 6);
                        long j6 = go1Var3.T;
                        int i12 = (int) (j6 ^ (j6 >>> 32));
                        am3 m7 = go1Var3.m();
                        l13 x06 = i42.x0(go1Var3, sc2Var);
                        xd0.c.getClass();
                        go1Var3.h0();
                        if (go1Var3.S) {
                            go1Var3.l(df0Var);
                        } else {
                            go1Var3.r0();
                        }
                        qi4.k(go1Var3, sgVar4, a6);
                        qi4.k(go1Var3, sgVar3, m7);
                        r7.G(i12, go1Var3, sgVar2, go1Var3);
                        qi4.k(go1Var3, sgVar, x06);
                        go1Var3.d0(-1057586106);
                        ArrayList N0 = o70.N0(o70.r1(new u22(1, 12, 1)), 4);
                        int size = N0.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj6 = N0.get(i13);
                            int i14 = i13 + 1;
                            List list3 = (List) obj6;
                            ArrayList arrayList3 = N0;
                            int i15 = size;
                            u74 a7 = t74.a(new kp(6.0f, true, new y9()), uvVar2, go1Var3, 6);
                            uv uvVar3 = uvVar2;
                            long j7 = go1Var3.T;
                            int i16 = (int) (j7 ^ (j7 >>> 32));
                            am3 m8 = go1Var3.m();
                            l13 x07 = i42.x0(go1Var3, i13Var);
                            xd0.c.getClass();
                            go1Var3.h0();
                            if (go1Var3.S) {
                                go1Var3.l(df0Var);
                            } else {
                                go1Var3.r0();
                            }
                            qi4.k(go1Var3, sgVar4, a7);
                            qi4.k(go1Var3, sgVar3, m8);
                            r7.G(i16, go1Var3, sgVar2, go1Var3);
                            qi4.k(go1Var3, sgVar, x07);
                            go1Var3.d0(535254558);
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                int intValue4 = ((Number) it5.next()).intValue();
                                int intValue5 = (((Number) t43Var5.getValue()).intValue() * 100) + intValue4;
                                Integer num4 = (Integer) map3.get(Integer.valueOf(intValue5));
                                int intValue6 = num4 != null ? num4.intValue() : 0;
                                String t2 = pt1.t(intValue4, " 月");
                                String t3 = intValue6 > 0 ? pt1.t(intValue6, " 个") : "未加载";
                                boolean z10 = intValue5 == ((Number) t43Var6.getValue()).intValue();
                                boolean z11 = intValue6 > 0;
                                boolean g4 = go1Var3.g(t43Var6) | go1Var3.e(intValue5);
                                Iterator it6 = it5;
                                Object Q10 = go1Var3.Q();
                                if (g4) {
                                    obj4 = obj5;
                                } else {
                                    obj4 = obj5;
                                    if (Q10 != obj4) {
                                        go1 go1Var5 = go1Var3;
                                        mw3.e(t2, t3, z10, z11, 56.0f, (rm1) Q10, new sc2(1.0f, true), go1Var5, 24576);
                                        t43Var6 = t43Var6;
                                        obj5 = obj4;
                                        map3 = map3;
                                        go1Var3 = go1Var5;
                                        it5 = it6;
                                    }
                                }
                                Q10 = new e03(intValue5, t43Var6);
                                go1Var3.o0(Q10);
                                go1 go1Var52 = go1Var3;
                                mw3.e(t2, t3, z10, z11, 56.0f, (rm1) Q10, new sc2(1.0f, true), go1Var52, 24576);
                                t43Var6 = t43Var6;
                                obj5 = obj4;
                                map3 = map3;
                                go1Var3 = go1Var52;
                                it5 = it6;
                            }
                            go1Var3.q(false);
                            go1Var3.q(true);
                            uvVar2 = uvVar3;
                            size = i15;
                            N0 = arrayList3;
                            i13 = i14;
                        }
                        t43 t43Var7 = t43Var6;
                        Map map4 = map3;
                        Object obj7 = obj5;
                        r7.J(go1Var3, false, true, true);
                        l13 e3 = nq4.e(i13Var, 1.0f);
                        u74 a8 = t74.a(new kp(10.0f, true, new y9()), q8.T, go1Var3, 54);
                        long j8 = go1Var3.T;
                        int i17 = (int) (j8 ^ (j8 >>> 32));
                        am3 m9 = go1Var3.m();
                        l13 x08 = i42.x0(go1Var3, e3);
                        xd0.c.getClass();
                        go1Var3.h0();
                        if (go1Var3.S) {
                            go1Var3.l(df0Var);
                        } else {
                            go1Var3.r0();
                        }
                        qi4.k(go1Var3, sgVar4, a8);
                        qi4.k(go1Var3, sgVar3, m9);
                        r7.G(i17, go1Var3, sgVar2, go1Var3);
                        qi4.k(go1Var3, sgVar, x08);
                        tn5 tn5Var2 = tn5Var;
                        if (tn5Var2 != null) {
                            go1Var3.d0(344501686);
                            go1 go1Var6 = go1Var3;
                            p70.i(null, 22.0f, 0L, go1Var6, 48, 5);
                            r55.b(hf1.v("加载到 ", tn5Var2.a, " 年 ", tn5Var2.b, " 月…"), nt3.x(i13Var, 1.0f), k80Var4.s, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var6.k(lw2.b)).b.l, go1Var6, 0, 24576, 114680);
                            go1Var3 = go1Var6;
                            i6 = 0;
                            go1Var3.q(false);
                        } else {
                            i6 = 0;
                            go1Var3.d0(344949140);
                            oh4.a(go1Var3, nt3.x(i13Var, 1.0f));
                            go1Var3.q(false);
                        }
                        boolean i18 = go1Var3.i(tn5Var2);
                        rm1 rm1Var4 = rm1Var2;
                        boolean g5 = i18 | go1Var3.g(rm1Var4);
                        Object Q11 = go1Var3.Q();
                        if (g5 || Q11 == obj7) {
                            Q11 = new ou3(tn5Var2, rm1Var4, (byte) 1);
                            go1Var3.o0(Q11);
                        }
                        p70.h(54, 8, go1Var3, (rm1) Q11, null, "取消", false);
                        Integer num5 = (Integer) map4.get(Integer.valueOf(((Number) t43Var7.getValue()).intValue()));
                        if (num5 != null) {
                            i6 = num5.intValue();
                        }
                        String str2 = i6 > 0 ? "跳转" : "加载并跳转";
                        boolean i19 = go1Var3.i(tn5Var2);
                        tm1 tm1Var2 = tm1Var;
                        boolean g6 = i19 | go1Var3.g(tm1Var2) | go1Var3.g(t43Var5) | go1Var3.g(t43Var7);
                        Object Q12 = go1Var3.Q();
                        if (g6 || Q12 == obj7) {
                            Q12 = new hc(tn5Var2, tm1Var2, t43Var5, t43Var7, (byte) 4);
                            go1Var3.o0(Q12);
                        }
                        p70.h(48, 8, go1Var3, (rm1) Q12, null, str2, true);
                        r7.J(go1Var3, true, true, true);
                    } else {
                        go1Var2.W();
                    }
                    return wd5.a;
                }
            }, go1Var), go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new eu1(list, map, str, tn5Var, rm1Var, tm1Var, i);
        }
    }

    public static final void w(tn5 tn5Var, int i, boolean z, String str, fe0 fe0Var, int i2) {
        go1 go1Var;
        m65 m65Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-428005422);
        int i3 = i2 | (go1Var2.g(tn5Var) ? 4 : 2) | (go1Var2.e(i) ? 32 : 16) | (go1Var2.h(z) ? 256 : 128) | (go1Var2.g(str) ? 2048 : 1024);
        if (go1Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            l13 G0 = i42.G0(nq4.e(i13.a, 1.0f), z ? 4.0f : 6.0f, z ? 10.0f : 14.0f, 0.0f, 2.0f, 4);
            u74 a2 = t74.a(new kp(8.0f, true, new y9()), q8.T, go1Var2, 54);
            long j = go1Var2.T;
            int i4 = (int) (j ^ (j >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, G0);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, a2);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            String str2 = tn5Var.a + " 年 " + tn5Var.b + " 月";
            if (z) {
                go1Var2.d0(-182565487);
                m65Var = ((fw2) go1Var2.k(i51Var)).b.i;
                go1Var2.q(false);
            } else {
                go1Var2.d0(-182493040);
                m65Var = ((fw2) go1Var2.k(i51Var)).b.h;
                go1Var2.q(false);
            }
            r55.b(str2, null, k80Var.q, 0L, qk1.P, 0L, null, 0L, 0, false, 1, 0, m65Var, go1Var2, 1572864, 24576, 114618);
            r55.b(i + " 个" + str, null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var2.k(i51Var)).b.o, go1Var2, 0, 24576, 114682);
            go1Var = go1Var2;
            px.a(mw2.p(nq4.g(new sc2(1.0f, true), 1.0f), k80Var.B, mw2.j), go1Var, 0);
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rv0(tn5Var, i, z, str, i2);
        }
    }

    public static final int x(fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(27999991);
        bw0 bw0Var = (bw0) go1Var.k(cw0.a);
        if (((cj1) go1Var.k(dj1.a)).a == br3.K) {
            go1Var.q(false);
            return 2;
        }
        int ordinal = bw0Var.a.ordinal();
        int i = ordinal != 0 ? ordinal != 1 ? (ordinal == 2 && bw0Var.b) ? 4 : 5 : 3 : 2;
        go1Var.q(false);
        return i;
    }

    public static final float y(fe0 fe0Var) {
        return ((bw0) ((go1) fe0Var).k(cw0.a)).a == ww5.I ? 8.0f : 10.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc A[EDGE_INSN: B:48:0x00fc->B:38:0x00fc BREAK  A[LOOP:1: B:41:0x00db->B:47:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00af -> B:10:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(defpackage.dw4 r9, defpackage.tm1 r10, defpackage.rm1 r11, defpackage.tn5 r12, defpackage.gj0 r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw3.z(dw4, tm1, rm1, tn5, gj0):java.lang.Object");
    }
}
