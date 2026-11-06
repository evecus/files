package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qa3 {
    public static final qa3 I;
    public static final qa3 J;
    public static final /* synthetic */ qa3[] K;

    static {
        qa3 qa3Var = new qa3("Min", 0);
        I = qa3Var;
        qa3 qa3Var2 = new qa3("Max", 1);
        J = qa3Var2;
        K = new qa3[]{qa3Var, qa3Var2};
    }

    public static qa3 valueOf(String str) {
        return (qa3) Enum.valueOf(qa3.class, str);
    }

    public static qa3[] values() {
        return (qa3[]) K.clone();
    }
}
