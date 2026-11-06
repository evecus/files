package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rr0 {
    public static final rr0 L;
    public static final /* synthetic */ rr0[] M;
    public static final /* synthetic */ za1 N;
    public final String I;
    public final byte J;
    public final ab4 K;

    static {
        rr0 rr0Var = new rr0("RECOMMEND", 0, "推荐", 0, ab4.J);
        L = rr0Var;
        rr0[] rr0VarArr = {rr0Var, new rr0("MOBILE_RECOMMEND", 1, "移动推荐", 3, ab4.L), new rr0("FEATURED", 2, "精选", 1, ab4.I), new rr0("FOLLOWING", 3, "直播", 2, ab4.M)};
        M = rr0VarArr;
        N = new za1(rr0VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rr0(String str, int i, String str2, int i2, ab4 ab4Var) {
        this.I = str2;
        this.J = i2;
        this.K = ab4Var;
    }

    public static rr0 valueOf(String str) {
        return (rr0) Enum.valueOf(rr0.class, str);
    }

    public static rr0[] values() {
        return (rr0[]) M.clone();
    }
}
