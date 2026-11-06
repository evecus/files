package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Comment;
import com.github.mytv.dv.model.DataModelKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class cb0 {
    public static final float a = 32.0f + 10.0f;

    public static final void a(final Author author, final float f, final boolean z, fe0 fe0Var, final int i) {
        int i2;
        boolean z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(879458094);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(author) : go1Var.i(author) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.d(f) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.h(z) ? 256 : 128;
        }
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            l13 p = mw2.p(o7.m(nq4.k(i13.a, f), l74.a), z ? x70.c(k80Var.v, 0.16f) : k80Var.H, mw2.j);
            uw2 c = px.c(q8.N, false);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, p);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            String str = (String) o70.U0(author.getAvatarThumb().getUrlList());
            if (str != null) {
                go1Var.d0(-1288016209);
                z2 = true;
                SingletonAsyncImageKt.m55AsyncImage10Xjiaw(c5.d0(str, go1Var), null, nq4.c, null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1573296, 0, 1976);
                go1Var.q(false);
            } else {
                z2 = true;
                go1Var.d0(-1287742355);
                String f0 = jx4.f0(1, author.getNickname());
                if (jx4.L(f0)) {
                    f0 = "?";
                }
                r55.b(f0, null, z ? k80Var.v : k80Var.s, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, 1572864, 0, 131002);
                go1Var = go1Var;
                go1Var.q(false);
            }
            go1Var.q(z2);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: ua0
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int X = mu0.X(i | 1);
                    cb0.a(Author.this, f, z, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void b(String str, final long j, cw4 cw4Var, final SimpleDateFormat simpleDateFormat, final cw4 cw4Var2, final m65 m65Var, fe0 fe0Var, final int i) {
        final String str2;
        int i2;
        cw4 cw4Var3;
        m65 m65Var2;
        go1 go1Var;
        char c;
        String format;
        String str3;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(594995571);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (go1Var2.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var2.f(j) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            cw4Var3 = cw4Var;
            i2 |= go1Var2.g(cw4Var3) ? 256 : 128;
        } else {
            cw4Var3 = cw4Var;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var2.i(simpleDateFormat) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var2.g(cw4Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            m65Var2 = m65Var;
            i2 |= go1Var2.g(m65Var2) ? 131072 : 65536;
        } else {
            m65Var2 = m65Var;
        }
        if (go1Var2.T(i2 & 1, (74899 & i2) != 74898)) {
            long longValue = ((Number) cw4Var3.getValue()).longValue();
            simpleDateFormat.getClass();
            if (j <= 0) {
                str3 = "";
                c = ' ';
            } else {
                c = ' ';
                long j2 = j * 1000;
                long j3 = longValue - j2;
                if (j3 < 60000) {
                    format = "刚刚";
                } else if (j3 < 3600000) {
                    format = (j3 / 60000) + "分钟前";
                } else if (j3 < 86400000) {
                    format = (j3 / 3600000) + "小时前";
                } else if (j3 < 2592000000L) {
                    format = (j3 / 86400000) + "天前";
                } else {
                    format = simpleDateFormat.format(new Date(j2));
                    format.getClass();
                }
                str3 = format;
            }
            long j4 = ((fw2) go1Var2.k(lw2.b)).a.s;
            u74 a2 = t74.a(i42.b, q8.T, go1Var2, 48);
            long j5 = go1Var2.T;
            int i3 = (int) (j5 ^ (j5 >>> c));
            am3 m = go1Var2.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var2, i13Var);
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
            int i4 = (i2 << 6) & 29360128;
            r55.b(jx4.L(str2) ? "匿名用户" : str2, p70.G(new sc2(1.0f, false), cw4Var2, j4, false, null, 12), j4, 0L, null, 0L, null, 0L, 2, false, 1, 0, m65Var2, go1Var2, 0, i4 | 24960, 110584);
            go1Var = go1Var2;
            if (str3.length() > 0) {
                go1Var.d0(1389228332);
                r55.b(" · ".concat(str3), p70.G(i13Var, cw4Var2, j4, false, null, 12), j4, 0L, null, 0L, null, 0L, 0, false, 1, 0, m65Var, go1Var, 0, i4 | 27648, 106488);
                go1Var.q(false);
            } else {
                go1Var.d0(1389490995);
                go1Var.q(false);
            }
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            final cw4 cw4Var4 = cw4Var3;
            u.d = new hn1() { // from class: ta0
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cb0.b(str2, j, cw4Var4, simpleDateFormat, cw4Var2, m65Var, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void c(final Comment comment, final Map map, final cw4 cw4Var, final SimpleDateFormat simpleDateFormat, final boolean z, final boolean z2, final boolean z3, final rm1 rm1Var, final l13 l13Var, fe0 fe0Var, final int i) {
        int i2;
        df0 df0Var;
        i13 i13Var;
        cw4 cw4Var2;
        i51 i51Var;
        k80 k80Var;
        sg sgVar;
        boolean z4;
        sg sgVar2;
        int i3;
        l13 l13Var2;
        sg sgVar3;
        cw4 cw4Var3;
        k80 k80Var2;
        i51 i51Var2;
        jp jpVar;
        l13 l13Var3;
        boolean z5;
        boolean z6;
        String str;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2028000275);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(comment) : go1Var.i(comment) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go1Var.g(map) : go1Var.i(map) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(cw4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.i(simpleDateFormat) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go1Var.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= go1Var.h(z3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= go1Var.i(rm1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= go1Var.g(l13Var) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if (go1Var.T(i2 & 1, (38347923 & i2) != 38347922)) {
            i51 i51Var3 = lw2.b;
            k80 k80Var3 = ((fw2) go1Var.k(i51Var3)).a;
            Object Q = go1Var.Q();
            jp jpVar2 = de0.a;
            if (Q == jpVar2) {
                Q = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q;
            t43 v = ut0.v(t33Var, go1Var, 6);
            t43 w = ut0.w(t33Var, go1Var);
            boolean booleanValue = ((Boolean) v.getValue()).booleanValue();
            long j = x70.f;
            long j2 = k80Var3.u;
            long j3 = k80Var3.s;
            cw4 t0 = p70.t0(booleanValue, j, j2, ((Boolean) w.getValue()).booleanValue(), "commentBg", go1Var, 24624, 0);
            cw4 s0 = p70.s0(((Boolean) v.getValue()).booleanValue(), k80Var3.q, k80Var3.v, "commentFg", go1Var, 3072);
            cw4 s02 = p70.s0(((Boolean) v.getValue()).booleanValue(), k80Var3.s, k80Var3.v, "commentMeta", go1Var, 3072);
            cw4 s03 = p70.s0(((Boolean) v.getValue()).booleanValue(), k80Var3.a, k80Var3.v, "commentAccent", go1Var, 3072);
            cw4 s04 = p70.s0(((Boolean) v.getValue()).booleanValue(), k80Var3.a, k80Var3.v, "commentLiked", go1Var, 3072);
            l13 H = p70.H(o7.m(mw2.B(nq4.e(l13Var, 1.0f), false, t33Var, 1), jo.b), t0);
            boolean z7 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && go1Var.i(comment))) | ((29360128 & i2) == 8388608);
            Object Q2 = go1Var.Q();
            if (z7 || Q2 == jpVar2) {
                Q2 = new ka(comment, rm1Var, (byte) 11);
                go1Var.o0(Q2);
            }
            l13 D0 = i42.D0(r13.d(H, null, null, null, null, (rm1) Q2, null, null, null, null, null, null, t33Var, 130815), 12.0f, 10.0f);
            jp jpVar3 = i42.b;
            u74 a2 = t74.a(jpVar3, q8.S, go1Var, 0);
            int i4 = i2;
            long j4 = go1Var.T;
            int i5 = (int) (j4 ^ (j4 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, D0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z8 = go1Var.S;
            df0 df0Var2 = wa2.A0;
            if (z8) {
                go1Var.l(df0Var2);
            } else {
                go1Var.r0();
            }
            sg sgVar4 = q8.c0;
            qi4.k(go1Var, sgVar4, a2);
            sg sgVar5 = q8.b0;
            qi4.k(go1Var, sgVar5, m);
            Integer valueOf = Integer.valueOf(i5);
            sg sgVar6 = q8.d0;
            qi4.k(go1Var, sgVar6, valueOf);
            qi4.j(go1Var);
            sg sgVar7 = q8.a0;
            qi4.k(go1Var, sgVar7, x0);
            a(comment.getUser(), 32.0f, ((Boolean) v.getValue()).booleanValue(), go1Var, Author.$stable | 48);
            i13 i13Var2 = i13.a;
            oh4.a(go1Var, nq4.n(i13Var2, 10.0f));
            sc2 sc2Var = new sc2(1.0f, true);
            ba0 a3 = z90.a(i42.d, q8.V, go1Var, 0);
            long j5 = go1Var.T;
            int i6 = (int) (j5 ^ (j5 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, sc2Var);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var2);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar4, a3);
            qi4.k(go1Var, sgVar5, m2);
            r7.G(i6, go1Var, sgVar6, go1Var);
            qi4.k(go1Var, sgVar7, x02);
            b(comment.getUser().getNickname(), comment.getCreateTime(), cw4Var, simpleDateFormat, s02, ((fw2) go1Var.k(i51Var3)).b.n, go1Var, i4 & 8064);
            oh4.a(go1Var, nq4.g(i13Var2, 4.0f));
            c91.a(comment.getText(), null, s0, ((fw2) go1Var.k(i51Var3)).b.k, oh4.j(20), 5, map, go1Var, ((i4 << 21) & 234881024) | 14180352);
            go1Var = go1Var;
            uv uvVar = q8.T;
            kp kpVar = new kp(12.0f, true, new y9());
            l13 G0 = i42.G0(nq4.e(i13Var2, 1.0f), 0.0f, 6.0f, 0.0f, 0.0f, 13);
            u74 a4 = t74.a(kpVar, uvVar, go1Var, 54);
            long j6 = go1Var.T;
            int i7 = (int) (j6 ^ (j6 >>> 32));
            am3 m3 = go1Var.m();
            l13 x03 = i42.x0(go1Var, G0);
            go1Var.h0();
            if (go1Var.S) {
                df0Var = df0Var2;
                go1Var.l(df0Var);
            } else {
                df0Var = df0Var2;
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar4, a4);
            qi4.k(go1Var, sgVar5, m3);
            r7.G(i7, go1Var, sgVar6, go1Var);
            qi4.k(go1Var, sgVar7, x03);
            if (jx4.L(comment.getIpLabel())) {
                i13Var = i13Var2;
                cw4Var2 = s02;
                i51Var = i51Var3;
                k80Var = k80Var3;
                sgVar = sgVar6;
                z4 = false;
                go1Var.d0(566063857);
                go1Var.q(false);
            } else {
                go1Var.d0(565668328);
                String ipLabel = comment.getIpLabel();
                k80Var = k80Var3;
                long j7 = k80Var.s;
                i51Var = i51Var3;
                m65 m65Var = ((fw2) go1Var.k(i51Var)).b.o;
                sgVar = sgVar6;
                l13 G = p70.G(i13Var2, s02, k80Var.s, false, null, 12);
                i13Var = i13Var2;
                cw4Var2 = s02;
                r55.b(ipLabel, G, j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var, 0, 0, 131064);
                z4 = false;
                go1Var.q(false);
            }
            if (comment.getDiggCount() > 0) {
                go1Var.d0(566152238);
                long j8 = comment.isUserDigg() == 1 ? k80Var.a : j3;
                cw4 cw4Var4 = comment.isUserDigg() == 1 ? s04 : cw4Var2;
                u74 a5 = t74.a(jpVar3, uvVar, go1Var, 48);
                long j9 = go1Var.T;
                int i8 = (int) (j9 ^ (j9 >>> 32));
                am3 m4 = go1Var.m();
                i3 = 32;
                l13 x04 = i42.x0(go1Var, i13Var);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a5);
                qi4.k(go1Var, sgVar5, m4);
                sgVar3 = sgVar;
                r7.G(i8, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar7, x04);
                cw4 cw4Var5 = cw4Var2;
                jpVar = jpVar3;
                i51Var2 = i51Var;
                k80Var2 = k80Var;
                sgVar2 = sgVar7;
                ow1.a(comment.isUserDigg() == 1 ? sp0.O() : e41.I(), null, p70.G(nq4.k(i13Var, 14.0f), cw4Var4, j8, false, null, 12), j8, go1Var, 48);
                oh4.a(go1Var, nq4.n(i13Var, 3.0f));
                String formatCount = DataModelKt.formatCount(comment.getDiggCount());
                long j10 = k80Var2.s;
                m65 m65Var2 = xc3.f;
                i13 i13Var3 = i13Var;
                l13 G2 = p70.G(i13Var3, cw4Var5, j10, false, null, 12);
                l13Var2 = i13Var3;
                cw4Var3 = cw4Var5;
                r55.b(formatCount, G2, j10, 0L, null, 0L, null, 0L, 0, false, 0, 0, m65Var2, go1Var, 0, 0, 131064);
                go1Var.q(true);
                go1Var.q(false);
            } else {
                sgVar2 = sgVar7;
                i3 = 32;
                l13Var2 = i13Var;
                boolean z9 = z4;
                sgVar3 = sgVar;
                cw4Var3 = cw4Var2;
                k80Var2 = k80Var;
                i51Var2 = i51Var;
                jpVar = jpVar3;
                go1Var.d0(567508209);
                go1Var.q(z9);
            }
            if (comment.getReplyCommentTotal() > 0) {
                go1Var.d0(567601147);
                l13 E0 = i42.E0(l13Var2, 0.0f, 2.0f, 1);
                u74 a6 = t74.a(jpVar, uvVar, go1Var, 48);
                long j11 = go1Var.T;
                int i9 = (int) (j11 ^ (j11 >>> i3));
                am3 m5 = go1Var.m();
                l13 x05 = i42.x0(go1Var, E0);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a6);
                qi4.k(go1Var, sgVar5, m5);
                r7.G(i9, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar2, x05);
                if (z) {
                    str = "收起回复";
                } else {
                    str = comment.getReplyCommentTotal() + " 条回复";
                }
                String str2 = str;
                long j12 = k80Var2.a;
                r55.b(str2, p70.G(l13Var2, s03, j12, false, null, 12), j12, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, xc3.f, go1Var, 1572864, 0, 131000);
                hx1 hx1Var = k21.h;
                if (hx1Var == null) {
                    gx1 gx1Var = new gx1("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i10 = th5.a;
                    rt4 rt4Var = new rt4(x70.b);
                    ArrayList arrayList = new ArrayList(i3);
                    arrayList.add(new vk3(7.41f, 8.59f));
                    arrayList.add(new uk3(12.0f, 13.17f));
                    arrayList.add(new cl3(4.59f, -4.58f));
                    arrayList.add(new uk3(18.0f, 10.0f));
                    arrayList.add(new cl3(-6.0f, 6.0f));
                    arrayList.add(new cl3(-6.0f, -6.0f));
                    arrayList.add(new cl3(1.41f, -1.41f));
                    arrayList.add(rk3.c);
                    gx1.a(gx1Var, arrayList, rt4Var);
                    hx1Var = gx1Var.b();
                    k21.h = hx1Var;
                }
                long j13 = k80Var2.a;
                l13 G3 = p70.G(nq4.k(l13Var2, 16.0f), s03, k80Var2.a, false, null, 12);
                if (z) {
                    l13 l13Var4 = l13Var2;
                    l13Var2 = qb.P(l13Var4, 0.0f, 0.0f, null, false, 1048572);
                    l13Var3 = l13Var4;
                } else {
                    l13Var3 = l13Var2;
                }
                ow1.a(hx1Var, null, G3.then(l13Var2), j13, go1Var, 48);
                z5 = true;
                go1Var.q(true);
                go1Var.q(false);
            } else {
                l13Var3 = l13Var2;
                z5 = true;
                go1Var.d0(568852369);
                go1Var.q(false);
            }
            go1Var.q(z5);
            if (z) {
                go1Var.d0(1466380248);
                List<Comment> replyComments = comment.getReplyComments();
                String str3 = z2 ? "加载回复中..." : z3 ? "回复加载失败，再次点击该评论重试" : replyComments == null ? "回复暂不可用" : replyComments.isEmpty() ? "暂无回复" : null;
                if (str3 != null) {
                    go1Var.d0(1466771902);
                    long j14 = (!z3 || ((Boolean) v.getValue()).booleanValue()) ? j3 : k80Var2.w;
                    r55.b(str3, p70.G(i42.G0(l13Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), cw4Var3, j14, false, null, 12), j14, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var2)).b.l, go1Var, 0, 0, 131064);
                    z6 = false;
                    go1Var.q(false);
                } else {
                    z6 = false;
                    go1Var.d0(1467378293);
                    go1Var.q(false);
                }
                go1Var.q(z6);
            } else {
                go1Var.d0(1467392181);
                go1Var.q(false);
            }
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: sa0
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cb0.c(Comment.this, map, cw4Var, simpleDateFormat, z, z2, z3, rm1Var, l13Var, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void d(final List list, final boolean z, final long j, final rm1 rm1Var, final Set set, final Set set2, final tm1 tm1Var, final rm1 rm1Var2, l13 l13Var, final boolean z2, final tm1 tm1Var2, fe0 fe0Var, final int i) {
        go1 go1Var;
        final l13 l13Var2;
        t43 t43Var;
        ki1 ki1Var;
        t43 t43Var2;
        boolean z3;
        List list2;
        final k80 k80Var;
        final t43 t43Var3;
        fj0 fj0Var;
        ki1 ki1Var2;
        Set set3 = set2;
        list.getClass();
        rm1Var.getClass();
        set.getClass();
        set3.getClass();
        tm1Var.getClass();
        rm1Var2.getClass();
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-17243995);
        int i2 = i | (go1Var2.g(list) ? 4 : 2) | (go1Var2.h(z) ? 32 : 16) | (go1Var2.f(j) ? 256 : 128) | (go1Var2.i(rm1Var) ? 2048 : 1024) | (go1Var2.g(set) ? 16384 : 8192) | (go1Var2.g(set3) ? 131072 : 65536) | (go1Var2.i(tm1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (go1Var2.i(rm1Var2) ? 8388608 : 4194304) | 100663296 | (go1Var2.h(z2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456);
        if (go1Var2.T(i2 & 1, (i2 & 306783379) != 306783378)) {
            k80 k80Var2 = ((fw2) go1Var2.k(lw2.b)).a;
            Object Q = go1Var2.Q();
            Object obj = de0.a;
            if (Q == obj) {
                Q = pt1.r(go1Var2);
            }
            ki1 ki1Var3 = (ki1) Q;
            t43 g = wi4.g(t81.c, go1Var2);
            Locale locale = qb.L((Configuration) go1Var2.k(rb.a)).a.get(0);
            if (locale == null) {
                locale = Locale.getDefault();
            }
            TimeZone timeZone = TimeZone.getDefault();
            boolean g2 = go1Var2.g(locale) | go1Var2.g(timeZone);
            Object Q2 = go1Var2.Q();
            Object obj2 = Q2;
            if (g2 || Q2 == obj) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd", locale);
                simpleDateFormat.setTimeZone(timeZone);
                go1Var2.o0(simpleDateFormat);
                obj2 = simpleDateFormat;
            }
            final SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) obj2;
            Object Q3 = go1Var2.Q();
            if (Q3 == obj) {
                Object hk3Var = new hk3(System.currentTimeMillis());
                go1Var2.o0(hk3Var);
                Q3 = hk3Var;
            }
            final hk3 hk3Var2 = (hk3) Q3;
            Object Q4 = go1Var2.Q();
            fj0 fj0Var2 = null;
            if (Q4 == obj) {
                Q4 = new h40((Object) hk3Var2, fj0Var2, (byte) 1);
                go1Var2.o0(Q4);
            }
            mw2.h(go1Var2, (hn1) Q4, wd5.a);
            Object Q5 = go1Var2.Q();
            if (Q5 == obj) {
                Q5 = ad4.w(null);
                go1Var2.o0(Q5);
            }
            t43 t43Var4 = (t43) Q5;
            int i3 = i2 & 14;
            boolean g3 = (i3 == 4) | go1Var2.g((String) t43Var4.getValue()) | ((i2 & 57344) == 16384) | ((i2 & 458752) == 131072);
            Object Q6 = go1Var2.Q();
            if (g3 || Q6 == obj) {
                String str = (String) t43Var4.getValue();
                mk2 K = p70.K();
                t43Var = t43Var4;
                HashMap hashMap = new HashMap();
                ki1Var = ki1Var3;
                int i4 = 0;
                for (Object obj3 : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p70.A0();
                        throw null;
                    }
                    Comment comment = (Comment) obj3;
                    String g4 = g(hashMap, comment, "comment");
                    t43 t43Var5 = g;
                    K.add(new db0(g4, comment, false, i4));
                    if (g4.equals(str) && !set.contains(comment.getCid()) && !set3.contains(comment.getCid())) {
                        List<Comment> replyComments = comment.getReplyComments();
                        if (replyComments == null) {
                            replyComments = o91.I;
                        }
                        for (Iterator it = replyComments.iterator(); it.hasNext(); it = it) {
                            Comment comment2 = (Comment) it.next();
                            String str2 = str;
                            K.add(new db0(g(hashMap, comment2, "reply:" + g4.length() + ":" + g4), comment2, true, i4));
                            str = str2;
                        }
                    }
                    set3 = set2;
                    g = t43Var5;
                    i4 = i5;
                    str = str;
                }
                t43Var2 = g;
                z3 = true;
                Q6 = p70.D(K);
                go1Var2.o0(Q6);
            } else {
                t43Var = t43Var4;
                ki1Var = ki1Var3;
                t43Var2 = g;
                z3 = true;
            }
            final List list3 = (List) Q6;
            Object Q7 = go1Var2.Q();
            if (Q7 == obj) {
                Q7 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q7);
            }
            t43 t43Var6 = (t43) Q7;
            Boolean valueOf = Boolean.valueOf(z);
            boolean z4 = ((i2 & 112) == 32 ? z3 : false) | (i3 != 4 ? false : z3);
            Object Q8 = go1Var2.Q();
            if (z4 || Q8 == obj) {
                list2 = list;
                k80Var = k80Var2;
                t43Var3 = t43Var;
                fj0Var = null;
                ki1Var2 = ki1Var;
                Object zjVar = new zj(z, list2, t43Var6, ki1Var2, (fj0) null);
                go1Var2.o0(zjVar);
                Q8 = zjVar;
            } else {
                list2 = list;
                k80Var = k80Var2;
                t43Var3 = t43Var;
                fj0Var = null;
                ki1Var2 = ki1Var;
            }
            mw2.i(valueOf, list2, (hn1) Q8, go1Var2);
            String str3 = (String) t43Var3.getValue();
            boolean i6 = go1Var2.i(list3);
            Object Q9 = go1Var2.Q();
            if (i6 || Q9 == obj) {
                Q9 = new k(list3, t43Var3, fj0Var, (byte) 4);
                go1Var2.o0(Q9);
            }
            mw2.i(list3, str3, (hn1) Q9, go1Var2);
            final ag2 a2 = bg2.a(go1Var2);
            Object x = ad4.x(rm1Var, go1Var2);
            Object x2 = ad4.x(Integer.valueOf(list2.size()), go1Var2);
            Object x3 = ad4.x(list3, go1Var2);
            Object x4 = ad4.x(Boolean.valueOf(z), go1Var2);
            boolean g5 = go1Var2.g(a2) | go1Var2.g(x3) | go1Var2.g(x2) | go1Var2.g(x4) | go1Var2.g(x);
            Object Q10 = go1Var2.Q();
            if (g5 || Q10 == obj) {
                Q10 = new ld(a2, x3, x2, x4, x, null, (byte) 2);
                go1Var2.o0(Q10);
            }
            mw2.h(go1Var2, (hn1) Q10, a2);
            final List list4 = list2;
            final t43 t43Var7 = t43Var2;
            final ki1 ki1Var4 = ki1Var2;
            jn1 jn1Var = new jn1() { // from class: va0
                @Override // defpackage.jn1
                public final Object c(Object obj4, Object obj5, Object obj6, Object obj7) {
                    int i7;
                    ea0 ea0Var = (ea0) obj4;
                    ji3 ji3Var = (ji3) obj5;
                    fe0 fe0Var2 = (fe0) obj6;
                    int intValue = ((Integer) obj7).intValue();
                    ea0Var.getClass();
                    ji3Var.getClass();
                    if ((intValue & 6) == 0) {
                        i7 = (((go1) fe0Var2).g(ea0Var) ? 4 : 2) | intValue;
                    } else {
                        i7 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i7 |= ((go1) fe0Var2).g(ji3Var) ? 32 : 16;
                    }
                    go1 go1Var3 = (go1) fe0Var2;
                    if (go1Var3.T(i7 & 1, (i7 & 147) != 146)) {
                        l13 B0 = i42.B0(nq4.e(pt1.G(ea0Var, i13.a, 1.0f), 1.0f), ji3Var);
                        final long j2 = j;
                        boolean f = go1Var3.f(j2);
                        final boolean z5 = z;
                        boolean h = f | go1Var3.h(z5);
                        final List list5 = list4;
                        boolean i8 = h | go1Var3.i(list5);
                        final List list6 = list3;
                        boolean i9 = i8 | go1Var3.i(list6);
                        final cw4 cw4Var = t43Var7;
                        boolean g6 = i9 | go1Var3.g(cw4Var);
                        final SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
                        boolean i10 = g6 | go1Var3.i(simpleDateFormat3);
                        final Set set4 = set;
                        boolean i11 = i10 | go1Var3.i(set4);
                        final Set set5 = set2;
                        boolean i12 = i11 | go1Var3.i(set5);
                        final tm1 tm1Var3 = tm1Var;
                        boolean g7 = i12 | go1Var3.g(tm1Var3);
                        final k80 k80Var3 = k80Var;
                        boolean g8 = g7 | go1Var3.g(k80Var3);
                        Object Q11 = go1Var3.Q();
                        if (g8 || Q11 == de0.a) {
                            final hk3 hk3Var3 = hk3Var2;
                            final ki1 ki1Var5 = ki1Var4;
                            final t43 t43Var8 = t43Var3;
                            Q11 = new tm1() { // from class: xa0
                                @Override // defpackage.tm1
                                public final Object invoke(Object obj8) {
                                    of2 of2Var = (of2) obj8;
                                    of2Var.getClass();
                                    final long j3 = j2;
                                    of2Var.Z("header", "header", new tc0(-972655167, new in1() { // from class: ya0
                                        @Override // defpackage.in1
                                        public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                            fe0 fe0Var3 = (fe0) obj10;
                                            int intValue2 = ((Integer) obj11).intValue();
                                            ((zd2) obj9).getClass();
                                            go1 go1Var4 = (go1) fe0Var3;
                                            if (go1Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                hx1 r0 = i42.r0();
                                                long j4 = j3;
                                                Long valueOf2 = Long.valueOf(j4);
                                                if (j4 <= 0) {
                                                    valueOf2 = null;
                                                }
                                                bp3.a(r0, "评论", i42.G0(i13.a, 0.0f, 0.0f, 0.0f, 4.0f, 7), valueOf2 != null ? DataModelKt.formatCount(valueOf2.longValue()) : null, null, go1Var4, 432, 16);
                                            } else {
                                                go1Var4.W();
                                            }
                                            return wd5.a;
                                        }
                                    }, true));
                                    boolean z6 = z5;
                                    List list7 = list5;
                                    if (z6 && list7.isEmpty()) {
                                        of2Var.Z("loading", "loading", qg5.k);
                                    } else if (list7.isEmpty()) {
                                        of2Var.Z("empty", "empty", qg5.l);
                                    } else {
                                        List list8 = list6;
                                        of2Var.a0(list8.size(), new l30(list8, (byte) 1), new l30(list8, (byte) 2), new tc0(-733830153, new m30(list8, hk3Var3, simpleDateFormat3, set4, set5, ki1Var5, tm1Var3, cw4Var, t43Var8), true));
                                        if (z6) {
                                            of2Var.Z("loading_more", "loading", new tc0(-693099355, new h30(k80Var3, (byte) 1), true));
                                        }
                                    }
                                    return wd5.a;
                                }
                            };
                            go1Var3.o0(Q11);
                        }
                        e21.c(B0, ag2.this, null, null, null, null, false, null, (tm1) Q11, go1Var3, 0, 508);
                    } else {
                        go1Var3.W();
                    }
                    return wd5.a;
                }
            };
            go1Var = go1Var2;
            tc0 u0 = p70.u0(1098293366, jn1Var, go1Var);
            int i7 = i2 >> 21;
            i13 i13Var = i13.a;
            bp3.c(rm1Var2, i13Var, z2, tm1Var2, u0, go1Var, (i7 & 896) | (i7 & 14) | 24624 | 3072, 0);
            l13Var2 = i13Var;
        } else {
            go1Var = go1Var2;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(list, z, j, rm1Var, set, set2, tm1Var, rm1Var2, l13Var2, z2, tm1Var2, i) { // from class: wa0
                public final /* synthetic */ List I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ long K;
                public final /* synthetic */ rm1 L;
                public final /* synthetic */ Set M;
                public final /* synthetic */ Set N;
                public final /* synthetic */ tm1 O;
                public final /* synthetic */ rm1 P;
                public final /* synthetic */ l13 Q;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ tm1 S;

                @Override // defpackage.hn1
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int X = mu0.X(1);
                    cb0.d(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, (fe0) obj4, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void e(Comment comment, Map map, cw4 cw4Var, SimpleDateFormat simpleDateFormat, l13 l13Var, fe0 fe0Var, int i) {
        int i2;
        boolean z;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1491577211);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(comment) : go1Var.i(comment) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go1Var.g(map) : go1Var.i(map) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.g(cw4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.i(simpleDateFormat) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go1Var.g(l13Var) ? 16384 : 8192;
        }
        if (go1Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q;
            t43 v = ut0.v(t33Var, go1Var, 6);
            cw4 t0 = p70.t0(((Boolean) v.getValue()).booleanValue(), k80Var.G, k80Var.u, false, "replyBg", go1Var, 24576, 8);
            cw4 s0 = p70.s0(((Boolean) v.getValue()).booleanValue(), k80Var.q, k80Var.v, "replyFg", go1Var, 3072);
            cw4 s02 = p70.s0(((Boolean) v.getValue()).booleanValue(), k80Var.s, k80Var.v, "replyMeta", go1Var, 3072);
            go1Var = go1Var;
            l13 D0 = i42.D0(p70.H(o7.m(mw2.B(nq4.e(l13Var, 1.0f), false, t33Var, 1), jo.b), t0), 12.0f, 10.0f);
            jp jpVar = i42.b;
            u74 a2 = t74.a(jpVar, q8.S, go1Var, 0);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, D0);
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
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(i3);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            a(comment.getUser(), 24.0f, ((Boolean) v.getValue()).booleanValue(), go1Var, Author.$stable | 48);
            i13 i13Var = i13.a;
            oh4.a(go1Var, nq4.n(i13Var, 10.0f));
            sc2 sc2Var = new sc2(1.0f, true);
            ba0 a3 = z90.a(new kp(2.0f, true, new y9()), q8.V, go1Var, 6);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
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
            r7.G(i4, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            b(comment.getUser().getNickname(), comment.getCreateTime(), cw4Var, simpleDateFormat, s02, ((fw2) go1Var.k(i51Var)).b.o, go1Var, i2 & 8064);
            c91.a(comment.getText(), null, s0, ((fw2) go1Var.k(i51Var)).b.l, oh4.j(18), 3, map, go1Var, ((i2 << 21) & 234881024) | 14180352);
            if (comment.getDiggCount() > 0) {
                go1Var.d0(109629878);
                u74 a4 = t74.a(jpVar, q8.T, go1Var, 48);
                long j3 = go1Var.T;
                int i5 = (int) (j3 ^ (j3 >>> 32));
                am3 m3 = go1Var.m();
                l13 x03 = i42.x0(go1Var, i13Var);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar, a4);
                qi4.k(go1Var, sgVar2, m3);
                r7.G(i5, go1Var, sgVar3, go1Var);
                qi4.k(go1Var, sgVar4, x03);
                ow1.a(e41.I(), null, p70.G(nq4.k(i13Var, 12.0f), s02, k80Var.s, false, null, 12), k80Var.s, go1Var, 48);
                oh4.a(go1Var, nq4.n(i13Var, 2.0f));
                String formatCount = DataModelKt.formatCount(comment.getDiggCount());
                long j4 = k80Var.s;
                r55.b(formatCount, p70.G(i13Var, s02, j4, false, null, 12), j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, xc3.f, go1Var, 0, 0, 131064);
                z = true;
                go1Var.q(true);
                go1Var.q(false);
            } else {
                z = true;
                go1Var.d0(110574541);
                go1Var.q(false);
            }
            go1Var.q(z);
            go1Var.q(z);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ra0(comment, map, cw4Var, simpleDateFormat, l13Var, i, (byte) 0);
        }
    }

    public static final void f(rm1 rm1Var, fe0 fe0Var, int i) {
        rm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-2048992736);
        int i2 = (go1Var.i(rm1Var) ? 4 : 2) | i;
        byte b = 0;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            float P = ((iu0) go1Var.k(hf0.h)).P(56.0f);
            i13 i13Var = i13.a;
            l13 e = nq4.e(i13Var, 1.0f);
            boolean d = ((i2 & 14) == 4) | go1Var.d(P);
            Object Q = go1Var.Q();
            if (d || Q == de0.a) {
                Q = new bb0(P, rm1Var);
                go1Var.o0(Q);
            }
            l13 G0 = i42.G0(m05.b(e, rm1Var, (PointerInputEventHandler) Q), 0.0f, 10.0f, 0.0f, 2.0f, 5);
            uw2 c = px.c(q8.N, false);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, G0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            px.a(mw2.p(o7.m(nq4.l(i13Var, 32.0f, 4.0f), l74.a(2.0f)), x70.c(k80Var.s, 0.35f), mw2.j), go1Var, 0);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qa0(rm1Var, i, b);
        }
    }

    public static final String g(HashMap hashMap, Comment comment, String str) {
        String z;
        if (jx4.L(comment.getCid())) {
            int length = comment.getUser().getUid().length();
            String uid = comment.getUser().getUid();
            long createTime = comment.getCreateTime();
            int length2 = comment.getText().length();
            String text = comment.getText();
            StringBuilder sb = new StringBuilder("missing:");
            sb.append(length);
            sb.append(":");
            sb.append(uid);
            sb.append(":");
            sb.append(createTime);
            sb.append(":");
            sb.append(length2);
            z = hf1.z(sb, ":", text);
        } else {
            z = "id:" + comment.getCid().length() + ":" + comment.getCid();
        }
        String C = r7.C(str, ":", z);
        Integer num = (Integer) hashMap.get(C);
        int intValue = num != null ? num.intValue() : 0;
        hashMap.put(C, Integer.valueOf(intValue + 1));
        return C + ":" + intValue;
    }
}
