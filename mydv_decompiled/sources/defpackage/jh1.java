package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jh1 extends gj0 {
    public /* synthetic */ Object I;
    public int J;
    public ag1 K;
    public final /* synthetic */ kh1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh1(kh1 kh1Var, fj0 fj0Var) {
        super(fj0Var);
        this.L = kh1Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return this.L.emit(null, this);
    }
}
