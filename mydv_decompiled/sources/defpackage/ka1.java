package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ka1 extends r92 implements tm1 {
    public final /* synthetic */ boolean J;
    public final /* synthetic */ rm1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka1(rm1 rm1Var, boolean z) {
        super(1);
        this.J = z;
        this.K = rm1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        ((n54) obj).f(!this.J && ((Boolean) this.K.invoke()).booleanValue());
        return wd5.a;
    }
}
