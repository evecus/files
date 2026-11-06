package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vp4 extends gj0 {
    public Object I;
    public Object J;
    public /* synthetic */ Object K;
    public final /* synthetic */ yp4 L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp4(yp4 yp4Var, gj0 gj0Var) {
        super(gj0Var);
        this.L = yp4Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.h(this);
    }
}
