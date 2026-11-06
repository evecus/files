package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class f05 {
    public static final i51 a = new i51(new yw4((byte) 3), (byte) 0);

    public static final void a(l13 l13Var, final dn4 dn4Var, final long j, long j2, float f, final tc0 tc0Var, fe0 fe0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            l13Var = i13.a;
        }
        if ((i2 & 8) != 0) {
            j2 = q80.b(j, fe0Var);
        }
        float f2 = (i2 & 16) != 0 ? 0.0f : 8.0f;
        if ((i2 & 32) != 0) {
            f = 0.0f;
        }
        go1 go1Var = (go1) fe0Var;
        i51 i51Var = a;
        final float f3 = ((r11) go1Var.k(i51Var)).I + f2;
        final l13 l13Var2 = l13Var;
        final float f4 = f;
        mw2.c(new ay3[]{yh0.a.a(new x70(j2)), i51Var.a(new r11(f3))}, p70.u0(421772006, new hn1() { // from class: e05
            @Override // defpackage.hn1
            public final Object invoke(Object obj, Object obj2) {
                fe0 fe0Var2 = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                boolean T = go1Var2.T(intValue & 1, (intValue & 3) != 2);
                wd5 wd5Var = wd5.a;
                if (!T) {
                    go1Var2.W();
                    return wd5Var;
                }
                k80 k80Var = ((fw2) go1Var2.k(lw2.b)).a;
                boolean booleanValue = ((Boolean) go1Var2.k(q80.a)).booleanValue();
                long j3 = k80Var.p;
                int i3 = x70.h;
                long j4 = j;
                if (zc5.a(j4, j3) && booleanValue) {
                    if (!r11.c(f3, 0.0f)) {
                        j3 = qb.A(x70.c(k80Var.t, ((((float) Math.log(r4 + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j3);
                    }
                    j4 = j3;
                }
                float P = ((iu0) go1Var2.k(hf0.h)).P(f4);
                dn4 dn4Var2 = dn4Var;
                i13 i13Var = i13.a;
                l13 m = o7.m(mw2.p(l13.this.then(P > 0.0f ? qb.P(i13Var, 0.0f, P, dn4Var2, false, 1042399) : i13Var).then(i13Var), j4, dn4Var2), dn4Var2);
                Object Q = go1Var2.Q();
                jp jpVar = de0.a;
                if (Q == jpVar) {
                    Q = new ol4((byte) 18);
                    go1Var2.o0(Q);
                }
                l13 a2 = oi4.a(m, false, (tm1) Q);
                Object Q2 = go1Var2.Q();
                if (Q2 == jpVar) {
                    Q2 = km2.O;
                    go1Var2.o0(Q2);
                }
                l13 b = m05.b(a2, wd5Var, (PointerInputEventHandler) Q2);
                uw2 c = px.c(q8.J, true);
                long j5 = go1Var2.T;
                int i4 = (int) (j5 ^ (j5 >>> 32));
                am3 m2 = go1Var2.m();
                l13 x0 = i42.x0(go1Var2, b);
                xd0.c.getClass();
                go1Var2.h0();
                if (go1Var2.S) {
                    go1Var2.l(wa2.A0);
                } else {
                    go1Var2.r0();
                }
                qi4.k(go1Var2, q8.c0, c);
                qi4.k(go1Var2, q8.b0, m2);
                qi4.k(go1Var2, q8.d0, Integer.valueOf(i4));
                qi4.j(go1Var2);
                qi4.k(go1Var2, q8.a0, x0);
                tc0Var.invoke(go1Var2, 0);
                go1Var2.q(true);
                return wd5Var;
            }
        }, go1Var), go1Var, 56);
    }
}
