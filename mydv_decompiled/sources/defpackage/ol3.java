package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ol3 {
    public static final ol3 I;
    public static final ol3 J;
    public static final ol3 K;
    public static final ol3 L;
    public static final ol3 M;
    public static final ol3 N;
    public static final ol3 O;
    public static final /* synthetic */ ol3[] P;

    static {
        ol3 ol3Var = new ol3("Invalid", 0);
        I = ol3Var;
        ol3 ol3Var2 = new ol3("Cancelled", 1);
        J = ol3Var2;
        ol3 ol3Var3 = new ol3("InitialPending", 2);
        K = ol3Var3;
        ol3 ol3Var4 = new ol3("RecomposePending", 3);
        L = ol3Var4;
        ol3 ol3Var5 = new ol3("Recomposing", 4);
        M = ol3Var5;
        ol3 ol3Var6 = new ol3("ApplyPending", 5);
        N = ol3Var6;
        ol3 ol3Var7 = new ol3("Applied", 6);
        O = ol3Var7;
        P = new ol3[]{ol3Var, ol3Var2, ol3Var3, ol3Var4, ol3Var5, ol3Var6, ol3Var7};
    }

    public static ol3 valueOf(String str) {
        return (ol3) Enum.valueOf(ol3.class, str);
    }

    public static ol3[] values() {
        return (ol3[]) P.clone();
    }
}
