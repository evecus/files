package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class da2 {
    public static final da2 I;
    public static final da2 J;
    public static final /* synthetic */ da2[] K;

    static {
        da2 da2Var = new da2("Ltr", 0);
        I = da2Var;
        da2 da2Var2 = new da2("Rtl", 1);
        J = da2Var2;
        K = new da2[]{da2Var, da2Var2};
    }

    public static da2 valueOf(String str) {
        return (da2) Enum.valueOf(da2.class, str);
    }

    public static da2[] values() {
        return (da2[]) K.clone();
    }
}
