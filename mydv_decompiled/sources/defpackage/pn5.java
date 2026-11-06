package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pn5 {
    public static final pn5 I;
    public static final pn5 J;
    public static final /* synthetic */ pn5[] K;

    static {
        pn5 pn5Var = new pn5("DETAIL", 0);
        I = pn5Var;
        pn5 pn5Var2 = new pn5("FEED", 1);
        J = pn5Var2;
        K = new pn5[]{pn5Var, pn5Var2};
    }

    public static pn5 valueOf(String str) {
        return (pn5) Enum.valueOf(pn5.class, str);
    }

    public static pn5[] values() {
        return (pn5[]) K.clone();
    }
}
