package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.MixInfo;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.TimeZone;
import java.util.WeakHashMap;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class fv4 {
    public static final DateTimeFormatter a;
    public static final DateTimeFormatter b;

    static {
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("HH:mm");
        ofPattern.getClass();
        a = ofPattern;
        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("EEE · M月d日", Locale.CHINA);
        ofPattern2.getClass();
        b = ofPattern2;
    }

    public static final void a(hx1 hx1Var, String str, String str2, boolean z, boolean z2, rm1 rm1Var, fe0 fe0Var, int i) {
        int i2;
        t43 t43Var;
        long j;
        i51 i51Var;
        i13 i13Var;
        boolean z3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-249626415);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(hx1Var) ? 4 : 2) | i;
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
            i2 |= go1Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go1Var.i(rm1Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (go1Var.T(i3 & 1, (i3 & 74899) != 74898)) {
            i51 i51Var2 = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var2)).a;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var2 = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            t43 w = ut0.w(t33Var, go1Var);
            if (z) {
                t43Var = t43Var2;
                j = k80Var.d;
            } else {
                t43Var = t43Var2;
                j = k80Var.q;
            }
            long j2 = j;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), z ? k80Var.c : k80Var.G, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "stage-action-bg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j2, k80Var.v, "stage-action-fg", go1Var, 3072);
            go1Var = go1Var;
            uv uvVar = q8.T;
            kp kpVar = new kp(z2 ? 12.0f : 8.0f, true, new y9());
            i13 i13Var2 = i13.a;
            l13 g = nq4.g(nq4.e(i13Var2, 1.0f), z2 ? 56.0f : 36.0f);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new gm4(t43Var, (byte) 4);
                go1Var.o0(Q3);
            }
            l13 E0 = i42.E0(mw2.B(r13.d(r7.u(z2 ? 16.0f : 10.0f, i42.A0(g, (tm1) Q3), t0), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), false, null, 3), z2 ? 20.0f : 12.0f, 0.0f, 2);
            u74 a2 = t74.a(kpVar, uvVar, go1Var, 48);
            long j3 = go1Var.T;
            int i4 = (int) (j3 ^ (j3 >>> 32));
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
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            int i5 = i3 >> 3;
            ow1.a(hx1Var, str2, p70.G(nq4.k(i13Var2, z2 ? 22.0f : 18.0f), s0, j2, false, null, 12), j2, go1Var, (i3 & 14) | (i5 & 112));
            if (str != null) {
                go1Var.d0(1221535276);
                i13Var = i13Var2;
                i51Var = i51Var2;
                r55.b(str, p70.G(i13Var2, s0, j2, false, null, 12), j2, 0L, null, 0L, null, 0L, 0, false, 1, 0, z2 ? xc3.c : xc3.d, go1Var, i5 & 14, 24576, 114680);
                go1Var = go1Var;
                z3 = false;
                go1Var.q(false);
            } else {
                i51Var = i51Var2;
                i13Var = i13Var2;
                z3 = false;
                go1Var.d0(1221830613);
                go1Var.q(false);
            }
            if (z2) {
                go1Var.d0(1221860838);
                oh4.a(go1Var, new sc2(1.0f, true));
                go1 go1Var2 = go1Var;
                r55.b(str2, p70.G(i13Var, s0, j2, false, null, 12), j2, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.m, go1Var2, (i3 >> 6) & 14, 24576, 114680);
                go1Var = go1Var2;
                go1Var.q(false);
            } else {
                i13 i13Var3 = i13Var;
                i51 i51Var3 = i51Var;
                if (str == null) {
                    go1Var.d0(1222229521);
                    go1 go1Var3 = go1Var;
                    r55.b(str2, p70.G(i13Var3, s0, j2, false, null, 12), j2, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var3)).b.m, go1Var3, (i3 >> 6) & 14, 24576, 114680);
                    go1Var = go1Var3;
                    go1Var.q(false);
                } else {
                    go1Var.d0(1222489301);
                    go1Var.q(z3);
                }
            }
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new lv3(hx1Var, str, str2, z, z2, rm1Var, i);
        }
    }

    public static final void b(final boolean z, final boolean z2, final boolean z3, final Aweme aweme, final boolean z4, final rm1 rm1Var, final rm1 rm1Var2, final rm1 rm1Var3, final rm1 rm1Var4, fe0 fe0Var, final int i) {
        int i2;
        boolean z5;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1198855176);
        if ((i & 6) == 0) {
            i2 = (go1Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.h(z2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.h(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? go1Var.g(aweme) : go1Var.i(aweme) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.h(z4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go1Var.i(rm1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= go1Var.i(rm1Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= go1Var.i(rm1Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= go1Var.i(rm1Var4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        int i3 = i2;
        if (go1Var.T(i3 & 1, (38347923 & i3) != 38347922)) {
            ba0 a2 = z90.a(new kp(z ? 12.0f : 10.0f, true, new y9()), q8.V, go1Var, 0);
            long j = go1Var.T;
            int i4 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, i13.a);
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
            if (z4) {
                go1Var.d0(-212021987);
                z5 = false;
                a(z2 ? sp0.O() : k21.G(), DataModelKt.formatCount(aweme.getStatistics().getDiggCount()), z2 ? "已点赞" : "点赞", z2, z, rm1Var, go1Var, (i3 & 458752) | ((i3 << 6) & 7168) | ((i3 << 12) & 57344));
                go1Var.q(false);
            } else {
                z5 = false;
                go1Var.d0(-211665456);
                go1Var.q(false);
            }
            int i5 = (i3 << 12) & 57344;
            a(j42.B(), DataModelKt.formatCount(aweme.getStatistics().getCommentCount()), "评论", false, z, rm1Var3, go1Var, i5 | 3456 | ((i3 >> 6) & 458752));
            if (z4) {
                go1Var.d0(-211348357);
                a(z3 ? wi4.o() : hc4.N(), DataModelKt.formatCount(aweme.getStatistics().getCollectCount()), z3 ? "已收藏" : "收藏", z3, z, rm1Var2, go1Var, ((i3 << 3) & 7168) | i5 | ((i3 >> 3) & 458752));
                go1Var.q(z5);
            } else {
                go1Var.d0(-210989904);
                go1Var.q(z5);
            }
            if (rm1Var4 != null) {
                go1Var.d0(-210953107);
                a(kb4.E(), null, "播放菜单", false, z, rm1Var4, go1Var, i5 | 3504 | ((i3 >> 9) & 458752));
                go1Var.q(z5);
            } else {
                go1Var.d0(-210704208);
                go1Var.q(z5);
            }
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: bv4
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fv4.b(z, z2, z3, aweme, z4, rm1Var, rm1Var2, rm1Var3, rm1Var4, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void c(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1649440473);
        if (go1Var.T(i & 1, i != 0)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(LocalDateTime.now());
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = new mt0(t43Var, null, (byte) 2);
                go1Var.o0(Q2);
            }
            mw2.h(go1Var, (hn1) Q2, wd5.a);
            ba0 a2 = z90.a(i42.d, q8.X, go1Var, 48);
            long j = go1Var.T;
            int i2 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, i13.a);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i2));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            String format = ((LocalDateTime) t43Var.getValue()).format(a);
            format.getClass();
            m65 m65Var = xc3.a;
            i51 i51Var = lw2.b;
            r55.b(format, null, ((fw2) go1Var.k(i51Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var, 0, 0, 131066);
            String format2 = ((LocalDateTime) t43Var.getValue()).format(b);
            format2.getClass();
            r55.b(format2, null, ((fw2) go1Var.k(i51Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, 0, 0, 131066);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new fa4((byte) 23, i);
        }
    }

    public static final void d(String str, fe0 fe0Var, int i) {
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-970768018);
        if (go1Var2.T(i & 1, (i & 3) != 2)) {
            i51 i51Var = lw2.b;
            go1Var = go1Var2;
            r55.b(str, null, ((fw2) go1Var2.k(i51Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var2.k(i51Var)).b.n, go1Var, 6, 24576, 114682);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn2(str, i, (byte) 6);
        }
    }

    public static final void e(ou4 ou4Var, final Aweme aweme, final MixInfo mixInfo, final rm1 rm1Var, final rm1 rm1Var2, final long j, final int i, final int i2, final String str, final tm1 tm1Var, fe0 fe0Var, final int i3) {
        int i4;
        go1 go1Var;
        ou4 ou4Var2;
        float f;
        float f2;
        l13 l13Var;
        m65 m65Var;
        df0 df0Var;
        ou4 ou4Var3;
        df0 df0Var2;
        m65 m65Var2;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1360192878);
        if ((i3 & 6) == 0) {
            i4 = (go1Var2.e(ou4Var.ordinal()) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? go1Var2.g(aweme) : go1Var2.i(aweme) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= (i3 & 512) == 0 ? go1Var2.g(mixInfo) : go1Var2.i(mixInfo) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= go1Var2.i(rm1Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= go1Var2.i(rm1Var2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= go1Var2.f(j) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= go1Var2.e(i) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= go1Var2.e(i2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= go1Var2.g(str) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i4 |= go1Var2.i(tm1Var) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i5 = i4;
        if (go1Var2.T(i5 & 1, (i4 & 306783379) != 306783378)) {
            k80 C = ut0.C(go1Var2);
            int ordinal = ou4Var.ordinal();
            if (ordinal == 0) {
                f = 48.0f;
            } else if (ordinal == 1) {
                f = 56.0f;
            } else {
                if (ordinal != 2) {
                    s83.v();
                    return;
                }
                f = 36.0f;
            }
            String str2 = (String) o70.U0(aweme.getAuthor().getAvatarThumb().getUrlList());
            if (str2 == null && (str2 = (String) o70.U0(aweme.getAuthor().getAvatarMedium().getUrlList())) == null) {
                str2 = "";
            }
            ou4 ou4Var4 = ou4.Compact;
            kp kpVar = new kp(ou4Var == ou4Var4 ? 8.0f : 14.0f, true, new y9());
            tv tvVar = q8.V;
            ba0 a2 = z90.a(kpVar, tvVar, go1Var2, 0);
            long j2 = go1Var2.T;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var2.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var2, i13Var);
            xd0.c.getClass();
            go1Var2.h0();
            boolean z = go1Var2.S;
            df0 df0Var3 = wa2.A0;
            if (z) {
                go1Var2.l(df0Var3);
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
            uv uvVar = q8.T;
            kp kpVar2 = new kp(ou4Var == ou4Var4 ? 8.0f : 12.0f, true, new y9());
            jp jpVar = de0.a;
            if (tm1Var != null) {
                go1Var2.d0(743052968);
                Author author = aweme.getAuthor();
                f2 = f;
                boolean z2 = ((i5 & C.ENCODING_PCM_DOUBLE) == 536870912) | ((i5 & 112) == 32 || ((i5 & 64) != 0 && go1Var2.i(aweme)));
                Object Q = go1Var2.Q();
                if (z2 || Q == jpVar) {
                    Q = new ik0(tm1Var, aweme, (byte) 3);
                    go1Var2.o0(Q);
                }
                l13Var = m05.b(i13Var, author, (PointerInputEventHandler) Q);
                go1Var2.q(false);
            } else {
                f2 = f;
                go1Var2.d0(743273502);
                go1Var2.q(false);
                l13Var = i13Var;
            }
            u74 a3 = t74.a(kpVar2, uvVar, go1Var2, 48);
            String str3 = str2;
            long j3 = go1Var2.T;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            am3 m2 = go1Var2.m();
            l13 x02 = i42.x0(go1Var2, l13Var);
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(df0Var3);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, a3);
            qi4.k(go1Var2, sgVar2, m2);
            r7.G(i7, go1Var2, sgVar3, go1Var2);
            qi4.k(go1Var2, sgVar4, x02);
            Object d0 = c5.d0(str3, go1Var2);
            l13 k = nq4.k(i13Var, f2);
            long j4 = C.a;
            k74 k74Var = l74.a;
            SingletonAsyncImageKt.m55AsyncImage10Xjiaw(d0, "头像", mw2.p(o7.m(i42.C0(j42.g(k, 2.0f, j4, k74Var), 3.0f), k74Var), C.H, mw2.j), null, null, null, li0.a, 0.0f, null, 0, false, go1Var2, 1572912, 0, 1976);
            l13 x = nt3.x(i13Var, 1.0f);
            ba0 a4 = z90.a(i42.d, tvVar, go1Var2, 0);
            long j5 = go1Var2.T;
            int i8 = (int) (j5 ^ (j5 >>> 32));
            am3 m3 = go1Var2.m();
            l13 x03 = i42.x0(go1Var2, x);
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(df0Var3);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, a4);
            qi4.k(go1Var2, sgVar2, m3);
            r7.G(i8, go1Var2, sgVar3, go1Var2);
            qi4.k(go1Var2, sgVar4, x03);
            String w = hf1.w("@", aweme.getAuthor().getNickname());
            int ordinal2 = ou4Var.ordinal();
            if (ordinal2 == 0) {
                go1Var2.d0(1083397165);
                m65Var = ut0.H(go1Var2).h;
                go1Var2.q(false);
            } else if (ordinal2 == 1) {
                go1Var2.d0(1083399820);
                m65Var = ut0.H(go1Var2).g;
                go1Var2.q(false);
            } else if (ordinal2 != 2) {
                go1Var2.d0(1083394779);
                go1Var2.q(false);
                s83.v();
                return;
            } else {
                go1Var2.d0(1083402476);
                m65Var = ut0.H(go1Var2).i;
                go1Var2.q(false);
            }
            r55.b(w, null, C.q, 0L, qk1.P, 0L, null, 0L, 2, false, 1, 0, m65Var, go1Var2, 1572864, 24960, 110522);
            ou4Var2 = ou4Var;
            go1Var = go1Var2;
            if (ou4Var2 == ou4Var4 || aweme.getCreateTime() <= 0) {
                df0Var = df0Var3;
                go1Var.d0(-773280832);
                go1Var.q(false);
            } else {
                go1Var.d0(-773927585);
                Locale locale = qb.L((Configuration) go1Var.k(rb.a)).a.get(0);
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                df0Var = df0Var3;
                boolean f3 = go1Var.f(aweme.getCreateTime()) | go1Var.g(locale) | go1Var.g(TimeZone.getDefault().getID());
                Object Q2 = go1Var.Q();
                if (f3 || Q2 == jpVar) {
                    Q2 = on5.H0(aweme.getCreateTime());
                    go1Var.o0(Q2);
                }
                r55.b((String) Q2, null, C.s, 0L, null, 0L, null, 0L, 0, false, 1, 0, xc3.e, go1Var, 0, 24576, 114682);
                go1Var.q(false);
            }
            go1Var.q(true);
            go1Var.q(true);
            if (ou4Var2 == ou4Var4 || mixInfo == null) {
                go1Var.d0(745329670);
                go1Var.q(false);
            } else {
                go1Var.d0(745276815);
                i(mixInfo, go1Var, MixInfo.$stable | ((i5 >> 6) & 14));
                go1Var.q(false);
            }
            if (jx4.L(aweme.getDesc())) {
                go1Var.d0(745785990);
                go1Var.q(false);
            } else {
                go1Var.d0(745394553);
                String desc = aweme.getDesc();
                if (ou4Var2 == ou4Var4) {
                    go1Var.d0(745483771);
                    m65Var2 = ut0.H(go1Var).k;
                    go1Var.q(false);
                } else {
                    go1Var.d0(745564092);
                    m65Var2 = ut0.H(go1Var).j;
                    go1Var.q(false);
                }
                r55.b(desc, null, C.q, 0L, null, 0L, null, 0L, 2, false, 4, 0, m65Var2, go1Var, 0, 24960, 110586);
                go1Var.q(false);
            }
            ou4 ou4Var5 = ou4.Tv;
            if (ou4Var2 == ou4Var5) {
                go1Var.d0(745861754);
                kp kpVar3 = new kp(12.0f, true, new y9());
                l13 G0 = i42.G0(i13Var, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                ba0 a5 = z90.a(kpVar3, tvVar, go1Var, 6);
                long j6 = go1Var.T;
                int i9 = (int) (j6 ^ (j6 >>> 32));
                am3 m4 = go1Var.m();
                l13 x04 = i42.x0(go1Var, G0);
                go1Var.h0();
                if (go1Var.S) {
                    df0Var2 = df0Var;
                    go1Var.l(df0Var2);
                } else {
                    df0Var2 = df0Var;
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, a5);
                qi4.k(go1Var, sgVar2, m4);
                r7.G(i9, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x04);
                l13 e = nq4.e(i13Var, 1.0f);
                jp jpVar2 = i42.b;
                uv uvVar2 = q8.S;
                u74 a6 = t74.a(jpVar2, uvVar2, go1Var, 0);
                long j7 = go1Var.T;
                int i10 = (int) (j7 ^ (j7 >>> 32));
                am3 m5 = go1Var.m();
                l13 x05 = i42.x0(go1Var, e);
                go1Var.h0();
                ou4Var3 = ou4Var5;
                if (go1Var.S) {
                    go1Var.l(df0Var2);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, a6);
                qi4.k(go1Var, sgVar2, m5);
                r7.G(i10, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x05);
                l(DataModelKt.formatCount(aweme.getStatistics().getDiggCount()), "点赞", nt3.x(i13Var, 1.0f), go1Var, 48);
                l(DataModelKt.formatCount(aweme.getStatistics().getCommentCount()), "评论", nt3.x(i13Var, 1.0f), go1Var, 48);
                go1Var.q(true);
                l13 e2 = nq4.e(i13Var, 1.0f);
                u74 a7 = t74.a(jpVar2, uvVar2, go1Var, 0);
                long j8 = go1Var.T;
                int i11 = (int) (j8 ^ (j8 >>> 32));
                am3 m6 = go1Var.m();
                l13 x06 = i42.x0(go1Var, e2);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var2);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, a7);
                qi4.k(go1Var, sgVar2, m6);
                r7.G(i11, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x06);
                l(DataModelKt.formatCount(aweme.getStatistics().getCollectCount()), "收藏", nt3.x(i13Var, 1.0f), go1Var, 48);
                l(DataModelKt.formatCount(aweme.getStatistics().getShareCount()), "分享", nt3.x(i13Var, 1.0f), go1Var, 48);
                r7.J(go1Var, true, true, false);
            } else {
                ou4Var3 = ou4Var5;
                go1Var.d0(746559750);
                go1Var.q(false);
            }
            if (ou4Var2 != ou4Var4) {
                go1Var.d0(746617813);
                h(rm1Var, rm1Var2, j, i, i2, str, ou4Var2 == ou4Var3, go1Var, (i5 >> 9) & 524286);
                go1Var.q(false);
            } else {
                go1Var.d0(747033926);
                go1Var.q(false);
            }
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            ou4Var2 = ou4Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            final ou4 ou4Var6 = ou4Var2;
            u.d = new hn1() { // from class: dv4
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fv4.e(ou4.this, aweme, mixInfo, rm1Var, rm1Var2, j, i, i2, str, tm1Var, (fe0) obj, mu0.X(i3 | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void f(String str, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(715573901);
        if (go1Var.T(i & 1, (i & 3) != 2)) {
            vv vvVar = q8.N;
            l13 m = o7.m(nq4.p(nq4.i(i13.a, 22.0f, 0.0f, 2), 26.0f, 0.0f, 2), l74.a(6.0f));
            i51 i51Var = lw2.b;
            l13 E0 = i42.E0(mw2.p(m, x70.c(((fw2) go1Var.k(i51Var)).a.q, 0.14f), mw2.j), 6.0f, 0.0f, 2);
            uw2 c = px.c(vvVar, false);
            long j = go1Var.T;
            int i2 = (int) (j ^ (j >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c);
            qi4.k(go1Var, q8.b0, m2);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i2));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            r55.b(str, null, ((fw2) go1Var.k(i51Var)).a.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, xc3.f, go1Var, 1572870, 0, 131002);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn2(str, i, (byte) 5);
        }
    }

    public static final void g(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1945179496);
        if (go1Var.T(i & 1, i != 0)) {
            u74 a2 = t74.a(new kp(8.0f, true, new y9()), q8.T, go1Var, 54);
            long j = go1Var.T;
            int i2 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, i13.a);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i2));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            f("←", go1Var, 6);
            d("相关", go1Var, 6);
            f("→", go1Var, 6);
            d("进度", go1Var, 6);
            f("OK", go1Var, 6);
            d("暂停 · 长按菜单", go1Var, 6);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new fa4((byte) 22, i);
        }
    }

    public static final void h(final rm1 rm1Var, final rm1 rm1Var2, final long j, final int i, final int i2, final String str, final boolean z, fe0 fe0Var, final int i3) {
        final rm1 rm1Var3;
        int i4;
        String str2;
        go1 go1Var;
        x04 u;
        hn1 hn1Var;
        String K0;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(410707667);
        if ((i3 & 6) == 0) {
            rm1Var3 = rm1Var;
            i4 = (go1Var2.i(rm1Var3) ? 4 : 2) | i3;
        } else {
            rm1Var3 = rm1Var;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= go1Var2.i(rm1Var2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var2.f(j) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= go1Var2.e(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= go1Var2.e(i2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            str2 = str;
            i4 |= go1Var2.g(str2) ? 131072 : 65536;
        } else {
            str2 = str;
        }
        if ((1572864 & i3) == 0) {
            i4 |= go1Var2.h(z) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (go1Var2.T(i4 & 1, (599187 & i4) != 599186)) {
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = new hk3(((Number) rm1Var3.invoke()).longValue());
                go1Var2.o0(Q);
            }
            hk3 hk3Var = (hk3) Q;
            boolean z2 = (i4 & 112) == 32;
            Object Q2 = go1Var2.Q();
            String str3 = null;
            if (z2 || Q2 == jpVar) {
                Q2 = new gu2(rm1Var2, hk3Var, (fj0) null, (byte) 19);
                go1Var2.o0(Q2);
            }
            mw2.h(go1Var2, (hn1) Q2, rm1Var2);
            long h = hk3Var.h();
            if (i <= 0 || i2 <= 0) {
                K0 = on5.K0(str2);
            } else {
                K0 = i + "×" + i2;
            }
            if (z) {
                go1Var2.d0(-968803647);
                Locale locale = qb.L((Configuration) go1Var2.k(rb.a)).a.get(0);
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                boolean g = go1Var2.g(locale);
                Object Q3 = go1Var2.Q();
                if (g || Q3 == jpVar) {
                    Q3 = new DecimalFormat("#.#", new DecimalFormatSymbols(locale));
                    go1Var2.o0(Q3);
                }
                DecimalFormat decimalFormat = (DecimalFormat) Q3;
                long L0 = on5.L0(go1Var2);
                if (L0 < 1022976) {
                    str3 = (L0 / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) + " KB/s";
                } else {
                    str3 = r7.B(decimalFormat.format(Float.valueOf((L0 / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) / 1024.0f)), " MB/s");
                }
                go1Var2.q(false);
            } else {
                go1Var2.d0(-968507350);
                go1Var2.q(false);
            }
            long j2 = j < 0 ? 0L : j;
            mk2 K = p70.K();
            if (K0 != null && !jx4.L(K0)) {
                K.add(K0);
            }
            if (j2 > 0) {
                K.add(on5.G0(ut0.s(h, 0L, j2)) + " / " + on5.G0(j2));
            }
            if (str3 != null) {
                K.add(str3);
            }
            mk2 D = p70.D(K);
            if (D.isEmpty()) {
                u = go1Var2.u();
                if (u != null) {
                    final byte b2 = 0;
                    hn1Var = new hn1() { // from class: wu4
                        @Override // defpackage.hn1
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b2;
                            wd5 wd5Var = wd5.a;
                            int i5 = i3;
                            switch (b3) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    int X = mu0.X(i5 | 1);
                                    fv4.h(rm1Var3, rm1Var2, j, i, i2, str, z, (fe0) obj, X);
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    int X2 = mu0.X(i5 | 1);
                                    fv4.h(rm1Var3, rm1Var2, j, i, i2, str, z, (fe0) obj, X2);
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    u.d = hn1Var;
                }
                return;
            }
            go1Var = go1Var2;
            r55.b(o70.Z0(D, " · ", null, null, 0, null, 62), null, ((fw2) go1Var2.k(lw2.b)).a.s, 0L, null, 0L, null, 0L, 0, false, 2, 0, xc3.e, go1Var, 0, 24576, 114682);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        u = go1Var.u();
        if (u != null) {
            final byte b3 = 1;
            hn1Var = new hn1() { // from class: wu4
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    byte b32 = b3;
                    wd5 wd5Var = wd5.a;
                    int i5 = i3;
                    switch (b32) {
                        case 0:
                            ((Integer) obj2).intValue();
                            int X = mu0.X(i5 | 1);
                            fv4.h(rm1Var, rm1Var2, j, i, i2, str, z, (fe0) obj, X);
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            int X2 = mu0.X(i5 | 1);
                            fv4.h(rm1Var, rm1Var2, j, i, i2, str, z, (fe0) obj, X2);
                            break;
                    }
                    return wd5Var;
                }
            };
            u.d = hn1Var;
        }
    }

    public static final void i(MixInfo mixInfo, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2147183209);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? go1Var.g(mixInfo) : go1Var.i(mixInfo) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            int max = Math.max(mixInfo.getStatis().getTotalEpisode(), mixInfo.getStatis().getUpdatedToEpisode());
            int currentEpisode = mixInfo.getStatis().getCurrentEpisode();
            String z = (currentEpisode <= 0 || max <= 0) ? currentEpisode > 0 ? r7.z(" · 第", currentEpisode, "集") : "" : r7.x(currentEpisode, max, " · ", "/");
            uv uvVar = q8.T;
            kp kpVar = new kp(6.0f, true, new y9());
            i13 i13Var = i13.a;
            l13 D0 = i42.D0(mw2.p(o7.m(nq4.i(i13Var, 26.0f, 0.0f, 2), l74.a(8.0f)), k80Var.h, mw2.j), 9.0f, 4.0f);
            u74 a2 = t74.a(kpVar, uvVar, go1Var, 54);
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
            ow1.a(li4.g(), null, nq4.k(i13Var, 16.0f), k80Var.i, go1Var, 432);
            String mixName = mixInfo.getMixName();
            if (jx4.L(mixName)) {
                mixName = "未命名合集";
            }
            r55.b(mixName, nq4.p(i13Var, 0.0f, 120.0f, 1), k80Var.i, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, 48, 24960, 110584);
            go1Var = go1Var;
            if (z.length() > 0) {
                go1Var.d0(1163814544);
                r55.b(z, null, k80Var.i, 0L, null, 0L, null, 0L, 0, false, 1, 0, xc3.e, go1Var, 0, 24576, 114682);
                go1Var = go1Var;
                go1Var.q(false);
            } else {
                go1Var.d0(1164013781);
                go1Var.q(false);
            }
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new zu0(mixInfo, i, (byte) 8);
        }
    }

    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r15v21 */
    public static final void j(final Aweme aweme, final float f, final float f2, final boolean z, fe0 fe0Var, final int i) {
        int i2;
        go1 go1Var;
        ?? r15;
        Object b2;
        rm1 rm1Var;
        xx3 xx3Var;
        k80 k80Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(585155674);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var2.g(aweme) : go1Var2.i(aweme) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var2.d(f) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var2.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var2.h(z) ? 2048 : 1024;
        }
        if (go1Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            xx3 xx3Var2 = lw2.b;
            k80 k80Var2 = ((fw2) go1Var2.k(xx3Var2)).a;
            String str = (String) o70.U0(aweme.getVideo().getCover().getUrlList());
            if (str == null && (str = (String) o70.U0(aweme.getVideo().getOriginCover().getUrlList())) == null) {
                str = "";
            }
            cw4 b3 = eh.b(z ? 1.0f : 0.0f, ((fw2) go1Var2.k(xx3Var2)).d.d(), "nextUpGlow", go1Var2, 3072);
            long j = k80Var2.c;
            boolean g = go1Var2.g(b3) | go1Var2.g(k80Var2);
            Object Q = go1Var2.Q();
            Object obj = de0.a;
            if (g || Q == obj) {
                Q = dt4.b(new ev4(k80Var2, b3, (byte) 0));
                go1Var2.o0(Q);
            }
            cw4 cw4Var = (cw4) Q;
            boolean g2 = go1Var2.g(b3) | go1Var2.g(k80Var2);
            Object Q2 = go1Var2.Q();
            if (g2 || Q2 == obj) {
                Q2 = dt4.b(new ev4(k80Var2, b3, (byte) 2));
                go1Var2.o0(Q2);
            }
            cw4 cw4Var2 = (cw4) Q2;
            boolean g3 = go1Var2.g(b3) | go1Var2.g(k80Var2);
            Object Q3 = go1Var2.Q();
            if (g3 || Q3 == obj) {
                r15 = 1;
                b2 = dt4.b(new ev4(k80Var2, b3, (byte) 1));
                go1Var2.o0(b2);
            } else {
                b2 = Q3;
                r15 = 1;
            }
            cw4 cw4Var3 = (cw4) b2;
            kp kpVar = new kp(10.0f, r15, new y9());
            boolean g4 = go1Var2.g(b3) | go1Var2.f(j);
            Object Q4 = go1Var2.Q();
            if (g4 || Q4 == obj) {
                Q4 = new bm2(b3, j, r15);
                go1Var2.o0(Q4);
            }
            i13 i13Var = i13.a;
            l13 t = j42.t(i13Var, (tm1) Q4);
            tv tvVar = q8.V;
            ba0 a2 = z90.a(kpVar, tvVar, go1Var2, 6);
            long j2 = go1Var2.T;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, t);
            xd0.c.getClass();
            go1Var2.h0();
            boolean z2 = go1Var2.S;
            rm1 rm1Var2 = wa2.A0;
            if (z2) {
                go1Var2.l(rm1Var2);
            } else {
                go1Var2.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var2, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var2, sgVar2, m);
            Integer valueOf = Integer.valueOf(i3);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var2, sgVar3, valueOf);
            qi4.j(go1Var2);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var2, sgVar4, x0);
            String str2 = z ? "即将播放" : "下一个";
            m65 m65Var = ((fw2) go1Var2.k(xx3Var2)).b.n;
            qk1 qk1Var = qk1.P;
            long j3 = k80Var2.a;
            String str3 = str;
            r55.b(str2, p70.G(i13Var, cw4Var, j3, false, null, 12), j3, 0L, qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var2, 1572864, 0, 131000);
            u74 a3 = t74.a(new kp(12.0f, true, new y9()), q8.T, go1Var2, 54);
            long j4 = go1Var2.T;
            int i4 = (int) (j4 ^ (j4 >>> 32));
            am3 m2 = go1Var2.m();
            l13 x02 = i42.x0(go1Var2, i13Var);
            go1Var2.h0();
            if (go1Var2.S) {
                rm1Var = rm1Var2;
                go1Var2.l(rm1Var);
            } else {
                rm1Var = rm1Var2;
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, a3);
            qi4.k(go1Var2, sgVar2, m2);
            r7.G(i4, go1Var2, sgVar3, go1Var2);
            qi4.k(go1Var2, sgVar4, x02);
            rm1 rm1Var3 = rm1Var;
            SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str3, go1Var2), null, mw2.p(o7.m(nq4.l(i13Var, f, f2), l74.a(10.0f)), k80Var2.H, mw2.j), null, null, null, li0.a, 0.0f, null, 0, false, go1Var2, 1572912, 0, 1976);
            go1 go1Var3 = go1Var2;
            kp kpVar2 = new kp(4.0f, true, new y9());
            sc2 sc2Var = new sc2(1.0f, true);
            ba0 a4 = z90.a(kpVar2, tvVar, go1Var3, 6);
            long j5 = go1Var3.T;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            am3 m3 = go1Var3.m();
            l13 x03 = i42.x0(go1Var3, sc2Var);
            go1Var3.h0();
            if (go1Var3.S) {
                go1Var3.l(rm1Var3);
            } else {
                go1Var3.r0();
            }
            qi4.k(go1Var3, sgVar, a4);
            qi4.k(go1Var3, sgVar2, m3);
            r7.G(i5, go1Var3, sgVar3, go1Var3);
            qi4.k(go1Var3, sgVar4, x03);
            if (jx4.L(aweme.getDesc())) {
                xx3Var = xx3Var2;
                k80Var = k80Var2;
                go1Var3.d0(1598014008);
                go1Var3.q(false);
            } else {
                go1Var3.d0(1597625206);
                String desc = aweme.getDesc();
                xx3Var = xx3Var2;
                m65 m65Var2 = ((fw2) go1Var3.k(xx3Var)).b.i;
                k80Var = k80Var2;
                long j6 = k80Var.q;
                r55.b(desc, p70.G(i13Var, cw4Var2, j6, false, null, 12), j6, 0L, null, 0L, null, 0L, 2, false, 2, 0, m65Var2, go1Var3, 0, 24960, 110584);
                go1Var3 = go1Var3;
                go1Var3.q(false);
            }
            String w = hf1.w("@", aweme.getAuthor().getNickname());
            m65 m65Var3 = ((fw2) go1Var3.k(xx3Var)).b.n;
            long j7 = k80Var.s;
            go1 go1Var4 = go1Var3;
            r55.b(w, p70.G(i13Var, cw4Var3, j7, false, null, 12), j7, 0L, null, 0L, null, 0L, 2, false, 1, 0, m65Var3, go1Var4, 0, 24960, 110584);
            go1Var = go1Var4;
            r7.J(go1Var, true, true, true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: cv4
                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    fv4.j(Aweme.this, f, f2, z, (fe0) obj2, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(final ru4 ru4Var, final boolean z, final boolean z2, final boolean z3, final Aweme aweme, final MixInfo mixInfo, Aweme aweme2, boolean z4, final rm1 rm1Var, final rm1 rm1Var2, final long j, final int i, final int i2, final String str, final boolean z5, final boolean z6, final boolean z7, final tm1 tm1Var, final rm1 rm1Var3, final rm1 rm1Var4, final rm1 rm1Var5, final rm1 rm1Var6, final ki1 ki1Var, final rm1 rm1Var7, fe0 fe0Var, final int i3) {
        int i4;
        rm1 rm1Var8;
        final Aweme aweme3;
        final boolean z8;
        int i5;
        ux uxVar;
        float f;
        i13 i13Var;
        float f2;
        vv vvVar;
        int i6;
        ou4 ou4Var;
        ta1 ta1Var;
        bc1 bc1Var;
        go1 go1Var;
        boolean z9;
        boolean z10;
        boolean z11;
        vv vvVar2 = q8.M;
        vv vvVar3 = q8.P;
        ru4Var.getClass();
        final ou4 ou4Var2 = ru4Var.b;
        float f3 = ou4Var2.J;
        float f4 = ou4Var2.I;
        rm1Var.getClass();
        rm1Var3.getClass();
        rm1Var4.getClass();
        rm1Var5.getClass();
        rm1Var6.getClass();
        ki1Var.getClass();
        rm1Var7.getClass();
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1515670560);
        if ((i3 & 6) == 0) {
            i4 = (go1Var2.g(ru4Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= go1Var2.h(z) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var2.h(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= go1Var2.h(z3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= (32768 & i3) == 0 ? go1Var2.g(aweme) : go1Var2.i(aweme) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i4 |= (262144 & i3) == 0 ? go1Var2.g(mixInfo) : go1Var2.i(mixInfo) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= (2097152 & i3) == 0 ? go1Var2.g(aweme2) : go1Var2.i(aweme2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= go1Var2.h(z4) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            rm1Var8 = rm1Var;
            i4 |= go1Var2.i(rm1Var8) ? 67108864 : 33554432;
        } else {
            rm1Var8 = rm1Var;
        }
        if ((i3 & 805306368) == 0) {
            i4 |= go1Var2.i(rm1Var2) ? 536870912 : 268435456;
        }
        int i7 = i4;
        boolean z12 = (((((((((go1Var2.f(j) ? (char) 4 : (char) 2) | (go1Var2.e(i) ? ' ' : (char) 16) ? 1 : 0) | (go1Var2.e(i2) ? (char) 256 : (char) 128) ? 1 : 0) | (go1Var2.g(str) ? (char) 2048 : (char) 1024) ? 1 : 0) | (go1Var2.h(z5) ? (char) 16384 : (char) 8192) ? 1 : 0) | (go1Var2.h(z6) ? (char) 0 : (char) 0) ? 1 : 0) | (go1Var2.h(z7) ? (char) 0 : (char) 0) ? 1 : 0) | (go1Var2.i(tm1Var) ? (char) 0 : (char) 0) ? 1 : 0) | (go1Var2.i(rm1Var3) ? (char) 0 : (char) 0) ? 1 : 0) | (go1Var2.i(rm1Var4) ? (char) 0 : (char) 0);
        int i8 = 384 | (go1Var2.i(rm1Var5) ? 4 : 2) | (go1Var2.i(rm1Var6) ? 32 : 16) | (go1Var2.i(rm1Var7) ? 2048 : 1024);
        if (go1Var2.T(i7 & 1, ((i7 & 306783379) == 306783378 && ((z12 ? 1 : 0) & 9363) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            iu0 iu0Var = (iu0) go1Var2.k(hf0.h);
            da2 da2Var = (da2) go1Var2.k(hf0.n);
            WeakHashMap weakHashMap = dw5.w;
            vd5 vd5Var = wi4.h(go1Var2).l;
            float F = iu0Var.F(vd5Var.d(iu0Var, da2Var)) + f4;
            float F2 = iu0Var.F(vd5Var.b(iu0Var, da2Var)) + f4;
            float F3 = iu0Var.F(vd5Var.a(iu0Var)) + f3;
            float F4 = iu0Var.F(vd5Var.c(iu0Var)) + f3;
            r11 r11Var = new r11(ru4Var.h);
            r11 r11Var2 = new r11((ru4Var.a() - F) - 24.0f);
            r11 r11Var3 = new r11(0.0f);
            if (r11Var2.compareTo(r11Var3) < 0) {
                r11Var2 = r11Var3;
            }
            float f5 = ((r11) j42.P(r11Var, r11Var2)).I;
            r11 r11Var4 = new r11(ru4Var.i);
            r11 r11Var5 = new r11((ru4Var.a() - F2) - 24.0f);
            r11 r11Var6 = new r11(0.0f);
            if (r11Var5.compareTo(r11Var6) < 0) {
                r11Var5 = r11Var6;
            }
            float f6 = ((r11) j42.P(r11Var4, r11Var5)).I;
            i51 i51Var = lw2.b;
            ta1 e = ma1.e(((fw2) go1Var2.k(i51Var)).d.d(), 2);
            bc1 f7 = ma1.f(((fw2) go1Var2.k(i51Var)).d.d(), 2);
            ne1 ne1Var = nq4.c;
            vv vvVar4 = q8.J;
            uw2 c = px.c(vvVar4, false);
            long j2 = go1Var2.T;
            int i9 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, ne1Var);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, c);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i9));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            int ordinal = ou4Var2.ordinal();
            if (ordinal == 0) {
                i5 = 2;
                vvVar4 = vvVar2;
            } else if (ordinal != 1) {
                i5 = 2;
                if (ordinal != 2) {
                    s83.v();
                    return;
                }
            } else {
                i5 = 2;
                vvVar4 = vvVar3;
            }
            vv vvVar5 = z3 ? vvVar2 : vvVar4;
            ux uxVar2 = ux.a;
            i13 i13Var2 = i13.a;
            l13 n = nq4.n(i42.G0(uxVar2.align(i13Var2, vvVar5), F, F3, 0.0f, ou4Var2 == ou4.Tablet ? F4 + 20.0f : F4, 4), f5);
            if (z3) {
                go1Var2.d0(-1403884849);
                r11 r11Var7 = new r11((ru4Var.d - F3) - F4);
                r11 r11Var8 = new r11(120.0f);
                if (r11Var7.compareTo(r11Var8) < 0) {
                    r11Var7 = r11Var8;
                }
                l13 h = nq4.h(n, ((r11) j42.P(new r11(220.0f), r11Var7)).I, r11Var7.I);
                int i10 = i7 >> 12;
                int i11 = Aweme.$stable | (i10 & 14) | (MixInfo.$stable << 3) | (i10 & 112) | RendererCapabilities.DECODER_SUPPORT_MASK | (i8 & 7168);
                uxVar = uxVar2;
                f = f6;
                on5.f(aweme, mixInfo, ki1Var, rm1Var7, h, go1Var2, i11);
                go1Var2.q(false);
                i13Var = i13Var2;
                go1Var = go1Var2;
                ou4Var = ou4Var2;
                f2 = F4;
                vvVar = vvVar3;
                ta1Var = e;
                bc1Var = f7;
                i6 = i5;
            } else {
                uxVar = uxVar2;
                f = f6;
                go1Var2.d0(-1403379952);
                i13Var = i13Var2;
                final rm1 rm1Var9 = rm1Var8;
                f2 = F4;
                vvVar = vvVar3;
                i6 = i5;
                ou4Var = ou4Var2;
                p70.e(z, n, e, f7, null, p70.u0(-529496350, new in1() { // from class: vu4
                    @Override // defpackage.in1
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        fe0 fe0Var2 = (fe0) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((ui) obj).getClass();
                        go1 go1Var3 = (go1) fe0Var2;
                        if (go1Var3.T(intValue & 1, (intValue & 17) != 16)) {
                            ou4 ou4Var3 = ou4.this;
                            tm1 tm1Var2 = tm1Var;
                            fv4.e(ou4Var3, aweme, mixInfo, rm1Var9, rm1Var2, j, i, i2, str, (tm1Var2 == null || ou4Var3 == ou4.Tv) ? null : tm1Var2, go1Var3, (Aweme.$stable << 3) | (MixInfo.$stable << 6));
                        } else {
                            go1Var3.W();
                        }
                        return wd5.a;
                    }
                }, go1Var2), go1Var2, ((i7 >> 3) & 14) | 196608, 16);
                ta1Var = e;
                bc1Var = f7;
                go1Var = go1Var2;
                go1Var.q(false);
            }
            int ordinal2 = ou4Var.ordinal();
            if (ordinal2 == 0) {
                aweme3 = aweme2;
                z8 = z4;
                go1Var2 = go1Var;
                i13 i13Var3 = i13Var;
                go1Var2.d0(-1402494747);
                p70.e(z && !z3, i42.G0(uxVar.align(i13Var3, vvVar), F, 0.0f, 0.0f, f2, 6), ta1Var, bc1Var, null, qg5.n, go1Var2, 196608, 16);
                p70.e(z, i42.G0(uxVar.align(i13Var3, q8.L), 0.0f, F3, F2, 0.0f, 9), ta1Var, bc1Var, null, qg5.o, go1Var2, ((i7 >> 3) & 14) | 196608, 16);
                if (aweme3 != null) {
                    go1Var2.d0(-1401682733);
                    boolean z13 = z || z8;
                    l13 n2 = nq4.n(i42.G0(uxVar.align(i13Var3, q8.R), 0.0f, 0.0f, F2, f2 + 13.0f, 3), f);
                    z9 = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    p70.e(z13, n2, ta1Var, bc1Var, null, p70.u0(1158500881, new in1() { // from class: xu4
                        @Override // defpackage.in1
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            byte b2 = objArr;
                            wd5 wd5Var = wd5.a;
                            ui uiVar = (ui) obj;
                            fe0 fe0Var2 = (fe0) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            switch (b2) {
                                case 0:
                                    uiVar.getClass();
                                    go1 go1Var3 = (go1) fe0Var2;
                                    if (!go1Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                        go1Var3.W();
                                        break;
                                    } else {
                                        fv4.j(aweme3, 54.0f, 96.0f, z8, go1Var3, Aweme.$stable | 432);
                                        break;
                                    }
                                default:
                                    uiVar.getClass();
                                    go1 go1Var4 = (go1) fe0Var2;
                                    if (!go1Var4.T(intValue & 1, (intValue & 17) != 16)) {
                                        go1Var4.W();
                                        break;
                                    } else {
                                        fv4.j(aweme3, 60.0f, 106.0f, z8, go1Var4, Aweme.$stable | 432);
                                        break;
                                    }
                            }
                            return wd5Var;
                        }
                    }, go1Var2), go1Var2, 196608, 16);
                    go1Var2.q(false);
                } else {
                    z9 = false;
                    go1Var2.d0(-1400979684);
                    go1Var2.q(false);
                }
                go1Var2.q(z9);
            } else if (ordinal2 == 1) {
                go1 go1Var3 = go1Var;
                i13 i13Var4 = i13Var;
                go1Var3.d0(-1400879430);
                p70.e(z2, nq4.n(i42.G0(uxVar.align(i13Var4, q8.O), 0.0f, 0.0f, F2, 0.0f, 11), f), ta1Var, bc1Var, null, p70.u0(1404504607, new in1() { // from class: yu4
                    @Override // defpackage.in1
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        fe0 fe0Var2 = (fe0) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((ui) obj).getClass();
                        go1 go1Var4 = (go1) fe0Var2;
                        if (go1Var4.T(intValue & 1, (intValue & 17) != 16)) {
                            fv4.b(true, z5, z6, aweme, z7, rm1Var3, rm1Var4, rm1Var5, rm1Var6, go1Var4, (Aweme.$stable << 9) | 6);
                        } else {
                            go1Var4.W();
                        }
                        return wd5.a;
                    }
                }, go1Var3), go1Var3, ((i7 >> 6) & 14) | 196608, 16);
                go1Var2 = go1Var3;
                if (aweme2 != null) {
                    go1Var2.d0(-1399996302);
                    aweme3 = aweme2;
                    z8 = z4;
                    final byte b2 = 1;
                    p70.e(z || z4, nq4.n(i42.G0(uxVar.align(i13Var4, q8.R), 0.0f, 0.0f, F2, f2 + 20.0f, 3), f), ta1Var, bc1Var, null, p70.u0(1365843386, new in1() { // from class: xu4
                        @Override // defpackage.in1
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            byte b22 = b2;
                            wd5 wd5Var = wd5.a;
                            ui uiVar = (ui) obj;
                            fe0 fe0Var2 = (fe0) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            switch (b22) {
                                case 0:
                                    uiVar.getClass();
                                    go1 go1Var32 = (go1) fe0Var2;
                                    if (!go1Var32.T(intValue & 1, (intValue & 17) != 16)) {
                                        go1Var32.W();
                                        break;
                                    } else {
                                        fv4.j(aweme3, 54.0f, 96.0f, z8, go1Var32, Aweme.$stable | 432);
                                        break;
                                    }
                                default:
                                    uiVar.getClass();
                                    go1 go1Var4 = (go1) fe0Var2;
                                    if (!go1Var4.T(intValue & 1, (intValue & 17) != 16)) {
                                        go1Var4.W();
                                        break;
                                    } else {
                                        fv4.j(aweme3, 60.0f, 106.0f, z8, go1Var4, Aweme.$stable | 432);
                                        break;
                                    }
                            }
                            return wd5Var;
                        }
                    }, go1Var2), go1Var2, 196608, 16);
                    z11 = false;
                    go1Var2.q(false);
                } else {
                    aweme3 = aweme2;
                    z8 = z4;
                    z11 = false;
                    go1Var2.d0(-1399292292);
                    go1Var2.q(false);
                }
                go1Var2.q(z11);
            } else {
                if (ordinal2 != i6) {
                    go1 go1Var4 = go1Var;
                    go1Var4.d0(-1015071887);
                    go1Var4.q(false);
                    s83.v();
                    return;
                }
                go1Var.d0(-1399198455);
                go1 go1Var5 = go1Var;
                p70.e(z2, nq4.n(i42.G0(uxVar.align(i13Var, q8.L), 0.0f, F3, F2, 0.0f, 9), f), ta1Var, bc1Var, null, p70.u0(11571198, new in1() { // from class: zu4
                    @Override // defpackage.in1
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        fe0 fe0Var2 = (fe0) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((ui) obj).getClass();
                        go1 go1Var6 = (go1) fe0Var2;
                        if (go1Var6.T(intValue & 1, (intValue & 17) != 16)) {
                            fv4.b(false, z5, z6, aweme, z7, rm1Var3, rm1Var4, rm1Var5, null, go1Var6, (Aweme.$stable << 9) | 100663302);
                        } else {
                            go1Var6.W();
                        }
                        return wd5.a;
                    }
                }, go1Var), go1Var5, ((i7 >> 6) & 14) | 196608, 16);
                go1Var5.q(false);
                aweme3 = aweme2;
                go1Var2 = go1Var5;
                z10 = true;
                z8 = z4;
                go1Var2.q(z10);
            }
            z10 = true;
            go1Var2.q(z10);
        } else {
            aweme3 = aweme2;
            z8 = z4;
            go1Var2.W();
        }
        x04 u = go1Var2.u();
        if (u != null) {
            final boolean z14 = z8;
            final Aweme aweme4 = aweme3;
            u.d = new hn1() { // from class: av4
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i3 | 1);
                    fv4.k(ru4.this, z, z2, z3, aweme, mixInfo, aweme4, z14, rm1Var, rm1Var2, j, i, i2, str, z5, z6, z7, tm1Var, rm1Var3, rm1Var4, rm1Var5, rm1Var6, ki1Var, rm1Var7, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void l(String str, String str2, l13 l13Var, fe0 fe0Var, int i) {
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1903071544);
        int i2 = i | (go1Var2.g(str) ? 4 : 2) | (go1Var2.g(l13Var) ? 256 : 128);
        if (go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
            ba0 a2 = z90.a(i42.d, q8.V, go1Var2, 0);
            long j = go1Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var2.m();
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
            m65 m65Var = xc3.b;
            i51 i51Var = lw2.b;
            r55.b(str, null, ((fw2) go1Var2.k(i51Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 1, 0, m65Var, go1Var2, i2 & 14, 24576, 114682);
            go1Var = go1Var2;
            r55.b(str2, null, ((fw2) go1Var.k(i51Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var2, 6, 0, 131066);
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tf((Object) str, (Object) str2, l13Var, i, (byte) 14);
        }
    }
}
