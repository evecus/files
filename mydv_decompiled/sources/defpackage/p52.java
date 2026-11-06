package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p52 extends ee5 {
    public final Object I;
    public boolean J;

    public p52(Object obj) {
        this.I = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.J;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.J) {
            zy.k();
            return null;
        }
        this.J = true;
        return this.I;
    }
}
