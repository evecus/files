package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zf2 extends k05 implements hn1 {
    public final /* synthetic */ ag2 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf2(ag2 ag2Var, int i, int i2, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = ag2Var;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new zf2(this.I, this.J, this.K, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        zf2 zf2Var = (zf2) create((rb4) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        zf2Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        this.I.k(this.J, this.K);
        return wd5.a;
    }
}
