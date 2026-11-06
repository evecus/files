package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z64 {
    public static final z64 I;
    public static final z64 J;
    public static final /* synthetic */ z64[] K;

    /* JADX INFO: Fake field, exist only in values array */
    z64 EF0;

    static {
        z64 z64Var = new z64("AUTOMATIC", 0);
        z64 z64Var2 = new z64("TRUNCATE", 1);
        I = z64Var2;
        z64 z64Var3 = new z64("WRITE_AHEAD_LOGGING", 2);
        J = z64Var3;
        K = new z64[]{z64Var, z64Var2, z64Var3};
    }

    public static z64 valueOf(String str) {
        return (z64) Enum.valueOf(z64.class, str);
    }

    public static z64[] values() {
        return (z64[]) K.clone();
    }
}
