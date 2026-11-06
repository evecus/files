package defpackage;

/* loaded from: classes2.dex */
public final class ar extends n0 {
    public q0 I;
    public z0 J;

    public static ar m(e0 e0Var) {
        if (e0Var == null || (e0Var instanceof ar)) {
            return (ar) e0Var;
        }
        if (!(e0Var instanceof x0)) {
            s83.t("unknown object in factory: ".concat(e0Var.getClass().getName()));
            return null;
        }
        x0 x0Var = (x0) e0Var;
        ar arVar = new ar();
        arVar.I = (q0) x0Var.y(0);
        arVar.J = (z0) x0Var.y(1);
        return arVar;
    }

    @Override // defpackage.e0
    public final u0 d() {
        return new pn0(this.I, this.J, (byte) 0);
    }
}
