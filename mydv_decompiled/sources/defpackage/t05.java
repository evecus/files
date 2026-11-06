package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class t05 {
    public static final float a = (qg5.n0 - qg5.j0) / 2.0f;
    public static final ms4 b = new ms4();

    public static final void a(boolean z, l13 l13Var, s05 s05Var, fe0 fe0Var, int i) {
        int i2;
        s05 s05Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-263339167);
        if ((i & 6) == 0) {
            i2 = (go1Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(null) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(l13Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= go1Var.h(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            s05Var2 = s05Var;
            i3 |= go1Var.g(s05Var2) ? 131072 : 65536;
        } else {
            s05Var2 = s05Var;
        }
        int i4 = i3 | 1572864;
        if (go1Var.T(i4 & 1, (599187 & i4) != 599186)) {
            go1Var.Y();
            if ((i & 1) != 0 && !go1Var.C()) {
                go1Var.W();
            }
            go1Var.r();
            go1Var.d0(1768510810);
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = r7.v(go1Var);
            }
            go1Var.q(false);
            l13 r = nq4.r(l13Var.then(i13.a));
            float f = qg5.q0;
            float f2 = qg5.n0;
            int i5 = i4 << 3;
            int i6 = i4 >> 6;
            int i7 = (i6 & 7168) | (i5 & 112) | (i6 & 896) | (i5 & 57344);
            b(r.then(new mq4(f, f2, f, f2, false)), z, s05Var2, (t33) Q, in4.a(qg5.g0, go1Var), go1Var, i7);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rv0(z, (Object) l13Var, (Object) s05Var, i, (byte) 3);
        }
    }

    public static final void b(l13 l13Var, boolean z, s05 s05Var, t33 t33Var, dn4 dn4Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-670917213);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(l13Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.h(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.h(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.g(s05Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.i(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go1Var.g(t33Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= go1Var.g(dn4Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (go1Var.T(i2 & 1, (599187 & i2) != 599186)) {
            long j = z ? s05Var.b : s05Var.f;
            long j2 = z ? s05Var.a : s05Var.e;
            dn4 a2 = in4.a(qg5.p0, go1Var);
            i51 i51Var = d64.a;
            r64 r64Var = ((s64) go1Var.k(i51Var)).a;
            long j3 = j2;
            l13 p = mw2.p(j42.g(l13Var, qg5.o0, z ? s05Var.c : s05Var.g, a2), j, a2);
            i13 i13Var = i13.a;
            l13 then = p.then(i13Var);
            uw2 c = px.c(q8.J, false);
            long j4 = go1Var.T;
            int i3 = (int) (j4 ^ (j4 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, then);
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
            qi4.k(go1Var, sgVar, c);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(i3);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            l13 then2 = ux.a.align(i13Var, q8.M).then(new h75(t33Var, z, il2.j0(i23.I, go1Var)));
            float f = qg5.m0 / 2.0f;
            r64 r64Var2 = ((s64) go1Var.k(i51Var)).a;
            l13 p2 = mw2.p(kz1.a(then2, t33Var, d64.a(f, 220)), j3, dn4Var);
            uw2 c2 = px.c(q8.N, false);
            long j5 = go1Var.T;
            int i4 = (int) (j5 ^ (j5 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p2);
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
            go1Var.d0(1236071411);
            go1Var.q(false);
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new cu1(l13Var, z, s05Var, t33Var, dn4Var, i, (byte) 1);
        }
    }
}
