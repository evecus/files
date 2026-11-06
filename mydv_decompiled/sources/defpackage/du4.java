package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class du4 extends l22 {
    public int I;
    public final /* synthetic */ cu4 J;

    public du4(cu4 cu4Var) {
        this.J = cu4Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.I < this.J.e();
    }

    @Override // defpackage.l22
    public final int nextInt() {
        int i = this.I;
        this.I = i + 1;
        return this.J.c(i);
    }
}
