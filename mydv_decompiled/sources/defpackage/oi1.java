package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class oi1 {
    public static final oi1 I;
    public static final oi1 J;
    public static final oi1 K;
    public static final /* synthetic */ oi1[] L;

    static {
        oi1 oi1Var = new oi1("Active", 0);
        I = oi1Var;
        oi1 oi1Var2 = new oi1("ActiveParent", 1);
        J = oi1Var2;
        oi1 oi1Var3 = new oi1("Captured", 2);
        oi1 oi1Var4 = new oi1("Inactive", 3);
        K = oi1Var4;
        L = new oi1[]{oi1Var, oi1Var2, oi1Var3, oi1Var4};
    }

    public static oi1 valueOf(String str) {
        return (oi1) Enum.valueOf(oi1.class, str);
    }

    public static oi1[] values() {
        return (oi1[]) L.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        s83.v();
        return false;
    }

    public final boolean b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                s83.v();
                return false;
            }
        }
        return true;
    }
}
