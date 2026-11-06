package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class c00 implements Iterator {
    public final /* synthetic */ byte I = 0;
    public int J = 0;
    public final int K;
    public final /* synthetic */ Object L;

    public c00(f00 f00Var) {
        this.L = f00Var;
        this.K = f00Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.I) {
            case 0:
                if (this.J < this.K) {
                }
                break;
            default:
                if (this.J < this.K) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.I;
        Object obj = this.L;
        int i = this.K;
        switch (b) {
            case 0:
                int i2 = this.J;
                if (i2 >= i) {
                    zy.k();
                    break;
                } else {
                    this.J = i2 + 1;
                    break;
                }
            default:
                int i3 = this.J;
                if (i3 >= i) {
                    zy.k();
                    break;
                } else {
                    this.J = i3 + 1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.I) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public c00(e00 e00Var) {
        this.L = e00Var;
        this.K = e00Var.size();
    }
}
