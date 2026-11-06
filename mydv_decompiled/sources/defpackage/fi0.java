package defpackage;

/* loaded from: classes2.dex */
public final class fi0 extends n0 {
    public final q0 I;
    public final n0 J;
    public final boolean K;

    public fi0(x0 x0Var) {
        int size = x0Var.size();
        n0 n0Var = null;
        if (size < 1 || size > 2) {
            s83.t(hf1.u(size, "Bad sequence size: "));
            throw null;
        }
        this.I = q0.z(x0Var.y(0));
        if (size > 1) {
            e0 y = x0Var.y(1);
            if (y == null) {
                zy.m("'obj' cannot be null");
                throw null;
            }
            ct y2 = ct.y(y);
            wx5.f(y2);
            if (!y2.z() || y2.K != 0) {
                s83.t("Bad tag for 'content'");
                throw null;
            }
            n0Var = y2.x();
        }
        this.J = n0Var;
        this.K = !(x0Var instanceof zs);
    }

    @Override // defpackage.e0
    public final u0 d() {
        q0 q0Var = this.I;
        boolean z = this.K;
        n0 n0Var = this.J;
        if (!z) {
            return n0Var == null ? new zs(q0Var) : new zs(q0Var, new ct(true, 0, (e0) n0Var, (byte) 0));
        }
        if (n0Var == null) {
            return new pn0(q0Var, (byte) 1);
        }
        pn0 pn0Var = new pn0(q0Var, new ct(true, 0, (e0) n0Var, (byte) 2), (byte) 1);
        pn0Var.L = -1;
        return pn0Var;
    }
}
