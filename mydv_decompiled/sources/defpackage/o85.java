package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o85 {
    public static final o85 I;
    public static final o85 J;
    public static final o85 K;
    public static final o85 L;
    public static final o85 M;
    public static final /* synthetic */ o85[] N;

    static {
        o85 o85Var = new o85("DARKER", 0);
        I = o85Var;
        o85 o85Var2 = new o85("LIGHTER", 1);
        J = o85Var2;
        o85 o85Var3 = new o85("RELATIVE_DARKER", 2);
        K = o85Var3;
        o85 o85Var4 = new o85("RELATIVE_LIGHTER", 3);
        L = o85Var4;
        o85 o85Var5 = new o85("NEARER", 4);
        M = o85Var5;
        N = new o85[]{o85Var, o85Var2, o85Var3, o85Var4, o85Var5, new o85("FARTHER", 5)};
    }

    public static o85 valueOf(String str) {
        return (o85) Enum.valueOf(o85.class, str);
    }

    public static o85[] values() {
        return (o85[]) N.clone();
    }
}
