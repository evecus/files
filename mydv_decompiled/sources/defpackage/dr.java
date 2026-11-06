package defpackage;

/* loaded from: classes2.dex */
public final class dr extends n0 {
    public q0 I;
    public e0 J;

    public static dr m(e0 e0Var) {
        if (e0Var instanceof dr) {
            return (dr) e0Var;
        }
        if (e0Var == null) {
            s83.t("null value in getInstance()");
            return null;
        }
        x0 x = x0.x(e0Var);
        dr drVar = new dr();
        drVar.I = (q0) x.y(0);
        drVar.J = x.y(1);
        return drVar;
    }

    @Override // defpackage.e0
    public final u0 d() {
        return new pn0(this.I, this.J, (byte) 0);
    }
}
