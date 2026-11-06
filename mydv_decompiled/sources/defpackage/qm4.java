package defpackage;

import android.graphics.Bitmap;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import com.github.mytv.dv.model.Author;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class qm4 {
    public static final i51 a = new i51(new wd3((byte) 26), (byte) 0);

    public static final void a(String str, String str2, String str3, cy3 cy3Var, boolean z, l13 l13Var, fe0 fe0Var, int i) {
        int i2;
        l13 l13Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(824223874);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.g(cy3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go1Var.g(l13Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (go1Var.T(i3 & 1, (i3 & 74899) != 74898)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            fg fgVar = (fg) go1Var.k(hf0.s);
            int i4 = i3 >> 3;
            int i5 = i4 & 14;
            Bitmap g = hy3.g(str2, cy3Var, go1Var, i4 & 910, 2);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), x70.f, k80Var.u, ((Boolean) ut0.w(t33Var, go1Var).getValue()).booleanValue(), "about_qr_bg", go1Var, 24624, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.q, k80Var.v, "about_qr_title", go1Var, 3072);
            cw4 s02 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.f, k80Var.v, "about_qr_url", go1Var, 3072);
            cw4 s03 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.s, k80Var.v, "about_qr_hint", go1Var, 3072);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new qd4(t43Var, (byte) 22);
                go1Var.o0(Q3);
            }
            l13 A0 = i42.A0(l13Var, (tm1) Q3);
            i13 i13Var = i13.a;
            if (z) {
                go1Var.d0(1805208835);
                l13Var2 = v(go1Var, i13Var);
                go1Var.q(false);
            } else {
                go1Var.d0(1805210058);
                go1Var.q(false);
                l13Var2 = i13Var;
            }
            l13 u = r7.u(16.0f, A0.then(l13Var2), t0);
            boolean i6 = go1Var.i(fgVar) | ((i3 & 112) == 32);
            Object Q4 = go1Var.Q();
            if (i6 || Q4 == jpVar) {
                Q4 = new jt2((Object) fgVar, (Object) str2, (byte) 21);
                go1Var.o0(Q4);
            }
            l13 D0 = i42.D0(mw2.B(r13.d(u, null, null, null, null, (rm1) Q4, null, null, null, null, null, null, t33Var, 130815), false, t33Var, 1), 8.0f, 12.0f);
            ba0 a2 = z90.a(new kp(12.0f, true, new y9()), q8.W, go1Var, 54);
            long j = go1Var.T;
            int i7 = (int) (j ^ (j >>> 32));
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
            qi4.k(go1Var, q8.d0, Integer.valueOf(i7));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            hy3.d(cy3Var, 180.0f, null, p70.u0(-1812010094, new a91(g, str, (byte) 2), go1Var), go1Var, ((i3 >> 9) & 14) | 3120);
            m65 m65Var = ((fw2) go1Var.k(i51Var)).b.i;
            qk1 qk1Var = qk1.P;
            long j2 = k80Var.q;
            r55.b(str, p70.G(i13Var, s0, j2, false, null, 12), j2, 0L, qk1Var, 0L, new k25(3), 0L, 0, false, 0, 0, m65Var, go1Var, (i3 & 14) | 1572864, 0, 129976);
            r55.b(str2, p70.G(i13Var, s02, k80Var.f, false, null, 12), k80Var.f, oh4.j(13), null, 0L, new k25(3), 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.l, go1Var, i5 | 24576, 0, 130024);
            r55.b(str3, p70.G(i13Var, s03, k80Var.s, false, null, 12), k80Var.s, oh4.j(11), null, 0L, new k25(3), 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.l, go1Var, ((i3 >> 6) & 14) | 24576, 0, 130024);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new bj0(str, str2, str3, cy3Var, z, l13Var, i);
        }
    }

    public static final void b(dl4 dl4Var, rm1 rm1Var, rm1 rm1Var2, rm1 rm1Var3, rm1 rm1Var4, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(299259225);
        int i2 = i | (go1Var.g(dl4Var) ? 4 : 2) | (go1Var.i(rm1Var3) ? 2048 : 1024) | (go1Var.i(rm1Var4) ? 16384 : 8192);
        if (go1Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = pt1.r(go1Var);
            }
            ki1 ki1Var = (ki1) Q;
            Object Q2 = go1Var.Q();
            fj0 fj0Var = null;
            if (Q2 == jpVar) {
                Q2 = new oo0(ki1Var, fj0Var, (byte) 10);
                go1Var.o0(Q2);
            }
            mw2.h(go1Var, (hn1) Q2, wd5.a);
            eu5.f(rm1Var, null, p70.u0(1329007601, new pl4(dl4Var, k80Var, rm1Var2, ki1Var, rm1Var3, rm1Var4, (byte) 0), go1Var), go1Var, 390);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new in2(dl4Var, rm1Var, rm1Var2, rm1Var3, rm1Var4, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.hx1 r31, final java.lang.String r32, final defpackage.rm1 r33, defpackage.ki1 r34, boolean r35, defpackage.fe0 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm4.c(hx1, java.lang.String, rm1, ki1, boolean, fe0, int, int):void");
    }

    public static final void d(String str, boolean z, rm1 rm1Var, tm1 tm1Var, rm1 rm1Var2, fe0 fe0Var, int i) {
        rm1 rm1Var3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-2136692011);
        int i2 = i | (go1Var.g(str) ? 4 : 2) | (go1Var.h(z) ? 32 : 16) | (go1Var.i(tm1Var) ? 2048 : 1024) | (go1Var.i(rm1Var2) ? 16384 : 8192);
        if (go1Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w("input");
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = ad4.w("");
                go1Var.o0(Q2);
            }
            t43 t43Var2 = (t43) Q2;
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = ad4.w("");
                go1Var.o0(Q3);
            }
            t43 t43Var3 = (t43) Q3;
            Object Q4 = go1Var.Q();
            if (Q4 == jpVar) {
                Q4 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q4);
            }
            t43 t43Var4 = (t43) Q4;
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            Object Q5 = go1Var.Q();
            if (Q5 == jpVar) {
                Q5 = pt1.r(go1Var);
            }
            ki1 ki1Var = (ki1) Q5;
            Object Q6 = go1Var.Q();
            fj0 fj0Var = null;
            if (Q6 == jpVar) {
                Q6 = new oo0(ki1Var, fj0Var, (byte) 11);
                go1Var.o0(Q6);
            }
            mw2.h(go1Var, (hn1) Q6, wd5.a);
            rm1Var3 = rm1Var;
            eu5.f(rm1Var3, null, p70.u0(295976813, new tl4(tm1Var, t43Var, t43Var2, t43Var4, t43Var3, k80Var, str, z, rm1Var2, ki1Var, (byte) 0), go1Var), go1Var, 390);
        } else {
            rm1Var3 = rm1Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qo2(str, z, rm1Var3, tm1Var, rm1Var2, i);
        }
    }

    public static final void e(String str, boolean z, rm1 rm1Var, ki1 ki1Var, fe0 fe0Var, int i) {
        jp jpVar;
        char c;
        long j;
        boolean z2;
        i51 i51Var;
        k80 k80Var;
        l13 l13Var;
        boolean z3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1967283798);
        int i2 = i | (go1Var.g(str) ? 4 : 2) | (go1Var.h(z) ? 32 : 16) | (go1Var.i(rm1Var) ? 256 : 128) | (go1Var.g(ki1Var) ? 2048 : 1024);
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = go1Var.Q();
            jp jpVar2 = de0.a;
            if (Q == jpVar2) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            i51 i51Var2 = lw2.b;
            k80 k80Var2 = ((fw2) go1Var.k(i51Var2)).a;
            l13 l13Var2 = i13.a;
            l13 m = o7.m(nq4.k(ki1Var != null ? j42.x(l13Var2, ki1Var) : l13Var2, 56.0f), l74.a(14.0f));
            if (z) {
                jpVar = jpVar2;
                c = ' ';
                if (((Boolean) t43Var.getValue()).booleanValue()) {
                    go1Var.d0(-774099752);
                    go1Var.q(false);
                    j = k80Var2.u;
                } else {
                    go1Var.d0(-774097801);
                    j = ((fw2) go1Var.k(i51Var2)).a.H;
                    go1Var.q(false);
                }
            } else {
                go1Var.d0(-774101670);
                go1Var.q(false);
                jpVar = jpVar2;
                c = ' ';
                j = x70.c(k80Var2.J, 0.0f);
            }
            l13 p = mw2.p(m, j, mw2.j);
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = new qd4(t43Var, (byte) 26);
                go1Var.o0(Q2);
            }
            l13 A0 = i42.A0(p, (tm1) Q2);
            if (z) {
                i51Var = i51Var2;
                k80Var = k80Var2;
                l13Var = l13Var2;
                z2 = false;
                l13Var2 = r13.d(l13Var, null, null, null, null, rm1Var, null, null, null, null, null, null, null, 261887);
            } else {
                z2 = false;
                i51Var = i51Var2;
                k80Var = k80Var2;
                l13Var = l13Var2;
            }
            l13 then = A0.then(l13Var2);
            uw2 c2 = px.c(q8.N, z2);
            long j2 = go1Var.T;
            int i3 = (int) (j2 ^ (j2 >>> c));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, then);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            if (z) {
                go1Var.d0(1295239363);
                if (j42.c(str, "⌫")) {
                    go1Var.d0(1295266984);
                    ow1.a(a5.F(), "删除", nq4.k(l13Var, 20.0f), ((Boolean) t43Var.getValue()).booleanValue() ? k80Var.v : k80Var.q, go1Var, 432);
                    go1Var.q(z2);
                    z3 = z2;
                } else if (j42.c(str, "←")) {
                    go1Var.d0(1295598095);
                    r55.b(str, null, ((Boolean) t43Var.getValue()).booleanValue() ? k80Var.v : k80Var.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.h, go1Var, (i2 & 14) | 1572864, 0, 131002);
                    go1Var = go1Var;
                    go1Var.q(false);
                    z3 = false;
                } else {
                    go1Var.d0(1295904592);
                    r55.b(str, null, ((Boolean) t43Var.getValue()).booleanValue() ? k80Var.v : k80Var.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.g, go1Var, (i2 & 14) | 1572864, 0, 131002);
                    go1Var = go1Var;
                    z3 = false;
                    go1Var.q(false);
                }
                go1Var.q(z3);
            } else {
                go1Var.d0(1296187870);
                go1Var.q(z2);
            }
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new g30(str, z, rm1Var, ki1Var, i);
        }
    }

    public static final void f(ArrayList arrayList, rm1 rm1Var, tm1 tm1Var, fe0 fe0Var, int i) {
        rm1Var.getClass();
        tm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-241505765);
        int i2 = (go1Var.g(arrayList) ? 4 : 2) | i | (go1Var.i(tm1Var) ? 256 : 128);
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w("");
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = pt1.r(go1Var);
            }
            ki1 ki1Var = (ki1) Q2;
            Object Q3 = go1Var.Q();
            fj0 fj0Var = null;
            if (Q3 == jpVar) {
                Q3 = new oo0(ki1Var, fj0Var, (byte) 12);
                go1Var.o0(Q3);
            }
            mw2.h(go1Var, (hn1) Q3, wd5.a);
            eu5.f(rm1Var, null, p70.u0(379364995, new gl4(k80Var, ki1Var, t43Var, rm1Var, arrayList, tm1Var, (byte) 0), go1Var), go1Var, 390);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tf((Object) arrayList, (Object) rm1Var, (Object) tm1Var, i, (byte) 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(com.github.mytv.dv.model.Author r20, float r21, defpackage.fe0 r22, int r23) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm4.g(com.github.mytv.dv.model.Author, float, fe0, int):void");
    }

    public static final void h(Author author, String str, String str2, rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(757515145);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(author) : go1Var.i(author) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.i(rm1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.g(l13Var) ? 16384 : 8192;
        }
        if (go1Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            t43 w = ut0.w(t33Var, go1Var);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            int i3 = i2;
            long j = k80Var.i;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.h, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "settings_account_bg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j, k80Var.v, "settings_account_fg", go1Var, 3072);
            l13 e = nq4.e(l13Var, 1.0f);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new qd4(t43Var, (byte) 11);
                go1Var.o0(Q3);
            }
            l13 D0 = i42.D0(r13.d(p70.H(o7.m(i42.A0(e, (tm1) Q3), jo.c), t0), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), 16.0f, 14.0f);
            u74 a2 = t74.a(new kp(12.0f, true, new y9()), q8.T, go1Var, 54);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, D0);
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
            Integer valueOf = Integer.valueOf(i4);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            g(author, 44.0f, go1Var, Author.$stable | 48 | (i3 & 14));
            sc2 sc2Var = new sc2(1.0f, true);
            ba0 a3 = z90.a(i42.d, q8.V, go1Var, 0);
            long j3 = go1Var.T;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, sc2Var);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a3);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(i5, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            m65 m65Var = ((fw2) go1Var.k(i51Var)).b.i;
            qk1 qk1Var = qk1.O;
            i13 i13Var = i13.a;
            r55.b(str, p70.G(i13Var, s0, j, false, null, 12), j, 0L, qk1Var, 0L, null, 0L, 2, false, 1, 0, m65Var, go1Var, ((i3 >> 3) & 14) | 1572864, 24960, 110520);
            r55.b(str2, p70.G(i13Var, s0, j, false, Float.valueOf(0.8f), 4), x70.c(j, 0.8f), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, (i3 >> 6) & 14, 0, 131064);
            go1Var = go1Var;
            go1Var.q(true);
            ow1.a(hc4.P(), null, p70.G(nq4.k(i13Var, 24.0f), s0, j, false, null, 12), j, go1Var, 48);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ra0(author, str, str2, rm1Var, l13Var, i, (byte) 2);
        }
    }

    public static final void i(bl4 bl4Var, String str, rm1 rm1Var, rm1 rm1Var2, l13 l13Var, fe0 fe0Var, int i) {
        boolean z;
        m65 m65Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2073449731);
        int i2 = i | (go1Var.e(bl4Var.ordinal()) ? 4 : 2) | (go1Var.g(str) ? 32 : 16) | (go1Var.i(rm1Var) ? 256 : 128) | (go1Var.i(rm1Var2) ? 2048 : 1024) | (go1Var.g(l13Var) ? 16384 : 8192);
        if (go1Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            t43 w = ut0.w(t33Var, go1Var);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            long j = k80Var.q;
            long j2 = k80Var.s;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), x70.f, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "settings_list_row_bg", go1Var, 24624, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j, k80Var.v, "settings_list_row_fg", go1Var, 3072);
            cw4 s02 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j2, k80Var.v, "settings_list_row_sub", go1Var, 3072);
            l13 i3 = nq4.i(nq4.e(l13Var, 1.0f), 64.0f, 0.0f, 2);
            boolean z2 = (i2 & 896) == 256;
            Object Q3 = go1Var.Q();
            if (z2 || Q3 == jpVar) {
                z = true;
                Q3 = new xl2(rm1Var, t43Var, (byte) 1);
                go1Var.o0(Q3);
            } else {
                z = true;
            }
            l13 D0 = i42.D0(r13.d(r7.u(12.0f, i42.A0(i3, (tm1) Q3), t0), null, null, null, null, rm1Var2, null, null, null, null, null, null, t33Var, 130815), 16.0f, 10.0f);
            u74 a2 = t74.a(new kp(14.0f, z, new y9()), q8.T, go1Var, 54);
            long j3 = go1Var.T;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, D0);
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
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(i4);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            s(bl4Var.J, go1Var, 0);
            sc2 sc2Var = new sc2(1.0f, z);
            ba0 a3 = z90.a(i42.d, q8.V, go1Var, 0);
            long j4 = go1Var.T;
            int i5 = (int) (j4 ^ (j4 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, sc2Var);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a3);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(i5, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            String str2 = bl4Var.I;
            m65 m65Var2 = ((fw2) go1Var.k(i51Var)).b.j;
            qk1 qk1Var = ((Boolean) t43Var.getValue()).booleanValue() ? qk1.P : qk1.N;
            i13 i13Var = i13.a;
            r55.b(str2, p70.G(i13Var, s0, j, false, null, 12), j, 0L, qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var2, go1Var, 0, 0, 131000);
            if (bl4Var == bl4.M) {
                go1Var.d0(-54808428);
                go1Var.q(false);
                m65Var = xc3.e;
            } else {
                go1Var.d0(-54807086);
                m65Var = ((fw2) go1Var.k(i51Var)).b.l;
                go1Var.q(false);
            }
            r55.b(str, p70.G(i13Var, s02, j2, false, null, 12), j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var, (i2 >> 3) & 14, 0, 131064);
            go1Var.q(true);
            ow1.a(e41.M(), null, p70.G(nq4.k(i13Var, 20.0f), s02, j2, false, null, 12), j2, go1Var, 48);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new in2(bl4Var, str, rm1Var, rm1Var2, l13Var, i);
        }
    }

    public static final void j(String str, hx1 hx1Var, Enum[] enumArr, Enum r37, tm1 tm1Var, tm1 tm1Var2, l13 l13Var, boolean z, String str2, fe0 fe0Var, int i, int i2) {
        boolean z2;
        int i3;
        String str3;
        int i4;
        String str4;
        go1 go1Var;
        l13 l13Var2;
        boolean z3;
        String str5;
        String str6;
        i13 i13Var;
        float f;
        boolean z4;
        enumArr.getClass();
        r37.getClass();
        tm1Var.getClass();
        tm1Var2.getClass();
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1421416375);
        int i5 = i | (go1Var2.g(hx1Var) ? 32 : 16) | (go1Var2.i(enumArr) ? 256 : 128) | (go1Var2.g(r37) ? 2048 : 1024) | (go1Var2.i(tm1Var) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i5 |= go1Var2.i(tm1Var2) ? 131072 : 65536;
        }
        int i6 = 1572864 | i5;
        int i7 = i2 & 128;
        if (i7 != 0) {
            i3 = i5 | 14155776;
            z2 = z;
        } else {
            z2 = z;
            i3 = i6 | (go1Var2.h(z2) ? 8388608 : 4194304);
        }
        int i8 = i2 & 256;
        if (i8 != 0) {
            i4 = i3 | 100663296;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i3 | (go1Var2.g(str3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432);
        }
        if (go1Var2.T(i4 & 1, (38347923 & i4) != 38347922)) {
            if (i7 != 0) {
                z2 = true;
            }
            String str7 = i8 != 0 ? null : str3;
            i13 i13Var2 = i13.a;
            l13 E0 = i42.E0(i13Var2, 0.0f, 8.0f, 1);
            ba0 a2 = z90.a(i42.d, q8.V, go1Var2, 0);
            long j = go1Var2.T;
            int i9 = (int) (j ^ (j >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, E0);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, a2);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i9));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            str4 = str;
            n(i4 & WebSocketProtocol.PAYLOAD_SHORT, go1Var2, hx1Var, str4);
            if (str7 != null) {
                go1Var2.d0(-559337783);
                i51 i51Var = lw2.b;
                m65 m65Var = ((fw2) go1Var2.k(i51Var)).b.l;
                long j2 = ((fw2) go1Var2.k(i51Var)).a.s;
                f = 8.0f;
                i13Var = i13Var2;
                r55.b(str7, i42.G0(i13Var2, 38.0f, 0.0f, 0.0f, 0.0f, 14), j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var2, ((i4 >> 24) & 14) | 48, 0, 131064);
                str6 = str7;
                go1Var = go1Var2;
                z4 = false;
                go1Var.q(false);
            } else {
                go1Var = go1Var2;
                str6 = str7;
                i13Var = i13Var2;
                f = 8.0f;
                z4 = false;
                go1Var.d0(-559045329);
                go1Var.q(false);
            }
            boolean z5 = z4;
            List asList = Arrays.asList(enumArr);
            asList.getClass();
            l13 v = v(go1Var, i13Var);
            i13 i13Var3 = i13Var;
            l13 G0 = i42.G0(i13Var3, 0.0f, f, 0.0f, 0.0f, 13);
            boolean z6 = (458752 & i4) == 131072 ? true : z5;
            Object Q = go1Var.Q();
            if (z6 || Q == de0.a) {
                Q = new ad2(tm1Var2, (byte) 2);
                go1Var.o0(Q);
            }
            boolean z7 = z2;
            lq2.g(asList, r37, (hn1) Q, tm1Var, G0, null, 44.0f, z7, v, go1Var, ((i4 >> 6) & 112) | 1597440 | ((i4 >> 3) & 7168) | (29360128 & i4), 32);
            go1Var.q(true);
            z3 = z7;
            str5 = str6;
            l13Var2 = i13Var3;
        } else {
            str4 = str;
            go1Var = go1Var2;
            go1Var.W();
            l13Var2 = l13Var;
            z3 = z2;
            str5 = str3;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new wc2(str4, hx1Var, enumArr, r37, tm1Var, tm1Var2, l13Var2, z3, str5, i, i2);
        }
    }

    public static final void k(String str, rm1 rm1Var, fe0 fe0Var, int i) {
        go1 go1Var;
        String str2 = str;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-2144219276);
        int i2 = i | (go1Var2.g(str2) ? 4 : 2) | (go1Var2.i(rm1Var) ? 32 : 16);
        if (go1Var2.T(i2 & 1, (i2 & 19) != 18)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var2.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var2);
            }
            t33 t33Var = (t33) Q2;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), x70.f, k80Var.u, ((Boolean) ut0.w(t33Var, go1Var2).getValue()).booleanValue(), "settings_portrait_back_bg", go1Var2, 24624, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.q, k80Var.v, "settings_portrait_back_fg", go1Var2, 3072);
            uv uvVar = q8.T;
            i13 i13Var = i13.a;
            l13 u = r7.u(12.0f, i42.G0(i13Var, 12.0f, 12.0f, 0.0f, 4.0f, 4), t0);
            Object Q3 = go1Var2.Q();
            if (Q3 == jpVar) {
                Q3 = new qd4(t43Var, (byte) 28);
                go1Var2.o0(Q3);
            }
            l13 D0 = i42.D0(mw2.B(r13.d(i42.A0(u, (tm1) Q3), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), false, null, 3), 12.0f, 8.0f);
            u74 a2 = t74.a(i42.b, uvVar, go1Var2, 48);
            long j = go1Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
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
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            ow1.a(c5.I(), "返回分类", p70.G(nq4.k(i13Var, 20.0f), s0, k80Var.q, false, null, 12), k80Var.q, go1Var2, 48);
            oh4.a(go1Var2, nq4.n(i13Var, 8.0f));
            m65 m65Var = ((fw2) go1Var2.k(i51Var)).b.h;
            qk1 qk1Var = qk1.P;
            long j2 = k80Var.q;
            str2 = str;
            r55.b(str2, p70.G(i13Var, s0, j2, false, null, 12), j2, 0L, qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var2, (i2 & 14) | 1572864, 0, 131000);
            go1Var = go1Var2;
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new bj1((byte) 22, i, str2, rm1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d8, code lost:
    
        if (r7 == null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54, types: [int] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(defpackage.hu2 r93, defpackage.l13 r94, int r95, defpackage.fe0 r96, int r97) {
        /*
            Method dump skipped, instructions count: 2293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm4.l(hu2, l13, int, fe0, int):void");
    }

    public static final void m(t43 t43Var, boolean z) {
        t43Var.setValue(Boolean.valueOf(z));
    }

    public static final void n(int i, fe0 fe0Var, hx1 hx1Var, String str) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1812057315);
        if ((i & 6) == 0) {
            i2 = i | (go1Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(hx1Var) ? 32 : 16;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            i13 i13Var = i13.a;
            l13 E0 = i42.E0(i13Var, 0.0f, 10.0f, 1);
            u74 a2 = t74.a(i42.b, q8.T, go1Var, 48);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
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
            s(hx1Var, go1Var, (i2 >> 3) & 14);
            oh4.a(go1Var, nq4.n(i13Var, 10.0f));
            i51 i51Var = lw2.b;
            r55.b(str, null, ((fw2) go1Var.k(i51Var)).a.q, oh4.j(15), qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.i, go1Var, (i2 & 14) | 1597440, 0, 130986);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qj((byte) 12, i, str, hx1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final java.lang.String r48, final java.lang.String r49, final boolean r50, final defpackage.rm1 r51, defpackage.l13 r52, java.lang.String r53, defpackage.fe0 r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm4.o(java.lang.String, java.lang.String, boolean, rm1, l13, java.lang.String, fe0, int, int):void");
    }

    public static final void p(final String str, final hx1 hx1Var, float f, final z60 z60Var, final int i, final String str2, final tm1 tm1Var, l13 l13Var, final float f2, final float f3, fe0 fe0Var, final int i2) {
        float f4;
        go1 go1Var;
        final l13 l13Var2;
        l13 l13Var3;
        Object yx2Var;
        jp jpVar;
        int i3;
        i13 i13Var;
        z60 z60Var2;
        Integer num;
        uj3 uj3Var;
        df0 df0Var;
        tm1Var.getClass();
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1790520365);
        int i4 = i2 | (go1Var2.g(hx1Var) ? 32 : 16) | (go1Var2.d(f) ? 256 : 128) | (go1Var2.g(z60Var) ? 2048 : 1024) | (go1Var2.g(str2) ? 131072 : 65536) | (go1Var2.i(tm1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912;
        if (go1Var2.T(i4 & 1, (306783379 & i4) != 306783378)) {
            go1Var2.Y();
            int i5 = i2 & 1;
            i13 i13Var2 = i13.a;
            if (i5 == 0 || go1Var2.C()) {
                l13Var3 = i13Var2;
            } else {
                go1Var2.W();
                l13Var3 = l13Var;
            }
            go1Var2.r();
            l13 E0 = i42.E0(l13Var3, 0.0f, 8.0f, 1);
            jp jpVar2 = i42.d;
            tv tvVar = q8.V;
            ba0 a2 = z90.a(jpVar2, tvVar, go1Var2, 0);
            long j = go1Var2.T;
            int i6 = (int) (j ^ (j >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, E0);
            xd0.c.getClass();
            go1Var2.h0();
            boolean z = go1Var2.S;
            df0 df0Var2 = wa2.A0;
            if (z) {
                go1Var2.l(df0Var2);
            } else {
                go1Var2.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var2, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var2, sgVar2, m);
            Integer valueOf = Integer.valueOf(i6);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var2, sgVar3, valueOf);
            qi4.j(go1Var2);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var2, sgVar4, x0);
            n(i4 & WebSocketProtocol.PAYLOAD_SHORT, go1Var2, hx1Var, str);
            Object Q = go1Var2.Q();
            jp jpVar3 = de0.a;
            if (Q == jpVar3) {
                Q = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q);
            }
            t43 t43Var = (t43) Q;
            k80 k80Var = ((fw2) go1Var2.k(lw2.b)).a;
            l13 l13Var4 = l13Var3;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.G, k80Var.H, false, "slider_row_bg", go1Var2, 24576, 8);
            boolean z2 = (i4 & 7168) == 2048;
            Object Q2 = go1Var2.Q();
            if (z2 || Q2 == jpVar3) {
                z60 z60Var3 = new z60(z60Var.a, z60Var.b);
                go1Var2.o0(z60Var3);
                Q2 = z60Var3;
            }
            z60 z60Var4 = (z60) Q2;
            l13 u = r7.u(16.0f, i42.G0(nq4.e(i13Var2, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), t0);
            Object Q3 = go1Var2.Q();
            if (Q3 == jpVar3) {
                Q3 = new qd4(t43Var, (byte) 23);
                go1Var2.o0(Q3);
            }
            l13 B = mw2.B(i42.A0(u, (tm1) Q3), false, null, 3);
            int i7 = 3670016 & i4;
            int i8 = i4 & 896;
            boolean g = (i7 == 1048576) | (i8 == 256) | go1Var2.g(z60Var4);
            Object Q4 = go1Var2.Q();
            if (g || Q4 == jpVar3) {
                jpVar = jpVar2;
                i3 = 256;
                i13Var = i13Var2;
                z60Var2 = z60Var4;
                yx2Var = new yx2(f2, tm1Var, f, z60Var2, (byte) 4);
                go1Var2.o0(yx2Var);
            } else {
                i13Var = i13Var2;
                z60Var2 = z60Var4;
                i3 = 256;
                yx2Var = Q4;
                jpVar = jpVar2;
            }
            rm1 rm1Var = (rm1) yx2Var;
            boolean g2 = (i7 == 1048576) | (i8 == i3) | go1Var2.g(z60Var2);
            Object Q5 = go1Var2.Q();
            if (g2 || Q5 == jpVar3) {
                yx2 yx2Var2 = new yx2(f2, tm1Var, f, z60Var2, (byte) 5);
                go1Var2.o0(yx2Var2);
                Q5 = yx2Var2;
            }
            rm1 rm1Var2 = (rm1) Q5;
            boolean g3 = (i7 == 1048576) | (i8 == i3) | go1Var2.g(z60Var2);
            Object Q6 = go1Var2.Q();
            if (g3 || Q6 == jpVar3) {
                num = 21;
                yx2 yx2Var3 = new yx2(f3, tm1Var, f, z60Var2, (byte) 6);
                go1Var2.o0(yx2Var3);
                Q6 = yx2Var3;
            } else {
                num = 21;
            }
            uj3 uj3Var2 = new uj3(num, (rm1) Q6);
            boolean g4 = (i7 == 1048576) | (i8 == i3) | go1Var2.g(z60Var2);
            Object Q7 = go1Var2.Q();
            if (g4 || Q7 == jpVar3) {
                uj3Var = uj3Var2;
                yx2 yx2Var4 = new yx2(f3, tm1Var, f, z60Var2, (byte) 7);
                go1Var2.o0(yx2Var4);
                Q7 = yx2Var4;
            } else {
                uj3Var = uj3Var2;
            }
            byte b = 1;
            l13 D0 = i42.D0(r13.d(B, rm1Var, rm1Var2, null, null, null, null, null, null, sv2.K(uj3Var, new uj3(22, (rm1) Q7)), null, null, null, 258042), 16.0f, 12.0f);
            ba0 a3 = z90.a(jpVar, tvVar, go1Var2, 0);
            long j2 = go1Var2.T;
            int i9 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var2.m();
            l13 x02 = i42.x0(go1Var2, D0);
            go1Var2.h0();
            if (go1Var2.S) {
                df0Var = df0Var2;
                go1Var2.l(df0Var);
            } else {
                df0Var = df0Var2;
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, a3);
            qi4.k(go1Var2, sgVar2, m2);
            r7.G(i9, go1Var2, sgVar3, go1Var2);
            qi4.k(go1Var2, sgVar4, x02);
            i13 i13Var3 = i13Var;
            l13 e = nq4.e(i13Var3, 1.0f);
            u74 a4 = t74.a(i42.f, q8.T, go1Var2, 54);
            long j3 = go1Var2.T;
            int i10 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var2.m();
            l13 x03 = i42.x0(go1Var2, e);
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, a4);
            qi4.k(go1Var2, sgVar2, m3);
            r7.G(i10, go1Var2, sgVar3, go1Var2);
            qi4.k(go1Var2, sgVar4, x03);
            z60 z60Var5 = z60Var2;
            r55.b(str2, null, k80Var.q, oh4.j(14), qk1.O, 0L, null, 0L, 0, false, 0, 0, null, go1Var2, (14 & (i4 >> 15)) | 1597440, 0, 262058);
            r55.b("左右键调节", null, k80Var.s, oh4.j(12), null, 0L, null, 0L, 0, false, 0, 0, null, go1Var2, 24582, 0, 262122);
            go1Var = go1Var2;
            go1Var.q(true);
            f4 = f;
            float q = ut0.q(f4, z60Var5.a, z60Var5.b);
            l13 e2 = nq4.e(i13Var3, 1.0f);
            Object Q8 = go1Var.Q();
            if (Q8 == jpVar3) {
                Q8 = new ol4((byte) 4);
                go1Var.o0(Q8);
            }
            l13 R = qg5.R(e2, (tm1) Q8);
            boolean g5 = go1Var.g(z60Var5) | (i7 == 1048576);
            Object Q9 = go1Var.Q();
            if (g5 || Q9 == jpVar3) {
                Q9 = new ay2(tm1Var, z60Var5, b);
                go1Var.o0(Q9);
            }
            or4.a(q, (tm1) Q9, R, false, z60Var5, i, null, null, go1Var, 196608);
            go1Var.q(true);
            go1Var.q(true);
            l13Var2 = l13Var4;
        } else {
            f4 = f;
            go1Var = go1Var2;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            final float f5 = f4;
            u2.d = new hn1(str, hx1Var, f5, z60Var, i, str2, tm1Var, l13Var2, f2, f3, i2) { // from class: ul4
                public final /* synthetic */ String I;
                public final /* synthetic */ hx1 J;
                public final /* synthetic */ float K;
                public final /* synthetic */ z60 L;
                public final /* synthetic */ byte M;
                public final /* synthetic */ String N;
                public final /* synthetic */ tm1 O;
                public final /* synthetic */ l13 P;
                public final /* synthetic */ float Q;
                public final /* synthetic */ float R;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(905994247);
                    qm4.p(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void q(tm1 tm1Var, float f, z60 z60Var, float f2) {
        tm1Var.invoke(Float.valueOf(ut0.q(f + f2, Float.valueOf(z60Var.a).floatValue(), Float.valueOf(z60Var.b).floatValue())));
    }

    public static final void r(final String str, final String str2, final boolean z, final tm1 tm1Var, l13 l13Var, fe0 fe0Var, final int i) {
        int i2;
        go1 go1Var;
        final l13 l13Var2;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-726167398);
        if ((i & 48) == 0) {
            i2 = (go1Var2.g(str2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (go1Var2.h(z) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= go1Var2.i(tm1Var) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if (go1Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            long j = ((fw2) go1Var2.k(lw2.b)).a.G;
            li3 li3Var = new li3(20.0f, 14.0f, 20.0f, 14.0f);
            i13 i13Var = i13.a;
            int i5 = i4 >> 3;
            go1Var = go1Var2;
            lq2.n(str, z, tm1Var, v(go1Var2, i42.E0(i13Var, 0.0f, 2.0f, 1)), null, str2, null, false, j, 0.0f, li3Var, Log.LOG_LEVEL_OFF, Log.LOG_LEVEL_OFF, go1Var, (i5 & 896) | (i5 & 112) | 6 | ((i4 << 12) & 458752), 438, 720);
            l13Var2 = i13Var;
        } else {
            go1Var = go1Var2;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ql4
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qm4.r(str, str2, z, tm1Var, l13Var2, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void s(hx1 hx1Var, fe0 fe0Var, int i) {
        int i2;
        hx1 hx1Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(438009870);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(hx1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            i13 i13Var = i13.a;
            l13 m = o7.m(nq4.k(i13Var, 28.0f), rt0.L(dw2.a.l(), go1Var));
            i51 i51Var = lw2.b;
            l13 p = mw2.p(m, ((fw2) go1Var.k(i51Var)).a.l, mw2.j);
            uw2 c = px.c(q8.N, false);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, p);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            hx1Var2 = hx1Var;
            ow1.a(hx1Var2, null, nq4.k(i13Var, 16.0f), ((fw2) go1Var.k(i51Var)).a.m, go1Var, (i2 & 14) | 432);
            go1Var.q(true);
        } else {
            hx1Var2 = hx1Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new zu0(hx1Var2, i, (byte) 6);
        }
    }

    public static final void t(boolean z, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1947238735);
        int i2 = (go1Var.h(z) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            long c = z ? x70.c(k80Var.v, 0.16f) : k80Var.l;
            long j = z ? k80Var.v : k80Var.m;
            i13 i13Var = i13.a;
            l13 E0 = i42.E0(mw2.p(nq4.g(i13Var, 26.0f), c, jo.a), 9.0f, 0.0f, 2);
            u74 a2 = t74.a(new kp(6.0f, true, new y9()), q8.T, go1Var, 54);
            long j2 = go1Var.T;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
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
            long j3 = j;
            ow1.a(c5.L(), null, nq4.k(i13Var, 14.0f), j3, go1Var, 432);
            r55.b("页面颜色与电视一致", null, j3, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, 6, 24576, 114682);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new c03(z, i);
        }
    }

    public static final l13 u(l13 l13Var, go1 go1Var) {
        l13Var.getClass();
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Q = new fk3(0.0f);
            go1Var.o0(Q);
        }
        fk3 fk3Var = (fk3) Q;
        Object Q2 = go1Var.Q();
        if (Q2 == jpVar) {
            Q2 = new fk3(0.0f);
            go1Var.o0(Q2);
        }
        fk3 fk3Var2 = (fk3) Q2;
        Object Q3 = go1Var.Q();
        if (Q3 == jpVar) {
            Q3 = new pm4(fk3Var, fk3Var2);
            go1Var.o0(Q3);
        }
        pm4 pm4Var = (pm4) Q3;
        Object Q4 = go1Var.Q();
        if (Q4 == jpVar) {
            Q4 = new ap3((Object) fk3Var, (Object) fk3Var2, (byte) 5);
            go1Var.o0(Q4);
        }
        return qb.u(o7.K(l13Var, (tm1) Q4), pm4Var);
    }

    public static final l13 v(fe0 fe0Var, l13 l13Var) {
        l13Var.getClass();
        go1 go1Var = (go1) fe0Var;
        ki1 ki1Var = (ki1) go1Var.k(a);
        if (ki1Var == null) {
            go1Var.d0(1653637317);
            go1Var.q(false);
            return l13Var;
        }
        go1Var.d0(1653568280);
        boolean g = go1Var.g(ki1Var);
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            Q = new vl2(ki1Var, (byte) 5);
            go1Var.o0(Q);
        }
        l13 R = qg5.R(l13Var, (tm1) Q);
        go1Var.q(false);
        return R;
    }
}
