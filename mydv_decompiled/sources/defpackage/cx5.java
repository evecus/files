package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class cx5 {
    public static final yw5 K;
    public static final zw5 L;
    public static final ax5 M;
    public static final /* synthetic */ cx5[] N;
    public final dx5 I;
    public final byte J;

    /* JADX INFO: Fake field, exist only in values array */
    cx5 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    cx5 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    cx5 EF2;

    static {
        cx5 cx5Var = new cx5("DOUBLE", 0, dx5.L, 1);
        cx5 cx5Var2 = new cx5("FLOAT", 1, dx5.K, 5);
        dx5 dx5Var = dx5.J;
        cx5 cx5Var3 = new cx5("INT64", 2, dx5Var, 0);
        cx5 cx5Var4 = new cx5("UINT64", 3, dx5Var, 0);
        dx5 dx5Var2 = dx5.I;
        cx5 cx5Var5 = new cx5("INT32", 4, dx5Var2, 0);
        cx5 cx5Var6 = new cx5("FIXED64", 5, dx5Var, 1);
        cx5 cx5Var7 = new cx5("FIXED32", 6, dx5Var2, 5);
        cx5 cx5Var8 = new cx5("BOOL", 7, dx5.M, 0);
        yw5 yw5Var = new yw5("STRING", 8, dx5.N, 2);
        K = yw5Var;
        dx5 dx5Var3 = dx5.Q;
        zw5 zw5Var = new zw5("GROUP", 9, dx5Var3, 3);
        L = zw5Var;
        ax5 ax5Var = new ax5("MESSAGE", 10, dx5Var3, 2);
        M = ax5Var;
        N = new cx5[]{cx5Var, cx5Var2, cx5Var3, cx5Var4, cx5Var5, cx5Var6, cx5Var7, cx5Var8, yw5Var, zw5Var, ax5Var, new bx5("BYTES", 11, dx5.O, 2), new cx5("UINT32", 12, dx5Var2, 0), new cx5("ENUM", 13, dx5.P, 0), new cx5("SFIXED32", 14, dx5Var2, 5), new cx5("SFIXED64", 15, dx5Var, 1), new cx5("SINT32", 16, dx5Var2, 0), new cx5("SINT64", 17, dx5Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cx5(String str, int i, dx5 dx5Var, int i2) {
        this.I = dx5Var;
        this.J = i2;
    }

    public static cx5 valueOf(String str) {
        return (cx5) Enum.valueOf(cx5.class, str);
    }

    public static cx5[] values() {
        return (cx5[]) N.clone();
    }
}
