package defpackage;

/* loaded from: classes2.dex */
public final class my0 extends n0 implements d0 {
    public final n0 I;
    public final int J;

    public my0(ct ctVar) {
        int i = ctVar.K;
        this.J = i;
        int i2 = ctVar.J;
        if (i2 == 128 && i == 0) {
            this.I = new qo1((x0) x0.J.j(ctVar, false));
            return;
        }
        if (i2 != 128 || i != 1) {
            s83.t("unknown tag: ".concat(wx5.i(i2, i)));
            throw null;
        }
        wx5.f(ctVar);
        y yVar = z0.K;
        u0 v = ctVar.v(false, yVar);
        yVar.c(v);
        this.I = (z0) v;
    }

    public static void m(StringBuilder sb, String str, String str2, String str3) {
        r7.N(sb, "    ", str2, ":", str);
        r7.N(sb, "    ", "    ", str3, str);
    }

    @Override // defpackage.e0
    public final u0 d() {
        return new ct(2, 128, this.J, this.I, (byte) 1);
    }

    public final String toString() {
        String str = ix4.a;
        StringBuilder sb = new StringBuilder();
        sb.append("DistributionPointName: [");
        sb.append(str);
        m(sb, str, this.J == 0 ? "fullName" : "nameRelativeToCRLIssuer", this.I.toString());
        return hf1.z(sb, "]", str);
    }
}
