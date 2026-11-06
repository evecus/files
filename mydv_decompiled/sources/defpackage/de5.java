package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class de5 extends vk0 {
    public static final de5 I = new de5();

    @Override // defpackage.vk0
    public final void dispatch(tk0 tk0Var, Runnable runnable) {
        os0.J.I.g(runnable, true, false);
    }

    @Override // defpackage.vk0
    public final void dispatchYield(tk0 tk0Var, Runnable runnable) {
        os0.J.I.g(runnable, true, true);
    }

    @Override // defpackage.vk0
    public final vk0 limitedParallelism(int i, String str) {
        ut0.l(i);
        return i >= e25.d ? str != null ? new x53(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // defpackage.vk0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
