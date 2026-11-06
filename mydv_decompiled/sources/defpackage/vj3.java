package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vj3 {
    public static final vj3 I;
    public static final vj3 J;
    public static final vj3 K;
    public static final vj3 L;
    public static final vj3 M;
    public static final /* synthetic */ vj3[] N;

    static {
        vj3 vj3Var = new vj3("TonalSpot", 0);
        I = vj3Var;
        vj3 vj3Var2 = new vj3("Neutral", 1);
        vj3 vj3Var3 = new vj3("Vibrant", 2);
        J = vj3Var3;
        vj3 vj3Var4 = new vj3("Expressive", 3);
        K = vj3Var4;
        vj3 vj3Var5 = new vj3("Rainbow", 4);
        vj3 vj3Var6 = new vj3("FruitSalad", 5);
        vj3 vj3Var7 = new vj3("Monochrome", 6);
        vj3 vj3Var8 = new vj3("Fidelity", 7);
        L = vj3Var8;
        vj3 vj3Var9 = new vj3("Content", 8);
        M = vj3Var9;
        N = new vj3[]{vj3Var, vj3Var2, vj3Var3, vj3Var4, vj3Var5, vj3Var6, vj3Var7, vj3Var8, vj3Var9};
    }

    public static vj3 valueOf(String str) {
        return (vj3) Enum.valueOf(vj3.class, str);
    }

    public static vj3[] values() {
        return (vj3[]) N.clone();
    }
}
