package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class he implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ vq3 J;
    public final /* synthetic */ t43 K;

    public /* synthetic */ he(vq3 vq3Var, t43 t43Var, byte b) {
        this.I = b;
        this.J = vq3Var;
        this.K = t43Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.K;
        vq3 vq3Var = this.J;
        byte b2 = 0;
        fe0 fe0Var = (fe0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    Object Q = go1Var.Q();
                    jp jpVar = de0.a;
                    if (Q == jpVar) {
                        Q = new t5((byte) 6);
                        go1Var.o0(Q);
                    }
                    yo yoVar = new yo((tm1) Q, false);
                    boolean i = go1Var.i(vq3Var);
                    Object Q2 = go1Var.Q();
                    if (i || Q2 == jpVar) {
                        Q2 = new ie(vq3Var, (byte) 1);
                        go1Var.o0(Q2);
                    }
                    l13 n = c5.n(o7.K(yoVar, (tm1) Q2), vq3Var.getCanCalculatePosition() ? 1.0f : 0.0f);
                    hn1 hn1Var = (hn1) t43Var.getValue();
                    Object Q3 = go1Var.Q();
                    if (Q3 == jpVar) {
                        Q3 = kc.c;
                        go1Var.o0(Q3);
                    }
                    uw2 uw2Var = (uw2) Q3;
                    long j = go1Var.T;
                    int i2 = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, n);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(wa2.A0);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, uw2Var);
                    qi4.k(go1Var, q8.b0, m);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i2));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    hn1Var.invoke(go1Var, 0);
                    go1Var.q(true);
                    break;
                }
            default:
                go1 go1Var2 = (go1) fe0Var;
                if (!go1Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    mw2.b(pe.b.a(Boolean.TRUE), p70.u0(1022273628, new he(vq3Var, t43Var, b2), go1Var2), go1Var2, 56);
                    break;
                }
        }
        return wd5Var;
    }
}
