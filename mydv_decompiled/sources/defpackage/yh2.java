package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yh2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ki1 J;
    public final /* synthetic */ rm1 K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ rm1 M;

    public /* synthetic */ yh2(ki1 ki1Var, rm1 rm1Var, boolean z, rm1 rm1Var2, byte b) {
        this.I = b;
        this.J = ki1Var;
        this.K = rm1Var;
        this.L = z;
        this.M = rm1Var2;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        df0 df0Var = wa2.A0;
        i13 i13Var = i13.a;
        ki1 ki1Var = this.J;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    ba0 a = z90.a(new kp(8.0f, true, new y9()), q8.V, go1Var, 6);
                    long j = go1Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, i13Var);
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
                    ci2.h("同意并继续", this.K, true, j42.x(nq4.e(i13Var, 1.0f), ki1Var), this.L, 0L, 0.0f, go1Var, 390, 96);
                    ci2.h("不同意，退出", this.M, false, nq4.e(i13Var, 1.0f), false, x70.f, 44.0f, go1Var, 1772934, 16);
                    go1Var.q(true);
                    break;
                }
            default:
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    u74 a2 = t74.a(new kp(12.0f, true, new y9()), q8.S, go1Var2, 6);
                    long j2 = go1Var2.T;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
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
                    ci2.h("同意并继续", this.K, true, j42.x(new sc2(1.0f, true), ki1Var), this.L, 0L, 0.0f, go1Var2, 390, 96);
                    ci2.h("不同意", this.M, false, nq4.n(i13Var, 132.0f), false, 0L, 0.0f, go1Var2, 3462, 112);
                    go1Var2.q(true);
                    break;
                }
        }
        return wd5Var;
    }
}
