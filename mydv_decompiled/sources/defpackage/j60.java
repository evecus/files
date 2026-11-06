package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class j60 {
    public static final j60 I;
    public static final j60 J;
    public static final j60 K;
    public static final /* synthetic */ j60[] L;

    static {
        j60 j60Var = new j60("NONE", 0);
        I = j60Var;
        j60 j60Var2 = new j60("ALL_JSON_OBJECTS", 1);
        J = j60Var2;
        j60 j60Var3 = new j60("POLYMORPHIC", 2);
        K = j60Var3;
        L = new j60[]{j60Var, j60Var2, j60Var3};
    }

    public static j60 valueOf(String str) {
        return (j60) Enum.valueOf(j60.class, str);
    }

    public static j60[] values() {
        return (j60[]) L.clone();
    }
}
