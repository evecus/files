package defpackage;

/* loaded from: classes2.dex */
public final class j52 extends n0 {
    public my0 I;
    public boolean J;
    public boolean K;
    public u04 L;
    public boolean M;
    public boolean N;
    public x0 O;

    public static void m(StringBuilder sb, String str, String str2, String str3) {
        r7.N(sb, "    ", str2, ":", str);
        r7.N(sb, "    ", "    ", str3, str);
    }

    @Override // defpackage.e0
    public final u0 d() {
        return this.O;
    }

    public final String toString() {
        String str = ix4.a;
        StringBuilder sb = new StringBuilder();
        sb.append("IssuingDistributionPoint: [");
        sb.append(str);
        my0 my0Var = this.I;
        if (my0Var != null) {
            m(sb, str, "distributionPoint", my0Var.toString());
        }
        boolean z = this.J;
        if (z) {
            m(sb, str, "onlyContainsUserCerts", z ? "true" : "false");
        }
        boolean z2 = this.K;
        if (z2) {
            m(sb, str, "onlyContainsCACerts", z2 ? "true" : "false");
        }
        u04 u04Var = this.L;
        if (u04Var != null) {
            m(sb, str, "onlySomeReasons", u04Var.e());
        }
        boolean z3 = this.N;
        if (z3) {
            m(sb, str, "onlyContainsAttributeCerts", z3 ? "true" : "false");
        }
        boolean z4 = this.M;
        if (z4) {
            m(sb, str, "indirectCRL", z4 ? "true" : "false");
        }
        return hf1.z(sb, "]", str);
    }
}
