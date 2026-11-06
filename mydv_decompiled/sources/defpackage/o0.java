package defpackage;

/* loaded from: classes2.dex */
public final class o0 extends u0 {
    public static final y J = new y(o0.class, (byte) 12);
    public final in0 I;

    public o0(in0 in0Var) {
        this.I = in0Var;
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return ~g4.N(this.I.I);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (u0Var instanceof o0) {
            return this.I.m(((o0) u0Var).I);
        }
        return false;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.U(7, z);
        uu2Var.P(this.I.I, 25, false);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return false;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        return this.I.q(z);
    }

    @Override // defpackage.u0
    public final u0 t() {
        return this;
    }

    @Override // defpackage.u0
    public final u0 u() {
        return this;
    }
}
