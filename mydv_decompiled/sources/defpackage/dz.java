package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dz extends z2 {
    public final Object[] K;

    public dz(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.K = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        int i = this.I;
        this.I = i + 1;
        return this.K[i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            zy.k();
            return null;
        }
        int i = this.I - 1;
        this.I = i;
        return this.K[i];
    }
}
