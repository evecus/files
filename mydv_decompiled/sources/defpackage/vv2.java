package defpackage;

import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vv2 extends k13 implements na2, w31, ph1 {
    public short K;
    public float L;
    public rv4 P;
    public jr1 Q;
    public final jk3 R;
    public final wu0 U;
    public byte I = 3;
    public short J = 1200;
    public final gk3 M = new gk3(0);
    public final gk3 N = new gk3(0);
    public final jk3 O = ad4.w(Boolean.FALSE);
    public final jk3 S = ad4.w(new tv2());
    public final bh T = p70.a(0.0f);

    /* JADX WARN: Multi-variable type inference failed */
    public vv2(int i, or0 or0Var, float f) {
        this.K = i;
        this.L = f;
        this.R = ad4.w(or0Var);
        this.U = dt4.b(new jt2((Object) or0Var, (Object) this, (byte) 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    @Override // defpackage.w31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(defpackage.zh0 r24) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv2.draw(zh0):void");
    }

    public final int j0() {
        return ((Number) this.U.getValue()).intValue();
    }

    public final void k0() {
        rv4 rv4Var = this.P;
        fj0 fj0Var = null;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        if (isAttached()) {
            this.P = p70.g0(getCoroutineScope(), null, null, new jd(rv4Var, this, fj0Var, (byte) 5), 3);
        }
    }

    @Override // defpackage.na2
    public final int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return a42Var.b(Log.LOG_LEVEL_OFF);
    }

    @Override // defpackage.na2
    public final int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return a42Var.t(i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        bn3 u = pw2Var.u(dh0.a(j, 0, Log.LOG_LEVEL_OFF, 0, 0, 13));
        int g = eh0.g(u.I, j);
        gk3 gk3Var = this.N;
        gk3Var.i(g);
        this.M.i(u.I);
        return ww2Var.A(gk3Var.h(), u.J, p91.I, new b2(u, (byte) 6));
    }

    @Override // defpackage.na2
    public final int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return a42Var.Q(Log.LOG_LEVEL_OFF);
    }

    @Override // defpackage.na2
    public final int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return 0;
    }

    @Override // defpackage.k13
    public final void onAttach() {
        jr1 jr1Var = this.Q;
        ir1 graphicsContext = ut0.V(this).getGraphicsContext();
        if (jr1Var != null) {
            graphicsContext.a(jr1Var);
        }
        this.Q = graphicsContext.c();
        k0();
    }

    @Override // defpackage.k13
    public final void onDetach() {
        rv4 rv4Var = this.P;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.P = null;
        jr1 jr1Var = this.Q;
        if (jr1Var != null) {
            ut0.V(this).getGraphicsContext().a(jr1Var);
            this.Q = null;
        }
    }

    @Override // defpackage.ph1
    public final void u(oi1 oi1Var) {
        this.O.setValue(Boolean.valueOf(oi1Var.a()));
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }
}
