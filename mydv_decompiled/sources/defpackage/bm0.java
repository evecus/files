package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bm0 extends r92 implements hn1 {
    public final /* synthetic */ ea5 J;
    public final /* synthetic */ ve1 K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm0(ea5 ea5Var, ve1 ve1Var, Object obj) {
        super(2);
        this.J = ea5Var;
        this.K = ve1Var;
        this.L = obj;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        Object d;
        fe0 fe0Var = (fe0) obj;
        int intValue = ((Number) obj2).intValue();
        go1 go1Var = (go1) fe0Var;
        if (go1Var.T(intValue & 1, (intValue & 3) != 2)) {
            ub5 ub5Var = p70.F;
            ea5 ea5Var = this.J;
            boolean i = ea5Var.i();
            ss4 ss4Var = ea5Var.a;
            jp jpVar = de0.a;
            if (i) {
                go1Var.d0(1666827533);
                go1Var.q(false);
                d = ss4Var.d();
            } else {
                go1Var.d0(1666573488);
                boolean g = go1Var.g(ea5Var);
                d = go1Var.Q();
                if (g || d == jpVar) {
                    ns4 i2 = o63.i();
                    tm1 e = i2 != null ? i2.e() : null;
                    ns4 j = o63.j(i2);
                    try {
                        Object d2 = ss4Var.d();
                        o63.o(i2, j, e);
                        go1Var.o0(d2);
                        d = d2;
                    } catch (Throwable th) {
                        o63.o(i2, j, e);
                        throw th;
                    }
                }
                go1Var.q(false);
            }
            go1Var.d0(1378811975);
            Object obj3 = this.L;
            float f = j42.c(d, obj3) ? 1.0f : 0.0f;
            go1Var.q(false);
            Float valueOf = Float.valueOf(f);
            boolean g2 = go1Var.g(ea5Var);
            Object Q = go1Var.Q();
            if (g2 || Q == jpVar) {
                Q = dt4.b(new p80(ea5Var, (byte) 6));
                go1Var.o0(Q);
            }
            Object value = ((cw4) Q).getValue();
            go1Var.d0(1378811975);
            float f2 = j42.c(value, obj3) ? 1.0f : 0.0f;
            go1Var.q(false);
            Float valueOf2 = Float.valueOf(f2);
            boolean g3 = go1Var.g(ea5Var);
            Object Q2 = go1Var.Q();
            if (g3 || Q2 == jpVar) {
                Q2 = dt4.b(new p80(ea5Var, (byte) 7));
                go1Var.o0(Q2);
            }
            go1Var.d0(955869654);
            go1Var.q(false);
            ba5 y = mw2.y(ea5Var, valueOf, valueOf2, this.K, ub5Var, go1Var, 0);
            boolean g4 = go1Var.g(y);
            Object Q3 = go1Var.Q();
            if (g4 || Q3 == jpVar) {
                Q3 = new am0(y, (byte) 1);
                go1Var.o0(Q3);
            }
            l13 O = qb.O(i13.a, (tm1) Q3);
            tc0 tc0Var = j16.t;
            uw2 c = px.c(q8.J, false);
            long j2 = go1Var.T;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, O);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c);
            qi4.k(go1Var, q8.b0, m);
            qi4.i(go1Var, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            tc0Var.invoke(obj3, go1Var, 0);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        return wd5.a;
    }
}
