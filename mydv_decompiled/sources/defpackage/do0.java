package defpackage;

/* loaded from: classes2.dex */
public final class do0 extends dt {
    public final boolean L;

    public do0(int i, int i2, boolean z, a1 a1Var) {
        super(i, i2, a1Var);
        this.L = z;
    }

    @Override // defpackage.dt, defpackage.uy1
    public final u0 j() {
        boolean z = this.L;
        int i = 4;
        a1 a1Var = this.K;
        int i2 = this.I;
        int i3 = this.J;
        if (!z) {
            return new ct(i, i2, i3, new mn0(((nt0) ((jj2) a1Var.e)).t()), (byte) 2);
        }
        f0 o = a1Var.o();
        if (o.b != 1) {
            return new ct(i, i2, i3, bo0.a(o), (byte) 2);
        }
        return new ct(3, i2, i3, o.c(0), (byte) 2);
    }
}
