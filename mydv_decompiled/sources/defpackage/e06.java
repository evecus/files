package defpackage;

/* loaded from: classes2.dex */
public final class e06 extends n0 implements f06 {
    public q0 I = f06.g;
    public u0 J;

    public e06(int i, int i2, int i3, int i4) {
        e0 e0Var;
        f0 f0Var = new f0(3);
        f0Var.a(l0.D(i));
        if (i3 == 0) {
            if (i4 != 0) {
                s83.t("inconsistent k values");
                throw null;
            }
            f0Var.a(f06.h);
            e0Var = l0.D(i2);
        } else {
            if (i3 <= i2 || i4 <= i3) {
                s83.t("inconsistent k values");
                throw null;
            }
            f0Var.a(f06.i);
            f0 f0Var2 = new f0(3);
            f0Var2.a(l0.D(i2));
            f0Var2.a(l0.D(i3));
            f0Var2.a(l0.D(i4));
            pn0 pn0Var = new pn0(f0Var2, (byte) 0);
            pn0Var.L = -1;
            e0Var = pn0Var;
        }
        f0Var.a(e0Var);
        pn0 pn0Var2 = new pn0(f0Var, (byte) 0);
        pn0Var2.L = -1;
        this.J = pn0Var2;
    }

    @Override // defpackage.e0
    public final u0 d() {
        return new pn0(this.I, this.J, (byte) 0);
    }
}
