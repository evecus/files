package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y03 {
    public static final y03 K;
    public static final /* synthetic */ y03[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final String J;

    static {
        y03 y03Var = new y03("NEWEST", "最新在前", "最新", 0);
        K = y03Var;
        y03[] y03VarArr = {y03Var, new y03("OLDEST", "第 1 集在前", "第 1 集", 1)};
        L = y03VarArr;
        M = new za1(y03VarArr);
    }

    public y03(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static y03 valueOf(String str) {
        return (y03) Enum.valueOf(y03.class, str);
    }

    public static y03[] values() {
        return (y03[]) L.clone();
    }
}
