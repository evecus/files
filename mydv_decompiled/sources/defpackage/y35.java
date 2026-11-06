package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y35 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ long J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ dn1 L;

    public /* synthetic */ y35(long j, m65 m65Var, hn1 hn1Var) {
        this.I = (byte) 0;
        this.J = j;
        this.K = m65Var;
        this.L = hn1Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        jp jpVar = de0.a;
        wd5 wd5Var = wd5.a;
        dn1 dn1Var = this.L;
        Object obj4 = this.K;
        switch (b) {
            case 0:
                m65 m65Var = (m65) obj4;
                hn1 hn1Var = (hn1) dn1Var;
                l13 l13Var = (l13) obj;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((go1) fe0Var).g(l13Var) ? 4 : 2;
                }
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 19) != 18)) {
                    go1Var.W();
                    break;
                } else {
                    uw2 c = px.c(q8.J, false);
                    long j = go1Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var.m();
                    l13 x0 = i42.x0(go1Var, l13Var);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(wa2.A0);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, c);
                    qi4.k(go1Var, q8.b0, m);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    kb4.d(this.J, m65Var, hn1Var, go1Var, 0);
                    go1Var.q(true);
                    break;
                }
            case 1:
                so0 so0Var = (so0) obj4;
                tm1 tm1Var = (tm1) dn1Var;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    Object Q = go1Var2.Q();
                    if (Q == jpVar) {
                        Q = new m45((byte) 15);
                        go1Var2.o0(Q);
                    }
                    lq2.c("字体大小", so0.M, so0Var, tm1Var, (tm1) Q, this.J, null, go1Var2, 24582);
                    break;
                }
            default:
                vo0 vo0Var = (vo0) obj4;
                tm1 tm1Var2 = (tm1) dn1Var;
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    go1Var3.W();
                    break;
                } else {
                    Object Q2 = go1Var3.Q();
                    if (Q2 == jpVar) {
                        Q2 = new m45((byte) 14);
                        go1Var3.o0(Q2);
                    }
                    lq2.c("移动速度", vo0.M, vo0Var, tm1Var2, (tm1) Q2, this.J, null, go1Var3, 24582);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ y35(Enum r1, tm1 tm1Var, long j, byte b) {
        this.I = b;
        this.K = r1;
        this.L = tm1Var;
        this.J = j;
    }
}
