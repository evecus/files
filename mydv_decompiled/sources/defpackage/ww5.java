package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ww5 {
    public static final vw5 Companion;
    public static final ww5 I;
    public static final ww5 J;
    public static final ww5 K;
    public static final ww5 L;
    public static final ww5 M;
    public static final /* synthetic */ ww5[] N;

    static {
        ww5 ww5Var = new ww5("Compact", 0);
        I = ww5Var;
        ww5 ww5Var2 = new ww5("Medium", 1);
        J = ww5Var2;
        ww5 ww5Var3 = new ww5("Expanded", 2);
        K = ww5Var3;
        ww5 ww5Var4 = new ww5("Large", 3);
        L = ww5Var4;
        ww5 ww5Var5 = new ww5("ExtraLarge", 4);
        M = ww5Var5;
        N = new ww5[]{ww5Var, ww5Var2, ww5Var3, ww5Var4, ww5Var5};
        Companion = new vw5();
    }

    public static ww5 valueOf(String str) {
        return (ww5) Enum.valueOf(ww5.class, str);
    }

    public static ww5[] values() {
        return (ww5[]) N.clone();
    }
}
