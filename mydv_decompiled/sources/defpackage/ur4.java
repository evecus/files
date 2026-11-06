package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ur4 implements te0, Iterable, w72 {
    public final tr4 I;
    public final int J;
    public final int K;

    public ur4(tr4 tr4Var, int i, int i2) {
        this.I = tr4Var;
        this.J = i;
        this.K = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ur4)) {
            return false;
        }
        ur4 ur4Var = (ur4) obj;
        return ur4Var.J == this.J && ur4Var.K == this.K && ur4Var.I == this.I;
    }

    public final int hashCode() {
        return (this.I.hashCode() * 31) + this.J;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        tr4 tr4Var = this.I;
        if (tr4Var.P != this.K) {
            vr4.e();
        }
        int i = this.J;
        tr4Var.m(i);
        return new as1(tr4Var, i + 1, tr4Var.I[(i * 5) + 3] + i);
    }
}
