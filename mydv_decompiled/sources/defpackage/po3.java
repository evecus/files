package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class po3 {
    public static final po3 K;
    public static final /* synthetic */ po3[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final String J;

    static {
        po3 po3Var = new po3("ALWAYS", "始终", "always", 0);
        po3 po3Var2 = new po3("HOURLY", "整点", "hourly", 1);
        po3 po3Var3 = new po3("HOURLY_AND_HALF", "整点+半点", "hourly_and_half", 2);
        po3 po3Var4 = new po3("NEVER", "永不", "never", 3);
        K = po3Var4;
        po3[] po3VarArr = {po3Var, po3Var2, po3Var3, po3Var4};
        L = po3VarArr;
        M = new za1(po3VarArr);
    }

    public po3(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static po3 valueOf(String str) {
        return (po3) Enum.valueOf(po3.class, str);
    }

    public static po3[] values() {
        return (po3[]) L.clone();
    }
}
