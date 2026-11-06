package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ip4 extends z2 {
    public final Object K;

    public ip4(int i, Object obj) {
        super(i, 1);
        this.K = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.I++;
            return this.K;
        }
        zy.k();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.I--;
            return this.K;
        }
        zy.k();
        return null;
    }
}
