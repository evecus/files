package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class e54 extends fu {
    public e54(fj0 fj0Var) {
        super(fj0Var);
        if (fj0Var == null || fj0Var.getContext() == l91.I) {
            return;
        }
        s83.t("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.fj0
    public final tk0 getContext() {
        return l91.I;
    }
}
