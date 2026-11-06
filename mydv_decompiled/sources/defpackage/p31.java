package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p31 extends g31 {
    public qr4 d0;
    public boolean e0;
    public in1 f0;
    public in1 g0;
    public boolean h0;

    @Override // defpackage.g31
    public final boolean B0() {
        return this.e0;
    }

    @Override // defpackage.g31
    public final Object n0(n6 n6Var, f31 f31Var) {
        pg3 pg3Var = this.K;
        wd5 wd5Var = wd5.a;
        if (pg3Var != null) {
            qr4 qr4Var = this.d0;
            n6 n6Var2 = new n6(n6Var, this, pg3Var, (fj0) null, (byte) 8);
            qr4Var.getClass();
            Object o0 = i42.o0(new gu2(qr4Var, n6Var2, (fj0) null, (byte) 18), f31Var);
            el0 el0Var = el0.I;
            if (o0 != el0Var) {
                o0 = wd5Var;
            }
            if (o0 == el0Var) {
                return o0;
            }
        }
        return wd5Var;
    }

    @Override // defpackage.g31
    public final void s0(long j) {
        if (!isAttached() || j42.c(this.f0, n31.a)) {
            return;
        }
        p70.g0(getCoroutineScope(), null, gl0.L, new o31(this, j, null), 1);
    }

    @Override // defpackage.g31
    public final void t0(o21 o21Var) {
        pg3 pg3Var;
        if (!isAttached() || j42.c(this.g0, n31.b) || (pg3Var = this.K) == null) {
            return;
        }
        p70.g0(getCoroutineScope(), null, gl0.L, new n6(this, o21Var, pg3Var, (fj0) null, (byte) 9), 1);
    }
}
