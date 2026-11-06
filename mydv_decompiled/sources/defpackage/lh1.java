package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lh1 implements zf1 {
    public final /* synthetic */ zf1 I;
    public final /* synthetic */ a74 J;
    public final /* synthetic */ ny5 K;

    public lh1(zf1 zf1Var, a74 a74Var, ny5 ny5Var) {
        this.I = zf1Var;
        this.J = a74Var;
        this.K = ny5Var;
    }

    @Override // defpackage.zf1
    public final Object collect(ag1 ag1Var, fj0 fj0Var) {
        Object collect = this.I.collect(new kh1(ag1Var, this.J, this.K, (byte) 0), fj0Var);
        return collect == el0.I ? collect : wd5.a;
    }
}
