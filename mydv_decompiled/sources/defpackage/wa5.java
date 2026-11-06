package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wa5 extends ta5 {
    public final q70 L;

    public wa5(q70 q70Var) {
        this.L = q70Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.K;
        this.K = i + 2;
        Object[] objArr = this.I;
        return new y33(this.L, objArr[i], objArr[i + 1]);
    }
}
