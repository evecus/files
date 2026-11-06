package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class at implements e0, uy1 {
    public final /* synthetic */ byte I;
    public a1 J;

    public at(a1 a1Var) {
        this.I = (byte) 2;
        this.J = a1Var;
    }

    public static fn0 a(a1 a1Var) {
        pn0 pn0Var = new pn0(a1Var.o(), (byte) 1);
        pn0Var.L = -1;
        try {
            return new fn0(pn0Var, (byte) 1);
        } catch (IllegalArgumentException e) {
            throw new h0("corrupted stream detected", e, (byte) 0);
        }
    }

    @Override // defpackage.e0
    public final u0 d() {
        switch (this.I) {
            case 0:
                try {
                    return new zs(this.J.o());
                } catch (IOException e) {
                    throw k21.W(e.getMessage(), e);
                }
            case 1:
                try {
                    return new bt(this.J.o());
                } catch (IOException e2) {
                    throw new t0(e2.getMessage(), e2);
                }
            case 2:
                try {
                    return a(this.J);
                } catch (IOException e3) {
                    throw new t0("unable to get DER object", e3);
                } catch (IllegalArgumentException e4) {
                    throw new t0("unable to get DER object", e4);
                }
            case 3:
                try {
                    return j();
                } catch (IOException e5) {
                    throw k21.W(e5.getMessage(), e5);
                }
            default:
                try {
                    return j();
                } catch (IOException e6) {
                    throw new t0(e6.getMessage(), e6);
                }
        }
    }

    @Override // defpackage.uy1
    public final u0 j() {
        switch (this.I) {
            case 0:
                return new zs(this.J.o());
            case 1:
                return new bt(this.J.o());
            case 2:
                return a(this.J);
            case 3:
                return bo0.a(this.J.o());
            default:
                f0 o = this.J.o();
                pn0 pn0Var = bo0.a;
                if (o.b < 1) {
                    return bo0.b;
                }
                qn0 qn0Var = new qn0(o);
                qn0Var.M = -1;
                return qn0Var;
        }
    }

    public /* synthetic */ at(byte b) {
        this.I = b;
    }
}
