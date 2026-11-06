package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ol0 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hx1 J;
    public final /* synthetic */ String K;

    public /* synthetic */ ol0(String str, hx1 hx1Var, int i) {
        this.I = (byte) 2;
        this.K = str;
        this.J = hx1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        df0 df0Var = wa2.A0;
        i13 i13Var = i13.a;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    l13 E0 = i42.E0(mw2.p(nq4.g(i13Var, 22.0f), hx2.e, hx2.i), 8.0f, 0.0f, 2);
                    u74 a = t74.a(new kp(4.0f, true, new y9()), q8.T, go1Var, 54);
                    long j = go1Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, E0);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(df0Var);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, a);
                    qi4.k(go1Var, q8.b0, m);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    long j2 = hx2.a;
                    ow1.a(this.J, null, nq4.k(i13Var, 14.0f), j2, go1Var, 432);
                    r55.b(this.K, null, j2, 0L, null, 0L, null, 0L, 0, false, 1, 0, xc3.f, go1Var, 0, 27648, 106490);
                    go1Var.q(true);
                    break;
                }
            case 1:
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    u74 a2 = t74.a(new kp(2.0f, true, new y9()), q8.T, go1Var2, 54);
                    long j3 = go1Var2.T;
                    int i2 = (int) (j3 ^ (j3 >>> 32));
                    am3 m2 = go1Var2.m();
                    l13 x02 = i42.x0(go1Var2, i13Var);
                    xd0.c.getClass();
                    go1Var2.h0();
                    if (go1Var2.S) {
                        go1Var2.l(df0Var);
                    } else {
                        go1Var2.r0();
                    }
                    qi4.k(go1Var2, q8.c0, a2);
                    qi4.k(go1Var2, q8.b0, m2);
                    qi4.k(go1Var2, q8.d0, Integer.valueOf(i2));
                    qi4.j(go1Var2);
                    qi4.k(go1Var2, q8.a0, x02);
                    long j4 = hx2.a;
                    ow1.a(this.J, null, nq4.k(i13Var, 14.0f), j4, go1Var2, 432);
                    r55.b(this.K, null, j4, 0L, null, 0L, null, 0L, 0, false, 1, 0, m65.a(xc3.f, 0L, 0L, null, null, 0L, new an4(x70.c(hx2.g, 0.55f), (Float.floatToRawIntBits(1.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), 3.0f), 0L, null, 16769023), go1Var2, 0, 27648, 106490);
                    go1Var2.q(true);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                he4.n(mu0.X(7), (fe0) obj, this.J, this.K);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ ol0(hx1 hx1Var, String str, byte b) {
        this.I = b;
        this.J = hx1Var;
        this.K = str;
    }
}
