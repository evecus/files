package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pz5 {
    public static final pz5 K;
    public static final pz5 L;
    public static final pz5 M;
    public static final pz5 N;
    public static final /* synthetic */ pz5[] O;
    public static final /* synthetic */ za1 P;
    public final char I;
    public final char J;

    static {
        pz5 pz5Var = new pz5("OBJ", 0, '{', '}');
        K = pz5Var;
        pz5 pz5Var2 = new pz5("LIST", 1, '[', ']');
        L = pz5Var2;
        pz5 pz5Var3 = new pz5("MAP", 2, '{', '}');
        M = pz5Var3;
        pz5 pz5Var4 = new pz5("POLY_OBJ", 3, '[', ']');
        N = pz5Var4;
        pz5[] pz5VarArr = {pz5Var, pz5Var2, pz5Var3, pz5Var4};
        O = pz5VarArr;
        P = new za1(pz5VarArr);
    }

    public pz5(String str, int i, char c, char c2) {
        this.I = c;
        this.J = c2;
    }

    public static pz5 valueOf(String str) {
        return (pz5) Enum.valueOf(pz5.class, str);
    }

    public static pz5[] values() {
        return (pz5[]) O.clone();
    }
}
