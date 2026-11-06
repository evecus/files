package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fh5 {
    public static final fh5 I;
    public static final fh5 J;
    public static final fh5 K;
    public static final fh5 L;
    public static final fh5 M;
    public static final fh5 N;
    public static final fh5 O;
    public static final fh5 P;
    public static final fh5 Q;
    public static final /* synthetic */ fh5[] R;

    static {
        fh5 fh5Var = new fh5("MONOCHROME", 0);
        I = fh5Var;
        fh5 fh5Var2 = new fh5("NEUTRAL", 1);
        J = fh5Var2;
        fh5 fh5Var3 = new fh5("TONAL_SPOT", 2);
        K = fh5Var3;
        fh5 fh5Var4 = new fh5("VIBRANT", 3);
        L = fh5Var4;
        fh5 fh5Var5 = new fh5("EXPRESSIVE", 4);
        M = fh5Var5;
        fh5 fh5Var6 = new fh5("FIDELITY", 5);
        N = fh5Var6;
        fh5 fh5Var7 = new fh5("CONTENT", 6);
        O = fh5Var7;
        fh5 fh5Var8 = new fh5("RAINBOW", 7);
        P = fh5Var8;
        fh5 fh5Var9 = new fh5("FRUIT_SALAD", 8);
        Q = fh5Var9;
        R = new fh5[]{fh5Var, fh5Var2, fh5Var3, fh5Var4, fh5Var5, fh5Var6, fh5Var7, fh5Var8, fh5Var9};
    }

    public static fh5 valueOf(String str) {
        return (fh5) Enum.valueOf(fh5.class, str);
    }

    public static fh5[] values() {
        return (fh5[]) R.clone();
    }
}
