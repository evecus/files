package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class mz5 implements yi2, qn1 {
    public final /* synthetic */ re0 I;

    public mz5(re0 re0Var) {
        this.I = re0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof yi2) && (obj instanceof qn1)) {
            return getFunctionDelegate().equals(((qn1) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.qn1
    public final dn1 getFunctionDelegate() {
        return new tn1(1, this.I, re0.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
