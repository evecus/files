package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import coil3.compose.SingletonAsyncImageKt;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.LiveRoom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class he4 {
    public static final k74 a = l74.a(16.0f);

    public static final void a(final boolean z, rm1 rm1Var, fe0 fe0Var, final int i) {
        int i2;
        final rm1 rm1Var2;
        t43 t43Var;
        long j;
        hx1 hx1Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(389953014);
        if ((i & 6) == 0) {
            i2 = i | (go1Var.h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(rm1Var) ? 32 : 16;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
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
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            long j2 = z ? k80Var.d : k80Var.s;
            boolean booleanValue = ((Boolean) t43Var2.getValue()).booleanValue();
            if (z) {
                t43Var = w;
                j = k80Var.c;
            } else {
                t43Var = w;
                j = k80Var.G;
            }
            cw4 t0 = p70.t0(booleanValue, j, k80Var.u, ((Boolean) t43Var.getValue()).booleanValue(), "searchResultsFilterBg", go1Var, 24576, 0);
            long j3 = j2;
            cw4 s0 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), j3, k80Var.v, "searchResultsFilterFg", go1Var, 3072);
            i13 i13Var = i13.a;
            l13 H = p70.H(o7.m(nq4.g(i13Var, 32.0f), jo.b), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new xx2(t43Var2, (byte) 24);
                go1Var.o0(Q3);
            }
            l13 d = r13.d(i42.A0(H, (tm1) Q3), null, null, null, null, rm1Var, null, null, null, null, null, new t64(0), t33Var, 65279);
            rm1Var2 = rm1Var;
            l13 E0 = i42.E0(mw2.B(d, false, t33Var, 1), 12.0f, 0.0f, 2);
            go1Var = go1Var;
            u74 a2 = t74.a(new kp(6.0f, true, new y9()), q8.T, go1Var, 54);
            long j4 = go1Var.T;
            int i3 = (int) (j4 ^ (j4 >>> 32));
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
            if (z) {
                hx1Var = g4.B();
            } else {
                hx1Var = eg5.d;
                if (hx1Var == null) {
                    gx1 gx1Var = new gx1("Filled.Smartphone", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i4 = th5.a;
                    rt4 rt4Var = new rt4(x70.b);
                    ep p = hf1.p(17.0f, 1.01f, 7.0f, 1.0f);
                    p.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    p.M(18.0f);
                    p.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    p.v(10.0f);
                    p.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    p.L(3.0f);
                    p.r(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
                    p.p();
                    p.z(17.0f, 19.0f);
                    p.u(7.0f);
                    p.L(5.0f);
                    p.v(10.0f);
                    p.M(14.0f);
                    p.p();
                    gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
                    hx1Var = gx1Var.b();
                    eg5.d = hx1Var;
                }
            }
            ow1.a(hx1Var, null, p70.G(nq4.k(i13Var, 18.0f), s0, j3, false, null, 12), j3, go1Var, 48);
            r55.b("隐藏竖屏", p70.G(i13Var, s0, j3, false, null, 12), j3, 0L, (z || ((Boolean) t43Var2.getValue()).booleanValue()) ? qk1.P : qk1.N, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.m, go1Var, 6, 24576, 114616);
            go1Var.q(true);
        } else {
            rm1Var2 = rm1Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: kd4
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int X = mu0.X(i | 1);
                    he4.a(z, rm1Var2, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final void b(LiveRoom liveRoom, rm1 rm1Var, fe0 fe0Var, int i) {
        int i2;
        rm1 rm1Var2 = rm1Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(75875704);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? go1Var.g(liveRoom) : go1Var.i(liveRoom) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(rm1Var2) ? 32 : 16;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
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
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.G, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "liveCardBg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.q, k80Var.v, "liveCardFg", go1Var, 3072);
            i13 i13Var = i13.a;
            l13 e = nq4.e(i13Var, 1.0f);
            k74 k74Var = jo.b;
            l13 H = p70.H(o7.m(e, k74Var), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new xx2(t43Var, (byte) 27);
                go1Var.o0(Q3);
            }
            rm1Var2 = rm1Var;
            l13 C0 = i42.C0(mw2.B(r13.d(i42.A0(H, (tm1) Q3), null, null, null, null, rm1Var2, null, null, null, null, null, new t64(0), t33Var, 65279), false, t33Var, 1), 8.0f);
            go1Var = go1Var;
            ba0 a2 = z90.a(i42.d, q8.V, go1Var, 0);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
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
            l13 m2 = o7.m(j42.e(nq4.e(i13Var, 1.0f), 0.75f, false), k74Var);
            uw2 c = px.c(q8.J, false);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m3 = go1Var.m();
            l13 x02 = i42.x0(go1Var, m2);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(i4, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            SingletonAsyncImageKt.m55AsyncImage10Xjiaw((String) o70.U0(liveRoom.getCover().getUrlList()), liveRoom.getTitle(), nq4.c, null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1573248, 0, 1976);
            l13 D0 = i42.D0(mw2.p(o7.m(i42.C0(ux.a.align(i13Var, q8.P), 6.0f), jo.a), x70.c(x70.b, 0.55f), mw2.j), 6.0f, 2.0f);
            u74 a3 = t74.a(new kp(4.0f, true, new y9()), q8.T, go1Var, 54);
            long j3 = go1Var.T;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            am3 m4 = go1Var.m();
            l13 x03 = i42.x0(go1Var, D0);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, a3);
            qi4.k(go1Var, sgVar2, m4);
            r7.G(i5, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x03);
            m65 m65Var = ((fw2) go1Var.k(i51Var)).b.o;
            long j4 = x70.c;
            qk1 qk1Var = qk1.P;
            r55.b("LIVE", null, j4, 0L, qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var, 1573254, 0, 131002);
            Long B = qx4.B(liveRoom.getUserCount());
            long longValue = B != null ? B.longValue() : 0L;
            if (longValue > 0) {
                go1Var.d0(1422114302);
                r55.b(r7.B(DataModelKt.formatCount(longValue), "人"), null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.o, go1Var, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                go1Var.q(false);
            } else {
                go1Var.d0(1422328202);
                go1Var.q(false);
            }
            go1Var.q(true);
            go1Var.q(true);
            oh4.a(go1Var, nq4.g(i13Var, 6.0f));
            String nickname = liveRoom.getOwner().getNickname();
            if (jx4.L(nickname)) {
                nickname = "主播";
            }
            m65 m65Var2 = ((fw2) go1Var.k(i51Var)).b.i;
            long j5 = k80Var.q;
            r55.b(nickname, p70.G(i13Var, s0, j5, false, null, 12), j5, 0L, qk1Var, 0L, null, 0L, 2, false, 1, 0, m65Var2, go1Var, 1572864, 24960, 110520);
            if (jx4.L(liveRoom.getTitle())) {
                go1Var.d0(-1949820512);
                go1Var.q(false);
            } else {
                go1Var.d0(-1950162938);
                String title = liveRoom.getTitle();
                m65 m65Var3 = ((fw2) go1Var.k(i51Var)).b.l;
                long j6 = k80Var.s;
                r55.b(title, p70.G(i13Var, s0, j6, false, null, 12), j6, 0L, null, 0L, null, 0L, 2, false, 1, 0, m65Var3, go1Var, 0, 24960, 110584);
                go1Var.q(false);
            }
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qj((byte) 10, i, liveRoom, rm1Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c1, code lost:
    
        if (r2 == defpackage.ww5.I) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.util.List r18, boolean r19, boolean r20, defpackage.rm1 r21, defpackage.tm1 r22, defpackage.fe0 r23, int r24) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he4.c(java.util.List, boolean, boolean, rm1, tm1, fe0, int):void");
    }

    public static final void d(String str, List list, List list2, tm1 tm1Var, rm1 rm1Var, tm1 tm1Var2, l13 l13Var, fe0 fe0Var, int i) {
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1709962769);
        int i2 = i | (go1Var2.g(str) ? 4 : 2) | (go1Var2.g(list) ? 32 : 16) | (go1Var2.g(list2) ? 256 : 128) | (go1Var2.i(tm1Var) ? 2048 : 1024) | (go1Var2.i(rm1Var) ? 16384 : 8192) | (go1Var2.i(tm1Var2) ? 131072 : 65536) | (go1Var2.g(l13Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (go1Var2.T(i2 & 1, (599187 & i2) != 599186)) {
            ba0 a2 = z90.a(new kp(12.0f, true, new y9()), q8.V, go1Var2, 6);
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
            int i4 = i2 >> 6;
            m((i2 & 14) | (i4 & 112) | (i4 & 896), go1Var2, rm1Var, tm1Var, str);
            ne1 ne1Var = nq4.c;
            li3 T = i42.T(0.0f, 0.0f, 12.0f, 7);
            kp kpVar = new kp(4.0f, true, new y9());
            boolean z = ((i2 & 112) == 32) | ((458752 & i2) == 131072) | ((i2 & 896) == 256);
            Object Q = go1Var2.Q();
            if (z || Q == de0.a) {
                Q = new m6(list, list2, tm1Var2, (byte) 20);
                go1Var2.o0(Q);
            }
            e21.c(ne1Var, null, T, kpVar, null, null, false, null, (tm1) Q, go1Var2, 24966, 490);
            go1Var = go1Var2;
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ev3(str, list, list2, tm1Var, rm1Var, tm1Var2, l13Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final List list, final boolean z, final boolean z2, final ag2 ag2Var, final rm1 rm1Var, final tm1 tm1Var, fe0 fe0Var, int i) {
        go1 go1Var;
        Iterator it;
        String z3;
        int i2;
        int i3;
        boolean z4;
        int i4;
        byte b;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1916033272);
        int i5 = (go1Var2.i(tm1Var) ? 131072 : 65536) | i | (go1Var2.g(list) ? 4 : 2) | (go1Var2.h(z) ? 32 : 16) | (go1Var2.h(z2) ? 256 : 128) | (go1Var2.g(ag2Var) ? 2048 : 1024) | (go1Var2.i(rm1Var) ? 16384 : 8192);
        if (go1Var2.T(i5 & 1, (74899 & i5) != 74898)) {
            int i6 = i5 & 14;
            boolean z5 = i6 == 4;
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (z5 || Q == jpVar) {
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList(p70.J(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Aweme aweme = (Aweme) it2.next();
                    if (jx4.L(aweme.getAwemeId())) {
                        int length = aweme.getAuthor().getUid().length();
                        String uid = aweme.getAuthor().getUid();
                        long createTime = aweme.getCreateTime();
                        int length2 = aweme.getDesc().length();
                        it = it2;
                        String desc = aweme.getDesc();
                        StringBuilder sb = new StringBuilder("fallback:");
                        sb.append(length);
                        sb.append(":");
                        sb.append(uid);
                        sb.append(":");
                        sb.append(createTime);
                        sb.append(":");
                        sb.append(length2);
                        z3 = hf1.z(sb, ":", desc);
                    } else {
                        z3 = "id:" + aweme.getAwemeId().length() + ":" + aweme.getAwemeId();
                        it = it2;
                    }
                    Integer num = (Integer) hashMap.get(z3);
                    int intValue = num != null ? num.intValue() : 0;
                    hashMap.put(z3, Integer.valueOf(intValue + 1));
                    arrayList.add(new cd4("result:" + z3 + ":" + intValue, aweme));
                    it2 = it;
                }
                go1Var2.o0(arrayList);
                Q = arrayList;
            }
            final List list2 = (List) Q;
            if (r13.e(go1Var2)) {
                go1Var2.d0(-431497621);
                ww5 ww5Var = ((bw0) go1Var2.k(cw0.a)).a;
                if (((cj1) go1Var2.k(dj1.a)).a == br3.K) {
                    i2 = 2;
                } else {
                    int ordinal = ww5Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            i3 = 3;
                        } else if (ordinal != 2) {
                            i3 = 5;
                        } else {
                            i2 = 4;
                        }
                        i2 = i3;
                    } else {
                        i2 = 2;
                    }
                }
                float f = ww5Var == ww5.I ? 8.0f : 10.0f;
                zg2 e0 = e41.e0(go1Var2);
                Integer valueOf = Integer.valueOf(list.size());
                int i7 = i5 & 896;
                boolean g = go1Var2.g(e0) | (i6 == 4) | ((i5 & 112) == 32) | (i7 == 256) | ((57344 & i5) == 16384);
                Object Q2 = go1Var2.Q();
                if (g || Q2 == jpVar) {
                    z4 = z2;
                    i4 = i5;
                    b = 0;
                    bi2 bi2Var = new bi2(e0, list, z, z4, rm1Var, null, (byte) 2);
                    go1Var2.o0(bi2Var);
                    Q2 = bi2Var;
                } else {
                    z4 = z2;
                    i4 = i5;
                    b = 0;
                }
                mw2.i(e0, valueOf, (hn1) Q2, go1Var2);
                kv4 kv4Var = new kv4(i2);
                ne1 ne1Var = nq4.c;
                li3 T = i42.T(0.0f, 0.0f, 12.0f, 7);
                kp kpVar = new kp(f, true, new y9());
                int i8 = (go1Var2.i(list2) ? 1 : 0) | ((i4 & 458752) == 131072 ? (byte) 1 : b) | (i7 != 256 ? b : (byte) 1);
                Object Q3 = go1Var2.Q();
                if (i8 != 0 || Q3 == jpVar) {
                    Q3 = new fd4(list2, z4, tm1Var, b);
                    go1Var2.o0(Q3);
                }
                c21.e(kv4Var, ne1Var, e0, T, f, kpVar, null, false, null, (tm1) Q3, go1Var2, 3120);
                go1 go1Var3 = go1Var2;
                go1Var3.q(b);
                go1Var = go1Var3;
            } else {
                go1Var2.d0(-429400161);
                a5.a(nq4.c, null, false, p70.u0(254661506, new in1() { // from class: gd4
                    @Override // defpackage.in1
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final boolean z6;
                        wx wxVar = (wx) obj;
                        fe0 fe0Var2 = (fe0) obj2;
                        int intValue2 = ((Integer) obj3).intValue();
                        wxVar.getClass();
                        if ((intValue2 & 6) == 0) {
                            intValue2 |= ((go1) fe0Var2).g(wxVar) ? 4 : 2;
                        }
                        go1 go1Var4 = (go1) fe0Var2;
                        if (go1Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                            final float a2 = ((xx) wxVar).a();
                            List<cd4> list3 = list2;
                            boolean g2 = go1Var4.g(list3) | go1Var4.d(a2);
                            Object Q4 = go1Var4.Q();
                            jp jpVar2 = de0.a;
                            Object obj4 = Q4;
                            if (g2 || Q4 == jpVar2) {
                                list3.getClass();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                float f2 = 0.0f;
                                for (cd4 cd4Var : list3) {
                                    float r = (he4.r(cd4Var.b) * 132.0f) + 16.0f;
                                    if (r > a2) {
                                        r = a2;
                                    }
                                    float f3 = arrayList3.isEmpty() ? r : 12.0f + r;
                                    if (!arrayList3.isEmpty() && f2 + f3 > a2) {
                                        arrayList2.add(arrayList3);
                                        arrayList3 = new ArrayList();
                                        f2 = 0.0f;
                                    }
                                    arrayList3.add(cd4Var);
                                    if (arrayList3.size() != 1) {
                                        r += 12.0f;
                                    }
                                    f2 += r;
                                }
                                if (!arrayList3.isEmpty()) {
                                    arrayList2.add(arrayList3);
                                }
                                go1Var4.o0(arrayList2);
                                obj4 = arrayList2;
                            }
                            final List list4 = (List) obj4;
                            Integer valueOf2 = Integer.valueOf(list4.size());
                            boolean z7 = z;
                            Boolean valueOf3 = Boolean.valueOf(z7);
                            boolean z8 = z2;
                            Boolean valueOf4 = Boolean.valueOf(z8);
                            ag2 ag2Var2 = ag2Var;
                            Object[] objArr = {ag2Var2, valueOf2, valueOf3, valueOf4};
                            boolean g3 = go1Var4.g(ag2Var2) | go1Var4.i(list4);
                            List list5 = list;
                            boolean i9 = g3 | go1Var4.i(list5) | go1Var4.h(z7) | go1Var4.h(z8);
                            rm1 rm1Var2 = rm1Var;
                            boolean g4 = i9 | go1Var4.g(rm1Var2);
                            Object Q5 = go1Var4.Q();
                            if (g4 || Q5 == jpVar2) {
                                be4 be4Var = new be4(ag2Var2, list4, list5, z7, z8, rm1Var2, (fj0) null);
                                z6 = z8;
                                go1Var4.o0(be4Var);
                                Q5 = be4Var;
                            } else {
                                z6 = z8;
                            }
                            mw2.k(objArr, (hn1) Q5, go1Var4);
                            ne1 ne1Var2 = nq4.c;
                            li3 T2 = i42.T(0.0f, 0.0f, 12.0f, 7);
                            kp kpVar2 = new kp(12.0f, true, new y9());
                            boolean i10 = go1Var4.i(list4);
                            final tm1 tm1Var2 = tm1Var;
                            boolean g5 = i10 | go1Var4.g(tm1Var2) | go1Var4.d(a2) | go1Var4.h(z6);
                            Object Q6 = go1Var4.Q();
                            if (g5 || Q6 == jpVar2) {
                                Q6 = new tm1() { // from class: md4
                                    @Override // defpackage.tm1
                                    public final Object invoke(Object obj5) {
                                        of2 of2Var = (of2) obj5;
                                        of2Var.getClass();
                                        fa4 fa4Var = new fa4((byte) 12);
                                        List list6 = list4;
                                        of2Var.a0(list6.size(), new ee(fa4Var, list6, (byte) 23), new v30(list6, (byte) 17), new tc0(2039820996, new ce4(list6, tm1Var2, a2), true));
                                        if (z6) {
                                            of2Var.Z("loading_more", "loading", wx5.j);
                                        }
                                        return wd5.a;
                                    }
                                };
                                go1Var4.o0(Q6);
                            }
                            e21.c(ne1Var2, ag2Var2, T2, kpVar2, null, null, false, null, (tm1) Q6, go1Var4, 24966, 488);
                        } else {
                            go1Var4.W();
                        }
                        return wd5.a;
                    }
                }, go1Var2), go1Var2, 3078, 6);
                go1Var2.q(false);
                go1Var = go1Var2;
            }
        } else {
            go1Var2.W();
            go1Var = go1Var2;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new yl2(list, z, z2, ag2Var, rm1Var, tm1Var, i, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    public static final void f(boolean z, String str, tm1 tm1Var, boolean z2, boolean z3, rm1 rm1Var, rm1 rm1Var2, fe0 fe0Var, int i) {
        rm1 rm1Var3;
        boolean z4;
        String str2;
        go1 go1Var;
        ?? r3;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-633493857);
        int i2 = i | (go1Var2.h(z) ? 4 : 2) | (go1Var2.g(str) ? 32 : 16) | (go1Var2.h(z2) ? 2048 : 1024) | (go1Var2.h(z3) ? 16384 : 8192) | (go1Var2.i(rm1Var) ? 131072 : 65536) | (go1Var2.i(rm1Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (go1Var2.T(i2 & 1, (599187 & i2) != 599186)) {
            cw4 b = eh.b(z ? 1.0f : 0.0f, rn.b, "searchResultsHeaderCollapse", go1Var2, 3072);
            k80 k80Var = ((fw2) go1Var2.k(lw2.b)).a;
            ba0 a2 = z90.a(i42.d, q8.V, go1Var2, 0);
            long j = go1Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var2.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var2, i13Var);
            xd0.c.getClass();
            go1Var2.h0();
            boolean z5 = go1Var2.S;
            df0 df0Var = wa2.A0;
            if (z5) {
                go1Var2.l(df0Var);
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
            l13 I = j42.I(nq4.e(i13Var, 1.0f), new ld4(56.0f, 36.0f, b, (byte) 0));
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = new l00(tm1Var, (byte) 3);
                go1Var2.o0(Q);
            }
            l13 A0 = i42.A0(I, (tm1) Q);
            u74 a3 = t74.a(i42.b, q8.T, go1Var2, 48);
            long j2 = go1Var2.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var2.m();
            l13 x02 = i42.x0(go1Var2, A0);
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, a3);
            qi4.k(go1Var2, sgVar2, m2);
            r7.G(i4, go1Var2, sgVar3, go1Var2);
            qi4.k(go1Var2, sgVar4, x02);
            Object Q2 = go1Var2.Q();
            if (Q2 == jpVar) {
                Q2 = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q2);
            }
            t43 t43Var = (t43) Q2;
            Object Q3 = go1Var2.Q();
            if (Q3 == jpVar) {
                Q3 = r7.v(go1Var2);
            }
            t33 t33Var = (t33) Q3;
            byte b2 = 1;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.G, k80Var.u, ((Boolean) ut0.w(t33Var, go1Var2).getValue()).booleanValue(), "searchResultsBackBg", go1Var2, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.q, k80Var.v, "searchResultsBackFg", go1Var2, 3072);
            go1 go1Var3 = go1Var2;
            l13 H = p70.H(o7.m(j42.I(i13Var, new ld4(48.0f, 34.0f, b, b2)), jo.b), t0);
            Object Q4 = go1Var3.Q();
            if (Q4 == jpVar) {
                r3 = 0;
                Q4 = new qd4(t43Var, (byte) 0);
                go1Var3.o0(Q4);
            } else {
                r3 = 0;
            }
            l13 B = mw2.B(r13.d(i42.A0(H, (tm1) Q4), null, null, null, null, rm1Var, null, null, null, null, null, new t64(r3), t33Var, 65279), r3, t33Var, 1);
            uw2 c = px.c(q8.N, r3);
            long j3 = go1Var3.T;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var3.m();
            l13 x03 = i42.x0(go1Var3, B);
            go1Var3.h0();
            if (go1Var3.S) {
                go1Var3.l(df0Var);
            } else {
                go1Var3.r0();
            }
            qi4.k(go1Var3, sgVar, c);
            qi4.k(go1Var3, sgVar2, m3);
            r7.G(i5, go1Var3, sgVar3, go1Var3);
            qi4.k(go1Var3, sgVar4, x03);
            ow1.a(a5.E(), "返回", p70.G(j42.I(i13Var, new ld4(24.0f, 18.0f, b, b2)), s0, k80Var.q, false, null, 12), k80Var.q, go1Var3, 48);
            go1Var3.q(true);
            float f = 16.0f;
            oh4.a(go1Var3, nq4.n(i13Var, 16.0f));
            str2 = str;
            g(str2, b, go1Var3, (i2 & 112) | 6);
            if (z2) {
                go1Var3.d0(1192187908);
                oh4.a(go1Var3, nq4.n(i13Var, 12.0f));
                z4 = z3;
                rm1Var3 = rm1Var2;
                a(z4, rm1Var3, go1Var3, ((i2 >> 12) & 14) | ((i2 >> 15) & 112));
                go1Var3.q(r3);
            } else {
                z4 = z3;
                rm1Var3 = rm1Var2;
                go1Var3.d0(1192407977);
                go1Var3.q(r3);
            }
            go1Var3.q(true);
            oh4.a(go1Var3, j42.I(i13Var, new ld4(f, 8.0f, b, r3)));
            go1Var3.q(true);
            go1Var = go1Var3;
        } else {
            rm1Var3 = rm1Var2;
            z4 = z3;
            str2 = str;
            go1Var2.W();
            go1Var = go1Var2;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new jn2(z, str2, tm1Var, z2, z4, rm1Var, rm1Var3, i);
        }
    }

    public static final void g(String str, cw4 cw4Var, fe0 fe0Var, int i) {
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1407400655);
        int i2 = (go1Var2.g(str) ? 32 : 16) | i | (go1Var2.g(cw4Var) ? 256 : 128);
        if (go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
            String C = r7.C("「", str, "」的搜索结果");
            i51 i51Var = lw2.b;
            m65 m65Var = ((fw2) go1Var2.k(i51Var)).b.g;
            long j = ((fw2) go1Var2.k(i51Var)).a.q;
            qk1 qk1Var = qk1.P;
            long p = oh4.p(4294967296L, vt0.G(20.0f, 15.0f, ((Number) cw4Var.getValue()).floatValue()));
            if (1.0f <= 0.0d) {
                o02.a("invalid weight; must be greater than zero");
            }
            go1Var = go1Var2;
            r55.b(C, new sc2(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, p, qk1Var, 0L, null, 0L, 2, false, 1, 0, m65Var, go1Var, 1572864, 24960, 110504);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj1((byte) 18, i, str, cw4Var);
        }
    }

    public static final void h(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2136047413);
        if (go1Var.T(i & 1, i != 0)) {
            l13 E0 = i42.E0(nq4.e(i13.a, 1.0f), 0.0f, 12.0f, 1);
            uw2 c = px.c(q8.N, false);
            long j = go1Var.T;
            int i2 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i2));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            p70.i(null, 32.0f, 0L, go1Var, 48, 5);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new fa4((byte) 13, i);
        }
    }

    public static final void i(final String str, final boolean z, fe0 fe0Var, final int i) {
        int i2;
        hx1 hx1Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1084956513);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                hx1Var = e21.t();
            } else {
                hx1Var = eg5.b;
                if (hx1Var == null) {
                    gx1 gx1Var = new gx1("Filled.SearchOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i3 = th5.a;
                    long j = x70.b;
                    rt4 rt4Var = new rt4(j);
                    ep epVar = new ep((byte) 13);
                    epVar.z(15.5f, 14.0f);
                    epVar.v(-0.79f);
                    epVar.y(-0.28f, -0.27f);
                    epVar.q(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
                    epVar.q(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
                    epVar.q(6.08f, 3.0f, 3.28f, 5.64f, 3.03f, 9.0f);
                    epVar.v(2.02f);
                    epVar.q(5.3f, 6.75f, 7.18f, 5.0f, 9.5f, 5.0f);
                    epVar.q(11.99f, 5.0f, 14.0f, 7.01f, 14.0f, 9.5f);
                    epVar.C(11.99f, 14.0f, 9.5f, 14.0f);
                    epVar.r(-0.17f, 0.0f, -0.33f, -0.03f, -0.5f, -0.05f);
                    epVar.M(2.02f);
                    epVar.q(9.17f, 15.99f, 9.33f, 16.0f, 9.5f, 16.0f);
                    epVar.r(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
                    epVar.x(14.0f, 14.71f);
                    epVar.M(0.79f);
                    epVar.y(5.0f, 4.99f);
                    epVar.x(20.49f, 19.0f);
                    epVar.x(15.5f, 14.0f);
                    epVar.p();
                    gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
                    rt4 rt4Var2 = new rt4(j);
                    ep epVar2 = new ep((byte) 13);
                    epVar2.z(6.47f, 10.82f);
                    epVar2.y(-2.47f, 2.47f);
                    epVar2.y(-2.47f, -2.47f);
                    epVar2.y(-0.71f, 0.71f);
                    epVar2.y(2.47f, 2.47f);
                    epVar2.y(-2.47f, 2.47f);
                    epVar2.y(0.71f, 0.71f);
                    epVar2.y(2.47f, -2.47f);
                    epVar2.y(2.47f, 2.47f);
                    epVar2.y(0.71f, -0.71f);
                    epVar2.y(-2.47f, -2.47f);
                    epVar2.y(2.47f, -2.47f);
                    epVar2.p();
                    gx1.a(gx1Var, (ArrayList) epVar2.J, rt4Var2);
                    hx1Var = gx1Var.b();
                    eg5.b = hx1Var;
                }
            }
            p70.q(hx1Var, str, nq4.c, null, z ? rw4.J : rw4.I, false, null, go1Var, ((i2 << 3) & 112) | RendererCapabilities.DECODER_SUPPORT_MASK, 104);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: hd4
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i | 1);
                    he4.i(str, z, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.hu2 r43, final defpackage.l13 r44, defpackage.fe0 r45, final int r46) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he4.j(hu2, l13, fe0, int):void");
    }

    public static final void k(String str, boolean z, rm1 rm1Var, fe0 fe0Var, int i) {
        char c;
        long j;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1258801610);
        int i2 = i | (go1Var.g(str) ? 4 : 2) | (go1Var.h(z) ? 32 : 16) | (go1Var.i(rm1Var) ? 256 : 128);
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
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
            long j2 = z ? k80Var.d : k80Var.s;
            boolean booleanValue = ((Boolean) t43Var.getValue()).booleanValue();
            if (z) {
                c = ' ';
                j = k80Var.c;
            } else {
                c = ' ';
                j = k80Var.G;
            }
            cw4 t0 = p70.t0(booleanValue, j, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "searchTabBg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j2, k80Var.v, "searchTabFg", go1Var, 3072);
            i13 i13Var = i13.a;
            l13 H = p70.H(o7.m(nq4.g(i13Var, 32.0f), jo.b), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new xx2(t43Var, (byte) 25);
                go1Var.o0(Q3);
            }
            l13 E0 = i42.E0(mw2.B(r13.d(i42.A0(H, (tm1) Q3), null, null, null, null, rm1Var, null, null, null, null, null, new t64(0), t33Var, 65279), false, t33Var, 1), 14.0f, 0.0f, 2);
            u74 a2 = t74.a(i42.b, q8.T, go1Var, 48);
            long j3 = go1Var.T;
            int i3 = (int) (j3 ^ (j3 >>> c));
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
            r55.b(str, p70.G(i13Var, s0, j2, false, null, 12), j2, 0L, (z || ((Boolean) t43Var.getValue()).booleanValue()) ? qk1.P : qk1.N, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.m, go1Var, i2 & 14, 24576, 114616);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new t20(str, z, rm1Var, i, (byte) 4);
        }
    }

    public static final void l(re4 re4Var, tm1 tm1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-2117445473);
        int i2 = (go1Var.e(re4Var.ordinal()) ? 4 : 2) | i | (go1Var.i(tm1Var) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            u74 a2 = t74.a(new kp(8.0f, true, new y9()), q8.S, go1Var, 6);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
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
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            go1Var.d0(-1791266426);
            za1 za1Var = re4.N;
            v2 o = hf1.o(za1Var, za1Var);
            while (o.hasNext()) {
                re4 re4Var2 = (re4) o.next();
                String str = re4Var2.I;
                boolean z = re4Var2 == re4Var;
                boolean e = ((i2 & 112) == 32) | go1Var.e(re4Var2.ordinal());
                Object Q = go1Var.Q();
                if (e || Q == de0.a) {
                    Q = new jt2(tm1Var, re4Var2, (byte) 16);
                    go1Var.o0(Q);
                }
                k(str, z, (rm1) Q, go1Var, 0);
            }
            go1Var.q(false);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj1((byte) 19, i, re4Var, tm1Var);
        }
    }

    public static final void m(int i, fe0 fe0Var, rm1 rm1Var, tm1 tm1Var, String str) {
        int i2;
        tm1 tm1Var2;
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(941849216);
        if ((i & 6) == 0) {
            i2 = (go1Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            tm1Var2 = tm1Var;
            i2 |= go1Var2.i(tm1Var2) ? 32 : 16;
        } else {
            tm1Var2 = tm1Var;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var2.i(rm1Var) ? 256 : 128;
        }
        byte b = 1;
        if (go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            m65 a2 = m65.a(((fw2) go1Var2.k(i51Var)).b.j, k80Var.q, 0L, null, null, 0L, null, 0L, null, 16777214);
            rt4 rt4Var = new rt4(k80Var.a);
            l13 E0 = i42.E0(mw2.p(nq4.g(nq4.e(i13.a, 1.0f), r13.e(go1Var2) ? 56.0f : 54.0f), k80Var.G, a), 16.0f, 0.0f, 2);
            boolean z = (i2 & 896) == 256;
            Object Q = go1Var2.Q();
            if (z || Q == de0.a) {
                Q = new b40(rm1Var, (byte) 12);
                go1Var2.o0(Q);
            }
            go1Var = go1Var2;
            ev.a(str, tm1Var2, E0, false, a2, new y82(119), new x82(47, (tm1) Q), true, 0, 0, null, null, null, rt4Var, p70.u0(1980678051, new n03(k80Var, str, b), go1Var2), go1Var, (i2 & 14) | 102236160 | (i2 & 112), 15896);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ve(str, tm1Var, rm1Var, i, (byte) 6);
        }
    }

    public static final void n(int i, fe0 fe0Var, hx1 hx1Var, String str) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1415074976);
        int i2 = i | (go1Var.g(hx1Var) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            i13 i13Var = i13.a;
            l13 D0 = i42.D0(nq4.e(i13Var, 1.0f), 4.0f, 8.0f);
            u74 a2 = t74.a(new kp(8.0f, true, new y9()), q8.T, go1Var, 54);
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
            i51 i51Var = lw2.b;
            ow1.a(hx1Var, null, nq4.k(i13Var, 16.0f), ((fw2) go1Var.k(i51Var)).a.s, go1Var, ((i2 >> 3) & 14) | 432);
            r55.b(str, null, ((fw2) go1Var.k(i51Var)).a.q, 0L, qk1.O, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.i, go1Var, 1572870, 0, 131002);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ol0(str, hx1Var, i);
        }
    }

    public static final void o(final String str, final rm1 rm1Var, hx1 hx1Var, Integer num, long j, fe0 fe0Var, final int i, final int i2) {
        hx1 hx1Var2;
        int i3;
        Integer num2;
        int i4;
        long j2;
        int i5;
        final hx1 hx1Var3;
        final Integer num3;
        final long j3;
        t43 t43Var;
        boolean z;
        boolean z2;
        t43 t43Var2;
        hx1 hx1Var4;
        k80 k80Var;
        i13 i13Var;
        i51 i51Var;
        dn4 dn4Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1154224102);
        int i6 = i | (go1Var.g(str) ? 4 : 2) | (go1Var.i(rm1Var) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | RendererCapabilities.DECODER_SUPPORT_MASK;
            hx1Var2 = hx1Var;
        } else {
            hx1Var2 = hx1Var;
            i3 = i6 | (go1Var.g(hx1Var2) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i3 | 3072;
            num2 = num;
        } else {
            num2 = num;
            i4 = i3 | (go1Var.g(num2) ? 2048 : 1024);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i5 = i4 | 24576;
            j2 = j;
        } else {
            j2 = j;
            i5 = i4 | (go1Var.f(j2) ? 16384 : 8192);
        }
        int i10 = i5;
        if (go1Var.T(i10 & 1, (i10 & 9363) != 9362)) {
            hx1 hx1Var5 = i7 != 0 ? null : hx1Var2;
            Integer num4 = i8 != 0 ? null : num2;
            long j4 = i9 != 0 ? 0L : j2;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var3 = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            t43 w = ut0.w(t33Var, go1Var);
            i51 i51Var2 = lw2.b;
            k80 k80Var2 = ((fw2) go1Var.k(i51Var2)).a;
            cw4 t0 = p70.t0(((Boolean) t43Var3.getValue()).booleanValue(), k80Var2.G, k80Var2.u, ((Boolean) w.getValue()).booleanValue(), "searchResultsSplitRowBg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var3.getValue()).booleanValue(), k80Var2.q, k80Var2.v, "searchResultsSplitRowFg", go1Var, 3072);
            cw4 s02 = p70.s0(((Boolean) t43Var3.getValue()).booleanValue(), k80Var2.s, k80Var2.v, "searchResultsSplitRowValue", go1Var, 3072);
            go1 go1Var2 = go1Var;
            i13 i13Var2 = i13.a;
            l13 H = p70.H(o7.m(nq4.g(nq4.e(i13Var2, 1.0f), 40.0f), jo.b), t0);
            Object Q3 = go1Var2.Q();
            if (Q3 == jpVar) {
                t43Var = t43Var3;
                Q3 = new xx2(t43Var, (byte) 26);
                go1Var2.o0(Q3);
            } else {
                t43Var = t43Var3;
            }
            l13 E0 = i42.E0(mw2.B(r13.d(i42.A0(H, (tm1) Q3), null, null, null, null, rm1Var, null, null, null, null, null, new t64(0), t33Var, 65279), false, t33Var, 1), 10.0f, 0.0f, 2);
            u74 a2 = t74.a(new kp(10.0f, true, new y9()), q8.T, go1Var2, 54);
            long j5 = go1Var2.T;
            int i11 = (int) (j5 ^ (j5 >>> 32));
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
            Integer valueOf = Integer.valueOf(i11);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var2, sgVar3, valueOf);
            qi4.j(go1Var2);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var2, sgVar4, x0);
            if (num4 != null) {
                go1Var2.d0(1441639398);
                boolean z4 = num4.intValue() <= 3;
                l13 k = nq4.k(i13Var2, 26.0f);
                long j6 = z4 ? k80Var2.a : k80Var2.G;
                if (z4) {
                    go1Var2.d0(-646222489);
                    jp jpVar2 = dw2.a;
                    dn4Var = rt0.L(jp.r(), go1Var2);
                    go1Var2.q(false);
                } else {
                    go1Var2.d0(-646221688);
                    go1Var2.q(false);
                    dn4Var = jo.a;
                }
                l13 p = mw2.p(k, j6, dn4Var);
                uw2 c = px.c(q8.N, false);
                long j7 = go1Var2.T;
                int i12 = (int) (j7 ^ (j7 >>> 32));
                am3 m2 = go1Var2.m();
                l13 x02 = i42.x0(go1Var2, p);
                go1Var2.h0();
                if (go1Var2.S) {
                    go1Var2.l(df0Var);
                } else {
                    go1Var2.r0();
                }
                qi4.k(go1Var2, sgVar, c);
                qi4.k(go1Var2, sgVar2, m2);
                r7.G(i12, go1Var2, sgVar3, go1Var2);
                qi4.k(go1Var2, sgVar4, x02);
                t43Var2 = t43Var;
                r55.b(String.valueOf(num4.intValue()), null, z4 ? k80Var2.b : k80Var2.s, oh4.j(13), qk1.P, 0L, null, 0L, 0, false, 0, 0, xc3.d, go1Var2, 1597440, 0, 130986);
                go1Var2 = go1Var2;
                z = true;
                go1Var2.q(true);
                z2 = false;
                go1Var2.q(false);
                hx1Var4 = hx1Var5;
                i51Var = i51Var2;
                k80Var = k80Var2;
                i13Var = i13Var2;
            } else {
                z = true;
                z2 = false;
                t43Var2 = t43Var;
                if (hx1Var5 != null) {
                    go1Var2.d0(1442453396);
                    k80Var = k80Var2;
                    i13Var = i13Var2;
                    hx1 hx1Var6 = hx1Var5;
                    ow1.a(hx1Var6, null, p70.G(nq4.k(i13Var, 16.0f), s0, k80Var.s, false, null, 12), k80Var.s, go1Var2, ((i10 >> 6) & 14) | 48);
                    hx1Var4 = hx1Var6;
                    go1Var2.q(false);
                } else {
                    hx1Var4 = hx1Var5;
                    k80Var = k80Var2;
                    i13Var = i13Var2;
                    go1Var2.d0(1442755460);
                    go1Var2.q(false);
                }
                i51Var = i51Var2;
            }
            go1 go1Var3 = go1Var2;
            k80 k80Var3 = k80Var;
            i13 i13Var3 = i13Var;
            r55.b(str, p70.G(new sc2(1.0f, z), s0, k80Var.q, false, null, 12), k80Var.q, 0L, ((Boolean) t43Var2.getValue()).booleanValue() ? qk1.P : qk1.M, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var2.k(i51Var)).b.k, go1Var3, i10 & 14, 24960, 110520);
            if (j4 > 0) {
                go1Var3.d0(1443234100);
                String formatCount = DataModelKt.formatCount(j4);
                m65 m65Var = xc3.e;
                long j8 = k80Var3.s;
                r55.b(formatCount, p70.G(i13Var3, s02, j8, false, null, 12), j8, 0L, null, 0L, null, 0L, 0, false, 1, 0, m65Var, go1Var3, 0, 24576, 114680);
                go1Var = go1Var3;
                go1Var.q(false);
            } else {
                go1Var = go1Var3;
                go1Var.d0(1443536164);
                go1Var.q(false);
            }
            go1Var.q(true);
            hx1Var3 = hx1Var4;
            num3 = num4;
            j3 = j4;
        } else {
            go1Var.W();
            hx1Var3 = hx1Var2;
            num3 = num2;
            j3 = j2;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(str, rm1Var, hx1Var3, num3, j3, i, i2) { // from class: nd4
                public final /* synthetic */ String I;
                public final /* synthetic */ rm1 J;
                public final /* synthetic */ hx1 K;
                public final /* synthetic */ Integer L;
                public final /* synthetic */ long M;
                public final /* synthetic */ byte N;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.N = i2;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(1);
                    he4.o(this.I, this.J, this.K, this.L, this.M, (fe0) obj, X, this.N);
                    return wd5.a;
                }
            };
        }
    }

    public static final void p(Author author, rm1 rm1Var, fe0 fe0Var, int i) {
        int i2;
        cw4 cw4Var;
        rm1 rm1Var2 = rm1Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-2007620429);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? go1Var.g(author) : go1Var.i(author) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(rm1Var2) ? 32 : 16;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
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
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.G, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "userCardBg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.q, k80Var.v, "userCardFg", go1Var, 3072);
            i13 i13Var = i13.a;
            l13 H = p70.H(o7.m(nq4.e(i13Var, 1.0f), jo.b), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new xx2(t43Var, (byte) 28);
                go1Var.o0(Q3);
            }
            rm1Var2 = rm1Var;
            l13 D0 = i42.D0(mw2.B(r13.d(i42.A0(H, (tm1) Q3), null, null, null, null, rm1Var2, null, null, null, null, null, new t64(0), t33Var, 65279), false, t33Var, 1), 12.0f, 10.0f);
            uv uvVar = q8.T;
            go1Var = go1Var;
            u74 a2 = t74.a(new kp(12.0f, true, new y9()), uvVar, go1Var, 54);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
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
            Integer valueOf = Integer.valueOf(i3);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            SingletonAsyncImageKt.m55AsyncImage10Xjiaw((String) o70.U0(author.getAvatarThumb().getUrlList()), author.getNickname(), p70.G(o7.m(nq4.k(i13Var, 56.0f), l74.a), s0, k80Var.q, false, null, 12), null, null, null, li0.a, 0.0f, null, 0, false, go1Var, 1572864, 0, 1976);
            l13 x = nt3.x(i13Var, 1.0f);
            ba0 a3 = z90.a(new kp(2.0f, true, new y9()), q8.V, go1Var, 6);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, x);
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
            u74 a4 = t74.a(new kp(8.0f, true, new y9()), uvVar, go1Var, 54);
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
            String nickname = author.getNickname();
            if (jx4.L(nickname)) {
                nickname = "抖音用户";
            }
            m65 m65Var = ((fw2) go1Var.k(i51Var)).b.i;
            qk1 qk1Var = qk1.P;
            long j4 = k80Var.q;
            if (1.0f <= 0.0d) {
                o02.a("invalid weight; must be greater than zero");
            }
            r55.b(nickname, p70.G(new sc2(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), s0, k80Var.q, false, null, 12), j4, 0L, qk1Var, 0L, null, 0L, 2, false, 1, 0, m65Var, go1Var, 1572864, 24960, 110520);
            if (author.getFollowerCount() > 0) {
                go1Var.d0(60024981);
                String w2 = hf1.w("粉丝 ", DataModelKt.formatCount(author.getFollowerCount()));
                m65 m65Var2 = ((fw2) go1Var.k(i51Var)).b.n;
                long j5 = k80Var.s;
                l13 G = p70.G(i13Var, s0, j5, false, null, 12);
                cw4Var = s0;
                r55.b(w2, G, j5, 0L, null, 0L, null, 0L, 0, false, 1, 0, m65Var2, go1Var, 0, 24576, 114680);
                go1Var.q(false);
            } else {
                cw4Var = s0;
                go1Var.d0(60404173);
                go1Var.q(false);
            }
            go1Var.q(true);
            if (jx4.L(author.getSignature())) {
                go1Var.d0(1164972265);
                go1Var.q(false);
            } else {
                go1Var.d0(1164595119);
                String signature = author.getSignature();
                m65 m65Var3 = ((fw2) go1Var.k(i51Var)).b.l;
                long j6 = k80Var.s;
                r55.b(signature, p70.G(i13Var, cw4Var, j6, false, null, 12), j6, 0L, null, 0L, null, 0L, 2, false, 1, 0, m65Var3, go1Var, 0, 24960, 110584);
                go1Var.q(false);
            }
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new qj((byte) 11, i, author, rm1Var2);
        }
    }

    public static final void q(List list, boolean z, boolean z2, rm1 rm1Var, tm1 tm1Var, fe0 fe0Var, int i) {
        x04 u;
        id4 id4Var;
        int ordinal;
        Object vd4Var;
        int i2;
        int i3;
        int i4;
        wd2 wd2Var;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        float f2;
        ag2 ag2Var;
        List list2;
        boolean z3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(905569521);
        int i9 = i | (go1Var.g(list) ? 4 : 2) | (go1Var.h(z) ? 32 : 16) | (go1Var.h(z2) ? 256 : 128) | (go1Var.i(rm1Var) ? 2048 : 1024) | (go1Var.i(tm1Var) ? 16384 : 8192);
        if (!go1Var.T(i9 & 1, (i9 & 9363) != 9362)) {
            go1Var.W();
        } else {
            if (list.isEmpty()) {
                go1Var.d0(1132203347);
                i("未找到相关用户", false, go1Var, 54);
                go1Var.q(false);
                u = go1Var.u();
                if (u != null) {
                    id4Var = new id4(list, z, z2, rm1Var, tm1Var, i, (byte) 0);
                    u.d = id4Var;
                }
                return;
            }
            go1Var.d0(1132293681);
            go1Var.q(false);
            boolean e = r13.e(go1Var);
            jp jpVar = de0.a;
            if (e) {
                go1Var.d0(1132348303);
                ag2 a2 = bg2.a(go1Var);
                Object[] objArr = {a2, Integer.valueOf(list.size()), Boolean.valueOf(z), Boolean.valueOf(z2)};
                int i10 = i9 & 14;
                int i11 = i9 & 896;
                boolean g = ((i9 & 112) == 32) | go1Var.g(a2) | (i10 == 4) | (i11 == 256) | ((i9 & 7168) == 2048);
                Object Q = go1Var.Q();
                if (g || Q == jpVar) {
                    i5 = i10;
                    i6 = i11;
                    f = 12.0f;
                    i7 = i9;
                    i8 = 7;
                    f2 = 0.0f;
                    bi2 bi2Var = new bi2(a2, list, z, z2, rm1Var, null, (byte) 3);
                    ag2Var = a2;
                    list2 = list;
                    z3 = z2;
                    go1Var.o0(bi2Var);
                    Q = bi2Var;
                } else {
                    i6 = i11;
                    f = 12.0f;
                    i5 = i10;
                    i7 = i9;
                    i8 = 7;
                    z3 = z2;
                    ag2Var = a2;
                    f2 = 0.0f;
                    list2 = list;
                }
                mw2.k(objArr, (hn1) Q, go1Var);
                ne1 ne1Var = nq4.c;
                li3 T = i42.T(f2, f2, f, i8);
                ag2 ag2Var2 = ag2Var;
                kp kpVar = new kp(10.0f, true, new y9());
                boolean z4 = (i5 == 4) | ((i7 & 57344) == 16384) | (i6 == 256);
                Object Q2 = go1Var.Q();
                if (z4 || Q2 == jpVar) {
                    Q2 = new fd4(list2, z3, tm1Var, (byte) 1);
                    go1Var.o0(Q2);
                }
                e21.c(ne1Var, ag2Var2, T, kpVar, null, null, false, null, (tm1) Q2, go1Var, 24966, 488);
                go1Var.q(false);
            } else {
                go1Var.d0(1133453484);
                int i12 = (((cj1) go1Var.k(dj1.a)).a == br3.K || (ordinal = ((bw0) go1Var.k(cw0.a)).a.ordinal()) == 0) ? 2 : ordinal != 1 ? ordinal != 2 ? 5 : 4 : 3;
                wd2 a3 = yd2.a(go1Var);
                Object[] objArr2 = {a3, Integer.valueOf(list.size()), Boolean.valueOf(z), Boolean.valueOf(z2)};
                int i13 = i9 & 14;
                int i14 = i9 & 896;
                boolean g2 = go1Var.g(a3) | (i13 == 4) | go1Var.e(i12) | ((i9 & 112) == 32) | (i14 == 256) | ((i9 & 7168) == 2048);
                Object Q3 = go1Var.Q();
                if (g2 || Q3 == jpVar) {
                    i2 = i13;
                    i3 = i9;
                    i4 = i14;
                    vd4Var = new vd4(a3, list, i12, z, z2, rm1Var, null, (byte) 1);
                    wd2Var = a3;
                    go1Var.o0(vd4Var);
                } else {
                    i2 = i13;
                    i3 = i9;
                    i4 = i14;
                    vd4Var = Q3;
                    wd2Var = a3;
                }
                mw2.k(objArr2, (hn1) vd4Var, go1Var);
                ur1 ur1Var = new ur1(i12);
                ne1 ne1Var2 = nq4.c;
                li3 T2 = i42.T(0.0f, 0.0f, 12.0f, 7);
                kp kpVar2 = new kp(10.0f, true, new y9());
                kp kpVar3 = new kp(10.0f, true, new y9());
                boolean e2 = (i2 == 4) | ((i3 & 57344) == 16384) | (i4 == 256) | go1Var.e(i12);
                Object Q4 = go1Var.Q();
                if (e2 || Q4 == jpVar) {
                    jd4 jd4Var = new jd4(list, z2, tm1Var, i12, (byte) 0);
                    go1Var.o0(jd4Var);
                    Q4 = jd4Var;
                }
                k21.i(ur1Var, ne1Var2, wd2Var, T2, kpVar3, kpVar2, null, false, null, (tm1) Q4, go1Var, 1772592);
                go1Var = go1Var;
                go1Var.q(false);
            }
        }
        u = go1Var.u();
        if (u != null) {
            id4Var = new id4(list, z, z2, rm1Var, tm1Var, i, (byte) 1);
            u.d = id4Var;
        }
    }

    public static final float r(Aweme aweme) {
        float width = aweme.getVideo().getWidth();
        float height = aweme.getVideo().getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return 1.7777778f;
        }
        return width / height;
    }
}
