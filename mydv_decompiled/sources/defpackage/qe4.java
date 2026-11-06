package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.RendererCapabilities;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.HotWord;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class qe4 {
    public static final k74 a = l74.a(16.0f);
    public static final k74 b = l74.a(10.0f);
    public static final List c = p70.k0("热门", "搞笑", "美食", "音乐", "游戏", "舞蹈", "知识", "旅行", "萌宠", "动漫", "科技", "体育", "影视", "生活", "汽车");

    public static final void a(tm1 tm1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1224234047);
        int i2 = (go1Var.i(tm1Var) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            ba0 a2 = z90.a(i42.d, q8.V, go1Var, 0);
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
            hx1 hx1Var = eg5.g;
            if (hx1Var == null) {
                gx1 gx1Var = new gx1("Filled.TrendingUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i4 = th5.a;
                rt4 rt4Var = new rt4(x70.b);
                ep epVar = new ep((byte) 13);
                epVar.z(16.0f, 6.0f);
                epVar.y(2.29f, 2.29f);
                epVar.y(-4.88f, 4.88f);
                epVar.y(-4.0f, -4.0f);
                epVar.x(2.0f, 16.59f);
                epVar.x(3.41f, 18.0f);
                epVar.y(6.0f, -6.0f);
                epVar.y(4.0f, 4.0f);
                epVar.y(6.3f, -6.29f);
                epVar.x(22.0f, 12.0f);
                epVar.L(6.0f);
                epVar.p();
                gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
                hx1Var = gx1Var.b();
                eg5.g = hx1Var;
            }
            q("热门搜索", hx1Var, null, null, go1Var, 6, 12);
            e41.d(null, i42.f, new kp(8.0f, true, new y9()), null, 0, 0, p70.u0(-2003576548, new j10((Object) tm1Var, (byte) 9), go1Var), go1Var, 1573296, 57);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ad2(i, tm1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(List list, final tm1 tm1Var, fe0 fe0Var, int i) {
        byte b2;
        sg sgVar = q8.a0;
        sg sgVar2 = q8.d0;
        sg sgVar3 = q8.b0;
        sg sgVar4 = q8.c0;
        tv tvVar = q8.V;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(902517385);
        int i2 = i | (go1Var.g(list) ? 4 : 2) | (go1Var.i(tm1Var) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            List l1 = o70.l1(list, 14);
            List l12 = o70.l1(l1, 7);
            List Q0 = o70.Q0(l1, 7);
            ba0 a2 = z90.a(i42.d, tvVar, go1Var, 0);
            int i3 = 32;
            long j = go1Var.T;
            int i4 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var, i13Var);
            xd0.c.getClass();
            go1Var.h0();
            boolean z = go1Var.S;
            rm1 rm1Var = wa2.A0;
            if (z) {
                go1Var.l(rm1Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar4, a2);
            qi4.k(go1Var, sgVar3, m);
            r7.G(i4, go1Var, sgVar2, go1Var);
            qi4.k(go1Var, sgVar, x0);
            boolean z2 = 1;
            q("热搜榜", lq2.J(), null, null, go1Var, 6, 12);
            boolean e = r13.e(go1Var);
            Object obj = de0.a;
            if (e) {
                go1Var.d0(854775627);
                ba0 a3 = z90.a(new kp(4.0f, true, new y9()), tvVar, go1Var, 6);
                long j2 = go1Var.T;
                int i5 = (int) (j2 ^ (j2 >>> 32));
                am3 m2 = go1Var.m();
                l13 x02 = i42.x0(go1Var, i13Var);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(rm1Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a3);
                qi4.k(go1Var, sgVar3, m2);
                r7.G(i5, go1Var, sgVar2, go1Var);
                qi4.k(go1Var, sgVar, x02);
                go1Var.d0(-7575280);
                int i6 = 0;
                for (Object obj2 : l1) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        p70.A0();
                        throw null;
                    }
                    final HotWord hotWord = (HotWord) obj2;
                    boolean i8 = ((i2 & 112) == i3) | go1Var.i(hotWord);
                    Object Q = go1Var.Q();
                    if (i8 || Q == obj) {
                        final byte b3 = 0;
                        Q = new rm1() { // from class: ke4
                            @Override // defpackage.rm1
                            public final Object invoke() {
                                byte b4 = b3;
                                wd5 wd5Var = wd5.a;
                                HotWord hotWord2 = hotWord;
                                tm1 tm1Var2 = tm1Var;
                                switch (b4) {
                                    case 0:
                                        tm1Var2.invoke(hotWord2.getWord());
                                        break;
                                    case 1:
                                        tm1Var2.invoke(hotWord2.getWord());
                                        break;
                                    default:
                                        tm1Var2.invoke(hotWord2.getWord());
                                        break;
                                }
                                return wd5Var;
                            }
                        };
                        go1Var.o0(Q);
                    }
                    c(i7, hotWord, (rm1) Q, go1Var, HotWord.$stable << 3);
                    i6 = i7;
                    i3 = 32;
                }
                r7.J(go1Var, false, true, false);
            } else {
                go1Var.d0(855209379);
                u74 a4 = t74.a(new kp(12.0f, true, new y9()), q8.S, go1Var, 6);
                long j3 = go1Var.T;
                int i9 = (int) (j3 ^ (j3 >>> 32));
                am3 m3 = go1Var.m();
                l13 x03 = i42.x0(go1Var, i13Var);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(rm1Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a4);
                qi4.k(go1Var, sgVar3, m3);
                r7.G(i9, go1Var, sgVar2, go1Var);
                qi4.k(go1Var, sgVar, x03);
                l13 x = nt3.x(i13Var, 1.0f);
                ba0 a5 = z90.a(new kp(4.0f, true, new y9()), tvVar, go1Var, 6);
                long j4 = go1Var.T;
                int i10 = (int) (j4 ^ (j4 >>> 32));
                am3 m4 = go1Var.m();
                l13 x04 = i42.x0(go1Var, x);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(rm1Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a5);
                qi4.k(go1Var, sgVar3, m4);
                r7.G(i10, go1Var, sgVar2, go1Var);
                qi4.k(go1Var, sgVar, x04);
                go1Var.d0(1674663893);
                int i11 = 0;
                for (Object obj3 : l12) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        p70.A0();
                        throw null;
                    }
                    final HotWord hotWord2 = (HotWord) obj3;
                    boolean i13 = ((i2 & 112) == 32) | go1Var.i(hotWord2);
                    Object Q2 = go1Var.Q();
                    if (i13 || Q2 == obj) {
                        final byte b4 = 1;
                        Q2 = new rm1() { // from class: ke4
                            @Override // defpackage.rm1
                            public final Object invoke() {
                                byte b42 = b4;
                                wd5 wd5Var = wd5.a;
                                HotWord hotWord22 = hotWord2;
                                tm1 tm1Var2 = tm1Var;
                                switch (b42) {
                                    case 0:
                                        tm1Var2.invoke(hotWord22.getWord());
                                        break;
                                    case 1:
                                        tm1Var2.invoke(hotWord22.getWord());
                                        break;
                                    default:
                                        tm1Var2.invoke(hotWord22.getWord());
                                        break;
                                }
                                return wd5Var;
                            }
                        };
                        go1Var.o0(Q2);
                    }
                    c(i12, hotWord2, (rm1) Q2, go1Var, HotWord.$stable << 3);
                    i11 = i12;
                }
                go1Var.q(false);
                go1Var.q(true);
                l13 x2 = nt3.x(i13Var, 1.0f);
                ba0 a6 = z90.a(new kp(4.0f, true, new y9()), tvVar, go1Var, 6);
                long j5 = go1Var.T;
                int i14 = (int) (j5 ^ (j5 >>> 32));
                am3 m5 = go1Var.m();
                l13 x05 = i42.x0(go1Var, x2);
                xd0.c.getClass();
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(rm1Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a6);
                qi4.k(go1Var, sgVar3, m5);
                r7.G(i14, go1Var, sgVar2, go1Var);
                qi4.k(go1Var, sgVar, x05);
                go1Var.d0(-1160982659);
                int i15 = 0;
                for (Object obj4 : Q0) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        p70.A0();
                        throw null;
                    }
                    final HotWord hotWord3 = (HotWord) obj4;
                    int size = l12.size() + i16;
                    boolean i17 = ((i2 & 112) == 32) | go1Var.i(hotWord3);
                    Object Q3 = go1Var.Q();
                    if (i17 || Q3 == obj) {
                        final byte b5 = 2;
                        Q3 = new rm1() { // from class: ke4
                            @Override // defpackage.rm1
                            public final Object invoke() {
                                byte b42 = b5;
                                wd5 wd5Var = wd5.a;
                                HotWord hotWord22 = hotWord3;
                                tm1 tm1Var2 = tm1Var;
                                switch (b42) {
                                    case 0:
                                        tm1Var2.invoke(hotWord22.getWord());
                                        break;
                                    case 1:
                                        tm1Var2.invoke(hotWord22.getWord());
                                        break;
                                    default:
                                        tm1Var2.invoke(hotWord22.getWord());
                                        break;
                                }
                                return wd5Var;
                            }
                        };
                        go1Var.o0(Q3);
                    }
                    c(size, hotWord3, (rm1) Q3, go1Var, HotWord.$stable << 3);
                    i15 = i16;
                }
                go1Var.q(false);
                z2 = 1;
                go1Var.q(true);
                go1Var.q(true);
                go1Var.q(false);
            }
            go1Var.q(z2);
            b2 = z2;
        } else {
            b2 = 1;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new je4(list, tm1Var, i, b2);
        }
    }

    public static final void c(int i, HotWord hotWord, rm1 rm1Var, fe0 fe0Var, int i2) {
        int i3;
        char c2;
        k80 k80Var;
        long j;
        dn4 dn4Var;
        sg sgVar;
        long j2;
        i13 i13Var;
        boolean z;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-603429010);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? go1Var.g(hotWord) : go1Var.i(hotWord) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.i(rm1Var) ? 256 : 128;
        }
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
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
            k80 k80Var2 = ((fw2) go1Var.k(i51Var)).a;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), x70.f, k80Var2.u, ((Boolean) w.getValue()).booleanValue(), "search-hot-row-bg", go1Var, 24624, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var2.q, k80Var2.v, "search-hot-row-fg", go1Var, 3072);
            cw4 s02 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var2.s, k80Var2.v, "search-hot-row-value", go1Var, 3072);
            boolean z2 = i <= 3;
            int label = hotWord.getLabel();
            gb5 gb5Var = label != 1 ? label != 2 ? label != 3 ? null : new gb5("荐", new x70(k80Var2.h), new x70(k80Var2.i)) : new gb5("热", new x70(k80Var2.c), new x70(k80Var2.d)) : new gb5("新", new x70(k80Var2.l), new x70(k80Var2.m));
            i13 i13Var2 = i13.a;
            l13 H = p70.H(o7.m(nq4.g(nq4.e(i13Var2, 1.0f), 40.0f), jo.b), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                c2 = 2;
                Q3 = new qd4(t43Var, (byte) 2);
                go1Var.o0(Q3);
            } else {
                c2 = 2;
            }
            gb5 gb5Var2 = gb5Var;
            l13 E0 = i42.E0(mw2.B(r13.d(i42.A0(H, (tm1) Q3), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815), false, t33Var, 1), 8.0f, 0.0f, 2);
            u74 a2 = t74.a(new kp(10.0f, true, new y9()), q8.T, go1Var, 54);
            long j3 = go1Var.T;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z3 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z3) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar2 = q8.c0;
            qi4.k(go1Var, sgVar2, a2);
            sg sgVar3 = q8.b0;
            qi4.k(go1Var, sgVar3, m);
            Integer valueOf = Integer.valueOf(i4);
            sg sgVar4 = q8.d0;
            qi4.k(go1Var, sgVar4, valueOf);
            qi4.j(go1Var);
            sg sgVar5 = q8.a0;
            qi4.k(go1Var, sgVar5, x0);
            l13 k = nq4.k(i13Var2, 26.0f);
            if (z2) {
                k80Var = k80Var2;
                j = k80Var.a;
            } else {
                k80Var = k80Var2;
                j = k80Var.G;
            }
            if (z2) {
                go1Var.d0(-514703173);
                jp jpVar2 = dw2.a;
                dn4Var = rt0.L(jp.r(), go1Var);
                go1Var.q(false);
            } else {
                go1Var.d0(-514702372);
                go1Var.q(false);
                dn4Var = jo.a;
            }
            l13 p = mw2.p(k, j, dn4Var);
            vv vvVar = q8.N;
            uw2 c3 = px.c(vvVar, false);
            long j4 = go1Var.T;
            int i5 = (int) (j4 ^ (j4 >>> 32));
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar2, c3);
            qi4.k(go1Var, sgVar3, m2);
            r7.G(i5, go1Var, sgVar4, go1Var);
            qi4.k(go1Var, sgVar5, x02);
            String valueOf2 = String.valueOf(i);
            m65 m65Var = xc3.d;
            long j5 = oh4.j(13);
            qk1 qk1Var = qk1.P;
            if (z2) {
                sgVar = sgVar5;
                j2 = k80Var.b;
            } else {
                sgVar = sgVar5;
                j2 = k80Var.s;
            }
            k80 k80Var3 = k80Var;
            sg sgVar6 = sgVar;
            r55.b(valueOf2, null, j2, j5, qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var, 1597440, 0, 130986);
            go1Var.q(true);
            r55.b(hotWord.getWord(), p70.G(new sc2(1.0f, true), s0, k80Var3.q, false, null, 12), k80Var3.q, oh4.j(15), null, 0L, null, 0L, 2, false, 1, 0, m65.a(((fw2) go1Var.k(i51Var)).b.k, 0L, 0L, (z2 || ((Boolean) t43Var.getValue()).booleanValue()) ? qk1Var : qk1.M, null, 0L, null, 0L, null, 16777211), go1Var, 24576, 24960, 110568);
            go1Var = go1Var;
            if (gb5Var2 != null) {
                go1Var.d0(1225034210);
                String str = (String) gb5Var2.I;
                long j6 = ((x70) gb5Var2.J).a;
                long j7 = ((x70) gb5Var2.K).a;
                l13 E02 = i42.E0(mw2.p(nq4.g(i13Var2, 20.0f), j6, jo.a), 6.0f, 0.0f, 2);
                uw2 c4 = px.c(vvVar, false);
                long j8 = go1Var.T;
                int i6 = (int) (j8 ^ (j8 >>> 32));
                am3 m3 = go1Var.m();
                l13 x03 = i42.x0(go1Var, E02);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar2, c4);
                qi4.k(go1Var, sgVar3, m3);
                r7.G(i6, go1Var, sgVar4, go1Var);
                qi4.k(go1Var, sgVar6, x03);
                i13Var = i13Var2;
                z = false;
                r55.b(str, null, j7, oh4.j(10), qk1Var, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.o, go1Var, 1597440, 0, 130986);
                go1Var = go1Var;
                go1Var.q(true);
                go1Var.q(false);
            } else {
                i13Var = i13Var2;
                z = false;
                go1Var.d0(1225631952);
                go1Var.q(false);
            }
            if (hotWord.getHotValue() > 0) {
                go1Var.d0(1225694479);
                go1 go1Var2 = go1Var;
                r55.b(DataModelKt.formatCount(hotWord.getHotValue()), p70.G(nq4.p(i13Var, 44.0f, 0.0f, 2), s02, k80Var3.s, false, null, 12), k80Var3.s, 0L, null, 0L, new k25(6), 0L, 0, false, 1, 0, xc3.e, go1Var2, 0, 24576, 113656);
                go1Var = go1Var2;
                go1Var.q(z);
            } else {
                go1Var.d0(1226105136);
                go1Var.q(z);
            }
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new su3(i, hotWord, rm1Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r30, final defpackage.l13 r31, defpackage.hx1 r32, boolean r33, defpackage.ki1 r34, final defpackage.rm1 r35, defpackage.fe0 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe4.d(java.lang.String, l13, hx1, boolean, ki1, rm1, fe0, int, int):void");
    }

    public static final void e(final String str, final rm1 rm1Var, l13 l13Var, hx1 hx1Var, hx1 hx1Var2, rm1 rm1Var2, fe0 fe0Var, final int i, final int i2) {
        hx1 hx1Var3;
        int i3;
        hx1 hx1Var4;
        int i4;
        rm1 rm1Var3;
        int i5;
        final l13 l13Var2;
        final hx1 hx1Var5;
        final hx1 hx1Var6;
        final rm1 rm1Var4;
        t43 t43Var;
        boolean z;
        hx1 hx1Var7;
        cw4 cw4Var;
        hx1 hx1Var8;
        i13 i13Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1151431742);
        int i6 = i | (go1Var.g(str) ? 4 : 2) | (go1Var.i(rm1Var) ? 32 : 16);
        int i7 = i6 | RendererCapabilities.DECODER_SUPPORT_MASK;
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 = i6 | 3456;
            hx1Var3 = hx1Var;
        } else {
            hx1Var3 = hx1Var;
            i3 = i7 | (go1Var.g(hx1Var3) ? 2048 : 1024);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i4 = i3 | 24576;
            hx1Var4 = hx1Var2;
        } else {
            hx1Var4 = hx1Var2;
            i4 = i3 | (go1Var.g(hx1Var4) ? 16384 : 8192);
        }
        int i10 = i2 & 32;
        if (i10 != 0) {
            i5 = i4 | 196608;
            rm1Var3 = rm1Var2;
        } else {
            rm1Var3 = rm1Var2;
            i5 = i4 | (go1Var.i(rm1Var3) ? 131072 : 65536);
        }
        int i11 = i5;
        if (go1Var.T(i11 & 1, (i11 & 74899) != 74898)) {
            hx1 hx1Var9 = i8 != 0 ? null : hx1Var3;
            hx1 hx1Var10 = i9 != 0 ? null : hx1Var4;
            rm1 rm1Var5 = i10 != 0 ? null : rm1Var3;
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
            cw4 t0 = p70.t0(((Boolean) t43Var2.getValue()).booleanValue(), k80Var.G, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "search-chip-bg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), k80Var.q, k80Var.v, "search-chip-fg", go1Var, 3072);
            cw4 s02 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), k80Var.s, k80Var.v, "search-chip-icon", go1Var, 3072);
            i13 i13Var2 = i13.a;
            l13 H = p70.H(o7.m(nq4.g(i13Var2, 36.0f), jo.b), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                t43Var = t43Var2;
                Q3 = new qd4(t43Var, (byte) 3);
                go1Var.o0(Q3);
            } else {
                t43Var = t43Var2;
            }
            rm1 rm1Var6 = rm1Var5;
            l13 E0 = i42.E0(mw2.B(r13.d(i42.A0(H, (tm1) Q3), null, null, null, null, rm1Var, rm1Var5, null, null, null, null, null, t33Var, 130303), false, t33Var, 1), 14.0f, 0.0f, 2);
            u74 a2 = t74.a(new kp(6.0f, true, new y9()), q8.T, go1Var, 54);
            long j = go1Var.T;
            int i12 = (int) (j ^ (j >>> 32));
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
            qi4.k(go1Var, q8.d0, Integer.valueOf(i12));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            if (hx1Var9 != null) {
                go1Var.d0(-1609804311);
                cw4Var = s02;
                z = false;
                hx1 hx1Var11 = hx1Var9;
                ow1.a(hx1Var11, null, p70.G(nq4.k(i13Var2, 18.0f), s02, k80Var.s, false, null, 12), k80Var.s, go1Var, ((i11 >> 9) & 14) | 48);
                hx1Var7 = hx1Var11;
                go1Var.q(false);
            } else {
                z = false;
                hx1Var7 = hx1Var9;
                cw4Var = s02;
                go1Var.d0(-1609518584);
                go1Var.q(false);
            }
            r55.b(str, p70.G(i13Var2, s0, k80Var.q, false, null, 12), k80Var.q, 0L, ((Boolean) t43Var.getValue()).booleanValue() ? qk1.P : qk1.N, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.m, go1Var, i11 & 14, 24960, 110520);
            go1Var = go1Var;
            if (hx1Var10 != null) {
                go1Var.d0(-1609076927);
                i13Var = i13Var2;
                hx1Var8 = hx1Var10;
                ow1.a(hx1Var8, null, p70.G(nq4.k(i13Var, 14.0f), cw4Var, k80Var.s, false, null, 12), k80Var.s, go1Var, ((i11 >> 12) & 14) | 48);
                go1Var.q(false);
            } else {
                hx1Var8 = hx1Var10;
                i13Var = i13Var2;
                go1Var.d0(-1608783512);
                go1Var.q(false);
            }
            go1Var.q(true);
            hx1Var6 = hx1Var8;
            l13Var2 = i13Var;
            rm1Var4 = rm1Var6;
            hx1Var5 = hx1Var7;
        } else {
            go1Var.W();
            l13Var2 = l13Var;
            hx1Var5 = hx1Var3;
            hx1Var6 = hx1Var4;
            rm1Var4 = rm1Var3;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(str, rm1Var, l13Var2, hx1Var5, hx1Var6, rm1Var4, i, i2) { // from class: ne4
                public final /* synthetic */ String I;
                public final /* synthetic */ rm1 J;
                public final /* synthetic */ l13 K;
                public final /* synthetic */ hx1 L;
                public final /* synthetic */ hx1 M;
                public final /* synthetic */ rm1 N;
                public final /* synthetic */ byte O;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.O = i2;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(1);
                    qe4.e(this.I, this.J, this.K, this.L, this.M, this.N, (fe0) obj, X, this.O);
                    return wd5.a;
                }
            };
        }
    }

    public static final void f(rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i) {
        rm1 rm1Var2;
        l13 l13Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1344564861);
        int i2 = i | (go1Var.i(rm1Var) ? 4 : 2) | 48;
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
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), x70.f, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "search-history-clear-bg", go1Var, 24624, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.s, k80Var.v, "search-history-clear-fg", go1Var, 3072);
            i13 i13Var = i13.a;
            l13 H = p70.H(o7.m(nq4.g(i13Var, 30.0f), jo.b), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new qd4(t43Var, (byte) 1);
                go1Var.o0(Q3);
            }
            l13 d = r13.d(i42.A0(H, (tm1) Q3), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815);
            rm1Var2 = rm1Var;
            l13 E0 = i42.E0(mw2.B(d, false, t33Var, 1), 10.0f, 0.0f, 2);
            go1Var = go1Var;
            u74 a2 = t74.a(new kp(4.0f, true, new y9()), q8.T, go1Var, 54);
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
            hx1 hx1Var = g4.h;
            if (hx1Var == null) {
                gx1 gx1Var = new gx1("Filled.DeleteSweep", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i4 = th5.a;
                rt4 rt4Var = new rt4(x70.b);
                ep epVar = new ep((byte) 13);
                epVar.z(15.0f, 16.0f);
                epVar.v(4.0f);
                epVar.M(2.0f);
                epVar.v(-4.0f);
                epVar.p();
                epVar.z(15.0f, 8.0f);
                epVar.v(7.0f);
                epVar.M(2.0f);
                epVar.v(-7.0f);
                epVar.p();
                epVar.z(15.0f, 12.0f);
                epVar.v(6.0f);
                epVar.M(2.0f);
                epVar.v(-6.0f);
                epVar.p();
                epVar.z(3.0f, 18.0f);
                epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                epVar.v(6.0f);
                epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                epVar.x(13.0f, 8.0f);
                epVar.x(3.0f, 8.0f);
                epVar.M(10.0f);
                epVar.p();
                epVar.z(14.0f, 5.0f);
                epVar.v(-3.0f);
                epVar.y(-1.0f, -1.0f);
                epVar.x(6.0f, 4.0f);
                epVar.x(5.0f, 5.0f);
                epVar.x(2.0f, 5.0f);
                epVar.M(2.0f);
                epVar.v(12.0f);
                epVar.p();
                gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
                hx1Var = gx1Var.b();
                g4.h = hx1Var;
            }
            ow1.a(hx1Var, null, p70.G(nq4.k(i13Var, 16.0f), s0, k80Var.s, false, null, 12), k80Var.s, go1Var, 48);
            r55.b("清空历史", p70.G(i13Var, s0, k80Var.s, false, null, 12), k80Var.s, 0L, ((Boolean) t43Var.getValue()).booleanValue() ? qk1.P : qk1.N, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, 6, 24576, 114616);
            go1Var.q(true);
            l13Var2 = i13Var;
        } else {
            rm1Var2 = rm1Var;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ko2(rm1Var2, l13Var2, i, (byte) 3);
        }
    }

    public static final void g(List list, tm1 tm1Var, tm1 tm1Var2, rm1 rm1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1498769049);
        int i2 = i | (go1Var.g(list) ? 4 : 2) | (go1Var.i(tm1Var) ? 32 : 16) | (go1Var.i(tm1Var2) ? 256 : 128) | (go1Var.i(rm1Var) ? 2048 : 1024);
        byte b2 = 1;
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            ba0 a2 = z90.a(i42.d, q8.V, go1Var, 0);
            long j = go1Var.T;
            int i3 = (int) ((j >>> 32) ^ j);
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
            q("历史搜索", k21.I(), null, p70.u0(1708755491, new po2(rm1Var, b2), go1Var), go1Var, 3078, 4);
            e41.d(null, new kp(8.0f, true, new y9()), new kp(8.0f, true, new y9()), null, 0, 0, p70.u0(-1281079244, new pv0(list, tm1Var, tm1Var2, (byte) 5), go1Var), go1Var, 1573296, 57);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new so2(list, tm1Var, tm1Var2, rm1Var, i, (byte) 8);
        }
    }

    public static final void h(String str, tm1 tm1Var, rm1 rm1Var, tm1 tm1Var2, rm1 rm1Var2, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1572603544);
        byte b2 = 4;
        byte b3 = 2;
        int i2 = i | (go1Var.g(str) ? 4 : 2) | (go1Var.i(tm1Var) ? 32 : 16) | (go1Var.i(rm1Var) ? 256 : 128) | (go1Var.i(rm1Var2) ? 16384 : 8192);
        if (go1Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            m65 a2 = m65.a(((fw2) go1Var.k(i51Var)).b.j, k80Var.q, 0L, null, null, 0L, null, 0L, null, 16777214);
            rt4 rt4Var = new rt4(k80Var.a);
            l13 p = mw2.p(nq4.g(nq4.e(i13.a, 1.0f), r13.e(go1Var) ? 56.0f : 54.0f), k80Var.G, a);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = new l00(tm1Var2, b2);
                go1Var.o0(Q);
            }
            l13 E0 = i42.E0(r13.d(i42.A0(p, (tm1) Q), null, null, null, rm1Var2, null, null, null, null, null, null, null, null, 245695), 16.0f, 0.0f, 2);
            boolean z = (i2 & 896) == 256;
            Object Q2 = go1Var.Q();
            if (z || Q2 == jpVar) {
                Q2 = new b40(rm1Var, (byte) 13);
                go1Var.o0(Q2);
            }
            ev.a(str, tm1Var, E0, false, a2, new y82(119), new x82(47, (tm1) Q2), true, 0, 0, null, null, null, rt4Var, p70.u0(39137381, new n03(k80Var, str, b3), go1Var), go1Var, (i2 & 14) | 102236160 | (i2 & 112), 15896);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new in2(str, tm1Var, rm1Var, tm1Var2, rm1Var2, i, (byte) 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0430, code lost:
    
        if (r6 == r5) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [int] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28, types: [int] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r15v1, types: [fe0, go1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(java.lang.String r50, defpackage.tm1 r51, defpackage.rm1 r52, defpackage.l13 r53, defpackage.ki1 r54, defpackage.fe0 r55, int r56) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe4.i(java.lang.String, tm1, rm1, l13, ki1, fe0, int):void");
    }

    public static final void j(bd4 bd4Var, fe0 fe0Var, int i) {
        uj3 uj3Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-864803774);
        int i2 = (go1Var.e(bd4Var.ordinal()) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            int ordinal = bd4Var.ordinal();
            if (ordinal == 0) {
                uj3Var = new uj3(new x70(k80Var.l), new x70(k80Var.m));
            } else if (ordinal == 1) {
                uj3Var = new uj3(new x70(k80Var.h), new x70(k80Var.i));
            } else if (ordinal == 2) {
                uj3Var = new uj3(new x70(k80Var.G), new x70(k80Var.s));
            } else {
                if (ordinal != 3) {
                    s83.v();
                    return;
                }
                uj3Var = new uj3(new x70(k80Var.y), new x70(k80Var.z));
            }
            long j = ((x70) uj3Var.I).a;
            long j2 = ((x70) uj3Var.J).a;
            i13 i13Var = i13.a;
            l13 E0 = i42.E0(mw2.p(nq4.g(i13Var, 26.0f), j, jo.a), 9.0f, 0.0f, 2);
            u74 a2 = t74.a(new kp(6.0f, true, new y9()), q8.T, go1Var, 54);
            long j3 = go1Var.T;
            int i3 = (int) (j3 ^ (j3 >>> 32));
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
            px.a(mw2.p(nq4.k(i13Var, 8.0f), j2, l74.a), go1Var, 0);
            r55.b(bd4Var.I, null, j2, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, 0, 24576, 114682);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rd(bd4Var, i, (byte) 13);
        }
    }

    public static final void k(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(102541233);
        if (go1Var.T(i & 1, i != 0)) {
            p70.o("搜索中...", nq4.c, go1Var, 54, 0);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new fa4((byte) 14, i);
        }
    }

    public static final void l(rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i) {
        int i2;
        rm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-400477872);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (go1Var.i(rm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(l13Var) ? 32 : 16;
        }
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = pt1.r(go1Var);
            }
            ki1 ki1Var = (ki1) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = new oo0(ki1Var, null, (byte) 8);
                go1Var.o0(Q2);
            }
            mw2.h(go1Var, (hn1) Q2, wd5.a);
            ne1 ne1Var = nq4.c;
            l13 p = mw2.p(l13Var.then(ne1Var), ((fw2) go1Var.k(lw2.b)).a.p, mw2.j);
            boolean e = r13.e(go1Var);
            l13 l13Var2 = i13.a;
            if (e) {
                go1Var.d0(1687835928);
            } else {
                go1Var.d0(1687836701);
                WeakHashMap weakHashMap = dw5.w;
                l13Var2 = mw2.a0(l13Var2, wi4.h(go1Var).l);
            }
            go1Var.q(false);
            l13 then = p.then(l13Var2);
            uw2 c2 = px.c(q8.N, false);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, then);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            p70.q(dq2.Q(), "登录后才能搜索", ne1Var, "当前账号未登录，请在「我」页扫码登录后再搜索", rw4.K, false, p70.u0(-1016521948, new o30(ki1Var, rm1Var, b2), go1Var), go1Var, 1600944, 32);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new jo0(rm1Var, l13Var, i, (byte) 1);
        }
    }

    public static final void m(String str, fe0 fe0Var, int i) {
        String str2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1597751863);
        byte b2 = 4;
        int i2 = (go1Var.g(str) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            p70.q(e21.t(), str2, nq4.c, null, rw4.J, false, null, go1Var, ((i2 << 3) & 112) | RendererCapabilities.DECODER_SUPPORT_MASK, 104);
        } else {
            str2 = str;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn2(str2, i, b2);
        }
    }

    public static final void n(String str, dg0 dg0Var, fe0 fe0Var, int i) {
        sg sgVar;
        sg sgVar2;
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1573619040);
        int i3 = i | (go1Var.g(str) ? 4 : 2) | (go1Var.e(dg0Var.ordinal()) ? 32 : 16);
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            cy3 h = hy3.h(go1Var);
            Bitmap g = hy3.g(str, h, go1Var, i3 & 14, 2);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            boolean z = (i3 & 112) == 32;
            Object Q2 = go1Var.Q();
            if (z || Q2 == jpVar) {
                Q2 = new k(dg0Var, t43Var, null, (byte) 16);
                go1Var.o0(Q2);
            }
            mw2.h(go1Var, (hn1) Q2, dg0Var);
            int ordinal = dg0Var.ordinal();
            bd4 bd4Var = bd4.Connecting;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        bd4Var = bd4.Connected;
                    } else {
                        if (ordinal != 3) {
                            s83.v();
                            return;
                        }
                        bd4Var = bd4.Error;
                    }
                } else if (((Boolean) t43Var.getValue()).booleanValue()) {
                    bd4Var = bd4.Reconnecting;
                }
            }
            bd4 bd4Var2 = bd4Var;
            i13 i13Var = i13.a;
            l13 m = o7.m(nq4.e(i13Var, 1.0f), a);
            long j = k80Var.I;
            aj5 aj5Var = mw2.j;
            l13 C0 = i42.C0(mw2.p(m, j, aj5Var), 10.0f);
            u74 a2 = t74.a(new kp(12.0f, true, new y9()), q8.T, go1Var, 54);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var.m();
            l13 x0 = i42.x0(go1Var, C0);
            xd0.c.getClass();
            go1Var.h0();
            boolean z2 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z2) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar3 = q8.c0;
            qi4.k(go1Var, sgVar3, a2);
            sg sgVar4 = q8.b0;
            qi4.k(go1Var, sgVar4, m2);
            Integer valueOf = Integer.valueOf(i4);
            sg sgVar5 = q8.d0;
            qi4.k(go1Var, sgVar5, valueOf);
            qi4.j(go1Var);
            sg sgVar6 = q8.a0;
            qi4.k(go1Var, sgVar6, x0);
            l13 C02 = i42.C0(mw2.p(o7.m(nq4.k(i13Var, 68.0f), b), h.b, aj5Var), 6.0f);
            uw2 c2 = px.c(q8.N, false);
            long j3 = go1Var.T;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            l13 x02 = i42.x0(go1Var, C02);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar3, c2);
            qi4.k(go1Var, sgVar4, m3);
            r7.G(i5, go1Var, sgVar5, go1Var);
            qi4.k(go1Var, sgVar6, x02);
            if (g != null) {
                go1Var.d0(-302649139);
                sgVar2 = sgVar6;
                sgVar = sgVar4;
                ut0.b(new dd(g), "扫码搜索", nq4.c, null, go1Var, 25008, 232);
                i2 = 0;
                go1Var.q(false);
            } else {
                sgVar = sgVar4;
                sgVar2 = sgVar6;
                i2 = 0;
                go1Var.d0(-302392552);
                go1Var.q(false);
            }
            go1Var.q(true);
            ba0 a3 = z90.a(new kp(6.0f, true, new y9()), q8.V, go1Var, 6);
            long j4 = go1Var.T;
            int i6 = (int) (j4 ^ (j4 >>> 32));
            am3 m4 = go1Var.m();
            l13 x03 = i42.x0(go1Var, i13Var);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar3, a3);
            qi4.k(go1Var, sgVar, m4);
            r7.G(i6, go1Var, sgVar5, go1Var);
            qi4.k(go1Var, sgVar2, x03);
            r55.b("手机扫码输入", null, k80Var.q, 0L, qk1.O, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.i, go1Var, 1572870, 0, 131002);
            go1Var = go1Var;
            j(bd4Var2, go1Var, i2);
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj1((byte) 20, i, str, dg0Var);
        }
    }

    public static final void o(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-401763112);
        if (go1Var.T(i & 1, i != 0)) {
            p70.q(ad4.s(), "按「搜索」键查看结果", nq4.c, null, rw4.K, false, null, go1Var, 25008, 104);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new fa4((byte) 15, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x067e, code lost:
    
        if (r7 == r4) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [tc0] */
    /* JADX WARN: Type inference failed for: r11v1, types: [fe0, go1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [tc0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(defpackage.hu2 r45, defpackage.l13 r46, int r47, defpackage.fe0 r48, int r49) {
        /*
            Method dump skipped, instructions count: 2120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe4.p(hu2, l13, int, fe0, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final java.lang.String r27, final defpackage.hx1 r28, defpackage.l13 r29, defpackage.in1 r30, defpackage.fe0 r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe4.q(java.lang.String, hx1, l13, in1, fe0, int, int):void");
    }

    public static final void r(List list, tm1 tm1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1815801244);
        int i2 = (go1Var.g(list) ? 4 : 2) | i | (go1Var.i(tm1Var) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            k80 k80Var = ((fw2) go1Var.k(lw2.b)).a;
            boolean z = (i2 & 14) == 4;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (z || Q == jpVar) {
                Q = o70.P0(list);
                go1Var.o0(Q);
            }
            List list2 = (List) Q;
            i13 i13Var = i13.a;
            l13 p = mw2.p(o7.m(nq4.e(i13Var, 1.0f), jo.c), k80Var.G, mw2.j);
            uw2 c2 = px.c(q8.J, false);
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
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            l13 i4 = nq4.i(i13Var, 0.0f, 360.0f, 1);
            li3 li3Var = new li3(6.0f, 6.0f, 6.0f, 6.0f);
            kp kpVar = new kp(2.0f, true, new y9());
            boolean i5 = go1Var.i(list2) | go1Var.g(k80Var) | ((i2 & 112) == 32);
            Object Q2 = go1Var.Q();
            if (i5 || Q2 == jpVar) {
                Q2 = new m6((Object) list2, (Object) k80Var, (Object) tm1Var, (byte) 21);
                go1Var.o0(Q2);
            }
            e21.c(i4, null, li3Var, kpVar, null, null, false, null, (tm1) Q2, go1Var, 24966, 490);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new je4(list, tm1Var, i, (byte) 2);
        }
    }

    public static final void s(final int i, fe0 fe0Var, final tm1 tm1Var, final l13 l13Var) {
        final byte b2;
        x04 u;
        hn1 hn1Var;
        t43 t43Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-227097736);
        int i2 = (go1Var.i(tm1Var) ? 4 : 2) | i;
        final byte b3 = 0;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) go1Var.k(rb.b);
            boolean g = go1Var.g(context);
            Object Q = go1Var.Q();
            Object obj = de0.a;
            if (g || Q == obj) {
                Q = Boolean.valueOf(new Intent("android.speech.action.RECOGNIZE_SPEECH").resolveActivity(context.getPackageManager()) != null);
                go1Var.o0(Q);
            }
            boolean booleanValue = ((Boolean) Q).booleanValue();
            o7 o7Var = new o7((byte) 1);
            boolean z = (i2 & 14) == 4;
            Object Q2 = go1Var.Q();
            if (z || Q2 == obj) {
                Q2 = new l00(tm1Var, (byte) 5);
                go1Var.o0(Q2);
            }
            qu2 a0 = g4.a0(o7Var, (tm1) Q2, go1Var, 0);
            if (!booleanValue) {
                u = go1Var.u();
                if (u != null) {
                    hn1Var = new hn1(tm1Var, l13Var, i, b3) { // from class: oe4
                        public final /* synthetic */ byte I;
                        public final /* synthetic */ tm1 J;
                        public final /* synthetic */ l13 K;

                        {
                            this.I = b3;
                        }

                        @Override // defpackage.hn1
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b4 = this.I;
                            wd5 wd5Var = wd5.a;
                            l13 l13Var2 = this.K;
                            tm1 tm1Var2 = this.J;
                            fe0 fe0Var2 = (fe0) obj2;
                            ((Integer) obj3).getClass();
                            switch (b4) {
                                case 0:
                                    qe4.s(mu0.X(49), fe0Var2, tm1Var2, l13Var2);
                                    break;
                                default:
                                    qe4.s(mu0.X(49), fe0Var2, tm1Var2, l13Var2);
                                    break;
                            }
                            return wd5Var;
                        }
                    };
                    u.d = hn1Var;
                }
                return;
            }
            Object Q3 = go1Var.Q();
            if (Q3 == obj) {
                Q3 = ad4.w(Boolean.FALSE);
                go1Var.o0(Q3);
            }
            t43 t43Var2 = (t43) Q3;
            Object Q4 = go1Var.Q();
            if (Q4 == obj) {
                Q4 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q4;
            t43 w = ut0.w(t33Var, go1Var);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            cw4 t0 = p70.t0(((Boolean) t43Var2.getValue()).booleanValue(), k80Var.G, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "search-voice-bg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), k80Var.q, k80Var.v, "search-voice-fg", go1Var, 3072);
            cw4 s02 = p70.s0(((Boolean) t43Var2.getValue()).booleanValue(), k80Var.s, k80Var.v, "search-voice-icon", go1Var, 3072);
            l13 H = p70.H(o7.m(nq4.g(l13Var, 40.0f), jo.b), t0);
            Object Q5 = go1Var.Q();
            if (Q5 == obj) {
                t43Var = t43Var2;
                Q5 = new qd4(t43Var, (byte) 7);
                go1Var.o0(Q5);
            } else {
                t43Var = t43Var2;
            }
            l13 A0 = i42.A0(H, (tm1) Q5);
            boolean i3 = go1Var.i(a0);
            Object Q6 = go1Var.Q();
            if (i3 || Q6 == obj) {
                Q6 = new iy3(a0, (byte) 6);
                go1Var.o0(Q6);
            }
            l13 E0 = i42.E0(mw2.B(r13.d(A0, null, null, null, null, (rm1) Q6, null, null, null, null, null, null, t33Var, 130815), false, t33Var, 1), 14.0f, 0.0f, 2);
            u74 a2 = t74.a(new kp(8.0f, true, new y9()), q8.T, go1Var, 54);
            long j = go1Var.T;
            int i4 = (int) (j ^ (j >>> 32));
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
            hx1 hx1Var = jl2.a;
            if (hx1Var == null) {
                gx1 gx1Var = new gx1("Filled.Mic", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i5 = th5.a;
                rt4 rt4Var = new rt4(x70.b);
                ep r = r7.r(12.0f, 14.0f);
                r.r(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
                r.x(15.0f, 5.0f);
                r.r(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                r.C(9.0f, 3.34f, 9.0f, 5.0f);
                r.M(6.0f);
                r.r(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                r.p();
                r.z(17.3f, 11.0f);
                r.r(0.0f, 3.0f, -2.54f, 5.1f, -5.3f, 5.1f);
                r.C(6.7f, 14.0f, 6.7f, 11.0f);
                r.x(5.0f, 11.0f);
                r.r(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
                r.x(11.0f, 21.0f);
                r.v(2.0f);
                r.M(-3.28f);
                r.r(3.28f, -0.48f, 6.0f, -3.3f, 6.0f, -6.72f);
                r.v(-1.7f);
                r.p();
                gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
                hx1Var = gx1Var.b();
                jl2.a = hx1Var;
            }
            long j2 = k80Var.s;
            i13 i13Var = i13.a;
            ow1.a(hx1Var, null, p70.G(nq4.k(i13Var, 20.0f), s02, k80Var.s, false, null, 12), j2, go1Var, 48);
            b2 = 1;
            r55.b("按住遥控器语音键说话", p70.G(i13Var, s0, k80Var.q, false, null, 12), k80Var.q, 0L, ((Boolean) t43Var.getValue()).booleanValue() ? qk1.P : qk1.N, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var.k(i51Var)).b.m, go1Var, 6, 24576, 114616);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            b2 = 1;
            go1Var.W();
        }
        u = go1Var.u();
        if (u != null) {
            hn1Var = new hn1(tm1Var, l13Var, i, b2) { // from class: oe4
                public final /* synthetic */ byte I;
                public final /* synthetic */ tm1 J;
                public final /* synthetic */ l13 K;

                {
                    this.I = b2;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    byte b4 = this.I;
                    wd5 wd5Var = wd5.a;
                    l13 l13Var2 = this.K;
                    tm1 tm1Var2 = this.J;
                    fe0 fe0Var2 = (fe0) obj2;
                    ((Integer) obj3).getClass();
                    switch (b4) {
                        case 0:
                            qe4.s(mu0.X(49), fe0Var2, tm1Var2, l13Var2);
                            break;
                        default:
                            qe4.s(mu0.X(49), fe0Var2, tm1Var2, l13Var2);
                            break;
                    }
                    return wd5Var;
                }
            };
            u.d = hn1Var;
        }
    }

    public static final void t(List list, tm1 tm1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(848806229);
        int i2 = (go1Var.g(list) ? 4 : 2) | i | (go1Var.i(tm1Var) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            ba0 a2 = z90.a(i42.d, q8.V, go1Var, 0);
            long j = go1Var.T;
            int i3 = (int) ((j >>> 32) ^ j);
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
            hx1 hx1Var = k21.i;
            if (hx1Var == null) {
                gx1 gx1Var = new gx1("Outlined.Lightbulb", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i4 = th5.a;
                rt4 rt4Var = new rt4(x70.b);
                ep r = r7.r(9.0f, 21.0f);
                r.r(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                r.v(4.0f);
                r.r(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                r.M(-1.0f);
                r.x(9.0f, 20.0f);
                r.M(1.0f);
                r.p();
                r.z(12.0f, 2.0f);
                r.q(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f);
                r.r(0.0f, 2.38f, 1.19f, 4.47f, 3.0f, 5.74f);
                r.x(8.0f, 17.0f);
                r.r(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                r.v(6.0f);
                r.r(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                r.M(-2.26f);
                r.r(1.81f, -1.27f, 3.0f, -3.36f, 3.0f, -5.74f);
                r.r(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f);
                r.p();
                r.z(14.85f, 13.1f);
                r.y(-0.85f, 0.6f);
                r.x(14.0f, 16.0f);
                r.v(-4.0f);
                r.M(-2.3f);
                r.y(-0.85f, -0.6f);
                r.q(7.8f, 12.16f, 7.0f, 10.63f, 7.0f, 9.0f);
                r.r(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
                r.D(5.0f, 2.24f, 5.0f, 5.0f);
                r.r(0.0f, 1.63f, -0.8f, 3.16f, -2.15f, 4.1f);
                r.p();
                gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
                hx1Var = gx1Var.b();
                k21.i = hx1Var;
            }
            q("大家都在搜", hx1Var, null, null, go1Var, 6, 12);
            e41.d(null, i42.f, new kp(8.0f, true, new y9()), null, 0, 0, p70.u0(-571951910, new a91(list, tm1Var, (byte) 8), go1Var), go1Var, 1573296, 57);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new je4(list, tm1Var, i, (byte) 0);
        }
    }
}
