package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pl4 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ dl4 J;
    public final /* synthetic */ k80 K;
    public final /* synthetic */ rm1 L;
    public final /* synthetic */ ki1 M;
    public final /* synthetic */ rm1 N;
    public final /* synthetic */ rm1 O;

    public /* synthetic */ pl4(dl4 dl4Var, k80 k80Var, rm1 rm1Var, ki1 ki1Var, rm1 rm1Var2, rm1 rm1Var3, byte b) {
        this.I = b;
        this.J = dl4Var;
        this.K = k80Var;
        this.L = rm1Var;
        this.M = ki1Var;
        this.N = rm1Var2;
        this.O = rm1Var3;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
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
                    f05.a(nq4.o(i13.a, 280.0f, 360.0f), jo.f, ((fw2) go1Var.k(lw2.b)).a.G, 0L, 12.0f, p70.u0(-272537034, new pl4(this.J, this.K, this.L, this.M, this.N, this.O, (byte) 1), go1Var), go1Var, 12779526, 88);
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
                    i13 i13Var = i13.a;
                    l13 C0 = i42.C0(i13Var, 20.0f);
                    ba0 a = z90.a(new kp(8.0f, true, new y9()), q8.V, go1Var2, 6);
                    long j = go1Var2.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m = go1Var2.m();
                    l13 x0 = i42.x0(go1Var2, C0);
                    xd0.c.getClass();
                    go1Var2.h0();
                    if (go1Var2.S) {
                        go1Var2.l(wa2.A0);
                    } else {
                        go1Var2.r0();
                    }
                    qi4.k(go1Var2, q8.c0, a);
                    qi4.k(go1Var2, q8.b0, m);
                    qi4.k(go1Var2, q8.d0, Integer.valueOf(i));
                    qi4.j(go1Var2);
                    qi4.k(go1Var2, q8.a0, x0);
                    dl4 dl4Var = this.J;
                    r55.b(dl4Var.a, i42.G0(i13Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), this.K.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var2.k(lw2.b)).b.h, go1Var2, 1572912, 0, 131000);
                    qm4.c(dl4Var.b() ? dq2.Q() : lq2.K(), dl4Var.b() ? "修改 PIN" : "设置 PIN", this.L, this.M, false, go1Var2, 3072, 16);
                    if (dl4Var.b()) {
                        go1Var2.d0(-1693012424);
                        qm4.c(lq2.K(), "清除 PIN", this.N, null, false, go1Var2, 48, 24);
                        go1Var2.q(false);
                    } else {
                        go1Var2.d0(-1692799082);
                        go1Var2.q(false);
                    }
                    if (j42.c(dl4Var.a, "main")) {
                        go1Var2.d0(-1692500490);
                        go1Var2.q(false);
                    } else {
                        go1Var2.d0(-1692731688);
                        qm4.c(d4.y(), "删除配置", this.O, null, true, go1Var2, 24624, 8);
                        go1Var2.q(false);
                    }
                    go1Var2.q(true);
                    break;
                }
        }
        return wd5Var;
    }
}
