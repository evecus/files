package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tt extends k13 implements w31, kd3, pi4 {
    public long I;
    public wy J;
    public float K;
    public dn4 L;
    public long M;
    public da2 N;
    public yg3 O;
    public dn4 P;
    public yg3 Q;

    @Override // defpackage.kd3
    public final void U() {
        this.M = 9205357640488583168L;
        this.N = null;
        this.O = null;
        this.P = null;
        mu0.I(this);
    }

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        aj4.d(cj4Var, this.L);
    }

    @Override // defpackage.w31
    public final void draw(zh0 zh0Var) {
        yg3 yg3Var;
        if (this.L == mw2.j) {
            if (!zc5.a(this.I, x70.g)) {
                r7.m(zh0Var, this.I, 0L, 0L, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
            }
            wy wyVar = this.J;
            if (wyVar != null) {
                r7.l(zh0Var, wyVar, 0L, 0L, this.K, null, null, 118);
            }
        } else {
            ya2 ya2Var = (ya2) zh0Var;
            r10 r10Var = ya2Var.I;
            if (fq4.a(r10Var.J.H(), this.M) && ya2Var.getLayoutDirection() == this.N && j42.c(this.P, this.L)) {
                yg3Var = this.O;
                yg3Var.getClass();
            } else {
                mu0.P(this, new ka(this, ya2Var, (byte) 4));
                yg3Var = this.Q;
                this.Q = null;
            }
            this.O = yg3Var;
            this.M = r10Var.J.H();
            this.N = ya2Var.getLayoutDirection();
            this.P = this.L;
            yg3Var.getClass();
            if (!zc5.a(this.I, x70.g)) {
                lq2.z(zh0Var, yg3Var, this.I);
            }
            wy wyVar2 = this.J;
            if (wyVar2 != null) {
                lq2.y(ya2Var, yg3Var, wyVar2, this.K, 56);
            }
        }
        ((ya2) zh0Var).a();
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
        return false;
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }
}
