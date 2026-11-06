package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class js2 extends hs2 implements pw2 {
    public final na3 c0;
    public LinkedHashMap e0;
    public vw2 g0;
    public final a43 h0;
    public long d0 = 0;
    public final ks2 f0 = new ks2(this);

    public js2(na3 na3Var) {
        this.c0 = na3Var;
        a43 a43Var = dd3.a;
        this.h0 = new a43();
    }

    public final void A0(long j) {
        if (!r22.a(this.d0, j)) {
            this.d0 = j;
            na3 na3Var = this.c0;
            ns2 ns2Var = na3Var.c0.o0.q;
            if (ns2Var != null) {
                ns2Var.u0();
            }
            hs2.v0(na3Var);
        }
        if (this.W) {
            return;
        }
        m0(r0());
    }

    public final long B0(js2 js2Var, boolean z) {
        long j = 0;
        while (!this.equals(js2Var)) {
            if (!this.T || !z) {
                j = r22.c(j, this.d0);
            }
            na3 na3Var = this.c0.e0;
            na3Var.getClass();
            this = na3Var.I0();
            this.getClass();
        }
        return j;
    }

    public final void C0(vw2 vw2Var) {
        LinkedHashMap linkedHashMap;
        if (vw2Var != null) {
            e0((vw2Var.getHeight() & 4294967295L) | (vw2Var.getWidth() << 32));
        } else {
            e0(0L);
        }
        if (!j42.c(this.g0, vw2Var) && vw2Var != null && ((((linkedHashMap = this.e0) != null && !linkedHashMap.isEmpty()) || !vw2Var.a().isEmpty()) && !j42.c(vw2Var.a(), this.e0))) {
            ns2 ns2Var = this.c0.c0.o0.q;
            ns2Var.getClass();
            ns2Var.a().g();
            LinkedHashMap linkedHashMap2 = this.e0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.e0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(vw2Var.a());
        }
        this.g0 = vw2Var;
    }

    @Override // defpackage.iu0
    public final float L() {
        return this.c0.L();
    }

    @Override // defpackage.hs2, defpackage.b42
    public final boolean N() {
        return true;
    }

    @Override // defpackage.bn3
    public final void d0(long j, float f, tm1 tm1Var) {
        A0(j);
        if (this.V) {
            return;
        }
        z0();
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.c0.getDensity();
    }

    @Override // defpackage.b42
    public final da2 getLayoutDirection() {
        return this.c0.c0.h0;
    }

    @Override // defpackage.hs2
    public final hs2 n0() {
        na3 na3Var = this.c0.d0;
        if (na3Var != null) {
            return na3Var.I0();
        }
        return null;
    }

    @Override // defpackage.hs2
    public final ca2 o0() {
        return this.f0;
    }

    @Override // defpackage.hs2
    public final boolean p0() {
        return this.g0 != null;
    }

    @Override // defpackage.hs2
    public final wa2 q0() {
        return this.c0.c0;
    }

    @Override // defpackage.hs2
    public final vw2 r0() {
        vw2 vw2Var = this.g0;
        if (vw2Var != null) {
            return vw2Var;
        }
        throw r7.t("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.hs2
    public final hs2 s0() {
        na3 na3Var = this.c0.e0;
        if (na3Var != null) {
            return na3Var.I0();
        }
        return null;
    }

    @Override // defpackage.hs2
    public final long t0() {
        return this.d0;
    }

    @Override // defpackage.hs2
    public final void x0() {
        d0(this.d0, 0.0f, null);
    }

    @Override // defpackage.bn3, defpackage.a42
    public final Object z() {
        return this.c0.z();
    }

    public void z0() {
        r0().b();
    }
}
