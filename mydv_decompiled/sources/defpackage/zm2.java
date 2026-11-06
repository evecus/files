package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zm2 {
    public static final zm2 K;
    public static final /* synthetic */ zm2[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final float J;

    static {
        zm2 zm2Var = new zm2("SLOW", 0, "慢", 0.5f);
        zm2 zm2Var2 = new zm2("NORMAL", 1, "中", 1.0f);
        K = zm2Var2;
        zm2[] zm2VarArr = {zm2Var, zm2Var2, new zm2("FAST", 2, "快", 1.5f), new zm2("VERY_FAST", 3, "极快", 2.0f)};
        L = zm2VarArr;
        M = new za1(zm2VarArr);
    }

    public zm2(String str, int i, String str2, float f) {
        this.I = str2;
        this.J = f;
    }

    public static zm2 valueOf(String str) {
        return (zm2) Enum.valueOf(zm2.class, str);
    }

    public static zm2[] values() {
        return (zm2[]) L.clone();
    }
}
