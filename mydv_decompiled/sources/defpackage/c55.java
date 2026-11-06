package defpackage;

import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class c55 extends k13 implements ye0, na2 {
    public final m65 I;
    public jc5 J;
    public a55 K;

    public c55(m65 m65Var) {
        this.I = m65Var;
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void j0(m65 m65Var, kj1 kj1Var) {
        yt4 yt4Var = m65Var.a;
        mj1 mj1Var = yt4Var.f;
        qk1 qk1Var = yt4Var.c;
        if (qk1Var == null) {
            qk1Var = qk1.M;
        }
        lk1 lk1Var = yt4Var.d;
        int i = lk1Var != null ? lk1Var.a : 0;
        mk1 mk1Var = yt4Var.e;
        this.J = ((nj1) kj1Var).b(mj1Var, qk1Var, i, mk1Var != null ? mk1Var.a : Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        ut0.U(this).H();
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.i(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        a55 a55Var = this.K;
        if (a55Var == null) {
            throw hf1.q("Min size state is not set.");
        }
        jk3 jk3Var = a55Var.f;
        jc5 jc5Var = this.J;
        if (jc5Var == null) {
            throw hf1.q("Font resolution state is not set.");
        }
        Object value = jc5Var.getValue();
        if (!j42.c(value, a55Var.e)) {
            a55Var.e = value;
            jk3Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) jk3Var.getValue()).booleanValue()) {
            a55Var.g = u35.a(a55Var.d, a55Var.b, a55Var.c);
            jk3Var.setValue(Boolean.FALSE);
        }
        long j2 = a55Var.g;
        bn3 u = pw2Var.u(eh0.e(j, eh0.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return ww2Var.A(u.I, u.J, p91.I, new b2(u, (byte) 12));
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.o(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }

    @Override // defpackage.k13
    public final void onAttach() {
        m65 z = ad4.z(this.I, ut0.U(this).h0);
        kj1 kj1Var = (kj1) j42.r(this, hf0.k);
        j0(z, kj1Var);
        da2 da2Var = ut0.U(this).h0;
        iu0 iu0Var = ut0.U(this).g0;
        jc5 jc5Var = this.J;
        if (jc5Var == null) {
            throw hf1.q("Font resolution state is not set.");
        }
        this.K = new a55(da2Var, iu0Var, kj1Var, z, jc5Var.getValue());
    }

    @Override // defpackage.k13
    public final void onDensityChange() {
        a55 a55Var = this.K;
        if (a55Var != null) {
            a55.a(a55Var, null, ut0.U(this).g0, null, 29);
        }
        ut0.U(this).H();
    }

    @Override // defpackage.k13
    public final void onDetach() {
        this.J = null;
        this.K = null;
    }

    @Override // defpackage.k13
    public final void onLayoutDirectionChange() {
        a55 a55Var = this.K;
        if (a55Var != null) {
            a55.a(a55Var, ut0.U(this).h0, null, null, 30);
        }
        ut0.U(this).H();
    }
}
