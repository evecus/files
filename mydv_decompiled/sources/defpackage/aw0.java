package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class aw0 {
    public static final aw0 I;
    public static final aw0 J;
    public static final /* synthetic */ aw0[] K;

    static {
        aw0 aw0Var = new aw0("Dpad", 0);
        I = aw0Var;
        aw0 aw0Var2 = new aw0("Touch", 1);
        J = aw0Var2;
        K = new aw0[]{aw0Var, aw0Var2};
    }

    public static aw0 valueOf(String str) {
        return (aw0) Enum.valueOf(aw0.class, str);
    }

    public static aw0[] values() {
        return (aw0[]) K.clone();
    }
}
