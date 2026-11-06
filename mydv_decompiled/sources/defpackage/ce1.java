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
public final class ce1 {
    public static final ce1 J;
    public static final ce1 K;
    public static final ce1[] L;
    public static final /* synthetic */ ce1[] M;
    public final byte I;

    /* JADX INFO: Fake field, exist only in values array */
    ce1 EF0;

    static {
        t52 t52Var = t52.DOUBLE;
        ce1 ce1Var = new ce1("DOUBLE", 0, 0, 1, t52Var);
        t52 t52Var2 = t52.FLOAT;
        ce1 ce1Var2 = new ce1("FLOAT", 1, 1, 1, t52Var2);
        t52 t52Var3 = t52.LONG;
        ce1 ce1Var3 = new ce1("INT64", 2, 2, 1, t52Var3);
        ce1 ce1Var4 = new ce1("UINT64", 3, 3, 1, t52Var3);
        t52 t52Var4 = t52.INT;
        ce1 ce1Var5 = new ce1("INT32", 4, 4, 1, t52Var4);
        ce1 ce1Var6 = new ce1("FIXED64", 5, 5, 1, t52Var3);
        ce1 ce1Var7 = new ce1("FIXED32", 6, 6, 1, t52Var4);
        t52 t52Var5 = t52.BOOLEAN;
        ce1 ce1Var8 = new ce1("BOOL", 7, 7, 1, t52Var5);
        t52 t52Var6 = t52.STRING;
        ce1 ce1Var9 = new ce1("STRING", 8, 8, 1, t52Var6);
        t52 t52Var7 = t52.MESSAGE;
        ce1 ce1Var10 = new ce1("MESSAGE", 9, 9, 1, t52Var7);
        t52 t52Var8 = t52.BYTE_STRING;
        ce1 ce1Var11 = new ce1("BYTES", 10, 10, 1, t52Var8);
        ce1 ce1Var12 = new ce1("UINT32", 11, 11, 1, t52Var4);
        t52 t52Var9 = t52.ENUM;
        ce1 ce1Var13 = new ce1("ENUM", 12, 12, 1, t52Var9);
        ce1 ce1Var14 = new ce1("SFIXED32", 13, 13, 1, t52Var4);
        ce1 ce1Var15 = new ce1("SFIXED64", 14, 14, 1, t52Var3);
        ce1 ce1Var16 = new ce1("SINT32", 15, 15, 1, t52Var4);
        ce1 ce1Var17 = new ce1("SINT64", 16, 16, 1, t52Var3);
        ce1 ce1Var18 = new ce1("GROUP", 17, 17, 1, t52Var7);
        ce1 ce1Var19 = new ce1("DOUBLE_LIST", 18, 18, 2, t52Var);
        ce1 ce1Var20 = new ce1("FLOAT_LIST", 19, 19, 2, t52Var2);
        ce1 ce1Var21 = new ce1("INT64_LIST", 20, 20, 2, t52Var3);
        ce1 ce1Var22 = new ce1("UINT64_LIST", 21, 21, 2, t52Var3);
        ce1 ce1Var23 = new ce1("INT32_LIST", 22, 22, 2, t52Var4);
        ce1 ce1Var24 = new ce1("FIXED64_LIST", 23, 23, 2, t52Var3);
        ce1 ce1Var25 = new ce1("FIXED32_LIST", 24, 24, 2, t52Var4);
        ce1 ce1Var26 = new ce1("BOOL_LIST", 25, 25, 2, t52Var5);
        ce1 ce1Var27 = new ce1("STRING_LIST", 26, 26, 2, t52Var6);
        ce1 ce1Var28 = new ce1("MESSAGE_LIST", 27, 27, 2, t52Var7);
        ce1 ce1Var29 = new ce1("BYTES_LIST", 28, 28, 2, t52Var8);
        ce1 ce1Var30 = new ce1("UINT32_LIST", 29, 29, 2, t52Var4);
        ce1 ce1Var31 = new ce1("ENUM_LIST", 30, 30, 2, t52Var9);
        ce1 ce1Var32 = new ce1("SFIXED32_LIST", 31, 31, 2, t52Var4);
        ce1 ce1Var33 = new ce1("SFIXED64_LIST", 32, 32, 2, t52Var3);
        ce1 ce1Var34 = new ce1("SINT32_LIST", 33, 33, 2, t52Var4);
        ce1 ce1Var35 = new ce1("SINT64_LIST", 34, 34, 2, t52Var3);
        ce1 ce1Var36 = new ce1("DOUBLE_LIST_PACKED", 35, 35, 3, t52Var);
        J = ce1Var36;
        ce1 ce1Var37 = new ce1("FLOAT_LIST_PACKED", 36, 36, 3, t52Var2);
        ce1 ce1Var38 = new ce1("INT64_LIST_PACKED", 37, 37, 3, t52Var3);
        ce1 ce1Var39 = new ce1("UINT64_LIST_PACKED", 38, 38, 3, t52Var3);
        ce1 ce1Var40 = new ce1("INT32_LIST_PACKED", 39, 39, 3, t52Var4);
        ce1 ce1Var41 = new ce1("FIXED64_LIST_PACKED", 40, 40, 3, t52Var3);
        ce1 ce1Var42 = new ce1("FIXED32_LIST_PACKED", 41, 41, 3, t52Var4);
        ce1 ce1Var43 = new ce1("BOOL_LIST_PACKED", 42, 42, 3, t52Var5);
        ce1 ce1Var44 = new ce1("UINT32_LIST_PACKED", 43, 43, 3, t52Var4);
        ce1 ce1Var45 = new ce1("ENUM_LIST_PACKED", 44, 44, 3, t52Var9);
        ce1 ce1Var46 = new ce1("SFIXED32_LIST_PACKED", 45, 45, 3, t52Var4);
        ce1 ce1Var47 = new ce1("SFIXED64_LIST_PACKED", 46, 46, 3, t52Var3);
        ce1 ce1Var48 = new ce1("SINT32_LIST_PACKED", 47, 47, 3, t52Var4);
        ce1 ce1Var49 = new ce1("SINT64_LIST_PACKED", 48, 48, 3, t52Var3);
        K = ce1Var49;
        M = new ce1[]{ce1Var, ce1Var2, ce1Var3, ce1Var4, ce1Var5, ce1Var6, ce1Var7, ce1Var8, ce1Var9, ce1Var10, ce1Var11, ce1Var12, ce1Var13, ce1Var14, ce1Var15, ce1Var16, ce1Var17, ce1Var18, ce1Var19, ce1Var20, ce1Var21, ce1Var22, ce1Var23, ce1Var24, ce1Var25, ce1Var26, ce1Var27, ce1Var28, ce1Var29, ce1Var30, ce1Var31, ce1Var32, ce1Var33, ce1Var34, ce1Var35, ce1Var36, ce1Var37, ce1Var38, ce1Var39, ce1Var40, ce1Var41, ce1Var42, ce1Var43, ce1Var44, ce1Var45, ce1Var46, ce1Var47, ce1Var48, ce1Var49, new ce1("GROUP_LIST", 49, 49, 2, t52Var7), new ce1("MAP", 50, 50, 4, t52.VOID)};
        ce1[] values = values();
        L = new ce1[values.length];
        for (ce1 ce1Var50 : values) {
            L[ce1Var50.I] = ce1Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ce1(String str, int i, int i2, int i3, t52 t52Var) {
        this.I = i2;
        int F = pt1.F(i3);
        if (F == 1) {
            Class cls = t52Var.I;
        } else if (F == 3) {
            Class cls2 = t52Var.I;
        }
        if (i3 == 1) {
            t52Var.ordinal();
        }
    }

    public static ce1 valueOf(String str) {
        return (ce1) Enum.valueOf(ce1.class, str);
    }

    public static ce1[] values() {
        return (ce1[]) M.clone();
    }
}
