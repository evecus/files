package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lb2 {
    public static final lb2 I;
    public static final /* synthetic */ lb2[] J;

    static {
        lb2 lb2Var = new lb2("Horizontal", 0);
        I = lb2Var;
        J = new lb2[]{lb2Var, new lb2("Vertical", 1)};
    }

    public static lb2 valueOf(String str) {
        return (lb2) Enum.valueOf(lb2.class, str);
    }

    public static lb2[] values() {
        return (lb2[]) J.clone();
    }
}
