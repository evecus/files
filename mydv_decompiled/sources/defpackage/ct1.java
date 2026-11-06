package defpackage;

import androidx.media3.common.util.Log;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ct1 extends k13 implements ye0, na2, kd3 {
    public m65 I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public m65 O;
    public jc5 P;

    @Override // defpackage.kd3
    public final void U() {
        if (this.P != null) {
            mu0.P(this, new bt1(this, (byte) 1));
        }
        this.L = true;
        ut0.U(this).H();
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void j0(ww2 ww2Var, m65 m65Var, kj1 kj1Var) {
        s55 s55Var = u35.b(m65Var, ww2Var, kj1Var, 3, true).d;
        float h = s55Var.h(0);
        float h2 = s55Var.h(1);
        float h3 = s55Var.h(2);
        this.M = vt0.l(h, h2, h3, this.J ? 1 : 0, 1);
        this.N = vt0.l(h, h2, h3, this.K, Log.LOG_LEVEL_OFF);
    }

    public final void k0(hs2 hs2Var) {
        if (this.L) {
            j0(hs2Var, l0(), (kj1) j42.r(this, hf0.k));
            this.L = false;
        }
        int i = this.M;
        this.M = i >= 0 ? i : 0;
        int i2 = this.N;
        if (i2 == -1) {
            i2 = Log.LOG_LEVEL_OFF;
        }
        this.N = i2;
    }

    public final m65 l0() {
        m65 m65Var = this.O;
        if (m65Var != null) {
            return m65Var;
        }
        throw hf1.q("Resolved style is not set.");
    }

    @Override // defpackage.na2
    public final int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        k0((hs2) b42Var);
        int i2 = this.M;
        int i3 = this.N;
        if (i2 == i3) {
            return i3;
        }
        int b = a42Var.b(i);
        int i4 = this.M;
        int i5 = this.N;
        if (b < i4) {
            b = i4;
        }
        return b > i5 ? i5 : b;
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        if (this.L) {
            j0(ww2Var, l0(), (kj1) j42.r(this, hf0.k));
            this.L = false;
        }
        int i = this.M;
        int r = i != -1 ? ut0.r(i, dh0.i(j), dh0.g(j)) : dh0.i(j);
        int i2 = this.N;
        bn3 u = pw2Var.u(dh0.a(j, 0, 0, r, i2 != -1 ? ut0.r(i2, dh0.i(j), dh0.g(j)) : dh0.g(j), 3));
        return ww2Var.A(u.I, u.J, p91.I, new b2(u, (byte) 3));
    }

    @Override // defpackage.na2
    public final int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        k0((hs2) b42Var);
        int i2 = this.M;
        if (i2 == this.N) {
            return i2;
        }
        int Q = a42Var.Q(i);
        int i3 = this.M;
        int i4 = this.N;
        if (Q < i3) {
            Q = i3;
        }
        return Q > i4 ? i4 : Q;
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }

    @Override // defpackage.k13
    public final void onAttach() {
        super.onAttach();
        kj1 kj1Var = (kj1) j42.r(this, hf0.k);
        this.O = ad4.z(this.I, ut0.U(this).h0);
        mj1 mj1Var = l0().a.f;
        qk1 qk1Var = l0().a.c;
        if (qk1Var == null) {
            qk1Var = qk1.M;
        }
        lk1 lk1Var = l0().a.d;
        int i = lk1Var != null ? lk1Var.a : 0;
        mk1 mk1Var = l0().a.e;
        this.P = ((nj1) kj1Var).b(mj1Var, qk1Var, i, mk1Var != null ? mk1Var.a : Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        mu0.P(this, new bt1(this, (byte) 0));
        this.L = true;
    }

    @Override // defpackage.k13
    public final void onDensityChange() {
        this.L = true;
        ut0.U(this).H();
    }

    @Override // defpackage.k13
    public final void onDetach() {
        this.O = null;
        this.P = null;
        this.L = false;
    }

    @Override // defpackage.k13
    public final void onLayoutDirectionChange() {
        this.O = ad4.z(this.I, ut0.U(this).h0);
        this.L = true;
        ut0.U(this).H();
    }
}
