package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sd1 {
    public static final sd1 K;
    public static final /* synthetic */ sd1[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final short J;

    static {
        sd1 sd1Var = new sd1(0, 50, "CAPACITY_50", "50");
        sd1 sd1Var2 = new sd1(1, 100, "CAPACITY_100", "100");
        K = sd1Var2;
        sd1[] sd1VarArr = {sd1Var, sd1Var2, new sd1(2, 200, "CAPACITY_200", "200"), new sd1(3, 500, "CAPACITY_500", "500"), new sd1(4, 1000, "CAPACITY_1000", "1000")};
        L = sd1VarArr;
        M = new za1(sd1VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sd1(int i, int i2, String str, String str2) {
        this.I = str2;
        this.J = i2;
    }

    public static sd1 valueOf(String str) {
        return (sd1) Enum.valueOf(sd1.class, str);
    }

    public static sd1[] values() {
        return (sd1[]) L.clone();
    }
}
