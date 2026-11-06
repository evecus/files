package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class gz1 implements Iterator, w72 {
    public int I;
    public int J;
    public boolean K;

    public gz1(int i) {
        this.I = i;
    }

    public abstract Object a(int i);

    public abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.J < this.I;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        Object a = a(this.J);
        this.J++;
        this.K = true;
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.K) {
            dq2.I0("Call next() before removing an element.");
            throw null;
        }
        int i = this.J - 1;
        this.J = i;
        b(i);
        this.I--;
        this.K = false;
    }
}
