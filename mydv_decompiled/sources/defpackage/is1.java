package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class is1 {
    public static final is1 I;
    public static final is1 J;
    public static final is1 K;
    public static final /* synthetic */ is1[] L;

    static {
        is1 is1Var = new is1("Cursor", 0);
        I = is1Var;
        is1 is1Var2 = new is1("SelectionStart", 1);
        J = is1Var2;
        is1 is1Var3 = new is1("SelectionEnd", 2);
        K = is1Var3;
        L = new is1[]{is1Var, is1Var2, is1Var3};
    }

    public static is1 valueOf(String str) {
        return (is1) Enum.valueOf(is1.class, str);
    }

    public static is1[] values() {
        return (is1[]) L.clone();
    }
}
