package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cf3 extends jg3 {
    public static final cf3 c = new cf3(0, 2, 1);

    @Override // defpackage.jg3
    public final void a(mo1 mo1Var, ap apVar, wr4 wr4Var, j34 j34Var, kg3 kg3Var) {
        bo1 bo1Var = (bo1) mo1Var.d(0);
        Object d = mo1Var.d(1);
        if (d instanceof lo1) {
            lo1 lo1Var = (lo1) d;
            j34Var.e.c(lo1Var);
            j34Var.d.d(lo1Var);
        }
        if (wr4Var.n != 0) {
            ke0.a("Can only append a slot if not current inserting");
        }
        int i = wr4Var.i;
        int i2 = wr4Var.j;
        int c2 = wr4Var.c(bo1Var);
        int f = wr4Var.f(wr4Var.q(c2 + 1), wr4Var.b);
        wr4Var.i = f;
        wr4Var.j = f;
        wr4Var.w(1, c2);
        if (i >= f) {
            i++;
            i2++;
        }
        wr4Var.c[f] = d;
        wr4Var.i = i;
        wr4Var.j = i2;
    }
}
