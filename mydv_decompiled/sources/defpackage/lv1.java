package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class lv1 extends k13 implements la5, vp3, ye0 {
    public w11 I;
    public ge J;
    public boolean K;

    public lv1(ge geVar, w11 w11Var) {
        this.I = w11Var;
        this.J = geVar;
    }

    @Override // defpackage.vp3
    public final boolean a0() {
        return false;
    }

    @Override // defpackage.vp3
    public final void e0() {
        n0();
    }

    @Override // defpackage.vp3
    public final long h() {
        if (this.I == null) {
            return c95.a;
        }
        iu0 iu0Var = ut0.U(this).g0;
        int i = c95.b;
        return fb4.M(iu0Var.X(10.0f), iu0Var.X(40.0f), iu0Var.X(10.0f), iu0Var.X(40.0f));
    }

    public final void j0() {
        ge geVar;
        r24 r24Var = new r24();
        ad4.D(this, new m90(r24Var));
        lv1 lv1Var = (lv1) r24Var.I;
        if (lv1Var == null || (geVar = lv1Var.J) == null) {
            geVar = this.J;
        }
        k0(geVar);
    }

    public void k0(pp3 pp3Var) {
        qp3 qp3Var = (qp3) j42.r(this, hf0.w);
        if (qp3Var != null) {
            ((ya) qp3Var).a = pp3Var;
        }
    }

    public final void l0() {
        n24 n24Var = new n24();
        n24Var.I = true;
        ad4.F(this, new z11(n24Var));
        if (n24Var.I) {
            j0();
        }
    }

    public boolean m0(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    public final void n0() {
        if (this.K) {
            this.K = false;
            if (isAttached()) {
                r24 r24Var = new r24();
                ad4.D(this, new ga(r24Var, (byte) 2));
                lv1 lv1Var = (lv1) r24Var.I;
                if (lv1Var != null) {
                    lv1Var.j0();
                } else {
                    k0(null);
                }
            }
        }
    }

    @Override // defpackage.k13
    public final void onDensityChange() {
        n0();
    }

    @Override // defpackage.k13
    public final void onDetach() {
        n0();
        super.onDetach();
    }

    @Override // defpackage.vp3
    public final void p(kp3 kp3Var, lp3 lp3Var, long j) {
        if (lp3Var == lp3.J) {
            List list = kp3Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (m0(((rp3) list.get(i)).i)) {
                    int i2 = kp3Var.f;
                    if (i2 == 4) {
                        this.K = true;
                        l0();
                        return;
                    } else {
                        if (i2 == 5) {
                            n0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.vp3
    public final void y() {
        n0();
    }

    @Override // defpackage.vp3
    public final void D() {
    }
}
