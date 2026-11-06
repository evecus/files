package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ly extends k13 implements zx, y92 {
    public hy I;
    public boolean J;

    public ly(hy hyVar) {
        this.I = hyVar;
    }

    public static final m14 j0(ly lyVar, na3 na3Var, k9 k9Var) {
        m14 m14Var;
        if (lyVar.isAttached() && lyVar.J) {
            na3 T = ut0.T(lyVar);
            if (!na3Var.h()) {
                na3Var = null;
            }
            if (na3Var != null && (m14Var = (m14) k9Var.invoke()) != null) {
                return m14Var.i(T.J(na3Var, false).d());
            }
        }
        return null;
    }

    @Override // defpackage.zx
    public final Object d0(na3 na3Var, k9 k9Var, gj0 gj0Var) {
        Object o0 = i42.o0(new j(this, na3Var, k9Var, new ls(this, na3Var, k9Var, (byte) 1), null), gj0Var);
        return o0 == el0.I ? o0 : wd5.a;
    }

    @Override // defpackage.y92
    public final void f(ca2 ca2Var) {
        this.J = true;
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.cx2
    public final void i(long j) {
    }
}
