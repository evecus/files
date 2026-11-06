package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class gh5 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hh5 J;

    public /* synthetic */ gh5(hh5 hh5Var, byte b) {
        this.I = b;
        this.J = hh5Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        hh5 hh5Var = this.J;
        switch (b) {
            case 0:
                hh5Var.d = true;
                hh5Var.f.invoke();
                return wd5Var;
            default:
                y31 y31Var = (y31) obj;
                yr1 yr1Var = hh5Var.b;
                float f = hh5Var.k;
                float f2 = hh5Var.l;
                pn S = y31Var.S();
                long H = S.H();
                S.q().f();
                try {
                    ((ep) S.b).H(f, f2, 0L);
                    yr1Var.a(y31Var);
                    return wd5Var;
                } finally {
                    r7.H(S, H);
                }
        }
    }
}
