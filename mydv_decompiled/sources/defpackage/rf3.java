package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rf3 extends jg3 {
    public static final rf3 c = new rf3(0, 3, 1);

    @Override // defpackage.jg3
    public final void a(mo1 mo1Var, ap apVar, wr4 wr4Var, j34 j34Var, kg3 kg3Var) {
        g12 e;
        tr4 tr4Var = (tr4) mo1Var.d(1);
        bo1 bo1Var = (bo1) mo1Var.d(0);
        ff1 ff1Var = (ff1) mo1Var.d(2);
        wr4 j = tr4Var.j();
        if (kg3Var != null) {
            try {
                e = jl2.e(kg3Var, wr4Var);
            } catch (Throwable th) {
                j.e(false);
                throw th;
            }
        } else {
            e = null;
        }
        if (!ff1Var.e.h0()) {
            ke0.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        ff1Var.d.g0(apVar, j, j34Var, e);
        j.e(true);
        wr4Var.d();
        bo1Var.getClass();
        wr4Var.z(tr4Var, tr4Var.c(bo1Var));
        wr4Var.j();
    }
}
