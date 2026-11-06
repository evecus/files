package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fr {
    public static final er Companion;
    public static final fr K;
    public static final /* synthetic */ fr[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final String J;

    static {
        fr frVar = new fr("OFF", "关闭", "off", 0);
        K = frVar;
        fr[] frVarArr = {frVar, new fr("LOW", "低", "low", 1), new fr("MEDIUM", "中", "medium", 2), new fr("HIGH", "高", "high", 3)};
        L = frVarArr;
        M = new za1(frVarArr);
        Companion = new er();
    }

    public fr(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static fr valueOf(String str) {
        return (fr) Enum.valueOf(fr.class, str);
    }

    public static fr[] values() {
        return (fr[]) L.clone();
    }
}
