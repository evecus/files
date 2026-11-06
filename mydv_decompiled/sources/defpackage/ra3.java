package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ra3 {
    public static final ra3 I;
    public static final ra3 J;
    public static final /* synthetic */ ra3[] K;

    static {
        ra3 ra3Var = new ra3("Width", 0);
        I = ra3Var;
        ra3 ra3Var2 = new ra3("Height", 1);
        J = ra3Var2;
        K = new ra3[]{ra3Var, ra3Var2};
    }

    public static ra3 valueOf(String str) {
        return (ra3) Enum.valueOf(ra3.class, str);
    }

    public static ra3[] values() {
        return (ra3[]) K.clone();
    }
}
