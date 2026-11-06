package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class t80 {
    public static final s80 Companion;
    public static final t80 K;
    public static final t80 L;
    public static final t80 M;
    public static final /* synthetic */ t80[] N;
    public static final /* synthetic */ za1 O;
    public final String I;
    public final String J;

    static {
        t80 t80Var = new t80("CONTENT", "画面取色", "content", 0);
        K = t80Var;
        t80 t80Var2 = new t80("DEVICE", "设备主题色", "device", 1);
        L = t80Var2;
        t80 t80Var3 = new t80("BRAND", "品牌红", "brand", 2);
        M = t80Var3;
        t80[] t80VarArr = {t80Var, t80Var2, t80Var3};
        N = t80VarArr;
        O = new za1(t80VarArr);
        Companion = new s80();
    }

    public t80(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static t80 valueOf(String str) {
        return (t80) Enum.valueOf(t80.class, str);
    }

    public static t80[] values() {
        return (t80[]) N.clone();
    }
}
