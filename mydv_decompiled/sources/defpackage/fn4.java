package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fn4 {
    public static final fn4 I;
    public static final fn4 J;
    public static final fn4 K;
    public static final /* synthetic */ fn4[] L;

    /* JADX INFO: Fake field, exist only in values array */
    fn4 EF0;

    static {
        fn4 fn4Var = new fn4("CornerExtraExtraLarge", 0);
        fn4 fn4Var2 = new fn4("CornerExtraLarge", 1);
        fn4 fn4Var3 = new fn4("CornerExtraLargeIncreased", 2);
        fn4 fn4Var4 = new fn4("CornerExtraLargeTop", 3);
        fn4 fn4Var5 = new fn4("CornerExtraSmall", 4);
        I = fn4Var5;
        fn4 fn4Var6 = new fn4("CornerExtraSmallTop", 5);
        fn4 fn4Var7 = new fn4("CornerFull", 6);
        J = fn4Var7;
        fn4 fn4Var8 = new fn4("CornerLarge", 7);
        fn4 fn4Var9 = new fn4("CornerLargeEnd", 8);
        fn4 fn4Var10 = new fn4("CornerLargeIncreased", 9);
        fn4 fn4Var11 = new fn4("CornerLargeStart", 10);
        fn4 fn4Var12 = new fn4("CornerLargeTop", 11);
        fn4 fn4Var13 = new fn4("CornerMedium", 12);
        K = fn4Var13;
        L = new fn4[]{fn4Var, fn4Var2, fn4Var3, fn4Var4, fn4Var5, fn4Var6, fn4Var7, fn4Var8, fn4Var9, fn4Var10, fn4Var11, fn4Var12, fn4Var13, new fn4("CornerNone", 13), new fn4("CornerSmall", 14)};
    }

    public static fn4 valueOf(String str) {
        return (fn4) Enum.valueOf(fn4.class, str);
    }

    public static fn4[] values() {
        return (fn4[]) L.clone();
    }
}
