package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'K' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ma4 {
    public static final ma4 K;
    public static final ma4 L;
    public static final ma4 M;
    public static final ma4 N;
    public static final ma4 O;
    public static final ma4 P;
    public static final /* synthetic */ ma4[] Q;
    public final vj3 I;
    public final boolean J;

    static {
        vj3 vj3Var = vj3.L;
        ma4 ma4Var = new ma4("PLAYBACK", 0, vj3Var, true);
        K = ma4Var;
        ma4 ma4Var2 = new ma4("FEATURED", 1, vj3.M, true);
        L = ma4Var2;
        ma4 ma4Var3 = new ma4("LIVE", 2, vj3.J, true);
        M = ma4Var3;
        ma4 ma4Var4 = new ma4("PROFILE", 3, vj3.I, false);
        N = ma4Var4;
        ma4 ma4Var5 = new ma4("MIX", 4, vj3Var, false);
        O = ma4Var5;
        ma4 ma4Var6 = new ma4("BROWSE", 5, vj3.K, false);
        P = ma4Var6;
        Q = new ma4[]{ma4Var, ma4Var2, ma4Var3, ma4Var4, ma4Var5, ma4Var6};
    }

    public ma4(String str, int i, vj3 vj3Var, boolean z) {
        this.I = vj3Var;
        this.J = z;
    }

    public static ma4 valueOf(String str) {
        return (ma4) Enum.valueOf(ma4.class, str);
    }

    public static ma4[] values() {
        return (ma4[]) Q.clone();
    }
}
