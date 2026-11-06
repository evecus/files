package defpackage;

/* loaded from: classes2.dex */
public final class p8 extends n0 {
    public q0 I;
    public e0 J;

    public p8(q0 q0Var, e0 e0Var) {
        this.I = q0Var;
        this.J = e0Var;
    }

    public static p8 m(Object obj) {
        if (obj instanceof p8) {
            return (p8) obj;
        }
        if (obj != null) {
            x0 x = x0.x(obj);
            p8 p8Var = new p8();
            if (x.size() >= 1 && x.size() <= 2) {
                p8Var.I = q0.z(x.y(0));
                if (x.size() == 2) {
                    p8Var.J = x.y(1);
                    return p8Var;
                }
                p8Var.J = null;
                return p8Var;
            }
            hn3.g(x.size(), "Bad sequence size: ");
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(2);
        f0Var.a(this.I);
        e0 e0Var = this.J;
        if (e0Var != null) {
            f0Var.a(e0Var);
        }
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
