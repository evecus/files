package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wx4 {
    public static final wx4 I;
    public static final wx4 J;
    public static final wx4 K;
    public static final wx4 L;
    public static final wx4 M;
    public static final wx4 N;
    public static final /* synthetic */ wx4[] O;

    static {
        wx4 wx4Var = new wx4("Untouched", 0);
        I = wx4Var;
        wx4 wx4Var2 = new wx4("Unchanged", 1);
        J = wx4Var2;
        wx4 wx4Var3 = new wx4("Changed", 2);
        K = wx4Var3;
        wx4 wx4Var4 = new wx4("Inserted", 3);
        L = wx4Var4;
        wx4 wx4Var5 = new wx4("Interrupted", 4);
        M = wx4Var5;
        wx4 wx4Var6 = new wx4("Removing", 5);
        N = wx4Var6;
        O = new wx4[]{wx4Var, wx4Var2, wx4Var3, wx4Var4, wx4Var5, wx4Var6};
    }

    public static wx4 valueOf(String str) {
        return (wx4) Enum.valueOf(wx4.class, str);
    }

    public static wx4[] values() {
        return (wx4[]) O.clone();
    }
}
