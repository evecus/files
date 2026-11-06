package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sz1 {
    public static final sz1 I;
    public static final sz1 J;
    public static final sz1 K;
    public static final /* synthetic */ sz1[] L;

    static {
        sz1 sz1Var = new sz1("Yes", 0);
        I = sz1Var;
        sz1 sz1Var2 = new sz1("No", 1);
        J = sz1Var2;
        sz1 sz1Var3 = new sz1("NotInitialized", 2);
        K = sz1Var3;
        L = new sz1[]{sz1Var, sz1Var2, sz1Var3};
    }

    public static sz1 valueOf(String str) {
        return (sz1) Enum.valueOf(sz1.class, str);
    }

    public static sz1[] values() {
        return (sz1[]) L.clone();
    }
}
