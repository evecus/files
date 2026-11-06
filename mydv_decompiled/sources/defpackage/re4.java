package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class re4 {
    public static final re4 J;
    public static final re4 K;
    public static final re4 L;
    public static final /* synthetic */ re4[] M;
    public static final /* synthetic */ za1 N;
    public final String I;

    static {
        re4 re4Var = new re4("VIDEO", 0, "视频");
        J = re4Var;
        re4 re4Var2 = new re4("USER", 1, "用户");
        K = re4Var2;
        re4 re4Var3 = new re4("LIVE", 2, "直播");
        L = re4Var3;
        re4[] re4VarArr = {re4Var, re4Var2, re4Var3};
        M = re4VarArr;
        N = new za1(re4VarArr);
    }

    public re4(String str, int i, String str2) {
        this.I = str2;
    }

    public static re4 valueOf(String str) {
        return (re4) Enum.valueOf(re4.class, str);
    }

    public static re4[] values() {
        return (re4[]) M.clone();
    }
}
