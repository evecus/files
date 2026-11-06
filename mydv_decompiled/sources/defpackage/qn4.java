package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qn4 {
    public static final qn4 I;
    public static final qn4 J;
    public static final qn4 K;
    public static final /* synthetic */ qn4[] L;

    static {
        qn4 qn4Var = new qn4("START", 0);
        I = qn4Var;
        qn4 qn4Var2 = new qn4("STOP", 1);
        J = qn4Var2;
        qn4 qn4Var3 = new qn4("STOP_AND_RESET_REPLAY_CACHE", 2);
        K = qn4Var3;
        L = new qn4[]{qn4Var, qn4Var2, qn4Var3};
    }

    public static qn4 valueOf(String str) {
        return (qn4) Enum.valueOf(qn4.class, str);
    }

    public static qn4[] values() {
        return (qn4[]) L.clone();
    }
}
