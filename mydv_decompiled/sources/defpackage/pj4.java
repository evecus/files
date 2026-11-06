package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pj4 implements Iterator, fj0, w72 {
    public byte I;
    public Object J;
    public Iterator K;
    public fj0 L;

    public final RuntimeException b() {
        byte b = this.I;
        if (b == 4) {
            return new NoSuchElementException();
        }
        if (b == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.I));
    }

    public final void c(fj0 fj0Var) {
        this.L = fj0Var;
    }

    public final void d(fj0 fj0Var, Object obj) {
        this.J = obj;
        this.I = (byte) 3;
        this.L = fj0Var;
        fj0Var.getClass();
    }

    @Override // defpackage.fj0
    public final tk0 getContext() {
        return l91.I;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            byte b = this.I;
            if (b != 0) {
                if (b != 1) {
                    if (b == 2 || b == 3) {
                        return true;
                    }
                    if (b == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.K;
                it.getClass();
                if (it.hasNext()) {
                    this.I = (byte) 2;
                    return true;
                }
                this.K = null;
            }
            this.I = (byte) 5;
            fj0 fj0Var = this.L;
            fj0Var.getClass();
            this.L = null;
            fj0Var.resumeWith(wd5.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.I;
        if (b == 0 || b == 1) {
            if (hasNext()) {
                return next();
            }
            zy.k();
            return null;
        }
        if (b == 2) {
            this.I = (byte) 1;
            Iterator it = this.K;
            it.getClass();
            return it.next();
        }
        if (b != 3) {
            throw b();
        }
        this.I = (byte) 0;
        Object obj = this.J;
        this.J = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.fj0
    public final void resumeWith(Object obj) {
        mu0.V(obj);
        this.I = (byte) 4;
    }
}
