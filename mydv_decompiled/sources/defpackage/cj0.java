package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class cj0 {
    public static final xi0 a;

    static {
        i51 i51Var = pe.a;
        long j = x70.c;
        long j2 = x70.b;
        a = new xi0(j, j2, j2, x70.c(j2, 0.38f), x70.c(j2, 0.38f));
    }

    public static final void a(xi0 xi0Var, l13 l13Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-527864079);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(xi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(l13Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(tc0Var) ? 256 : 128;
        }
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            uv uvVar = zi0.a;
            l13 G = wx5.G(i42.E0(wx5.Y(mw2.p(fb4.U(l13Var, 3.0f, l74.a(4.0f)), xi0Var.a, mw2.j)), 0.0f, zi0.d, 1), wx5.E(go1Var), true);
            int i3 = (i2 << 3) & 7168;
            ba0 a2 = z90.a(i42.d, q8.V, go1Var, 0);
            long j = go1Var.T;
            int i4 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, G);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            tc0Var.invoke(ea0.a, go1Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ve(xi0Var, l13Var, tc0Var, i, (byte) 2);
        }
    }

    public static final void b(l13 l13Var, xi0 xi0Var, final tm1 tm1Var, fe0 fe0Var, final int i, final int i2) {
        int i3;
        int i4;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-625529233);
        int i5 = i2 & 1;
        byte b = 4;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (go1Var.g(l13Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (go1Var.g(xi0Var) ? 32 : 16);
        }
        int i7 = i4 | (go1Var.i(tm1Var) ? 256 : 128);
        if (go1Var.T(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                l13Var = i13.a;
            }
            if (i6 != 0) {
                xi0Var = a;
            }
            a(xi0Var, l13Var, p70.u0(-250345048, new a91(tm1Var, xi0Var, b), go1Var), go1Var, ((i7 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i7 << 3) & 112));
        } else {
            go1Var.W();
        }
        final l13 l13Var2 = l13Var;
        final xi0 xi0Var2 = xi0Var;
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(xi0Var2, tm1Var, i, i2) { // from class: aj0
                public final /* synthetic */ xi0 J;
                public final /* synthetic */ tm1 K;
                public final /* synthetic */ byte L;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.L = i2;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(1);
                    cj0.b(l13.this, this.J, this.K, (fe0) obj, X, this.L);
                    return wd5.a;
                }
            };
        }
    }

    public static final void c(String str, boolean z, xi0 xi0Var, l13 l13Var, in1 in1Var, rm1 rm1Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-2001167027);
        if ((i & 6) == 0) {
            i2 = (go1Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var2.h(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var2.g(xi0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var2.g(l13Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var2.i(in1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go1Var2.i(rm1Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (go1Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            uv uvVar = zi0.a;
            float f = zi0.c;
            kp kpVar = new kp(f, true, new y9());
            boolean z2 = ((i3 & 458752) == 131072) | ((i3 & 112) == 32);
            Object Q = go1Var2.Q();
            if (z2 || Q == de0.a) {
                Q = new tj(z, rm1Var, (byte) 1);
                go1Var2.o0(Q);
            }
            l13 E0 = i42.E0(nq4.m(nq4.e(i42.g0(l13Var, z, str, null, null, (rm1) Q, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            u74 a2 = t74.a(kpVar, uvVar, go1Var2, 54);
            long j = go1Var2.T;
            int i4 = (int) (j ^ (j >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, E0);
            xd0.c.getClass();
            go1Var2.h0();
            boolean z3 = go1Var2.S;
            df0 df0Var = wa2.A0;
            if (z3) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var2, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var2, sgVar2, m);
            Integer valueOf = Integer.valueOf(i4);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var2, sgVar3, valueOf);
            qi4.j(go1Var2);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var2, sgVar4, x0);
            if (in1Var == null) {
                go1Var2.d0(-1597947094);
                go1Var2.q(false);
            } else {
                go1Var2.d0(-1597947093);
                float f2 = zi0.e;
                l13 j2 = nq4.j(i13.a, f2, 0.0f, f2, f2, 2);
                uw2 c = px.c(q8.J, false);
                long j3 = go1Var2.T;
                int i5 = (int) (j3 ^ (j3 >>> 32));
                am3 m2 = go1Var2.m();
                l13 x02 = i42.x0(go1Var2, j2);
                go1Var2.h0();
                if (go1Var2.S) {
                    go1Var2.l(df0Var);
                } else {
                    go1Var2.r0();
                }
                qi4.k(go1Var2, sgVar, c);
                qi4.k(go1Var2, sgVar2, m2);
                r7.G(i5, go1Var2, sgVar3, go1Var2);
                qi4.k(go1Var2, sgVar4, x02);
                in1Var.invoke(new x70(z ? xi0Var.c : xi0Var.e), go1Var2, 0);
                go1Var2.q(true);
                go1Var2.q(false);
            }
            long j4 = z ? xi0Var.b : xi0Var.d;
            qb.f(str, new sc2(1.0f, true), new m65(j4, zi0.h, zi0.i, null, zi0.k, zi0.b, zi0.j, 16613240), 0, false, 1, 0, null, go1Var2, (i3 & 14) | 1572864, 952);
            go1Var = go1Var2;
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj0(str, z, xi0Var, l13Var, in1Var, rm1Var, i);
        }
    }
}
