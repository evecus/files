package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vy4 {
    public final yy4 a;
    public kb2 b;
    public final sy4 c;
    public final sy4 d;
    public final sy4 e;

    /* JADX WARN: Type inference failed for: r2v1, types: [sy4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [sy4] */
    /* JADX WARN: Type inference failed for: r2v3, types: [sy4] */
    public vy4(yy4 yy4Var) {
        this.a = yy4Var;
        final byte b = 0;
        this.c = new hn1(this) { // from class: sy4
            public final /* synthetic */ vy4 J;

            {
                this.J = this;
            }

            @Override // defpackage.hn1
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                wd5 wd5Var = wd5.a;
                vy4 vy4Var = this.J;
                switch (b2) {
                    case 0:
                        yy4 yy4Var2 = vy4Var.a;
                        wa2 wa2Var = (wa2) obj;
                        kb2 kb2Var = wa2Var.p0;
                        if (kb2Var == null) {
                            kb2Var = new kb2(wa2Var, yy4Var2);
                            wa2Var.p0 = kb2Var;
                        }
                        vy4Var.b = kb2Var;
                        vy4Var.a().h();
                        kb2 a = vy4Var.a();
                        if (a.K != yy4Var2) {
                            a.K = yy4Var2;
                            a.j(false);
                            wa2.Y(a.I, false, 7);
                            break;
                        }
                        break;
                    case 1:
                        vy4Var.a().J = (re0) obj2;
                        break;
                    default:
                        kb2 a2 = vy4Var.a();
                        ((wa2) obj).f0(new hb2(a2, (hn1) obj2, a2.X));
                        break;
                }
                return wd5Var;
            }
        };
        final byte b2 = 1;
        this.d = new hn1(this) { // from class: sy4
            public final /* synthetic */ vy4 J;

            {
                this.J = this;
            }

            @Override // defpackage.hn1
            public final Object invoke(Object obj, Object obj2) {
                byte b22 = b2;
                wd5 wd5Var = wd5.a;
                vy4 vy4Var = this.J;
                switch (b22) {
                    case 0:
                        yy4 yy4Var2 = vy4Var.a;
                        wa2 wa2Var = (wa2) obj;
                        kb2 kb2Var = wa2Var.p0;
                        if (kb2Var == null) {
                            kb2Var = new kb2(wa2Var, yy4Var2);
                            wa2Var.p0 = kb2Var;
                        }
                        vy4Var.b = kb2Var;
                        vy4Var.a().h();
                        kb2 a = vy4Var.a();
                        if (a.K != yy4Var2) {
                            a.K = yy4Var2;
                            a.j(false);
                            wa2.Y(a.I, false, 7);
                            break;
                        }
                        break;
                    case 1:
                        vy4Var.a().J = (re0) obj2;
                        break;
                    default:
                        kb2 a2 = vy4Var.a();
                        ((wa2) obj).f0(new hb2(a2, (hn1) obj2, a2.X));
                        break;
                }
                return wd5Var;
            }
        };
        final byte b3 = 2;
        this.e = new hn1(this) { // from class: sy4
            public final /* synthetic */ vy4 J;

            {
                this.J = this;
            }

            @Override // defpackage.hn1
            public final Object invoke(Object obj, Object obj2) {
                byte b22 = b3;
                wd5 wd5Var = wd5.a;
                vy4 vy4Var = this.J;
                switch (b22) {
                    case 0:
                        yy4 yy4Var2 = vy4Var.a;
                        wa2 wa2Var = (wa2) obj;
                        kb2 kb2Var = wa2Var.p0;
                        if (kb2Var == null) {
                            kb2Var = new kb2(wa2Var, yy4Var2);
                            wa2Var.p0 = kb2Var;
                        }
                        vy4Var.b = kb2Var;
                        vy4Var.a().h();
                        kb2 a = vy4Var.a();
                        if (a.K != yy4Var2) {
                            a.K = yy4Var2;
                            a.j(false);
                            wa2.Y(a.I, false, 7);
                            break;
                        }
                        break;
                    case 1:
                        vy4Var.a().J = (re0) obj2;
                        break;
                    default:
                        kb2 a2 = vy4Var.a();
                        ((wa2) obj).f0(new hb2(a2, (hn1) obj2, a2.X));
                        break;
                }
                return wd5Var;
            }
        };
    }

    public final kb2 a() {
        kb2 kb2Var = this.b;
        if (kb2Var != null) {
            return kb2Var;
        }
        s83.t("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
