package defpackage;

/* loaded from: classes2.dex */
public final class ah5 extends n0 {
    public final m75 I;
    public final m75 J;

    public ah5(x0 x0Var) {
        int size = x0Var.size();
        if (size != 2) {
            s83.t(hf1.u(size, "Bad sequence size: "));
            throw null;
        }
        this.I = m75.m(x0Var.y(0));
        this.J = m75.m(x0Var.y(1));
    }

    @Override // defpackage.e0
    public final u0 d() {
        return new pn0(this.I, this.J, (byte) 0);
    }
}
