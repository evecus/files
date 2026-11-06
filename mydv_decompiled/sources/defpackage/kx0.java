package defpackage;

/* loaded from: classes2.dex */
public final class kx0 extends n0 implements d0, b1 {
    public b1 I;

    public static kx0 m(ct ctVar) {
        n0 x = ctVar.x();
        if (x == null || (x instanceof kx0)) {
            return (kx0) x;
        }
        if (x instanceof rn0) {
            kx0 kx0Var = new kx0();
            kx0Var.I = (rn0) x;
            return kx0Var;
        }
        if (x instanceof on0) {
            kx0 kx0Var2 = new kx0();
            kx0Var2.I = (on0) x;
            return kx0Var2;
        }
        if (x instanceof tn0) {
            kx0 kx0Var3 = new kx0();
            kx0Var3.I = (tn0) x;
            return kx0Var3;
        }
        if (x instanceof sn0) {
            kx0 kx0Var4 = new kx0();
            kx0Var4.I = (sn0) x;
            return kx0Var4;
        }
        if (!(x instanceof cn0)) {
            s83.t("illegal object in getInstance: ".concat(x.getClass().getName()));
            return null;
        }
        kx0 kx0Var5 = new kx0();
        kx0Var5.I = (cn0) x;
        return kx0Var5;
    }

    @Override // defpackage.e0
    public final u0 d() {
        return ((e0) this.I).d();
    }

    @Override // defpackage.b1
    public final String e() {
        return this.I.e();
    }

    public final String toString() {
        return this.I.e();
    }
}
