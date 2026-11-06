package defpackage;

import android.content.Context;
import android.util.LruCache;
import androidx.media3.exoplayer.RendererCapabilities;
import com.materialkolor.LocalDynamicMaterialThemeSeedKt;
import com.materialkolor.ktx.ColorSchemeKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class xh0 {
    public static final long a = qb.j(4294847573L);
    public static final i51 b = new i51(vh0.J, (byte) 1);
    public static final i51 c = new i51(new df0(7), (byte) 1);
    public static final i51 d = new i51(new df0(29), (byte) 1);
    public static final i51 e = new i51(new df0(8), (byte) 1);

    public static final void a(x70 x70Var, ma4 ma4Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        long j;
        k80 k80Var;
        ma4Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-459869119);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(x70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.e(ma4Var.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(tc0Var) ? 256 : 128;
        }
        boolean z = true;
        byte b2 = 0;
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            bw0 bw0Var = (bw0) go1Var.k(cw0.a);
            r80 r80Var = (r80) go1Var.k(c);
            boolean z2 = r80Var.a == t80.K;
            x70 x70Var2 = z2 ? x70Var : null;
            z70 z70Var = bw0Var.d ? z70.M : z70.L;
            if (x70Var2 == null) {
                go1Var.d0(447423464);
                j = ((x70) go1Var.k(b)).a;
                go1Var.q(false);
            } else {
                go1Var.d0(447422658);
                go1Var.q(false);
                j = x70Var2.a;
            }
            long j2 = j;
            if (ma4Var.J) {
                go1Var.d0(985257541);
            } else {
                go1Var.d0(447424883);
                z = ((Boolean) go1Var.k(d)).booleanValue();
            }
            go1Var.q(false);
            vj3 c2 = z2 ? c(ma4Var, r80Var.b) : ma4Var.I;
            if (z2) {
                z70Var = r80Var.c;
            }
            double d2 = z70Var.K;
            boolean f = go1Var.f(j2) | go1Var.h(z) | go1Var.e(c2.ordinal()) | go1Var.c(d2);
            Object Q = go1Var.Q();
            if (f || Q == de0.a) {
                LruCache lruCache = va4.a;
                Q = va4.b(j2, z, c2, d2);
                go1Var.o0(Q);
            }
            k80 k80Var2 = (k80) Q;
            if (r80Var.e != v90.K || bw0Var.e) {
                go1Var.d0(985721932);
                go1Var.q(false);
                k80Var = k80Var2;
            } else {
                go1Var.d0(985672983);
                k80Var = ColorSchemeKt.animateColorScheme(k80Var2, null, null, go1Var, 0, 6);
                go1Var.q(false);
            }
            mw2.b(LocalDynamicMaterialThemeSeedKt.getLocalDynamicMaterialThemeSeed().a(new x70(j2)), p70.u0(1029675265, new uh0(k80Var, tc0Var, b2), go1Var), go1Var, 56);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new pc0(x70Var, ma4Var, tc0Var, i);
        }
    }

    public static final x70 b(String str, boolean z, boolean z2, int i, tm1 tm1Var, fe0 fe0Var, int i2, int i3) {
        x70 x70Var;
        String str2;
        tm1Var.getClass();
        if ((i3 & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        go1 go1Var = (go1) fe0Var;
        Context context = (Context) go1Var.k(rb.b);
        Object Q = go1Var.Q();
        Object obj = de0.a;
        if (Q == obj) {
            if (!z3) {
                i = 0;
            }
            Q = new gk3(i);
            go1Var.o0(Q);
        }
        s33 s33Var = (s33) Q;
        t43 x = ad4.x(tm1Var, go1Var);
        Boolean valueOf = Boolean.valueOf(z3);
        boolean h = go1Var.h(z3) | go1Var.g(x);
        Object Q2 = go1Var.Q();
        fj0 fj0Var = null;
        if (h || Q2 == obj) {
            Object kyVar = new ky(z3, s33Var, x, fj0Var, (byte) 2);
            x70Var = null;
            go1Var.o0(kyVar);
            Q2 = kyVar;
        } else {
            x70Var = null;
        }
        mw2.h(go1Var, (hn1) Q2, valueOf);
        Boolean valueOf2 = Boolean.valueOf(z);
        Boolean valueOf3 = Boolean.valueOf(z3);
        boolean h2 = go1Var.h(z) | go1Var.h(z3) | go1Var.g(str) | go1Var.i(context) | go1Var.g(x);
        Object Q3 = go1Var.Q();
        if (h2 || Q3 == obj) {
            str2 = str;
            Object wh0Var = new wh0(z, z3, str2, context, s33Var, x, null);
            s33Var = s33Var;
            go1Var.o0(wh0Var);
            Q3 = wh0Var;
        } else {
            str2 = str;
        }
        mw2.j(valueOf2, str2, valueOf3, (hn1) Q3, go1Var);
        gk3 gk3Var = (gk3) s33Var;
        return gk3Var.h() == 0 ? x70Var : new x70(qb.i(gk3Var.h()));
    }

    public static final vj3 c(ma4 ma4Var, s90 s90Var) {
        ma4Var.getClass();
        s90Var.getClass();
        int ordinal = s90Var.ordinal();
        vj3 vj3Var = null;
        if (ordinal != 0) {
            if (ordinal == 1) {
                vj3Var = vj3.J;
            } else if (ordinal == 2) {
                vj3Var = vj3.I;
            } else {
                if (ordinal != 3) {
                    s83.v();
                    return null;
                }
                vj3Var = vj3.L;
            }
        }
        return vj3Var == null ? ma4Var.I : vj3Var;
    }
}
