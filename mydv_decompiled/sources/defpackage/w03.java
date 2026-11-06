package defpackage;

import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.Cover;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.model.MixStatis;
import com.github.mytv.dv.model.Video;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class w03 {
    public static final k74 a = l74.a(40.0f);

    public static final void a(final int i, final boolean z, final boolean z2, final boolean z3, final rm1 rm1Var, final l13 l13Var, fe0 fe0Var, final int i2) {
        long j;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1123005088);
        int i3 = i2 | (go1Var.e(i) ? 4 : 2) | (go1Var.h(z) ? 32 : 16) | (go1Var.h(z2) ? 256 : 128) | (go1Var.h(z3) ? 2048 : 1024) | (go1Var.i(rm1Var) ? 16384 : 8192) | (go1Var.g(l13Var) ? 131072 : 65536);
        if (go1Var.T(i3 & 1, (74899 & i3) != 74898)) {
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
            if (z3) {
                go1Var.d0(1171113392);
                go1Var.q(false);
                j = k80Var.c;
            } else if (z2) {
                go1Var.d0(1171114935);
                go1Var.q(false);
                j = k80Var.H;
            } else if (z) {
                go1Var.d0(1171116941);
                j = ((fw2) go1Var.k(i51Var)).a.H;
                go1Var.q(false);
            } else {
                go1Var.d0(1171118292);
                go1Var.q(false);
                j = k80Var.G;
            }
            long c = z3 ? k80Var.d : z2 ? k80Var.s : z ? k80Var.q : x70.c(k80Var.s, 0.6f);
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), j, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "episodeCellBg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), c, k80Var.v, "episodeCellFg", go1Var, 3072);
            l13 u = r7.u(12.0f, nq4.g(l13Var, 44.0f), t0);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new xx2(t43Var, (byte) 4);
                go1Var.o0(Q3);
            }
            l13 B = mw2.B(r13.d(i42.A0(u, (tm1) Q3), null, null, null, null, rm1Var, null, null, null, null, null, new t64(0), t33Var, 65279), false, null, 3);
            uw2 c2 = px.c(q8.N, false);
            long j2 = go1Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, B);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            String valueOf = String.valueOf(i);
            m65 m65Var = xc3.d;
            qk1 qk1Var = (z3 || ((Boolean) t43Var.getValue()).booleanValue()) ? qk1.P : qk1.O;
            i13 i13Var = i13.a;
            r55.b(valueOf, p70.G(i13Var, s0, c, false, null, 12), c, 0L, qk1Var, 0L, null, 0L, 0, false, 1, 0, m65Var, go1Var, 0, 24576, 114616);
            go1Var = go1Var;
            if (!z2 || z3) {
                go1Var.d0(2099279324);
                go1Var.q(false);
            } else {
                go1Var.d0(2098995829);
                px.a(mw2.p(o7.m(nq4.k(i42.G0(ux.a.align(i13Var, q8.Q), 0.0f, 0.0f, 0.0f, 5.0f, 7), 3.0f), l74.a), k80Var.s, mw2.j), go1Var, 0);
                go1Var.q(false);
            }
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new hn1(i, z, z2, z3, rm1Var, l13Var, i2) { // from class: f03
                public final /* synthetic */ int I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ rm1 M;
                public final /* synthetic */ l13 N;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(1);
                    w03.a(this.I, this.J, this.K, this.L, this.M, this.N, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final int r23, java.util.List r24, final java.util.Set r25, final java.lang.Integer r26, final boolean r27, final java.lang.String r28, defpackage.rm1 r29, final defpackage.tm1 r30, defpackage.fe0 r31, int r32) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w03.b(int, java.util.List, java.util.Set, java.lang.Integer, boolean, java.lang.String, rm1, tm1, fe0, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r6v54, types: [int] */
    public static final void c(final hu2 hu2Var, final l13 l13Var, int i, fe0 fe0Var, int i2) {
        go1 go1Var;
        int i3;
        Object obj;
        List k1;
        t43 t43Var;
        Integer valueOf;
        final t43 t43Var2;
        MixStatis statis;
        MixStatis statis2;
        MixStatis statis3;
        Object obj2;
        Object next;
        Object obj3;
        boolean z;
        int i4;
        t43 t43Var3;
        List list;
        final t43 t43Var4;
        dl0 dl0Var;
        Object hcVar;
        final List list2;
        t43 t43Var5;
        final tm1 tm1Var;
        boolean z2;
        Object q30Var;
        Boolean bool;
        List list3;
        tm1 tm1Var2;
        final t43 t43Var6;
        final t43 t43Var7;
        fj0 fj0Var;
        ?? r4;
        bw0 bw0Var;
        boolean z3;
        Cover coverUrl;
        List<String> urlList;
        String str;
        hu2 hu2Var2 = hu2Var;
        gx3 gx3Var = hu2Var2.p;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-1198110623);
        int i5 = i2 | (go1Var2.i(hu2Var2) ? 4 : 2) | (go1Var2.e(i) ? 256 : 128);
        if (go1Var2.T(i5 & 1, (i5 & 147) != 146)) {
            p04 p04Var = gx3Var.I0;
            t43 f = wi4.f(p04Var, p04Var.getValue(), go1Var2, 0, 0);
            p04 p04Var2 = gx3Var.K0;
            t43 f2 = wi4.f(p04Var2, p04Var2.getValue(), go1Var2, 0, 0);
            p04 p04Var3 = gx3Var.M0;
            final t43 f3 = wi4.f(p04Var3, p04Var3.getValue(), go1Var2, 0, 0);
            final t43 g = wi4.g(hu2Var2.d.h, go1Var2);
            p04 p04Var4 = gx3Var.O0;
            final t43 f4 = wi4.f(p04Var4, p04Var4.getValue(), go1Var2, 0, 0);
            Object[] objArr = new Object[0];
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            Object obj4 = Q;
            if (Q == jpVar) {
                d52 d52Var = new d52((byte) 23);
                go1Var2.o0(d52Var);
                obj4 = d52Var;
            }
            t43 t43Var8 = (t43) ut0.N(objArr, (rm1) obj4, go1Var2);
            Object Q2 = go1Var2.Q();
            Object obj5 = Q2;
            if (Q2 == jpVar) {
                jk3 w = ad4.w(Boolean.FALSE);
                go1Var2.o0(w);
                obj5 = w;
            }
            t43 t43Var9 = (t43) obj5;
            Object Q3 = go1Var2.Q();
            Object obj6 = Q3;
            if (Q3 == jpVar) {
                jk3 w2 = ad4.w(Boolean.FALSE);
                go1Var2.o0(w2);
                obj6 = w2;
            }
            final t43 t43Var10 = (t43) obj6;
            Object Q4 = go1Var2.Q();
            Object obj7 = Q4;
            if (Q4 == jpVar) {
                jk3 w3 = ad4.w(null);
                go1Var2.o0(w3);
                obj7 = w3;
            }
            t43 t43Var11 = (t43) obj7;
            Object Q5 = go1Var2.Q();
            Object obj8 = Q5;
            if (Q5 == jpVar) {
                dl0 w4 = mw2.w(go1Var2);
                go1Var2.o0(w4);
                obj8 = w4;
            }
            dl0 dl0Var2 = (dl0) obj8;
            boolean g2 = go1Var2.g((List) f2.getValue()) | go1Var2.g((Map) f4.getValue());
            Object Q6 = go1Var2.Q();
            if (g2 || Q6 == jpVar) {
                List list4 = (List) f2.getValue();
                ArrayList arrayList = new ArrayList(p70.J(list4, 10));
                int i6 = 0;
                for (Object obj9 : list4) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        p70.A0();
                        throw null;
                    }
                    Aweme aweme = (Aweme) obj9;
                    int i8 = i5;
                    Integer num = (Integer) ((Map) f4.getValue()).get(aweme.getAwemeId());
                    arrayList.add(new x03(aweme, num != null ? num.intValue() : i7));
                    i6 = i7;
                    i5 = i8;
                }
                i3 = i5;
                go1Var2.o0(arrayList);
                obj = arrayList;
            } else {
                i3 = i5;
                obj = Q6;
            }
            List list5 = (List) obj;
            boolean e = go1Var2.e(((y03) t43Var8.getValue()).ordinal()) | go1Var2.g(list5);
            Object Q7 = go1Var2.Q();
            if (e || Q7 == jpVar) {
                int ordinal = ((y03) t43Var8.getValue()).ordinal();
                if (ordinal == 0) {
                    k1 = o70.k1(list5, new xi1((byte) 12));
                } else {
                    if (ordinal != 1) {
                        s83.v();
                        return;
                    }
                    k1 = o70.k1(list5, new xi1((byte) 11));
                }
                Q7 = k1;
                go1Var2.o0(Q7);
            }
            List list6 = (List) Q7;
            boolean g3 = go1Var2.g((MixInfo) f.getValue()) | go1Var2.g(list5);
            Object Q8 = go1Var2.Q();
            if (g3 || Q8 == jpVar) {
                MixInfo mixInfo = (MixInfo) f.getValue();
                int totalEpisode = (mixInfo == null || (statis3 = mixInfo.getStatis()) == null) ? 0 : statis3.getTotalEpisode();
                MixInfo mixInfo2 = (MixInfo) f.getValue();
                int updatedToEpisode = (mixInfo2 == null || (statis2 = mixInfo2.getStatis()) == null) ? 0 : statis2.getUpdatedToEpisode();
                MixInfo mixInfo3 = (MixInfo) f.getValue();
                int currentEpisode = (mixInfo3 == null || (statis = mixInfo3.getStatis()) == null) ? 0 : statis.getCurrentEpisode();
                Iterator it = list5.iterator();
                if (it.hasNext()) {
                    t43Var = t43Var8;
                    valueOf = Integer.valueOf(((x03) it.next()).b);
                    while (it.hasNext()) {
                        t43 t43Var12 = t43Var11;
                        Integer valueOf2 = Integer.valueOf(((x03) it.next()).b);
                        if (valueOf.compareTo(valueOf2) < 0) {
                            valueOf = valueOf2;
                        }
                        t43Var11 = t43Var12;
                    }
                } else {
                    t43Var = t43Var8;
                    valueOf = null;
                }
                t43Var2 = t43Var11;
                Integer valueOf3 = Integer.valueOf(j42.N(totalEpisode, updatedToEpisode, currentEpisode, valueOf != null ? valueOf.intValue() : 0));
                go1Var2.o0(valueOf3);
                obj2 = valueOf3;
            } else {
                t43Var = t43Var8;
                t43Var2 = t43Var11;
                obj2 = Q8;
            }
            final int intValue = ((Number) obj2).intValue();
            boolean g4 = go1Var2.g((List) f2.getValue()) | go1Var2.g((Set) g.getValue());
            Object Q9 = go1Var2.Q();
            if (g4 || Q9 == jpVar) {
                List list7 = (List) f2.getValue();
                Set set = (Set) g.getValue();
                if (list7.isEmpty() || set.isEmpty()) {
                    Q9 = null;
                } else {
                    HashMap hashMap = new HashMap(set.size());
                    int i9 = 0;
                    for (Object obj10 : set) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            p70.A0();
                            throw null;
                        }
                        hashMap.put((String) obj10, Integer.valueOf(i9));
                        i9 = i10;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    v2 v2Var = new v2(list7.iterator());
                    while (((Iterator) v2Var.K).hasNext()) {
                        Object next2 = v2Var.next();
                        Object obj11 = ((iz1) next2).b;
                        if (!jx4.L(((Aweme) obj11).getAwemeId()) && hashMap.containsKey(((Aweme) obj11).getAwemeId())) {
                            arrayList2.add(next2);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            int intValue2 = ((Number) sv2.E(((Aweme) ((iz1) next).b).getAwemeId(), hashMap)).intValue();
                            while (true) {
                                Object next3 = it2.next();
                                Iterator it3 = it2;
                                int intValue3 = ((Number) sv2.E(((Aweme) ((iz1) next3).b).getAwemeId(), hashMap)).intValue();
                                if (intValue2 < intValue3) {
                                    intValue2 = intValue3;
                                    next = next3;
                                }
                                if (!it3.hasNext()) {
                                    break;
                                } else {
                                    it2 = it3;
                                }
                            }
                        }
                    } else {
                        next = null;
                    }
                    Q9 = (iz1) next;
                }
                go1Var2.o0(Q9);
            }
            final iz1 iz1Var = (iz1) Q9;
            int i11 = i3 & 14;
            boolean g5 = go1Var2.g(f2) | (i11 == 4 || go1Var2.i(hu2Var2));
            Object Q10 = go1Var2.Q();
            if (g5 || Q10 == jpVar) {
                h03 h03Var = new h03(hu2Var2, f2, (byte) 0);
                go1Var2.o0(h03Var);
                obj3 = h03Var;
            } else {
                obj3 = Q10;
            }
            tm1 tm1Var3 = (tm1) obj3;
            boolean i12 = (i11 == 4 || go1Var2.i(hu2Var2)) | go1Var2.i(dl0Var2) | go1Var2.i(list5) | go1Var2.g(tm1Var3);
            Object Q11 = go1Var2.Q();
            if (i12 || Q11 == jpVar) {
                z = false;
                i4 = i11;
                t43Var3 = t43Var;
                zt1 zt1Var = new zt1(dl0Var2, t43Var10, list5, hu2Var, tm1Var3, t43Var2, t43Var9);
                list = list5;
                t43Var4 = t43Var9;
                dl0Var = dl0Var2;
                hu2Var2 = hu2Var;
                tm1Var3 = tm1Var3;
                go1Var2.o0(zt1Var);
                Q11 = zt1Var;
            } else {
                i4 = i11;
                list = list5;
                t43Var4 = t43Var9;
                t43Var3 = t43Var;
                z = false;
                dl0Var = dl0Var2;
            }
            tm1 tm1Var4 = (tm1) Q11;
            boolean i13 = go1Var2.i(dl0Var) | ((i4 == 4 || go1Var2.i(hu2Var2)) ? true : z) | go1Var2.i(list6) | go1Var2.g(tm1Var3);
            Object Q12 = go1Var2.Q();
            if (i13 || Q12 == jpVar) {
                dl0 dl0Var3 = dl0Var;
                hu2 hu2Var3 = hu2Var2;
                hcVar = new hc(dl0Var3, hu2Var3, list6, tm1Var3, (byte) 2);
                t43 t43Var13 = t43Var3;
                list2 = list6;
                t43Var5 = t43Var13;
                hu2Var2 = hu2Var3;
                tm1Var = tm1Var3;
                z2 = true;
                go1Var2.o0(hcVar);
            } else {
                hcVar = Q12;
                tm1Var = tm1Var3;
                t43Var5 = t43Var3;
                z2 = true;
                list2 = list6;
            }
            final rm1 rm1Var = (rm1) hcVar;
            y03 y03Var = (y03) t43Var5.getValue();
            Boolean valueOf4 = Boolean.valueOf(((List) f2.getValue()).isEmpty());
            boolean g6 = go1Var2.g(f2) | ((i4 == 4 || go1Var2.i(hu2Var2)) ? z2 : z) | go1Var2.g(t43Var5);
            Object Q13 = go1Var2.Q();
            if (g6 || Q13 == jpVar) {
                bool = valueOf4;
                fj0 fj0Var2 = null;
                q30Var = new q30((Object) hu2Var2, f2, (Object) t43Var5, fj0Var2, (byte) 9);
                list3 = list;
                tm1Var2 = tm1Var4;
                t43Var6 = f2;
                t43Var7 = t43Var5;
                go1Var2.o0(q30Var);
                fj0Var = fj0Var2;
            } else {
                List list8 = list;
                t43Var6 = f2;
                list3 = list8;
                bool = valueOf4;
                q30Var = Q13;
                fj0Var = null;
                tm1Var2 = tm1Var4;
                t43Var7 = t43Var5;
            }
            mw2.i(y03Var, bool, (hn1) q30Var, go1Var2);
            Object Q14 = go1Var2.Q();
            Object obj12 = Q14;
            if (Q14 == jpVar) {
                obj12 = pt1.r(go1Var2);
            }
            final ki1 ki1Var = (ki1) obj12;
            Object Q15 = go1Var2.Q();
            Object obj13 = Q15;
            if (Q15 == jpVar) {
                obj13 = pt1.r(go1Var2);
            }
            final ki1 ki1Var2 = (ki1) obj13;
            Object Q16 = go1Var2.Q();
            Object obj14 = Q16;
            if (Q16 == jpVar) {
                obj14 = pt1.r(go1Var2);
            }
            final ki1 ki1Var3 = (ki1) obj14;
            final boolean isEmpty = ((List) t43Var6.getValue()).isEmpty() ^ z2;
            Integer valueOf5 = Integer.valueOf(i);
            MixInfo mixInfo4 = (MixInfo) f.getValue();
            Object mixId = mixInfo4 != null ? mixInfo4.getMixId() : fj0Var;
            Boolean valueOf6 = Boolean.valueOf(isEmpty);
            boolean h = go1Var2.h(isEmpty);
            Object Q17 = go1Var2.Q();
            Object obj15 = Q17;
            if (h || Q17 == jpVar) {
                p03 p03Var = new p03(isEmpty, ki1Var2, ki1Var, fj0Var);
                go1Var2.o0(p03Var);
                obj15 = p03Var;
            }
            mw2.j(valueOf5, mixId, valueOf6, (hn1) obj15, go1Var2);
            bw0 bw0Var2 = (bw0) go1Var2.k(cw0.a);
            boolean z4 = bw0Var2.a == ww5.I ? true : z;
            final cj1 cj1Var = (cj1) go1Var2.k(dj1.a);
            boolean z5 = cj1Var.a == br3.K ? true : z;
            final float f5 = z4 ? 16.0f : bw0Var2.b ? 24.0f : 48.0f;
            final float f6 = z4 ? 12.0f : f5 - 8.0f;
            final MixInfo mixInfo5 = (MixInfo) f.getValue();
            if (mixInfo5 == null || (coverUrl = mixInfo5.getCoverUrl()) == null || (urlList = coverUrl.getUrlList()) == null || (str = (String) o70.U0(urlList)) == null) {
                Aweme aweme2 = (Aweme) o70.U0((List) t43Var6.getValue());
                r4 = fj0Var;
                if (aweme2 != null) {
                    Video video = aweme2.getVideo();
                    r4 = fj0Var;
                    if (video != null) {
                        Cover cover = video.getCover();
                        r4 = fj0Var;
                        if (cover != null) {
                            List<String> urlList2 = cover.getUrlList();
                            r4 = fj0Var;
                            if (urlList2 != null) {
                                r4 = (String) o70.U0(urlList2);
                            }
                        }
                    }
                }
            } else {
                r4 = str;
            }
            if (((r80) go1Var2.k(xh0.c)).a == t80.K) {
                bw0Var = bw0Var2;
                z3 = true;
            } else {
                bw0Var = bw0Var2;
                z3 = z;
            }
            if (r4 != 0) {
                ri0 ri0Var = ri0.a;
                Integer a2 = ri0.a(r4);
                if (a2 != null) {
                    z = a2.intValue();
                }
            }
            Object Q18 = go1Var2.Q();
            Object obj16 = Q18;
            if (Q18 == jpVar) {
                do2 do2Var = new do2((byte) 8);
                go1Var2.o0(do2Var);
                obj16 = do2Var;
            }
            final bw0 bw0Var3 = bw0Var;
            final String str2 = r4;
            x70 b = xh0.b(str2, z3, false, z ? 1 : 0, (tm1) obj16, go1Var2, 24576, 4);
            final List list9 = list3;
            final tm1 tm1Var5 = tm1Var2;
            final boolean z6 = z4;
            final boolean z7 = z5;
            go1Var = go1Var2;
            xh0.a(b, ma4.O, p70.u0(-1482572736, new hn1() { // from class: i03
                /* JADX WARN: Code restructure failed: missing block: B:82:0x043f, code lost:
                
                    if (r1 == r0) goto L72;
                 */
                @Override // defpackage.hn1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r54, java.lang.Object r55) {
                    /*
                        Method dump skipped, instructions count: 1450
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.i03.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, go1Var), go1Var, 432);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new y20(hu2Var, l13Var, i, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fa, code lost:
    
        if (r10.i(r47) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.zg2 r27, final defpackage.t43 r28, defpackage.hu2 r29, defpackage.t43 r30, final float r31, final java.lang.String r32, final defpackage.bw0 r33, final java.util.List r34, final defpackage.iz1 r35, final defpackage.t43 r36, final int r37, final defpackage.rm1 r38, final defpackage.tm1 r39, final boolean r40, final float r41, final defpackage.cw4 r42, final defpackage.ki1 r43, final defpackage.ki1 r44, final defpackage.t43 r45, final defpackage.t43 r46, final com.github.mytv.dv.model.MixInfo r47, final boolean r48, defpackage.l13 r49, defpackage.go1 r50, int r51) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w03.d(zg2, t43, hu2, t43, float, java.lang.String, bw0, java.util.List, iz1, t43, int, rm1, tm1, boolean, float, cw4, ki1, ki1, t43, t43, com.github.mytv.dv.model.MixInfo, boolean, l13, go1, int):void");
    }

    public static final void e(String str, bw0 bw0Var, List list, iz1 iz1Var, int i, ki1 ki1Var, rm1 rm1Var, tm1 tm1Var, t43 t43Var, t43 t43Var2, ki1 ki1Var2, t43 t43Var3, t43 t43Var4, MixInfo mixInfo, boolean z, l13 l13Var, go1 go1Var, int i2) {
        String str2;
        Integer num;
        Object next;
        Author author;
        go1 go1Var2 = go1Var;
        Aweme aweme = (Aweme) o70.U0((List) t43Var.getValue());
        if (aweme == null || (author = aweme.getAuthor()) == null || (str2 = author.getNickname()) == null || jx4.L(str2)) {
            str2 = null;
        }
        float f = bw0Var.b ? 240.0f : 320.0f;
        Integer num2 = list.isEmpty() ? null : 1;
        if (iz1Var != null) {
            Integer num3 = (Integer) ((Map) t43Var2.getValue()).get(((Aweme) iz1Var.b).getAwemeId());
            num = Integer.valueOf(num3 != null ? num3.intValue() : 1 + iz1Var.a);
        } else {
            num = null;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i3 = ((x03) next).b;
                while (true) {
                    Object next2 = it.next();
                    int i4 = ((x03) next2).b;
                    if (i3 < i4) {
                        next = next2;
                        i3 = i4;
                    }
                    if (!it.hasNext()) {
                        break;
                    } else {
                        go1Var2 = go1Var;
                    }
                }
            }
        } else {
            next = null;
        }
        x03 x03Var = (x03) next;
        String X = x03Var != null ? eg5.X(x03Var.a.getCreateTime()) : null;
        Object Q = go1Var2.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Q = new yz2(ki1Var2, (byte) 0);
            go1Var2.o0(Q);
        }
        rm1 rm1Var2 = (rm1) Q;
        boolean i5 = go1Var2.i(iz1Var) | go1Var2.g(tm1Var);
        Object Q2 = go1Var2.Q();
        if (i5 || Q2 == jpVar) {
            Q2 = new jt2((Object) iz1Var, (Object) tm1Var, (byte) 7);
            go1Var2.o0(Q2);
        }
        rm1 rm1Var3 = (rm1) Q2;
        Object Q3 = go1Var2.Q();
        if (Q3 == jpVar) {
            Q3 = new d30(t43Var3, t43Var4, (byte) 3);
            go1Var2.o0(Q3);
        }
        int i6 = i2 << 6;
        g(mixInfo, str, str2, z, f, num2, num, i, X, ki1Var, rm1Var2, rm1Var, rm1Var3, (rm1) Q3, l13Var, go1Var2, 805306368 | MixInfo.$stable | (i2 & 14) | (i6 & 7168), (57344 & i6) | 3078);
    }

    public static final void f(List list, int i, t43 t43Var, boolean z, go1 go1Var, int i2) {
        Integer valueOf;
        Iterator it = list.iterator();
        Integer num = null;
        if (it.hasNext()) {
            valueOf = Integer.valueOf(((x03) it.next()).b);
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((x03) it.next()).b);
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            num = Integer.valueOf(((x03) it2.next()).b);
            while (it2.hasNext()) {
                Integer valueOf3 = Integer.valueOf(((x03) it2.next()).b);
                if (num.compareTo(valueOf3) < 0) {
                    num = valueOf3;
                }
            }
        }
        int intValue2 = num != null ? num.intValue() : 0;
        y03 y03Var = (y03) t43Var.getValue();
        boolean g = go1Var.g(t43Var);
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            Q = new xx2(t43Var, (byte) 5);
            go1Var.o0(Q);
        }
        i(intValue, intValue2, i, y03Var, (tm1) Q, z, go1Var, (i2 << 15) & 458752);
    }

    public static final void g(final MixInfo mixInfo, final String str, final String str2, final boolean z, final float f, final Integer num, final Integer num2, final int i, final String str3, final ki1 ki1Var, final rm1 rm1Var, final rm1 rm1Var2, final rm1 rm1Var3, final rm1 rm1Var4, final l13 l13Var, fe0 fe0Var, final int i2, final int i3) {
        int i4;
        int i5;
        go1 go1Var;
        sg sgVar = q8.a0;
        sg sgVar2 = q8.d0;
        sg sgVar3 = q8.b0;
        sg sgVar4 = q8.c0;
        tv tvVar = q8.V;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-914530712);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? go1Var2.g(mixInfo) : go1Var2.i(mixInfo) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go1Var2.g(str) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var2.g(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= go1Var2.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= go1Var2.d(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= go1Var2.g(num) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= go1Var2.g(num2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= go1Var2.e(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= go1Var2.g(str3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= go1Var2.g(ki1Var) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (go1Var2.i(rm1Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= go1Var2.i(rm1Var2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= go1Var2.i(rm1Var3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= go1Var2.i(rm1Var4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= go1Var2.g(l13Var) ? 16384 : 8192;
        }
        if (go1Var2.T(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 9363) == 9362) ? false : true)) {
            final k80 k80Var = ((fw2) go1Var2.k(lw2.b)).a;
            int max = Math.max(mixInfo.getStatis().getTotalEpisode(), Math.max(mixInfo.getStatis().getUpdatedToEpisode(), mixInfo.getStatis().getCurrentEpisode()));
            mk2 K = p70.K();
            if (max > 0) {
                K.add("共 " + max + " 集");
            }
            if (num2 != null) {
                K.add("已看到第 " + num2 + " 集");
            }
            if (str3 != null) {
                K.add("更新至 ".concat(str3));
            }
            if (mixInfo.getStatis().getPlayVv() > 0) {
                K.add(DataModelKt.formatCount(mixInfo.getStatis().getPlayVv()) + " 次播放");
            }
            if (str2 != null) {
                K.add(str2);
            }
            final String Z0 = o70.Z0(p70.D(K), " · ", null, null, 0, null, 62);
            tc0 u0 = p70.u0(2096536192, new n03(k80Var, str, (byte) 0), go1Var2);
            go1Var = go1Var2;
            tc0 u02 = p70.u0(-412852400, new in1() { // from class: o03
                @Override // defpackage.in1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z2;
                    m65 m65Var;
                    int i6;
                    fe0 fe0Var2 = (fe0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((ea0) obj).getClass();
                    go1 go1Var3 = (go1) fe0Var2;
                    if (go1Var3.T(intValue & 1, (intValue & 17) != 16)) {
                        i13 i13Var = i13.a;
                        l13 m = o7.m(nq4.g(i13Var, 26.0f), jo.a);
                        k80 k80Var2 = k80.this;
                        l13 E0 = i42.E0(mw2.p(m, k80Var2.h, mw2.j), 9.0f, 0.0f, 2);
                        u74 a2 = t74.a(new kp(4.0f, true, new y9()), q8.T, go1Var3, 54);
                        long j = go1Var3.T;
                        int i7 = (int) (j ^ (j >>> 32));
                        am3 m2 = go1Var3.m();
                        l13 x0 = i42.x0(go1Var3, E0);
                        xd0.c.getClass();
                        go1Var3.h0();
                        boolean z3 = go1Var3.S;
                        df0 df0Var = wa2.A0;
                        if (z3) {
                            go1Var3.l(df0Var);
                        } else {
                            go1Var3.r0();
                        }
                        sg sgVar5 = q8.c0;
                        qi4.k(go1Var3, sgVar5, a2);
                        sg sgVar6 = q8.b0;
                        qi4.k(go1Var3, sgVar6, m2);
                        Integer valueOf = Integer.valueOf(i7);
                        sg sgVar7 = q8.d0;
                        qi4.k(go1Var3, sgVar7, valueOf);
                        qi4.j(go1Var3);
                        sg sgVar8 = q8.a0;
                        qi4.k(go1Var3, sgVar8, x0);
                        ow1.a(li4.g(), null, nq4.k(i13Var, 16.0f), k80Var2.i, go1Var3, 432);
                        i51 i51Var = lw2.b;
                        r55.b("合集", null, k80Var2.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var3.k(i51Var)).b.n, go1Var3, 6, 0, 131066);
                        go1Var3.q(true);
                        MixInfo mixInfo2 = mixInfo;
                        String mixName = mixInfo2.getMixName();
                        if (jx4.L(mixName)) {
                            mixName = "未命名合集";
                        }
                        if (z) {
                            go1Var3.d0(-1614136355);
                            m65Var = ((fw2) go1Var3.k(i51Var)).b.f;
                            z2 = false;
                        } else {
                            z2 = false;
                            go1Var3.d0(-1614134946);
                            m65Var = ((fw2) go1Var3.k(i51Var)).b.e;
                        }
                        go1Var3.q(z2);
                        r55.b(mixName, null, k80Var2.q, 0L, qk1.Q, 0L, null, 0L, 2, false, 2, 0, m65Var, go1Var3, 1572864, 24960, 110522);
                        go1 go1Var4 = go1Var3;
                        String str4 = Z0;
                        if (jx4.L(str4)) {
                            go1Var4.d0(1501903922);
                            go1Var4.q(false);
                        } else {
                            go1Var4.d0(1501665284);
                            r55.b(str4, null, k80Var2.s, 0L, null, 0L, null, 0L, 2, false, 1, 0, xc3.d, go1Var4, 0, 24960, 110586);
                            go1Var4 = go1Var4;
                            go1Var4.q(false);
                        }
                        if (jx4.L(mixInfo2.getDesc())) {
                            go1Var4.d0(1502207474);
                            go1Var4.q(false);
                        } else {
                            go1Var4.d0(1501961148);
                            go1 go1Var5 = go1Var4;
                            r55.b(mixInfo2.getDesc(), null, k80Var2.s, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((fw2) go1Var4.k(i51Var)).b.k, go1Var5, 0, 24960, 110586);
                            go1Var4 = go1Var5;
                            go1Var4.q(false);
                        }
                        Integer num3 = num;
                        if (num3 != null) {
                            go1Var4.d0(1502292662);
                            l13 G0 = i42.G0(i13Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                            u74 a3 = t74.a(new kp(8.0f, true, new y9()), q8.S, go1Var4, 6);
                            long j2 = go1Var4.T;
                            int i8 = (int) (j2 ^ (j2 >>> 32));
                            am3 m3 = go1Var4.m();
                            l13 x02 = i42.x0(go1Var4, G0);
                            go1Var4.h0();
                            if (go1Var4.S) {
                                go1Var4.l(df0Var);
                            } else {
                                go1Var4.r0();
                            }
                            qi4.k(go1Var4, sgVar5, a3);
                            qi4.k(go1Var4, sgVar6, m3);
                            r7.G(i8, go1Var4, sgVar7, go1Var4);
                            qi4.k(go1Var4, sgVar8, x02);
                            Integer num4 = num2;
                            ki1 ki1Var2 = ki1Var;
                            rm1 rm1Var5 = rm1Var;
                            if (num4 != null) {
                                go1Var4.d0(-241633988);
                                String str5 = "继续第 " + num4 + " 集";
                                hx1 I = k21.I();
                                l13 x = j42.x(i13Var, ki1Var2);
                                Map singletonMap = Collections.singletonMap(20, rm1Var5);
                                singletonMap.getClass();
                                w03.h(str5, I, true, rm1Var3, r13.c(x, singletonMap), go1Var4, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                go1Var4.q(false);
                                i6 = 32;
                            } else {
                                go1Var4.d0(-241027597);
                                String str6 = "从第 " + num3 + " 集播放";
                                hx1 H = il2.H();
                                l13 x2 = j42.x(i13Var, ki1Var2);
                                Map singletonMap2 = Collections.singletonMap(20, rm1Var5);
                                singletonMap2.getClass();
                                l13 c = r13.c(x2, singletonMap2);
                                i6 = 32;
                                w03.h(str6, H, true, rm1Var2, c, go1Var4, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                go1Var4.q(false);
                            }
                            String z4 = r7.z("选集 · 共 ", i, " 集");
                            hx1 hx1Var = jl2.d;
                            if (hx1Var == null) {
                                gx1 gx1Var = new gx1("Filled.PlaylistPlay", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i9 = th5.a;
                                long j3 = x70.b;
                                rt4 rt4Var = new rt4(j3);
                                ArrayList arrayList = new ArrayList(i6);
                                arrayList.add(new vk3(3.0f, 10.0f));
                                arrayList.add(new bl3(11.0f));
                                arrayList.add(new hl3(2.0f));
                                arrayList.add(new bl3(-11.0f));
                                rk3 rk3Var = rk3.c;
                                arrayList.add(rk3Var);
                                gx1.a(gx1Var, arrayList, rt4Var);
                                rt4 rt4Var2 = new rt4(j3);
                                ArrayList arrayList2 = new ArrayList(i6);
                                arrayList2.add(new vk3(3.0f, 6.0f));
                                arrayList2.add(new bl3(11.0f));
                                arrayList2.add(new hl3(2.0f));
                                arrayList2.add(new bl3(-11.0f));
                                arrayList2.add(rk3Var);
                                gx1.a(gx1Var, arrayList2, rt4Var2);
                                rt4 rt4Var3 = new rt4(j3);
                                ArrayList arrayList3 = new ArrayList(i6);
                                arrayList3.add(new vk3(3.0f, 14.0f));
                                arrayList3.add(new bl3(7.0f));
                                arrayList3.add(new hl3(2.0f));
                                arrayList3.add(new bl3(-7.0f));
                                arrayList3.add(rk3Var);
                                gx1.a(gx1Var, arrayList3, rt4Var3);
                                rt4 rt4Var4 = new rt4(j3);
                                ArrayList arrayList4 = new ArrayList(i6);
                                arrayList4.add(new vk3(16.0f, 13.0f));
                                arrayList4.add(new cl3(0.0f, 8.0f));
                                arrayList4.add(new cl3(6.0f, -4.0f));
                                arrayList4.add(rk3Var);
                                gx1.a(gx1Var, arrayList4, rt4Var4);
                                hx1Var = gx1Var.b();
                                jl2.d = hx1Var;
                            }
                            w03.h(z4, hx1Var, false, rm1Var4, null, go1Var4, RendererCapabilities.DECODER_SUPPORT_MASK, 16);
                            go1Var4.q(true);
                            go1Var4.q(false);
                        } else {
                            go1Var4.d0(1503857170);
                            go1Var4.q(false);
                        }
                    } else {
                        go1Var3.W();
                    }
                    return wd5.a;
                }
            }, go1Var);
            ea0 ea0Var = ea0.a;
            df0 df0Var = wa2.A0;
            i13 i13Var = i13.a;
            if (z) {
                go1Var.d0(-1801865281);
                l13 e = nq4.e(l13Var, 1.0f);
                ba0 a2 = z90.a(new kp(16.0f, true, new y9()), tvVar, go1Var, 6);
                long j = go1Var.T;
                int i6 = (int) (j ^ (j >>> 32));
                am3 m = go1Var.m();
                l13 x0 = i42.x0(go1Var, e);
                xd0.c.getClass();
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a2);
                qi4.k(go1Var, sgVar3, m);
                r7.G(i6, go1Var, sgVar2, go1Var);
                qi4.k(go1Var, sgVar, x0);
                u0.invoke(nq4.e(i13Var, 1.0f), go1Var, 54);
                ba0 a3 = z90.a(new kp(8.0f, true, new y9()), tvVar, go1Var, 6);
                long j2 = go1Var.T;
                int i7 = (int) (j2 ^ (j2 >>> 32));
                am3 m2 = go1Var.m();
                l13 x02 = i42.x0(go1Var, i13Var);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a3);
                qi4.k(go1Var, sgVar3, m2);
                r7.G(i7, go1Var, sgVar2, go1Var);
                qi4.k(go1Var, sgVar, x02);
                u02.invoke(ea0Var, go1Var, 54);
                r7.J(go1Var, true, true, false);
            } else {
                go1Var.d0(-1801575617);
                l13 e2 = nq4.e(l13Var, 1.0f);
                u74 a4 = t74.a(new kp(24.0f, true, new y9()), q8.S, go1Var, 6);
                long j3 = go1Var.T;
                int i8 = (int) (j3 ^ (j3 >>> 32));
                am3 m3 = go1Var.m();
                l13 x03 = i42.x0(go1Var, e2);
                xd0.c.getClass();
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a4);
                qi4.k(go1Var, sgVar3, m3);
                r7.G(i8, go1Var, sgVar2, go1Var);
                qi4.k(go1Var, sgVar, x03);
                u0.invoke(nq4.n(i13Var, f), go1Var, 48);
                sc2 sc2Var = new sc2(1.0f, true);
                ba0 a5 = z90.a(new kp(8.0f, true, new y9()), tvVar, go1Var, 6);
                long j4 = go1Var.T;
                int i9 = (int) (j4 ^ (j4 >>> 32));
                am3 m4 = go1Var.m();
                l13 x04 = i42.x0(go1Var, sc2Var);
                go1Var.h0();
                if (go1Var.S) {
                    go1Var.l(df0Var);
                } else {
                    go1Var.r0();
                }
                qi4.k(go1Var, sgVar4, a5);
                qi4.k(go1Var, sgVar3, m4);
                r7.G(i9, go1Var, sgVar2, go1Var);
                qi4.k(go1Var, sgVar, x04);
                u02.invoke(ea0Var, go1Var, 54);
                r7.J(go1Var, true, true, false);
            }
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: zz2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i2 | 1);
                    int X2 = mu0.X(i3);
                    w03.g(MixInfo.this, str, str2, z, f, num, num2, i, str3, ki1Var, rm1Var, rm1Var2, rm1Var3, rm1Var4, l13Var, (fe0) obj, X, X2);
                    return wd5.a;
                }
            };
        }
    }

    public static final void h(final String str, final hx1 hx1Var, final boolean z, final rm1 rm1Var, l13 l13Var, fe0 fe0Var, final int i, final int i2) {
        l13 l13Var2;
        int i3;
        final l13 l13Var3;
        go1 go1Var;
        long j;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-2129506205);
        int i4 = i | (go1Var2.g(str) ? 4 : 2) | (go1Var2.g(hx1Var) ? 32 : 16) | (go1Var2.i(rm1Var) ? 2048 : 1024);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
            l13Var2 = l13Var;
        } else {
            l13Var2 = l13Var;
            i3 = i4 | (go1Var2.g(l13Var2) ? 16384 : 8192);
        }
        int i6 = i3;
        if (go1Var2.T(i6 & 1, (i6 & 9363) != 9362)) {
            i13 i13Var = i13.a;
            if (i5 != 0) {
                l13Var2 = i13Var;
            }
            Object Q = go1Var2.Q();
            if (Q == de0.a) {
                Q = r7.v(go1Var2);
            }
            t33 t33Var = (t33) Q;
            t43 v = ut0.v(t33Var, go1Var2, 6);
            t43 w = ut0.w(t33Var, go1Var2);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            long j2 = z ? k80Var.d : k80Var.q;
            boolean booleanValue = ((Boolean) v.getValue()).booleanValue();
            if (z) {
                go1Var = go1Var2;
                j = k80Var.c;
            } else {
                go1Var = go1Var2;
                j = k80Var.G;
            }
            l13 l13Var4 = l13Var2;
            go1 go1Var3 = go1Var;
            cw4 t0 = p70.t0(booleanValue, j, k80Var.u, ((Boolean) w.getValue()).booleanValue(), "mixHeroButtonBg", go1Var3, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) v.getValue()).booleanValue(), j2, k80Var.v, "mixHeroButtonFg", go1Var3, 3072);
            l13 E0 = i42.E0(r13.d(p70.H(o7.m(nq4.g(l13Var4, 48.0f), jo.b), t0), null, null, null, null, rm1Var, null, null, null, null, null, new t64(0), t33Var, 65279), 20.0f, 0.0f, 2);
            u74 a2 = t74.a(new kp(8.0f, true, new y9()), q8.T, go1Var3, 54);
            long j3 = go1Var3.T;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            am3 m = go1Var3.m();
            l13 x0 = i42.x0(go1Var3, E0);
            xd0.c.getClass();
            go1Var3.h0();
            if (go1Var3.S) {
                go1Var3.l(wa2.A0);
            } else {
                go1Var3.r0();
            }
            qi4.k(go1Var3, q8.c0, a2);
            qi4.k(go1Var3, q8.b0, m);
            qi4.k(go1Var3, q8.d0, Integer.valueOf(i7));
            qi4.j(go1Var3);
            qi4.k(go1Var3, q8.a0, x0);
            ow1.a(hx1Var, null, p70.G(nq4.k(i13Var, 20.0f), s0, j2, false, null, 12), j2, go1Var3, ((i6 >> 3) & 14) | 48);
            r55.b(str, p70.G(i13Var, s0, j2, false, null, 12), j2, 0L, qk1.O, 0L, null, 0L, 0, false, 1, 0, ((fw2) go1Var3.k(i51Var)).b.m, go1Var3, 1572864 | (i6 & 14), 27648, 106424);
            go1Var2 = go1Var3;
            go1Var2.q(true);
            l13Var3 = l13Var4;
        } else {
            go1Var2.W();
            l13Var3 = l13Var2;
        }
        x04 u = go1Var2.u();
        if (u != null) {
            u.d = new hn1(str, hx1Var, z, rm1Var, l13Var3, i, i2) { // from class: g03
                public final /* synthetic */ String I;
                public final /* synthetic */ hx1 J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ rm1 L;
                public final /* synthetic */ l13 M;
                public final /* synthetic */ byte N;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.N = i2;
                }

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(385);
                    w03.h(this.I, this.J, this.K, this.L, this.M, (fe0) obj, X, this.N);
                    return wd5.a;
                }
            };
        }
    }

    public static final void i(final int i, final int i2, final int i3, final y03 y03Var, final tm1 tm1Var, final boolean z, fe0 fe0Var, final int i4) {
        int i5;
        go1 go1Var;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(-420157297);
        if ((i4 & 6) == 0) {
            i5 = (go1Var2.e(i) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= go1Var2.e(i2) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= go1Var2.e(i3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= go1Var2.e(y03Var.ordinal()) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= go1Var2.i(tm1Var) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= go1Var2.h(z) ? 131072 : 65536;
        }
        if (go1Var2.T(i5 & 1, (74899 & i5) != 74898)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var2.k(i51Var)).a;
            i13 i13Var = i13.a;
            l13 E0 = i42.E0(nq4.e(i13Var, 1.0f), 0.0f, 2.0f, 1);
            int i6 = i5;
            u74 a2 = t74.a(new kp(10.0f, true, new y9()), q8.T, go1Var2, 54);
            long j = go1Var2.T;
            int i7 = (int) (j ^ (j >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, E0);
            xd0.c.getClass();
            go1Var2.h0();
            boolean z2 = go1Var2.S;
            df0 df0Var = wa2.A0;
            if (z2) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var2, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var2, sgVar2, m);
            Integer valueOf = Integer.valueOf(i7);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var2, sgVar3, valueOf);
            qi4.j(go1Var2);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var2, sgVar4, x0);
            String n = i > 0 ? nt3.n(hf1.D("已加载第 ", i, "–", i2, " 集 / 共 "), i3, " 集") : r7.z("共 ", i3, " 集");
            m65 m65Var = ((fw2) go1Var2.k(i51Var)).b.n;
            r55.b(n, new sc2(1.0f, true), k80Var.s, 0L, null, 0L, null, 0L, 2, false, 1, 0, m65Var, go1Var2, 0, 24960, 110584);
            l13 n2 = nq4.n(i13Var, z ? 200.0f : 252.0f);
            uw2 c = px.c(q8.J, false);
            long j2 = go1Var2.T;
            int i8 = (int) (j2 ^ (j2 >>> 32));
            am3 m2 = go1Var2.m();
            l13 x02 = i42.x0(go1Var2, n2);
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(df0Var);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, sgVar, c);
            qi4.k(go1Var2, sgVar2, m2);
            r7.G(i8, go1Var2, sgVar3, go1Var2);
            qi4.k(go1Var2, sgVar4, x02);
            boolean z3 = (i6 & 458752) == 131072;
            Object Q = go1Var2.Q();
            if (z3 || Q == de0.a) {
                Q = new c03((byte) 0, z);
                go1Var2.o0(Q);
            }
            lq2.g(y03.M, y03Var, (hn1) Q, tm1Var, null, null, 40.0f, false, null, go1Var2, ((i6 >> 6) & 112) | 1572864 | ((i6 >> 3) & 7168), 432);
            go1Var = go1Var2;
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: d03
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    w03.i(i, i2, i3, y03Var, tm1Var, z, (fe0) obj, mu0.X(i4 | 1));
                    return wd5.a;
                }
            };
        }
    }
}
