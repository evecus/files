package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ph0 {
    public static final ph0 I;
    public static final ph0 J;
    public static final ph0 K;
    public static final ph0 L;
    public static final /* synthetic */ ph0[] M;

    static {
        ph0 ph0Var = new ph0("None", 0);
        I = ph0Var;
        ph0 ph0Var2 = new ph0("Drawer", 1);
        J = ph0Var2;
        ph0 ph0Var3 = new ph0("Exit", 2);
        K = ph0Var3;
        ph0 ph0Var4 = new ph0("Home", 3);
        L = ph0Var4;
        M = new ph0[]{ph0Var, ph0Var2, ph0Var3, ph0Var4};
    }

    public static ph0 valueOf(String str) {
        return (ph0) Enum.valueOf(ph0.class, str);
    }

    public static ph0[] values() {
        return (ph0[]) M.clone();
    }
}
