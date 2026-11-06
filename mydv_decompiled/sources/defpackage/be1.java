package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class be1 {
    public static final be1 J;
    public static final be1 K;
    public static final be1[] L;
    public static final /* synthetic */ be1[] M;
    public final byte I;

    /* JADX INFO: Fake field, exist only in values array */
    be1 EF0;

    static {
        s52 s52Var = s52.DOUBLE;
        be1 be1Var = new be1("DOUBLE", 0, 0, 1, s52Var);
        s52 s52Var2 = s52.FLOAT;
        be1 be1Var2 = new be1("FLOAT", 1, 1, 1, s52Var2);
        s52 s52Var3 = s52.LONG;
        be1 be1Var3 = new be1("INT64", 2, 2, 1, s52Var3);
        be1 be1Var4 = new be1("UINT64", 3, 3, 1, s52Var3);
        s52 s52Var4 = s52.INT;
        be1 be1Var5 = new be1("INT32", 4, 4, 1, s52Var4);
        be1 be1Var6 = new be1("FIXED64", 5, 5, 1, s52Var3);
        be1 be1Var7 = new be1("FIXED32", 6, 6, 1, s52Var4);
        s52 s52Var5 = s52.BOOLEAN;
        be1 be1Var8 = new be1("BOOL", 7, 7, 1, s52Var5);
        s52 s52Var6 = s52.STRING;
        be1 be1Var9 = new be1("STRING", 8, 8, 1, s52Var6);
        s52 s52Var7 = s52.MESSAGE;
        be1 be1Var10 = new be1("MESSAGE", 9, 9, 1, s52Var7);
        s52 s52Var8 = s52.BYTE_STRING;
        be1 be1Var11 = new be1("BYTES", 10, 10, 1, s52Var8);
        be1 be1Var12 = new be1("UINT32", 11, 11, 1, s52Var4);
        s52 s52Var9 = s52.ENUM;
        be1 be1Var13 = new be1("ENUM", 12, 12, 1, s52Var9);
        be1 be1Var14 = new be1("SFIXED32", 13, 13, 1, s52Var4);
        be1 be1Var15 = new be1("SFIXED64", 14, 14, 1, s52Var3);
        be1 be1Var16 = new be1("SINT32", 15, 15, 1, s52Var4);
        be1 be1Var17 = new be1("SINT64", 16, 16, 1, s52Var3);
        be1 be1Var18 = new be1("GROUP", 17, 17, 1, s52Var7);
        be1 be1Var19 = new be1("DOUBLE_LIST", 18, 18, 2, s52Var);
        be1 be1Var20 = new be1("FLOAT_LIST", 19, 19, 2, s52Var2);
        be1 be1Var21 = new be1("INT64_LIST", 20, 20, 2, s52Var3);
        be1 be1Var22 = new be1("UINT64_LIST", 21, 21, 2, s52Var3);
        be1 be1Var23 = new be1("INT32_LIST", 22, 22, 2, s52Var4);
        be1 be1Var24 = new be1("FIXED64_LIST", 23, 23, 2, s52Var3);
        be1 be1Var25 = new be1("FIXED32_LIST", 24, 24, 2, s52Var4);
        be1 be1Var26 = new be1("BOOL_LIST", 25, 25, 2, s52Var5);
        be1 be1Var27 = new be1("STRING_LIST", 26, 26, 2, s52Var6);
        be1 be1Var28 = new be1("MESSAGE_LIST", 27, 27, 2, s52Var7);
        be1 be1Var29 = new be1("BYTES_LIST", 28, 28, 2, s52Var8);
        be1 be1Var30 = new be1("UINT32_LIST", 29, 29, 2, s52Var4);
        be1 be1Var31 = new be1("ENUM_LIST", 30, 30, 2, s52Var9);
        be1 be1Var32 = new be1("SFIXED32_LIST", 31, 31, 2, s52Var4);
        be1 be1Var33 = new be1("SFIXED64_LIST", 32, 32, 2, s52Var3);
        be1 be1Var34 = new be1("SINT32_LIST", 33, 33, 2, s52Var4);
        be1 be1Var35 = new be1("SINT64_LIST", 34, 34, 2, s52Var3);
        be1 be1Var36 = new be1("DOUBLE_LIST_PACKED", 35, 35, 3, s52Var);
        J = be1Var36;
        be1 be1Var37 = new be1("FLOAT_LIST_PACKED", 36, 36, 3, s52Var2);
        be1 be1Var38 = new be1("INT64_LIST_PACKED", 37, 37, 3, s52Var3);
        be1 be1Var39 = new be1("UINT64_LIST_PACKED", 38, 38, 3, s52Var3);
        be1 be1Var40 = new be1("INT32_LIST_PACKED", 39, 39, 3, s52Var4);
        be1 be1Var41 = new be1("FIXED64_LIST_PACKED", 40, 40, 3, s52Var3);
        be1 be1Var42 = new be1("FIXED32_LIST_PACKED", 41, 41, 3, s52Var4);
        be1 be1Var43 = new be1("BOOL_LIST_PACKED", 42, 42, 3, s52Var5);
        be1 be1Var44 = new be1("UINT32_LIST_PACKED", 43, 43, 3, s52Var4);
        be1 be1Var45 = new be1("ENUM_LIST_PACKED", 44, 44, 3, s52Var9);
        be1 be1Var46 = new be1("SFIXED32_LIST_PACKED", 45, 45, 3, s52Var4);
        be1 be1Var47 = new be1("SFIXED64_LIST_PACKED", 46, 46, 3, s52Var3);
        be1 be1Var48 = new be1("SINT32_LIST_PACKED", 47, 47, 3, s52Var4);
        be1 be1Var49 = new be1("SINT64_LIST_PACKED", 48, 48, 3, s52Var3);
        K = be1Var49;
        M = new be1[]{be1Var, be1Var2, be1Var3, be1Var4, be1Var5, be1Var6, be1Var7, be1Var8, be1Var9, be1Var10, be1Var11, be1Var12, be1Var13, be1Var14, be1Var15, be1Var16, be1Var17, be1Var18, be1Var19, be1Var20, be1Var21, be1Var22, be1Var23, be1Var24, be1Var25, be1Var26, be1Var27, be1Var28, be1Var29, be1Var30, be1Var31, be1Var32, be1Var33, be1Var34, be1Var35, be1Var36, be1Var37, be1Var38, be1Var39, be1Var40, be1Var41, be1Var42, be1Var43, be1Var44, be1Var45, be1Var46, be1Var47, be1Var48, be1Var49, new be1("GROUP_LIST", 49, 49, 2, s52Var7), new be1("MAP", 50, 50, 4, s52.VOID)};
        be1[] values = values();
        L = new be1[values.length];
        for (be1 be1Var50 : values) {
            L[be1Var50.I] = be1Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public be1(String str, int i, int i2, int i3, s52 s52Var) {
        this.I = i2;
        int F = pt1.F(i3);
        if (F == 1) {
            Class cls = s52Var.I;
        } else if (F == 3) {
            Class cls2 = s52Var.I;
        }
        if (i3 == 1) {
            s52Var.ordinal();
        }
    }

    public static be1 valueOf(String str) {
        return (be1) Enum.valueOf(be1.class, str);
    }

    public static be1[] values() {
        return (be1[]) M.clone();
    }
}
