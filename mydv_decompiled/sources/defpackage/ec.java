package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ec {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(vd3 vd3Var, l13 l13Var, final long j, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1776202187);
        int i3 = (go1Var.g(vd3Var) ? 4 : 2) | i | (go1Var.g(l13Var) ? 32 : 16) | 128;
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            go1Var.Y();
            if ((i & 1) == 0 || go1Var.C()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                go1Var.W();
                i2 = i3 & (-897);
            }
            go1Var.r();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object Q = go1Var.Q();
            if (z || Q == de0.a) {
                Q = new v1(vd3Var, (byte) 8);
                go1Var.o0(Q);
            }
            final l13 a2 = oi4.a(l13Var, false, (tm1) Q);
            c5.h(vd3Var, q8.K, p70.u0(-1653527038, new hn1() { // from class: zb
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    fe0 fe0Var2 = (fe0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    go1 go1Var2 = (go1) fe0Var2;
                    if (go1Var2.T(intValue & 1, (intValue & 3) != 2)) {
                        long j2 = j;
                        l13 l13Var2 = a2;
                        if (j2 != 9205357640488583168L) {
                            go1Var2.d0(-1244013944);
                            l13 j3 = nq4.j(l13Var2, v11.b(j2), v11.a(j2), 0.0f, 0.0f, 12);
                            uw2 c = px.c(q8.K, false);
                            long j4 = go1Var2.T;
                            int i5 = (int) (j4 ^ (j4 >>> 32));
                            am3 m = go1Var2.m();
                            l13 x0 = i42.x0(go1Var2, j3);
                            xd0.c.getClass();
                            go1Var2.h0();
                            if (go1Var2.S) {
                                go1Var2.l(wa2.A0);
                            } else {
                                go1Var2.r0();
                            }
                            qi4.k(go1Var2, q8.c0, c);
                            qi4.k(go1Var2, q8.b0, m);
                            qi4.k(go1Var2, q8.d0, Integer.valueOf(i5));
                            qi4.j(go1Var2);
                            qi4.k(go1Var2, q8.a0, x0);
                            ec.b(null, go1Var2, 0, 1);
                            go1Var2.q(true);
                            go1Var2.q(false);
                        } else {
                            go1Var2.d0(-1243644858);
                            ec.b(l13Var2, go1Var2, 0, 0);
                            go1Var2.q(false);
                        }
                    } else {
                        go1Var2.W();
                    }
                    return wd5.a;
                }
            }, go1Var), go1Var, i4 | 432);
        } else {
            go1Var.W();
        }
        long j2 = j;
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ac(vd3Var, l13Var, j2, i);
        }
    }

    public static final void b(l13 l13Var, fe0 fe0Var, int i, int i2) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (go1Var.g(l13Var) ? 4 : 2) | i;
        }
        byte b = 0;
        if (go1Var.T(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                l13Var = i13.a;
            }
            oh4.a(go1Var, j42.u(nq4.l(l13Var, a, 25.0f), new cc(((f65) go1Var.k(g65.a)).a, b)));
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bc(l13Var, i, i2);
        }
    }
}
