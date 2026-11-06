package defpackage;

/* loaded from: classes2.dex */
public final class j06 extends n0 {
    public final l0 I;
    public final int J;
    public final int K;
    public final p8 L;

    public j06(x0 x0Var) {
        this.I = l0.v(x0Var.y(0));
        this.J = l0.v(x0Var.y(1)).A();
        this.K = l0.v(x0Var.y(2)).A();
        this.L = p8.m(x0Var.y(3));
    }

    public static j06 m(Object obj) {
        if (obj instanceof j06) {
            return (j06) obj;
        }
        if (obj != null) {
            return new j06(x0.x(obj));
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(4);
        f0Var.a(this.I);
        f0Var.a(l0.D(this.J));
        f0Var.a(l0.D(this.K));
        f0Var.a(this.L);
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
