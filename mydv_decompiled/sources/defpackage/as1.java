package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class as1 implements Iterator, w72 {
    public final tr4 I;
    public final int J;
    public int K;
    public final int L;

    public as1(tr4 tr4Var, int i, int i2) {
        this.I = tr4Var;
        this.J = i2;
        this.K = i;
        this.L = tr4Var.P;
        if (tr4Var.O) {
            vr4.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.K < this.J;
    }

    @Override // java.util.Iterator
    public final Object next() {
        tr4 tr4Var = this.I;
        int i = tr4Var.P;
        int i2 = this.L;
        if (i != i2) {
            vr4.e();
        }
        int i3 = this.K;
        this.K = tr4Var.I[(i3 * 5) + 3] + i3;
        return new ur4(tr4Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
