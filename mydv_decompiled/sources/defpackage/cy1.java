package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cy1 extends y2 {
    public final a4 I;
    public final int J;
    public final int K;

    public cy1(a4 a4Var, int i, int i2) {
        this.I = a4Var;
        this.J = i;
        mu0.m(i, i2, a4Var.c());
        this.K = i2 - i;
    }

    @Override // defpackage.w1
    public final int c() {
        return this.K;
    }

    @Override // java.util.List
    public final Object get(int i) {
        mu0.k(i, this.K);
        return this.I.get(this.J + i);
    }

    @Override // defpackage.y2, java.util.List
    public final List subList(int i, int i2) {
        mu0.m(i, i2, this.K);
        int i3 = this.J;
        return new cy1(this.I, i + i3, i3 + i2);
    }
}
