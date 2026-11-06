package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o95 {
    public static final o95 I;
    public static final o95 J;
    public static final /* synthetic */ o95[] K;

    static {
        o95 o95Var = new o95("DEFERRED", 0);
        I = o95Var;
        o95 o95Var2 = new o95("IMMEDIATE", 1);
        J = o95Var2;
        K = new o95[]{o95Var, o95Var2, new o95("EXCLUSIVE", 2)};
    }

    public static o95 valueOf(String str) {
        return (o95) Enum.valueOf(o95.class, str);
    }

    public static o95[] values() {
        return (o95[]) K.clone();
    }
}
