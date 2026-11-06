package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qn5 {
    public static final qn5 K;
    public static final /* synthetic */ qn5[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final byte J;

    static {
        qn5 qn5Var = new qn5(0, 5, "SECONDS_5", "5秒");
        qn5 qn5Var2 = new qn5(1, 10, "SECONDS_10", "10秒");
        K = qn5Var2;
        qn5[] qn5VarArr = {qn5Var, qn5Var2, new qn5(2, 15, "SECONDS_15", "15秒"), new qn5(3, 30, "SECONDS_30", "30秒"), new qn5(4, 60, "SECONDS_60", "60秒")};
        L = qn5VarArr;
        M = new za1(qn5VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qn5(int i, int i2, String str, String str2) {
        this.I = str2;
        this.J = i2;
    }

    public static qn5 valueOf(String str) {
        return (qn5) Enum.valueOf(qn5.class, str);
    }

    public static qn5[] values() {
        return (qn5[]) L.clone();
    }
}
