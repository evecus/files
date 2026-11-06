package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w91 {
    public static final w91 I;
    public static final w91 J;
    public static final w91 K;
    public static final w91 L;
    public static final w91 M;
    public static final w91 N;
    public static final w91 O;
    public static final /* synthetic */ w91[] P;

    static {
        w91 w91Var = new w91("ERROR_CORRECTION", 0);
        I = w91Var;
        w91 w91Var2 = new w91("CHARACTER_SET", 1);
        J = w91Var2;
        w91 w91Var3 = new w91("DATA_MATRIX_SHAPE", 2);
        w91 w91Var4 = new w91("DATA_MATRIX_COMPACT", 3);
        w91 w91Var5 = new w91("MIN_SIZE", 4);
        w91 w91Var6 = new w91("MAX_SIZE", 5);
        w91 w91Var7 = new w91("MARGIN", 6);
        K = w91Var7;
        w91 w91Var8 = new w91("PDF417_COMPACT", 7);
        w91 w91Var9 = new w91("PDF417_COMPACTION", 8);
        w91 w91Var10 = new w91("PDF417_DIMENSIONS", 9);
        w91 w91Var11 = new w91("PDF417_AUTO_ECI", 10);
        w91 w91Var12 = new w91("AZTEC_LAYERS", 11);
        w91 w91Var13 = new w91("QR_VERSION", 12);
        L = w91Var13;
        w91 w91Var14 = new w91("QR_MASK_PATTERN", 13);
        M = w91Var14;
        w91 w91Var15 = new w91("QR_COMPACT", 14);
        N = w91Var15;
        w91 w91Var16 = new w91("GS1_FORMAT", 15);
        O = w91Var16;
        P = new w91[]{w91Var, w91Var2, w91Var3, w91Var4, w91Var5, w91Var6, w91Var7, w91Var8, w91Var9, w91Var10, w91Var11, w91Var12, w91Var13, w91Var14, w91Var15, w91Var16, new w91("FORCE_CODE_SET", 16), new w91("FORCE_C40", 17), new w91("CODE128_COMPACT", 18)};
    }

    public static w91 valueOf(String str) {
        return (w91) Enum.valueOf(w91.class, str);
    }

    public static w91[] values() {
        return (w91[]) P.clone();
    }
}
