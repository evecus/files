package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pf3 extends jg3 {
    public static final pf3 d;
    public static final pf3 e;
    public static final pf3 f;
    public static final pf3 g;
    public final /* synthetic */ byte c;

    static {
        int i = 1;
        d = new pf3((byte) 0, i, 2);
        int i2 = 1;
        e = new pf3((byte) 1, i2, i2);
        f = new pf3((byte) 2, i, 2);
        int i3 = 1;
        g = new pf3((byte) 3, i3, i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf3(byte b, int i, int i2) {
        super(i, i2);
        this.c = b;
    }

    @Override // defpackage.jg3
    public final void a(mo1 mo1Var, ap apVar, wr4 wr4Var, j34 j34Var, kg3 kg3Var) {
        switch (this.c) {
            case 0:
                Object invoke = ((rm1) mo1Var.d(0)).invoke();
                bo1 bo1Var = (bo1) mo1Var.d(1);
                int c = mo1Var.c(0);
                bo1Var.getClass();
                wr4Var.W(wr4Var.c(bo1Var), invoke);
                apVar.h(c, invoke);
                apVar.b(invoke);
                break;
            case 1:
                bo1 bo1Var2 = (bo1) mo1Var.d(0);
                int c2 = mo1Var.c(0);
                apVar.g();
                bo1Var2.getClass();
                apVar.a(c2, wr4Var.D(wr4Var.c(bo1Var2)));
                break;
            case 2:
                Object d2 = mo1Var.d(0);
                bo1 bo1Var3 = (bo1) mo1Var.d(1);
                int c3 = mo1Var.c(0);
                if (d2 instanceof lo1) {
                    lo1 lo1Var = (lo1) d2;
                    j34Var.e.c(lo1Var);
                    j34Var.d.d(lo1Var);
                }
                Object L = wr4Var.L(wr4Var.c(bo1Var3), c3, d2);
                if (!(L instanceof lo1)) {
                    if (L instanceof x04) {
                        ((x04) L).c();
                        break;
                    }
                } else {
                    j34Var.e((lo1) L);
                    break;
                }
                break;
            default:
                Object d3 = mo1Var.d(0);
                int c4 = mo1Var.c(0);
                if (d3 instanceof lo1) {
                    lo1 lo1Var2 = (lo1) d3;
                    j34Var.e.c(lo1Var2);
                    j34Var.d.d(lo1Var2);
                }
                Object L2 = wr4Var.L(wr4Var.t, c4, d3);
                if (!(L2 instanceof lo1)) {
                    if (L2 instanceof x04) {
                        ((x04) L2).c();
                        break;
                    }
                } else {
                    j34Var.e((lo1) L2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jg3
    public bo1 b(mo1 mo1Var) {
        switch (this.c) {
            case 0:
                return (bo1) mo1Var.d(1);
            case 1:
                return (bo1) mo1Var.d(0);
            default:
                return super.b(mo1Var);
        }
    }
}
