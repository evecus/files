package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ti extends r92 implements in1 {
    public final /* synthetic */ vi J;
    public final /* synthetic */ ta1 K;
    public final /* synthetic */ bc1 L;
    public final /* synthetic */ String M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(vi viVar, ta1 ta1Var, bc1 bc1Var, String str) {
        super(3);
        this.J = viVar;
        this.K = ta1Var;
        this.L = bc1Var;
        this.M = str;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        go1 go1Var = (go1) ((fe0) obj2);
        go1Var.d0(1840112047);
        l13 then = ((l13) obj).then(ma1.b(this.J.a, this.K, this.L, null, this.M, go1Var, 0, 28));
        go1Var.q(false);
        return then;
    }
}
