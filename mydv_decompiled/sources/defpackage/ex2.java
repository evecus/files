package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ex2 {
    public static final ex2 I;
    public static final ex2 J;
    public static final /* synthetic */ ex2[] K;

    static {
        ex2 ex2Var = new ex2("Width", 0);
        I = ex2Var;
        ex2 ex2Var2 = new ex2("Height", 1);
        J = ex2Var2;
        K = new ex2[]{ex2Var, ex2Var2};
    }

    public static ex2 valueOf(String str) {
        return (ex2) Enum.valueOf(ex2.class, str);
    }

    public static ex2[] values() {
        return (ex2[]) K.clone();
    }
}
