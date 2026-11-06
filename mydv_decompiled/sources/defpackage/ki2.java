package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ki2 {
    public static final ki2 I;
    public static final ki2 J;
    public static final ki2 K;
    public static final ki2 L;
    public static final ki2 M;
    public static final /* synthetic */ ki2[] N;

    static {
        ki2 ki2Var = new ki2("DESTROYED", 0);
        I = ki2Var;
        ki2 ki2Var2 = new ki2("INITIALIZED", 1);
        J = ki2Var2;
        ki2 ki2Var3 = new ki2("CREATED", 2);
        K = ki2Var3;
        ki2 ki2Var4 = new ki2("STARTED", 3);
        L = ki2Var4;
        ki2 ki2Var5 = new ki2("RESUMED", 4);
        M = ki2Var5;
        N = new ki2[]{ki2Var, ki2Var2, ki2Var3, ki2Var4, ki2Var5};
    }

    public static ki2 valueOf(String str) {
        return (ki2) Enum.valueOf(ki2.class, str);
    }

    public static ki2[] values() {
        return (ki2[]) N.clone();
    }
}
