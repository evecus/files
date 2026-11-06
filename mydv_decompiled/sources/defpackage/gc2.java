package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gc2 extends ap1 {
    private static final gc2 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile mk3 PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private ic2 layout_;

    static {
        gc2 gc2Var = new gc2();
        DEFAULT_INSTANCE = gc2Var;
        ap1.j(gc2.class, gc2Var);
    }

    public static fc2 o() {
        return (fc2) DEFAULT_INSTANCE.b();
    }

    @Override // defpackage.ap1
    public final Object c(int i) {
        mk3 mk3Var;
        switch (pt1.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new i04(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new gc2();
            case 4:
                return new fc2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mk3 mk3Var2 = PARSER;
                if (mk3Var2 != null) {
                    return mk3Var2;
                }
                synchronized (gc2.class) {
                    try {
                        mk3Var = PARSER;
                        if (mk3Var == null) {
                            mk3Var = new yo1();
                            PARSER = mk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return mk3Var;
            default:
                e1.a();
                return null;
        }
    }

    public final ic2 m() {
        ic2 ic2Var = this.layout_;
        return ic2Var == null ? ic2.n() : ic2Var;
    }

    public final int n() {
        return this.layoutIndex_;
    }

    public final void p(ic2 ic2Var) {
        ic2Var.getClass();
        this.layout_ = ic2Var;
        this.bitField0_ |= 1;
    }

    public final void q(int i) {
        this.layoutIndex_ = i;
    }
}
