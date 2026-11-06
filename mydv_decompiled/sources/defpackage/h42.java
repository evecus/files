package defpackage;

import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h42 extends e42 {
    public d42 I;
    public boolean J;

    @Override // defpackage.e42
    public final long j0(pw2 pw2Var, long j) {
        int p = this.I == d42.I ? pw2Var.p(dh0.g(j)) : pw2Var.t(dh0.g(j));
        if (p < 0) {
            p = 0;
        }
        if (p < 0) {
            s02.a("width must be >= 0");
        }
        return eh0.h(p, p, 0, Log.LOG_LEVEL_OFF);
    }

    @Override // defpackage.e42
    public final boolean k0() {
        return this.J;
    }

    @Override // defpackage.e42, defpackage.na2
    public final int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return this.I == d42.I ? a42Var.p(i) : a42Var.t(i);
    }

    @Override // defpackage.e42, defpackage.na2
    public final int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return this.I == d42.I ? a42Var.p(i) : a42Var.t(i);
    }
}
