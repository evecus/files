package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sm3 extends z2 {
    public final Object[] K;
    public final ra5 L;

    public sm3(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.K = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.L = new ra5(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        ra5 ra5Var = this.L;
        if (ra5Var.hasNext()) {
            this.I++;
            return ra5Var.next();
        }
        int i = this.I;
        this.I = i + 1;
        return this.K[i - ra5Var.J];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            zy.k();
            return null;
        }
        int i = this.I;
        ra5 ra5Var = this.L;
        int i2 = ra5Var.J;
        if (i <= i2) {
            this.I = i - 1;
            return ra5Var.previous();
        }
        int i3 = i - 1;
        this.I = i3;
        return this.K[i3 - i2];
    }
}
