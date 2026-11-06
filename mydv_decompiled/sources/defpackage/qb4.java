package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qb4 implements rh3 {
    public final int I;
    public final List J;
    public Float K = null;
    public Float L = null;
    public bb4 M = null;
    public bb4 N = null;

    public qb4(int i, List list) {
        this.I = i;
        this.J = list;
    }

    public final bb4 a() {
        return this.M;
    }

    public final Float b() {
        return this.K;
    }

    public final Float c() {
        return this.L;
    }

    public final int d() {
        return this.I;
    }

    public final bb4 e() {
        return this.N;
    }

    public final void f(bb4 bb4Var) {
        this.M = bb4Var;
    }

    public final void g(Float f) {
        this.K = f;
    }

    public final void h(Float f) {
        this.L = f;
    }

    public final void i(bb4 bb4Var) {
        this.N = bb4Var;
    }

    @Override // defpackage.rh3
    public final boolean l() {
        return this.J.contains(this);
    }
}
