package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hz1 extends dy1 {
    public final /* synthetic */ py1 K;

    public hz1(py1 py1Var) {
        this.K = py1Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        py1 py1Var = this.K;
        switch (py1Var.L) {
            case 0:
                ad3 ad3Var = ((d34) py1Var.M).M;
                sp0.u(i, ad3Var.c);
                return new zc3(ad3Var, i);
            default:
                ad3 ad3Var2 = ((d34) py1Var.M).M;
                sp0.u(i, ad3Var2.c);
                return ad3Var2.a[i];
        }
    }

    @Override // defpackage.vx1
    public final boolean j() {
        return this.K.j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.K.size();
    }
}
