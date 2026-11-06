package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ta5 implements Iterator, w72 {
    public Object[] I = sa5.e.d;
    public int J;
    public int K;

    public final void a(Object[] objArr, int i, int i2) {
        this.I = objArr;
        this.J = i;
        this.K = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.K < this.J;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
