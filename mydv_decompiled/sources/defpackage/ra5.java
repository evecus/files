package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ra5 extends z2 {
    public int K;
    public Object[] L;
    public boolean M;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public ra5(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.K = i3;
        Object[] objArr2 = new Object[i3];
        this.L = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.M = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.I & 31;
        Object obj = this.L[this.K - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.K - i2) * 5;
        while (i2 < this.K) {
            Object[] objArr = this.L;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[ui4.l(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (ui4.l(this.I, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.I, ((this.K - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        Object a = a();
        int i = this.I + 1;
        this.I = i;
        if (i == this.J) {
            this.M = true;
            return a;
        }
        c(0);
        return a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            zy.k();
            return null;
        }
        this.I--;
        if (this.M) {
            this.M = false;
            return a();
        }
        c(31);
        return a();
    }
}
