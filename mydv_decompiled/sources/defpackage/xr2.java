package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xr2 implements Iterator, w72 {
    public final long I;
    public final long J;
    public boolean K;
    public long L;

    public xr2(long j, long j2, long j3) {
        this.I = j3;
        this.J = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.K = z;
        this.L = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.K;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.L;
        if (j != this.J) {
            this.L = this.I + j;
        } else {
            if (!this.K) {
                zy.k();
                return null;
            }
            this.K = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
