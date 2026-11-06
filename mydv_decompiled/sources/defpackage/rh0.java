package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rh0 {
    public static final rh0 I;
    public static final rh0 J;
    public static final /* synthetic */ rh0[] K;

    static {
        rh0 rh0Var = new rh0("VIEW_APPEAR", 0);
        I = rh0Var;
        rh0 rh0Var2 = new rh0("VIEW_DISAPPEAR", 1);
        J = rh0Var2;
        K = new rh0[]{rh0Var, rh0Var2};
    }

    public static rh0 valueOf(String str) {
        return (rh0) Enum.valueOf(rh0.class, str);
    }

    public static rh0[] values() {
        return (rh0[]) K.clone();
    }
}
