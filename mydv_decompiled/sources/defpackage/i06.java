package defpackage;

/* loaded from: classes2.dex */
public final class i06 extends n0 {
    public final l0 I;
    public final int J;
    public final p8 K;

    public i06(x0 x0Var) {
        this.I = l0.v(x0Var.y(0));
        this.J = l0.v(x0Var.y(1)).A();
        this.K = p8.m(x0Var.y(2));
    }

    public static i06 m(Object obj) {
        if (obj instanceof i06) {
            return (i06) obj;
        }
        if (obj != null) {
            return new i06(x0.x(obj));
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0();
        f0Var.a(this.I);
        f0Var.a(l0.D(this.J));
        f0Var.a(this.K);
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
