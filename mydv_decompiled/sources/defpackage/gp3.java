package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gp3 {
    public static final gp3 I;
    public static final gp3 J;
    public static final /* synthetic */ gp3[] K;

    static {
        gp3 gp3Var = new gp3("BEFORE", 0);
        I = gp3Var;
        gp3 gp3Var2 = new gp3("AFTER", 1);
        J = gp3Var2;
        K = new gp3[]{gp3Var, gp3Var2};
    }

    public static gp3 valueOf(String str) {
        return (gp3) Enum.valueOf(gp3.class, str);
    }

    public static gp3[] values() {
        return (gp3[]) K.clone();
    }
}
