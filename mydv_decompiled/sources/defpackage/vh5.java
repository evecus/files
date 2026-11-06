package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vh5 extends rj3 {
    public final jk3 I = ad4.w(new fq4(0));
    public final jk3 J = ad4.w(Boolean.FALSE);
    public final hh5 K;
    public final jk3 L;
    public float M;
    public c80 N;

    public vh5(yr1 yr1Var) {
        hh5 hh5Var = new hh5(yr1Var);
        hh5Var.f = new q94(this, (byte) 10);
        this.K = hh5Var;
        this.L = new jk3(wd5.a, q8.v0);
        this.M = 1.0f;
    }

    @Override // defpackage.rj3
    public final boolean applyAlpha(float f) {
        this.M = f;
        return true;
    }

    @Override // defpackage.rj3
    public final boolean applyColorFilter(c80 c80Var) {
        this.N = c80Var;
        return true;
    }

    @Override // defpackage.rj3
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo43getIntrinsicSizeNHjbRc() {
        return ((fq4) this.I.getValue()).a;
    }

    @Override // defpackage.rj3
    public final void onDraw(y31 y31Var) {
        c80 c80Var = this.N;
        hh5 hh5Var = this.K;
        if (c80Var == null) {
            c80Var = (c80) hh5Var.g.getValue();
        }
        if (((Boolean) this.J.getValue()).booleanValue() && y31Var.getLayoutDirection() == da2.J) {
            long Y = y31Var.Y();
            pn S = y31Var.S();
            long H = S.H();
            S.q().f();
            try {
                ((ep) S.b).H(-1.0f, 1.0f, Y);
                hh5Var.e(y31Var, this.M, c80Var);
            } finally {
                r7.H(S, H);
            }
        } else {
            hh5Var.e(y31Var, this.M, c80Var);
        }
        this.L.getValue();
    }
}
