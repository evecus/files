package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m85 {
    public static final m85 I;
    public static final m85 J;
    public static final /* synthetic */ m85[] K;

    static {
        m85 m85Var = new m85("EXACT", 0);
        I = m85Var;
        m85 m85Var2 = new m85("NEARER", 1);
        m85 m85Var3 = new m85("FARTHER", 2);
        J = m85Var3;
        K = new m85[]{m85Var, m85Var2, m85Var3};
    }

    public static m85 valueOf(String str) {
        return (m85) Enum.valueOf(m85.class, str);
    }

    public static m85[] values() {
        return (m85[]) K.clone();
    }
}
