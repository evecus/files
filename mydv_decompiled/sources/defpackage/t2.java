package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class t2 implements Iterator, w72 {
    public byte I;
    public Object J;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.I;
        if (b == 0) {
            this.I = (byte) 3;
            a();
            return this.I == 1;
        }
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        s83.t("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.I;
        if (b == 1) {
            this.I = (byte) 0;
            return this.J;
        }
        if (b != 2) {
            this.I = (byte) 3;
            a();
            if (this.I == 1) {
                this.I = (byte) 0;
                return this.J;
            }
        }
        zy.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
