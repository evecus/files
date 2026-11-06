package defpackage;

/* loaded from: classes2.dex */
public final class j15 extends n0 {
    public x0 I;
    public l0 J;
    public l0 K;
    public p8 L;
    public sz5 M;
    public ah5 N;
    public sz5 O;
    public zy4 P;
    public a0 Q;
    public a0 R;
    public xc1 S;

    public static void m(String str) {
        throw new IllegalArgumentException(str);
    }

    @Override // defpackage.e0
    public final u0 d() {
        if (this.I != null) {
            if (ox3.b("org.bouncycastle.x509.allow_non-der_tbscert") == null) {
                return this.I;
            }
            if (ox3.c("org.bouncycastle.x509.allow_non-der_tbscert")) {
                return this.I;
            }
        }
        f0 f0Var = new f0(10);
        if (!this.J.y(0)) {
            f0Var.a(new ct(true, 0, (e0) this.J, (byte) 1));
        }
        f0Var.a(this.K);
        f0Var.a(this.L);
        f0Var.a(this.M);
        f0Var.a(this.N);
        f0Var.a(this.O);
        f0Var.a(this.P);
        a0 a0Var = this.Q;
        if (a0Var != null) {
            f0Var.a(new ct(2, 128, 1, a0Var, (byte) 1));
        }
        a0 a0Var2 = this.R;
        if (a0Var2 != null) {
            f0Var.a(new ct(2, 128, 2, a0Var2, (byte) 1));
        }
        xc1 xc1Var = this.S;
        if (xc1Var != null) {
            f0Var.a(new ct(true, 3, (e0) xc1Var, (byte) 1));
        }
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }
}
