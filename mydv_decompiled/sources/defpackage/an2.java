package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class an2 {
    public static final an2 K;
    public static final an2 L;
    public static final /* synthetic */ an2[] M;
    public static final /* synthetic */ za1 N;
    public final String I;
    public final String J;

    static {
        an2 an2Var = new an2("SCROLL", "滚动", "scroll", 0);
        K = an2Var;
        an2 an2Var2 = new an2("LIST", "列表", "list", 1);
        L = an2Var2;
        an2[] an2VarArr = {an2Var, an2Var2};
        M = an2VarArr;
        N = new za1(an2VarArr);
    }

    public an2(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static an2 valueOf(String str) {
        return (an2) Enum.valueOf(an2.class, str);
    }

    public static an2[] values() {
        return (an2[]) M.clone();
    }
}
