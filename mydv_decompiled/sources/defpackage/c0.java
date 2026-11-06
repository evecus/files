package defpackage;

/* loaded from: classes2.dex */
public final class c0 extends u0 {
    public static final y J = new y(c0.class, (byte) 2);
    public static final c0 K = new c0((byte) 0);
    public static final c0 L = new c0((byte) -1);
    public final byte I;

    public c0(byte b) {
        this.I = b;
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return v() ? 1 : 0;
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        return (u0Var instanceof c0) && v() == ((c0) u0Var).v();
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.U(1, z);
        uu2Var.N(1);
        uu2Var.K(this.I);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return false;
    }

    @Override // defpackage.u0
    public final u0 t() {
        return v() ? L : K;
    }

    public final String toString() {
        return v() ? "TRUE" : "FALSE";
    }

    public final boolean v() {
        return this.I != 0;
    }
}
