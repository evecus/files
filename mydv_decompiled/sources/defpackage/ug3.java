package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ug3 {
    public static final ug3 I;
    public static final ug3 J;
    public static final /* synthetic */ ug3[] K;

    static {
        ug3 ug3Var = new ug3("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        I = ug3Var;
        ug3 ug3Var2 = new ug3("DROP_WORK_REQUEST", 1);
        J = ug3Var2;
        K = new ug3[]{ug3Var, ug3Var2};
    }

    public static ug3 valueOf(String str) {
        return (ug3) Enum.valueOf(ug3.class, str);
    }

    public static ug3[] values() {
        return (ug3[]) K.clone();
    }
}
