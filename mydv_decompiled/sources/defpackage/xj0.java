package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xj0 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ oh2 J;

    public /* synthetic */ xj0(oh2 oh2Var, byte b) {
        this.I = b;
        this.J = oh2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        oh2 oh2Var = this.J;
        switch (b) {
            case 0:
                ca2 ca2Var = (ca2) obj;
                v55 d = oh2Var.d();
                if (d != null) {
                    d.c = ca2Var;
                }
                return wd5Var;
            case 1:
                jk3 jk3Var = oh2Var.t;
                d55 d55Var = (d55) obj;
                String str = d55Var.a.J;
                oj ojVar = oh2Var.j;
                if (!j42.c(str, ojVar != null ? ojVar.J : null)) {
                    oh2Var.k.setValue(ks1.I);
                    if (((Boolean) jk3Var.getValue()).booleanValue()) {
                        jk3Var.setValue(Boolean.FALSE);
                    } else {
                        oh2Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = d65.b;
                oh2Var.f(j);
                oh2Var.e(j);
                oh2Var.u.invoke(d55Var);
                x04 x04Var = oh2Var.b;
                y04 y04Var = x04Var.a;
                if (y04Var != null) {
                    y04Var.c(x04Var, null);
                }
                return wd5Var;
            case 2:
                oh2Var.r.b(((lx1) obj).a);
                return wd5Var;
            case 3:
                return Boolean.valueOf(oh2Var.r.b(((lx1) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                oh2Var.q.setValue(bool);
                return wd5Var;
        }
    }
}
