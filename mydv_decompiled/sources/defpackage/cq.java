package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class cq implements Iterator {
    public final Object[] I;
    public int J = 0;

    public cq(Object[] objArr) {
        this.I = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.J < this.I.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.J;
        Object[] objArr = this.I;
        if (i != objArr.length) {
            this.J = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException("Out of elements: " + this.J);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}
