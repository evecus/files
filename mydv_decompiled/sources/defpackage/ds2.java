package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ds2 extends c9 {
    @Override // defpackage.c9
    public final long b(na3 na3Var, long j) {
        js2 I0 = na3Var.I0();
        I0.getClass();
        long j2 = I0.d0;
        return pd3.f((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
    }

    @Override // defpackage.c9
    public final Map c(na3 na3Var) {
        js2 I0 = na3Var.I0();
        I0.getClass();
        return I0.r0().a();
    }

    @Override // defpackage.c9
    public final int d(na3 na3Var, v8 v8Var) {
        js2 I0 = na3Var.I0();
        I0.getClass();
        return I0.R(v8Var);
    }
}
