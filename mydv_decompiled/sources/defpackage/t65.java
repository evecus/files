package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class t65 {
    public static final t65 K;
    public static final /* synthetic */ t65[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final byte J;

    static {
        t65 t65Var = new t65(0, 0, "AUTO", "自动");
        K = t65Var;
        t65[] t65VarArr = {t65Var, new t65(1, 1, "LIGHT", "浅色"), new t65(2, 2, "DARK", "暗色")};
        L = t65VarArr;
        M = new za1(t65VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t65(int i, int i2, String str, String str2) {
        this.I = str2;
        this.J = i2;
    }

    public static t65 valueOf(String str) {
        return (t65) Enum.valueOf(t65.class, str);
    }

    public static t65[] values() {
        return (t65[]) L.clone();
    }
}
