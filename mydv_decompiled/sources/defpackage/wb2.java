package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wb2 extends ap1 {
    public static final int ACTION_PARAMETERS_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int CLASS_NAME_FIELD_NUMBER = 1;
    private static final wb2 DEFAULT_INSTANCE;
    private static volatile mk3 PARSER;
    private int appWidgetId_;
    private String className_ = "";
    private g00 actionParameters_ = g00.J;

    static {
        wb2 wb2Var = new wb2();
        DEFAULT_INSTANCE = wb2Var;
        ap1.j(wb2.class, wb2Var);
    }

    public static wb2 p() {
        return DEFAULT_INSTANCE;
    }

    public static vb2 q() {
        return (vb2) DEFAULT_INSTANCE.b();
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
                return new i04(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"className_", "appWidgetId_", "actionParameters_"});
            case 3:
                return new wb2();
            case 4:
                return new vb2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mk3 mk3Var2 = PARSER;
                if (mk3Var2 != null) {
                    return mk3Var2;
                }
                synchronized (wb2.class) {
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

    public final g00 m() {
        return this.actionParameters_;
    }

    public final int n() {
        return this.appWidgetId_;
    }

    public final String o() {
        return this.className_;
    }

    public final void r(e00 e00Var) {
        this.actionParameters_ = e00Var;
    }

    public final void s(int i) {
        this.appWidgetId_ = i;
    }

    public final void t(String str) {
        this.className_ = str;
    }
}
