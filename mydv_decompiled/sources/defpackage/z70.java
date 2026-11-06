package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class z70 {
    public static final y70 Companion;
    public static final z70 L;
    public static final z70 M;
    public static final /* synthetic */ z70[] N;
    public static final /* synthetic */ za1 O;
    public final String I;
    public final String J;
    public final double K;

    static {
        z70 z70Var = new z70("STANDARD", 0, "标准", "standard", 0.0d);
        L = z70Var;
        z70 z70Var2 = new z70("MEDIUM", 1, "中", "medium", 0.5d);
        M = z70Var2;
        z70[] z70VarArr = {z70Var, z70Var2, new z70("HIGH", 2, "高", "high", 1.0d)};
        N = z70VarArr;
        O = new za1(z70VarArr);
        Companion = new y70();
    }

    public z70(String str, int i, String str2, String str3, double d) {
        this.I = str2;
        this.J = str3;
        this.K = d;
    }

    public static z70 valueOf(String str) {
        return (z70) Enum.valueOf(z70.class, str);
    }

    public static z70[] values() {
        return (z70[]) N.clone();
    }
}
