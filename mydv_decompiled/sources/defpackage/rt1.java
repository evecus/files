package defpackage;

/* loaded from: classes2.dex */
public final class rt1 extends n0 {
    public i52 I;
    public qo1 J;
    public bd3 K;
    public boolean L;

    @Override // defpackage.e0
    public final u0 d() {
        qo1 qo1Var = this.J;
        i52 i52Var = this.I;
        if (!this.L) {
            return qo1Var != null ? new ct(true, 1, (e0) qo1Var, (byte) 1) : new ct(true, 0, (e0) i52Var, (byte) 1);
        }
        f0 f0Var = new f0(3);
        if (i52Var != null) {
            f0Var.a(new ct(2, 128, 0, i52Var, (byte) 1));
        }
        if (qo1Var != null) {
            f0Var.a(new ct(2, 128, 1, qo1Var, (byte) 1));
        }
        bd3 bd3Var = this.K;
        if (bd3Var != null) {
            f0Var.a(new ct(2, 128, 2, bd3Var, (byte) 1));
        }
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
