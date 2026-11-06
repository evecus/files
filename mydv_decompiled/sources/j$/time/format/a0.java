package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class a0 {
    public static final a0 ALWAYS;
    public static final a0 EXCEEDS_PAD;
    public static final a0 NEVER;
    public static final a0 NORMAL;
    public static final a0 NOT_NEGATIVE;
    public static final /* synthetic */ a0[] a;

    static {
        a0 a0Var = new a0("NORMAL", 0);
        NORMAL = a0Var;
        a0 a0Var2 = new a0("ALWAYS", 1);
        ALWAYS = a0Var2;
        a0 a0Var3 = new a0("NEVER", 2);
        NEVER = a0Var3;
        a0 a0Var4 = new a0("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = a0Var4;
        a0 a0Var5 = new a0("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = a0Var5;
        a = new a0[]{a0Var, a0Var2, a0Var3, a0Var4, a0Var5};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) a.clone();
    }
}
