package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zh extends qa2 {
    public y95 I;
    public t43 J;
    public ai K;
    public bn3 L;
    public bn3 M;
    public long N = 0;
    public long O = 0;
    public final xh P = new xh(this, (byte) 1);
    public final xh Q = new xh(this, (byte) 0);
    public long R = -9223372034707292160L;

    public zh(y95 y95Var, t43 t43Var, ai aiVar) {
        this.I = y95Var;
        this.J = t43Var;
        this.K = aiVar;
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        long j2;
        bn3 u = pw2Var.u(j);
        if (ww2Var.N()) {
            j2 = (u.I << 32) | (u.J & 4294967295L);
        } else {
            y95 y95Var = this.I;
            int i = u.I;
            if (y95Var == null) {
                long j3 = (i << 32) | (u.J & 4294967295L);
                this.R = j3;
                j2 = j3;
            } else {
                long j4 = (u.J & 4294967295L) | (i << 32);
                x95 a = y95Var.a(new yh(this, j4, (byte) 0), null, null, new yh(this, j4, (byte) 1));
                j2 = ((z22) a.getValue()).a;
                this.R = ((z22) a.getValue()).a;
            }
        }
        boolean N = ww2Var.N();
        p91 p91Var = p91.I;
        if (N) {
            this.L = u;
            this.N = j2;
            return ww2Var.A((int) (j2 >> 32), (int) (j2 & 4294967295L), p91Var, this.P);
        }
        this.M = u;
        this.O = j2;
        return ww2Var.A((int) (j2 >> 32), (int) (j2 & 4294967295L), p91Var, this.Q);
    }

    @Override // defpackage.k13
    public final void onReset() {
        super.onReset();
        this.R = -9223372034707292160L;
    }
}
