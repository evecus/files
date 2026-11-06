package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lh extends r92 implements hn1 {
    public final /* synthetic */ bc1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(bc1 bc1Var) {
        super(2);
        this.J = bc1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        aa1 aa1Var = (aa1) obj;
        aa1 aa1Var2 = (aa1) obj2;
        aa1 aa1Var3 = aa1.K;
        return Boolean.valueOf(aa1Var == aa1Var3 && aa1Var2 == aa1Var3 && !this.J.a.e);
    }
}
