package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ao implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;

    public /* synthetic */ ao(hu2 hu2Var, byte b) {
        this.I = b;
        this.J = hu2Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        ab4 ab4Var = ab4.Q;
        ab4 ab4Var2 = ab4.P;
        g83 g83Var = g83.a;
        wd5 wd5Var = wd5.a;
        hu2 hu2Var = this.J;
        switch (b) {
            case 0:
                if (!hu2Var.t()) {
                    hu2Var.u();
                    break;
                }
                break;
            case 1:
                hu2Var.v(ab4Var);
                break;
            case 2:
                hu2Var.m.r(false);
                break;
            case 3:
                hu2Var.n.F();
                break;
            case 4:
                hu2Var.n.F();
                break;
            case 5:
                fw4 fw4Var = hu2Var.n.C;
                Boolean bool = Boolean.FALSE;
                fw4Var.getClass();
                fw4Var.i(null, bool);
                break;
            case 6:
                hu2Var.n.s();
                break;
            case 7:
                fw4 fw4Var2 = hu2Var.n.r;
                Boolean bool2 = Boolean.FALSE;
                fw4Var2.getClass();
                fw4Var2.i(null, bool2);
                break;
            case 8:
                hu2Var.n.E();
                break;
            case 9:
                hu2Var.q(g83Var);
                break;
            case 10:
                hu2Var.q(g83Var);
                break;
            case 11:
                hu2Var.p.L(true);
                break;
            case 12:
                hu2Var.p.K(true);
                break;
            case 13:
                fw4 fw4Var3 = hu2Var.p.k;
                if (((gu3) fw4Var3.getValue()).b) {
                    fw4Var3.i(null, gu3.a((gu3) fw4Var3.getValue(), 5));
                    break;
                }
                break;
            case 14:
                hu2Var.v(ab4Var);
                break;
            case 15:
                hu2Var.p.M(true);
                break;
            case 16:
                hu2Var.p.L(true);
                break;
            case 17:
                hu2Var.p.K(true);
                break;
            case 18:
                hu2Var.q(g83Var);
                break;
            case 19:
                hu2Var.p.F(true);
                break;
            case 20:
                hu2Var.p.I(true);
                break;
            case 21:
                hu2Var.p.E(true);
                break;
            case 22:
                hu2Var.v(ab4Var2);
                break;
            case 23:
                hu2Var.q(g83Var);
                break;
            case 24:
                hu2Var.o.r();
                break;
            case 25:
                hu2Var.o.r();
                break;
            case 26:
                hu2Var.o.r();
                break;
            case 27:
                tc4 tc4Var = hu2Var.o.f;
                fw4 fw4Var4 = tc4Var.b;
                if (!((List) fw4Var4.getValue()).isEmpty()) {
                    fw4Var4.i(null, o91.I);
                    tc4Var.a.edit().remove("history").apply();
                    break;
                }
                break;
            default:
                hu2Var.v(ab4Var2);
                break;
        }
        return wd5Var;
    }
}
