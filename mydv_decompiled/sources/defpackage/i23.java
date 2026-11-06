package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class i23 {
    public static final i23 I;
    public static final i23 J;
    public static final i23 K;
    public static final /* synthetic */ i23[] L;

    /* JADX INFO: Fake field, exist only in values array */
    i23 EF0;

    static {
        i23 i23Var = new i23("DefaultSpatial", 0);
        i23 i23Var2 = new i23("FastSpatial", 1);
        I = i23Var2;
        i23 i23Var3 = new i23("SlowSpatial", 2);
        i23 i23Var4 = new i23("DefaultEffects", 3);
        i23 i23Var5 = new i23("FastEffects", 4);
        J = i23Var5;
        i23 i23Var6 = new i23("SlowEffects", 5);
        K = i23Var6;
        L = new i23[]{i23Var, i23Var2, i23Var3, i23Var4, i23Var5, i23Var6};
    }

    public static i23 valueOf(String str) {
        return (i23) Enum.valueOf(i23.class, str);
    }

    public static i23[] values() {
        return (i23[]) L.clone();
    }
}
