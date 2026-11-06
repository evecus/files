package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y63 implements tm1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ y63(oh2 oh2Var, ki1 ki1Var, boolean z, u45 u45Var, td3 td3Var) {
        this.K = oh2Var;
        this.L = ki1Var;
        this.J = z;
        this.M = u45Var;
        this.N = td3Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.N;
        Object obj3 = this.M;
        boolean z = this.J;
        Object obj4 = this.L;
        Object obj5 = this.K;
        switch (b) {
            case 0:
                p63 p63Var = (p63) obj;
                p63Var.getClass();
                ((n24) obj5).I = true;
                ((n24) obj4).I = true;
                ((a73) obj3).n(p63Var, z, (pp) obj2);
                break;
            default:
                oh2 oh2Var = (oh2) obj5;
                ki1 ki1Var = (ki1) obj4;
                u45 u45Var = (u45) obj3;
                td3 td3Var = (td3) obj2;
                pd3 pd3Var = (pd3) obj;
                if (oh2Var.b()) {
                    ot4 ot4Var = oh2Var.c;
                    if (ot4Var != null) {
                        ((yt0) ot4Var).b();
                    }
                } else {
                    ki1.a(ki1Var);
                }
                if (oh2Var.b() && z) {
                    if (oh2Var.a() == ks1.J) {
                        u45Var.d(pd3Var);
                        break;
                    } else {
                        v55 d = oh2Var.d();
                        if (d != null) {
                            long j = pd3Var.a;
                            g12 g12Var = oh2Var.d;
                            xj0 xj0Var = oh2Var.v;
                            int c = td3Var.c(d.b(j, true));
                            xj0Var.invoke(d55.a((d55) g12Var.J, null, ui4.c(c, c), 5));
                            if (oh2Var.a.a.J.length() > 0) {
                                oh2Var.k.setValue(ks1.K);
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ y63(n24 n24Var, n24 n24Var2, a73 a73Var, boolean z, pp ppVar) {
        this.K = n24Var;
        this.L = n24Var2;
        this.M = a73Var;
        this.J = z;
        this.N = ppVar;
    }
}
