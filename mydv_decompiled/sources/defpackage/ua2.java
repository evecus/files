package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ua2 {
    public static final ua2 I;
    public static final ua2 J;
    public static final ua2 K;
    public static final /* synthetic */ ua2[] L;

    static {
        ua2 ua2Var = new ua2("InMeasureBlock", 0);
        I = ua2Var;
        ua2 ua2Var2 = new ua2("InLayoutBlock", 1);
        J = ua2Var2;
        ua2 ua2Var3 = new ua2("NotUsed", 2);
        K = ua2Var3;
        L = new ua2[]{ua2Var, ua2Var2, ua2Var3};
    }

    public static ua2 valueOf(String str) {
        return (ua2) Enum.valueOf(ua2.class, str);
    }

    public static ua2[] values() {
        return (ua2[]) L.clone();
    }
}
