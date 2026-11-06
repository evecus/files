package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ii5 extends k13 implements w31 {
    public y95 I;
    public ta1 J;
    public bc1 K;
    public on4 L;

    @Override // defpackage.w31
    public final void draw(zh0 zh0Var) {
        ya2 ya2Var = (ya2) zh0Var;
        ya2Var.a();
        y95 y95Var = this.I;
        hi5 hi5Var = new hi5(this, (byte) 0);
        on4 on4Var = this.L;
        x95 a = y95Var.a(hi5Var, on4Var.a() ? new x70(on4Var.e) : null, null, new hi5(this, (byte) 1));
        on4 on4Var2 = this.L;
        long j = ((x70) a.getValue()).a;
        s95 s95Var = on4Var2.c;
        if (on4Var2.b() && ((Boolean) s95Var.g.getValue()).booleanValue()) {
            j = ((x70) s95Var.h.getValue()).a;
        }
        if (on4Var2.b()) {
            on4Var2.e = j;
        }
        if (x70.d(j) == 0.0f) {
            return;
        }
        da5 da5Var = this.J.a;
        da5 da5Var2 = this.K.a;
        r7.m(ya2Var, j, 0L, 0L, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }
}
