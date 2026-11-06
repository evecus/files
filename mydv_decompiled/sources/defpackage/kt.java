package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kt {
    public final ts0 a;
    public final je3 b;

    /* JADX WARN: Multi-variable type inference failed */
    public kt(ts0 ts0Var, je3 je3Var) {
        this.a = ts0Var;
        this.b = je3Var;
        if ((ts0Var == null ? je3Var : ts0Var) != null) {
            return;
        }
        s83.t("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
}
