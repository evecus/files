package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class b04 extends n0 {
    public BigInteger I;
    public BigInteger J;
    public BigInteger K;
    public BigInteger L;
    public BigInteger M;
    public BigInteger N;
    public BigInteger O;
    public BigInteger P;
    public BigInteger Q;
    public x0 R;

    public static b04 m(u0 u0Var) {
        if (u0Var != null) {
            x0 x = x0.x(u0Var);
            b04 b04Var = new b04();
            b04Var.R = null;
            Enumeration z = x.z();
            l0 l0Var = (l0) z.nextElement();
            int A = l0Var.A();
            if (A >= 0 && A <= 1) {
                b04Var.I = l0Var.x();
                b04Var.J = ((l0) z.nextElement()).x();
                b04Var.K = ((l0) z.nextElement()).x();
                b04Var.L = ((l0) z.nextElement()).x();
                b04Var.M = ((l0) z.nextElement()).x();
                b04Var.N = ((l0) z.nextElement()).x();
                b04Var.O = ((l0) z.nextElement()).x();
                b04Var.P = ((l0) z.nextElement()).x();
                b04Var.Q = ((l0) z.nextElement()).x();
                if (z.hasMoreElements()) {
                    b04Var.R = (x0) z.nextElement();
                }
                return b04Var;
            }
            s83.t("wrong version for RSA private key");
        }
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(10);
        f0Var.a(new l0(this.I));
        f0Var.a(new l0(this.J));
        f0Var.a(new l0(this.K));
        f0Var.a(new l0(this.L));
        f0Var.a(new l0(this.M));
        f0Var.a(new l0(this.N));
        f0Var.a(new l0(this.O));
        f0Var.a(new l0(this.P));
        f0Var.a(new l0(this.Q));
        x0 x0Var = this.R;
        if (x0Var != null) {
            f0Var.a(x0Var);
        }
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
