package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ow3 {
    public static final nw3 Companion;
    public static final ow3 K;
    public static final ow3 L;
    public static final ow3 M;
    public static final ow3 N;
    public static final ow3 O;
    public static final ow3 P;
    public static final ow3 Q;
    public static final ow3 R;
    public static final /* synthetic */ ow3[] S;
    public static final /* synthetic */ za1 T;
    public final String I;
    public final String J;

    static {
        ow3 ow3Var = new ow3("Works", "作品", "works", 0);
        K = ow3Var;
        ow3 ow3Var2 = new ow3("Favorites", "喜欢", "favorites", 1);
        L = ow3Var2;
        ow3 ow3Var3 = new ow3("Mixes", "合集", "mixes", 2);
        M = ow3Var3;
        ow3 ow3Var4 = new ow3("Collections", "收藏", "collections", 3);
        N = ow3Var4;
        ow3 ow3Var5 = new ow3("WatchLater", "稍后再看", "watch_later", 4);
        O = ow3Var5;
        ow3 ow3Var6 = new ow3("Followers", "粉丝", "followers", 5);
        P = ow3Var6;
        ow3 ow3Var7 = new ow3("Following", "关注", "following", 6);
        Q = ow3Var7;
        ow3 ow3Var8 = new ow3("History", "历史", "history", 7);
        R = ow3Var8;
        ow3[] ow3VarArr = {ow3Var, ow3Var2, ow3Var3, ow3Var4, ow3Var5, ow3Var6, ow3Var7, ow3Var8};
        S = ow3VarArr;
        T = new za1(ow3VarArr);
        Companion = new nw3();
    }

    public ow3(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static ow3 valueOf(String str) {
        return (ow3) Enum.valueOf(ow3.class, str);
    }

    public static ow3[] values() {
        return (ow3[]) S.clone();
    }
}
