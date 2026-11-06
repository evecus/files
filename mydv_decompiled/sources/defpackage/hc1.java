package defpackage;

/* loaded from: classes2.dex */
public final class hc1 extends n0 {
    public static final q0 L;
    public static final q0 M;
    public static final q0 N;
    public static final q0 O;
    public q0 I;
    public boolean J;
    public r0 K;

    static {
        new q0("2.5.29.9").A();
        new q0("2.5.29.14").A();
        new q0("2.5.29.15").A();
        new q0("2.5.29.16").A();
        new q0("2.5.29.17").A();
        new q0("2.5.29.18").A();
        new q0("2.5.29.19").A();
        new q0("2.5.29.20").A();
        new q0("2.5.29.21").A();
        new q0("2.5.29.23").A();
        new q0("2.5.29.24").A();
        new q0("2.5.29.27").A();
        L = new q0("2.5.29.28").A();
        new q0("2.5.29.29").A();
        new q0("2.5.29.30").A();
        new q0("2.5.29.31").A();
        new q0("2.5.29.32").A();
        new q0("2.5.29.33").A();
        new q0("2.5.29.35").A();
        new q0("2.5.29.36").A();
        new q0("2.5.29.37").A();
        new q0("2.5.29.46").A();
        new q0("2.5.29.54").A();
        new q0("1.3.6.1.5.5.7.1.1").A();
        new q0("1.3.6.1.5.5.7.1.11").A();
        new q0("1.3.6.1.5.5.7.1.12").A();
        new q0("1.3.6.1.5.5.7.1.2").A();
        new q0("1.3.6.1.5.5.7.1.3").A();
        new q0("1.3.6.1.5.5.7.1.4").A();
        new q0("2.5.29.56").A();
        q0 q0Var = wz5.a;
        new q0("2.5.29.55").A();
        new q0("2.5.29.60").A();
        M = new q0("2.5.29.72").A();
        N = pt1.q("2.5.29.73");
        O = pt1.q("2.5.29.74");
        new q0("2.16.840.1.114027.80.6.1");
    }

    @Override // defpackage.e0
    public final u0 d() {
        f0 f0Var = new f0(3);
        f0Var.a(this.I);
        if (this.J) {
            f0Var.a(c0.L);
        }
        f0Var.a(this.K);
        pn0 pn0Var = new pn0(f0Var, (byte) 0);
        pn0Var.L = -1;
        return pn0Var;
    }

    @Override // defpackage.n0
    public final boolean equals(Object obj) {
        if (!(obj instanceof hc1)) {
            return false;
        }
        hc1 hc1Var = (hc1) obj;
        return hc1Var.I.r(this.I) && hc1Var.K.r(this.K) && hc1Var.J == this.J;
    }

    @Override // defpackage.n0
    public final int hashCode() {
        q0 q0Var = this.I;
        boolean z = this.J;
        r0 r0Var = this.K;
        return z ? g4.N(r0Var.I) ^ g4.N(q0Var.I) : ~(g4.N(r0Var.I) ^ g4.N(q0Var.I));
    }
}
