package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ki5 {
    public static final ki5 I;
    public static final ki5 J;
    public static final /* synthetic */ ki5[] K;

    static {
        ki5 ki5Var = new ki5("Lsq2", 0);
        I = ki5Var;
        ki5 ki5Var2 = new ki5("Impulse", 1);
        J = ki5Var2;
        K = new ki5[]{ki5Var, ki5Var2};
    }

    public static ki5 valueOf(String str) {
        return (ki5) Enum.valueOf(ki5.class, str);
    }

    public static ki5[] values() {
        return (ki5[]) K.clone();
    }
}
