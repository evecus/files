package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ub2 extends ap1 {
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int BUNDLE_FIELD_NUMBER = 3;
    private static final ub2 DEFAULT_INSTANCE;
    private static volatile mk3 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetId_;
    private String receiver_ = "";
    private g00 bundle_ = g00.J;

    static {
        ub2 ub2Var = new ub2();
        DEFAULT_INSTANCE = ub2Var;
        ap1.j(ub2.class, ub2Var);
    }

    public static ub2 o() {
        return DEFAULT_INSTANCE;
    }

    public static tb2 q() {
        return (tb2) DEFAULT_INSTANCE.b();
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
                return new i04(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"receiver_", "appWidgetId_", "bundle_"});
            case 3:
                return new ub2();
            case 4:
                return new tb2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mk3 mk3Var2 = PARSER;
                if (mk3Var2 != null) {
                    return mk3Var2;
                }
                synchronized (ub2.class) {
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

    public final int m() {
        return this.appWidgetId_;
    }

    public final g00 n() {
        return this.bundle_;
    }

    public final String p() {
        return this.receiver_;
    }

    public final void r(int i) {
        this.appWidgetId_ = i;
    }

    public final void s(e00 e00Var) {
        this.bundle_ = e00Var;
    }

    public final void t(String str) {
        str.getClass();
        this.receiver_ = str;
    }
}
