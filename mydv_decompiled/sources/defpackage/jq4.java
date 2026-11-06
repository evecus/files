package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jq4 extends qa2 {
    public qb5 I;
    public boolean L;
    public long J = -9223372034707292160L;
    public long K = eh0.b(0, 0, 0, 0, 15);
    public final jk3 M = ad4.w(null);

    public jq4(qb5 qb5Var) {
        this.I = qb5Var;
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        bn3 u;
        char c;
        long j2;
        hq4 hq4Var;
        long d;
        hq4 hq4Var2;
        if (ww2Var.N()) {
            this.K = j;
            this.L = true;
            u = pw2Var.u(j);
        } else {
            u = pw2Var.u(this.L ? this.K : j);
        }
        bn3 bn3Var = u;
        long j3 = (bn3Var.J & 4294967295L) | (bn3Var.I << 32);
        if (ww2Var.N()) {
            this.J = j3;
            c = ' ';
            d = j3;
            j2 = d;
        } else {
            long j4 = !z22.b(this.J, -9223372034707292160L) ? this.J : j3;
            jk3 jk3Var = this.M;
            hq4 hq4Var3 = (hq4) jk3Var.getValue();
            if (hq4Var3 != null) {
                bh bhVar = hq4Var3.a;
                c = ' ';
                j2 = j3;
                boolean z = (z22.b(j4, ((z22) bhVar.d()).a) || ((Boolean) bhVar.d.getValue()).booleanValue()) ? false : true;
                if (!z22.b(j4, ((z22) bhVar.e.getValue()).a) || z) {
                    hq4Var3.b = ((z22) bhVar.d()).a;
                    hq4Var2 = hq4Var3;
                    p70.g0(getCoroutineScope(), null, null, new o31(hq4Var2, j4, this, null), 3);
                } else {
                    hq4Var2 = hq4Var3;
                }
                hq4Var = hq4Var2;
            } else {
                long j5 = j4;
                c = ' ';
                j2 = j3;
                hq4Var = new hq4(new bh(new z22(j5), p70.M, new z22(4294967297L), 8), j5);
            }
            jk3Var.setValue(hq4Var);
            d = eh0.d(j, ((z22) hq4Var.a.d()).a);
        }
        int i = (int) (d >> c);
        int i2 = (int) (d & 4294967295L);
        return ww2Var.A(i, i2, p91.I, new iq4(this, j2, i, i2, ww2Var, bn3Var));
    }

    @Override // defpackage.k13
    public final void onAttach() {
        super.onAttach();
        this.J = -9223372034707292160L;
        this.L = false;
    }

    @Override // defpackage.k13
    public final void onReset() {
        super.onReset();
        this.M.setValue(null);
    }
}
