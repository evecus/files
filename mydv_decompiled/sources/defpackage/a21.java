package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a21 implements tm1 {
    public final /* synthetic */ r24 I;
    public final /* synthetic */ b21 J;
    public final /* synthetic */ uu2 K;

    public a21(r24 r24Var, b21 b21Var, uu2 uu2Var) {
        this.I = r24Var;
        this.J = b21Var;
        this.K = uu2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        la5 la5Var = (la5) obj;
        b21 b21Var = (b21) la5Var;
        if (!((oc) ut0.V(this.J).getDragAndDropManager()).b.contains(b21Var) || !c21.n(b21Var, e21.z(this.K))) {
            return ka5.I;
        }
        this.I.I = la5Var;
        return ka5.K;
    }
}
