package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.RendererCapabilities;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonAsyncImagePainterKt;
import coil3.request.ImageRequest;
import coil3.size.Scale;
import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class un5 {
    public static final void a(Aweme aweme, rj3 rj3Var, l13 l13Var, fe0 fe0Var, int i) {
        int i2;
        rj3Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(107248067);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(aweme) : go1Var.i(aweme) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go1Var.g(rj3Var) : go1Var.i(rj3Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(l13Var) ? 256 : 128;
        }
        int i3 = i2;
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            String c = c(aweme);
            String f = p9.f(aweme);
            hv4 e = p9.e(aweme.getVideo().getWidth(), aweme.getVideo().getHeight(), null, false, go1Var, 12);
            x70 d = p9.d(f, false, go1Var, 48);
            ne1 ne1Var = nq4.c;
            l13 then = l13Var.then(ne1Var);
            then.getClass();
            l13 K = o7.K(then, new i9(e, (byte) 0));
            vv vvVar = q8.J;
            uw2 c2 = px.c(vvVar, false);
            int Q = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, K);
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
            qi4.k(go1Var, sgVar, c2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(Q);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            xh0.a(d, ma4.K, p70.u0(1258761832, new uh0(f, e, (byte) 13), go1Var), go1Var, 432);
            l13 p = mw2.p(new iv4(e), hx2.f, mw2.j);
            uw2 c3 = px.c(vvVar, false);
            int Q2 = i82.Q(go1Var.T);
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c3);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(Q2, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            if (c.length() > 0) {
                go1Var.d0(1170922228);
                ut0.a(rj3Var, null, ne1Var, null, li0.b, 0.0f, null, go1Var, rj3.$stable | 25008 | ((i3 >> 3) & 14), 104);
                go1Var = go1Var;
                go1Var.q(false);
            } else {
                go1Var.d0(1171150419);
                go1Var.q(false);
            }
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ve(aweme, rj3Var, l13Var, i, (byte) 10);
        }
    }

    public static final AsyncImagePainter b(String str, go1 go1Var) {
        tu0 tu0Var;
        Context context = (Context) go1Var.k(rb.b);
        fh2 fh2Var = (fh2) ((ru5) go1Var.k(hf0.u));
        jk3 jk3Var = fh2Var.b;
        if (jk3Var == null) {
            rm1 rm1Var = fh2Var.a;
            if (rm1Var == null || (tu0Var = (tu0) rm1Var.invoke()) == null) {
                tu0Var = tu0.c;
            }
            jk3Var = ad4.w(tu0Var);
            fh2Var.b = jk3Var;
            fh2Var.a = null;
        }
        long j = ((tu0) jk3Var.getValue()).a;
        boolean g = go1Var.g(context) | go1Var.g(str) | go1Var.f(j);
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            ImageRequest.Builder builder = new ImageRequest.Builder(context);
            if (str.length() <= 0) {
                str = null;
            }
            ImageRequest.Builder data = builder.data(str);
            int i = (int) (j >> 32);
            if (i < 1) {
                i = 1;
            }
            int i2 = (int) (j & 4294967295L);
            Q = data.size(i, i2 >= 1 ? i2 : 1).scale(Scale.FIT).build();
            go1Var.o0(Q);
        }
        return SingletonAsyncImagePainterKt.m57rememberAsyncImagePainter19ie5dc((ImageRequest) Q, null, null, li0.b, 0, go1Var, 3072, 22);
    }

    public static final String c(Aweme aweme) {
        aweme.getClass();
        String str = (String) o70.U0(aweme.getVideo().getOriginCover().getUrlList());
        if (str != null || (str = (String) o70.U0(aweme.getVideo().getCover().getUrlList())) != null) {
            return str;
        }
        String str2 = (String) o70.U0(aweme.getVideo().getDynamicCover().getUrlList());
        return str2 == null ? "" : str2;
    }
}
