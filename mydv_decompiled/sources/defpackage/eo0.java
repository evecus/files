package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class eo0 extends n0 {
    public l0 I;
    public l0 J;
    public l0 K;

    public eo0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.I = new l0(bigInteger);
        this.J = new l0(bigInteger2);
        this.K = new l0(bigInteger3);
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(3);
        f0Var.a(this.I);
        f0Var.a(this.J);
        f0Var.a(this.K);
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
