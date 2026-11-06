package defpackage;

import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z32 extends e42 {
    public d42 I;
    public boolean J;

    @Override // defpackage.e42
    public final long j0(pw2 pw2Var, long j) {
        int Q = this.I == d42.I ? pw2Var.Q(dh0.h(j)) : pw2Var.b(dh0.h(j));
        if (Q < 0) {
            Q = 0;
        }
        if (Q < 0) {
            s02.a("height must be >= 0");
        }
        return eh0.h(0, Log.LOG_LEVEL_OFF, Q, Q);
    }

    @Override // defpackage.e42
    public final boolean k0() {
        return this.J;
    }

    @Override // defpackage.e42, defpackage.na2
    public final int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return this.I == d42.I ? a42Var.Q(i) : a42Var.b(i);
    }

    @Override // defpackage.e42, defpackage.na2
    public final int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return this.I == d42.I ? a42Var.Q(i) : a42Var.b(i);
    }
}
