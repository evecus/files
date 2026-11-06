package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import com.github.mytv.dv.model.Aweme;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w30 implements jn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ w30(List list, Object obj, tm1 tm1Var, byte b) {
        this.I = b;
        this.J = list;
        this.L = obj;
        this.K = tm1Var;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.I;
        l13 l13Var = i13.a;
        wd5 wd5Var = wd5.a;
        Object obj5 = de0.a;
        List list = this.J;
        Object obj6 = this.L;
        Object obj7 = this.K;
        boolean z = true;
        byte b2 = 0;
        switch (b) {
            case 0:
                zd2 zd2Var = (zd2) obj;
                int intValue = ((Number) obj2).intValue();
                fe0 fe0Var = (fe0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                tm1 tm1Var = (tm1) obj7;
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((go1) fe0Var).g(zd2Var) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((go1) fe0Var).e(intValue) ? 32 : 16;
                }
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(i & 1, (i & 147) != 146)) {
                    go1Var.W();
                    break;
                } else {
                    b50 b50Var = (b50) list.get(intValue);
                    go1Var.d0(-425923294);
                    String str = b50Var.a;
                    boolean z2 = intValue == ((gk3) ((s33) obj6)).h();
                    boolean g = go1Var.g(tm1Var);
                    if ((((i & 112) ^ 48) <= 32 || !go1Var.e(intValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean z3 = g | z;
                    Object Q = go1Var.Q();
                    if (z3 || Q == obj5) {
                        Q = new u30(tm1Var, intValue, (byte) 0);
                        go1Var.o0(Q);
                    }
                    qg5.j(str, z2, (rm1) Q, go1Var, 0);
                    go1Var.q(false);
                    break;
                }
            case 1:
                mg2 mg2Var = (mg2) obj;
                int intValue3 = ((Number) obj2).intValue();
                fe0 fe0Var2 = (fe0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                Object obj8 = (b50) obj6;
                Object obj9 = (hu2) obj7;
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((go1) fe0Var2).g(mg2Var) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((go1) fe0Var2).e(intValue3) ? 32 : 16;
                }
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
                    go1Var2.W();
                    break;
                } else {
                    Aweme aweme = (Aweme) list.get(intValue3);
                    go1Var2.d0(-885806335);
                    boolean i5 = go1Var2.i(obj9) | go1Var2.i(obj8) | go1Var2.i(aweme);
                    Object Q2 = go1Var2.Q();
                    if (i5 || Q2 == obj5) {
                        Q2 = new z30(obj9, obj8, aweme, b2);
                        go1Var2.o0(Q2);
                    }
                    eu5.c(aweme, (rm1) Q2, nq4.e(l13Var, 1.0f), 0.0f, null, false, false, false, 0L, 0L, go1Var2, Aweme.$stable | RendererCapabilities.DECODER_SUPPORT_MASK, 2040);
                    go1Var2.q(false);
                    break;
                }
            case 2:
                mg2 mg2Var2 = (mg2) obj;
                int intValue5 = ((Number) obj2).intValue();
                fe0 fe0Var3 = (fe0) obj3;
                int intValue6 = ((Number) obj4).intValue();
                tm1 tm1Var2 = (tm1) obj7;
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((go1) fe0Var3).g(mg2Var2) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((go1) fe0Var3).e(intValue5) ? 32 : 16;
                }
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(i3 & 1, (i3 & 147) != 146)) {
                    go1Var3.W();
                    break;
                } else {
                    x03 x03Var = (x03) list.get(intValue5);
                    go1Var3.d0(114316987);
                    Aweme aweme2 = x03Var.a;
                    ll0 ll0Var = ml0.Companion;
                    int i6 = x03Var.b;
                    ll0Var.getClass();
                    ml0 ml0Var = new ml0(r7.z("第 ", i6, " 集"), null);
                    l13 e = nq4.e(l13Var, 1.0f);
                    if (intValue5 == 0) {
                        l13Var = j42.x(l13Var, (ki1) obj6);
                    }
                    l13 then = e.then(l13Var);
                    boolean g2 = go1Var3.g(tm1Var2) | go1Var3.i(x03Var);
                    Object Q3 = go1Var3.Q();
                    if (g2 || Q3 == obj5) {
                        Q3 = new yu1(tm1Var2, x03Var, (byte) 1);
                        go1Var3.o0(Q3);
                    }
                    eu5.c(aweme2, (rm1) Q3, then, 0.0f, ml0Var, false, false, true, 0L, 0L, go1Var3, Aweme.$stable | 14155776, 1832);
                    go1Var3.q(false);
                    break;
                }
            default:
                zd2 zd2Var2 = (zd2) obj;
                int intValue7 = ((Number) obj2).intValue();
                fe0 fe0Var4 = (fe0) obj3;
                int intValue8 = ((Number) obj4).intValue();
                tm1 tm1Var3 = (tm1) obj7;
                k80 k80Var = (k80) obj6;
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((go1) fe0Var4).g(zd2Var2) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((go1) fe0Var4).e(intValue7) ? 32 : 16;
                }
                go1 go1Var4 = (go1) fe0Var4;
                if (!go1Var4.T(i4 & 1, (i4 & 147) != 146)) {
                    go1Var4.W();
                    break;
                } else {
                    String str2 = (String) list.get(intValue7);
                    go1Var4.d0(1381444185);
                    Object Q4 = go1Var4.Q();
                    if (Q4 == obj5) {
                        Q4 = ad4.w(Boolean.FALSE);
                        go1Var4.o0(Q4);
                    }
                    t43 t43Var = (t43) Q4;
                    Object Q5 = go1Var4.Q();
                    if (Q5 == obj5) {
                        Q5 = r7.v(go1Var4);
                    }
                    t33 t33Var = (t33) Q5;
                    cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), x70.f, k80Var.u, ((Boolean) ut0.w(t33Var, go1Var4).getValue()).booleanValue(), "search-suggest-row-bg", go1Var4, 24624, 0);
                    cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.q, k80Var.v, "search-suggest-row-fg", go1Var4, 3072);
                    cw4 s02 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.s, k80Var.v, "search-suggest-row-icon", go1Var4, 3072);
                    i13 i13Var = i13.a;
                    l13 H = p70.H(o7.m(nq4.e(i13Var, 1.0f), jo.b), t0);
                    Object Q6 = go1Var4.Q();
                    if (Q6 == obj5) {
                        Q6 = new nm2(t43Var, (byte) 1);
                        go1Var4.o0(Q6);
                    }
                    l13 A0 = i42.A0(H, (tm1) Q6);
                    boolean g3 = go1Var4.g(tm1Var3) | go1Var4.g(str2);
                    Object Q7 = go1Var4.Q();
                    if (g3 || Q7 == obj5) {
                        Q7 = new po0(tm1Var3, str2, (byte) 2);
                        go1Var4.o0(Q7);
                    }
                    l13 D0 = i42.D0(mw2.B(r13.d(A0, null, null, null, null, (rm1) Q7, null, null, null, null, null, null, t33Var, 130815), false, t33Var, 1), 14.0f, 12.0f);
                    u74 a = t74.a(i42.b, q8.T, go1Var4, 48);
                    long j = go1Var4.T;
                    int i7 = (int) (j ^ (j >>> 32));
                    am3 m = go1Var4.m();
                    l13 x0 = i42.x0(go1Var4, D0);
                    xd0.c.getClass();
                    go1Var4.h0();
                    if (go1Var4.S) {
                        go1Var4.l(wa2.A0);
                    } else {
                        go1Var4.r0();
                    }
                    qi4.k(go1Var4, q8.c0, a);
                    qi4.k(go1Var4, q8.b0, m);
                    qi4.k(go1Var4, q8.d0, Integer.valueOf(i7));
                    qi4.j(go1Var4);
                    qi4.k(go1Var4, q8.a0, x0);
                    ow1.a(ad4.s(), null, p70.G(nq4.k(i13Var, 18.0f), s02, k80Var.s, false, null, 12), k80Var.s, go1Var4, 48);
                    oh4.a(go1Var4, nq4.n(i13Var, 12.0f));
                    m65 m65Var = ((fw2) go1Var4.k(lw2.b)).b.k;
                    qk1 qk1Var = ((Boolean) t43Var.getValue()).booleanValue() ? qk1.P : qk1.M;
                    long j2 = k80Var.q;
                    r55.b(str2, p70.G(i13Var, s0, j2, false, null, 12), j2, 0L, qk1Var, 0L, null, 0L, 2, false, 1, 0, m65Var, go1Var4, 0, 24960, 110520);
                    go1Var4.q(true);
                    go1Var4.q(false);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ w30(List list, Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = list;
        this.K = obj;
        this.L = obj2;
    }
}
