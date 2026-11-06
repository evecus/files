package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ky1 extends ee5 {
    public final ee5 I;
    public ee5 J = n52.L;

    public ky1(ey1 ey1Var) {
        this.I = ((dy1) ey1Var.M.values()).listIterator(0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.J.hasNext() || this.I.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.J.hasNext()) {
            this.J = ((vx1) this.I.next()).iterator();
        }
        return this.J.next();
    }
}
