package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s14 {
    public static final s14 I;
    public static final /* synthetic */ s14[] J;

    static {
        s14 s14Var = new s14("ALLOW", 0);
        I = s14Var;
        J = new s14[]{s14Var, new s14("PREVENT_WHEN_EMPTY", 1), new s14("PREVENT", 2)};
    }

    public static s14 valueOf(String str) {
        return (s14) Enum.valueOf(s14.class, str);
    }

    public static s14[] values() {
        return (s14[]) J.clone();
    }
}
