package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ni3 implements fe2 {
    public final is0 a;

    public ni3(is0 is0Var) {
        this.a = is0Var;
    }

    @Override // defpackage.fe2
    public final int a() {
        return this.a.l();
    }

    @Override // defpackage.fe2
    public final int b() {
        return Math.min(r1.l() - 1, ((yw2) o70.a1(this.a.k().a)).a);
    }

    @Override // defpackage.fe2
    public final int c() {
        int i;
        is0 is0Var = this.a;
        if (is0Var.k().a.size() == 0) {
            return 0;
        }
        int S = sp0.S(is0Var.k());
        int i2 = is0Var.k().b + is0Var.k().c;
        if (i2 != 0 && (i = S / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.fe2
    public final boolean d() {
        return !this.a.k().a.isEmpty();
    }

    @Override // defpackage.fe2
    public final int e() {
        return Math.max(0, this.a.e);
    }
}
