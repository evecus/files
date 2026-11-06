package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gt2 extends k13 implements vq1, w31, pi4, kd3 {
    public b40 I;
    public y45 J;
    public pn3 Q;
    public View R;
    public iu0 S;
    public on3 T;
    public wu0 V;
    public z22 X;
    public iz Y;
    public float K = Float.NaN;
    public boolean L = true;
    public long M = 9205357640488583168L;
    public float N = Float.NaN;
    public float O = Float.NaN;
    public boolean P = true;
    public final jk3 U = new jk3(null, q8.v0);
    public long W = 9205357640488583168L;

    public gt2(b40 b40Var, y45 y45Var, pn3 pn3Var) {
        this.I = b40Var;
        this.J = y45Var;
        this.Q = pn3Var;
    }

    @Override // defpackage.vq1
    public final void O(na3 na3Var) {
        this.U.setValue(na3Var);
    }

    @Override // defpackage.kd3
    public final void U() {
        mu0.P(this, new et2(this, (byte) 0));
    }

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        cj4Var.c(ht2.a, new et2(this, (byte) 1));
    }

    @Override // defpackage.w31
    public final void draw(zh0 zh0Var) {
        ((ya2) zh0Var).a();
        iz izVar = this.Y;
        if (izVar != null) {
            izVar.d(wd5.a);
        }
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return true;
    }

    public final long j0() {
        wu0 wu0Var = this.V;
        if (wu0Var == null) {
            wu0Var = dt4.b(new et2(this, (byte) 2));
            this.V = wu0Var;
        }
        return ((pd3) wu0Var.getValue()).a;
    }

    public final void k0() {
        on3 on3Var = this.T;
        if (on3Var != null) {
            ((qn3) on3Var).b();
        }
        View view = this.R;
        if (view == null) {
            view = vt0.T(this);
        }
        View view2 = view;
        this.R = view2;
        iu0 iu0Var = this.S;
        if (iu0Var == null) {
            iu0Var = ut0.U(this).g0;
        }
        iu0 iu0Var2 = iu0Var;
        this.S = iu0Var2;
        this.T = this.Q.b(view2, this.L, this.M, this.N, this.O, this.P, iu0Var2, this.K);
        m0();
    }

    public final void l0() {
        iu0 iu0Var = this.S;
        if (iu0Var == null) {
            iu0Var = ut0.U(this).g0;
            this.S = iu0Var;
        }
        long j = ((pd3) this.I.invoke(iu0Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & j0()) == 9205357640488583168L) {
            this.W = 9205357640488583168L;
            on3 on3Var = this.T;
            if (on3Var != null) {
                ((qn3) on3Var).b();
                return;
            }
            return;
        }
        this.W = pd3.f(j0(), j);
        if (this.T == null) {
            k0();
        }
        on3 on3Var2 = this.T;
        if (on3Var2 != null) {
            on3Var2.a(this.W, 9205357640488583168L, this.K);
        }
        m0();
    }

    public final void m0() {
        iu0 iu0Var;
        on3 on3Var = this.T;
        if (on3Var == null || (iu0Var = this.S) == null) {
            return;
        }
        qn3 qn3Var = (qn3) on3Var;
        long c = qn3Var.c();
        z22 z22Var = this.X;
        if (r7.O(z22Var) && c == z22Var.a) {
            return;
        }
        y45 y45Var = this.J;
        if (y45Var != null) {
            y45Var.invoke(new v11(iu0Var.k(ut0.b0(qn3Var.c()))));
        }
        this.X = new z22(qn3Var.c());
    }

    @Override // defpackage.k13
    public final void onAttach() {
        U();
        this.Y = qb.g(0, 7, null);
        p70.g0(getCoroutineScope(), null, gl0.L, new ft2(this, null, (byte) 0), 1);
    }

    @Override // defpackage.k13
    public final void onDetach() {
        on3 on3Var = this.T;
        if (on3Var != null) {
            ((qn3) on3Var).b();
        }
        this.T = null;
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }
}
