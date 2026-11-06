package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k55 {
    public static final k55 I;
    public static final k55 J;
    public static final k55 K;
    public static final k55 L;
    public static final /* synthetic */ k55[] M;

    static {
        k55 k55Var = new k55("StartInput", 0);
        I = k55Var;
        k55 k55Var2 = new k55("StopInput", 1);
        J = k55Var2;
        k55 k55Var3 = new k55("ShowKeyboard", 2);
        K = k55Var3;
        k55 k55Var4 = new k55("HideKeyboard", 3);
        L = k55Var4;
        M = new k55[]{k55Var, k55Var2, k55Var3, k55Var4};
    }

    public static k55 valueOf(String str) {
        return (k55) Enum.valueOf(k55.class, str);
    }

    public static k55[] values() {
        return (k55[]) M.clone();
    }
}
