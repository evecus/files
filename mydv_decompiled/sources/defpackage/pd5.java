package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pd5 extends vk0 {
    public static final pd5 I = new pd5();

    @Override // defpackage.vk0
    public final void dispatch(tk0 tk0Var, Runnable runnable) {
        b16 b16Var = (b16) tk0Var.get(b16.J);
        if (b16Var != null) {
            b16Var.I = true;
        } else {
            zy.p("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.vk0
    public final vk0 limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.vk0
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
